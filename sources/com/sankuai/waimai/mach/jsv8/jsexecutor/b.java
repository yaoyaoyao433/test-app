package com.sankuai.waimai.mach.jsv8.jsexecutor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b c;
    public AtomicLong b;
    private List<a> d;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "110b171ef5299b2b2f7f0cd0319cb179", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "110b171ef5299b2b2f7f0cd0319cb179");
            return;
        }
        this.b = new AtomicLong(0L);
        this.d = new ArrayList();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb0860446c4296d7fb6723679a7e65ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb0860446c4296d7fb6723679a7e65ef");
        }
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new b();
                }
            }
        }
        return c;
    }

    public final synchronized a a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ac932f8b70fefc60d9ce1722c74bfce", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ac932f8b70fefc60d9ce1722c74bfce");
        }
        int i = (int) (j % 3);
        if (this.d.size() < 3) {
            a aVar = new a();
            this.d.add(aVar);
            return aVar;
        }
        return this.d.get(i);
    }
}
