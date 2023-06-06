package com.sankuai.waimai.store.drug.home.refactor;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.o;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.store.drug.config.DrugConfigPath;
import com.sankuai.waimai.store.drug.home.DrugHomeActivity;
import com.sankuai.waimai.store.drug.home.refactor.bean.PoiLocationAddress;
import com.sankuai.waimai.store.mrn.preload.p;
import com.sankuai.waimai.store.util.SGLocationUtils;
import com.sankuai.waimai.store.util.ae;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import com.sankuai.waimai.store.util.monitor.monitor.SGChannelPageLoad;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends DrugPoiTemplate {
    public static ChangeQuickRedirect p;
    private String q;
    private String r;
    private String s;
    private android.arch.lifecycle.l<WMLocation> t;
    private android.arch.lifecycle.l<WmAddress> u;
    private long v;
    private final String w;

    public static /* synthetic */ void a(final f fVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "b7bb8973fa675e7b381196d4d98f7b69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "b7bb8973fa675e7b381196d4d98f7b69");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int a = com.sankuai.waimai.store.config.d.h().a(DrugConfigPath.DRUG_HOME_LOCATE_TIMEOUT, -1);
        if (a <= 0 || currentTimeMillis - fVar.v <= a) {
            return;
        }
        ae.a("DrugHome", "locate timeout：" + a);
        com.sankuai.waimai.store.util.monitor.c.a(new IMonitor() { // from class: com.sankuai.waimai.store.drug.home.refactor.DrugPoiTemplateLocation$3
            @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
            public final boolean a() {
                return false;
            }

            @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
            public final com.sankuai.waimai.store.util.monitor.monitor.c b() {
                return null;
            }

            @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
            public String name() {
                return "DrugHomeLocateTimeOut";
            }
        });
    }

    public static /* synthetic */ boolean a(f fVar, WMLocation wMLocation) {
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect = p;
        return PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "666a8397cc6f173279f65c9b25070e94", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "666a8397cc6f173279f65c9b25070e94")).booleanValue() : wMLocation == null || wMLocation.getLocationResultCode() == null || wMLocation.getLocationResultCode().a != 1200;
    }

    public static /* synthetic */ boolean b(f fVar, WmAddress wmAddress) {
        Object[] objArr = {wmAddress};
        ChangeQuickRedirect changeQuickRedirect = p;
        return PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "c408b62fa2eb1f886320cf6940e8de06", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "c408b62fa2eb1f886320cf6940e8de06")).booleanValue() : wmAddress == null || wmAddress.getStatusCode() == 1202;
    }

    public static /* synthetic */ void d(f fVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "269b9eb4816ab09e622841feae63f6d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "269b9eb4816ab09e622841feae63f6d0");
            return;
        }
        fVar.j.setReloadButtonText(R.string.drug_homepage_location_failure_button_text);
        fVar.j.setReloadClickListener(g.a(fVar));
        fVar.j.a(fVar.r, null);
    }

    public f(@NonNull Fragment fragment, @NonNull com.sankuai.waimai.store.param.a aVar) {
        super(fragment, aVar);
        Object[] objArr = {fragment, aVar};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03a5b4ff0e681f430418df8e5830a0a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03a5b4ff0e681f430418df8e5830a0a4");
            return;
        }
        this.v = 0L;
        this.w = "DrugHome";
        this.q = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_common_address_default);
        this.r = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_error_change_location);
        this.s = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_progressbar_locating);
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.DrugPoiTemplate, com.meituan.android.cube.core.f
    public final void a_(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5876036fb3935bef018ede30cb71674a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5876036fb3935bef018ede30cb71674a");
        } else {
            super.a_(view);
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.DrugPoiTemplate
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79baf9243ca9d94bba4d8c83768b1223", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79baf9243ca9d94bba4d8c83768b1223");
            return;
        }
        this.t = new android.arch.lifecycle.l<WMLocation>() { // from class: com.sankuai.waimai.store.drug.home.refactor.f.1
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable WMLocation wMLocation) {
                WMLocation wMLocation2 = wMLocation;
                Object[] objArr2 = {wMLocation2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9958a146b3b6e9bae779e69415817617", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9958a146b3b6e9bae779e69415817617");
                    return;
                }
                f.a(f.this);
                if (!TextUtils.isEmpty(f.this.m.ae)) {
                    com.sankuai.waimai.store.mrn.preload.l.a().b(p.a(f.this.m.ae));
                    f.this.m.ae = null;
                }
                if (!f.a(f.this, wMLocation2)) {
                    ae.a("DrugHome", "locate success");
                    if (!SGLocationUtils.a(f.this.o, wMLocation2)) {
                        if (f.this.o != null) {
                            f.this.B();
                        }
                        f.this.o = wMLocation2;
                        f.this.I();
                        return;
                    }
                    f.this.F();
                    return;
                }
                ae.a("DrugHome", "locate failed");
                if (f.this.z()) {
                    f.this.a(f.this.q, false);
                    f.d(f.this);
                } else {
                    f.this.F();
                }
                if (f.this.m.y) {
                    return;
                }
                com.sankuai.waimai.store.util.monitor.c.a(SGChannelPageLoad.GetLocationError, "", "");
            }
        };
        this.u = new android.arch.lifecycle.l<WmAddress>() { // from class: com.sankuai.waimai.store.drug.home.refactor.f.2
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable WmAddress wmAddress) {
                WmAddress wmAddress2 = wmAddress;
                Object[] objArr2 = {wmAddress2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19febdb20129d7d3f737fee34f860b4d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19febdb20129d7d3f737fee34f860b4d");
                } else if (!f.b(f.this, wmAddress2)) {
                    ae.a("DrugHome", "address success");
                    f.this.a(wmAddress2.getAddress(), false);
                } else {
                    ae.a("DrugHome", "address failed");
                    f.this.a(f.this.q, false);
                    if (f.this.m.y) {
                        return;
                    }
                    com.sankuai.waimai.store.util.monitor.c.a(SGChannelPageLoad.GetAddressError, "", "");
                }
            }
        };
        super.s();
    }

    public static /* synthetic */ void a(f fVar, View view) {
        Object[] objArr = {fVar, view};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a561cb860289a448484c8574c3e1831", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a561cb860289a448484c8574c3e1831");
            return;
        }
        DrugHomeActivity r = fVar.l();
        if (com.sankuai.waimai.store.util.b.a(r)) {
            return;
        }
        fVar.k.o = true;
        com.sankuai.waimai.store.router.d.a(r, com.sankuai.waimai.store.router.c.j);
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.DrugPoiTemplate
    public final void E() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2069084cfaa956ae88d93dd4972ea7b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2069084cfaa956ae88d93dd4972ea7b4");
            return;
        }
        super.E();
        if (this.t != null) {
            com.sankuai.waimai.store.poilist.preload.b.a().b.b(this.t);
        }
        if (this.u != null) {
            com.sankuai.waimai.store.poilist.preload.b.a().c.b(this.u);
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.DrugPoiTemplate
    public final void C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "175729cad61038dec2e98f7b7e4d5032", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "175729cad61038dec2e98f7b7e4d5032");
        } else if (H()) {
            super.C();
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.DrugPoiTemplate
    public final void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c5f791025538abc18a39a78315548c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c5f791025538abc18a39a78315548c4");
        } else if (H()) {
            super.v();
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.DrugPoiTemplate
    public final void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "148c5cd75aabeeef803b1e37fadd4728", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "148c5cd75aabeeef803b1e37fadd4728");
            return;
        }
        if (o.a(l()) && z()) {
            a(this.r, false);
            a("", new com.sankuai.waimai.store.repository.net.b("10000"), true, true);
        } else if (J()) {
            a(com.sankuai.waimai.store.locate.a.d(), false);
            I();
        } else {
            Pair<Boolean, Pair<Double, Double>> a = com.sankuai.waimai.drug.i.a();
            if (com.sankuai.waimai.store.config.d.h().a("drug_homepage/first_location_optimize_enable", true) && ((Boolean) a.first).booleanValue()) {
                com.sankuai.waimai.foundation.location.v2.g a2 = com.sankuai.waimai.foundation.location.v2.g.a();
                double doubleValue = ((Double) ((Pair) a.second).first).doubleValue();
                double doubleValue2 = ((Double) ((Pair) a.second).second).doubleValue();
                Object[] objArr2 = {this};
                ChangeQuickRedirect changeQuickRedirect2 = h.a;
                a2.a(doubleValue, doubleValue2, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "49033e8c57b00dfa5437ee976f9e6a04", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.foundation.location.v2.callback.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "49033e8c57b00dfa5437ee976f9e6a04") : new h(this));
                I();
            } else {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = p;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "081ba414b0bd69ff296a71dfc917bda4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "081ba414b0bd69ff296a71dfc917bda4");
                } else {
                    com.sankuai.waimai.store.poilist.preload.b.a().b.a(this.t);
                    com.sankuai.waimai.store.poilist.preload.b.a().c.a(this.u);
                    this.j.a();
                    a(this.s, false);
                    b(true);
                }
            }
        }
        u();
    }

    public static /* synthetic */ void a(f fVar, WmAddress wmAddress) {
        Object[] objArr = {fVar, wmAddress};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79880d7ead0b107d83933d43b4509ceb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79880d7ead0b107d83933d43b4509ceb");
        } else if (wmAddress != null && !TextUtils.isEmpty(wmAddress.getAddress())) {
            fVar.a(wmAddress.getAddress(), false);
        } else {
            fVar.a(fVar.r, false);
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.DrugPoiTemplate
    public final void x() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba0f8436e38629badd9eede0934bedf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba0f8436e38629badd9eede0934bedf6");
            return;
        }
        com.sankuai.waimai.store.poilist.preload.c a = com.sankuai.waimai.store.poilist.preload.c.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.poilist.preload.c.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "a20890455be21aad9637c5dadef4cd95", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "a20890455be21aad9637c5dadef4cd95")).booleanValue();
        } else if (a.b.get()) {
            z = true;
        }
        if (z) {
            return;
        }
        super.x();
    }

    private void G() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bbb68741ba17765039bdf07c4c69b9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bbb68741ba17765039bdf07c4c69b9d");
            return;
        }
        this.j.a();
        a(this.s, false);
        com.sankuai.waimai.store.poilist.preload.b.a().b.a(this.t);
        com.sankuai.waimai.store.poilist.preload.b.a().c.a(this.u);
        b(false);
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72c26fb6a38f1d62712e1913f4ecb0c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72c26fb6a38f1d62712e1913f4ecb0c9");
            return;
        }
        this.v = System.currentTimeMillis();
        boolean a = com.sankuai.waimai.store.config.d.h().a(DrugConfigPath.DRUG_HOME_LOCATE_STRATEGY, false);
        ae.a("DrugHome", "startLocateAndReport, homeStrategy:" + a + ", isFirst=" + z);
        if (a) {
            com.sankuai.waimai.store.poilist.preload.c.a().b(((com.meituan.android.cube.core.h) this).g, com.sankuai.waimai.store.poilist.preload.b.a(), "dj-ba9f968f05bc3414");
        } else {
            com.sankuai.waimai.store.poilist.preload.c.a().a(((com.meituan.android.cube.core.h) this).g, com.sankuai.waimai.store.poilist.preload.b.a(), "dj-ba9f968f05bc3414");
        }
    }

    private boolean H() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "140560ebd28a213d67918a072361cad9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "140560ebd28a213d67918a072361cad9")).booleanValue();
        }
        if (J()) {
            return true;
        }
        G();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcc9324a7f392335ab7bb18ea0aea967", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcc9324a7f392335ab7bb18ea0aea967");
        } else {
            this.k.f.b((android.arch.lifecycle.k<PoiLocationAddress>) new PoiLocationAddress(str, z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fc40627e83a6a6db8b6049132c1c8cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fc40627e83a6a6db8b6049132c1c8cc");
            return;
        }
        this.n = true;
        y();
        if (A()) {
            super.D();
        } else {
            super.C();
        }
    }

    private boolean J() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be5789a5a326f2923d561bc2aba8af62", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be5789a5a326f2923d561bc2aba8af62")).booleanValue() : com.sankuai.waimai.store.locate.a.g();
    }
}
