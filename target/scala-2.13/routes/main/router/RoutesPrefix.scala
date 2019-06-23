// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mizukoshinarumi/workspace/scala_workspace/play-hands-on/conf/routes
// @DATE:Sun Jun 23 16:46:36 JST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
