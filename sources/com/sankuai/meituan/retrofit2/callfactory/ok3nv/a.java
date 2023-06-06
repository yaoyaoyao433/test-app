package com.sankuai.meituan.retrofit2.callfactory.ok3nv;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.raw.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements a.b {
    public static ChangeQuickRedirect a;
    public boolean b;
    private com.sankuai.meituan.retrofit2.callfactory.okhttp3.a c;
    private com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a d;

    public static a a(com.sankuai.meituan.retrofit2.callfactory.okhttp3.a aVar, com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a aVar2) {
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4eb71ddca79a6f16033dc046a00d4abf", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4eb71ddca79a6f16033dc046a00d4abf") : new a(aVar, aVar2);
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21ccff60d4161ed8be4cfbc5bc4e878a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21ccff60d4161ed8be4cfbc5bc4e878a");
        } else {
            this.b = false;
        }
    }

    private a(com.sankuai.meituan.retrofit2.callfactory.okhttp3.a aVar, com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a aVar2) {
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccd2bc9ec9bc8354385b6bb1e3fbc3ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccd2bc9ec9bc8354385b6bb1e3fbc3ef");
            return;
        }
        this.b = false;
        this.c = aVar;
        this.d = aVar2;
    }

    @Override // com.sankuai.meituan.retrofit2.raw.a.b
    public final void a(boolean z) {
        this.b = z;
    }

    @Override // com.sankuai.meituan.retrofit2.raw.a.InterfaceC0637a
    public final com.sankuai.meituan.retrofit2.raw.a get(aj ajVar) {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c65f6288e60e26ebe0e7e74168ad07b6", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c65f6288e60e26ebe0e7e74168ad07b6");
        }
        if (this.b) {
            return this.d.get(ajVar);
        }
        return this.c.get(ajVar);
    }
}
