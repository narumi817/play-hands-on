
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

object createForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[String],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(todoForm: Form[String])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html>
    <head>
        <title>Todo</title>
    </head>
    <body>
        <h1>Todo登録</h1>

        """),_display_(/*10.10*/helper/*10.16*/.form(action = routes.TodoController.todoAdd())/*10.63*/ {_display_(Seq[Any](format.raw/*10.65*/("""
        """),_display_(/*11.10*/helper/*11.16*/.CSRF.formField),format.raw/*11.31*/("""

        """),format.raw/*13.9*/("""<fieldset>

            """),_display_(/*15.14*/helper/*15.20*/.inputText(todoForm("name"), '_label -> "名前")),format.raw/*15.65*/("""

        """),format.raw/*17.9*/("""</fieldset>

        <input type="submit" value="登録">

        """)))}),format.raw/*21.10*/("""

    """),format.raw/*23.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(todoForm:Form[String],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(todoForm)(request)

  def f:((Form[String]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (todoForm) => (request) => apply(todoForm)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-06-23T19:14:33.445
                  SOURCE: /Users/mizukoshinarumi/workspace/scala_workspace/play-hands-on/app/views/createForm.scala.html
                  HASH: 5831cfd5d45a8640eee619d37aa063539914ae9d
                  MATRIX: 762->1|921->67|948->68|1078->171|1093->177|1149->224|1189->226|1226->236|1241->242|1277->257|1314->267|1366->292|1381->298|1447->343|1484->353|1579->417|1612->423
                  LINES: 21->1|26->2|27->3|34->10|34->10|34->10|34->10|35->11|35->11|35->11|37->13|39->15|39->15|39->15|41->17|45->21|47->23
                  -- GENERATED --
              */
          