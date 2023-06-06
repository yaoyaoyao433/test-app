package com.meituan.msc.modules.reporter;

import android.os.Process;
import android.text.TextUtils;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class n {
    public static ChangeQuickRedirect a;
    private static volatile long b;
    private static volatile long c;
    private static volatile long d;
    private static volatile long e;
    private static final CopyOnWriteArraySet<Integer> f = new CopyOnWriteArraySet<>();
    private static volatile boolean g = false;
    private static final ExecutorService h = com.sankuai.android.jarvis.c.a("ProcessMonitor");

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(double d);
    }

    public static /* synthetic */ long c() {
        return j();
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61536946c1eb8981ab22581bee82c45f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61536946c1eb8981ab22581bee82c45f");
        } else if (g) {
        } else {
            h.execute(new Runnable() { // from class: com.meituan.msc.modules.reporter.n.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8efe99eff021c120155e1953ec495243", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8efe99eff021c120155e1953ec495243");
                        return;
                    }
                    boolean unused = n.g = true;
                    long unused2 = n.b = 0L;
                    long unused3 = n.b = n.c();
                    long unused4 = n.d = 0L;
                    Iterator it = n.f.iterator();
                    while (it.hasNext()) {
                        n.d += n.f(((Integer) it.next()).intValue());
                    }
                }
            });
        }
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3959c828bf87aed237c3eb156c6ea2ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3959c828bf87aed237c3eb156c6ea2ec");
            return;
        }
        final int myTid = Process.myTid();
        if (g && !f.contains(Integer.valueOf(myTid))) {
            h.execute(new Runnable() { // from class: com.meituan.msc.modules.reporter.n.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e353ea3d8c68b71f56175572346a38d5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e353ea3d8c68b71f56175572346a38d5");
                    } else {
                        n.d += n.f(myTid);
                    }
                }
            });
        }
        f.add(Integer.valueOf(myTid));
    }

    public static void a(final a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e6b4958675ac1d1f87751385354c5de3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e6b4958675ac1d1f87751385354c5de3");
        } else {
            h.execute(new Runnable() { // from class: com.meituan.msc.modules.reporter.n.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "405b26978c88bcead4322e6dd2ef8981", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "405b26978c88bcead4322e6dd2ef8981");
                    } else if (n.g) {
                        long unused = n.c = n.c();
                        Iterator it = n.f.iterator();
                        while (it.hasNext()) {
                            n.e += n.f(((Integer) it.next()).intValue());
                        }
                        long j = n.c - n.b;
                        long j2 = n.e - n.d;
                        double d2 = j2 / j;
                        g.d("ProcessMonitor", "CPU Process start:", Long.valueOf(n.b));
                        g.d("ProcessMonitor", "CPU Process end:", Long.valueOf(n.c));
                        g.d("ProcessMonitor", "CPU Thread start:", Long.valueOf(n.d));
                        g.d("ProcessMonitor", "CPU Thread end:", Long.valueOf(n.e));
                        g.d("ProcessMonitor", "total process CPU stat:", Long.valueOf(j));
                        g.d("ProcessMonitor", "total thread CPU stat:", Long.valueOf(j2));
                        g.d("ProcessMonitor", "total CPU usage rate:", Double.valueOf(d2));
                        long unused2 = n.b = 0L;
                        long unused3 = n.d = 0L;
                        long unused4 = n.c = 0L;
                        long unused5 = n.e = 0L;
                        n.f.clear();
                        boolean unused6 = n.g = false;
                        a.this.a(d2);
                    } else {
                        a.this.a(0.0d);
                    }
                }
            });
        }
    }

    private static long j() {
        long j;
        long j2;
        long j3;
        String[] split;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e5eb84a44365bdb0e01ee5279eb8fa2d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e5eb84a44365bdb0e01ee5279eb8fa2d")).longValue();
        }
        long j4 = 0;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("/proc/" + Process.myPid() + "/stat", r.o);
            String readLine = randomAccessFile.readLine();
            if (TextUtils.isEmpty(readLine) || (split = readLine.split(StringUtil.SPACE)) == null || split.length < 16) {
                j = 0;
                j2 = 0;
                j3 = 0;
            } else {
                long parseLong = Long.parseLong(split[13]);
                try {
                    j2 = Long.parseLong(split[14]);
                    try {
                        j3 = Long.parseLong(split[15]);
                    } catch (Exception unused) {
                        j = 0;
                        j3 = 0;
                    }
                } catch (Exception unused2) {
                    j = 0;
                    j2 = 0;
                    j3 = 0;
                }
                try {
                    j = Long.parseLong(split[16]);
                    j4 = parseLong;
                } catch (Exception unused3) {
                    j = 0;
                    j4 = parseLong;
                    g.a("ProcessMonitor", "reading process stat failed");
                    return j4 + j2 + j + j3;
                }
            }
            try {
                randomAccessFile.close();
            } catch (Exception unused4) {
                g.a("ProcessMonitor", "reading process stat failed");
                return j4 + j2 + j + j3;
            }
        } catch (Exception unused5) {
            j = 0;
            j2 = 0;
            j3 = 0;
        }
        return j4 + j2 + j + j3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long f(long j) {
        long j2;
        String[] split;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a372dad429df3d7d5a354d0ea38adbd8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a372dad429df3d7d5a354d0ea38adbd8")).longValue();
        }
        long j3 = 0;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("/proc/" + Process.myPid() + "/task/" + j + "/stat", r.o);
            String readLine = randomAccessFile.readLine();
            if (TextUtils.isEmpty(readLine) || (split = readLine.split(StringUtil.SPACE)) == null || split.length < 16) {
                j2 = 0;
            } else {
                long parseLong = Long.parseLong(split[13]);
                try {
                    j2 = Long.parseLong(split[14]);
                    j3 = parseLong;
                } catch (Exception unused) {
                    j2 = 0;
                    j3 = parseLong;
                    g.a("ProcessMonitor", "reading process stat failed");
                    return j3 + j2;
                }
            }
            try {
                randomAccessFile.close();
            } catch (Exception unused2) {
                g.a("ProcessMonitor", "reading process stat failed");
                return j3 + j2;
            }
        } catch (Exception unused3) {
            j2 = 0;
        }
        return j3 + j2;
    }
}
