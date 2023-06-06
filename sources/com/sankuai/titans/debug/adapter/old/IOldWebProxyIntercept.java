package com.sankuai.titans.debug.adapter.old;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IOldWebProxyIntercept {
    WebResourceResponse interceptRequest(WebResourceRequest webResourceRequest);

    void setProxyUrl(String str);
}
