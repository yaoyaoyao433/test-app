package org.apache.flink.cep.common.util;

import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a {
    public static final String[] a = new String[0];
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(Object obj) {
        String deepToString = Arrays.deepToString(new Object[]{obj});
        return deepToString.substring(1, deepToString.length() - 1);
    }
}
