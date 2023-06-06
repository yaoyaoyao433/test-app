package com.sankuai.titans.debug.adapter.old;

import android.app.Activity;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IOldAppMockIntercept {
    View getDebugView(Activity activity);

    WebResourceResponse interceptRequest(WebResourceRequest webResourceRequest, String str);
}
