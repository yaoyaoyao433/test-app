package com.sankuai.waimai.ad.view.mach.pouchview;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.platform.mach.config.b;
import com.sankuai.waimai.platform.mach.monitor.c;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import com.sankuai.waimai.pouch.view.PouchAdView;
import com.sankuai.waimai.pouch.view.a;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMPouchMachPopupView extends a<com.sankuai.waimai.ad.view.mach.dydialog.a> {
    public static ChangeQuickRedirect a;
    private int j;
    private String k;

    @Override // com.sankuai.waimai.pouch.view.a, com.sankuai.waimai.pouch.view.PouchAdView
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a813828af35085111a493620997a2400", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a813828af35085111a493620997a2400");
            return;
        }
        super.a();
        if (this.d != 0) {
            ((com.sankuai.waimai.ad.view.mach.dydialog.a) this.d).o();
        }
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    public final Mach b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f44f721a7060352f28162ebbbcafdaf9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Mach) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f44f721a7060352f28162ebbbcafdaf9");
        }
        if (this.d == 0) {
            return null;
        }
        return ((com.sankuai.waimai.ad.view.mach.dydialog.a) this.d).i();
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9049a2e46a983dd040d67a87aca16fd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9049a2e46a983dd040d67a87aca16fd5");
        } else if (this.d != 0) {
            ((com.sankuai.waimai.ad.view.mach.dydialog.a) this.d).h();
        }
    }

    @Override // com.sankuai.waimai.pouch.view.a, com.sankuai.waimai.pouch.view.PouchAdView
    public final void a(PouchAdView.a aVar) {
        this.g = aVar;
    }

    @Override // com.sankuai.waimai.pouch.view.a
    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "635abee0dca5eeed9392358ac3ec316f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "635abee0dca5eeed9392358ac3ec316f")).intValue() : b.a().b;
    }

    @Override // com.sankuai.waimai.pouch.view.a
    public final void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef3257cfbdc7b988a13f4bdd15947ffa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef3257cfbdc7b988a13f4bdd15947ffa");
            return;
        }
        c.a aVar = new c.a();
        aVar.d = str;
        aVar.b = this.e == null ? "default" : this.e.c;
        ((com.sankuai.waimai.ad.view.mach.dydialog.a) this.d).a(aVar.a(), map);
    }

    @Override // com.sankuai.waimai.pouch.view.a
    public final void a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7050d3b7f9e9a6c123029af83bc492fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7050d3b7f9e9a6c123029af83bc492fe");
            return;
        }
        com.sankuai.waimai.pouch.monitor.b bVar = new com.sankuai.waimai.pouch.monitor.b();
        bVar.a = str;
        bVar.b = str2;
        bVar.c = this.i;
        bVar.f = this.j;
        bVar.d = this.k;
        bVar.g = z;
        com.sankuai.waimai.pouch.monitor.c.a(bVar);
    }

    @Override // com.sankuai.waimai.pouch.view.a
    public final void a(int i, String str, boolean z) {
        Object[] objArr = {Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58e963a98fbf82192eb7f36892d723a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58e963a98fbf82192eb7f36892d723a1");
            return;
        }
        com.sankuai.waimai.pouch.monitor.b bVar = new com.sankuai.waimai.pouch.monitor.b();
        bVar.a = str;
        bVar.e = i;
        bVar.c = this.i;
        bVar.f = this.j;
        bVar.d = this.k;
        bVar.g = z;
        com.sankuai.waimai.pouch.monitor.c.b(bVar);
    }

    @Override // com.sankuai.waimai.pouch.view.a
    public final void b(int i, String str, boolean z) {
        Object[] objArr = {Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0337ae0beec0ee0533d417c5bbd468f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0337ae0beec0ee0533d417c5bbd468f");
            return;
        }
        com.sankuai.waimai.pouch.monitor.b bVar = new com.sankuai.waimai.pouch.monitor.b();
        bVar.a = str;
        bVar.e = i;
        bVar.c = this.i;
        bVar.f = this.j;
        bVar.d = this.k;
        bVar.g = z;
        com.sankuai.waimai.pouch.monitor.c.c(bVar);
    }

    @Override // com.sankuai.waimai.pouch.view.a
    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f90c1cafa6130f487b77cbf1e8571447", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f90c1cafa6130f487b77cbf1e8571447");
            return;
        }
        com.sankuai.waimai.pouch.monitor.b bVar = new com.sankuai.waimai.pouch.monitor.b();
        bVar.b = str;
        bVar.e = i;
        bVar.f = this.j;
        bVar.d = this.k;
        com.sankuai.waimai.pouch.monitor.c.d(bVar);
    }

    @Override // com.sankuai.waimai.pouch.view.a
    public final void a(Context context, @NonNull com.sankuai.waimai.pouch.model.c cVar, PouchDynamicAd pouchDynamicAd, @NonNull com.sankuai.waimai.pouch.a aVar) {
        Object[] objArr = {context, cVar, pouchDynamicAd, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ed9aacf2ddb27ff236863e65da05f64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ed9aacf2ddb27ff236863e65da05f64");
            return;
        }
        if (cVar.g == 3) {
            this.d = new com.sankuai.waimai.ad.view.mach.dydialog.c((Activity) context, cVar, aVar);
        } else if (cVar.g == 4) {
            this.d = new com.sankuai.waimai.ad.view.mach.dydialog.b((Activity) context, cVar, aVar);
        } else {
            this.d = new com.sankuai.waimai.ad.view.mach.dydialog.a((Activity) context, cVar, aVar);
        }
        if (pouchDynamicAd != null) {
            if (TextUtils.isEmpty(pouchDynamicAd.businessName)) {
                pouchDynamicAd.businessName = "dynamicPopup";
            }
            this.k = pouchDynamicAd.businessName;
            this.j = pouchDynamicAd.index;
        }
        if (aVar.c != null) {
            ((com.sankuai.waimai.ad.view.mach.a) ((com.sankuai.waimai.ad.view.mach.dydialog.a) this.d)).b = aVar.c;
        }
    }
}
