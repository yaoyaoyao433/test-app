package com.sankuai.waimai.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.dianping.base.push.pushservice.f;
import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.android.walle.d;
import com.meituan.android.walle.e;
import com.meituan.android.walle.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.platform.settings.PersonalizedSetting;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.platform.a {
    public static ChangeQuickRedirect i;
    private static final byte[] r = new byte[0];
    public boolean j;
    public int k;
    public boolean l;
    public List<InterfaceC1037b> m;
    private String n;
    private String o;
    private String p;
    private String q;
    private com.sankuai.waimai.platform.fingerprint.a s;
    @Nullable
    private Runnable t;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1037b {
        void a();
    }

    public static String H() {
        return "AwaimaiBwaimai";
    }

    public static /* synthetic */ String K() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5eda644c9c5fff8fc08652b2ed7cfdd9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5eda644c9c5fff8fc08652b2ed7cfdd9");
        }
        String str = Build.VERSION.RELEASE.length() > 0 ? Build.VERSION.RELEASE : "1.0";
        String str2 = Build.MODEL;
        String str3 = Build.ID;
        return "Mozilla/5.0 (Linux; Android " + str + "; " + str2 + " Build/" + str3 + "; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/55.0.2883.91 Mobile Safari/537.36";
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ void a(int i2) {
        super.a(i2);
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ void a(String str) {
        super.a(str);
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ void a(Map map) {
        super.a(map);
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ String b() {
        return super.b();
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ void b(int i2) {
        super.b(i2);
    }

    @Override // com.sankuai.waimai.platform.a
    @SuppressLint({"MissingPermission"})
    public final /* bridge */ /* synthetic */ void b(Context context) {
        super.b(context);
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ void b(Map map) {
        super.b(map);
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ String d() {
        return super.d();
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ String f() {
        return super.f();
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ String g() {
        return super.g();
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ String h() {
        return super.h();
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ String i() {
        return super.i();
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ int j() {
        return super.j();
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ String k() {
        return super.k();
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ int l() {
        return super.l();
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ int m() {
        return super.m();
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ float n() {
        return super.n();
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ String o() {
        return super.o();
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ int p() {
        return super.p();
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ String q() {
        return super.q();
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ String r() {
        return super.r();
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ void s() {
        super.s();
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ String t() {
        return super.t();
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ String u() {
        return super.u();
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ String v() {
        return super.v();
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ String w() {
        return super.w();
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ boolean x() {
        return super.x();
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ int y() {
        return super.y();
    }

    @Override // com.sankuai.waimai.platform.a
    public final /* bridge */ /* synthetic */ int z() {
        return super.z();
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea469ed316fa1020b6d3fa92d88ce60e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea469ed316fa1020b6d3fa92d88ce60e");
            return;
        }
        this.o = "";
        this.s = new com.sankuai.waimai.platform.fingerprint.a();
        this.t = new Runnable() { // from class: com.sankuai.waimai.platform.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38627c293a5455c63f9e26baa4742654", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38627c293a5455c63f9e26baa4742654");
                    return;
                }
                try {
                    if (com.sankuai.waimai.platform.utils.sharedpreference.a.e()) {
                        b.this.o = b.K();
                    } else {
                        b.this.o = WebSettings.getDefaultUserAgent(com.meituan.android.singleton.b.a.getApplicationContext());
                    }
                    com.sankuai.waimai.platform.utils.sharedpreference.a.a(b.this.o);
                } catch (Exception unused) {
                    b.this.o = "";
                }
            }
        };
    }

    public static b A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dbcae13589a607f9ecee774afa615c1e", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dbcae13589a607f9ecee774afa615c1e") : a.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        private static final b a = new b();
    }

    @Override // com.sankuai.waimai.platform.a
    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2be192328a1ee26af2b58879b6afae16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2be192328a1ee26af2b58879b6afae16");
            return;
        }
        super.a(context);
        this.h = true;
    }

    public final void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc421838565cfecbef377acfd87a2ab3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc421838565cfecbef377acfd87a2ab3");
            return;
        }
        this.d = str;
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "a_uuid", str);
        com.sankuai.waimai.foundation.core.common.a.a().a(str);
    }

    @Override // com.sankuai.waimai.platform.a
    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea5ee3b3cc11d039215fc1c1209a978e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea5ee3b3cc11d039215fc1c1209a978e");
        }
        if (TextUtils.isEmpty(this.d)) {
            this.d = com.sankuai.waimai.kit.uuid.b.a(com.meituan.android.singleton.b.a);
        }
        return this.d;
    }

    public final String B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c840c266f977b1fc41f1e11224a8184", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c840c266f977b1fc41f1e11224a8184");
        }
        if (TextUtils.isEmpty(this.p) || "0".equals(this.p)) {
            L();
        }
        return this.p;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0710f5da78bd675b37dba59e299ef395", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0710f5da78bd675b37dba59e299ef395");
            return;
        }
        this.p = "";
        if (j >= 0) {
            this.p = String.valueOf(j);
        }
    }

    private void L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ae0fc6cf8ad989ad8ba36a14803e735", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ae0fc6cf8ad989ad8ba36a14803e735");
            return;
        }
        this.p = String.valueOf(com.sankuai.waimai.platform.domain.manager.user.a.i().d());
        com.dianping.mainboard.a.b().a(com.sankuai.waimai.platform.domain.manager.user.a.i().d());
    }

    @Override // com.sankuai.waimai.platform.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "283782e81c23daa58579901fe9f84336", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "283782e81c23daa58579901fe9f84336");
            return;
        }
        super.e();
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "visit_id", this.f);
    }

    public final void C() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58ec066a5d027db29a833ae827503904", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58ec066a5d027db29a833ae827503904");
            return;
        }
        this.j = true;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = i;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "764292a8b9e54ea5d9395e43f1dfb697", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "764292a8b9e54ea5d9395e43f1dfb697")).booleanValue();
        } else {
            if (System.currentTimeMillis() - com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, "visit_id_generated_time", 0L) > 1800000) {
                z = true;
            }
        }
        if (z) {
            e();
            return;
        }
        this.f = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, "visit_id", "");
        if (TextUtils.isEmpty(this.f)) {
            return;
        }
        e();
    }

    public final String D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "360acd6b93e30f46be66aef51974611b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "360acd6b93e30f46be66aef51974611b");
        }
        if (TextUtils.isEmpty(this.e)) {
            synchronized (r) {
                if (TextUtils.isEmpty(this.e)) {
                    e(com.meituan.android.singleton.b.a);
                }
            }
        }
        this.n = "com.dianping.dpmtpush.RECEIVE_PASS_THROUGH_MESSAGE";
        return this.e;
    }

    public final void e(Context context) {
        String str;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a2f9bb38e3b79ff96d1f0847741fae6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a2f9bb38e3b79ff96d1f0847741fae6");
            return;
        }
        try {
            str = f.d(context);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            str = "";
        }
        this.e = str;
        com.dianping.mainboard.a.b().a(str);
    }

    public final String E() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c38fbeb0bbab854100d63d416bd3b002", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c38fbeb0bbab854100d63d416bd3b002") : com.sankuai.waimai.kit.fingerPrint.a.a().b.fingerprint();
    }

    public final String F() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fed4eea920d33100aa7149f87870db5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fed4eea920d33100aa7149f87870db5") : MTGuard.deviceFingerprintData(this.s);
    }

    public final String G() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d00fd345355ce65f1cb803f6658c36a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d00fd345355ce65f1cb803f6658c36a7");
        }
        if (TextUtils.isEmpty(this.q)) {
            this.q = k.a(com.meituan.android.singleton.b.a, "wmhash");
        }
        return this.q;
    }

    public final int I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b679dc3ee68e1b1870995d730b99e3d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b679dc3ee68e1b1870995d730b99e3d")).intValue();
        }
        PersonalizedSetting a2 = PersonalizedSetting.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = PersonalizedSetting.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "4db9ba1313e6e989f75df4759f54c9b0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "4db9ba1313e6e989f75df4759f54c9b0")).intValue();
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = PersonalizedSetting.a;
        boolean booleanValue = PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "735c8016314e9c70f0d371444153be79", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "735c8016314e9c70f0d371444153be79")).booleanValue() : com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, "waimai_key_personlized_data_cleared", false);
        return a2.b() ? booleanValue ? 3 : 1 : booleanValue ? 4 : 2;
    }

    public final String J() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf19c1cacc827ab3dfc8e948cb6bb060", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf19c1cacc827ab3dfc8e948cb6bb060");
        }
        if (TextUtils.isEmpty(this.o)) {
            this.o = com.sankuai.waimai.platform.utils.sharedpreference.a.d();
            if (this.t != null) {
                ad.a(this.t, 30000L);
                this.t = null;
            }
        }
        return this.o;
    }

    public final void a(InterfaceC1037b interfaceC1037b) {
        Object[] objArr = {interfaceC1037b};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dd0cc5e541b2dc5e5c9cc4be604f342", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dd0cc5e541b2dc5e5c9cc4be604f342");
        } else if (!TextUtils.isEmpty(c())) {
            interfaceC1037b.a();
        } else {
            if (this.m == null) {
                this.m = new ArrayList();
            }
            this.m.add(interfaceC1037b);
        }
    }

    @Override // com.sankuai.waimai.platform.a
    public final void c(Context context) {
        d dVar;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69ed589769b521f2321c36c1d6f67326", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69ed589769b521f2321c36c1d6f67326");
            return;
        }
        Context context2 = com.meituan.android.singleton.b.a;
        Object[] objArr2 = {context2};
        ChangeQuickRedirect changeQuickRedirect2 = k.a;
        String str = null;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "afa44c722d207ed7573cfb9486dc94ef", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "afa44c722d207ed7573cfb9486dc94ef");
        } else {
            Object[] objArr3 = {context2};
            ChangeQuickRedirect changeQuickRedirect3 = k.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "6bc4e9404e7c5ada575ee383e19222e2", RobustBitConfig.DEFAULT_VALUE)) {
                dVar = (d) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "6bc4e9404e7c5ada575ee383e19222e2");
            } else {
                String a2 = k.a(context2);
                if (!TextUtils.isEmpty(a2)) {
                    File file = new File(a2);
                    Object[] objArr4 = {file};
                    ChangeQuickRedirect changeQuickRedirect4 = e.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "07d6dd96ef9e5301498571e38a104326", RobustBitConfig.DEFAULT_VALUE)) {
                        dVar = (d) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "07d6dd96ef9e5301498571e38a104326");
                    } else {
                        Map<String, String> a3 = e.a(file);
                        if (a3 != null) {
                            a3.remove("channel");
                            dVar = new d(a3.get("channel"), a3);
                        }
                    }
                }
                dVar = null;
            }
            if (dVar != null) {
                str = dVar.b;
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "8";
        } else {
            try {
                Integer.parseInt(str);
            } catch (Exception unused) {
                str = "2";
            }
        }
        this.c = str;
        com.sankuai.waimai.foundation.core.common.a.a().b(str);
    }
}
