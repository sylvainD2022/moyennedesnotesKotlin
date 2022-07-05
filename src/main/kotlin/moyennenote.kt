import com.sun.media.sound.EmergencySoundbank.toFloat
import sun.security.ec.point.ProjectivePoint.Mutable

fun main(args: Array<String>) {
    var notes = mutableListOf<Int>()
    var moyenne: Float=0.0F
    var nombreNote: Int = 0
//    println("veuillez saisir un nombre de note")
//    nombreNote = Integer.parseInt(readLine())
    //println(nombreNote)
    var index= 0
    var flag =-1
    var somme = 0.0F

     do{
        println("note : ")
        var saisie = Integer.parseInt(readLine())
        notes.add(saisie)
         nombreNote=notes.size-1
        somme += saisie
        index++
    }while (saisie!=flag)
    if (nombreNote != null || nombreNote!=0) {
        moyenne = somme / nombreNote
    }
    println(nombreNote)
    println("la moyenne est de $moyenne")
}