package org.tmt.$name;format="space,camel"$

import caseapp.{CommandName, ExtraName, HelpMessage}

sealed trait $Name;Format="Space,Camel"$AppCommand

object $Name;Format="Space,Camel"$AppCommand {

  @CommandName("start")
  final case class StartOptions(
      @HelpMessage("port of the app")
      @ExtraName("p")
      port: Option[Int]
  ) extends $Name;Format="Space,Camel"$AppCommand

}
