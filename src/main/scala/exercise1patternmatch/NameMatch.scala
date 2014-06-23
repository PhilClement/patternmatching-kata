package exercise1

class NameMatch {

  def find(name: String): String = {
    name match {
      case "James" => "James has been found"
      case "Helen" => "Helen has been found"
      case "Garnet" => "Garnet has been found"
      case _ => s"$name has not been found"
    }
  }

  def greet(name: String, greetingMessage: String): String = {
    greetingMessage match {
      case "good morning" => s"$greetingMessage $name"
      case "good afternoon" => s"$greetingMessage $name"
      case "good evening" => s"$greetingMessage $name"
      case "good night" => s"$greetingMessage $name"
      case _ => s"greeting not found for $greetingMessage"
    }
  }
}
