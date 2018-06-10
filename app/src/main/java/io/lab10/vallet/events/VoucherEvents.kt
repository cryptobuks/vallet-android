package io.lab10.vallet.events

import java.math.BigInteger

class TransferVoucherEvent(val transactionId: String, val to: String, val value: BigInteger, val blockNumber: BigInteger)
class RedeemVoucherEvent(val transactionId: String, val to: String, val value: BigInteger, val blockNumber: BigInteger)