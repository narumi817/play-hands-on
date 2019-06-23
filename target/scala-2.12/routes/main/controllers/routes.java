// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mizukoshinarumi/workspace/scala_workspace/play-hands-on/conf/routes
// @DATE:Sun Jun 23 19:14:00 JST 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseTodoController TodoController = new controllers.ReverseTodoController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseTodoController TodoController = new controllers.javascript.ReverseTodoController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
