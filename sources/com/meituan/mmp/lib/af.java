package com.meituan.mmp.lib;

import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.mmp.lib.aa;
import com.meituan.mmp.lib.update.MMPPackageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class af extends ab {
    public static ChangeQuickRedirect l;

    @Override // com.meituan.mmp.lib.ab
    public final boolean a(int i, boolean z) {
        return false;
    }

    public af(a aVar, com.meituan.mmp.lib.engine.m mVar) {
        super(aVar, mVar);
        Object[] objArr = {aVar, mVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e18d898d0d32c294e7309e22c739569", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e18d898d0d32c294e7309e22c739569");
        }
    }

    public final void a(String str, final com.meituan.mmp.lib.trace.h hVar, boolean z) {
        Object[] objArr = {str, hVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "268a4be71c8e1896bf645d5749535d04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "268a4be71c8e1896bf645d5749535d04");
        } else if (TextUtils.isEmpty(str)) {
            com.meituan.mmp.lib.trace.b.c("WidgetPageManager", "navigateHomePage failed, url is null");
        } else {
            g();
            try {
                aa.a aVar = new aa.a();
                aVar.b = str;
                aVar.c = z ? "reload" : "widgetLaunch";
                final aa a = aVar.a(this.c);
                this.i.a(a.b, false, new com.meituan.mmp.lib.load.b() { // from class: com.meituan.mmp.lib.af.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.mmp.lib.load.b
                    public final void a(boolean z2, boolean z3, MMPPackageInfo mMPPackageInfo) {
                        Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), mMPPackageInfo};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc13dd1266302ca59c6f924af204164e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc13dd1266302ca59c6f924af204164e");
                            return;
                        }
                        com.meituan.mmp.main.ab.a("PageManager.launchWidget.onPackageLoaded");
                        com.meituan.mmp.lib.page.e a2 = af.this.a(a, (com.meituan.mmp.lib.resume.a) null, z2);
                        af.this.a(a2);
                        a2.h();
                        a2.b(a);
                        a2.setAppLaunchReporter(hVar);
                        com.meituan.mmp.main.ab.a();
                    }
                });
            } catch (com.meituan.mmp.lib.api.d e) {
                com.meituan.mmp.lib.trace.b.a("WidgetPageManager", e, "launchWidget");
                a(str, "widgetLaunch");
            }
        }
    }

    private void g(String str) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa0a1cf903922febb66795a3e0f72ed6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa0a1cf903922febb66795a3e0f72ed6");
        } else {
            a(str, (Integer) null);
        }
    }

    private void a(String str, Integer num) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {str, num};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5204b0f24bb27124d3f2cc23ea27a526", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5204b0f24bb27124d3f2cc23ea27a526");
        } else if (!this.d.a()) {
            com.meituan.mmp.lib.trace.b.d("WidgetPageManager", "controller is not for widget, can not launch app");
            throw new com.meituan.mmp.lib.api.d("controller is not for widget, can not launch app");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("targetPath", str);
            bundle.putBoolean("forbidHide", true);
            if (num != null) {
                bundle.putInt("openSeq", num.intValue());
            }
            this.d.R = true;
            this.d.a(this.d.e.a(this.b.b, bundle));
        }
    }

    @Override // com.meituan.mmp.lib.ab
    public final void a(aa aaVar) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd24c1d9b146cbd01fc0cf20cf13522f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd24c1d9b146cbd01fc0cf20cf13522f");
            return;
        }
        f(aaVar.b);
        a(aaVar.b, aaVar.d);
    }

    @Override // com.meituan.mmp.lib.ab
    public final void b(aa aaVar) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bebba296bec64e43860bfdd0bd886a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bebba296bec64e43860bfdd0bd886a4");
            return;
        }
        String str = aaVar.b;
        f(str);
        if (this.c.o(str)) {
            throw new com.meituan.mmp.lib.api.d("can not redirectTo tab page");
        }
        g(str);
    }

    @Override // com.meituan.mmp.lib.ab
    public final void b(int i, boolean z) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8efec5f3665d4b0c44538bba4968be0e", RobustBitConfig.DEFAULT_VALUE)) {
            throw new com.meituan.mmp.lib.api.d("cannot navigate back in widget");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8efec5f3665d4b0c44538bba4968be0e");
    }

    @Override // com.meituan.mmp.lib.ab
    public final void d(String str) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1380ebe216af51f9c6a2b5eab418e4bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1380ebe216af51f9c6a2b5eab418e4bc");
            return;
        }
        f(str);
        if (!this.c.o(str)) {
            throw new com.meituan.mmp.lib.api.d("can't switchTab to single page");
        }
        g(str);
    }

    @Override // com.meituan.mmp.lib.ab
    public final void c(String str) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f38c552cf775ba5c6177facf068d131", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f38c552cf775ba5c6177facf068d131");
            return;
        }
        f(str);
        if (!this.c.o(str)) {
            throw new com.meituan.mmp.lib.api.d("can't switchTab to single page");
        }
        g(str);
    }

    @Override // com.meituan.mmp.lib.ab
    public final void e(String str) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "024def05c06645b7e00199ca66d2e160", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "024def05c06645b7e00199ca66d2e160");
            return;
        }
        f(str);
        g(str);
    }
}
