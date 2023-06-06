package com.sankuai.waimai.bussiness.order.list.rn;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.util.LongSparseArray;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.util.j;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.mrn.engine.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.mads.b;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.im.api.msgcenter.model.UnReadMsgEntity;
import com.sankuai.waimai.business.order.api.detail.network.response.EnvelopeShareTip;
import com.sankuai.waimai.business.order.api.model.c;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import com.sankuai.waimai.bussiness.order.base.feedback.OrderFeedbackFragment;
import com.sankuai.waimai.bussiness.order.base.feedback.i;
import com.sankuai.waimai.bussiness.order.base.pay.payment.PaymentManager;
import com.sankuai.waimai.bussiness.order.base.utils.e;
import com.sankuai.waimai.bussiness.order.detailnew.util.l;
import com.sankuai.waimai.bussiness.order.list.OrderListRNFragment;
import com.sankuai.waimai.bussiness.order.list.dialog.a;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.location.g;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.foundation.router.interfaces.c;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ab;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.imbase.d;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.b;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.domain.manager.home.TabLoadManager;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.platform.widget.dialog.SafeTouchDialog;
import com.sankuai.waimai.reactnative.fragment.WMRNBaseFragment;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class RNOrderListLogicModule extends ReactContextBaseJavaModule implements d {
    public static final String UPDATE_FOOD_SAFETY_UNREAD_COUNT = "updateFoodSafetyUnReadCount";
    public static ChangeQuickRedirect changeQuickRedirect;
    private WeakReference<OrderListRNFragment> mContainerFragmentRef;
    private long mFoodSafetyImGroupId;
    private a mOrderEvaluateDialog;
    private i mOrderFeedBackDialog;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMOrderListModule";
    }

    public RNOrderListLogicModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "845fbff529c6a4c03f193186b6298dff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "845fbff529c6a4c03f193186b6298dff");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OrderListRNFragment getContainerFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "921b347d84d819025bfea13c993862c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderListRNFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "921b347d84d819025bfea13c993862c4");
        }
        if (this.mContainerFragmentRef != null && this.mContainerFragmentRef.get() != null) {
            return this.mContainerFragmentRef.get();
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity instanceof FragmentActivity) {
            Fragment findFragmentByTag = ((FragmentActivity) currentActivity).getSupportFragmentManager().findFragmentByTag("3");
            if (findFragmentByTag instanceof OrderListRNFragment) {
                OrderListRNFragment orderListRNFragment = (OrderListRNFragment) findFragmentByTag;
                this.mContainerFragmentRef = new WeakReference<>(orderListRNFragment);
                return orderListRNFragment;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPageInfoKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57559ed9be3920e0bb7be5dd4782d180", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57559ed9be3920e0bb7be5dd4782d180");
        }
        OrderListRNFragment containerFragment = getContainerFragment();
        if (containerFragment == null) {
            return AppUtil.generatePageInfoKey(this);
        }
        return containerFragment.b;
    }

    @ReactMethod
    public void getInitProperty(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d98cc09fed3d3a7ddbb3735d43ed90b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d98cc09fed3d3a7ddbb3735d43ed90b2");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        int a = f.a(currentActivity.getIntent(), "source", 0);
        boolean a2 = com.sankuai.waimai.platform.domain.manager.user.a.i().a();
        String a3 = ListIDHelper.a.a.a();
        try {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("source", a);
            createMap.putBoolean("userAvailable", a2);
            createMap.putString("rankListID", a3);
            createMap.putString("pageInfoKey", getPageInfoKey());
            createMap.putMap("pvLog", getPvParams());
            createMap.putString("orderH5Env", com.sankuai.waimai.platform.capacity.abtest.f.b());
            createMap.putString("refundstatus", com.sankuai.waimai.platform.capacity.abtest.f.a(currentActivity, "order_h5_refundstatus_android") ? "1" : "0");
            createMap.putString("payByAnother", com.sankuai.waimai.platform.capacity.abtest.f.a(currentActivity, "order_h5_pay_by_friend_android") ? "1" : "0");
            promise.resolve(createMap);
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    private WritableMap getPvParams() {
        long j;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f170288e22862edbdda7c1ef9253568", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f170288e22862edbdda7c1ef9253568");
        }
        double[] e = g.e();
        long j2 = 0;
        if (e != null) {
            Double valueOf = Double.valueOf(e[0]);
            Double valueOf2 = Double.valueOf(e[1]);
            j2 = (long) (valueOf.doubleValue() * 1000000.0d);
            j = (long) (valueOf2.doubleValue() * 1000000.0d);
        } else {
            j = 0;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(Constants.PRIVACY.KEY_LATITUDE, j2);
        createMap.putDouble(Constants.PRIVACY.KEY_LONGITUDE, j);
        createMap.putString(Constants.Environment.KEY_PUSHID, b.A().t());
        return createMap;
    }

    @ReactMethod
    public void readMessageCenterInfo(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7394da52c3af396a5371168300f76a85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7394da52c3af396a5371168300f76a85");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        UnReadMsgEntity unReadMsgInfo = com.sankuai.waimai.business.im.api.msgcenter.a.a().getUnReadMsgInfo();
        if (unReadMsgInfo == null) {
            promise.resolve(createMap);
            return;
        }
        createMap.putInt("im_count", com.sankuai.waimai.business.im.api.msgcenter.a.a().getUnReadImCount());
        createMap.putBoolean("show_icon", unReadMsgInfo.showIcon == 1);
        createMap.putInt(RemoteMessageConst.MSGTYPE, unReadMsgInfo.msgType);
        createMap.putInt("unread_count", unReadMsgInfo.unReadCount);
        createMap.putString("h5_url", unReadMsgInfo.h5Url);
        promise.resolve(createMap);
    }

    @ReactMethod
    public void updateTabLoadStatus(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e41702133852ed3d5ae557da680fb619", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e41702133852ed3d5ae557da680fb619");
        } else {
            runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.list.rn.RNOrderListLogicModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "30855b218e3eeac952b70bdedbb79ba0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "30855b218e3eeac952b70bdedbb79ba0");
                    } else {
                        TabLoadManager.a().a(3, z);
                    }
                }
            });
        }
    }

    private void runOnUiThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5258a95195bc3f40d754332421147e55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5258a95195bc3f40d754332421147e55");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        currentActivity.runOnUiThread(runnable);
    }

    @ReactMethod
    public void endLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c7509edd9c442cfe97436a24b06ddb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c7509edd9c442cfe97436a24b06ddb6");
        } else {
            runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.list.rn.RNOrderListLogicModule.11
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97c1f1db90d5831138783d65d5bbf2e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97c1f1db90d5831138783d65d5bbf2e1");
        } else {
            super.onCatalystInstanceDestroy();
        }
    }

    public void onVisibilityChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ca71bdd1bf22ccc2e9e353e92bf3a18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ca71bdd1bf22ccc2e9e353e92bf3a18");
        } else if (z) {
            if (this.mOrderEvaluateDialog != null) {
                showOrderUGCDialogIfNeeded(this.mOrderEvaluateDialog.b);
            }
            if (this.mOrderFeedBackDialog != null) {
                showOrderFeedbackDialogIfNeeded(this.mOrderFeedBackDialog.b);
            }
        }
    }

    public <T> T fromJson(String str, Class<T> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "688f96f2de9e3c8a97681715aa519c73", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "688f96f2de9e3c8a97681715aa519c73");
        }
        try {
            return (T) k.a().fromJson(str, (Class<Object>) cls);
        } catch (Exception unused) {
            return null;
        }
    }

    @ReactMethod
    public void payOrderAction(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21eb08b6d6cfd97b69c89ea26848b1a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21eb08b6d6cfd97b69c89ea26848b1a4");
            return;
        }
        int i = readableMap.hasKey("bizType") ? readableMap.getInt("bizType") : 0;
        String string = readableMap.hasKey(Constants.EventConstants.KEY_ORDER_ID) ? readableMap.getString(Constants.EventConstants.KEY_ORDER_ID) : "";
        if (readableMap.hasKey("poiId")) {
            NumberUtils.parseLong(readableMap.getString("poiId"), 0L);
        }
        final String b = readableMap.hasKey("poiIdStr") ? com.sankuai.waimai.bussiness.order.base.utils.i.b(readableMap.getString("poiIdStr")) : "";
        final Activity currentActivity = getCurrentActivity();
        final com.sankuai.waimai.bussiness.order.list.a aVar = new com.sankuai.waimai.bussiness.order.list.a() { // from class: com.sankuai.waimai.bussiness.order.list.rn.RNOrderListLogicModule.12
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.list.a
            public final void a(String str, String str2, String str3, String str4, int i2) {
                Object[] objArr2 = {str, str2, str3, str4, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "83d03e1fd92dec9e45517598113b49ee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "83d03e1fd92dec9e45517598113b49ee");
                    return;
                }
                OrderListRNFragment containerFragment = RNOrderListLogicModule.this.getContainerFragment();
                if (containerFragment != null) {
                    Object[] objArr3 = {str, str2, str3, str4, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect4 = OrderListRNFragment.a;
                    if (PatchProxy.isSupport(objArr3, containerFragment, changeQuickRedirect4, false, "8f283a7b24de24629ffda4e639ec1bee", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, containerFragment, changeQuickRedirect4, false, "8f283a7b24de24629ffda4e639ec1bee");
                        return;
                    }
                    containerFragment.g = str;
                    containerFragment.c = str4;
                    containerFragment.h = str2;
                    if (((WMRNBaseFragment) containerFragment).j != null) {
                        if (i2 == 3) {
                            containerFragment.a(111, -1);
                        } else {
                            com.sankuai.waimai.platform.capacity.pay.a.a(((WMRNBaseFragment) containerFragment).j, 111, str2, str3);
                        }
                    }
                }
            }
        };
        Object[] objArr2 = {currentActivity, Integer.valueOf(i), string, b, "OrderListRNFagment", aVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.list.helper.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "54c4e5462249cb9c542bedd51de3cc2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "54c4e5462249cb9c542bedd51de3cc2c");
            return;
        }
        String e = com.sankuai.waimai.platform.domain.manager.user.a.i().e();
        String f = com.sankuai.waimai.platform.domain.manager.user.a.i().f();
        if (TextUtils.isEmpty(e)) {
            ae.a(currentActivity, (int) R.string.wm_order_base_login_before_pay);
            com.sankuai.waimai.platform.domain.manager.user.a.a((Context) currentActivity);
        } else if (TextUtils.isEmpty(f) && !com.sankuai.waimai.foundation.core.a.f()) {
            com.sankuai.waimai.foundation.router.a.a(currentActivity, c.j, (Bundle) null);
        } else if (i == 8) {
            String a = ab.a(currentActivity, (int) R.string.wm_order_list_roll_good_stuff_detail_uri);
            String str = com.sankuai.waimai.foundation.router.interfaces.b.c;
            if (com.sankuai.waimai.foundation.core.a.e()) {
                str = "imeituan://www.meituan.com";
            } else if (com.sankuai.waimai.foundation.core.a.f()) {
                str = "dianping://waimai.dianping.com";
            }
            com.sankuai.waimai.foundation.router.a.a(currentActivity, str + a + string);
        } else {
            e.a(currentActivity);
            PaymentManager.startPay(currentActivity, string, "2", 0, "OrderListRNFagment", "c_48pltlz", new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.order.api.model.d>>() { // from class: com.sankuai.waimai.bussiness.order.list.helper.a.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr3 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "2137f63f5788eb779072a8f6889a64fb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "2137f63f5788eb779072a8f6889a64fb");
                    } else if (baseResponse != null) {
                        Activity activity = currentActivity;
                        String str2 = b;
                        com.sankuai.waimai.bussiness.order.list.a aVar2 = aVar;
                        Object[] objArr4 = {activity, str2, baseResponse, aVar2};
                        ChangeQuickRedirect changeQuickRedirect5 = a.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect5, true, "6b9a72e276ac560ed6a3313952424a9a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect5, true, "6b9a72e276ac560ed6a3313952424a9a");
                        } else if (baseResponse != null) {
                            int i2 = baseResponse.code;
                            if (i2 != 401) {
                                switch (i2) {
                                    case 0:
                                        com.sankuai.waimai.business.order.api.model.d dVar = (com.sankuai.waimai.business.order.api.model.d) baseResponse.data;
                                        if (dVar != null) {
                                            String str3 = dVar.c;
                                            String str4 = dVar.g;
                                            String str5 = dVar.b;
                                            int i3 = dVar.j;
                                            if (aVar2 != null) {
                                                aVar2.a(str2, str3, str4, str5, i3);
                                                return;
                                            }
                                            return;
                                        }
                                        ae.a(activity, (int) R.string.wm_order_base_server_error_cancel_pay);
                                        return;
                                    case 1:
                                        String str6 = baseResponse.msg;
                                        if (TextUtils.isEmpty(str6)) {
                                            ae.a(activity, (int) R.string.wm_order_base_server_error_cancel_pay);
                                            return;
                                        } else {
                                            ae.a(activity, str6);
                                            return;
                                        }
                                    default:
                                        return;
                                }
                            }
                            String str7 = baseResponse.msg;
                            if (TextUtils.isEmpty(str7)) {
                                ae.a(activity, (int) R.string.wm_order_base_invalid_token_login_again);
                            } else {
                                ae.a(activity, str7);
                            }
                        } else {
                            ae.a(activity, (int) R.string.takeout_loading_fail_try_afterwhile);
                        }
                    } else {
                        ae.a(currentActivity, (int) R.string.takeout_loading_fail_try_afterwhile);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr3 = {th};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "7ecc535c2a48c55a5193acc774e3742c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "7ecc535c2a48c55a5193acc774e3742c");
                    } else if (TextUtils.equals(th.getMessage(), IPaymentManager.NO_ACTION)) {
                    } else {
                        if (TextUtils.isEmpty(th.getMessage())) {
                            ae.a(currentActivity, (int) R.string.wm_order_base_net_error);
                        } else {
                            ae.a(currentActivity, th.getMessage());
                        }
                    }
                }

                @Override // com.sankuai.waimai.platform.capacity.network.retrofit.b.AbstractC1042b, rx.e
                public final void onCompleted() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "b4140f1c4d5f028ea8e6968c29e005e0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "b4140f1c4d5f028ea8e6968c29e005e0");
                    } else {
                        e.b(currentActivity);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void contactPoiIMAction(final ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f1cd120a9607640dcf4bc7967b9d1ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f1cd120a9607640dcf4bc7967b9d1ee");
        } else {
            runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.list.rn.RNOrderListLogicModule.13
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x00cd  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 252
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.list.rn.RNOrderListLogicModule.AnonymousClass13.run():void");
                }
            });
        }
    }

    @ReactMethod
    public void refundStatusContactPoiIMAction(final ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c1415b569fcbbda4010eb1c515c519a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c1415b569fcbbda4010eb1c515c519a");
        } else {
            runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.list.rn.RNOrderListLogicModule.14
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "530988195ea940be6f916d13880917d8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "530988195ea940be6f916d13880917d8");
                        return;
                    }
                    long parseLong = readableMap.hasKey(Constants.EventConstants.KEY_ORDER_ID) ? NumberUtils.parseLong(readableMap.getString(Constants.EventConstants.KEY_ORDER_ID), 0L) : 0L;
                    long parseLong2 = readableMap.hasKey("poiId") ? NumberUtils.parseLong(readableMap.getString("poiId"), 0L) : 0L;
                    if (readableMap.hasKey("poiIdStr")) {
                        String string = readableMap.getString("poiId");
                        if (!aa.a(string)) {
                            str = string;
                            com.sankuai.waimai.bussiness.order.list.helper.a.a(RNOrderListLogicModule.this.getCurrentActivity(), parseLong, parseLong2, str, "", 0, 0.0d, "", parseLong, "", "refundstatus");
                        }
                    }
                    str = "";
                    com.sankuai.waimai.bussiness.order.list.helper.a.a(RNOrderListLogicModule.this.getCurrentActivity(), parseLong, parseLong2, str, "", 0, 0.0d, "", parseLong, "", "refundstatus");
                }
            });
        }
    }

    @ReactMethod
    public void contactFoodSafetyIMAction(final ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7d5b28eeabef98e20b4cd4756dc4b33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7d5b28eeabef98e20b4cd4756dc4b33");
        } else {
            runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.list.rn.RNOrderListLogicModule.15
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0c2460b976376bbd579aaf5ae9a3949f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0c2460b976376bbd579aaf5ae9a3949f");
                        return;
                    }
                    long parseLong = readableMap.hasKey("groupId") ? NumberUtils.parseLong(readableMap.getString("groupId"), 0L) : 0L;
                    int i = readableMap.hasKey("groupType") ? readableMap.getInt("groupType") : 0;
                    Activity currentActivity = RNOrderListLogicModule.this.getCurrentActivity();
                    Object[] objArr3 = {currentActivity, 4, new Long(parseLong), Integer.valueOf(i), "refundstatus"};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.list.helper.a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "c55c8143b8dfcea1e84da82e0729c7ef", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "c55c8143b8dfcea1e84da82e0729c7ef");
                    } else {
                        com.sankuai.waimai.bussiness.order.list.helper.a.a(currentActivity, 4, parseLong, i, "refundstatus", 0);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void getFoodSafetyImUnReadCount(ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa5390039c4ba26559f2cedcc2cb3c3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa5390039c4ba26559f2cedcc2cb3c3e");
            return;
        }
        try {
            com.sankuai.waimai.bussiness.order.detailnew.im.a.b(readableMap.hasKey("groupId") ? NumberUtils.parseLong(readableMap.getString("groupId"), 0L) : 0L, (short) 0, "im-group", new d.a() { // from class: com.sankuai.waimai.bussiness.order.list.rn.RNOrderListLogicModule.16
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.imbase.manager.d.a
                public final void a(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "62f99bd68d286b2086dc72a56c7d25b6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "62f99bd68d286b2086dc72a56c7d25b6");
                    } else {
                        promise.resolve(Integer.valueOf(i));
                    }
                }
            });
        } catch (Throwable unused) {
            promise.reject("", "");
        }
    }

    @ReactMethod
    public void registerUnReadCountObserver(final ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5f88e1871d90a19eefe97ee5518016a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5f88e1871d90a19eefe97ee5518016a");
        } else {
            runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.list.rn.RNOrderListLogicModule.17
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "48f549d77f21d92e31353b9f2a7e31ce", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "48f549d77f21d92e31353b9f2a7e31ce");
                        return;
                    }
                    if (readableMap.hasKey("groupId")) {
                        RNOrderListLogicModule.this.mFoodSafetyImGroupId = NumberUtils.parseLong(readableMap.getString("groupId"), 0L);
                    }
                    com.sankuai.waimai.imbase.manager.e.a().a(RNOrderListLogicModule.this);
                }
            });
        }
    }

    @ReactMethod
    public void unRegisterUnReadCountObserver() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e48d185c5693f68be9e669f510a6406", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e48d185c5693f68be9e669f510a6406");
        } else {
            runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.list.rn.RNOrderListLogicModule.18
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d059944e980f846fe4432dbf69a6a968", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d059944e980f846fe4432dbf69a6a968");
                        return;
                    }
                    com.sankuai.waimai.imbase.manager.e.a().b(RNOrderListLogicModule.this);
                    RNOrderListLogicModule.this.mFoodSafetyImGroupId = 0L;
                }
            });
        }
    }

    @Override // com.sankuai.waimai.imbase.d
    public void updateUnReadCount(@NonNull LongSparseArray<Integer> longSparseArray) {
        Object[] objArr = {longSparseArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f42a61d64bad19b9ae326aa1ed815321", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f42a61d64bad19b9ae326aa1ed815321");
        } else if (this.mFoodSafetyImGroupId != 0) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("count", com.sankuai.waimai.bussiness.order.detailnew.util.a.a(longSparseArray.get(this.mFoodSafetyImGroupId)));
            if (getReactApplicationContext() != null) {
                try {
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(UPDATE_FOOD_SAFETY_UNREAD_COUNT, createMap);
                } catch (Exception unused) {
                }
            }
        }
    }

    @ReactMethod
    public void complainRiderProgressAction(final ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "442a448843d8da79b7e3f68ac138be81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "442a448843d8da79b7e3f68ac138be81");
        } else {
            runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.list.rn.RNOrderListLogicModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Map map;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "95d8394077a250e52840e9c018b6b80a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "95d8394077a250e52840e9c018b6b80a");
                        return;
                    }
                    String string = readableMap.hasKey(Constants.EventConstants.KEY_ORDER_ID) ? readableMap.getString(Constants.EventConstants.KEY_ORDER_ID) : "";
                    String string2 = readableMap.hasKey("clickUrl") ? readableMap.getString("clickUrl") : "";
                    Activity currentActivity = RNOrderListLogicModule.this.getCurrentActivity();
                    Object[] objArr3 = {currentActivity, string, string2};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.list.helper.a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "21e97d7adfa2fd5e0d9e9efee202553c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "21e97d7adfa2fd5e0d9e9efee202553c");
                    } else if (TextUtils.isEmpty(string2)) {
                    } else {
                        Object[] objArr4 = {currentActivity, string};
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.bussiness.order.list.helper.a.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect5, true, "e7318372036e73fcba78ccf8862f58ff", RobustBitConfig.DEFAULT_VALUE)) {
                            map = (Map) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect5, true, "e7318372036e73fcba78ccf8862f58ff");
                        } else {
                            HashMap hashMap = new HashMap();
                            String e = com.sankuai.waimai.platform.domain.manager.user.a.i().e();
                            if (TextUtils.isEmpty(e)) {
                                e = "0";
                            }
                            hashMap.put("accessToken", e);
                            hashMap.put("sysName", com.sankuai.waimai.platform.b.A().o());
                            hashMap.put("sysVer", Build.VERSION.RELEASE);
                            hashMap.put("appName", currentActivity.getString(R.string.app_name));
                            hashMap.put("appVer", com.sankuai.waimai.platform.b.A().i());
                            City n = com.sankuai.waimai.foundation.location.v2.g.a().n();
                            String cityName = n == null ? "" : n.getCityName();
                            String cityCode = n == null ? "" : n.getCityCode();
                            hashMap.put("locCity", String.valueOf(cityCode + CommonConstant.Symbol.UNDERLINE + cityName));
                            hashMap.put("referId", string);
                            map = hashMap;
                        }
                        com.sankuai.waimai.foundation.router.a.a(currentActivity, string2, map);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void confirmReceiveAction(final ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "961288cb5b5cd1a9ad8cb9b9438116b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "961288cb5b5cd1a9ad8cb9b9438116b2");
        } else {
            runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.list.rn.RNOrderListLogicModule.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a0e4bad179d464ce970ad66def252c71", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a0e4bad179d464ce970ad66def252c71");
                        return;
                    }
                    String string = readableMap.hasKey(Constants.EventConstants.KEY_ORDER_ID) ? readableMap.getString(Constants.EventConstants.KEY_ORDER_ID) : "";
                    long parseLong = readableMap.hasKey("poiId") ? NumberUtils.parseLong(readableMap.getString("poiId"), 0L) : 0L;
                    String string2 = readableMap.hasKey("poiIdStr") ? readableMap.getString("poiId") : "";
                    int i = readableMap.hasKey("businessType") ? readableMap.getInt("businessType") : 0;
                    String string3 = readableMap.hasKey("poiPic") ? readableMap.getString("poiPic") : "";
                    Activity currentActivity = RNOrderListLogicModule.this.getCurrentActivity();
                    Object[] objArr3 = {currentActivity, string, new Long(parseLong), string2, Integer.valueOf(i), string3, "OrderListRNFagment"};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.list.helper.a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "d1dd3222942a6e54e2716d31aefeb778", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "d1dd3222942a6e54e2716d31aefeb778");
                        return;
                    }
                    boolean z = i == 1;
                    StringBuilder sb = new StringBuilder();
                    sb.append(parseLong);
                    com.sankuai.waimai.bussiness.order.base.utils.i.a(currentActivity, "OrderListRNFagment", string, z, string3, sb.toString(), string2);
                }
            });
        }
    }

    @ReactMethod
    public void showShareCouponAlert(final String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc20b348bbe069cb9e01b669cf595b76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc20b348bbe069cb9e01b669cf595b76");
        } else if (getCurrentActivity() == null) {
        } else {
            final EnvelopeShareTip envelopeShareTip = (EnvelopeShareTip) fromJson(str2, EnvelopeShareTip.class);
            runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.list.rn.RNOrderListLogicModule.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a4a3a0a164161d797a0660a192588ad8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a4a3a0a164161d797a0660a192588ad8");
                    } else {
                        RNOrderListLogicModule.this.showRedPacketDialog(str, envelopeShareTip);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public void showRedPacketDialog(String str, final EnvelopeShareTip envelopeShareTip) {
        Object[] objArr = {str, envelopeShareTip};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d067cc3c523ba0bf04673c87d2c1872", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d067cc3c523ba0bf04673c87d2c1872");
            return;
        }
        final Activity currentActivity = getCurrentActivity();
        l.a(currentActivity, envelopeShareTip, null, str, false, new l.e() { // from class: com.sankuai.waimai.bussiness.order.list.rn.RNOrderListLogicModule.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.detailnew.util.l.e
            public final void a(int[] iArr, String str2) {
            }

            @Override // com.sankuai.waimai.bussiness.order.detailnew.util.l.e
            public final void a(boolean z, EnvelopeShareTip envelopeShareTip2, String str2) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), envelopeShareTip2, str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "323e236dba5d095f21a472f3c0d5be65", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "323e236dba5d095f21a472f3c0d5be65");
                } else if (z) {
                    l.a(currentActivity, str2, envelopeShareTip, "c_48pltlz", null);
                }
            }
        }, null);
    }

    @ReactMethod
    public void showLeadCommentAlert(String str) {
        final com.sankuai.waimai.business.order.api.detail.network.response.a aVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1547f498c11b342c0af1a153c0d9a9b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1547f498c11b342c0af1a153c0d9a9b1");
        } else if (getCurrentActivity() == null || (aVar = (com.sankuai.waimai.business.order.api.detail.network.response.a) fromJson(str, com.sankuai.waimai.business.order.api.detail.network.response.a.class)) == null) {
        } else {
            runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.list.rn.RNOrderListLogicModule.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a1ed0d02f31ff0042216232f35d5fe62", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a1ed0d02f31ff0042216232f35d5fe62");
                        return;
                    }
                    RNOrderListLogicModule.this.initOrderEvaluateDialog();
                    OrderListRNFragment containerFragment = RNOrderListLogicModule.this.getContainerFragment();
                    if (containerFragment == null || !((WMRNBaseFragment) containerFragment).l) {
                        RNOrderListLogicModule.this.mOrderEvaluateDialog.b = aVar;
                        return;
                    }
                    RNOrderListLogicModule.this.showOrderUGCDialogIfNeeded(aVar);
                }
            });
        }
    }

    @ReactMethod
    public void showRooAlertDialog(final String str, final String str2, final String str3, final String str4, final Promise promise) {
        Object[] objArr = {str, str2, str3, str4, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78e606e36ba3064a906f10f84305105e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78e606e36ba3064a906f10f84305105e");
            return;
        }
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.list.rn.RNOrderListLogicModule.7
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "95b324cae37a29ed789f99f08d924d18", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "95b324cae37a29ed789f99f08d924d18");
                    return;
                }
                RooAlertDialog.a aVar = new RooAlertDialog.a(new ContextThemeWrapper(currentActivity, 2131558957));
                aVar.a(str4, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.list.rn.RNOrderListLogicModule.7.1
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "1f077a77247481119335a04661fa886c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "1f077a77247481119335a04661fa886c");
                        } else {
                            promise.resolve(1);
                        }
                    }
                }).a(false);
                if (!TextUtils.isEmpty(str)) {
                    aVar.a(str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    aVar.b(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    aVar.b(str3, (DialogInterface.OnClickListener) null);
                }
                aVar.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initOrderEvaluateDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "281daec93d78e0b0eafe1150a1070bcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "281daec93d78e0b0eafe1150a1070bcf");
        } else if (this.mOrderEvaluateDialog == null) {
            this.mOrderEvaluateDialog = new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showOrderUGCDialogIfNeeded(final com.sankuai.waimai.business.order.api.detail.network.response.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "225c54886e161ec281c07a659dddcc7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "225c54886e161ec281c07a659dddcc7e");
            return;
        }
        this.mOrderEvaluateDialog.b = null;
        this.mOrderEvaluateDialog.c = getPageInfoKey();
        final a aVar2 = this.mOrderEvaluateDialog;
        final Activity currentActivity = getCurrentActivity();
        Object[] objArr2 = {currentActivity, aVar};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect3, false, "514bf75d8079cf57f63184ea144f1148", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect3, false, "514bf75d8079cf57f63184ea144f1148");
        } else if (currentActivity == null || aVar == null || aVar.b != 1) {
        } else {
            View inflate = LayoutInflater.from(currentActivity).inflate(R.layout.wm_order_list_ugc_dialog, (ViewGroup) null);
            final SafeTouchDialog safeTouchDialog = new SafeTouchDialog(currentActivity, R.style.dialog);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.wm_order_list_ugc_popup_image);
            TextView textView = (TextView) inflate.findViewById(R.id.wm_order_list_ugc_popup_submit);
            ImageView imageView2 = (ImageView) inflate.findViewById(R.id.wm_order_list_ugc_popup_close);
            ((TextView) inflate.findViewById(R.id.wm_order_list_ugc_popup_title)).setText(aVar.f);
            ((TextView) inflate.findViewById(R.id.wm_order_list_ugc_popup_name)).setText(aVar.h);
            ((TextView) inflate.findViewById(R.id.wm_order_list_ugc_popup_time)).setText(aVar.i);
            textView.setText(aVar.j);
            if (!TextUtils.isEmpty(aVar.g)) {
                b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a.b = currentActivity;
                a.c = aVar.g;
                a.i = R.drawable.wm_common_default_poi_circle;
                a.f = ImageQualityUtil.b();
                a.a(imageView);
            } else {
                imageView.setImageResource(R.drawable.wm_common_default_poi_circle);
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.list.dialog.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str;
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "e123b5ae9c47c608e9431a125b922047", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "e123b5ae9c47c608e9431a125b922047");
                        return;
                    }
                    safeTouchDialog.dismiss();
                    Activity activity = currentActivity;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect5, true, "d66295ed4a685066a3f7e0304d696c2d", RobustBitConfig.DEFAULT_VALUE)) {
                        str = (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect5, true, "d66295ed4a685066a3f7e0304d696c2d");
                    } else {
                        str = OrderListRNFragment.class.getSimpleName() + System.currentTimeMillis();
                    }
                    com.sankuai.waimai.bussiness.order.base.utils.i.b(activity, str, String.valueOf(aVar.c), String.valueOf(aVar.d), aVar.e);
                    JudasManualManager.a a2 = JudasManualManager.a("b_waimai_9ezhqgu5_mc").a("order_id", aVar.c).a("money", aVar.k).a("c_48pltlz");
                    a2.b = aVar2.c;
                    a2.a();
                }
            });
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.list.dialog.a.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "8ab5dc558c985a98a982fa3cbb064e5f", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "8ab5dc558c985a98a982fa3cbb064e5f");
                        return;
                    }
                    safeTouchDialog.dismiss();
                    JudasManualManager.a a2 = JudasManualManager.a("b_waimai_9hclse6m_mc").a("order_id", aVar.c).a("money", aVar.k).a("c_48pltlz");
                    a2.b = aVar2.c;
                    a2.a();
                }
            });
            safeTouchDialog.setContentView(inflate);
            safeTouchDialog.setCanceledOnTouchOutside(true);
            Window window = safeTouchDialog.getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = j.a(safeTouchDialog.getContext()) - j.a(currentActivity, 65.0f);
                window.setAttributes(attributes);
                safeTouchDialog.show();
                JudasManualManager.a a2 = JudasManualManager.b("b_waimai_l37o94vk_mv").a("order_id", aVar.c).a("money", aVar.k).a("c_48pltlz");
                a2.b = aVar2.c;
                a2.a();
            }
        }
    }

    @ReactMethod
    public void showQuestionnaireAction(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ff7524edb76eebd6e06de16ac64c893", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ff7524edb76eebd6e06de16ac64c893");
        } else {
            dealShowQuestionnaireAction(str, str2, "", str3);
        }
    }

    @ReactMethod
    public void showQuestionAction(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20ac65edf0531e6ec24856e0e6bb8f71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20ac65edf0531e6ec24856e0e6bb8f71");
        } else {
            dealShowQuestionnaireAction(readableMap.hasKey(Constants.EventConstants.KEY_ORDER_ID) ? readableMap.getString(Constants.EventConstants.KEY_ORDER_ID) : "", readableMap.hasKey("poiId") ? readableMap.getString("poiId") : "", readableMap.hasKey("poiIdStr") ? readableMap.getString("poiIdStr") : "", readableMap.hasKey("feedbackPreviewResult") ? readableMap.getString("feedbackPreviewResult") : "");
        }
    }

    private void dealShowQuestionnaireAction(final String str, final String str2, final String str3, String str4) {
        final com.sankuai.waimai.business.order.api.model.c cVar;
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ef7849e93b15e4f47b04a434211b735", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ef7849e93b15e4f47b04a434211b735");
        } else if (getCurrentActivity() == null || (cVar = (com.sankuai.waimai.business.order.api.model.c) fromJson(str4, com.sankuai.waimai.business.order.api.model.c.class)) == null) {
        } else {
            runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.list.rn.RNOrderListLogicModule.8
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c34251d7d594eed08f36159449b16eed", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c34251d7d594eed08f36159449b16eed");
                        return;
                    }
                    cVar.a = str;
                    cVar.b = NumberUtils.parseLong(str2, 0L);
                    cVar.c = str3;
                    RNOrderListLogicModule.this.initOrderFeedBackDialog();
                    OrderListRNFragment containerFragment = RNOrderListLogicModule.this.getContainerFragment();
                    if (containerFragment == null || !((WMRNBaseFragment) containerFragment).l) {
                        if (containerFragment == null && RNOrderListLogicModule.this.getCurrentActivity() != null && !RNOrderListLogicModule.this.getCurrentActivity().isFinishing()) {
                            RNOrderListLogicModule.this.showOrderFeedbackDialogIfNeeded(cVar);
                        }
                        RNOrderListLogicModule.this.mOrderFeedBackDialog.b = cVar;
                        return;
                    }
                    RNOrderListLogicModule.this.showOrderFeedbackDialogIfNeeded(cVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initOrderFeedBackDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f63e505a3e35b9e3da945255e6515cb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f63e505a3e35b9e3da945255e6515cb7");
        } else if (this.mOrderFeedBackDialog == null) {
            this.mOrderFeedBackDialog = new i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public void showOrderFeedbackDialogIfNeeded(com.sankuai.waimai.business.order.api.model.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6dc7573b8b96658953f6ff12e3239585", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6dc7573b8b96658953f6ff12e3239585");
        } else if (cVar == null) {
        } else {
            this.mOrderFeedBackDialog.b = null;
            this.mOrderFeedBackDialog.c = getPageInfoKey();
            i iVar = this.mOrderFeedBackDialog;
            Activity currentActivity = getCurrentActivity();
            i.a aVar = new i.a() { // from class: com.sankuai.waimai.bussiness.order.list.rn.RNOrderListLogicModule.9
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.bussiness.order.base.feedback.i.a
                public final void a(boolean z, int i, List<c.b> list, String str, long j, String str2) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), list, str, new Long(j), str2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "360ec621f8e8256f8a689a13ed5a267d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "360ec621f8e8256f8a689a13ed5a267d");
                        return;
                    }
                    JudasManualManager.a a2 = JudasManualManager.b("b_waimai_xehl2mgh_mv").a("c_48pltlz");
                    a2.b = RNOrderListLogicModule.this.getPageInfoKey();
                    a2.a();
                }

                @Override // com.sankuai.waimai.bussiness.order.base.feedback.i.a
                public final void a(boolean z, boolean z2, int i) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "828952916d2cb84502fa0f50b43f48f3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "828952916d2cb84502fa0f50b43f48f3");
                        return;
                    }
                    OrderListRNFragment containerFragment = RNOrderListLogicModule.this.getContainerFragment();
                    if (z) {
                        if (containerFragment == null) {
                            if (RNOrderListLogicModule.this.getCurrentActivity() == null || RNOrderListLogicModule.this.getCurrentActivity().isFinishing()) {
                                return;
                            }
                            RNOrderListLogicModule.this.sendMsgToRN("refreshData", null);
                            return;
                        }
                        containerFragment.q();
                    }
                }
            };
            Object[] objArr2 = {currentActivity, (byte) 1, 2, cVar, aVar};
            ChangeQuickRedirect changeQuickRedirect3 = i.a;
            if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect3, false, "abbac4d9d88c754feb8e5bd57e1db822", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect3, false, "abbac4d9d88c754feb8e5bd57e1db822");
                return;
            }
            FragmentManager a = i.a(currentActivity);
            OrderFeedbackFragment a2 = OrderFeedbackFragment.a(true, 2, cVar.a, cVar.b, cVar.c, cVar, i.a(cVar), aVar);
            a2.b = iVar.b(currentActivity);
            a2.a(a, DMKeys.KEY_MIDAS_FEEDBACK);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendMsgToRN(String str, WritableMap writableMap) {
        Object[] objArr = {str, writableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad0c0b551d22c55031fee46114ef4905", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad0c0b551d22c55031fee46114ef4905");
            return;
        }
        try {
            n.a(getReactApplicationContext(), str, writableMap);
        } catch (Exception unused) {
        }
    }

    @ReactMethod
    public void reportDingPingADEvent(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5383fe9143277f6b1e57ffb827c7db7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5383fe9143277f6b1e57ffb827c7db7b");
            return;
        }
        int i = readableMap.hasKey("adType") ? readableMap.getInt("adType") : 0;
        if (i == 0) {
            return;
        }
        int i2 = readableMap.hasKey("actType") ? readableMap.getInt("actType") : 0;
        String string = readableMap.hasKey("eventId") ? readableMap.getString("eventId") : "";
        String string2 = readableMap.hasKey("chargeInfo") ? readableMap.getString("chargeInfo") : "";
        if (i2 == 2) {
            com.sankuai.waimai.ad.mads.a.a(i, new b.a(string, string2, 2));
        } else if (i2 == 3) {
            com.sankuai.waimai.ad.mads.a.a(i, new b.a(string, string2, 3));
        }
    }

    @ReactMethod
    public void willOrderAgainHandleRoute(final ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4be09c52b1a8fb676aa8e0816f2830c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4be09c52b1a8fb676aa8e0816f2830c2");
            return;
        }
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.list.rn.RNOrderListLogicModule.10
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f615d53c09322170faebd73335bf2cf1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f615d53c09322170faebd73335bf2cf1");
                    return;
                }
                Activity activity = currentActivity;
                ReadableMap readableMap2 = readableMap;
                Object[] objArr3 = {activity, readableMap2};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.list.helper.a.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "b0ffec91e29f78b959e2af4979a94bbc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "b0ffec91e29f78b959e2af4979a94bbc");
                    return;
                }
                int i = readableMap2.hasKey(Constants.PRIVACY.KEY_LATITUDE) ? readableMap2.getInt(Constants.PRIVACY.KEY_LATITUDE) : 0;
                int i2 = readableMap2.hasKey(Constants.PRIVACY.KEY_LONGITUDE) ? readableMap2.getInt(Constants.PRIVACY.KEY_LONGITUDE) : 0;
                if (!com.sankuai.waimai.foundation.core.a.d()) {
                    AddressItem addressItem = new AddressItem();
                    addressItem.lat = i;
                    addressItem.lng = i2;
                    com.sankuai.waimai.platform.domain.manager.location.a.b(activity, addressItem);
                    return;
                }
                com.sankuai.waimai.foundation.core.service.user.a.a = a.EnumC0947a.FROM_ORDER_LIST_PREORDER;
            }
        });
    }
}
