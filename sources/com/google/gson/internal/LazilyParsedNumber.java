package com.google.gson.internal;

import java.io.ObjectStreamException;
import java.math.BigDecimal;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class LazilyParsedNumber extends Number {
    private final String value;

    public LazilyParsedNumber(String str) {
        this.value = str;
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.value);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.value);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.value).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.value);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.value).longValue();
        }
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.value);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.value);
    }

    public final String toString() {
        return this.value;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LazilyParsedNumber) {
            LazilyParsedNumber lazilyParsedNumber = (LazilyParsedNumber) obj;
            return this.value == lazilyParsedNumber.value || this.value.equals(lazilyParsedNumber.value);
        }
        return false;
    }
}
