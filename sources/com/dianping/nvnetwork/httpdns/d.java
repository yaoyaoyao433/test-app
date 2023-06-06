package com.dianping.nvnetwork.httpdns;

import android.net.SSLSessionCache;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dianping.com.nvlinker.NVLinker;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static List<String> b = new CopyOnWriteArrayList();
    private static volatile SSLSessionCache c;

    public static void a(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5dd813d4de55567cfb54b86781b9f95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5dd813d4de55567cfb54b86781b9f95");
            return;
        }
        b.clear();
        b.addAll(list);
    }

    public static List<String> a() {
        return b;
    }

    public static HttpURLConnection a(String str, HostnameVerifier hostnameVerifier, SSLSocketFactory sSLSocketFactory) throws IOException {
        Object[] objArr = {str, hostnameVerifier, sSLSocketFactory};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "33cfe2a1b6406f28f7c3bc470c96c5b4", 6917529027641081856L) ? (HttpURLConnection) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "33cfe2a1b6406f28f7c3bc470c96c5b4") : (HttpURLConnection) b.a().a(str, hostnameVerifier, sSLSocketFactory);
    }

    public static SSLSessionCache b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0743352355296d372609b404f0c8d735", 6917529027641081856L)) {
            return (SSLSessionCache) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0743352355296d372609b404f0c8d735");
        }
        if (NVLinker.getContext() != null && c == null) {
            c = new SSLSessionCache(NVLinker.getContext());
        }
        return c;
    }
}
