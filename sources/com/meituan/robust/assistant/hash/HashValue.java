package com.meituan.robust.assistant.hash;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.math.BigInteger;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class HashValue {
    private final BigInteger digest;

    public HashValue(byte[] bArr) {
        this.digest = new BigInteger(1, bArr);
    }

    public HashValue(String str) {
        this.digest = new BigInteger(str, 16);
    }

    public static HashValue parse(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return new HashValue(parseInput(str));
    }

    private static String parseInput(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = str.trim().toLowerCase();
        int indexOf = lowerCase.indexOf(32);
        if (indexOf != -1) {
            String substring = lowerCase.substring(0, indexOf);
            if (!substring.startsWith("md") && !substring.startsWith("sha")) {
                if (substring.endsWith(CommonConstant.Symbol.COLON)) {
                    return lowerCase.substring(indexOf + 1).replace(StringUtil.SPACE, "");
                }
                return lowerCase.substring(0, indexOf);
            }
            return lowerCase.substring(lowerCase.lastIndexOf(32) + 1);
        }
        return lowerCase;
    }

    public String asCompactString() {
        return this.digest.toString(36);
    }

    public String asHexString() {
        return this.digest.toString(16);
    }

    public byte[] asByteArray() {
        return this.digest.toByteArray();
    }

    public BigInteger asBigInteger() {
        return this.digest;
    }

    public String asZeroPaddedHexString(int i) {
        return Strings.padStart(asHexString(), i, '0');
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HashValue) {
            return this.digest.equals(((HashValue) obj).digest);
        }
        return false;
    }

    public int hashCode() {
        return this.digest.hashCode();
    }
}
