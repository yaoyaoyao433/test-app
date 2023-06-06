package com.sankuai.waimai.store.goods.list.delegate.impl;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.utils.af;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.goods.list.viewblocks.g;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.util.monitor.monitor.SGStorePageLoadNew;
import com.sankuai.waimai.store.util.w;
import com.sankuai.waimai.store.view.FloatContainer;
import java.net.URLDecoder;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class e extends d {
    public static ChangeQuickRedirect a;
    protected String K;
    private g L;
    private com.sankuai.waimai.store.notification.a M;
    private com.sankuai.waimai.store.goods.list.viewblocks.e N;
    private com.sankuai.waimai.store.im.poi.presenter.d O;
    private FloatContainer P;
    private int Q;

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d
    public final int p() {
        return 1;
    }

    public e(@NonNull SCBaseActivity sCBaseActivity, MetricsSpeedMeterTask metricsSpeedMeterTask, int i) {
        super(sCBaseActivity, 1);
        Object[] objArr = {sCBaseActivity, metricsSpeedMeterTask, 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce5a9b463bbc499bf31fa3bcc760b9c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce5a9b463bbc499bf31fa3bcc760b9c9");
            return;
        }
        this.Q = -1;
        this.J = metricsSpeedMeterTask;
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d, com.sankuai.waimai.store.base.a
    public final void a(FragmentActivity fragmentActivity, Bundle bundle) {
        Object[] objArr = {fragmentActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39ca54957be51d59b9aa83afe58a7283", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39ca54957be51d59b9aa83afe58a7283");
            return;
        }
        super.a(fragmentActivity, bundle);
        this.L = new g(this);
        this.L.createAndReplaceView(this.C, R.id.layout_poi_tip_container);
        this.N = new com.sankuai.waimai.store.goods.list.viewblocks.e(this);
        this.M = new com.sankuai.waimai.store.notification.a(this.x);
        ViewGroup viewGroup = (ViewGroup) this.y.getWindow().getDecorView().findViewById(16908290);
        this.P = new FloatContainer(this.y);
        ViewGroup.LayoutParams layoutParams = this.P.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.rightMargin = h.a(this.y, 12.0f);
            marginLayoutParams.bottomMargin = h.a(this.y, 160.0f);
            this.P.setLayoutParams(layoutParams);
        }
        viewGroup.addView(this.P);
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.a, com.sankuai.waimai.store.goods.list.delegate.d
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "422f290db43e6d7e6f9b338822e1945c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "422f290db43e6d7e6f9b338822e1945c") : (w.g(this.x.b) || w.d(this.x.b) || w.f(this.x.b)) ? "c_crkfv64n" : w.c(this.x.b) ? "c_waimai_bwm78neq" : "c_waimai_qeknbhm9";
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d
    public final void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "423a1ed69db55e7e934659607e946779", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "423a1ed69db55e7e934659607e946779");
        } else {
            super.a(intent);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d
    public final boolean a(RestMenuResponse restMenuResponse, int i) {
        boolean z;
        boolean z2;
        String str;
        Uri data;
        Object[] objArr = {restMenuResponse, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "257dc522ce3b7ab7b1e33151a07f73e7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "257dc522ce3b7ab7b1e33151a07f73e7")).booleanValue();
        }
        Object[] objArr2 = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2052f71310df6a1a0a8df28ae83af80d", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2052f71310df6a1a0a8df28ae83af80d")).booleanValue();
        } else {
            Object[] objArr3 = {restMenuResponse};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "da30fb487134edad3d2eaad1f4304437", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "da30fb487134edad3d2eaad1f4304437")).booleanValue();
            } else {
                Poi poi = restMenuResponse.getPoi();
                z = poi != null && poi.getBuzType() == 9;
            }
            z2 = z && u();
        }
        if (!z2 || com.sankuai.waimai.store.util.b.a(this.y)) {
            return false;
        }
        SCBaseActivity sCBaseActivity = this.y;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cfe5fb7339a5f26a1b4d52e244f29836", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cfe5fb7339a5f26a1b4d52e244f29836");
        } else {
            Uri data2 = this.y.getIntent().getData();
            if (data2 != null) {
                String uri = data2.toString();
                String path = data2.getPath();
                if (!TextUtils.isEmpty(uri) && !TextUtils.isEmpty(path) && uri.contains(path) && com.sankuai.waimai.foundation.router.a.a(data2)) {
                    str = uri.replaceFirst(path, "/takeout/drug/store");
                }
            }
            str = "";
        }
        Bundle extras = this.y.getIntent().getExtras();
        Object[] objArr5 = {sCBaseActivity, str, restMenuResponse, extras};
        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.router.g.a;
        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "a62a2e0304b65f2f20dacd55fdf843a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "a62a2e0304b65f2f20dacd55fdf843a4");
        } else if (sCBaseActivity != null) {
            if (extras == null) {
                extras = new Bundle();
            }
            extras.putBoolean("from_sg", true);
            Poi poi2 = restMenuResponse.getPoi();
            if (poi2 != null && !t.a(poi2.drugPoiScheme)) {
                String str2 = poi2.drugPoiScheme;
                if ((sCBaseActivity instanceof Activity) && (data = sCBaseActivity.getIntent().getData()) != null) {
                    String query = data.getQuery();
                    Uri parse = Uri.parse(str2);
                    String b = af.b(parse, "targetPath", "");
                    if (!t.a(b)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(URLDecoder.decode(b));
                        sb.append("&");
                        sb.append(query);
                        if (!t.a(String.valueOf(sb))) {
                            com.sankuai.waimai.store.router.d.a(sCBaseActivity, af.c(parse, "targetPath", String.valueOf(sb)).toString());
                        }
                    }
                }
            } else if (t.a(str)) {
                com.sankuai.waimai.store.router.d.a().a("poi_response", (String) restMenuResponse).a(extras).a(sCBaseActivity, com.sankuai.waimai.store.router.c.b);
            } else {
                com.sankuai.waimai.store.router.d.a().a("poi_response", (String) restMenuResponse).a(extras).a(sCBaseActivity, str);
            }
            if (sCBaseActivity instanceof Activity) {
                sCBaseActivity.overridePendingTransition(0, 0);
            }
        }
        return true;
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d, com.sankuai.waimai.store.base.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88bfa2f1c04dd7cd1c940126908957d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88bfa2f1c04dd7cd1c940126908957d2");
            return;
        }
        super.f();
        this.M.a();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d, com.sankuai.waimai.store.base.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b5be0c52c910d11a181579428d05fcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b5be0c52c910d11a181579428d05fcb");
            return;
        }
        super.g();
        if (this.z != null) {
            this.z.onResume();
        }
        com.sankuai.waimai.store.manager.judas.d.a(this.y);
        if (this.Q != -1) {
            v();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d, com.sankuai.waimai.store.base.a
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "054b64b8a27f0c4b61b9ef0da4f7a23c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "054b64b8a27f0c4b61b9ef0da4f7a23c");
            return;
        }
        Object[] objArr2 = {Integer.valueOf(this.Q)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4555bf75ebc94166b844aecebdc9358b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4555bf75ebc94166b844aecebdc9358b");
        } else if (!this.x.t() || !u()) {
            com.sankuai.waimai.store.manager.judas.d.d(this.y, b());
        }
        if (this.z != null) {
            this.z.onPause();
        }
    }

    private boolean u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19bec1b2eb16a3bf5bfbbe7739c60f47", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19bec1b2eb16a3bf5bfbbe7739c60f47")).booleanValue() : com.sankuai.waimai.store.config.d.h().a("store/drug_store_open_android_v772", true);
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d, com.sankuai.waimai.store.base.a
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ccc15ed0eeb57620994e5985e484177", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ccc15ed0eeb57620994e5985e484177");
            return;
        }
        super.i();
        this.M.b();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d, com.sankuai.waimai.store.base.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e6cd0f9790d11e1100a5bb88e69c275", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e6cd0f9790d11e1100a5bb88e69c275");
            return;
        }
        super.c();
        if (this.z != null) {
            this.z.onDestroy();
        }
        if (this.N != null) {
            this.N.onDestroy();
        }
        if (this.P != null) {
            FloatContainer floatContainer = this.P;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = FloatContainer.a;
            if (PatchProxy.isSupport(objArr2, floatContainer, changeQuickRedirect2, false, "eb7bd7f16a6c6754a19b1123692f84e3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, floatContainer, changeQuickRedirect2, false, "eb7bd7f16a6c6754a19b1123692f84e3");
                return;
            }
            if (floatContainer.b != null) {
                floatContainer.b.removeAllUpdateListeners();
                floatContainer.b.cancel();
            }
            if (floatContainer.c != null) {
                floatContainer.c.removeAllUpdateListeners();
                floatContainer.c.cancel();
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61a9411494b032063df6fb362884ca68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61a9411494b032063df6fb362884ca68");
            return;
        }
        super.a(str);
        com.sankuai.waimai.store.util.monitor.b.a().a(SGStorePageLoadNew.RequestAPIError).a(false).a(str).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05c9  */
    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@android.support.annotation.NonNull com.sankuai.waimai.store.repository.model.RestMenuResponse r29, @android.support.annotation.Nullable final com.sankuai.waimai.store.entity.RestRecommendPoi r30) {
        /*
            Method dump skipped, instructions count: 1640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.list.delegate.impl.e.a(com.sankuai.waimai.store.repository.model.RestMenuResponse, com.sankuai.waimai.store.entity.RestRecommendPoi):void");
    }

    private void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "879c39f9e8395c861448e7f7191d66e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "879c39f9e8395c861448e7f7191d66e4");
            return;
        }
        this.i.put("source_type", Integer.valueOf(this.f));
        this.i.put("source_id", this.g);
        this.i.put("mBuzType", Integer.valueOf(w()));
        this.i.put("source_page_id", this.l);
        this.i.put("source_event_id", this.o);
        this.i.put("source_attribute", this.p);
        this.i.put("source_ext", this.q);
        com.sankuai.waimai.store.manager.judas.d.b(this.y, b()).a(this.i).b("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(this.d, this.c)).b("stid", this.x.b.abExpInfo).a();
        com.sankuai.waimai.store.manager.judas.d.a(this.y, b());
    }

    private int w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e57bdeacb1489107da1a172ebd4c65fd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e57bdeacb1489107da1a172ebd4c65fd")).intValue();
        }
        if (this.x == null || this.x.b == null) {
            return -999;
        }
        return this.x.b.mBuzType;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
        if (r0 == false) goto L20;
     */
    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d, com.sankuai.waimai.store.goods.list.delegate.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.list.delegate.impl.e.a():boolean");
    }
}
