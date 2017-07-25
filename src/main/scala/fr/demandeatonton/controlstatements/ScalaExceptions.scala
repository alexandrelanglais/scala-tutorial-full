package fr.demandeatonton.controlstatements

import java.io.{FileNotFoundException, FileReader, IOException}
import java.net.{MalformedURLException, URL}

/**
  * Created by langlais.alexandre on 20/07/2017.
  */
object ScalaExceptions extends App {

  println("---- Lancement d'exceptions ----")
  println(evenNumber(2))
//  println(evenNumber(3))

  def evenNumber(n: Int) = {
    if(n % 2 != 0) throw new IllegalArgumentException("n doit être pair")
    else n
  }

  println("---- Capture d'exceptions ----")
  try {
    val file = new FileReader("inexistant.txt")
  } catch {
    case ex: FileNotFoundException => println("Erreur : Fichier non trouvé")
    case ex: IOException => println("Erreur IO")
  }

  println("---- Finally ----")
  try {
    val file = new FileReader("inexistant.txt")
  } catch {
    case ex: FileNotFoundException => println("Erreur : Fichier non trouvé")
    case ex: IOException => println("Erreur IO")
  } finally {
    println("Cette ligne va s'afficher")
  }

  println("---- Retourner une valeur ----")
  def urlFor(path: String) = {
    try {
      new URL(path)
    } catch {
      case ex: MalformedURLException =>
        println("Erreur : Url malformée")
        new URL("http://www.google.com")
    }
  }
  println(urlFor("toto://google.com"))
  println(urlFor("http://demandeatonton.fr"))

}
