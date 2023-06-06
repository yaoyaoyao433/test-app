package com.hhmedic.android.sdk.okhttputils.okhttp.request;

import com.hhmedic.android.sdk.okhttputils.okhttp.callback.Callback;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class OkHttpRequest {
    protected Request.Builder builder = new Request.Builder();
    protected Map<String, String> headers;
    protected int id;
    protected Map<String, String> params;
    protected Object tag;
    protected String url;

    protected abstract Request buildRequest(RequestBody requestBody);

    protected abstract RequestBody buildRequestBody();

    protected RequestBody wrapRequestBody(RequestBody requestBody, Callback callback) {
        return requestBody;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public OkHttpRequest(String str, Object obj, Map<String, String> map, Map<String, String> map2, int i) {
        this.url = str;
        this.tag = obj;
        this.params = map;
        this.headers = map2;
        this.id = i;
        initBuilder();
    }

    private void initBuilder() {
        this.builder.url(this.url).tag(this.tag);
        appendHeaders();
    }

    public RequestCall build() {
        return new RequestCall(this);
    }

    public Request generateRequest(Callback callback) {
        return buildRequest(wrapRequestBody(buildRequestBody(), callback));
    }

    protected void appendHeaders() {
        Headers.Builder builder = new Headers.Builder();
        if (this.headers == null || this.headers.isEmpty()) {
            return;
        }
        for (String str : this.headers.keySet()) {
            builder.add(str, this.headers.get(str));
        }
        this.builder.headers(builder.build());
    }

    public int getId() {
        return this.id;
    }
}
