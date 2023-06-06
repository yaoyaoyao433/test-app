package com.sankuai.waimai.foundation.location;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LocationCatReporter {
    public static ChangeQuickRedirect a;
    private static volatile ScheduledExecutorService h;
    public int b;
    private int c;
    private int d;
    private int e;
    private long f;
    private long g;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface LocationAvoidFailed {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface LocationUsability {
    }

    public LocationCatReporter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffcbca7d1fd19550459e8db946344d4b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffcbca7d1fd19550459e8db946344d4b");
            return;
        }
        this.c = 15;
        this.d = 15;
        this.e = 15;
        this.b = 0;
        this.f = 0L;
        this.g = 0L;
    }

    public static /* synthetic */ void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c05e22c90545e58b2accc924206f377", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c05e22c90545e58b2accc924206f377");
            return;
        }
        try {
            int isunsafeMemoryDetect = MTGuard.isunsafeMemoryDetect();
            if (MTGuard.issimulatorDetect()) {
                isunsafeMemoryDetect |= 32;
            }
            if (isunsafeMemoryDetect > 0) {
                e.c().a(i + isunsafeMemoryDetect, 100, "waimai_location_usability_unsafe");
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }

    private static ScheduledExecutorService c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "26582f7ddefc3e67eb347918d05b6314", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScheduledExecutorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "26582f7ddefc3e67eb347918d05b6314");
        }
        if (h == null) {
            synchronized (LocationCatReporter.class) {
                if (h == null) {
                    h = com.sankuai.android.jarvis.c.c("wmLocation-reportLocationUnsafe");
                }
            }
        }
        return h;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47ab196b064c30e2c830837bad312dc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47ab196b064c30e2c830837bad312dc8");
            return;
        }
        this.c = i;
        b c = e.c();
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        c.a("LocationCatReporter", "setMtCatCode", Pair.create("code", sb.toString()));
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4ecf3599620aac4dd7727868920a42c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4ecf3599620aac4dd7727868920a42c");
            return;
        }
        this.c = 15;
        this.d = 15;
        this.e = 15;
        this.f = 0L;
        this.g = 0L;
        e.c().a("LocationCatReporter", "resetLocationCodeAndTime");
    }

    public final void b() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c129dbd881eff8601127eb68519f5c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c129dbd881eff8601127eb68519f5c1");
            return;
        }
        this.g = SystemClock.uptimeMillis();
        if (this.b == 7) {
            i = (this.b << 12) + (this.c << 8) + (this.d << 4) + this.e;
        } else {
            i = (this.b << 12) + (this.c << 8) + (this.d << 4);
        }
        e.c().a(i, (int) (this.g - this.f), "waimai_location_result");
        if (!TextUtils.isEmpty(h.h()) && !TextUtils.isEmpty(g.c())) {
            e.c().a(i, (int) (this.g - this.f), "waimai_location_result_" + g.c());
        }
        if (this.c == 0) {
            e.c().a(1000, (int) (this.g - this.f), "waimai_location_auth");
        } else if (this.c == 9 || this.c == 1 || this.c == 10 || this.c == 14) {
        } else {
            e.c().a(4000, (int) (this.g - this.f), "waimai_location_auth");
        }
    }

    public final void a(boolean z, long j) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75caff2683a7084f9fefb7f683c7ac0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75caff2683a7084f9fefb7f683c7ac0e");
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        int i = !z ? this.c + 20100 : 20112;
        int i2 = (int) (uptimeMillis - j);
        e.c().a(i, i2, "waimai_location_mt_sdk");
        if (TextUtils.isEmpty(h.h()) || TextUtils.isEmpty(g.c())) {
            return;
        }
        b c = e.c();
        c.a(i, i2, "waimai_location_mt_sdk_" + g.c());
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df33fcdef0150651c7a5ca29c154aff3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df33fcdef0150651c7a5ca29c154aff3");
            return;
        }
        b c = e.c();
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        c.a("LocationCatReporter", "setStartTime", Pair.create("startTime", sb.toString()));
        this.f = j;
    }

    public static void b(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c959daeed1f1df58611d5414ec150ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c959daeed1f1df58611d5414ec150ce");
            return;
        }
        e.c().a(i, 100, "waimai_location_usability");
        if (e.b()) {
            c().schedule(new Runnable() { // from class: com.sankuai.waimai.foundation.location.LocationCatReporter.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b602004a1fa93bf058687f264efe851d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b602004a1fa93bf058687f264efe851d");
                    } else {
                        LocationCatReporter.d(i);
                    }
                }
            }, 10L, TimeUnit.SECONDS);
        }
    }

    public static void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5af38bd03b2800d13a263522d03e1549", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5af38bd03b2800d13a263522d03e1549");
        } else {
            e.c().a(i, 100, "waimai_location_save");
        }
    }
}
