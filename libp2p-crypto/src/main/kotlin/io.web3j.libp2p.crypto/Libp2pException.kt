package io.web3j.libp2p.crypto

class Libp2pException : RuntimeException {

    constructor(message: String, ex: Exception?) : super(message, ex) {}
    constructor(message: String) : super(message) {}
    constructor(ex: Exception) : super(ex) {}

}