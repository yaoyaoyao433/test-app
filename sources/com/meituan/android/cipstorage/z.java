package com.meituan.android.cipstorage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class z implements Handler.Callback, ad {
    public static ChangeQuickRedirect a;
    private final Handler b;
    private final Handler c;
    private final ExecutorService d;

    public z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25552221969a43109de1f0d09e9feef0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25552221969a43109de1f0d09e9feef0");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("cip#io");
        handlerThread.start();
        this.c = new Handler(Looper.getMainLooper(), this);
        this.b = new Handler(handlerThread.getLooper(), this);
        this.d = new ThreadPoolExecutor(1, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.meituan.android.cipstorage.z.1
            public static ChangeQuickRedirect a;
            private final ThreadGroup c = Thread.currentThread().getThreadGroup();
            private final AtomicInteger d = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Object[] objArr2 = {runnable};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1078b0cfe3fcebec218cac8dbd67bcf9", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Thread) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1078b0cfe3fcebec218cac8dbd67bcf9");
                }
                ThreadGroup threadGroup = this.c;
                Thread thread = new Thread(threadGroup, runnable, "cip#" + this.d.getAndIncrement(), 0L);
                if (thread.isDaemon()) {
                    thread.setDaemon(false);
                }
                if (thread.getPriority() != 5) {
                    thread.setPriority(5);
                }
                return thread;
            }
        });
    }

    private int d(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a459824cb75fcb1c7c8f501d054f69e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a459824cb75fcb1c7c8f501d054f69e")).intValue() : runnable.hashCode();
    }

    private Message e(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce270173e9c6a9fdf5f6e88d6f909518", RobustBitConfig.DEFAULT_VALUE)) {
            return (Message) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce270173e9c6a9fdf5f6e88d6f909518");
        }
        Message obtain = Message.obtain();
        obtain.what = d(runnable);
        obtain.obj = runnable;
        return obtain;
    }

    @Override // com.meituan.android.cipstorage.ad
    public final void a(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fd84202ab6ddfe3c2eaf162e578ea12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fd84202ab6ddfe3c2eaf162e578ea12");
        } else {
            this.c.sendMessageDelayed(e(runnable), j);
        }
    }

    @Override // com.meituan.android.cipstorage.ad
    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6999518c972de3e48eeac7ff383a505d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6999518c972de3e48eeac7ff383a505d");
        } else {
            this.c.removeMessages(d(runnable));
        }
    }

    @Override // com.meituan.android.cipstorage.ad
    public final void b(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e032632daa70295f63c22e2400ad62c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e032632daa70295f63c22e2400ad62c0");
        } else {
            this.b.sendMessage(e(runnable));
        }
    }

    @Override // com.meituan.android.cipstorage.ad
    public final void c(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "567f944b97a32060067bee4f994a1a29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "567f944b97a32060067bee4f994a1a29");
        } else {
            this.d.execute(runnable);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23ad68d9545c9739c6abac57641f524d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23ad68d9545c9739c6abac57641f524d")).booleanValue();
        }
        if (message.obj instanceof Runnable) {
            ((Runnable) message.obj).run();
            return true;
        }
        return false;
    }
}
