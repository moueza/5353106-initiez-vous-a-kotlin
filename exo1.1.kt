/**
 *  ----- INITIEZ-VOUS A KOTLIN -----
 * 
 * Partie 1 - Chapitre 2 : Declarez et initialisez des variables
 *  
 *  ----- ENONCE -----
 *
 * Dans cet exercice interactif, vous allez devoir creer et utiliser :
 *
 * - Une variable de type String que vous appelerez "answer". Celle-ci 
 * sera "tardivement" initialisee dans le corps de la methode main() 
 * avec votre prenom.
 * 
 * - Une variable de type String contenant deja la valeur "What is your name ?",
 * que vous appelerez "question"
 *
 * Au lancement du programme, vous afficherez la question, puis initialiserez 
 * la variable "answer" avec votre prenom, et enfin afficherez 
 * la phrase "Your name is VOTRE_PRENOM".
 * 
 * A vous de jouer, et bon courage !
 *
 */
  lateinit var   answer :String 
val question = "What is your name ?"
fun main(args: Array<String>) {
 
  
    println("$question")
      answer="Peter"
        println("Your name is $answer")
}