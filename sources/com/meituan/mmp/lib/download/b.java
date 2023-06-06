package com.meituan.mmp.lib.download;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Comparator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public ExecutorService b;
    private PriorityBlockingQueue<Runnable> c;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a<T extends c> implements Comparator<T> {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            c cVar = (c) obj;
            c cVar2 = (c) obj2;
            Object[] objArr = {cVar, cVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2441718ae1b3f350e4c8bcb1e1a838ca", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2441718ae1b3f350e4c8bcb1e1a838ca")).intValue() : cVar.c.f - cVar2.c.f;
        }
    }

    public b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0298718f4e5c55427c46d4e83db03327", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0298718f4e5c55427c46d4e83db03327");
            return;
        }
        this.c = new PriorityBlockingQueue<>(10, new a());
        this.b = com.sankuai.android.jarvis.c.a("mmp-download", i, i, 0L, TimeUnit.MILLISECONDS, this.c);
    }
}
