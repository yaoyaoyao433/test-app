package com.meituan.android.legwork.mrn.bridge;

import android.app.Dialog;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import com.dianping.titans.js.JsHandlerFactory;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.android.legwork.bean.im.IMInitializeData;
import com.meituan.android.legwork.bean.im.RiderImBean;
import com.meituan.android.legwork.net.service.CommonAPIService;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.xm.im.session.SessionId;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class IMPushBridgeModule extends ReactContextBaseJavaModule {
    private static final String ACTION_IM_MESSAGE = "legwork:im_message_info";
    private static final String ACTION_PUSH_MESSAGE = "legwork:order_status_change";
    private static final String DATA_ICON_SHOW = "iconShow";
    private static final String DATA_UNREAD_MESSAGE_COUNT = "unReadMessage";
    private static final int ICON_SHOW_TYPE_HIDE = 2;
    private static final int ICON_SHOW_TYPE_SHOW = 1;
    private static final int ICON_SHOW_TYPE_UNKNOWN = 0;
    private static final int LIFE_STATE_CREATE = 0;
    private static final int LIFE_STATE_DESTROY = 1;
    private static final String ORDER_STATUS = "order_status";
    public static ChangeQuickRedirect changeQuickRedirect;
    private rx.subscriptions.b mCompositeSubscription;
    private Map<String, Boolean> mOrderMap;
    private long mPeerId;
    private Dialog progressDialog;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "BMLWIMPushModule";
    }

    public IMPushBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5abd1a9d0032b635da9ce5cf0f610bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5abd1a9d0032b635da9ce5cf0f610bb");
        } else {
            this.mOrderMap = new HashMap();
        }
    }

    public static /* synthetic */ void lambda$lifecycleCallback$29(IMPushBridgeModule iMPushBridgeModule, String str, com.meituan.android.legwork.common.bus.event.b bVar) {
        Object[] objArr = {iMPushBridgeModule, str, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "57829a5e375a79ccb22b99addc6689aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "57829a5e375a79ccb22b99addc6689aa");
        } else {
            iMPushBridgeModule.getRiderImId(str);
        }
    }

    public static /* synthetic */ void lambda$lifecycleCallback$30(IMPushBridgeModule iMPushBridgeModule, com.meituan.android.legwork.common.bus.event.a aVar) {
        com.sankuai.xm.im.session.entry.a aVar2;
        Object[] objArr = {iMPushBridgeModule, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c8ba20ad62c9df14baca1c035e10c309", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c8ba20ad62c9df14baca1c035e10c309");
            return;
        }
        List<com.sankuai.xm.im.session.entry.a> list = aVar.a;
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<com.sankuai.xm.im.session.entry.a> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar2 = null;
                break;
            }
            aVar2 = it.next();
            if (aVar2 != null && aVar2.a() != null && iMPushBridgeModule.mPeerId == SessionId.a(aVar2.a()).b()) {
                break;
            }
        }
        if (aVar2 == null) {
            return;
        }
        iMPushBridgeModule.sendIMEventToMRN(aVar2.b(), 0);
    }

    @ReactMethod
    public void lifecycleCallback(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0e462a8028d0ec99019dca704da8dee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0e462a8028d0ec99019dca704da8dee");
            return;
        }
        switch (i) {
            case 0:
                rx.d a = com.meituan.android.legwork.common.bus.a.a().a(com.meituan.android.legwork.common.bus.event.b.class);
                Object[] objArr2 = {this, str};
                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                addSubscription(a.c(PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "b0f175eff5fc5325cb7a793b0ad65acd", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "b0f175eff5fc5325cb7a793b0ad65acd") : new d(this, str)));
                rx.d a2 = com.meituan.android.legwork.common.bus.a.a().a(com.meituan.android.legwork.common.bus.event.a.class);
                Object[] objArr3 = {this};
                ChangeQuickRedirect changeQuickRedirect4 = e.a;
                addSubscription(a2.c(PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "35d3f3a19fa2345b35b1c258bbeda173", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.b) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "35d3f3a19fa2345b35b1c258bbeda173") : new e(this)));
                final com.meituan.android.legwork.common.im.f b = com.meituan.android.legwork.common.im.f.b();
                Object[] objArr4 = {(short) 1013};
                ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.legwork.common.im.f.e;
                if (PatchProxy.isSupport(objArr4, b, changeQuickRedirect5, false, "a7d5bc6c8f8302dd2cc0922ce4b99e63", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, b, changeQuickRedirect5, false, "a7d5bc6c8f8302dd2cc0922ce4b99e63");
                    return;
                }
                if (b.f != null) {
                    b.a((short) 1013);
                }
                b.f = new d.InterfaceC0965d() { // from class: com.meituan.android.legwork.common.im.f.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.imbase.manager.d.InterfaceC0965d
                    public final void b(List<com.sankuai.xm.im.session.entry.a> list) {
                    }

                    @Override // com.sankuai.waimai.imbase.manager.d.InterfaceC0965d
                    public final void a(List<com.sankuai.xm.im.session.entry.a> list) {
                        Object[] objArr5 = {list};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "8adce994be62e90c6a4e306cc41b22a2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "8adce994be62e90c6a4e306cc41b22a2");
                        } else if (list == null || list.size() == 0) {
                        } else {
                            com.meituan.android.legwork.common.bus.a.a().a(new com.meituan.android.legwork.common.bus.event.a(list));
                        }
                    }
                };
                com.sankuai.waimai.imbase.manager.b.a().a((short) 1013, b.f);
                return;
            case 1:
                com.meituan.android.legwork.common.im.f.b().a((short) 1013);
                this.mPeerId = 0L;
                this.mOrderMap.remove(str);
                if (this.mCompositeSubscription == null || this.mCompositeSubscription.isUnsubscribed()) {
                    return;
                }
                this.mCompositeSubscription.a();
                return;
            default:
                return;
        }
    }

    @ReactMethod
    public void startIMChatPage(final String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5e973dfc62dd0493d4926b690c77de8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5e973dfc62dd0493d4926b690c77de8");
            return;
        }
        showProgressDialog();
        addSubscription(rx.d.a(new com.meituan.android.legwork.net.subscriber.a<IMInitializeData>() { // from class: com.meituan.android.legwork.mrn.bridge.IMPushBridgeModule.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.legwork.net.subscriber.a
            public final /* synthetic */ void a(IMInitializeData iMInitializeData) {
                IMInitializeData iMInitializeData2 = iMInitializeData;
                Object[] objArr2 = {iMInitializeData2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "06c9f65bdee06238a33a7fd6cd058dea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "06c9f65bdee06238a33a7fd6cd058dea");
                    return;
                }
                IMPushBridgeModule.this.dismissProgressDialog();
                if (iMInitializeData2 == null) {
                    a(false, 1, "数据异常，请重试");
                    return;
                }
                iMInitializeData2.orderId = str;
                int a2 = com.meituan.android.legwork.common.im.f.b().a(IMPushBridgeModule.this.getCurrentActivity(), iMInitializeData2);
                if (a2 == -1) {
                    promise.reject("-1", "聊天页面打开失败,请重试");
                } else {
                    promise.resolve(String.valueOf(a2));
                }
            }

            @Override // com.meituan.android.legwork.net.subscriber.a
            public final void a(boolean z, int i, String str2) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9a28df262858fab03ce8a01453e30310", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9a28df262858fab03ce8a01453e30310");
                    return;
                }
                IMPushBridgeModule.this.dismissProgressDialog();
                if (z) {
                    promise.reject(String.valueOf(i), "网络异常,请稍后重试");
                } else {
                    promise.reject(String.valueOf(i), str2);
                }
            }
        }, ((CommonAPIService) com.meituan.android.legwork.net.manager.a.a().a(CommonAPIService.class)).getInitializeData(str).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a())));
    }

    @ReactMethod
    public void updateRiderIMInfo(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33ffaa714a0e1bf09994c30efdfe9893", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33ffaa714a0e1bf09994c30efdfe9893");
            return;
        }
        this.mOrderMap.put(str, Boolean.valueOf(z));
        getRiderImId(str);
    }

    private void getRiderImId(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9ef39cbfcc99c3a75db7821c3858c94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9ef39cbfcc99c3a75db7821c3858c94");
        } else if (com.meituan.android.legwork.common.im.f.b().a()) {
            addSubscription(rx.d.a(new com.meituan.android.legwork.net.subscriber.a<RiderImBean>() { // from class: com.meituan.android.legwork.mrn.bridge.IMPushBridgeModule.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.legwork.net.subscriber.a
                public final /* synthetic */ void a(RiderImBean riderImBean) {
                    RiderImBean riderImBean2 = riderImBean;
                    Object[] objArr2 = {riderImBean2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7081fa0e73f8a2f1939d2077f0e0b8f3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7081fa0e73f8a2f1939d2077f0e0b8f3");
                    } else if (riderImBean2 == null || !riderImBean2.areaSupport) {
                        IMPushBridgeModule.this.sendIMEventToMRN(0, 2);
                    } else {
                        com.meituan.android.legwork.common.im.f.b();
                        if (!riderImBean2.peerSupport || riderImBean2.isDegrade == 1) {
                            IMPushBridgeModule.this.sendIMEventToMRN(0, 1);
                            return;
                        }
                        IMPushBridgeModule.this.mPeerId = riderImBean2.peerId;
                        SessionId a2 = SessionId.a(riderImBean2.peerId, 0L, 1, riderImBean2.peerAppId, (short) 1013);
                        com.meituan.android.legwork.common.im.f.b().a(a2, new com.sankuai.xm.im.d<com.sankuai.xm.im.session.entry.a>() { // from class: com.meituan.android.legwork.mrn.bridge.IMPushBridgeModule.2.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.xm.im.d
                            public final /* synthetic */ void b_(com.sankuai.xm.im.session.entry.a aVar) {
                                com.sankuai.xm.im.session.entry.a aVar2 = aVar;
                                Object[] objArr3 = {aVar2};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "b25907fcd8c0143354833c34af8b4c70", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "b25907fcd8c0143354833c34af8b4c70");
                                } else {
                                    IMPushBridgeModule.this.sendIMEventToMRN(aVar2 != null ? aVar2.b() : 0, 1);
                                }
                            }
                        });
                        Boolean bool = (Boolean) IMPushBridgeModule.this.mOrderMap.get(str);
                        if (bool == null || !bool.booleanValue()) {
                            return;
                        }
                        IMPushBridgeModule.this.addSubscription(com.meituan.android.legwork.common.im.f.b().a(str, String.valueOf(IMPushBridgeModule.this.mPeerId), a2));
                    }
                }

                @Override // com.meituan.android.legwork.net.subscriber.a
                public final void a(boolean z, int i, String str2) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f9e466f1f5342815a1335e62aa8a452f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f9e466f1f5342815a1335e62aa8a452f");
                    } else {
                        IMPushBridgeModule.this.sendIMEventToMRN(0, 2);
                    }
                }
            }, ((CommonAPIService) com.meituan.android.legwork.net.manager.a.a().a(CommonAPIService.class)).getRiderImId(str).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubscription(rx.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a3b35607cfdee4bb7bdda329f9a61f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a3b35607cfdee4bb7bdda329f9a61f4");
            return;
        }
        if (this.mCompositeSubscription == null) {
            this.mCompositeSubscription = new rx.subscriptions.b();
        }
        this.mCompositeSubscription.a(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendIMEventToMRN(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7521fade70f517f2f862e558ca15da1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7521fade70f517f2f862e558ca15da1d");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", ACTION_IM_MESSAGE);
            jSONObject.put(DATA_UNREAD_MESSAGE_COUNT, i);
            jSONObject.put(DATA_ICON_SHOW, i2);
            JsHandlerFactory.publish(jSONObject);
        } catch (Exception e) {
            x.e("IMPushBridgeModule.sendIMEventToMRN()", "发送IM数据失败, exception msg:", e);
            x.a(e);
        }
    }

    private void showProgressDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "618b827eb02d97e28b36ed7f2e26bc18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "618b827eb02d97e28b36ed7f2e26bc18");
        } else if (getCurrentActivity() instanceof FragmentActivity) {
            getCurrentActivity().runOnUiThread(f.a(this));
        }
    }

    public static /* synthetic */ void lambda$showProgressDialog$31(IMPushBridgeModule iMPushBridgeModule) {
        Object[] objArr = {iMPushBridgeModule};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "99d9a435da3850bd5cd448b8715917a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "99d9a435da3850bd5cd448b8715917a4");
        } else if (iMPushBridgeModule.getCurrentActivity() instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) iMPushBridgeModule.getCurrentActivity();
            if (iMPushBridgeModule.progressDialog == null) {
                iMPushBridgeModule.progressDialog = new Dialog(fragmentActivity, R.style.legwork_loading_progress);
                iMPushBridgeModule.progressDialog.setContentView(R.layout.legwork_loading_flower);
                iMPushBridgeModule.progressDialog.setCancelable(false);
            }
            try {
                if (fragmentActivity.isFinishing() || iMPushBridgeModule.progressDialog.isShowing()) {
                    return;
                }
                iMPushBridgeModule.progressDialog.show();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissProgressDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb54ed96691cb7985bde46c2042844af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb54ed96691cb7985bde46c2042844af");
        } else if (getCurrentActivity() == null) {
        } else {
            getCurrentActivity().runOnUiThread(g.a(this));
        }
    }

    public static /* synthetic */ void lambda$dismissProgressDialog$32(IMPushBridgeModule iMPushBridgeModule) {
        Object[] objArr = {iMPushBridgeModule};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8fca0a1fcefeee5915b3e7efb7511826", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8fca0a1fcefeee5915b3e7efb7511826");
        } else if (iMPushBridgeModule.progressDialog == null || !iMPushBridgeModule.progressDialog.isShowing()) {
        } else {
            try {
                iMPushBridgeModule.progressDialog.dismiss();
            } catch (Exception unused) {
            }
        }
    }
}
