// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mizukoshinarumi/workspace/scala_workspace/play-hands-on/conf/routes
// @DATE:Sun Jun 23 22:10:13 JST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers {

  // @LINE:5
  class ReverseTodoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def todoDelete(todoId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "todo/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("todoId", todoId)) + "/delete")
    }
  
    // @LINE:15
    def todoEdit(todoId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "todo/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("todoId", todoId)))
    }
  
    // @LINE:16
    def todoUpdate(todoId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "todo/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("todoId", todoId)))
    }
  
    // @LINE:12
    def todoAdd(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "todo")
    }
  
    // @LINE:5
    def helloworld(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "todo/helloworld")
    }
  
    // @LINE:8
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "todo")
    }
  
    // @LINE:11
    def todoNew(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "todo/new")
    }
  
  }

  // @LINE:2
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
