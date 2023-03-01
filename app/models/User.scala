package models

import play.api.libs.json.{Json, OFormat}

case class User(
    userID: String,
    email: String,
    userName: String,
    profilePictureLink: String
)
object User {

  implicit val userFormat: OFormat[User] = Json.format[User]
}
