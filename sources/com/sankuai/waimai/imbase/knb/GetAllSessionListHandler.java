package com.sankuai.waimai.imbase.knb;

import android.net.Uri;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.waimai.imbase.utils.c;
import com.sankuai.xm.im.message.bean.IMMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.d;
import rx.functions.g;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GetAllSessionListHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d22891bbc3949978ddfa5bddaa3eb75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d22891bbc3949978ddfa5bddaa3eb75");
        } else if (com.sankuai.waimai.foundation.core.a.f()) {
            jsCallback(new JSONObject().toString());
        } else {
            com.sankuai.waimai.imbase.manager.b.a().a(new d.c() { // from class: com.sankuai.waimai.imbase.knb.GetAllSessionListHandler.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.imbase.manager.d.c
                public final void a(List<com.sankuai.xm.im.session.entry.a> list) {
                    com.sankuai.waimai.imbase.listener.b a2;
                    com.sankuai.waimai.imbase.listener.model.b a3;
                    Object[] objArr2 = {list};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e7123ee9e18e057e16f3f6047a096bf2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e7123ee9e18e057e16f3f6047a096bf2");
                        return;
                    }
                    final JSONObject jSONObject = new JSONObject();
                    if (!com.sankuai.waimai.imbase.utils.a.a(list)) {
                        final JSONArray jSONArray = new JSONArray();
                        for (com.sankuai.xm.im.session.entry.a aVar : list) {
                            IMMessage iMMessage = aVar.b;
                            if (iMMessage != null && (a2 = com.sankuai.waimai.imbase.listener.manager.b.a().a(iMMessage.getChannel())) != null && (a3 = a2.a(aVar)) != null) {
                                jSONArray.put(GetAllSessionListHandler.this.toJson(a3, iMMessage));
                            }
                        }
                        rx.d.a(new j<List<a>>() { // from class: com.sankuai.waimai.imbase.knb.GetAllSessionListHandler.1.1
                            public static ChangeQuickRedirect a;

                            @Override // rx.e
                            public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                            }

                            @Override // rx.e
                            public final void onCompleted() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "cf2262ae3be8d8a384b4b7d6212a2c57", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "cf2262ae3be8d8a384b4b7d6212a2c57");
                                } else {
                                    a();
                                }
                            }

                            @Override // rx.e
                            public final void onError(Throwable th) {
                                Object[] objArr3 = {th};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "fab3b259240929aa7900f87b2c632dce", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "fab3b259240929aa7900f87b2c632dce");
                                } else {
                                    a();
                                }
                            }

                            private void a() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "7404fa65c88473eb4ea837b22a0b6755", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "7404fa65c88473eb4ea837b22a0b6755");
                                    return;
                                }
                                try {
                                    jSONObject.put("messages", jSONArray);
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                                GetAllSessionListHandler.this.jsCallback((jSONObject == null ? new JSONObject() : jSONObject).toString());
                            }
                        }, rx.d.a((d.a) new d.a<b>() { // from class: com.sankuai.waimai.imbase.knb.GetAllSessionListHandler.1.4
                            public static ChangeQuickRedirect a;

                            @Override // rx.functions.b
                            public final /* synthetic */ void call(Object obj) {
                                final j jVar = (j) obj;
                                Object[] objArr3 = {jVar};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "d28d1a25d06a1b9b4a2b98f56d328d96", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "d28d1a25d06a1b9b4a2b98f56d328d96");
                                } else {
                                    com.sankuai.waimai.imbase.manager.b.a().a(new d.c() { // from class: com.sankuai.waimai.imbase.knb.GetAllSessionListHandler.1.4.1
                                        public static ChangeQuickRedirect a;

                                        @Override // com.sankuai.waimai.imbase.manager.d.c
                                        public final void a(List<com.sankuai.xm.im.session.entry.a> list2) {
                                            Object[] objArr4 = {list2};
                                            ChangeQuickRedirect changeQuickRedirect5 = a;
                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "1267d09c1aac7999b71e5e3665633b27", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "1267d09c1aac7999b71e5e3665633b27");
                                                return;
                                            }
                                            HashMap hashMap = new HashMap();
                                            hashMap.put((short) 1025, new HashSet());
                                            hashMap.put((short) 1029, new HashSet());
                                            hashMap.put((short) 1036, new HashSet());
                                            hashMap.put((short) 1050, new HashSet());
                                            HashMap hashMap2 = new HashMap();
                                            hashMap2.put((short) 1025, new ArrayList());
                                            hashMap2.put((short) 1029, new ArrayList());
                                            hashMap2.put((short) 1036, new ArrayList());
                                            hashMap2.put((short) 1050, new ArrayList());
                                            if (!com.sankuai.waimai.imbase.utils.a.a(list2)) {
                                                for (com.sankuai.xm.im.session.entry.a aVar2 : list2) {
                                                    IMMessage iMMessage2 = aVar2.b;
                                                    if (iMMessage2 != null) {
                                                        if (iMMessage2.getChannel() == 1025 && iMMessage2.getCategory() == 2) {
                                                            ((Set) hashMap.get((short) 1025)).add(Long.valueOf(iMMessage2.getChatId()));
                                                            ((List) hashMap2.get((short) 1025)).add(aVar2);
                                                        }
                                                        if (iMMessage2.getChannel() == 1029 && iMMessage2.getCategory() == 2) {
                                                            ((Set) hashMap.get((short) 1029)).add(Long.valueOf(iMMessage2.getChatId()));
                                                            ((List) hashMap2.get((short) 1029)).add(aVar2);
                                                        }
                                                        if (iMMessage2.getChannel() == 1036 && iMMessage2.getCategory() == 2) {
                                                            ((Set) hashMap.get((short) 1036)).add(Long.valueOf(iMMessage2.getChatId()));
                                                            ((List) hashMap2.get((short) 1036)).add(aVar2);
                                                        }
                                                        if (iMMessage2.getChannel() == 1050 && iMMessage2.getCategory() == 2) {
                                                            ((Set) hashMap.get((short) 1050)).add(Long.valueOf(iMMessage2.getChatId()));
                                                            ((List) hashMap2.get((short) 1050)).add(aVar2);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!hashMap.isEmpty()) {
                                                jVar.onNext(new b(hashMap, hashMap2));
                                            }
                                            jVar.onCompleted();
                                        }
                                    });
                                }
                            }
                        }).b(rx.schedulers.a.e()).c(new g<b, rx.d<List<a>>>() { // from class: com.sankuai.waimai.imbase.knb.GetAllSessionListHandler.1.3
                            public static ChangeQuickRedirect a;

                            @Override // rx.functions.g
                            public final /* synthetic */ rx.d<List<a>> call(b bVar) {
                                rx.d<List<a>> b2;
                                rx.d<List<a>> b3;
                                rx.d<List<a>> b4;
                                rx.d<List<a>> b5;
                                rx.d<List<a>> b6;
                                b bVar2 = bVar;
                                Object[] objArr3 = {bVar2};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a5caab804ae6418ab68fab6b07a532e1", RobustBitConfig.DEFAULT_VALUE)) {
                                    return (rx.d) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a5caab804ae6418ab68fab6b07a532e1");
                                }
                                IChatInfo iChatInfo = (IChatInfo) com.sankuai.waimai.router.a.a(IChatInfo.class, IChatInfo.SG_KEY);
                                if (iChatInfo != null) {
                                    b2 = iChatInfo.getChatInfo(bVar2.b.get((short) 1029), null);
                                } else {
                                    b2 = rx.d.b();
                                }
                                IChatInfo iChatInfo2 = (IChatInfo) com.sankuai.waimai.router.a.a(IChatInfo.class, IChatInfo.WM_KEY);
                                if (iChatInfo2 != null) {
                                    b3 = iChatInfo2.getChatInfo(bVar2.b.get((short) 1025), bVar2.a.get((short) 1025));
                                } else {
                                    b3 = rx.d.b();
                                }
                                IChatInfo iChatInfo3 = (IChatInfo) com.sankuai.waimai.router.a.a(IChatInfo.class, IChatInfo.WM_USER_KEY);
                                if (iChatInfo3 != null) {
                                    b4 = iChatInfo3.getChatInfo(bVar2.b.get((short) 1036), bVar2.a.get((short) 1036));
                                } else {
                                    b4 = rx.d.b();
                                }
                                IChatInfo iChatInfo4 = (IChatInfo) com.sankuai.waimai.router.a.a(IChatInfo.class, IChatInfo.WM_FOOD_SAFETY_KEY);
                                if (iChatInfo4 != null) {
                                    b5 = iChatInfo4.getChatInfo(bVar2.b.get((short) 1050), bVar2.a.get((short) 1050));
                                } else {
                                    b5 = rx.d.b();
                                }
                                ISessionsInfo iSessionsInfo = (ISessionsInfo) com.sankuai.waimai.router.a.a(ISessionsInfo.class, ISessionsInfo.MED_B2C_IM);
                                if (iSessionsInfo != null) {
                                    b6 = iSessionsInfo.resolveSessionInfo(jSONArray);
                                } else {
                                    b6 = rx.d.b();
                                }
                                return rx.d.a(b3, b2, b4, b5, b6);
                            }
                        }).b(rx.schedulers.a.e()).b((rx.functions.b) new rx.functions.b<List<a>>() { // from class: com.sankuai.waimai.imbase.knb.GetAllSessionListHandler.1.2
                            public static ChangeQuickRedirect a;

                            @Override // rx.functions.b
                            public final /* synthetic */ void call(List<a> list2) {
                                List<a> list3 = list2;
                                Object[] objArr3 = {list3};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "041e8af8f4f32654b7c9a361b5e536a3", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "041e8af8f4f32654b7c9a361b5e536a3");
                                    return;
                                }
                                for (a aVar2 : list3) {
                                    jSONArray.put(GetAllSessionListHandler.this.toJson(aVar2.a, aVar2.b));
                                }
                            }
                        }).a(rx.android.schedulers.a.a()));
                        return;
                    }
                    GetAllSessionListHandler.this.jsCallback(jSONObject.toString());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject toJson(com.sankuai.waimai.imbase.listener.model.b bVar, IMMessage iMMessage) {
        Object[] objArr = {bVar, iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67756f1ed1c55c6032888edd27f5ac64", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67756f1ed1c55c6032888edd27f5ac64");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("title", bVar.b);
            jSONObject.put("brief", bVar.c);
            jSONObject.put("send_time", iMMessage.getCts());
            jSONObject.put("unread_count", bVar.d);
            jSONObject.put("avatar", bVar.e);
            jSONObject.put("peer_id", iMMessage.getChatId());
            jSONObject.put("type", bVar.f.f);
            jSONObject.put("channel_id", (int) iMMessage.getChannel());
            jSONObject.put("category", iMMessage.getCategory());
            Uri.Builder a2 = c.a(iMMessage);
            Map<String, String> map = bVar.g;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    a2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
            a2.appendQueryParameter("from", "6");
            a2.appendQueryParameter("from_backend_push", "1");
            jSONObject.put("scheme_url", a2.toString());
            jSONObject.put("extra", bVar.a().toString());
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        return jSONObject;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        public HashMap<Short, Set<Long>> a;
        public HashMap<Short, List<com.sankuai.xm.im.session.entry.a>> b;

        public b(HashMap<Short, Set<Long>> hashMap, HashMap<Short, List<com.sankuai.xm.im.session.entry.a>> hashMap2) {
            this.a = hashMap;
            this.b = hashMap2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public com.sankuai.waimai.imbase.listener.model.b a;
        public IMMessage b;

        public a(com.sankuai.waimai.imbase.listener.model.b bVar, IMMessage iMMessage) {
            this.a = bVar;
            this.b = iMMessage;
        }
    }
}
