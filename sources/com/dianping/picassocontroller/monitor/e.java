package com.dianping.picassocontroller.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private long[] b;
    private int c;

    public static e a(int i) {
        Object[] objArr = {20};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e0734bf457b1f1b7c5fa5331be2c10f", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e0734bf457b1f1b7c5fa5331be2c10f") : new e(20);
    }

    private e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f042c7778382b15a8042e84ffedde2e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f042c7778382b15a8042e84ffedde2e4");
            return;
        }
        this.b = new long[i];
        this.c = 0;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05162c97ef54b7f0270af08bd8f0c048", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05162c97ef54b7f0270af08bd8f0c048");
            return;
        }
        a();
        long[] jArr = this.b;
        int i = this.c;
        this.c = i + 1;
        jArr[i] = j;
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "959290f56f3273b627d27310099f1df1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "959290f56f3273b627d27310099f1df1");
        } else if (this.c == this.b.length) {
            long[] jArr = new long[Math.max(this.c + 1, (int) (this.c * 1.8d))];
            System.arraycopy(this.b, 0, jArr, 0, this.c);
            this.b = jArr;
        }
    }
}
