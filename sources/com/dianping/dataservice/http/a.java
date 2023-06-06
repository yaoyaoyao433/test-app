package com.dianping.dataservice.http;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.InputStream;
import java.net.Proxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a extends com.dianping.dataservice.a implements b {
    public static ChangeQuickRedirect b;
    private String c;
    private InputStream d;
    private List<com.dianping.apache.http.a> e;
    private long f;
    private Proxy g;
    private boolean h;

    public a(String str, String str2, InputStream inputStream, List<com.dianping.apache.http.a> list, long j) {
        this(str, str2, inputStream, list, j, null);
        Object[] objArr = {str, str2, inputStream, list, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d0ebab1346ef541e6e9d0deafc5259f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d0ebab1346ef541e6e9d0deafc5259f");
        }
    }

    private a(String str, String str2, InputStream inputStream, List<com.dianping.apache.http.a> list, long j, Proxy proxy) {
        this(str, str2, inputStream, list, j, null, false);
        Object[] objArr = {str, str2, inputStream, list, new Long(j), null};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ead033af2e6126f1eb25a3a1abe8d8fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ead033af2e6126f1eb25a3a1abe8d8fd");
        }
    }

    private a(String str, String str2, InputStream inputStream, List<com.dianping.apache.http.a> list, long j, Proxy proxy, boolean z) {
        super(str);
        Object[] objArr = {str, str2, inputStream, list, new Long(j), proxy, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b04fe170b3bd02e36a372361e056c8b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b04fe170b3bd02e36a372361e056c8b8");
            return;
        }
        this.c = str2;
        this.d = inputStream;
        this.e = list;
        this.f = j;
        this.g = proxy;
        this.h = false;
    }

    @Override // com.dianping.dataservice.http.b
    public final String b() {
        return this.c;
    }

    public final InputStream c() {
        return this.d;
    }

    @Override // com.dianping.dataservice.http.b
    public final List<com.dianping.apache.http.a> d() {
        return this.e;
    }

    @Override // com.dianping.dataservice.http.b
    public final long e() {
        return this.f;
    }

    @Override // com.dianping.dataservice.http.b
    public final void a(List<com.dianping.apache.http.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24b88ec48817e608700869ddf10407f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24b88ec48817e608700869ddf10407f0");
        } else if (list == null) {
        } else {
            if (this.e != null) {
                this.e.addAll(list);
            } else {
                this.e = list;
            }
        }
    }

    @Override // com.dianping.dataservice.a
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7da2a514d83a3cde06547564ac9b47d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7da2a514d83a3cde06547564ac9b47d4");
        }
        return this.c + ": " + super.toString();
    }
}
