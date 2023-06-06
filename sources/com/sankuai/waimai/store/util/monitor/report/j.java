package com.sankuai.waimai.store.util.monitor.report;

import android.text.TextUtils;
import android.util.Log;
import com.dianping.monitor.impl.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.b;
import java.util.Collections;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class j extends f {
    public static ChangeQuickRedirect d = null;
    private static final String e = "j";

    @Override // com.sankuai.waimai.store.util.monitor.report.f
    public final m a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c3e4f259a72bde2624121c85f660fd8", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c3e4f259a72bde2624121c85f660fd8");
        }
        if (this.c == null) {
            synchronized (j.class) {
                if (this.c == null) {
                    this.c = new m(b(z), com.sankuai.waimai.store.util.b.a(), com.dianping.codelog.b.a() == null ? "" : com.dianping.codelog.b.a().b());
                }
            }
        }
        a(this.c);
        return this.c;
    }

    public final void a(b.C1331b c1331b) {
        Object[] objArr = {c1331b};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3bfeda98b36574067b9bc0780444adb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3bfeda98b36574067b9bc0780444adb");
        } else if (c1331b == null || c1331b.a == null) {
            Log.e(e, "======  监控上报类为null  ======== ");
        } else {
            String a = a(c1331b.a);
            String b = b(c1331b.a);
            boolean c = c(c1331b.a);
            g.a().a(c1331b.d ? 1001 : 1002, a);
            a(c, a, b, c1331b);
            if (c1331b.d) {
                if (TextUtils.isEmpty(c1331b.b)) {
                    return;
                }
                a(1001, c1331b.a, c1331b.b, c1331b.c);
                return;
            }
            a(1002, c1331b.a, c1331b.b, c1331b.c);
        }
    }

    private void a(boolean z, String str, String str2, b.C1331b c1331b) {
        m a;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, str2, c1331b};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5a65d7c23b30dff84015cd433530958", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5a65d7c23b30dff84015cd433530958");
        } else if (c1331b != null && (a = a(z)) != null) {
            a.a(str, Collections.singletonList(Float.valueOf(c1331b.d ? 1.0f : 0.0f)));
            a.a("code", c1331b.d ? "1000" : "2000");
            if (!TextUtils.isEmpty(str2)) {
                a.a("error_type", str2);
            }
            if (!TextUtils.isEmpty(c1331b.c)) {
                a.a("description", c1331b.c);
            }
            if (!TextUtils.isEmpty(c1331b.e)) {
                a.a("source_vc", c1331b.e);
            }
            if (c1331b.f != null && c1331b.f.size() > 0) {
                for (String str3 : c1331b.f.keySet()) {
                    if (!TextUtils.isEmpty(str3)) {
                        a.a(str3, c1331b.f.get(str3));
                    }
                }
            }
            a.a();
        }
    }
}
