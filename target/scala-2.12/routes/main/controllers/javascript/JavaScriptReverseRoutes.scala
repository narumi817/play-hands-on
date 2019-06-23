// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mizukoshinarumi/workspace/scala_workspace/play-hands-on/conf/routes
// @DATE:Sun Jun 23 20:12:39 JST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers.javascript {

  // @LINE:5
  class ReverseTodoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def todoEdit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.todoEdit",
      """
        function(todoId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "todo/edit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("todoId", todoId0))})
        }
      """
    )
  
    // @LINE:16
    def todoUpdate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.todoUpdate",
      """
        function(todoId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "todo/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("todoId", todoId0))})
        }
      """
    )
  
    // @LINE:12
    def todoAdd: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.todoAdd",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "todo"})
        }
      """
    )
  
    // @LINE:5
    def helloworld: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.helloworld",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "todo/helloworld"})
        }
      """
    )
  
    // @LINE:8
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "todo"})
        }
      """
    )
  
    // @LINE:11
    def todoNew: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.todoNew",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "todo/new"})
        }
      """
    )
  
  }

  // @LINE:2
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
