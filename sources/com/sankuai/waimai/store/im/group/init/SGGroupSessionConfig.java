package com.sankuai.waimai.store.im.group.init;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.im.prepare.h;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.b;
import com.sankuai.waimai.imbase.knb.GetAllSessionListHandler;
import com.sankuai.waimai.imbase.knb.IChatInfo;
import com.sankuai.waimai.store.im.group.model.GroupEventExtensionInfo;
import com.sankuai.waimai.store.im.group.model.SGGroupBriefInfo;
import com.sankuai.waimai.store.util.i;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.im.session.entry.a;
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
/* loaded from: classes5.dex */
public class SGGroupSessionConfig implements IChatInfo {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.imbase.knb.IChatInfo
    public d<List<GetAllSessionListHandler.a>> getChatInfo(final List<a> list, Set<Long> set) {
        Object[] objArr = {list, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d12225ac528fd1718684665cc93cdea", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d12225ac528fd1718684665cc93cdea") : d.a(d.a((d.a) new d.a<List<GetAllSessionListHandler.a>>() { // from class: com.sankuai.waimai.store.im.group.init.SGGroupSessionConfig.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                final j jVar = (j) obj;
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ea8dbf160bfc52e1be081d1d93f696a8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ea8dbf160bfc52e1be081d1d93f696a8");
                } else if (com.sankuai.waimai.imbase.utils.a.a(list)) {
                    jVar.onNext(new ArrayList());
                } else if (!p.a(list.get(0))) {
                    com.sankuai.xm.ui.a.a().a(((a) list.get(0)).c(), new com.sankuai.xm.im.a<List<AtMeInfo>>() { // from class: com.sankuai.waimai.store.im.group.init.SGGroupSessionConfig.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.xm.base.callback.Callback
                        public final /* synthetic */ void onSuccess(Object obj2) {
                            List list2 = (List) obj2;
                            Object[] objArr3 = {list2};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "6e211f868c9ec5f4ca10040d9bb18930", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "6e211f868c9ec5f4ca10040d9bb18930");
                                return;
                            }
                            if (!b.b(list2)) {
                                IMMessage a2 = IMClient.a().a(2, ((AtMeInfo) list2.get(0)).getUuid(), true);
                                String a3 = h.a(a2);
                                StringBuffer stringBuffer = new StringBuffer("管理员:");
                                stringBuffer.append(a3);
                                IMMessage iMMessage = ((a) list.get(0)).b;
                                if (a2 instanceof TextMessage) {
                                    ((TextMessage) iMMessage).setText(stringBuffer.toString());
                                }
                            }
                            jVar.onCompleted();
                        }

                        @Override // com.sankuai.xm.base.callback.Callback
                        public final void onFailure(int i, String str) {
                            Object[] objArr3 = {Integer.valueOf(i), str};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "232fe65a03a2a7b519226f53b560531c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "232fe65a03a2a7b519226f53b560531c");
                            } else {
                                jVar.onCompleted();
                            }
                        }
                    });
                } else {
                    jVar.onCompleted();
                }
            }
        }), d.a((d.a) new d.a<List<GetAllSessionListHandler.a>>() { // from class: com.sankuai.waimai.store.im.group.init.SGGroupSessionConfig.2
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                final j jVar = (j) obj;
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b6488c8a8bad175091e706db710395bd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b6488c8a8bad175091e706db710395bd");
                    return;
                }
                final ArrayList arrayList = new ArrayList();
                final String buildRequestParams = SGGroupSessionConfig.this.buildRequestParams(arrayList, list);
                if (aa.a(buildRequestParams)) {
                    jVar.onNext(arrayList);
                } else {
                    com.sankuai.waimai.store.im.base.net.b.a((Object) null).a(buildRequestParams, IMClient.a().k(), new com.sankuai.waimai.store.base.net.j<SGGroupBriefInfo>() { // from class: com.sankuai.waimai.store.im.group.init.SGGroupSessionConfig.2.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.base.net.j
                        public final void a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "5a8f931f52a5d5ca4446a9c5060bbbbd", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "5a8f931f52a5d5ca4446a9c5060bbbbd");
                            }
                        }

                        @Override // com.sankuai.waimai.store.base.net.j
                        public final /* synthetic */ void a(SGGroupBriefInfo sGGroupBriefInfo) {
                            SGGroupBriefInfo sGGroupBriefInfo2 = sGGroupBriefInfo;
                            Object[] objArr3 = {sGGroupBriefInfo2};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "fc0707b9b742c50aab4f99c7ff0eda54", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "fc0707b9b742c50aab4f99c7ff0eda54");
                            } else if (sGGroupBriefInfo2 == null || sGGroupBriefInfo2.briefGroupInfoList == null || sGGroupBriefInfo2.briefGroupInfoList.isEmpty()) {
                                jVar.onNext(arrayList);
                            } else {
                                com.sankuai.waimai.store.im.group.manager.a.a().f = sGGroupBriefInfo2.briefGroupInfoList;
                                for (a aVar : list) {
                                    IMMessage iMMessage = aVar.b;
                                    if (iMMessage != null) {
                                        long chatId = iMMessage.getChatId();
                                        Iterator<SGGroupBriefInfo.GroupBriefInfo> it = sGGroupBriefInfo2.briefGroupInfoList.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            SGGroupBriefInfo.GroupBriefInfo next = it.next();
                                            if (next != null && TextUtils.equals(next.groupId, String.valueOf(chatId)) && buildRequestParams.contains(String.valueOf(chatId))) {
                                                com.sankuai.waimai.store.im.group.manager.a.a().a(String.valueOf(chatId), next.noDisturbingStatus);
                                                com.sankuai.waimai.store.im.group.manager.a.a().a(String.valueOf(chatId), next.noAtMeDisturbingStatus ? 1 : 0);
                                                SGGroupSessionConfig.this.createSessionModel(arrayList, aVar, iMMessage, next);
                                                break;
                                            }
                                        }
                                    }
                                }
                                jVar.onNext(arrayList);
                            }
                        }

                        @Override // com.sankuai.waimai.store.base.net.j
                        public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                            Object[] objArr3 = {bVar};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "c47261bfed678d8cf6a1f52b84ff9095", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "c47261bfed678d8cf6a1f52b84ff9095");
                            } else {
                                jVar.onNext(arrayList);
                            }
                        }

                        @Override // com.sankuai.waimai.store.base.net.j
                        public final void b() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "b6190750a5d6b036527eae83a87d27d8", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "b6190750a5d6b036527eae83a87d27d8");
                            } else {
                                jVar.onCompleted();
                            }
                        }
                    });
                }
            }
        })).b(rx.schedulers.a.e()).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String buildRequestParams(List<GetAllSessionListHandler.a> list, List<a> list2) {
        IMMessage iMMessage;
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28685cfd2f816ccfd2ed55af0ced4f55", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28685cfd2f816ccfd2ed55af0ced4f55");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list2.size(); i++) {
            a aVar = list2.get(i);
            if (aVar != null && (iMMessage = aVar.b) != null) {
                long chatId = iMMessage.getChatId();
                if (chatId > 0) {
                    int a = com.sankuai.waimai.store.im.group.manager.a.a().a(String.valueOf(chatId));
                    SGGroupBriefInfo.GroupBriefInfo b = com.sankuai.waimai.store.im.group.manager.a.a().b(String.valueOf(chatId));
                    if (b == null || a == com.sankuai.waimai.store.im.group.manager.a.d) {
                        sb.append(CommonConstant.Symbol.COMMA + chatId);
                    } else {
                        b.noDisturbingStatus = a == com.sankuai.waimai.store.im.group.manager.a.c;
                        createSessionModel(list, aVar, iMMessage, b);
                    }
                }
            }
        }
        String sb2 = sb.toString();
        return !TextUtils.isEmpty(sb2) ? sb2.substring(1, sb2.length()) : sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createSessionModel(List<GetAllSessionListHandler.a> list, a aVar, IMMessage iMMessage, SGGroupBriefInfo.GroupBriefInfo groupBriefInfo) {
        String str;
        Object[] objArr = {list, aVar, iMMessage, groupBriefInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6077a086cce7ea579de2afe15abe1760", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6077a086cce7ea579de2afe15abe1760");
            return;
        }
        HashMap hashMap = new HashMap();
        String str2 = groupBriefInfo.groupName;
        IMMessage iMMessage2 = aVar.b;
        Object[] objArr2 = {iMMessage2};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.im.group.manager.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "1862d5be149317819e6712caedc3d378", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "1862d5be149317819e6712caedc3d378");
        } else {
            String str3 = "";
            if ((iMMessage2 instanceof IMMessage) && (iMMessage2 instanceof GeneralMessage)) {
                int a = h.a((GeneralMessage) iMMessage2);
                if (a == 0) {
                    str3 = "[您收到了一个商品]";
                } else if (a != 104) {
                    switch (a) {
                        case 128:
                            str3 = "给你推荐多个热门商品～";
                            break;
                        case 129:
                            str3 = "给你推荐超值优惠券!";
                            break;
                    }
                } else {
                    str3 = "您收到一张优惠券";
                }
            }
            if (t.a(str3)) {
                str3 = h.a(iMMessage2);
            }
            if (iMMessage2 instanceof EventMessage) {
                EventMessage eventMessage = (EventMessage) iMMessage2;
                GroupEventExtensionInfo groupEventExtensionInfo = (GroupEventExtensionInfo) i.a(eventMessage.getExtension(), GroupEventExtensionInfo.class);
                if (eventMessage.getFromUid() == IMClient.a().k()) {
                    if (groupEventExtensionInfo != null && !t.a(groupEventExtensionInfo.riskNoticeToSender)) {
                        str3 = groupEventExtensionInfo.riskNoticeToSender;
                    }
                } else if (groupEventExtensionInfo != null && !t.a(groupEventExtensionInfo.riskNoticeToReceiver)) {
                    str3 = groupEventExtensionInfo.riskNoticeToReceiver;
                }
            }
            str = str3;
        }
        com.sankuai.waimai.imbase.listener.model.b bVar = new com.sankuai.waimai.imbase.listener.model.b(str2, str, aVar.d, groupBriefInfo.profilePhoto, com.sankuai.waimai.imbase.register.b.UNREAD_BUBBLE, hashMap);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("no_disturbing_status", groupBriefInfo.noDisturbingStatus);
            jSONObject.put("poi_id", groupBriefInfo.poiId);
            jSONObject.put("labels", i.a(groupBriefInfo.labels));
            if (h.a(iMMessage).startsWith("管理员:")) {
                jSONObject.put("is_at", true);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        bVar.h = jSONObject;
        list.add(new GetAllSessionListHandler.a(bVar, iMMessage));
    }
}
