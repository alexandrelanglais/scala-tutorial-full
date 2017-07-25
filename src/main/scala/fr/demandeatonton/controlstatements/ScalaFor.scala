package fr.demandeatonton.controlstatements

object ScalaFor extends App {
  println("----- Itération sur une collection -----")
  val files = (new java.io.File(".")).listFiles
  for (file <- files)
    println(file)

  println("----- Range to -----")
  for(i <- 0 to 5)
    print(i + " ")

  println()

  println("----- Range until -----")
  for(i <- 0 until 5)
    print(i + " ")

  println()

  println("----- Filtrage -----")
  for (file <- files if file.isDirectory)
    println(file)

  println("----------")
  for (file <- files
       if file.isDirectory
       if !file.getName.startsWith(".")
  ) println(file)

  println("----- Itérations imbriquées -----")
  for (folder <- files
        if folder.isDirectory
        if !folder.getName.startsWith(".");
        file <- folder.listFiles()
          if file.isFile
          if !file.getName.startsWith(".")
  ) println(file)

  println("----- Utilisation de variables dans l'expression for -----")
  for (folder <- files
        if folder.isDirectory
        if !folder.getName.startsWith(".");
        file <- folder.listFiles();
          fileName = file.getName
          if file.isFile
          if !fileName.startsWith(".")
  ) println(fileName)

  println("----- Génération d'une collection -----")
  def listVisibleFolders() = {
    for (folder <- files
         if folder.isDirectory
         if !folder.getName.startsWith("."))
      yield folder
  }
  listVisibleFolders().foreach(folder => println(folder))
}
