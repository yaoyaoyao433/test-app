package com.sankuai.waimai.imbase.user;

import com.meituan.metrics.Metrics;
import com.meituan.metrics.lifecycle.MetricsActivityLifecycleManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.imbase.user.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a implements b {
    public static ChangeQuickRedirect a;
    private static a e;
    private static final b f = new C0966a();
    public b b;
    public int c;
    public boolean d;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39966109740d286281d3e36e725290ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39966109740d286281d3e36e725290ce");
        } else {
            this.d = true;
        }
    }

    public static a e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "456c615ef681f63d0a3460569ae4064f", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "456c615ef681f63d0a3460569ae4064f");
        }
        if (e == null) {
            synchronized (a.class) {
                if (e == null) {
                    e = new a();
                }
            }
        }
        return e;
    }

    private b a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d88421df1e022373b6aa3d72b204e9e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d88421df1e022373b6aa3d72b204e9e9");
        }
        if (this.b == null) {
            Metrics.storeCrash(new IllegalStateException("You must call IMWMUserManager#setHandler before calling " + str + "!!(call count=" + this.c + " isNull=" + this.d + CommonConstant.Symbol.BRACKET_RIGHT), 1, MetricsActivityLifecycleManager.currentActivity, false);
            return f;
        }
        return this.b;
    }

    @Override // com.sankuai.waimai.imbase.user.b
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88227f7f15f5a9efebd535b0abe3cd22", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88227f7f15f5a9efebd535b0abe3cd22")).booleanValue() : a("isLogin").a();
    }

    @Override // com.sankuai.waimai.imbase.user.b
    public final long b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1408d682910d52c69730b5d816fbe0cf", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1408d682910d52c69730b5d816fbe0cf")).longValue() : a("getUserId").b();
    }

    @Override // com.sankuai.waimai.imbase.user.b
    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba9108c8e43fdaa91736f292e9e4b599", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba9108c8e43fdaa91736f292e9e4b599") : a("getToken").c();
    }

    @Override // com.sankuai.waimai.imbase.user.b
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c9e43de5975d2e70447c957e5ceceef", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c9e43de5975d2e70447c957e5ceceef") : a("getUserName").d();
    }

    @Override // com.sankuai.waimai.imbase.user.b
    public final void a(b.InterfaceC0967b interfaceC0967b) {
        Object[] objArr = {interfaceC0967b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "576130063cb844bdb22ee1bbaa2f26ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "576130063cb844bdb22ee1bbaa2f26ab");
        } else {
            a("setOnLoginChangeCallback").a(interfaceC0967b);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.imbase.user.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0966a implements b {
        @Override // com.sankuai.waimai.imbase.user.b
        public final void a(b.InterfaceC0967b interfaceC0967b) {
        }

        @Override // com.sankuai.waimai.imbase.user.b
        public final boolean a() {
            return false;
        }

        @Override // com.sankuai.waimai.imbase.user.b
        public final long b() {
            return -1L;
        }

        @Override // com.sankuai.waimai.imbase.user.b
        public final String c() {
            return "";
        }

        @Override // com.sankuai.waimai.imbase.user.b
        public final String d() {
            return "";
        }

        public C0966a() {
        }
    }
}
