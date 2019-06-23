
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
/*1.2*/import services._

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[Todo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(items: Seq[Todo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<html>
    <head>
        <title>Todo</title>
    </head>
    <body>
        <section>
            <table>
                <thead>
                    <tr>
                        <th>名前</th>
                    </tr>
                </thead>
                <tbody>
                    """),_display_(/*17.22*/items/*17.27*/.map/*17.31*/ { todo =>_display_(Seq[Any](format.raw/*17.41*/("""
                        """),format.raw/*18.25*/("""<tr>
                            <td>"""),_display_(/*19.34*/todo/*19.38*/.name),format.raw/*19.43*/("""</td>
                        </tr>
                    """)))}),format.raw/*21.22*/("""
                """),format.raw/*22.17*/("""</tbody>
            </table>
            <a href="/todo/new">登録画面</a>
        </section>
    </body>
</html>"""))
      }
    }
  }

  def render(items:Seq[Todo]): play.twirl.api.HtmlFormat.Appendable = apply(items)

  def f:((Seq[Todo]) => play.twirl.api.HtmlFormat.Appendable) = (items) => apply(items)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-06-23T17:27:39.504
                  SOURCE: /Users/mizukoshinarumi/workspace/scala_workspace/play-hands-on/app/views/list.scala.html
                  HASH: 33b29893e97e21d4ea4785e77a46d5acd3ab9825
                  MATRIX: 432->1|756->20|868->39|895->40|1210->328|1224->333|1237->337|1285->347|1338->372|1403->410|1416->414|1442->419|1530->476|1575->493
                  LINES: 17->1|22->2|27->3|28->4|41->17|41->17|41->17|41->17|42->18|43->19|43->19|43->19|45->21|46->22
                  -- GENERATED --
              */
          