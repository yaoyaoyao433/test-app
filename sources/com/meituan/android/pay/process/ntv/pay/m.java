package com.meituan.android.pay.process.ntv.pay;

import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class m {
    public static ChangeQuickRedirect a;
    private static volatile m c;
    public c b;

    public static m a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a94c58c0e631190a215eeab94ac1e4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a94c58c0e631190a215eeab94ac1e4b");
        }
        if (c == null) {
            synchronized (m.class) {
                if (c == null) {
                    c = new m();
                }
            }
        }
        return c;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfe5c5cc2f789be3a63e10c654c9bf3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfe5c5cc2f789be3a63e10c654c9bf3b");
        } else if (this.b != null) {
            a(this.b);
        }
    }

    private void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dfbb148850dfe39cc303b9e28925a9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dfbb148850dfe39cc303b9e28925a9e");
        } else if (cVar == null) {
        } else {
            if (cVar.a()) {
                cVar.b();
            } else {
                cVar.c();
            }
        }
    }

    @MTPaySuppressFBWarnings({"ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD"})
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "871354b7b19c187cabc68dd3481684bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "871354b7b19c187cabc68dd3481684bc");
            return;
        }
        if (this.b != null) {
            this.b = null;
        }
        c = null;
    }
}
