package com.sankuai.xm.login.manager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class a implements com.sankuai.xm.base.g, g {
    public static ChangeQuickRedirect e;

    public abstract void a(int i, byte[] bArr);

    public abstract void a(long j, int i);

    public abstract void a(com.sankuai.xm.login.beans.c cVar);

    public abstract void a(boolean z);

    public abstract void c(int i);

    @Override // com.sankuai.xm.login.manager.g
    public final void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7a0a6bb9fafd208fd4e0014e930c3f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7a0a6bb9fafd208fd4e0014e930c3f9");
        } else if (a(i)) {
            c(i);
        } else {
            a("onStatusChanged", "status:" + i);
        }
    }

    @Override // com.sankuai.xm.login.manager.g
    public final void b(int i, byte[] bArr) {
        Object[] objArr = {Integer.valueOf(i), bArr};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4818f1bcdd1ba1598a21a7391441e1e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4818f1bcdd1ba1598a21a7391441e1e");
        } else if (b(i)) {
            a(i, bArr);
        } else {
            a("onData", "uri:" + i);
        }
    }

    @Override // com.sankuai.xm.login.manager.g
    public final void a_(com.sankuai.xm.login.beans.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a28fe03f61f8c20138a59684eed551b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a28fe03f61f8c20138a59684eed551b3");
        } else if (a(3)) {
            a(cVar);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(cVar);
            a("onAuth", sb.toString());
        }
    }

    @Override // com.sankuai.xm.login.manager.g
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a704a52d13b01e9a69c6208bb5193f1a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a704a52d13b01e9a69c6208bb5193f1a");
        } else if (a(-2)) {
            a(z);
        } else {
            a("onLogoff", "offline:" + z);
        }
    }

    @Override // com.sankuai.xm.login.manager.g
    public final void b(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e9e17aec1a98243af804694fb79e960", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e9e17aec1a98243af804694fb79e960");
        } else if (a(-3)) {
            a(j, i);
        } else {
            a("onKickedOut", j + CommonConstant.Symbol.COLON + i);
        }
    }

    private void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27eecc5e6c902b67f8c35de0a637ea8d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27eecc5e6c902b67f8c35de0a637ea8d");
        } else {
            com.sankuai.xm.login.d.c("AccessConnListener::%s::discard::%s, %s", str, str2, this);
        }
    }
}
