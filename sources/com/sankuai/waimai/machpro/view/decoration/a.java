package com.sankuai.waimai.machpro.view.decoration;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public float b;
    int c;
    int d;
    int e;
    private b f;

    public a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f82839d22bb055131bda697c6c7e48c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f82839d22bb055131bda697c6c7e48c8");
            return;
        }
        this.c = 1;
        this.d = -16777216;
        this.e = 0;
        this.f = bVar;
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6f7bfd4187f14934650411e54f5daa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6f7bfd4187f14934650411e54f5daa5");
            return;
        }
        this.b = f;
        this.f.c();
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c969b91781dbb8d582ff139259c1ee3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c969b91781dbb8d582ff139259c1ee3c");
            return;
        }
        this.d = i;
        this.f.b();
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5666f5fc0be3e6e1f73d8af3db3b558f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5666f5fc0be3e6e1f73d8af3db3b558f");
            return;
        }
        this.c = i;
        this.f.b();
    }

    public final boolean a() {
        return this.e == 4369;
    }

    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c658da2729eb2ea680b4793819930a82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c658da2729eb2ea680b4793819930a82");
        } else if (i == 0) {
            this.e |= 4369;
        } else if (i == 1) {
            this.e |= 1;
        } else if (i == 2) {
            this.e |= 16;
        } else if (i == 3) {
            this.e |= 256;
        } else if (i == 4) {
            this.e |= 4096;
        }
    }
}
