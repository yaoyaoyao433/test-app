package com.xiaomi.push;
/* loaded from: classes6.dex */
public final class jq {
    public static String a(String str, String str2) {
        try {
            return (String) jr.a(null, "android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a("SystemProperties.get: " + e);
            return str2;
        }
    }
}
