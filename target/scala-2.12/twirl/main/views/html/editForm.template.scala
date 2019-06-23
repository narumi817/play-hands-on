
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object editForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[String],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, todoForm: Form[String])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html>
<head>
    <title>Todo</title>
</head>
<body>
<h1>Todo登録</h1>

"""),_display_(/*10.2*/helper/*10.8*/.form(action = routes.TodoController.todoUpdate(id))/*10.60*/ {_display_(Seq[Any](format.raw/*10.62*/("""
"""),_display_(/*11.2*/helper/*11.8*/.CSRF.formField),format.raw/*11.23*/("""

"""),format.raw/*13.1*/("""<fieldset>

    """),_display_(/*15.6*/helper/*15.12*/.inputText(todoForm("name"), '_label -> "名前")),format.raw/*15.57*/("""

"""),format.raw/*17.1*/("""</fieldset>

<input type="submit" value="登録">

""")))}),format.raw/*21.2*/("""

"""),format.raw/*23.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(id:Long,todoForm:Form[String],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(id,todoForm)(request)

  def f:((Long,Form[String]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (id,todoForm) => (request) => apply(id,todoForm)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-06-23T20:12:12.489
                  SOURCE: /Users/mizukoshinarumi/workspace/scala_workspace/play-hands-on/app/views/editForm.scala.html
                  HASH: 40e2e240cf32cadf4cc5b4158d8b4e0a780febfd
                  MATRIX: 765->1|934->77|961->78|1058->149|1072->155|1133->207|1173->209|1201->211|1215->217|1251->232|1280->234|1323->251|1338->257|1404->302|1433->304|1511->352|1540->354
                  LINES: 21->1|26->2|27->3|34->10|34->10|34->10|34->10|35->11|35->11|35->11|37->13|39->15|39->15|39->15|41->17|45->21|47->23
                  -- GENERATED --
              */
          