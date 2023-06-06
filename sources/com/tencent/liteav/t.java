package com.tencent.liteav;

import android.content.Context;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class t {
    protected Context c;
    protected WeakReference<com.tencent.liteav.basic.c.b> e;
    protected j b = null;
    protected TXCloudVideoView d = null;

    public int a(String str) {
        return -1;
    }

    public abstract int a(String str, int i);

    public abstract int a(boolean z);

    public abstract void a(int i);

    public void a(int i, int i2) {
    }

    public void a(Context context, int i) {
    }

    public void a(Surface surface) {
    }

    public abstract void a(com.tencent.liteav.basic.opengl.p pVar);

    public void a(u uVar, com.tencent.liteav.basic.b.b bVar, Object obj) {
    }

    public void a(TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener) {
    }

    public void a(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
    }

    public abstract void a(boolean z, int i);

    public abstract void b(int i);

    public abstract void b(boolean z);

    public abstract void c(int i);

    public abstract void c(boolean z);

    public abstract boolean c();

    public abstract int d(int i);

    public TextureView d() {
        return null;
    }

    public boolean d(boolean z) {
        return false;
    }

    public abstract int e();

    public boolean f() {
        return false;
    }

    public void g() {
    }

    public abstract int i();

    public t(Context context) {
        this.c = null;
        if (context != null) {
            this.c = context.getApplicationContext();
        }
    }

    public j q() {
        return this.b;
    }

    public void a(j jVar) {
        this.b = jVar;
        if (this.b == null) {
            this.b = new j();
        }
    }

    public void a() {
        TXCLog.w("TXIPlayer", "pause not support");
    }

    public void b() {
        TXCLog.w("TXIPlayer", "resume not support");
    }

    public void e(int i) {
        TXCLog.w("TXIPlayer", "seek not support");
    }

    public void a(TXCloudVideoView tXCloudVideoView) {
        this.d = tXCloudVideoView;
    }

    public void a(com.tencent.liteav.basic.c.b bVar) {
        this.e = new WeakReference<>(bVar);
    }

    public void e(boolean z) {
        TXCLog.w("TXIPlayer", "autoPlay not implement");
    }

    public void b(float f) {
        TXCLog.w("TXIPlayer", "rate not implement");
    }
}
