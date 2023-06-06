package com.tencent.liteav.screencapture;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.WindowManager;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.f;
import com.tencent.liteav.basic.util.i;
import com.tencent.mapsdk.internal.y;
import com.tencent.rtmp.video.TXScreenCapture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
@TargetApi(21)
/* loaded from: classes6.dex */
public class c {
    private static volatile c a;
    private final Context b;
    private MediaProjection f;
    private i g;
    private boolean h;
    private final Map<Surface, a> d = new HashMap();
    private boolean e = false;
    private MediaProjection.Callback i = new MediaProjection.Callback() { // from class: com.tencent.liteav.screencapture.c.1
        @Override // android.media.projection.MediaProjection.Callback
        public void onStop() {
            TXCLog.e("VirtualDisplayManager", "MediaProjection session is no longer valid");
            HashMap hashMap = new HashMap(c.this.d);
            c.this.d.clear();
            for (a aVar : hashMap.values()) {
                if (aVar.d != null) {
                    if (aVar.e != null) {
                        aVar.d.a();
                    } else {
                        aVar.d.a(false, false);
                    }
                }
            }
            c.this.a(false);
        }
    };
    private i.a j = new i.a() { // from class: com.tencent.liteav.screencapture.c.2
        @Override // com.tencent.liteav.basic.util.i.a
        public void onTimeout() {
            boolean b2 = c.this.b(c.this.b);
            if (c.this.h == b2) {
                return;
            }
            c.this.h = b2;
            for (a aVar : c.this.d.values()) {
                if (aVar.d != null) {
                    aVar.d.a(b2);
                }
            }
        }
    };
    private final Handler c = new f(Looper.getMainLooper());

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b {
        void a();

        void a(boolean z);

        void a(boolean z, boolean z2);
    }

    public static c a(Context context) {
        if (a == null) {
            synchronized (c.class) {
                if (a == null) {
                    a = new c(context);
                }
            }
        }
        return a;
    }

    public c(Context context) {
        this.b = context.getApplicationContext();
        this.h = b(context);
    }

    public void a(Surface surface, int i, int i2, b bVar) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must call this method in main thread!");
        }
        if (surface == null) {
            TXCLog.e("VirtualDisplayManager", "surface is null!");
            bVar.a(false, false);
            return;
        }
        a aVar = new a();
        aVar.a = surface;
        aVar.b = i;
        aVar.c = i2;
        aVar.d = bVar;
        aVar.e = null;
        this.d.put(surface, aVar);
        if (this.f == null) {
            if (this.e) {
                return;
            }
            this.e = true;
            Intent intent = new Intent(this.b, TXScreenCapture.TXScreenCaptureAssistantActivity.class);
            intent.addFlags(y.a);
            this.b.startActivity(intent);
            return;
        }
        a();
    }

    public void a(Surface surface) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must call this at main thread!");
        }
        if (surface == null) {
            return;
        }
        a remove = this.d.remove(surface);
        if (remove != null && remove.e != null) {
            remove.e.release();
            TXCLog.i("VirtualDisplayManager", "VirtualDisplay released, " + remove.e);
        }
        a(true);
    }

    private void a() {
        for (a aVar : this.d.values()) {
            if (aVar.e == null) {
                aVar.e = this.f.createVirtualDisplay("TXCScreenCapture", aVar.b, aVar.c, 1, 1, aVar.a, null, null);
                TXCLog.i("VirtualDisplayManager", "create VirtualDisplay " + aVar.e);
                if (aVar.d != null) {
                    aVar.d.a(true, false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (this.d.isEmpty()) {
            if (z) {
                this.c.postDelayed(new Runnable() { // from class: com.tencent.liteav.screencapture.c.3
                    @Override // java.lang.Runnable
                    public void run() {
                        c.this.a(false);
                    }
                }, TimeUnit.SECONDS.toMillis(1L));
                return;
            }
            TXCLog.i("VirtualDisplayManager", "stop media projection session " + this.f);
            if (this.f != null) {
                this.f.unregisterCallback(this.i);
                this.f.stop();
                this.f = null;
            }
            if (this.g != null) {
                this.g.a();
                this.g = null;
            }
        }
    }

    public void a(MediaProjection mediaProjection) {
        this.e = false;
        if (mediaProjection == null) {
            HashMap hashMap = new HashMap(this.d);
            this.d.clear();
            for (a aVar : hashMap.values()) {
                if (aVar.d != null) {
                    aVar.d.a(false, true);
                }
            }
            return;
        }
        TXCLog.i("VirtualDisplayManager", "Got session " + mediaProjection);
        this.f = mediaProjection;
        this.f.registerCallback(this.i, this.c);
        a();
        this.g = new i(Looper.getMainLooper(), this.j);
        this.g.a(50, 50);
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(Context context) {
        int rotation;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        return windowManager == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == 0 || rotation == 2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public Surface a;
        public int b;
        public int c;
        public b d;
        public VirtualDisplay e;

        private a() {
        }
    }
}
