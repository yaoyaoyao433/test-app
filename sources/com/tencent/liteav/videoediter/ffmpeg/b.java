package com.tencent.liteav.videoediter.ffmpeg;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.videoediter.ffmpeg.jni.TXFFQuickJointerJNI;
import java.io.File;
import java.io.IOException;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b implements TXFFQuickJointerJNI.a {
    private volatile boolean a;
    private volatile boolean b;
    private volatile boolean c;
    private volatile boolean d;
    private TXFFQuickJointerJNI e = new TXFFQuickJointerJNI();
    private Handler f;
    private Handler g;
    private HandlerThread h;
    private String i;
    private volatile a j;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(b bVar, float f);

        void a(b bVar, int i, String str);
    }

    public b(String str) {
        this.e.setOnJoinerCallback(this);
        this.f = new Handler(Looper.getMainLooper());
        this.d = false;
        this.i = str + "JoinBg";
    }

    private void g() {
        if (this.h == null || !this.h.isAlive() || this.h.isInterrupted()) {
            this.h = new HandlerThread(this.i);
            this.h.start();
            this.g = new Handler(this.h.getLooper());
        }
    }

    private void h() {
        if (this.h != null) {
            this.g.post(new Runnable() { // from class: com.tencent.liteav.videoediter.ffmpeg.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.h.quit();
                    b.this.h = null;
                    b.this.g.removeCallbacksAndMessages(null);
                    b.this.g = null;
                }
            });
        }
    }

    public int a(String str) {
        if (this.c) {
            TXCLog.e("TXQuickJoiner", "quick jointer is started, you must stop first!");
            return -1;
        } else if (TextUtils.isEmpty(str)) {
            TXCLog.e("TXQuickJoiner", "quick jointer setDstPath empty！！！");
            return -1;
        } else {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            try {
                if (!file.createNewFile()) {
                    this.a = false;
                    return -1;
                }
                this.e.setDstPath(str);
                this.a = !TextUtils.isEmpty(str);
                return 0;
            } catch (IOException e) {
                e.printStackTrace();
                this.a = false;
                return -1;
            }
        }
    }

    public boolean a() {
        return this.e.verify() == 0;
    }

    public int a(List<String> list) {
        if (this.c) {
            TXCLog.e("TXQuickJoiner", "qucik jointer is started, you must stop frist!");
            return -1;
        }
        this.e.setSrcPaths(list);
        this.b = true;
        return 0;
    }

    public int b() {
        if (this.b && this.a) {
            if (this.c) {
                TXCLog.e("TXQuickJoiner", "qucik jointer is started, you must stop frist!");
                return -1;
            }
            g();
            this.g.post(new Runnable() { // from class: com.tencent.liteav.videoediter.ffmpeg.b.2
                @Override // java.lang.Runnable
                public void run() {
                    TXFFQuickJointerJNI tXFFQuickJointerJNI;
                    b.this.c = true;
                    synchronized (b.this) {
                        tXFFQuickJointerJNI = b.this.e;
                    }
                    if (tXFFQuickJointerJNI == null) {
                        TXCLog.e("TXQuickJoiner", "qucik jointer start txffQuickJointerJNI == null!");
                    } else if (tXFFQuickJointerJNI.verify() != 0) {
                        b.this.a(-1, "Not in compliance with fast composition requirements");
                    } else {
                        int start = tXFFQuickJointerJNI.start();
                        if (b.this.c) {
                            if (start < 0) {
                                b.this.a(-2, "Composition failed");
                            } else {
                                b.this.a(0, "Composition succeeded");
                            }
                            b.this.c = false;
                            return;
                        }
                        b.this.a(1, "Cancel composition");
                    }
                }
            });
            return 0;
        }
        return -1;
    }

    public int c() {
        if (this.c) {
            this.e.stop();
            h();
            this.c = false;
            return 0;
        }
        return -1;
    }

    public void d() {
        if (this.d) {
            return;
        }
        c();
        this.e.setOnJoinerCallback(null);
        this.e.destroy();
        this.j = null;
        synchronized (this) {
            this.e = null;
        }
        this.d = true;
    }

    public int e() {
        if (this.e != null) {
            return this.e.getVideoWidth();
        }
        return 0;
    }

    public int f() {
        if (this.e != null) {
            return this.e.getVideoHeight();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, final String str) {
        if (this.j != null) {
            this.f.post(new Runnable() { // from class: com.tencent.liteav.videoediter.ffmpeg.b.3
                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.j != null) {
                        b.this.j.a(b.this, i, str);
                    }
                }
            });
        }
    }

    public void a(a aVar) {
        this.j = aVar;
    }

    @Override // com.tencent.liteav.videoediter.ffmpeg.jni.TXFFQuickJointerJNI.a
    public void a(final float f) {
        if (this.j != null) {
            this.f.post(new Runnable() { // from class: com.tencent.liteav.videoediter.ffmpeg.b.4
                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.j != null) {
                        b.this.j.a(b.this, f);
                    }
                }
            });
        }
    }
}
