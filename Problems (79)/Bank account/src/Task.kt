data class BankAccount(val deposited: Long, val withdrawn: Long) {
    var balance: Long = deposited - withdrawn
}