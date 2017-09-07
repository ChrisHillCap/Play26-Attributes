import helpers.Attributes
import models.User
import org.scalatest.mockito.MockitoSugar
import play.api.mvc.{AnyContent, Request}
import play.api.test._
import services.RequestHandler


class RequestHandlerSpec extends MockitoSugar with PlaySpecification {

  val service = new RequestHandler

  implicit val request = FakeRequest()

  "addUIDAttributeToRequest" should {
    //tested by toStringing the attributes to not reveal the attribute code ;)
    "add 1 attribute to a request of type string called" in {
      val res:Request[AnyContent] = service.addUIDAttributeToRequest("StringToBeAdded")(request)

      res.attrs.toString.contains("StringToBeAdded") shouldEqual(true)
    }
  }
  "addAttributeToRequest" should {
   //tested by toStringing the attributes to not reveal the attribute code ;)
    "add 1 attribute to a request of type User (case class)" in  {
      val res:Request[AnyContent] =  service.addAttributeToRequest()(request)

      res.attrs.toString.contains("billy") shouldEqual(true)
      res.attrs.toString.contains("bob") shouldEqual(true)
    }
  }
  "getUserAttributeFromRequest" should {
    "return a User Case class with the firstName = billy, lastname = bob" in {
      val res:User = service.getUserAttributeFromRequest()(request)

     res shouldEqual User("billy","bob")
    }
  }

}
