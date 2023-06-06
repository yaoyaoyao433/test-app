package com.meituan.android.common.aidata.net;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.AIData;
import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.Ok3CandyInterceptor;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HttpManager {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static boolean openMTGuard = true;
    private final OkHttpClient client;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class InnerClass {
        private static final HttpManager STUB = new HttpManager();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static HttpManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4b0a455aeeead110abb1e00cf0cb7f6d", RobustBitConfig.DEFAULT_VALUE) ? (HttpManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4b0a455aeeead110abb1e00cf0cb7f6d") : InnerClass.STUB;
    }

    public HttpManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37883deaf84fbd4713a1016fc49a77ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37883deaf84fbd4713a1016fc49a77ab");
            return;
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttp3Wrapper.addInterceptorToBuilder(builder);
        if (openMTGuard) {
            MTGuard.init(AIData.getContext());
            builder.addInterceptor(new Ok3CandyInterceptor());
        }
        this.client = builder.build();
    }

    public static void openMTGuard(boolean z) {
        openMTGuard = z;
    }

    public void asyncPost(RequestBuilder requestBuilder, HttpResultListener httpResultListener) {
        Object[] objArr = {requestBuilder, httpResultListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc5d12f5ce770a86f51ab76e13da555c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc5d12f5ce770a86f51ab76e13da555c");
        } else {
            asyncPost(requestBuilder, httpResultListener, 200);
        }
    }

    public void asyncPost(RequestBuilder requestBuilder, final HttpResultListener httpResultListener, final int i) {
        Call newCall;
        Object[] objArr = {requestBuilder, httpResultListener, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e7156927fcee77735674dd3e907f666", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e7156927fcee77735674dd3e907f666");
        } else if (requestBuilder == null || (newCall = this.client.newCall(requestBuilder.build())) == null) {
        } else {
            newCall.enqueue(new Callback() { // from class: com.meituan.android.common.aidata.net.HttpManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // okhttp3.Callback
                public void onFailure(@NotNull Call call, @NotNull IOException iOException) {
                    Object[] objArr2 = {call, iOException};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8d99fc835e06132d72c0535135e35b76", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8d99fc835e06132d72c0535135e35b76");
                    } else if (httpResultListener != null) {
                        httpResultListener.onFail(-1, iOException.toString());
                    }
                }

                @Override // okhttp3.Callback
                public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                    Object[] objArr2 = {call, response};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7ee1bd9d7a6b1bb96df3c3d81326f9b6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7ee1bd9d7a6b1bb96df3c3d81326f9b6");
                    } else if (httpResultListener == null) {
                        if (response != null) {
                            response.close();
                        }
                    } else if (response == null) {
                        httpResultListener.onFail(1, "response is null");
                    } else if (response.code() != 200) {
                        response.close();
                        httpResultListener.onFail(2, "response code is not 200");
                    } else {
                        ResponseBody body = response.body();
                        if (body != null) {
                            HttpResult parseResult = HttpManager.this.parseResult(body.string());
                            int i2 = parseResult.code;
                            if (i2 == i) {
                                httpResultListener.onSuccess(parseResult);
                                return;
                            } else {
                                httpResultListener.onFail(i2, parseResult.msg);
                                return;
                            }
                        }
                        response.close();
                        httpResultListener.onFail(3, "response body is null");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public HttpResult parseResult(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3af119224e1c79d8c11b6b07b2a1ae35", RobustBitConfig.DEFAULT_VALUE)) {
            return (HttpResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3af119224e1c79d8c11b6b07b2a1ae35");
        }
        HttpResult httpResult = new HttpResult();
        if (TextUtils.isEmpty(str)) {
            return httpResult;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("msg", "");
            if (TextUtils.isEmpty(optString)) {
                optString = jSONObject.optString("message", "");
            }
            httpResult.msg = optString;
            httpResult.code = jSONObject.optInt("code", -1);
            httpResult.data = jSONObject.optString("data", "");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return httpResult;
    }
}
