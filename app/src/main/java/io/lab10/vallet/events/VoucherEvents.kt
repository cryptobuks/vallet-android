package io.lab10.vallet.events

import io.lab10.vallet.models.BTUsers
import java.math.BigDecimal
import java.math.BigInteger

class TransferVoucherEvent(val address: String, val transactionId: String, val to: String, val value: BigInteger, val blockNumber: BigInteger)
class RedeemVoucherEvent(val address: String, val transactionId: String, val to: String, val value: BigInteger, val blockNumber: BigInteger)
class TokenCreateEvent(val address: String, val name: String, val type: String, val decimal: BigInteger)
class TokenNameEvent(val name: String, val address: String)
class TokenTotalSupplyEvent(val value: Long, val address: String)
class TokenTypeEvent(val name: String, val address: String)
class TokenBalanceEvent(val balance: Long, val address: String)
class NewShopAddEvent(val address: String)
class ProductsListEvent
class ProductAddedEvent
class ProductRefreshEvent
class ProductChangedEvent
class ProductRemoveEvent
class ProductListPublishedEvent(val voucherId: Long, val secret: String = "")
class DeepLinkUserAddEvent(val user: BTUsers.User)
// TOOD This is for burning tokens but not idea why we should do it...
class TokenRedeemEvent(val address: String)


class IssueTokenEvent(val userAddress: String, val amount: String, val userName: String?)
class PendingTransactionEvent(val to: String, val amount: Long)
