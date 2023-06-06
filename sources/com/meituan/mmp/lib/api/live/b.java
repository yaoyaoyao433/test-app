package com.meituan.mmp.lib.api.live;

import android.content.Context;
import android.text.TextUtils;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.player.library.a;
import com.sankuai.meituan.mtlive.player.library.f;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    int b;
    boolean c;
    com.sankuai.meituan.mtlive.player.library.c d;
    boolean e;
    private int f;
    private a.b g;
    private boolean h;
    private boolean i;
    private WeakReference<com.sankuai.meituan.mtlive.player.library.b> j;
    private int k;
    private int l;
    private String m;
    private Surface n;
    private int o;
    private int p;
    private boolean q;
    private String r;
    private com.sankuai.meituan.mtlive.player.library.view.a s;

    public final void finalize() {
    }

    public b(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4afde5f2b5a2d5e61b07064bafa864dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4afde5f2b5a2d5e61b07064bafa864dd");
            return;
        }
        this.f = 0;
        this.g = null;
        this.b = 0;
        this.h = false;
        this.i = false;
        this.c = false;
        this.j = null;
        this.k = 1;
        this.l = 0;
        this.m = "";
        this.n = null;
        this.o = 0;
        this.p = 0;
        this.q = false;
        this.r = "";
        this.s = null;
        this.e = true;
        this.d = f.a(context, i);
    }

    public final void a(com.sankuai.meituan.mtlive.player.library.view.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b21ea68ae92c3d6b0b32aad54b6fa3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b21ea68ae92c3d6b0b32aad54b6fa3d");
        } else {
            this.d.a(aVar);
        }
    }

    public final void a(com.sankuai.meituan.mtlive.player.library.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31878adad8f30d99380864d9a01c95e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31878adad8f30d99380864d9a01c95e6");
            return;
        }
        this.d.a(bVar);
        this.j = new WeakReference<>(bVar);
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b88a5d13ad3e6311ab9871c6bea22f6a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b88a5d13ad3e6311ab9871c6bea22f6a")).booleanValue() : this.d.b();
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c50e0d3d3a7323b77ef42fcbc9d4d028", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c50e0d3d3a7323b77ef42fcbc9d4d028");
            return;
        }
        this.d.d(z);
        this.i = z;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "438baae7aaa8dd6410d491fe26bb0902", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "438baae7aaa8dd6410d491fe26bb0902");
            return;
        }
        this.d.a(i);
        if (i == 0) {
            this.k = 0;
        } else if (i == 1) {
            this.k = 1;
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20a67cf8c9daa95b23f708d734960e7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20a67cf8c9daa95b23f708d734960e7a");
            return;
        }
        this.d.b(i);
        if (i == 270) {
            this.l = 3;
        } else if (i == 0) {
            this.l = 0;
        }
    }

    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f722b5ed51c5fccbd7e8389ea637635d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f722b5ed51c5fccbd7e8389ea637635d");
            return;
        }
        this.d.c(i);
        if (i == 0) {
            this.f = 0;
        } else if (i == 1) {
            this.f = 1;
        }
    }

    public final boolean b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ae3d6ee7b6494d2716fe11d09d81f7d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ae3d6ee7b6494d2716fe11d09d81f7d")).booleanValue() : this.d.c(z);
    }

    public final void a(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc284a25f2ba25c36bb104d1e2fb6a04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc284a25f2ba25c36bb104d1e2fb6a04");
            return;
        }
        this.d.a(bVar);
        this.g = bVar;
    }

    public final int a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef24a63ddc82a18546db5ed34875212b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef24a63ddc82a18546db5ed34875212b")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        this.d.d(this.b);
        int a2 = this.d.a(str, i);
        if (a2 == 0) {
            this.e = false;
        }
        return a2;
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "610d0b4c6af11e99618958abd3975e62", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "610d0b4c6af11e99618958abd3975e62")).intValue();
        }
        this.e = true;
        return this.d.a();
    }

    public final int c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c5d299dabbe27682b149dd75cc749f8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c5d299dabbe27682b149dd75cc749f8")).intValue();
        }
        this.e = true;
        if (z && this.s != null) {
            this.s.setVisibility(8);
        }
        e();
        return this.d.b(z);
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7df3ebe93bcf5d96df58b934fe649293", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7df3ebe93bcf5d96df58b934fe649293");
            return;
        }
        this.h = false;
        this.q = false;
        this.r = "";
        this.m = "";
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dc13002e187720dc3edd09c72d76a32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dc13002e187720dc3edd09c72d76a32");
        } else {
            this.d.c();
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "408ae45930d351fa065ed9177766e106", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "408ae45930d351fa065ed9177766e106");
        } else {
            this.d.e();
        }
    }
}
