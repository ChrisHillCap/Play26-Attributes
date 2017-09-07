package models


import akka.util.ByteString
import play.api.http.Writeable

import java.io.Serializable


case class User(fName:String,sName:String){
  override def toString = s"user name = $fName + $sName"
}

object User {

  implicit val writeableS = new Writeable[Serializable]((a: Serializable) => {
    ByteString.apply(a.toString)
  }, None)
}
