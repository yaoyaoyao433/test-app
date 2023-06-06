package com.xiaomi.push.service;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import com.meituan.robust.common.CommonConstant;
import com.xiaomi.push.jj;
import com.xiaomi.push.jr;
import com.xiaomi.push.js;
import com.xiaomi.push.service.x;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes6.dex */
public class bz {
    private static final int[] a = {1, 2, 4, 8, 16};
    private static final SparseArray<x.a<String, String, String>> b = new ca(5);
    private static final SparseArray<Integer> c = new cb(5);

    bz() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(String str, String str2) {
        int i = a(str, str2, 8) ? 8 : 0;
        if (a(str, str2, 16)) {
            i |= 16;
        }
        if (a(str, str2, 1)) {
            i |= 1;
        }
        if (a(str, str2, 2)) {
            i |= 2;
        }
        return a(str, str2, 4) ? i | 4 : i;
    }

    private static void a(SharedPreferences sharedPreferences, int i, String str) {
        sharedPreferences.edit().putInt(str, i).commit();
    }

    private static void a(SharedPreferences sharedPreferences, List<String> list) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String str : list) {
            edit.remove(str);
        }
        edit.commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, String str2, int i, int i2) {
        int[] iArr;
        for (int i3 : a) {
            if ((c.get(i3).intValue() & i2) == 0) {
                a(str, str2, i3, (i & i3) > 0);
            } else {
                com.xiaomi.channel.commonutils.logger.c.a("ChannelPermissions.grantPermission:" + str + CommonConstant.Symbol.COLON + str2 + ": <" + i3 + "> :stoped by userLock");
            }
        }
    }

    private static void a(String str, String str2, int i, boolean z) {
        boolean a2 = x.a(jr.a(), str, str2, b.get(i), z);
        com.xiaomi.channel.commonutils.logger.c.a("ChannelPermissions.grantPermission:" + str + CommonConstant.Symbol.COLON + str2 + ": <" + i + "=" + z + "> :" + a2);
    }

    private static boolean a(String str, String str2, int i) {
        boolean z = x.a(jr.a(), str, str2, b.get(i)) == 1;
        com.xiaomi.channel.commonutils.logger.c.a("ChannelPermissions.checkPermission:" + str + CommonConstant.Symbol.COLON + str2 + ": <" + i + "=" + z + ">");
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, String str, String str2, int i, String str3, boolean z, int i2) {
        if (!jj.a(context) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            if (jj.a(context)) {
                com.xiaomi.channel.commonutils.logger.c.a("ChannelPC: can`t setup permission with permissionCode:" + String.valueOf(str3) + " channelId:" + String.valueOf(str2) + " targetPkg:" + str);
                return;
            }
            return;
        }
        int a2 = js.a(str3, 0);
        boolean z2 = i >= 4 || (a2 & 2) > 0 || (a2 & 1) > 0 || (a2 & 8) > 0 || (a2 & 16) > 0;
        if (z) {
            a(str, str2, a2, i2);
            if (z2) {
                synchronized (bz.class) {
                    a(context.getSharedPreferences("ch_permission_cache_file", 0), a2, str2);
                }
                return;
            }
            return;
        }
        synchronized (bz.class) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("ch_permission_cache_file", 0);
            if (z2 || sharedPreferences.contains(str2)) {
                if (sharedPreferences.getInt(str2, 0) != a2) {
                    a(str, str2, a2, i2);
                }
                if (z2) {
                    a(sharedPreferences, a2, str2);
                } else {
                    a(sharedPreferences, new cc(str2));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, String str) {
        List<NotificationChannel> b2;
        if (!jj.a(context) || TextUtils.isEmpty(str) || (b2 = w.a(context, str).b()) == null) {
            return;
        }
        synchronized (bz.class) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("ch_permission_cache_file", 0);
            ArrayList arrayList = new ArrayList();
            for (NotificationChannel notificationChannel : b2) {
                String str2 = (String) com.xiaomi.push.am.a(notificationChannel, "mId");
                if (!TextUtils.isEmpty(str2) && sharedPreferences.contains(str2)) {
                    arrayList.add(str2);
                }
            }
            if (arrayList.size() > 0) {
                a(sharedPreferences, arrayList);
            }
        }
    }
}
