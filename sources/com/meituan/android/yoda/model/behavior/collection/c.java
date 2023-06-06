package com.meituan.android.yoda.model.behavior.collection;

import com.meituan.android.yoda.interfaces.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c<T> {
    public static ChangeQuickRedirect a;
    int b;
    private final ReentrantReadWriteLock c;
    private boolean d;
    private LinkedList<T> e;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a<T> {
        void a(T t);
    }

    public c() {
        this(-1, false);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c143b74cce5e0d3550ac0a7d425172d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c143b74cce5e0d3550ac0a7d425172d9");
        }
    }

    public c(int i) {
        this(i, false);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db8c38cc4ff51bbcfe07e52f9c7f5098", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db8c38cc4ff51bbcfe07e52f9c7f5098");
        }
    }

    public c(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "866d073985801180e97362093932deae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "866d073985801180e97362093932deae");
            return;
        }
        this.c = new ReentrantReadWriteLock();
        this.b = -1;
        this.d = false;
        this.d = z;
        this.b = i <= 0 ? -1 : i;
        this.e = new LinkedList<T>() { // from class: com.meituan.android.yoda.model.behavior.collection.c.1
            public static ChangeQuickRedirect a;

            @Override // java.util.LinkedList, java.util.Deque
            public final void addLast(T t) {
                Object[] objArr2 = {t};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b760b963efdc231b0b9c4f18c2dc7dd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b760b963efdc231b0b9c4f18c2dc7dd");
                    return;
                }
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0c6b006a3b02df670c24de10bfbcedf4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0c6b006a3b02df670c24de10bfbcedf4");
                } else if (c.this.b != -1) {
                    while (size() >= c.this.b) {
                        removeFirst();
                    }
                }
                super.addLast(t);
            }

            @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public final void clear() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b09a649da43476ed37e30340f17a0b3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b09a649da43476ed37e30340f17a0b3");
                    return;
                }
                if (size() > 0 && (get(0) instanceof g)) {
                    Iterator it = iterator();
                    while (it.hasNext()) {
                        ((g) it.next()).a();
                    }
                }
                super.clear();
            }

            @Override // java.util.LinkedList, java.util.Deque
            public final T removeFirst() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "10c1be1ec865c036e1a7571da35119e8", RobustBitConfig.DEFAULT_VALUE)) {
                    return (T) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "10c1be1ec865c036e1a7571da35119e8");
                }
                T t = (T) super.removeFirst();
                if (t instanceof g) {
                    ((g) t).a();
                }
                return t;
            }
        };
    }

    public final void a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6861316b076523903f79c01a16c04383", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6861316b076523903f79c01a16c04383");
            return;
        }
        try {
            this.c.writeLock().lock();
            if (this.d) {
                if ((t instanceof Comparable) && (t instanceof a)) {
                    Iterator<T> it = this.e.iterator();
                    while (it.hasNext()) {
                        T next = it.next();
                        if (((Comparable) t).compareTo(next) == 0) {
                            ((a) next).a(t);
                            g.a.a(t);
                            return;
                        }
                    }
                    this.e.addLast(t);
                } else {
                    throw new RuntimeException("you must implement interface:Combine and Comparable");
                }
            } else {
                this.e.addLast(t);
            }
        } finally {
            this.c.writeLock().unlock();
        }
    }

    public final String[] a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f5a64a714929ffed6d744e0efbc6d93", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f5a64a714929ffed6d744e0efbc6d93");
        }
        if (!z) {
            try {
                this.c.readLock().lock();
                return b();
            } finally {
                this.c.readLock().unlock();
            }
        }
        try {
            this.c.writeLock().lock();
            String[] b = b();
            this.e.clear();
            return b;
        } finally {
            this.c.writeLock().unlock();
        }
    }

    private String[] b() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "515a26f474bd40eac5eee5774bf32f6d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "515a26f474bd40eac5eee5774bf32f6d");
        }
        String[] strArr = new String[this.e.size()];
        Iterator<T> it = this.e.iterator();
        while (it.hasNext()) {
            strArr[i] = it.next().toString();
            i++;
        }
        return strArr;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9ed12246199354fb8850845756e2f13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9ed12246199354fb8850845756e2f13");
            return;
        }
        try {
            this.c.readLock().lock();
            this.e.clear();
        } finally {
            this.c.readLock().unlock();
        }
    }
}
