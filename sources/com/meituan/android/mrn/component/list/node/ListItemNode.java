package com.meituan.android.mrn.component.list.node;

import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ListItemNode extends a {
    public static ChangeQuickRedirect l;
    public int m;
    public SparseArray<a> n;
    public String o;
    protected c p;
    public float q;
    public float r;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface PoolOperation {
    }

    public ListItemNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6461ea8f0f65a65f3494eb8764904cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6461ea8f0f65a65f3494eb8764904cd");
            return;
        }
        this.m = -1;
        this.n = new SparseArray<>();
        this.o = "";
        this.q = 0.0f;
        this.r = 0.0f;
    }

    public final c a() {
        return this.p;
    }

    public final void a(c cVar) {
        this.p = cVar;
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3070a4015805f2cf516f00f67acdd9e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3070a4015805f2cf516f00f67acdd9e")).intValue();
        }
        if (this.m == -1) {
            com.meituan.android.mrn.component.list.common.b.a(this);
        }
        return this.m;
    }

    public void a(a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd48df8c6b8d00766d772d4f1e692161", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd48df8c6b8d00766d772d4f1e692161");
            return;
        }
        if (i == 2) {
            this.n.put(aVar.d, aVar);
        } else if (i == 1) {
            this.n.remove(aVar.d);
        }
        Iterator<a> it = aVar.i.iterator();
        while (it.hasNext()) {
            a(it.next(), i);
        }
    }

    @Override // com.meituan.android.mrn.component.list.node.a
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e4134442a6a06c002c6464931d90b31", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e4134442a6a06c002c6464931d90b31");
        }
        return "{\"mReactTag\":" + this.d + ", \"mModuleName\":\"" + this.e + "\", \"mRootTag\":" + this.f + ", \"mEventId\":" + this.k + ", \"mParentTag\":" + this.g + ", \"mChildren\":" + this.i + ", \"mProps\":" + this.j + '}';
    }
}
