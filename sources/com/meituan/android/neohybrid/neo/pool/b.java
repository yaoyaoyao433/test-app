package com.meituan.android.neohybrid.neo.pool;

import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.neo.pool.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final LinkedList<com.meituan.android.neohybrid.neo.pool.persist.b> b = new LinkedList<>();

    public static void a(c.b bVar) {
        com.meituan.android.neohybrid.neo.pool.persist.b bVar2;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "262c6b5cf56d5df4131a501e44e1d5b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "262c6b5cf56d5df4131a501e44e1d5b2");
        } else if (bVar == null || !bVar.a() || b.size() > 0) {
        } else {
            LinkedList<com.meituan.android.neohybrid.neo.pool.persist.b> linkedList = b;
            NeoConfig neoConfig = bVar.b;
            long j = bVar.d;
            Object[] objArr2 = {neoConfig, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.neo.pool.persist.b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e9db53e98242981812157977cf3d5c42", RobustBitConfig.DEFAULT_VALUE)) {
                bVar2 = (com.meituan.android.neohybrid.neo.pool.persist.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e9db53e98242981812157977cf3d5c42");
            } else {
                bVar2 = new com.meituan.android.neohybrid.neo.pool.persist.b(neoConfig);
                bVar2.a(j);
                bVar2.b((com.meituan.android.neohybrid.neo.pool.persist.c) null);
            }
            linkedList.add(bVar2);
        }
    }

    public static com.meituan.android.neohybrid.neo.pool.persist.b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "16758f579da68a082d27de50cf4dd776", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.neo.pool.persist.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "16758f579da68a082d27de50cf4dd776");
        }
        Iterator<com.meituan.android.neohybrid.neo.pool.persist.b> it = b.iterator();
        while (it.hasNext()) {
            com.meituan.android.neohybrid.neo.pool.persist.b next = it.next();
            if (next != null && next.d()) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    public static com.meituan.android.neohybrid.core.a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "936df507172d41cf326158c77d22605c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.core.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "936df507172d41cf326158c77d22605c");
        }
        Iterator<com.meituan.android.neohybrid.neo.pool.persist.b> it = b.iterator();
        while (it.hasNext()) {
            com.meituan.android.neohybrid.neo.pool.persist.b next = it.next();
            if (next != null && next.d()) {
                com.meituan.android.neohybrid.core.a c = next.c();
                it.remove();
                return c;
            }
        }
        return null;
    }
}
