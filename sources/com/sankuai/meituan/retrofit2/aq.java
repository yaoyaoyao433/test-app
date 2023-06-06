package com.sankuai.meituan.retrofit2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class aq extends ap {
    public static ChangeQuickRedirect a;
    private ap b;
    private w c;
    private u d;

    public aq(ap apVar) {
        Object[] objArr = {apVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be4f3b47a7319efc93bc1f9f7e3ab420", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be4f3b47a7319efc93bc1f9f7e3ab420");
            return;
        }
        this.b = null;
        this.c = null;
        this.d = null;
        this.b = apVar;
    }

    @Override // com.sankuai.meituan.retrofit2.ap
    public final String contentType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "686b8fc6b3f86115a312ef7f52e77a7f", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "686b8fc6b3f86115a312ef7f52e77a7f") : this.b.contentType();
    }

    @Override // com.sankuai.meituan.retrofit2.ap
    public final long contentLength() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ac022bbf8d67f997efb7e2a0813b588", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ac022bbf8d67f997efb7e2a0813b588")).longValue() : this.b.contentLength();
    }

    @Override // com.sankuai.meituan.retrofit2.ap
    public final InputStream source() {
        InputStream source;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82c643c91b4957958f6fb5e7dd58a203", 6917529027641081856L)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82c643c91b4957958f6fb5e7dd58a203");
        }
        if (this.c == null && (source = this.b.source()) != null) {
            this.c = new w(source);
            this.c.b = this.d;
        }
        return this.c;
    }

    public final void a(u uVar) {
        Object[] objArr = {uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eac89e9f6528323a3ed668555911fc06", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eac89e9f6528323a3ed668555911fc06");
            return;
        }
        this.d = uVar;
        if (this.c != null) {
            this.c.b = this.d;
        }
    }
}
