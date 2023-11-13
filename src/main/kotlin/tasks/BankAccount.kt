package tasks

enum class TypeAccount {
    CHECKING, SAVING
}

class BankAccount(private val owner: String?, private var balance: Double, private val typeOfAccount: TypeAccount) {
    fun withdraw(sum: Double): Double {
        if (balance - sum >= 0) {
            balance -= sum
        }

        return balance
    }

    fun printAccountInfo(): String {
        return """Bank account info:
            |Owner: ${owner ?: "Owner unknown."}
            |Balance: ${String.format("%.2f", balance)}
            |Account type: $typeOfAccount
            """.trimMargin()
    }
}