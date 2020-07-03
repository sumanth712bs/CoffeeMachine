import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val firstCountryName = input.next()
    val secondCountryName = input.next()

    val firstCountry = Countries.findByName(firstCountryName)
    val secondCountry = Countries.findByName(secondCountryName)
    println(firstCountry.getCurrencyOfCountry() == secondCountry.getCurrencyOfCountry())
}

enum class Countries(val currency: String) {
    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar"),
    NULL("");

    fun getCurrencyOfCountry(): String {
        return currency
    }

    companion object {
        fun findByName(countryName: String): Countries {
            for (enum in Countries.values()) {
                if (countryName == enum.name)
                    return enum
            }
            return NULL
        }
    }
}