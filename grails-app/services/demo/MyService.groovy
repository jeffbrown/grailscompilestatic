package demo

import grails.compiler.GrailsTypeChecked

class MyService {

  @GrailsTypeChecked // or @GrailsCompileStatic
  def doSomething() {
    String name = missingVariable
  }

}
