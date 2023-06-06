package com.sankuai.meituan.retrofit2;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class ai implements com.sankuai.meituan.retrofit2.raw.b {
    public static ChangeQuickRedirect a;
    private com.sankuai.meituan.retrofit2.raw.b b;
    private aq c;
    private u d;

    public ai(com.sankuai.meituan.retrofit2.raw.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a29e99c961543d63e23d575f737b9474", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a29e99c961543d63e23d575f737b9474");
            return;
        }
        this.b = null;
        this.c = null;
        this.d = null;
        this.b = bVar;
    }

    @Override // com.sankuai.meituan.retrofit2.raw.b
    public final String url() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d87319446b4b3178128a0361c2cbdb7", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d87319446b4b3178128a0361c2cbdb7") : this.b.url();
    }

    @Override // com.sankuai.meituan.retrofit2.raw.b
    public final int code() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7300f2738a602f5a25388cf6ccf14540", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7300f2738a602f5a25388cf6ccf14540")).intValue() : this.b.code();
    }

    @Override // com.sankuai.meituan.retrofit2.raw.b
    public final String reason() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af8ffb16bcb2b1c28f480106911911a3", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af8ffb16bcb2b1c28f480106911911a3") : this.b.reason();
    }

    @Override // com.sankuai.meituan.retrofit2.raw.b
    @Nullable
    public final List<q> headers() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8345b2ec4be3051e6c1e4250191a4de0", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8345b2ec4be3051e6c1e4250191a4de0") : this.b.headers();
    }

    @Override // com.sankuai.meituan.retrofit2.raw.b
    public final ap body() {
        ap body;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7d2db647992c842897576ab3ec3d5ff", 6917529027641081856L)) {
            return (ap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7d2db647992c842897576ab3ec3d5ff");
        }
        if (this.c == null && (body = this.b.body()) != null) {
            this.c = new aq(body);
            this.c.a(this.d);
        }
        return this.c;
    }

    public final void a(u uVar) {
        Object[] objArr = {uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06fd368808f280ef899eef4e727da4d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06fd368808f280ef899eef4e727da4d4");
            return;
        }
        this.d = uVar;
        if (this.c != null) {
            this.c.a(this.d);
        }
    }
}
