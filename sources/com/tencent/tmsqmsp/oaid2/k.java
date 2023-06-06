package com.tencent.tmsqmsp.oaid2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class k implements ServiceConnection {
    public static final ThreadPoolExecutor c = new ThreadPoolExecutor(0, 3, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(2048), new ThreadPoolExecutor.DiscardPolicy());
    public final LinkedBlockingQueue<IBinder> b = new LinkedBlockingQueue<>(1);
    public boolean a = false;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a implements Runnable {
        public final IBinder a;

        public a(IBinder iBinder) {
            this.a = iBinder;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                k.this.b.offer(this.a);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            c.execute(new a(iBinder));
        } catch (Throwable unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
