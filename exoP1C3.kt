/**
 *  ----- INITIEZ-VOUS A KOTLIN -----
 * 
 * Partie 1 - Chapitre 3 : Implementez differentes fonctions
 *  
 *  ----- ENONCE -----
 *
 * Dans cet exercice interactif, vous allez devoir creer :
 *
 * - getResult() : Une fonction retournant le resultat (nombres entiers) d'une addition 
 * entre les deux nombres fournis en parametre
 * - getUsernameUpperCase() : Une fonction retournant le nom de l'utilisateur
 * fourni en parametre, mais tout en majuscule ! 
 * - isUsernameOfTeacher() : Une fonction retournant true si le nom de l'utilisateur
 * fourni en parametre est égale à "Phil" ou "Ambroise", et false dans les autres cas.
 *
 * Au lancement du programme, vous executerez et afficherez le resultat 
 * de ces trois fonctions. 
 * 
 * A vous de jouer, et bon courage !
 *
 */

fun main(args: Array<String>) {
 
    println("add="+getResult(1,2))
        println("up="+getUsernameUpperCase("Je crois"))
        println("isTeach="+isUsernameOfTeacher("Phil"))
     println("isTeach="+isUsernameOfTeacher("Philo"))
}

fun getResult(a:Int,b:Int)=a+b
fun getUsernameUpperCase(a:String)=a.toUpperCase()
fun isUsernameOfTeacher(a:String)=a.equals("Phil")||a.equals("Ambroise")


