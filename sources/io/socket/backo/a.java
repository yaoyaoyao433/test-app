package io.socket.backo;

import java.math.BigDecimal;
import java.math.BigInteger;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a {
    public double c;
    public int d;
    public long a = 100;
    public long b = 10000;
    private int e = 2;

    public final long a() {
        BigInteger valueOf = BigInteger.valueOf(this.a);
        BigInteger valueOf2 = BigInteger.valueOf(this.e);
        int i = this.d;
        this.d = i + 1;
        BigInteger multiply = valueOf.multiply(valueOf2.pow(i));
        if (this.c != 0.0d) {
            double random = Math.random();
            BigInteger bigInteger = BigDecimal.valueOf(random).multiply(BigDecimal.valueOf(this.c)).multiply(new BigDecimal(multiply)).toBigInteger();
            multiply = (((int) Math.floor(random * 10.0d)) & 1) == 0 ? multiply.subtract(bigInteger) : multiply.add(bigInteger);
        }
        return multiply.min(BigInteger.valueOf(this.b)).longValue();
    }
}
