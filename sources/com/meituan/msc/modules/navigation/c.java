package com.meituan.msc.modules.navigation;

import android.os.Bundle;
import com.meituan.msc.modules.container.p;
import com.meituan.msc.modules.container.q;
import com.meituan.msc.modules.container.s;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ModuleName(name = "navigation")
/* loaded from: classes3.dex */
public class c extends k implements a {
    public static ChangeQuickRedirect a;

    private com.meituan.msc.modules.page.c d() throws com.meituan.msc.modules.api.b {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b442a01ff6c2ba3fd18463bd61f0aeb", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b442a01ff6c2ba3fd18463bd61f0aeb");
        }
        com.meituan.msc.modules.page.c h = ((q) c(q.class)).h();
        if (h != null) {
            return h;
        }
        throw new com.meituan.msc.modules.api.b("operation not available for not pageStack");
    }

    @Override // com.meituan.msc.modules.navigation.a
    public final void a(String str, Integer num) throws com.meituan.msc.modules.api.b {
        Object[] objArr = {str, num};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f0d385b0b54921477f768d7edab2630", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f0d385b0b54921477f768d7edab2630");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("targetPath", str);
        if (num != null) {
            bundle.putInt("openSeq", num.intValue());
        }
        p e = ((q) c(q.class)).e();
        if (e != null) {
            ((s) c(s.class)).a(e.G().a(U_().a(), bundle));
        }
    }

    @Override // com.meituan.msc.modules.page.g
    public final void b(String str, Integer num) throws com.meituan.msc.modules.api.b {
        Object[] objArr = {str, num};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74628ddcfb4fb84311ba74cfe20bd07e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74628ddcfb4fb84311ba74cfe20bd07e");
        } else {
            d().b(str, num);
        }
    }

    @Override // com.meituan.msc.modules.page.g
    public final void a(String str) throws com.meituan.msc.modules.api.b {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03782acc18e1e3182b435d6f169c0881", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03782acc18e1e3182b435d6f169c0881");
        } else {
            d().a(str);
        }
    }

    @Override // com.meituan.msc.modules.page.g
    public final void b(String str) throws com.meituan.msc.modules.api.b {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bbb3b0a0a253c31529084905d007732", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bbb3b0a0a253c31529084905d007732");
        } else {
            d().b(str);
        }
    }

    @Override // com.meituan.msc.modules.page.g
    public final void c(String str) throws com.meituan.msc.modules.api.b {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4555fcfe22e9880522db9aab118aaf1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4555fcfe22e9880522db9aab118aaf1b");
        } else {
            d().c(str);
        }
    }

    @Override // com.meituan.msc.modules.page.g
    public final void a(int i) throws com.meituan.msc.modules.api.b {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "804a2f6684d6c7a7b0c9081a9fe871cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "804a2f6684d6c7a7b0c9081a9fe871cc");
        } else {
            d().a(i);
        }
    }
}
