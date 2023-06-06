package com.dianping.base.push.pushservice.util;

import android.content.Context;
import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i {
    public static ChangeQuickRedirect a;
    private static final ThreadLocal<SimpleDateFormat> b = new ThreadLocal<SimpleDateFormat>() { // from class: com.dianping.base.push.pushservice.util.i.1
        public static ChangeQuickRedirect a;

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ SimpleDateFormat initialValue() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8caf88564221dec0889a8df01460bccb", RobustBitConfig.DEFAULT_VALUE) ? (SimpleDateFormat) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8caf88564221dec0889a8df01460bccb") : new SimpleDateFormat("yyyy-MM-dd", Locale.PRC);
        }
    };
    private static final ThreadLocal<SimpleDateFormat> c = new ThreadLocal<SimpleDateFormat>() { // from class: com.dianping.base.push.pushservice.util.i.2
        public static ChangeQuickRedirect a;

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ SimpleDateFormat initialValue() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dbbae2fc735d528df20e87ea0f87425", RobustBitConfig.DEFAULT_VALUE) ? (SimpleDateFormat) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dbbae2fc735d528df20e87ea0f87425") : new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.PRC);
        }
    };

    public static String a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8790bb01c867cd9d00063483fcd26076", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8790bb01c867cd9d00063483fcd26076") : b.get().format(new Date(j));
    }

    public static long a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6022fa84c13157bd5f873f9b7eb2d48a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6022fa84c13157bd5f873f9b7eb2d48a")).longValue();
        }
        try {
            return b.get().parse(str).getTime();
        } catch (Exception e) {
            com.dianping.base.push.pushservice.c.d("TimeUtils", e.toString());
            return 0L;
        }
    }

    public static synchronized void a(Context context, long j) {
        synchronized (i.class) {
            Object[] objArr = {context, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "43ad402e594af3d8d5578c1835acd00c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "43ad402e594af3d8d5578c1835acd00c");
            } else if (context == null || j <= 0) {
                b(context);
            } else {
                try {
                    com.dianping.base.push.pushservice.e.a(context).b("localTimeElapse", SystemClock.elapsedRealtime());
                    com.dianping.base.push.pushservice.e.a(context).b("serverTimeMillis", j);
                } catch (Exception e) {
                    com.dianping.base.push.pushservice.c.d("TimeUtils", e.toString());
                }
            }
        }
    }

    public static synchronized long a(Context context) {
        long j;
        long j2;
        synchronized (i.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c94eed6076dba1cf1b8f3b26a335e563", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c94eed6076dba1cf1b8f3b26a335e563")).longValue();
            }
            try {
                j = com.dianping.base.push.pushservice.e.a(context).a("localTimeElapse", 0L);
            } catch (Exception e) {
                com.dianping.base.push.pushservice.c.d("TimeUtils", e.toString());
                j = 0;
            }
            try {
                j2 = com.dianping.base.push.pushservice.e.a(context).a("serverTimeMillis", 0L);
            } catch (Exception e2) {
                com.dianping.base.push.pushservice.c.d("TimeUtils", e2.toString());
                j2 = 0;
            }
            if (j > 0 && j2 > 0 && SystemClock.elapsedRealtime() >= j) {
                return j2 + (SystemClock.elapsedRealtime() - j);
            }
            return System.currentTimeMillis();
        }
    }

    public static synchronized void b(Context context) {
        synchronized (i.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53a01dd8ce7e1f12cb2b8f88b7c5ca1f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53a01dd8ce7e1f12cb2b8f88b7c5ca1f");
            } else if (context == null) {
            } else {
                try {
                    com.dianping.base.push.pushservice.e.a(context).b("localTimeElapse", 0L);
                    com.dianping.base.push.pushservice.e.a(context).b("serverTimeMillis", 0L);
                } catch (Exception e) {
                    com.dianping.base.push.pushservice.c.d("TimeUtils", e.toString());
                }
            }
        }
    }
}
