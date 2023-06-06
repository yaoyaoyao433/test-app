package com.dianping.logreportswitcher.utils;

import android.content.Context;
import com.dianping.logreportswitcher.c;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class c {
    public static ChangeQuickRedirect a = null;
    private static final String b = "c";
    private static final AtomicBoolean c = new AtomicBoolean();
    private static boolean d = false;
    private static final AtomicLong e = new AtomicLong();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a {
        public static final Executor a = com.sankuai.android.jarvis.c.a("LogReportSwitcher");
    }

    public static /* synthetic */ boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fdc8659bbc3ad7671619fd59e2600649", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fdc8659bbc3ad7671619fd59e2600649")).booleanValue();
        }
        d a2 = d.a();
        long currentTimeMillis = System.currentTimeMillis();
        Object[] objArr2 = {"config_modified_time_key"};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        return currentTimeMillis - (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "8e86fbca669b677e193860f7981c45a7", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "8e86fbca669b677e193860f7981c45a7")).longValue() : a2.a("config_modified_time_key", 0L)) >= a2.a("cfg_req_interval_key", 300000L);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static /* synthetic */ void c(com.dianping.logreportswitcher.b r18) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.logreportswitcher.utils.c.c(com.dianping.logreportswitcher.b):void");
    }

    public static void a(boolean z) {
        d = z;
    }

    public static synchronized void a(final com.dianping.logreportswitcher.b bVar) {
        synchronized (c.class) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "feca956b0f8534bc2add6f3f13aaee7f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "feca956b0f8534bc2add6f3f13aaee7f");
            } else if (bVar == null) {
            } else {
                if (c.compareAndSet(false, true)) {
                    com.sankuai.waimai.launcher.util.aop.b.a(a.a, new Runnable() { // from class: com.dianping.logreportswitcher.utils.c.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "860503d71dcd45de7cecbf115fb092dd", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "860503d71dcd45de7cecbf115fb092dd");
                                return;
                            }
                            try {
                                c.c(com.dianping.logreportswitcher.b.this);
                            } finally {
                                c.c.set(false);
                            }
                        }
                    });
                }
            }
        }
    }

    public static void b(final com.dianping.logreportswitcher.b bVar) {
        boolean z = true;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c358ad72b077d7ccce6cb16d047677f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c358ad72b077d7ccce6cb16d047677f7");
            return;
        }
        long j = e.get();
        long currentTimeMillis = System.currentTimeMillis();
        if ((currentTimeMillis - j <= LocationStrategy.LOCATION_TIMEOUT || !e.compareAndSet(j, currentTimeMillis)) ? false : false) {
            try {
                com.sankuai.waimai.launcher.util.aop.b.a(a.a, new Runnable() { // from class: com.dianping.logreportswitcher.utils.c.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "692f2a795803058c23560484917f5c4d", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "692f2a795803058c23560484917f5c4d");
                            return;
                        }
                        Context context = c.b.a.b;
                        if (context != null && c.b() && c.a(context)) {
                            c.a(com.dianping.logreportswitcher.b.this);
                        }
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1f65179342bccc3cfc784b923ef3cd7", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1f65179342bccc3cfc784b923ef3cd7")).booleanValue() : e.a(context) && !(b.b(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, false) && b.b("mobileapi", false));
    }
}
