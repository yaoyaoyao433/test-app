package com.sankuai.xm.base.util;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class s<T> {
    public static ChangeQuickRedirect a;
    private static final Handler c = new Handler(Looper.getMainLooper());
    private final Object b;
    private final TreeSet<a<T>> d;

    public s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ff370f857e471a448aefa3311951782", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ff370f857e471a448aefa3311951782");
            return;
        }
        this.b = new Object();
        this.d = new TreeSet<>();
    }

    public final void a(T t, int i, Short sh, boolean z) {
        Object[] objArr = {t, Integer.valueOf(i), sh, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0480ba7a28d8306702d1db8487cffe63", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0480ba7a28d8306702d1db8487cffe63");
        } else if (t == null) {
        } else {
            synchronized (this.b) {
                a<T> aVar = new a<>(t, i, sh, z);
                if (!this.d.add(aVar)) {
                    com.sankuai.xm.log.a.c("ListenerContainer::registerListener duplicate: listener %s", aVar);
                }
            }
        }
    }

    public final void a(Short sh, T t) {
        Object[] objArr = {sh, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79e6c6a004891031e0961f87abfe39f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79e6c6a004891031e0961f87abfe39f5");
        } else {
            a(sh, (Short) t, false);
        }
    }

    public void a(Short sh, T t, boolean z) {
        Object[] objArr = {sh, t, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "566fcba1866cf654edd90b1900fde28b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "566fcba1866cf654edd90b1900fde28b");
        } else if (t == null) {
        } else {
            synchronized (this.b) {
                Iterator<a<T>> it = this.d.iterator();
                while (it.hasNext()) {
                    a<T> next = it.next();
                    if (t.equals(next.b) && (z || p.a(sh, next.d))) {
                        it.remove();
                    }
                }
            }
        }
    }

    public final boolean a() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f668df75cc40f9dbb9429390f7141bc8", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f668df75cc40f9dbb9429390f7141bc8")).booleanValue();
        }
        synchronized (this.b) {
            z = this.d.size() > 0;
        }
        return z;
    }

    public final void a(b.a<T> aVar, boolean z, short... sArr) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), sArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0791e00324b124f2a6350652aa86b1a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0791e00324b124f2a6350652aa86b1a8");
        } else if (aVar == null) {
        } else {
            ArrayList<a<T>> arrayList = new ArrayList<>();
            synchronized (this.b) {
                Iterator<a<T>> it = this.d.iterator();
                boolean z2 = sArr.length == 0;
                if (!z2) {
                    Arrays.sort(sArr);
                }
                while (it.hasNext()) {
                    a<T> next = it.next();
                    if ((next.d == null && z2) || (next.d != null && !z2 && Arrays.binarySearch(sArr, next.d.shortValue()) >= 0)) {
                        arrayList.add(next);
                    }
                }
            }
            a(arrayList, aVar, z);
        }
    }

    public final void a(b.a<T> aVar, boolean z) {
        ArrayList<a<T>> arrayList;
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "453440689d4e689bdfe6aa13f7d17d9c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "453440689d4e689bdfe6aa13f7d17d9c");
        } else if (aVar == null) {
        } else {
            synchronized (this.b) {
                arrayList = new ArrayList<>(this.d);
            }
            a(arrayList, aVar, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.ArrayList<com.sankuai.xm.base.util.s.a<T>> r20, final com.sankuai.xm.base.util.b.a<T> r21, final boolean r22) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.base.util.s.a(java.util.ArrayList, com.sankuai.xm.base.util.b$a, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a<T> implements Comparable<a<T>> {
        public static ChangeQuickRedirect a;
        public T b;
        public int c;
        public Short d;
        public boolean e;

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            a aVar = (a) obj;
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "638d28690af873fc39a9580af8be514c", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "638d28690af873fc39a9580af8be514c")).intValue();
            }
            int i = aVar.c - this.c;
            if (i != 0 || equals(aVar)) {
                return i;
            }
            return 1;
        }

        public a(T t, int i, Short sh, boolean z) {
            Object[] objArr = {t, Integer.valueOf(i), sh, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b25ce5ab01d9b2d26f3f5da04ab2c4d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b25ce5ab01d9b2d26f3f5da04ab2c4d");
                return;
            }
            this.b = t;
            this.c = i;
            this.d = sh;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8c97fc24ee5ed328eca5f375e6bad6d", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8c97fc24ee5ed328eca5f375e6bad6d")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return p.a(this.b, aVar.b) && p.a(this.d, aVar.d);
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d981aa012c9d50b769bfe7a40672f32c", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d981aa012c9d50b769bfe7a40672f32c")).intValue() : p.a(this.b, this.d);
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "367d1c7386f2a2da4c183b2e18e8b706", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "367d1c7386f2a2da4c183b2e18e8b706");
            }
            return "ListenerHolder{listener=" + this.b + ", priority=" + this.c + ", channel=" + this.d + ", isMainThread=" + this.e + '}';
        }
    }
}
