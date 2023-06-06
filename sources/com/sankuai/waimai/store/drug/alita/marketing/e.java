package com.sankuai.waimai.store.drug.alita.marketing;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.mrn.container.MRNBaseActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager;
import com.sankuai.waimai.alita.core.jsexecutor.AlitaJSValue;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.base.BaseMemberActivity;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.drug.alita.model.AlitaMarketingBean;
import com.sankuai.waimai.store.drug.home.DrugHomeActivity;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import com.sankuai.waimai.store.platform.marketing.MarketingResponse;
import com.sankuai.waimai.store.util.ae;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.report.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class e {
    public static ChangeQuickRedirect a;
    private static AlitaAutoRunManager.b d;
    private static Map<String, a> c = new HashMap();
    public static final String b = e.class.getSimpleName();

    public static /* synthetic */ Map a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d0da8d0a8d46a7f4d70e8dd3987fa78", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d0da8d0a8d46a7f4d70e8dd3987fa78");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("actType", Integer.valueOf(jSONObject.optInt("actType")));
        hashMap.put("type", Integer.valueOf(jSONObject.optInt("type")));
        long optLong = jSONObject.optLong("skuId");
        hashMap.put("skuId", Long.valueOf(optLong));
        long optLong2 = jSONObject.optLong("spuId");
        hashMap.put("spuId", Long.valueOf(optLong2));
        String optString = jSONObject.optString(FoodDetailNetWorkPreLoader.URI_POI_STR);
        hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, optString);
        long optLong3 = jSONObject.optLong("poi_id");
        hashMap.put("poi_id", Long.valueOf(optLong3));
        hashMap.put("upcCode", jSONObject.optString("upcCode"));
        hashMap.put("buyCount", Integer.valueOf(com.sankuai.waimai.store.order.a.e().a(com.sankuai.waimai.store.platform.domain.manager.poi.a.a(optLong3, optString), optLong2, optLong)));
        hashMap.put("skuIds", jSONObject.optString("skuIds"));
        hashMap.put("infos", jSONObject.optString("infos"));
        return hashMap;
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "35c3bf4f6cec0af21a75e757b626dfe1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "35c3bf4f6cec0af21a75e757b626dfe1");
        } else if (d != null) {
        } else {
            d = new AlitaAutoRunManager.b() { // from class: com.sankuai.waimai.store.drug.alita.marketing.e.1
                public static ChangeQuickRedirect b;

                @Override // com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager.b
                public final void b(@NonNull String str, @Nullable String str2, @Nullable AlitaJSValue alitaJSValue) {
                    JSONObject optJSONObject;
                    Activity activity;
                    Activity activity2;
                    String str3;
                    String obj;
                    Fragment findFragmentByTag;
                    Object[] objArr2 = {str, str2, alitaJSValue};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6dd012b2147fed19f07f99bcc48f2917", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6dd012b2147fed19f07f99bcc48f2917");
                        return;
                    }
                    super.b(str, str2, alitaJSValue);
                    try {
                        if (com.sankuai.waimai.store.manager.user.a.a().b() && alitaJSValue != null) {
                            JSONObject jSONObject = new JSONObject(alitaJSValue.stringValue());
                            if (jSONObject.optInt("code", -1) == 0 && (optJSONObject = jSONObject.optJSONObject("data")) != null && optJSONObject.length() > 0) {
                                com.sankuai.shangou.stone.util.log.a.a(e.b, "onRunSuccess: " + str + " taskKey: " + str2 + " result: " + jSONObject.toString(), new Object[0]);
                                d a2 = d.a();
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "60f6da50b8794dea854ac39d49518cb0", RobustBitConfig.DEFAULT_VALUE)) {
                                    activity2 = (Activity) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "60f6da50b8794dea854ac39d49518cb0");
                                } else {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = d.a;
                                    if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "d207863aaf35a45d7b7ee085a498bc46", RobustBitConfig.DEFAULT_VALUE)) {
                                        activity = (Activity) PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "d207863aaf35a45d7b7ee085a498bc46");
                                    } else {
                                        if (a2.c.size() <= 0) {
                                            com.sankuai.shangou.stone.util.log.a.d(d.b, "DrugMqLifecycleManager size ==0  使用基建获取", new Object[0]);
                                            activity = com.sankuai.waimai.foundation.utils.activity.a.a().c();
                                        } else {
                                            activity = a2.c.get(a2.c.size() - 1).get();
                                        }
                                        if (activity == null) {
                                            com.sankuai.shangou.stone.util.log.a.d(d.b, "DrugMqLifecycleManager 获取栈顶 activity == null", new Object[0]);
                                        }
                                    }
                                    activity2 = ((activity instanceof BaseMemberActivity) && (((BaseMemberActivity) activity).b instanceof com.sankuai.waimai.store.mrn.dialog.c) && a2.c.size() > 1) ? a2.c.get(a2.c.size() - 2).get() : activity;
                                }
                                if (a.a(activity2)) {
                                    View findViewById = activity2.findViewById(16908290);
                                    if ((activity2 instanceof DrugHomeActivity) && (findFragmentByTag = ((DrugHomeActivity) activity2).getSupportFragmentManager().findFragmentByTag("0")) != null && findFragmentByTag.getView() != null) {
                                        findViewById = findFragmentByTag.getView();
                                    }
                                    final a aVar = (a) e.c.get(activity2.toString());
                                    if (aVar == null) {
                                        aVar = new a(activity2, findViewById);
                                        e.c.put(activity2.toString(), aVar);
                                        Object[] objArr5 = {activity2};
                                        ChangeQuickRedirect changeQuickRedirect5 = a.a;
                                        if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "3a79ec420a8e95ae9544326424321952", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "3a79ec420a8e95ae9544326424321952");
                                        } else if (activity2 instanceof MRNBaseActivity) {
                                            aVar.k = com.sankuai.waimai.store.mrn.shopcartbridge.b.a().a(((MRNBaseActivity) activity2).l().l);
                                        }
                                    }
                                    final Map<String, Object> a3 = e.a(optJSONObject);
                                    Object[] objArr6 = {a3};
                                    ChangeQuickRedirect changeQuickRedirect6 = a.a;
                                    if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "7fbb8737183955c03f331537beee995b", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "7fbb8737183955c03f331537beee995b");
                                    } else if (!com.sankuai.waimai.store.util.b.a(aVar.b)) {
                                        if (aVar.b instanceof SCBaseActivity) {
                                            obj = ((SCBaseActivity) aVar.b).w();
                                        } else {
                                            obj = aVar.b.toString();
                                        }
                                        com.sankuai.waimai.store.drug.base.net.b.a(obj).a(a3, new k<AlitaMarketingBean>() { // from class: com.sankuai.waimai.store.drug.alita.marketing.a.3
                                            public static ChangeQuickRedirect a;

                                            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                                            public final /* synthetic */ void a(Object obj2) {
                                                AlitaMarketingBean alitaMarketingBean = (AlitaMarketingBean) obj2;
                                                Object[] objArr7 = {alitaMarketingBean};
                                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "887e3a7aa6de82c0cc90645a992a98be", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "887e3a7aa6de82c0cc90645a992a98be");
                                                    return;
                                                }
                                                super.a((AnonymousClass3) alitaMarketingBean);
                                                if (alitaMarketingBean == null || (TextUtils.isEmpty(alitaMarketingBean.stringData) && alitaMarketingBean.jsonData == null)) {
                                                    com.sankuai.waimai.store.util.monitor.report.d.c(new com.sankuai.waimai.store.drug.log.a().a("MarketModule").b("alita_algo_api_request_data_err").c(i.a(a3)).b());
                                                } else if ((TextUtils.equals(alitaMarketingBean.viewType, MarketingModel.TYPE_ENTER_DIALOG) || TextUtils.equals(alitaMarketingBean.viewType, MarketingModel.TYPE_RESIDENT_POPUP)) && !com.sankuai.waimai.store.util.b.a(a.this.b)) {
                                                    final a aVar2 = a.this;
                                                    String str4 = a.this.c;
                                                    Object[] objArr8 = {alitaMarketingBean, str4};
                                                    ChangeQuickRedirect changeQuickRedirect8 = a.a;
                                                    if (PatchProxy.isSupport(objArr8, aVar2, changeQuickRedirect8, false, "a9739657d39a1711ad5fa4e681085dad", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr8, aVar2, changeQuickRedirect8, false, "a9739657d39a1711ad5fa4e681085dad");
                                                        return;
                                                    }
                                                    aVar2.c = str4;
                                                    Object[] objArr9 = {(byte) 1};
                                                    ChangeQuickRedirect changeQuickRedirect9 = a.a;
                                                    if (PatchProxy.isSupport(objArr9, aVar2, changeQuickRedirect9, false, "e55c67e89ad60eb621d8388901871e1e", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr9, aVar2, changeQuickRedirect9, false, "e55c67e89ad60eb621d8388901871e1e");
                                                    } else {
                                                        aVar2.b().a(true);
                                                    }
                                                    aVar2.j = false;
                                                    ae.a("AlitaMarketingTemplateController", " start request by enter page...");
                                                    if (aVar2.g == null || aVar2.b == null) {
                                                        return;
                                                    }
                                                    aVar2.b().b(false);
                                                    final MarketingResponse marketingResponse = new MarketingResponse();
                                                    ArrayList arrayList = new ArrayList();
                                                    marketingResponse.moduleList = arrayList;
                                                    MarketingModel marketingModel = new MarketingModel();
                                                    marketingModel.type = alitaMarketingBean.viewType;
                                                    MarketingModel.ModuleItem moduleItem = new MarketingModel.ModuleItem();
                                                    moduleItem.renderType = alitaMarketingBean.renderMode;
                                                    if (alitaMarketingBean.mLayoutInfo != null) {
                                                        moduleItem.moduleExtra = alitaMarketingBean.mLayoutInfo.b;
                                                    }
                                                    if (alitaMarketingBean.dataType == 1) {
                                                        moduleItem.templateData = alitaMarketingBean.stringData;
                                                    } else {
                                                        JSONObject jSONObject2 = (JSONObject) JSONObject.wrap(alitaMarketingBean.jsonData);
                                                        if (jSONObject2 != null) {
                                                            moduleItem.templateData = jSONObject2.toString();
                                                        }
                                                    }
                                                    moduleItem.templateID = alitaMarketingBean.templateId;
                                                    marketingModel.moduleData = moduleItem;
                                                    arrayList.add(marketingModel);
                                                    Object[] objArr10 = {marketingResponse, (byte) 0};
                                                    ChangeQuickRedirect changeQuickRedirect10 = a.a;
                                                    if (PatchProxy.isSupport(objArr10, aVar2, changeQuickRedirect10, false, "cd981f3984589542c152e1364b58e91e", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr10, aVar2, changeQuickRedirect10, false, "cd981f3984589542c152e1364b58e91e");
                                                        return;
                                                    }
                                                    ae.a("AlitaMarketingTemplateController", " resolve response...");
                                                    final InterfaceC1145a interfaceC1145a = new InterfaceC1145a() { // from class: com.sankuai.waimai.store.drug.alita.marketing.a.5
                                                        public static ChangeQuickRedirect a;

                                                        @Override // com.sankuai.waimai.store.drug.alita.marketing.a.InterfaceC1145a
                                                        public final void a(Map<String, List<com.sankuai.waimai.store.manager.sequence.d>> map) {
                                                            Object[] objArr11 = {map};
                                                            ChangeQuickRedirect changeQuickRedirect11 = a;
                                                            if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "1848d44a6216cbe1be51f6a570dfcff0", RobustBitConfig.DEFAULT_VALUE)) {
                                                                PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "1848d44a6216cbe1be51f6a570dfcff0");
                                                            } else if (map != null && map.size() != 0) {
                                                                for (Map.Entry<String, List<com.sankuai.waimai.store.manager.sequence.d>> entry : map.entrySet()) {
                                                                    List<com.sankuai.waimai.store.manager.sequence.d> value = entry.getValue();
                                                                    if (!com.sankuai.shangou.stone.util.a.b(value)) {
                                                                        com.sankuai.waimai.store.manager.sequence.c cVar = null;
                                                                        String key = entry.getKey();
                                                                        char c2 = 65535;
                                                                        int hashCode = key.hashCode();
                                                                        if (hashCode != -347124400) {
                                                                            if (hashCode == 3417674 && key.equals(MarketingModel.TYPE_ENTER_DIALOG)) {
                                                                                c2 = 0;
                                                                            }
                                                                        } else if (key.equals(MarketingModel.TYPE_RESIDENT_POPUP)) {
                                                                            c2 = 1;
                                                                        }
                                                                        switch (c2) {
                                                                            case 0:
                                                                                cVar = a.this.a();
                                                                                break;
                                                                            case 1:
                                                                                cVar = a.this.b();
                                                                                break;
                                                                        }
                                                                        if (cVar != null) {
                                                                            if (r2) {
                                                                                cVar.b(value);
                                                                            } else {
                                                                                cVar.a(value);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                a.this.b().b(false);
                                                                a.this.a().c();
                                                            }
                                                        }
                                                    };
                                                    Object[] objArr11 = {marketingResponse, interfaceC1145a};
                                                    ChangeQuickRedirect changeQuickRedirect11 = a.a;
                                                    if (PatchProxy.isSupport(objArr11, aVar2, changeQuickRedirect11, false, "6086f00919a9b8857c712ab4aed77366", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr11, aVar2, changeQuickRedirect11, false, "6086f00919a9b8857c712ab4aed77366");
                                                    } else {
                                                        al.a(new al.b<Map<String, List<com.sankuai.waimai.store.manager.sequence.d>>>() { // from class: com.sankuai.waimai.store.drug.alita.marketing.a.6
                                                            public static ChangeQuickRedirect a;

                                                            @Override // com.sankuai.waimai.store.util.al.b
                                                            public final /* synthetic */ Map<String, List<com.sankuai.waimai.store.manager.sequence.d>> a() {
                                                                Object[] objArr12 = new Object[0];
                                                                ChangeQuickRedirect changeQuickRedirect12 = a;
                                                                if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "d47f4c101e46bc5af3eca72b58f560e9", RobustBitConfig.DEFAULT_VALUE)) {
                                                                    return (Map) PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "d47f4c101e46bc5af3eca72b58f560e9");
                                                                }
                                                                ae.a("AlitaMarketingTemplateController", " parse result: \n" + i.a(marketingResponse));
                                                                return a.this.d.a(a.this.b, a.this.g, marketingResponse, a.this);
                                                            }

                                                            @Override // com.sankuai.waimai.store.util.al.b
                                                            public final /* synthetic */ void a(Map<String, List<com.sankuai.waimai.store.manager.sequence.d>> map) {
                                                                Map<String, List<com.sankuai.waimai.store.manager.sequence.d>> map2 = map;
                                                                Object[] objArr12 = {map2};
                                                                ChangeQuickRedirect changeQuickRedirect12 = a;
                                                                if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "e9cba263e1bb55712e1fe6d04d466277", RobustBitConfig.DEFAULT_VALUE)) {
                                                                    PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "e9cba263e1bb55712e1fe6d04d466277");
                                                                } else if (interfaceC1145a != null) {
                                                                    interfaceC1145a.a(map2);
                                                                }
                                                            }
                                                        }, aVar2.c);
                                                    }
                                                }
                                            }

                                            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                                            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                                                String str4;
                                                Object[] objArr7 = {bVar};
                                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "621e1a7379162e1522307eb51d256ba4", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "621e1a7379162e1522307eb51d256ba4");
                                                    return;
                                                }
                                                super.a(bVar);
                                                a.AbstractC1332a b2 = new com.sankuai.waimai.store.drug.log.a().a("MarketModule").b("alita_algo_api_request_err");
                                                if (("err:" + bVar) != null) {
                                                    str4 = bVar.toString();
                                                } else {
                                                    str4 = i.a(a3);
                                                }
                                                com.sankuai.waimai.store.util.monitor.report.d.c(b2.c(str4).b());
                                            }
                                        });
                                    }
                                }
                                a.AbstractC1332a b2 = new com.sankuai.waimai.store.drug.log.a().a("MarketModule").b("alita_algo_callback");
                                if (("onRunSuccess: " + str + " taskKey: " + str2 + "currentActivity:" + activity2) != null) {
                                    str3 = activity2.toString();
                                } else {
                                    str3 = "isCanDisplay:" + a.a(activity2) + " result: " + jSONObject.toString();
                                }
                                com.sankuai.waimai.store.util.monitor.report.d.b(b2.c(str3).b());
                            }
                        }
                    } catch (Exception e) {
                        com.sankuai.shangou.stone.util.log.a.a(e);
                    }
                }
            };
            com.sankuai.waimai.alita.core.event.autorunner.c.a().b("medicine").a("alita_medicine-marketing-algo-rule-engine", d);
        }
    }

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d4e3bffe3f2a81805ff617c8e5d09c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d4e3bffe3f2a81805ff617c8e5d09c5");
            return;
        }
        a aVar = c.get(activity.toString());
        if (aVar != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "3738e8c774c4c80dea85018275db4ff7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "3738e8c774c4c80dea85018275db4ff7");
                return;
            }
            aVar.a().c(true);
            aVar.b().c(true);
        }
    }

    public static void b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "959e1f1ab1c919b4a3e67fedd50d4d1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "959e1f1ab1c919b4a3e67fedd50d4d1e");
            return;
        }
        a aVar = c.get(activity.toString());
        if (aVar != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "5b17f380803c848f3610b5c1e5b7f3ee", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "5b17f380803c848f3610b5c1e5b7f3ee");
                return;
            }
            aVar.a().c(false);
            aVar.b().c(false);
        }
    }

    public static void a(Activity activity, int i) {
        Object[] objArr = {activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c132fc1954887d25b47e15c378b345d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c132fc1954887d25b47e15c378b345d7");
            return;
        }
        a remove = c.remove(activity.toString());
        if (remove != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, remove, changeQuickRedirect2, false, "bf7236244c591588b6d1b55ac2a8d6ab", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, remove, changeQuickRedirect2, false, "bf7236244c591588b6d1b55ac2a8d6ab");
            } else {
                remove.a(remove.e);
                remove.a(remove.f);
                al.cancel(remove.c);
            }
            com.sankuai.waimai.store.base.net.c.a(activity.toString());
        }
        if (i <= 0) {
            com.sankuai.waimai.alita.core.event.autorunner.c.a().b("medicine").b("alita_medicine-marketing-algo-rule-engine", d);
            d = null;
        }
    }
}
