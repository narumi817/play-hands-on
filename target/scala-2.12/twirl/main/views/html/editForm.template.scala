
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

    """),format.raw/*13.5*/("""<fieldset>

        """),_display_(/*15.10*/helper/*15.16*/.inputText(todoForm("name"), '_label -> "名前")),format.raw/*15.61*/("""

    """),format.raw/*17.5*/("""</fieldset>

    <input type="submit" value="登録">

""")))}),format.raw/*21.2*/("""

"""),_display_(/*23.2*/helper/*23.8*/.form(action = routes.TodoController.todoDelete(id))/*23.60*/ {_display_(Seq[Any](format.raw/*23.62*/("""
"""),_display_(/*24.2*/helper/*24.8*/.CSRF.formField),format.raw/*24.23*/("""

    """),format.raw/*26.5*/("""<input type="submit" value="削除" class="btn danger">

""")))}),format.raw/*28.2*/("""
"""),format.raw/*29.1*/("""</body>
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
                  DATE: 2019-06-23T22:10:44.135
                  SOURCE: /Users/mizukoshinarumi/workspace/scala_workspace/play-hands-on/app/views/editForm.scala.html
                  HASH: 227d6eab1bc7ac878599118ca517776b2b31b915
                  MATRIX: 765->1|934->77|961->78|1058->149|1072->155|1133->207|1173->209|1201->211|1215->217|1251->232|1284->238|1332->259|1347->265|1413->310|1446->316|1528->368|1557->371|1571->377|1632->429|1672->431|1700->433|1714->439|1750->454|1783->460|1867->514|1895->515
                  LINES: 21->1|26->2|27->3|34->10|34->10|34->10|34->10|35->11|35->11|35->11|37->13|39->15|39->15|39->15|41->17|45->21|47->23|47->23|47->23|47->23|48->24|48->24|48->24|50->26|52->28|53->29
                  -- GENERATED --
              */
          