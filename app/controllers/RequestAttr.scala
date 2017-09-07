package controllers

import javax.inject.{Inject, Singleton}

import models.User
import play.api.mvc._
import services.RequestHandler



@Singleton
class RequestAttr @Inject()(cc: ControllerComponents,s:RequestHandler) extends AbstractController(cc) with BaseController {


  /*def getattrsOfUser = Action{implicit request:Request[AnyContent] =>
    Ok(s.getUserAttributeFromRequest())(User.writeableS)
  }
*/
}

