package com.meituan.android.yoda.bridge.knb;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.yoda.asynchronous.a;
import com.meituan.android.yoda.asynchronous.b;
import com.meituan.android.yoda.interfaces.h;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsVideoCacheTask;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class UseMobileNetRequestJsHandler extends BaseJsHandler {
    private static final String TAG = "UseMobileNetRequestJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect;
    private Handler mHandler;
    private b timeoutRunnable;
    private a timeoutSafeRunnableTask;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "GDYQ+G70OT8Mwdy6hTL9+bYeIQyyc5B9qRnegFx+IMa73bDddDGqQxrmOh3d8NBwGMmiw5R8GDWbX1IyzBWF0A==";
    }

    public UseMobileNetRequestJsHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "568f17520064e5ecce7d9e54552b8c0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "568f17520064e5ecce7d9e54552b8c0e");
        } else {
            this.mHandler = new Handler(Looper.getMainLooper());
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4ca76c93bf57fa9041732aa0987d8b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4ca76c93bf57fa9041732aa0987d8b2");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a(TAG, TAG, true);
        try {
            final Activity activity = jsHost().getActivity();
            if (activity == null) {
                jsCallbackError(10000, "activity is null");
                return;
            }
            if (jsBean() != null && jsBean().argsJson != null) {
                final String optString = jsBean().argsJson.optString("url");
                if (TextUtils.isEmpty(optString)) {
                    com.meituan.android.yoda.monitor.log.a.a(TAG, "url is empty", true);
                    jsCallbackError(10000, "url is empty");
                    return;
                }
                final String optString2 = jsBean().argsJson.optString("method", "POST");
                final String optString3 = jsBean().argsJson.optString("data");
                final String optString4 = jsBean().argsJson.optString(TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_HEADER);
                final ConnectivityManager connectivityManager = (ConnectivityManager) activity.getSystemService("connectivity");
                NetworkRequest.Builder builder = new NetworkRequest.Builder();
                builder.addCapability(12);
                builder.addTransportType(0);
                NetworkRequest build = builder.build();
                final ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.meituan.android.yoda.bridge.knb.UseMobileNetRequestJsHandler.1
                    public static ChangeQuickRedirect a;

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onAvailable(Network network) {
                        Object[] objArr2 = {network};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b18e0d8a813f872b1853c6049ff93f6a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b18e0d8a813f872b1853c6049ff93f6a");
                            return;
                        }
                        super.onAvailable(network);
                        com.meituan.android.yoda.monitor.log.a.a(UseMobileNetRequestJsHandler.TAG, "onAvailable ", true);
                        try {
                            if (UseMobileNetRequestJsHandler.this.timeoutRunnable == null) {
                                com.meituan.android.yoda.monitor.log.a.a(UseMobileNetRequestJsHandler.TAG, "timeoutRunnable is null", true);
                                return;
                            }
                            com.meituan.android.yoda.network.a.a().a(network, optString, optString2, optString4, optString3, new h<String>() { // from class: com.meituan.android.yoda.bridge.knb.UseMobileNetRequestJsHandler.1.1
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.android.yoda.interfaces.h
                                public final /* synthetic */ void a(String str, @NonNull String str2) {
                                    String str3 = str2;
                                    Object[] objArr3 = {str, str3};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "3238a03f2f2ed839ab8d30ed179a3635", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "3238a03f2f2ed839ab8d30ed179a3635");
                                    } else if (UseMobileNetRequestJsHandler.this.timeoutRunnable != null) {
                                        UseMobileNetRequestJsHandler.this.removeTimeOutRunnable();
                                        try {
                                            com.meituan.android.yoda.monitor.log.a.a(UseMobileNetRequestJsHandler.TAG, "onSuccess: " + str3, true);
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("response", str3);
                                            UseMobileNetRequestJsHandler.this.jsCallback(jSONObject);
                                        } catch (Exception e) {
                                            UseMobileNetRequestJsHandler.this.jsCallbackError(10000, e.getMessage());
                                        }
                                    }
                                }

                                @Override // com.meituan.android.yoda.interfaces.h
                                public final void a(String str, @NonNull Error error) {
                                    Object[] objArr3 = {str, error};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a90b83b2338f281dbe88d365147b02f3", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a90b83b2338f281dbe88d365147b02f3");
                                    } else if (UseMobileNetRequestJsHandler.this.timeoutRunnable == null) {
                                    } else {
                                        UseMobileNetRequestJsHandler.this.removeTimeOutRunnable();
                                        UseMobileNetRequestJsHandler.this.jsCallbackError(10000, error.message);
                                        com.meituan.android.yoda.monitor.log.a.a(UseMobileNetRequestJsHandler.TAG, "onError: " + error.message, true);
                                    }
                                }
                            }, false);
                            com.meituan.android.yoda.monitor.log.a.a(UseMobileNetRequestJsHandler.TAG, "UseMobileNetRequestJsHandler unregisterNetworkCallback ", true);
                            connectivityManager.unregisterNetworkCallback(this);
                        } catch (Exception e) {
                            e.printStackTrace();
                            UseMobileNetRequestJsHandler.this.jsCallbackError(10000, e.getMessage());
                            com.meituan.android.yoda.monitor.log.a.a(UseMobileNetRequestJsHandler.TAG, "exception " + e.getMessage(), true);
                        }
                    }
                };
                com.meituan.android.yoda.monitor.log.a.a(TAG, "UseMobileNetRequestJsHandler registerNetworkCallback", true);
                connectivityManager.registerNetworkCallback(build, networkCallback);
                connectivityManager.requestNetwork(build, networkCallback);
                if (this.mHandler != null) {
                    if (this.timeoutRunnable == null) {
                        this.timeoutSafeRunnableTask = new a() { // from class: com.meituan.android.yoda.bridge.knb.UseMobileNetRequestJsHandler.2
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.android.yoda.asynchronous.a
                            public final void a() {
                                Object[] objArr2 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e9cd925fd23ede5285f882ba6b1fe7d9", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e9cd925fd23ede5285f882ba6b1fe7d9");
                                } else if (activity == null || activity.isFinishing()) {
                                } else {
                                    UseMobileNetRequestJsHandler.this.timeoutRunnable = null;
                                    UseMobileNetRequestJsHandler.this.timeoutSafeRunnableTask = null;
                                    UseMobileNetRequestJsHandler.this.jsCallbackError(10000, "request timeout");
                                    try {
                                        connectivityManager.unregisterNetworkCallback(networkCallback);
                                    } catch (Exception unused) {
                                        com.meituan.android.yoda.monitor.log.a.a(UseMobileNetRequestJsHandler.TAG, "if request is slow, unregisterNetworkCallback maybe execute 2 times ", true);
                                    }
                                }
                            }
                        };
                        this.timeoutRunnable = new b(this.timeoutSafeRunnableTask);
                    }
                    this.mHandler.postDelayed(this.timeoutRunnable, MetricsAnrManager.ANR_THRESHOLD);
                    return;
                }
                return;
            }
            com.meituan.android.yoda.monitor.log.a.a(TAG, "no url and param", true);
            jsCallbackError(10000, "no url and param");
        } catch (Exception e) {
            jsCallbackError(10000, e.getMessage());
            com.meituan.android.yoda.monitor.log.a.a(TAG, "Exception " + e.getMessage(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTimeOutRunnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3066069cd3fcc7f20741d991ef0ae26a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3066069cd3fcc7f20741d991ef0ae26a");
        } else if (this.mHandler == null || this.timeoutRunnable == null) {
        } else {
            this.mHandler.removeCallbacks(this.timeoutRunnable);
            this.timeoutRunnable = null;
            this.timeoutSafeRunnableTask = null;
        }
    }
}
