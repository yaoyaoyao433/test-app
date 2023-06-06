package com.sankuai.meituan.riverrunplayer.player;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.core.network.a;
import com.sankuai.meituan.riverrunplayer.player.e;
import com.sankuai.meituan.riverrunplayer.player.f;
import com.sankuai.meituan.xp.c;
import com.tencent.smtt.utils.TbsLog;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g extends b {
    public static ChangeQuickRedirect q;
    private static final String s = b.class.getSimpleName();
    private ScheduledExecutorService A;
    private f.a B;
    private e.a C;
    boolean r;
    private List<Map<String, Object>> t;
    private final e u;
    private com.sankuai.meituan.xp.d v;
    private boolean w;
    private a x;
    private boolean y;
    private String z;

    public static /* synthetic */ void a(g gVar, int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "b4cdb292ad52253c98b6b06d77abd061", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "b4cdb292ad52253c98b6b06d77abd061");
            return;
        }
        switch (i) {
            case 1001:
                e eVar = gVar.u;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = e.a;
                if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "14ed355713f729c817d446d3c213d1a4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "14ed355713f729c817d446d3c213d1a4");
                } else {
                    eVar.a("ReconnectManager onPlaySucceed mReconnectTimes: " + eVar.b);
                    if (eVar.b > 0 && eVar.c != null) {
                        eVar.c.c();
                    }
                    eVar.b();
                }
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "f16475d4b3c0191f5e92349b30a4e25a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "f16475d4b3c0191f5e92349b30a4e25a");
                    return;
                }
                gVar.b("onPrepared,getTargetState: " + gVar.c.c);
                gVar.c.b = 2;
                gVar.b(2);
                if (gVar.c.c == 4) {
                    gVar.e();
                    return;
                } else if (gVar.j != 0 && gVar.i != 0) {
                    if (gVar.d != null) {
                        gVar.d.getRenderView().a(gVar.i, gVar.j);
                        gVar.d.getRenderView().b(gVar.k, gVar.l);
                        gVar.d.requestLayout();
                    }
                    super.a();
                    return;
                } else if (gVar.c.b()) {
                    super.a();
                    return;
                } else {
                    return;
                }
            case 1002:
                int i2 = bundle.getInt("videoWidth");
                int i3 = bundle.getInt("videoHeight");
                int i4 = bundle.getInt("videoSarNum");
                int i5 = bundle.getInt("videoSarDen");
                Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
                ChangeQuickRedirect changeQuickRedirect4 = b.a;
                if (PatchProxy.isSupport(objArr4, gVar, changeQuickRedirect4, false, "32da52b80c16b67406908e5ccb8b27a3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, gVar, changeQuickRedirect4, false, "32da52b80c16b67406908e5ccb8b27a3");
                    return;
                }
                gVar.i = i2;
                gVar.j = i3;
                gVar.k = i4;
                gVar.l = i5;
                gVar.b("onVideoSizeChanged, mVideoWidth: " + gVar.i + " , mVideoHeight: " + gVar.j + " , mVideoSarNum: " + gVar.k + " , mVideoSarDen: " + gVar.l);
                if (gVar.i == 0 || gVar.j == 0) {
                    return;
                }
                if (gVar.d != null) {
                    gVar.d.getRenderView().a(gVar.i, gVar.j);
                    gVar.d.getRenderView().b(gVar.k, gVar.l);
                    gVar.d.requestLayout();
                }
                Bundle bundle2 = new Bundle();
                bundle2.putInt("EVT_PARAM1", gVar.i);
                bundle2.putInt("EVT_PARAM2", gVar.j);
                bundle2.putString("EVT_MSG", "Resolution changed to" + gVar.i + Constants.GestureMoveEvent.KEY_X + gVar.j);
                Object[] objArr5 = {14, bundle2};
                ChangeQuickRedirect changeQuickRedirect5 = b.a;
                if (PatchProxy.isSupport(objArr5, gVar, changeQuickRedirect5, false, "d788a968a3644652680f2a5fd303cb53", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, gVar, changeQuickRedirect5, false, "d788a968a3644652680f2a5fd303cb53");
                    return;
                }
                gVar.b("notifyPlayStateChanged: 14");
                if (gVar.g != null) {
                    gVar.g.a(14, bundle2);
                    return;
                }
                return;
            case 1003:
                int i6 = bundle.getInt("what");
                int i7 = bundle.getInt("extra");
                Object[] objArr6 = {Integer.valueOf(i6), Integer.valueOf(i7)};
                ChangeQuickRedirect changeQuickRedirect6 = q;
                if (PatchProxy.isSupport(objArr6, gVar, changeQuickRedirect6, false, "17da6268202590552052fc2782a4fe76", RobustBitConfig.DEFAULT_VALUE)) {
                    ((Boolean) PatchProxy.accessDispatch(objArr6, gVar, changeQuickRedirect6, false, "17da6268202590552052fc2782a4fe76")).booleanValue();
                    return;
                }
                gVar.b("onInfo what: " + i6 + " , extra: " + i7);
                if (i6 != 3) {
                    switch (i6) {
                        case 700:
                            gVar.b("MEDIA_INFO_VIDEO_TRACK_LAGGING");
                            return;
                        case 701:
                            Object[] objArr7 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect7 = b.a;
                            if (PatchProxy.isSupport(objArr7, gVar, changeQuickRedirect7, false, "ed9e804199e5d285b62abf876eccbc70", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, gVar, changeQuickRedirect7, false, "ed9e804199e5d285b62abf876eccbc70");
                                return;
                            }
                            gVar.b("onBufferingStart");
                            gVar.b(6);
                            return;
                        case 702:
                            Object[] objArr8 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect8 = b.a;
                            if (PatchProxy.isSupport(objArr8, gVar, changeQuickRedirect8, false, "c6c2009e1f06b1cd17143e36830e5d1b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr8, gVar, changeQuickRedirect8, false, "c6c2009e1f06b1cd17143e36830e5d1b");
                                return;
                            }
                            gVar.b("onBufferingEnd");
                            gVar.b(7);
                            return;
                        default:
                            switch (i6) {
                                case 10001:
                                    gVar.b("MEDIA_INFO_VIDEO_ROTATION_CHANGED");
                                    if (gVar.d != null) {
                                        gVar.d.getRenderView().setVideoRotation(i7);
                                        return;
                                    }
                                    return;
                                case 10002:
                                    Object[] objArr9 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect9 = q;
                                    if (PatchProxy.isSupport(objArr9, gVar, changeQuickRedirect9, false, "42cc12dda001e2e2084e895c7fb42899", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr9, gVar, changeQuickRedirect9, false, "42cc12dda001e2e2084e895c7fb42899");
                                        return;
                                    }
                                    gVar.b("onAudioRenderingStart");
                                    gVar.b(1001);
                                    return;
                                case 10003:
                                    Object[] objArr10 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect10 = q;
                                    if (PatchProxy.isSupport(objArr10, gVar, changeQuickRedirect10, false, "1916b1b626c914c6c525e25d7291b3de", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr10, gVar, changeQuickRedirect10, false, "1916b1b626c914c6c525e25d7291b3de");
                                        return;
                                    }
                                    gVar.b("onFirstAudioDecoded");
                                    gVar.b(999);
                                    return;
                                case 10004:
                                    Object[] objArr11 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect11 = q;
                                    if (PatchProxy.isSupport(objArr11, gVar, changeQuickRedirect11, false, "1d98ed6a32b3fa8278746763eca33e35", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr11, gVar, changeQuickRedirect11, false, "1d98ed6a32b3fa8278746763eca33e35");
                                        return;
                                    }
                                    gVar.b("onFirstVideoDecoded");
                                    gVar.b(1000);
                                    return;
                                case 10005:
                                    Object[] objArr12 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect12 = q;
                                    if (PatchProxy.isSupport(objArr12, gVar, changeQuickRedirect12, false, "1be10a4a2f72d19fd7c6ab977782c63f", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr12, gVar, changeQuickRedirect12, false, "1be10a4a2f72d19fd7c6ab977782c63f");
                                        return;
                                    }
                                    gVar.b("onStreamOpened");
                                    gVar.b(TbsLog.TBSLOG_CODE_SDK_INVOKE_ERROR);
                                    return;
                                case 10006:
                                    Object[] objArr13 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect13 = q;
                                    if (PatchProxy.isSupport(objArr13, gVar, changeQuickRedirect13, false, "f5ce932431303ee5b306563471113161", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr13, gVar, changeQuickRedirect13, false, "f5ce932431303ee5b306563471113161");
                                        return;
                                    }
                                    gVar.b("onStreamInfoFounded");
                                    gVar.b(TbsLog.TBSLOG_CODE_SDK_LOAD_ERROR);
                                    return;
                                default:
                                    return;
                            }
                    }
                }
                Object[] objArr14 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect14 = q;
                if (PatchProxy.isSupport(objArr14, gVar, changeQuickRedirect14, false, "3cdf63fdfce9a38448899def918a2fe7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr14, gVar, changeQuickRedirect14, false, "3cdf63fdfce9a38448899def918a2fe7");
                    return;
                }
                gVar.y = true;
                Object[] objArr15 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect15 = b.a;
                if (PatchProxy.isSupport(objArr15, gVar, changeQuickRedirect15, false, "ae158cdfbba186f2ecfe5a149380dc26", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr15, gVar, changeQuickRedirect15, false, "ae158cdfbba186f2ecfe5a149380dc26");
                } else {
                    gVar.b("onVideoRenderingStart");
                    gVar.b(1002);
                }
                if (gVar.A == null) {
                    gVar.A = com.sankuai.android.jarvis.c.c("tcp-speed-collect-service");
                    gVar.A.scheduleAtFixedRate(new Runnable() { // from class: com.sankuai.meituan.riverrunplayer.player.g.4
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr16 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect16 = a;
                            if (PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "a79a891450e087bc299ad620ab002c50", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "a79a891450e087bc299ad620ab002c50");
                                return;
                            }
                            try {
                                long a2 = (g.this.v.a(20200, 0L) * 8) / 1024;
                                if (a2 > 0) {
                                    a.e eVar2 = new a.e();
                                    eVar2.b = a.c.RPLAYER;
                                    eVar2.c = a.d.DownLink;
                                    eVar2.d = (int) (a2 * 10);
                                    com.sankuai.meituan.mtlive.core.network.a.a().a(eVar2);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }, 10000L, 10000L, TimeUnit.MILLISECONDS);
                    return;
                }
                return;
            case 1004:
                gVar.o();
                if (gVar.n()) {
                    return;
                }
                Object[] objArr16 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect16 = b.a;
                if (PatchProxy.isSupport(objArr16, gVar, changeQuickRedirect16, false, "b4c2087be522e0be19b92a35171086cd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr16, gVar, changeQuickRedirect16, false, "b4c2087be522e0be19b92a35171086cd");
                    return;
                }
                gVar.b("onCompletion");
                gVar.c.b = 8;
                gVar.b(8);
                gVar.a(false);
                return;
            case 1005:
                gVar.o();
                if (bundle.getInt("extra") == -20001) {
                    gVar.b(1003);
                    gVar.u.a();
                    return;
                } else if (gVar.n()) {
                    return;
                } else {
                    gVar.a(bundle.getInt("what"), bundle.getInt("extra"));
                    return;
                }
            default:
                return;
        }
    }

    public g(Context context, int i) {
        super(context);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37bda53be3db7345e87dfb02fda6a8b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37bda53be3db7345e87dfb02fda6a8b9");
            return;
        }
        this.w = true;
        this.B = new f.a() { // from class: com.sankuai.meituan.riverrunplayer.player.g.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.riverrunplayer.player.f.a
            public final void a(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb275c911f0c038b29521784a7e9300c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb275c911f0c038b29521784a7e9300c");
                    return;
                }
                g gVar = g.this;
                gVar.b("onResolutionForce: " + z);
                com.sankuai.meituan.xp.e.a().c = f.a().b;
                if (TextUtils.isEmpty(g.this.z)) {
                    return;
                }
                if (z && g.this.h()) {
                    g.this.b(true);
                    g.this.a(g.this.z);
                }
                g.this.b("onResolutionForce: end");
            }

            @Override // com.sankuai.meituan.riverrunplayer.player.f.a
            public final void a(boolean z, boolean z2) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16070e0d621a96c1123f9b07aa86a365", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16070e0d621a96c1123f9b07aa86a365");
                    return;
                }
                g gVar = g.this;
                gVar.b(" onOptimizeVideoForce: " + z);
                if (TextUtils.isEmpty(g.this.z)) {
                    return;
                }
                if ((z || z2) && g.this.h()) {
                    g.this.b(true);
                    g.this.a(g.this.z);
                }
            }
        };
        this.C = new e.a() { // from class: com.sankuai.meituan.riverrunplayer.player.g.2
            public static ChangeQuickRedirect a;
            private HashMap<String, Float> c = new HashMap<>();

            @Override // com.sankuai.meituan.riverrunplayer.player.e.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2c825ea9fdf385a9bbd42e93e00442c9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2c825ea9fdf385a9bbd42e93e00442c9");
                    return;
                }
                g.this.b("begin reconnect");
                g.this.b(9);
                g.this.b(false);
                g.this.a(g.this.z, 0);
            }

            @Override // com.sankuai.meituan.riverrunplayer.player.e.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "01d40cf46c2c259d0c508fdf5166e630", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "01d40cf46c2c259d0c508fdf5166e630");
                    return;
                }
                g.this.b("onReconnectFailed");
                g.this.b(11);
                this.c.put("MTLIVE_RECONNECT_RESULT", Float.valueOf(0.0f));
                int i2 = g.this.u.b;
                if (i2 > 0 && !g.this.y) {
                    this.c.put("MTLIVE_RETRY_COUNT", Float.valueOf(i2));
                }
                g.this.v.a(this.c);
            }

            @Override // com.sankuai.meituan.riverrunplayer.player.e.a
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d09b6cea281d8803285ff4a10ebe8bad", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d09b6cea281d8803285ff4a10ebe8bad");
                    return;
                }
                g.this.b("onReconnectSucceed");
                g.this.b(10);
                this.c.put("MTLIVE_RECONNECT_RESULT", Float.valueOf(1.0f));
                int i2 = g.this.u.b;
                if (i2 > 0 && !g.this.y) {
                    this.c.put("MTLIVE_RETRY_COUNT", Float.valueOf(i2));
                }
                g.this.v.a(this.c);
            }

            @Override // com.sankuai.meituan.riverrunplayer.player.e.a
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "293ffe02df8f2d31e52f474865201e56", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "293ffe02df8f2d31e52f474865201e56");
                } else {
                    g.this.b(str);
                }
            }
        };
        f.a().a(this.B);
        this.u = new e(this.C);
        Object[] objArr2 = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = q;
        this.v = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a1da89e747be48b995992549e573720", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.xp.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a1da89e747be48b995992549e573720") : new com.sankuai.meituan.xp.d(context, new com.sankuai.meituan.xp.b() { // from class: com.sankuai.meituan.riverrunplayer.player.g.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.xp.b
            public final void loadLibrary(String str) throws UnsatisfiedLinkError, SecurityException {
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ceca09244d9674b73f426a958f3c2066", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ceca09244d9674b73f426a958f3c2066");
                } else {
                    g.this.b("RiverRunPlayerEngine 初始化时已加载过so,不需要再次加载");
                }
            }
        }, i);
        this.v.b = new c.a() { // from class: com.sankuai.meituan.riverrunplayer.player.g.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.xp.c.a
            public final void a(int i2, Bundle bundle) {
                Object[] objArr3 = {Integer.valueOf(i2), bundle};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "72a4d2ec62b2436d8efc5f9cf7dadf39", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "72a4d2ec62b2436d8efc5f9cf7dadf39");
                } else {
                    g.a(g.this, i2, bundle);
                }
            }
        };
        this.x = new a(this.v);
    }

    private boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "345f91db604336fd5fb650340acb2dac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "345f91db604336fd5fb650340acb2dac")).booleanValue();
        }
        if (this.c.b()) {
            return this.u.a();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
        if (((java.lang.Integer) r14).intValue() > 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
        if (((java.lang.Double) r14).doubleValue() > 0.0d) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String c(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.riverrunplayer.player.g.c(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // com.sankuai.meituan.riverrunplayer.player.b
    public final boolean a(String str, int i) {
        boolean z;
        Object[] objArr = {str, 0};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e989794413e3b3bfbd9c535c11b57bd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e989794413e3b3bfbd9c535c11b57bd")).booleanValue();
        }
        b("startPlay path: " + str + ", streamType: 0");
        this.z = str;
        if (this.w) {
            this.w = false;
        } else {
            l();
        }
        a(this.r ? 0.0f : this.b);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = q;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7815a15064709d59b77295c92b2631d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7815a15064709d59b77295c92b2631d4");
        } else {
            final a aVar = this.x;
            final ?? r2 = f.a().f == 0 ? 1 : 0;
            Object[] objArr3 = {Byte.valueOf((byte) r2)};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "ece7fea91b86ee9bdff2df0d579e2d2e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "ece7fea91b86ee9bdff2df0d579e2d2e");
            } else {
                aVar.a(new Runnable() { // from class: com.sankuai.meituan.riverrunplayer.player.a.12
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d5237cce3ff207b61a655577b7afac1e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d5237cce3ff207b61a655577b7afac1e");
                            return;
                        }
                        aVar.c.i = r2;
                    }
                });
            }
        }
        try {
            final String c = c(str);
            com.sankuai.meituan.xp.e.a().b = f.a().c ? 1 : 0;
            com.sankuai.meituan.xp.e.a().c = f.a().b;
            new StringBuilder("startPlay resolutionPath: ").append(c);
            Object[] objArr4 = {c};
            ChangeQuickRedirect changeQuickRedirect4 = q;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0f1ad6031bc494fdd7eb6db501bf990a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0f1ad6031bc494fdd7eb6db501bf990a");
            } else {
                this.c.b = 0;
                try {
                    final a aVar2 = this.x;
                    Object[] objArr5 = {c};
                    ChangeQuickRedirect changeQuickRedirect5 = a.a;
                    if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "e5264f6158971869cc5e665e34f26be8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "e5264f6158971869cc5e665e34f26be8");
                    } else {
                        aVar2.a(new Runnable() { // from class: com.sankuai.meituan.riverrunplayer.player.a.3
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr6 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "47f1213c3e7abbc1cdedf43e0b2a0321", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "47f1213c3e7abbc1cdedf43e0b2a0321");
                                    return;
                                }
                                try {
                                    aVar2.a(c);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        });
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    this.c.a(-1, -1);
                    throw new IOException(e);
                }
            }
            z = true;
        } catch (IOException e2) {
            e2.printStackTrace();
            z = false;
        }
        if (z) {
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = q;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "62a4c65e0dabd392c558680c7ffcaeca", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "62a4c65e0dabd392c558680c7ffcaeca");
            } else {
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = b.a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "df79c36d5011ad37a19a6395ee62457e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "df79c36d5011ad37a19a6395ee62457e");
                } else {
                    if (this.m != null) {
                        super.a(this.m);
                    }
                    this.c.b = 1;
                    b(1);
                }
                final a aVar3 = this.x;
                final long j = f.a().d;
                Object[] objArr8 = {4, "optimize-first-frame", new Long(j)};
                ChangeQuickRedirect changeQuickRedirect8 = a.a;
                if (PatchProxy.isSupport(objArr8, aVar3, changeQuickRedirect8, false, "a419cafd7500d42c3bbc27dc221e05ee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, aVar3, changeQuickRedirect8, false, "a419cafd7500d42c3bbc27dc221e05ee");
                } else {
                    aVar3.a(new Runnable() { // from class: com.sankuai.meituan.riverrunplayer.player.a.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr9 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect9 = a;
                            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "03bc7254f3f3a969fcc1f967682ef624", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "03bc7254f3f3a969fcc1f967682ef624");
                            } else {
                                aVar3.a(r2, r3, j);
                            }
                        }
                    });
                }
                final a aVar4 = this.x;
                Object[] objArr9 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect9 = a.a;
                if (PatchProxy.isSupport(objArr9, aVar4, changeQuickRedirect9, false, "6cad55ee8cbd27bb305bfddedcea5657", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, aVar4, changeQuickRedirect9, false, "6cad55ee8cbd27bb305bfddedcea5657");
                } else {
                    aVar4.a(new Runnable() { // from class: com.sankuai.meituan.riverrunplayer.player.a.6
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr10 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect10 = a;
                            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "ab924c257259bcfd93f50a4f49d177da", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "ab924c257259bcfd93f50a4f49d177da");
                            } else {
                                aVar4.b();
                            }
                        }
                    });
                }
            }
            Object[] objArr10 = {(byte) 0};
            ChangeQuickRedirect changeQuickRedirect10 = b.a;
            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "62dbe57313bc86dcc3284768383a8f2d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "62dbe57313bc86dcc3284768383a8f2d");
            } else {
                this.c.c = 3;
                if (this.f.b) {
                    this.e.requestAudioFocus(this.h, 3, 2);
                }
            }
        }
        return z;
    }

    @Override // com.sankuai.meituan.riverrunplayer.player.b
    public final void a(Surface surface) {
        Object[] objArr = {surface};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f015ee96be4634b195655891422fb3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f015ee96be4634b195655891422fb3a");
            return;
        }
        final a aVar = this.x;
        final Surface surface2 = this.o;
        Object[] objArr2 = {surface2};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "854087a017ca9722b3d47aef562360ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "854087a017ca9722b3d47aef562360ce");
        } else {
            aVar.a(new Runnable() { // from class: com.sankuai.meituan.riverrunplayer.player.a.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6dec88ceecd9f154ac9f3f1bcfedb8b2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6dec88ceecd9f154ac9f3f1bcfedb8b2");
                    } else {
                        aVar.a(surface2);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.meituan.riverrunplayer.player.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b72a62049d5f997d7aa5a891822e6585", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b72a62049d5f997d7aa5a891822e6585");
            return;
        }
        final a aVar = this.x;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "e121a30cdc7eee48861481f99a0a500c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "e121a30cdc7eee48861481f99a0a500c");
        } else {
            aVar.a(new Runnable() { // from class: com.sankuai.meituan.riverrunplayer.player.a.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e6f86e6de949db8042d5127647e916ae", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e6f86e6de949db8042d5127647e916ae");
                    } else {
                        aVar.a();
                    }
                }
            });
        }
    }

    @Override // com.sankuai.meituan.riverrunplayer.player.b
    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = q;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db40ea3a80b26e8ade1190e85e60c7a2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db40ea3a80b26e8ade1190e85e60c7a2")).booleanValue() : a(str, 0);
    }

    @Override // com.sankuai.meituan.riverrunplayer.player.b
    public final void c() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1793d8ddfb65bff6633df7cbe4f3807", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1793d8ddfb65bff6633df7cbe4f3807");
            return;
        }
        b("stopPlay");
        this.u.b();
        b(true);
    }

    @Override // com.sankuai.meituan.riverrunplayer.player.b
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8012f9b303d08c3c408a6378e092f92d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8012f9b303d08c3c408a6378e092f92d");
            return;
        }
        final a aVar = this.x;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "602fe03c546379a6d4f200ed1e7431bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "602fe03c546379a6d4f200ed1e7431bb");
        } else {
            aVar.a(new Runnable() { // from class: com.sankuai.meituan.riverrunplayer.player.a.8
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c13ec113eca2453ea584e4f30f15534f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c13ec113eca2453ea584e4f30f15534f");
                    } else {
                        aVar.d();
                    }
                }
            });
        }
    }

    @Override // com.sankuai.meituan.riverrunplayer.player.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1494a91b45e1de66c25a4b29043b54b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1494a91b45e1de66c25a4b29043b54b8");
            return;
        }
        final a aVar = this.x;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "699660a2c5596e90576f4543b97d2393", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "699660a2c5596e90576f4543b97d2393");
        } else {
            aVar.a(new Runnable() { // from class: com.sankuai.meituan.riverrunplayer.player.a.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3c558b7c7a832777eebd795c6e812db4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3c558b7c7a832777eebd795c6e812db4");
                    } else {
                        aVar.c();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) throws IllegalStateException {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95176dd24d180e539f6339c5e5bdec88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95176dd24d180e539f6339c5e5bdec88");
            return;
        }
        b("stopPlay external: " + z);
        o();
        if (z) {
            this.u.b();
        }
        super.c();
        a(!z ? 1 : 0);
    }

    @Override // com.sankuai.meituan.riverrunplayer.player.b
    public final void i() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffe3382275cd7aa7e9345a01e624a776", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffe3382275cd7aa7e9345a01e624a776");
            return;
        }
        b("release ");
        f.a().b(this.B);
        this.u.b();
        super.i();
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0af558e898c36c4978cc933f14cb5460", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0af558e898c36c4978cc933f14cb5460");
        } else if (this.A != null) {
            this.A.shutdownNow();
            this.A = null;
        }
    }

    @Override // com.sankuai.meituan.riverrunplayer.player.b
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adbfdd93039a02750152a289883c252b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adbfdd93039a02750152a289883c252b");
            return;
        }
        o();
        final a aVar = this.x;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "fb78963adfd1beb8a2f17039bc058ebb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "fb78963adfd1beb8a2f17039bc058ebb");
        } else {
            aVar.a(new Runnable() { // from class: com.sankuai.meituan.riverrunplayer.player.a.10
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5c5a000d8d71d7b4fe003c4c94fcadf0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5c5a000d8d71d7b4fe003c4c94fcadf0");
                        return;
                    }
                    aVar.f();
                    a aVar2 = aVar;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a.a;
                    if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "b47a972cee9df628e522c2c8345cd92b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "b47a972cee9df628e522c2c8345cd92b");
                    } else {
                        aVar2.b.shutdownNow();
                    }
                }
            });
        }
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e7356587dc8659d4a26bfeb5f270092", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e7356587dc8659d4a26bfeb5f270092");
        } else {
            this.x.a(f, f);
        }
    }

    @Override // com.sankuai.meituan.riverrunplayer.player.b
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73cbaa8c66ee883a268ce1bedfe7918a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73cbaa8c66ee883a268ce1bedfe7918a");
            return;
        }
        final a aVar = this.x;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "171d214fe151b3722b5404be3e7c6fa1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "171d214fe151b3722b5404be3e7c6fa1");
        } else {
            aVar.a(new Runnable() { // from class: com.sankuai.meituan.riverrunplayer.player.a.9
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "97c6618039375b82777a5d33e5f05cbf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "97c6618039375b82777a5d33e5f05cbf");
                    } else {
                        aVar.e();
                    }
                }
            });
        }
    }

    @Override // com.sankuai.meituan.riverrunplayer.player.b
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef25fb8dda4d7b0af78e774b26492fb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef25fb8dda4d7b0af78e774b26492fb4");
            return;
        }
        if (this.v != null) {
            this.v.a("", "", str);
        }
        a("MTRiverrunPlayer_Event", str + " ,player hashCode:" + hashCode());
    }

    @Override // com.sankuai.meituan.riverrunplayer.player.b
    public final void e() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47f15eac06b545d574942eca679cffc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47f15eac06b545d574942eca679cffc3");
        } else if (f.a().e) {
            b("isOptimizeLatencyOpen stopPlay");
            c();
        } else {
            super.e();
        }
    }

    @Override // com.sankuai.meituan.riverrunplayer.player.b
    public final void g() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35a2a18d27b91fd764fbf831e11cef8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35a2a18d27b91fd764fbf831e11cef8a");
        } else if (f.a().e) {
            b("isOptimizeLatencyOpen startPlay");
            if (TextUtils.isEmpty(this.z)) {
                return;
            }
            a(this.z, 0);
        } else {
            super.g();
        }
    }

    @Override // com.sankuai.meituan.riverrunplayer.player.b
    public final boolean a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bfbf11264ec54fa2714fb41decc0929", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bfbf11264ec54fa2714fb41decc0929")).booleanValue();
        }
        this.v.a(i2);
        return super.a(i, i2);
    }
}
