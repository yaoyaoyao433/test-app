package com.meituan.mtmap.rendersdk;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.mtmap.rendersdk.HttpCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.NoRouteToHostException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class HTTPRequest implements HttpCallback.HttpResponse {
    private static final int CONNECTION_ERROR = 0;
    private static final Locale MTMAP_LOCALE = Locale.US;
    private static final int PERMANENT_ERROR = 2;
    private static final int TEMPORARY_ERROR = 1;
    private static final String TILE_REQUEST_FILTER = "tile/vector?";
    public static ChangeQuickRedirect changeQuickRedirect;
    private HttpCallback.HttpRequest httpRequest;
    private ReentrantLock mLock;
    private long mNativePtr;
    private String mUserAgentString;
    private String resourceUrl;

    private native void nativeOnFailure(int i, String str);

    private native void nativeOnResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr);

    public HTTPRequest(long j, String str, String str2, String str3, String str4, int[] iArr, String str5) {
        Object[] objArr = {new Long(j), str, str2, str3, str4, iArr, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0f6fa1609136c27da92573830f088c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0f6fa1609136c27da92573830f088c4");
            return;
        }
        this.mUserAgentString = null;
        this.mLock = new ReentrantLock();
        this.mNativePtr = 0L;
        this.mNativePtr = j;
        this.resourceUrl = str;
        if (this.httpRequest == null) {
            this.httpRequest = InnerInitializer.getHttpRequest();
            if (this.httpRequest != null) {
                this.httpRequest.setHttpResponse(this);
            }
        }
        try {
            if (!InnerInitializer.networkAvailable()) {
                throw new NoRouteToHostException("No Internet connection available.");
            }
            Uri parse = Uri.parse(str);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap.put("User-Agent", getUserAgent());
            if (str2.length() > 0) {
                hashMap.put("If-None-Match", str2);
            } else if (str3.length() > 0) {
                hashMap.put("If-Modified-Since", str3);
            }
            if (TextUtils.isEmpty(str4)) {
                hashMap2.put("key", InnerInitializer.getMapKey());
                hashMap2.put("custom_data", iArr);
                if (!TextUtils.isEmpty(parse.getQuery())) {
                    for (String str6 : parse.getQueryParameterNames()) {
                        hashMap2.put(str6, parse.getQueryParameter(str6));
                    }
                }
                Uri parse2 = Uri.parse(parse.getScheme() + "://" + parse.getHost() + parse.getPath());
                if (this.httpRequest != null) {
                    this.httpRequest.get(parse2, hashMap, hashMap2);
                }
            }
        } catch (Exception e) {
            onFailure(e);
        }
    }

    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "118d546b215386021828f2764d5306cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "118d546b215386021828f2764d5306cb");
            return;
        }
        if (this.httpRequest != null) {
            this.httpRequest.cancel();
        }
        this.mLock.lock();
        this.mNativePtr = 0L;
        this.mLock.unlock();
    }

    @Override // com.meituan.mtmap.rendersdk.HttpCallback.HttpResponse
    public void onResponse(int i, Map<String, Object> map, byte[] bArr) {
        Object[] objArr = {Integer.valueOf(i), map, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "814f44d0ca319cf02c180191d5474051", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "814f44d0ca319cf02c180191d5474051");
            return;
        }
        try {
            if (TextUtils.equals(this.resourceUrl, TILE_REQUEST_FILTER) && HttpCallback.onHttpResponse != null) {
                HttpCallback.onHttpResponse.onTileResponse(true);
            }
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
        this.mLock.lock();
        try {
            if (InnerInitializer.canNativeBeUsed("HTTPRequest.onResponse") && this.mNativePtr != 0) {
                nativeOnResponse(i, (map == null || !map.containsKey("ETag")) ? "" : map.get("ETag").toString(), (map == null || !map.containsKey("Last-Modified")) ? "" : map.get("Last-Modified").toString(), (map == null || !map.containsKey("Cache-Control")) ? "" : map.get("Cache-Control").toString(), (map == null || !map.containsKey("Expires")) ? "" : map.get("Expires").toString(), (map == null || !map.containsKey("Retry-After")) ? "" : map.get("Retry-After").toString(), (map == null || !map.containsKey("x-rate-limit-reset")) ? "" : map.get("x-rate-limit-reset").toString(), bArr);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:6|(1:8)(1:58)|9|10|(10:21|(1:54)|27|(3:31|(1:33)(1:36)|34)|37|38|39|(1:43)|45|46)|55|27|(4:29|31|(0)(0)|34)|37|38|39|(2:41|43)|45|46) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0092, code lost:
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009c, code lost:
        throw r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    @Override // com.meituan.mtmap.rendersdk.HttpCallback.HttpResponse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onFailure(java.lang.Exception r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.mtmap.rendersdk.HTTPRequest.changeQuickRedirect
            java.lang.String r11 = "0c1c80b271cad0342e8bf2fca68762a1"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            r1 = 2
            java.lang.String r2 = r13.getMessage()
            if (r2 == 0) goto L27
            java.lang.String r2 = r13.getMessage()
            goto L29
        L27:
            java.lang.String r2 = "Error processing the request"
        L29:
            boolean r3 = r13 instanceof java.net.NoRouteToHostException     // Catch: java.lang.Throwable -> L6e
            if (r3 != 0) goto L54
            boolean r3 = r13 instanceof java.net.UnknownHostException     // Catch: java.lang.Throwable -> L6e
            if (r3 != 0) goto L54
            boolean r3 = r13 instanceof java.net.SocketException     // Catch: java.lang.Throwable -> L6e
            if (r3 != 0) goto L54
            boolean r3 = r13 instanceof java.net.ProtocolException     // Catch: java.lang.Throwable -> L6e
            if (r3 != 0) goto L54
            boolean r3 = r13 instanceof javax.net.ssl.SSLException     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto L3e
            goto L54
        L3e:
            boolean r3 = r13 instanceof java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L6e
            if (r3 != 0) goto L52
            boolean r3 = r13 instanceof java.io.IOException     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto L55
            java.lang.String r13 = r13.getMessage()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = "Canceled"
            boolean r13 = r13.equals(r3)     // Catch: java.lang.Throwable -> L6e
            if (r13 == 0) goto L55
        L52:
            r1 = 1
            goto L55
        L54:
            r1 = 0
        L55:
            java.lang.String r13 = r12.resourceUrl     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = "tile/vector?"
            boolean r13 = android.text.TextUtils.equals(r13, r3)     // Catch: java.lang.Throwable -> L6e
            if (r13 == 0) goto L72
            com.meituan.mtmap.rendersdk.HttpCallback$OnHttpResponse r13 = com.meituan.mtmap.rendersdk.HttpCallback.onHttpResponse     // Catch: java.lang.Throwable -> L6e
            if (r13 == 0) goto L72
            com.meituan.mtmap.rendersdk.HttpCallback$OnHttpResponse r13 = com.meituan.mtmap.rendersdk.HttpCallback.onHttpResponse     // Catch: java.lang.Throwable -> L6e
            if (r1 != r0) goto L69
            goto L6a
        L69:
            r0 = 0
        L6a:
            r13.onTileResponse(r0)     // Catch: java.lang.Throwable -> L6e
            goto L72
        L6e:
            r13 = move-exception
            com.meituan.mtmap.rendersdk.SdkExceptionHandler.handleException(r13)
        L72:
            java.util.concurrent.locks.ReentrantLock r13 = r12.mLock
            r13.lock()
            java.lang.String r13 = "HTTPRequest.onFailure"
            boolean r13 = com.meituan.mtmap.rendersdk.InnerInitializer.canNativeBeUsed(r13)     // Catch: java.lang.Throwable -> L92
            if (r13 == 0) goto L8a
            long r3 = r12.mNativePtr     // Catch: java.lang.Throwable -> L92
            r5 = 0
            int r13 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r13 == 0) goto L8a
            r12.nativeOnFailure(r1, r2)     // Catch: java.lang.Throwable -> L92
        L8a:
            java.util.concurrent.locks.ReentrantLock r13 = r12.mLock
            r13.unlock()
            return
        L90:
            r13 = move-exception
            goto L97
        L92:
            r13 = move-exception
            com.meituan.mtmap.rendersdk.SdkExceptionHandler.handleException(r13)     // Catch: java.lang.Throwable -> L90
            goto L8a
        L97:
            java.util.concurrent.locks.ReentrantLock r0 = r12.mLock
            r0.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mtmap.rendersdk.HTTPRequest.onFailure(java.lang.Exception):void");
    }

    private String getUserAgent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b853f4f0a264e64b78a49b5345b81e86", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b853f4f0a264e64b78a49b5345b81e86");
        }
        if (this.mUserAgentString == null) {
            String format = String.format("%s %s (%s) Android/%s (%s)", NativeMap.SDK_EVENTS_USER_AGENT, NativeMap.SDK_VERSION_STRING, NativeMap.GIT_REVISION_SHORT, Integer.valueOf(Build.VERSION.SDK_INT), Build.CPU_ABI);
            this.mUserAgentString = format;
            return format;
        }
        return this.mUserAgentString;
    }
}
