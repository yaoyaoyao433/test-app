package com.bumptech.glide.signature;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    private static final ConcurrentHashMap<String, com.bumptech.glide.load.c> a = new ConcurrentHashMap<>();

    public static com.bumptech.glide.load.c a(Context context) {
        String packageName = context.getPackageName();
        com.bumptech.glide.load.c cVar = a.get(packageName);
        if (cVar == null) {
            com.bumptech.glide.load.c b = b(context);
            com.bumptech.glide.load.c putIfAbsent = a.putIfAbsent(packageName, b);
            return putIfAbsent == null ? b : putIfAbsent;
        }
        return cVar;
    }

    private static com.bumptech.glide.load.c b(Context context) {
        PackageInfo packageInfo;
        String uuid;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            packageInfo = null;
        }
        if (packageInfo != null) {
            uuid = String.valueOf(packageInfo.versionCode);
        } else {
            uuid = UUID.randomUUID().toString();
        }
        return new c(uuid);
    }
}
