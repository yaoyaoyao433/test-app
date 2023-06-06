package com.sankuai.meituan.retrofit2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.meituan.retrofit2.am;
import com.sankuai.meituan.retrofit2.d;
import com.sankuai.meituan.retrofit2.t;
import com.sankuai.titans.proxy.util.Constants;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k<T> implements an {
    public static ChangeQuickRedirect a;
    private final au<T> b;
    private final Object[] c;

    public k(au<T> auVar, Object[] objArr) {
        Object[] objArr2 = {auVar, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "18003931011393a88ecbd7b546ec9d2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "18003931011393a88ecbd7b546ec9d2b");
            return;
        }
        this.b = auVar;
        this.c = objArr;
    }

    @Override // com.sankuai.meituan.retrofit2.an
    public final aj a() throws IOException {
        t b;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9716a24fdbf7a409c9ef56569100ae1d", 6917529027641081856L)) {
            return (aj) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9716a24fdbf7a409c9ef56569100ae1d");
        }
        au<T> auVar = this.b;
        Object[] objArr2 = this.c;
        Object[] objArr3 = {objArr2};
        ChangeQuickRedirect changeQuickRedirect2 = au.a;
        if (PatchProxy.isSupport(objArr3, auVar, changeQuickRedirect2, false, "1a1299b79050f278ce5b968d9ee6b825", 6917529027641081856L)) {
            return (aj) PatchProxy.accessDispatch(objArr3, auVar, changeQuickRedirect2, false, "1a1299b79050f278ce5b968d9ee6b825");
        }
        am amVar = new am(auVar.h, auVar.g, auVar.i, auVar.j, auVar.k, auVar.l, auVar.m, auVar.n, auVar.o, auVar.p);
        af<?>[] afVarArr = auVar.q;
        int length = objArr2 != null ? objArr2.length : 0;
        if (length != afVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + afVarArr.length + CommonConstant.Symbol.BRACKET_RIGHT);
        }
        for (int i = 0; i < length; i++) {
            afVarArr[i].a(amVar, objArr2[i]);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = am.a;
        if (PatchProxy.isSupport(objArr4, amVar, changeQuickRedirect3, false, "42541f0c21050d3e46c69f736d041770", 6917529027641081856L)) {
            return (aj) PatchProxy.accessDispatch(objArr4, amVar, changeQuickRedirect3, false, "42541f0c21050d3e46c69f736d041770");
        }
        t.a aVar = amVar.e;
        if (aVar != null) {
            b = aVar.b();
        } else {
            t tVar = amVar.c;
            String str = amVar.d;
            Object[] objArr5 = {str};
            ChangeQuickRedirect changeQuickRedirect4 = t.a;
            if (PatchProxy.isSupport(objArr5, tVar, changeQuickRedirect4, false, "e80a383622d78cab611a58939c5b33cf", 6917529027641081856L)) {
                b = (t) PatchProxy.accessDispatch(objArr5, tVar, changeQuickRedirect4, false, "e80a383622d78cab611a58939c5b33cf");
            } else {
                t.a d = tVar.d(str);
                b = d != null ? d.b() : null;
            }
            if (b == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + amVar.c + ", Relative: " + amVar.d);
            }
        }
        am.a aVar2 = amVar.n;
        if (aVar2 == null) {
            if (amVar.m != null) {
                aVar2 = amVar.m.a();
            } else if (amVar.l != null) {
                aVar2 = amVar.l.a();
            } else if (amVar.h) {
                aVar2 = al.a((ad) null, new byte[0]);
            }
        }
        ad adVar = amVar.g;
        if (adVar != null) {
            if (aVar2 != null) {
                aVar2 = new am.a(aVar2, adVar);
            } else {
                amVar.f.a("Content-Type", adVar.toString());
            }
        }
        String str2 = amVar.b;
        Object[] objArr6 = {str2, aVar2};
        ChangeQuickRedirect changeQuickRedirect5 = am.a;
        if (PatchProxy.isSupport(objArr6, amVar, changeQuickRedirect5, false, "74b317dc457b9d22864898479cea424a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr6, amVar, changeQuickRedirect5, false, "74b317dc457b9d22864898479cea424a");
        } else if (str2 == null) {
            throw new NullPointerException("method == null");
        } else {
            if (str2.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            }
            if (aVar2 != null) {
                Object[] objArr7 = {str2};
                ChangeQuickRedirect changeQuickRedirect6 = am.a;
                if (PatchProxy.isSupport(objArr7, amVar, changeQuickRedirect6, false, "2a13418e7fa0accd8f38860830b9a1d2", 6917529027641081856L)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr7, amVar, changeQuickRedirect6, false, "2a13418e7fa0accd8f38860830b9a1d2")).booleanValue();
                } else if (amVar.a(str2) || str2.equals(Constants.KEY_METHOD_OPTIONS) || str2.equals("DELETE") || str2.equals("PROPFIND") || str2.equals("MKCOL") || str2.equals("LOCK")) {
                    z = true;
                }
                if (!z) {
                    throw new IllegalArgumentException("method " + str2 + " must not have a request body.");
                }
            }
            if (aVar2 == null && amVar.a(str2)) {
                throw new IllegalArgumentException("method " + str2 + " must have a request body.");
            }
        }
        return new aj(b.toString(), amVar.b, amVar.f.a().b, aVar2, amVar.i, amVar.j, (amVar.k == null ? new d.a() : amVar.k).a());
    }
}
