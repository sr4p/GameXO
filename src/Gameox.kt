import java.util.Scanner
fun main() {
    val kb = Scanner(System.`in`)
    var sum = 0

    val arrOX: Array<Array<Char>> = arrayOf(
        arrayOf(' ', '1', '2', '3'),
        arrayOf('1', '-', '-', '-'),
        arrayOf('2', '-', '-', '-'),
        arrayOf('3', '-', '-', '-')
    )

    for (row in arrOX) {
        for (col in row) {
            print(col)
        }
        println()
    }

    while (true) {
        println("Turn X -> Input X & Y :")
        var xr = kb.nextInt()
        var xc = kb.nextInt()

        arrOX[xr][xc] = 'X'
        for (row in arrOX) {
            for (col in row) {
                print(col + " ")
            }
            println()

        }
        sum++

        if (sum == 9) {
            if (arrOX[1][1] == 'X' && arrOX[1][2] == 'X' && arrOX[1][3] == 'X' || arrOX[2][1] == 'X' && arrOX[2][2] == 'X' && arrOX[2][3] == 'X' || arrOX[3][1] == 'X' && arrOX[3][2] == 'X' && arrOX[3][3] == 'X') {
                println(" ")
                print("X : Win")
                break
            }
            if (arrOX[1][1] == 'X' && arrOX[2][1] == 'X' && arrOX[3][1] == 'X' || arrOX[1][2] == 'X' && arrOX[2][2] == 'X' && arrOX[3][2] == 'X' || arrOX[1][3] == 'X' && arrOX[2][3] == 'X' && arrOX[3][3] == 'X') {
                println(" ")
                print("X : Win")
                break
            }
            if (arrOX[1][1] == 'X' && arrOX[2][2] == 'X' && arrOX[3][3] == 'X' || arrOX[3][1] == 'X' && arrOX[2][2] == 'X' && arrOX[1][3] == 'X') {
                println(" ")
                print("X : Win")
                break
            }
            else {
                println(" ")
                println("Player X  ::Draw::  Player O")
                break
            }
        }

        if (arrOX[1][1] == 'X' && arrOX[1][2] == 'X' && arrOX[1][3] == 'X' || arrOX[2][1] == 'X' && arrOX[2][2] == 'X' && arrOX[2][3] == 'X' || arrOX[3][1] == 'X' && arrOX[3][2] == 'X' && arrOX[3][3] == 'X') {
            println(" ")
            print("X : Win")
            break
        }
        if (arrOX[1][1] == 'X' && arrOX[2][1] == 'X' && arrOX[3][1] == 'X' || arrOX[1][2] == 'X' && arrOX[2][2] == 'X' && arrOX[3][2] == 'X' || arrOX[1][3] == 'X' && arrOX[2][3] == 'X' && arrOX[3][3] == 'X') {
            println(" ")
            print("X : Win")
            break
        }
        if (arrOX[1][1] == 'X' && arrOX[2][2] == 'X' && arrOX[3][3] == 'X' || arrOX[3][1] == 'X' && arrOX[2][2] == 'X' && arrOX[1][3] == 'X') {
            println(" ")
            print("X : Win")
            break
        }


        println("Turn O -> Input X & Y :")
        var or = kb.nextInt()
        var oc = kb.nextInt()

        arrOX[or][oc] = 'O'

        for (row in arrOX) {
            for (col in row) {
                print(col + " ")
            }
            println()
        }
        sum++
        if (arrOX[1][1] == 'O' && arrOX[1][2] == 'O' && arrOX[1][3] == 'O' || arrOX[2][1] == 'O' && arrOX[2][2] == 'O' && arrOX[2][3] == 'O' || arrOX[3][1] == 'O' && arrOX[3][2] == 'O' && arrOX[3][3] == 'O') {
            println(" ")
            print("O : Win")
            break
        }
        if (arrOX[1][1] == 'O' && arrOX[2][1] == 'O' && arrOX[3][1] == 'O' || arrOX[1][2] == 'O' && arrOX[2][2] == 'O' && arrOX[3][2] == 'O' || arrOX[1][3] == 'O' && arrOX[2][3] == 'O' && arrOX[3][3] == 'O') {
            println(" ")
            print("O : Win")
            break
        }
        if (arrOX[1][1] == 'O' && arrOX[2][2] == 'O' && arrOX[3][3] == 'O' || arrOX[3][1] == 'O' && arrOX[2][2] == 'O' && arrOX[1][3] == 'O') {
            println(" ")
            print("O : Win")
            break
        }
    }


}