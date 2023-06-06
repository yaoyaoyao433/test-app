package org.apache.flink.cep.nfa.sharedbuffer;

import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class h {
    public static String a(Iterator<?> it, String str) {
        if (it == null) {
            return null;
        }
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                return a(next);
            }
            StringBuilder sb = new StringBuilder(256);
            if (next != null) {
                sb.append(next);
            }
            while (it.hasNext()) {
                if (str != null) {
                    sb.append(str);
                }
                Object next2 = it.next();
                if (next2 != null) {
                    sb.append(next2);
                }
            }
            return sb.toString();
        }
        return "";
    }

    private static String a(Object obj) {
        return obj == null ? "" : obj.toString();
    }
}
