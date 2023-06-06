package com.dianping.nvnetwork.shark.monitor;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class h {
    public static ChangeQuickRedirect a;
    private static volatile h d;
    public volatile e b;
    public volatile long c;
    private final Set<Object> e;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efc561c4aa76c4fe3ebc186c64f72670", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efc561c4aa76c4fe3ebc186c64f72670");
            return;
        }
        this.e = new CopyOnWriteArraySet();
        this.b = e.GOOD;
    }

    public static h a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e219cedca9b0b5df8e8db48dbc6c4e1e", 6917529027641081856L)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e219cedca9b0b5df8e8db48dbc6c4e1e");
        }
        if (d == null) {
            synchronized (h.class) {
                if (d == null) {
                    d = new h();
                }
            }
        }
        return d;
    }

    public final void a(@NonNull e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7921f840b50d03ef7e98ad5792bac5b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7921f840b50d03ef7e98ad5792bac5b1");
            return;
        }
        this.b = eVar;
        this.c = System.currentTimeMillis();
        Iterator<Object> it = this.e.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final double b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a148d575c9e3f6f4551d32b05ad22f4b", 6917529027641081856L)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a148d575c9e3f6f4551d32b05ad22f4b")).doubleValue();
        }
        g gVar = n.a(com.dianping.nvnetwork.g.b()).d;
        if (gVar != null) {
            return gVar.d;
        }
        return 0.0d;
    }

    public final double c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7afee6b74e3ad3407fdc8e0b19818578", 6917529027641081856L)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7afee6b74e3ad3407fdc8e0b19818578")).doubleValue();
        }
        g gVar = n.a(com.dianping.nvnetwork.g.b()).d;
        if (gVar != null) {
            return gVar.e;
        }
        return 0.0d;
    }

    public final double d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27257988585e90d6404698fe364e9ddb", 6917529027641081856L)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27257988585e90d6404698fe364e9ddb")).doubleValue();
        }
        g gVar = n.a(com.dianping.nvnetwork.g.b()).d;
        if (gVar != null) {
            return gVar.f;
        }
        return 0.0d;
    }
}
