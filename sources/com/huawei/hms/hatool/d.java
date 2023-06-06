package com.huawei.hms.hatool;

import android.util.Pair;
import java.nio.charset.Charset;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d {
    public static final Charset a = Charset.forName("UTF-8");

    public static Pair<byte[], String> a(String str) {
        if (str == null || str.length() < 32) {
            return new Pair<>(new byte[0], str);
        }
        String substring = str.substring(0, 32);
        return new Pair<>(com.huawei.secure.android.common.encrypt.utils.c.a(substring), str.substring(32));
    }

    public static String a(String str, String str2) {
        Pair<byte[], String> a2 = a(str);
        return new String(com.huawei.secure.android.common.encrypt.aes.a.a(com.huawei.secure.android.common.encrypt.utils.c.a((String) a2.second), com.huawei.secure.android.common.encrypt.utils.c.a(str2), (byte[]) a2.first), a);
    }

    public static String b(String str, String str2) {
        return com.huawei.secure.android.common.encrypt.utils.c.a(com.huawei.secure.android.common.encrypt.aes.a.a(str.getBytes(a), com.huawei.secure.android.common.encrypt.utils.c.a(str2)));
    }
}
