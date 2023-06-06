package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import java.net.InetSocketAddress;
/* loaded from: classes6.dex */
public final class bw {
    String a;
    int b;

    private bw(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static bw a(String str, int i) {
        String str2;
        int lastIndexOf = str.lastIndexOf(CommonConstant.Symbol.COLON);
        if (lastIndexOf != -1) {
            str2 = str.substring(0, lastIndexOf);
            try {
                int parseInt = Integer.parseInt(str.substring(lastIndexOf + 1));
                if (parseInt > 0) {
                    i = parseInt;
                }
            } catch (NumberFormatException unused) {
            }
        } else {
            str2 = str;
        }
        return new bw(str2, i);
    }

    public final String toString() {
        if (this.b > 0) {
            return this.a + CommonConstant.Symbol.COLON + this.b;
        }
        return this.a;
    }

    public static InetSocketAddress b(String str, int i) {
        bw a = a(str, i);
        return new InetSocketAddress(a.a, a.b);
    }
}
