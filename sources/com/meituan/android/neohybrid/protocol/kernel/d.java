package com.meituan.android.neohybrid.protocol.kernel;

import android.graphics.Bitmap;
import android.support.annotation.RequiresApi;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface d {
    @Deprecated
    void a(c cVar, int i, String str, String str2);

    @RequiresApi(api = 23)
    void a(c cVar, WebResourceRequest webResourceRequest, WebResourceError webResourceError);

    void a(c cVar, String str, Bitmap bitmap);

    void a(d dVar);

    @RequiresApi(api = 26)
    boolean a(c cVar, RenderProcessGoneDetail renderProcessGoneDetail);

    @RequiresApi(api = 24)
    boolean a(c cVar, WebResourceRequest webResourceRequest);

    @Deprecated
    boolean a(c cVar, String str);

    @RequiresApi(api = 21)
    WebResourceResponse b(c cVar, WebResourceRequest webResourceRequest);

    void b(c cVar, String str);
}
