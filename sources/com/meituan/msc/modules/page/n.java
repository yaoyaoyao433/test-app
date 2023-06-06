package com.meituan.msc.modules.page;

import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class n implements c {
    public static ChangeQuickRedirect a;
    public m b;
    public com.meituan.msc.modules.engine.h c;

    public n(com.meituan.msc.modules.container.p pVar, com.meituan.msc.modules.engine.h hVar) {
        Object[] objArr = {pVar, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b82b5652fab319ce413ce9cb3b2e760", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b82b5652fab319ce413ce9cb3b2e760");
            return;
        }
        this.c = hVar;
        this.b = new m(pVar, hVar);
    }

    @Override // com.meituan.msc.modules.page.c
    public final void a(com.meituan.msc.modules.page.reload.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20dd93c9a0d77630e6ed45b6b494b5ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20dd93c9a0d77630e6ed45b6b494b5ba");
        } else {
            this.b.a(aVar);
        }
    }

    @Override // com.meituan.msc.modules.page.g
    public final void b(String str, Integer num) throws com.meituan.msc.modules.api.b {
        Object[] objArr = {str, num};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c386782881533ba6f18082643dc035f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c386782881533ba6f18082643dc035f6");
        } else {
            this.b.a(str, num);
        }
    }

    @Override // com.meituan.msc.modules.page.g
    public final void a(String str) throws com.meituan.msc.modules.api.b {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "319350106ba764d6ff4d5e7fe0ba31ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "319350106ba764d6ff4d5e7fe0ba31ce");
        } else {
            this.b.e(str);
        }
    }

    @Override // com.meituan.msc.modules.page.g
    public final void b(String str) throws com.meituan.msc.modules.api.b {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "087e2e41982aaee6a03f7891109d2aeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "087e2e41982aaee6a03f7891109d2aeb");
        } else {
            this.b.c(str);
        }
    }

    @Override // com.meituan.msc.modules.page.g
    public final void c(String str) throws com.meituan.msc.modules.api.b {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea38eb950b2b30788796b5f1d4e9d440", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea38eb950b2b30788796b5f1d4e9d440");
        } else {
            this.b.b(str);
        }
    }

    @Override // com.meituan.msc.modules.page.g
    public final void a(int i) throws com.meituan.msc.modules.api.b {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ededad0868af64970ab5e32786546ddb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ededad0868af64970ab5e32786546ddb");
        } else {
            this.b.d(i);
        }
    }

    @Override // com.meituan.msc.modules.navigation.b
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce50296a0db77b0a7d83223532381b3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce50296a0db77b0a7d83223532381b3d");
        } else {
            this.b.a(str, str2);
        }
    }

    @Override // com.meituan.msc.modules.navigation.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6f7e044a962a9746df9a17f7c51f4b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6f7e044a962a9746df9a17f7c51f4b5");
        } else {
            this.b.m();
        }
    }

    @Override // com.meituan.msc.modules.page.c
    public final boolean b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "635d8a4ed313d05abd50f05cf2b00f36", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "635d8a4ed313d05abd50f05cf2b00f36")).booleanValue();
        }
        m mVar = this.b;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = m.a;
        return PatchProxy.isSupport(objArr2, mVar, changeQuickRedirect2, false, "32c4948af6b29d57ed62d959cc7b2da1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, mVar, changeQuickRedirect2, false, "32c4948af6b29d57ed62d959cc7b2da1")).booleanValue() : mVar.a(i) != null;
    }

    @Override // com.meituan.msc.modules.page.c
    public final e c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a001d58bc7acd83eab61708d5cde33d5", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a001d58bc7acd83eab61708d5cde33d5") : this.b.a(i);
    }

    @Override // com.meituan.msc.modules.page.c
    public final e b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64491e798e6d1cb6c614c3bb8eb5ddaf", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64491e798e6d1cb6c614c3bb8eb5ddaf") : this.b.e();
    }

    @Override // com.meituan.msc.modules.page.c
    public final int h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03902ac5796272a9d0b47da6c5c2b016", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03902ac5796272a9d0b47da6c5c2b016")).intValue();
        }
        if (b() != null) {
            return b().d();
        }
        return 0;
    }

    @Override // com.meituan.msc.modules.page.c
    public final e c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e03989e4e1820402beae06a3b7f21d99", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e03989e4e1820402beae06a3b7f21d99") : this.b.f();
    }

    @Override // com.meituan.msc.modules.page.c
    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a196ffd754b9e71e23ab7bfa6ae60eb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a196ffd754b9e71e23ab7bfa6ae60eb")).intValue() : this.b.g();
    }

    @Override // com.meituan.msc.modules.page.c
    public final ViewGroup e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2def5a8cfd0d399729348e25ca3ca31d", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2def5a8cfd0d399729348e25ca3ca31d") : this.b.c();
    }

    @Override // com.meituan.msc.modules.page.c
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bc59ff2d1a015036e270c16072dfc40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bc59ff2d1a015036e270c16072dfc40");
        } else {
            this.b.i();
        }
    }

    @Override // com.meituan.msc.modules.page.c
    public final void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c327ac3e2d30718875edb6a03affb89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c327ac3e2d30718875edb6a03affb89");
        } else {
            this.b.b(i);
        }
    }

    @Override // com.meituan.msc.modules.page.c
    public final m g() {
        return this.b;
    }
}
