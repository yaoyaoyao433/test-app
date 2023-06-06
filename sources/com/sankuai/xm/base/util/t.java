package com.sankuai.xm.base.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class t<T> {
    public static ChangeQuickRedirect a;
    private final Object b;
    private HashMap<Short, HashSet<T>> c;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a<T> {
        void a(T t);
    }

    public t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3132e4883bec8688f213caa8fe752aa5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3132e4883bec8688f213caa8fe752aa5");
            return;
        }
        this.b = new Object();
        this.c = new HashMap<>();
    }

    private Set<T> a(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "045604a57bed1526ea930911674ba179", 6917529027641081856L)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "045604a57bed1526ea930911674ba179");
        }
        HashSet hashSet = new HashSet();
        synchronized (this.b) {
            HashSet<T> hashSet2 = this.c.get(Short.valueOf(s));
            if (hashSet2 != null) {
                hashSet.addAll(hashSet2);
            }
        }
        return hashSet;
    }

    public final void a(a<T> aVar, short... sArr) {
        Object[] objArr = {aVar, sArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96ac92bd71a89c3f7980685285ca2cfd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96ac92bd71a89c3f7980685285ca2cfd");
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 2; i++) {
            Set<T> a2 = a(sArr[i]);
            if (!b.a(a2)) {
                hashSet.addAll(a2);
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        for (Object obj : hashSet) {
            if (obj != null) {
                aVar.a(obj);
            }
        }
    }
}
