package com.meituan.mtmap.rendersdk;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class HttpCallback {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static volatile HttpRequest httpRequest;
    public static volatile OnHttpResponse onHttpResponse;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface HttpRequest {
        void cancel();

        void get(Uri uri, Map<String, Object> map, Map<String, Object> map2);

        void post(Uri uri, Map<String, Object> map, Map<String, Object> map2);

        void setHttpResponse(HttpResponse httpResponse);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface HttpRequestInject {
        HttpRequest getHttpRequest();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface HttpResponse {
        void onFailure(Exception exc);

        void onResponse(int i, Map<String, Object> map, byte[] bArr);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface OnHttpResponse {
        void onTileResponse(boolean z);
    }

    public static void setOnHttpResponse(OnHttpResponse onHttpResponse2) {
        onHttpResponse = onHttpResponse2;
    }

    public static void setHttpRequest(HttpRequest httpRequest2) {
        httpRequest = httpRequest2;
    }
}
