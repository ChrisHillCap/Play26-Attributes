package helpers

import models.User
import play.api.libs.typedmap.TypedKey

object Attributes {
  val userTypeKey:TypedKey[User] = TypedKey[User]("user")
  val UIDTypeKey:TypedKey[String] = TypedKey[String] ("UID")

}
