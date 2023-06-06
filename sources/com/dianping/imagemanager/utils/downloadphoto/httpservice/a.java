package com.dianping.imagemanager.utils.downloadphoto.httpservice;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.InputStream;
import java.net.Proxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends d implements i {
    public static ChangeQuickRedirect a;
    private String c;
    private InputStream d;
    private List<l> e;
    private long f;
    private Proxy g;
    private boolean h;

    public a(String str, String str2, InputStream inputStream) {
        this(str, str2, null, null, 0L);
        Object[] objArr = {str, str2, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f6fbcc79db358a65ecd9fbdb3c02ad2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f6fbcc79db358a65ecd9fbdb3c02ad2");
        }
    }

    public a(String str, String str2, InputStream inputStream, List<l> list, long j) {
        this(str, str2, inputStream, null, j, null);
        Object[] objArr = {str, str2, inputStream, null, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c54609e6b383fc61421cc4e121e474d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c54609e6b383fc61421cc4e121e474d8");
        }
    }

    private a(String str, String str2, InputStream inputStream, List<l> list, long j, Proxy proxy) {
        this(str, str2, inputStream, list, j, null, false);
        Object[] objArr = {str, str2, inputStream, list, new Long(j), null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7a44915ee5c09d5237f8bc3dbf648b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7a44915ee5c09d5237f8bc3dbf648b4");
        }
    }

    private a(String str, String str2, InputStream inputStream, List<l> list, long j, Proxy proxy, boolean z) {
        super(str);
        Object[] objArr = {str, str2, inputStream, list, new Long(j), proxy, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "285ab766cd0094734cc1fe536568d424", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "285ab766cd0094734cc1fe536568d424");
            return;
        }
        this.c = str2;
        this.d = inputStream;
        this.e = list;
        this.f = j;
        this.g = proxy;
        this.h = false;
    }

    @Override // com.dianping.imagemanager.utils.downloadphoto.httpservice.i
    public final String a() {
        return this.c;
    }

    @Override // com.dianping.imagemanager.utils.downloadphoto.httpservice.i
    public final InputStream b() {
        return this.d;
    }

    @Override // com.dianping.imagemanager.utils.downloadphoto.httpservice.i
    public final List<l> c() {
        return this.e;
    }

    @Override // com.dianping.imagemanager.utils.downloadphoto.httpservice.i
    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62c9b13108a4a5db1bdb88a3b864a018", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62c9b13108a4a5db1bdb88a3b864a018")).intValue() : com.dianping.imagemanager.base.a.a().j;
    }

    @Override // com.dianping.imagemanager.utils.downloadphoto.httpservice.i
    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "470867f6bcd6ee6ae5ec1a8c025a2404", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "470867f6bcd6ee6ae5ec1a8c025a2404")).intValue() : com.dianping.imagemanager.base.a.a().k;
    }

    @Override // com.dianping.imagemanager.utils.downloadphoto.httpservice.d
    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "944950863136ba113b342260c620aa57", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "944950863136ba113b342260c620aa57");
        }
        return this.c + ": " + super.toString();
    }
}
