package com.sankuai.meituan.takeoutnew.controller;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.model.WelcomeAd;
import com.sankuai.meituan.takeoutnew.ui.page.boot.ad.b;
import com.sankuai.waimai.business.page.homepage.controller.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements Runnable {
    public static ChangeQuickRedirect a;
    private final WelcomeAd b;
    private final b.a c;

    public b(WelcomeAd welcomeAd, b.a aVar) {
        Object[] objArr = {welcomeAd, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed2ee364461e3836720e09595a2a9eb1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed2ee364461e3836720e09595a2a9eb1");
            return;
        }
        this.b = welcomeAd;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81f47b0f75ae38d015b57eff918029f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81f47b0f75ae38d015b57eff918029f2");
        } else {
            new com.sankuai.meituan.takeoutnew.ui.page.boot.ad.b(com.meituan.android.singleton.b.a).a(this.b.matUrl, new b.a() { // from class: com.sankuai.meituan.takeoutnew.controller.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.takeoutnew.ui.page.boot.ad.b.a
                public final void a(String str, Throwable th) {
                    Object[] objArr2 = {str, th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "338dcf0dd1b49917a09a11b85c50e108", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "338dcf0dd1b49917a09a11b85c50e108");
                    } else if (b.this.c != null) {
                        b.this.c.b();
                    }
                }

                @Override // com.sankuai.meituan.takeoutnew.ui.page.boot.ad.b.a
                public final void a(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "90ae8582375b3f9afea3d37a649ee209", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "90ae8582375b3f9afea3d37a649ee209");
                    } else if (b.this.c != null) {
                        b.this.c.b();
                    }
                }

                @Override // com.sankuai.meituan.takeoutnew.ui.page.boot.ad.b.a
                public final void b(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4649235f7d72936ec531dcdb07b4568a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4649235f7d72936ec531dcdb07b4568a");
                    } else if (!a.b(b.this.b) || b.this.c == null) {
                    } else {
                        b.this.c.a();
                    }
                }
            });
        }
    }
}
