package com.meituan.met.mercury.load.repository.task;

import com.meituan.met.mercury.load.core.f;
import com.meituan.met.mercury.load.utils.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends a {
    public static ChangeQuickRedirect p;
    private String q;

    public b(String str, String str2, File file, boolean z) {
        Object[] objArr = {str, str2, file, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d8c78ced220c3b33a23d401d8e02d1b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d8c78ced220c3b33a23d401d8e02d1b");
            return;
        }
        this.q = str;
        this.c = str2;
        this.d = file;
        this.n = z;
    }

    @Override // com.meituan.met.mercury.load.repository.task.a
    public final void f() {
        String str;
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f21daeacd5ba6326964207d3cfa8667b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f21daeacd5ba6326964207d3cfa8667b");
            return;
        }
        e();
        if (this.d.exists() && e.a(this.d, this.c)) {
            this.e = true;
            this.m = true;
            a(this.d.length(), 0);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = this.k > 0 ? "preloadFull" : "full";
        try {
            long a = com.meituan.met.mercury.load.download.a.a(this.f, this.q, this.d, this.c, this.n);
            a(str2, System.currentTimeMillis() - currentTimeMillis, true, 0, null);
            a(a, 0);
        } catch (Exception e) {
            String exc = e.toString();
            if (e instanceof f) {
                i = ((f) e).c;
                str = e.getMessage();
            } else {
                str = exc;
                i = 101;
            }
            a(str2, System.currentTimeMillis() - currentTimeMillis, false, i, str);
            a(e);
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6a2f07ae275eef11ecfa2595a8bb73b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6a2f07ae275eef11ecfa2595a8bb73b");
        }
        return "DownloadFullTask{url='" + this.q + "', priority=" + this.b + ", expectMd5='" + this.c + "', destFile=" + this.d + ", fileAlreadyCached=" + this.e + ", business='" + this.f + "', resourceName='" + this.g + "', resourceVersion='" + this.h + "', taskState=" + this.i + ", taskCallBack=" + this.j + ", preloadTag=" + this.k + ", preloadFile=" + this.l + ", hasPreloadFile=" + this.m + ", dddProcessLock=" + this.o + '}';
    }
}
