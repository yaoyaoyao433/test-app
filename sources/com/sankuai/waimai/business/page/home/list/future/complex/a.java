package com.sankuai.waimai.business.page.home.list.future.complex;

import android.arch.lifecycle.d;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.dianping.monitor.impl.m;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.cube.pga.common.j;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.common.list.ai.a;
import com.sankuai.waimai.business.page.common.list.ai.b;
import com.sankuai.waimai.business.page.common.view.nested.NestedSmoothRecyclerView;
import com.sankuai.waimai.business.page.common.view.nested.NestedViewPager;
import com.sankuai.waimai.business.page.home.gray.HomeGrayManager;
import com.sankuai.waimai.business.page.home.list.future.FutureViewModel;
import com.sankuai.waimai.business.page.home.list.future.d;
import com.sankuai.waimai.business.page.home.list.future.net.FutureApi;
import com.sankuai.waimai.business.page.home.preload.PreloadDataModel;
import com.sankuai.waimai.business.page.home.utils.h;
import com.sankuai.waimai.business.page.home.utils.k;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.manager_new.b;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.pouch.viewmodel.PouchViewModel;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import com.sankuai.waimai.rocks.view.a;
import com.sankuai.waimai.store.repository.model.ConfigInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.business.page.home.list.future.a {
    public static ChangeQuickRedirect R;
    com.sankuai.waimai.business.page.home.list.future.net.b S;
    protected com.sankuai.waimai.business.page.common.list.ai.b T;
    private com.sankuai.waimai.business.page.common.view.nested.a U;
    private boolean V;
    private com.sankuai.waimai.platform.widget.emptylayout.d W;
    private e X;
    private String Y;
    private int Z;
    private FutureViewModel aa;
    private Map<String, Object> ab;
    private String ac;
    private com.sankuai.waimai.business.page.home.list.future.recommend.a ad;
    private PouchViewModel ae;
    private Map<String, Object> af;
    private int ag;
    private int ah;
    private com.sankuai.waimai.rocks.view.viewmodel.e ai;
    private boolean aj;
    private b.InterfaceC0760b ak;

    public static /* synthetic */ void R(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = R;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "d74db77881c043c85ae04c68088dd866", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "d74db77881c043c85ae04c68088dd866");
        } else if (HomeGrayManager.a().e || aVar.V) {
        } else {
            HomeGrayManager.a().a(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static /* synthetic */ void a(a aVar, BaseResponse baseResponse, boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5) {
        boolean z6;
        boolean z7;
        boolean z8;
        int i2;
        boolean z9;
        int i3;
        RocksServerModel rocksServerModel;
        boolean z10;
        int b;
        int u;
        Object[] objArr = {baseResponse, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Integer.valueOf(i), Byte.valueOf(z4 ? (byte) 1 : (byte) 0), Byte.valueOf(z5 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = R;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "71f0ea6d4542a88dbc9d1d91a620ea1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "71f0ea6d4542a88dbc9d1d91a620ea1f");
        } else if (baseResponse == null || baseResponse.data == 0 || baseResponse.code != 0) {
            if (z3) {
                if (i == 4) {
                    aVar.b(false);
                    return;
                }
                return;
            }
            if (baseResponse != null && !TextUtils.isEmpty(baseResponse.msg)) {
                aVar.a(z, baseResponse.msg);
            } else {
                aVar.b(z);
            }
            aVar.V = false;
        } else {
            if (aVar.O.k && !z5) {
                f fVar = aVar.O;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = f.a;
                if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "9ba68b1994f28a1ad44aabad5e601684", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "9ba68b1994f28a1ad44aabad5e601684");
                } else {
                    fVar.i++;
                }
            }
            if (com.sankuai.waimai.modular.utils.a.a(((RocksServerModel) baseResponse.data).moduleList)) {
                aVar.V = false;
                if (z3) {
                    return;
                }
                if (z2) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = R;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "02d21392e4fad4b4b9ea30b6454e2054", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "02d21392e4fad4b4b9ea30b6454e2054");
                        return;
                    }
                    aVar.x.o();
                    aVar.E.setVisibility(8);
                    aVar.W.a(com.sankuai.waimai.platform.widget.emptylayout.d.m, R.string.wm_page_complex_list_no_match_filter_poi, 0, R.string.takeout_widget_filter_bar_reset_filter_condition, new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.list.future.complex.a.8
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr4 = {view};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1607d9f79ec16fff419904527dfdb142", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1607d9f79ec16fff419904527dfdb142");
                                return;
                            }
                            a.this.K.c();
                            a.this.a((com.sankuai.waimai.business.page.home.list.future.net.b) null);
                        }
                    });
                    aVar.W.f();
                    return;
                }
                Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect4 = R;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "176c9b34fe1b39d8ca445a8b5792c6fa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "176c9b34fe1b39d8ca445a8b5792c6fa");
                    return;
                } else if (z) {
                    ae.a(aVar.t, "暂无更多~");
                    aVar.H.c(3);
                    return;
                } else {
                    aVar.W();
                    return;
                }
            }
            aVar.z = true;
            if (z3) {
                aVar.T.a((RocksServerModel) baseResponse.data, aVar.X.b, i);
                if (i == 4) {
                    z8 = false;
                    i2 = 0;
                } else if (aVar.ag != aVar.V()) {
                    com.sankuai.waimai.foundation.utils.log.a.a("最大曝光位置大于初始计算位置，曝光数量发生变化结果丢弃-用户发生滑动或非本次回调触发", new Object[0]);
                    aVar.V = false;
                    if (com.sankuai.waimai.business.page.home.helper.b.a().b()) {
                        com.sankuai.waimai.business.page.home.helper.b.a().a(8);
                        return;
                    }
                    return;
                } else {
                    com.sankuai.waimai.business.page.common.list.ai.b bVar = aVar.T;
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.page.common.list.ai.b.a;
                    if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "3fbeff6ff888a42697adb267bfdc3b31", RobustBitConfig.DEFAULT_VALUE)) {
                        u = ((Integer) PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "3fbeff6ff888a42697adb267bfdc3b31")).intValue();
                    } else {
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.business.page.common.list.ai.b.a;
                        if (PatchProxy.isSupport(objArr6, bVar, changeQuickRedirect6, false, "b61a1f40625f0f2e15cec88f3638166a", RobustBitConfig.DEFAULT_VALUE)) {
                            b = ((Integer) PatchProxy.accessDispatch(objArr6, bVar, changeQuickRedirect6, false, "b61a1f40625f0f2e15cec88f3638166a")).intValue();
                        } else {
                            b = bVar.c.b + 1 + bVar.b();
                            if (bVar.c.b >= b) {
                                b = -1;
                            }
                        }
                        u = (b == -1 || bVar.h == null || bVar.h.u() <= b) ? 0 : bVar.h.u() - b;
                    }
                    i2 = u;
                    z8 = z ? 1 : 0;
                }
                z7 = false;
            } else {
                if (!z5 && TextUtils.equals(((RocksServerModel) baseResponse.data).layoutType, Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST)) {
                    f fVar2 = aVar.O;
                    RocksServerModel rocksServerModel2 = (RocksServerModel) baseResponse.data;
                    Object[] objArr7 = {rocksServerModel2};
                    ChangeQuickRedirect changeQuickRedirect7 = f.a;
                    if (PatchProxy.isSupport(objArr7, fVar2, changeQuickRedirect7, false, "cef71b38ef393d297112a20b2040ac97", RobustBitConfig.DEFAULT_VALUE)) {
                        z6 = ((Boolean) PatchProxy.accessDispatch(objArr7, fVar2, changeQuickRedirect7, false, "cef71b38ef393d297112a20b2040ac97")).booleanValue();
                    } else if (!fVar2.k && !com.sankuai.waimai.foundation.utils.d.a(rocksServerModel2.moduleList)) {
                        if (fVar2.d == -1 || fVar2.d > fVar2.b + rocksServerModel2.moduleList.size()) {
                            z9 = false;
                        } else {
                            int i4 = fVar2.d - fVar2.b;
                            if (i4 > 0 && i4 < rocksServerModel2.moduleList.size()) {
                                fVar2.g = new ArrayList(rocksServerModel2.moduleList);
                                if (fVar2.c) {
                                    rocksServerModel2.moduleList = new ArrayList(fVar2.g.subList(0, i4));
                                    List<RocksServerModel> list = rocksServerModel2.moduleList;
                                    Object[] objArr8 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect8 = f.a;
                                    if (PatchProxy.isSupport(objArr8, fVar2, changeQuickRedirect8, false, "9f3780f475f3d04542a71096f3c10b1b", RobustBitConfig.DEFAULT_VALUE)) {
                                        rocksServerModel = (RocksServerModel) PatchProxy.accessDispatch(objArr8, fVar2, changeQuickRedirect8, false, "9f3780f475f3d04542a71096f3c10b1b");
                                        z10 = true;
                                    } else {
                                        rocksServerModel = new RocksServerModel();
                                        rocksServerModel.moduleId = "poilist_poi_module";
                                        rocksServerModel.templateId = "waimai_mach_usercenter_homepage_future_poi_fold_card";
                                        rocksServerModel.templatePhId = "waimai_mach_usercenter_homepage_future_poi_fold_card";
                                        z10 = true;
                                        rocksServerModel.dataType = 1;
                                        rocksServerModel.dataId = "waimai_mach_usercenter_homepage_future_poi_fold_cardpoilist_poi_moduleAndroid_fold_card";
                                        rocksServerModel.renderMode = "mach";
                                        rocksServerModel.viewType = ConfigInfo.MODULE_BLOCK;
                                    }
                                    list.add(rocksServerModel);
                                    z9 = true;
                                    i3 = z10;
                                } else {
                                    i3 = 1;
                                    z9 = false;
                                }
                                fVar2.k = i3;
                                Object[] objArr9 = new Object[i3];
                                objArr9[0] = rocksServerModel2;
                                ChangeQuickRedirect changeQuickRedirect9 = f.a;
                                if (PatchProxy.isSupport(objArr9, fVar2, changeQuickRedirect9, false, "c3dc9ba0de8d90d423484f31cfd012a0", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr9, fVar2, changeQuickRedirect9, false, "c3dc9ba0de8d90d423484f31cfd012a0");
                                } else {
                                    if (fVar2.h == null) {
                                        fVar2.h = new RocksServerModel();
                                    }
                                    fVar2.h.renderMode = rocksServerModel2.renderMode;
                                    fVar2.h.viewType = rocksServerModel2.viewType;
                                    fVar2.h.jsonData = rocksServerModel2.jsonData;
                                    fVar2.h.layoutType = rocksServerModel2.layoutType;
                                    fVar2.h.layoutInfo = rocksServerModel2.layoutInfo;
                                }
                                RocksServerModel rocksServerModel3 = fVar2.h;
                                List<RocksServerModel> list2 = fVar2.g;
                                rocksServerModel3.moduleList = new ArrayList(list2.subList(i4, list2.size()));
                            }
                        }
                        z6 = z9;
                    }
                    com.sankuai.waimai.business.page.common.list.ai.b.a((RocksServerModel) baseResponse.data, aVar.X.b);
                    z7 = z6;
                    z8 = z ? 1 : 0;
                    i2 = 0;
                }
                z6 = false;
                com.sankuai.waimai.business.page.common.list.ai.b.a((RocksServerModel) baseResponse.data, aVar.X.b);
                z7 = z6;
                z8 = z ? 1 : 0;
                i2 = 0;
            }
            aVar.a((RocksServerModel) baseResponse.data, z8, z2, i2, z4, z7);
        }
    }

    public static /* synthetic */ void a(a aVar, RocksServerModel rocksServerModel) {
        Object[] objArr = {rocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = R;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "e0d9b2b6254ac1c649deed1bd08cd7a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "e0d9b2b6254ac1c649deed1bd08cd7a4");
        } else if (rocksServerModel != null) {
            if (aVar.P != null) {
                aVar.P.b = rocksServerModel.isCache;
            }
            if (aVar.I != null) {
                aVar.I.y = rocksServerModel.isCache;
            }
        }
    }

    public static /* synthetic */ void a(a aVar, final List list, final boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = R;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "e4ca82e874b3a109ce9db558f4e70170", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "e4ca82e874b3a109ce9db558f4e70170");
        } else if (com.sankuai.waimai.foundation.utils.d.a(list)) {
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.waimai.platform.mach.monitor.d.b, new Runnable() { // from class: com.sankuai.waimai.business.page.home.list.future.complex.a.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    ArrayList<HashMap> arrayList;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b13ac49814b01abed736cacb65eff1f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b13ac49814b01abed736cacb65eff1f");
                        return;
                    }
                    SparseIntArray sparseIntArray = new SparseIntArray();
                    for (com.sankuai.waimai.rocks.node.a aVar2 : list) {
                        try {
                            Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(aVar2.r);
                            if (a2 != null) {
                                if (a2.containsKey(ConfigInfo.MODULE_PLATINUM_BANNER)) {
                                    Map map = (Map) a2.get(ConfigInfo.MODULE_PLATINUM_BANNER);
                                    if (map.containsKey("wm_cpt_banner")) {
                                        Map<String, Object> a3 = com.sankuai.waimai.mach.utils.b.a((String) map.get("wm_cpt_banner"));
                                        if (a3.containsKey("adType")) {
                                            Object obj = a3.get("adType");
                                            if (obj != null) {
                                                int intValue = ((Long) obj).intValue();
                                                sparseIntArray.put(intValue, sparseIntArray.get(intValue) + 1);
                                            }
                                        } else if (a3.containsKey(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST) && (arrayList = (ArrayList) a3.get(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST)) != null && !arrayList.isEmpty()) {
                                            for (HashMap hashMap : arrayList) {
                                                Object obj2 = hashMap.get("adType");
                                                if (obj2 != null) {
                                                    int intValue2 = ((Long) obj2).intValue();
                                                    sparseIntArray.put(intValue2, sparseIntArray.get(intValue2) + 1);
                                                }
                                            }
                                        }
                                    }
                                } else if (a2.containsKey("ad_type")) {
                                    int intValue3 = ((Long) a2.get("ad_type")).intValue();
                                    sparseIntArray.put(intValue3, sparseIntArray.get(intValue3) + 1);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (sparseIntArray.size() <= 0) {
                        return;
                    }
                    for (int i = 0; i < sparseIntArray.size(); i++) {
                        int keyAt = sparseIntArray.keyAt(i);
                        int i2 = sparseIntArray.get(keyAt);
                        if (keyAt != 0) {
                            com.sankuai.waimai.platform.mach.monitor.d.a(i2, keyAt, "homepage_v2", z ? "home/feeds/tabs" : "home/feeds/mainlist");
                        }
                    }
                }
            });
        }
    }

    public static /* synthetic */ void u(a aVar) {
        int itemCount;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = R;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "d71eb22f688adb489506655db7740b4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "d71eb22f688adb489506655db7740b4e");
        } else if ((aVar.O == null || !aVar.O.f) && aVar.ah > 0 && aVar.ai != null && aVar.ah <= (itemCount = aVar.H.h.getItemCount())) {
            if (aVar.ah == itemCount && aVar.H.h.getItemViewType(itemCount - 1) == -2) {
                return;
            }
            aVar.F.a(aVar.ai, aVar.ah);
            aVar.ah = -1;
            aVar.ai = null;
        }
    }

    public a(PageFragment pageFragment, NestedViewPager nestedViewPager, com.sankuai.waimai.rocks.expose.a aVar, String str) {
        super(pageFragment, nestedViewPager, aVar, str);
        Object[] objArr = {pageFragment, nestedViewPager, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = R;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fc9162bcb02c38703bc65cea0c699cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fc9162bcb02c38703bc65cea0c699cc");
            return;
        }
        this.Z = 0;
        this.ab = new HashMap();
        this.ac = "";
        this.ah = -1;
        this.aj = false;
        this.ak = new b.InterfaceC0760b() { // from class: com.sankuai.waimai.business.page.home.list.future.complex.a.9
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.common.list.ai.b.InterfaceC0760b
            public final void a(b.a aVar2) {
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "88c3fe05ce5c074c17bfd436aad00095", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "88c3fe05ce5c074c17bfd436aad00095");
                } else if (a.this.O.f) {
                } else {
                    a.this.a(true, false, aVar2);
                }
            }
        };
        this.L.c = this.O;
    }

    @Override // com.sankuai.waimai.business.page.home.list.future.a, com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = R;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eec4a8c349f53a5b0f0e3a28c5e606fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eec4a8c349f53a5b0f0e3a28c5e606fc");
        }
        View a = super.a(viewGroup);
        this.U = new com.sankuai.waimai.business.page.common.view.nested.a();
        this.E.f = this.U.b > 0;
        b("home_complex");
        this.J = new com.sankuai.waimai.business.page.common.list.ai.c(this.H);
        this.X = new e(this.J, this.L);
        this.T = new com.sankuai.waimai.business.page.common.list.ai.b(this.J);
        this.T.e = this.ak;
        this.T.h = this.H;
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.page.home.list.future.complex.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d82a106d68fc1955088df32cc663000", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d82a106d68fc1955088df32cc663000");
                    return;
                }
                com.sankuai.waimai.business.page.common.list.ai.b bVar = a.this.T;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.common.list.ai.b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "988372118b99e53d2139fd3819e51986", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "988372118b99e53d2139fd3819e51986");
                } else if (bVar.f || bVar.g) {
                } else {
                    com.sankuai.waimai.business.page.common.list.ai.common.e eVar = bVar.d;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.page.common.list.ai.common.e.a;
                    if (PatchProxy.isSupport(objArr4, eVar, changeQuickRedirect4, false, "4b65e6ae2501828e686d1ed7e96fa57f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, eVar, changeQuickRedirect4, false, "4b65e6ae2501828e686d1ed7e96fa57f");
                    } else if (eVar.b != null) {
                        String a2 = eVar.b.a();
                        if (TextUtils.isEmpty(a2)) {
                            if (eVar.c != null) {
                                eVar.c.a();
                            }
                        } else if (eVar.b.c()) {
                            com.sankuai.waimai.alita.core.event.autorunner.c.a().b(eVar.b.b()).a(a2, eVar.d);
                        }
                    }
                    bVar.f = true;
                }
            }
        }, MetricsAnrManager.ANR_THRESHOLD);
        this.ad = new com.sankuai.waimai.business.page.home.list.future.recommend.a(this.F, this.J, this.ab, this.x, this.X);
        this.E.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.business.page.home.list.future.complex.a.10
            public static ChangeQuickRedirect a;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r13v21 */
            /* JADX WARN: Type inference failed for: r13v7 */
            /* JADX WARN: Type inference failed for: r13v8, types: [boolean, byte] */
            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "916c187beac23607c48a3f1abd480c0b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "916c187beac23607c48a3f1abd480c0b");
                    return;
                }
                if (i == 0) {
                    ?? r13 = (a.this.A == null || a.this.A.c == null || !a.this.A.c.a || a.this.E.canScrollVertically(1)) ? 0 : 1;
                    b a2 = b.a();
                    Object[] objArr3 = {Byte.valueOf((byte) r13)};
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "15150e5ff0528a35296b3c307ed1967e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "15150e5ff0528a35296b3c307ed1967e");
                    } else {
                        new StringBuilder("Loading: ").append((boolean) r13);
                        new m(com.sankuai.waimai.config.a.a().d(), com.meituan.android.singleton.b.a, com.sankuai.waimai.platform.b.A().c()).a("waimai_home_scroll_to_bottom_rate", Collections.singletonList(Float.valueOf(r13 != 0 ? 1.0f : 0.0f))).a("platform", "android").a("env", com.sankuai.waimai.foundation.core.a.b() ? "test" : "prod").a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, b.a(com.meituan.android.singleton.b.a)).a();
                    }
                    if (r13 != 0) {
                        b a3 = b.a();
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = b.a;
                        if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "134ab544c26b4624d14a110cc1a2c688", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "134ab544c26b4624d14a110cc1a2c688");
                        } else {
                            a3.b = MetricsSpeedMeterTask.createCustomSpeedMeterTask("waimai_home_scroll_with_loading_more", TimeUtil.elapsedTimeMillis());
                            a3.b.recordStep("Loading+");
                        }
                    }
                }
                c.a(a.this.t, i);
            }
        });
        a(this.x);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = R;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cab05a265d7a61c90b09c025580058d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cab05a265d7a61c90b09c025580058d6");
        } else if (this.M != null && this.K != null) {
            this.M.x.a((j<com.sankuai.waimai.mach.b>) new com.sankuai.waimai.business.page.home.list.future.mach.b(this.Q));
            this.M.y.a((j<Rect>) this.K.p.a());
            this.M.B.a((j<com.sankuai.waimai.business.page.common.list.ai.c>) this.J);
            this.M.D.b = new com.meituan.android.cube.pga.action.d<Map<String, Object>>() { // from class: com.sankuai.waimai.business.page.home.list.future.complex.a.16
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.d
                public final /* synthetic */ Map<String, Object> a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1c6caa5dfe538da8b9b19e88860b3bb8", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Map) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1c6caa5dfe538da8b9b19e88860b3bb8");
                    }
                    HashMap hashMap = new HashMap(a.this.ab);
                    hashMap.put("filter", a.this.ac);
                    return hashMap;
                }
            };
            this.M.z.b = new com.meituan.android.cube.pga.action.c<Pair<com.sankuai.waimai.mach.node.a, RocksServerModel>, Boolean>() { // from class: com.sankuai.waimai.business.page.home.list.future.complex.a.17
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.c
                public final /* synthetic */ Boolean a(Pair<com.sankuai.waimai.mach.node.a, RocksServerModel> pair) {
                    Pair<com.sankuai.waimai.mach.node.a, RocksServerModel> pair2 = pair;
                    Object[] objArr3 = {pair2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "eef62730ab4be6f46045fa3ff685fd7b", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "eef62730ab4be6f46045fa3ff685fd7b");
                    }
                    if (pair2 != null) {
                        com.sankuai.waimai.mach.node.a aVar = (com.sankuai.waimai.mach.node.a) pair2.first;
                        if (aVar != null && a.this.H != null && a.this.H.g != null) {
                            final int adapterPosition = a.this.H.g.getChildViewHolder(aVar.c().f.getContainer()).getAdapterPosition();
                            RocksServerModel rocksServerModel = (RocksServerModel) pair2.second;
                            boolean d = a.this.H.h.d();
                            if (!d) {
                                adapterPosition++;
                            }
                            if (adapterPosition > 0) {
                                a.this.F.a(rocksServerModel, adapterPosition, d, new a.b() { // from class: com.sankuai.waimai.business.page.home.list.future.complex.a.17.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.rocks.view.a.b
                                    public final void a() {
                                    }

                                    @Override // com.sankuai.waimai.rocks.view.a.b
                                    public final void a(com.sankuai.waimai.rocks.view.viewmodel.e eVar) {
                                        Object[] objArr4 = {eVar};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d359b46bbbd79f34cc28eafa43a7036c", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d359b46bbbd79f34cc28eafa43a7036c");
                                        } else if (eVar != null) {
                                            a.this.ah = adapterPosition;
                                            a.this.ai = eVar;
                                        }
                                    }
                                });
                            }
                        }
                        return Boolean.FALSE;
                    }
                    return Boolean.FALSE;
                }
            };
            this.K.V = this.J;
        }
        return a;
    }

    @Override // com.sankuai.waimai.business.page.home.list.future.a, com.sankuai.waimai.business.page.common.arch.a
    public final void a(PageFragment pageFragment) {
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = R;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "880f8ca7b834ea791ff37fb873de41fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "880f8ca7b834ea791ff37fb873de41fe");
            return;
        }
        super.a(pageFragment);
        this.aa = (FutureViewModel) q.a(pageFragment).a(FutureViewModel.class);
        this.aa.c.a(pageFragment, new l<com.sankuai.waimai.business.page.home.list.future.net.b>() { // from class: com.sankuai.waimai.business.page.home.list.future.complex.a.11
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable com.sankuai.waimai.business.page.home.list.future.net.b bVar) {
                com.sankuai.waimai.business.page.home.list.future.net.b bVar2 = bVar;
                Object[] objArr2 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c1cfe19a8f2bc51d47717582ab80d46", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c1cfe19a8f2bc51d47717582ab80d46");
                } else {
                    a.this.a(bVar2);
                }
            }
        });
        this.K.i.a(this.x, new l<Integer>() { // from class: com.sankuai.waimai.business.page.home.list.future.complex.a.12
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Integer num) {
                Integer num2 = num;
                Object[] objArr2 = {num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd346bccf727f4123e49ad6f50f7dca6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd346bccf727f4123e49ad6f50f7dca6");
                } else if (num2 != null) {
                    a.this.Z = num2.intValue();
                }
            }
        });
        this.K.z.a(this.x, new l<Void>() { // from class: com.sankuai.waimai.business.page.home.list.future.complex.a.13
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Void r11) {
                Object[] objArr2 = {r11};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8efe935033682dd764df3ad407ed744e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8efe935033682dd764df3ad407ed744e");
                } else {
                    a.this.S = null;
                }
            }
        });
        this.K.k.a(new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.list.future.complex.a.14
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b8112d25a117543afbb2212f3bd402f1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b8112d25a117543afbb2212f3bd402f1");
                } else if (bool2.booleanValue()) {
                    a.this.X.c();
                }
            }
        });
        this.K.f.a(new l<d.a>() { // from class: com.sankuai.waimai.business.page.home.list.future.complex.a.15
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable d.a aVar) {
                d.a aVar2 = aVar;
                boolean z = false;
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a690fce4e2e3783e27a2c12c921ed1a6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a690fce4e2e3783e27a2c12c921ed1a6");
                } else if (aVar2 == d.a.ON_DESTROY) {
                    if (a.this.T != null) {
                        a.this.T.a();
                    }
                    if (a.this.ad != null) {
                        a.this.ad.a();
                    }
                    if (com.sankuai.waimai.foundation.core.a.e()) {
                        if (a.this.F != null && a.this.F.c != null && a.this.F.c.c() != null) {
                            a.this.F.c.c().a();
                        }
                        if (a.this.H == null || a.this.H.G() == null || com.sankuai.waimai.foundation.utils.d.a(a.this.H.G().o)) {
                            return;
                        }
                        for (com.sankuai.waimai.rocks.view.viewmodel.e eVar : a.this.H.G().o) {
                            if (eVar instanceof com.sankuai.waimai.rocks.view.viewmodel.a) {
                                ((com.sankuai.waimai.rocks.view.viewmodel.a) eVar).n();
                            }
                        }
                    }
                } else if (aVar2 == d.a.ON_PAUSE) {
                    if (a.this.T != null) {
                        com.sankuai.waimai.business.page.common.list.ai.b bVar = a.this.T;
                        int i = a.this.Z;
                        Object[] objArr3 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.common.list.ai.b.a;
                        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "eb2d5cbb2fe1011b321186ec3ae3a0e9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "eb2d5cbb2fe1011b321186ec3ae3a0e9");
                        } else {
                            com.sankuai.waimai.alita.core.feature.b a2 = com.sankuai.waimai.alita.core.feature.c.a().a("waimai");
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("last_leave_offset", i);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            a2.c(com.sankuai.waimai.alita.core.feature.e.a("waimai", "homepage", jSONObject));
                        }
                    }
                    if (a.this.N == null || a.this.N.getDialog() == null || !a.this.N.getDialog().isShowing()) {
                        return;
                    }
                    a.this.N.dismiss();
                } else if (aVar2 == d.a.ON_RESUME) {
                    if (a.this.ad != null) {
                        com.sankuai.waimai.business.page.home.list.future.recommend.a aVar3 = a.this.ad;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.page.home.list.future.recommend.a.a;
                        if (PatchProxy.isSupport(objArr4, aVar3, changeQuickRedirect4, false, "6031ead467b2acdc6d4d725cb918b9b9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, aVar3, changeQuickRedirect4, false, "6031ead467b2acdc6d4d725cb918b9b9");
                        } else if (!aVar3.l) {
                            final com.sankuai.waimai.business.page.home.list.future.recommend.c cVar = aVar3.c;
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.page.home.list.future.recommend.c.a;
                            if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "d107ba18a1468d318be8984a6b10030c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "d107ba18a1468d318be8984a6b10030c");
                            } else if (!cVar.g && cVar.i >= 0 && cVar.e != null && cVar.d != null) {
                                switch (cVar.h) {
                                    case 1:
                                        if (cVar.m != null) {
                                            int a3 = cVar.a(cVar.i);
                                            com.sankuai.waimai.rocks.view.viewmodel.e eVar2 = cVar.m;
                                            Object[] objArr6 = {Integer.valueOf(a3), eVar2};
                                            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.business.page.home.list.future.recommend.c.a;
                                            if (PatchProxy.isSupport(objArr6, cVar, changeQuickRedirect6, false, "2a61d05c605383c1863933a8d158a165", RobustBitConfig.DEFAULT_VALUE)) {
                                                z = ((Boolean) PatchProxy.accessDispatch(objArr6, cVar, changeQuickRedirect6, false, "2a61d05c605383c1863933a8d158a165")).booleanValue();
                                            } else if (a3 > 0) {
                                                RecyclerView recyclerView = cVar.c.d.g;
                                                int itemCount = recyclerView.getAdapter().getItemCount();
                                                if (a3 <= itemCount && (a3 != itemCount || recyclerView.getAdapter().getItemViewType(itemCount - 1) != -2)) {
                                                    cVar.c.a(eVar2, a3);
                                                    z = true;
                                                }
                                            }
                                            if (z) {
                                                if (cVar.n != null && cVar.n.c != null) {
                                                    cVar.n.c.a();
                                                }
                                                cVar.c.d.g.post(new Runnable() { // from class: com.sankuai.waimai.business.page.home.list.future.recommend.c.1
                                                    public static ChangeQuickRedirect a;

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        Object[] objArr7 = new Object[0];
                                                        ChangeQuickRedirect changeQuickRedirect7 = a;
                                                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "0f6ff0e29e4cba69afe7468f504d22ed", RobustBitConfig.DEFAULT_VALUE)) {
                                                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "0f6ff0e29e4cba69afe7468f504d22ed");
                                                        } else {
                                                            c.this.c.d.q();
                                                        }
                                                    }
                                                });
                                            }
                                            cVar.a();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        if (cVar.f != null) {
                                            ViewGroup container = cVar.e.f.getContainer();
                                            ViewGroup viewGroup = (ViewGroup) cVar.f.i();
                                            if (container != null && container.getChildCount() != 0 && viewGroup != null && cVar.d.getContext() != null && cVar.i < cVar.c.d.g.getAdapter().getItemCount()) {
                                                final View view = new View(cVar.d.getContext());
                                                view.setLayoutParams(new ViewGroup.LayoutParams(-1, container.getHeight() - g.a(container.getContext(), cVar.j)));
                                                view.setBackground(cVar.a(g.a(container.getContext(), 12.0f), "#cc222426"));
                                                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                                                alphaAnimation.setDuration(200L);
                                                alphaAnimation.setFillBefore(true);
                                                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                                                translateAnimation.setDuration(400L);
                                                final FrameLayout frameLayout = new FrameLayout(cVar.d.getContext());
                                                frameLayout.addView(view);
                                                frameLayout.addView(viewGroup);
                                                container.addView(frameLayout);
                                                cVar.k.put(Integer.valueOf(cVar.i), frameLayout);
                                                alphaAnimation.setAnimationListener(new com.sankuai.waimai.platform.widget.anim.a() { // from class: com.sankuai.waimai.business.page.home.list.future.recommend.c.2
                                                    public static ChangeQuickRedirect a;

                                                    @Override // android.view.animation.Animation.AnimationListener
                                                    public final void onAnimationEnd(Animation animation) {
                                                        Object[] objArr7 = {animation};
                                                        ChangeQuickRedirect changeQuickRedirect7 = a;
                                                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "f9a13823ae436a745b26c14140038d4e", RobustBitConfig.DEFAULT_VALUE)) {
                                                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "f9a13823ae436a745b26c14140038d4e");
                                                        } else {
                                                            view.setAlpha(0.0f);
                                                        }
                                                    }
                                                });
                                                view.startAnimation(alphaAnimation);
                                                viewGroup.setAnimation(translateAnimation);
                                                cVar.f.y();
                                                cVar.c.d.h.b.get(cVar.i).t = frameLayout;
                                                cVar.f.a(new Mach.d() { // from class: com.sankuai.waimai.business.page.home.list.future.recommend.c.3
                                                    public static ChangeQuickRedirect a;

                                                    @Override // com.sankuai.waimai.mach.Mach.d
                                                    public final void a(@NonNull String str, Map<String, Object> map) {
                                                        Object[] objArr7 = {str, map};
                                                        ChangeQuickRedirect changeQuickRedirect7 = a;
                                                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "2a994cd40dd15a16926ddea5156517d3", RobustBitConfig.DEFAULT_VALUE)) {
                                                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "2a994cd40dd15a16926ddea5156517d3");
                                                        } else if (TextUtils.equals(str, "closePopupLayer")) {
                                                            frameLayout.setVisibility(8);
                                                            ViewGroup viewGroup2 = (ViewGroup) frameLayout.getParent();
                                                            if (viewGroup2 != null) {
                                                                viewGroup2.removeView(frameLayout);
                                                            }
                                                        }
                                                    }
                                                });
                                                cVar.a();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                    }
                    a.u(a.this);
                }
            }
        });
        if (pageFragment == null || pageFragment.getActivity() == null) {
            return;
        }
        this.ae = (PouchViewModel) q.a(pageFragment.getActivity()).a(PouchViewModel.class);
    }

    @Override // com.sankuai.waimai.business.page.home.list.future.a, com.sankuai.waimai.business.page.common.arch.a
    /* renamed from: a */
    public final void d(com.sankuai.waimai.business.page.home.list.future.model.a aVar) {
        String a;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = R;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9061ab5ffafec13157b2fe0f6911a5c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9061ab5ffafec13157b2fe0f6911a5c7");
            return;
        }
        super.d(aVar);
        if (this.z) {
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = R;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2760bf7473a7fdc414054d077004e1c1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2760bf7473a7fdc414054d077004e1c1");
            } else {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = R;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f5dcb30f3467e694a29263166e29b309", RobustBitConfig.DEFAULT_VALUE)) {
                    a = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f5dcb30f3467e694a29263166e29b309");
                } else {
                    a = ListIDHelper.a.a.a("page", k.h);
                    if (TextUtils.isEmpty(a)) {
                        a = ListIDHelper.a.a.a();
                        ListIDHelper.a.a.a("page", k.h, a);
                    }
                }
                this.Y = a;
                this.ab.put("rank_list_id", this.Y);
                this.ab.put("is_rank", Integer.valueOf(aVar.j));
                this.ab.put("rank_trace_id", aVar.i);
                this.ab.put("seqNumber", Integer.valueOf(this.X.b));
                String str = aVar.i;
                Object[] objArr4 = {str};
                ChangeQuickRedirect changeQuickRedirect4 = R;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1682e3b7a90a13569671a63dca4a7d2c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1682e3b7a90a13569671a63dca4a7d2c");
                } else if (this.M != null) {
                    this.M.v.a((j<String>) this.Y);
                    this.M.u.a((j<String>) str);
                }
            }
            this.O.a(this.B);
            if (this.ad != null && this.O != null) {
                this.ad.l = this.O.f;
            }
            a(this.A.b, false, false, 0, true, false);
            this.X.b = 0;
            return;
        }
        W();
    }

    @Override // com.sankuai.waimai.business.page.home.list.future.a
    public final void Q() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = R;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19c8dda1952057ff03d10d774a200898", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19c8dda1952057ff03d10d774a200898");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7d0814010dd9af20bab3270b1f449537", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7d0814010dd9af20bab3270b1f449537")).booleanValue();
        } else {
            long currentTimeMillis = System.currentTimeMillis() - d.m;
            if (currentTimeMillis <= 0 || currentTimeMillis >= 400) {
                d.m = System.currentTimeMillis();
                z = false;
            } else {
                z = true;
            }
        }
        if (!z && d.a().b()) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = R;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "792fda02c5063939e77faa5145fcdf5b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "792fda02c5063939e77faa5145fcdf5b");
            } else {
                com.sankuai.waimai.business.page.common.list.ai.a.a().a(new a.InterfaceC0759a() { // from class: com.sankuai.waimai.business.page.home.list.future.complex.a.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.page.common.list.ai.a.InterfaceC0759a
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9a58655dc2568d1ae84c66186a8bd8bc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9a58655dc2568d1ae84c66186a8bd8bc");
                        } else {
                            a.this.a(true, false);
                        }
                    }
                });
            }
        }
    }

    @Override // com.sankuai.waimai.business.page.home.list.future.a
    public final void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = R;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e24a5925232c9e8bc36452c26fc3353d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e24a5925232c9e8bc36452c26fc3353d");
            return;
        }
        if (this.ad != null) {
            com.sankuai.waimai.business.page.home.list.future.recommend.a aVar = this.ad;
            Object[] objArr2 = {view, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.home.list.future.recommend.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "2e022c8fe0344297cda9b0a89e003122", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "2e022c8fe0344297cda9b0a89e003122");
            } else {
                aVar.c.a(view, i);
            }
        }
        if (this.ae != null) {
            this.ae.d().a((android.arch.lifecycle.k<Void>) null);
        }
    }

    @Override // com.sankuai.waimai.business.page.home.list.future.a
    public final com.sankuai.waimai.mach.d R() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = R;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "650a56e67b11695d651c1ae0b4150f1a", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "650a56e67b11695d651c1ae0b4150f1a") : new com.sankuai.waimai.business.page.home.list.future.d("c_m84bv26", AppUtil.generatePageInfoKey(this), new d.a() { // from class: com.sankuai.waimai.business.page.home.list.future.complex.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.home.list.future.d.a
            public final String a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ebd9b3e254ef70da5a28192d18f85e0d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ebd9b3e254ef70da5a28192d18f85e0d") : a.this.ac;
            }
        }, this.J, this.O, this.H, this.L);
    }

    @Override // com.sankuai.waimai.business.page.home.list.future.a
    public final Map<String, Object> S() {
        return this.ab;
    }

    @Override // com.sankuai.waimai.business.page.home.list.future.a
    public final void a(com.sankuai.waimai.platform.widget.emptylayout.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = R;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87ea62fd9bdb2a5205672ca02456a3a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87ea62fd9bdb2a5205672ca02456a3a7");
            return;
        }
        this.W = dVar;
        this.W.a("c_m84bv26");
        this.W.a(R.color.wm_page_f6);
        this.W.b(R.string.wm_page_poiList_progressbar_loading);
        this.W.b(com.sankuai.waimai.platform.widget.emptylayout.d.m, R.string.wm_page_no_poi_food_reunion);
        this.W.b(R.drawable.wm_common_default_net_error_icon, R.string.wm_page_complex_list_net_error_title, R.string.wm_page_complex_list_net_error_sub_title, R.string.wm_common_reload, new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.list.future.complex.a.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6444642e6bf87582621fa91c6118c95b", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6444642e6bf87582621fa91c6118c95b");
                    return;
                }
                a.this.W.d();
                a.this.a(false, false);
            }
        });
        View findViewById = this.W.a().findViewById(R.id.txt_info);
        if (findViewById instanceof TextView) {
            ((TextView) findViewById).setSingleLine(false);
        }
    }

    public final void a(com.sankuai.waimai.business.page.home.list.future.net.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = R;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35e01bb7cbb28eac68b1b5b4caabb3e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35e01bb7cbb28eac68b1b5b4caabb3e4");
            return;
        }
        b(bVar);
        a(false, true);
    }

    public final void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = R;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1e9a7cfa6199b2134dcc1b794b930d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1e9a7cfa6199b2134dcc1b794b930d3");
        } else {
            a(z, z2, (b.a) null);
        }
    }

    public final void a(final boolean z, final boolean z2, b.a aVar) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = R;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6cba0542b9ef87025b5524cadef0187", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6cba0542b9ef87025b5524cadef0187");
        } else if (this.V) {
        } else {
            this.V = true;
            if (z2) {
                this.x.n();
            }
            d.a().c();
            final boolean z3 = aVar != null;
            final int i = aVar == null ? 0 : aVar.d;
            if (i == 4) {
                b(this.S);
                this.E.setVisibility(8);
                this.W.h();
                this.x.n();
            }
            String str = this.S == null ? "" : this.S.b;
            String str2 = this.S == null ? "" : this.S.c;
            final boolean a = a(str, str2);
            if (a) {
                this.O.a();
            } else if (z2) {
                this.O.a(this.B);
            }
            String str3 = (this.A == null || this.A.c == null || i == 4 || z2) ? "" : this.A.c.b;
            String b = com.sankuai.waimai.business.page.common.list.ai.a.a().b();
            this.ag = 0;
            if (z2) {
                this.X.c();
            }
            if (z3) {
                if (i != 4) {
                    this.ag = V();
                } else {
                    this.X.b = 0;
                    this.ag = 0;
                }
                b = com.sankuai.waimai.business.page.common.list.ai.a.a().a(this.T.a(aVar));
            } else if (z2) {
                this.ag = 0;
            } else {
                this.ag = this.X.b();
            }
            String str4 = b;
            if (this.ag > 0) {
                this.X.a();
            } else {
                this.X.b = 0;
            }
            int i2 = (aVar == null || aVar.e != 1) ? z ? 7 : 8 : 11;
            this.O.b = Math.max(this.ag, 0);
            com.sankuai.waimai.platform.mach.monitor.d.a("home/feeds/mainlist", "homepage_v2");
            String str5 = "";
            if (this.K != null && this.K.m != null && this.K.m.a() != null) {
                str5 = this.K.m.a().first;
            }
            String str6 = str5;
            if (this.af == null) {
                this.af = new HashMap();
            }
            this.af.clear();
            this.af.put("entrance_scene", this.O.a(a));
            this.af.put("feed_model", this.O.b(a));
            if (this.O.k && !a) {
                if (this.K != null) {
                    this.K.g(true);
                }
                this.af.put("product_page_index", Integer.valueOf(this.O.i));
            } else {
                if (this.K != null) {
                    this.K.g(false);
                }
                this.O.i = 0;
            }
            this.ab.put("seqNumber", Integer.valueOf(this.X.b));
            final boolean b2 = com.sankuai.waimai.business.page.home.helper.b.a().b();
            if (b2) {
                com.sankuai.waimai.business.page.home.helper.b.a().a(4);
            }
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((FutureApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) FutureApi.class)).getHomeComplexList(i2, Math.max(this.ag, 0), str3, this.Y, this.X.b, str, str2, z3, str4, i, com.sankuai.waimai.business.page.home.utils.l.a(), str6, d.a().d(), com.sankuai.waimai.foundation.utils.k.a().toJson(this.J.c()), d.a().h, this.af), new b.AbstractC1042b<BaseResponse<RocksServerModel>>() { // from class: com.sankuai.waimai.business.page.home.list.future.complex.a.5
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d56444896fc2f01dc387a528c7451d0a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d56444896fc2f01dc387a528c7451d0a");
                        return;
                    }
                    if (i == 4) {
                        a.this.X.c();
                    }
                    d.a().a((baseResponse == null || baseResponse.data == 0 || ((RocksServerModel) baseResponse.data).moduleList == null) ? null : ((RocksServerModel) baseResponse.data).moduleList);
                    a.a(a.this, baseResponse, z, z2, z3, i, false, a);
                    if (b2) {
                        com.sankuai.waimai.business.page.home.helper.b.a().a(5);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cdbec7973237773feea3cf064d0800e5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cdbec7973237773feea3cf064d0800e5");
                        return;
                    }
                    a.this.V = false;
                    if (z3) {
                        return;
                    }
                    a.this.b(z);
                }
            }, this.y);
        }
    }

    private int V() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = R;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0be362ecbad5c03eabd15127221c0a9a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0be362ecbad5c03eabd15127221c0a9a")).intValue() : this.J.c + 1 + this.T.b();
    }

    private boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = R;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c97a7cafcfa779f62b4ffb9764090b47", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c97a7cafcfa779f62b4ffb9764090b47")).booleanValue() : (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) ? false : true;
    }

    @Override // com.sankuai.waimai.business.page.home.list.future.a
    public final void P() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = R;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94433c1f851053752d56184fb24c3f6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94433c1f851053752d56184fb24c3f6e");
            return;
        }
        super.P();
        if (this.V) {
            return;
        }
        int i = this.O.j;
        int u = this.H.u();
        int i2 = u > i ? u - i : 0;
        if (this.ad != null) {
            this.ad.l = false;
        }
        a(this.O.h, true, false, i2, false, false);
        this.O.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = R;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d155c8d6e497d7cffad30cfb589b54e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d155c8d6e497d7cffad30cfb589b54e7");
        } else {
            a(z, "网络异常，请稍后重试");
        }
    }

    private void a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = R;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7144554ce009376c0d47ad9f6d5f4db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7144554ce009376c0d47ad9f6d5f4db");
            return;
        }
        this.V = false;
        if (z) {
            if (!TextUtils.isEmpty(str)) {
                ae.a(this.t, str);
            }
            this.H.c(4);
            return;
        }
        X();
        this.E.setVisibility(8);
    }

    private synchronized void a(final RocksServerModel rocksServerModel, final boolean z, final boolean z2, int i, final boolean z3, final boolean z4) {
        boolean z5 = false;
        Object[] objArr = {rocksServerModel, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Byte.valueOf(z4 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = R;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b7d5c07f5b538f7f05aa932d8ac6b40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b7d5c07f5b538f7f05aa932d8ac6b40");
            return;
        }
        this.A = com.sankuai.waimai.business.page.home.list.future.model.a.a(rocksServerModel);
        this.ac = this.S != null ? this.S.a() : "";
        if (this.A.c != null && this.A.c.a) {
            z5 = true;
        }
        if (rocksServerModel.isCache && this.aj == rocksServerModel.isCache) {
            return;
        }
        PreloadDataModel.get().isCacheRendering = rocksServerModel.isCache;
        this.aj = rocksServerModel.isCache;
        if (rocksServerModel.isCache) {
            com.sankuai.waimai.business.page.home.utils.m.a().a("FeedsCacheRender+");
            com.sankuai.waimai.business.page.home.utils.j.a("FeedsCacheRender+");
        }
        final boolean z6 = z5;
        this.F.a(rocksServerModel, false, z5, z, true, i, new a.c() { // from class: com.sankuai.waimai.business.page.home.list.future.complex.a.6
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r5v10 */
            /* JADX WARN: Type inference failed for: r5v2 */
            /* JADX WARN: Type inference failed for: r5v5, types: [D, com.sankuai.waimai.rocks.model.RocksServerModel] */
            /* JADX WARN: Type inference failed for: r5v8 */
            /* JADX WARN: Type inference failed for: r5v9 */
            @Override // com.sankuai.waimai.rocks.view.a.c
            public final void a() {
                RecyclerView.LayoutManager layoutManager;
                View a2;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e2fa5ce32bcdaee3ebfeed0936cdf9c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e2fa5ce32bcdaee3ebfeed0936cdf9c");
                    return;
                }
                if (a.this.H != null && a.this.H.G() != null) {
                    com.sankuai.waimai.rocks.model.a aVar = a.this.H.G().q;
                    a.this.K.U = aVar;
                    if (a.this.M != null && a.this.M.C != null) {
                        a.this.M.C.a((j<com.sankuai.waimai.rocks.model.a>) aVar);
                    }
                }
                a.a(a.this, rocksServerModel);
                if (rocksServerModel.isCache) {
                    com.sankuai.waimai.business.page.home.utils.m.a().a("FeedsCacheRender-");
                    com.sankuai.waimai.business.page.home.utils.j.a("FeedsCacheRender-");
                    com.sankuai.waimai.business.page.home.utils.j.a("LaunchCompleted");
                }
                h.a().a("complex_render_success", true);
                com.sankuai.waimai.business.page.home.utils.m.a().a("prerenderList-");
                com.sankuai.waimai.business.page.home.utils.m.a().a("BindData-");
                b a3 = b.a();
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                ?? r5 = 0;
                r5 = 0;
                if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "bbb4fd6d463c583bbcd3e15be217c076", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "bbb4fd6d463c583bbcd3e15be217c076");
                } else if (a3.b != null) {
                    a3.b.recordStep("Loading-");
                    com.sankuai.meituan.takeoutnew.util.aop.h.a(a3.b);
                    a3.b = null;
                }
                a.this.E.setVisibility(0);
                a.this.H.c(z6 ? 1 : 3);
                a.this.T();
                a.this.W.h();
                if (!z) {
                    if (a.this.U.b > 0) {
                        com.sankuai.waimai.business.page.common.view.nested.a aVar2 = a.this.U;
                        NestedSmoothRecyclerView nestedSmoothRecyclerView = a.this.E;
                        Object[] objArr4 = {nestedSmoothRecyclerView};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.page.common.view.nested.b.c;
                        if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "b812aad9ba1cb4d2198fc82f1b015c51", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "b812aad9ba1cb4d2198fc82f1b015c51");
                        } else if (aVar2.d != nestedSmoothRecyclerView) {
                            if (aVar2.d != null) {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.page.common.view.nested.b.c;
                                if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "50a43e6f9da6976ab718510de6a9cdaa", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "50a43e6f9da6976ab718510de6a9cdaa");
                                } else {
                                    aVar2.d.setOnFlingListener(null);
                                }
                            }
                            aVar2.d = nestedSmoothRecyclerView;
                            if (aVar2.d != null) {
                                Object[] objArr6 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.business.page.common.view.nested.b.c;
                                if (PatchProxy.isSupport(objArr6, aVar2, changeQuickRedirect6, false, "96286a09ee29dbc5317191594dadb959", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, aVar2, changeQuickRedirect6, false, "96286a09ee29dbc5317191594dadb959");
                                } else if (aVar2.d.getOnFlingListener() != null) {
                                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                                } else {
                                    aVar2.d.setOnFlingListener(aVar2);
                                }
                                aVar2.e = new Scroller(aVar2.d.getContext(), new DecelerateInterpolator());
                                Object[] objArr7 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.business.page.common.view.nested.b.c;
                                if (PatchProxy.isSupport(objArr7, aVar2, changeQuickRedirect7, false, "59a22fff1d907194a2d456d3bbb91b64", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, aVar2, changeQuickRedirect7, false, "59a22fff1d907194a2d456d3bbb91b64");
                                } else if (aVar2.d != null && (layoutManager = aVar2.d.getLayoutManager()) != null && (a2 = aVar2.a(layoutManager)) != null) {
                                    int[] a4 = aVar2.a(layoutManager, a2);
                                    if (a4[0] != 0 || a4[1] != 0) {
                                        aVar2.d.smoothScrollBy(a4[0], a4[1]);
                                    }
                                }
                            }
                        }
                    }
                    a.this.aa.a(true);
                    if (com.sankuai.waimai.business.page.home.preload.task.f.c()) {
                        com.sankuai.waimai.business.page.home.preload.machpreload.a.a().a(rocksServerModel);
                    }
                }
                if (z2) {
                    a.this.E.scrollToPosition(0);
                }
                a.this.x.o();
                if (z3 && d.a().b()) {
                    a.this.V = false;
                    com.sankuai.waimai.business.page.common.list.ai.a.a().a(rocksServerModel.jsonData, "hit_tabs");
                } else if (!z3 || d.a().b()) {
                    a.this.V = false;
                    com.sankuai.waimai.business.page.common.list.ai.a.a().a(rocksServerModel.jsonData, "hit_mainlist");
                } else {
                    d a5 = d.a();
                    Object[] objArr8 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect8 = d.a;
                    if (PatchProxy.isSupport(objArr8, a5, changeQuickRedirect8, false, "9ea73d29440a243542b57e6ea92749e7", RobustBitConfig.DEFAULT_VALUE)) {
                        r5 = (RocksServerModel) PatchProxy.accessDispatch(objArr8, a5, changeQuickRedirect8, false, "9ea73d29440a243542b57e6ea92749e7");
                    } else {
                        com.sankuai.waimai.foundation.utils.log.a.b("FeedTabsDataManager", "getRemainingData", new Object[0]);
                        a5.b = true;
                        if (a5.f != null && a5.d != null) {
                            int size = a5.d.size();
                            if (a5.c < size) {
                                a5.f.moduleList = new ArrayList(a5.d.subList(a5.c, size));
                            }
                            a5.c = size;
                            r5 = a5.f;
                        }
                    }
                    if (r5 == 0 || com.sankuai.waimai.foundation.utils.d.a(r5.moduleList)) {
                        a.this.V = false;
                    } else {
                        a.this.V = true;
                        BaseResponse baseResponse = new BaseResponse();
                        baseResponse.data = r5;
                        baseResponse.code = 0;
                        if (!PreloadDataModel.get().isCacheRendering) {
                            a.a(a.this, baseResponse, true, false, false, 0, true, false);
                        }
                    }
                }
                if (z4) {
                    a.this.a(true, false);
                }
                a.R(a.this);
                if (PreloadDataModel.get().isCacheRendering && rocksServerModel.isCache) {
                    PreloadDataModel.get().isCacheRendering = false;
                    PreloadDataModel.get().setIsCacheRender(true);
                }
            }

            @Override // com.sankuai.waimai.rocks.view.a.c
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "99ae893c8dab721e0540b0cf20ba0a6a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "99ae893c8dab721e0540b0cf20ba0a6a");
                    return;
                }
                PreloadDataModel.get().isCacheRendering = false;
                a.this.V = false;
                a.this.X();
                h.a().b();
                com.sankuai.waimai.business.page.home.utils.m.a().cancel();
                b.a().cancel();
                a.R(a.this);
            }

            @Override // com.sankuai.waimai.rocks.view.a.c
            public final void a(List<com.sankuai.waimai.rocks.node.a> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c3e92de67ab84ac99fd4211f0004b31", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c3e92de67ab84ac99fd4211f0004b31");
                } else {
                    a.a(a.this, list, z3);
                }
            }
        });
    }

    private void W() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = R;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7576533c69ccd693e1abb68aa1e2d165", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7576533c69ccd693e1abb68aa1e2d165");
            return;
        }
        this.E.setVisibility(8);
        this.W.b(com.sankuai.waimai.platform.widget.emptylayout.d.m, R.string.wm_page_no_poi_food_reunion);
        this.W.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = R;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30654c6615c74ca3b3d600b89ac096b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30654c6615c74ca3b3d600b89ac096b0");
            return;
        }
        this.E.setVisibility(8);
        this.W.g();
        this.x.o();
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = R;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5f19f20acbd301d520dd1d6034e8da9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5f19f20acbd301d520dd1d6034e8da9");
            return;
        }
        super.bE_();
        if (this.T != null) {
            this.T.a();
        }
        if (this.ad != null) {
            this.ad.a();
        }
        if (com.sankuai.waimai.business.page.home.preload.task.f.c()) {
            com.sankuai.waimai.business.page.home.preload.machpreload.a.a().c();
            com.sankuai.waimai.business.page.home.preload.machpreload.a a = com.sankuai.waimai.business.page.home.preload.machpreload.a.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.home.preload.machpreload.a.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "6f0f4398e7dfd3a981ec8a22c4d891ae", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "6f0f4398e7dfd3a981ec8a22c4d891ae");
            } else if (a.c != null) {
                com.sankuai.waimai.mach.manager_new.b a2 = com.sankuai.waimai.mach.manager_new.b.a();
                b.a aVar = a.c;
                Object[] objArr3 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.mach.manager_new.b.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "3b86b9f3f90a15a88cfd5ee5b5fa7075", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "3b86b9f3f90a15a88cfd5ee5b5fa7075");
                } else {
                    a2.g.remove(aVar);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.business.page.home.list.future.a
    public final void a(String str, String str2, int i, int i2, List<String> list, List<String> list2, String str3, com.sankuai.waimai.mach.node.a aVar) {
        com.sankuai.waimai.business.page.home.list.future.model.e eVar;
        Object[] objArr = {str, str2, Integer.valueOf(i), Integer.valueOf(i2), list, list2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect = R;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbb1adea1455df7a59473d0bc8c6d9b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbb1adea1455df7a59473d0bc8c6d9b5");
            return;
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = R;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c7a83c483078e037f335beb2a2381f50", RobustBitConfig.DEFAULT_VALUE)) {
            eVar = (com.sankuai.waimai.business.page.home.list.future.model.e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c7a83c483078e037f335beb2a2381f50");
        } else {
            if (this.F != null && this.F.d != null && this.F.d.h != null) {
                List<com.sankuai.waimai.rocks.view.viewmodel.e> list3 = this.F.d.h.b;
                if (!com.sankuai.waimai.foundation.utils.d.a(list3) && i < list3.size()) {
                    eVar = new com.sankuai.waimai.business.page.home.list.future.model.e();
                    eVar.d = a(i - 1, list3);
                    eVar.a = a(i, list3);
                    eVar.d = a(i + 1, list3);
                    eVar.b = i;
                    String str4 = "";
                    if (this.ab != null && (this.ab.get("rank_trace_id") instanceof String)) {
                        str4 = (String) this.ab.get("rank_trace_id");
                    }
                    eVar.f = str4;
                }
            }
            eVar = null;
        }
        String str5 = (!TextUtils.isEmpty(str3) || eVar == null) ? str3 : eVar.f;
        if (this.ad != null) {
            com.sankuai.waimai.business.page.home.list.future.recommend.a aVar2 = this.ad;
            Object[] objArr3 = {str, str2, Integer.valueOf(i), Integer.valueOf(i2), list, list2, str5, eVar, aVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.list.future.recommend.a.a;
            if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "beb9115df5af85a4b6eb681e8da11bfb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "beb9115df5af85a4b6eb681e8da11bfb");
                return;
            }
            aVar2.d = str2;
            aVar2.e = str;
            aVar2.f = i;
            aVar2.g = list;
            aVar2.h = list2;
            aVar2.i = str5;
            aVar2.j = i2;
            aVar2.k = eVar;
            aVar2.c.e = aVar;
        }
    }

    private String a(int i, List<com.sankuai.waimai.rocks.view.viewmodel.e> list) {
        com.sankuai.waimai.rocks.view.viewmodel.e eVar;
        Object[] objArr = {Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = R;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "638ca4ac7761a1c2b056481eaff72d57", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "638ca4ac7761a1c2b056481eaff72d57") : (list == null || i < 0 || i >= list.size() || (eVar = list.get(i)) == null || eVar.s == null) ? "" : eVar.s.e;
    }

    private void b(com.sankuai.waimai.business.page.home.list.future.net.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = R;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94a7ed297aee5677a47c21578c839078", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94a7ed297aee5677a47c21578c839078");
            return;
        }
        this.S = bVar;
        this.X.b = 0;
        this.Y = ListIDHelper.a.a.a();
        ListIDHelper.a.a.a("page", k.h, this.Y);
        this.ab.put("rank_list_id", this.Y);
    }
}
