package com.meituan.mtwebkit.internal.system;

import android.webkit.WebResourceResponse;
import com.meituan.mtwebkit.MTWebResourceResponse;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class n extends MTWebResourceResponse {
    public n(WebResourceResponse webResourceResponse) {
        super(true, webResourceResponse.getMimeType(), webResourceResponse.getEncoding(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase(), webResourceResponse.getResponseHeaders(), webResourceResponse.getData());
    }
}
