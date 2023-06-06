package com.meituan.snare;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class o {
    public static ChangeQuickRedirect a;
    private final StringBuilder b;
    private final int c;
    private int d;

    public o(int i) {
        Object[] objArr = {200};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a308cb4c1da3116917476ed09934a40", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a308cb4c1da3116917476ed09934a40");
            return;
        }
        this.d = 0;
        this.b = new StringBuilder();
        this.c = 200;
    }

    public final o a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ec3ab7df130bdc1b3b8c48c2e883af1", RobustBitConfig.DEFAULT_VALUE)) {
            return (o) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ec3ab7df130bdc1b3b8c48c2e883af1");
        }
        this.d++;
        if (this.d < this.c) {
            this.b.append(str);
        }
        return this;
    }

    public final o b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c9b56d52282e853d907c61b50c3531d", RobustBitConfig.DEFAULT_VALUE)) {
            return (o) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c9b56d52282e853d907c61b50c3531d");
        }
        if (this.d < this.c) {
            this.b.append(str);
        }
        return this;
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d51d736a6e673f041929f6cbef623874", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d51d736a6e673f041929f6cbef623874")).intValue() : this.b.length();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e6e5fdaee3a79a38da9653a798060d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e6e5fdaee3a79a38da9653a798060d2");
        }
        if (this.d <= this.c) {
            return this.b.toString();
        }
        return this.b.toString() + "\n..... (has " + (this.d - this.c) + " lines fold) ....";
    }
}
