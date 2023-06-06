package com.sankuai.meituan.mtlive.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j {
    public static ChangeQuickRedirect a;
    f b;
    boolean c;

    public j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deb033b86855f386da141df538c9ba5f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deb033b86855f386da141df538c9ba5f");
        } else {
            this.c = false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        j b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bdad1ff96293dd68198fbedf95c3128", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bdad1ff96293dd68198fbedf95c3128");
            } else {
                this.b = new j();
            }
        }

        public final a a(f fVar) {
            Object[] objArr = {fVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58bc7f866a3d803b5e8a9d02aa0dd16e", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58bc7f866a3d803b5e8a9d02aa0dd16e");
            }
            this.b.b = fVar;
            return this;
        }

        public final a a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c687a5fe906322b008b42118cd59066", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c687a5fe906322b008b42118cd59066");
            }
            this.b.c = z;
            return this;
        }

        public final j a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e36ff42cb4120c5033b2ca3827eb240a", RobustBitConfig.DEFAULT_VALUE)) {
                return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e36ff42cb4120c5033b2ca3827eb240a");
            }
            if (this.b.b != null) {
                com.sankuai.meituan.mtliveqos.b.a(new com.sankuai.meituan.mtliveqos.common.b() { // from class: com.sankuai.meituan.mtlive.core.j.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtliveqos.common.b
                    public final String a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59b5137e7ff221d4af9fa0ed0dd85a70", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59b5137e7ff221d4af9fa0ed0dd85a70") : a.this.b.b.a();
                    }

                    @Override // com.sankuai.meituan.mtliveqos.common.b
                    public final String b() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "156243bf38d818f91b474f69af597ea3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "156243bf38d818f91b474f69af597ea3") : a.this.b.b.b();
                    }

                    @Override // com.sankuai.meituan.mtliveqos.common.b
                    public final int c() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc764e37c9e105416bb2928bae6397b8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc764e37c9e105416bb2928bae6397b8")).intValue() : a.this.b.b.c();
                    }

                    @Override // com.sankuai.meituan.mtliveqos.common.b
                    public final String d() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86b3c5262bc021ee966123d7138f61a4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86b3c5262bc021ee966123d7138f61a4") : a.this.b.b.d();
                    }

                    @Override // com.sankuai.meituan.mtliveqos.common.b
                    public final boolean e() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "df68d333ae0d0d3fb1455b473c67eb56", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "df68d333ae0d0d3fb1455b473c67eb56")).booleanValue() : a.this.b.c;
                    }
                });
            }
            return this.b;
        }
    }
}
