package com.meituan.android.legwork.monitor;

import com.meituan.android.legwork.bean.monitor.LinkNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    Map<String, ScheduledFuture> b;
    Map<String, b> c;
    ScheduledExecutorService d;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87cfdfddec4aed563c1c9102a2d67618", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87cfdfddec4aed563c1c9102a2d67618");
            return;
        }
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = com.sankuai.android.jarvis.c.c("legwork-ReportHelper");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.legwork.monitor.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0265a {
        private static a a = new a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public static ChangeQuickRedirect a;
        private String c;
        private String d;
        private long e;

        public b(String str, String str2, long j) {
            Object[] objArr = {a.this, str, str2, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c089d68e48e99d4406cfafce51071a01", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c089d68e48e99d4406cfafce51071a01");
                return;
            }
            this.c = str;
            this.d = str2;
            this.e = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b7e94e6445ee94ae6d58ee27fb2b98f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b7e94e6445ee94ae6d58ee27fb2b98f");
                return;
            }
            LinkNode linkNode = new LinkNode();
            linkNode.nodeType = LinkNode.NODE_TYPE_TIME_OUT;
            com.meituan.android.legwork.monitor.b.a().a(this.c, this.d, linkNode);
            a a2 = a.a();
            String str = this.d;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "c0a015c8672ef0a359cc2ba850598cb7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "c0a015c8672ef0a359cc2ba850598cb7");
                return;
            }
            a2.c.remove(str);
            a2.b.remove(str);
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbd1d9c8475628b1902f4e2d3eafdd1b", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbd1d9c8475628b1902f4e2d3eafdd1b") : C0265a.a;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "811a6ea3d25d687a7cefce29a7462bdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "811a6ea3d25d687a7cefce29a7462bdc");
            return;
        }
        ScheduledFuture scheduledFuture = this.b.get(str);
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.c.remove(str);
        this.b.remove(str);
    }
}
