package models

import play.api.libs.json.{Json, OFormat}

case class GoogleTokenInfo(
    sub: String,
    email: String,
    name: String,
    picture: String
)
object GoogleTokenInfo {
  implicit val GoogleTokenFormat: OFormat[GoogleTokenInfo] =
    Json.format[GoogleTokenInfo]
}
