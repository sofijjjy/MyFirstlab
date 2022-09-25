package com.example.myfirstlab

import kotlin.random.Random

class NumbersExercise {
  val numbers: List<Int> = List(10){ Random.nextInt(-10, 10) }


    fun firstNegative(): Int{

        return numbers.withIndex().indexOfFirst { (index, value) -> value < 0 }

    }

    fun lastPositive(): Int{

        return numbers.withIndex().indexOfLast { (index, value) -> value > 0 }
    }
}
