package com.dianping.nvnetwork.tnold.zip.hpack;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http2.Header;
import org.apache.http.entity.mime.MIME;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class l {
    public static ChangeQuickRedirect a;
    public static final int b;
    private static final List<b> c = Arrays.asList(new b(Header.TARGET_AUTHORITY_UTF8, ""), new b(Header.TARGET_METHOD_UTF8, "GET"), new b(Header.TARGET_METHOD_UTF8, "POST"), new b(Header.TARGET_PATH_UTF8, "/"), new b(Header.TARGET_PATH_UTF8, "/index.html"), new b(Header.TARGET_SCHEME_UTF8, "http"), new b(Header.TARGET_SCHEME_UTF8, "https"), new b(Header.RESPONSE_STATUS_UTF8, BasicPushStatus.SUCCESS_CODE), new b(Header.RESPONSE_STATUS_UTF8, "204"), new b(Header.RESPONSE_STATUS_UTF8, "206"), new b(Header.RESPONSE_STATUS_UTF8, "304"), new b(Header.RESPONSE_STATUS_UTF8, "400"), new b(Header.RESPONSE_STATUS_UTF8, "404"), new b(Header.RESPONSE_STATUS_UTF8, "500"), new b("Accept-Charset", ""), new b("Accept-Encoding", "gzip, deflate"), new b("Accept-Language", ""), new b("Accept-Ranges", ""), new b("Accept", ""), new b("Access-Control-Allow-Origin", ""), new b("Age", ""), new b("Allow", ""), new b("Authorization", ""), new b("Cache-Control", ""), new b(MIME.CONTENT_DISPOSITION, ""), new b("Content-Encoding", ""), new b("Content-Language", ""), new b("Content-Length", ""), new b("Content-Location", ""), new b("Content-Range", ""), new b("Content-Type", ""), new b("Cookie", ""), new b("Date", ""), new b("Etag", ""), new b("Expect", ""), new b("Expires", ""), new b("From", ""), new b("Host", ""), new b("If-Match", ""), new b("If-Modified-Since", ""), new b("If-None-Match", ""), new b("If-Range", ""), new b("If-Unmodified-Since", ""), new b("Last-Modified", ""), new b("Link", ""), new b("Location", ""), new b("Max-Forwards", ""), new b("Proxy-Authenticate", ""), new b("Proxy-Authorization", ""), new b("Range", ""), new b("Referer", ""), new b("Refresh", ""), new b("Retry-After", ""), new b("Server", ""), new b("Set-Cookie", ""), new b("Strict-Transport-Security", ""), new b("Transfer-Encoding", ""), new b("User-Agent", ""), new b("Vary", ""), new b("Via", ""), new b("WWW-Authenticate", ""), new b(":m-shark-request-id", ""), new b(":m-shark-encrypt-status", ""), new b(":m-shark-encrypt-status", BasicPushStatus.SUCCESS_CODE), new b(":m-shark-encrypt-status", "600"), new b(":m-shark-time-out", ""), new b("M-SHARK-TRACEID", ""), new b(":m-shark-check-sum", ""), new b(":m-shark-query", ""));
    private static final Map<String, Integer> d;

    static {
        Map<String, Integer> map;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09b3f3c19605ccd8410f68310e31935c", 6917529027641081856L)) {
            map = (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09b3f3c19605ccd8410f68310e31935c");
        } else {
            int size = c.size();
            HashMap hashMap = new HashMap(size);
            while (size > 0) {
                b a2 = a(size);
                hashMap.put(new String(a2.b, 0, a2.b.length, h.b), Integer.valueOf(size));
                size--;
            }
            map = hashMap;
        }
        d = map;
        b = c.size();
    }

    public static b a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f2c8d7ea5b745b149aa0c96e1387790", 6917529027641081856L) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f2c8d7ea5b745b149aa0c96e1387790") : c.get(i - 1);
    }

    public static int a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ed742bd5827dbd3668761486165e715", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ed742bd5827dbd3668761486165e715")).intValue();
        }
        Integer num = d.get(new String(bArr, 0, bArr.length, h.b));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public static int a(byte[] bArr, byte[] bArr2) {
        Object[] objArr = {bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c4d4b8d7b38bacfe715126efe82684e", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c4d4b8d7b38bacfe715126efe82684e")).intValue();
        }
        int a2 = a(bArr);
        if (a2 == -1) {
            return -1;
        }
        while (a2 <= b) {
            b a3 = a(a2);
            if (!h.a(bArr, a3.b)) {
                break;
            } else if (h.a(bArr2, a3.c)) {
                return a2;
            } else {
                a2++;
            }
        }
        return -1;
    }
}
