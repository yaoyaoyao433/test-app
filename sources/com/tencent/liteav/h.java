package com.tencent.liteav;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.waimai.addrsdk.mvp.bean.AddressBean;
import com.tencent.avroom.TXCAVRoomConstants;
import com.tencent.liteav.TXCRenderAndDec;
import com.tencent.liteav.audio.TXCAudioEngine;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.h.a;
import com.tencent.liteav.network.TXCStreamDownloader;
import com.tencent.liteav.renderer.a;
import com.tencent.mapsdk.internal.jw;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class h extends t implements TXCRenderAndDec.a, TXCRenderAndDec.b, com.tencent.liteav.audio.d, com.tencent.liteav.audio.f, com.tencent.liteav.basic.c.b, com.tencent.liteav.network.h, a.InterfaceC1460a, com.tencent.liteav.renderer.h {
    private com.tencent.liteav.renderer.i A;
    private com.tencent.liteav.renderer.i B;
    private float[] C;
    private float[] D;
    private String E;
    private int F;
    private boolean G;
    private com.tencent.liteav.basic.b.b H;
    private Object I;
    private com.tencent.liteav.basic.c.a J;
    private TXLivePlayer.ITXAudioRawDataListener K;
    private String L;
    private boolean M;
    private long N;
    private long O;
    private a P;
    private TXCRenderAndDec a;
    private com.tencent.liteav.renderer.a f;
    private TXCStreamDownloader g;
    private Handler h;
    private TextureView i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private Surface p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private com.tencent.liteav.h.a v;
    private TXRecordCommon.ITXVideoRecordListener w;
    private e x;
    private int y;
    private int z;

    @Override // com.tencent.liteav.t
    public boolean f() {
        return true;
    }

    @Override // com.tencent.liteav.network.h
    public void onPullAudio(com.tencent.liteav.basic.structs.a aVar) {
    }

    public h(Context context) {
        super(context);
        this.a = null;
        this.f = null;
        this.g = null;
        boolean z = false;
        this.j = false;
        this.k = false;
        this.l = 100;
        this.m = 0;
        this.n = 0;
        this.o = false;
        this.q = 2;
        this.r = 48000;
        this.s = 16;
        this.t = false;
        this.u = false;
        this.y = 0;
        this.z = 0;
        this.A = null;
        this.B = null;
        this.C = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
        this.D = new float[16];
        this.E = "";
        this.G = false;
        this.H = com.tencent.liteav.basic.b.b.UNKNOWN;
        this.I = null;
        this.J = new com.tencent.liteav.basic.c.a() { // from class: com.tencent.liteav.h.1
            @Override // com.tencent.liteav.basic.c.a
            public void onEvent(String str, int i, String str2, String str3) {
                TXCLog.i("TXCLivePlayer", "onEvent => id:" + str + " code:" + i + " msg:" + str2 + " params:" + str3);
                WeakReference<com.tencent.liteav.basic.c.b> weakReference = h.this.e;
                if ((weakReference == null ? null : weakReference.get()) != null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt(TXCAVRoomConstants.EVT_ID, i);
                    bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                    bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
                    if (str2 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        if (str3 == null) {
                            str3 = "";
                        }
                        sb.append(str3);
                        bundle.putCharSequence("EVT_MSG", sb.toString());
                    }
                    h.this.onNotifyEvent(i, bundle);
                }
            }

            @Override // com.tencent.liteav.basic.c.a
            public void onWarning(String str, int i, String str2, String str3) {
                TXCLog.i("TXCLivePlayer", "onWarning => id:" + str + " code:" + i + " msg:" + str2 + " params:" + str3);
                WeakReference<com.tencent.liteav.basic.c.b> weakReference = h.this.e;
                if ((weakReference == null ? null : weakReference.get()) != null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt(TXCAVRoomConstants.EVT_ID, i);
                    bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                    if (str2 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        if (str3 == null) {
                            str3 = "";
                        }
                        sb.append(str3);
                        bundle.putCharSequence("EVT_MSG", sb.toString());
                    }
                    h.this.onNotifyEvent(i, bundle);
                }
            }

            @Override // com.tencent.liteav.basic.c.a
            public void onError(String str, int i, String str2, String str3) {
                TXCLog.e("TXCLivePlayer", "onError => id:" + str + " code:" + i + " msg:" + str2 + " params:" + str3);
                WeakReference<com.tencent.liteav.basic.c.b> weakReference = h.this.e;
                if ((weakReference == null ? null : weakReference.get()) != null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt(TXCAVRoomConstants.EVT_ID, i);
                    bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                    bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
                    if (str2 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        if (str3 == null) {
                            str3 = "";
                        }
                        sb.append(str3);
                        bundle.putCharSequence("EVT_MSG", sb.toString());
                    }
                    h.this.onNotifyEvent(i, bundle);
                }
            }
        };
        this.L = "";
        this.M = false;
        this.N = 0L;
        this.O = 0L;
        this.P = null;
        com.tencent.liteav.basic.d.c.a().a(context);
        TXCAudioEngine.CreateInstance(context, com.tencent.liteav.basic.d.c.a().c());
        TXCAudioEngine.getInstance().addEventCallback(new WeakReference<>(this.J));
        long a2 = com.tencent.liteav.basic.d.c.a().a("Audio", "EnableAutoRestartDevice");
        TXCAudioEngine.getInstance().enableAutoRestartDevice((a2 == 1 || a2 == -1) ? true : true);
        this.h = new Handler(Looper.getMainLooper());
        this.f = new com.tencent.liteav.renderer.a();
        this.f.a((com.tencent.liteav.basic.c.b) this);
        this.P = new a(this);
    }

    @Override // com.tencent.liteav.t
    public void a(TXCloudVideoView tXCloudVideoView) {
        TextureView videoView;
        if (this.d != null && this.d != tXCloudVideoView && (videoView = this.d.getVideoView()) != null) {
            this.d.removeView(videoView);
        }
        super.a(tXCloudVideoView);
        if (this.d != null) {
            this.i = this.d.getVideoView();
            if (this.i == null) {
                this.i = new TextureView(this.d.getContext());
            }
            this.d.addVideoView(this.i);
        }
        if (this.f != null) {
            this.f.a(this.i);
        }
    }

    @Override // com.tencent.liteav.t
    public void a(Surface surface) {
        this.p = surface;
        if (this.f != null) {
            this.f.a(surface);
        }
    }

    @Override // com.tencent.liteav.t
    public void a(int i, int i2) {
        if (this.f != null) {
            this.f.d(i, i2);
        }
    }

    @Override // com.tencent.liteav.t
    public void a(j jVar) {
        super.a(jVar);
        if (this.a != null) {
            this.a.setConfig(jVar);
        }
    }

    @Override // com.tencent.liteav.t
    public int a(String str, int i) {
        if (c()) {
            TXCLog.w("TXCLivePlayer", "play: ignore start play when is playing");
            return -2;
        } else if (this.b != null && this.b.c > this.b.b) {
            TXCLog.e("TXCLivePlayer", "play: can not start play while invalid cache config [minAutoAdjustCacheTime(" + this.b.c + ") > maxAutoAdjustCacheTime(" + this.b.b + ")]!!!!!!");
            return -1;
        } else {
            if (this.b.a > this.b.b || this.b.a < this.b.c) {
                TXCLog.w("TXCLivePlayer", "play: invalid cacheTime " + this.b.a + ", need between minAutoAdjustCacheTime " + this.b.c + " and maxAutoAdjustCacheTime " + this.b.b + " , fix to maxAutoAdjustCacheTime");
                this.b.a = this.b.b;
            }
            this.E = str;
            this.F = i;
            b(str);
            this.o = true;
            this.u = true;
            f(i);
            n();
            int b = b(str, i);
            if (b != 0) {
                this.o = false;
                p();
                m();
                o();
                if (this.i != null) {
                    this.i.setVisibility(8);
                }
            } else {
                a(this.p);
                r();
                v();
                if (this.H == com.tencent.liteav.basic.b.b.TEXTURE_2D && this.i == null && this.f != null) {
                    this.f.c(this.I);
                }
                TXCDRApi.txReportDAU(this.c, com.tencent.liteav.basic.datareport.a.bu);
                try {
                    if (Class.forName("com.tencent.liteav.demo.play.SuperPlayerView") != null) {
                        TXCDRApi.txReportDAU(this.c, com.tencent.liteav.basic.datareport.a.bF);
                    }
                } catch (Exception unused) {
                }
            }
            return b;
        }
    }

    @Override // com.tencent.liteav.t
    public int a(boolean z) {
        if (!c()) {
            TXCLog.w("TXCLivePlayer", "play: ignore stop play when not started");
            return -2;
        }
        TXCLog.v("TXCLivePlayer", "play: stop");
        this.o = false;
        p();
        m();
        if (this.i != null && z) {
            this.i.setVisibility(8);
        }
        if (this.f != null) {
            this.f.a((Surface) null);
        }
        if (this.i == null && this.f != null) {
            this.f.d();
        }
        o();
        s();
        w();
        t();
        return 0;
    }

    @Override // com.tencent.liteav.t
    public int a(String str) {
        if (!c() || this.g == null) {
            return -1;
        }
        boolean switchStream = this.g.switchStream(str);
        if (this.a != null) {
            TXCLog.w("TXCLivePlayer", " stream_switch video cache " + this.a.getVideoCacheDuration() + " audio cache " + TXCStatus.c(this.L, 2007));
        }
        if (switchStream) {
            this.E = str;
            return 0;
        }
        return -2;
    }

    @Override // com.tencent.liteav.t
    public void a() {
        a(false);
    }

    @Override // com.tencent.liteav.t
    public void b() {
        a(this.E, this.F);
    }

    @Override // com.tencent.liteav.t
    public boolean c() {
        return this.o;
    }

    @Override // com.tencent.liteav.t
    public void a(int i) {
        this.n = i;
        if (this.a != null) {
            this.a.setRenderMode(i);
        }
    }

    @Override // com.tencent.liteav.t
    public void b(int i) {
        this.m = i;
        if (this.a != null) {
            this.a.setRenderRotation(i);
        }
    }

    @Override // com.tencent.liteav.t
    public void b(boolean z) {
        this.j = z;
        TXCAudioEngine.getInstance().muteRemoteAudio(this.L, this.j);
    }

    @Override // com.tencent.liteav.t
    public void c(boolean z) {
        this.k = z;
        TXCAudioEngine.getInstance().muteRemoteAudioInSpeaker(this.L, z);
    }

    @Override // com.tencent.liteav.t
    public void c(int i) {
        this.l = i;
        TXCAudioEngine.getInstance().setRemotePlayoutVolume(this.L, this.l);
    }

    @Override // com.tencent.liteav.t
    public void a(Context context, int i) {
        TXCAudioEngine.getInstance();
        TXCAudioEngine.setAudioRoute(i);
    }

    @Override // com.tencent.liteav.t
    public void a(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.w = iTXVideoRecordListener;
    }

    @Override // com.tencent.liteav.t
    public int d(int i) {
        if (this.t) {
            TXCLog.e("TXCLivePlayer", "startRecord: there is existing uncompleted record task");
            return -1;
        }
        this.t = true;
        this.f.a((com.tencent.liteav.renderer.h) this);
        this.f.a((a.InterfaceC1460a) this);
        y();
        TXCDRApi.txReportDAU(this.c, com.tencent.liteav.basic.datareport.a.aw);
        return 0;
    }

    @Override // com.tencent.liteav.t
    public TextureView d() {
        return this.i;
    }

    @Override // com.tencent.liteav.t
    public void a(TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener) {
        this.K = iTXAudioRawDataListener;
        y();
    }

    @Override // com.tencent.liteav.t
    public int e() {
        if (!this.t) {
            TXCLog.w("TXCLivePlayer", "stopRecord: no recording task exist");
            return -1;
        }
        this.t = false;
        y();
        if (this.v != null) {
            this.v.a();
            this.v = null;
        }
        return 0;
    }

    @Override // com.tencent.liteav.t
    public void a(u uVar, com.tencent.liteav.basic.b.b bVar, Object obj) {
        this.H = bVar;
        this.I = obj;
        if (c() && this.H == com.tencent.liteav.basic.b.b.TEXTURE_2D && this.i == null && uVar != null && this.f != null) {
            this.f.c(this.I);
        }
        if (this.a != null) {
            this.a.setVideoFrameListener(uVar, bVar);
        } else {
            TXCLog.w("TXCLivePlayer", "setVideoFrameListener->enter with renderAndDec is empty");
        }
    }

    @Override // com.tencent.liteav.t
    public void a(com.tencent.liteav.basic.opengl.p pVar) {
        if (this.f != null) {
            this.f.a(pVar);
        }
    }

    private void j() {
        if (this.v == null) {
            this.y = this.f.h();
            this.z = this.f.i();
            a.C1454a l = l();
            this.v = new com.tencent.liteav.h.a(this.c);
            this.v.a(l);
            this.v.a(new a.b() { // from class: com.tencent.liteav.h.2
                @Override // com.tencent.liteav.h.a.b
                public void a(int i, String str, String str2, String str3) {
                    if (h.this.w != null) {
                        TXRecordCommon.TXRecordResult tXRecordResult = new TXRecordCommon.TXRecordResult();
                        if (i == 0) {
                            tXRecordResult.retCode = 0;
                        } else {
                            tXRecordResult.retCode = -1;
                        }
                        tXRecordResult.descMsg = str;
                        tXRecordResult.videoPath = str2;
                        tXRecordResult.coverPath = str3;
                        h.this.w.onRecordComplete(tXRecordResult);
                    }
                    h.this.f.a((com.tencent.liteav.renderer.h) null);
                    h.this.f.a((a.InterfaceC1460a) null);
                }

                @Override // com.tencent.liteav.h.a.b
                public void a(long j) {
                    if (h.this.w != null) {
                        h.this.w.onRecordProgress(j);
                    }
                }
            });
        }
        if (this.A == null) {
            this.A = new com.tencent.liteav.renderer.i(Boolean.TRUE);
            this.A.b();
            this.A.b(this.y, this.z);
            this.A.a(this.y, this.z);
        }
        if (this.B == null) {
            this.B = new com.tencent.liteav.renderer.i(Boolean.FALSE);
            this.B.b();
            this.B.b(this.f.f(), this.f.g());
            this.B.a(this.f.f(), this.f.g());
            Matrix.setIdentityM(this.D, 0);
        }
    }

    private void k() {
        if (this.A != null) {
            this.A.c();
            this.A = null;
        }
        if (this.B != null) {
            this.B.c();
            this.B = null;
        }
    }

    private a.C1454a l() {
        int i;
        int i2;
        if (this.y <= 0 || this.z <= 0) {
            i = jw.g;
            i2 = jw.h;
        } else {
            i = this.y;
            i2 = this.z;
        }
        a.C1454a c1454a = new a.C1454a();
        c1454a.a = i;
        c1454a.b = i2;
        c1454a.c = 20;
        c1454a.d = (int) (Math.sqrt((i * i * 1.0d) + (i2 * i2)) * 1.2d);
        c1454a.h = this.q;
        c1454a.i = this.r;
        c1454a.j = this.s;
        c1454a.f = com.tencent.liteav.h.a.a(this.c, ".mp4");
        c1454a.g = com.tencent.liteav.h.a.a(this.c, ".jpg");
        c1454a.e = this.f.b();
        TXCLog.d("TXCLivePlayer", "record config: " + c1454a);
        return c1454a;
    }

    private void f(int i) {
        if (this.i != null) {
            this.i.setVisibility(0);
        }
        this.a = new TXCRenderAndDec(this.c);
        this.a.setNotifyListener(this);
        this.a.setVideoRender(this.f);
        this.a.setDecListener(this);
        this.a.setRenderAndDecDelegate(this);
        this.a.setConfig(this.b);
        this.a.setID(this.L);
        this.a.start(i == 5);
        this.a.setRenderMode(this.n);
        this.a.setRenderRotation(this.m);
    }

    private void m() {
        if (this.a != null) {
            this.a.stop();
            this.a.setVideoRender(null);
            this.a.setDecListener(null);
            this.a.setNotifyListener(null);
            this.a = null;
        }
    }

    private void n() {
        boolean z = this.F == 5;
        TXCAudioEngine.getInstance();
        TXCAudioEngine.enableAudioVolumeEvaluation(this.G, 300);
        a(this.K);
        if (this.F == 5) {
            TXCAudioEngine.getInstance().setRemoteAudioCacheParams(this.L, !this.b.g, (int) (com.tencent.liteav.basic.b.a.b * 1000.0f), (int) (com.tencent.liteav.basic.b.a.b * 1000.0f), (int) (com.tencent.liteav.basic.b.a.c * 1000.0f));
        } else {
            TXCAudioEngine.getInstance().setRemoteAudioCacheParams(this.L, !this.b.g, (int) (this.b.a * 1000.0f), (int) (this.b.c * 1000.0f), (int) (this.b.b * 1000.0f));
        }
        TXCAudioEngine.getInstance().muteRemoteAudio(this.L, this.j);
        TXCAudioEngine.getInstance().muteRemoteAudioInSpeaker(this.L, this.k);
        TXCAudioEngine.getInstance().setRemotePlayoutVolume(this.L, this.l);
        TXCAudioEngine.getInstance().setRemoteAudioStreamEventListener(this.L, this);
        y();
        TXCAudioEngine.getInstance().startRemoteAudio(this.L, z);
    }

    private void o() {
        TXCAudioEngine.getInstance().setRemoteAudioStreamEventListener(this.L, null);
        TXCAudioEngine.getInstance().setSetAudioEngineRemoteStreamDataListener(this.L, null);
        TXCAudioEngine.getInstance().stopRemoteAudio(this.L);
    }

    private int b(String str, int i) {
        if (i == 0) {
            this.g = new TXCStreamDownloader(this.c, 1);
        } else if (i == 5) {
            this.g = new TXCStreamDownloader(this.c, 4);
        } else {
            this.g = new TXCStreamDownloader(this.c, 0);
            if (!TextUtils.isEmpty(this.b.l)) {
                this.g.setFlvSessionKey(this.b.l);
            }
        }
        this.g.setID(this.L);
        this.g.setListener(this);
        this.g.setNotifyListener(this);
        this.g.setHeaders(this.b.q);
        if (i == 5) {
            this.g.setRetryTimes(5);
            this.g.setRetryInterval(1);
        } else {
            this.g.setRetryTimes(this.b.e);
            this.g.setRetryInterval(this.b.f);
        }
        return this.g.start(str, this.b.i, this.b.m, this.b.j, this.b.k);
    }

    private void p() {
        if (this.g != null) {
            this.g.setListener(null);
            this.g.setNotifyListener(null);
            this.g.stop();
            this.g = null;
        }
    }

    private void r() {
        this.x = new e(this.c);
        this.x.a(this.E);
        this.x.a(this.F == 5);
        this.x.d(this.L);
        this.x.e(this.g.getRTMPProxyUserId());
        this.x.a();
    }

    private void s() {
        if (this.x != null) {
            this.x.c();
            this.x = null;
        }
    }

    private void b(String str) {
        this.L = String.format("%s-%d", str, Long.valueOf(TXCTimeUtil.getTimeTick() % 10000));
        if (this.a != null) {
            this.a.setID(this.L);
        }
        if (this.f != null) {
            this.f.setID(this.L);
        }
        if (this.g != null) {
            this.g.setID(this.L);
        }
        if (this.x != null) {
            this.x.d(this.L);
        }
    }

    @Override // com.tencent.liteav.t
    public void g() {
        this.O = 0L;
        if (this.M) {
            return;
        }
        this.M = true;
        y();
        if (this.h != null) {
            this.h.postDelayed(new Runnable() { // from class: com.tencent.liteav.h.3
                @Override // java.lang.Runnable
                public void run() {
                    if (h.this.M) {
                        h.this.u();
                    }
                }
            }, 1000L);
        }
    }

    private void t() {
        this.M = false;
        y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        if (this.N > 0) {
            Bundle bundle = new Bundle();
            bundle.putInt(TXLiveConstants.EVT_PLAY_PROGRESS, (int) (this.N / 1000));
            bundle.putInt(TXLiveConstants.EVT_PLAY_PROGRESS_MS, (int) this.N);
            onNotifyEvent(2005, bundle);
        }
        if (this.h == null || !this.M) {
            return;
        }
        this.h.postDelayed(new Runnable() { // from class: com.tencent.liteav.h.4
            @Override // java.lang.Runnable
            public void run() {
                if (h.this.M) {
                    h.this.u();
                }
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        if (this.h != null) {
            this.h.postDelayed(this.P, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
        }
    }

    private void w() {
        if (this.h != null) {
            this.h.removeCallbacks(this.P);
        }
    }

    public void h() {
        x();
        int[] a2 = com.tencent.liteav.basic.util.g.a();
        String str = (a2[0] / 10) + "/" + (a2[1] / 10) + "%";
        int c = TXCStatus.c(this.L, AddressBean.ABNORMAL_HOUSE_ADDRESS);
        int c2 = TXCStatus.c(this.L, AddressBean.POI_ERROR_ADDRESS);
        String b = TXCStatus.b(this.L, 7110);
        int d = (int) TXCStatus.d(this.L, 6002);
        Bundle bundle = new Bundle();
        if (this.f != null) {
            bundle.putInt("VIDEO_WIDTH", this.f.h());
            bundle.putInt("VIDEO_HEIGHT", this.f.i());
        }
        if (this.a != null) {
            bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_CACHE, (int) this.a.getVideoCacheDuration());
            bundle.putInt(TXLiveConstants.NET_STATUS_V_SUM_CACHE_SIZE, (int) this.a.getVideoCacheFrameCount());
            bundle.putInt(TXLiveConstants.NET_STATUS_V_DEC_CACHE_SIZE, this.a.getVideoDecCacheFrameCount());
            bundle.putInt(TXLiveConstants.NET_STATUS_AV_PLAY_INTERVAL, (int) this.a.getAVPlayInterval());
            bundle.putInt(TXLiveConstants.NET_STATUS_AV_RECV_INTERVAL, (int) this.a.getAVNetRecvInterval());
            bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_GOP, (int) ((((TXCStatus.c(this.L, 7120) * 10) / (d == 0 ? 15 : d)) / 10.0f) + 0.5d));
        }
        bundle.putString(TXLiveConstants.NET_STATUS_AUDIO_INFO, TXCAudioEngine.getInstance().getPlayAECType() + " | " + TXCStatus.c(this.L, TXLiteAVCode.EVT_VOD_PLAY_SEEK_COMPLETE) + CommonConstant.Symbol.COMMA + TXCStatus.c(this.L, 2020) + " | " + TXCAudioEngine.getInstance().getPlaySampleRate() + CommonConstant.Symbol.COMMA + TXCAudioEngine.getInstance().getPlayChannels());
        bundle.putInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE, TXCStatus.c(this.L, 2007));
        bundle.putInt("NET_JITTER", TXCStatus.c(this.L, TXLiteAVCode.EVT_VOD_PLAY_DNS_RESOLVED));
        bundle.putFloat(TXLiveConstants.NET_STATUS_AUDIO_CACHE_THRESHOLD, ((float) TXCStatus.c(this.L, 2021)) / 1000.0f);
        bundle.putInt("NET_SPEED", c2 + c);
        bundle.putInt("VIDEO_FPS", d);
        bundle.putInt("VIDEO_BITRATE", c2);
        bundle.putInt("AUDIO_BITRATE", c);
        bundle.putCharSequence("SERVER_IP", b);
        bundle.putCharSequence("CPU_USAGE", str);
        com.tencent.liteav.basic.util.g.a(this.e, 15001, bundle);
        if (this.a != null) {
            this.a.updateLoadInfo();
        }
        if (this.x != null) {
            this.x.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a implements Runnable {
        private WeakReference<h> a;

        a(h hVar) {
            this.a = new WeakReference<>(hVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = this.a.get();
            if (hVar == null) {
                return;
            }
            hVar.h();
            hVar.v();
        }
    }

    private void x() {
        ArrayList arrayList = new ArrayList();
        if (this.L != null) {
            arrayList.add(this.L);
        }
        com.tencent.liteav.a.a("18446744073709551615", arrayList);
    }

    private void a(final int i, String str) {
        if (this.e != null) {
            final Bundle bundle = new Bundle();
            bundle.putInt(TXCAVRoomConstants.EVT_ID, i);
            bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
            bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
            if (str != null) {
                bundle.putCharSequence("EVT_MSG", str);
            }
            if (this.h != null) {
                this.h.post(new Runnable() { // from class: com.tencent.liteav.h.5
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.liteav.basic.util.g.a(h.this.e, i, bundle);
                    }
                });
            }
        }
    }

    private void y() {
        if (this.t || this.K != null || this.M) {
            TXCAudioEngine.getInstance().setSetAudioEngineRemoteStreamDataListener(this.L, this);
        }
        if (this.t || this.K != null || this.M) {
            return;
        }
        TXCAudioEngine.getInstance().setSetAudioEngineRemoteStreamDataListener(this.L, null);
    }

    @Override // com.tencent.liteav.network.h
    public void onPullNAL(TXSNALPacket tXSNALPacket) {
        if (this.o) {
            try {
                if (this.a != null) {
                    this.a.decVideo(tXSNALPacket);
                }
            } catch (Exception e) {
                TXCLog.e("TXCLivePlayer", "decode video failed." + e.getMessage());
            }
        }
    }

    @Override // com.tencent.liteav.basic.c.b
    public void onNotifyEvent(final int i, final Bundle bundle) {
        if (2003 == i || 2026 == i) {
            if (this.u) {
                a(2004, "Video play started");
                this.u = false;
            }
            if (2026 == i) {
                TXCStatus.a(this.L, 2033, Long.valueOf(TXCTimeUtil.getTimeTick()));
                return;
            }
        }
        if (2025 == i) {
            a(2004, "Video play started");
        } else if (2023 == i || 2024 == i) {
            a(2007, "Video play loading");
        } else if (this.h != null) {
            this.h.post(new Runnable() { // from class: com.tencent.liteav.h.6
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.liteav.basic.util.g.a(h.this.e, i, bundle);
                    if (i != 2103 || h.this.a == null) {
                        return;
                    }
                    h.this.a.restartDecoder();
                }
            });
        }
    }

    @Override // com.tencent.liteav.renderer.h
    public int a(int i, float[] fArr) {
        com.tencent.liteav.h.a aVar = this.v;
        if (this.t && aVar != null && this.A != null) {
            int d = this.A.d(i);
            aVar.a(d, TXCTimeUtil.getTimeTick());
            this.f.a(d, this.y, this.z, false, 0);
        }
        if (this.t) {
            j();
        } else {
            k();
        }
        return i;
    }

    @Override // com.tencent.liteav.renderer.a.InterfaceC1460a
    public void onTextureProcess(int i, int i2, int i3, int i4) {
        com.tencent.liteav.h.a aVar = this.v;
        if (this.t && aVar != null && this.B != null) {
            this.B.a(this.C);
            aVar.a(this.B.d(i), TXCTimeUtil.getTimeTick());
            this.B.a(this.D);
            this.B.c(i);
        }
        if (this.t) {
            j();
        } else {
            k();
        }
    }

    @Override // com.tencent.liteav.TXCRenderAndDec.a
    public void a(SurfaceTexture surfaceTexture) {
        k();
        e();
    }

    @Override // com.tencent.liteav.audio.f
    public void onAudioPlayPcmData(String str, byte[] bArr, long j, int i, int i2) {
        this.r = i;
        this.q = i2;
        if (this.v != null) {
            if (j <= 0) {
                j = TXCTimeUtil.getTimeTick();
            }
            this.v.a(bArr, j);
        }
        if (this.O <= 0 && this.K != null) {
            this.K.onAudioInfoChanged(i, i2, 16);
        }
        if (this.K != null) {
            this.K.onPcmDataAvailable(bArr, j);
        }
        if (this.O <= 0) {
            this.O = j;
        } else {
            this.N = j - this.O;
        }
    }

    @Override // com.tencent.liteav.audio.d
    public void onAudioJitterBufferNotify(String str, int i, String str2) {
        onNotifyEvent(i, null);
    }

    @Override // com.tencent.liteav.t
    public void a(boolean z, int i) {
        this.G = z;
        TXCAudioEngine.getInstance();
        TXCAudioEngine.enableAudioVolumeEvaluation(z, i);
    }

    @Override // com.tencent.liteav.t
    public int i() {
        return TXCAudioEngine.getInstance().getRemotePlayoutVolumeLevel(this.L);
    }

    @Override // com.tencent.liteav.TXCRenderAndDec.b
    public void onRequestKeyFrame(String str, int i) {
        if (!this.o || this.g == null) {
            return;
        }
        this.g.requestKeyFrame(this.E);
    }
}
