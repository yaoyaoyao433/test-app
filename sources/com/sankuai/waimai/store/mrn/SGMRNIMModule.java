package com.sankuai.waimai.store.mrn;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.ptcommonim.base.bean.PTIMCommonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.imbase.knb.GetAllSessionListHandler;
import com.sankuai.waimai.imbase.knb.IChatInfo;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.waimai.store.router.h;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.imui.controller.group.bean.GroupAnnouncement;
import com.unionpay.tsmservice.data.Constant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import rx.d;
import rx.functions.g;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGMRNIMModule extends ReactContextBaseJavaModule {
    private static final int BIZ_TYPE_SHANGOU = 2;
    private static final String VOLLEY_TAG = "SGMRNIMModule";
    public static ChangeQuickRedirect changeQuickRedirect;
    private IMClient.d mConnetListener;
    private com.sankuai.waimai.store.im.number.b mDxWithApiMessageListener;
    private IMClient.i mMessageListener;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SMMRNIM";
    }

    public SGMRNIMModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "deafc8f3ab9596c5e1a9cce106d076d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "deafc8f3ab9596c5e1a9cce106d076d8");
        }
    }

    @ReactMethod
    public void getSessionByChannel(final String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42f3e200e343ca20f120cc05cc530e45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42f3e200e343ca20f120cc05cc530e45");
            return;
        }
        try {
            if (TextUtils.equals(str, "1029")) {
                final WritableNativeArray writableNativeArray = new WritableNativeArray();
                rx.d.a(new j<List<GetAllSessionListHandler.a>>() { // from class: com.sankuai.waimai.store.mrn.SGMRNIMModule.1
                    public static ChangeQuickRedirect a;

                    @Override // rx.e
                    public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                    }

                    @Override // rx.e
                    public final void onCompleted() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "628c70af554fadbe4a20bb3d88dc71cb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "628c70af554fadbe4a20bb3d88dc71cb");
                            return;
                        }
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "87a48b7b3b99acf688b6b29bf6d0bab2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "87a48b7b3b99acf688b6b29bf6d0bab2");
                        } else {
                            promise.resolve(writableNativeArray);
                        }
                    }

                    @Override // rx.e
                    public final void onError(Throwable th) {
                        Object[] objArr2 = {th};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "465637411a887672e434e3ba2d41d786", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "465637411a887672e434e3ba2d41d786");
                        } else {
                            d.a(promise, null);
                        }
                    }
                }, rx.d.a((d.a) new d.a<GetAllSessionListHandler.b>() { // from class: com.sankuai.waimai.store.mrn.SGMRNIMModule.6
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.b
                    public final /* synthetic */ void call(Object obj) {
                        final j jVar = (j) obj;
                        Object[] objArr2 = {jVar};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fd18b9c5b676bc665b830ede359fcfdb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fd18b9c5b676bc665b830ede359fcfdb");
                        } else {
                            com.sankuai.waimai.imbase.manager.b.a().a((short) r.a(str, 0), new d.c() { // from class: com.sankuai.waimai.store.mrn.SGMRNIMModule.6.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.imbase.manager.d.c
                                public final void a(List<com.sankuai.xm.im.session.entry.a> list) {
                                    Object[] objArr3 = {list};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "2f37f5e3437e9a054efc039091348973", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "2f37f5e3437e9a054efc039091348973");
                                        return;
                                    }
                                    HashMap hashMap = new HashMap();
                                    hashMap.put((short) 1029, new ArrayList());
                                    if (!com.sankuai.waimai.imbase.utils.a.a(list)) {
                                        for (com.sankuai.xm.im.session.entry.a aVar : list) {
                                            if (aVar.b != null) {
                                                ((List) hashMap.get((short) 1029)).add(aVar);
                                            }
                                        }
                                    }
                                    if (!hashMap.isEmpty()) {
                                        jVar.onNext(new GetAllSessionListHandler.b(null, hashMap));
                                    }
                                    jVar.onCompleted();
                                }
                            });
                        }
                    }
                }).b(rx.schedulers.a.e()).a((g) new g<GetAllSessionListHandler.b, rx.d<List<GetAllSessionListHandler.a>>>() { // from class: com.sankuai.waimai.store.mrn.SGMRNIMModule.5
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.g
                    public final /* synthetic */ rx.d<List<GetAllSessionListHandler.a>> call(GetAllSessionListHandler.b bVar) {
                        GetAllSessionListHandler.b bVar2 = bVar;
                        Object[] objArr2 = {bVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5058e0e0ff48eada82ac4d28724a7403", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5058e0e0ff48eada82ac4d28724a7403") : ((IChatInfo) com.sankuai.waimai.router.a.a(IChatInfo.class, IChatInfo.SG_KEY)).getChatInfo(bVar2.b.get((short) 1029), null);
                    }
                }).b(rx.schedulers.a.e()).b((rx.functions.b) new rx.functions.b<List<GetAllSessionListHandler.a>>() { // from class: com.sankuai.waimai.store.mrn.SGMRNIMModule.4
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.b
                    public final /* synthetic */ void call(List<GetAllSessionListHandler.a> list) {
                        List<GetAllSessionListHandler.a> list2 = list;
                        Object[] objArr2 = {list2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "908d2fe8b722a4eb31ef07142d1673c4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "908d2fe8b722a4eb31ef07142d1673c4");
                            return;
                        }
                        for (GetAllSessionListHandler.a aVar : list2) {
                            writableNativeArray.pushMap(SGMRNIMModule.this.toWritableMap(aVar.a, aVar.b));
                        }
                    }
                }).a(rx.android.schedulers.a.a()));
                return;
            }
            com.sankuai.waimai.imbase.manager.b.a().a((short) r.a(str, 0), new d.c() { // from class: com.sankuai.waimai.store.mrn.SGMRNIMModule.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.imbase.manager.d.c
                public final void a(List<com.sankuai.xm.im.session.entry.a> list) {
                    Object[] objArr2 = {list};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1efd9326864e1865f0c4522dda50069a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1efd9326864e1865f0c4522dda50069a");
                    } else {
                        promise.resolve(SGMRNIMModule.this.sessionListToArray(list));
                    }
                }
            });
        } catch (Exception e) {
            d.a(promise, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WritableArray sessionListToArray(List<com.sankuai.xm.im.session.entry.a> list) {
        com.sankuai.waimai.imbase.listener.b a;
        com.sankuai.waimai.imbase.listener.model.b a2;
        WritableMap writableMap;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64f112f38ab8e64551a2896cb27e8d8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64f112f38ab8e64551a2896cb27e8d8f");
        }
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (com.sankuai.shangou.stone.util.a.a((List) list) > 0) {
            for (int i = 0; i < list.size(); i++) {
                com.sankuai.xm.im.session.entry.a aVar = list.get(i);
                IMMessage iMMessage = aVar.b;
                if (iMMessage != null && (a = com.sankuai.waimai.imbase.listener.manager.b.a().a(iMMessage.getChannel())) != null && (a2 = a.a(aVar)) != null && (writableMap = toWritableMap(a2, iMMessage)) != null) {
                    writableNativeArray.pushMap(writableMap);
                }
            }
        }
        return writableNativeArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WritableMap toWritableMap(com.sankuai.waimai.imbase.listener.model.b bVar, IMMessage iMMessage) {
        WritableMap writableMap;
        Object[] objArr = {bVar, iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9e06e4a101054cd35c0f006b365869c", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9e06e4a101054cd35c0f006b365869c");
        }
        if (iMMessage == null || bVar == null) {
            return null;
        }
        try {
            writableMap = Arguments.createMap();
            try {
                writableMap.putInt("unread_count", bVar.d);
                writableMap.putString("send_time", String.valueOf(iMMessage.getCts()));
                writableMap.putString("peer_id", String.valueOf(iMMessage.getChatId()));
                writableMap.putString("brief", bVar.c);
                writableMap.putString("title", bVar.b);
                writableMap.putString("avatar", bVar.e);
                writableMap.putInt("channel_id", iMMessage.getChannel());
                Uri.Builder createScheme = createScheme(iMMessage);
                Map<String, String> map = bVar.g;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        createScheme.appendQueryParameter(entry.getKey(), entry.getValue());
                    }
                }
                createScheme.appendQueryParameter("from", "6");
                createScheme.appendQueryParameter("from_backend_push", "1");
                writableMap.putString("scheme_url", createScheme.toString());
                JSONObject a = bVar.a();
                a.put("extension", iMMessage.getExtension());
                a.put("msg_type", iMMessage.getMsgType());
                a.put("biz_type", t.a(getInquiryId(iMMessage.getExtension())) ? "0" : "1");
                if (iMMessage.getMsgType() == 12) {
                    EventMessage eventMessage = (EventMessage) iMMessage;
                    a.put("event_type", eventMessage.getType());
                    a.put("event_text", eventMessage.getText());
                }
                writableMap.putString("extra", a.toString());
                writableMap.putInt("type", iMMessage.getPeerAppId() == 0 ? 1 : 0);
            } catch (JSONException e) {
                e = e;
                com.dianping.judas.util.a.a(e);
                return writableMap;
            }
        } catch (JSONException e2) {
            e = e2;
            writableMap = null;
        }
        return writableMap;
    }

    private String getInquiryId(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77058981c6ff4146e1ebcfee38d979fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77058981c6ff4146e1ebcfee38d979fa");
        }
        if (t.a(str)) {
            return "";
        }
        try {
            return new JSONObject(str).optString("inquiryId");
        } catch (JSONException e) {
            com.dianping.judas.util.a.a(e);
            return "";
        }
    }

    private Uri.Builder createScheme(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4dc85313307cc1cc141306e2db8d2274", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri.Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4dc85313307cc1cc141306e2db8d2274");
        }
        Uri.Builder buildUpon = Uri.parse(h.n).buildUpon();
        if (iMMessage != null) {
            short channel = iMMessage.getChannel();
            buildUpon.appendPath(String.valueOf((int) channel));
            buildUpon.appendQueryParameter("chatID", String.valueOf(iMMessage.getChatId()));
            buildUpon.appendQueryParameter(Message.PEER_UID, String.valueOf(iMMessage.getPeerUid()));
            buildUpon.appendQueryParameter("category", String.valueOf(iMMessage.getCategory()));
            buildUpon.appendQueryParameter(Message.PEER_APPID, String.valueOf((int) iMMessage.getPeerAppId()));
            if (channel == 1024) {
                buildUpon.appendQueryParameter("sourcePage", "3");
                buildUpon.appendQueryParameter("pageSource", Constant.TRANS_TYPE_LOAD);
            }
        }
        return buildUpon;
    }

    @ReactMethod
    public void registerReceiveMessageListener(final String str, Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa12e10d92ba06d3a7a7c493600e692a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa12e10d92ba06d3a7a7c493600e692a");
            return;
        }
        if (this.mMessageListener == null) {
            this.mMessageListener = new IMClient.i() { // from class: com.sankuai.waimai.store.mrn.SGMRNIMModule.8
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.IMClient.i
                public final void a(List<IMMessage> list, boolean z) {
                    IMMessage iMMessage;
                    Object[] objArr2 = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8e167efc24162c00a45decfd4054a299", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8e167efc24162c00a45decfd4054a299");
                        return;
                    }
                    com.meituan.android.ptcommonim.base.manager.d.a(list, z, PTIMCommonBean.UserType.TYPE_C);
                    String str2 = str;
                    if (com.sankuai.shangou.stone.util.a.a((List) list) > 0 && (iMMessage = list.get(0)) != null && iMMessage.getChannel() > 0) {
                        str2 = String.valueOf((int) iMMessage.getChannel());
                    }
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString(RemoteMessageConst.Notification.CHANNEL_ID, str2);
                    com.sankuai.waimai.store.mrn.shopcartbridge.a.a(SGMRNIMModule.this.getReactApplicationContext(), "ChatUpdatedNotification", createMap);
                }
            };
        }
        IMClient.a().a((short) r.a(str, 0), this.mMessageListener);
        successResult(promise);
    }

    @ReactMethod
    public void unregisterReceiveMessageListener(String str, Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91a20930bd4e407c9a0b98308d16df91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91a20930bd4e407c9a0b98308d16df91");
        } else if (this.mMessageListener != null) {
            IMClient.a().b((short) r.a(str, 0), this.mMessageListener);
            successResult(promise);
        }
    }

    @ReactMethod
    public void registerIConnectionListener(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "247963b0895d44d2b33ee710d758552a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "247963b0895d44d2b33ee710d758552a");
            return;
        }
        if (this.mConnetListener == null) {
            this.mConnetListener = new IMClient.d() { // from class: com.sankuai.waimai.store.mrn.SGMRNIMModule.9
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.IMClient.d
                public final void a(int i) {
                }

                @Override // com.sankuai.xm.im.IMClient.d
                public final void a(long j, int i) {
                }

                @Override // com.sankuai.xm.im.IMClient.d
                public final void a(com.sankuai.xm.im.connection.b bVar) {
                }

                @Override // com.sankuai.xm.im.IMClient.d
                public final void a(boolean z) {
                }

                @Override // com.sankuai.xm.im.IMClient.d
                public final void a(long j, String str, String str2, String str3) {
                    Object[] objArr2 = {new Long(j), str, str2, str3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7d51703506d9a47f015fc744e316031c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7d51703506d9a47f015fc744e316031c");
                    } else {
                        com.sankuai.waimai.store.mrn.shopcartbridge.a.a(SGMRNIMModule.this.getReactApplicationContext(), "DxConnectedNotification", Arguments.createMap());
                    }
                }
            };
        }
        IMClient.a().a(this.mConnetListener);
        successResult(promise);
    }

    @ReactMethod
    public void unregisterIConnectionListener(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2874cda2a6753578af6304bc067f0cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2874cda2a6753578af6304bc067f0cf");
        } else if (this.mConnetListener != null) {
            IMClient.a().b(this.mConnetListener);
            successResult(promise);
        }
    }

    @ReactMethod
    public void getUnreadByChannel(String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55ef43bbaa277ee950a1cb18e46d7baf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55ef43bbaa277ee950a1cb18e46d7baf");
        } else {
            com.sankuai.waimai.imbase.manager.b.a().a((short) r.a(str, 0), new d.a() { // from class: com.sankuai.waimai.store.mrn.SGMRNIMModule.10
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.imbase.manager.d.a
                public final void a(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "84c0b30aedb347c91777a7206d3e8383", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "84c0b30aedb347c91777a7206d3e8383");
                        return;
                    }
                    WritableMap createMap = Arguments.createMap();
                    createMap.putInt(GroupAnnouncement.GROUP_ANNOUNCEMENT_UNREAD_COUNT, i);
                    promise.resolve(createMap);
                }
            });
        }
    }

    @ReactMethod
    public void registerUnreadMessagesCount(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e61cd398bf7e305151a5f29ee511089", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e61cd398bf7e305151a5f29ee511089");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGMRNIMModule.11
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7ad4472d4da1accbeddf3a9939cddf02", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7ad4472d4da1accbeddf3a9939cddf02");
                        return;
                    }
                    if (SGMRNIMModule.this.mDxWithApiMessageListener == null) {
                        SGMRNIMModule.this.mDxWithApiMessageListener = new com.sankuai.waimai.store.im.number.b() { // from class: com.sankuai.waimai.store.mrn.SGMRNIMModule.11.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.im.number.a
                            public final void a(int i) {
                                Object[] objArr3 = {Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "0465df79cbd952443a70d32e79c29c9d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "0465df79cbd952443a70d32e79c29c9d");
                                    return;
                                }
                                try {
                                    WritableMap createMap = Arguments.createMap();
                                    createMap.putInt("totalUnreadCount", i);
                                    com.sankuai.waimai.store.mrn.shopcartbridge.a.a(SGMRNIMModule.this.getReactApplicationContext(), "didRecieveIMMessage", createMap);
                                } catch (Exception e) {
                                    com.sankuai.waimai.store.base.log.a.a(e);
                                }
                            }
                        };
                        com.sankuai.waimai.store.im.number.d.a().a(SGMRNIMModule.this.mDxWithApiMessageListener);
                    }
                    SGMRNIMModule.this.successResult(promise);
                }
            });
        }
    }

    @ReactMethod
    public void unregisterUnreadMessagesCount(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "882120fc411dcad3dac44c591b318584", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "882120fc411dcad3dac44c591b318584");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGMRNIMModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "321c7220dc7987817c60e16fd6c93345", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "321c7220dc7987817c60e16fd6c93345");
                        return;
                    }
                    if (SGMRNIMModule.this.mDxWithApiMessageListener != null) {
                        com.sankuai.waimai.store.im.number.d.a().b(SGMRNIMModule.this.mDxWithApiMessageListener);
                    }
                    SGMRNIMModule.this.mDxWithApiMessageListener = null;
                    SGMRNIMModule.this.successResult(promise);
                }
            });
        }
    }

    @ReactMethod
    public void getTotalUnreadMessagesCount(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77789d8c0dcc99039dfc80be7f187330", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77789d8c0dcc99039dfc80be7f187330");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGMRNIMModule.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e2d1d34b73cd239bcbaf420745b5abe5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e2d1d34b73cd239bcbaf420745b5abe5");
                    } else {
                        com.sankuai.waimai.store.im.number.d.a().a(new com.sankuai.waimai.store.im.number.b() { // from class: com.sankuai.waimai.store.mrn.SGMRNIMModule.3.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.im.number.a
                            public final void a(int i) {
                                Object[] objArr3 = {Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "72048d265dea3b79abcc9447c6370c0b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "72048d265dea3b79abcc9447c6370c0b");
                                    return;
                                }
                                com.sankuai.waimai.store.im.number.d.a().b(this);
                                try {
                                    WritableMap createMap = Arguments.createMap();
                                    createMap.putInt("totalUnreadCount", i);
                                    promise.resolve(createMap);
                                } catch (Exception e) {
                                    com.sankuai.waimai.store.base.log.a.a(e);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void successResult(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "007daa42cfcb3731776d2370a57afe9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "007daa42cfcb3731776d2370a57afe9c");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("code", 0);
        createMap.putString("message", "success");
        promise.resolve(createMap);
    }
}
