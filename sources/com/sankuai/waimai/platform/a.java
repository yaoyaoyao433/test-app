package com.sankuai.waimai.platform;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    private static HashMap<String, String> j = new HashMap<>();
    protected String b;
    protected String c;
    protected String d;
    protected String e;
    protected String f;
    protected Boolean g;
    protected boolean h;
    private String i;
    private final AtomicInteger k;
    private final Object l;
    private C1035a m;
    private int n;
    private int o;

    public abstract void c(Context context);

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "816cc20d19fa37036733dd0a0750651f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "816cc20d19fa37036733dd0a0750651f");
            return;
        }
        this.i = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.k = new AtomicInteger();
        this.l = new Object();
        this.h = false;
        this.n = -1;
        this.o = -1;
    }

    public void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a03faf86e9f4779e62ef9c8436d79851", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a03faf86e9f4779e62ef9c8436d79851");
            return;
        }
        b(context);
        c(context);
        if (this.m == null && (context instanceof Application)) {
            this.m = new C1035a();
            ((Application) context).registerActivityLifecycleCallbacks(this.m);
        }
    }

    public void a() {
        this.g = null;
    }

    @SuppressLint({"MissingPermission"})
    public void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "960d717fea57a2c04dc7462b597e552c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "960d717fea57a2c04dc7462b597e552c");
        } else {
            this.b = AppUtil.getDeviceId(context);
        }
    }

    public String b() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac869ee8e98835f6d335a92d68206ef3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac869ee8e98835f6d335a92d68206ef3");
        }
        String str = this.b;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "96d3ae05f5094756b47ea1b4aeeca542", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "96d3ae05f5094756b47ea1b4aeeca542")).booleanValue();
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str.replaceAll(CommonConstant.Symbol.MINUS, "").replaceAll("0", ""))) {
            z = true;
        }
        if (z) {
            b(com.meituan.android.singleton.b.a);
        }
        return this.b;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7482560e6745b9047034a4743dc1640f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7482560e6745b9047034a4743dc1640f");
        }
        if (TextUtils.isEmpty(this.c)) {
            c(com.meituan.android.singleton.b.a);
        }
        return this.c;
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cac976e5af6e12db11993c3ea449b28f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cac976e5af6e12db11993c3ea449b28f");
        } else {
            this.f = UUID.randomUUID().toString();
        }
    }

    public String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3898a9f92257e6cc22530dbbcd9894bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3898a9f92257e6cc22530dbbcd9894bd");
        }
        if (TextUtils.isEmpty(this.f)) {
            e();
        }
        return this.f;
    }

    public String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b04d71f206cddc593b0160cba5b0773b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b04d71f206cddc593b0160cba5b0773b");
        }
        com.sankuai.waimai.foundation.core.common.a a2 = com.sankuai.waimai.foundation.core.common.a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.foundation.core.common.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "03bd5bf50e2127fea54eb432e0e7e9ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "03bd5bf50e2127fea54eb432e0e7e9ef");
        }
        if (TextUtils.isEmpty(a2.j)) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.foundation.core.common.a.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "a2dbb0bbe2cf258fd3b30721aa1d515b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "a2dbb0bbe2cf258fd3b30721aa1d515b");
            } else {
                a2.j = Build.MODEL;
                if (TextUtils.isEmpty(a2.j)) {
                    a2.j = "";
                }
            }
        }
        return a2.j;
    }

    public String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "313959eefbd677fbb91d08079e0f17f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "313959eefbd677fbb91d08079e0f17f4");
        }
        com.sankuai.waimai.foundation.core.common.a a2 = com.sankuai.waimai.foundation.core.common.a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.foundation.core.common.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "5845b97e9fb85660810c2c58966d0818", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "5845b97e9fb85660810c2c58966d0818");
        }
        if (TextUtils.isEmpty(a2.k)) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.foundation.core.common.a.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "47c1cbeb02e321ce931a6e8d797ecb5c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "47c1cbeb02e321ce931a6e8d797ecb5c");
            } else {
                a2.k = Build.VERSION.SDK + CommonConstant.Symbol.UNDERLINE + Build.VERSION.RELEASE;
            }
        }
        return a2.k;
    }

    public String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d9ba65e9ad664ad2ba31ed4b1421889", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d9ba65e9ad664ad2ba31ed4b1421889") : com.sankuai.waimai.foundation.core.common.a.a().e();
    }

    public int j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e60fc1f2c7cbb38e27f5491c4bd323be", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e60fc1f2c7cbb38e27f5491c4bd323be")).intValue() : com.sankuai.waimai.foundation.core.common.a.a().f();
    }

    public String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a0ef68cb0cf3f87944f14342ddaf08a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a0ef68cb0cf3f87944f14342ddaf08a");
        }
        com.sankuai.waimai.foundation.core.common.a a2 = com.sankuai.waimai.foundation.core.common.a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.foundation.core.common.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "4c42703e5415614c473e5a34e5fa8b6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "4c42703e5415614c473e5a34e5fa8b6a");
        }
        if (TextUtils.isEmpty(a2.n)) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.foundation.core.common.a.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "5dede255de5d310df5bbcae302fed571", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "5dede255de5d310df5bbcae302fed571");
            } else {
                a2.n = com.meituan.android.singleton.b.a.getPackageName();
            }
        }
        return a2.n;
    }

    public int l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1de2b2ae2367e62ff71acbc91030e0ba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1de2b2ae2367e62ff71acbc91030e0ba")).intValue();
        }
        com.sankuai.waimai.foundation.core.common.a a2 = com.sankuai.waimai.foundation.core.common.a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.foundation.core.common.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "598e5d5242041c8cef6ad4c548c2a1a0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "598e5d5242041c8cef6ad4c548c2a1a0")).intValue();
        }
        if (a2.p <= 0) {
            a2.b();
        }
        return a2.p;
    }

    public int m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3005d72d4d154dec3b2b47edefaa2bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3005d72d4d154dec3b2b47edefaa2bb")).intValue();
        }
        com.sankuai.waimai.foundation.core.common.a a2 = com.sankuai.waimai.foundation.core.common.a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.foundation.core.common.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "90939f08c5d7c3ec1791790969f36974", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "90939f08c5d7c3ec1791790969f36974")).intValue();
        }
        if (a2.q <= 0) {
            a2.b();
        }
        return a2.q;
    }

    public float n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab65346df434b31d13a45e3c76f1f3e2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab65346df434b31d13a45e3c76f1f3e2")).floatValue();
        }
        com.sankuai.waimai.foundation.core.common.a a2 = com.sankuai.waimai.foundation.core.common.a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.foundation.core.common.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "3ad7919bb101807250a31aaa41f3130d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "3ad7919bb101807250a31aaa41f3130d")).floatValue();
        }
        if (Float.compare(a2.r, 0.01f) < 0) {
            a2.b();
        }
        return a2.r;
    }

    public String o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60bef2ccaa04abf1139e192a2f8b186f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60bef2ccaa04abf1139e192a2f8b186f") : com.sankuai.waimai.foundation.core.common.a.a().g();
    }

    public int p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5c049744d8950d621846de619730ebe", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5c049744d8950d621846de619730ebe")).intValue() : this.k.getAndIncrement();
    }

    public String q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f80d4b80ea8ac19a68d0d8f8a57be43", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f80d4b80ea8ac19a68d0d8f8a57be43");
        }
        com.sankuai.waimai.foundation.core.common.a.a();
        return com.sankuai.waimai.foundation.core.common.a.h();
    }

    public String r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3a7d5379410fb41f084a5c93ce9ccf4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3a7d5379410fb41f084a5c93ce9ccf4");
        }
        com.sankuai.waimai.foundation.core.common.a.a();
        return com.sankuai.waimai.foundation.core.common.a.i();
    }

    private static void A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68c4dce99a0feb8b2a8b2da80f657749", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68c4dce99a0feb8b2a8b2da80f657749");
        } else if (j == null) {
            j = new HashMap<>();
        }
    }

    public void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f861c8d7b1265895ba789743c12c5d21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f861c8d7b1265895ba789743c12c5d21");
            return;
        }
        synchronized (this.l) {
            if (j != null) {
                j.clear();
            }
        }
    }

    public void a(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d49ad753ab66c879cadf050c899fe3a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d49ad753ab66c879cadf050c899fe3a3");
        } else if (map != null) {
            A();
            synchronized (this.l) {
                j.putAll(map);
            }
        }
    }

    public void b(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f637717d9bc907227bd8999856505456", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f637717d9bc907227bd8999856505456");
        } else if (map != null) {
            A();
            synchronized (this.l) {
                map.putAll(j);
            }
        }
    }

    public void a(String str) {
        this.i = str;
    }

    public String t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fbdcdc456394c222c2dbd4adca95314", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fbdcdc456394c222c2dbd4adca95314") : TextUtils.isEmpty(this.i) ? "0" : this.i;
    }

    public String u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07bebb9e49dc8e4a261b167dcc43fbf6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07bebb9e49dc8e4a261b167dcc43fbf6");
        }
        com.sankuai.waimai.foundation.core.common.a.a();
        return com.sankuai.waimai.foundation.core.common.a.k();
    }

    public String v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2f6ce7b673933426c96ac1c1bab8b63", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2f6ce7b673933426c96ac1c1bab8b63");
        }
        com.sankuai.waimai.foundation.core.common.a.a();
        return com.sankuai.waimai.foundation.core.common.a.l();
    }

    public String w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a9df4d3ab5154dbc64f875d8d222ef6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a9df4d3ab5154dbc64f875d8d222ef6") : com.sankuai.waimai.foundation.core.common.a.a().m();
    }

    public static boolean d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5988df7045d30dff6d0ffa978b74be8b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5988df7045d30dff6d0ffa978b74be8b")).booleanValue();
        }
        com.sankuai.waimai.foundation.core.common.a.a();
        return com.sankuai.waimai.foundation.core.common.a.a(context);
    }

    public boolean x() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C1035a extends com.sankuai.waimai.platform.utils.lifecycle.a {
        public static ChangeQuickRedirect a;

        private C1035a() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e1e7ae5c6e324d4ec4059cff318e157", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e1e7ae5c6e324d4ec4059cff318e157");
            }
        }

        @Override // com.sankuai.waimai.platform.utils.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "961b257991610060b509b1c4cd40c535", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "961b257991610060b509b1c4cd40c535");
                return;
            }
            super.onActivityResumed(activity);
            a.this.a();
        }
    }

    public int y() {
        return this.n;
    }

    public void a(int i) {
        this.n = i;
    }

    public int z() {
        return this.o;
    }

    public void b(int i) {
        this.o = i;
    }
}
