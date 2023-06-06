package com.meituan.msc.modules.page;

import android.graphics.Rect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class p implements f {
    public static ChangeQuickRedirect a;
    public com.meituan.msc.modules.page.view.d b;

    public p(com.meituan.msc.modules.page.view.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad31c507df0dbbbcd502c8d80e65c7f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad31c507df0dbbbcd502c8d80e65c7f5");
        } else {
            this.b = dVar;
        }
    }

    @Override // com.meituan.msc.modules.page.f
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c83dd06f0c38618df60155a539315184", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c83dd06f0c38618df60155a539315184");
        } else {
            this.b.setNavigationBarTitle(str);
        }
    }

    @Override // com.meituan.msc.modules.page.f
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08c25c78a681af715688c6bb335fae73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08c25c78a681af715688c6bb335fae73");
            return;
        }
        this.b.setNavigationBarTextColor(i);
        this.b.setNavigationBarIconColor(i);
        this.b.setNavigationBarBackgroundColor(i2);
    }

    @Override // com.meituan.msc.modules.page.f
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3efb494068b00c429a1f05362ef9a82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3efb494068b00c429a1f05362ef9a82");
            return;
        }
        com.meituan.msc.modules.page.view.d dVar = this.b;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.view.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "2add994413b42c1149bf992ab74ea127", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "2add994413b42c1149bf992ab74ea127");
            return;
        }
        if (dVar.e == null) {
            dVar.b();
        }
        if (dVar.e != null) {
            dVar.e.showNavigationBarMoreMenu(z);
        }
    }

    @Override // com.meituan.msc.modules.page.f
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b0e477ed09752f4bc59983e2be50dbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b0e477ed09752f4bc59983e2be50dbd");
            return;
        }
        com.meituan.msc.modules.page.view.d dVar = this.b;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.view.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "b04abadee3b2d7c3d8a5940329f29235", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "b04abadee3b2d7c3d8a5940329f29235");
        } else if (dVar.e != null) {
            dVar.e.hideNavigationBarMoreMenu(z);
        }
    }

    @Override // com.meituan.msc.modules.page.f
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8a1bded668d10949c5053a7a51816d9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8a1bded668d10949c5053a7a51816d9")).booleanValue();
        }
        com.meituan.msc.modules.page.view.d dVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.view.d.a;
        return PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "0d07d2fc3395cc56c1502aab83795285", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "0d07d2fc3395cc56c1502aab83795285")).booleanValue() : dVar.e != null && dVar.e.isMenuButtonShown();
    }

    @Override // com.meituan.msc.modules.page.f
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dfa43791e0e78388ad85321f6d69435", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dfa43791e0e78388ad85321f6d69435");
            return;
        }
        com.meituan.msc.modules.page.view.d dVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.view.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "2c54dbd737f19980a7aa6cc97388b802", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "2c54dbd737f19980a7aa6cc97388b802");
        } else if (dVar.k || dVar.e == null) {
        } else {
            dVar.e.showNavigationBarLoading();
        }
    }

    @Override // com.meituan.msc.modules.page.f
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bb2222a79c9e94257d4be3fcb99d8e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bb2222a79c9e94257d4be3fcb99d8e5");
            return;
        }
        com.meituan.msc.modules.page.view.d dVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.view.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "ccc8341cf760a6df74a142beb7608962", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "ccc8341cf760a6df74a142beb7608962");
        } else if (dVar.k || dVar.e == null) {
        } else {
            dVar.e.hideNavigationBarLoading();
        }
    }

    @Override // com.meituan.msc.modules.page.f
    public final Rect d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2b56654be348263fe2db3bcfa2f39f8", RobustBitConfig.DEFAULT_VALUE) ? (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2b56654be348263fe2db3bcfa2f39f8") : this.b.getMenuRect();
    }
}
