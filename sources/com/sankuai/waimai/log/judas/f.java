package com.sankuai.waimai.log.judas;

import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;
    int b;
    int c;
    boolean d;
    b e;
    a f;
    private SparseArray g;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        boolean a(int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(int i);

        void b(int i);
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "517c7ca44f2790f0b155b3b4da4bdd99", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "517c7ca44f2790f0b155b3b4da4bdd99");
            return;
        }
        this.d = false;
        this.g = new SparseArray();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec04a1df74f64e10a6a4149f74907868", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec04a1df74f64e10a6a4149f74907868");
            return;
        }
        this.g.clear();
        this.d = true;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "499860293c838c5aba0657f5b158a5db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "499860293c838c5aba0657f5b158a5db");
        } else if (this.b >= 0 && this.b <= this.c) {
            for (int i = this.b; i <= this.c; i++) {
                if (this.e != null) {
                    if (this.f != null && this.f.a(i)) {
                        this.e.a(i);
                        this.g.append(i, Integer.valueOf(i));
                    } else if (this.f == null) {
                        this.e.a(i);
                        this.g.append(i, Integer.valueOf(i));
                    }
                }
            }
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3e43a253f92d89349a5b173716a6980", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3e43a253f92d89349a5b173716a6980");
        } else if (this.b >= 0 && this.b <= this.c) {
            for (int i = this.b; i <= this.c; i++) {
                if (this.g.get(i) == null && this.e != null) {
                    if (this.f != null && this.f.a(i)) {
                        this.e.a(i);
                        this.g.append(i, Integer.valueOf(i));
                    } else if (this.f == null) {
                        this.e.a(i);
                        this.g.append(i, Integer.valueOf(i));
                    }
                }
            }
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0692c6e799c14e96437f6d1d87739bee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0692c6e799c14e96437f6d1d87739bee");
        } else if (this.e != null) {
            this.e.b(i);
        }
    }
}
