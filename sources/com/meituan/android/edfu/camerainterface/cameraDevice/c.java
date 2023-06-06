package com.meituan.android.edfu.camerainterface.cameraDevice;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.util.SparseArray;
import android.view.SurfaceHolder;
import com.meituan.android.edfu.camerainterface.camera.AspectRatio;
import com.meituan.android.edfu.edfupreviewer.api.b;
import com.meituan.android.privacy.interfaces.p;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c implements Camera.PreviewCallback, d {
    public static ChangeQuickRedirect a = null;
    private static final String s = "c";
    private static final SparseArray<String> t;
    private int A;
    private int B;
    private int C;
    private int D;
    private byte[] E;
    private long F;
    private List<Object> G;
    private boolean H;
    private com.meituan.android.edfu.edfupreviewer.api.b I;
    private boolean J;
    private float K;
    Object b;
    public p c;
    public Camera.Parameters d;
    public AspectRatio e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public com.meituan.android.edfu.camerainterface.cameraDevice.a j;
    public b k;
    public a l;
    public boolean m;
    public boolean n;
    public String o;
    public boolean p;
    public Camera.AutoFocusCallback q;
    private Context r;
    private final Camera.CameraInfo u;
    private final com.meituan.android.edfu.camerainterface.camera.c v;
    private final com.meituan.android.edfu.camerainterface.camera.c w;
    private int x;
    private float y;
    private int z;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(byte[] bArr, int i, int i2, int i3, int i4, int i5);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        void a(Object obj, com.meituan.android.edfu.camerainterface.camera.b bVar);
    }

    public static int a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), -1000, 1000};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d448281dc7882b08bad913c3229970d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d448281dc7882b08bad913c3229970d")).intValue();
        }
        if (i > 1000) {
            return 1000;
        }
        if (i < -1000) {
            return -1000;
        }
        return i;
    }

    private static boolean d(int i) {
        return i == 90 || i == 270;
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        cVar.p = false;
        return false;
    }

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        t = sparseArray;
        sparseArray.put(0, "off");
        t.put(1, "on");
        t.put(2, "torch");
        t.put(3, FpsEvent.TYPE_SCROLL_AUTO);
        t.put(4, "red-eye");
    }

    public c(Context context, com.meituan.android.edfu.edfupreviewer.api.b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8001df2554dcda7825e9686b1b94fe2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8001df2554dcda7825e9686b1b94fe2c");
            return;
        }
        this.u = new Camera.CameraInfo();
        this.v = new com.meituan.android.edfu.camerainterface.camera.c();
        this.w = new com.meituan.android.edfu.camerainterface.camera.c();
        this.x = 17;
        this.e = AspectRatio.b;
        this.F = 1000L;
        this.J = false;
        this.n = false;
        this.o = "jcyf-3d949484e464f1dc";
        this.K = 1.0f;
        this.p = false;
        this.q = new Camera.AutoFocusCallback() { // from class: com.meituan.android.edfu.camerainterface.cameraDevice.c.2
            public static ChangeQuickRedirect a;

            @Override // android.hardware.Camera.AutoFocusCallback
            public final void onAutoFocus(boolean z, Camera camera) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), camera};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "53f7b653d740186077244b4b907d93ea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "53f7b653d740186077244b4b907d93ea");
                    return;
                }
                try {
                    Camera.Parameters parameters = camera.getParameters();
                    if (c.this.a(parameters)) {
                        camera.cancelAutoFocus();
                        parameters.setFocusMode(FpsEvent.TYPE_SCROLL_AUTO);
                        if (c.this.h) {
                            parameters.setFocusMode("continuous-picture");
                        }
                    }
                    camera.setParameters(parameters);
                    if (!c.this.h) {
                        camera.autoFocus(c.this.j);
                    }
                } catch (Throwable th) {
                    com.meituan.android.edfu.utils.c a2 = com.meituan.android.edfu.utils.c.a();
                    a2.a("CameraManager", "AutoFocusCallback " + th.getMessage());
                }
                c.a(c.this, false);
            }
        };
        this.r = context;
        this.G = new ArrayList();
        this.I = bVar;
        if (bVar != null) {
            bVar.setSurfaceCallback(new b.a() { // from class: com.meituan.android.edfu.camerainterface.cameraDevice.c.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.edfu.edfupreviewer.api.b.a
                public final void a(Object obj) {
                    Object[] objArr2 = {obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3a71d1a4249f1ba12098e8e5539dace", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3a71d1a4249f1ba12098e8e5539dace");
                        return;
                    }
                    String unused = c.s;
                    com.meituan.android.edfu.utils.c.a().a("CameraManager", "onSurfaceCreated");
                    c.this.b = obj;
                    if (c.this.H) {
                        c.this.a();
                        c.this.b();
                        c.this.j = new com.meituan.android.edfu.camerainterface.cameraDevice.a(c.this.c);
                        com.meituan.android.edfu.camerainterface.cameraDevice.a unused2 = c.this.j;
                        com.meituan.android.edfu.camerainterface.cameraDevice.a.a(c.this.F);
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x026b A[Catch: Throwable -> 0x031a, TryCatch #0 {Throwable -> 0x031a, blocks: (B:76:0x0244, B:78:0x026b, B:88:0x02b3, B:90:0x02b9, B:94:0x02d2, B:96:0x02fa, B:98:0x030c, B:101:0x0312, B:97:0x0300, B:91:0x02c3, B:93:0x02c9, B:79:0x026f, B:81:0x0275, B:83:0x0282, B:85:0x028e, B:87:0x02a5, B:86:0x029a), top: B:107:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x026f A[Catch: Throwable -> 0x031a, TryCatch #0 {Throwable -> 0x031a, blocks: (B:76:0x0244, B:78:0x026b, B:88:0x02b3, B:90:0x02b9, B:94:0x02d2, B:96:0x02fa, B:98:0x030c, B:101:0x0312, B:97:0x0300, B:91:0x02c3, B:93:0x02c9, B:79:0x026f, B:81:0x0275, B:83:0x0282, B:85:0x028e, B:87:0x02a5, B:86:0x029a), top: B:107:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b9 A[Catch: Throwable -> 0x031a, TryCatch #0 {Throwable -> 0x031a, blocks: (B:76:0x0244, B:78:0x026b, B:88:0x02b3, B:90:0x02b9, B:94:0x02d2, B:96:0x02fa, B:98:0x030c, B:101:0x0312, B:97:0x0300, B:91:0x02c3, B:93:0x02c9, B:79:0x026f, B:81:0x0275, B:83:0x0282, B:85:0x028e, B:87:0x02a5, B:86:0x029a), top: B:107:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c3 A[Catch: Throwable -> 0x031a, TryCatch #0 {Throwable -> 0x031a, blocks: (B:76:0x0244, B:78:0x026b, B:88:0x02b3, B:90:0x02b9, B:94:0x02d2, B:96:0x02fa, B:98:0x030c, B:101:0x0312, B:97:0x0300, B:91:0x02c3, B:93:0x02c9, B:79:0x026f, B:81:0x0275, B:83:0x0282, B:85:0x028e, B:87:0x02a5, B:86:0x029a), top: B:107:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02fa A[Catch: Throwable -> 0x031a, TryCatch #0 {Throwable -> 0x031a, blocks: (B:76:0x0244, B:78:0x026b, B:88:0x02b3, B:90:0x02b9, B:94:0x02d2, B:96:0x02fa, B:98:0x030c, B:101:0x0312, B:97:0x0300, B:91:0x02c3, B:93:0x02c9, B:79:0x026f, B:81:0x0275, B:83:0x0282, B:85:0x028e, B:87:0x02a5, B:86:0x029a), top: B:107:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0300 A[Catch: Throwable -> 0x031a, TryCatch #0 {Throwable -> 0x031a, blocks: (B:76:0x0244, B:78:0x026b, B:88:0x02b3, B:90:0x02b9, B:94:0x02d2, B:96:0x02fa, B:98:0x030c, B:101:0x0312, B:97:0x0300, B:91:0x02c3, B:93:0x02c9, B:79:0x026f, B:81:0x0275, B:83:0x0282, B:85:0x028e, B:87:0x02a5, B:86:0x029a), top: B:107:0x0244 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.edfu.camerainterface.cameraDevice.c.a():void");
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67600382a05e7ef3d13240745db808a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67600382a05e7ef3d13240745db808a9");
            return;
        }
        com.meituan.android.edfu.utils.c.a().a("CameraManager", "startpreview:");
        if (this.c == null || this.b == null) {
            return;
        }
        try {
            if (this.b instanceof SurfaceTexture) {
                this.c.a((SurfaceTexture) this.b);
            } else if (this.b instanceof SurfaceHolder) {
                this.c.a((SurfaceHolder) this.b);
            }
            this.c.d();
        } catch (Exception e) {
            e();
            com.meituan.android.edfu.utils.c a2 = com.meituan.android.edfu.utils.c.a();
            a2.a("CameraManager", "startpreview:" + e.getMessage());
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "995ea119fe906002ff5f91a46ce53be2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "995ea119fe906002ff5f91a46ce53be2");
            return;
        }
        this.H = true;
        if (this.I.getSurface() != null) {
            a();
            b();
            this.j = new com.meituan.android.edfu.camerainterface.cameraDevice.a(this.c);
            com.meituan.android.edfu.camerainterface.cameraDevice.a.a(this.F);
        }
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2f7a0ba55b0b64b3828a105fc2fe35c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2f7a0ba55b0b64b3828a105fc2fe35c");
        } else {
            c();
        }
    }

    private AspectRatio k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaa3cd58f9e52d7fa2ccd9f0af6febab", RobustBitConfig.DEFAULT_VALUE)) {
            return (AspectRatio) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaa3cd58f9e52d7fa2ccd9f0af6febab");
        }
        AspectRatio aspectRatio = null;
        com.meituan.android.edfu.camerainterface.camera.c cVar = this.v;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.edfu.camerainterface.camera.c.a;
        Iterator<AspectRatio> it = (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "a8fa27b7d70ff6bb9a7bf14661dc7057", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "a8fa27b7d70ff6bb9a7bf14661dc7057") : cVar.b.keySet()).iterator();
        while (it.hasNext()) {
            aspectRatio = it.next();
            if (AspectRatio.b.equals(aspectRatio)) {
                break;
            }
        }
        return aspectRatio;
    }

    private com.meituan.android.edfu.camerainterface.camera.b a(SortedSet<com.meituan.android.edfu.camerainterface.camera.b> sortedSet) {
        int i;
        int i2;
        Object[] objArr = {sortedSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2be40d66d480c48db5e062c6fe56b308", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.edfu.camerainterface.camera.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2be40d66d480c48db5e062c6fe56b308");
        }
        if (d(this.z)) {
            i = this.A;
            i2 = this.B;
        } else {
            i = this.B;
            i2 = this.A;
        }
        com.meituan.android.edfu.camerainterface.camera.b bVar = null;
        Iterator<com.meituan.android.edfu.camerainterface.camera.b> it = sortedSet.iterator();
        while (it.hasNext()) {
            bVar = it.next();
            if (i <= bVar.b && i2 <= bVar.c) {
                break;
            }
        }
        return bVar;
    }

    private com.meituan.android.edfu.camerainterface.camera.b b(SortedSet<com.meituan.android.edfu.camerainterface.camera.b> sortedSet) {
        int i;
        int i2;
        Object[] objArr = {sortedSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e92a28d63fae3db9360ddfa476d8af8", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.edfu.camerainterface.camera.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e92a28d63fae3db9360ddfa476d8af8");
        }
        if (d(this.z)) {
            if (this.C > 0) {
                i = this.C;
                i2 = this.D;
            } else {
                i = this.A;
                i2 = this.B;
            }
        } else if (this.C > 0) {
            i = this.D;
            i2 = this.C;
        } else {
            i = this.B;
            i2 = this.A;
        }
        com.meituan.android.edfu.camerainterface.camera.b bVar = null;
        Iterator<com.meituan.android.edfu.camerainterface.camera.b> it = sortedSet.iterator();
        while (it.hasNext()) {
            bVar = it.next();
            if (i <= bVar.b && i2 <= bVar.c) {
                break;
            }
        }
        return bVar;
    }

    public void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "429785aaf651e0b887a62a4d32b7689d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "429785aaf651e0b887a62a4d32b7689d");
            return;
        }
        List<String> supportedFocusModes = this.d.getSupportedFocusModes();
        if (z) {
            try {
                if (z2) {
                    if (supportedFocusModes.contains("continuous-picture")) {
                        this.d.setFocusMode("continuous-picture");
                    } else if (supportedFocusModes.contains("continuous-video")) {
                        this.d.setFocusMode("continuous-video");
                    } else if (supportedFocusModes.contains(FpsEvent.TYPE_SCROLL_AUTO)) {
                        this.d.setFocusMode(FpsEvent.TYPE_SCROLL_AUTO);
                    } else if (supportedFocusModes.contains("fixed")) {
                        this.d.setFocusMode("fixed");
                    } else if (supportedFocusModes.contains("infinity")) {
                        this.d.setFocusMode("infinity");
                    } else {
                        this.d.setFocusMode(supportedFocusModes.get(0));
                    }
                } else if (supportedFocusModes.contains(FpsEvent.TYPE_SCROLL_AUTO)) {
                    this.d.setFocusMode(FpsEvent.TYPE_SCROLL_AUTO);
                } else if (supportedFocusModes.contains("fixed")) {
                    this.d.setFocusMode("fixed");
                } else if (supportedFocusModes.contains("infinity")) {
                    this.d.setFocusMode("infinity");
                } else {
                    this.d.setFocusMode(supportedFocusModes.get(0));
                }
            } catch (Exception e) {
                com.meituan.android.edfu.utils.c a2 = com.meituan.android.edfu.utils.c.a();
                a2.a("CameraManager", "setAutoFocusInternal:" + e.getMessage());
            }
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a02f2c3d02f266b98c5d8b2d6fdb709", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a02f2c3d02f266b98c5d8b2d6fdb709");
            return;
        }
        if (this.j != null && this.j.b) {
            this.j.b();
        }
        if (this.c != null) {
            try {
                this.c.e();
                this.c.f();
                this.c = null;
            } catch (Throwable th) {
                com.meituan.android.edfu.utils.c a2 = com.meituan.android.edfu.utils.c.a();
                a2.a("CameraManager", "close:" + th.getMessage());
            }
        }
        this.H = false;
    }

    public final boolean f() {
        return this.c != null;
    }

    public final boolean a(AspectRatio aspectRatio) {
        Object[] objArr = {aspectRatio};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42a3bba6bae3716c5ce2dfaf902366f8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42a3bba6bae3716c5ce2dfaf902366f8")).booleanValue();
        }
        if (!f()) {
            this.e = aspectRatio;
        }
        if (!this.e.equals(aspectRatio)) {
            this.e = aspectRatio;
            d();
        }
        return true;
    }

    public final void a(com.meituan.android.edfu.camerainterface.camera.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b261c9fce5fd5437caa8dd752e13ea64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b261c9fce5fd5437caa8dd752e13ea64");
        } else if (this.A == bVar.b && this.B == bVar.c) {
        } else {
            this.A = bVar.b;
            this.B = bVar.c;
            com.meituan.android.edfu.utils.c a2 = com.meituan.android.edfu.utils.c.a();
            a2.a("CameraManager", "setDesiredSize:" + bVar.toString());
            if (f()) {
                d();
            }
        }
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30d8c46455878bfbd2da289e9681391d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30d8c46455878bfbd2da289e9681391d");
        } else if (this.c != null && (f > 1.0f || (f < 1.0f && f > 0.0f))) {
            try {
                int b2 = b(f);
                this.d = this.c.b();
                this.d.setZoom(b2);
                this.c.a(this.d);
            } catch (Exception e) {
                com.meituan.android.edfu.utils.c a2 = com.meituan.android.edfu.utils.c.a();
                a2.a("CameraManager", "setZoomFactor:" + e.getMessage());
            }
        } else {
            this.y = f;
        }
    }

    public final int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b925b15e743c27176ecb9f46f747e7c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b925b15e743c27176ecb9f46f747e7c")).intValue();
        }
        if (this.c != null) {
            try {
                return this.c.b().getMinExposureCompensation();
            } catch (Exception unused) {
                return 0;
            }
        }
        return 0;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6539c28fb3f105336409efdcbb50b81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6539c28fb3f105336409efdcbb50b81");
        } else if (this.c == null || this.J) {
        } else {
            try {
                Camera.Parameters b2 = this.c.b();
                if (b2.isAutoExposureLockSupported()) {
                    b2.setAutoExposureLock(true);
                    b2.setExposureCompensation(i);
                    this.c.a(b2);
                    Camera.Parameters b3 = this.c.b();
                    b3.setAutoExposureLock(false);
                    this.c.a(b3);
                    com.meituan.android.edfu.utils.c a2 = com.meituan.android.edfu.utils.c.a();
                    a2.a("CameraManager", "setExposureValue:" + i);
                }
            } catch (Exception e) {
                com.meituan.android.edfu.utils.c a3 = com.meituan.android.edfu.utils.c.a();
                a3.a("CameraManager", "setExposureCompensation:" + e.getMessage());
            }
        }
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "456cd87b4b4d83040eef67cc7863f6a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "456cd87b4b4d83040eef67cc7863f6a6");
            return;
        }
        try {
            if (this.m || this.c == null) {
                return;
            }
            this.c.a(this.E);
        } catch (Exception e) {
            com.meituan.android.edfu.utils.c a2 = com.meituan.android.edfu.utils.c.a();
            a2.a("CameraManager", "requestFrameWithBuffer failed" + e.getMessage());
        }
    }

    public final boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "783f0f2b2243fcb7e71cc9013962669a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "783f0f2b2243fcb7e71cc9013962669a")).booleanValue();
        }
        if (this.r != null) {
            return this.r.getPackageManager().hasSystemFeature("android.hardware.camera.flash") && l();
        }
        com.meituan.android.edfu.utils.c.a().a("CameraManager", "isFlashLightSupported: false");
        return false;
    }

    private boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4890556eb9dece8ce5a5330cbf38ea62", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4890556eb9dece8ce5a5330cbf38ea62")).booleanValue();
        }
        if (this.c != null) {
            try {
                Camera.Parameters b2 = this.c.b();
                List<String> supportedFlashModes = b2.getSupportedFlashModes();
                if (b2.getFlashMode() == null || supportedFlashModes == null) {
                    return false;
                }
                if (!supportedFlashModes.contains("torch")) {
                    if (!supportedFlashModes.contains("on")) {
                        return false;
                    }
                }
                return true;
            } catch (Exception e) {
                com.meituan.android.edfu.utils.c a2 = com.meituan.android.edfu.utils.c.a();
                a2.a("CameraManager", "lightSupport:" + e.getMessage());
                return false;
            }
        }
        return false;
    }

    private void a(int i, String str) {
        Object[] objArr = {-1, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c80d8fa692c0ab7ca811200e01255054", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c80d8fa692c0ab7ca811200e01255054");
            return;
        }
        Iterator<Object> it = this.G.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private int c(int i) {
        int i2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f9f31710c739a12a89ae0f7b15c3b6d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f9f31710c739a12a89ae0f7b15c3b6d")).intValue();
        }
        if (this.u.facing == 1) {
            i2 = (360 - ((this.u.orientation + i) % 360)) % 360;
        } else {
            i2 = ((this.u.orientation - i) + 360) % 360;
        }
        new StringBuilder(" camera orientation is : ").append(i2);
        return i2;
    }

    public boolean b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e749001e26e94d6cde58aa6e3e306823", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e749001e26e94d6cde58aa6e3e306823")).booleanValue();
        }
        List<String> supportedFlashModes = this.d.getSupportedFlashModes();
        String str = t.get(i);
        if (supportedFlashModes != null) {
            try {
                if (supportedFlashModes.contains(str)) {
                    this.d.setFlashMode(str);
                    this.i = i;
                    return true;
                }
            } catch (Exception e) {
                com.meituan.android.edfu.utils.c a2 = com.meituan.android.edfu.utils.c.a();
                a2.a("CameraManager", "setFlashInternal:" + e.getMessage());
            }
        }
        String str2 = t.get(this.i);
        if ("torch".equals(str2) && supportedFlashModes.contains("on")) {
            this.d.setFlashMode("on");
            this.i = 1;
            return true;
        }
        if (supportedFlashModes == null || !supportedFlashModes.contains(str2)) {
            this.d.setFlashMode("off");
            this.i = 0;
            return true;
        }
        return false;
    }

    public boolean a(Camera.Parameters parameters) {
        Object[] objArr = {parameters};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82938cd69688a023e248b72ec3548dc3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82938cd69688a023e248b72ec3548dc3")).booleanValue();
        }
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        return supportedFocusModes != null && supportedFocusModes.contains(FpsEvent.TYPE_SCROLL_AUTO);
    }

    private int b(float f) {
        int i;
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a129ab13e67e0ee385bbb2372dcced34", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a129ab13e67e0ee385bbb2372dcced34")).intValue();
        }
        if (this.c != null) {
            try {
                this.d = this.c.b();
                int zoom = this.d.getZoom();
                int intValue = (int) (this.d.getZoomRatios().get(zoom).intValue() * f);
                i = zoom;
                int i2 = Integer.MAX_VALUE;
                for (int i3 = 0; i3 < this.d.getZoomRatios().size(); i3++) {
                    int intValue2 = this.d.getZoomRatios().get(i3).intValue();
                    int i4 = intValue - intValue2;
                    if (Math.abs(i4) < i2 && intValue2 >= intValue) {
                        i = i3;
                        i2 = i4;
                    }
                }
            } catch (Exception e) {
                com.meituan.android.edfu.utils.c a2 = com.meituan.android.edfu.utils.c.a();
                a2.a("CameraManager", "setDesiredZoom:" + e.getMessage());
                return -1;
            }
        } else {
            i = 0;
        }
        System.out.printf("zoom targetZoomIdx %d\n", Integer.valueOf(i));
        return i;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Object[] objArr = {bArr, camera};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfa514ac8529d811c3e23116eedd1c07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfa514ac8529d811c3e23116eedd1c07");
        } else if (this.l == null || !f()) {
        } else {
            this.l.a(bArr, this.d.getPreviewSize().width, this.d.getPreviewSize().height, this.d.getPreviewSize().width, this.x, this.u.orientation);
        }
    }
}
