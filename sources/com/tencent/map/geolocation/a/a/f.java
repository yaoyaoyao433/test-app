package com.tencent.map.geolocation.a.a;

import android.content.Context;
import android.os.HandlerThread;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.map.geolocation.a.a.e;
import dalvik.system.DexClassLoader;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class f {
    private static DexClassLoader a;
    private static Context b;
    private static volatile f c;

    private f(Context context) {
        b = context.getApplicationContext();
        com.tencent.map.geolocation.a.b.d a2 = com.tencent.map.geolocation.a.b.d.a(context);
        if (!a2.c) {
            a2.a = Thread.getDefaultUncaughtExceptionHandler();
            Object[] objArr = {com.tencent.map.geolocation.a.b.d.b};
            ChangeQuickRedirect changeQuickRedirect = com.sankuai.waimai.launcher.util.aop.c.a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9cd936bd40de2c64861fc5b44c6123d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9cd936bd40de2c64861fc5b44c6123d");
            } else {
                com.sankuai.waimai.foundation.utils.log.a.e("com.tencent.map.geolocation", "屏蔽腾讯定位SDK内部setDefaultUncaughtExceptionHandler方法", new Object[0]);
            }
            a2.c = true;
        }
        e a3 = e.a(context);
        if (a3.c) {
            return;
        }
        a3.a = new HandlerThread("d_thread");
        a3.a.start();
        a3.b = new e.a(a3.a.getLooper());
        a3.c = true;
        com.tencent.map.geolocation.a.b.e.a(a3.b, 10002, 0L);
        com.tencent.map.geolocation.a.b.e.a(a3.b, 10004, (long) LocationStrategy.LOCATION_TIMEOUT);
    }

    public static f a(Context context) {
        if (c == null) {
            synchronized (f.class) {
                if (c == null) {
                    c = new f(context);
                }
            }
        }
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0125 A[Catch: all -> 0x01ac, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x0009, B:13:0x0010, B:15:0x003a, B:16:0x003d, B:18:0x0050, B:19:0x0053, B:21:0x0089, B:23:0x0094, B:24:0x00a2, B:25:0x00de, B:27:0x00f3, B:28:0x00fa, B:30:0x0105, B:33:0x010e, B:42:0x0125, B:43:0x012a, B:45:0x0138, B:47:0x014d, B:48:0x015a, B:50:0x0170, B:52:0x017a, B:56:0x01a8, B:53:0x017f), top: B:62:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0138 A[Catch: all -> 0x01ac, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x0009, B:13:0x0010, B:15:0x003a, B:16:0x003d, B:18:0x0050, B:19:0x0053, B:21:0x0089, B:23:0x0094, B:24:0x00a2, B:25:0x00de, B:27:0x00f3, B:28:0x00fa, B:30:0x0105, B:33:0x010e, B:42:0x0125, B:43:0x012a, B:45:0x0138, B:47:0x014d, B:48:0x015a, B:50:0x0170, B:52:0x017a, B:56:0x01a8, B:53:0x017f), top: B:62:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0170 A[Catch: all -> 0x01ac, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x0009, B:13:0x0010, B:15:0x003a, B:16:0x003d, B:18:0x0050, B:19:0x0053, B:21:0x0089, B:23:0x0094, B:24:0x00a2, B:25:0x00de, B:27:0x00f3, B:28:0x00fa, B:30:0x0105, B:33:0x010e, B:42:0x0125, B:43:0x012a, B:45:0x0138, B:47:0x014d, B:48:0x015a, B:50:0x0170, B:52:0x017a, B:56:0x01a8, B:53:0x017f), top: B:62:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized dalvik.system.DexClassLoader a() {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.map.geolocation.a.a.f.a():dalvik.system.DexClassLoader");
    }
}
