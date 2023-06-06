package com.sankuai.waimai.rocks.expose;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.rocks.expose.f;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<T> {
    public static ChangeQuickRedirect h;
    protected LinkedList<a> i;
    protected c j;
    public TreeSet<T> k;
    public TreeSet<T> l;
    protected int m;
    protected int n;
    protected boolean o;
    protected View p;

    public abstract void b();

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "854bbb6b44cbb409e2fce03f20fe6a0f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "854bbb6b44cbb409e2fce03f20fe6a0f");
            return;
        }
        this.k = new TreeSet<>();
        this.l = new TreeSet<>();
        this.n = -1;
        this.o = false;
        this.p = null;
    }

    public a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7615069059fad8246772868c6f19d10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7615069059fad8246772868c6f19d10");
            return;
        }
        this.k = new TreeSet<>();
        this.l = new TreeSet<>();
        this.n = -1;
        this.o = false;
        this.p = null;
        this.j = cVar;
    }

    public final void c(int i) {
        this.m = i;
    }

    public final void d(int i) {
        this.n = i;
    }

    public final boolean a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95f67b457791e9a9684c13a297401a25", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95f67b457791e9a9684c13a297401a25")).booleanValue() : this.k.contains(t);
    }

    public final void b(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd61ccd49295dc9dedb47eebd590be85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd61ccd49295dc9dedb47eebd590be85");
        } else {
            this.k.add(t);
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1462c62085bb2096b97e382645df48c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1462c62085bb2096b97e382645df48c");
        } else {
            this.l.clear();
        }
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d33fb644eb341ff3cf967eaba4e451af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d33fb644eb341ff3cf967eaba4e451af");
        } else {
            this.k.clear();
        }
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70c17bda44f69fb39887acfee2b25418", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70c17bda44f69fb39887acfee2b25418");
            return;
        }
        if (this.i == null) {
            this.i = new LinkedList<>();
        }
        if (this.i.contains(aVar)) {
            return;
        }
        this.i.add(aVar);
    }

    public final void a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a5fcf0a51afee1687904f92e80a87c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a5fcf0a51afee1687904f92e80a87c1");
        } else if (fVar == null) {
        } else {
            if (fVar.a == f.b.RESET_CACHE) {
                a();
                d();
                this.o = false;
            } else if (fVar.a == f.b.EXPOSE) {
                b();
            } else if (fVar.a == f.b.REFRESH) {
                d();
                a();
                b();
            } else if (fVar.a == f.b.SWITCH_TAB) {
                d();
                b();
            } else if (fVar.a == f.b.ON_RESUME) {
                d();
                b();
            }
            if (this.i == null || !fVar.b) {
                return;
            }
            Iterator<a> it = this.i.iterator();
            while (it.hasNext()) {
                it.next().a(fVar);
            }
        }
    }

    public void a(View view) {
        this.p = view;
    }

    public void aq_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9530a13362c436b50a476b751eaf428f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9530a13362c436b50a476b751eaf428f");
            return;
        }
        f.a aVar = new f.a(f.b.REFRESH);
        aVar.c = true;
        a(aVar.a());
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "636ef9875ea86ab8d83f61bf8b2c1583", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "636ef9875ea86ab8d83f61bf8b2c1583");
            return;
        }
        f.a aVar = new f.a(f.b.RESET_CACHE);
        aVar.c = z;
        a(aVar.a());
    }
}
