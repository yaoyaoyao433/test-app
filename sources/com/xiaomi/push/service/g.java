package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.hx;
import java.util.Map;
/* loaded from: classes6.dex */
public final class g {
    static a a;
    private static b b;

    /* loaded from: classes6.dex */
    public interface a {
        Map<String, String> a(Context context, hx hxVar);

        boolean a(Context context, hx hxVar, boolean z);
    }

    /* loaded from: classes6.dex */
    public interface b {
        boolean a(hx hxVar);
    }

    public static void a(Context context, hx hxVar) {
        if (a == null || hxVar == null) {
            com.xiaomi.channel.commonutils.logger.c.a("handle msg wrong");
        }
    }

    public static void a(String str) {
        if (b == null || str == null) {
            com.xiaomi.channel.commonutils.logger.c.a("pepa clearMessage is null");
        }
    }

    public static boolean a(Context context, hx hxVar, boolean z) {
        if (a == null || hxVar == null) {
            com.xiaomi.channel.commonutils.logger.c.a("pepa judement listener or container is null");
            return false;
        }
        return a.a(context, hxVar, z);
    }

    public static boolean a(hx hxVar) {
        if (b == null || hxVar == null) {
            com.xiaomi.channel.commonutils.logger.c.a("pepa handleReceiveMessage is null");
            return false;
        }
        return b.a(hxVar);
    }

    public static void b(hx hxVar) {
        if (b == null || hxVar == null) {
            com.xiaomi.channel.commonutils.logger.c.a("pepa clearMessage is null");
        }
    }
}
