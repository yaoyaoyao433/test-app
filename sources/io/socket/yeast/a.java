package io.socket.yeast;

import com.meituan.robust.common.CommonConstant;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a {
    private static char[] a;
    private static int b;
    private static int c;
    private static String d;
    private static Map<Character, Integer> e;

    static {
        char[] charArray = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-_".toCharArray();
        a = charArray;
        b = charArray.length;
        c = 0;
        e = new HashMap(b);
        for (int i = 0; i < b; i++) {
            e.put(Character.valueOf(a[i]), Integer.valueOf(i));
        }
    }

    private static String a(long j) {
        StringBuilder sb = new StringBuilder();
        do {
            sb.insert(0, a[(int) (j % b)]);
            j /= b;
        } while (j > 0);
        return sb.toString();
    }

    public static String a() {
        String a2 = a(new Date().getTime());
        if (!a2.equals(d)) {
            c = 0;
            d = a2;
            return a2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a2);
        sb.append(CommonConstant.Symbol.DOT);
        int i = c;
        c = i + 1;
        sb.append(a(i));
        return sb.toString();
    }
}
