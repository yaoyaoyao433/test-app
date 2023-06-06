package com.dianping.titans.js.jshandler;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.alipay.sdk.widget.d;
import com.dianping.titans.js.JsHost;
import com.dianping.titans.utils.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.Utils;
import com.sankuai.meituan.android.knb.http.RetrofitFactory;
import com.sankuai.meituan.android.knb.util.UriUtil;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.f;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class JsHandlerVerifyImpl implements JsHandlerVerifyStrategy {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final List<String> IGNORE_METHODS;
    private final List<String> accessWhiteList;
    private final Map<String, BridgeAccessResult> bridgeAccess;
    private final List<String> greenList;
    private final boolean isDebug;
    private final String knbAppId;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface BridgeAccessCallback {
        void onFailed();

        void onGetBridge(List<String> list);
    }

    public JsHandlerVerifyImpl(List<String> list, List<String> list2, String str, boolean z) {
        Object[] objArr = {list, list2, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6eccd619db2002fb8e35a035c872565", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6eccd619db2002fb8e35a035c872565");
            return;
        }
        this.IGNORE_METHODS = Arrays.asList("ready", "setRRButton", "getNetworkType", "openScheme", "jumpToScheme", "closeWindow", d.o, "setImageTitle", "setLLButton", "setLRButton", "setRLButton", "setNavigationBarHidden", "setBackgroundColor", "setBouncesEnabled", "scanQRCode", "toast", "vibrate");
        this.bridgeAccess = new HashMap();
        this.greenList = list == null ? new ArrayList<>() : list;
        this.accessWhiteList = list2 == null ? new ArrayList<>() : list2;
        this.knbAppId = str;
        this.isDebug = z;
    }

    @Override // com.dianping.titans.js.jshandler.JsHandlerVerifyStrategy
    public boolean verify(BaseJsHandler baseJsHandler) {
        Object[] objArr = {baseJsHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6cffa37820fef2ff075d7a375c5ee92b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6cffa37820fef2ff075d7a375c5ee92b")).booleanValue();
        }
        if (baseJsHandler != null && baseJsHandler.jsBean() != null && !TextUtils.isEmpty(baseJsHandler.jsBean().method)) {
            String str = baseJsHandler.jsBean().method;
            if (this.IGNORE_METHODS.contains(str) || this.greenList.contains(str)) {
                return true;
            }
            JsHost jsHost = baseJsHandler.jsHost();
            if (jsHost != null) {
                String url = jsHost.getUrl();
                if (TextUtils.isEmpty(url)) {
                    return false;
                }
                if (UriUtil.hostEndWith(url, this.accessWhiteList)) {
                    return true;
                }
                BridgeAccessResult bridgeAccessResult = this.bridgeAccess.get(url);
                if (bridgeAccessResult == null) {
                    requestBridgeAccess(jsHost, url, null);
                } else if (bridgeAccessResult.status != -101) {
                    return bridgeAccessResult.result != null && bridgeAccessResult.result.contains(str);
                }
                baseJsHandler.isVerfying = true;
            }
        }
        return false;
    }

    public void requestBridgeAccess(JsHost jsHost, final String str, final BridgeAccessCallback bridgeAccessCallback) {
        Object[] objArr = {jsHost, str, bridgeAccessCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "152394b69d0cb60c2e202ba8504b2dfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "152394b69d0cb60c2e202ba8504b2dfd");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appId", this.knbAppId);
        PackageInfo currentVersion = Utils.getCurrentVersion(jsHost.getContext().getApplicationContext());
        if (currentVersion != null) {
            hashMap.put("appVersion", currentVersion.versionName);
        }
        try {
            hashMap.put("url", URLEncoder.encode(str, "utf-8"));
        } catch (UnsupportedEncodingException unused) {
            hashMap.put("url", str);
        }
        if (this.isDebug) {
            hashMap.put("isKNBDebug", "true");
        }
        ((Api) RetrofitFactory.getInstance("http://i.meituan.com").a(Api.class)).bridgeAccess(Constants.WEBSAFE_HOST + "/bridge", hashMap).a(new f<BridgeAccessResult>() { // from class: com.dianping.titans.js.jshandler.JsHandlerVerifyImpl.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.meituan.retrofit2.f
            public void onResponse(Call<BridgeAccessResult> call, Response<BridgeAccessResult> response) {
                Object[] objArr2 = {call, response};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3cfe3f268ee414dce7ab398ebb65b162", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3cfe3f268ee414dce7ab398ebb65b162");
                } else if (response == null || response.e() == null) {
                    JsHandlerVerifyImpl.this.bridgeAccess.remove(str);
                    if (bridgeAccessCallback != null) {
                        bridgeAccessCallback.onFailed();
                    }
                } else {
                    JsHandlerVerifyImpl.this.bridgeAccess.put(str, response.e());
                    if (bridgeAccessCallback != null) {
                        bridgeAccessCallback.onGetBridge(response.e().result);
                    }
                }
            }

            @Override // com.sankuai.meituan.retrofit2.f
            public void onFailure(Call<BridgeAccessResult> call, Throwable th) {
                Object[] objArr2 = {call, th};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "eafa4392d2b9645f1d6a54d217357e25", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "eafa4392d2b9645f1d6a54d217357e25");
                    return;
                }
                JsHandlerVerifyImpl.this.bridgeAccess.remove(str);
                if (bridgeAccessCallback != null) {
                    bridgeAccessCallback.onFailed();
                }
            }
        });
        BridgeAccessResult bridgeAccessResult = new BridgeAccessResult();
        bridgeAccessResult.status = -101;
        this.bridgeAccess.put(str, bridgeAccessResult);
    }
}
