package com.sankuai.waimai.store.drug.home.refactor;

import android.app.Activity;
import android.arch.lifecycle.k;
import android.arch.lifecycle.q;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alipay.sdk.app.PayTask;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.store.assembler.component.AssemblerView;
import com.sankuai.waimai.store.assembler.component.PageEventHandler;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.home.DrugHomeActivity;
import com.sankuai.waimai.store.drug.home.DrugHomePoiIdManager;
import com.sankuai.waimai.store.drug.home.new_home.realtime.NewDrugHomeRealtimeViewModel;
import com.sankuai.waimai.store.drug.home.new_home.realtime.ShoppingGuideRealtimeData;
import com.sankuai.waimai.store.drug.home.new_home.realtime.ShoppingGuideRealtimeViewModel;
import com.sankuai.waimai.store.drug.home.newp.contract.a;
import com.sankuai.waimai.store.drug.home.refactor.bean.PoiLocationAddress;
import com.sankuai.waimai.store.drug.home.refactor.bean.PoiResult;
import com.sankuai.waimai.store.drug.home.refactor.card.float_card.FloatCardViewModule;
import com.sankuai.waimai.store.drug.home.refactor.card.float_card.c;
import com.sankuai.waimai.store.drug.home.tab.TabViewModel;
import com.sankuai.waimai.store.drug.newwidgets.DrugNetInfoLoadView;
import com.sankuai.waimai.store.i.user.a;
import com.sankuai.waimai.store.newwidgets.pullrefresh.SCNestedPullRefreshView;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.repository.model.DrugTabItem;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.repository.net.b;
import com.sankuai.waimai.store.util.SGLocationUtils;
import com.sankuai.waimai.store.util.monitor.monitor.SGChannelPageLoad;
import com.sankuai.waimai.store.util.v;
import com.sankuai.waimai.store.util.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugPoiTemplate extends com.sankuai.waimai.store.k implements a.b, k, com.sankuai.waimai.store.i.user.a {
    public static ChangeQuickRedirect i;
    private boolean A;
    private boolean B;
    private boolean C;
    protected DrugNetInfoLoadView j;
    protected PoiPageViewModel k;
    protected TabViewModel l;
    protected com.sankuai.waimai.store.param.a m;
    protected boolean n;
    protected WMLocation o;
    private ImageView p;
    private SCNestedPullRefreshView q;
    private AssemblerView r;
    private ShoppingGuideRealtimeViewModel s;
    private PageEventHandler t;
    private final a.InterfaceC1155a u;
    private com.sankuai.waimai.store.manager.marketing.a v;
    private a w;
    private j x;
    private PoiPageLifecycleManager y;
    private int z;

    public DrugPoiTemplate(@NonNull Fragment fragment, @NonNull com.sankuai.waimai.store.param.a aVar) {
        super(fragment);
        Object[] objArr = {fragment, aVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aec2bd6b11f92eeca65b6b11772c76db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aec2bd6b11f92eeca65b6b11772c76db");
            return;
        }
        this.n = true;
        this.z = -1;
        this.A = true;
        this.B = true;
        this.C = true;
        this.m = aVar;
        this.u = new com.sankuai.waimai.store.drug.home.newp.presenter.a(this, aVar);
    }

    @Override // com.meituan.android.cube.core.f
    /* renamed from: r */
    public final DrugHomeActivity l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e14a316812720919fcb827db9c3369b2", RobustBitConfig.DEFAULT_VALUE) ? (DrugHomeActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e14a316812720919fcb827db9c3369b2") : (DrugHomeActivity) super.l();
    }

    @Override // com.meituan.android.cube.core.f
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "724b7f261a2125d26ba35a3df8ce7470", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "724b7f261a2125d26ba35a3df8ce7470");
        }
        try {
            return z.a(l(), R.layout.wm_drug_poi_vertical_template_new, viewGroup, false);
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return null;
        }
    }

    @Override // com.meituan.android.cube.core.f
    public void a_(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33231f38b5c3dfea38731da08e23af85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33231f38b5c3dfea38731da08e23af85");
            return;
        }
        super.a_(view);
        this.y = new PoiPageLifecycleManager(l());
        this.y.b = this;
        this.k = (PoiPageViewModel) q.a((FragmentActivity) l()).a(PoiPageViewModel.class);
        this.l = (TabViewModel) q.a((FragmentActivity) l()).a(TabViewModel.class);
        this.t = (PageEventHandler) q.a((FragmentActivity) l()).a(PageEventHandler.class);
        this.q = (SCNestedPullRefreshView) a(R.id.pull_to_refresh_view);
        this.r = (AssemblerView) a(R.id.assembler_view);
        this.r.setEnableReceiveGlobalState(true);
        this.r.setForbidDelay(true);
        this.j = (DrugNetInfoLoadView) a(R.id.net_layout_info_poi_list);
        this.j.setReloadClickListener(b.a(this));
        this.x = new j(l(), l(), this.r.getCardOperator());
        this.q.a(new com.sankuai.waimai.store.newwidgets.pullrefresh.c() { // from class: com.sankuai.waimai.store.drug.home.refactor.DrugPoiTemplate.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.c
            public final void a(com.sankuai.waimai.store.newwidgets.pullrefresh.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8159950c705d75a13c9fd65d56ad4dbe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8159950c705d75a13c9fd65d56ad4dbe");
                    return;
                }
                DrugPoiTemplate.this.k.e.b((android.arch.lifecycle.k<Boolean>) Boolean.TRUE);
                DrugPoiTemplate.this.C();
            }
        });
        PageEventHandler pageEventHandler = this.t;
        DrugHomeActivity l = l();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        pageEventHandler.a(l, com.sankuai.waimai.store.drug.home.refactor.event.a.class, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "571cb5c0ee27c11475a5393e403092bc", RobustBitConfig.DEFAULT_VALUE) ? (android.arch.lifecycle.l) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "571cb5c0ee27c11475a5393e403092bc") : new c(this));
        this.o = com.sankuai.waimai.store.locate.a.b();
        s();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = i;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c2243299d9821c9e2c9da8dfdb15d0f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c2243299d9821c9e2c9da8dfdb15d0f1");
        } else if (this.w == null) {
            this.w = new a();
            DrugHomeActivity l2 = l();
            if (l2 != null) {
                l2.registerReceiver(this.w, new IntentFilter("WMSMMRNCreateInquirySuccessNotification"));
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = i;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "341aa2457ec4d687795deb7b3b9be771", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "341aa2457ec4d687795deb7b3b9be771");
            return;
        }
        this.p = new ImageView(l());
        int a2 = com.sankuai.shangou.stone.util.h.a(l(), 24.0f);
        int a3 = com.sankuai.shangou.stone.util.h.a(l(), 12.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
        layoutParams.leftMargin = a3;
        layoutParams.topMargin = a3 + u.a();
        this.p.setLayoutParams(layoutParams);
        this.p.setScaleType(ImageView.ScaleType.FIT_XY);
        this.p.setBackgroundResource(R.drawable.wm_drug_home_arrow);
        ((FrameLayout) a(R.id.fl_template_root)).addView(this.p, layoutParams);
        this.p.setOnClickListener(d.a(this));
    }

    public static /* synthetic */ void c(DrugPoiTemplate drugPoiTemplate, View view) {
        Object[] objArr = {drugPoiTemplate, view};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1cc2e0f164b51c1f9a438f43e5b70e60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1cc2e0f164b51c1f9a438f43e5b70e60");
        } else {
            drugPoiTemplate.v();
        }
    }

    public static /* synthetic */ void a(DrugPoiTemplate drugPoiTemplate, com.sankuai.waimai.store.drug.home.refactor.event.a aVar) {
        Object[] objArr = {drugPoiTemplate, aVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42c750736ae03a38a2bc36fd7125498c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42c750736ae03a38a2bc36fd7125498c");
        } else {
            drugPoiTemplate.G();
        }
    }

    private void G() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d76783eb053b248dc16b796118c52ed6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d76783eb053b248dc16b796118c52ed6");
        } else if (w()) {
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.m.G, "b_Yvu0k").a();
            if (l() != null) {
                l().finish();
            }
        }
    }

    public static /* synthetic */ void b(DrugPoiTemplate drugPoiTemplate, View view) {
        Object[] objArr = {drugPoiTemplate, view};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e385289d06a53c7f07fdb4592283841", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e385289d06a53c7f07fdb4592283841");
        } else {
            drugPoiTemplate.G();
        }
    }

    private void H() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fce897a3edee0337b008c8132388c60c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fce897a3edee0337b008c8132388c60c");
            return;
        }
        u.c(this.p);
        this.j.c();
    }

    public void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2b45ba78f55d23934595373679b6cc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2b45ba78f55d23934595373679b6cc9");
            return;
        }
        com.sankuai.waimai.store.manager.user.a.a().b((com.sankuai.waimai.store.i.user.a) this);
        com.meituan.android.bus.a.a().a(this);
        t();
    }

    public void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f810d12991ea3a5c9019e8901edfb39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f810d12991ea3a5c9019e8901edfb39");
            return;
        }
        D();
        u();
    }

    public final void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "674929ba6f098f843cf47a9a2c8728a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "674929ba6f098f843cf47a9a2c8728a3");
        } else {
            l().g().recordStep("page_api_start");
        }
    }

    public void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "429d0ba1b4d762925eeba08584e9b55d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "429d0ba1b4d762925eeba08584e9b55d");
        } else {
            D();
        }
    }

    private void a(int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b13e07e8742593becfca359cd266e51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b13e07e8742593becfca359cd266e51");
        } else if (this.v != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("drug_new_home_page", 1);
            hashMap.put("page_type", String.valueOf(i2));
            hashMap.put("category_type", String.valueOf(this.m.c));
            hashMap.put("second_category_type", String.valueOf(this.m.f));
            if (z) {
                hashMap.put("dialogs", "DRUG_NEW_USER_STAY");
            }
            if (com.sankuai.waimai.store.config.d.h().a("marketingc/drug_home", true)) {
                this.v.a(hashMap, bb_(), 1000);
            } else {
                this.v.a(hashMap, bb_());
            }
        }
    }

    public boolean w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c2f05a7acecf2af47aa3172a3fe5139", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c2f05a7acecf2af47aa3172a3fe5139")).booleanValue() : (this.v == null || this.v.g()) ? false : true;
    }

    @Override // com.sankuai.waimai.store.k
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fb516b9158e1355a9a17cb0d3d468a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fb516b9158e1355a9a17cb0d3d468a1");
            return;
        }
        super.a(z);
        if (this.t != null) {
            this.t.a((PageEventHandler) new com.sankuai.waimai.store.drug.home.newp.block.rxevent.a(z));
        }
        if (this.v != null) {
            if (z) {
                this.v.h();
            } else {
                this.v.i();
            }
        }
    }

    public void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d36f841ef40c8f4a43f2d51b0bf9f652", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d36f841ef40c8f4a43f2d51b0bf9f652");
            return;
        }
        WMLocation b = com.sankuai.waimai.store.locate.a.b();
        if (b == null || !this.k.o || SGLocationUtils.a(this.o, b)) {
            return;
        }
        this.m.f = "0";
        this.o = b;
        this.k.f.b((android.arch.lifecycle.k<PoiLocationAddress>) new PoiLocationAddress(com.sankuai.waimai.store.locate.a.d(), true));
        this.t.a((PageEventHandler) new com.sankuai.waimai.store.drug.home.newp.block.rxevent.c(true));
        y();
        C();
    }

    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fbceeb9a966586d26799f48dd1350e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fbceeb9a966586d26799f48dd1350e6");
            return;
        }
        this.m.g = 0L;
        this.m.i = null;
        this.m.j = null;
        this.m.K = 0;
    }

    @Subscribe
    public void onBindMemberCardSuccess(com.sankuai.waimai.store.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8acbe5ea891ec8dc1ab6a7e68dec3c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8acbe5ea891ec8dc1ab6a7e68dec3c1");
        } else {
            D();
        }
    }

    @Subscribe
    public void onPoiListCouponStatusChangedEvent(com.sankuai.waimai.store.poilist.event.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86134c528b41a3c3ac9973e40010bb37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86134c528b41a3c3ac9973e40010bb37");
        } else if (bVar == null || this.m.y) {
        } else {
            C();
            b(bVar.c);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMachDialogCouponReceiveSuccess(com.sankuai.waimai.store.event.i iVar) {
        String str;
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32be130b3d914c6e62a9581b8fd6e935", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32be130b3d914c6e62a9581b8fd6e935");
        } else if (iVar == null || this.m.y) {
        } else {
            C();
            String str2 = null;
            if (iVar.b == null || iVar.b.get("couponStatus") == null) {
                str = null;
            } else {
                str2 = String.valueOf(iVar.b.get("couponStatus"));
                str = String.valueOf(iVar.b.get("behavior"));
            }
            if ("no_update_dialog".equals(str)) {
                return;
            }
            b(str2);
        }
    }

    private void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5a3841b3d510f040962072df2b43b20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5a3841b3d510f040962072df2b43b20");
        } else if ("1".equals(str) && this.m.i()) {
            a(2, true);
        }
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.EnumC1205a enumC1205a) {
        Object[] objArr = {enumC1205a};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1d55b694a04ad71d067e60e19f2216f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1d55b694a04ad71d067e60e19f2216f");
        } else if (enumC1205a != null) {
            if ((enumC1205a == a.EnumC1205a.LOGIN || enumC1205a == a.EnumC1205a.LOGOUT) && !com.sankuai.waimai.store.util.b.a(l())) {
                D();
            }
        }
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf7d76afc7ae3f48ac421dcd1a6f10b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf7d76afc7ae3f48ac421dcd1a6f10b3");
        } else {
            D();
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.newp.contract.a.b
    public final String bb_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b5fe21a210cc21f4ef437b115fdfd12", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b5fe21a210cc21f4ef437b115fdfd12") : o();
    }

    @Override // com.sankuai.waimai.store.drug.home.newp.contract.a.b
    public final void a(String str, com.sankuai.waimai.store.repository.net.b bVar, boolean z, boolean z2) {
        Object[] objArr = {str, bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d17746e79b15662fec522524da7682af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d17746e79b15662fec522524da7682af");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            if (z2) {
                str = l().getString(R.string.wm_sc_common_net_error_info);
            } else {
                str = l().getString(R.string.wm_sc_common_poi_list_empty_tip);
            }
        }
        I();
        if (this.q.b()) {
            com.sankuai.waimai.platform.utils.m.a((Activity) l(), str, (Throwable) com.sankuai.waimai.store.drug.util.a.c(bVar));
            H();
        } else if (z2) {
            this.j.a(str, com.sankuai.waimai.store.drug.util.a.a(bVar));
        } else {
            this.j.c(str, com.sankuai.waimai.store.drug.util.a.a(bVar));
        }
        this.q.a();
        if (A()) {
            l().g().recordStep(this.m.ai ? "activity_data_ready_with_locating_drug" : "activity_data_ready_no_locating_drug");
            com.sankuai.meituan.takeoutnew.util.aop.h.a(l().g().recordStep("activity_data_ready_drug"));
        }
        if (this.m.y || !z) {
            return;
        }
        com.sankuai.waimai.store.util.monitor.c.a(SGChannelPageLoad.RequestAPIError, "", "");
    }

    private void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a025b294ccf0068e6a33e029e1a60994", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a025b294ccf0068e6a33e029e1a60994");
            return;
        }
        this.j.setReloadButtonText(R.string.wm_sc_common_reload);
        this.j.setReloadClickListener(e.a(this));
    }

    public static /* synthetic */ void a(DrugPoiTemplate drugPoiTemplate, View view) {
        Object[] objArr = {drugPoiTemplate, view};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce80d9ba47edb6924e18485c70cc357c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce80d9ba47edb6924e18485c70cc357c");
        } else {
            drugPoiTemplate.v();
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.newp.contract.a.b
    public final void a(PoiVerticalityDataResponse poiVerticalityDataResponse, com.sankuai.waimai.store.param.a aVar, boolean z, boolean z2) {
        String str;
        Object[] objArr = {poiVerticalityDataResponse, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e8e837efba25b9612a84a3785fe0636", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e8e837efba25b9612a84a3785fe0636");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = i;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16ab130037d063d90cc82143c2710f08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16ab130037d063d90cc82143c2710f08");
        } else if (com.sankuai.waimai.store.manager.user.a.a().b() && this.C) {
            this.C = false;
            Object[] objArr3 = {2};
            ChangeQuickRedirect changeQuickRedirect3 = i;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "96a9a495309e45f42a0bd17bc793ece7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "96a9a495309e45f42a0bd17bc793ece7");
            } else {
                if (this.v == null) {
                    this.v = new com.sankuai.waimai.store.manager.marketing.a(l(), i(), 2);
                    this.v.g = new com.sankuai.waimai.store.manager.marketing.parser.inner.mach.c() { // from class: com.sankuai.waimai.store.drug.home.refactor.DrugPoiTemplate.2
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
                        @Override // com.sankuai.waimai.store.manager.marketing.parser.inner.mach.c
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void a(com.sankuai.waimai.store.mach.event.a r22, java.lang.String r23, @android.support.annotation.NonNull java.util.Map<java.lang.String, java.lang.Object> r24) {
                            /*
                                Method dump skipped, instructions count: 248
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.drug.home.refactor.DrugPoiTemplate.AnonymousClass2.a(com.sankuai.waimai.store.mach.event.a, java.lang.String, java.util.Map):void");
                        }
                    };
                    this.v.h = new com.sankuai.waimai.store.manager.marketing.action.b() { // from class: com.sankuai.waimai.store.drug.home.refactor.DrugPoiTemplate.3
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.manager.marketing.action.b
                        public final void a(String str2, com.sankuai.waimai.store.manager.marketing.action.d dVar) {
                            Object[] objArr4 = {str2, dVar};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fa22bebee784c7ec2cbbd6acd71b57a7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fa22bebee784c7ec2cbbd6acd71b57a7");
                                return;
                            }
                            com.sankuai.waimai.store.drug.home.refactor.card.float_card.c a2 = com.sankuai.waimai.store.drug.home.refactor.card.float_card.c.a();
                            Object[] objArr5 = {str2, dVar};
                            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.drug.home.refactor.card.float_card.c.a;
                            if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "534f8260f88e436b97b58e970ddb1121", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "534f8260f88e436b97b58e970ddb1121");
                                return;
                            }
                            if (com.sankuai.shangou.stone.util.a.a((List) a2.d) == 0 && a2.b != null) {
                                a2.b.a(str2, dVar);
                            }
                            c.a aVar2 = new c.a();
                            aVar2.a = str2;
                            aVar2.b = dVar;
                            a2.d.add(aVar2);
                        }
                    };
                }
                a(2, false);
            }
        }
        this.q.a();
        StringBuilder sb = new StringBuilder();
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = i;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "340df376381d3e76d40d8fb500900cc9", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "340df376381d3e76d40d8fb500900cc9");
        } else {
            str = v.c ? "drug_my_poi_786_mt,drug_my_poi_786_mt,drug_my_poi_786_mt,B1,B1_conf;" : v.b ? "drug_my_poi_786_wm,drug_my_poi_786_wm,drug_my_poi_786_wm,B1,B1_conf;" : "drug_my_poi_786_dp,drug_my_poi_786_dp,drug_my_poi_786_dp,B1,B1_conf;";
        }
        sb.append(str);
        sb.append(poiVerticalityDataResponse.getStids());
        aVar.T = sb.toString();
        J();
        this.s.c = poiVerticalityDataResponse.imTileRealtimeEnable;
        aVar.ah = poiVerticalityDataResponse.showOCRCamera;
        com.sankuai.waimai.store.drug.home.util.b.a(this.m, com.sankuai.waimai.store.drug.home.util.b.h, poiVerticalityDataResponse.mPriceOptAB == null ? "" : poiVerticalityDataResponse.mPriceOptAB.priceExpInfo);
        if (poiVerticalityDataResponse.searchCarouselTextInfo != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) poiVerticalityDataResponse.searchCarouselTextInfo.searchCarouselTextList)) {
            aVar.U = 1;
        }
        if (poiVerticalityDataResponse.backgroundConfig != null) {
            aVar.Y = poiVerticalityDataResponse.backgroundConfig.titleColorStyle == 0;
        }
        aVar.aa = (poiVerticalityDataResponse.drugBackgroundConfig == null || t.a(poiVerticalityDataResponse.drugBackgroundConfig.marketBgPicUrl)) ? false : true;
        aVar.v = poiVerticalityDataResponse.searchText;
        Object[] objArr5 = {poiVerticalityDataResponse, aVar};
        ChangeQuickRedirect changeQuickRedirect5 = i;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "b003476914f00c3b0dc4f9058f9f1622", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "b003476914f00c3b0dc4f9058f9f1622");
        } else if (A()) {
            if (this.v != null) {
                this.v.f();
                this.v.a(true);
            }
            this.m.L = poiVerticalityDataResponse.showPrimaryFilterTitle;
            this.m.M = poiVerticalityDataResponse.poiType;
            l().g().recordStep(this.m.ai ? "activity_data_ready_with_locating_drug" : "activity_data_ready_no_locating_drug");
            com.sankuai.meituan.takeoutnew.util.aop.h.a(l().g().recordStep("activity_data_ready_drug"));
            this.n = false;
            this.m.H = true;
        }
        List<DrugTabItem> list = poiVerticalityDataResponse.drugHomeTabList;
        ArrayList arrayList = new ArrayList();
        int a2 = com.sankuai.shangou.stone.util.a.a((List) list);
        if (a2 > 0) {
            DrugTabItem drugTabItem = new DrugTabItem();
            drugTabItem.tabId = 0;
            drugTabItem.tabName = com.sankuai.waimai.store.util.b.a(l(), (int) R.string.wm_sc_init_page);
            arrayList.add(new com.sankuai.waimai.store.drug.home.tab.g(drugTabItem));
            for (int i2 = 0; i2 < a2; i2++) {
                arrayList.add(new com.sankuai.waimai.store.drug.home.tab.g(list.get(i2)));
            }
            TabViewModel tabViewModel = this.l;
            Object[] objArr6 = {arrayList};
            ChangeQuickRedirect changeQuickRedirect6 = TabViewModel.a;
            if (PatchProxy.isSupport(objArr6, tabViewModel, changeQuickRedirect6, false, "728fb23e50b8f9003d834a05cd61cca0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, tabViewModel, changeQuickRedirect6, false, "728fb23e50b8f9003d834a05cd61cca0");
            } else {
                if (tabViewModel.b == null) {
                    tabViewModel.b = new android.arch.lifecycle.k<>();
                }
                tabViewModel.b.b((android.arch.lifecycle.k<List<com.sankuai.waimai.store.drug.home.tab.g>>) arrayList);
            }
        }
        PoiResult a3 = this.k.b.a();
        if (a3 == null) {
            a3 = new PoiResult();
        }
        PoiResult poiResult = a3;
        poiResult.response = poiVerticalityDataResponse;
        poiResult.isFirstLoaded = A();
        this.k.b.b((android.arch.lifecycle.k<PoiResult>) poiResult);
        Object[] objArr7 = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect7 = i;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "8cef9dfadab6e03a359b39c757205784", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "8cef9dfadab6e03a359b39c757205784");
        } else if (poiVerticalityDataResponse != null) {
            if (com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.moduleList)) {
                com.sankuai.waimai.store.drug.home.refactor.cat.a.a(this.m, "接口返回数据异常", -999);
                I();
                this.j.c(com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_common_poi_list_empty_tip), null);
            } else {
                H();
            }
        }
        com.sankuai.waimai.store.expose.v2.b.a().f(l());
        if (!this.m.y && poiResult.isFirstLoaded) {
            com.sankuai.waimai.store.util.monitor.c.a(SGChannelPageLoad.Normal);
        }
        if (this.m.ag > 0) {
            com.sankuai.waimai.store.manager.judas.b.b(l(), "b_waimai_sg_472ca63s_mv").a("duration", Long.valueOf(SystemClock.elapsedRealtime() - this.m.ag)).a();
            this.m.ag = -1L;
        }
    }

    private void J() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63d3f4d4220dcab8e2b2e42b566a1228", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63d3f4d4220dcab8e2b2e42b566a1228");
        } else if (this.s == null) {
            this.s = (ShoppingGuideRealtimeViewModel) q.a((FragmentActivity) l()).a(ShoppingGuideRealtimeViewModel.class);
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.newp.contract.a.b
    public final void a(@Nullable PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c444a65537edaf7d2d4ac4091a7f9f6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c444a65537edaf7d2d4ac4091a7f9f6b");
            return;
        }
        if (!com.sankuai.waimai.store.util.b.a(l())) {
            ((PageEventHandler) q.a((FragmentActivity) l()).a(PageEventHandler.class)).a((PageEventHandler) new com.sankuai.waimai.store.drug.home.refactor.event.d(false));
        }
        if (this.k.b.a() != null && this.m != null && poiVerticalityDataResponse != null) {
            this.m.O = com.sankuai.shangou.stone.util.a.a((List) poiVerticalityDataResponse.categoryInfos) > 1;
            this.m.Q = poiVerticalityDataResponse.showCategoryTagIconStid;
            Object[] objArr2 = {poiVerticalityDataResponse};
            ChangeQuickRedirect changeQuickRedirect2 = i;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2021163ea1d79b70e7938889591868fc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2021163ea1d79b70e7938889591868fc");
            } else {
                CategoryInfo categoryInfo = (CategoryInfo) com.sankuai.shangou.stone.util.a.a((List<Object>) poiVerticalityDataResponse.categoryInfos, 0);
                com.sankuai.waimai.store.drug.home.util.b.a(this.m, com.sankuai.waimai.store.drug.home.util.b.d, categoryInfo != null ? categoryInfo.code : "0");
            }
            if (!TextUtils.isEmpty(poiVerticalityDataResponse.getStids())) {
                if (!TextUtils.isEmpty(this.m.T)) {
                    com.sankuai.waimai.store.param.a aVar = this.m;
                    aVar.V = this.m.T + ";" + poiVerticalityDataResponse.getStids();
                } else {
                    this.m.V = poiVerticalityDataResponse.getStids();
                }
            }
            this.m.K = poiVerticalityDataResponse.templateCode;
        }
        this.k.c.b((android.arch.lifecycle.k<PoiVerticalityDataResponse>) poiVerticalityDataResponse);
    }

    public final boolean z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1752804b2ed26ea18355c7584e5ae2f9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1752804b2ed26ea18355c7584e5ae2f9")).booleanValue() : this.u.a();
    }

    public final boolean A() {
        return this.n || this.m.n == 0;
    }

    @Override // com.sankuai.waimai.store.drug.home.newp.contract.a.b
    public final void a(com.sankuai.waimai.store.param.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff8c0cda5bd19b9ed9c855f5b4cb4d76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff8c0cda5bd19b9ed9c855f5b4cb4d76");
        } else if (this.q.b()) {
        } else {
            this.j.a();
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.newp.contract.a.b
    public final long c() {
        return this.m.g;
    }

    @Override // com.sankuai.waimai.store.drug.home.newp.contract.a.b
    public final String d() {
        return this.m.i;
    }

    @Override // com.sankuai.waimai.store.drug.home.newp.contract.a.b
    public final String e() {
        return this.m.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        public a() {
            Object[] objArr = {DrugPoiTemplate.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8708552ad1bf181fe01d85a3f843cfdd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8708552ad1bf181fe01d85a3f843cfdd");
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0c9b53d4b5569dd8d31146ff9bde1aa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0c9b53d4b5569dd8d31146ff9bde1aa");
            } else if (intent != null && "WMSMMRNCreateInquirySuccessNotification".equals(intent.getAction())) {
                ad.a(new Runnable() { // from class: com.sankuai.waimai.store.drug.home.refactor.DrugPoiTemplate.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e3e347cfebff3c30592c636a672e403", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e3e347cfebff3c30592c636a672e403");
                        } else {
                            DrugPoiTemplate.this.C();
                        }
                    }
                }, 500L);
            }
        }
    }

    public final void B() {
        if (this.m != null) {
            this.m.f = "0";
        }
    }

    public void C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89a95149491588fd13003be1b5fae286", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89a95149491588fd13003be1b5fae286");
        } else if (this.A) {
            this.z = -1;
            this.u.a(1);
        } else {
            this.z = 1;
        }
    }

    public final void D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8e58dc00ddbeef86ef611c57a95e406", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8e58dc00ddbeef86ef611c57a95e406");
        } else if (this.A) {
            this.z = -1;
            this.u.a(0);
        } else {
            this.z = 0;
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.k
    public final void a(m mVar) {
        boolean z;
        final boolean z2;
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29722c3c429f7f8a766387d73fa229a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29722c3c429f7f8a766387d73fa229a9");
        } else if (mVar == m.STATE_ON_RESUME) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = i;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "db2ceb8654b9359d5c13c8d21cf5b951", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "db2ceb8654b9359d5c13c8d21cf5b951");
                return;
            }
            boolean z3 = !this.B;
            if (this.B) {
                this.B = false;
            } else {
                com.sankuai.waimai.store.expose.v2.b.a().d(l());
                x();
                this.k.o = false;
            }
            boolean b = com.sankuai.waimai.store.manager.user.a.a().b();
            if (b && z3 && !this.u.b() && this.z == -1 && SGLocationUtils.a(this.o, com.sankuai.waimai.store.locate.a.b())) {
                final NewDrugHomeRealtimeViewModel newDrugHomeRealtimeViewModel = (NewDrugHomeRealtimeViewModel) q.a((FragmentActivity) l()).a(NewDrugHomeRealtimeViewModel.class);
                final DrugHomeActivity l = l();
                final com.sankuai.waimai.store.param.a aVar = this.m;
                Object[] objArr3 = {l, aVar};
                ChangeQuickRedirect changeQuickRedirect3 = NewDrugHomeRealtimeViewModel.a;
                if (PatchProxy.isSupport(objArr3, newDrugHomeRealtimeViewModel, changeQuickRedirect3, false, "2050ce1538f855b7f53732d5ec92e8bb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, newDrugHomeRealtimeViewModel, changeQuickRedirect3, false, "2050ce1538f855b7f53732d5ec92e8bb");
                } else {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = NewDrugHomeRealtimeViewModel.a;
                    if (PatchProxy.isSupport(objArr4, newDrugHomeRealtimeViewModel, changeQuickRedirect4, false, "d28753926b274847fcd0fb755cc48c82", RobustBitConfig.DEFAULT_VALUE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, newDrugHomeRealtimeViewModel, changeQuickRedirect4, false, "d28753926b274847fcd0fb755cc48c82")).booleanValue();
                    } else {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = NewDrugHomeRealtimeViewModel.a;
                        if (PatchProxy.isSupport(objArr5, newDrugHomeRealtimeViewModel, changeQuickRedirect5, false, "f5e4f461f0f5cb050e0fcd4874770ac3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, newDrugHomeRealtimeViewModel, changeQuickRedirect5, false, "f5e4f461f0f5cb050e0fcd4874770ac3");
                        } else if (!newDrugHomeRealtimeViewModel.h) {
                            String a2 = com.sankuai.waimai.store.config.d.h().a("drug_homepage/category_realtime_bid_whitelist_v2", "");
                            if (!TextUtils.isEmpty(a2)) {
                                String[] split = a2.split(CommonConstant.Symbol.COMMA);
                                if (!com.sankuai.shangou.stone.util.a.b(split)) {
                                    for (String str : split) {
                                        if (!TextUtils.isEmpty(str)) {
                                            newDrugHomeRealtimeViewModel.g.add(str);
                                        }
                                    }
                                }
                            }
                            newDrugHomeRealtimeViewModel.h = true;
                        }
                        z2 = newDrugHomeRealtimeViewModel.j && newDrugHomeRealtimeViewModel.b() && (TextUtils.isEmpty(newDrugHomeRealtimeViewModel.k) || !newDrugHomeRealtimeViewModel.g.contains(newDrugHomeRealtimeViewModel.k));
                    }
                    if (newDrugHomeRealtimeViewModel.c != null && (!com.sankuai.shangou.stone.util.a.b(newDrugHomeRealtimeViewModel.d) || newDrugHomeRealtimeViewModel.e != null)) {
                        newDrugHomeRealtimeViewModel.a(newDrugHomeRealtimeViewModel.f);
                        newDrugHomeRealtimeViewModel.f = newDrugHomeRealtimeViewModel.e();
                        com.sankuai.waimai.store.base.net.k<PoiVerticalityDataResponse> kVar = new com.sankuai.waimai.store.base.net.k<PoiVerticalityDataResponse>() { // from class: com.sankuai.waimai.store.drug.home.new_home.realtime.NewDrugHomeRealtimeViewModel.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                            public final /* synthetic */ void a(Object obj) {
                                PoiVerticalityDataResponse poiVerticalityDataResponse = (PoiVerticalityDataResponse) obj;
                                Object[] objArr6 = {poiVerticalityDataResponse};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "8064417ee83b29adce7fb72d575e81ca", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "8064417ee83b29adce7fb72d575e81ca");
                                    return;
                                }
                                DrugHomePoiIdManager.a(l, poiVerticalityDataResponse);
                                NewDrugHomeRealtimeViewModel.this.f();
                                NewDrugHomeRealtimeViewModel.a(NewDrugHomeRealtimeViewModel.this, l, aVar, poiVerticalityDataResponse, z2);
                            }

                            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                            public final void a(b bVar) {
                                Object[] objArr6 = {bVar};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "0bb3793f7cf7bb1edec8d3789de44ec8", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "0bb3793f7cf7bb1edec8d3789de44ec8");
                                } else {
                                    NewDrugHomeRealtimeViewModel.this.f();
                                }
                            }
                        };
                        newDrugHomeRealtimeViewModel.d();
                        Pair<String, String> a3 = DrugHomePoiIdManager.a((SCBaseActivity) l, newDrugHomeRealtimeViewModel.f.e);
                        com.sankuai.waimai.store.drug.base.net.b.a(newDrugHomeRealtimeViewModel.f.a).a(kVar, 1, true, r.a(newDrugHomeRealtimeViewModel.c.code, 0L), newDrugHomeRealtimeViewModel.c.categoryCodeType, (String) com.sankuai.waimai.store.drug.home.util.b.b(aVar, com.sankuai.waimai.store.drug.home.util.b.e, ""), 0, newDrugHomeRealtimeViewModel.c.rankTraceId, Statistics.getSession(), com.sankuai.waimai.store.drug.home.model.b.a(), newDrugHomeRealtimeViewModel.f.b, newDrugHomeRealtimeViewModel.f.d, (String) a3.first, (String) a3.second, z2);
                    } else if (z2) {
                        newDrugHomeRealtimeViewModel.a(newDrugHomeRealtimeViewModel.f);
                        newDrugHomeRealtimeViewModel.f = newDrugHomeRealtimeViewModel.e();
                        com.sankuai.waimai.store.base.net.k<PoiVerticalityDataResponse> kVar2 = new com.sankuai.waimai.store.base.net.k<PoiVerticalityDataResponse>() { // from class: com.sankuai.waimai.store.drug.home.new_home.realtime.NewDrugHomeRealtimeViewModel.2
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                            public final /* synthetic */ void a(Object obj) {
                                PoiVerticalityDataResponse poiVerticalityDataResponse = (PoiVerticalityDataResponse) obj;
                                Object[] objArr6 = {poiVerticalityDataResponse};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "9aac0c4a0b72721f86871102e2088c8c", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "9aac0c4a0b72721f86871102e2088c8c");
                                    return;
                                }
                                DrugHomePoiIdManager.a(l, poiVerticalityDataResponse);
                                NewDrugHomeRealtimeViewModel.this.f();
                                if (NewDrugHomeRealtimeViewModel.this.b()) {
                                    com.sankuai.waimai.store.drug.home.new_home.util.a.a(l, poiVerticalityDataResponse, aVar, false);
                                    NewDrugHomeRealtimeViewModel.this.o.b((k) poiVerticalityDataResponse);
                                }
                            }

                            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                            public final void a(b bVar) {
                                Object[] objArr6 = {bVar};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "01fc505a85f3fac65ce2bb448ec1cd87", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "01fc505a85f3fac65ce2bb448ec1cd87");
                                } else {
                                    NewDrugHomeRealtimeViewModel.this.f();
                                }
                            }
                        };
                        newDrugHomeRealtimeViewModel.d();
                        com.sankuai.waimai.store.drug.base.net.b.a(newDrugHomeRealtimeViewModel.f.a).a(kVar2, 1, false, r.a(newDrugHomeRealtimeViewModel.i.code, 0L), newDrugHomeRealtimeViewModel.i.categoryCodeType, (String) com.sankuai.waimai.store.drug.home.util.b.b(aVar, com.sankuai.waimai.store.drug.home.util.b.e, ""), 0, newDrugHomeRealtimeViewModel.i.rankTraceId, Statistics.getSession(), com.sankuai.waimai.store.drug.home.model.b.a(), 0, 0, "", "", true);
                    }
                }
            }
            if (this.z != -1) {
                this.u.a(this.z);
                this.z = -1;
            }
            if (b && z3) {
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = i;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "1133ff7ea92e03da23ecfd9dbedbe0e4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "1133ff7ea92e03da23ecfd9dbedbe0e4");
                } else {
                    J();
                    if (!this.u.b()) {
                        final ShoppingGuideRealtimeViewModel shoppingGuideRealtimeViewModel = this.s;
                        Object[] objArr7 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect7 = ShoppingGuideRealtimeViewModel.a;
                        if (PatchProxy.isSupport(objArr7, shoppingGuideRealtimeViewModel, changeQuickRedirect7, false, "44d1c4e57ff3b5c392e19f57a0842b3b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, shoppingGuideRealtimeViewModel, changeQuickRedirect7, false, "44d1c4e57ff3b5c392e19f57a0842b3b");
                        } else {
                            Object[] objArr8 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect8 = ShoppingGuideRealtimeViewModel.a;
                            if (PatchProxy.isSupport(objArr8, shoppingGuideRealtimeViewModel, changeQuickRedirect8, false, "d108edb096ff7584d8358100c9e51fe9", RobustBitConfig.DEFAULT_VALUE)) {
                                z = ((Boolean) PatchProxy.accessDispatch(objArr8, shoppingGuideRealtimeViewModel, changeQuickRedirect8, false, "d108edb096ff7584d8358100c9e51fe9")).booleanValue();
                            } else {
                                z = shoppingGuideRealtimeViewModel.c && (TextUtils.isEmpty(shoppingGuideRealtimeViewModel.d) || !shoppingGuideRealtimeViewModel.b.contains(shoppingGuideRealtimeViewModel.d));
                            }
                            if (z) {
                                shoppingGuideRealtimeViewModel.c();
                                Object[] objArr9 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect9 = ShoppingGuideRealtimeViewModel.a;
                                shoppingGuideRealtimeViewModel.e = PatchProxy.isSupport(objArr9, shoppingGuideRealtimeViewModel, changeQuickRedirect9, false, "afd8c4a2b7eaa55cac53b991afe70113", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr9, shoppingGuideRealtimeViewModel, changeQuickRedirect9, false, "afd8c4a2b7eaa55cac53b991afe70113") : "ShoppingGuideRealtimeViewModel" + System.currentTimeMillis();
                                com.sankuai.waimai.store.base.net.k<ShoppingGuideRealtimeData> kVar3 = new com.sankuai.waimai.store.base.net.k<ShoppingGuideRealtimeData>() { // from class: com.sankuai.waimai.store.drug.home.new_home.realtime.ShoppingGuideRealtimeViewModel.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                                    public final /* synthetic */ void a(Object obj) {
                                        ShoppingGuideRealtimeData shoppingGuideRealtimeData = (ShoppingGuideRealtimeData) obj;
                                        Object[] objArr10 = {shoppingGuideRealtimeData};
                                        ChangeQuickRedirect changeQuickRedirect10 = a;
                                        if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "2d251c809aea63f42bf425adff582c72", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "2d251c809aea63f42bf425adff582c72");
                                            return;
                                        }
                                        if (shoppingGuideRealtimeData != null && shoppingGuideRealtimeData.jsonData != null) {
                                            shoppingGuideRealtimeData.jsonData.put("trace_id", TextUtils.concat(shoppingGuideRealtimeData.traceId, ""));
                                            if (shoppingGuideRealtimeData.extraInfo != null) {
                                                shoppingGuideRealtimeData.jsonData.put("api_stids", TextUtils.concat(shoppingGuideRealtimeData.extraInfo.stid, ""));
                                            }
                                        }
                                        shoppingGuideRealtimeViewModel.b().b((k) shoppingGuideRealtimeData);
                                    }

                                    @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                                    public final void b() {
                                        Object[] objArr10 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect10 = a;
                                        if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "3019e1b092603c75987f810a46fb1408", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "3019e1b092603c75987f810a46fb1408");
                                            return;
                                        }
                                        ShoppingGuideRealtimeViewModel.a(shoppingGuideRealtimeViewModel, null);
                                        shoppingGuideRealtimeViewModel.d();
                                    }
                                };
                                Object[] objArr10 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect10 = ShoppingGuideRealtimeViewModel.a;
                                if (PatchProxy.isSupport(objArr10, shoppingGuideRealtimeViewModel, changeQuickRedirect10, false, "ae7f3e747aa250f0465dfd47963a8988", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr10, shoppingGuideRealtimeViewModel, changeQuickRedirect10, false, "ae7f3e747aa250f0465dfd47963a8988");
                                } else {
                                    if (shoppingGuideRealtimeViewModel.f == null) {
                                        shoppingGuideRealtimeViewModel.f = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.waimai.store.drug.home.new_home.realtime.ShoppingGuideRealtimeViewModel.2
                                            public static ChangeQuickRedirect a;

                                            @Override // android.os.Handler
                                            public final void handleMessage(@NonNull Message message) {
                                                Object[] objArr11 = {message};
                                                ChangeQuickRedirect changeQuickRedirect11 = a;
                                                if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "c8de894b12ed49cd4cb853d41beec50c", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "c8de894b12ed49cd4cb853d41beec50c");
                                                    return;
                                                }
                                                super.handleMessage(message);
                                                shoppingGuideRealtimeViewModel.c();
                                            }
                                        };
                                    }
                                    shoppingGuideRealtimeViewModel.d();
                                    shoppingGuideRealtimeViewModel.f.sendEmptyMessageDelayed(0, PayTask.j);
                                }
                                com.sankuai.waimai.store.drug.base.net.b.a(shoppingGuideRealtimeViewModel.e).c(kVar3);
                            }
                        }
                    }
                    this.s.d = null;
                }
            }
            ((FloatCardViewModule) q.a((FragmentActivity) l()).a(FloatCardViewModule.class)).a(l());
        } else if (mVar == m.STATE_ON_DESTROY) {
            E();
        } else if (mVar == m.STATE_ON_START) {
            Object[] objArr11 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect11 = i;
            if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "042948a4c983d78667b178f9eac6c623", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "042948a4c983d78667b178f9eac6c623");
                return;
            }
            this.A = true;
            this.t.a((PageEventHandler) new com.sankuai.waimai.store.drug.home.refactor.event.e(true));
        } else if (mVar == m.STATE_ON_STOP) {
            Object[] objArr12 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect12 = i;
            if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "37801e5eb3f38d7296e4f08512c04f88", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "37801e5eb3f38d7296e4f08512c04f88");
                return;
            }
            this.A = false;
            this.t.a((PageEventHandler) new com.sankuai.waimai.store.drug.home.refactor.event.e(false));
        }
    }

    public void E() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca06879b9f8aa8856a01c28d105ebc9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca06879b9f8aa8856a01c28d105ebc9d");
            return;
        }
        com.sankuai.waimai.store.manager.user.a.a().a((com.sankuai.waimai.store.i.user.a) this);
        com.meituan.android.bus.a.a().b(this);
        if (this.v != null) {
            this.v.j();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = i;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6927e361da97631f5df6e585d555061e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6927e361da97631f5df6e585d555061e");
            return;
        }
        DrugHomeActivity l = l();
        if (l == null || this.w == null) {
            return;
        }
        l.unregisterReceiver(this.w);
        this.w = null;
    }

    public final void F() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3361a883ca5e0babd992597d64f574a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3361a883ca5e0babd992597d64f574a");
            return;
        }
        if (this.q.b() || this.q.d()) {
            this.q.a();
        }
        H();
    }
}
