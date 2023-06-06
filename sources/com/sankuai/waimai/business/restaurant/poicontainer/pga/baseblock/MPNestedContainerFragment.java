package com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cube.pga.common.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.api.msgcenter.a;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.shopcart.e;
import com.sankuai.waimai.business.restaurant.base.util.d;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
import com.sankuai.waimai.business.restaurant.poicontainer.machpro.WMMachProCustomFragment;
import com.sankuai.waimai.business.restaurant.poicontainer.utils.MachProJsonUtil;
import com.sankuai.waimai.mach.manager.cache.CacheException;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.h;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.manager.observers.OrderGoodObserver;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MPNestedContainerFragment extends WMMachProCustomFragment implements com.sankuai.waimai.foundation.core.service.poi.b, OrderGoodObserver {
    public static ChangeQuickRedirect d;
    private static final Set<String> j = new HashSet(Arrays.asList("data.poi_info.id"));
    public h e;
    private com.sankuai.waimai.platform.domain.core.order.a k;
    private List<com.sankuai.waimai.platform.domain.core.order.a> l;
    private f m;
    private final a.b n;
    private MachMap o;
    private MachMap p;
    private MachMap q;

    @Override // com.sankuai.waimai.foundation.core.service.poi.b
    public final void a(String str) {
    }

    @Override // com.sankuai.waimai.foundation.core.service.poi.b
    public final void a(String str, String str2, long j2, boolean z) {
    }

    public MPNestedContainerFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3aa8bcf4229ec0fc75d62e6abb9c4199", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3aa8bcf4229ec0fc75d62e6abb9c4199");
            return;
        }
        this.n = new a.b() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.MPNestedContainerFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.im.api.msgcenter.a.b
            public final void a(boolean z, boolean z2, int i) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "273531de1074017d5aa5b0b095dbeabc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "273531de1074017d5aa5b0b095dbeabc");
                    return;
                }
                MachMap machMap = new MachMap();
                machMap.put("unReadCount", Integer.valueOf(i));
                machMap.put("isShowDot", Boolean.valueOf(z2));
                MPNestedContainerFragment.this.b("messageCenterInfoChanged", machMap);
            }
        };
        this.e = new h() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.MPNestedContainerFragment.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.machpro.h
            public final void a(String str, MachMap machMap) {
                List<GoodsSku> skuList;
                List<GoodsSku> skuList2;
                Object[] objArr2 = {str, machMap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "641a219eae7f9ed0ee01428b8ff5f42c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "641a219eae7f9ed0ee01428b8ff5f42c");
                } else if (!"changeNativeContainer".equals(str)) {
                    if ("updateShopCartMissFood".equalsIgnoreCase(str)) {
                        List<GoodsSpu> a2 = MPNestedContainerFragment.this.a(machMap.get("foodList"));
                        final k a3 = k.a();
                        final String k = MPNestedContainerFragment.this.k();
                        com.sankuai.waimai.platform.domain.core.order.a aVar = MPNestedContainerFragment.this.k;
                        Object[] objArr3 = {k, aVar, a2};
                        ChangeQuickRedirect changeQuickRedirect3 = k.a;
                        if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "2441aa96dbf64f81778715265e00db15", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "2441aa96dbf64f81778715265e00db15");
                        } else if (a2 != null && a3.g(k) && aVar != null) {
                            OrderedFood fromGlobalCart = new OrderedFood().fromGlobalCart(aVar);
                            for (GoodsSpu goodsSpu : a2) {
                                if (goodsSpu != null && fromGlobalCart != null && goodsSpu.getId() == fromGlobalCart.getSpuId() && (skuList2 = goodsSpu.getSkuList()) != null) {
                                    for (int i = 0; i < skuList2.size(); i++) {
                                        if (fromGlobalCart.getStock() == 0) {
                                            if (skuList2.size() == 1) {
                                                goodsSpu.setStatus(1);
                                            }
                                            a3.b.a(k, goodsSpu, fromGlobalCart.getSkuId());
                                        } else {
                                            a3.b.b(k, fromGlobalCart);
                                        }
                                    }
                                }
                            }
                            a3.c(k, new e() { // from class: com.sankuai.waimai.business.restaurant.base.manager.order.k.4
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                                public final void a() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a02b58ab746bcb1051e342adfed27e9c", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a02b58ab746bcb1051e342adfed27e9c");
                                    }
                                }

                                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                                public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar2) {
                                }

                                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                                public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                                    Object[] objArr4 = {bVar};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "adbcc83d1867aee93e492935766795e8", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "adbcc83d1867aee93e492935766795e8");
                                        return;
                                    }
                                    a3.p(k);
                                    a3.b(k);
                                }
                            });
                        }
                    } else if ("updateShopCartMissFoods".equalsIgnoreCase(str)) {
                        List<GoodsSpu> a4 = MPNestedContainerFragment.this.a(machMap.get("foodList"));
                        final k a5 = k.a();
                        final String k2 = MPNestedContainerFragment.this.k();
                        List<com.sankuai.waimai.platform.domain.core.order.a> list = MPNestedContainerFragment.this.l;
                        Object[] objArr4 = {k2, list, a4};
                        ChangeQuickRedirect changeQuickRedirect4 = k.a;
                        if (PatchProxy.isSupport(objArr4, a5, changeQuickRedirect4, false, "bd8909175f2e698c0e3fb8e7c60a17bc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, a5, changeQuickRedirect4, false, "bd8909175f2e698c0e3fb8e7c60a17bc");
                        } else if (a4 != null && a5.g(k2) && !com.sankuai.waimai.foundation.utils.b.b(list)) {
                            for (com.sankuai.waimai.platform.domain.core.order.a aVar2 : list) {
                                if (aVar2 != null) {
                                    OrderedFood fromGlobalCart2 = new OrderedFood().fromGlobalCart(aVar2);
                                    for (GoodsSpu goodsSpu2 : a4) {
                                        if (goodsSpu2 != null && fromGlobalCart2 != null && goodsSpu2.getId() == fromGlobalCart2.getSpuId() && (skuList = goodsSpu2.getSkuList()) != null) {
                                            for (int i2 = 0; i2 < skuList.size(); i2++) {
                                                if (fromGlobalCart2.getStock() == 0) {
                                                    if (skuList.size() == 1) {
                                                        goodsSpu2.setStatus(1);
                                                    }
                                                    a5.b.a(k2, goodsSpu2, fromGlobalCart2.getSkuId());
                                                } else {
                                                    a5.b.b(k2, fromGlobalCart2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            a5.c(k2, new e() { // from class: com.sankuai.waimai.business.restaurant.base.manager.order.k.5
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                                public final void a() {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "62c68b3531b39aac5841d8e03354466b", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "62c68b3531b39aac5841d8e03354466b");
                                    }
                                }

                                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                                public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar3) {
                                }

                                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                                public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                                    Object[] objArr5 = {bVar};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ac0d37221fdf59f4489615e79b6ae493", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ac0d37221fdf59f4489615e79b6ae493");
                                        return;
                                    }
                                    a5.p(k2);
                                    a5.b(k2);
                                }
                            });
                        }
                    } else if ("changeStatusBarColorEvent".equalsIgnoreCase(str)) {
                        com.sankuai.waimai.platform.capacity.immersed.a.c(MPNestedContainerFragment.this.getActivity(), com.sankuai.waimai.machpro.util.b.d(machMap.get("isDark")));
                    } else if ("changeLocationEvent".equalsIgnoreCase(str) && com.sankuai.waimai.restaurant.shopcart.utils.e.a()) {
                        com.sankuai.waimai.foundation.router.a.a(MPNestedContainerFragment.this.getActivity(), com.sankuai.waimai.foundation.router.interfaces.c.D);
                    }
                }
            }
        };
    }

    public static MPNestedContainerFragment a(JsonObject jsonObject, Intent intent, String str) {
        Object[] objArr = {jsonObject, intent, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c33515be72bc22166565f0b98a0e68c", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPNestedContainerFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c33515be72bc22166565f0b98a0e68c");
        }
        MPNestedContainerFragment mPNestedContainerFragment = new MPNestedContainerFragment();
        Bundle bundle = new Bundle();
        bundle.putString("bundle_name", str);
        bundle.putString("biz", "waimai");
        if (jsonObject != null) {
            mPNestedContainerFragment.b(jsonObject);
        }
        mPNestedContainerFragment.a(intent);
        mPNestedContainerFragment.setArguments(bundle);
        return mPNestedContainerFragment;
    }

    private void b(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35de30df5cbeeada2ac022368c81c752", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35de30df5cbeeada2ac022368c81c752");
        } else if (jsonObject == null) {
        } else {
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("user_id", Long.valueOf(com.sankuai.waimai.platform.domain.manager.user.a.i().d()));
            jsonObject.add("user_info", jsonObject2);
            jsonObject.addProperty("rank_list_id", ListIDHelper.a.a.a("restaurant", "restaurant_page_blcok"));
            jsonObject.addProperty("ref_list_id", ListIDHelper.a.a.a("restaurant", "restaurant_page_blcok_ref"));
            try {
                this.o = MachProJsonUtil.a(a(0, "", jsonObject), j);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40614da941fab90ffd1828752e3df56c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40614da941fab90ffd1828752e3df56c");
            return;
        }
        this.q = new MachMap();
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras();
        Set<String> keySet = extras != null ? extras.keySet() : null;
        HashMap hashMap = new HashMap();
        if (keySet != null && !keySet.isEmpty()) {
            for (String str : keySet) {
                hashMap.put(str, extras.get(str));
            }
        }
        try {
            MachMap a = MachProJsonUtil.a(d.a().toJsonTree(hashMap).getAsJsonObject());
            if (a != null) {
                this.q = a;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        for (String str2 : data.getQueryParameterNames()) {
            this.q.put(str2, data.getQueryParameter(str2));
        }
    }

    public final void a(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7b1b23874bcc61bc521232f5efd636f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7b1b23874bcc61bc521232f5efd636f");
            return;
        }
        e();
        b(jsonObject);
        b("dataChanged", this.o);
    }

    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34bd9d38928d3f618106b17623cfba27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34bd9d38928d3f618106b17623cfba27");
            return;
        }
        e();
        try {
            this.p = MachProJsonUtil.a(a(i, str, (JsonObject) null), j);
        } catch (Exception e) {
            e.printStackTrace();
        }
        b("dataChanged", this.p);
    }

    private JsonObject a(int i, String str, JsonObject jsonObject) {
        Object[] objArr = {Integer.valueOf(i), str, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bbc802ad0e097bea0099082b053ba21", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bbc802ad0e097bea0099082b053ba21");
        }
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("code", Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            jsonObject2.addProperty("msg", str);
        }
        if (jsonObject != null) {
            jsonObject2.add("data", jsonObject);
        }
        return jsonObject2;
    }

    private void e() {
        this.o = null;
        this.p = null;
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.machpro.WMMachProCustomFragment, com.sankuai.waimai.machpro.container.MPBaseFragment
    public final MachMap a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3953b195d5fff9d18e2892213401dbe", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3953b195d5fff9d18e2892213401dbe");
        }
        MachMap machMap = new MachMap();
        if (this.o != null) {
            machMap.put("pageData", this.o);
        } else if (this.p != null) {
            machMap.put("pageData", this.p);
        }
        if (this.q != null) {
            machMap.put("pageRouterParams", this.q);
        }
        return machMap;
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, com.sankuai.waimai.machpro.container.b
    public final void a(CacheException cacheException) {
        Object[] objArr = {cacheException};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37f1acda90bd21736dc8628838872608", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37f1acda90bd21736dc8628838872608");
            return;
        }
        super.a(cacheException);
        Context context = getContext();
        if (context instanceof WMRestaurantActivity) {
            ((WMRestaurantActivity) context).n();
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.machpro.WMMachProCustomFragment, com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26422a052053e0baea89134d0f8c091d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26422a052053e0baea89134d0f8c091d");
            return;
        }
        super.onCreate(bundle);
        this.m = new f();
        if (this.g != null) {
            this.g.a(new com.sankuai.waimai.business.restaurant.poicontainer.machpro.list.b());
        }
        k.a().a(this);
        com.sankuai.waimai.platform.domain.manager.poi.a.a().a(this);
        com.sankuai.waimai.business.im.api.msgcenter.a.a().registerMsgCenterUnreadChangeListener(this.n);
        a(this.e);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20c3bde4e9e1ae9122d41687372fb4bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20c3bde4e9e1ae9122d41687372fb4bc");
        } else if (!(getActivity() instanceof WMRestaurantActivity) || getActivity().isFinishing()) {
        } else {
            ((WMRestaurantActivity) getActivity()).e.F.s.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.MPNestedContainerFragment.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Boolean bool) {
                    Boolean bool2 = bool;
                    Object[] objArr3 = {bool2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e55d9ec91c3db674831fa0a344fc5b70", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e55d9ec91c3db674831fa0a344fc5b70");
                        return;
                    }
                    MachMap machMap = new MachMap();
                    machMap.put("evaluateShopCartVisible", Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
                    MPNestedContainerFragment.this.b("onEvaluateShopCartVisible", machMap);
                }
            }).a(this.m);
            ((WMRestaurantActivity) getActivity()).e.F.p.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.MPNestedContainerFragment.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Boolean bool) {
                    Boolean bool2 = bool;
                    Object[] objArr3 = {bool2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "34f7e808c8773a4363a855409577f771", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "34f7e808c8773a4363a855409577f771");
                        return;
                    }
                    MachMap machMap = new MachMap();
                    machMap.put("goodsListVisibility", Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
                    MPNestedContainerFragment.this.b("onGoodsListVisibility", machMap);
                }
            }).a(this.m);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.machpro.WMMachProCustomFragment, com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "901cd7fadf5d4b79e9b82ab7fcc11af5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "901cd7fadf5d4b79e9b82ab7fcc11af5");
            return;
        }
        super.onDestroy();
        e();
        this.m.a();
        com.sankuai.waimai.business.im.api.msgcenter.a.a().unregisterMsgCenterUnreadChangeListener(this.n);
        k.a().b(this);
        com.sankuai.waimai.platform.domain.manager.poi.a.a().b(this);
        b(this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<GoodsSpu> a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d622b7042fff2a3c13cc1e2cfde9e72", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d622b7042fff2a3c13cc1e2cfde9e72");
        }
        if (obj == null) {
            return null;
        }
        try {
            return (List) com.sankuai.waimai.business.restaurant.goodsdetail.constants.a.a().fromJson(obj.toString(), new TypeToken<List<GoodsSpu>>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.MPNestedContainerFragment.3
            }.getType());
        } catch (Exception e) {
            com.sankuai.waimai.imbase.log.a.a(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f9e33aa6f8c549a6630c6eac740f703", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f9e33aa6f8c549a6630c6eac740f703");
        }
        Context context = getContext();
        return !(context instanceof WMRestaurantActivity) ? "" : ((WMRestaurantActivity) context).k();
    }

    @Override // com.sankuai.waimai.foundation.core.service.poi.b
    public final void a(String str, List<com.sankuai.waimai.platform.domain.core.order.a> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb32ec85476f54459fc429b34841d583", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb32ec85476f54459fc429b34841d583");
            return;
        }
        this.l = list;
        if (str == null || !str.equals(k())) {
            return;
        }
        b("updateShopCartMissFoods", new MachMap());
    }

    @Override // com.sankuai.waimai.foundation.core.service.poi.b
    public final void a(String str, String str2, long j2) {
        Object[] objArr = {str, str2, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d26399242dc3917d65bb6b91762eaed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d26399242dc3917d65bb6b91762eaed");
            return;
        }
        MachMap machMap = new MachMap();
        machMap.put("spuid", Long.valueOf(j2));
        b("scrollToFood", machMap);
    }

    @Override // com.sankuai.waimai.foundation.core.service.poi.b
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5360649f37ece20f2176774b92ccb70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5360649f37ece20f2176774b92ccb70");
            return;
        }
        MachMap machMap = new MachMap();
        machMap.put("tag", str2);
        b("scrollToRequiredTag", machMap);
    }

    @Override // com.sankuai.waimai.platform.domain.manager.observers.OrderGoodObserver
    public final void aF_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a71f2481ccf0df7cfc020345d3c7da6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a71f2481ccf0df7cfc020345d3c7da6");
        } else {
            b("orderedFoodChanged", null);
        }
    }
}
