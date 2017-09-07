package services

import javax.inject.{Inject, Singleton}
import helpers.Attributes
import models.User
import play.api.mvc.{AnyContent, Request}


@Singleton
class RequestHandler @Inject()() {
/*

  def addUIDAttributeToRequest(UID:String)(implicit request:Request[AnyContent]):Request[AnyContent] = {
    request.addAttr[String](Attributes.UIDTypeKey,UID)
  }

  def addAttributeToRequest()(implicit request:Request[AnyContent]):Request[AnyContent] = {
    request.addAttr[User](Attributes.userTypeKey, User("billy", "bob"))
  }
  def getUserAttributeFromRequest()(implicit request: Request[AnyContent]):User = {
    addAttributeToRequest().attrs.get(Attributes.userTypeKey).get
  }
*/


}
