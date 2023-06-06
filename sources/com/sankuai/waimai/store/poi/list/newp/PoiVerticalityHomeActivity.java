package com.sankuai.waimai.store.poi.list.newp;

import android.app.Activity;
import android.arch.lifecycle.k;
import android.arch.lifecycle.q;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.common.weaver.interfaces.ffp.FFPTags;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.mach.m;
import com.sankuai.waimai.store.assembler.component.PageEventHandler;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.SCBaseFragment;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.f;
import com.sankuai.waimai.store.l;
import com.sankuai.waimai.store.newwidgets.indicator.TabInfo;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.orderlist.OrderListFragment;
import com.sankuai.waimai.store.platform.domain.core.im.MessageUnreadInfoResponse;
import com.sankuai.waimai.store.poi.list.newp.block.rxevent.VisibleChangeEvent;
import com.sankuai.waimai.store.poi.list.newp.presenter.PoiVerticalityHomePresenter;
import com.sankuai.waimai.store.poi.list.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.poi.list.widget.c;
import com.sankuai.waimai.store.preLoad.d;
import com.sankuai.waimai.store.preLoad.e;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.ad;
import com.sankuai.waimai.store.util.af;
import com.sankuai.waimai.store.util.ag;
import com.sankuai.waimai.store.util.monitor.monitor.SGHomeLocationStrategy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiVerticalityHomeActivity extends PoiVerticalityChannelActivity implements FFPTags, com.sankuai.waimai.store.im.number.b, com.sankuai.waimai.store.poi.list.newp.contract.a, PoiVerticalityHomePresenter.a, c.a {
    public static ChangeQuickRedirect g;
    private d D;
    private LinearLayout h;
    private a i;
    private PoiVerticalityHomePresenter j;
    private int k;
    private long l;
    private b m;
    private PageEventHandler n;
    private c o;
    private PoiPageViewModel p;
    private boolean q;
    private boolean r;
    private boolean s;
    private final MetricsSpeedMeterTask t;
    private final MetricsSpeedMeterTask u;
    private final MetricsSpeedMeterTask v;

    @Override // com.sankuai.waimai.store.poi.list.newp.presenter.PoiVerticalityHomePresenter.a
    public final SCBaseActivity h() {
        return this;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.a
    public final /* bridge */ /* synthetic */ Context n() {
        return this;
    }

    public PoiVerticalityHomeActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ce2ca13244e8a06d32ecf83053d5aa4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ce2ca13244e8a06d32ecf83053d5aa4");
            return;
        }
        this.k = 0;
        this.l = 0L;
        this.t = MetricsSpeedMeterTask.createCustomSpeedMeterTask("store_home_agile_meter_task");
        this.u = MetricsSpeedMeterTask.createCustomSpeedMeterTask("store_home_normal_meter_task");
        this.v = MetricsSpeedMeterTask.createCustomSpeedMeterTask("store_home_mixed_meter_task");
    }

    public static /* synthetic */ boolean a(PoiVerticalityHomeActivity poiVerticalityHomeActivity, TabInfo tabInfo) {
        return b(tabInfo);
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.PoiVerticalityChannelActivity
    public final void g() {
        boolean z;
        boolean z2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "945dac1e2c64f14eac8488c395973604", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "945dac1e2c64f14eac8488c395973604");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d0c686a8c7830bd069c8b72f86fca35c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d0c686a8c7830bd069c8b72f86fca35c");
        } else if (!com.sankuai.waimai.store.manager.abtest.a.a(com.sankuai.waimai.store.pagingload.c.b).a() && com.sankuai.waimai.store.base.abtest.a.g() && !com.sankuai.waimai.store.locate.a.g() && !com.sankuai.waimai.store.poi.list.util.b.a().b()) {
            com.sankuai.waimai.store.fsp.a.a().a(bB_(), "start_location");
            com.sankuai.waimai.store.util.monitor.b.a().a(SGHomeLocationStrategy.NotLocation).a();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = g;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7d23434d3432207f8a4db9dfd8df8a56", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7d23434d3432207f8a4db9dfd8df8a56");
            } else {
                s().recordStep("home_pag_locate_start");
                if (this.b.y) {
                    s().recordStep("home_page_time_start_location");
                } else {
                    s().recordStep("channel_page_time_start_location");
                }
                af.a(this, "sg.channel.locationstart.native");
                com.sankuai.waimai.store.poilist.preload.c.a().b(this, com.sankuai.waimai.store.poilist.preload.b.a(), "dj-463886d6a4beb2bb");
                ab.b().a(bB_(), "key_time_last_location", System.currentTimeMillis());
            }
            this.b.bi = true;
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = g;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d9d8663c7c5ebf47498f6e3b5d6eec75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d9d8663c7c5ebf47498f6e3b5d6eec75");
        } else {
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.preLoad.b.a;
            this.D = new d(this, PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "61407ad7aef256e50d3273ab60d76198", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.preLoad.c) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "61407ad7aef256e50d3273ab60d76198") : new com.sankuai.waimai.store.preLoad.c() { // from class: com.sankuai.waimai.store.preLoad.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.preLoad.c
                @NotNull
                public final int[] a() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    return PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "551603314930f823a36257b09b1e2126", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "551603314930f823a36257b09b1e2126") : new int[]{R.layout.wm_sc_home_channel_refactor_page_container, R.layout.wm_sc_home_channel_refactor_page_list, R.layout.wm_sc_feed_list_filterbar_block_layout, R.layout.wm_sc_flower_filterbar_home_block, R.layout.wm_sc_filterbar_home_block};
                }

                @Override // com.sankuai.waimai.store.preLoad.c
                @NotNull
                public final int[] b() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    return PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "7e9a9414c0e7c23f4b923edf96543882", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "7e9a9414c0e7c23f4b923edf96543882") : new int[]{1, 2, 2, 2, 2};
                }

                @Override // com.sankuai.waimai.store.preLoad.c
                @NotNull
                public final int[] c() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    return PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "93776b21348ac2e79258138bb9cef7e5", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "93776b21348ac2e79258138bb9cef7e5") : new int[]{1, 2, 2, 2, 2};
                }
            });
            if (this.b != null) {
                this.b.bh = new e();
                e eVar = this.b.bh;
                d dVar = this.D;
                Object[] objArr6 = {dVar};
                ChangeQuickRedirect changeQuickRedirect6 = e.a;
                if (PatchProxy.isSupport(objArr6, eVar, changeQuickRedirect6, false, "724e6f648f73867f30bbc194a65553f5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, eVar, changeQuickRedirect6, false, "724e6f648f73867f30bbc194a65553f5");
                } else {
                    eVar.b = new WeakReference<>(dVar);
                }
            }
        }
        this.t.recordStep("activity_create");
        this.u.recordStep("activity_create");
        this.v.recordStep("activity_create");
        this.b.a(true);
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = g;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "53423bcb0704b9ad3b7863d0f7e04032", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "53423bcb0704b9ad3b7863d0f7e04032")).booleanValue();
        } else {
            z = (getIntent() == null || getIntent().getData() == null || !TextUtils.equals(getIntent().getData().getPath(), "/supermarket/superstore/home")) ? false : true;
        }
        if (z) {
            com.sankuai.waimai.store.param.a aVar = this.b;
            aVar.z = true;
            aVar.G = "c_waimai_3fykh6z2";
        } else {
            Object[] objArr8 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect8 = g;
            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "8238da0d196d8cf618f49be0a7704145", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "8238da0d196d8cf618f49be0a7704145")).booleanValue();
            } else {
                z2 = (getIntent() == null || getIntent().getData() == null || !TextUtils.equals(getIntent().getData().getPath(), "/supermarketfilter")) ? false : true;
            }
            if (z2) {
                this.b.a(false);
            }
        }
        com.sankuai.waimai.store.param.a aVar2 = this.b;
        Object[] objArr9 = {this, aVar2};
        ChangeQuickRedirect changeQuickRedirect9 = ad.a;
        if (PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "cc57ef463889ce157c4b76be55a419a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "cc57ef463889ce157c4b76be55a419a5");
        } else {
            Object[] objArr10 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect10 = o.a;
            if ((PatchProxy.isSupport(objArr10, null, changeQuickRedirect10, true, "fc886a7e0b6f37aa2e99d7f174b03bf6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr10, null, changeQuickRedirect10, true, "fc886a7e0b6f37aa2e99d7f174b03bf6")).booleanValue() : j.h().a(SCConfigPath.CACHE_TIME_INFO_SWITCH, false)) && aVar2 != null) {
                long currentTimeMillis = System.currentTimeMillis() - ab.b().b((Context) this, "key_time_last_leave", 0L);
                if (currentTimeMillis > 0) {
                    ag.a("supermarket", "sg_home_cache_time", currentTimeMillis, aVar2);
                }
            }
        }
        this.b.av = this.t;
        this.b.aw = this.u;
        this.b.ax = this.v;
        setContentView(R.layout.wm_sc_activity_poi_verticality_home);
        getWindow().getDecorView().setBackgroundResource(R.color.wm_sg_color_F5F5F6);
        this.j = new PoiVerticalityHomePresenter(this, this.b);
        this.p = (PoiPageViewModel) q.a((FragmentActivity) this).a(PoiPageViewModel.class);
        k<Boolean> kVar = this.p.i;
        Object[] objArr11 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect11 = o.a;
        kVar.b((k<Boolean>) Boolean.valueOf(PatchProxy.isSupport(objArr11, null, changeQuickRedirect11, true, "48b3d4e9c147117adbd4b0ad46229108", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr11, null, changeQuickRedirect11, true, "48b3d4e9c147117adbd4b0ad46229108")).booleanValue() : j.h().a("optimize/open_customer_fps", true)));
        Object[] objArr12 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect12 = g;
        if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "461c22b19587dbf57740aeab4ace71b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "461c22b19587dbf57740aeab4ace71b6");
        } else {
            this.h = (LinearLayout) findViewById(R.id.rv_tab_ll);
            this.i = new a(this);
            this.h.setVisibility(this.b.B ? 0 : 8);
        }
        Object[] objArr13 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect13 = g;
        if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "170d923d7e5525ca848693130b4bc525", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "170d923d7e5525ca848693130b4bc525");
        } else {
            PoiVerticalityHomePresenter poiVerticalityHomePresenter = this.j;
            Object[] objArr14 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect14 = PoiVerticalityHomePresenter.a;
            if (PatchProxy.isSupport(objArr14, poiVerticalityHomePresenter, changeQuickRedirect14, false, "ecebe19d1c1755262d59971469f4bdb3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr14, poiVerticalityHomePresenter, changeQuickRedirect14, false, "ecebe19d1c1755262d59971469f4bdb3");
            } else {
                Object[] objArr15 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect15 = PoiVerticalityHomePresenter.a;
                if (PatchProxy.isSupport(objArr15, poiVerticalityHomePresenter, changeQuickRedirect15, false, "b4bb16fcf1e9184dfceb3d9005c36b08", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr15, poiVerticalityHomePresenter, changeQuickRedirect15, false, "b4bb16fcf1e9184dfceb3d9005c36b08");
                } else {
                    Object[] objArr16 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect16 = PoiVerticalityHomePresenter.a;
                    if (PatchProxy.isSupport(objArr16, poiVerticalityHomePresenter, changeQuickRedirect16, false, "8ecb746345f2573eca644d8d9a4c8afc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr16, poiVerticalityHomePresenter, changeQuickRedirect16, false, "8ecb746345f2573eca644d8d9a4c8afc");
                    } else {
                        PoiVerticalityFragment poiVerticalityFragment = new PoiVerticalityFragment();
                        poiVerticalityFragment.d = poiVerticalityHomePresenter.c;
                        TabInfo tabInfo = new TabInfo();
                        tabInfo.d = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_init_page);
                        tabInfo.c = 0;
                        tabInfo.b = poiVerticalityFragment;
                        poiVerticalityHomePresenter.d.add(tabInfo);
                    }
                    poiVerticalityHomePresenter.b.b(0);
                    poiVerticalityHomePresenter.c();
                }
            }
        }
        j.h().f();
        s().recordStep("horn_load_finsh");
        this.t.recordStep("horn_load_finsh");
        this.u.recordStep("horn_load_finsh");
        this.v.recordStep("horn_load_finsh");
        try {
            com.sankuai.waimai.store.im.number.d.a().a(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        com.meituan.android.bus.a.a().a(this);
        this.h.post(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.newp.PoiVerticalityHomeActivity.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr17 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect17 = a;
                if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "55e0c509c2769825dd1ef4f16f2be63f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "55e0c509c2769825dd1ef4f16f2be63f");
                    return;
                }
                PoiVerticalityHomeActivity.this.bB_();
                LinearLayout unused = PoiVerticalityHomeActivity.this.h;
            }
        });
        Object[] objArr17 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect17 = g;
        if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "6f567e6ec43ed24f94cce5c03b711946", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "6f567e6ec43ed24f94cce5c03b711946");
            return;
        }
        Map map = (Map) j.h().a("home_optimize", new TypeToken<Map<String, Object>>() { // from class: com.sankuai.waimai.store.poi.list.newp.PoiVerticalityHomeActivity.2
        }.getType());
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.put("sg_perf_horn", map);
        }
        String str = com.sankuai.waimai.store.manager.abtest.a.a(com.sankuai.waimai.store.pagingload.c.b).e;
        if (!t.a(str)) {
            hashMap.put("sg_perf_ab", str);
        }
        hashMap.put("navigate_type", Long.valueOf(this.b.c));
        Object[] objArr18 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect18 = com.sankuai.waimai.store.base.abtest.a.a;
        String str2 = PatchProxy.isSupport(objArr18, null, changeQuickRedirect18, true, "66c34e3b0d72df39d5ff91a16e566f58", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr18, null, changeQuickRedirect18, true, "66c34e3b0d72df39d5ff91a16e566f58") : com.sankuai.waimai.store.manager.abtest.a.a("sg_opt_home_location_wm", "A").e;
        if (!t.a(str2)) {
            hashMap.put("sg_location_strategy_ab", str2);
        }
        Object[] objArr19 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect19 = com.sankuai.waimai.store.base.abtest.a.a;
        String str3 = PatchProxy.isSupport(objArr19, null, changeQuickRedirect19, true, "1ee867c18bc12d1c1f7879596ebadfc0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr19, null, changeQuickRedirect19, true, "1ee867c18bc12d1c1f7879596ebadfc0") : com.sankuai.waimai.store.manager.abtest.a.a("sg_opt_home_location_wm_advance", "A").e;
        if (!t.a(str3)) {
            hashMap.put("sg_location_advance_ab", str3);
        }
        Object[] objArr20 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect20 = com.sankuai.waimai.store.base.abtest.a.a;
        String str4 = PatchProxy.isSupport(objArr20, null, changeQuickRedirect20, true, "55126b08a3774c8f565deeeda9c702d7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr20, null, changeQuickRedirect20, true, "55126b08a3774c8f565deeeda9c702d7") : com.sankuai.waimai.store.manager.abtest.a.a("sg_opt_1_home_wm_viewpre", "A").e;
        if (!t.a(str4)) {
            hashMap.put("sg_view_pre_ab", str4);
        }
        Object[] objArr21 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect21 = com.sankuai.waimai.store.base.abtest.a.a;
        String str5 = PatchProxy.isSupport(objArr21, null, changeQuickRedirect21, true, "67c6b2c0288e1cfc8604c4b04430ea46", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr21, null, changeQuickRedirect21, true, "67c6b2c0288e1cfc8604c4b04430ea46") : com.sankuai.waimai.store.manager.abtest.a.a("sg_opt_1_wm_tile_load", "A").e;
        if (!t.a(str5)) {
            hashMap.put("tile_load_opt_ab", str5);
        }
        Object[] objArr22 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect22 = com.sankuai.waimai.store.base.abtest.a.a;
        String str6 = PatchProxy.isSupport(objArr22, null, changeQuickRedirect22, true, "3d60e7f655e5139497913a1cf0b66246", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr22, null, changeQuickRedirect22, true, "3d60e7f655e5139497913a1cf0b66246") : com.sankuai.waimai.store.manager.abtest.a.a("sg_opt_1_wm_tile_height", "A").e;
        if (!t.a(str5)) {
            hashMap.put("tile_height_opt_ab", str6);
        }
        Object[] objArr23 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect23 = com.sankuai.waimai.store.base.abtest.a.a;
        String str7 = PatchProxy.isSupport(objArr23, null, changeQuickRedirect23, true, "ddfea5f602dfe8a72bcfc6f78a98430f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr23, null, changeQuickRedirect23, true, "ddfea5f602dfe8a72bcfc6f78a98430f") : com.sankuai.waimai.store.manager.abtest.a.a("sg_opt_1_wm_tile_default", "A").e;
        if (!t.a(str7)) {
            hashMap.put("tile_mach_def_opt_ab", str7);
        }
        Object[] objArr24 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect24 = com.sankuai.waimai.store.base.abtest.a.a;
        String str8 = PatchProxy.isSupport(objArr24, null, changeQuickRedirect24, true, "63ff390ab50bb75f66062113f5fbb83f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr24, null, changeQuickRedirect24, true, "63ff390ab50bb75f66062113f5fbb83f") : com.sankuai.waimai.store.manager.abtest.a.a("sg_opt_1_wm_list_skeleton", "A").e;
        if (!t.a(str8)) {
            hashMap.put("feed_skeleton_opt_ab", str8);
        }
        try {
            hashMap.put("is_skip_js_process", Boolean.valueOf(m.f()));
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(this.b.ae)) {
            hashMap.put("pre_request_on", 0);
        } else {
            hashMap.put("pre_request_on", 1);
        }
        com.sankuai.waimai.store.fsp.a.a().a(this, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b84814dce0da114cf2cd043dfa59f6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b84814dce0da114cf2cd043dfa59f6d");
        } else if (this.n == null) {
            this.n = (PageEventHandler) q.a((FragmentActivity) this).a(PageEventHandler.class);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.PoiVerticalityChannelActivity, com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f640b9ddc133118ad9f2bc9edbe30ba5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f640b9ddc133118ad9f2bc9edbe30ba5");
            return;
        }
        try {
            super.onResume();
        } catch (IllegalArgumentException e) {
            if (Build.VERSION.SDK_INT > 23 && Build.VERSION.SDK_INT <= 28) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = g;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0f2fbbc1639440c7d158f873a34862bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0f2fbbc1639440c7d158f873a34862bf");
                } else {
                    try {
                        Field declaredField = Activity.class.getDeclaredField("mCalled");
                        declaredField.setAccessible(true);
                        declaredField.setBoolean(this, true);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                e.printStackTrace();
            }
        }
        if (!this.r) {
            this.r = true;
            this.t.recordStep("activity_resume");
            this.u.recordStep("activity_resume");
            this.v.recordStep("activity_resume");
        }
        final com.sankuai.waimai.store.im.number.d a2 = com.sankuai.waimai.store.im.number.d.a();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.im.number.d.a;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "d7aed5715c3af22e9b68cdaeb9da5158", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "d7aed5715c3af22e9b68cdaeb9da5158");
        } else {
            com.sankuai.waimai.store.im.base.net.d.a(com.sankuai.waimai.store.im.number.d.b).a(2, new com.sankuai.waimai.store.base.net.j<MessageUnreadInfoResponse>() { // from class: com.sankuai.waimai.store.im.number.d.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3d64132eb12c44281f5ef3655f9e1e74", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3d64132eb12c44281f5ef3655f9e1e74");
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void b() {
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(MessageUnreadInfoResponse messageUnreadInfoResponse) {
                    MessageUnreadInfoResponse messageUnreadInfoResponse2 = messageUnreadInfoResponse;
                    Object[] objArr4 = {messageUnreadInfoResponse2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ab618db8dab78dde588b5bbfcc107acf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ab618db8dab78dde588b5bbfcc107acf");
                    } else if (messageUnreadInfoResponse2.messageUnreadInfo != null) {
                        a2.f = messageUnreadInfoResponse2.messageUnreadInfo.unReadCount;
                        a2.c();
                    }
                }
            });
        }
        if (this.p.b()) {
            Metrics.getInstance().setScrollCustom(this);
        }
        a(true);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdf7ce5f84fca92c65c589ab71b35ac6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdf7ce5f84fca92c65c589ab71b35ac6");
            return;
        }
        super.onWindowFocusChanged(z);
        if (!z || this.s) {
            return;
        }
        this.s = true;
        this.t.recordStep("activity_interactive");
        this.u.recordStep("activity_interactive");
        this.v.recordStep("activity_interactive");
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.PoiVerticalityChannelActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e07aab452d32be8226d959057c07ff9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e07aab452d32be8226d959057c07ff9");
            return;
        }
        super.onPause();
        bB_();
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.PoiVerticalityChannelActivity, com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ee2bc269504f1baea893164ba3a77e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ee2bc269504f1baea893164ba3a77e9");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.store.im.number.d.a().b(this);
        if (this.j != null) {
            PoiVerticalityHomePresenter poiVerticalityHomePresenter = this.j;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = PoiVerticalityHomePresenter.a;
            if (PatchProxy.isSupport(objArr2, poiVerticalityHomePresenter, changeQuickRedirect2, false, "5ebf730c839b907d64693e9d4cccd14e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, poiVerticalityHomePresenter, changeQuickRedirect2, false, "5ebf730c839b907d64693e9d4cccd14e");
            } else {
                com.meituan.android.bus.a.a().b(poiVerticalityHomePresenter);
            }
        }
        com.meituan.android.bus.a.a().b(this);
        com.sankuai.waimai.store.poi.list.newp.sg.e a2 = com.sankuai.waimai.store.poi.list.newp.sg.e.a();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.poi.list.newp.sg.e.a;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "f3ad8fd71e08989d4070b0fb4829736c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "f3ad8fd71e08989d4070b0fb4829736c");
        } else {
            if (a2.b != null) {
                a2.b.clear();
            }
            if (a2.c != null) {
                a2.c.clear();
            }
        }
        ab.b().a(bB_(), "key_time_last_leave", System.currentTimeMillis());
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.presenter.PoiVerticalityHomePresenter.a
    public final void a(@NonNull List<TabInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e14446406f105e87fa7036f482bab7db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e14446406f105e87fa7036f482bab7db");
        } else if (!this.b.B) {
            this.h.setVisibility(8);
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = g;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0287d0d983c165ccf446f6ede727b48", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0287d0d983c165ccf446f6ede727b48");
            } else {
                int b2 = this.j.b();
                if (1 < b2) {
                    this.k = (h.a((Context) this) - (h.a(this, 50.0f) * b2)) / (b2 + 1);
                }
            }
            int a2 = com.sankuai.shangou.stone.util.a.a((List) list);
            if (a2 <= 1) {
                this.h.setVisibility(8);
            } else {
                this.h.setVisibility(0);
                this.h.removeAllViews();
                this.i.a(list);
                this.h.addView(new Space(bB_()), new FrameLayout.LayoutParams(this.k, 1));
                for (int i = 0; i < a2; i++) {
                    this.h.addView(this.i.getView(i, null, this.h), new LinearLayout.LayoutParams(-2, -2));
                    this.h.addView(new Space(bB_()), new FrameLayout.LayoutParams(this.k, 1));
                }
            }
            com.sankuai.waimai.store.im.number.d.a().b();
        }
    }

    @Override // com.sankuai.waimai.store.im.number.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad914dc8079cba9978f1966f0559f39b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad914dc8079cba9978f1966f0559f39b");
        } else {
            this.j.updateMsgRedCount(new com.sankuai.waimai.store.event.j(1, i));
        }
    }

    boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e4b2864770050a9827bfe9629b72bdf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e4b2864770050a9827bfe9629b72bdf")).booleanValue();
        }
        TabInfo a2 = this.j.a(0);
        return a2 == null || !a2.f;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.presenter.PoiVerticalityHomePresenter.a
    public final void b(int i) {
        boolean z;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d87796c60ba9baa036a9503d88365706", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d87796c60ba9baa036a9503d88365706");
            return;
        }
        TabInfo b2 = this.j.b(i);
        if (b2 == null || b2.b == null || b2.f) {
            return;
        }
        com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.poi.list.newp.event.a(b2.c));
        TabInfo a2 = this.j.a();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        if (a2 == null || a2.b == null) {
            z = false;
        } else {
            a2.f = false;
            if (a2.b.isAdded()) {
                beginTransaction.hide(a2.b);
            }
            z = b(a2);
        }
        b2.f = true;
        if (b2.b.isAdded()) {
            beginTransaction.show(b2.b);
        } else {
            if (supportFragmentManager.getFragments().contains(b2.b)) {
                beginTransaction.remove(b2.b);
            }
            beginTransaction.add(R.id.fl_fragment_container, b2.b);
            beginTransaction.show(b2.b);
        }
        beginTransaction.commitAllowingStateLoss();
        boolean b3 = b(b2);
        j();
        com.sankuai.waimai.store.expose.v2.b.a().b(this, "tab_view_group");
        this.b.C = i;
        if (z) {
            com.meituan.android.bus.a.a().c(new VisibleChangeEvent(1, false, true));
        } else if (b3) {
            com.meituan.android.bus.a.a().c(new VisibleChangeEvent(1, true, true));
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.presenter.PoiVerticalityHomePresenter.a
    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e36aeeda9a1aa5a48e863eb3f83f64ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e36aeeda9a1aa5a48e863eb3f83f64ca");
            return;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85eea42fe9436b28c76eebfac8bfbf99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85eea42fe9436b28c76eebfac8bfbf99");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            b.C0608b a2 = com.sankuai.waimai.store.util.m.a(str, h.a((Context) this), ImageQualityUtil.a());
            a2.g = false;
            a2.k = 4;
            a2.a(new b.a() { // from class: com.sankuai.waimai.store.poi.list.newp.PoiVerticalityHomeActivity.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr3 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "38b387c75b6a0dd536c193a929fef84a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "38b387c75b6a0dd536c193a929fef84a");
                    } else {
                        PoiVerticalityHomeActivity.this.h.setBackground(new BitmapDrawable(PoiVerticalityHomeActivity.this.getResources(), bitmap));
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.presenter.PoiVerticalityHomePresenter.a
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67473b6965cc0fb2f60087c0cfd6192e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67473b6965cc0fb2f60087c0cfd6192e");
        } else if (this.i != null) {
            this.i.notifyDataSetChanged();
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.presenter.PoiVerticalityHomePresenter.a
    public final void a(TabInfo tabInfo) {
        Object[] objArr = {tabInfo};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5ef0db9e4c6e125f13a1c9d857ab23b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5ef0db9e4c6e125f13a1c9d857ab23b");
        } else if (this.m == null || tabInfo == null) {
        } else {
            this.m.a(tabInfo);
            this.m.a(tabInfo.g ? 4 : 3, tabInfo);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.presenter.PoiVerticalityHomePresenter.a
    public final c k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29076424c239c0b3c3c8adbee727e225", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29076424c239c0b3c3c8adbee727e225");
        }
        if (this.o == null) {
            this.o = new c(this.b, l(), this, this);
        }
        return this.o;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.presenter.PoiVerticalityHomePresenter.a
    public final String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d703b7cafbd9307309a7fe5addc67829", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d703b7cafbd9307309a7fe5addc67829") : w();
    }

    private Fragment p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f7fe29406a25ef2ee5ed7d301a10689", RobustBitConfig.DEFAULT_VALUE)) {
            return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f7fe29406a25ef2ee5ed7d301a10689");
        }
        TabInfo a2 = this.j.a();
        if (a2 != null) {
            return a2.b;
        }
        return null;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.PoiVerticalityChannelActivity, com.sankuai.waimai.store.base.SCBaseActivity
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74fdba789a42b9ed06e70fe4633b6443", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74fdba789a42b9ed06e70fe4633b6443");
        }
        Fragment p = p();
        if (p instanceof SCBaseFragment) {
            return ((SCBaseFragment) p).b();
        }
        return super.b();
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.PoiVerticalityChannelActivity, com.sankuai.waimai.store.base.SCBaseActivity
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4e718b3eb79af656871a51d1f21a25b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4e718b3eb79af656871a51d1f21a25b");
        }
        Fragment p = p();
        if (p instanceof SCBaseFragment) {
            return ((SCBaseFragment) p).d();
        }
        TabInfo a2 = this.j.a(0);
        return (a2 == null || !(a2.b instanceof SCBaseFragment)) ? "" : ((SCBaseFragment) a2.b).d();
    }

    @Subscribe
    public void onHomeSelectChange(com.sankuai.waimai.store.event.c cVar) {
        int i;
        TabInfo b2;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf250428be37389627509dc080f6f366", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf250428be37389627509dc080f6f366");
        } else if (cVar == null || (b2 = this.j.b((i = cVar.a))) == null) {
        } else {
            if (b(b2) && this.m != null) {
                this.m.a(b2.g ? 2 : 1, b2);
            }
            b(i);
            o();
            this.n.a((PageEventHandler) new com.sankuai.waimai.store.poi.list.refactor.event.e(b2.c));
        }
    }

    private static boolean b(TabInfo tabInfo) {
        return tabInfo != null && tabInfo.c == 0;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.PoiVerticalityChannelActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63484f15d2649fbbf7ed39b40d340242", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63484f15d2649fbbf7ed39b40d340242");
        } else if (i()) {
            onHomeSelectChange(new com.sankuai.waimai.store.event.c(0));
        } else if ((p() instanceof PoiVerticalityFragment) && ((PoiVerticalityFragment) p()).e()) {
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "036ca19b042607a7bd7d08aa6fc35ed9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "036ca19b042607a7bd7d08aa6fc35ed9");
            return;
        }
        super.onStart();
        if (!this.q) {
            this.q = true;
            this.t.recordStep("activity_start");
            this.u.recordStep("activity_start");
            this.v.recordStep("activity_start");
        }
        com.meituan.android.bus.a.a().c(new VisibleChangeEvent(2, true, true));
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.PoiVerticalityChannelActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ed5a0d5bcead6eaa91b4dc18a2f56c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ed5a0d5bcead6eaa91b4dc18a2f56c3");
            return;
        }
        super.onStop();
        if (com.sankuai.waimai.foundation.core.lifecycle.b.a().a(hashCode())) {
            com.meituan.android.bus.a.a().c(new VisibleChangeEvent(2, false, true));
        } else {
            com.meituan.android.bus.a.a().c(new VisibleChangeEvent(1, false, true));
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "508a8067a910210e082b1928915ad935", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "508a8067a910210e082b1928915ad935");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        for (TabInfo tabInfo : this.j.d) {
            if (tabInfo != null && tabInfo.b != null && tabInfo.b.isAdded() && (tabInfo.b instanceof OrderListFragment) && tabInfo.f) {
                tabInfo.b.onActivityResult(i, i2, intent);
            }
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // com.sankuai.waimai.store.poi.list.widget.c.a
    public final void a(@NonNull LottieAnimationView lottieAnimationView, @NonNull TabInfo tabInfo) {
        Object[] objArr = {lottieAnimationView, tabInfo};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f440c29596cdcf2606db72fc08fe0d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f440c29596cdcf2606db72fc08fe0d6");
        } else {
            b(lottieAnimationView, tabInfo);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.widget.c.a
    public final void e(int i) {
        Object[] objArr = {1};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76c35ed74cef17e88d9c26d332eea67a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76c35ed74cef17e88d9c26d332eea67a");
        } else {
            b(1);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.widget.c.a
    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2213177191ab18454c48a854f40c4246", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2213177191ab18454c48a854f40c4246");
        } else {
            j();
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.widget.c.a
    public final com.airbnb.lottie.e d(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41dbeec83a764d5150e7d5a77dc0da1b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.airbnb.lottie.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41dbeec83a764d5150e7d5a77dc0da1b");
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1e2dd2c6afb946ba1c98ebe2b157b24", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.airbnb.lottie.e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1e2dd2c6afb946ba1c98ebe2b157b24");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.j.a(str);
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPTags
    @NonNull
    @NotNull
    public Map<String, Object> ffpTags() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ef8256c74a3d1c387ab12b2a37ca66c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ef8256c74a3d1c387ab12b2a37ca66c");
        }
        HashMap hashMap = new HashMap();
        boolean z = l.a().b;
        hashMap.put("supermarket_homechannel_open_type", Integer.valueOf(z ? 1 : 0));
        hashMap.put("supermarket_homechannel_page_type", Integer.valueOf((this.b == null || this.b.y) ? 1 : 0));
        if (z) {
            l.a().b = false;
        }
        return hashMap;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends com.sankuai.waimai.store.newwidgets.list.a<TabInfo, com.sankuai.waimai.store.poi.list.newp.contract.a> {
        public static ChangeQuickRedirect c;

        public a(@NonNull com.sankuai.waimai.store.poi.list.newp.contract.a aVar) {
            super(aVar);
            Object[] objArr = {PoiVerticalityHomeActivity.this, aVar};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04dc7a0db317ce11da8259621e6eaf29", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04dc7a0db317ce11da8259621e6eaf29");
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.a
        @NonNull
        public final g a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = c;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf0e93f793041006452325c9e70dc079", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf0e93f793041006452325c9e70dc079") : new b(((com.sankuai.waimai.store.poi.list.newp.contract.a) this.b).n());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b extends g<TabInfo, com.sankuai.waimai.store.poi.list.newp.contract.a> {
        public static ChangeQuickRedirect a;
        LottieAnimationView b;
        private TextView d;
        private TextView e;
        private int f;
        private int g;
        private com.sankuai.waimai.store.expose.v2.entity.b h;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final int a() {
            return R.layout.wm_sc_item_poiverticality_home_tab;
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final /* synthetic */ void a(TabInfo tabInfo, final int i) {
            final TabInfo tabInfo2 = tabInfo;
            Object[] objArr = {tabInfo2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27fa3e3774c685e4f1260ddb8880ae09", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27fa3e3774c685e4f1260ddb8880ae09");
            } else if (tabInfo2 == null) {
            } else {
                Object[] objArr2 = {tabInfo2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a01decb35f6c443f492ef2b4ec00d7dc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a01decb35f6c443f492ef2b4ec00d7dc");
                } else {
                    this.d.setText(tabInfo2.d);
                }
                Object[] objArr3 = {tabInfo2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "303af949b8a281f538553515e12562aa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "303af949b8a281f538553515e12562aa");
                } else if (tabInfo2 != null) {
                    if (PoiVerticalityHomeActivity.a(PoiVerticalityHomeActivity.this, tabInfo2)) {
                        PoiVerticalityHomeActivity.this.m = this;
                        if (tabInfo2.f) {
                            a(tabInfo2);
                            a(true);
                        } else {
                            a(false);
                        }
                    }
                    if (PoiVerticalityHomeActivity.b(PoiVerticalityHomeActivity.this, tabInfo2)) {
                        PoiVerticalityHomeActivity.this.k().b = this.b;
                    }
                    if (tabInfo2.f) {
                        this.d.setTextColor(this.g);
                    } else if (PoiVerticalityHomeActivity.this.b.z) {
                        this.d.setTextColor(this.f);
                        this.b.e();
                        b.C0608b b = com.sankuai.waimai.store.util.m.b(tabInfo2.j, ImageQualityUtil.a());
                        b.j = tabInfo2.B;
                        b.a((ImageView) this.b);
                    } else {
                        this.d.setTextColor(this.f);
                        this.b.e();
                        b.C0608b b2 = com.sankuai.waimai.store.util.m.b(tabInfo2.j, ImageQualityUtil.a());
                        b2.j = tabInfo2.A;
                        b2.a((ImageView) this.b);
                    }
                }
                Object[] objArr4 = {tabInfo2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "22c4911455a5d7350ec558ae9f742a74", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "22c4911455a5d7350ec558ae9f742a74");
                } else {
                    u.c(this.e);
                    if (tabInfo2.h > 0) {
                        u.a(this.e);
                        this.e.setText(tabInfo2.h >= 99 ? "99+" : String.valueOf(tabInfo2.h));
                    } else {
                        u.c(this.e);
                    }
                    if (tabInfo2.D) {
                        u.c(this.e);
                    }
                }
                Object[] objArr5 = {tabInfo2, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "fc0306a2896f941000ef6a8446e9d3a8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "fc0306a2896f941000ef6a8446e9d3a8");
                } else {
                    this.p.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.newp.PoiVerticalityHomeActivity.b.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr6 = {view};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "50decf58d22c90a273d0fce8a34c3201", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "50decf58d22c90a273d0fce8a34c3201");
                                return;
                            }
                            if (PoiVerticalityHomeActivity.a(PoiVerticalityHomeActivity.this, tabInfo2)) {
                                if (tabInfo2.f) {
                                    long currentTimeMillis = System.currentTimeMillis() - PoiVerticalityHomeActivity.this.l;
                                    if (currentTimeMillis < 100 || b.this.b.d()) {
                                        return;
                                    }
                                    PoiVerticalityHomeActivity.this.l += currentTimeMillis;
                                    if (tabInfo2.g) {
                                        PoiVerticalityHomeActivity poiVerticalityHomeActivity = PoiVerticalityHomeActivity.this;
                                        TabInfo tabInfo3 = tabInfo2;
                                        Object[] objArr7 = {tabInfo3, Integer.valueOf(i)};
                                        ChangeQuickRedirect changeQuickRedirect7 = PoiVerticalityHomeActivity.g;
                                        if (PatchProxy.isSupport(objArr7, poiVerticalityHomeActivity, changeQuickRedirect7, false, "5d2c666c86fdc5ff692f3ffb6816dcd9", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr7, poiVerticalityHomeActivity, changeQuickRedirect7, false, "5d2c666c86fdc5ff692f3ffb6816dcd9");
                                        } else if (!poiVerticalityHomeActivity.i()) {
                                            Fragment fragment = tabInfo3.b;
                                            if ((fragment instanceof PoiVerticalityFragment) && fragment.isAdded()) {
                                                PoiVerticalityFragment poiVerticalityFragment = (PoiVerticalityFragment) fragment;
                                                Object[] objArr8 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect8 = PoiVerticalityFragment.c;
                                                if (PatchProxy.isSupport(objArr8, poiVerticalityFragment, changeQuickRedirect8, false, "0a0f4765d266584879ef3c21af329103", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr8, poiVerticalityFragment, changeQuickRedirect8, false, "0a0f4765d266584879ef3c21af329103");
                                                } else if (poiVerticalityFragment.e != null) {
                                                    poiVerticalityFragment.f.a((PageEventHandler) new com.sankuai.waimai.store.poi.list.newp.block.rxevent.j(true));
                                                }
                                            }
                                        }
                                    } else {
                                        PoiVerticalityHomeActivity poiVerticalityHomeActivity2 = PoiVerticalityHomeActivity.this;
                                        TabInfo tabInfo4 = tabInfo2;
                                        Object[] objArr9 = {tabInfo4, Integer.valueOf(i)};
                                        ChangeQuickRedirect changeQuickRedirect9 = PoiVerticalityHomeActivity.g;
                                        if (PatchProxy.isSupport(objArr9, poiVerticalityHomeActivity2, changeQuickRedirect9, false, "1db1f36a6a7c4842d7becaa736256aac", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr9, poiVerticalityHomeActivity2, changeQuickRedirect9, false, "1db1f36a6a7c4842d7becaa736256aac");
                                        } else if (!poiVerticalityHomeActivity2.i()) {
                                            Fragment fragment2 = tabInfo4.b;
                                            if ((fragment2 instanceof PoiVerticalityFragment) && fragment2.isAdded()) {
                                                PoiVerticalityFragment poiVerticalityFragment2 = (PoiVerticalityFragment) fragment2;
                                                Object[] objArr10 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect10 = PoiVerticalityFragment.c;
                                                if (PatchProxy.isSupport(objArr10, poiVerticalityFragment2, changeQuickRedirect10, false, "7cf951475b62b5c15f0acd86991be106", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr10, poiVerticalityFragment2, changeQuickRedirect10, false, "7cf951475b62b5c15f0acd86991be106");
                                                } else if (poiVerticalityFragment2.e != null) {
                                                    poiVerticalityFragment2.f.a((PageEventHandler) new com.sankuai.waimai.store.poi.list.refactor.event.j());
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    PoiVerticalityHomeActivity.this.b(i);
                                    b.this.a(tabInfo2.g ? 2 : 1, tabInfo2);
                                }
                            } else {
                                if (PoiVerticalityHomeActivity.b(PoiVerticalityHomeActivity.this, tabInfo2)) {
                                    c k = PoiVerticalityHomeActivity.this.k();
                                    ViewGroup a2 = c.a(PoiVerticalityHomeActivity.this);
                                    Object[] objArr11 = {a2};
                                    ChangeQuickRedirect changeQuickRedirect11 = c.a;
                                    if (PatchProxy.isSupport(objArr11, k, changeQuickRedirect11, false, "638130ceedbf7deaaa0c1dc0fe461be0", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr11, k, changeQuickRedirect11, false, "638130ceedbf7deaaa0c1dc0fe461be0");
                                    } else if (k.f != null) {
                                        a2.removeView(k.f);
                                    }
                                }
                                PoiVerticalityHomeActivity.this.bB_();
                                LinearLayout unused = PoiVerticalityHomeActivity.this.h;
                                PoiVerticalityHomeActivity.this.b(b.this.b, tabInfo2);
                                PoiVerticalityHomeActivity.this.b(i);
                            }
                            b bVar = b.this;
                            TabInfo tabInfo5 = tabInfo2;
                            int i2 = i;
                            Object[] objArr12 = {tabInfo5, Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect12 = b.a;
                            if (PatchProxy.isSupport(objArr12, bVar, changeQuickRedirect12, false, "ac1c7f4fa0c86866720427dba1a3e65d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr12, bVar, changeQuickRedirect12, false, "ac1c7f4fa0c86866720427dba1a3e65d");
                            } else if (tabInfo5 != null) {
                                com.sankuai.waimai.store.manager.judas.b.a(PoiVerticalityHomeActivity.this.b.G, "b_waimai_sg_diyx51b7_mc").a("tab_code", Integer.valueOf(tabInfo5.c)).a("tab_name", tabInfo5.d).a(DataConstants.INDEX, Integer.valueOf(i2)).a("stid", PoiVerticalityHomeActivity.this.b.T).a();
                            }
                            PoiVerticalityHomeActivity.this.o();
                            PoiVerticalityHomeActivity.this.n.a((PageEventHandler) new com.sankuai.waimai.store.poi.list.refactor.event.e(tabInfo2.c));
                        }
                    });
                }
                Object[] objArr6 = {tabInfo2, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "6f6569483ba2c2afb03aed187832ae54", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "6f6569483ba2c2afb03aed187832ae54");
                } else if (tabInfo2 == null) {
                } else {
                    com.sankuai.waimai.store.expose.v2.entity.b bVar = this.h;
                    bVar.e = String.valueOf(tabInfo2.hashCode()) + "b_waimai_sg_diyx51b7_mc" + i;
                    this.h.a("tab_code", Integer.valueOf(tabInfo2.c)).a("tab_name", tabInfo2.d).a(DataConstants.INDEX, Integer.valueOf(i)).a("stid", PoiVerticalityHomeActivity.this.b.T);
                }
            }
        }

        public b(Context context) {
            Object[] objArr = {PoiVerticalityHomeActivity.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcc7a0080f7760302be05bb1fd302ec3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcc7a0080f7760302be05bb1fd302ec3");
                return;
            }
            this.f = com.sankuai.waimai.store.util.b.b(context, R.color.wm_st_common_text_title);
            this.g = com.sankuai.waimai.store.util.b.b(context, R.color.wm_sg_color_FFA200);
        }

        void a(TabInfo tabInfo) {
            Object[] objArr = {tabInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1a0ffaadccab8e7c56e4d3a3cb87cd8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1a0ffaadccab8e7c56e4d3a3cb87cd8");
            } else if (tabInfo == null) {
            } else {
                int a2 = f.a().a(tabInfo, PoiVerticalityHomeActivity.this.b.z);
                if (tabInfo.g) {
                    this.b.setImageResource(a2);
                    this.d.setText(R.string.wm_sc_back_to_top);
                } else {
                    this.b.setImageResource(a2);
                    this.d.setText(PoiVerticalityHomeActivity.this.j.d());
                }
                this.d.setTextColor(this.g);
            }
        }

        private void a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39113cfca35f952cdb17f4cac8bcf800", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39113cfca35f952cdb17f4cac8bcf800");
            } else if (this.b == null || this.d == null) {
            } else {
                f.a();
                ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).height = h.a(PoiVerticalityHomeActivity.this, z ? 44.0f : 30.0f);
                this.d.setVisibility(z ? 8 : 0);
            }
        }

        void a(int i, TabInfo tabInfo) {
            Object[] objArr = {Integer.valueOf(i), tabInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86a247d4e267d8412a28453a9d04bca4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86a247d4e267d8412a28453a9d04bca4");
            } else if (tabInfo == null) {
            } else {
                f a2 = f.a();
                boolean z = PoiVerticalityHomeActivity.this.b.z;
                Object[] objArr2 = {Integer.valueOf(i), tabInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = f.a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "78d308403d3630e4c6c59d230f0b45e2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "78d308403d3630e4c6c59d230f0b45e2");
                } else if (z) {
                    if (i == 1) {
                        tabInfo.k = "new_home_store.json";
                    } else if (i == 2) {
                        tabInfo.k = "wm_sc_home_up.json";
                    } else if (i == 3) {
                        tabInfo.k = "new_rocket_store.json";
                    } else if (i == 4) {
                        tabInfo.k = "new_store_rocket.json";
                    }
                } else if (i == 1) {
                    tabInfo.k = "wm_sc_home_store.json";
                } else if (i == 2) {
                    tabInfo.k = "wm_sc_home_up.json";
                } else if (i == 3) {
                    tabInfo.k = "wm_sc_up_store.json";
                } else if (i == 4) {
                    tabInfo.k = "wm_sc_store_up.json";
                }
                PoiVerticalityHomeActivity.this.b(this.b, tabInfo);
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "503c43a86121f8b0a54d49d4473c1e82", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "503c43a86121f8b0a54d49d4473c1e82");
                return;
            }
            this.d = (TextView) view.findViewById(R.id.tv_text);
            this.e = (TextView) view.findViewById(R.id.tv_count);
            this.b = (LottieAnimationView) view.findViewById(R.id.icon_tab_selected);
            this.h = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_sg_diyx51b7_mv", view) { // from class: com.sankuai.waimai.store.poi.list.newp.PoiVerticalityHomeActivity.b.2
                @Override // com.sankuai.waimai.store.expose.v2.entity.b
                public final String a() {
                    return "tab_view_group";
                }
            };
            if (view.getContext() instanceof com.sankuai.waimai.store.expose.v2.a) {
                com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) view.getContext(), this.h);
            }
        }
    }

    public final void b(LottieAnimationView lottieAnimationView, TabInfo tabInfo) {
        Object[] objArr = {lottieAnimationView, tabInfo};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da48392bf5df3a139c7ae15b379d88fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da48392bf5df3a139c7ae15b379d88fb");
        } else if (tabInfo == null) {
        } else {
            lottieAnimationView.clearAnimation();
            com.airbnb.lottie.e a2 = this.j.a(tabInfo.k);
            if (a2 == null) {
                b.C0608b b2 = com.sankuai.waimai.store.util.m.b(tabInfo.i, ImageQualityUtil.a());
                b2.j = tabInfo.C;
                b2.a((ImageView) lottieAnimationView);
                return;
            }
            lottieAnimationView.setComposition(a2);
            lottieAnimationView.a();
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cae7ce545fd1fcf1df3e384866fdaa35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cae7ce545fd1fcf1df3e384866fdaa35");
        } else if (this.b != null && this.b.B && this.j.b() > 1) {
            this.h.setVisibility(z ? 0 : 8);
        }
    }

    public static /* synthetic */ boolean b(PoiVerticalityHomeActivity poiVerticalityHomeActivity, TabInfo tabInfo) {
        return tabInfo != null && tabInfo.c == 4;
    }
}
