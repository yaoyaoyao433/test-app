package com.hhmedic.android.sdk.base.net;

import com.google.gson.Gson;
import com.hhmedic.android.sdk.base.BaseConfig;
import com.hhmedic.android.sdk.base.model.HHModel;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.okhttputils.okhttp.utils.Platform;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHGsonRequest<T> {
    public static final MediaType JSON = MediaType.parse(HHNetConfig.JSON);
    private HHRequestConfig mConfig;
    private final Gson mGson = new Gson();
    private OnNetListener<T> mListener;
    private final Platform mPlatform;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnNetListener<T> {
        void onFail(String str, int i);

        void onSuccess(T t);
    }

    public HHGsonRequest(HHRequestConfig hHRequestConfig, OnNetListener<T> onNetListener) {
        this.mListener = onNetListener;
        this.mConfig = hHRequestConfig;
        if (hHRequestConfig.print()) {
            Logger.e("request url------->" + hHRequestConfig.getRequestUrl());
        }
        this.mPlatform = Platform.get();
    }

    public void start() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttp3Wrapper.addInterceptorToBuilder(builder);
        OkHttpClient build = builder.readTimeout(10L, TimeUnit.SECONDS).writeTimeout(10L, TimeUnit.SECONDS).connectTimeout(10L, TimeUnit.SECONDS).build();
        Request.Builder url = new Request.Builder().headers(Headers.of(getHeaders())).url(this.mConfig.getRequestUrl());
        if (this.mConfig.getRequestMethod() == 2) {
            byte[] body = getBody();
            if (body != null) {
                url.post(RequestBody.create(JSON, body));
            } else {
                url.post(RequestBody.create(JSON, "{}"));
            }
        } else {
            url.get();
        }
        build.newCall(url.build()).enqueue(new Callback() { // from class: com.hhmedic.android.sdk.base.net.HHGsonRequest.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                HHGsonRequest.this.errorCallback("请求异常", -3);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                HHGsonRequest.this.doResponse(response);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doResponse(Response response) {
        if (response != null) {
            try {
                if (!response.isSuccessful() || response.body() == null) {
                    return;
                }
                String string = response.body().string();
                if (this.mConfig.print() && BaseConfig.isDebug) {
                    Logger.e("HH Response Json:" + string);
                }
                HHModel hHModel = (HHModel) this.mGson.fromJson(string, this.mConfig.parserJsonType());
                if (hHModel.status == 200) {
                    successCallback(hHModel.data);
                } else {
                    errorCallback(hHModel.message, hHModel.status);
                }
            } catch (Exception e) {
                Logger.e("HH Request doResponse error:" + e.getMessage());
                errorCallback("请求数据解析异常", -3);
            }
        }
    }

    private byte[] getBody() {
        try {
            if (this.mConfig.mBodyByte != null) {
                return this.mConfig.mBodyByte;
            }
            if (this.mConfig.mBody != null) {
                String json = new Gson().toJson(this.mConfig.mBody);
                if (BaseConfig.isDebug && BaseConfig.canPrintLog) {
                    Logger.e(json);
                }
                return json.getBytes("UTF-8");
            }
            return null;
        } catch (Exception e) {
            Logger.e(e.toString());
            return null;
        }
    }

    private Map<String, String> getHeaders() {
        return HHNetConfig.getRequestHeader();
    }

    private void successCallback(final T t) {
        if (this.mPlatform != null) {
            this.mPlatform.execute(new Runnable() { // from class: com.hhmedic.android.sdk.base.net.HHGsonRequest.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    if (HHGsonRequest.this.mListener != null) {
                        HHGsonRequest.this.mListener.onSuccess(t);
                    }
                    HHGsonRequest.this.release();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void errorCallback(final String str, final int i) {
        if (this.mPlatform != null) {
            this.mPlatform.execute(new Runnable() { // from class: com.hhmedic.android.sdk.base.net.HHGsonRequest.3
                @Override // java.lang.Runnable
                public void run() {
                    if (HHGsonRequest.this.mListener != null) {
                        HHGsonRequest.this.mListener.onFail(str, i);
                    }
                    HHGsonRequest.this.release();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void release() {
        this.mListener = null;
        this.mConfig = null;
    }
}
