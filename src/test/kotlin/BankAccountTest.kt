import org.junit.Assert.*
import org.junit.Test
import tasks.BankAccount
import tasks.TypeAccount

class BankAccountTest {
    private fun testingString(actual: String, expected: String) {
        assertEquals(expected, actual)
    }

    private fun testingDouble(actual: Double, expected: Double, delta: Double = 1e-10) {
        assertEquals(expected, actual, delta)
    }

    @Test
    fun testWithdraw() {
        val account = BankAccount("Alice", 100.0, TypeAccount.CHECKING)

        testingDouble(account.withdraw(50.0), 50.0)
    }

    @Test
    fun testWithdrawWithInsufficientBalance() {
        val account = BankAccount("Bob", 30.0, TypeAccount.SAVING)

        testingDouble(account.withdraw(50.0),30.0)
    }

    @Test
    fun testPrintAccountInfo() {
        val account = BankAccount("Charlie", 200.0, TypeAccount.CHECKING)

        val expectedOutput = """Bank account info:
            |Owner: Charlie
            |Balance: 200.00
            |Account type: CHECKING
        """.trimMargin()

        testingString(account.printAccountInfo(), expectedOutput)
    }
}