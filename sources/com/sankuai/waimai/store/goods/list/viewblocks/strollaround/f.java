package com.sankuai.waimai.store.goods.list.viewblocks.strollaround;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b;
import com.sankuai.waimai.store.mach.clickhandler.a;
import com.sankuai.waimai.store.pagingload.a;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poilist.mach.b;
import com.sankuai.waimai.store.poilist.mach.g;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends b.a implements b.a {
    public static ChangeQuickRedirect c;
    volatile boolean d;
    boolean e;
    int f;
    private int g;
    private int h;
    private d i;
    private com.sankuai.waimai.store.goods.list.delegate.e j;
    private int k;
    private final Set l;
    private com.sankuai.waimai.store.pagingload.c<PoiCommonMachListItem, PoiCommonMachListItem> m;
    private int n;

    public static /* synthetic */ void a(f fVar, StrollAroundFloorResponse strollAroundFloorResponse) {
        Object[] objArr = {strollAroundFloorResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "aa3bdd73f0d6f9c2a4f6ff0f8e74a071", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "aa3bdd73f0d6f9c2a4f6ff0f8e74a071");
            return;
        }
        List<PoiCommonMachListItem> a = fVar.a(strollAroundFloorResponse.mAroundAllFoodResponse, strollAroundFloorResponse, 0);
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) a)) {
            fVar.a(a, new boolean[]{true});
            fVar.b.a(3, "");
            Object[] objArr2 = {a};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "81f5746e0ad5ba97c8d1e2d276df70e8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "81f5746e0ad5ba97c8d1e2d276df70e8");
                return;
            } else if (com.sankuai.shangou.stone.util.a.b(a)) {
                return;
            } else {
                int c2 = com.sankuai.shangou.stone.util.a.c(a);
                for (int i = 0; i < c2; i++) {
                    PoiCommonMachListItem poiCommonMachListItem = (PoiCommonMachListItem) com.sankuai.shangou.stone.util.a.a((List<Object>) a, i);
                    if (poiCommonMachListItem != null && poiCommonMachListItem.mBaseModuleDesc != null && poiCommonMachListItem.mBaseModuleDesc.jsonData != null) {
                        Object obj = poiCommonMachListItem.mBaseModuleDesc.jsonData.get(DMKeys.KEY_SELECTED);
                        if ((obj instanceof Double) && ((Double) obj).doubleValue() > 0.0d) {
                            fVar.f = i;
                            fVar.a(poiCommonMachListItem);
                            return;
                        }
                    }
                }
                return;
            }
        }
        fVar.b.a(4, "");
    }

    public static /* synthetic */ void a(f fVar, WaterFallMachResponse waterFallMachResponse) {
        Object[] objArr = {waterFallMachResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "05c6911f86b60f9f5b121f82fc268a96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "05c6911f86b60f9f5b121f82fc268a96");
        } else if (waterFallMachResponse == null || com.sankuai.shangou.stone.util.a.b(waterFallMachResponse.moduleList)) {
            fVar.b.f();
            fVar.e = false;
        } else {
            fVar.g++;
            fVar.e = waterFallMachResponse.hasNextPage;
        }
    }

    public f(b.InterfaceC1199b interfaceC1199b, com.sankuai.waimai.store.goods.list.delegate.e eVar) {
        super(interfaceC1199b);
        Object[] objArr = {interfaceC1199b, eVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d2a00279103748ad231b2a7246c86d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d2a00279103748ad231b2a7246c86d7");
            return;
        }
        this.g = 0;
        this.h = 20;
        this.d = false;
        this.i = null;
        this.f = -1;
        this.l = new HashSet();
        this.m = new com.sankuai.waimai.store.pagingload.c<>();
        this.j = eVar;
        this.l.clear();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "582cf5010711ea2f0df480e7285b42b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "582cf5010711ea2f0df480e7285b42b6");
        } else if (this.d) {
        } else {
            this.b.a(0, "");
            this.d = true;
            com.sankuai.waimai.store.base.net.sg.a.a((Object) this.b.c().w()).a(this.g, this.h, this.b.d().f(), this.b.d().h(), this.b.a() != null ? this.b.a().extra : "", 12, new j<StrollAroundFloorResponse>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.strollaround.f.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e9340af24577e048118a51de50f3f4d3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e9340af24577e048118a51de50f3f4d3");
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(StrollAroundFloorResponse strollAroundFloorResponse) {
                    StrollAroundFloorResponse strollAroundFloorResponse2 = strollAroundFloorResponse;
                    Object[] objArr2 = {strollAroundFloorResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "008eea38133be4f7811dba435a292add", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "008eea38133be4f7811dba435a292add");
                    } else if (strollAroundFloorResponse2 == null) {
                        f.this.b.a(4, "");
                    } else {
                        f.a(f.this, strollAroundFloorResponse2.mAroundAllFoodResponse);
                        f.a(f.this, strollAroundFloorResponse2);
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "06d5bb43f9cc74bab753512c968281e0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "06d5bb43f9cc74bab753512c968281e0");
                    } else {
                        f.this.b.a(1, bVar.getMessage());
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f6459f7679a67b14c469f79973960157", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f6459f7679a67b14c469f79973960157");
                    } else {
                        f.this.d = false;
                    }
                }
            });
        }
    }

    private void a(@NonNull PoiCommonMachListItem poiCommonMachListItem) {
        Object[] objArr = {poiCommonMachListItem};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b33ffa20e984fc4dc586aca413bd53ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b33ffa20e984fc4dc586aca413bd53ba");
        } else if (this.b.b() > 0) {
            try {
                Map<String, Object> map = poiCommonMachListItem.mBaseModuleDesc.jsonData;
                map.put("selected_index", 0);
                List list = (List) map.get("spus");
                int c2 = com.sankuai.shangou.stone.util.a.c(list);
                for (int i = 0; i < c2; i++) {
                    Map map2 = (Map) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
                    if (map2 != null && !map2.isEmpty() && (map2.get("id") instanceof Double) && this.b.b() == ((Double) map2.get("id")).longValue()) {
                        map.put("selected_index", Integer.valueOf(i));
                        return;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c544dc4d33ad524a86133908656118e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c544dc4d33ad524a86133908656118e5");
        } else if (this.d || !this.e) {
        } else {
            this.d = true;
            com.sankuai.waimai.store.base.net.sg.a.a((Object) this.b.c().w()).b(this.g, this.h, this.b.d().f(), this.b.d().h(), 12, new j<WaterFallMachResponse>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.strollaround.f.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb307e32d18ea4c25d1a6b9b2aa2b89a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb307e32d18ea4c25d1a6b9b2aa2b89a");
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(WaterFallMachResponse waterFallMachResponse) {
                    WaterFallMachResponse waterFallMachResponse2 = waterFallMachResponse;
                    Object[] objArr2 = {waterFallMachResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8a8f4a20b757c5b02370bfc5c0e28560", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8a8f4a20b757c5b02370bfc5c0e28560");
                        return;
                    }
                    f.a(f.this, waterFallMachResponse2);
                    List<PoiCommonMachListItem> a2 = f.this.a(waterFallMachResponse2, null, f.this.b.j().getItemCount());
                    if (com.sankuai.shangou.stone.util.a.a((Collection<?>) a2)) {
                        f.this.a(a2, new boolean[]{false});
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b635ddefb80ace561352f5fc4603d45e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b635ddefb80ace561352f5fc4603d45e");
                        return;
                    }
                    f.this.d = false;
                    f.this.b.h();
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fddd73f2d3594713cb3f572c6d08668", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fddd73f2d3594713cb3f572c6d08668");
            return;
        }
        this.g = 0;
        a();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b.a
    public final d d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb44abdf26b36e2d745627f4abb30c42", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb44abdf26b36e2d745627f4abb30c42") : h();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b.a
    public final Map<String, Object> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b5e4e543a05c738b671fadf181ff4cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b5e4e543a05c738b671fadf181ff4cc");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d19ec5e10a5017dbb891667f3fe9109", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d19ec5e10a5017dbb891667f3fe9109");
        }
        if (this.b.d() == null) {
            return null;
        }
        return com.sankuai.waimai.store.shopping.cart.util.a.a(this.b.d().d());
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97e9c0ef12653a11284267efe9059c67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97e9c0ef12653a11284267efe9059c67");
        } else {
            this.l.clear();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e64eea15a16065de70b20ef9db3ce34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e64eea15a16065de70b20ef9db3ce34");
            return;
        }
        this.i = null;
        this.l.clear();
        com.sankuai.waimai.store.shopping.cart.f.a().a(this.n);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b.a
    public final void a(List<PoiCommonMachListItem> list) {
        Mach l;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11f350b780d3636122baa52260c3c0cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11f350b780d3636122baa52260c3c0cd");
        } else if (!com.sankuai.shangou.stone.util.a.b(list)) {
            Map<String, Object> e = e();
            for (PoiCommonMachListItem poiCommonMachListItem : list) {
                if (poiCommonMachListItem != null && poiCommonMachListItem.recycleMachDataWrapper != null && poiCommonMachListItem.recycleMachDataWrapper.b != null && (l = poiCommonMachListItem.recycleMachDataWrapper.b.l()) != null) {
                    l.sendJsEvent("goods_detail_update_shopcart_account", e);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b.a
    public final void b(final List<Poi.PoiCouponItem> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78580f63430aeb38579606386f25f959", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78580f63430aeb38579606386f25f959");
        } else if (this.b.j() == null || com.sankuai.shangou.stone.util.a.b(this.b.j().f) || com.sankuai.shangou.stone.util.a.b(list)) {
        } else {
            al.a(new al.b<List<JSONObject>>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.strollaround.f.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ void a(List<JSONObject> list2) {
                    Mach l;
                    List<JSONObject> list3 = list2;
                    Object[] objArr2 = {list3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "141492d7c293dea45dad1ded1ad57ff1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "141492d7c293dea45dad1ded1ad57ff1");
                    } else if (!com.sankuai.shangou.stone.util.a.b(list3)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("coupon_list", list3);
                        for (T t : f.this.b.j().f) {
                            if (t != null && t.spanSize != 2 && t.recycleMachDataWrapper != null && (l = t.recycleMachDataWrapper.b.l()) != null) {
                                l.sendJsEvent("refresh_coupon_info_module", hashMap);
                            }
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.sankuai.waimai.store.util.al.b
                /* renamed from: b */
                public List<JSONObject> a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11fe9a0686bec592c76858d6cfd6f08c", RobustBitConfig.DEFAULT_VALUE)) {
                        return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11fe9a0686bec592c76858d6cfd6f08c");
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Poi.PoiCouponItem poiCouponItem : list) {
                        if (poiCouponItem != null) {
                            try {
                                arrayList.add(new JSONObject(i.a(poiCouponItem)));
                            } catch (JSONException e) {
                                com.sankuai.waimai.store.base.log.a.a(e);
                            }
                        }
                    }
                    return arrayList;
                }
            }, this.j.l());
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.strollaround.b.a
    public final void a(a.C1218a c1218a) {
        Object[] objArr = {c1218a};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f17a9b8077391223e7845f8dd5576b34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f17a9b8077391223e7845f8dd5576b34");
        } else if (this.b.c() != c1218a.b || c1218a == null || c1218a.d != this.b.d().f() || c1218a.f == null) {
        } else {
            View view = c1218a.c;
            GoodsSpu goodsSpu = c1218a.f;
            Context context = view.getContext();
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b7035f912a8c4b3c444c37f84c1c73f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b7035f912a8c4b3c444c37f84c1c73f");
            } else if (com.sankuai.waimai.store.shopping.cart.f.a().b != null) {
                ImageView imageView = com.sankuai.waimai.store.shopping.cart.f.a().b.get(Integer.valueOf(this.b.c().hashCode()));
                this.n = context.hashCode();
                if (com.sankuai.waimai.store.shopping.cart.f.a().b.get(Integer.valueOf(this.n)) == null && imageView != null) {
                    com.sankuai.waimai.store.shopping.cart.f.a().b.put(Integer.valueOf(this.n), imageView);
                }
            }
            this.j.a(view.getContext(), view, com.sankuai.waimai.store.platform.domain.manager.poi.a.a(c1218a.e, c1218a.d), goodsSpu);
        }
    }

    public final d h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b604d2fc701f88a08e7956c9e4b397a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b604d2fc701f88a08e7956c9e4b397a8");
        }
        if (this.i == null) {
            this.i = new d(this.b.c(), new g(this.b.c(), this.b.c().b(), this.l), "supermarket", new com.sankuai.waimai.mach.recycler.b("supermarket"), this.b.d());
        }
        this.i.b = this.j;
        this.i.a((b.a) this);
        return this.i;
    }

    List<PoiCommonMachListItem> a(WaterFallMachResponse waterFallMachResponse, StrollAroundFloorResponse strollAroundFloorResponse, int i) {
        int i2;
        Object[] objArr = {waterFallMachResponse, strollAroundFloorResponse, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6eeb673156e4d3bbec16ea3aa0f77557", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6eeb673156e4d3bbec16ea3aa0f77557");
        }
        ArrayList arrayList = new ArrayList();
        if (strollAroundFloorResponse == null || !com.sankuai.shangou.stone.util.a.a((Collection<?>) strollAroundFloorResponse.moduleList)) {
            i2 = i;
        } else {
            i2 = i;
            for (BaseModuleDesc baseModuleDesc : strollAroundFloorResponse.moduleList) {
                if (baseModuleDesc != null) {
                    PoiCommonMachListItem poiCommonMachListItem = new PoiCommonMachListItem();
                    poiCommonMachListItem.spanSize = 1;
                    poiCommonMachListItem.mBaseModuleDesc = baseModuleDesc;
                    poiCommonMachListItem.index = i2;
                    poiCommonMachListItem.mViewType = 1;
                    arrayList.add(poiCommonMachListItem);
                    i2++;
                }
            }
            this.k = i2;
        }
        if (strollAroundFloorResponse != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) waterFallMachResponse.moduleList) && i == 0) {
            PoiCommonMachListItem poiCommonMachListItem2 = new PoiCommonMachListItem();
            poiCommonMachListItem2.spanSize = 1;
            poiCommonMachListItem2.mBaseModuleDesc = null;
            poiCommonMachListItem2.mViewType = 2;
            poiCommonMachListItem2.index = i2;
            poiCommonMachListItem2.title = t.a(waterFallMachResponse.name) ? "" : waterFallMachResponse.name;
            arrayList.add(poiCommonMachListItem2);
            i2++;
            this.k = i2;
        }
        if (waterFallMachResponse != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) waterFallMachResponse.moduleList)) {
            for (BaseModuleDesc baseModuleDesc2 : waterFallMachResponse.moduleList) {
                if (baseModuleDesc2 != null) {
                    PoiCommonMachListItem poiCommonMachListItem3 = new PoiCommonMachListItem();
                    poiCommonMachListItem3.spanSize = 2;
                    poiCommonMachListItem3.mBaseModuleDesc = baseModuleDesc2;
                    poiCommonMachListItem3.mViewType = 1;
                    poiCommonMachListItem3.index = i2 - this.k;
                    arrayList.add(poiCommonMachListItem3);
                    i2++;
                }
            }
        }
        return arrayList;
    }

    void a(List<PoiCommonMachListItem> list, final boolean[] zArr) {
        Object[] objArr = {list, zArr};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22e3a3a8450dd9fb14447e243406c175", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22e3a3a8450dd9fb14447e243406c175");
            return;
        }
        com.sankuai.waimai.store.pagingload.c<PoiCommonMachListItem, PoiCommonMachListItem> cVar = this.m;
        cVar.g = new a.InterfaceC1262a<PoiCommonMachListItem, PoiCommonMachListItem>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.strollaround.f.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.pagingload.a.InterfaceC1262a
            public final /* synthetic */ PoiCommonMachListItem a(@NonNull PoiCommonMachListItem poiCommonMachListItem) {
                PoiCommonMachListItem poiCommonMachListItem2 = poiCommonMachListItem;
                Object[] objArr2 = {poiCommonMachListItem2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e8864c445106d58d677bd2a9b121181", RobustBitConfig.DEFAULT_VALUE)) {
                    return (PoiCommonMachListItem) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e8864c445106d58d677bd2a9b121181");
                }
                if (poiCommonMachListItem2.mViewType == 1) {
                    return new PoiCommonMachListItem(poiCommonMachListItem2.spanSize, poiCommonMachListItem2.mBaseModuleDesc, f.this.h().a(poiCommonMachListItem2.mBaseModuleDesc, poiCommonMachListItem2.index), poiCommonMachListItem2.mViewType);
                }
                return new PoiCommonMachListItem(poiCommonMachListItem2.spanSize, poiCommonMachListItem2.title, poiCommonMachListItem2.mViewType);
            }
        };
        cVar.h = new a.b<PoiCommonMachListItem, PoiCommonMachListItem>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.strollaround.f.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.pagingload.a.b
            public final void a(List<PoiCommonMachListItem> list2, int i) {
                Object[] objArr2 = {list2, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dcb364a961530603044607a90e14c6b1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dcb364a961530603044607a90e14c6b1");
                    return;
                }
                super.a(list2, i);
                boolean z = zArr[0];
                if (zArr[0]) {
                    zArr[0] = false;
                    f.this.b.a(list2);
                } else {
                    f.this.b.b(list2);
                }
                if (f.this.e) {
                    f.this.b.g();
                } else {
                    f.this.b.i();
                }
                f.this.b.h();
                if (!z || f.this.f < 0) {
                    return;
                }
                f.this.b.a(f.this.f);
            }

            @Override // com.sankuai.waimai.store.pagingload.a.b
            public final void a(int i, @Nullable Throwable th, List<PoiCommonMachListItem> list2) {
                Object[] objArr2 = {Integer.valueOf(i), th, list2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c9d681fafeb4192e1790c3efc43f5ec", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c9d681fafeb4192e1790c3efc43f5ec");
                    return;
                }
                super.a(i, th, list2);
                if (zArr[0]) {
                    zArr[0] = false;
                    f.this.b.a(list2);
                } else {
                    f.this.b.b(list2);
                }
                if (f.this.e) {
                    f.this.b.g();
                } else {
                    f.this.b.i();
                }
                f.this.b.h();
            }
        };
        cVar.a(list);
    }

    @Override // com.sankuai.waimai.store.poilist.mach.b.a
    public final void a(com.sankuai.waimai.mach.recycler.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0afa38f0c3b870b50c72a78388387bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0afa38f0c3b870b50c72a78388387bf");
        } else if (cVar == null || cVar.l() == null) {
        } else {
            cVar.l().sendJsEvent("goods_detail_update_shopcart_account", e());
        }
    }
}
