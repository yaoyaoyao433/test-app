package com.meituan.android.pike.threadpools;

import android.os.Handler;
import android.os.Looper;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private ScheduledExecutorService b;
    private Handler c;
    private Map<Integer, ScheduledThreadPoolExecutor> d;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class b {
        public static final a a = new a();
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1015b5e2fb6b8bede3f371ebc200dd1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1015b5e2fb6b8bede3f371ebc200dd1");
            return;
        }
        this.b = c.b("PikeSDK-ThreadPools", 4);
        this.c = new Handler(Looper.getMainLooper());
        this.d = new ConcurrentHashMap();
    }

    static String a(int i) {
        String str;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5cae47aa29ce1608585e1c43914b264", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5cae47aa29ce1608585e1c43914b264");
        }
        Object[] objArr2 = new Object[1];
        Object[] objArr3 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr3, null, changeQuickRedirect2, true, "995585c6c1daca6caed4d1656850cae6", RobustBitConfig.DEFAULT_VALUE)) {
            switch (i) {
                case 1:
                    str = "file";
                    break;
                case 2:
                    str = "im_upload";
                    break;
                case 3:
                    str = "im_download";
                    break;
                default:
                    switch (i) {
                        case 11:
                            str = "send_message";
                            break;
                        case 12:
                            str = "receive_message";
                            break;
                        case 13:
                            str = "message_db";
                            break;
                        case 14:
                            str = "compress";
                            break;
                        case 15:
                            str = "message_read_db";
                            break;
                        default:
                            switch (i) {
                                case 21:
                                    str = SnifferDBHelper.COLUMN_LOG;
                                    break;
                                case 22:
                                    str = "report";
                                    break;
                                case 23:
                                    str = "doctor";
                                    break;
                                default:
                                    switch (i) {
                                        case 31:
                                            str = "live";
                                            break;
                                        case 32:
                                            str = "sdk_net_detect";
                                            break;
                                        default:
                                            str = "undefined_" + i;
                                            break;
                                    }
                            }
                    }
            }
        } else {
            str = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect2, true, "995585c6c1daca6caed4d1656850cae6");
        }
        objArr2[0] = str;
        return String.format("xm_im_sdk_%s_", objArr2);
    }

    public final synchronized void a(int i, Runnable runnable) {
        Object[] objArr = {Integer.valueOf(i), runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c742a0ab1b98129dd277aa8a2bb5fce2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c742a0ab1b98129dd277aa8a2bb5fce2");
        } else {
            a(i, runnable, 0L);
        }
    }

    private synchronized void a(int i, Runnable runnable, long j) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Object[] objArr = {Integer.valueOf(i), runnable, 0L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41216c821de3ba7a7adaf03771548341", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41216c821de3ba7a7adaf03771548341");
            return;
        }
        int i2 = 3;
        Object[] objArr2 = {Integer.valueOf(i), 1, runnable, new Long(0L)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c498f98f245f0673a0a06d248f98735", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c498f98f245f0673a0a06d248f98735");
            return;
        }
        synchronized (this.d) {
            scheduledThreadPoolExecutor = this.d.get(Integer.valueOf(i));
            if (scheduledThreadPoolExecutor == null) {
                switch (i) {
                    case 1:
                        i2 = 5;
                        break;
                    case 2:
                    case 3:
                        break;
                    default:
                        switch (i) {
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                                break;
                            default:
                                switch (i) {
                                    case 21:
                                    case 22:
                                    case 23:
                                        break;
                                    default:
                                        switch (i) {
                                        }
                                }
                        }
                        i2 = 1;
                        break;
                }
                Object[] objArr3 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) c.b("PikeSDK-ThreadPools", i2, PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "02809a05405f1ac91ce5d1da9cbbd4f4", RobustBitConfig.DEFAULT_VALUE) ? (ThreadFactory) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "02809a05405f1ac91ce5d1da9cbbd4f4") : new ThreadFactoryC0347a(i));
                this.d.put(Integer.valueOf(i), scheduledThreadPoolExecutor);
            }
        }
        if (scheduledThreadPoolExecutor != null) {
            if (scheduledThreadPoolExecutor.getQueue().size() > (i == 12 ? 10000 : 5000)) {
                StringBuilder sb = new StringBuilder();
                sb.append(a(i));
                sb.append(scheduledThreadPoolExecutor.getQueue().size());
                return;
            }
            scheduledThreadPoolExecutor.schedule(runnable, 0L, TimeUnit.MILLISECONDS);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.pike.threadpools.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class ThreadFactoryC0347a implements ThreadFactory {
        public static ChangeQuickRedirect a;
        private int b;
        private int c;

        private ThreadFactoryC0347a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "193f92fab879019b39fa11d2b96051a9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "193f92fab879019b39fa11d2b96051a9");
                return;
            }
            this.b = 0;
            this.c = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
            if (r12.c != 23) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
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
                com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.pike.threadpools.a.ThreadFactoryC0347a.a
                java.lang.String r11 = "1e604121cce59011f46c546512ce24a3"
                r4 = 0
                r6 = 4611686018427387904(0x4000000000000000, double:2.0)
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
                int r1 = r12.c
                java.lang.String r1 = com.meituan.android.pike.threadpools.a.a(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                int r1 = r12.b
                int r3 = r1 + 1
                r12.b = r3
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.Thread r2 = new java.lang.Thread
                r2.<init>(r13, r1)
                boolean r13 = r2.isDaemon()
                if (r13 == 0) goto L47
                r2.setDaemon(r9)
            L47:
                int r13 = r12.c
                r1 = 5
                if (r13 == r0) goto L8c
                int r13 = r12.c
                r3 = 2
                if (r13 == r3) goto L8c
                int r13 = r12.c
                r3 = 3
                if (r13 == r3) goto L8c
                int r13 = r12.c
                r3 = 15
                if (r13 != r3) goto L5d
                goto L8c
            L5d:
                int r13 = r12.c
                r3 = 11
                if (r13 == r3) goto L89
                int r13 = r12.c
                r3 = 12
                if (r13 == r3) goto L89
                int r13 = r12.c
                r3 = 13
                if (r13 == r3) goto L89
                int r13 = r12.c
                r3 = 14
                if (r13 != r3) goto L76
                goto L89
            L76:
                int r13 = r12.c
                r3 = 21
                if (r13 == r3) goto L8d
                int r13 = r12.c
                r3 = 22
                if (r13 == r3) goto L8d
                int r13 = r12.c
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
            throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.pike.threadpools.a.ThreadFactoryC0347a.newThread(java.lang.Runnable):java.lang.Thread");
        }
    }
}
