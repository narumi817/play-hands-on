// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mizukoshinarumi/workspace/scala_workspace/play-hands-on/conf/routes
// @DATE:Sun Jun 23 16:46:36 JST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers {

  // @LINE:5
  class ReverseTodoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def helloworld(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "todo/helloworld")
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
