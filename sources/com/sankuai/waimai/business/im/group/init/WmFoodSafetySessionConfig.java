package com.sankuai.waimai.business.im.group.init;

import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.group.api.WmImGroupService;
import com.sankuai.waimai.business.im.group.model.e;
import com.sankuai.waimai.business.im.prepare.h;
import com.sankuai.waimai.imbase.knb.GetAllSessionListHandler;
import com.sankuai.waimai.imbase.knb.IChatInfo;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmFoodSafetySessionConfig implements IChatInfo {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.imbase.knb.IChatInfo
    public d<List<GetAllSessionListHandler.a>> getChatInfo(final List<com.sankuai.xm.im.session.entry.a> list, final Set<Long> set) {
        Object[] objArr = {list, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9b089f879db054c9d450bd8e64d62f9", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9b089f879db054c9d450bd8e64d62f9") : d.a(d.a((d.a) new d.a<List<GetAllSessionListHandler.a>>() { // from class: com.sankuai.waimai.business.im.group.init.WmFoodSafetySessionConfig.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                j jVar = (j) obj;
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d275df7ad373656d4a12dbcfcf2deff1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d275df7ad373656d4a12dbcfcf2deff1");
                    return;
                }
                if (com.sankuai.waimai.imbase.utils.a.a(list) || set == null || set.isEmpty()) {
                    jVar.onNext(new ArrayList());
                }
                jVar.onCompleted();
            }
        }), d.a((d.a) new d.a<List<GetAllSessionListHandler.a>>() { // from class: com.sankuai.waimai.business.im.group.init.WmFoodSafetySessionConfig.2
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                final j jVar = (j) obj;
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2df157dc3437046c5b276b6f5f55dc24", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2df157dc3437046c5b276b6f5f55dc24");
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
                com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WmImGroupService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WmImGroupService.class)).getGroupSessionInfo(sb.toString()), new b.AbstractC1042b<BaseResponse<e>>() { // from class: com.sankuai.waimai.business.im.group.init.WmFoodSafetySessionConfig.2.1
                    public static ChangeQuickRedirect a;

                    @Override // rx.e
                    public final /* synthetic */ void onNext(Object obj2) {
                        BaseResponse baseResponse = (BaseResponse) obj2;
                        Object[] objArr3 = {baseResponse};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a919b339d28bee45ac8d6e4607bf7256", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a919b339d28bee45ac8d6e4607bf7256");
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
                                                WmFoodSafetySessionConfig.this.createSessionModel(arrayList, aVar, iMMessage, next);
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
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "db69d58c4c5dc87a0622ca00ae4ca78e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "db69d58c4c5dc87a0622ca00ae4ca78e");
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
    public void createSessionModel(List<GetAllSessionListHandler.a> list, com.sankuai.xm.im.session.entry.a aVar, IMMessage iMMessage, e.a aVar2) {
        int i;
        boolean z = false;
        Object[] objArr = {list, aVar, iMMessage, aVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd40e9f6a88468d096a77468fd9d29c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd40e9f6a88468d096a77468fd9d29c2");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(KnbConstants.PARAMS_SCENE, "0");
        com.sankuai.waimai.imbase.listener.model.b bVar = new com.sankuai.waimai.imbase.listener.model.b(aVar2.f, h.a(aVar.b), aVar.d, aVar2.g, com.sankuai.waimai.imbase.register.b.UNREAD_BUBBLE, hashMap);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("poi_avatar", aVar2.g);
            jSONObject.put("group_type", aVar2.k);
            jSONObject.put("group_state", aVar2.m);
            if (iMMessage instanceof GeneralMessage) {
                GeneralMessage generalMessage = (GeneralMessage) iMMessage;
                if (generalMessage.getData() != null && ((i = new JSONObject(new String(generalMessage.getData(), "utf-8")).getInt("type")) == 2002 || i == 2003)) {
                    z = true;
                }
            }
            jSONObject.put("is_red_packet", z);
        } catch (Exception e) {
            e.printStackTrace();
        }
        bVar.h = jSONObject;
        list.add(new GetAllSessionListHandler.a(bVar, iMMessage));
    }
}
