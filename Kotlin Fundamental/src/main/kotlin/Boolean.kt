fun main(){
    val nilai = 65
    val score : Char

    score = if (nilai > 90){
        'A'
    }else if (nilai <=90 && nilai >80){
        'B'
    }else if (nilai <= 80 && nilai > 70){
        'C'
    }else if (nilai <= 70 && nilai >60){
        'D'
    }else{
        'E'
    }
    println("Nilaimu $score")
}