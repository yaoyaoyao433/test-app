package com.sankuai.waimai.ad.view.mach.pouchview;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.platform.mach.config.b;
import com.sankuai.waimai.platform.mach.monitor.c;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import com.sankuai.waimai.pouch.model.c;
import com.sankuai.waimai.pouch.view.PouchAdView;
import com.sankuai.waimai.pouch.view.a;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMPouchAdMachView extends a<com.sankuai.waimai.ad.view.mach.a> {
    public static ChangeQuickRedirect a;
    private String j;

    @Override // com.sankuai.waimai.pouch.view.a
    public final void a(Context context, @NonNull c cVar, PouchDynamicAd pouchDynamicAd, com.sankuai.waimai.pouch.a aVar) {
        Object[] objArr = {context, cVar, pouchDynamicAd, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06c384475173749f263c4a466cae73d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06c384475173749f263c4a466cae73d0");
            return;
        }
        this.d = new com.sankuai.waimai.ad.view.mach.a((Activity) context, cVar, aVar);
        if (pouchDynamicAd != null) {
            this.j = pouchDynamicAd.businessName;
        }
        if (aVar.c != null) {
            ((com.sankuai.waimai.ad.view.mach.a) this.d).b = aVar.c;
        }
    }

    @Override // com.sankuai.waimai.pouch.view.a, com.sankuai.waimai.pouch.view.PouchAdView
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78d3259a642359b7c251994af0acbbe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78d3259a642359b7c251994af0acbbe5");
            return;
        }
        super.a();
        if (this.d != 0) {
            ((com.sankuai.waimai.ad.view.mach.a) this.d).o();
        }
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    public final Mach b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e438a247c9c241dbbf30b8bde1e5a13f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Mach) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e438a247c9c241dbbf30b8bde1e5a13f");
        }
        if (this.d == 0) {
            return null;
        }
        return ((com.sankuai.waimai.ad.view.mach.a) this.d).i();
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43a58c92ac827b30b6fffe3719fe254d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43a58c92ac827b30b6fffe3719fe254d");
        } else if (this.d != 0) {
            ((com.sankuai.waimai.ad.view.mach.a) this.d).h();
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd0d19f7fc1642571ae46ea82d48a554", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd0d19f7fc1642571ae46ea82d48a554")).intValue() : b.a().b;
    }

    @Override // com.sankuai.waimai.pouch.view.a
    public final void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fefd0d729ca78735a133d568d2dc568d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fefd0d729ca78735a133d568d2dc568d");
            return;
        }
        c.a aVar = new c.a();
        aVar.c = "ad_type_1";
        aVar.d = str;
        aVar.b = this.e == null ? "default" : this.e.c;
        ((com.sankuai.waimai.ad.view.mach.a) this.d).a(aVar.a(), map);
    }

    @Override // com.sankuai.waimai.pouch.view.a
    public final void a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e749b09027a2378713ce442d2623fa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e749b09027a2378713ce442d2623fa5");
            return;
        }
        com.sankuai.waimai.pouch.monitor.b bVar = new com.sankuai.waimai.pouch.monitor.b();
        bVar.a = str;
        bVar.b = str2;
        bVar.c = this.i;
        bVar.d = this.j;
        bVar.g = z;
        com.sankuai.waimai.pouch.monitor.c.a(bVar);
    }

    @Override // com.sankuai.waimai.pouch.view.a
    public final void a(int i, String str, boolean z) {
        Object[] objArr = {Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31b6080d0d8371543481a4ad715cbcc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31b6080d0d8371543481a4ad715cbcc6");
            return;
        }
        com.sankuai.waimai.pouch.monitor.b bVar = new com.sankuai.waimai.pouch.monitor.b();
        bVar.a = str;
        bVar.e = i;
        bVar.c = this.i;
        bVar.d = this.j;
        bVar.g = z;
        com.sankuai.waimai.pouch.monitor.c.b(bVar);
    }

    @Override // com.sankuai.waimai.pouch.view.a
    public final void b(int i, String str, boolean z) {
        Object[] objArr = {Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cae63fb28e79e5f19a991e331eb24b34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cae63fb28e79e5f19a991e331eb24b34");
            return;
        }
        com.sankuai.waimai.pouch.monitor.b bVar = new com.sankuai.waimai.pouch.monitor.b();
        bVar.a = str;
        bVar.e = i;
        bVar.c = this.i;
        bVar.d = this.j;
        bVar.g = z;
        com.sankuai.waimai.pouch.monitor.c.c(bVar);
    }

    @Override // com.sankuai.waimai.pouch.view.a
    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dbfae63a4a9d630b76398ced60fe0ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dbfae63a4a9d630b76398ced60fe0ed");
            return;
        }
        com.sankuai.waimai.pouch.monitor.b bVar = new com.sankuai.waimai.pouch.monitor.b();
        bVar.b = str;
        bVar.e = i;
        bVar.d = this.j;
        com.sankuai.waimai.pouch.monitor.c.d(bVar);
    }
}
