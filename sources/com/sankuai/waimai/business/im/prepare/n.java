package com.sankuai.waimai.business.im.prepare;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class n implements m {
    public static ChangeQuickRedirect a;
    private static final a e = new a();
    public m b;
    public int c;
    public boolean d;

    @Override // com.sankuai.waimai.business.im.prepare.m
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04c7f89436ae7c1e382f23c36e6541dc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04c7f89436ae7c1e382f23c36e6541dc")).booleanValue() : a("hasInsertPoiImTip").a();
    }

    @Override // com.sankuai.waimai.business.im.prepare.m
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a68303dd743eaa2dafb1919e5c6f418", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a68303dd743eaa2dafb1919e5c6f418");
        } else {
            a("setHasInsertPoiImTip").a(z);
        }
    }

    public n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33768295262132864b6b07fa7129eb2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33768295262132864b6b07fa7129eb2c");
        } else {
            this.d = true;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        private static final n a = new n();
    }

    public static n b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fdf62621a430dced859296000c7a31a6", RobustBitConfig.DEFAULT_VALUE) ? (n) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fdf62621a430dced859296000c7a31a6") : b.a;
    }

    private m a(String str) {
        if (this.b == null) {
            return e;
        }
        return this.b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements m {
        @Override // com.sankuai.waimai.business.im.prepare.m
        public final void a(boolean z) {
        }

        @Override // com.sankuai.waimai.business.im.prepare.m
        public final boolean a() {
            return false;
        }

        public a() {
        }
    }
}
