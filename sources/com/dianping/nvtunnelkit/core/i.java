package com.dianping.nvtunnelkit.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private int d;
    private LinkedList<a> e;

    public i(int i) {
        Object[] objArr = {10};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e810196cbecbda3a0289fa00e4338e65", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e810196cbecbda3a0289fa00e4338e65");
            return;
        }
        this.c = 0;
        this.d = 0;
        this.b = 10;
        this.e = new LinkedList<>();
    }

    public final synchronized void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaeefe462549c8bc74884ae78f185e1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaeefe462549c8bc74884ae78f185e1f");
            return;
        }
        this.d++;
        this.c += i;
        if (this.d > this.b) {
            this.d--;
            this.c -= this.e.removeLast().a;
        }
        this.e.addFirst(new a(i, System.currentTimeMillis()));
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac6519c0fc294c2c6811f8778720b17b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac6519c0fc294c2c6811f8778720b17b")).intValue();
        }
        if (this.d == 0) {
            return 0;
        }
        return this.c / this.d;
    }

    public final synchronized a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8635d3a3eb8d222e3a7495f6b73ca93", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8635d3a3eb8d222e3a7495f6b73ca93");
        } else if (this.e.isEmpty()) {
            return null;
        } else {
            return this.e.get(0);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public long b;

        public a(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }
}
