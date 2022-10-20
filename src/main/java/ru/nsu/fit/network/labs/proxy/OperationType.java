package ru.nsu.fit.network.labs.proxy;

public enum OperationType {
    READ,
    WRITE,
    // dns request and reply
    DNS_READ,
    DNS_WRITE,
    // auth request and reply
    AUTH_READ,
    AUTH_WRITE
}
