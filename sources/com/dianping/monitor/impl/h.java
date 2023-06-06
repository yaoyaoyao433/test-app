package com.dianping.monitor.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e7bcbf9006a471163d119dd4414c260", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e7bcbf9006a471163d119dd4414c260");
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            URL url = new URL(str);
            return url.getHost() + url.getPath();
        } catch (Throwable th) {
            com.dianping.monitor.a.a(th);
            return null;
        }
    }

    private static int a(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a073ec62a419501e1e82578c7a8eb98e", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a073ec62a419501e1e82578c7a8eb98e")).intValue();
        }
        if (map == null || map.size() == 0) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            sb.append(str);
            sb.append(map.get(str));
        }
        return sb.toString().getBytes().length;
    }

    public static int a(URLConnection uRLConnection) {
        int i = 0;
        Object[] objArr = {uRLConnection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "922646f6922dc01b64f7bfee3558e7b6", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "922646f6922dc01b64f7bfee3558e7b6")).intValue();
        }
        if (uRLConnection == null) {
            return 0;
        }
        try {
            i = 0 + b(uRLConnection.getRequestProperties());
            return i + uRLConnection.getURL().toString().getBytes().length;
        } catch (Throwable th) {
            com.dianping.monitor.a.a(th);
            return i;
        }
    }

    private static int b(Map<String, List<String>> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ddc2df9f6bc1f4e277950e92d4f41b3c", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ddc2df9f6bc1f4e277950e92d4f41b3c")).intValue();
        }
        if (map == null || map.size() == 0) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            if (str != null) {
                sb.append(str);
                List<String> list = map.get(str);
                if (list != null) {
                    for (String str2 : list) {
                        if (str2 != null) {
                            sb.append(str2);
                        }
                    }
                }
            }
        }
        return sb.toString().getBytes().length;
    }

    public static int b(URLConnection uRLConnection) {
        int i;
        Object[] objArr = {uRLConnection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4a73014879842ab7f25e6926692fe2c", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4a73014879842ab7f25e6926692fe2c")).intValue();
        }
        try {
            i = b(uRLConnection.getHeaderFields());
            try {
                int contentLength = uRLConnection.getContentLength();
                return contentLength > 0 ? i + contentLength : i;
            } catch (Throwable th) {
                th = th;
                com.dianping.monitor.a.a(th);
                return i;
            }
        } catch (Throwable th2) {
            th = th2;
            i = 0;
        }
    }

    public static String a(Throwable th, String str) {
        Object[] objArr = {th, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44f2879210c47df63e01e037fc9ae987", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44f2879210c47df63e01e037fc9ae987");
        }
        if (th == null) {
            return "";
        }
        try {
            String b = com.dianping.monitor.a.b(th);
            StringBuilder sb = new StringBuilder("exception:");
            sb.append(th.getClass());
            sb.append(",errorMessage:");
            if (b == null) {
                b = "";
            }
            sb.append(URLEncoder.encode(b));
            sb.append(" , url: ");
            sb.append(str);
            return sb.toString();
        } catch (Throwable th2) {
            com.dianping.monitor.a.a(th2);
            return "";
        }
    }

    public static int a(dianping.com.remoteshark.b bVar) {
        int i = 0;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d409885b1e90c07f53ea9e8b427f06f", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d409885b1e90c07f53ea9e8b427f06f")).intValue();
        }
        if (bVar == null) {
            return 0;
        }
        try {
            InputStream inputStream = bVar.c;
            if (inputStream != null && inputStream.markSupported()) {
                inputStream.reset();
            }
            i = 0 + (inputStream != null ? inputStream.available() : 0);
            return i + a(bVar.b) + bVar.a.getBytes().length;
        } catch (Throwable th) {
            th.printStackTrace();
            return i;
        }
    }

    public static int a(dianping.com.remoteshark.c cVar) {
        int i = 0;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42b670c68d8ff1772aae73b9b105760c", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42b670c68d8ff1772aae73b9b105760c")).intValue();
        }
        if (cVar == null) {
            return 0;
        }
        try {
            i = 0 + (cVar.c != null ? cVar.c.length : 0);
            return i + a(cVar.f);
        } catch (Throwable th) {
            th.printStackTrace();
            return i;
        }
    }
}
