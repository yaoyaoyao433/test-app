package com.meituan.android.paybase.metrics;

import android.text.TextUtils;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static volatile a b;
    private final HashMap<String, b> c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "343533b49a82c31c68cb067f8a4b17e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "343533b49a82c31c68cb067f8a4b17e5");
        } else {
            this.c = new HashMap<>();
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "942c297d434b070629a73facfa496a53", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "942c297d434b070629a73facfa496a53");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    private b c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb34d8944d4503e7a09a27887a57517c", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb34d8944d4503e7a09a27887a57517c") : this.c.get(str);
    }

    public final b a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4307300568ffe9bf5026d881df9d1eec", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4307300568ffe9bf5026d881df9d1eec") : this.c.remove(str);
    }

    private b a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59dd752185bbec96618dc9e62762f5a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59dd752185bbec96618dc9e62762f5a3");
        }
        if (i == 1) {
            return new b(MetricsSpeedMeterTask.createPageSpeedMeterTask(str));
        }
        if (i == 2) {
            return new b(MetricsSpeedMeterTask.createCustomSpeedMeterTask(str));
        }
        return new b(MetricsSpeedMeterTask.createCustomSpeedMeterTask(str));
    }

    public static void a(String str, String str2) {
        b bVar;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58ab8abaf57ba6c2e61c82782edd5703", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58ab8abaf57ba6c2e61c82782edd5703");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            a a2 = a();
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "2387b8ec1f0a465d986642614f80089c", RobustBitConfig.DEFAULT_VALUE)) {
                bVar = (b) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "2387b8ec1f0a465d986642614f80089c");
            } else {
                b bVar2 = a2.c.get(str);
                if (bVar2 == null) {
                    bVar2 = a2.a(str, 1);
                    a2.c.put(str, bVar2);
                }
                bVar = bVar2;
            }
            bVar.a(str2);
        }
    }

    public static void b(String str, String str2) {
        b bVar;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb85b3921958d9dadd1fca1bb3ad9c7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb85b3921958d9dadd1fca1bb3ad9c7f");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            a a2 = a();
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "5daa1fd6a127d73cd55d6440b39bedf4", RobustBitConfig.DEFAULT_VALUE)) {
                bVar = (b) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "5daa1fd6a127d73cd55d6440b39bedf4");
            } else {
                b bVar2 = a2.c.get(str);
                if (bVar2 == null) {
                    b a3 = a2.a(str, 2);
                    a2.c.put(str, a3);
                    bVar = a3;
                } else {
                    bVar = bVar2;
                }
            }
            bVar.a(str2);
        }
    }

    public static void c(String str, String str2) {
        b c;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d9ccf2ef1d5596ec9cae59d2dd4fcfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d9ccf2ef1d5596ec9cae59d2dd4fcfb");
        } else if (TextUtils.isEmpty(str) || (c = a().c(str)) == null) {
        } else {
            c.a(str2);
        }
    }

    public static void b(String str) {
        b c;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2fec42bc3ec897195bb8c372e00ce89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2fec42bc3ec897195bb8c372e00ce89");
        } else if (TextUtils.isEmpty(str) || (c = a().c(str)) == null) {
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, c, changeQuickRedirect2, false, "e9f746e3171f1f3a631c7a40414ed598", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, c, changeQuickRedirect2, false, "e9f746e3171f1f3a631c7a40414ed598");
            } else if (!c.d) {
                c.d = true;
                if (c.b != null) {
                    h.a(c.b);
                    c.c.clear();
                }
            }
            a().a(str);
        }
    }
}
