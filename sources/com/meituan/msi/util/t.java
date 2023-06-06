package com.meituan.msi.util;

import android.os.SystemClock;
import com.meituan.msi.api.download.DownloadOrUploadPerformanceEventInner;
import com.meituan.msi.bean.EventHandler;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class t {
    public static ChangeQuickRedirect a;

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "180b95c4b322e9e883fcc7de262b88f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "180b95c4b322e9e883fcc7de262b88f0");
        }
        if (str == null) {
            return null;
        }
        return str.replace(CommonConstant.Symbol.DOUBLE_QUOTES, "");
    }

    public static void a(MsiContext msiContext, DownloadOrUploadPerformanceEventInner downloadOrUploadPerformanceEventInner, Request request, Response response, long j, String str) {
        Object[] objArr = {msiContext, downloadOrUploadPerformanceEventInner, request, response, new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec76252a7ef674df7ec53ffb4a64278f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec76252a7ef674df7ec53ffb4a64278f");
            return;
        }
        a(request, response, downloadOrUploadPerformanceEventInner);
        downloadOrUploadPerformanceEventInner.apiName = str;
        downloadOrUploadPerformanceEventInner.value = SystemClock.elapsedRealtime() - j;
        msiContext.getEventDispatcher().a(EventHandler.EVENT_DOWNLOAD_OR_UPLOAD_PERFORMANCE_INNER, w.a(downloadOrUploadPerformanceEventInner));
    }

    public static DownloadOrUploadPerformanceEventInner b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86cbaf7bc5a1075b53613b3933a76dd9", RobustBitConfig.DEFAULT_VALUE)) {
            return (DownloadOrUploadPerformanceEventInner) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86cbaf7bc5a1075b53613b3933a76dd9");
        }
        DownloadOrUploadPerformanceEventInner downloadOrUploadPerformanceEventInner = new DownloadOrUploadPerformanceEventInner();
        downloadOrUploadPerformanceEventInner.fullUrl = str;
        int indexOf = str.indexOf(CommonConstant.Symbol.QUESTION_MARK);
        if (indexOf <= 0) {
            indexOf = str.length();
        }
        downloadOrUploadPerformanceEventInner.url = str.substring(0, indexOf);
        return downloadOrUploadPerformanceEventInner;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(okhttp3.Request r11, okhttp3.Response r12, com.meituan.msi.api.download.DownloadOrUploadPerformanceEventInner r13) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r11
            r8 = 1
            r0[r8] = r12
            r1 = 2
            r0[r1] = r13
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.msi.util.t.a
            java.lang.String r10 = "8a2b00ddd99f8ba63c341e56d89479ea"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            r11 = 0
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L22:
            okhttp3.HttpUrl r0 = r11.url()
            java.lang.String r0 = r0.toString()
            r1 = 0
            okhttp3.RequestBody r3 = r11.body()     // Catch: java.io.IOException -> L3c
            if (r3 != 0) goto L33
            goto L40
        L33:
            okhttp3.RequestBody r3 = r11.body()     // Catch: java.io.IOException -> L3c
            long r3 = r3.contentLength()     // Catch: java.io.IOException -> L3c
            goto L41
        L3c:
            r3 = move-exception
            r3.printStackTrace()
        L40:
            r3 = r1
        L41:
            byte[] r5 = r0.getBytes()
            int r5 = r5.length
            long r5 = (long) r5
            long r3 = r3 + r5
            okhttp3.Headers r5 = r11.headers()
            int r5 = a(r5)
            long r5 = (long) r5
            long r3 = r3 + r5
            r13.requestSize = r3
            java.lang.String r11 = r11.method()
            r13.requestMethod = r11
            android.net.Uri r11 = android.net.Uri.parse(r0)
            java.lang.String r11 = r11.getScheme()
            r13.protocol = r11
            if (r12 != 0) goto L67
            return
        L67:
            okhttp3.ResponseBody r11 = r12.body()
            if (r11 != 0) goto L6e
            goto L76
        L6e:
            okhttp3.ResponseBody r11 = r12.body()
            long r1 = r11.contentLength()
        L76:
            okhttp3.Headers r11 = r12.headers()
            int r11 = a(r11)
            long r3 = (long) r11
            long r1 = r1 + r3
            r13.responseSize = r1
            int r11 = r12.code()
            r13.statusCode = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.util.t.a(okhttp3.Request, okhttp3.Response, com.meituan.msi.api.download.DownloadOrUploadPerformanceEventInner):void");
    }

    private static int a(Headers headers) {
        Object[] objArr = {headers};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7993da7095275a3864abf237b8e001d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7993da7095275a3864abf237b8e001d6")).intValue();
        }
        if (headers == null || headers.size() == 0) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            sb.append(headers.name(i));
            sb.append(headers.value(i));
        }
        return sb.toString().getBytes().length;
    }
}
