class Fraction(nominator: Int) {

    var nominator: Int = 0 //licznik
    var denominator: Int = 0 //mianownik


    init {
        this.nominator = nominator
        this.denominator = 1

    }

    constructor (nominator: Int, denominator: Int) : this(nominator) {
        this.nominator = nominator
        this.denominator = denominator
    }



    fun fractiontoString() {
        println("Ułamek to: ${nominator}/${denominator}")
    }


    fun reduce(): Fraction {

        var divisor = findGreaterCommonDivisor(nominator, denominator)

        var newNominator = nominator / divisor
        var newDenominator = denominator / divisor


        // tworzenienie nowego obiektu klasy Fraction

        val newFraction = Fraction(newNominator, newDenominator)

        return newFraction
    }


    fun findGreaterCommonDivisor(number1: Int, number2: Int): Int {

        var divisor = 1

        var i = 1

        while (i <= number1 && i <= number2) {
            if (number1 % i == 0 && number2 % i == 0)
                divisor = i
            ++i
        }

        println("G.C.D of $number1 and $number2 is $divisor")

        return divisor;

    }


//    fun bigReduce() {
//
//    }
//
//
//    fun quot(fraction2: Fraction): Fraction {
//
//
//        var n1 = nominator
//        var n2 = fraction2.nominator
//
//        var d1 = denominator
//        var d2 = fraction2.denominator
//
//        var newN = n1 * n2;
//        var newD = d1 * d2;
//
//
//        val result = Fraction(newN, newD).reduce()
//
//
//
//        //add()
//
//        return result
//
//    }
//
//    fun add() {
//
//
//    }
//
//    fun inv() {
//
//
//    }
//

}