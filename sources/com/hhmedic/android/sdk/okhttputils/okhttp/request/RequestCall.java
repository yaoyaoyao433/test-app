package com.hhmedic.android.sdk.okhttputils.okhttp.request;

import com.hhmedic.android.sdk.okhttputils.okhttp.OkHttpUtils;
import com.hhmedic.android.sdk.okhttputils.okhttp.callback.Callback;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RequestCall {
    private Call call;
    private OkHttpClient clone;
    private long connTimeOut;
    private final OkHttpRequest okHttpRequest;
    private long readTimeOut;
    private Request request;
    private long writeTimeOut;

    public RequestCall(OkHttpRequest okHttpRequest) {
        this.okHttpRequest = okHttpRequest;
    }

    public RequestCall readTimeOut(long j) {
        this.readTimeOut = j;
        return this;
    }

    public RequestCall writeTimeOut(long j) {
        this.writeTimeOut = j;
        return this;
    }

    public RequestCall connTimeOut(long j) {
        this.connTimeOut = j;
        return this;
    }

    public Call buildCall(Callback callback) {
        this.request = generateRequest(callback);
        if (this.readTimeOut > 0 || this.writeTimeOut > 0 || this.connTimeOut > 0) {
            this.readTimeOut = this.readTimeOut > 0 ? this.readTimeOut : 10000L;
            this.writeTimeOut = this.writeTimeOut > 0 ? this.writeTimeOut : 10000L;
            this.connTimeOut = this.connTimeOut > 0 ? this.connTimeOut : 10000L;
            this.clone = OkHttpUtils.getInstance().getOkHttpClient().newBuilder().readTimeout(this.readTimeOut, TimeUnit.MILLISECONDS).writeTimeout(this.writeTimeOut, TimeUnit.MILLISECONDS).connectTimeout(this.connTimeOut, TimeUnit.MILLISECONDS).build();
            this.call = this.clone.newCall(this.request);
        } else {
            this.call = OkHttpUtils.getInstance().getOkHttpClient().newCall(this.request);
        }
        return this.call;
    }

    private Request generateRequest(Callback callback) {
        return this.okHttpRequest.generateRequest(callback);
    }

    public void execute(Callback callback) {
        buildCall(callback);
        if (callback != null) {
            callback.onBefore(this.request, getOkHttpRequest().getId());
        }
        OkHttpUtils.getInstance().execute(this, callback);
    }

    public Call getCall() {
        return this.call;
    }

    public Request getRequest() {
        return this.request;
    }

    public OkHttpRequest getOkHttpRequest() {
        return this.okHttpRequest;
    }

    public Response execute() throws IOException {
        buildCall(null);
        return this.call.execute();
    }

    public void cancel() {
        if (this.call != null) {
            this.call.cancel();
        }
    }
}
