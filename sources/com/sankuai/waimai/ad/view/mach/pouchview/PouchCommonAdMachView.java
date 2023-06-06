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
public class PouchCommonAdMachView extends a<com.sankuai.waimai.ad.view.mach.a> {
    public static ChangeQuickRedirect a;
    private int j;
    private String k;

    @Override // com.sankuai.waimai.pouch.view.a
    public final void a(Context context, @NonNull c cVar, PouchDynamicAd pouchDynamicAd, @NonNull com.sankuai.waimai.pouch.a aVar) {
        Object[] objArr = {context, cVar, pouchDynamicAd, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b811de434e1dab048fd68ebffcc921f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b811de434e1dab048fd68ebffcc921f");
            return;
        }
        this.d = new com.sankuai.waimai.ad.view.mach.a((Activity) context, cVar, aVar);
        if (pouchDynamicAd != null) {
            this.k = pouchDynamicAd.businessName;
            this.j = pouchDynamicAd.index;
        }
        if (aVar.c != null) {
            ((com.sankuai.waimai.ad.view.mach.a) this.d).b = aVar.c;
        }
    }

    @Override // com.sankuai.waimai.pouch.view.a, com.sankuai.waimai.pouch.view.PouchAdView
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a836498f62d3830f04fd9bb61b4318b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a836498f62d3830f04fd9bb61b4318b");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bffe65fdd5d21a0167493dd88caca66c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Mach) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bffe65fdd5d21a0167493dd88caca66c");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e54aef7fc8f551f461eeaa867530b87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e54aef7fc8f551f461eeaa867530b87");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f69854f1b20d3ab92b9cad36bb4c477", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f69854f1b20d3ab92b9cad36bb4c477")).intValue() : b.a().b;
    }

    @Override // com.sankuai.waimai.pouch.view.a
    public final void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86de27418a67ee7eafd31439d888074a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86de27418a67ee7eafd31439d888074a");
            return;
        }
        c.a aVar = new c.a();
        aVar.d = str;
        aVar.b = this.e == null ? "default" : this.e.c;
        ((com.sankuai.waimai.ad.view.mach.a) this.d).a(aVar.a(), map);
    }

    @Override // com.sankuai.waimai.pouch.view.a
    public final void a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84e7acf3d0d19a2f54d449aef0a290a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84e7acf3d0d19a2f54d449aef0a290a4");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fd8a46f6d48460e9085e73da1e920b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fd8a46f6d48460e9085e73da1e920b1");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b2aab2ba4e25a0f62cbd20b602f28fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b2aab2ba4e25a0f62cbd20b602f28fe");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c55d844b6629f7349a1ae086bf8b8bca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c55d844b6629f7349a1ae086bf8b8bca");
            return;
        }
        com.sankuai.waimai.pouch.monitor.b bVar = new com.sankuai.waimai.pouch.monitor.b();
        bVar.b = str;
        bVar.e = i;
        bVar.f = this.j;
        bVar.d = this.k;
        com.sankuai.waimai.pouch.monitor.c.d(bVar);
    }
}
