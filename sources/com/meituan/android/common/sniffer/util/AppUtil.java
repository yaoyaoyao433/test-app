package com.meituan.android.common.sniffer.util;

import android.content.Context;
import android.support.annotation.AnyThread;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AppUtil {
    private static List<String> sGrantedPermission = new CopyOnWriteArrayList();
    private static Set<String> sRequestedPermission = null;

    @AnyThread
    public static List<String> getPermissions(Context context) {
        if (sRequestedPermission == null) {
            synchronized (AppUtil.class) {
                if (sRequestedPermission == null) {
                    try {
                        sRequestedPermission = new CopyOnWriteArraySet(Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions));
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (sRequestedPermission == null || sRequestedPermission.isEmpty()) {
            return sGrantedPermission;
        }
        for (String str : sRequestedPermission) {
            if (TextUtils.isEmpty(str) || sGrantedPermission.contains(str)) {
                sRequestedPermission.remove(str);
            } else if (!str.startsWith("android.permission")) {
                sRequestedPermission.remove(str);
            } else if (ContextCompat.checkSelfPermission(context, str) == 0) {
                synchronized (AppUtil.class) {
                    if (!sGrantedPermission.contains(str)) {
                        sGrantedPermission.add(str);
                    }
                }
                sRequestedPermission.remove(str);
            } else {
                continue;
            }
        }
        return sGrantedPermission;
    }
}
