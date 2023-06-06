package com.meituan.met.mercury.load.core;

import com.meituan.met.mercury.load.repository.BaseLoadRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class i implements Runnable {
    public static ChangeQuickRedirect d;
    private BaseLoadRequest a;

    public abstract void a();

    public i(BaseLoadRequest baseLoadRequest) {
        Object[] objArr = {baseLoadRequest};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27792002b251a627134bc55c91086db3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27792002b251a627134bc55c91086db3");
        } else {
            this.a = baseLoadRequest;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String baseLoadRequest;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7179e73a593d578dba4ed12704d6a84e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7179e73a593d578dba4ed12704d6a84e");
            return;
        }
        if (this.a == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            baseLoadRequest = sb.toString();
        } else {
            baseLoadRequest = this.a.toString();
        }
        g.b(baseLoadRequest);
        try {
            a();
        } catch (Throwable th) {
            th.printStackTrace();
            com.meituan.met.mercury.load.report.d.a("DDRequestRunnable", "workRun", th);
        }
    }
}
