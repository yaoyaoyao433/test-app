package com.sankuai.waimai.business.im.group.init;

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
import com.sankuai.waimai.imbase.manager.f;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.controller.group.bean.AtMeInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMImUserGroupSessionConfig implements IChatInfo {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.imbase.knb.IChatInfo
    public d<List<GetAllSessionListHandler.a>> getChatInfo(final List<com.sankuai.xm.im.session.entry.a> list, final Set<Long> set) {
        Object[] objArr = {list, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac3bcb4c54a3dab38bb3021fb4307311", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac3bcb4c54a3dab38bb3021fb4307311") : d.a(d.a((d.a) new d.a<List<GetAllSessionListHandler.a>>() { // from class: com.sankuai.waimai.business.im.group.init.WMImUserGroupSessionConfig.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                j jVar = (j) obj;
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "88b09d0dbbb900ac42a10ee54e4da0b9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "88b09d0dbbb900ac42a10ee54e4da0b9");
                    return;
                }
                if (com.sankuai.waimai.imbase.utils.a.a(list) || set == null || set.isEmpty()) {
                    jVar.onNext(new ArrayList());
                }
                jVar.onCompleted();
            }
        }), d.a((d.a) new AnonymousClass2(set, list))).b(rx.schedulers.a.e()).d();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.im.group.init.WMImUserGroupSessionConfig$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass2 implements d.a<List<GetAllSessionListHandler.a>> {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ Set b;
        public final /* synthetic */ List c;

        public AnonymousClass2(Set set, List list) {
            this.b = set;
            this.c = list;
        }

        @Override // rx.functions.b
        public final /* synthetic */ void call(Object obj) {
            final j jVar = (j) obj;
            Object[] objArr = {jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9cbfcc9dbf9758b857fd63b728cedf6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9cbfcc9dbf9758b857fd63b728cedf6");
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (Long l : this.b) {
                sb.append(l);
                sb.append(CommonConstant.Symbol.COMMA);
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WmImGroupService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WmImGroupService.class)).getGroupSessionInfo(sb.toString()), new b.AbstractC1042b<BaseResponse<e>>() { // from class: com.sankuai.waimai.business.im.group.init.WMImUserGroupSessionConfig.2.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj2) {
                    BaseResponse baseResponse = (BaseResponse) obj2;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3b445253aa66a7cb12030973743d718", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3b445253aa66a7cb12030973743d718");
                    } else if (baseResponse == null || baseResponse.code != 0) {
                        jVar.onNext(new ArrayList());
                        jVar.onCompleted();
                    } else {
                        final e eVar = (e) baseResponse.data;
                        if (eVar == null || eVar.a == null || eVar.a.isEmpty()) {
                            jVar.onNext(new ArrayList());
                            jVar.onCompleted();
                            return;
                        }
                        final HashMap hashMap = new HashMap();
                        com.sankuai.xm.ui.a.a().a((SessionId) null, new com.sankuai.xm.im.a<List<AtMeInfo>>() { // from class: com.sankuai.waimai.business.im.group.init.WMImUserGroupSessionConfig.2.1.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.xm.base.callback.Callback
                            public final /* synthetic */ void onSuccess(Object obj3) {
                                List<AtMeInfo> list = (List) obj3;
                                Object[] objArr3 = {list};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e0ff8f626e568ee5a85b0af0b11f0133", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e0ff8f626e568ee5a85b0af0b11f0133");
                                    return;
                                }
                                for (AtMeInfo atMeInfo : list) {
                                    hashMap.put(Long.valueOf(atMeInfo.getGid()), "isAt");
                                }
                                ArrayList arrayList = new ArrayList();
                                for (com.sankuai.xm.im.session.entry.a aVar : AnonymousClass2.this.c) {
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
                                                    WMImUserGroupSessionConfig.this.createSessionModel(arrayList, aVar, iMMessage, next, Boolean.valueOf(hashMap.containsKey(Long.valueOf(chatId))));
                                                    f.a().a(String.valueOf(chatId), next.l);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                jVar.onNext(arrayList);
                                jVar.onCompleted();
                            }

                            @Override // com.sankuai.xm.base.callback.Callback
                            public final void onFailure(int i, String str) {
                                Object[] objArr3 = {Integer.valueOf(i), str};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d9f44ebcb3027873751a2a64b4424441", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d9f44ebcb3027873751a2a64b4424441");
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                for (com.sankuai.xm.im.session.entry.a aVar : AnonymousClass2.this.c) {
                                    IMMessage iMMessage = aVar.b;
                                    if (str != null) {
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
                                                    WMImUserGroupSessionConfig.this.createSessionModel(arrayList, aVar, iMMessage, next, Boolean.FALSE);
                                                    f.a().a(String.valueOf(chatId), next.l);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                jVar.onNext(arrayList);
                                jVar.onCompleted();
                            }
                        });
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd7d32b1f2891b5ed463966c5a69b33b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd7d32b1f2891b5ed463966c5a69b33b");
                        return;
                    }
                    jVar.onNext(new ArrayList());
                    jVar.onError(th);
                }
            }, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createSessionModel(List<GetAllSessionListHandler.a> list, com.sankuai.xm.im.session.entry.a aVar, IMMessage iMMessage, e.a aVar2, Boolean bool) {
        Object[] objArr = {list, aVar, iMMessage, aVar2, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "312269706232dff5162c88d607ed2cef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "312269706232dff5162c88d607ed2cef");
            return;
        }
        com.sankuai.waimai.imbase.listener.model.b bVar = new com.sankuai.waimai.imbase.listener.model.b(aVar2.f, h.a(aVar.b), aVar.d, aVar2.i, com.sankuai.waimai.imbase.register.b.UNREAD_BUBBLE, new HashMap());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_at", bool);
            jSONObject.put("no_disturbing_status", aVar2.l == 1);
            jSONObject.put("poi_id", aVar2.d);
            jSONObject.put(FoodDetailNetWorkPreLoader.URI_POI_STR, aVar2.e);
            jSONObject.put("subscribe_text", aVar2.n);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        bVar.h = jSONObject;
        list.add(new GetAllSessionListHandler.a(bVar, iMMessage));
    }
}
