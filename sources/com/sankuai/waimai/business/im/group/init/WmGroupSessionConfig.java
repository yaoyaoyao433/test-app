package com.sankuai.waimai.business.im.group.init;

import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.group.api.WmImGroupService;
import com.sankuai.waimai.business.im.group.model.e;
import com.sankuai.waimai.business.im.prepare.h;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.imbase.knb.GetAllSessionListHandler;
import com.sankuai.waimai.imbase.knb.IChatInfo;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.xm.im.message.bean.IMMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmGroupSessionConfig implements IChatInfo {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.imbase.knb.IChatInfo
    public d<List<GetAllSessionListHandler.a>> getChatInfo(final List<com.sankuai.xm.im.session.entry.a> list, final Set<Long> set) {
        Object[] objArr = {list, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36bfa6eded5e1419bfba30447200c77a", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36bfa6eded5e1419bfba30447200c77a") : d.a(d.a((d.a) new d.a<List<GetAllSessionListHandler.a>>() { // from class: com.sankuai.waimai.business.im.group.init.WmGroupSessionConfig.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                j jVar = (j) obj;
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3598a9e356cdc6ecae3b7e9dc6666d2a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3598a9e356cdc6ecae3b7e9dc6666d2a");
                    return;
                }
                if (com.sankuai.waimai.imbase.utils.a.a(list) || set == null || set.isEmpty()) {
                    jVar.onNext(new ArrayList());
                }
                jVar.onCompleted();
            }
        }), d.a((d.a) new d.a<List<GetAllSessionListHandler.a>>() { // from class: com.sankuai.waimai.business.im.group.init.WmGroupSessionConfig.2
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                List list2;
                e.a a2;
                j jVar = (j) obj;
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "674d5299b85000b68eff9bac813805a6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "674d5299b85000b68eff9bac813805a6");
                    return;
                }
                com.sankuai.waimai.business.im.group.cache.b a3 = com.sankuai.waimai.business.im.group.cache.b.a();
                Set<Long> set2 = set;
                Object[] objArr3 = {set2};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.im.group.cache.b.a;
                if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect4, false, "466351421d70e2f15c6e786b6e0d54cb", RobustBitConfig.DEFAULT_VALUE)) {
                    list2 = (List) PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect4, false, "466351421d70e2f15c6e786b6e0d54cb");
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Long l : set2) {
                        if (l != null && !a3.b.containsKey(l)) {
                            arrayList.add(l);
                        }
                    }
                    list2 = arrayList;
                }
                if (!list2.isEmpty()) {
                    jVar.onCompleted();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Map<String, Boolean> b = com.sankuai.waimai.business.im.group.cache.b.a().b();
                for (com.sankuai.xm.im.session.entry.a aVar : list) {
                    IMMessage iMMessage = aVar.b;
                    if (iMMessage != null && (a2 = com.sankuai.waimai.business.im.group.cache.b.a().a(iMMessage.getChatId())) != null) {
                        WmGroupSessionConfig.this.createSessionModel(arrayList2, aVar, iMMessage, a2, b);
                    }
                }
                jVar.onNext(arrayList2);
                jVar.onCompleted();
            }
        }), d.a((d.a) new d.a<List<GetAllSessionListHandler.a>>() { // from class: com.sankuai.waimai.business.im.group.init.WmGroupSessionConfig.3
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                final j jVar = (j) obj;
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d098d79ac85c7d28865bae681e081dd9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d098d79ac85c7d28865bae681e081dd9");
                    return;
                }
                StringBuilder sb = new StringBuilder();
                for (Long l : set) {
                    sb.append(l);
                    sb.append(CommonConstant.Symbol.COMMA);
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WmImGroupService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WmImGroupService.class)).getGroupSessionInfo(sb.toString()), new b.AbstractC1042b<BaseResponse<e>>() { // from class: com.sankuai.waimai.business.im.group.init.WmGroupSessionConfig.3.1
                    public static ChangeQuickRedirect a;

                    @Override // rx.e
                    public final /* synthetic */ void onNext(Object obj2) {
                        BaseResponse baseResponse = (BaseResponse) obj2;
                        Object[] objArr3 = {baseResponse};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "e88ef6a3fed095f7db181e1452ba3151", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "e88ef6a3fed095f7db181e1452ba3151");
                        } else if (baseResponse == null || baseResponse.code != 0) {
                            jVar.onNext(new ArrayList());
                            jVar.onCompleted();
                        } else {
                            e eVar = (e) baseResponse.data;
                            if (eVar == null || eVar.a == null || eVar.a.isEmpty()) {
                                jVar.onNext(new ArrayList());
                                jVar.onCompleted();
                                return;
                            }
                            com.sankuai.waimai.business.im.group.cache.b.a().a(eVar.b);
                            ArrayList arrayList = new ArrayList();
                            for (com.sankuai.xm.im.session.entry.a aVar : list) {
                                IMMessage iMMessage = aVar.b;
                                if (iMMessage != null) {
                                    long chatId = iMMessage.getChatId();
                                    Iterator<e.a> it = eVar.a.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        e.a next = it.next();
                                        if (next != null) {
                                            com.sankuai.waimai.business.im.group.cache.b.a().a(next.b, next);
                                            if (next.b == chatId) {
                                                WmGroupSessionConfig.this.createSessionModel(arrayList, aVar, iMMessage, next, com.sankuai.waimai.business.im.group.cache.b.a().b());
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            jVar.onNext(arrayList);
                            jVar.onCompleted();
                        }
                    }

                    @Override // rx.e
                    public final void onError(Throwable th) {
                        Object[] objArr3 = {th};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a716a78cbaff463ab39b137f9b26b7c5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a716a78cbaff463ab39b137f9b26b7c5");
                            return;
                        }
                        jVar.onNext(new ArrayList());
                        jVar.onError(th);
                    }
                }, "");
            }
        })).b(rx.schedulers.a.e()).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createSessionModel(List<GetAllSessionListHandler.a> list, com.sankuai.xm.im.session.entry.a aVar, IMMessage iMMessage, e.a aVar2, Map<String, Boolean> map) {
        Object[] objArr = {list, aVar, iMMessage, aVar2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88ce92703670813ec5d6b67a1821bba9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88ce92703670813ec5d6b67a1821bba9");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poiId", String.valueOf(aVar2.d));
        hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, aVar2.e);
        hashMap.put(Constants.EventConstants.KEY_ORDER_ID, String.valueOf(aVar2.c));
        hashMap.put(KnbConstants.PARAMS_SCENE, "0");
        com.sankuai.waimai.imbase.listener.model.b bVar = new com.sankuai.waimai.imbase.listener.model.b(aVar2.f, h.a(aVar.b), aVar.d, "", com.sankuai.waimai.imbase.register.b.UNREAD_BUBBLE, hashMap);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("poi_avatar", aVar2.g);
            jSONObject.put("rider_avatar", aVar2.h);
            if (aVar2.k == 1) {
                jSONObject.put("group_type", aVar2.k);
                jSONObject.put("group_state", aVar2.m);
                for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                    if (entry != null) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        bVar.h = jSONObject;
        list.add(new GetAllSessionListHandler.a(bVar, iMMessage));
    }
}
