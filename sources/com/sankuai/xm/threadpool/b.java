package com.sankuai.xm.threadpool;

import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class b implements com.sankuai.xm.threadpool.a {
    public static ChangeQuickRedirect a;
    private ScheduledExecutorService b;
    private final Map<Integer, ScheduledExecutorService> c;

    private static int f(int i) {
        return i == 12 ? 10000 : 5000;
    }

    public abstract ScheduledExecutorService a();

    public abstract ScheduledExecutorService a(String str, int i, ThreadFactory threadFactory);

    @Override // com.sankuai.xm.threadpool.a
    public void a(Runnable runnable, long j) {
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dc1d5474469b5e1496dc36f5c155450", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dc1d5474469b5e1496dc36f5c155450");
        } else {
            this.c = new ConcurrentHashMap();
        }
    }

    public String b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "837f4a056e226b40beda9f3daf85db5f", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "837f4a056e226b40beda9f3daf85db5f") : String.valueOf(i);
    }

    public static String c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd3e360f0a8e01692d80bea7ea4aa98d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd3e360f0a8e01692d80bea7ea4aa98d");
        }
        switch (i) {
            case 1:
                return "file";
            case 2:
                return "upld";
            case 3:
                return "dnld";
            default:
                switch (i) {
                    case 11:
                        return "core";
                    case 12:
                        return "rcv_msg";
                    case 13:
                        return "msg_db";
                    case 14:
                        return "comp";
                    case 15:
                        return "no_core";
                    case 16:
                        return "cb_n";
                    case 17:
                        return "cb_1";
                    default:
                        switch (i) {
                            case 21:
                                return SnifferDBHelper.COLUMN_LOG;
                            case 22:
                                return "report";
                            case 23:
                                return "doctor";
                            case 24:
                                return "assist";
                            case 25:
                                return "opp";
                            default:
                                switch (i) {
                                    case 31:
                                        return "live";
                                    case 32:
                                        return "detect";
                                    default:
                                        return "undef" + i;
                                }
                        }
                }
        }
    }

    @Override // com.sankuai.xm.threadpool.a
    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad9eb32ce5f737703e2a482998ee0dbc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad9eb32ce5f737703e2a482998ee0dbc");
        } else {
            a(runnable, 0L);
        }
    }

    @Override // com.sankuai.xm.threadpool.a
    public final void b(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "789955edff4ba2171329711b9eefd882", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "789955edff4ba2171329711b9eefd882");
        } else {
            b(runnable, 0L);
        }
    }

    public final void b(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b97355fe8e387d57bdc1b27bc48d07a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b97355fe8e387d57bdc1b27bc48d07a");
        } else {
            b().schedule(runnable, j, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.sankuai.xm.threadpool.a
    public final void a(int i, Runnable runnable) {
        Object[] objArr = {Integer.valueOf(i), runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d5902cfafe2557e3ebf4f63c19b2b72", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d5902cfafe2557e3ebf4f63c19b2b72");
        } else {
            a(i, runnable, 0L);
        }
    }

    @Override // com.sankuai.xm.threadpool.a
    public final void a(int i, Runnable runnable, long j) {
        Object[] objArr = {Integer.valueOf(i), runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e54b091e6b1ae03573a9e3d16e9f10a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e54b091e6b1ae03573a9e3d16e9f10a");
        } else {
            a(i, 1, runnable, j);
        }
    }

    @Override // com.sankuai.xm.threadpool.a
    public final void a(int i, int i2, Runnable runnable) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1373028c2e02675a5808a04cc4e54863", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1373028c2e02675a5808a04cc4e54863");
        } else {
            a(i, i2, runnable, 0L);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(int i, int i2, Runnable runnable, long j) {
        ScheduledExecutorService scheduledExecutorService;
        int i3;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cd1a627c69538baf1fc700742b37ebe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cd1a627c69538baf1fc700742b37ebe");
            return;
        }
        synchronized (this.c) {
            scheduledExecutorService = this.c.get(Integer.valueOf(i));
            if (scheduledExecutorService == null) {
                if (i != 16) {
                    switch (i) {
                        case 1:
                            i3 = 5;
                            break;
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 25:
                                            break;
                                        case 24:
                                            break;
                                        default:
                                            switch (i) {
                                                case 31:
                                                    i3 = i2;
                                                    break;
                                            }
                                    }
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                    i3 = 1;
                                    break;
                            }
                        case 2:
                        case 3:
                            i3 = 3;
                            break;
                    }
                } else {
                    i3 = 2;
                }
                scheduledExecutorService = a(c(i), i3, new a(i, b(i)));
                this.c.put(Integer.valueOf(i), scheduledExecutorService);
            }
        }
        if (scheduledExecutorService != null) {
            if (!(scheduledExecutorService instanceof ScheduledThreadPoolExecutor) || ((ScheduledThreadPoolExecutor) scheduledExecutorService).getQueue().size() <= f(i)) {
                scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            }
        }
    }

    private ScheduledExecutorService b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e61aa11209a0b96b4725b261ab2def2", 6917529027641081856L)) {
            return (ScheduledExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e61aa11209a0b96b4725b261ab2def2");
        }
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = a();
                }
            }
        }
        return this.b;
    }

    public final void d(int i) {
        ScheduledExecutorService scheduledExecutorService;
        int i2;
        Object[] objArr = {13};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eebe9b513760eabf92a88f845b5d1be6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eebe9b513760eabf92a88f845b5d1be6");
            return;
        }
        synchronized (this.c) {
            Iterator<Integer> it = this.c.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    scheduledExecutorService = null;
                    i2 = -1;
                    break;
                }
                Integer next = it.next();
                if (next.intValue() == 13) {
                    i2 = next.intValue();
                    scheduledExecutorService = this.c.get(next);
                    break;
                }
            }
            if (i2 != -1) {
                this.c.remove(Integer.valueOf(i2));
            }
        }
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }

    @Override // com.sankuai.xm.threadpool.a
    public final boolean a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a07272e5372c89ee2825c767e4def5b9", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a07272e5372c89ee2825c767e4def5b9")).booleanValue() : a.a(b(i), str);
    }

    public final int e(int i) {
        ScheduledExecutorService scheduledExecutorService;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c0f99c5b84ae6d64af06f8b87f9f392", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c0f99c5b84ae6d64af06f8b87f9f392")).intValue();
        }
        synchronized (this.c) {
            scheduledExecutorService = this.c.get(Integer.valueOf(i));
        }
        if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
            return ((ScheduledThreadPoolExecutor) scheduledExecutorService).getQueue().size();
        }
        return -1;
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e5b8e9f869914b1ef37a0c8d674e5fa", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e5b8e9f869914b1ef37a0c8d674e5fa");
        }
        return "xm_t_" + str;
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "abb51315e98ec367f2da1e65f3b347a7", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "abb51315e98ec367f2da1e65f3b347a7");
        }
        return "xm_p_" + str;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a extends AtomicInteger implements ThreadFactory {
        public static ChangeQuickRedirect a;
        private int b;
        private String c;

        private a(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4b8cd3faefdd879f9b6f42edd68dbd1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4b8cd3faefdd879f9b6f42edd68dbd1");
                return;
            }
            this.b = i;
            this.c = str + "#";
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
            if (r12.b != 23) goto L38;
         */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0093  */
        @Override // java.util.concurrent.ThreadFactory
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Thread newThread(java.lang.Runnable r13) {
            /*
                r12 = this;
                r0 = 1
                java.lang.Object[] r8 = new java.lang.Object[r0]
                r9 = 0
                r8[r9] = r13
                com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.xm.threadpool.b.a.a
                java.lang.String r11 = "24944d99a6b370343a70abe0d5eefa26"
                r4 = 0
                r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
                r1 = r8
                r2 = r12
                r3 = r10
                r5 = r11
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                if (r1 == 0) goto L1e
                java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
                java.lang.Thread r13 = (java.lang.Thread) r13
                return r13
            L1e:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r12.c
                r1.append(r2)
                int r2 = r12.getAndIncrement()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.Thread r2 = new java.lang.Thread
                r2.<init>(r13, r1)
                boolean r13 = r2.isDaemon()
                if (r13 == 0) goto L41
                r2.setDaemon(r9)
            L41:
                int r13 = r12.b
                r1 = 5
                if (r13 == r0) goto L8c
                int r13 = r12.b
                r3 = 2
                if (r13 == r3) goto L8c
                int r13 = r12.b
                r3 = 3
                if (r13 == r3) goto L8c
                int r13 = r12.b
                r3 = 15
                if (r13 == r3) goto L8c
                int r13 = r12.b
                r3 = 24
                if (r13 != r3) goto L5d
                goto L8c
            L5d:
                int r13 = r12.b
                r3 = 11
                if (r13 == r3) goto L89
                int r13 = r12.b
                r3 = 12
                if (r13 == r3) goto L89
                int r13 = r12.b
                r3 = 13
                if (r13 == r3) goto L89
                int r13 = r12.b
                r3 = 14
                if (r13 != r3) goto L76
                goto L89
            L76:
                int r13 = r12.b
                r3 = 21
                if (r13 == r3) goto L8d
                int r13 = r12.b
                r3 = 22
                if (r13 == r3) goto L8d
                int r13 = r12.b
                r3 = 23
                if (r13 != r3) goto L8c
                goto L8d
            L89:
                r0 = 10
                goto L8d
            L8c:
                r0 = 5
            L8d:
                int r13 = r2.getPriority()
                if (r13 == r0) goto L96
                r2.setPriority(r0)
            L96:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.threadpool.b.a.newThread(java.lang.Runnable):java.lang.Thread");
        }

        public static boolean a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "abc580086dacc542f2ca630a10d80a05", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "abc580086dacc542f2ca630a10d80a05")).booleanValue() : str2 != null && str2.startsWith(str);
        }
    }
}
