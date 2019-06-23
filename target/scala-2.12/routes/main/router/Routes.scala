// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mizukoshinarumi/workspace/scala_workspace/play-hands-on/conf/routes
// @DATE:Sun Jun 23 19:14:00 JST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  Assets_0: controllers.Assets,
  // @LINE:5
  TodoController_1: controllers.TodoController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    Assets_0: controllers.Assets,
    // @LINE:5
    TodoController_1: controllers.TodoController
  ) = this(errorHandler, Assets_0, TodoController_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_0, TodoController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todo/helloworld""", """controllers.TodoController.helloworld()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todo""", """controllers.TodoController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todo/new""", """controllers.TodoController.todoNew()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todo""", """controllers.TodoController.todoAdd()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:2
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_TodoController_helloworld1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todo/helloworld")))
  )
  private[this] lazy val controllers_TodoController_helloworld1_invoker = createInvoker(
    TodoController_1.helloworld(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoController",
      "helloworld",
      Nil,
      "GET",
      this.prefix + """todo/helloworld""",
      """ Hello World""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_TodoController_list2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todo")))
  )
  private[this] lazy val controllers_TodoController_list2_invoker = createInvoker(
    TodoController_1.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoController",
      "list",
      Nil,
      "GET",
      this.prefix + """todo""",
      """ List display""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_TodoController_todoNew3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todo/new")))
  )
  private[this] lazy val controllers_TodoController_todoNew3_invoker = createInvoker(
    TodoController_1.todoNew(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoController",
      "todoNew",
      Nil,
      "GET",
      this.prefix + """todo/new""",
      """ input form""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_TodoController_todoAdd4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todo")))
  )
  private[this] lazy val controllers_TodoController_todoAdd4_invoker = createInvoker(
    TodoController_1.todoAdd(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoController",
      "todoAdd",
      Nil,
      "POST",
      this.prefix + """todo""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:2
    case controllers_Assets_versioned0_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:5
    case controllers_TodoController_helloworld1_route(params@_) =>
      call { 
        controllers_TodoController_helloworld1_invoker.call(TodoController_1.helloworld())
      }
  
    // @LINE:8
    case controllers_TodoController_list2_route(params@_) =>
      call { 
        controllers_TodoController_list2_invoker.call(TodoController_1.list())
      }
  
    // @LINE:11
    case controllers_TodoController_todoNew3_route(params@_) =>
      call { 
        controllers_TodoController_todoNew3_invoker.call(TodoController_1.todoNew())
      }
  
    // @LINE:12
    case controllers_TodoController_todoAdd4_route(params@_) =>
      call { 
        controllers_TodoController_todoAdd4_invoker.call(TodoController_1.todoAdd())
      }
  }
}
