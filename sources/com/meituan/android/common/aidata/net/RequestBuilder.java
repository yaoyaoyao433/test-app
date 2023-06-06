package com.meituan.android.common.aidata.net;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import okhttp3.Request;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RequestBuilder {
    public static final String GET = "GET";
    public static final String POST = "POST";
    public static ChangeQuickRedirect changeQuickRedirect;
    private RequestHeader header;
    private RequestParam param;
    private Request.Builder realBuilder;
    private Request request;
    private String requestMethod;
    private String url;
    private boolean urlChange;

    public RequestBuilder url(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "943f30cc32f3591f22bd87d899edb692", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "943f30cc32f3591f22bd87d899edb692");
        }
        this.urlChange = true ^ TextUtils.equals(this.url, str);
        this.url = str;
        return this;
    }

    public RequestHeader startHeader() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61f87f9e94c233d2d53f120bbceec5f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestHeader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61f87f9e94c233d2d53f120bbceec5f2");
        }
        if (this.header == null) {
            this.header = new RequestHeader(this);
        }
        return this.header;
    }

    public RequestParam startParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e7c2dd76d5850b34985ea3af70f8c0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestParam) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e7c2dd76d5850b34985ea3af70f8c0d");
        }
        if (this.param == null) {
            this.param = new RequestParam(this);
        }
        return this.param;
    }

    public RequestBuilder post() {
        this.requestMethod = "POST";
        return this;
    }

    public RequestBuilder get() {
        this.requestMethod = "GET";
        return this;
    }

    public Request build() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63ba4e0bcf642bf5a221d7fe6c4f3de2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Request) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63ba4e0bcf642bf5a221d7fe6c4f3de2");
        }
        if (this.realBuilder == null) {
            this.realBuilder = new Request.Builder();
        }
        if (this.urlChange) {
            this.realBuilder.url(this.url);
            z = true;
        }
        if (this.header != null && this.header.isHeadChange()) {
            this.realBuilder.headers(this.header.getHeaders());
            z = true;
        }
        if ((this.param != null && this.param.isBodyChange()) || (this.request != null && TextUtils.equals(this.requestMethod, this.request.method()))) {
            this.realBuilder.method(this.requestMethod, this.param.getBody());
            z = true;
        }
        if (z) {
            this.request = this.realBuilder.build();
        }
        return this.request;
    }
}
