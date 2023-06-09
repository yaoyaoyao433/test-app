package com.meizu.cloud.pushsdk.b;

import com.meituan.robust.Constants;
/* loaded from: classes3.dex */
public final class d {
    private static final char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Constants.OBJECT_TYPE, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    private static final char b = (char) Integer.parseInt("00000011", 2);
    private static final char c = (char) Integer.parseInt("00001111", 2);
    private static final char d = (char) Integer.parseInt("00111111", 2);
    private final String e;
    private char[] f;
    private int g = 0;

    public d(String str) {
        this.e = str;
        a();
    }

    private void a() {
        char[] cArr = new char[a.length];
        this.g = this.e.charAt(0) % '\r';
        for (int i = 0; i < a.length; i++) {
            cArr[i] = a[(this.g + i) % a.length];
        }
        this.f = cArr;
    }

    public final String a(byte[] bArr) {
        String str;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder(((bArr.length + 2) / 3) * 4);
        int i = 0;
        int length = bArr.length;
        while (i < length) {
            int i2 = i + 1;
            int i3 = bArr[i] & 255;
            if (i2 == length) {
                sb.append(this.f[i3 >>> 2]);
                sb.append(this.f[(i3 & b) << 4]);
                str = "==";
            } else {
                int i4 = i2 + 1;
                int i5 = bArr[i2] & 255;
                if (i4 == length) {
                    sb.append(this.f[i3 >>> 2]);
                    sb.append(this.f[((i3 & b) << 4) | (i5 >>> 4)]);
                    sb.append(this.f[(c & i5) << 2]);
                    str = "=";
                } else {
                    int i6 = i4 + 1;
                    int i7 = bArr[i4] & 255;
                    sb.append(this.f[i3 >>> 2]);
                    sb.append(this.f[((i3 & b) << 4) | (i5 >>> 4)]);
                    sb.append(this.f[((i5 & c) << 2) | (i7 >>> 6)]);
                    sb.append(this.f[d & i7]);
                    i = i6;
                }
            }
            sb.append(str);
            break;
        }
        return sb.toString();
    }
}
