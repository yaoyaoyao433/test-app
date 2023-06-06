package com.sankuai.meituan.animplayer;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.SurfaceTexture;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import android.util.Range;
import android.view.Surface;
import android.view.TextureView;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.meituan.animplayer.j;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements SurfaceTexture.OnFrameAvailableListener, TextureView.SurfaceTextureListener {
    public static ChangeQuickRedirect a;
    private MediaExtractor A;
    private j.c B;
    private j.a C;
    private j.d D;
    private j.b E;
    volatile i b;
    boolean c;
    protected volatile int d;
    private final Context e;
    private j f;
    private l g;
    private HandlerThread h;
    private volatile Handler i;
    private SurfaceTexture j;
    private Surface k;
    private volatile a l;
    private volatile boolean m;
    private long n;
    private long o;
    private long p;
    private int q;
    private int r;
    private volatile boolean s;
    private int[] t;
    private long u;
    private boolean v;
    private int w;
    private int x;
    private volatile int y;
    private d z;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Object[] objArr = {surfaceTexture};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "612f539c183c30106c9128ca755c5719", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "612f539c183c30106c9128ca755c5719")).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ void A(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "219f4057b31c161875655bdf895b71d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "219f4057b31c161875655bdf895b71d4");
        } else {
            cVar.a(new Runnable() { // from class: com.sankuai.meituan.animplayer.c.10
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aeef1f600305b8414aaa674ddb7a307f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aeef1f600305b8414aaa674ddb7a307f");
                        return;
                    }
                    try {
                        c.this.v = true;
                        c.this.f.a(0L);
                        c.this.f.b();
                        c.this.d = c.this.y = 3;
                    } catch (Exception e) {
                        Log.w("AnimVideoController", "restart error.", e);
                        c.this.a("restart", e.getMessage());
                    }
                }
            });
        }
    }

    public static /* synthetic */ int a(c cVar, int i) {
        cVar.w = 0;
        return 0;
    }

    public static /* synthetic */ MediaExtractor a(c cVar, MediaExtractor mediaExtractor) {
        cVar.A = null;
        return null;
    }

    public static /* synthetic */ j a(c cVar, j jVar) {
        cVar.f = null;
        return null;
    }

    public static /* synthetic */ l a(c cVar, l lVar) {
        cVar.g = null;
        return null;
    }

    public static /* synthetic */ boolean b(c cVar, boolean z) {
        cVar.s = false;
        return false;
    }

    public static /* synthetic */ void d(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "08b379c9d10f2dd104e40930712bd1c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "08b379c9d10f2dd104e40930712bd1c2");
            return;
        }
        cVar.d = 2;
        a aVar = cVar.l;
        SurfaceTexture surfaceTexture = cVar.j;
        if (aVar == null || surfaceTexture == null || cVar.y != 0) {
            return;
        }
        cVar.n = System.currentTimeMillis();
        if (!aVar.b(cVar.e)) {
            cVar.a("data_source", "not_found");
            return;
        }
        com.sankuai.meituan.animplayer.a a2 = cVar.a(aVar);
        if (a2 == null) {
            cVar.a("video_info", "config_error");
            return;
        }
        if (cVar.g != null) {
            l lVar = cVar.g;
            Object[] objArr2 = {a2};
            ChangeQuickRedirect changeQuickRedirect2 = l.a;
            if (PatchProxy.isSupport(objArr2, lVar, changeQuickRedirect2, false, "ed8f681cf35cdb0d1c76000b31d88546", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, lVar, changeQuickRedirect2, false, "ed8f681cf35cdb0d1c76000b31d88546");
            } else {
                lVar.j = a2.c;
                lVar.k = a2.d;
                new StringBuilder("setAnimConfig: mVideoWidth = ").append(lVar.j);
                new StringBuilder("setAnimConfig: mVideoHeight = ").append(lVar.k);
                lVar.b();
                float[] a3 = n.a(a2.e, a2.f, a2.g, lVar.e.b);
                float[] a4 = n.a(a2.e, a2.f, a2.h, lVar.f.b);
                lVar.e.a(a3);
                lVar.f.a(a4);
            }
        }
        if (cVar.f != null) {
            try {
                j jVar = cVar.f;
                Object[] objArr3 = {jVar};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "8c150fde297b2bbc5f39039b00097624", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "8c150fde297b2bbc5f39039b00097624");
                } else if (aVar.c) {
                    jVar.a(aVar.d);
                } else {
                    jVar.a(aVar.b);
                }
                cVar.f.a();
                cVar.y = 1;
            } catch (Exception e) {
                cVar.y = -1;
                cVar.d = -1;
                Log.w("AnimVideoController", "play error.", e);
                cVar.f();
                cVar.a("data_source", e.getMessage());
            }
        }
    }

    public static /* synthetic */ boolean e(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "4353ea21870bf8c87880498bb788a4d6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "4353ea21870bf8c87880498bb788a4d6")).booleanValue() : cVar.e() && cVar.f.h();
    }

    public static /* synthetic */ int n(c cVar) {
        int i = cVar.w;
        cVar.w = i + 1;
        return i;
    }

    public static /* synthetic */ int q(c cVar) {
        int i = cVar.q;
        cVar.q = i + 1;
        return i;
    }

    public static /* synthetic */ void v(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "c8bc44c60f9747a7d85a623654339160", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "c8bc44c60f9747a7d85a623654339160");
        } else if (cVar.h != null) {
            cVar.i.removeCallbacksAndMessages(null);
            cVar.h.quitSafely();
            cVar.h = null;
            cVar.i = null;
        }
    }

    public static /* synthetic */ void x(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "568fe0657d109282819a2cea0fe75d63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "568fe0657d109282819a2cea0fe75d63");
            return;
        }
        i iVar = cVar.b;
        if (iVar != null) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                Bitmap a2 = iVar.a(13, 13);
                if (a2 != null && a2.getWidth() == 13 && a2.getHeight() == 13) {
                    cVar.t = new int[]{b(a2.getPixel(0, 0)), b(a2.getPixel(12, 0)), b(a2.getPixel(0, 12)), b(a2.getPixel(12, 12)), b(a2.getPixel(3, 3)), b(a2.getPixel(9, 3)), b(a2.getPixel(3, 9)), b(a2.getPixel(9, 9)), b(a2.getPixel(6, 6))};
                }
                cVar.u = System.currentTimeMillis() - currentTimeMillis;
                new StringBuilder("sample cost: ").append(cVar.u);
            } catch (Throwable th) {
                Log.w("AnimVideoController", "sample screen error", th);
            }
        }
    }

    public static /* synthetic */ int z(c cVar) {
        int i = cVar.x - 1;
        cVar.x = i;
        return i;
    }

    public c(Context context, i iVar) {
        Object[] objArr = {context, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7eb9120a921073c270bf78fe7824900", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7eb9120a921073c270bf78fe7824900");
            return;
        }
        this.f = new f();
        this.o = -1L;
        this.p = -1L;
        this.x = 1;
        this.y = 0;
        this.d = 0;
        this.A = null;
        this.B = new j.c() { // from class: com.sankuai.meituan.animplayer.c.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.animplayer.j.c
            public final boolean a(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eec2c079809916498bec70f5b685896e", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eec2c079809916498bec70f5b685896e")).booleanValue();
                }
                if (i != 3) {
                    switch (i) {
                        case 701:
                            if (c.this.y == 4) {
                                c.this.y = 6;
                            } else {
                                c.this.y = 5;
                            }
                            return true;
                        case 702:
                            if (c.this.y == 5 || c.this.y == 6) {
                                if (c.this.y == 5) {
                                    c.this.y = 3;
                                } else if (c.this.y == 6) {
                                    c.this.y = 4;
                                }
                            }
                            return true;
                        default:
                            return false;
                    }
                }
                if (c.this.y != 4 && c.this.y != 6) {
                    c.this.y = 3;
                }
                new StringBuilder("FirstFrameDuration: onInfo  duration = ").append(System.currentTimeMillis() - c.this.n);
                return true;
            }
        };
        this.C = new j.a() { // from class: com.sankuai.meituan.animplayer.c.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.animplayer.j.a
            public final void a() {
                boolean z = false;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d578d8f45fa70aad5451983c5948428", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d578d8f45fa70aad5451983c5948428");
                } else if (c.this.y != -1) {
                    if (c.this.s) {
                        c.b(c.this, false);
                        c.x(c.this);
                    }
                    if ((c.this.x < 0 || c.z(c.this) > 0) && c.this.y == 3) {
                        z = true;
                    }
                    if (c.this.b != null) {
                        new StringBuilder("onCompletion: mLoopCount = ").append(c.this.x);
                        c.this.b.b(c.this.x);
                    }
                    c.this.d = c.this.y = 7;
                    if (!z) {
                        c.this.f();
                        c.this.c();
                        return;
                    }
                    c.A(c.this);
                }
            }
        };
        this.D = new j.d() { // from class: com.sankuai.meituan.animplayer.c.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.animplayer.j.d
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3788b436450876b51fb18d57e72f5d3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3788b436450876b51fb18d57e72f5d3");
                } else {
                    c.this.a(new Runnable() { // from class: com.sankuai.meituan.animplayer.c.5.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "717647062d19e8f3985d3a2059559b56", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "717647062d19e8f3985d3a2059559b56");
                                return;
                            }
                            if (c.this.d != 4) {
                                c.this.y = 2;
                            } else {
                                c.this.y = 4;
                            }
                            if (c.this.a() && c.this.f != null) {
                                c.this.f.b();
                            }
                            new StringBuilder("FirstFrameDuration: onPrepared duration = ").append(System.currentTimeMillis() - c.this.n);
                        }
                    });
                }
            }
        };
        this.E = new j.b() { // from class: com.sankuai.meituan.animplayer.c.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.animplayer.j.b
            public final void a(int i, int i2, String str) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), null};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d09afc5b9d6902af09c8ad7e997aee3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d09afc5b9d6902af09c8ad7e997aee3");
                    return;
                }
                c.this.d = c.this.y = -1;
                c.this.a("player", String.format(Locale.US, "what:%d;extra:%d;desc:%s", Integer.valueOf(i), Integer.valueOf(i2), null));
                c.this.f();
            }
        };
        this.e = context.getApplicationContext();
        this.b = iVar;
        iVar.a(this);
        this.h = new HandlerThread("AnimVideoController.render");
        this.h.start();
        this.i = new Handler(this.h.getLooper());
        this.g = new l();
        this.z = new d(context);
        d();
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aaf823ca5bddbb2009df15df511c324", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aaf823ca5bddbb2009df15df511c324");
        } else if (this.f != null) {
            this.f.a(this.C);
            this.f.a(this.E);
            this.f.a(this.D);
            this.f.a(this.B);
        }
    }

    public final void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a30bc0d6007eb9bf5b00ba92cdb001b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a30bc0d6007eb9bf5b00ba92cdb001b");
        } else if (dVar != null) {
            d dVar2 = this.z;
            Object[] objArr2 = {dVar2};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "3c36b4cd861b26479525aea9eb208f4c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "3c36b4cd861b26479525aea9eb208f4c");
            } else if (dVar2 != null) {
                if (TextUtils.isEmpty(dVar.c)) {
                    dVar.c = dVar2.c;
                }
                if (TextUtils.isEmpty(dVar.d)) {
                    dVar.d = dVar2.d;
                }
                if (TextUtils.isEmpty(dVar.e)) {
                    dVar.e = dVar2.e;
                }
                if (dVar.f == 0) {
                    dVar.f = dVar2.f;
                }
            }
            this.z = dVar;
        }
    }

    public final void a(final String str, final boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb1068d5b12273ed4256c17e3564e94f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb1068d5b12273ed4256c17e3564e94f");
        } else {
            a(new Runnable() { // from class: com.sankuai.meituan.animplayer.c.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c1207f5bec344234eedf66af634d0c9c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c1207f5bec344234eedf66af634d0c9c");
                        return;
                    }
                    c.this.v = true;
                    if (c.this.y != 0) {
                        if (c.this.y != 3 || !c.e(c.this)) {
                            if (c.this.y == 8) {
                                if (c.this.f != null) {
                                    try {
                                        c.this.f.a();
                                        c.this.y = 1;
                                    } catch (Exception e) {
                                        c.this.y = -1;
                                        c.this.d = -1;
                                        Log.w("AnimVideoController", "play error.", e);
                                        c.this.f();
                                        c.this.a("data_source", e.getMessage());
                                    }
                                }
                            } else if (c.this.e()) {
                                c.this.f.b();
                                c.this.y = 3;
                            }
                        }
                    } else {
                        c.this.l = new a(str, z);
                        c.this.z.e = c.this.l.a();
                        d dVar = c.this.z;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = d.a;
                        if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "53e16d418a68fd6c8c89b44dd8d341fe", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "53e16d418a68fd6c8c89b44dd8d341fe");
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("MTLIVE_ANIM_PLAY_TOTAL_COUNT", Float.valueOf(1.0f));
                            com.sankuai.meituan.mtliveqos.a.a(dVar.b, dVar.a(), hashMap, dVar.b());
                        }
                        c.a(c.this, 0);
                        c.d(c.this);
                    }
                    c.this.d = 3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        return (this.f == null || this.y == -1 || this.y == 0 || this.y == 1) ? false : true;
    }

    public final void a(int i) {
        if (i != 0) {
            this.x = i;
        }
    }

    public final void a(com.sankuai.meituan.animplayer.utils.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "381cf74b7cbe9d0a13393779df39db9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "381cf74b7cbe9d0a13393779df39db9b");
        } else if (this.g != null) {
            this.g.r = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a59b8e0bb970cf9efc6c8de80c2e2c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a59b8e0bb970cf9efc6c8de80c2e2c0");
        } else {
            a(new Runnable() { // from class: com.sankuai.meituan.animplayer.c.9
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "635633f643d01294b150bc91442847c6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "635633f643d01294b150bc91442847c6");
                        return;
                    }
                    if (c.this.f != null) {
                        c.this.f.e();
                    }
                    c.this.y = 0;
                }
            });
        }
    }

    private com.sankuai.meituan.animplayer.a a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49ec60836f685d8b6a593bc89a115f9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.animplayer.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49ec60836f685d8b6a593bc89a115f9a");
        }
        try {
            return aVar.a(this.e);
        } catch (Exception e) {
            Log.w("AnimVideoController", "parseConfig error.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abe9423dfd2fdee65fb8c0cd758d576b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abe9423dfd2fdee65fb8c0cd758d576b");
            return;
        }
        Handler handler = this.i;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(final SurfaceTexture surfaceTexture, final int i, final int i2) {
        Object[] objArr = {surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e04e7c49f6fc868d955a8dbeb07f2fe8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e04e7c49f6fc868d955a8dbeb07f2fe8");
        } else {
            a(new Runnable() { // from class: com.sankuai.meituan.animplayer.c.11
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:69:0x030b A[Catch: Throwable -> 0x032d, TRY_ENTER, TryCatch #0 {Throwable -> 0x032d, blocks: (B:6:0x001b, B:8:0x004f, B:66:0x02c9, B:9:0x0056, B:11:0x0071, B:41:0x0184, B:43:0x0197, B:58:0x0258, B:60:0x026f, B:62:0x02a5, B:64:0x02b8, B:65:0x02bd, B:61:0x0275, B:44:0x019d, B:46:0x01bc, B:57:0x022b, B:47:0x01c9, B:49:0x01f9, B:50:0x0206, B:52:0x020c, B:54:0x0223, B:69:0x030b, B:70:0x0312, B:12:0x0076, B:14:0x0082, B:16:0x00b7, B:27:0x0111, B:29:0x014c, B:34:0x0167, B:36:0x016d, B:38:0x0173, B:71:0x0313, B:72:0x031b, B:73:0x031c, B:74:0x0323, B:30:0x0157, B:33:0x0161, B:17:0x00c1, B:19:0x00e4, B:23:0x00fa, B:25:0x010c, B:21:0x00f0, B:75:0x0324, B:76:0x032c), top: B:80:0x001b }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 870
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.animplayer.c.AnonymousClass11.run():void");
                }
            });
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        Object[] objArr = {surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ccb2ea679c27e90e9f7ba6d39c8596b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ccb2ea679c27e90e9f7ba6d39c8596b");
        } else {
            a(new Runnable() { // from class: com.sankuai.meituan.animplayer.c.12
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31a7ec1f14d8cdd675b3451db5f85995", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31a7ec1f14d8cdd675b3451db5f85995");
                    } else if (c.this.g != null) {
                        c.this.g.a(i, i2);
                    }
                }
            });
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Object[] objArr = {surfaceTexture};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9652d4c652540c18296fc9593506d20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9652d4c652540c18296fc9593506d20");
        } else {
            this.r++;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Object[] objArr = {surfaceTexture};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c110f8f3bdeaa223935f78f0c4f4bf02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c110f8f3bdeaa223935f78f0c4f4bf02");
        } else {
            a(new Runnable() { // from class: com.sankuai.meituan.animplayer.c.13
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf31e88b2880030cb63c3da13cb66e06", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf31e88b2880030cb63c3da13cb66e06");
                        return;
                    }
                    if (c.this.v) {
                        c.n(c.this);
                        i iVar = c.this.b;
                        if (iVar != null) {
                            new StringBuilder("onVideoStart: mCurrentLoopCount = ").append(c.this.w);
                            iVar.a(c.this.w);
                        }
                        c.this.v = false;
                    }
                    c.q(c.this);
                    if (c.this.p == -1) {
                        c.this.p = System.currentTimeMillis();
                    }
                    if (c.this.o == -1) {
                        c.this.o = System.currentTimeMillis() - c.this.n;
                        new StringBuilder("FirstFrameDelay: ").append(c.this.o);
                    }
                    try {
                        if (c.this.g == null || c.this.j == null) {
                            return;
                        }
                        l lVar = c.this.g;
                        SurfaceTexture surfaceTexture2 = c.this.j;
                        Object[] objArr3 = {surfaceTexture2};
                        ChangeQuickRedirect changeQuickRedirect3 = l.a;
                        if (PatchProxy.isSupport(objArr3, lVar, changeQuickRedirect3, false, "37ec1f06e30f05e8d546ef7cf995e2c3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, lVar, changeQuickRedirect3, false, "37ec1f06e30f05e8d546ef7cf995e2c3");
                            return;
                        }
                        surfaceTexture2.updateTexImage();
                        surfaceTexture2.getTransformMatrix(lVar.c);
                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                        GLES20.glClear(16384);
                        if (lVar.g && lVar.h > 0 && lVar.i > 0) {
                            lVar.g = false;
                            GLES20.glViewport(0, 0, lVar.h, lVar.i);
                        }
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = l.a;
                        if (PatchProxy.isSupport(objArr4, lVar, changeQuickRedirect4, false, "e5c001ca6ee5948ece6018c796a3f100", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, lVar, changeQuickRedirect4, false, "e5c001ca6ee5948ece6018c796a3f100");
                        } else {
                            GLES20.glUseProgram(lVar.l);
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(36197, lVar.m);
                            lVar.d.a(lVar.o);
                            lVar.e.a(lVar.p);
                            lVar.f.a(lVar.q);
                            GLES20.glUniformMatrix4fv(lVar.n, 1, false, lVar.c, 0);
                            GLES20.glDrawArrays(5, 0, 4);
                            GLES20.glFinish();
                        }
                        lVar.a();
                    } catch (Throwable th) {
                        Log.w("AnimVideoController", "renderFrame error.", th);
                        c.this.a("egl", th.getMessage());
                    }
                }
            });
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0837f2b1cab1d46f0bc7a57c44ce5298", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0837f2b1cab1d46f0bc7a57c44ce5298")).booleanValue();
        }
        if (this.f != null) {
            return (this.y != 3 && this.d == 3) || this.y == 2;
        }
        return false;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31c585af2795bec403db910ae46d7322", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31c585af2795bec403db910ae46d7322");
            return;
        }
        this.c = true;
        Handler handler = this.i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        a(new Runnable() { // from class: com.sankuai.meituan.animplayer.c.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed4a2ef53841630759e80f5ccb93e4c8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed4a2ef53841630759e80f5ccb93e4c8");
                    return;
                }
                if (c.this.A != null) {
                    c.this.A.release();
                    c.a(c.this, (MediaExtractor) null);
                }
                if (c.this.f != null) {
                    c.this.f.e();
                    c.this.f.f();
                    c.a(c.this, (j) null);
                }
                if (c.this.k != null) {
                    c.this.k.release();
                    c.this.k = null;
                }
                if (c.this.j != null) {
                    c.this.j.release();
                    c.this.j = null;
                }
                a aVar = c.this.l;
                if (aVar != null) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "31ec0bdd15672c8cbb2bca0be81624a2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "31ec0bdd15672c8cbb2bca0be81624a2");
                    } else if (aVar.c && aVar.d != null) {
                        try {
                            aVar.d.close();
                        } catch (Exception e) {
                            Log.w("AnimVideoController", "dataSource.close error.", e);
                        }
                    }
                    c.this.l = null;
                }
                try {
                    if (c.this.g != null) {
                        l lVar = c.this.g;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = l.a;
                        if (PatchProxy.isSupport(objArr4, lVar, changeQuickRedirect4, false, "d55a155fee87f50bf3d6c62d6d5bca99", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, lVar, changeQuickRedirect4, false, "d55a155fee87f50bf3d6c62d6d5bca99");
                        } else {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = l.a;
                            if (PatchProxy.isSupport(objArr5, lVar, changeQuickRedirect5, false, "ac5557698731c5f61c56bb3fb7754dde", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, lVar, changeQuickRedirect5, false, "ac5557698731c5f61c56bb3fb7754dde");
                            } else {
                                GLES20.glDeleteTextures(1, new int[]{lVar.m}, 0);
                            }
                            lVar.b.b();
                        }
                        c.a(c.this, (l) null);
                    }
                } catch (Throwable th) {
                    Log.w("AnimVideoController", "render destroy error.", th);
                }
                c.v(c.this);
            }
        });
    }

    private static String g() {
        MediaCodecInfo[] codecInfos;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45cfa3814e59f3f2e34d48f73f6522c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45cfa3814e59f3f2e34d48f73f6522c3");
        }
        if (Build.VERSION.SDK_INT < 21) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            MediaCodecInfo.VideoCapabilities videoCapabilities2 = null;
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder()) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    MediaCodecInfo.VideoCapabilities videoCapabilities3 = videoCapabilities2;
                    for (int i = 0; supportedTypes != null && i < supportedTypes.length; i++) {
                        String str = supportedTypes[i];
                        if (("video/avc".equalsIgnoreCase(str) || "video/h264".equalsIgnoreCase(str)) && (capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str)) != null && (videoCapabilities = capabilitiesForType.getVideoCapabilities()) != null) {
                            Range<Integer> supportedWidths = videoCapabilities.getSupportedWidths();
                            Range<Integer> supportedHeights = videoCapabilities.getSupportedHeights();
                            if (supportedWidths != null && supportedHeights != null && (videoCapabilities3 == null || (supportedWidths.getUpper().intValue() >= videoCapabilities3.getSupportedWidths().getUpper().intValue() && supportedHeights.getUpper().intValue() >= videoCapabilities3.getSupportedHeights().getUpper().intValue()))) {
                                videoCapabilities3 = videoCapabilities;
                            }
                        }
                    }
                    videoCapabilities2 = videoCapabilities3;
                }
            }
            if (videoCapabilities2 != null) {
                sb.append(videoCapabilities2.getSupportedWidths().getUpper());
                sb.append(Constants.GestureMoveEvent.KEY_X);
                sb.append(videoCapabilities2.getSupportedHeights().getUpper());
                sb.append(";");
                a(sb, videoCapabilities2, 720);
                sb.append(";");
                a(sb, videoCapabilities2, 1080);
                sb.append(";");
                a(sb, videoCapabilities2, 1440);
                sb.append(";");
                a(sb, videoCapabilities2, 1620);
                sb.append(";");
                a(sb, videoCapabilities2, 2160);
            }
        } catch (Throwable th) {
            Log.w("AnimVideoController", "getDeviceCompatDesc error.", th);
        }
        return sb.toString();
    }

    private static void a(StringBuilder sb, MediaCodecInfo.VideoCapabilities videoCapabilities, int i) {
        Object[] objArr = {sb, videoCapabilities, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18fcf21e4814a16f5069593ccaac2a9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18fcf21e4814a16f5069593ccaac2a9f");
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            Range<Integer> supportedWidths = videoCapabilities.getSupportedWidths();
            if (videoCapabilities.getSupportedHeights().contains((Range<Integer>) Integer.valueOf(i))) {
                sb.append(videoCapabilities.getSupportedWidthsFor(i).getUpper());
            }
            sb.append(Constants.GestureMoveEvent.KEY_X);
            if (supportedWidths.contains((Range<Integer>) Integer.valueOf(i))) {
                sb.append(videoCapabilities.getSupportedHeightsFor(i).getUpper());
            }
        }
    }

    private void a(Map<String, Object> map) {
        int i = 0;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ec936e0506eaa2587738a31082c389e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ec936e0506eaa2587738a31082c389e");
        } else if (this.f != null) {
            map.put("version", 2);
            map.put("player", this.f.g());
            Context context = this.e;
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c1a25a3f9487f1861b25ca300b473a06", RobustBitConfig.DEFAULT_VALUE)) {
                i = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c1a25a3f9487f1861b25ca300b473a06")).intValue();
            } else {
                ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
                if (activityManager != null) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    i = Math.round(((float) memoryInfo.totalMem) / 1.07374182E9f);
                }
            }
            map.put("device_mem", Integer.valueOf(i));
            if (this.l != null) {
                map.put("res_id", this.l.a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20542dde33a33404afb16bbc186e92e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20542dde33a33404afb16bbc186e92e5");
        } else if (this.m || this.y < 2) {
        } else {
            this.m = true;
            i iVar = this.b;
            if (iVar != null) {
                HashMap hashMap = new HashMap();
                a(hashMap);
                hashMap.put(Constants.GestureData.KEY_START_TIME, Long.valueOf(this.o));
                hashMap.put("frame_index", Integer.valueOf(this.r));
                hashMap.put("error_desc", g());
                int i = this.q;
                int currentTimeMillis = i > 0 ? (int) ((System.currentTimeMillis() - this.p) / i) : 0;
                hashMap.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_FPS, Integer.valueOf(currentTimeMillis > 0 ? 1000 / currentTimeMillis : -1));
                if (this.t != null) {
                    hashMap.put("sample_data", Arrays.toString(this.t));
                    hashMap.put("sample_cost", Long.valueOf(this.u));
                }
                if (this.z != null) {
                    this.z.a(currentTimeMillis, this.r, (float) this.u, this.t);
                }
                iVar.a(hashMap);
            }
        }
    }

    private static int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b77f357b2057c2edde9c3a11879ab4d2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b77f357b2057c2edde9c3a11879ab4d2")).intValue();
        }
        if (Color.alpha(i) == 0) {
            return 0;
        }
        return (int) ((Color.red(i) * 0.299d) + (Color.green(i) * 0.587d) + (Color.blue(i) * 0.114d));
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2e462b9cc7b8a9b9919aad88f717625", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2e462b9cc7b8a9b9919aad88f717625");
            return;
        }
        StringBuilder sb = new StringBuilder("onError: ");
        sb.append(str);
        sb.append("  -->desc = ");
        sb.append(str2);
        this.m = true;
        HashMap hashMap = new HashMap();
        a(hashMap);
        hashMap.put("play_state", Integer.valueOf(this.y));
        hashMap.put("frame_index", Integer.valueOf(this.q));
        hashMap.put("error_type", str);
        hashMap.put("error_desc", str2);
        if (this.z != null) {
            this.z.a(str, str2);
        }
        i iVar = this.b;
        if (iVar != null) {
            iVar.a(this.q > 0, hashMap);
        }
        b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        final String b;
        final boolean c;
        AssetFileDescriptor d;

        public a(String str, boolean z) {
            Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0522af07d5399217f6c52d7128be4e23", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0522af07d5399217f6c52d7128be4e23");
                return;
            }
            this.b = str;
            this.c = z;
        }

        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20311266c1c7e8ad8a802f8356e02eeb", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20311266c1c7e8ad8a802f8356e02eeb");
            }
            try {
                return new File(this.b).getName();
            } catch (Exception e) {
                Log.e("AnimVideoController", "getName: ", e);
                return "";
            }
        }

        public final com.sankuai.meituan.animplayer.a a(Context context) throws Exception {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ada1c8bd6ae35ecf7120b5b2e78b75f", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.meituan.animplayer.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ada1c8bd6ae35ecf7120b5b2e78b75f");
            }
            if (this.c) {
                InputStream inputStream = null;
                try {
                    InputStream open = context.getAssets().open(this.b, 2);
                    try {
                        com.sankuai.meituan.animplayer.a a2 = com.sankuai.meituan.animplayer.a.a(open);
                        if (open != null) {
                            open.close();
                        }
                        return a2;
                    } catch (Throwable th) {
                        inputStream = open;
                        th = th;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                return com.sankuai.meituan.animplayer.a.a(this.b);
            }
        }

        public final boolean b(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d556e93f9ea28f6497015f0ea2722c6", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d556e93f9ea28f6497015f0ea2722c6")).booleanValue();
            }
            if (this.c) {
                try {
                    this.d = context.getAssets().openFd(this.b);
                    return this.d != null;
                } catch (Exception e) {
                    Log.w("AnimVideoController", "dataSource.prepare error.", e);
                    return false;
                }
            }
            try {
                return new File(this.b).exists();
            } catch (Exception e2) {
                Log.e("AnimVideoController", "prepare: ", e2);
                return false;
            }
        }
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b7b842725c168a1b99dab916aa54986", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b7b842725c168a1b99dab916aa54986");
        } else if (bVar == null) {
        } else {
            this.s = bVar.c;
            j jVar = bVar.b;
            if (jVar != null) {
                this.f = jVar;
                d();
            }
        }
    }
}
