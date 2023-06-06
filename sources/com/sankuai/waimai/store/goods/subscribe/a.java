package com.sankuai.waimai.store.goods.subscribe;

import android.app.Activity;
import android.support.constraint.R;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttrList;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.g;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.ui.common.SCBaseDialog;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.d;
import com.sankuai.waimai.store.util.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    final com.sankuai.waimai.store.goods.subscribe.b b;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.subscribe.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1204a {
        void a();
    }

    public static /* synthetic */ void a(SCBaseActivity sCBaseActivity, String str) {
        Object[] objArr = {sCBaseActivity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "738cb36efb98801e78396f9b919ef8f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "738cb36efb98801e78396f9b919ef8f7");
        } else {
            am.a(SCBaseDialog.j(), str, sCBaseActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        private static final a a = new a();
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f968bef4cd5d849697108b8c2b85acf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f968bef4cd5d849697108b8c2b85acf");
        } else {
            this.b = new com.sankuai.waimai.store.goods.subscribe.b();
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d35996c40ad92529604be8e166b5e2a9", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d35996c40ad92529604be8e166b5e2a9") : b.a;
    }

    public final void a(final Activity activity, final long j, final String str, final GoodsSpu goodsSpu, final GoodsSku goodsSku, final InterfaceC1204a interfaceC1204a) {
        Object[] objArr = {activity, new Long(j), str, goodsSpu, goodsSku, interfaceC1204a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "614da656de3b9488fa96d6d68738a64a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "614da656de3b9488fa96d6d68738a64a");
        } else if (com.sankuai.waimai.store.util.b.a(activity) || goodsSpu == null || goodsSku == null) {
        } else {
            com.sankuai.waimai.store.manager.user.a.a(activity, new Runnable() { // from class: com.sankuai.waimai.store.goods.subscribe.a.2
                public static ChangeQuickRedirect a;

                public static /* synthetic */ void a(AnonymousClass2 anonymousClass2) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, anonymousClass2, changeQuickRedirect2, false, "ee48cde70ca7c7406a1479eef1c8603d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, anonymousClass2, changeQuickRedirect2, false, "ee48cde70ca7c7406a1479eef1c8603d");
                    } else {
                        a.this.b.a(j, str, goodsSpu.getId(), goodsSku.getSkuId(), 2);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5f203a1d34d64a11de6469c7650e81bb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5f203a1d34d64a11de6469c7650e81bb");
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("wm_poi_id", String.valueOf(j));
                    hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
                    hashMap.put("spu_id", String.valueOf(goodsSpu.getId()));
                    hashMap.put("spu_name", goodsSpu.getName());
                    hashMap.put("sku_id", String.valueOf(goodsSku.getSkuId()));
                    if (activity instanceof SCBaseActivity) {
                        ((SCBaseActivity) activity).u();
                        g.a(((SCBaseActivity) activity).w()).c(hashMap, new k<SpuSubscribeResponse>() { // from class: com.sankuai.waimai.store.goods.subscribe.a.2.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                            public final /* synthetic */ void a(Object obj) {
                                SpuSubscribeResponse spuSubscribeResponse = (SpuSubscribeResponse) obj;
                                Object[] objArr3 = {spuSubscribeResponse};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "41d5374fb7fd387301cd7e73570640e4", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "41d5374fb7fd387301cd7e73570640e4");
                                    return;
                                }
                                if (interfaceC1204a != null) {
                                    interfaceC1204a.a();
                                } else {
                                    a.a((SCBaseActivity) activity, spuSubscribeResponse.subTitle);
                                }
                                AnonymousClass2.a(AnonymousClass2.this);
                            }

                            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                                Object[] objArr3 = {bVar};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0af3bfaeb16f43f7d69f1f264920a4e8", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0af3bfaeb16f43f7d69f1f264920a4e8");
                                } else {
                                    a.a((SCBaseActivity) activity, activity.getString(R.string.wm_sg_spu_subscribe_failed));
                                }
                            }

                            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                            public final void b() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9ad70390c8060a5f010f21bf55ade497", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9ad70390c8060a5f010f21bf55ade497");
                                } else {
                                    ((SCBaseActivity) activity).v();
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public static void a(final SCBaseActivity sCBaseActivity, final com.sankuai.waimai.store.mach.event.a aVar, final Map<String, Object> map) {
        Object[] objArr = {sCBaseActivity, aVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de45b9eeb15f01e8014ecddb481615cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de45b9eeb15f01e8014ecddb481615cc");
        } else if (com.sankuai.waimai.store.util.b.a(sCBaseActivity) || aVar == null || map == null) {
        } else {
            al.a(new al.b<List<SpuSubscribeModel>>() { // from class: com.sankuai.waimai.store.goods.subscribe.a.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ List<SpuSubscribeModel> a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fb17c00974c88c93c8b552fd09ab2a41", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fb17c00974c88c93c8b552fd09ab2a41") : (List) i.a(i.a(map.get("poi_spus")), new TypeToken<List<SpuSubscribeModel>>() { // from class: com.sankuai.waimai.store.goods.subscribe.a.3.1
                    }.getType());
                }

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ void a(List<SpuSubscribeModel> list) {
                    GoodsSku goodsSku;
                    GoodsAttr[] goodsAttrArr;
                    List<SpuSubscribeModel> list2 = list;
                    Object[] objArr2 = {list2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7bf7f14f721a6dc40621ef4aaa4d2a6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7bf7f14f721a6dc40621ef4aaa4d2a6");
                    } else if (com.sankuai.shangou.stone.util.a.b(list2)) {
                        aVar.b("close", null);
                    } else {
                        for (SpuSubscribeModel spuSubscribeModel : list2) {
                            if (spuSubscribeModel != null && spuSubscribeModel.poiInfo != null && !com.sankuai.shangou.stone.util.a.b(spuSubscribeModel.spus)) {
                                ArrayList arrayList = new ArrayList();
                                for (GoodsSpu goodsSpu : spuSubscribeModel.spus) {
                                    if (goodsSpu != null && (goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0)) != null) {
                                        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) goodsSpu.attrs)) {
                                            List<GoodsAttrList> list3 = goodsSpu.attrs;
                                            goodsAttrArr = new GoodsAttr[com.sankuai.shangou.stone.util.a.a((List) list3)];
                                            int a2 = com.sankuai.shangou.stone.util.a.a((List) list3);
                                            for (int i = 0; i < a2; i++) {
                                                GoodsAttrList goodsAttrList = (GoodsAttrList) com.sankuai.shangou.stone.util.a.a((List<Object>) list3, i);
                                                if (goodsAttrList != null && !com.sankuai.shangou.stone.util.a.b(goodsAttrList.values)) {
                                                    goodsAttrArr[i] = (GoodsAttr) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsAttrList.values, 0);
                                                }
                                            }
                                        } else {
                                            goodsAttrArr = null;
                                        }
                                        arrayList.add(new OrderedFood(goodsSpu, goodsSku, goodsAttrArr, goodsSku.minOrderCount));
                                    }
                                }
                                if (!com.sankuai.shangou.stone.util.a.b(arrayList)) {
                                    com.sankuai.waimai.store.order.a.e().a(spuSubscribeModel.poiInfo.getOfficialPoiId(), spuSubscribeModel.poiInfo);
                                    com.sankuai.waimai.store.order.a.e().f(spuSubscribeModel.poiInfo.getOfficialPoiId(), arrayList);
                                }
                            }
                        }
                        aVar.b("close", null);
                        d.b(new AddShopcartSuccessDialog(sCBaseActivity));
                    }
                }
            }, sCBaseActivity.w());
        }
    }

    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98d398dfb367e1557720b65ae360f6b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98d398dfb367e1557720b65ae360f6b7");
            return;
        }
        try {
            this.b.registerObserver(cVar);
        } catch (Exception e) {
            if (com.sankuai.waimai.store.config.k.a()) {
                throw e;
            }
        }
    }

    public final void b(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d07f90355743f8396b0ddf2c1a7c60b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d07f90355743f8396b0ddf2c1a7c60b");
            return;
        }
        try {
            this.b.unregisterObserver(cVar);
        } catch (Exception e) {
            if (com.sankuai.waimai.store.config.k.a()) {
                throw e;
            }
        }
    }
}
