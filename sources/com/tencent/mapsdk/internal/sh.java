package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.lib.callbacks.TileOverlayCallback;
import com.tencent.map.lib.models.AggregationOverlayInfo;
import com.tencent.map.lib.models.AnnocationText;
import com.tencent.map.lib.models.AnnocationTextResult;
import com.tencent.map.lib.models.ArcLineOverlayInfo;
import com.tencent.map.lib.models.CircleInfo;
import com.tencent.map.lib.models.CityTrafficInfo;
import com.tencent.map.lib.models.DataSource;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.lib.models.GroundOverlayInfo;
import com.tencent.map.lib.models.HeatmapInfo;
import com.tencent.map.lib.models.IndoorCellInfo;
import com.tencent.map.lib.models.IntersectionOverlayInfo;
import com.tencent.map.lib.models.MapTileID;
import com.tencent.map.lib.models.MarkerInfo;
import com.tencent.map.lib.models.MaskLayer;
import com.tencent.map.lib.models.PolygonInfo;
import com.tencent.map.lib.models.ScatterPlotInfo;
import com.tencent.map.lib.models.TrailOverlayInfo;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.engine.jni.JNI;
import com.tencent.mapsdk.engine.jni.models.TappedElement;
import com.tencent.mapsdk.internal.mn;
import com.tencent.mapsdk.internal.py;
import com.tencent.tencentmap.mapsdk.maps.model.Language;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.MapPoi;
import com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection;
import com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions;
import com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle;
import com.tencent.tencentmap.mapsdk.maps.model.VectorHeatAggregationUnit;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class sh implements bq, bs, ny, nz, od, of, oh, oi {
    public static final int a = 0;
    public static final int b = -1;
    public static final int c = -9;
    private static final int m = 256;
    private static final int n = -14803236;
    private static final int o = -13752731;
    private static final int p = -15611905;
    private static final int q = -14650226;
    private static final int r = -11088785;
    private static final int s = -9906011;
    private static final int t = -11635864;
    private static final int u = -16777063;
    private static final int v = -16777063;
    private static boolean x = false;
    public volatile long e;
    public nv f;
    public od i;
    public mn j;
    private float y;
    public final lf h = new ll() { // from class: com.tencent.mapsdk.internal.sh.1
        @Override // com.tencent.mapsdk.internal.ll, com.tencent.mapsdk.internal.lf
        public final void a(String str, byte[] bArr) {
            if (sh.this.e == 0 || TextUtils.isEmpty(str)) {
                return;
            }
            synchronized (sh.this.l) {
                sh.this.d.nativeWriteMapDataBlock(sh.this.e, str, bArr);
            }
            kn.a(ki.b, "data-length", bArr != gx.a() ? bArr.length : 0);
            if (kn.d(ki.b, "req-count") == kn.e(ki.b, "data-count") + kn.d(ki.b, "cancel-count")) {
                kn.e(ki.b);
            }
        }
    };
    private long w = 0;
    public long k = 0;
    private String z = null;
    public final Object l = new Object();
    private final ReentrantLock A = new ReentrantLock();
    public JNI d = new JNI();
    public lg g = new lg();

    private static void W() {
    }

    private static void X() {
    }

    public sh(Context context, mn mnVar) {
        this.y = 1.0f;
        this.g.a(this.h);
        this.j = mnVar;
        this.y = context.getResources().getDisplayMetrics().density;
        if (x) {
            kg.a(context, sd.a);
        }
    }

    private static boolean A() {
        return x;
    }

    private static void k(boolean z) {
        x = z;
    }

    private void a(nv nvVar) {
        this.f = nvVar;
    }

    private void B() {
        this.j.v = true;
    }

    private void a(od odVar) {
        this.i = odVar;
    }

    private void C() {
        if (this.g != null) {
            this.g.b(this.h);
            this.g.a();
        }
        if (this.e != 0) {
            long j = this.e;
            this.e = 0L;
            synchronized (this.l) {
                this.d.nativeDestroyEngine(j);
            }
        }
        this.j = null;
        this.d.destory();
    }

    public final boolean a(Context context, nu nuVar, w wVar, String str, String str2, String str3) {
        int[] iArr = new int[1];
        this.d.initCallback(nuVar, wVar, this, this, this, this, this.j.i, this, this, this);
        this.e = this.d.nativeInitEngine(str, str2, str3, hc.a(context), 256, hc.a(context), iArr, false, Language.zh.ordinal());
        if (iArr[0] != 0) {
            kj.a("init engine fail:" + iArr[0]);
            this.e = 0L;
            return false;
        }
        this.d.nativeSetCenter(this.e, new GeoPoint(39984186, 116307503), false);
        this.d.registerCallback(this.e);
        this.d.nativeSetTrafficColor(this.e, n, p, r, -16777063);
        return true;
    }

    private boolean D() {
        if (this.e == 0) {
            return false;
        }
        if (System.currentTimeMillis() - this.k > 560) {
            this.d.nativeClearDownloadURLCache(this.e);
            this.k = System.currentTimeMillis();
        }
        return this.d.nativeGenerateTextures(this.e);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$84  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass84 implements CallbackRunnable<Boolean> {
        public AnonymousClass84() {
        }

        private Boolean a() {
            return Boolean.valueOf(sh.this.d.nativeDrawFrame(sh.this.e));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ Boolean run() {
            return Boolean.valueOf(sh.this.d.nativeDrawFrame(sh.this.e));
        }
    }

    private boolean E() {
        return ((Boolean) a((CallbackRunnable<AnonymousClass84>) new AnonymousClass84(), (AnonymousClass84) Boolean.FALSE)).booleanValue();
    }

    @Override // com.tencent.mapsdk.internal.bs
    public final int e() {
        return ((Integer) a((CallbackRunnable<CallbackRunnable<Integer>>) new CallbackRunnable<Integer>() { // from class: com.tencent.mapsdk.internal.sh.95
            private Integer a() {
                if (sh.this.e != 0) {
                    return Integer.valueOf(sh.this.d.nativeClearCache(sh.this.e));
                }
                return -1;
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ Integer run() {
                if (sh.this.e != 0) {
                    return Integer.valueOf(sh.this.d.nativeClearCache(sh.this.e));
                }
                return -1;
            }
        }, (CallbackRunnable<Integer>) (-1))).intValue();
    }

    @Override // com.tencent.mapsdk.internal.bs
    public final void d() {
        b(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.106
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e == 0) {
                    return;
                }
                sh.this.d.nativeLockEngine(sh.this.e);
            }
        });
    }

    @Override // com.tencent.mapsdk.internal.bs
    public final void f() {
        b(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.117
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e == 0) {
                    return;
                }
                sh.this.d.nativeUnlockEngine(sh.this.e);
            }
        });
    }

    @Deprecated
    public final boolean j() {
        return ((Boolean) a((CallbackRunnable<CallbackRunnable<Boolean>>) new CallbackRunnable<Boolean>() { // from class: com.tencent.mapsdk.internal.sh.128
            private Boolean a() {
                if (sh.this.e != 0) {
                    return Boolean.valueOf(sh.this.d.nativeIsMapDrawFinished(sh.this.e));
                }
                return Boolean.TRUE;
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ Boolean run() {
                if (sh.this.e != 0) {
                    return Boolean.valueOf(sh.this.d.nativeIsMapDrawFinished(sh.this.e));
                }
                return Boolean.TRUE;
            }
        }, (CallbackRunnable<Boolean>) Boolean.TRUE)).booleanValue();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$139  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass139 implements CallbackRunnable<Integer> {
        final /* synthetic */ String a;

        public AnonymousClass139(String str) {
            this.a = str;
        }

        private Integer a() {
            if (sh.this.e != 0) {
                return Integer.valueOf(sh.this.d.nativeIsCityHasTraffic(sh.this.e, this.a));
            }
            return 0;
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ Integer run() {
            if (sh.this.e != 0) {
                return Integer.valueOf(sh.this.d.nativeIsCityHasTraffic(sh.this.e, this.a));
            }
            return 0;
        }
    }

    private int b(String str) {
        return ((Integer) a((CallbackRunnable<AnonymousClass139>) new AnonymousClass139(str), (AnonymousClass139) 0)).intValue();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$150  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass150 implements mn.a {
        final /* synthetic */ int a;

        public AnonymousClass150(int i) {
            this.a = i;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            if (this.a == 1) {
                sh.this.d.nativeSetTrafficColor(sh.this.e, sh.n, sh.p, sh.s, -16777063);
            } else if (this.a == 2) {
                sh.this.d.nativeSetTrafficColor(sh.this.e, sh.o, sh.q, sh.t, -16777063);
            } else {
                sh.this.d.nativeSetTrafficColor(sh.this.e, sh.n, sh.p, sh.r, -16777063);
            }
        }
    }

    private void g(int i) {
        a(new AnonymousClass150(i));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$161  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass161 implements CallbackRunnable<Integer> {
        final /* synthetic */ byte[] a;
        final /* synthetic */ int b;
        final /* synthetic */ boolean c = true;
        final /* synthetic */ boolean d = false;

        public AnonymousClass161(byte[] bArr, int i) {
            this.a = bArr;
            this.b = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.tencent.map.tools.CallbackRunnable
        /* renamed from: a */
        public Integer run() {
            Integer valueOf;
            if (sh.this.e != 0) {
                synchronized (sh.this.l) {
                    valueOf = Integer.valueOf(sh.this.d.nativeRefreshTrafficData(sh.this.e, this.a, this.b, this.c, this.d));
                }
                return valueOf;
            }
            return -1;
        }
    }

    private int a(byte[] bArr, int i) {
        return ((Integer) a((CallbackRunnable<AnonymousClass161>) new AnonymousClass161(bArr, i), (AnonymousClass161) (-1))).intValue();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass2 implements mn.a {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ int c;
        final /* synthetic */ int d;
        final /* synthetic */ int e;

        public AnonymousClass2(int i, int i2, int i3, int i4, int i5) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e != 0) {
                sh.this.d.nativeCheckTrafficBlockCache(sh.this.e, this.a, this.b, this.c, this.d, this.e);
            }
        }
    }

    private void a(int i, int i2, int i3, int i4, int i5) {
        b(new AnonymousClass2(i, i2, i3, i4, i5));
    }

    private void b(final int i, final int i2, final int i3, final int i4, final int i5) {
        b(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.13
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e != 0) {
                    sh.this.d.nativeCheckTrafficBlockCacheForReplay(sh.this.e, i, i2, i3, i4, i5);
                }
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$24  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass24 implements CallbackRunnable<qt[]> {
        public AnonymousClass24() {
        }

        private qt[] a() {
            int[] nativeFetchLackedTrafficBlocks;
            if (sh.this.e == 0 || (nativeFetchLackedTrafficBlocks = sh.this.d.nativeFetchLackedTrafficBlocks(sh.this.e)) == null || nativeFetchLackedTrafficBlocks.length == 0) {
                return null;
            }
            qt[] qtVarArr = new qt[nativeFetchLackedTrafficBlocks.length / 7];
            for (int i = 0; i < nativeFetchLackedTrafficBlocks.length / 7; i++) {
                qtVarArr[i] = new qt();
                int i2 = i * 7;
                qtVarArr[i].a = nativeFetchLackedTrafficBlocks[i2];
                qtVarArr[i].b = nativeFetchLackedTrafficBlocks[i2 + 1];
                qtVarArr[i].d = nativeFetchLackedTrafficBlocks[i2 + 2];
                qtVarArr[i].c = nativeFetchLackedTrafficBlocks[i2 + 3];
                qtVarArr[i].f = nativeFetchLackedTrafficBlocks[i2 + 4];
                qtVarArr[i].e = nativeFetchLackedTrafficBlocks[i2 + 5];
                qtVarArr[i].g = nativeFetchLackedTrafficBlocks[i2 + 6];
            }
            return qtVarArr;
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ qt[] run() {
            int[] nativeFetchLackedTrafficBlocks;
            if (sh.this.e == 0 || (nativeFetchLackedTrafficBlocks = sh.this.d.nativeFetchLackedTrafficBlocks(sh.this.e)) == null || nativeFetchLackedTrafficBlocks.length == 0) {
                return null;
            }
            qt[] qtVarArr = new qt[nativeFetchLackedTrafficBlocks.length / 7];
            for (int i = 0; i < nativeFetchLackedTrafficBlocks.length / 7; i++) {
                qtVarArr[i] = new qt();
                int i2 = i * 7;
                qtVarArr[i].a = nativeFetchLackedTrafficBlocks[i2];
                qtVarArr[i].b = nativeFetchLackedTrafficBlocks[i2 + 1];
                qtVarArr[i].d = nativeFetchLackedTrafficBlocks[i2 + 2];
                qtVarArr[i].c = nativeFetchLackedTrafficBlocks[i2 + 3];
                qtVarArr[i].f = nativeFetchLackedTrafficBlocks[i2 + 4];
                qtVarArr[i].e = nativeFetchLackedTrafficBlocks[i2 + 5];
                qtVarArr[i].g = nativeFetchLackedTrafficBlocks[i2 + 6];
            }
            return qtVarArr;
        }
    }

    private qt[] F() {
        return (qt[]) a(new AnonymousClass24(), (AnonymousClass24) null);
    }

    private CityTrafficInfo c(final String str) {
        return (CityTrafficInfo) a((CallbackRunnable<CallbackRunnable<CityTrafficInfo>>) new CallbackRunnable<CityTrafficInfo>() { // from class: com.tencent.mapsdk.internal.sh.35
            private CityTrafficInfo a() {
                if (sh.this.e == 0) {
                    return null;
                }
                CityTrafficInfo cityTrafficInfo = new CityTrafficInfo();
                sh.this.d.nativeGetTrafficCityInfo(sh.this.e, str, cityTrafficInfo);
                return cityTrafficInfo;
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ CityTrafficInfo run() {
                if (sh.this.e == 0) {
                    return null;
                }
                CityTrafficInfo cityTrafficInfo = new CityTrafficInfo();
                sh.this.d.nativeGetTrafficCityInfo(sh.this.e, str, cityTrafficInfo);
                return cityTrafficInfo;
            }
        }, (CallbackRunnable<CityTrafficInfo>) null);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$46  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass46 implements CallbackRunnable<Integer> {
        final /* synthetic */ PolygonInfo a;

        public AnonymousClass46(PolygonInfo polygonInfo) {
            this.a = polygonInfo;
        }

        private Integer a() {
            if (sh.this.e != 0) {
                return Integer.valueOf(sh.this.d.nativeAddPolygon(sh.this.e, this.a));
            }
            return 0;
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ Integer run() {
            if (sh.this.e != 0) {
                return Integer.valueOf(sh.this.d.nativeAddPolygon(sh.this.e, this.a));
            }
            return 0;
        }
    }

    private int a(PolygonInfo polygonInfo) {
        return ((Integer) a((CallbackRunnable<AnonymousClass46>) new AnonymousClass46(polygonInfo), (AnonymousClass46) 0)).intValue();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$57  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass57 implements CallbackRunnable<Integer> {
        final /* synthetic */ CircleInfo a;

        public AnonymousClass57(CircleInfo circleInfo) {
            this.a = circleInfo;
        }

        private Integer a() {
            if (sh.this.e != 0 && this.a != null) {
                return Integer.valueOf(sh.this.d.nativeAddCircle(sh.this.e, this.a));
            }
            return -1;
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ Integer run() {
            if (sh.this.e != 0 && this.a != null) {
                return Integer.valueOf(sh.this.d.nativeAddCircle(sh.this.e, this.a));
            }
            return -1;
        }
    }

    private int a(CircleInfo circleInfo) {
        return ((Integer) a((CallbackRunnable<AnonymousClass57>) new AnonymousClass57(circleInfo), (AnonymousClass57) (-1))).intValue();
    }

    private void a(int i, CircleInfo circleInfo) {
        if (this.e == 0 || circleInfo == null) {
            return;
        }
        a(new AnonymousClass68(i, circleInfo));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$68  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass68 implements mn.a {
        final /* synthetic */ int a;
        final /* synthetic */ CircleInfo b;

        public AnonymousClass68(int i, CircleInfo circleInfo) {
            this.a = i;
            this.b = circleInfo;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            sh.this.d.nativeUpdateCircle(sh.this.e, this.a, this.b);
        }
    }

    private void h(int i) {
        if (this.e == 0 || i < 0 || this.j == null) {
            return;
        }
        a(new AnonymousClass79(i));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$79  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass79 implements mn.a {
        final /* synthetic */ int a;

        public AnonymousClass79(int i) {
            this.a = i;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            sh.this.d.nativeDeleteCircle(sh.this.e, this.a);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$82  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass82 implements mn.a {
        final /* synthetic */ PolygonInfo a;

        public AnonymousClass82(PolygonInfo polygonInfo) {
            this.a = polygonInfo;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.nativeUpdatePolygon(sh.this.e, this.a.polygonId, this.a.borderLineId, this.a);
        }
    }

    private void b(PolygonInfo polygonInfo) {
        a(new AnonymousClass82(polygonInfo));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$83  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass83 implements mn.a {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ boolean c;

        public AnonymousClass83(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0 || this.a < 0 || sh.this.j == null) {
                return;
            }
            sh.this.d.nativeSetPolygonHidden(sh.this.e, this.a, this.b, this.c);
        }
    }

    private void a(int i, int i2, boolean z) {
        a(new AnonymousClass83(i, i2, z));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$85  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass85 implements mn.a {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        public AnonymousClass85(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0 || this.a < 0 || sh.this.j == null) {
                return;
            }
            sh.this.d.nativeDeletePolygon(sh.this.e, this.a, this.b);
        }
    }

    private void c(int i, int i2) {
        a(new AnonymousClass85(i, i2));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$86  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass86 implements CallbackRunnable<Integer> {
        final /* synthetic */ MaskLayer a;

        public AnonymousClass86(MaskLayer maskLayer) {
            this.a = maskLayer;
        }

        private Integer a() {
            if (sh.this.e != 0) {
                return Integer.valueOf(sh.this.d.nativeAddMaskLayer(sh.this.e, this.a));
            }
            return 0;
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ Integer run() {
            if (sh.this.e != 0) {
                return Integer.valueOf(sh.this.d.nativeAddMaskLayer(sh.this.e, this.a));
            }
            return 0;
        }
    }

    private int a(MaskLayer maskLayer) {
        return ((Integer) a((CallbackRunnable<AnonymousClass86>) new AnonymousClass86(maskLayer), (AnonymousClass86) 0)).intValue();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$87  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass87 implements mn.a {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        public AnonymousClass87(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.nativeUpdateMaskLayer(sh.this.e, this.a, this.b);
        }
    }

    private void d(int i, int i2) {
        a(new AnonymousClass87(i, i2));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$88  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass88 implements mn.a {
        final /* synthetic */ int a;

        public AnonymousClass88(int i) {
            this.a = i;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.nativeRemoveMaskLayer(sh.this.e, this.a);
        }
    }

    private void i(int i) {
        a(new AnonymousClass88(i));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$89  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass89 implements CallbackRunnable<GeoPoint> {
        final /* synthetic */ byte[] a;
        final /* synthetic */ float b;
        final /* synthetic */ float c;

        public AnonymousClass89(byte[] bArr, float f, float f2) {
            this.a = bArr;
            this.b = f;
            this.c = f2;
        }

        private GeoPoint a() {
            double[] dArr = new double[2];
            sh.this.d.nativeFromScreenLocation(sh.this.e, this.a, this.b, this.c, dArr);
            return new GeoPoint((int) (dArr[1] * 1000000.0d), (int) (dArr[0] * 1000000.0d));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ GeoPoint run() {
            double[] dArr = new double[2];
            sh.this.d.nativeFromScreenLocation(sh.this.e, this.a, this.b, this.c, dArr);
            return new GeoPoint((int) (dArr[1] * 1000000.0d), (int) (dArr[0] * 1000000.0d));
        }
    }

    private GeoPoint a(byte[] bArr, float f, float f2) {
        return (GeoPoint) b((CallbackRunnable<AnonymousClass89>) new AnonymousClass89(bArr, f, f2), (AnonymousClass89) new GeoPoint());
    }

    public final PointF a(final double d, final double d2) {
        return (PointF) b((CallbackRunnable<CallbackRunnable<PointF>>) new CallbackRunnable<PointF>() { // from class: com.tencent.mapsdk.internal.sh.90
            final /* synthetic */ byte[] a = null;

            private PointF a() {
                if (sh.this.e == 0) {
                    return new PointF();
                }
                float[] fArr = new float[2];
                sh.this.d.nativeToScreenLocation(sh.this.e, this.a, d, d2, fArr);
                return new PointF(fArr[0], fArr[1]);
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ PointF run() {
                if (sh.this.e == 0) {
                    return new PointF();
                }
                float[] fArr = new float[2];
                sh.this.d.nativeToScreenLocation(sh.this.e, this.a, d, d2, fArr);
                return new PointF(fArr[0], fArr[1]);
            }
        }, (CallbackRunnable<PointF>) new PointF());
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$91  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass91 implements CallbackRunnable<Boolean> {
        final /* synthetic */ String a;

        public AnonymousClass91(String str) {
            this.a = str;
        }

        private Boolean a() {
            if (sh.this.e != 0) {
                return Boolean.valueOf(sh.this.d.nativeHasStreetRoad(sh.this.e, this.a));
            }
            return Boolean.FALSE;
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ Boolean run() {
            if (sh.this.e != 0) {
                return Boolean.valueOf(sh.this.d.nativeHasStreetRoad(sh.this.e, this.a));
            }
            return Boolean.FALSE;
        }
    }

    private boolean d(String str) {
        return ((Boolean) a((CallbackRunnable<AnonymousClass91>) new AnonymousClass91(str), (AnonymousClass91) Boolean.FALSE)).booleanValue();
    }

    public final void k() {
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.92
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e == 0) {
                    return;
                }
                sh.this.d.nativeShowStreetRoad(sh.this.e);
            }
        });
    }

    public final void l() {
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.93
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e != 0) {
                    sh.this.d.nativeHideStreetRoad(sh.this.e);
                }
            }
        });
    }

    public final void a(final boolean z) {
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.94
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e == 0) {
                    return;
                }
                sh.this.d.nativeSetSatelliteEnabled(sh.this.e, z);
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$96  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass96 implements mn.a {
        public AnonymousClass96() {
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.nativeShowTraffic(sh.this.e);
        }
    }

    private void G() {
        a(new AnonymousClass96());
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$97  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass97 implements mn.a {
        public AnonymousClass97() {
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.nativeHideTraffic(sh.this.e);
        }
    }

    private void H() {
        a(new AnonymousClass97());
    }

    public final String a(final GeoPoint geoPoint) {
        return (String) a((CallbackRunnable<CallbackRunnable<String>>) new CallbackRunnable<String>() { // from class: com.tencent.mapsdk.internal.sh.98
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.tencent.map.tools.CallbackRunnable
            /* renamed from: a */
            public String run() {
                byte[] nativeGetCityName;
                if (sh.this.e == 0 || (nativeGetCityName = sh.this.d.nativeGetCityName(sh.this.e, geoPoint)) == null) {
                    return "";
                }
                try {
                    return new String(nativeGetCityName, CommonConstant.Encoding.GBK).trim();
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    return "";
                }
            }
        }, (CallbackRunnable<String>) "");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$99  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass99 implements mn.a {
        final /* synthetic */ String a;

        public AnonymousClass99(String str) {
            this.a = str;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.nativeUpdateMapResource(sh.this.e, this.a);
        }
    }

    private void e(String str) {
        a(new AnonymousClass99(str));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$100  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass100 implements CallbackRunnable<Integer> {
        final /* synthetic */ py a;

        public AnonymousClass100(py pyVar) {
            this.a = pyVar;
        }

        private Integer a() {
            if (this.a == null) {
                return -1;
            }
            if (this.a.r != -1) {
                return Integer.valueOf(this.a.r);
            }
            return Integer.valueOf(sh.a(sh.this, this.a));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ Integer run() {
            if (this.a == null) {
                return -1;
            }
            if (this.a.r != -1) {
                return Integer.valueOf(this.a.r);
            }
            return Integer.valueOf(sh.a(sh.this, this.a));
        }
    }

    private int a(py pyVar) {
        return ((Integer) a((CallbackRunnable<AnonymousClass100>) new AnonymousClass100(pyVar), (AnonymousClass100) (-1))).intValue();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$101  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass101 implements mn.a {
        final /* synthetic */ py a;

        public AnonymousClass101(py pyVar) {
            this.a = pyVar;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (this.a == null || this.a.r == -1) {
                return;
            }
            sh.a(sh.this, this.a);
            sh shVar = sh.this;
            py pyVar = this.a;
            if (shVar.e != 0) {
                shVar.a(new AnonymousClass108(pyVar));
            }
            sh shVar2 = sh.this;
            shVar2.a(new AnonymousClass107(this.a));
            sh shVar3 = sh.this;
            py pyVar2 = this.a;
            if (shVar3.e != 0) {
                shVar3.a(new AnonymousClass109(pyVar2));
            }
            if (this.a.a.E) {
                sh shVar4 = sh.this;
                py pyVar3 = this.a;
                if (shVar4.e != 0) {
                    shVar4.a(new AnonymousClass113(pyVar3));
                }
            } else {
                sh shVar5 = sh.this;
                py pyVar4 = this.a;
                if (shVar5.e != 0) {
                    shVar5.a(new AnonymousClass112(pyVar4));
                }
            }
            sh shVar6 = sh.this;
            py pyVar5 = this.a;
            if (shVar6.e != 0) {
                shVar6.a(new AnonymousClass111(pyVar5));
            }
            if (!hb.a(this.a.a.H)) {
                sh shVar7 = sh.this;
                py pyVar6 = this.a;
                if (shVar7.e != 0) {
                    shVar7.a(new AnonymousClass110(pyVar6));
                }
            }
            sh shVar8 = sh.this;
            shVar8.a(new AnonymousClass30(this.a));
        }
    }

    private void b(py pyVar) {
        a(new AnonymousClass101(pyVar));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$102  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass102 implements CallbackRunnable<Integer> {
        final /* synthetic */ py a;
        final /* synthetic */ int b;
        final /* synthetic */ boolean c;
        final /* synthetic */ boolean d;
        final /* synthetic */ int[] e;
        final /* synthetic */ int[] f;

        AnonymousClass102(py pyVar, int i, boolean z, boolean z2, int[] iArr, int[] iArr2) {
            this.a = pyVar;
            this.b = i;
            this.c = z;
            this.d = z2;
            this.e = iArr;
            this.f = iArr2;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private java.lang.Integer a() {
            /*
                Method dump skipped, instructions count: 223
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.sh.AnonymousClass102.a():java.lang.Integer");
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
        @Override // com.tencent.map.tools.CallbackRunnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final /* synthetic */ java.lang.Integer run() {
            /*
                Method dump skipped, instructions count: 223
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.sh.AnonymousClass102.run():java.lang.Object");
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$103  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass103 implements mn.a {
        final /* synthetic */ py a;

        public AnonymousClass103(py pyVar) {
            this.a = pyVar;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            int i;
            if (sh.this.e == 0 || (i = this.a.r) == -1) {
                return;
            }
            sh.this.d.nativeSetLineSelected(sh.this.e, i, this.a.isSelected());
        }
    }

    private void d(py pyVar) {
        a(new AnonymousClass103(pyVar));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$104  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass104 implements mn.a {
        final /* synthetic */ int a;
        final /* synthetic */ boolean b;

        public AnonymousClass104(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (this.a == -1) {
                return;
            }
            sh.this.d.nativeDeleteLine(sh.this.e, this.a, this.b);
        }
    }

    private void a(int i, boolean z) {
        a(new AnonymousClass104(i, z));
    }

    private boolean a(final int i, final float f, final float f2) {
        if (i == -1) {
            return false;
        }
        return ((Boolean) a((CallbackRunnable<CallbackRunnable<Boolean>>) new CallbackRunnable<Boolean>() { // from class: com.tencent.mapsdk.internal.sh.105
            private Boolean a() {
                return Boolean.valueOf(sh.this.d.nativeOnTapLine(i, f, f2));
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ Boolean run() {
                return Boolean.valueOf(sh.this.d.nativeOnTapLine(i, f, f2));
            }
        }, (CallbackRunnable<Boolean>) Boolean.FALSE)).booleanValue();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$107  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass107 implements mn.a {
        final /* synthetic */ py a;

        AnonymousClass107(py pyVar) {
            this.a = pyVar;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            py.a aVar;
            int i = this.a.r;
            if (i == -1 || (aVar = this.a.s) == null) {
                return;
            }
            sh.this.d.nativeSetTurnArrow(sh.this.e, i, this.a.a.m, aVar.a, aVar.b);
        }
    }

    private void e(py pyVar) {
        a(new AnonymousClass107(pyVar));
    }

    private void f(py pyVar) {
        if (this.e == 0) {
            return;
        }
        a(new AnonymousClass108(pyVar));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$108  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass108 implements mn.a {
        final /* synthetic */ py a;

        AnonymousClass108(py pyVar) {
            this.a = pyVar;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            int i = this.a.r;
            if (i == -1) {
                return;
            }
            py pyVar = this.a;
            int[] iArr = {pyVar.a.J, pyVar.a.K};
            sh.this.d.nativeSetTurnArrowStyle(sh.this.e, i, iArr[0], iArr[1]);
        }
    }

    private void g(py pyVar) {
        if (this.e == 0) {
            return;
        }
        a(new AnonymousClass109(pyVar));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$109  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass109 implements mn.a {
        final /* synthetic */ py a;

        AnonymousClass109(py pyVar) {
            this.a = pyVar;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            int i = this.a.r;
            if (i == -1) {
                return;
            }
            sh.this.d.nativeSetLineDrawArrow(sh.this.e, i, this.a.a.w);
        }
    }

    private void h(py pyVar) {
        if (this.e == 0) {
            return;
        }
        a(new AnonymousClass110(pyVar));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$110  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass110 implements mn.a {
        final /* synthetic */ py a;

        AnonymousClass110(py pyVar) {
            this.a = pyVar;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            int i = this.a.r;
            if (i == -1) {
                return;
            }
            sh.this.d.nativeSetLineDirectionArrowTextureName(sh.this.e, i, this.a.a.H);
        }
    }

    private void i(py pyVar) {
        if (this.e == 0) {
            return;
        }
        a(new AnonymousClass111(pyVar));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$111  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass111 implements mn.a {
        final /* synthetic */ py a;

        AnonymousClass111(py pyVar) {
            this.a = pyVar;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            int i = this.a.r;
            if (i == -1) {
                return;
            }
            sh.this.d.nativeSetDrawCap(sh.this.e, i, this.a.a.z);
        }
    }

    private void j(py pyVar) {
        if (this.e == 0) {
            return;
        }
        a(new AnonymousClass112(pyVar));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$112  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass112 implements mn.a {
        final /* synthetic */ py a;

        AnonymousClass112(py pyVar) {
            this.a = pyVar;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            GeoPoint geoPoint;
            int i = this.a.r;
            if (i == -1 || (geoPoint = this.a.q) == null) {
                return;
            }
            sh.this.d.nativeLineInsertPoint(sh.this.e, i, geoPoint, this.a.p);
        }
    }

    private void k(py pyVar) {
        if (this.e == 0) {
            return;
        }
        a(new AnonymousClass113(pyVar));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$113  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass113 implements mn.a {
        final /* synthetic */ py a;

        AnonymousClass113(py pyVar) {
            this.a = pyVar;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            GeoPoint geoPoint;
            int i = this.a.r;
            if (i == -1 || (geoPoint = this.a.q) == null) {
                return;
            }
            sh.this.d.nativeLineClearPoint(sh.this.e, i, geoPoint, this.a.p);
        }
    }

    public final TappedElement a(final float f, final float f2) {
        return (TappedElement) a((CallbackRunnable<CallbackRunnable<TappedElement>>) new CallbackRunnable<TappedElement>() { // from class: com.tencent.mapsdk.internal.sh.114
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.tencent.map.tools.CallbackRunnable
            /* renamed from: a */
            public TappedElement run() {
                byte[] nativeOnTap;
                if (sh.this.e == 0 || (nativeOnTap = sh.this.d.nativeOnTap(sh.this.e, f, f2)) == null) {
                    return null;
                }
                try {
                    return TappedElement.fromBytes(nativeOnTap);
                } catch (Exception unused) {
                    return null;
                }
            }
        }, (CallbackRunnable<TappedElement>) null);
    }

    public final boolean m() {
        return ((Boolean) a((CallbackRunnable<CallbackRunnable<Boolean>>) new CallbackRunnable<Boolean>() { // from class: com.tencent.mapsdk.internal.sh.115
            private Boolean a() {
                if (sh.this.e != 0) {
                    return Boolean.valueOf(sh.this.d.nativeNeedRedraw(sh.this.e));
                }
                return Boolean.FALSE;
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ Boolean run() {
                if (sh.this.e != 0) {
                    return Boolean.valueOf(sh.this.d.nativeNeedRedraw(sh.this.e));
                }
                return Boolean.FALSE;
            }
        }, (CallbackRunnable<Boolean>) Boolean.FALSE)).booleanValue();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$116  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass116 implements mn.a {
        final /* synthetic */ boolean a;

        public AnonymousClass116(boolean z) {
            this.a = z;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (0 != sh.this.e) {
                sh.this.d.nativeSetBuilding3DEffect(sh.this.e, this.a);
            }
        }
    }

    private void l(boolean z) {
        a(new AnonymousClass116(z));
    }

    public final void a(final GeoPoint geoPoint, final float f, final float f2, final boolean z) {
        if (0 == this.e || this.j == null) {
            return;
        }
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.118
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e != 0) {
                    sh.this.d.nativeSetLocationInfo(sh.this.e, geoPoint.getLatitudeE6() / 1000000.0d, geoPoint.getLongitudeE6() / 1000000.0d, f, f2, z);
                }
            }
        });
    }

    private void a(boolean z, boolean z2, boolean z3, boolean z4) {
        if (0 == this.e || this.j == null) {
            return;
        }
        a(new AnonymousClass119(z, z2, z3, z4));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$119  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass119 implements mn.a {
        final /* synthetic */ boolean a;
        final /* synthetic */ boolean b;
        final /* synthetic */ boolean c;
        final /* synthetic */ boolean d;

        public AnonymousClass119(boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e != 0) {
                sh.this.d.nativeSetLocationFollow(sh.this.e, this.a, this.b, this.c, this.d);
            }
        }
    }

    public final void a(final float f) {
        if (0 == this.e || this.j == null) {
            return;
        }
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.120
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e != 0) {
                    sh.this.d.nativeSetLocationHeading(sh.this.e, f);
                }
            }
        });
    }

    @Override // com.tencent.mapsdk.internal.nz
    public final void b(String str, ld ldVar) {
        DataSource dataSource = DataSource.get(ldVar.b);
        kj.b(ki.b, "onRequestDownload DataSource:" + dataSource + " uri:" + str);
        if (dataSource == DataSource.TILE_OVERLAY) {
            MapTileID mapTileID = (MapTileID) ldVar.d;
            int tileTag = mapTileID.getTileTag();
            kj.b(ki.b, "onRequestDownload tileOverlayId:".concat(String.valueOf(tileTag)));
            qc a2 = this.j.H.a(tileTag);
            if (a2 != null) {
                kj.c(ki.b, "onRequestDownload found TileOverlay");
                lg d = a2.d();
                d.a(this.h);
                d.a(str, new qg(a2.p), ldVar.c);
                kn.e(ki.b, "req-count");
                kn.e(ki.b, "R/" + mapTileID.getX() + CommonConstant.Symbol.MINUS + mapTileID.getY() + CommonConstant.Symbol.MINUS + mapTileID.getZ());
                return;
            }
        }
        this.g.a(str, this.j.u.d());
    }

    @Override // com.tencent.mapsdk.internal.ny
    public final void a(String str, ld ldVar) {
        DataSource dataSource = DataSource.get(ldVar.b);
        kj.b(ki.b, "onCancelDownload DataSource:" + dataSource + " uri:" + str);
        if (dataSource == DataSource.TILE_OVERLAY) {
            MapTileID mapTileID = (MapTileID) ldVar.d;
            int tileTag = mapTileID.getTileTag();
            kj.b(ki.b, "onCancelDownload tileOverlayId:".concat(String.valueOf(tileTag)));
            qc a2 = this.j.H.a(tileTag);
            if (a2 != null) {
                kj.c(ki.b, "onCancelDownload found TileOverlay");
                a2.d().a(str);
                kn.e(ki.b, "cancel-count");
                kn.e(ki.b, "C/" + mapTileID.getX() + CommonConstant.Symbol.MINUS + mapTileID.getY() + CommonConstant.Symbol.MINUS + mapTileID.getZ());
                return;
            }
        }
        this.g.a(str);
    }

    private long I() {
        return this.e;
    }

    private void J() {
        if (0 == this.e) {
            return;
        }
        a(new AnonymousClass121());
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$121  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass121 implements mn.a {
        public AnonymousClass121() {
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e != 0) {
                sh.this.d.nativeHideCompass(sh.this.e);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$122  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass122 implements CallbackRunnable<Integer> {
        final /* synthetic */ om a;

        public AnonymousClass122(om omVar) {
            this.a = omVar;
        }

        private Integer a() {
            if (0 == sh.this.e) {
                return 0;
            }
            return Integer.valueOf(sh.this.d.nativeAddMarker(sh.this.e, this.a.g, this.a.i, this.a.j, this.a.m, this.a.n, this.a.u, this.a.v, this.a.t, this.a.a(), this.a.x, this.a.w, this.a.z, this.a.A, this.a.B, this.a.D, this.a.C));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ Integer run() {
            if (0 == sh.this.e) {
                return 0;
            }
            return Integer.valueOf(sh.this.d.nativeAddMarker(sh.this.e, this.a.g, this.a.i, this.a.j, this.a.m, this.a.n, this.a.u, this.a.v, this.a.t, this.a.a(), this.a.x, this.a.w, this.a.z, this.a.A, this.a.B, this.a.D, this.a.C));
        }
    }

    private int a(om omVar) {
        return ((Integer) a((CallbackRunnable<AnonymousClass122>) new AnonymousClass122(omVar), (AnonymousClass122) 0)).intValue();
    }

    private void b(om omVar) {
        if (0 == this.e) {
            return;
        }
        a(new AnonymousClass123(omVar));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$123  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass123 implements mn.a {
        final /* synthetic */ om a;

        public AnonymousClass123(om omVar) {
            this.a = omVar;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e != 0) {
                sh.this.d.nativeUpdateMarkerInfo(sh.this.e, this.a.f, this.a.g, this.a.i, this.a.j, this.a.m, this.a.n, this.a.u, this.a.v, this.a.t, this.a.a(), this.a.x, this.a.w, this.a.z, this.a.A, this.a.B, this.a.D, this.a.C);
            }
        }
    }

    public final void a(final int[] iArr, final int i) {
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.124
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (0 == sh.this.e) {
                    return;
                }
                sh.this.d.nativeDeleteIcons(sh.this.e, iArr, i);
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$125  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass125 implements mn.a {
        final /* synthetic */ int[] a;
        final /* synthetic */ int b;
        final /* synthetic */ boolean c;

        public AnonymousClass125(int[] iArr, int i, boolean z) {
            this.a = iArr;
            this.b = i;
            this.c = z;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (0 == sh.this.e) {
                return;
            }
            sh.this.d.nativeSetIconsHidden(sh.this.e, this.a, this.b, this.c);
        }
    }

    private void a(int[] iArr, int i, boolean z) {
        a(new AnonymousClass125(iArr, i, z));
    }

    public final void b(final boolean z) {
        if (0 == this.e) {
            return;
        }
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.126
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e != 0) {
                    sh.this.d.nativeSetCompassVisible(sh.this.e, z);
                }
            }
        });
    }

    public final void a(final int i, final int i2) {
        if (0 == this.e) {
            return;
        }
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.127
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e != 0) {
                    sh.this.d.nativeSetCompassPosition(sh.this.e, i, i2);
                }
            }
        });
    }

    private void f(String str) {
        if (0 == this.e) {
            return;
        }
        a(new AnonymousClass129(str));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$129  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass129 implements mn.a {
        final /* synthetic */ String a;

        public AnonymousClass129(String str) {
            this.a = str;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e != 0) {
                sh.this.d.nativeSetCompassImage(sh.this.e, this.a);
            }
        }
    }

    public final double a(final Rect rect, final Rect rect2) {
        return ((Double) a((CallbackRunnable<CallbackRunnable<Double>>) new CallbackRunnable<Double>() { // from class: com.tencent.mapsdk.internal.sh.130
            private Double a() {
                if (0 != sh.this.e) {
                    return Double.valueOf(sh.this.d.nativeGetTargetScale(sh.this.e, rect, rect2));
                }
                return Double.valueOf(1.0d);
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ Double run() {
                if (0 != sh.this.e) {
                    return Double.valueOf(sh.this.d.nativeGetTargetScale(sh.this.e, rect, rect2));
                }
                return Double.valueOf(1.0d);
            }
        }, (CallbackRunnable<Double>) Double.valueOf(1.0d))).doubleValue();
    }

    public final void a(final Rect rect, final Rect rect2, final boolean z) {
        if (0 == this.e || this.j == null) {
            return;
        }
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.131
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e != 0) {
                    sh.this.d.nativeZoomToSpan(sh.this.e, rect, rect2, z);
                }
            }
        });
    }

    public final void c(final boolean z) {
        if (this.e == 0 || this.j == null) {
            return;
        }
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.132
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e != 0) {
                    sh.this.d.nativeIndoorBuildingEnabled(sh.this.e, z);
                }
            }
        });
    }

    public final void d(final boolean z) {
        if (0 == this.e || this.j == null) {
            return;
        }
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.133
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e != 0) {
                    sh.this.d.nativeSetIndoorBuildingStyle(sh.this.e, z ? 1 : 0);
                }
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$134  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass134 implements mn.a {
        final /* synthetic */ int a;

        public AnonymousClass134(int i) {
            this.a = i;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.nativeSetIndoorConfigType(sh.this.e, this.a);
        }
    }

    private void j(int i) {
        a(new AnonymousClass134(i));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$135  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass135 implements mn.a {
        final /* synthetic */ int a;

        public AnonymousClass135(int i) {
            this.a = i;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (0 == sh.this.e || sh.this.j == null) {
                return;
            }
            sh.this.d.nativeSetIndoorFloor(sh.this.e, this.a);
        }
    }

    private void k(int i) {
        a(new AnonymousClass135(i));
    }

    private int K() {
        return ((Integer) a((CallbackRunnable<CallbackRunnable<Integer>>) new CallbackRunnable<Integer>() { // from class: com.tencent.mapsdk.internal.sh.136
            private Integer a() {
                if (0 != sh.this.e) {
                    return Integer.valueOf(sh.this.d.nativeGetIndoorCurrentFloorId(sh.this.e));
                }
                return -1;
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ Integer run() {
                if (0 != sh.this.e) {
                    return Integer.valueOf(sh.this.d.nativeGetIndoorCurrentFloorId(sh.this.e));
                }
                return -1;
            }
        }, (CallbackRunnable<Integer>) (-1))).intValue();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$137  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass137 implements CallbackRunnable<String[]> {
        public AnonymousClass137() {
        }

        private String[] a() {
            if (0 == sh.this.e) {
                return null;
            }
            return sh.this.d.nativeGetIndoorFloorNames(sh.this.e);
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ String[] run() {
            if (0 == sh.this.e) {
                return null;
            }
            return sh.this.d.nativeGetIndoorFloorNames(sh.this.e);
        }
    }

    private String[] M() {
        return (String[]) a(new AnonymousClass137(), (AnonymousClass137) null);
    }

    private pv b(GeoPoint geoPoint) {
        if (geoPoint == null) {
            geoPoint = new GeoPoint();
        }
        return (pv) a(new AnonymousClass138(geoPoint), (AnonymousClass138) null);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$138  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass138 implements CallbackRunnable<pv> {
        final /* synthetic */ GeoPoint a;

        public AnonymousClass138(GeoPoint geoPoint) {
            this.a = geoPoint;
        }

        private pv a() {
            if (0 == sh.this.e) {
                return null;
            }
            return new pv(sh.this.d.nativeGetActiveIndoorBuildingGUID(sh.this.e), sh.this.d.nativeGetCurIndoorName(sh.this.e, this.a), sh.this.d.nativeGetIndoorFloorNames(sh.this.e), sh.this.d.nativeGetIndoorCurrentFloorId(sh.this.e));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ pv run() {
            if (0 == sh.this.e) {
                return null;
            }
            return new pv(sh.this.d.nativeGetActiveIndoorBuildingGUID(sh.this.e), sh.this.d.nativeGetCurIndoorName(sh.this.e, this.a), sh.this.d.nativeGetIndoorFloorNames(sh.this.e), sh.this.d.nativeGetIndoorCurrentFloorId(sh.this.e));
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$140  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass140 implements CallbackRunnable<Rect> {
        public AnonymousClass140() {
        }

        private Rect a() {
            if (0 == sh.this.e) {
                return null;
            }
            return sh.this.d.nativeGetIndoorBound(sh.this.e);
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ Rect run() {
            if (0 == sh.this.e) {
                return null;
            }
            return sh.this.d.nativeGetIndoorBound(sh.this.e);
        }
    }

    private Rect N() {
        return (Rect) a(new AnonymousClass140(), (AnonymousClass140) null);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$141  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass141 implements CallbackRunnable<String> {
        public AnonymousClass141() {
        }

        private String a() {
            if (sh.this.e == 0) {
                return null;
            }
            return sh.this.d.nativeGetActiveIndoorBuildingGUID(sh.this.e);
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ String run() {
            if (sh.this.e == 0) {
                return null;
            }
            return sh.this.d.nativeGetActiveIndoorBuildingGUID(sh.this.e);
        }
    }

    private String O() {
        return (String) a(new AnonymousClass141(), (AnonymousClass141) null);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$142  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass142 implements CallbackRunnable<String> {
        final /* synthetic */ GeoPoint a;

        public AnonymousClass142(GeoPoint geoPoint) {
            this.a = geoPoint;
        }

        private String a() {
            if (0 == sh.this.e) {
                return null;
            }
            return sh.this.d.nativeGetCurIndoorName(sh.this.e, this.a);
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ String run() {
            if (0 == sh.this.e) {
                return null;
            }
            return sh.this.d.nativeGetCurIndoorName(sh.this.e, this.a);
        }
    }

    private String c(GeoPoint geoPoint) {
        return (String) a(new AnonymousClass142(geoPoint), (AnonymousClass142) null);
    }

    private void l(int i) {
        if (0 == this.e) {
            return;
        }
        a(new AnonymousClass143(i));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$143  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass143 implements mn.a {
        final /* synthetic */ int a;

        public AnonymousClass143(int i) {
            this.a = i;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e != 0) {
                sh.this.d.nativeSetIndoorMaskColor(sh.this.e, this.a);
            }
        }
    }

    private void a(float f, float f2, float f3, float f4) {
        if (0 == this.e) {
            return;
        }
        a(new AnonymousClass144(f, f2, f3, f4));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$144  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass144 implements mn.a {
        final /* synthetic */ float a;
        final /* synthetic */ float b;
        final /* synthetic */ float c;
        final /* synthetic */ float d;

        public AnonymousClass144(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e != 0) {
                sh.this.d.nativeSetIndoorActiveScreenArea(sh.this.e, this.a, this.b, this.c, this.d);
            }
        }
    }

    private void m(boolean z) {
        if (this.e == 0) {
            return;
        }
        a(new AnonymousClass145(z));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$145  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass145 implements mn.a {
        final /* synthetic */ boolean a;

        public AnonymousClass145(boolean z) {
            this.a = z;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e != 0) {
                sh.this.d.nativeSetIndoorBuildingPickEnabled(sh.this.e, this.a);
            }
        }
    }

    private void a(String[] strArr) {
        if (this.e == 0) {
            return;
        }
        a(new AnonymousClass146(strArr));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$146  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass146 implements mn.a {
        final /* synthetic */ String[] a;

        public AnonymousClass146(String[] strArr) {
            this.a = strArr;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e != 0) {
                sh.this.d.nativeSetShowIndoorBuildingWhiteList(sh.this.e, this.a);
            }
        }
    }

    public final int a(final String str, final float f, final float f2) {
        if (0 == this.e) {
            return 0;
        }
        return ((Integer) a((CallbackRunnable<CallbackRunnable<Integer>>) new CallbackRunnable<Integer>() { // from class: com.tencent.mapsdk.internal.sh.147
            private Integer a() {
                if (0 != sh.this.e) {
                    return Integer.valueOf(sh.this.d.nativeSetLocationMarkerImage(sh.this.e, str, f, f2));
                }
                return 0;
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ Integer run() {
                if (0 != sh.this.e) {
                    return Integer.valueOf(sh.this.d.nativeSetLocationMarkerImage(sh.this.e, str, f, f2));
                }
                return 0;
            }
        }, (CallbackRunnable<Integer>) 0)).intValue();
    }

    private void m(int i) {
        if (0 == this.e) {
            return;
        }
        a(new AnonymousClass148(i));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$148  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass148 implements mn.a {
        final /* synthetic */ int a;

        public AnonymousClass148(int i) {
            this.a = i;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e != 0) {
                sh.this.d.nativeSetLocationCircleColor(sh.this.e, this.a);
            }
        }
    }

    private void n(boolean z) {
        if (0 == this.e) {
            return;
        }
        a(new AnonymousClass149(z));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$149  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass149 implements mn.a {
        final /* synthetic */ boolean a;

        public AnonymousClass149(boolean z) {
            this.a = z;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e != 0) {
                sh.this.d.nativeSetLocationCircleHidden(sh.this.e, this.a);
            }
        }
    }

    public final void e(final boolean z) {
        if (0 == this.e) {
            return;
        }
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.151
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e != 0) {
                    sh.this.d.nativeSetLocationMarkerHidden(sh.this.e, z);
                }
            }
        });
    }

    private void g(String str) {
        if (0 == this.e) {
            return;
        }
        a(new AnonymousClass152(str));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$152  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass152 implements mn.a {
        final /* synthetic */ String a;

        public AnonymousClass152(String str) {
            this.a = str;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e != 0) {
                sh.this.d.nativeSetLocationCompassMarkerImage(sh.this.e, this.a);
            }
        }
    }

    public final void f(final boolean z) {
        if (0 == this.e) {
            return;
        }
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.153
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e != 0) {
                    sh.this.d.nativeSetLocationCompassMarkerHidden(sh.this.e, z);
                }
            }
        });
    }

    public final void b(final float f, final float f2) {
        if (0 == this.e || this.j == null) {
            return;
        }
        this.j.a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.154
            final /* synthetic */ boolean c = false;

            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e != 0) {
                    sh.this.d.nativeMoveBy(sh.this.e, f, f2, this.c);
                }
            }
        });
    }

    public final void a(final GeoPoint geoPoint, final boolean z) {
        if (0 == this.e || this.j == null) {
            return;
        }
        this.j.a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.155
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e != 0) {
                    sh.this.d.nativeSetCenter(sh.this.e, geoPoint, z);
                }
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$156  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass156 implements mn.a {
        final /* synthetic */ GeoPoint a;

        public AnonymousClass156(GeoPoint geoPoint) {
            this.a = geoPoint;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (0 == sh.this.e || sh.this.j == null) {
                return;
            }
            sh.this.d.nativeSetCenter(sh.this.e, this.a, false);
        }
    }

    private void d(GeoPoint geoPoint) {
        this.j.a(new AnonymousClass156(geoPoint));
    }

    public final void a(final GeoPoint geoPoint, final int i) {
        if (0 == this.e || this.j == null) {
            return;
        }
        this.j.a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.157
            final /* synthetic */ boolean c = true;

            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e != 0) {
                    sh.this.d.nativeSetCenterMapPointAndScaleLevel(sh.this.e, geoPoint, i, this.c);
                }
            }
        });
    }

    public final GeoPoint n() {
        return (GeoPoint) a((CallbackRunnable<CallbackRunnable<GeoPoint>>) new CallbackRunnable<GeoPoint>() { // from class: com.tencent.mapsdk.internal.sh.158
            private GeoPoint a() {
                if (0 == sh.this.e) {
                    return null;
                }
                GeoPoint geoPoint = new GeoPoint();
                sh.this.d.nativeGetCenterMapPoint(sh.this.e, geoPoint);
                return geoPoint;
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ GeoPoint run() {
                if (0 == sh.this.e) {
                    return null;
                }
                GeoPoint geoPoint = new GeoPoint();
                sh.this.d.nativeGetCenterMapPoint(sh.this.e, geoPoint);
                return geoPoint;
            }
        }, (CallbackRunnable<GeoPoint>) new GeoPoint());
    }

    private void a(double d) {
        if (0 == this.e || this.j == null) {
            return;
        }
        this.j.a(new AnonymousClass159(d));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$159  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass159 implements mn.a {
        final /* synthetic */ double a;
        final /* synthetic */ boolean b = false;

        public AnonymousClass159(double d) {
            this.a = d;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e != 0) {
                sh.this.d.nativeSetScale(sh.this.e, this.a, this.b);
            }
        }
    }

    private void b(int i, int i2, int i3) {
        if (0 == this.e || this.j == null) {
            return;
        }
        a(new AnonymousClass160(i, i2, i3));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$160  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass160 implements mn.a {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ int c;

        public AnonymousClass160(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e != 0) {
                sh.this.d.nativeSetMarkerScaleLevelRange(sh.this.e, this.a, this.b, this.c);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$162  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass162 implements mn.a {
        final /* synthetic */ double a;

        public AnonymousClass162(double d) {
            this.a = d;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (0 == sh.this.e || sh.this.j == null) {
                return;
            }
            sh.this.d.nativeSetScale(sh.this.e, this.a, false);
        }
    }

    private void b(double d) {
        a(new AnonymousClass162(d));
    }

    public final float o() {
        if (0 == this.e) {
            return 1.0f;
        }
        return (float) this.d.nativeGetScale(this.e);
    }

    private void n(int i) {
        if (0 == this.e || this.j == null) {
            return;
        }
        this.j.a(new AnonymousClass163(i));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$163  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass163 implements mn.a {
        final /* synthetic */ int a;
        final /* synthetic */ boolean b = true;

        public AnonymousClass163(int i) {
            this.a = i;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e != 0) {
                sh.this.d.nativeSetScaleLevel(sh.this.e, this.a, this.b);
            }
        }
    }

    public final int p() {
        if (0 == this.e) {
            return 20;
        }
        return this.d.nativeGetScaleLevel(this.e);
    }

    public final void c(final float f, final float f2) {
        if (0 == this.e || this.j == null) {
            return;
        }
        this.j.a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.164
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e != 0) {
                    sh.this.d.nativeZoomIn(sh.this.e, f, f2);
                }
            }
        });
    }

    private void P() {
        if (0 == this.e || this.j == null) {
            return;
        }
        this.j.a(new AnonymousClass165());
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$165  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass165 implements mn.a {
        public AnonymousClass165() {
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e != 0) {
                sh.this.d.nativeZoomOut(sh.this.e);
            }
        }
    }

    private void a(GeoPoint geoPoint, RectF rectF, int i, int i2, boolean z) {
        if (0 == this.e || this.j == null) {
            return;
        }
        this.j.a(new AnonymousClass166(rectF, geoPoint, i, i2, z));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$166  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass166 implements mn.a {
        final /* synthetic */ RectF a;
        final /* synthetic */ GeoPoint b;
        final /* synthetic */ int c;
        final /* synthetic */ int d;
        final /* synthetic */ boolean e;

        public AnonymousClass166(RectF rectF, GeoPoint geoPoint, int i, int i2, boolean z) {
            this.a = rectF;
            this.b = geoPoint;
            this.c = i;
            this.d = i2;
            this.e = z;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e != 0) {
                sh.this.d.nativeSetFlagOfZoomToSpanForLocation(sh.this.e, this.a.top, this.a.left, this.a.bottom, this.a.right);
                sh.this.d.nativeZoomToSpanForNavigation(sh.this.e, this.b, this.c, this.d, this.e);
            }
        }
    }

    public final void a(final float f, final float f2, final boolean z) {
        if (0 == this.e || this.j == null) {
            return;
        }
        e((CallbackRunnable<CallbackRunnable<Boolean>>) new CallbackRunnable<Boolean>() { // from class: com.tencent.mapsdk.internal.sh.167
            private Boolean a() {
                if (sh.this.e == 0) {
                    return Boolean.FALSE;
                }
                if (z) {
                    sh.this.d.nativeSetScreenCenterOffset(sh.this.e, f, f2, true);
                } else {
                    eq eqVar = sh.this.j.n;
                    fm a2 = eqVar.a(sh.this.n());
                    sh.this.d.nativeSetScreenCenterOffset(sh.this.e, f, f2, false);
                    fm a3 = eqVar.a(sh.this.n());
                    sh.this.d.nativeSetCenter(sh.this.e, eqVar.a(new fm(a3.a + (a3.a - a2.a), a3.b + (a3.b - a2.b))), false);
                }
                return Boolean.TRUE;
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ Boolean run() {
                if (sh.this.e == 0) {
                    return Boolean.FALSE;
                }
                if (z) {
                    sh.this.d.nativeSetScreenCenterOffset(sh.this.e, f, f2, true);
                } else {
                    eq eqVar = sh.this.j.n;
                    fm a2 = eqVar.a(sh.this.n());
                    sh.this.d.nativeSetScreenCenterOffset(sh.this.e, f, f2, false);
                    fm a3 = eqVar.a(sh.this.n());
                    sh.this.d.nativeSetCenter(sh.this.e, eqVar.a(new fm(a3.a + (a3.a - a2.a), a3.b + (a3.b - a2.b))), false);
                }
                return Boolean.TRUE;
            }
        }, (CallbackRunnable<Boolean>) Boolean.FALSE);
    }

    public final void a(final int i, final int i2, final int i3, final int i4) {
        if (0 == this.e || this.j == null) {
            return;
        }
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.168
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e != 0) {
                    sh.this.d.nativeSetViewport(sh.this.e, i, i2, i3, i4);
                }
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$169  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass169 implements mn.a {
        public AnonymousClass169() {
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (0 == sh.this.e) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (sh.this.w == 0) {
                sh.this.d.nativeUpdateFrame(sh.this.e, 0.0d);
            } else {
                sh.this.d.nativeUpdateFrame(sh.this.e, currentTimeMillis - sh.this.w);
            }
            sh.this.w = currentTimeMillis;
        }
    }

    private void Q() {
        a(new AnonymousClass169());
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$170  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass170 implements CallbackRunnable<Boolean> {
        public AnonymousClass170() {
        }

        private Boolean a() {
            if (0 != sh.this.e) {
                return Boolean.valueOf(sh.this.d.nativeNeedDispaly(sh.this.e));
            }
            return Boolean.FALSE;
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ Boolean run() {
            if (0 != sh.this.e) {
                return Boolean.valueOf(sh.this.d.nativeNeedDispaly(sh.this.e));
            }
            return Boolean.FALSE;
        }
    }

    private boolean R() {
        return ((Boolean) a((CallbackRunnable<AnonymousClass170>) new AnonymousClass170(), (AnonymousClass170) Boolean.FALSE)).booleanValue();
    }

    public final void g(final boolean z) {
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.171
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (0 == sh.this.e) {
                    return;
                }
                sh.this.d.nativeSetNeedDisplay(sh.this.e, z);
            }
        });
    }

    public final void a(final int i) {
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.3
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (0 == sh.this.e) {
                    return;
                }
                sh.this.d.nativeSetMaxScaleLevel(sh.this.e, i);
            }
        });
    }

    public final void b(final int i) {
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.4
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (0 == sh.this.e) {
                    return;
                }
                sh.this.d.nativeSetMinScaleLevel(sh.this.e, i);
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$5  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass5 implements mn.a {
        final /* synthetic */ float a;

        public AnonymousClass5(float f) {
            this.a = f;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (0 == sh.this.e) {
                return;
            }
            sh.this.d.nativeSetRotate(sh.this.e, this.a, false);
        }
    }

    private void b(float f) {
        a(new AnonymousClass5(f));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$6  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass6 implements mn.a {
        final /* synthetic */ float a;

        public AnonymousClass6(float f) {
            this.a = f;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (0 == sh.this.e) {
                return;
            }
            sh.this.d.nativeSetSkew(sh.this.e, this.a, false);
        }
    }

    private void c(float f) {
        a(new AnonymousClass6(f));
    }

    public final void c(int i) {
        if (0 == this.e) {
            return;
        }
        this.d.nativeSetMapStyle(this.e, i, false);
    }

    public final float q() {
        if (0 == this.e) {
            return 0.0f;
        }
        return this.d.nativeGetSkew(this.e);
    }

    public final float r() {
        if (0 == this.e) {
            return 0.0f;
        }
        return this.d.nativeGetRotate(this.e);
    }

    public final int s() {
        if (0 == this.e) {
            return 1;
        }
        return this.d.nativeGetMapStyle(this.e);
    }

    public final int a(final TileOverlayCallback tileOverlayCallback, final boolean z) {
        return ((Integer) a((CallbackRunnable<CallbackRunnable<Integer>>) new CallbackRunnable<Integer>() { // from class: com.tencent.mapsdk.internal.sh.7
            private Integer a() {
                if (sh.this.e != 0) {
                    return Integer.valueOf(sh.this.d.nativeAddTileOverlay(sh.this.e, tileOverlayCallback, z));
                }
                return -1;
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ Integer run() {
                if (sh.this.e != 0) {
                    return Integer.valueOf(sh.this.d.nativeAddTileOverlay(sh.this.e, tileOverlayCallback, z));
                }
                return -1;
            }
        }, (CallbackRunnable<Integer>) (-1))).intValue();
    }

    public final void b(final int i, final int i2) {
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.8
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e == 0) {
                    return;
                }
                sh.this.d.nativeSetTileOverlayPriority(sh.this.e, i, i2);
            }
        });
    }

    public final void a(final int i, final int i2, final int i3) {
        if (this.e == 0 || this.j == null) {
            return;
        }
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.9
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e != 0) {
                    sh.this.d.nativeSetTileOverlayDataLevelRange(sh.this.e, i, i2, i3);
                }
            }
        });
    }

    public final void d(final int i) {
        if (this.e == 0 || this.j == null) {
            return;
        }
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.10
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e != 0) {
                    sh.this.d.nativeRemoveTileOverlay(sh.this.e, i);
                }
            }
        });
    }

    public final void e(final int i) {
        if (this.e == 0 || this.j == null) {
            return;
        }
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.11
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e != 0) {
                    sh.this.d.nativeReloadTileOverlay(sh.this.e, i);
                }
            }
        });
    }

    public final boolean t() {
        return ((Boolean) a((CallbackRunnable<CallbackRunnable<Boolean>>) new CallbackRunnable<Boolean>() { // from class: com.tencent.mapsdk.internal.sh.12
            private Boolean a() {
                if (sh.this.e != 0) {
                    return Boolean.valueOf(sh.this.d.nativeIsTileOverlayEnabled(sh.this.e));
                }
                return Boolean.FALSE;
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ Boolean run() {
                if (sh.this.e != 0) {
                    return Boolean.valueOf(sh.this.d.nativeIsTileOverlayEnabled(sh.this.e));
                }
                return Boolean.FALSE;
            }
        }, (CallbackRunnable<Boolean>) Boolean.FALSE)).booleanValue();
    }

    public final void h(final boolean z) {
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.14
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e == 0) {
                    return;
                }
                sh.this.d.nativeSetTileOverlayEnabled(sh.this.e, z);
            }
        });
    }

    @Override // com.tencent.mapsdk.internal.oi
    public final void g() {
        if (this.j != null) {
            final v vVar = this.j.t;
            a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.15
                @Override // com.tencent.mapsdk.internal.mn.a
                public final void a(GL10 gl10) {
                    if (vVar != null) {
                        v vVar2 = vVar;
                        if (vVar2.o == null) {
                            return;
                        }
                        vVar2.m = vVar2.p.n();
                        int p2 = vVar2.p.p();
                        float o2 = vVar2.p.o();
                        if (p2 != vVar2.b.q) {
                            vVar2.o.i.c(fw.c);
                        } else if (o2 != vVar2.b.p) {
                            vVar2.o.i.c(fw.b);
                        }
                        if (vVar2.b != null) {
                            vVar2.b.a(p2, o2);
                        }
                        vVar2.a = vVar2.p.s();
                    }
                }
            });
        }
    }

    @Override // com.tencent.mapsdk.internal.od
    public final void c() {
        if (this.i != null) {
            this.i.c();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$16  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass16 implements mn.a {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ int c;
        final /* synthetic */ int d;

        public AnonymousClass16(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.nativeSetTrafficColor(sh.this.e, this.a, this.b, this.c, this.d);
        }
    }

    private void b(int i, int i2, int i3, int i4) {
        a(new AnonymousClass16(i2, i, i3, i4));
    }

    private void a(oe oeVar) {
        this.d.setMapCallbackGetGLContext(oeVar);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$17  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass17 implements mn.a {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        public AnonymousClass17(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.nativeBringElementAbove(sh.this.e, this.a, this.b);
        }
    }

    private void e(int i, int i2) {
        a(new AnonymousClass17(i, i2));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$18  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass18 implements mn.a {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        public AnonymousClass18(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.nativeBringElementBelow(sh.this.e, this.a, this.b);
        }
    }

    private void f(int i, int i2) {
        a(new AnonymousClass18(i, i2));
    }

    public final void a(final int i, final float f) {
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.19
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e == 0) {
                    return;
                }
                sh.this.d.nativeSetPriority(sh.this.e, i, f);
            }
        });
    }

    public final void a(final List<MapRouteSection> list, final List<GeoPoint> list2) {
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.20
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (0 == sh.this.e || list == null || list.isEmpty() || list2 == null || list2.isEmpty()) {
                    return;
                }
                int size = list.size();
                byte[][] bArr = new byte[size];
                for (int i = 0; i < size; i++) {
                    MapRouteSection mapRouteSection = (MapRouteSection) list.get(i);
                    if (mapRouteSection != null) {
                        bArr[i] = mapRouteSection.toBytes();
                    }
                }
                int size2 = list2.size();
                sh.this.d.nativeAddRouteNameSegments(sh.this.e, bArr, size, (GeoPoint[]) list2.toArray(new GeoPoint[size2]), size2);
            }
        });
    }

    public final void u() {
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.21
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (0 == sh.this.e) {
                    return;
                }
                sh.this.d.nativeClearRouteNameSegments(sh.this.e);
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$22  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass22 implements CallbackRunnable<AnnocationTextResult> {
        final /* synthetic */ AnnocationText a;

        public AnonymousClass22(AnnocationText annocationText) {
            this.a = annocationText;
        }

        private AnnocationTextResult a() {
            if (0 == sh.this.e) {
                return null;
            }
            return sh.this.d.nativeCreateAnnotationTextBitmap(sh.this.e, this.a);
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ AnnocationTextResult run() {
            if (0 == sh.this.e) {
                return null;
            }
            return sh.this.d.nativeCreateAnnotationTextBitmap(sh.this.e, this.a);
        }
    }

    private AnnocationTextResult a(AnnocationText annocationText) {
        return (AnnocationTextResult) a(new AnonymousClass22(annocationText), (AnonymousClass22) null);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$23  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass23 implements CallbackRunnable<List<Integer>> {
        final /* synthetic */ Rect a;
        final /* synthetic */ int b;

        public AnonymousClass23(Rect rect, int i) {
            this.a = rect;
            this.b = i;
        }

        private List<Integer> a() {
            if (0 == sh.this.e) {
                return null;
            }
            int[] iArr = new int[100];
            int nativeQueryCityCodeList = sh.this.d.nativeQueryCityCodeList(sh.this.e, this.a, this.b, iArr, 100);
            if (nativeQueryCityCodeList > 0) {
                ArrayList arrayList = new ArrayList(nativeQueryCityCodeList);
                for (int i = 0; i < nativeQueryCityCodeList; i++) {
                    arrayList.add(Integer.valueOf(iArr[i]));
                }
                return arrayList;
            }
            return null;
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ List<Integer> run() {
            if (0 != sh.this.e) {
                int[] iArr = new int[100];
                int nativeQueryCityCodeList = sh.this.d.nativeQueryCityCodeList(sh.this.e, this.a, this.b, iArr, 100);
                if (nativeQueryCityCodeList > 0) {
                    ArrayList arrayList = new ArrayList(nativeQueryCityCodeList);
                    for (int i = 0; i < nativeQueryCityCodeList; i++) {
                        arrayList.add(Integer.valueOf(iArr[i]));
                    }
                    return arrayList;
                }
                return null;
            }
            return null;
        }
    }

    private List<Integer> a(Rect rect, int i) {
        return (List) a(new AnonymousClass23(rect, i), (AnonymousClass23) null);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$25  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass25 implements mn.a {
        final /* synthetic */ String a;

        public AnonymousClass25(String str) {
            this.a = str;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.nativeMapLoadKMLFile(sh.this.e, this.a);
        }
    }

    private void h(String str) {
        a(new AnonymousClass25(str));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$26  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass26 implements mn.a {
        final /* synthetic */ int a;

        public AnonymousClass26(int i) {
            this.a = i;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.nativeSetLanguage(sh.this.e, this.a);
        }
    }

    private void o(int i) {
        a(new AnonymousClass26(i));
    }

    public final int v() {
        return ((Integer) a((CallbackRunnable<CallbackRunnable<Integer>>) new CallbackRunnable<Integer>() { // from class: com.tencent.mapsdk.internal.sh.27
            private Integer a() {
                if (sh.this.e != 0) {
                    return Integer.valueOf(sh.this.d.nativeGetLanguage(sh.this.e));
                }
                return 0;
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ Integer run() {
                if (sh.this.e != 0) {
                    return Integer.valueOf(sh.this.d.nativeGetLanguage(sh.this.e));
                }
                return 0;
            }
        }, (CallbackRunnable<Integer>) 0)).intValue();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$28  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass28 implements mn.a {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        public AnonymousClass28(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.nativeResetEnginePath(sh.this.e, this.a, this.b, this.c);
        }
    }

    private void a(String str, String str2, String str3) {
        a(new AnonymousClass28(str, str2, str3));
    }

    public final void i(final boolean z) {
        if (this.e == 0) {
            return;
        }
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.29
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e != 0) {
                    sh.this.d.nativeSwitchEngineForeGround(sh.this.e, z);
                }
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$30  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass30 implements mn.a {
        final /* synthetic */ py a;

        AnonymousClass30(py pyVar) {
            this.a = pyVar;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            int i;
            if (sh.this.e == 0 || (i = this.a.r) == -1 || this.a.a.I < 0.0f) {
                return;
            }
            int i2 = this.a.a.C;
            if (i2 == 3 || i2 == 0) {
                sh.this.d.nativeSetLineArrowSpacing(sh.this.e, i, this.a.a.I);
            } else {
                sh.this.d.nativeSetLineFootPrintSpacing(sh.this.e, i, this.a.a.I);
            }
        }
    }

    private void l(py pyVar) {
        a(new AnonymousClass30(pyVar));
    }

    private void i(String str) {
        if (this.e == 0) {
            return;
        }
        a(new AnonymousClass31(str));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$31  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass31 implements mn.a {
        final /* synthetic */ String a;

        public AnonymousClass31(String str) {
            this.a = str;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e != 0) {
                sh.this.d.nativeSetServerHost(sh.this.e, this.a);
            }
        }
    }

    private void j(String str) {
        if (this.e == 0) {
            return;
        }
        a(new AnonymousClass32(str));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$32  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass32 implements mn.a {
        final /* synthetic */ String a;

        public AnonymousClass32(String str) {
            this.a = str;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e != 0) {
                sh.this.d.nativeMapSetSatelliteServerFullUrl(sh.this.e, this.a);
            }
        }
    }

    public final void j(final boolean z) {
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.33
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e == 0) {
                    return;
                }
                sh.this.d.nativeEnablePOI(sh.this.e, z);
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$34  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass34 implements mn.a {
        final /* synthetic */ boolean a;

        public AnonymousClass34(boolean z) {
            this.a = z;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.nativeEnableBaseMap(sh.this.e, this.a);
        }
    }

    private void o(boolean z) {
        a(new AnonymousClass34(z));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$36  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass36 implements mn.a {
        final /* synthetic */ boolean a;

        public AnonymousClass36(boolean z) {
            this.a = z;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.nativeEnableBuilding(sh.this.e, this.a);
        }
    }

    private void p(boolean z) {
        a(new AnonymousClass36(z));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$37  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass37 implements CallbackRunnable<String> {
        public AnonymousClass37() {
        }

        private String a() {
            return sh.this.e == 0 ? "" : sh.this.d.nativeGetMapEngineVersion(sh.this.e);
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ String run() {
            return sh.this.e == 0 ? "" : sh.this.d.nativeGetMapEngineVersion(sh.this.e);
        }
    }

    private String S() {
        return (String) a((CallbackRunnable<AnonymousClass37>) new AnonymousClass37(), (AnonymousClass37) "");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$38  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass38 implements CallbackRunnable<String> {
        public AnonymousClass38() {
        }

        private String a() {
            return sh.this.e == 0 ? "" : sh.this.d.nativeGetDataEngineVersion(sh.this.e);
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ String run() {
            return sh.this.e == 0 ? "" : sh.this.d.nativeGetDataEngineVersion(sh.this.e);
        }
    }

    private String T() {
        return (String) a((CallbackRunnable<AnonymousClass38>) new AnonymousClass38(), (AnonymousClass38) "");
    }

    public final void a(final String str, final String str2) {
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.39
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e == 0) {
                    return;
                }
                sh.this.d.nativeSetBuildingToSpecificFloor(sh.this.e, str, str2);
                if (sh.this.i != null) {
                    sh.this.i.c();
                }
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$40  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass40 implements CallbackRunnable<Integer> {
        final /* synthetic */ String a;

        public AnonymousClass40(String str) {
            this.a = str;
        }

        private Integer a() {
            if (sh.this.e != 0) {
                return Integer.valueOf(sh.this.d.getIndoorOutlineZoom(sh.this.e, this.a));
            }
            return -1;
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ Integer run() {
            if (sh.this.e != 0) {
                return Integer.valueOf(sh.this.d.getIndoorOutlineZoom(sh.this.e, this.a));
            }
            return -1;
        }
    }

    private int k(String str) {
        return ((Integer) a((CallbackRunnable<AnonymousClass40>) new AnonymousClass40(str), (AnonymousClass40) (-1))).intValue();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$41  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass41 implements CallbackRunnable<String> {
        public AnonymousClass41() {
        }

        private String a() {
            if (sh.this.e == 0) {
                return null;
            }
            return sh.this.d.getMapEngineRenderStatus(sh.this.e);
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ String run() {
            if (sh.this.e == 0) {
                return null;
            }
            return sh.this.d.getMapEngineRenderStatus(sh.this.e);
        }
    }

    private String U() {
        return (String) a(new AnonymousClass41(), (AnonymousClass41) null);
    }

    public final ArrayList<MapPoi> w() {
        return (ArrayList) a((CallbackRunnable<CallbackRunnable<ArrayList<MapPoi>>>) new CallbackRunnable<ArrayList<MapPoi>>() { // from class: com.tencent.mapsdk.internal.sh.42
            private ArrayList<MapPoi> a() {
                if (sh.this.e == 0) {
                    return null;
                }
                return sh.this.d.nativeGetPoisInScreen(sh.this.e);
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ ArrayList<MapPoi> run() {
                if (sh.this.e == 0) {
                    return null;
                }
                return sh.this.d.nativeGetPoisInScreen(sh.this.e);
            }
        }, (CallbackRunnable<ArrayList<MapPoi>>) null);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$43  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass43 implements CallbackRunnable<Boolean> {
        final /* synthetic */ int a;

        public AnonymousClass43(int i) {
            this.a = i;
        }

        private Boolean a() {
            if (sh.this.e != 0) {
                return Boolean.valueOf(sh.this.d.checkMapLoadFinishedTask(sh.this.e, this.a));
            }
            return Boolean.FALSE;
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ Boolean run() {
            if (sh.this.e != 0) {
                return Boolean.valueOf(sh.this.d.checkMapLoadFinishedTask(sh.this.e, this.a));
            }
            return Boolean.FALSE;
        }
    }

    private boolean p(int i) {
        return ((Boolean) a((CallbackRunnable<AnonymousClass43>) new AnonymousClass43(i), (AnonymousClass43) Boolean.FALSE)).booleanValue();
    }

    public final void a(final double[] dArr, final double[] dArr2, final int i) {
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.44
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e == 0) {
                    return;
                }
                sh.this.d.setRestrictBounds(sh.this.e, dArr, dArr2, i);
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$45  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass45 implements CallbackRunnable<Integer> {
        final /* synthetic */ GeoPoint[] a;
        final /* synthetic */ PolylineOptions.Text b;

        public AnonymousClass45(GeoPoint[] geoPointArr, PolylineOptions.Text text) {
            this.a = geoPointArr;
            this.b = text;
        }

        private Integer a() {
            if (sh.this.e != 0) {
                return Integer.valueOf(sh.this.d.addLineText(sh.this.e, this.a, this.b));
            }
            return -1;
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ Integer run() {
            if (sh.this.e != 0) {
                return Integer.valueOf(sh.this.d.addLineText(sh.this.e, this.a, this.b));
            }
            return -1;
        }
    }

    private int a(GeoPoint[] geoPointArr, PolylineOptions.Text text) {
        return ((Integer) a((CallbackRunnable<AnonymousClass45>) new AnonymousClass45(geoPointArr, text), (AnonymousClass45) (-1))).intValue();
    }

    public final void f(final int i) {
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.47
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e == 0) {
                    return;
                }
                sh.this.d.removeLineText(sh.this.e, i);
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$48  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass48 implements mn.a {
        final /* synthetic */ int a;
        final /* synthetic */ PolylineOptions.Text b;

        public AnonymousClass48(int i, PolylineOptions.Text text) {
            this.a = i;
            this.b = text;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.setLineTextStyle(sh.this.e, this.a, this.b);
        }
    }

    private void a(int i, PolylineOptions.Text text) {
        a(new AnonymousClass48(i, text));
    }

    @Override // com.tencent.mapsdk.internal.bq
    public final String b() {
        return (String) a((CallbackRunnable<CallbackRunnable<String>>) new CallbackRunnable<String>() { // from class: com.tencent.mapsdk.internal.sh.49
            private String a() {
                return sh.this.e == 0 ? "" : sh.this.d.nativeGetEngineLogInfo(sh.this.e);
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ String run() {
                return sh.this.e == 0 ? "" : sh.this.d.nativeGetEngineLogInfo(sh.this.e);
            }
        }, (CallbackRunnable<String>) "");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$50  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass50 implements CallbackRunnable<Long> {
        final /* synthetic */ MarkerInfo a;

        public AnonymousClass50(MarkerInfo markerInfo) {
            this.a = markerInfo;
        }

        private Long a() {
            if (sh.this.e != 0) {
                return Long.valueOf(sh.this.d.nativeAddMarker2(sh.this.e, this.a));
            }
            return 0L;
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ Long run() {
            if (sh.this.e != 0) {
                return Long.valueOf(sh.this.d.nativeAddMarker2(sh.this.e, this.a));
            }
            return 0L;
        }
    }

    private long a(MarkerInfo markerInfo) {
        return ((Long) a((CallbackRunnable<AnonymousClass50>) new AnonymousClass50(markerInfo), (AnonymousClass50) 0L)).longValue();
    }

    public final int a(final long j) {
        return ((Integer) a((CallbackRunnable<CallbackRunnable<Integer>>) new CallbackRunnable<Integer>() { // from class: com.tencent.mapsdk.internal.sh.51
            private Integer a() {
                if (sh.this.e != 0) {
                    return Integer.valueOf(sh.this.d.nativeGetEngineId(j));
                }
                return 0;
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ Integer run() {
                if (sh.this.e != 0) {
                    return Integer.valueOf(sh.this.d.nativeGetEngineId(j));
                }
                return 0;
            }
        }, (CallbackRunnable<Integer>) 0)).intValue();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$52  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass52 implements mn.a {
        final /* synthetic */ long a;
        final /* synthetic */ MarkerInfo b;

        public AnonymousClass52(long j, MarkerInfo markerInfo) {
            this.a = j;
            this.b = markerInfo;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.nativeUpdateMarker(this.a, this.b);
        }
    }

    private void a(long j, MarkerInfo markerInfo) {
        a(new AnonymousClass52(j, markerInfo));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$53  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass53 implements mn.a {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        public AnonymousClass53(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.nativeSetMarkerMainSubRelation(sh.this.e, this.a, this.b);
        }
    }

    private void g(int i, int i2) {
        a(new AnonymousClass53(i, i2));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$54  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass54 implements mn.a {
        final /* synthetic */ int a;

        public AnonymousClass54(int i) {
            this.a = i;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.nativeSetMapFontSize(sh.this.e, this.a);
        }
    }

    private void q(int i) {
        a(new AnonymousClass54(i));
    }

    public final void b(final long j) {
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.55
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e == 0) {
                    return;
                }
                sh.this.d.nativeRemoveEngineOverlay(j);
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$56  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass56 implements CallbackRunnable<Long> {
        final /* synthetic */ AggregationOverlayInfo a;

        public AnonymousClass56(AggregationOverlayInfo aggregationOverlayInfo) {
            this.a = aggregationOverlayInfo;
        }

        private Long a() {
            if (sh.this.e != 0) {
                return Long.valueOf(sh.this.d.nativeAddAggregatioinOverlay(sh.this.e, this.a));
            }
            return 0L;
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ Long run() {
            if (sh.this.e != 0) {
                return Long.valueOf(sh.this.d.nativeAddAggregatioinOverlay(sh.this.e, this.a));
            }
            return 0L;
        }
    }

    private long a(AggregationOverlayInfo aggregationOverlayInfo) {
        return ((Long) a((CallbackRunnable<AnonymousClass56>) new AnonymousClass56(aggregationOverlayInfo), (AnonymousClass56) 0L)).longValue();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$58  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass58 implements mn.a {
        final /* synthetic */ long a;
        final /* synthetic */ AggregationOverlayInfo b;

        public AnonymousClass58(long j, AggregationOverlayInfo aggregationOverlayInfo) {
            this.a = j;
            this.b = aggregationOverlayInfo;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.nativeUpdateAggregatioinOverlay(sh.this.e, this.a, this.b);
        }
    }

    private void a(long j, AggregationOverlayInfo aggregationOverlayInfo) {
        a(new AnonymousClass58(j, aggregationOverlayInfo));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$59  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass59 implements CallbackRunnable<Long> {
        final /* synthetic */ HeatmapInfo a;

        public AnonymousClass59(HeatmapInfo heatmapInfo) {
            this.a = heatmapInfo;
        }

        private Long a() {
            if (sh.this.e != 0) {
                return Long.valueOf(sh.this.d.nativeAddHeatmapOverlay(sh.this.e, this.a));
            }
            return 0L;
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ Long run() {
            if (sh.this.e != 0) {
                return Long.valueOf(sh.this.d.nativeAddHeatmapOverlay(sh.this.e, this.a));
            }
            return 0L;
        }
    }

    private long a(HeatmapInfo heatmapInfo) {
        return ((Long) a((CallbackRunnable<AnonymousClass59>) new AnonymousClass59(heatmapInfo), (AnonymousClass59) 0L)).longValue();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$60  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass60 implements mn.a {
        final /* synthetic */ long a;
        final /* synthetic */ HeatmapInfo b;

        public AnonymousClass60(long j, HeatmapInfo heatmapInfo) {
            this.a = j;
            this.b = heatmapInfo;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.nativeUpdateHeatmapOverlay(sh.this.e, this.a, this.b);
        }
    }

    private void a(long j, HeatmapInfo heatmapInfo) {
        a(new AnonymousClass60(j, heatmapInfo));
    }

    public final void c(final long j) {
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.61
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e == 0) {
                    return;
                }
                sh.this.d.nativeRemoveGLVisualizationOverlay(sh.this.e, j);
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$62  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass62 implements CallbackRunnable<VectorHeatAggregationUnit> {
        final /* synthetic */ long a;
        final /* synthetic */ LatLng b;

        public AnonymousClass62(long j, LatLng latLng) {
            this.a = j;
            this.b = latLng;
        }

        private VectorHeatAggregationUnit a() {
            if (sh.this.e == 0) {
                return null;
            }
            return sh.this.d.getAggregationUnit(sh.this.e, this.a, this.b);
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ VectorHeatAggregationUnit run() {
            if (sh.this.e == 0) {
                return null;
            }
            return sh.this.d.getAggregationUnit(sh.this.e, this.a, this.b);
        }
    }

    private VectorHeatAggregationUnit a(long j, LatLng latLng) {
        return (VectorHeatAggregationUnit) a(new AnonymousClass62(j, latLng), (AnonymousClass62) null);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$63  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass63 implements CallbackRunnable<Long> {
        final /* synthetic */ ArcLineOverlayInfo a;

        public AnonymousClass63(ArcLineOverlayInfo arcLineOverlayInfo) {
            this.a = arcLineOverlayInfo;
        }

        private Long a() {
            if (sh.this.e != 0) {
                return Long.valueOf(sh.this.d.nativeAddArcLineOverlay(sh.this.e, this.a));
            }
            return 0L;
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ Long run() {
            if (sh.this.e != 0) {
                return Long.valueOf(sh.this.d.nativeAddArcLineOverlay(sh.this.e, this.a));
            }
            return 0L;
        }
    }

    private long a(ArcLineOverlayInfo arcLineOverlayInfo) {
        return ((Long) a((CallbackRunnable<AnonymousClass63>) new AnonymousClass63(arcLineOverlayInfo), (AnonymousClass63) 0L)).longValue();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$64  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass64 implements mn.a {
        final /* synthetic */ long a;
        final /* synthetic */ ArcLineOverlayInfo b;

        public AnonymousClass64(long j, ArcLineOverlayInfo arcLineOverlayInfo) {
            this.a = j;
            this.b = arcLineOverlayInfo;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.nativeUpdateArcLineOverlay(sh.this.e, this.a, this.b);
        }
    }

    private void a(long j, ArcLineOverlayInfo arcLineOverlayInfo) {
        a(new AnonymousClass64(j, arcLineOverlayInfo));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$65  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass65 implements CallbackRunnable<Long> {
        final /* synthetic */ ScatterPlotInfo a;

        public AnonymousClass65(ScatterPlotInfo scatterPlotInfo) {
            this.a = scatterPlotInfo;
        }

        private Long a() {
            if (sh.this.e != 0) {
                return Long.valueOf(sh.this.d.nativeAddScatterOverlay(sh.this.e, this.a));
            }
            return 0L;
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ Long run() {
            if (sh.this.e != 0) {
                return Long.valueOf(sh.this.d.nativeAddScatterOverlay(sh.this.e, this.a));
            }
            return 0L;
        }
    }

    private long a(ScatterPlotInfo scatterPlotInfo) {
        return ((Long) a((CallbackRunnable<AnonymousClass65>) new AnonymousClass65(scatterPlotInfo), (AnonymousClass65) 0L)).longValue();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$66  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass66 implements mn.a {
        final /* synthetic */ long a;
        final /* synthetic */ ScatterPlotInfo b;

        public AnonymousClass66(long j, ScatterPlotInfo scatterPlotInfo) {
            this.a = j;
            this.b = scatterPlotInfo;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.nativeUpdateScatterPlotOverlay(sh.this.e, this.a, this.b);
        }
    }

    private void a(long j, ScatterPlotInfo scatterPlotInfo) {
        a(new AnonymousClass66(j, scatterPlotInfo));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$67  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass67 implements CallbackRunnable<Long> {
        final /* synthetic */ TrailOverlayInfo a;

        public AnonymousClass67(TrailOverlayInfo trailOverlayInfo) {
            this.a = trailOverlayInfo;
        }

        private Long a() {
            if (sh.this.e != 0) {
                return Long.valueOf(sh.this.d.nativeAddTrailOverlay(sh.this.e, this.a));
            }
            return 0L;
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ Long run() {
            if (sh.this.e != 0) {
                return Long.valueOf(sh.this.d.nativeAddTrailOverlay(sh.this.e, this.a));
            }
            return 0L;
        }
    }

    private long a(TrailOverlayInfo trailOverlayInfo) {
        return ((Long) a((CallbackRunnable<AnonymousClass67>) new AnonymousClass67(trailOverlayInfo), (AnonymousClass67) 0L)).longValue();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$69  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass69 implements mn.a {
        final /* synthetic */ long a;
        final /* synthetic */ TrailOverlayInfo b;

        public AnonymousClass69(long j, TrailOverlayInfo trailOverlayInfo) {
            this.a = j;
            this.b = trailOverlayInfo;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.nativeUpdateTrailOverlay(sh.this.e, this.a, this.b);
        }
    }

    private void a(long j, TrailOverlayInfo trailOverlayInfo) {
        a(new AnonymousClass69(j, trailOverlayInfo));
    }

    public final boolean x() {
        return ((Boolean) a((CallbackRunnable<CallbackRunnable<Boolean>>) new CallbackRunnable<Boolean>() { // from class: com.tencent.mapsdk.internal.sh.70
            private Boolean a() {
                if (sh.this.e != 0) {
                    return Boolean.valueOf(sh.this.d.nativeGetAndResetDirty(sh.this.e));
                }
                return Boolean.FALSE;
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ Boolean run() {
                if (sh.this.e != 0) {
                    return Boolean.valueOf(sh.this.d.nativeGetAndResetDirty(sh.this.e));
                }
                return Boolean.FALSE;
            }
        }, (CallbackRunnable<Boolean>) Boolean.FALSE)).booleanValue();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$71  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass71 implements CallbackRunnable<Long> {
        final /* synthetic */ GroundOverlayInfo a;

        public AnonymousClass71(GroundOverlayInfo groundOverlayInfo) {
            this.a = groundOverlayInfo;
        }

        private Long a() {
            if (sh.this.e != 0 && this.a != null && this.a.checkValid()) {
                return Long.valueOf(sh.this.d.nativeAddGroundOverlay(sh.this.e, this.a));
            }
            return 0L;
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ Long run() {
            if (sh.this.e != 0 && this.a != null && this.a.checkValid()) {
                return Long.valueOf(sh.this.d.nativeAddGroundOverlay(sh.this.e, this.a));
            }
            return 0L;
        }
    }

    private long a(GroundOverlayInfo groundOverlayInfo) {
        return ((Long) a((CallbackRunnable<AnonymousClass71>) new AnonymousClass71(groundOverlayInfo), (AnonymousClass71) 0L)).longValue();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$72  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass72 implements mn.a {
        final /* synthetic */ long a;
        final /* synthetic */ GroundOverlayInfo b;

        public AnonymousClass72(long j, GroundOverlayInfo groundOverlayInfo) {
            this.a = j;
            this.b = groundOverlayInfo;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0 || this.a == 0) {
                return;
            }
            sh.this.d.nativeUpdateGroundOverlay(sh.this.e, this.a, this.b);
        }
    }

    private void a(long j, GroundOverlayInfo groundOverlayInfo) {
        a(new AnonymousClass72(j, groundOverlayInfo));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$73  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass73 implements CallbackRunnable<Long> {
        final /* synthetic */ IntersectionOverlayInfo a;

        public AnonymousClass73(IntersectionOverlayInfo intersectionOverlayInfo) {
            this.a = intersectionOverlayInfo;
        }

        private Long a() {
            if (sh.this.e != 0) {
                return Long.valueOf(sh.this.d.nativeAddIntersectionOverlay(sh.this.e, this.a));
            }
            return 0L;
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ Long run() {
            if (sh.this.e != 0) {
                return Long.valueOf(sh.this.d.nativeAddIntersectionOverlay(sh.this.e, this.a));
            }
            return 0L;
        }
    }

    private long a(IntersectionOverlayInfo intersectionOverlayInfo) {
        return ((Long) a((CallbackRunnable<AnonymousClass73>) new AnonymousClass73(intersectionOverlayInfo), (AnonymousClass73) 0L)).longValue();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$74  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass74 implements mn.a {
        final /* synthetic */ long a;
        final /* synthetic */ IntersectionOverlayInfo b;

        public AnonymousClass74(long j, IntersectionOverlayInfo intersectionOverlayInfo) {
            this.a = j;
            this.b = intersectionOverlayInfo;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0 || this.a == 0) {
                return;
            }
            sh.this.d.nativeUpdateIntersectionOverlay(this.a, this.b);
        }
    }

    private void a(long j, IntersectionOverlayInfo intersectionOverlayInfo) {
        a(new AnonymousClass74(j, intersectionOverlayInfo));
    }

    public final void a(final TrafficStyle trafficStyle) {
        a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.75
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (sh.this.e == 0) {
                    return;
                }
                sh.this.d.setTrafficStyle(sh.this.e, trafficStyle);
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$76  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass76 implements mn.a {
        final /* synthetic */ List a;

        public AnonymousClass76(List list) {
            this.a = list;
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.nativeSetIndoorCellInfo(sh.this.e, this.a);
        }
    }

    private void a(List<IndoorCellInfo> list) {
        a(new AnonymousClass76(list));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sh$77  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass77 implements mn.a {
        public AnonymousClass77() {
        }

        @Override // com.tencent.mapsdk.internal.mn.a
        public final void a(GL10 gl10) {
            if (sh.this.e == 0) {
                return;
            }
            sh.this.d.nativeResetIndoorCellInfo(sh.this.e);
        }
    }

    private void V() {
        a(new AnonymousClass77());
    }

    @Override // com.tencent.mapsdk.internal.bq
    public final void a(String str) {
        this.z = str;
    }

    @Override // com.tencent.mapsdk.internal.bq
    public final String a() {
        String str = this.z;
        this.z = null;
        return str;
    }

    @Override // com.tencent.mapsdk.internal.oh
    public final void m_() {
        if (this.j != null) {
            mn mnVar = this.j;
            if (mnVar.G != null) {
                mnVar.G.m_();
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.of
    public final void h() {
        if (this.j != null) {
            mn mnVar = this.j;
            if (mnVar.I == null || mnVar.I.isEmpty()) {
                return;
            }
            for (of ofVar : mnVar.I) {
                ofVar.h();
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.of
    public final void i() {
        if (this.j != null) {
            mn mnVar = this.j;
            if (mnVar.I == null || mnVar.I.isEmpty()) {
                return;
            }
            for (of ofVar : mnVar.I) {
                ofVar.i();
            }
        }
    }

    private float[] Y() {
        return this.d.nativeGLProjectMatrix();
    }

    private static void a(double[] dArr, double d, double d2) {
        for (int i = 0; i < 4; i++) {
            int i2 = i + 0;
            int i3 = i2 + 12;
            dArr[i3] = dArr[i3] + (dArr[i2] * d) + (dArr[i2 + 4] * d2) + (dArr[i2 + 8] * 0.0d);
        }
    }

    public final float[] y() {
        double[] nativeGLViewMatrix = this.d.nativeGLViewMatrix();
        if (nativeGLViewMatrix == null || nativeGLViewMatrix.length == 0) {
            return null;
        }
        PointF a2 = this.j.n.a(kb.a(this.j.g.n()));
        a(nativeGLViewMatrix, a2.x, -a2.y);
        float[] fArr = new float[nativeGLViewMatrix.length];
        for (int i = 0; i < nativeGLViewMatrix.length; i++) {
            fArr[i] = new BigDecimal(nativeGLViewMatrix[i]).floatValue();
        }
        return fArr;
    }

    private int[] Z() {
        return this.d.nativeGLViewport();
    }

    private float aa() {
        return this.d.nativeGLViewScaleRatio();
    }

    public final Context z() {
        if (this.j == null) {
            return null;
        }
        return this.j.getContext();
    }

    public final void a(final mn.a aVar) {
        if (this.j == null || this.e == 0) {
            return;
        }
        c((CallbackRunnable<CallbackRunnable<Object>>) new CallbackRunnable<Object>() { // from class: com.tencent.mapsdk.internal.sh.78
            @Override // com.tencent.map.tools.CallbackRunnable
            public final Object run() {
                aVar.a(null);
                return null;
            }
        }, (CallbackRunnable<Object>) null);
    }

    public final void b(final mn.a aVar) {
        if (this.j == null || this.e == 0) {
            return;
        }
        a((CallbackRunnable<CallbackRunnable<Object>>) new CallbackRunnable<Object>() { // from class: com.tencent.mapsdk.internal.sh.80
            @Override // com.tencent.map.tools.CallbackRunnable
            public final Object run() {
                aVar.a(null);
                return null;
            }
        }, (CallbackRunnable<Object>) null);
    }

    private <T> T c(CallbackRunnable<T> callbackRunnable, T t2) {
        if (this.j != null) {
            if (this.e != 0) {
                try {
                    if (this.j != null && this.e != 0) {
                        if (Thread.currentThread().getName().contains(sx.a)) {
                            return (T) b((CallbackRunnable<CallbackRunnable<T>>) callbackRunnable, (CallbackRunnable<T>) t2);
                        }
                        return (T) e((CallbackRunnable<CallbackRunnable<T>>) callbackRunnable, (CallbackRunnable<T>) t2);
                    }
                    return t2;
                } catch (Exception e) {
                    kj.a(ki.f, "safeCallEngine", e);
                    return t2;
                }
            }
        }
        return t2;
    }

    public final <T> T a(CallbackRunnable<T> callbackRunnable, T t2) {
        if (this.j != null) {
            if (this.e != 0) {
                try {
                    return (T) b((CallbackRunnable<CallbackRunnable<T>>) callbackRunnable, (CallbackRunnable<T>) t2);
                } catch (Exception e) {
                    kj.a(ki.f, "safeCallSyncEngine", e);
                    return t2;
                }
            }
        }
        return t2;
    }

    private <T> T d(CallbackRunnable<T> callbackRunnable, T t2) {
        if (callbackRunnable == null || this.j == null || this.e == 0) {
            return t2;
        }
        if (Thread.currentThread().getName().contains(sx.a)) {
            return (T) b((CallbackRunnable<CallbackRunnable<T>>) callbackRunnable, (CallbackRunnable<T>) t2);
        }
        return (T) e((CallbackRunnable<CallbackRunnable<T>>) callbackRunnable, (CallbackRunnable<T>) t2);
    }

    public final <T> T b(CallbackRunnable<T> callbackRunnable, T t2) {
        return (callbackRunnable == null || this.j == null || this.e == 0) ? t2 : callbackRunnable.run();
    }

    private <T> T e(final CallbackRunnable<T> callbackRunnable, T t2) {
        if (callbackRunnable == null || this.j == null || this.e == 0) {
            return t2;
        }
        this.j.a(new mn.a() { // from class: com.tencent.mapsdk.internal.sh.81
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                callbackRunnable.run();
            }
        });
        return t2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int c(com.tencent.mapsdk.internal.py r12) {
        /*
            r11 = this;
            com.tencent.mapsdk.internal.fq r0 = r12.a
            int r0 = r0.C
            r1 = 1
            r2 = 0
            r3 = 3
            if (r0 != r3) goto Lc
            r0 = 0
            r7 = 1
            goto Ld
        Lc:
            r7 = 0
        Ld:
            int[] r3 = r12.o
            r4 = r3[r2]
            r5 = 33
            if (r4 != r5) goto L19
            r0 = 2
            r6 = 2
        L17:
            r8 = 0
            goto L24
        L19:
            r3 = r3[r2]
            r4 = 20
            if (r3 != r4) goto L22
            r6 = r0
            r8 = 1
            goto L24
        L22:
            r6 = r0
            goto L17
        L24:
            int[] r0 = new int[r2]
            com.tencent.mapsdk.internal.fq r1 = r12.a
            java.util.List<java.lang.Integer> r1 = r1.L
            if (r1 == 0) goto L54
            com.tencent.mapsdk.internal.fq r0 = r12.a
            java.util.List<java.lang.Integer> r0 = r0.L
            int r0 = r0.size()
            int[] r0 = new int[r0]
            r1 = 0
        L37:
            com.tencent.mapsdk.internal.fq r3 = r12.a
            java.util.List<java.lang.Integer> r3 = r3.L
            int r3 = r3.size()
            if (r1 >= r3) goto L54
            com.tencent.mapsdk.internal.fq r3 = r12.a
            java.util.List<java.lang.Integer> r3 = r3.L
            java.lang.Object r3 = r3.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0[r1] = r3
            int r1 = r1 + 1
            goto L37
        L54:
            r10 = r0
            int[] r0 = new int[r2]
            com.tencent.mapsdk.internal.fq r1 = r12.a
            int[] r1 = r1.t
            if (r1 == 0) goto L76
            com.tencent.mapsdk.internal.fq r0 = r12.a
            int[] r0 = r0.t
            int r0 = r0.length
            int[] r0 = new int[r0]
        L64:
            com.tencent.mapsdk.internal.fq r1 = r12.a
            int[] r1 = r1.t
            int r1 = r1.length
            if (r2 >= r1) goto L76
            com.tencent.mapsdk.internal.fq r1 = r12.a
            int[] r1 = r1.t
            r1 = r1[r2]
            r0[r2] = r1
            int r2 = r2 + 1
            goto L64
        L76:
            r9 = r0
            com.tencent.mapsdk.internal.sh$102 r0 = new com.tencent.mapsdk.internal.sh$102
            r3 = r0
            r4 = r11
            r5 = r12
            r3.<init>(r5, r6, r7, r8, r9, r10)
            r12 = -1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object r12 = r11.c(r0, r12)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.sh.c(com.tencent.mapsdk.internal.py):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ int a(com.tencent.mapsdk.internal.sh r11, com.tencent.mapsdk.internal.py r12) {
        /*
            com.tencent.mapsdk.internal.fq r0 = r12.a
            int r0 = r0.C
            r1 = 1
            r2 = 0
            r3 = 3
            if (r0 != r3) goto Lc
            r0 = 0
            r7 = 1
            goto Ld
        Lc:
            r7 = 0
        Ld:
            int[] r3 = r12.o
            r4 = r3[r2]
            r5 = 33
            if (r4 != r5) goto L19
            r0 = 2
            r6 = 2
        L17:
            r8 = 0
            goto L24
        L19:
            r3 = r3[r2]
            r4 = 20
            if (r3 != r4) goto L22
            r6 = r0
            r8 = 1
            goto L24
        L22:
            r6 = r0
            goto L17
        L24:
            int[] r0 = new int[r2]
            com.tencent.mapsdk.internal.fq r1 = r12.a
            java.util.List<java.lang.Integer> r1 = r1.L
            if (r1 == 0) goto L54
            com.tencent.mapsdk.internal.fq r0 = r12.a
            java.util.List<java.lang.Integer> r0 = r0.L
            int r0 = r0.size()
            int[] r0 = new int[r0]
            r1 = 0
        L37:
            com.tencent.mapsdk.internal.fq r3 = r12.a
            java.util.List<java.lang.Integer> r3 = r3.L
            int r3 = r3.size()
            if (r1 >= r3) goto L54
            com.tencent.mapsdk.internal.fq r3 = r12.a
            java.util.List<java.lang.Integer> r3 = r3.L
            java.lang.Object r3 = r3.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0[r1] = r3
            int r1 = r1 + 1
            goto L37
        L54:
            r10 = r0
            int[] r0 = new int[r2]
            com.tencent.mapsdk.internal.fq r1 = r12.a
            int[] r1 = r1.t
            if (r1 == 0) goto L76
            com.tencent.mapsdk.internal.fq r0 = r12.a
            int[] r0 = r0.t
            int r0 = r0.length
            int[] r0 = new int[r0]
        L64:
            com.tencent.mapsdk.internal.fq r1 = r12.a
            int[] r1 = r1.t
            int r1 = r1.length
            if (r2 >= r1) goto L76
            com.tencent.mapsdk.internal.fq r1 = r12.a
            int[] r1 = r1.t
            r1 = r1[r2]
            r0[r2] = r1
            int r2 = r2 + 1
            goto L64
        L76:
            r9 = r0
            com.tencent.mapsdk.internal.sh$102 r0 = new com.tencent.mapsdk.internal.sh$102
            r3 = r0
            r4 = r11
            r5 = r12
            r3.<init>(r5, r6, r7, r8, r9, r10)
            r12 = -1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object r11 = r11.c(r0, r12)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.sh.a(com.tencent.mapsdk.internal.sh, com.tencent.mapsdk.internal.py):int");
    }
}
