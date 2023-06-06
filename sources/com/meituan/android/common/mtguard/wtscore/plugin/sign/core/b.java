package com.meituan.android.common.mtguard.wtscore.plugin.sign.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.URI;
import java.util.Map;
/* loaded from: classes2.dex */
public abstract class b implements c {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String f;
    public Map<String, String> g;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d2f8222c14d116c173cbe6589e106b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d2f8222c14d116c173cbe6589e106b7");
            return;
        }
        this.f = null;
        this.g = null;
    }

    private void a(String str) {
        this.f = str;
    }

    private void a(Map<String, String> map) {
        this.g = map;
    }

    public abstract URI a();

    public abstract boolean b();

    @Override // com.meituan.android.common.mtguard.wtscore.plugin.sign.core.c
    public String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eef5b0b056f69167fa484b5a425e5e1c", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eef5b0b056f69167fa484b5a425e5e1c");
        }
        URI a = a();
        if (a == null) {
            return null;
        }
        return a.getHost();
    }

    @Override // com.meituan.android.common.mtguard.wtscore.plugin.sign.core.c
    public final String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05230c2e76323502c748138829ba674d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05230c2e76323502c748138829ba674d");
        }
        URI a = a();
        if (a == null) {
            return null;
        }
        return a.getScheme();
    }

    @Override // com.meituan.android.common.mtguard.wtscore.plugin.sign.core.c
    public final int h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6da1890ef77ae9a42e5a45a07162e3b", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6da1890ef77ae9a42e5a45a07162e3b")).intValue();
        }
        URI a = a();
        if (a == null) {
            return -1;
        }
        return a.getPort();
    }

    @Override // com.meituan.android.common.mtguard.wtscore.plugin.sign.core.c
    public final String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0b54f7f3a000079f48e30871e4e9497", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0b54f7f3a000079f48e30871e4e9497");
        }
        URI a = a();
        if (a == null) {
            return null;
        }
        return a.getRawPath();
    }

    @Override // com.meituan.android.common.mtguard.wtscore.plugin.sign.core.c
    public final String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82a9625658e69e95a3e114f6a3d23b37", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82a9625658e69e95a3e114f6a3d23b37");
        }
        if (this.f == null || this.f.length() <= 0) {
            this.f = b() ? "POST" : "GET";
            return this.f;
        }
        return this.f;
    }

    @Override // com.meituan.android.common.mtguard.wtscore.plugin.sign.core.c
    public final URI k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d995f18069462ec1c5124437d7067a6f", 6917529027641081856L) ? (URI) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d995f18069462ec1c5124437d7067a6f") : a();
    }

    @Override // com.meituan.android.common.mtguard.wtscore.plugin.sign.core.c
    public final Map<String, String> l() {
        return this.g;
    }
}
