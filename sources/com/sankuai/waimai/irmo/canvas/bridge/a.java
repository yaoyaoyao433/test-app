package com.sankuai.waimai.irmo.canvas.bridge;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static HandlerThread f;
    public Handler b;
    public Handler c;
    public long d;
    public Map<Long, WeakReference<RunnableC0970a>> e;
    private Handler.Callback g;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9afe636c1adf57ea48f5472441e6802", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9afe636c1adf57ea48f5472441e6802");
            return;
        }
        this.c = new Handler(Looper.getMainLooper());
        this.g = new Handler.Callback() { // from class: com.sankuai.waimai.irmo.canvas.bridge.a.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(@NonNull Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41dc45659e24c5e992a3d9c0163d75d8", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41dc45659e24c5e992a3d9c0163d75d8")).booleanValue();
                }
                if (message.what == 1 && (message.obj instanceof RunnableC0970a)) {
                    a.this.c.post((RunnableC0970a) message.obj);
                }
                return false;
            }
        };
        if (f == null || !f.isAlive()) {
            HandlerThread handlerThread = new HandlerThread("INF_Timer");
            f = handlerThread;
            handlerThread.start();
        }
        this.b = new Handler(f.getLooper(), this.g);
        this.e = new ConcurrentHashMap();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.irmo.canvas.bridge.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0970a implements Runnable {
        public static ChangeQuickRedirect a;
        private INFJSCallBack c;
        private long d;
        private boolean e;
        private long f;

        public RunnableC0970a(INFJSCallBack iNFJSCallBack, long j, boolean z, long j2) {
            Object[] objArr = {a.this, iNFJSCallBack, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf7034023a5c817f2aea94d4e7ce8fee", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf7034023a5c817f2aea94d4e7ce8fee");
                return;
            }
            this.c = iNFJSCallBack;
            this.d = j;
            this.e = z;
            this.f = j2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62b1c60ec98827c229010a03226956ff", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62b1c60ec98827c229010a03226956ff");
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
                this.c.invoke(null);
            }
        }
    }
}
