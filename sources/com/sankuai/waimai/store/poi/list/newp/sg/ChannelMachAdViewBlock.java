package com.sankuai.waimai.store.poi.list.newp.sg;

import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.d;
import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.gson.Gson;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.pouch.a;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.block.rxevent.VisibleChangeEvent;
import com.sankuai.waimai.store.poi.list.newp.sg.a;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ChannelMachAdViewBlock extends a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>> {
    public static ChangeQuickRedirect a;
    private ViewGroup i;
    private SCBaseActivity j;
    private com.sankuai.waimai.pouch.a k;
    private com.sankuai.waimai.pouch.model.c l;
    private PouchDynamicAd m;
    private String n;
    private String o;
    private Rect p;
    private boolean q;
    private String r;
    private boolean s;
    private View t;
    private FrameLayout u;
    private final boolean v;
    private final boolean w;
    private ViewTreeObserver.OnScrollChangedListener x;
    private android.arch.lifecycle.e y;

    public static /* synthetic */ void a(ChannelMachAdViewBlock channelMachAdViewBlock, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, channelMachAdViewBlock, changeQuickRedirect, false, "bf780cfbd60fe9ffbba5824a43fd9538", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, channelMachAdViewBlock, changeQuickRedirect, false, "bf780cfbd60fe9ffbba5824a43fd9538");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fail_reason", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        com.sankuai.waimai.pouch.monitor.e.a(new com.sankuai.waimai.pouch.monitor.d().a("store_platinum").b("data_error").d(jSONObject.toString()).a(true).b(), (Map<String, String>) null);
    }

    public static /* synthetic */ boolean a(ChannelMachAdViewBlock channelMachAdViewBlock, boolean z) {
        channelMachAdViewBlock.s = true;
        return true;
    }

    public static /* synthetic */ void c(ChannelMachAdViewBlock channelMachAdViewBlock, boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, channelMachAdViewBlock, changeQuickRedirect, false, "6ac660c03b068ff2e044a4fbe842b28b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, channelMachAdViewBlock, changeQuickRedirect, false, "6ac660c03b068ff2e044a4fbe842b28b");
        } else if (z) {
            channelMachAdViewBlock.k.d();
        } else {
            channelMachAdViewBlock.k.e();
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final /* synthetic */ void a(@NonNull com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String> bVar) {
        com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String> bVar2 = bVar;
        Object[] objArr = {bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfc8011a0208165075e728bc37f6779d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfc8011a0208165075e728bc37f6779d");
            return;
        }
        BaseModuleDesc a2 = a(this, bVar2, this.f);
        this.m = new com.sankuai.waimai.pouch.model.a<BaseModuleDesc>() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.ChannelMachAdViewBlock.4
            public static ChangeQuickRedirect a;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.sankuai.waimai.pouch.model.a
            public PouchDynamicAd a(BaseModuleDesc baseModuleDesc) {
                Object[] objArr2 = {baseModuleDesc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "13ae198b9e7fca7ea33dd773c7c7e916", RobustBitConfig.DEFAULT_VALUE)) {
                    return (PouchDynamicAd) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "13ae198b9e7fca7ea33dd773c7c7e916");
                }
                if (baseModuleDesc == null) {
                    ChannelMachAdViewBlock.a(ChannelMachAdViewBlock.this, "originData = null");
                    return null;
                } else if (baseModuleDesc.jsonData == null) {
                    ChannelMachAdViewBlock.a(ChannelMachAdViewBlock.this, "originData.jsonData = null");
                    return null;
                } else if (baseModuleDesc.jsonData.isEmpty()) {
                    ChannelMachAdViewBlock.a(ChannelMachAdViewBlock.this, "originData.jsonData is empty");
                    return null;
                } else {
                    Object obj = baseModuleDesc.jsonData.get("string_data");
                    if (obj != null) {
                        try {
                            return (PouchDynamicAd) new Gson().fromJson((String) obj, (Class<Object>) PouchDynamicAd.class);
                        } catch (Exception e) {
                            e.printStackTrace();
                            ChannelMachAdViewBlock.a(ChannelMachAdViewBlock.this, "string_data convert to PouchDynamicAd error");
                            return null;
                        }
                    }
                    PouchDynamicAd pouchDynamicAd = new PouchDynamicAd();
                    pouchDynamicAd.stringData = com.sankuai.waimai.pouch.util.c.a(baseModuleDesc.jsonData);
                    pouchDynamicAd.adTemplateId = baseModuleDesc.templateId;
                    ChannelMachAdViewBlock.this.r = (baseModuleDesc == null || baseModuleDesc.templateId == null) ? "" : baseModuleDesc.templateId;
                    pouchDynamicAd.defaultAdContainerId = PouchDynamicAd.CONTAINER_ID_POUCH_COMMON;
                    pouchDynamicAd.adContainerId = PouchDynamicAd.CONTAINER_ID_WM_COMMON;
                    pouchDynamicAd.businessName = "sm_homepage_platinum";
                    return pouchDynamicAd;
                }
            }
        }.a(a2);
        this.c.aH = a2.poiIdStr;
        String str = this.m == null ? null : this.m.adTemplateId;
        Map<String, Object> map = a2.jsonData;
        Object[] objArr2 = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "97111c2dfb3de17e71f0df5e29a1d8fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "97111c2dfb3de17e71f0df5e29a1d8fb");
        } else if (map == null || map.isEmpty() || TextUtils.isEmpty(str)) {
            hide();
        } else {
            if (this.v) {
                f.a((ViewGroup) getView(), str, (Context) this.j, map, false, 0, this.c, this.t);
            }
            if (this.w) {
                f.a((ViewGroup) getView(), str, (Context) this.j, map, false, 0, this.c, this.u);
            }
            show();
            this.q = false;
            this.k.c();
            this.k.a(this.m);
        }
    }

    public ChannelMachAdViewBlock(@NonNull SCBaseActivity sCBaseActivity, @NonNull ViewGroup viewGroup, @NonNull com.sankuai.waimai.store.param.a aVar) {
        super(viewGroup, aVar);
        Object[] objArr = {sCBaseActivity, viewGroup, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cf59f14f38fa9cabf9dbc4677ca8b95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cf59f14f38fa9cabf9dbc4677ca8b95");
            return;
        }
        this.o = "first_show";
        this.j = sCBaseActivity;
        this.n = aVar.G;
        this.v = com.sankuai.waimai.store.base.abtest.a.h();
        this.w = com.sankuai.waimai.store.base.abtest.a.i();
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final int b() {
        return (this.v || this.w) ? R.layout.wm_sc_home_tile_new : R.layout.wm_sc_home_tile;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final void a(@NonNull a.C1279a c1279a) {
        Object[] objArr = {c1279a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0df7d19817efc1f3a886f729a56af0fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0df7d19817efc1f3a886f729a56af0fd");
            return;
        }
        int a2 = c1279a.a(getContext());
        int b = c1279a.b(getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
        if (a2 >= 0) {
            marginLayoutParams.topMargin = a2;
        }
        if (b >= 0) {
            marginLayoutParams.bottomMargin = b;
        }
        this.i.setLayoutParams(marginLayoutParams);
        if (this.v && this.t != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.t.getLayoutParams();
            if (a2 >= 0) {
                marginLayoutParams2.topMargin = a2;
            }
            if (b >= 0) {
                marginLayoutParams2.bottomMargin = b;
            }
            this.t.setLayoutParams(marginLayoutParams2);
        }
        if (!this.w || this.u == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.u.getLayoutParams();
        if (a2 >= 0) {
            marginLayoutParams3.topMargin = a2;
        }
        if (b >= 0) {
            marginLayoutParams3.bottomMargin = b;
        }
        this.u.setLayoutParams(marginLayoutParams3);
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80d7017fc350924aacd8897a400531f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80d7017fc350924aacd8897a400531f4");
            return;
        }
        super.onViewCreated();
        this.i = (ViewGroup) findView(R.id.fl_tile_container);
        if (this.v) {
            this.t = findView(R.id.sg_def_img);
        }
        if (this.w) {
            this.u = (FrameLayout) findView(R.id.layout_mach_def);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c124f657dcd21d2114002c92d21a86f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c124f657dcd21d2114002c92d21a86f4");
        } else {
            this.l = new com.sankuai.waimai.pouch.model.c();
            this.l.b = this.n;
            this.l.c = "首页_0";
            this.l.a = AppUtil.generatePageInfoKey(this.j);
            this.l.d = this.j.w();
            HashMap hashMap = new HashMap();
            hashMap.put("position", "smhomepage");
            hashMap.put("request_trace_id", this.c.aI);
            this.l.h = hashMap;
            this.l.f = "supermarket";
            this.l.e = "sm_home_platinum";
            ArrayList arrayList = new ArrayList();
            arrayList.add("waimai_platinum_report_procedure");
            com.sankuai.waimai.pouch.plugin.b bVar = new com.sankuai.waimai.pouch.plugin.b();
            bVar.b = arrayList;
            a.C1112a c1112a = new a.C1112a();
            c1112a.c = this.i;
            c1112a.b = this.mContext;
            c1112a.d = this.l;
            c1112a.g = bVar;
            this.k = c1112a.a();
            this.k.k = true;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("fst_cate_id", String.valueOf(this.c.c));
            arrayMap.put("sec_cate_id", this.c.f);
            arrayMap.put("category_code", String.valueOf(this.c.c));
            this.k.d = arrayMap;
            this.p = new Rect(0, getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_48) + getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_35), h.a(getContext()), h.b(getContext()));
            this.k.f = new com.sankuai.waimai.pouch.view.c() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.ChannelMachAdViewBlock.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.pouch.view.c
                public final void b() {
                }

                @Override // com.sankuai.waimai.pouch.view.c
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "417d054b92efb7a1261d839441c3b159", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "417d054b92efb7a1261d839441c3b159");
                        return;
                    }
                    ChannelMachAdViewBlock.a(ChannelMachAdViewBlock.this, true);
                    ChannelMachAdViewBlock.this.c.bv++;
                }

                @Override // com.sankuai.waimai.pouch.view.c
                public final void c() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fbdd971387e14bc6d68543bf65dcfb1c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fbdd971387e14bc6d68543bf65dcfb1c");
                        return;
                    }
                    if (ChannelMachAdViewBlock.this.t != null) {
                        ChannelMachAdViewBlock.this.t.setVisibility(8);
                    }
                    if (ChannelMachAdViewBlock.this.u != null) {
                        ChannelMachAdViewBlock.this.u.setVisibility(8);
                    }
                    ChannelMachAdViewBlock.this.k.a(ChannelMachAdViewBlock.this.p);
                    if (com.sankuai.waimai.store.expose.v2.utils.a.a(ChannelMachAdViewBlock.this.i, ChannelMachAdViewBlock.this.p)) {
                        com.sankuai.shangou.stone.util.log.a.a("ChannelMachAdViewBlock", "isViewIntersectRect, appear~", new Object[0]);
                        ChannelMachAdViewBlock.this.q = true;
                        ChannelMachAdViewBlock.this.k.i = ChannelMachAdViewBlock.this.o;
                        ChannelMachAdViewBlock.this.k.a();
                        ChannelMachAdViewBlock.this.k.d();
                    }
                }
            };
            if (this.i != null) {
                this.x = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.ChannelMachAdViewBlock.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d1048d195413f26c59bfac286c08bbb1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d1048d195413f26c59bfac286c08bbb1");
                        } else if (!com.sankuai.waimai.store.expose.v2.utils.a.a(ChannelMachAdViewBlock.this.i, ChannelMachAdViewBlock.this.p) || ChannelMachAdViewBlock.this.q) {
                        } else {
                            com.sankuai.shangou.stone.util.log.a.a("ChannelMachAdViewBlock", "isViewIntersectRect, expose~", new Object[0]);
                            ChannelMachAdViewBlock.this.k.i = ChannelMachAdViewBlock.this.o;
                            ChannelMachAdViewBlock.this.k.a();
                            ChannelMachAdViewBlock.this.k.d();
                            ChannelMachAdViewBlock.this.q = true;
                        }
                    }
                };
                this.i.getViewTreeObserver().addOnScrollChangedListener(this.x);
            }
            this.y = new android.arch.lifecycle.e() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.ChannelMachAdViewBlock.3
                public static ChangeQuickRedirect a;

                @OnLifecycleEvent(d.a.ON_STOP)
                public void lifecycleStop() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d9f146e365c4a70d5dafda9ba3dc8e92", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d9f146e365c4a70d5dafda9ba3dc8e92");
                    } else if (ChannelMachAdViewBlock.this.k != null) {
                        com.sankuai.shangou.stone.util.log.a.a("ChannelMachAdViewBlock", "lifecycleStop, clear expose~", new Object[0]);
                        ChannelMachAdViewBlock.this.q = false;
                        ChannelMachAdViewBlock.this.k.c();
                        ChannelMachAdViewBlock.this.k.e();
                    }
                }

                @OnLifecycleEvent(d.a.ON_RESUME)
                public void lifecycleResume() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0d4317a4da171e15ff2275ffe0c5d832", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0d4317a4da171e15ff2275ffe0c5d832");
                    } else if (ChannelMachAdViewBlock.this.k == null || !com.sankuai.waimai.store.expose.v2.utils.a.a(ChannelMachAdViewBlock.this.i, ChannelMachAdViewBlock.this.p)) {
                    } else {
                        com.sankuai.shangou.stone.util.log.a.a("ChannelMachAdViewBlock", "lifecycleResume, expose~", new Object[0]);
                        ChannelMachAdViewBlock.this.k.i = ChannelMachAdViewBlock.this.o;
                        ChannelMachAdViewBlock.this.k.a();
                        ChannelMachAdViewBlock.this.k.d();
                    }
                }
            };
            this.j.getLifecycle().a(this.y);
        }
        com.meituan.android.bus.a.a().a(this);
        com.sankuai.shangou.stone.util.log.a.b("MachAdView#onViewCreated", new Object[0]);
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b622b019cc69e654eb4432ecf22afb43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b622b019cc69e654eb4432ecf22afb43");
            return;
        }
        super.onDestroy();
        a(this.r, this.s);
        com.sankuai.shangou.stone.util.log.a.b("MachAdView#onDestroy", new Object[0]);
        com.meituan.android.bus.a.a().b(this);
        try {
            if (this.x != null) {
                this.i.getViewTreeObserver().removeOnScrollChangedListener(this.x);
            }
            if (this.y != null) {
                this.j.getLifecycle().b(this.y);
            }
        } catch (Throwable th) {
            com.sankuai.shangou.stone.util.log.a.a(th);
        }
    }

    @Subscribe
    public void stateChanged(final VisibleChangeEvent visibleChangeEvent) {
        Object[] objArr = {visibleChangeEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad1316ec5046f8ecaca246623b6dde2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad1316ec5046f8ecaca246623b6dde2e");
        } else if (visibleChangeEvent == null) {
        } else {
            if (visibleChangeEvent.d) {
                com.meituan.android.bus.a.a().b(this);
                try {
                    if (this.x != null) {
                        this.i.getViewTreeObserver().removeOnScrollChangedListener(this.x);
                    }
                    if (this.y != null) {
                        this.j.getLifecycle().b(this.y);
                    }
                } catch (Throwable th) {
                    com.sankuai.shangou.stone.util.log.a.a(th);
                }
            }
            if (this.i == null || visibleChangeEvent.a != this.c.y) {
                return;
            }
            if (visibleChangeEvent.c) {
                int i = visibleChangeEvent.b;
                if (i == 0) {
                    this.o = "refresh";
                } else if (i == 2) {
                    this.o = "background_to_foreground";
                }
            }
            com.sankuai.shangou.stone.util.log.a.b("stateChanged,isActive=%s,reason=%s", Boolean.valueOf(visibleChangeEvent.c), Integer.valueOf(visibleChangeEvent.b));
            this.i.post(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.ChannelMachAdViewBlock.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1f72eba74e3ed88719e178753216aa75", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1f72eba74e3ed88719e178753216aa75");
                    } else if (com.sankuai.waimai.store.util.b.a(ChannelMachAdViewBlock.this.j)) {
                    } else {
                        ChannelMachAdViewBlock.c(ChannelMachAdViewBlock.this, visibleChangeEvent.c);
                    }
                }
            });
        }
    }
}
