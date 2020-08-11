fun main() {

    var nilai : Int = 90
    val tuntas = nilai >= 75
    if (!tuntas)
    {
        println("Nilai kamu $nilai, Silahkan ikut remidial.")
    }
    else
    {
        println("Nilai kamu $nilai, Selamat ya!")
    }

    val a = 90
    val b = 80
    val c = 70
    val d = 60
    val e = 50

    if (nilai > a)
    {
        println("A" )

    }
    else if (nilai > b) {

        println("Nilai kamu B")
    }
    else if (nilai > c){

        println("Nilai kamu C")
    }
    else if (nilai > d){

        println("Nilai kamu D")
    }
    else if (nilai <= e){

        println("Nilai kamu E")

    }
    else {
        println("Tidak tersedia")
    }
}


