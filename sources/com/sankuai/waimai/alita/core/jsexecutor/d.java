package com.sankuai.waimai.alita.core.jsexecutor;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.MessageQueue;
import com.dianping.jscore.JSExecutor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static AtomicLong i = new AtomicLong(0);
    Handler b;
    b c;
    JSExecutor d;
    public a e;
    private HandlerThread f;
    private MessageQueue g;
    private MessageQueue.IdleHandler h;

    public d(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c71d02b5b0eadcb00099e7846cfebb1f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c71d02b5b0eadcb00099e7846cfebb1f");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.a("AlitaJSWorker | init : " + j);
        this.c = new b(j);
        this.f = new HandlerThread("alita_js_thread_" + j);
        this.f.start();
        this.b = new Handler(this.f.getLooper());
        this.e = new a();
        if (com.sankuai.waimai.alita.platform.init.c.c()) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc9660eb74b904c1aac5b03b5ad263b9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc9660eb74b904c1aac5b03b5ad263b9");
            } else {
                this.g = com.sankuai.waimai.alita.platform.debug.d.a(this.b);
                if (this.g != null) {
                    this.h = new MessageQueue.IdleHandler() { // from class: com.sankuai.waimai.alita.core.jsexecutor.d.2
                        public static ChangeQuickRedirect a;

                        @Override // android.os.MessageQueue.IdleHandler
                        public final boolean queueIdle() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e1e26b3040572b0f1a39adc5203f51a5", RobustBitConfig.DEFAULT_VALUE)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e1e26b3040572b0f1a39adc5203f51a5")).booleanValue();
                            }
                            d.this.c.b();
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.alita.core.utils.e.a;
                            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "11374e891d2671c739c76bebd8705f63", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "11374e891d2671c739c76bebd8705f63");
                            } else if (!com.sankuai.waimai.alita.platform.init.c.b()) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("########################### Thread ###########################\n");
                                for (int i2 = 0; i2 < com.sankuai.waimai.alita.core.utils.e.b.size(); i2++) {
                                    WeakReference<Thread> weakReference = com.sankuai.waimai.alita.core.utils.e.b.get(i2);
                                    if (weakReference != null) {
                                        Thread thread = weakReference.get();
                                        if (thread == null) {
                                            sb.append("\t\t Thread is NULL \n");
                                        } else {
                                            sb.append("\t\t Name | ");
                                            sb.append(thread.getName());
                                            sb.append(" | ID | ");
                                            sb.append(thread.getId());
                                            sb.append(" | Status | ");
                                            sb.append(thread.getState().toString());
                                            sb.append("\n");
                                        }
                                    }
                                }
                                sb.append("--------------------------------------------------------------\n");
                                com.sankuai.waimai.alita.core.utils.c.f(sb.toString());
                            }
                            return true;
                        }
                    };
                    this.g.addIdleHandler(this.h);
                }
            }
        }
        HandlerThread handlerThread = this.f;
        Object[] objArr3 = {handlerThread};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.alita.core.utils.e.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "cfc1319a98b197c2ad71872e8e9ffdef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "cfc1319a98b197c2ad71872e8e9ffdef");
        } else if (com.sankuai.waimai.alita.platform.init.c.b()) {
        } else {
            if (com.sankuai.waimai.alita.core.utils.e.b == null) {
                com.sankuai.waimai.alita.core.utils.e.b = new CopyOnWriteArrayList<>();
            }
            com.sankuai.waimai.alita.core.utils.e.b.add(new WeakReference<>(handlerThread));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "28824b5232502a80266544da5afe434c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "28824b5232502a80266544da5afe434c")).longValue();
        }
        i.incrementAndGet();
        return i.intValue();
    }

    public final synchronized JSExecutor b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5605526d5b48a86da849ca47c011628b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSExecutor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5605526d5b48a86da849ca47c011628b");
        }
        com.sankuai.waimai.alita.core.utils.g.a(this.d);
        return this.d;
    }

    public final synchronized void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf19655847d0aa4e62e3dec12ec70565", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf19655847d0aa4e62e3dec12ec70565");
            return;
        }
        if (d()) {
            this.b.post(runnable);
        }
    }

    public final void a(com.sankuai.waimai.alita.core.jsexecutor.task.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0e2131d76528b20f154476eb79f478a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0e2131d76528b20f154476eb79f478a");
            return;
        }
        a("onEnd");
        this.c.b(aVar);
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a200e8aba2864eef6dee8890b7d64e3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a200e8aba2864eef6dee8890b7d64e3c");
            return;
        }
        a("reScheduleTask");
        com.sankuai.waimai.alita.core.jsexecutor.task.a a2 = this.c.a();
        if (a2 != null) {
            a2.h();
            this.b.post(a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a2851322f8fd0fa03dabf170c360e2c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a2851322f8fd0fa03dabf170c360e2c")).booleanValue();
        }
        return (this.f == null || this.b == null || !this.f.isAlive()) ? false : true;
    }

    public final void finalize() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27a4f1289f5b5e3015a5d6437d8b9a28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27a4f1289f5b5e3015a5d6437d8b9a28");
            return;
        }
        super.finalize();
        a("finalize");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac426fd7ca3add4960db439027d1cb78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac426fd7ca3add4960db439027d1cb78");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.a("AlitaJSWorker | " + str);
    }
}
