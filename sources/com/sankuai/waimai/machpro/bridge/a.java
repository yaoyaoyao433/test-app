package com.sankuai.waimai.machpro.bridge;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.MachMap;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static HandlerThread f;
    Handler b;
    Handler c;
    long d;
    Map<Long, WeakReference<RunnableC1023a>> e;
    private Handler.Callback g;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd6eae764410608ec98b2e2efcbadab0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd6eae764410608ec98b2e2efcbadab0");
            return;
        }
        this.c = new Handler(Looper.getMainLooper());
        this.g = new Handler.Callback() { // from class: com.sankuai.waimai.machpro.bridge.a.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(@NonNull Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f8b99a43f45c83cc3eda727e880a194", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f8b99a43f45c83cc3eda727e880a194")).booleanValue();
                }
                if (message.what == 1 && (message.obj instanceof RunnableC1023a)) {
                    a.this.c.post((RunnableC1023a) message.obj);
                }
                return false;
            }
        };
        if (f == null || !f.isAlive()) {
            HandlerThread handlerThread = new HandlerThread("MathPro_Timer");
            f = handlerThread;
            handlerThread.start();
        }
        this.b = new Handler(f.getLooper(), this.g);
        this.e = new ConcurrentHashMap();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.machpro.bridge.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class RunnableC1023a implements Runnable {
        public static ChangeQuickRedirect a;
        private MPJSCallBack c;
        private long d;
        private boolean e;
        private long f;

        public RunnableC1023a(MPJSCallBack mPJSCallBack, long j, boolean z, long j2) {
            Object[] objArr = {a.this, mPJSCallBack, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b236e2fc9079edf622f84e688db5ebe1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b236e2fc9079edf622f84e688db5ebe1");
                return;
            }
            this.c = mPJSCallBack;
            this.d = j;
            this.e = z;
            this.f = j2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad890bca3b5963a17d579b4db9a956f8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad890bca3b5963a17d579b4db9a956f8");
                return;
            }
            if (this.e) {
                Message obtainMessage = a.this.b.obtainMessage(1);
                obtainMessage.obj = this;
                a.this.b.sendMessageDelayed(obtainMessage, this.f);
            } else {
                a.this.e.remove(Long.valueOf(this.d));
            }
            if (this.c != null) {
                this.c.invoke((MachMap) null);
            }
        }
    }
}
