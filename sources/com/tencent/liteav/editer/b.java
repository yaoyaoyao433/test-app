package com.tencent.liteav.editer;

import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Build;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.smtt.sdk.TbsListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingDeque;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    private volatile AudioTrack a;
    private volatile com.tencent.liteav.d.e b;
    private LinkedBlockingDeque<com.tencent.liteav.d.e> c = new LinkedBlockingDeque<>();
    private C1452b d;
    private volatile a e;
    private int f;
    private int g;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.tencent.liteav.d.e eVar) {
        if (this.b == null) {
            this.b = eVar;
        }
        if (eVar.f() == 4) {
            e();
            return;
        }
        byte[] array = eVar.b().array();
        int remaining = eVar.b().remaining();
        if (remaining != 0) {
            try {
                if (this.a != null && this.a.getPlayState() == 3) {
                    this.a.write(array, eVar.b().arrayOffset(), remaining);
                    if (this.c.size() > 0) {
                        this.c.remove();
                    }
                    if (this.e != null) {
                        this.e.a(this.c.size());
                    }
                }
            } catch (Exception e) {
                TXCLog.e("AudioTrackRender", "write data to AudioTrack failed.", e);
            }
        }
        this.b = eVar;
    }

    public void a(a aVar) {
        this.e = aVar;
    }

    public void a() {
        try {
            if (this.a != null) {
                this.a.pause();
            }
        } catch (Exception e) {
            TXCLog.e("AudioTrackRender", "pause audio track failed.", e);
        }
    }

    public void b() {
        try {
            if (this.a == null || this.a.getPlayState() == 3) {
                return;
            }
            this.a.play();
        } catch (Exception e) {
            TXCLog.e("AudioTrackRender", "AudioTrack play failed.", e);
        }
    }

    public void c() {
        a(this.g, this.f);
    }

    public void a(MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            e();
        } else if (Build.VERSION.SDK_INT >= 16) {
            int integer = mediaFormat.getInteger("sample-rate");
            int integer2 = mediaFormat.getInteger("channel-count");
            if (this.f != integer || this.g != integer2) {
                e();
            }
            this.f = integer;
            this.g = integer2;
            TXCLog.i("AudioTrackRender", "setAudioFormat sampleRate=" + integer + ",channelCount=" + integer2);
        }
    }

    public void a(com.tencent.liteav.d.e eVar) {
        if (this.d == null || !this.d.isAlive() || this.d.isInterrupted()) {
            this.d = new C1452b(this);
            this.d.start();
        }
        this.c.add(eVar);
        if (this.e != null) {
            this.e.a(this.c.size());
        }
    }

    private boolean a(int i, int i2) {
        int i3 = i != 1 ? (i == 2 || i == 3) ? 12 : (i == 4 || i == 5) ? TbsListener.ErrorCode.APK_INVALID : (i == 6 || i == 7) ? 252 : i == 8 ? 6396 : 0 : 4;
        if (this.a == null) {
            int minBufferSize = AudioTrack.getMinBufferSize(i2, i3, 2);
            try {
                this.a = new AudioTrack(3, i2, i3, 2, minBufferSize, 1);
                this.a.play();
            } catch (IllegalArgumentException e) {
                TXCLog.e("AudioTrackRender", "new AudioTrack IllegalArgumentException: " + e + ", sampleRate: " + i2 + ", channelType: " + i3 + ", minBufferLen: " + minBufferSize);
                this.a = null;
                return true;
            } catch (IllegalStateException e2) {
                TXCLog.e("AudioTrackRender", "new AudioTrack IllegalArgumentException: " + e2 + ", sampleRate: " + i2 + ", channelType: " + i3 + ", minBufferLen: " + minBufferSize);
                if (this.a != null) {
                    this.a.release();
                }
                this.a = null;
                return true;
            }
        }
        return false;
    }

    private void e() {
        try {
            if (this.a != null) {
                this.a.stop();
                this.a.release();
            }
            this.a = null;
        } catch (Exception e) {
            this.a = null;
            TXCLog.e("AudioTrackRender", "audio track stop exception: " + e);
        }
    }

    public void d() {
        this.c.clear();
        if (this.d != null) {
            this.d.a();
            this.d = null;
        }
        TXCLog.i("AudioTrackRender", "mPlayPCMThread:" + this.d);
        this.b = null;
        e();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.liteav.editer.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C1452b extends Thread {
        private WeakReference<b> a;

        public C1452b(b bVar) {
            super("PlayPCMThread for Video Editer");
            this.a = new WeakReference<>(bVar);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            while (!isInterrupted()) {
                try {
                    com.tencent.liteav.d.e b = b();
                    if (b != null) {
                        a(b);
                    }
                } catch (Exception e) {
                    TXCLog.e("AudioTrackRender", "play frame failed.", e);
                    return;
                }
            }
        }

        private void a(com.tencent.liteav.d.e eVar) {
            c();
            this.a.get().b(eVar);
        }

        private com.tencent.liteav.d.e b() throws InterruptedException {
            c();
            return (com.tencent.liteav.d.e) this.a.get().c.peek();
        }

        private void c() {
            if (this.a.get() == null) {
                throw new RuntimeException("can't reach the object: AudioTrackRender");
            }
        }

        public void a() {
            interrupt();
            this.a.clear();
            this.a = null;
        }
    }
}
