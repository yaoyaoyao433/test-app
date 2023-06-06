package com.sankuai.titans.adapter.base;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import com.alipay.sdk.widget.d;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.Utils;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.f;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.QueryMap;
import com.sankuai.meituan.retrofit2.http.Url;
import com.sankuai.titans.config.Config;
import com.sankuai.titans.config.ConfigManager;
import com.sankuai.titans.protocol.adaptor.IAppTitansInfo;
import com.sankuai.titans.protocol.jsbridge.IJsBridgeManager;
import com.sankuai.titans.protocol.jsbridge.JsHandlerResultInfo;
import com.sankuai.titans.protocol.services.IStatisticsService;
import com.sankuai.titans.protocol.utils.UrlUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class JsBridgeManagerImpl implements IJsBridgeManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final List<String> IGNORE_METHODS;
    private final Map<String, BridgeAccessResult> bridgeAccess;
    private final Map<String, BlockingQueue<IBridgeAccessCallback>> listeners;
    private final IStatisticsService mStatisticsService;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface Api {
        @GET
        Call<BridgeAccessResult> bridgeAccess(@Url String str, @QueryMap(encoded = true) Map<String, String> map);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class BridgeAccessResult {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("result")
        @Expose
        public List<String> result;
        @SerializedName("status")
        @Expose
        public int status;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class BridgeAccessStatusCode {
        public static final int REQUEST_AWAIT = 1;
        public static final int REQUEST_FAILED = 5;
        public static final int REQUEST_SUCCESS_WITHOUT_DATA = 2;
        public static final int REQUEST_SUCCESS_WITH_DATA = 3;
        public static final int REQUEST_SUCCESS_WITH_JSON_ERROR = 4;
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface IBridgeAccessCallback {
        void onFailed(JsHandlerResultInfo jsHandlerResultInfo);

        void onGetBridge(List<String> list);
    }

    public JsBridgeManagerImpl(IStatisticsService iStatisticsService) {
        Object[] objArr = {iStatisticsService};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "549e4b0aa43f56357be52295a7917c3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "549e4b0aa43f56357be52295a7917c3b");
            return;
        }
        this.IGNORE_METHODS = Arrays.asList("ready", "setRRButton", "getNetworkType", "openScheme", "jumpToScheme", "closeWindow", d.o, "setImageTitle", "setLLButton", "setLRButton", "setRLButton", "setNavigationBarHidden", "setBackgroundColor", "setBouncesEnabled", "scanQRCode", "toast", "vibrate");
        this.listeners = new ConcurrentHashMap();
        this.bridgeAccess = new ConcurrentHashMap();
        this.mStatisticsService = iStatisticsService;
    }

    @Override // com.sankuai.titans.protocol.jsbridge.IJsBridgeManager
    public void init(IAppTitansInfo iAppTitansInfo, Context context, String str) {
        Object[] objArr = {iAppTitansInfo, context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3f8352e406fb934ba83c1d9bfb88366", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3f8352e406fb934ba83c1d9bfb88366");
        } else if (this.bridgeAccess.get(str) == null) {
            requestBridgeAccess(str, iAppTitansInfo, context);
        } else if (this.bridgeAccess.get(str) == null || this.bridgeAccess.get(str).status != 5) {
        } else {
            requestBridgeAccess(str, iAppTitansInfo, context);
        }
    }

    @Override // com.sankuai.titans.protocol.jsbridge.IJsBridgeManager
    @RequiresApi(api = 24)
    public void verify(final String str, String str2, boolean z, final IJsBridgeManager.VerifyCallback verifyCallback) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), verifyCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbdc6298dc730c5eb15d8c05974bbd27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbdc6298dc730c5eb15d8c05974bbd27");
            return;
        }
        Config config = ConfigManager.getConfig();
        List<String> list = config.bridge.green;
        if (this.IGNORE_METHODS.contains(str) || (list != null && list.contains(str))) {
            verifyCallback.onSuccess();
            return;
        }
        List<String> white = config.access.getWhite();
        HashSet hashSet = white == null ? new HashSet() : new HashSet(white);
        if (UrlUtils.hostEndWith(str2, hashSet)) {
            verifyCallback.onSuccess();
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("case", "非内部域名的url调桥");
        hashMap.put("method", str);
        hashMap.put("url", str2);
        hashMap.put("set", hashSet);
        hashMap.put(DeviceInfo.TM, Long.valueOf(System.currentTimeMillis()));
        this.mStatisticsService.reportGeneralInfo(hashMap);
        BridgeAccessResult bridgeAccessResult = this.bridgeAccess.get(str2);
        if (bridgeAccessResult.status == 1) {
            final HashMap hashMap2 = new HashMap();
            hashMap2.put("case", "桥调用但websafe网络请求还没回来");
            hashMap2.put("method", str);
            hashMap2.put("url", str2);
            hashMap2.put("桥verify前的时间戳", Long.valueOf(System.currentTimeMillis()));
            IBridgeAccessCallback iBridgeAccessCallback = new IBridgeAccessCallback() { // from class: com.sankuai.titans.adapter.base.JsBridgeManagerImpl.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.adapter.base.JsBridgeManagerImpl.IBridgeAccessCallback
                public void onGetBridge(List<String> list2) {
                    Object[] objArr2 = {list2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8d2662493dcbbb68638305e632d1cf1a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8d2662493dcbbb68638305e632d1cf1a");
                        return;
                    }
                    hashMap2.put("桥verify网络请求回来onGetBridge的时间戳", Long.valueOf(System.currentTimeMillis()));
                    JsBridgeManagerImpl.this.mStatisticsService.reportGeneralInfo(hashMap2);
                    if (list2.contains(str)) {
                        verifyCallback.onSuccess();
                    } else {
                        verifyCallback.onFail(JsHandlerResultInfo.Error_2_JsBridgeInvalid_RequestSuccessNotInWhiteList);
                    }
                }

                @Override // com.sankuai.titans.adapter.base.JsBridgeManagerImpl.IBridgeAccessCallback
                public void onFailed(JsHandlerResultInfo jsHandlerResultInfo) {
                    Object[] objArr2 = {jsHandlerResultInfo};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "62964422bdc63ff7fe219298c2f37cb1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "62964422bdc63ff7fe219298c2f37cb1");
                        return;
                    }
                    hashMap2.put("桥verify网络请求回来onFailed的时间戳", Long.valueOf(System.currentTimeMillis()));
                    JsBridgeManagerImpl.this.mStatisticsService.reportGeneralInfo(hashMap2);
                    verifyCallback.onFail(jsHandlerResultInfo);
                }
            };
            BlockingQueue<IBridgeAccessCallback> blockingQueue = this.listeners.get(str2);
            if (blockingQueue == null) {
                blockingQueue = new LinkedBlockingQueue<>();
                this.listeners.put(str2, blockingQueue);
            }
            try {
                blockingQueue.put(iBridgeAccessCallback);
            } catch (InterruptedException e) {
                this.mStatisticsService.reportClassError("JsBridgeManagerImpl", "verify", e);
            }
        } else if (bridgeAccessResult.status == 5) {
            verifyCallback.onFail(JsHandlerResultInfo.Error_2_JsBridgeInvalid_RequestFailed);
        } else if (bridgeAccessResult.status == 2) {
            verifyCallback.onFail(JsHandlerResultInfo.Error_2_JsBridgeInvalid_RequestSuccessWithoutData);
        } else if (!bridgeAccessResult.result.contains(str)) {
            verifyCallback.onFail(JsHandlerResultInfo.Error_2_JsBridgeInvalid_CachedNotInWhiteList);
        } else {
            verifyCallback.onSuccess();
        }
    }

    public void requestBridgeAccess(final String str, IAppTitansInfo iAppTitansInfo, Context context) {
        Object[] objArr = {str, iAppTitansInfo, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a593741ae437b1f5d9c00730fdef274", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a593741ae437b1f5d9c00730fdef274");
            return;
        }
        List<String> white = ConfigManager.getConfig().access.getWhite();
        if (UrlUtils.hostEndWith(str, white == null ? new HashSet() : new HashSet(white))) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (iAppTitansInfo != null && !TextUtils.isEmpty(iAppTitansInfo.titansAppId())) {
            hashMap.put("appId", iAppTitansInfo.titansAppId());
        }
        PackageInfo currentVersion = Utils.getCurrentVersion(context);
        if (currentVersion != null) {
            hashMap.put("appVersion", currentVersion.versionName);
        }
        try {
            hashMap.put("url", URLEncoder.encode(str, "utf-8"));
        } catch (UnsupportedEncodingException unused) {
            hashMap.put("url", str);
        }
        if (iAppTitansInfo != null && iAppTitansInfo.isDebugMode()) {
            hashMap.put("isKNBDebug", "true");
        }
        Call<BridgeAccessResult> bridgeAccess = ((Api) RetrofitFactory.getInstance("http://i.meituan.com").a(Api.class)).bridgeAccess(Constants.WEBSAFE_HOST + "/bridge", hashMap);
        final HashMap hashMap2 = new HashMap();
        hashMap2.put("case", "桥使用者鉴权: 外部页面请求websafe");
        hashMap2.put("url", str);
        hashMap2.put("TimeRequestBridgeAccess", Long.valueOf(System.currentTimeMillis()));
        bridgeAccess.a(new f<BridgeAccessResult>() { // from class: com.sankuai.titans.adapter.base.JsBridgeManagerImpl.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.meituan.retrofit2.f
            public void onResponse(Call<BridgeAccessResult> call, Response<BridgeAccessResult> response) {
                Object[] objArr2 = {call, response};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "35f696e1e9f622eed3fbfff74d4ce269", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "35f696e1e9f622eed3fbfff74d4ce269");
                    return;
                }
                BlockingQueue blockingQueue = (BlockingQueue) JsBridgeManagerImpl.this.listeners.remove(str);
                if (response != null && response.e() != null && response.e().result != null) {
                    hashMap2.put("TimeBridgeAccessOnResponse", Long.valueOf(System.currentTimeMillis()));
                    hashMap2.put("responseBody", response);
                    hashMap2.put("responseBodyResult", response.e().result);
                    JsBridgeManagerImpl.this.mStatisticsService.reportGeneralInfo(hashMap2);
                    response.e().status = 3;
                    JsBridgeManagerImpl.this.bridgeAccess.put(str, response.e());
                    if (blockingQueue != null) {
                        while (!blockingQueue.isEmpty()) {
                            IBridgeAccessCallback iBridgeAccessCallback = (IBridgeAccessCallback) blockingQueue.poll();
                            if (iBridgeAccessCallback != null) {
                                iBridgeAccessCallback.onGetBridge(response.e().result);
                            }
                        }
                        return;
                    }
                    return;
                }
                BridgeAccessResult bridgeAccessResult = new BridgeAccessResult();
                bridgeAccessResult.status = 2;
                JsBridgeManagerImpl.this.bridgeAccess.put(str, bridgeAccessResult);
                if (blockingQueue != null) {
                    while (!blockingQueue.isEmpty()) {
                        IBridgeAccessCallback iBridgeAccessCallback2 = (IBridgeAccessCallback) blockingQueue.poll();
                        if (iBridgeAccessCallback2 != null) {
                            iBridgeAccessCallback2.onFailed(JsHandlerResultInfo.Error_2_JsBridgeInvalid_RequestSuccessWithoutData);
                        }
                    }
                }
            }

            @Override // com.sankuai.meituan.retrofit2.f
            @RequiresApi(api = 24)
            public void onFailure(Call<BridgeAccessResult> call, Throwable th) {
                Object[] objArr2 = {call, th};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b01f5b42cb2f135432e3cfb40099daee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b01f5b42cb2f135432e3cfb40099daee");
                    return;
                }
                hashMap2.put("TimeBridgeAccessOnFailure", Long.valueOf(System.currentTimeMillis()));
                JsBridgeManagerImpl.this.mStatisticsService.reportGeneralInfo(hashMap2);
                BridgeAccessResult bridgeAccessResult = new BridgeAccessResult();
                bridgeAccessResult.status = 5;
                JsBridgeManagerImpl.this.bridgeAccess.put(str, bridgeAccessResult);
                BlockingQueue blockingQueue = (BlockingQueue) JsBridgeManagerImpl.this.listeners.remove(str);
                if (blockingQueue != null) {
                    while (!blockingQueue.isEmpty()) {
                        IBridgeAccessCallback iBridgeAccessCallback = (IBridgeAccessCallback) blockingQueue.poll();
                        if (iBridgeAccessCallback != null) {
                            iBridgeAccessCallback.onFailed(JsHandlerResultInfo.Error_2_JsBridgeInvalid_RequestSuccessWithoutData);
                        }
                    }
                }
            }
        });
        BridgeAccessResult bridgeAccessResult = new BridgeAccessResult();
        bridgeAccessResult.status = 1;
        this.bridgeAccess.put(str, bridgeAccessResult);
    }
}
