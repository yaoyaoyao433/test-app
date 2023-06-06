package com.dianping.imagemanager.utils.downloadphoto;

import com.dianping.imagemanager.utils.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f extends com.dianping.imagemanager.utils.downloadphoto.a {
    public static ChangeQuickRedirect q;
    public int r;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public final f b;

        public a(String str) {
            this(new j(str));
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ae00e5e3e44c32f48a8a9ff14ab00c8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ae00e5e3e44c32f48a8a9ff14ab00c8");
            }
        }

        public a(j jVar) {
            Object[] objArr = {jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7f7e533017724173758476db3d1d1a3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7f7e533017724173758476db3d1d1a3");
                return;
            }
            this.b = new f(jVar);
            this.b.p = -433;
        }

        public final a a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c13943c3eb9db82c472e9ef84c833a4", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c13943c3eb9db82c472e9ef84c833a4");
            }
            this.b.r = i;
            return this;
        }

        public final a b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b38ae116b59777bc982a3dad63497a6f", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b38ae116b59777bc982a3dad63497a6f");
            }
            this.b.b(i);
            return this;
        }

        public final a c(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc4ee74036fc6f228a7be1179f9e8d69", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc4ee74036fc6f228a7be1179f9e8d69");
            }
            this.b.a(i);
            return this;
        }

        public final a d(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4ceee878df670799669ee39098ebc0b", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4ceee878df670799669ee39098ebc0b");
            }
            this.b.c(i);
            return this;
        }

        public final a a(com.dianping.imagemanager.utils.h hVar) {
            Object[] objArr = {hVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb29ff85ba992db61f77a21670c62662", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb29ff85ba992db61f77a21670c62662");
            }
            this.b.a(hVar);
            return this;
        }

        public final a e(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaa654c831d8316a8ac40e0ac34161eb", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaa654c831d8316a8ac40e0ac34161eb");
            }
            this.b.p = i;
            return this;
        }
    }

    private f(j jVar) {
        super(jVar);
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18d0c096a87b4f3fbee3344e3d719a59", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18d0c096a87b4f3fbee3344e3d719a59");
        }
    }

    @Override // com.dianping.imagemanager.utils.downloadphoto.a
    public final void k() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b832d20115c32fef706e5719477e60f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b832d20115c32fef706e5719477e60f");
            return;
        }
        if (this.c == null) {
            str = g();
        } else {
            str = g() + CommonConstant.Symbol.UNDERLINE + this.c.a();
        }
        this.h = str;
    }

    @Override // com.dianping.imagemanager.utils.downloadphoto.a
    public final void l() {
        this.i = null;
    }

    @Override // com.dianping.imagemanager.utils.downloadphoto.a
    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2776ea8cdfc2514e0a12d004dccdad19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2776ea8cdfc2514e0a12d004dccdad19");
            return;
        }
        this.g = g() + CommonConstant.Symbol.UNDERLINE + this.j + CommonConstant.Symbol.UNDERLINE + q();
    }
}
