package com.sankuai.meituan.shortvideocore.mrn;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ao;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.android.mtplayer.video.MTVideoPlayerView;
import com.meituan.android.mtplayer.video.VideoPlayerParam;
import com.meituan.android.mtplayer.video.callback.DisplayMode;
import com.meituan.android.mtplayer.video.l;
import com.meituan.android.mtplayer.video.proxy.m;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtliveqos.statistic.b;
import com.tencent.connect.share.QzonePublish;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends FrameLayout {
    public static ChangeQuickRedirect a;
    private boolean A;
    private boolean B;
    private VideoPlayerParam C;
    private VideoPlayerParam D;
    private float E;
    private boolean F;
    private HashMap<String, Object> G;
    @SuppressLint({"HandlerLeak"})
    private final Handler H;
    private MTVideoPlayerView.c I;
    private final AppBus.OnBackgroundListener J;
    MTVideoPlayerView b;
    public String c;
    String d;
    long e;
    boolean f;
    boolean g;
    int h;
    boolean i;
    private final ao j;
    private boolean k;
    private a l;
    private com.meituan.android.mrn.component.video.b m;
    private boolean n;
    private boolean o;
    private long p;
    private boolean q;
    private boolean r;
    private int s;
    private boolean t;
    private final com.sankuai.meituan.shortvideocore.statistics.a u;
    private int v;
    private long w;
    private boolean x;
    private boolean y;
    private int z;

    public static /* synthetic */ void a(f fVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "5aa748f287fa4586df8ba4b62cae2008", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "5aa748f287fa4586df8ba4b62cae2008");
            return;
        }
        try {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt(QzonePublish.PUBLISH_TO_QZONE_VIDEO_DURATION, i);
            ((UIManagerModule) fVar.j.getNativeModule(UIManagerModule.class)).getEventDispatcher().a(d.a(fVar.getId(), e.STATE_PREPARED, createMap));
        } catch (Exception e) {
            com.facebook.common.logging.a.d("[MRNVideoPlayerView@notifyPreparedChanged]", null, e);
        }
    }

    public static /* synthetic */ void a(f fVar, int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "8a71d24eccc7b13ac2be33468ae0953b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "8a71d24eccc7b13ac2be33468ae0953b");
            return;
        }
        try {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("currentPlayTime", i);
            createMap.putInt(QzonePublish.PUBLISH_TO_QZONE_VIDEO_DURATION, i2);
            createMap.putInt("currentBufferingPercent", i3);
            ((UIManagerModule) fVar.j.getNativeModule(UIManagerModule.class)).getEventDispatcher().a(d.a(fVar.getId(), e.STATE_PROGRESS, createMap));
        } catch (Exception e) {
            com.facebook.common.logging.a.d("[MRNVideoPlayerView@notifyProgressChanged]", null, e);
        }
    }

    public static /* synthetic */ void a(f fVar, long j, long j2, int i, boolean z, boolean z2) {
        Object[] objArr = {new Long(j), new Long(j2), 1, Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "68103a961dea6ae032456c3f95decdbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "68103a961dea6ae032456c3f95decdbd");
            return;
        }
        try {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("startTime", j);
            createMap.putDouble("renderTimestamp", j2);
            createMap.putInt("decodeMode", 1);
            createMap.putBoolean("isCached", z);
            createMap.putBoolean("isH265", false);
            ((UIManagerModule) fVar.j.getNativeModule(UIManagerModule.class)).getEventDispatcher().a(d.a(fVar.getId(), e.STATE_PLAY_STAT, createMap));
        } catch (Exception e) {
            com.facebook.common.logging.a.d("[MRNVideoPlayerView@notifyVideoPlayStat]", null, e);
        }
    }

    public static /* synthetic */ boolean a(f fVar, boolean z) {
        fVar.f = false;
        return false;
    }

    public static /* synthetic */ boolean c(f fVar, boolean z) {
        fVar.o = true;
        return true;
    }

    public static /* synthetic */ boolean d(f fVar, boolean z) {
        fVar.r = true;
        return true;
    }

    public static /* synthetic */ int s(f fVar) {
        int i = fVar.s;
        fVar.s = i + 1;
        return i;
    }

    public static /* synthetic */ void y(f fVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "216abf89eceb424726d607746922b689", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "216abf89eceb424726d607746922b689");
        } else {
            com.sankuai.meituan.shortvideocore.utils.b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, Boolean bool) {
        Object[] objArr = {view, bool};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b89ecd94f4f626dc1708cc0d88188580", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b89ecd94f4f626dc1708cc0d88188580");
            return;
        }
        try {
            int width = getWidth();
            int height = getHeight();
            measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i = (width - measuredWidth) / 2;
            int i2 = (height - measuredHeight) / 2;
            if (this.b != null && bool.booleanValue()) {
                this.b.layout(0, 0, width, height);
            }
            view.layout(i, i2, measuredWidth + i, measuredHeight + i2);
        } catch (Exception e) {
            com.facebook.common.logging.a.d("[MRNVideoPlayerView@layoutDisplayView]", null, e);
        }
    }

    public f(@NonNull ao aoVar) {
        super(aoVar);
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c30cbac0997cd82d636305c4cce9afdc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c30cbac0997cd82d636305c4cce9afdc");
            return;
        }
        this.k = true;
        this.s = 1;
        this.w = 1000L;
        this.x = false;
        this.g = false;
        this.y = false;
        this.z = 0;
        this.A = false;
        this.B = false;
        this.h = -1;
        this.E = -1.0f;
        this.F = false;
        this.H = new Handler() { // from class: com.sankuai.meituan.shortvideocore.mrn.f.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "871f3dc63205ef7e70a2c97fe224515f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "871f3dc63205ef7e70a2c97fe224515f");
                    return;
                }
                super.handleMessage(message);
                if (message.what != 1 || f.this.b == null) {
                    return;
                }
                int currentPosition = f.this.b.getCurrentPosition();
                int duration = f.this.b.getDuration();
                if (duration <= 0) {
                    return;
                }
                if (currentPosition > duration) {
                    currentPosition = duration;
                }
                if (f.this.x) {
                    f.a(f.this, currentPosition, duration, f.this.v);
                    f.this.H.sendEmptyMessageDelayed(1, f.this.w);
                }
            }
        };
        this.I = new MTVideoPlayerView.c() { // from class: com.sankuai.meituan.shortvideocore.mrn.f.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mtplayer.video.MTVideoPlayerView.c
            public final void a(View view, int i, int i2) {
                Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32684c88563943aa3a1381c18d1da346", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32684c88563943aa3a1381c18d1da346");
                } else if (view == null) {
                } else {
                    f.this.a(view, Boolean.FALSE);
                }
            }
        };
        this.J = new AppBus.OnBackgroundListener() { // from class: com.sankuai.meituan.shortvideocore.mrn.f.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.metricx.helpers.AppBus.OnBackgroundListener
            public final void onBackground() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "53066147442ef314a4b96bfc517a49ae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "53066147442ef314a4b96bfc517a49ae");
                    return;
                }
                new StringBuilder("onBackground: ").append(f.this.F);
                f.this.post(new Runnable() { // from class: com.sankuai.meituan.shortvideocore.mrn.f.3.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2b4bf539e78e08025f854143827a98a5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2b4bf539e78e08025f854143827a98a5");
                        } else if (f.this.F) {
                            f.this.e();
                        }
                    }
                });
            }
        };
        com.sankuai.meituan.shortvideocore.config.a.a(aoVar);
        com.sankuai.meituan.shortvideocore.config.b.a = aoVar.getApplicationContext();
        this.j = aoVar;
        this.u = new com.sankuai.meituan.shortvideocore.statistics.a(aoVar);
        final boolean a2 = com.sankuai.meituan.shortvideocore.mrn.a.a();
        final com.sankuai.meituan.shortvideocore.statistics.a aVar = this.u;
        Object[] objArr2 = {Byte.valueOf(a2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.shortvideocore.statistics.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "7fed34f10d7272f656273dfc8c699324", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "7fed34f10d7272f656273dfc8c699324");
        } else if (!com.sankuai.meituan.shortvideocore.statistics.a.g) {
            com.sankuai.meituan.shortvideocore.statistics.a.g = true;
            new StringBuilder("reportSupportH265: isSupport = ").append(a2);
            com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.meituan.shortvideocore.statistics.a.b, new Runnable() { // from class: com.sankuai.meituan.shortvideocore.statistics.a.14
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fbafd53e26f666345920c18a81fc93ad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fbafd53e26f666345920c18a81fc93ad");
                        return;
                    }
                    Map a3 = a.a(a.this);
                    a3.put("MTLIVE_VIDEO_H265_SUPPORT", Float.valueOf(a2 ? 1.0f : 0.0f));
                    com.sankuai.meituan.mtliveqos.a.a(a.this.i, a.c(""), a3, a.c(a.this));
                }
            });
        }
        this.u.a(DiagnoseLog.MRN);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8a7fc5ef063e76dc4766217d0459ea86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8a7fc5ef063e76dc4766217d0459ea86");
            return;
        }
        this.b = new MTVideoPlayerView(this.j);
        this.b.l = this.I;
        l a3 = com.sankuai.meituan.shortvideocore.config.a.a(this.j.getApplicationContext()).e ? com.sankuai.meituan.mtplayer.a.a() : l.TYPE_ANDROID;
        new StringBuilder("initView: playerType = ").append(a3);
        this.b.setPlayerType(a3);
        this.u.a(this.b.getPlayerType());
        g();
        addView(this.b, new FrameLayout.LayoutParams(-1, -1));
        com.sankuai.meituan.shortvideocore.utils.b.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7a07c908ac6ef709bf35ef584aa3201", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7a07c908ac6ef709bf35ef584aa3201");
        } else if (z) {
            AppBus.getInstance().register(this.J);
        } else {
            AppBus.getInstance().unregister(this.J);
        }
    }

    public final void setPlayerType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd7d2a791f5d5c07109351ab61a7707c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd7d2a791f5d5c07109351ab61a7707c");
            return;
        }
        l lVar = l.TYPE_ANDROID;
        if (this.b == null) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                return;
            }
            if (com.sankuai.meituan.shortvideocore.config.a.a(this.j.getApplicationContext()).e) {
                lVar = com.sankuai.meituan.mtplayer.a.a();
            }
        }
        this.b.setPlayerType(lVar);
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "054783d1a52dce004806afb367e44ec4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "054783d1a52dce004806afb367e44ec4");
        } else if (this.b == null) {
        } else {
            this.b.setPlayStateCallback(new com.meituan.android.mtplayer.video.callback.d() { // from class: com.sankuai.meituan.shortvideocore.mrn.f.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.mtplayer.video.callback.d
                public final void a(int i, com.meituan.android.mtplayer.video.error.a aVar) {
                    Object[] objArr2 = {Integer.valueOf(i), aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "683671329a508a36aed8625b8aece2ef", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "683671329a508a36aed8625b8aece2ef");
                    } else if (f.this.b == null) {
                    } else {
                        switch (i) {
                            case -1:
                                if (f.this.l == a.H265) {
                                    if (f.this.u != null) {
                                        f.this.u.a(f.this.b.getPlayerType());
                                        final int i2 = aVar != null ? aVar.a : -1;
                                        final com.sankuai.meituan.shortvideocore.statistics.a aVar2 = f.this.u;
                                        final String str = f.this.d;
                                        Object[] objArr3 = {Integer.valueOf(i2), str};
                                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.shortvideocore.statistics.a.a;
                                        if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "fd438a57bdb5f629fa0a98acae4db323", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "fd438a57bdb5f629fa0a98acae4db323");
                                        } else {
                                            com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.meituan.shortvideocore.statistics.a.b, new Runnable() { // from class: com.sankuai.meituan.shortvideocore.statistics.a.16
                                                public static ChangeQuickRedirect a;

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    Object[] objArr4 = new Object[0];
                                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "45c4249604783e9b55734b0778365031", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "45c4249604783e9b55734b0778365031");
                                                        return;
                                                    }
                                                    Map a2 = a.a(a.this);
                                                    a2.put("MTLIVE_VIDEO_PLAY_H265_FAILED_COUNT", Float.valueOf(1.0f));
                                                    a2.put("MTLIVE_VIDEO_PLAY_FAILED_ERROR_CODE", Float.valueOf(i2));
                                                    com.sankuai.meituan.mtliveqos.a.a(a.this.i, a.c(str), a2, a.c(a.this));
                                                }
                                            });
                                        }
                                    }
                                    f.this.f();
                                    f.this.l = a.SWITCH_H264;
                                    f.this.c();
                                } else {
                                    f.this.a(aVar);
                                }
                                if (f.this.u != null) {
                                    f.this.u.a(f.this.b.getPlayerType());
                                    f.this.u.a(aVar != null ? aVar.a : -1, f.this.c);
                                    return;
                                }
                                return;
                            case 0:
                                f.this.a(e.STATE_IDLE);
                                return;
                            case 1:
                                f.this.a(e.STATE_PREPARING);
                                return;
                            case 2:
                                if (f.this.h > 0) {
                                    f.this.a(f.this.h);
                                }
                                if (!f.this.f) {
                                    f.this.e();
                                    f.a(f.this, false);
                                }
                                f.this.setVolume(f.this.t ? 0.0d : 1.0d);
                                if (f.this.E > 0.0f) {
                                    f.this.setPlaybackRate(f.this.E);
                                }
                                f.a(f.this, f.this.b != null ? f.this.b.getDuration() : 0);
                                return;
                            case 3:
                                ao aoVar = f.this.j;
                                com.sankuai.meituan.shortvideocore.statistics.a.a(aoVar, "onPlayStateChanged video_playing " + System.currentTimeMillis());
                                if (f.this.E > 0.0f) {
                                    f.this.setPlaybackRate(f.this.E);
                                }
                                f.this.h();
                                if (!f.this.r || !f.this.q) {
                                    if (!f.this.o && !f.this.i) {
                                        long currentTimeMillis = System.currentTimeMillis() - f.this.e;
                                        f.a(f.this, currentTimeMillis, System.currentTimeMillis(), 1, MRNPlayerModule.getCacheSizeByUrl(f.this.c) > 0, false);
                                        if (f.this.u != null) {
                                            f.this.u.a(f.this.b.getPlayerType());
                                            final com.sankuai.meituan.shortvideocore.statistics.a aVar3 = f.this.u;
                                            final float f = (float) currentTimeMillis;
                                            final String str2 = f.this.c;
                                            Object[] objArr4 = {Float.valueOf(f), str2};
                                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.meituan.shortvideocore.statistics.a.a;
                                            if (PatchProxy.isSupport(objArr4, aVar3, changeQuickRedirect4, false, "e7c5e70a258dddb3369113748ea90de2", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, aVar3, changeQuickRedirect4, false, "e7c5e70a258dddb3369113748ea90de2");
                                            } else {
                                                new StringBuilder("reportFirstFrameDuration: ").append(f);
                                                com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.meituan.shortvideocore.statistics.a.b, new Runnable() { // from class: com.sankuai.meituan.shortvideocore.statistics.a.5
                                                    public static ChangeQuickRedirect a;

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        Object[] objArr5 = new Object[0];
                                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "63b2140bf7cd8e3e826cc1466751bb28", RobustBitConfig.DEFAULT_VALUE)) {
                                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "63b2140bf7cd8e3e826cc1466751bb28");
                                                            return;
                                                        }
                                                        Map a2 = a.a(a.this);
                                                        a2.put("MTLIVE_VIDEO_START_PLAY_COST", Float.valueOf(f));
                                                        b c = a.c(str2);
                                                        new StringBuilder("reportFirstFrameDuration: ").append(a.c(a.this).toString());
                                                        com.sankuai.meituan.mtliveqos.a.a(a.this.i, c, a2, a.c(a.this));
                                                    }
                                                });
                                            }
                                        }
                                        if (f.this.y) {
                                            f.this.a(e.STATE_MULTIPLEX_RENDERED);
                                        }
                                        f.c(f.this, true);
                                    }
                                } else {
                                    f.this.u.a(f.this.b.getPlayerType());
                                    f.this.u.b(f.this.s, f.this.c);
                                    f.s(f.this);
                                    long currentTimeMillis2 = System.currentTimeMillis() - f.this.p;
                                    f.this.u.a(f.this.b.getPlayerType());
                                    f.this.u.a((float) currentTimeMillis2, f.this.c);
                                    f.this.q = false;
                                }
                                f.d(f.this, true);
                                f.y(f.this);
                                f.this.a(e.STATE_PLAYING);
                                if (f.this.n) {
                                    f.this.a(e.STATE_LOAD_FINISHED);
                                }
                                f.this.n = false;
                                return;
                            case 4:
                                f.this.a(e.STATE_PAUSED);
                                f.this.a();
                                return;
                            case 5:
                                f.this.a(e.STATE_BUFFERING_PLAYING);
                                f.this.a(e.STATE_LOADING);
                                f.this.n = true;
                                f.this.a(e.STATE_BUFFER_LOADING);
                                if (f.this.o) {
                                    f.this.p = System.currentTimeMillis();
                                    f.this.q = true;
                                    return;
                                }
                                return;
                            case 6:
                                f.this.a(e.STATE_BUFFERING_PAUSED);
                                f.this.a(e.STATE_LOADING);
                                f.this.n = true;
                                if (f.this.o) {
                                    f.this.p = System.currentTimeMillis();
                                    f.this.q = true;
                                    return;
                                }
                                return;
                            case 7:
                                f.this.a(e.STATE_PLAYBACK_COMPLETED);
                                return;
                            default:
                                return;
                        }
                    }
                }

                @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
                public final void a(int i, int i2, int i3) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9383c4d9865158a9c0555b21fece5f74", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9383c4d9865158a9c0555b21fece5f74");
                    } else {
                        f.this.v = i3;
                    }
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1d5d58bc0c2ba6307eeea2fc6a7be17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1d5d58bc0c2ba6307eeea2fc6a7be17");
            return;
        }
        super.onAttachedToWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02caf87e434d4cb0b4af86835fd15cd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02caf87e434d4cb0b4af86835fd15cd0");
            return;
        }
        super.onDetachedFromWindow();
        a();
    }

    public final void setProgressUpdateDuration(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b57fcd1081d07e36edcb188b61834f93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b57fcd1081d07e36edcb188b61834f93");
            return;
        }
        new StringBuilder("setProgressUpdateDuration: ").append(j);
        if (j > 0) {
            this.w = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d9d4cc0c46911a9f6fc36cf7f05b10d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d9d4cc0c46911a9f6fc36cf7f05b10d");
            return;
        }
        this.x = false;
        if (this.H != null) {
            this.H.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99cf826913ec0e38de4ea8993789efb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99cf826913ec0e38de4ea8993789efb5");
        } else if (this.H != null) {
            this.x = true;
            this.H.removeCallbacksAndMessages(null);
            this.H.sendEmptyMessage(1);
        }
    }

    private String getVideoUrlString() {
        if (this.l == a.H264) {
            return this.c;
        }
        if (this.l == a.H265) {
            return this.d;
        }
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "690b7dea42bc88e8dacbaeb97b679f42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "690b7dea42bc88e8dacbaeb97b679f42");
            return;
        }
        try {
            ((UIManagerModule) this.j.getNativeModule(UIManagerModule.class)).getEventDispatcher().a(d.a(getId(), eVar, null));
        } catch (Exception e) {
            com.facebook.common.logging.a.d("[MRNVideoPlayerView@notifyStateChanged]", null, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.meituan.android.mtplayer.video.error.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8d775d2250f36b3cfe5508dca31da03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8d775d2250f36b3cfe5508dca31da03");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        if (aVar != null) {
            createMap.putInt("errorCode", aVar.a);
            createMap.putInt("errorMsg", aVar.b);
            createMap.putString("videoUrlString", getVideoUrlString());
        }
        ((UIManagerModule) this.j.getNativeModule(UIManagerModule.class)).getEventDispatcher().a(d.a(getId(), e.STATE_ERROR, createMap));
    }

    public final void setCoverView(@Nullable View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da24d45d11e1b9c2ea0e1e4c3af0b7a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da24d45d11e1b9c2ea0e1e4c3af0b7a6");
        } else if (view == null) {
        } else {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.m = new com.meituan.android.mrn.component.video.b(this.j, view);
            if (this.b != null) {
                this.b.setCoverView(this.m);
            }
        }
    }

    public final View getCoverView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c25a18cccb0ca80d194dafcbbbb550e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c25a18cccb0ca80d194dafcbbbb550e3");
        }
        if (this.m == null) {
            return null;
        }
        return this.m.getView();
    }

    public final void a(String str, boolean z) {
        Context context;
        Object[] objArr = {str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f242a8cd745463e0ac2bc7870668a6a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f242a8cd745463e0ac2bc7870668a6a2");
            return;
        }
        new StringBuilder("setVideoUrl: ").append(str);
        if (this.b == null) {
            return;
        }
        if (this.k && (context = getContext()) != null) {
            this.D = new VideoPlayerParam(str);
            this.D.a(context, "MRNVideoCache");
            m.d a2 = m.d.a(1024L);
            a(this.D, false);
            this.D.a((m.b) null, a2);
        }
        this.c = str;
    }

    public final void setUseCache(boolean z) {
        this.k = z;
    }

    public final void setRepeat(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58e4c426a20f91c4d04e606c1b2eb5ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58e4c426a20f91c4d04e606c1b2eb5ae");
            return;
        }
        new StringBuilder("setRepeat: ").append(z);
        if (this.b == null) {
            return;
        }
        this.A = z;
        this.b.setLooping(z);
    }

    public final void setDisplayOpaque(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b9183a7ae537de7890d24c818efd77d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b9183a7ae537de7890d24c818efd77d");
        } else if (this.b != null) {
            this.b.setDisplayOpaque(z);
        }
    }

    public final void setDisplayMode(@DisplayMode int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e114090b9ac6120eb846ecc1a35c50c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e114090b9ac6120eb846ecc1a35c50c1");
        } else if (this.b == null) {
        } else {
            this.z = i;
            this.b.setDisplayMode(i);
        }
    }

    public final void setVolume(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75c552c4503e3e4435a0750eb8c5bb62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75c552c4503e3e4435a0750eb8c5bb62");
        } else if (this.b != null) {
            float f = (float) d;
            this.b.a(f, f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c68c6d620695a9fa669cf3b91bf10c07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c68c6d620695a9fa669cf3b91bf10c07");
            return;
        }
        d();
        VideoPlayerParam videoParam = getVideoParam();
        if (this.C == null) {
            this.b.setDataSource(videoParam);
        } else if (!TextUtils.equals(this.C.b(), videoParam.b())) {
            this.C.e();
            this.b.setDataSource(videoParam);
        }
        this.C = videoParam;
    }

    private VideoPlayerParam getVideoParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b77dd741c1ea5df8c103c683b999e4c", RobustBitConfig.DEFAULT_VALUE)) {
            return (VideoPlayerParam) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b77dd741c1ea5df8c103c683b999e4c");
        }
        if (this.l == a.SWITCH_H264) {
            return getH264VideoPlayerParam();
        }
        if (TextUtils.isEmpty(this.d)) {
            return getH264VideoPlayerParam();
        }
        if (com.sankuai.meituan.shortvideocore.mrn.a.a()) {
            return getH265VideoPlayerParam();
        }
        return getH264VideoPlayerParam();
    }

    private VideoPlayerParam getH265VideoPlayerParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65fcb45bd4b6f3255b51a15c644a5ba2", RobustBitConfig.DEFAULT_VALUE)) {
            return (VideoPlayerParam) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65fcb45bd4b6f3255b51a15c644a5ba2");
        }
        this.l = a.H265;
        VideoPlayerParam videoPlayerParam = new VideoPlayerParam(this.d);
        if (this.k) {
            videoPlayerParam.a(this.j, "MRNVideoCache");
        }
        a(videoPlayerParam, true);
        return videoPlayerParam;
    }

    private VideoPlayerParam getH264VideoPlayerParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab49c8404cc9f766f25b344b8404bf56", RobustBitConfig.DEFAULT_VALUE)) {
            return (VideoPlayerParam) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab49c8404cc9f766f25b344b8404bf56");
        }
        this.l = a.H264;
        VideoPlayerParam videoPlayerParam = new VideoPlayerParam(this.c);
        if (this.k) {
            videoPlayerParam.a(this.j, "MRNVideoCache");
        }
        a(videoPlayerParam, false);
        return videoPlayerParam;
    }

    private void a(VideoPlayerParam videoPlayerParam, boolean z) {
        Object[] objArr = {videoPlayerParam, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4a9646b0a41155705612318c8f47094", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4a9646b0a41155705612318c8f47094");
            return;
        }
        com.meituan.android.mtplayer.video.proxy.c cVar = new com.meituan.android.mtplayer.video.proxy.c();
        cVar.e = z;
        com.sankuai.meituan.shortvideocore.config.a a2 = com.sankuai.meituan.shortvideocore.config.a.a(this.j);
        if (a2.a() && this.G != null) {
            try {
                cVar.b = a(this.G.get("videoBitrate")) / 1024;
                cVar.c = a(this.G.get("downloadDuration"));
                cVar.d = a(this.G.get("videoH265Bitrate")) / 1024;
            } catch (Exception e) {
                Log.e("MRNShortVideoPlayerView", "useCacheOpt: ", e);
            }
            cVar.f = a2.g;
            cVar.g = a2.h;
            videoPlayerParam.a(cVar);
        }
    }

    private int a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9e8c5c33f135e1bdd8ee1b81a9e5368", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9e8c5c33f135e1bdd8ee1b81a9e5368")).intValue();
        }
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Double) {
            return (int) ((Double) obj).doubleValue();
        }
        if (obj instanceof Float) {
            return (int) ((Float) obj).floatValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f4ccb327293bcd276163d623d9b21af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f4ccb327293bcd276163d623d9b21af");
            return;
        }
        ao aoVar = this.j;
        com.sankuai.meituan.shortvideocore.statistics.a.a(aoVar, "video_start " + System.currentTimeMillis());
        new StringBuilder("start: ").append(hashCode());
        if (TextUtils.isEmpty(this.c)) {
            return;
        }
        MTVideoPlayerView a2 = com.sankuai.meituan.shortvideocore.mrn.cache.b.a().a(this.c);
        if (a2 != null) {
            Object[] objArr2 = {a2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "664fa5aafc40c03ce762deef0e546aee", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "664fa5aafc40c03ce762deef0e546aee");
            } else if (a2 != null) {
                try {
                    if (this.b != null) {
                        removeView(this.b);
                    }
                    this.b = a2;
                    this.b.l = this.I;
                    g();
                    ViewGroup viewGroup = (ViewGroup) this.b.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(this.b);
                    }
                    addView(this.b, new FrameLayout.LayoutParams(-1, -1));
                    this.b.setDisplayMode(this.z);
                    this.b.setLooping(this.A);
                    if (this.b.getDisplayView() != null && this.B) {
                        a(this.b.getDisplayView(), Boolean.TRUE);
                    }
                    if (this.b != null && this.b.e()) {
                        setVolume(this.t ? 0.0d : 1.0d);
                        h();
                        this.o = true;
                        a(e.STATE_MULTIPLEX_RENDERED);
                    }
                } catch (Exception e) {
                    com.facebook.common.logging.a.d("[MRNVideoPlayerView@updateView]", null, e);
                    com.meituan.android.mtplayer.video.error.a aVar = new com.meituan.android.mtplayer.video.error.a();
                    aVar.a = -101;
                    aVar.b = -101;
                    a(aVar);
                }
            }
            this.y = true;
        } else {
            this.y = false;
        }
        this.f = true;
        if (this.b == null || this.b.e()) {
            return;
        }
        this.e = System.currentTimeMillis();
        b();
        this.b.c();
        if (this.u != null) {
            this.u.a(this.b.getPlayerType());
            this.u.b(this.c);
            if (this.l == a.H265) {
                final com.sankuai.meituan.shortvideocore.statistics.a aVar2 = this.u;
                final String str = this.c;
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.shortvideocore.statistics.a.a;
                if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "520587498f403a7c710d0bca3d1f955e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "520587498f403a7c710d0bca3d1f955e");
                } else {
                    com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.meituan.shortvideocore.statistics.a.b, new Runnable() { // from class: com.sankuai.meituan.shortvideocore.statistics.a.15
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "92c025b4a15acb1d5ab86644b0a86993", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "92c025b4a15acb1d5ab86644b0a86993");
                                return;
                            }
                            Map a3 = a.a(a.this);
                            a3.put("MTLIVE_VIDEO_PLAY_H265_TOTAL_COUNT", Float.valueOf(1.0f));
                            com.sankuai.meituan.mtliveqos.a.a(a.this.i, a.c(str), a3, a.c(a.this));
                        }
                    });
                }
            }
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "311d1eec362db40596b0a9a9b491255e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "311d1eec362db40596b0a9a9b491255e");
        } else if (this.D != null) {
            this.D.e();
            this.D = null;
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61414a7d7b567039fa49f336109cbf0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61414a7d7b567039fa49f336109cbf0d");
        } else if (this.b != null) {
            this.b.d();
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b823469335d05366c0fbdd14c617f9f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b823469335d05366c0fbdd14c617f9f9");
            return;
        }
        new StringBuilder("reset: ").append(hashCode());
        d();
        if (this.b != null) {
            this.b.f();
        }
        this.h = -1;
        this.f = false;
        this.i = false;
    }

    public final void setPauseInBackground(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26d28c4f4282d135158445ae2af95bd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26d28c4f4282d135158445ae2af95bd0");
            return;
        }
        new StringBuilder("setPauseInBackground: ").append(z);
        this.F = z;
        a(z);
    }

    public final void setVideoExtensionInfo(HashMap<String, Object> hashMap) {
        boolean z = true;
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d42f75cbf0368f7d3896b67c709ff91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d42f75cbf0368f7d3896b67c709ff91");
            return;
        }
        new StringBuilder("setVideoExtensionInfo: ").append(hashMap != null ? hashMap.toString() : StringUtil.NULL);
        this.G = hashMap;
        if (this.G != null) {
            Object obj = this.G.get("isColdPlay");
            if (obj != null) {
                try {
                    if (((Boolean) obj).booleanValue()) {
                        this.i = z;
                    }
                } catch (Exception e) {
                    Log.e("MRNShortVideoPlayerView", "setVideoExtensionInfo: ", e);
                    return;
                }
            }
            z = false;
            this.i = z;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        H265,
        H264,
        SWITCH_H264;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a9621f5eb1372a8021398eeaaa4a2c8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a9621f5eb1372a8021398eeaaa4a2c8");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9cecddd8d4db8adfb6a7e8fc88a5c732", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9cecddd8d4db8adfb6a7e8fc88a5c732") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1bdbcad52991d1d9723a4c0bbe23c1e", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1bdbcad52991d1d9723a4c0bbe23c1e") : (a[]) values().clone();
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "134db752007acd5cf249873116f9bfa2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "134db752007acd5cf249873116f9bfa2");
        } else if (this.b == null || i < 0) {
        } else {
            this.b.a(i);
        }
    }

    public final void setCid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "036fd00ad88427ae91679a3f2b9646e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "036fd00ad88427ae91679a3f2b9646e7");
            return;
        }
        com.sankuai.meituan.shortvideocore.statistics.a.h = str;
        if (this.u != null) {
            com.sankuai.meituan.shortvideocore.statistics.a aVar = this.u;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.shortvideocore.statistics.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "f1a722621a1e73bb25009ebd996113a9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "f1a722621a1e73bb25009ebd996113a9");
            } else if (TextUtils.isEmpty(str)) {
            } else {
                aVar.f = str;
            }
        }
    }

    public final void setPlaybackRate(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4778893a9eb060f5c7b92428d72d0210", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4778893a9eb060f5c7b92428d72d0210");
            return;
        }
        new StringBuilder("setPlaybackRate: ").append(f);
        this.E = f;
        if (this.b != null) {
            this.b.setPlaySpeed(f);
        }
    }

    public final void setStartSeekPosition(int i) {
        this.h = i;
    }

    public final void setMute(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf15dde0f2507b21fcbcada7ccc8fb98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf15dde0f2507b21fcbcada7ccc8fb98");
            return;
        }
        new StringBuilder("setMute: ").append(z);
        this.t = z;
    }

    public final void setCacheVideoLayout(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9561b86034177f0d416f7020ff184285", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9561b86034177f0d416f7020ff184285");
            return;
        }
        new StringBuilder("setCacheVideoLayout: ").append(z);
        this.B = z;
    }
}
