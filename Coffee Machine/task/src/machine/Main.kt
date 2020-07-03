package machine

import java.util.Scanner
import kotlin.system.exitProcess

val scanner = Scanner(System.`in`)
var currentWater = 400
var currentMilk = 540
var currentCoffeeBeans = 120
var currentDisposableCups = 9
var currentAmount = 550

fun main() {

    while (true) {
        println("Write action (buy, fill, take, remaining, exit): >")
        while (scanner.hasNext()) {
            when (scanner.next()) {
                "buy" -> buyAction()
                "fill" -> fillAction()
                "take" -> takeAction()
                "remaining" -> printSystemStatus()
                "exit" -> exitProcess(0)
            }
            break
        }
    }
}

fun printSystemStatus() {
    println("The coffee machine has: ")
    println("$currentWater of water")
    println("$currentMilk of milk")
    println("$currentCoffeeBeans of coffee beans")
    println("$currentDisposableCups of disposable cups")
    println("$$currentAmount of money")
    println("")
}

fun buyAction() {
    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: > ")
    when (scanner.next()) {
        "1" -> buyEspresso()
        "2" -> buyLatte()
        "3" -> buyCappuccino()
        "back" -> return
    }
}

fun fillAction() {
    println("Write how many ml of water do you want to add: > ")
    currentWater = currentWater.plus(scanner.nextInt())

    println("Write how many ml of milk do you want to add: > ")
    currentMilk = currentMilk.plus(scanner.nextInt())

    println("Write how many grams of coffee beans do you want to add: > ")
    currentCoffeeBeans = currentCoffeeBeans.plus(scanner.nextInt())

    println("Write how many disposable cups of coffee do you want to add: > ")
    currentDisposableCups = currentDisposableCups.plus(scanner.nextInt())

    println("")
}

fun takeAction() {
    println("I gave you $$currentAmount")
    println()
    currentAmount = currentAmount.minus(currentAmount)
}

fun buyEspresso() {
    if (currentWater >= 250 && currentCoffeeBeans >= 16 && currentDisposableCups >= 1) {
        currentWater = currentWater.minus(250)
        currentCoffeeBeans = currentCoffeeBeans.minus(16)
        currentAmount = currentAmount.plus(4)
        currentDisposableCups = currentDisposableCups.minus(1)
        happyMessage()
    } else {
        validateResources(250, 16)
    }
}

fun buyLatte() {
    if (currentWater >= 350 && currentMilk >= 75 && currentCoffeeBeans >= 20 && currentDisposableCups >= 1) {
        currentWater = currentWater.minus(350)
        currentMilk = currentMilk.minus(75)
        currentCoffeeBeans = currentCoffeeBeans.minus(20)
        currentAmount = currentAmount.plus(7)
        currentDisposableCups = currentDisposableCups.minus(1)
        happyMessage()
    } else {
        validateResources(350, 20, 75)
    }
}

fun buyCappuccino() {
    if (currentWater >= 200 && currentMilk >= 100 && currentCoffeeBeans >= 12 && currentDisposableCups >= 1) {
        currentWater = currentWater.minus(200)
        currentMilk = currentMilk.minus(100)
        currentCoffeeBeans = currentCoffeeBeans.minus(12)
        currentAmount = currentAmount.plus(6)
        currentDisposableCups = currentDisposableCups.minus(1)
        happyMessage()
    } else {
        validateResources(200, 12, 100)
    }
}

fun happyMessage() {
    println("I have enough resources, making you a coffee!")
    println("")
}

fun validateResources(minWater: Int, minCoffeeBeans: Int) {
    if (currentWater < minWater) {
        println("Sorry, not enough water!")
        println("")
    } else if (currentCoffeeBeans < minCoffeeBeans) {
        println("Sorry, not enough Coffee Beans!")
        println("")
    } else if (currentDisposableCups < 1) {
        println("Sorry, not enough Disposable Cups!")
        println("")
    }
}

fun validateResources(minWater: Int, minCoffeeBeans: Int, minMilk: Int) {
    if (currentWater < minWater) {
        println("Sorry, not enough water!")
        println("")
    } else if (currentMilk <= minMilk) {
        println("Sorry, not enough milk!")
        println("")
    } else if (currentCoffeeBeans < minCoffeeBeans) {
        println("Sorry, not enough Coffee Beans!")
        println("")
    } else if (currentDisposableCups < 1) {
        println("Sorry, not enough Disposable Cups!")
        println("")
    }
}