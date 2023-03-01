package controllers

import models.{GoogleTokenInfo, User}

import javax.inject._
import play.api.mvc._
import play.api.libs.ws.WSClient
import utils.JsonExtension.JsonOps

import scala.concurrent.ExecutionContext.Implicits.global

@Singleton
class HomeController @Inject() (
    val controllerComponents: ControllerComponents,
    ws: WSClient
) extends BaseController {

  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
  def userSignIn(authToken: String) = Action.async { implicit request =>
    val result = ws
      .url(s"https://oauth2.googleapis.com/tokeninfo?id_token=$authToken")
      .get()
    result.map { result =>
      result.body.fromJson[GoogleTokenInfo] match {
        case Some(value) =>
          Ok(
            views.html.index(
              Some(User(value.sub, value.email, value.name, value.picture))
            )
          )
        case None => Ok(views.html.index())
      }
    }
  }
}
