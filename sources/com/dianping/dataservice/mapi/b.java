package com.dianping.dataservice.mapi;

import com.dianping.nvnetwork.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.InputStream;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b<T> extends com.dianping.dataservice.mapi.a<T> {
    public static ChangeQuickRedirect g;
    public boolean h;
    public boolean i;
    public a j;
    public HostnameVerifier k;
    public SSLSocketFactory l;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        Request a(Request request);
    }

    private b(String str, String str2, InputStream inputStream, c cVar, boolean z, int i, List<com.dianping.apache.http.a> list, long j, com.dianping.archive.c<T> cVar2) {
        super(str, str2, inputStream, cVar, z, 0, list, j, cVar2);
        Object[] objArr = {str, str2, inputStream, cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), 0, list, new Long(j), cVar2};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4bb1970cfbd6945a39f6eb59e764958", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4bb1970cfbd6945a39f6eb59e764958");
            return;
        }
        this.h = false;
        this.i = true;
    }

    public b(String str, String str2, InputStream inputStream, c cVar, boolean z, List<com.dianping.apache.http.a> list, long j, com.dianping.archive.c<T> cVar2) {
        this(str, str2, inputStream, cVar, z, 0, list, j, cVar2);
        Object[] objArr = {str, str2, inputStream, cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), list, new Long(j), cVar2};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0c691e33acadeeb9f8fcc12d8a0c2fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0c691e33acadeeb9f8fcc12d8a0c2fa");
        }
    }

    private b(String str, String str2, InputStream inputStream, c cVar, boolean z, List<com.dianping.apache.http.a> list, long j) {
        this(str, str2, inputStream, cVar, z, list, 0L, null);
        Object[] objArr = {str, str2, inputStream, cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), list, 0L};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d16df7b91964313292bcc8352476aee3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d16df7b91964313292bcc8352476aee3");
        }
    }

    private b(String str, String str2, InputStream inputStream, c cVar, boolean z, List<com.dianping.apache.http.a> list) {
        this(str, str2, inputStream, cVar, false, null, 0L);
        Object[] objArr = {str, str2, inputStream, cVar, (byte) 0, null};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bd8060b177f85f1bc14b30540213ef9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bd8060b177f85f1bc14b30540213ef9");
        }
    }

    public static e a(String str, c cVar) {
        Object[] objArr = {str, cVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4256dace59ce8a379305cf96914a276", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4256dace59ce8a379305cf96914a276") : new b(str, "GET", null, cVar, false, null);
    }

    public static e a(String str, String... strArr) {
        Object[] objArr = {str, strArr};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2bebd791d2878da29c8e14c42baf619", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2bebd791d2878da29c8e14c42baf619") : new b(str, "POST", new d(strArr), c.DISABLED, false, null);
    }

    public static <T> e<T> a(String str, com.dianping.archive.c<T> cVar, String... strArr) {
        Object[] objArr = {str, cVar, strArr};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7241a110887b827de368b1933e4de990", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7241a110887b827de368b1933e4de990") : new b(str, "POST", new d(strArr), c.DISABLED, false, null, 0L, cVar);
    }
}
