package com.hhmedic.android.sdk.okhttputils.okhttp.builder;

import com.hhmedic.android.sdk.okhttputils.okhttp.builder.OkHttpRequestBuilder;
import com.hhmedic.android.sdk.okhttputils.okhttp.request.RequestCall;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class OkHttpRequestBuilder<T extends OkHttpRequestBuilder> {
    protected Map<String, String> headers;
    protected int id;
    protected Map<String, String> params;
    protected Object tag;
    protected String url;

    public abstract RequestCall build();

    public T id(int i) {
        this.id = i;
        return this;
    }

    public T url(String str) {
        this.url = str;
        return this;
    }

    public T tag(Object obj) {
        this.tag = obj;
        return this;
    }

    public T headers(Map<String, String> map) {
        this.headers = map;
        return this;
    }

    public T addHeader(String str, String str2) {
        if (this.headers == null) {
            this.headers = new LinkedHashMap();
        }
        this.headers.put(str, str2);
        return this;
    }
}
