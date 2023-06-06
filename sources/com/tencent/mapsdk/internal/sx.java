package com.tencent.mapsdk.internal;

import android.content.Context;
import android.opengl.GLDebugHelper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.meituan.android.common.metricx.config.MetricXConfigBean;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class sx extends SurfaceView implements SurfaceHolder.Callback {
    public static final String a = "tms-gl";
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 60;
    private static final String h = "GLSurfaceView";
    private static final boolean i = false;
    private static final boolean j = false;
    private static final boolean k = false;
    private static final boolean l = false;
    private static final boolean m = false;
    private static final boolean n = true;
    private static final boolean o = false;
    private static final j p = new j((byte) 0);
    i g;
    private final WeakReference<sx> q;
    private m r;
    private boolean s;
    private e t;
    private f u;
    private g v;
    private k w;
    private int x;
    private int y;
    private boolean z;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface e {
        EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface f {
        EGLContext a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface g {
        EGLSurface a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface k {
        GL a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface m {
        void T();

        void a(GL10 gl10, int i, int i2);

        void a(GL10 gl10, EGLConfig eGLConfig);

        boolean a(GL10 gl10);
    }

    public static String a(String str) {
        return "tms-gl." + str + ".84764ab";
    }

    public sx(Context context) {
        super(context);
        this.q = new WeakReference<>(this);
        d();
    }

    private sx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = new WeakReference<>(this);
        d();
    }

    public final void a(float f2) {
        if (this.g != null) {
            this.g.a(f2);
            this.g.c();
        }
    }

    protected void finalize() throws Throwable {
        try {
            if (this.g != null) {
                this.g.f();
            }
        } finally {
            super.finalize();
        }
    }

    private void d() {
        getHolder().addCallback(this);
    }

    public void setGLWrapper(k kVar) {
        this.w = kVar;
    }

    public void setDebugFlags(int i2) {
        this.x = i2;
    }

    public int getDebugFlags() {
        return this.x;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.z = z;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.z;
    }

    public void setRenderer(m mVar) {
        a(mVar, 60.0f);
    }

    public final void a(m mVar, float f2) {
        h();
        if (this.t == null) {
            this.t = new n(true);
        }
        if (this.u == null) {
            this.u = new c(this, (byte) 0);
        }
        if (this.v == null) {
            this.v = new d((byte) 0);
        }
        this.r = mVar;
        this.g = new i(this.q);
        this.g.a(f2);
        this.g.start();
    }

    public void setEGLContextFactory(f fVar) {
        h();
        this.u = fVar;
    }

    public void setEGLWindowSurfaceFactory(g gVar) {
        h();
        this.v = gVar;
    }

    public void setEGLConfigChooser(e eVar) {
        h();
        this.t = eVar;
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new n(z));
    }

    private void e() {
        setEGLConfigChooser(new b(8, 16, 8));
    }

    public void setEGLContextClientVersion(int i2) {
        h();
        this.y = i2;
    }

    public void setRenderMode(int i2) {
        i iVar = this.g;
        if (i2 < 0 || i2 > 1) {
            throw new IllegalArgumentException("renderMode");
        }
        synchronized (p) {
            iVar.k = i2;
            p.notifyAll();
        }
    }

    public int getRenderMode() {
        return this.g.b();
    }

    private void f() {
        this.g.c();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        i iVar = this.g;
        synchronized (p) {
            iVar.c = true;
            iVar.g = false;
            p.notifyAll();
            while (iVar.d && !iVar.g && !iVar.a) {
                try {
                    p.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        i iVar = this.g;
        synchronized (p) {
            iVar.c = false;
            p.notifyAll();
            while (!iVar.d && !iVar.a) {
                try {
                    p.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        i iVar = this.g;
        synchronized (p) {
            if (iVar.i == i3 && iVar.j == i4) {
                iVar.o = false;
                p.notifyAll();
                return;
            }
            iVar.i = i3;
            iVar.j = i4;
            iVar.o = true;
            iVar.l = true;
            iVar.m = false;
            p.notifyAll();
            while (!iVar.a && !iVar.b && !iVar.m) {
                if (!(iVar.e && iVar.f && iVar.a())) {
                    break;
                }
                try {
                    p.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public void b() {
        this.g.d();
    }

    public void a() {
        this.g.e();
    }

    private void a(Runnable runnable) {
        i iVar = this.g;
        if (runnable == null) {
            throw new IllegalArgumentException("r must not be null");
        }
        synchronized (p) {
            iVar.n.add(runnable);
            p.notifyAll();
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.s) {
            this.g.e();
        }
        this.s = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        if (this.g != null) {
            this.g.d();
        }
        this.s = true;
        super.onDetachedFromWindow();
    }

    public void c() {
        if (this.g != null) {
            this.g.f();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class c implements f {
        private int b;

        private c() {
            this.b = 12440;
        }

        /* synthetic */ c(sx sxVar, byte b) {
            this();
        }

        @Override // com.tencent.mapsdk.internal.sx.f
        public final EGLContext a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.b, sx.this.y, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (sx.this.y == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        @Override // com.tencent.mapsdk.internal.sx.f
        public final void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            Log.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            egl10.eglGetError();
            h.a("eglDestroyContex");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class d implements g {
        private d() {
        }

        /* synthetic */ d(byte b) {
            this();
        }

        @Override // com.tencent.mapsdk.internal.sx.g
        public final EGLSurface a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e) {
                Log.e(sx.h, "eglCreateWindowSurface", e);
                return null;
            } catch (OutOfMemoryError unused) {
                return null;
            }
        }

        @Override // com.tencent.mapsdk.internal.sx.g
        public final void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public abstract class a implements e {
        protected int[] a;

        abstract EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        public a(int[] iArr) {
            int[] iArr2;
            if (sx.this.y != 2) {
                iArr2 = iArr;
            } else {
                iArr2 = new int[15];
                System.arraycopy(iArr, 0, iArr2, 0, 12);
                iArr2[12] = 12352;
                iArr2[13] = 4;
                iArr2[14] = 12344;
            }
            this.a = iArr2;
        }

        @Override // com.tencent.mapsdk.internal.sx.e
        public final EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.a, null, 0, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
            int i = iArr[0];
            if (i <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            if (!egl10.eglChooseConfig(eGLDisplay, this.a, eGLConfigArr, i, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            EGLConfig a = a(egl10, eGLDisplay, eGLConfigArr);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("No config chosen");
        }

        private int[] a(int[] iArr) {
            if (sx.this.y != 2) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr2[i] = 12352;
            iArr2[length] = 4;
            iArr2[length + 1] = 12344;
            return iArr2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class b extends a {
        protected int c;
        protected int d;
        protected int e;
        protected int f;
        protected int g;
        protected int h;
        private int[] j;

        public b(int i, int i2, int i3) {
            super(new int[]{12324, 8, 12323, 8, 12322, 8, 12321, i, 12325, i2, 12326, i3, 12344});
            this.j = new int[1];
            this.c = 8;
            this.d = 8;
            this.e = 8;
            this.f = i;
            this.g = i2;
            this.h = i3;
        }

        @Override // com.tencent.mapsdk.internal.sx.a
        public final EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int a = a(egl10, eGLDisplay, eGLConfig, 12325);
                int a2 = a(egl10, eGLDisplay, eGLConfig, 12326);
                if (a >= this.g && a2 >= this.h) {
                    int a3 = a(egl10, eGLDisplay, eGLConfig, 12324);
                    int a4 = a(egl10, eGLDisplay, eGLConfig, 12323);
                    int a5 = a(egl10, eGLDisplay, eGLConfig, 12322);
                    int a6 = a(egl10, eGLDisplay, eGLConfig, 12321);
                    if (a3 == this.c && a4 == this.d && a5 == this.e && a6 == this.f) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        private int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.j)) {
                return this.j[0];
            }
            return 0;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class n extends b {
        public n(boolean z) {
            super(0, z ? 16 : 0, 0);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class h {
        WeakReference<sx> a;
        EGL10 b;
        EGLDisplay c;
        EGLSurface d;
        EGLConfig e;
        EGLContext f;

        public h(WeakReference<sx> weakReference) {
            this.a = weakReference;
        }

        private void c() {
            this.b = (EGL10) EGLContext.getEGL();
            this.c = this.b.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            if (this.c == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed");
            }
            if (!this.b.eglInitialize(this.c, new int[2])) {
                throw new RuntimeException("eglInitialize failed");
            }
            sx sxVar = this.a.get();
            if (sxVar != null) {
                this.e = sxVar.t.a(this.b, this.c);
                this.f = sxVar.u.a(this.b, this.c, this.e);
            } else {
                this.e = null;
                this.f = null;
            }
            if (this.f == null || this.f == EGL10.EGL_NO_CONTEXT) {
                this.f = null;
                this.b.eglGetError();
                a("createContext");
            }
            this.d = null;
        }

        private boolean d() {
            if (this.b == null) {
                throw new RuntimeException("egl not initialized");
            }
            if (this.c == null) {
                throw new RuntimeException("eglDisplay not initialized");
            }
            if (this.e == null) {
                throw new RuntimeException("mEglConfig not initialized");
            }
            a();
            sx sxVar = this.a.get();
            if (sxVar != null) {
                this.d = sxVar.v.a(this.b, this.c, this.e, sxVar.getHolder());
            } else {
                this.d = null;
            }
            if (this.d == null || this.d == EGL10.EGL_NO_SURFACE) {
                if (this.b.eglGetError() == 12299) {
                    Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            } else if (this.b.eglMakeCurrent(this.c, this.d, this.d, this.f)) {
                return true;
            } else {
                this.b.eglGetError();
                a("EGLHelper", "eglMakeCurrent");
                return false;
            }
        }

        private GL e() {
            GL gl = this.f.getGL();
            sx sxVar = this.a.get();
            if (sxVar != null) {
                if (sxVar.w != null) {
                    gl = sxVar.w.a();
                }
                if ((sxVar.x & 3) != 0) {
                    return GLDebugHelper.wrap(gl, (sxVar.x & 1) != 0 ? 1 : 0, (sxVar.x & 2) != 0 ? new l() : null);
                }
                return gl;
            }
            return gl;
        }

        private int f() {
            return !this.b.eglSwapBuffers(this.c, this.d) ? this.b.eglGetError() : MetricXConfigBean.URL_EXP_LENGTH_LIMIT;
        }

        private void g() {
            a();
        }

        final void a() {
            if (this.d == null || this.d == EGL10.EGL_NO_SURFACE) {
                return;
            }
            EGL10 egl10 = this.b;
            EGLDisplay eGLDisplay = this.c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            sx sxVar = this.a.get();
            if (sxVar != null) {
                sxVar.v.a(this.b, this.c, this.d);
            }
            this.d = null;
        }

        public final void b() {
            if (this.f != null) {
                sx sxVar = this.a.get();
                if (sxVar != null) {
                    sxVar.u.a(this.b, this.c, this.f);
                }
                this.f = null;
            }
            if (this.c != null) {
                this.b.eglTerminate(this.c);
                this.c = null;
            }
        }

        private void b(String str) {
            this.b.eglGetError();
            a(str);
        }

        public static void a(String str) {
            throw new RuntimeException(c(str));
        }

        public static void a(String str, String str2) {
            c(str2);
        }

        private static String c(String str) {
            return str + " failed: ";
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class i extends Thread {
        boolean a;
        boolean b;
        boolean c;
        boolean d;
        boolean e;
        boolean f;
        boolean g;
        boolean h;
        boolean m;
        private long p;
        private boolean q;
        private boolean r;
        private boolean s;
        private h u;
        private WeakReference<sx> v;
        ArrayList<Runnable> n = new ArrayList<>();
        boolean o = true;
        private float t = 60.0f;
        int i = 0;
        int j = 0;
        boolean l = true;
        int k = 1;

        static /* synthetic */ boolean a(i iVar) {
            iVar.a = true;
            return true;
        }

        i(WeakReference<sx> weakReference) {
            this.v = weakReference;
            setName(sx.a("SV"));
        }

        private void g() {
            if (this.f) {
                this.f = false;
                this.u.a();
            }
        }

        private void h() {
            if (this.e) {
                this.u.b();
                this.e = false;
                sx.p.c(this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:106:0x01d0 A[Catch: all -> 0x03fd, TryCatch #11 {, blocks: (B:5:0x0021, B:7:0x0025, B:9:0x002f, B:10:0x0036, B:19:0x0047, B:21:0x004f, B:117:0x0200, B:22:0x005c, B:24:0x0062, B:26:0x0071, B:28:0x0075, B:30:0x0081, B:32:0x008a, B:34:0x008e, B:36:0x0093, B:38:0x0097, B:40:0x00a1, B:45:0x00ac, B:47:0x00b6, B:49:0x00bb, B:51:0x00c5, B:52:0x00ca, B:54:0x00ce, B:56:0x00d2, B:58:0x00d6, B:59:0x00d9, B:60:0x00e6, B:62:0x00ea, B:64:0x00ee, B:66:0x00fa, B:67:0x0106, B:69:0x010c, B:104:0x01cc, B:106:0x01d0, B:108:0x01d4, B:110:0x01dc, B:112:0x01e0, B:114:0x01e4, B:116:0x01f1, B:245:0x03ef, B:73:0x0119, B:75:0x0123, B:77:0x013d, B:79:0x0144, B:81:0x014c, B:83:0x0156, B:87:0x017e, B:89:0x0182, B:94:0x0198, B:102:0x01bc, B:93:0x018b, B:84:0x015e, B:86:0x0166, B:101:0x01b5, B:95:0x019b, B:96:0x01a4, B:97:0x01a5, B:98:0x01b0), top: B:291:0x0021 }] */
        /* JADX WARN: Removed duplicated region for block: B:145:0x028a A[Catch: all -> 0x0400, Exception -> 0x0402, TryCatch #12 {Exception -> 0x0402, blocks: (B:3:0x001c, B:4:0x0020, B:119:0x0203, B:121:0x020c, B:123:0x0212, B:125:0x0216, B:127:0x021a, B:129:0x0227, B:131:0x024c, B:133:0x0250, B:136:0x0257, B:138:0x0267, B:145:0x028a, B:146:0x028e, B:171:0x02da, B:173:0x02ec, B:175:0x02f2, B:176:0x02fa, B:178:0x0302, B:182:0x030d, B:184:0x0315, B:186:0x031c, B:187:0x0320, B:189:0x032d, B:191:0x0337, B:194:0x0345, B:196:0x034f, B:198:0x0357, B:200:0x035f, B:201:0x0362, B:203:0x0376, B:205:0x0380, B:207:0x0388, B:209:0x0398, B:214:0x03a7, B:215:0x03b2, B:229:0x03cd, B:231:0x03d7, B:240:0x03e2, B:222:0x03c1, B:153:0x029e, B:154:0x029f, B:155:0x02a3, B:162:0x02b9, B:140:0x0276, B:142:0x0280, B:130:0x0243, B:163:0x02ba, B:164:0x02c1, B:165:0x02c2, B:166:0x02c9, B:167:0x02ca, B:168:0x02d1, B:248:0x03ff), top: B:272:0x001c, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:154:0x029f A[Catch: all -> 0x0400, Exception -> 0x0402, TryCatch #12 {Exception -> 0x0402, blocks: (B:3:0x001c, B:4:0x0020, B:119:0x0203, B:121:0x020c, B:123:0x0212, B:125:0x0216, B:127:0x021a, B:129:0x0227, B:131:0x024c, B:133:0x0250, B:136:0x0257, B:138:0x0267, B:145:0x028a, B:146:0x028e, B:171:0x02da, B:173:0x02ec, B:175:0x02f2, B:176:0x02fa, B:178:0x0302, B:182:0x030d, B:184:0x0315, B:186:0x031c, B:187:0x0320, B:189:0x032d, B:191:0x0337, B:194:0x0345, B:196:0x034f, B:198:0x0357, B:200:0x035f, B:201:0x0362, B:203:0x0376, B:205:0x0380, B:207:0x0388, B:209:0x0398, B:214:0x03a7, B:215:0x03b2, B:229:0x03cd, B:231:0x03d7, B:240:0x03e2, B:222:0x03c1, B:153:0x029e, B:154:0x029f, B:155:0x02a3, B:162:0x02b9, B:140:0x0276, B:142:0x0280, B:130:0x0243, B:163:0x02ba, B:164:0x02c1, B:165:0x02c2, B:166:0x02c9, B:167:0x02ca, B:168:0x02d1, B:248:0x03ff), top: B:272:0x001c, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:227:0x03ca  */
        /* JADX WARN: Removed duplicated region for block: B:228:0x03cb  */
        /* JADX WARN: Removed duplicated region for block: B:231:0x03d7 A[Catch: all -> 0x0400, Exception -> 0x0402, TRY_LEAVE, TryCatch #12 {Exception -> 0x0402, blocks: (B:3:0x001c, B:4:0x0020, B:119:0x0203, B:121:0x020c, B:123:0x0212, B:125:0x0216, B:127:0x021a, B:129:0x0227, B:131:0x024c, B:133:0x0250, B:136:0x0257, B:138:0x0267, B:145:0x028a, B:146:0x028e, B:171:0x02da, B:173:0x02ec, B:175:0x02f2, B:176:0x02fa, B:178:0x0302, B:182:0x030d, B:184:0x0315, B:186:0x031c, B:187:0x0320, B:189:0x032d, B:191:0x0337, B:194:0x0345, B:196:0x034f, B:198:0x0357, B:200:0x035f, B:201:0x0362, B:203:0x0376, B:205:0x0380, B:207:0x0388, B:209:0x0398, B:214:0x03a7, B:215:0x03b2, B:229:0x03cd, B:231:0x03d7, B:240:0x03e2, B:222:0x03c1, B:153:0x029e, B:154:0x029f, B:155:0x02a3, B:162:0x02b9, B:140:0x0276, B:142:0x0280, B:130:0x0243, B:163:0x02ba, B:164:0x02c1, B:165:0x02c2, B:166:0x02c9, B:167:0x02ca, B:168:0x02d1, B:248:0x03ff), top: B:272:0x001c, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:243:0x03e9  */
        /* JADX WARN: Removed duplicated region for block: B:306:0x01e0 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void i() throws java.lang.InterruptedException {
            /*
                Method dump skipped, instructions count: 1062
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.sx.i.i():void");
        }

        private boolean j() {
            return this.e && this.f && a();
        }

        final boolean a() {
            if (this.b || !this.c || this.s || this.i <= 0 || this.j <= 0) {
                return false;
            }
            return this.l || this.k == 1;
        }

        private void a(int i) {
            if (i >= 0 && i <= 1) {
                synchronized (sx.p) {
                    this.k = i;
                    sx.p.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("renderMode");
        }

        public final int b() {
            int i;
            synchronized (sx.p) {
                i = this.k;
            }
            return i;
        }

        public final void c() {
            synchronized (sx.p) {
                this.l = true;
                sx.p.notifyAll();
            }
        }

        private void k() {
            synchronized (sx.p) {
                this.c = true;
                this.g = false;
                sx.p.notifyAll();
                while (this.d && !this.g && !this.a) {
                    try {
                        sx.p.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        private void l() {
            synchronized (sx.p) {
                this.c = false;
                sx.p.notifyAll();
                while (!this.d && !this.a) {
                    try {
                        sx.p.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void d() {
            synchronized (sx.p) {
                this.r = true;
                sx.p.notifyAll();
                while (!this.a && !this.b) {
                    try {
                        sx.p.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void e() {
            synchronized (sx.p) {
                this.r = false;
                this.l = true;
                this.m = false;
                sx.p.notifyAll();
                while (!this.a && this.b && !this.m) {
                    try {
                        sx.p.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        private void a(int i, int i2) {
            synchronized (sx.p) {
                if (this.i == i && this.j == i2) {
                    this.o = false;
                    sx.p.notifyAll();
                    return;
                }
                this.i = i;
                this.j = i2;
                this.o = true;
                this.l = true;
                this.m = false;
                sx.p.notifyAll();
                while (!this.a && !this.b && !this.m) {
                    if (!(this.e && this.f && a())) {
                        break;
                    }
                    try {
                        sx.p.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void f() {
            synchronized (sx.p) {
                this.q = true;
                sx.p.notifyAll();
                while (!this.a) {
                    try {
                        sx.p.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        private void m() {
            synchronized (sx.p) {
                this.h = true;
                sx.p.notifyAll();
            }
        }

        private void a(Runnable runnable) {
            if (runnable != null) {
                synchronized (sx.p) {
                    this.n.add(runnable);
                    sx.p.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("r must not be null");
        }

        public final void a(float f) {
            if (f <= 1.0f) {
                kj.e(ki.l, "帧率设置不在有效值范围内");
            } else {
                this.t = f;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:108:0x01d1 A[Catch: all -> 0x03fe, TryCatch #15 {, blocks: (B:7:0x0021, B:9:0x0025, B:11:0x002f, B:12:0x0036, B:21:0x0048, B:23:0x0050, B:119:0x0201, B:24:0x005d, B:26:0x0063, B:28:0x0072, B:30:0x0076, B:32:0x0082, B:34:0x008b, B:36:0x008f, B:38:0x0094, B:40:0x0098, B:42:0x00a2, B:47:0x00ad, B:49:0x00b7, B:51:0x00bc, B:53:0x00c6, B:54:0x00cb, B:56:0x00cf, B:58:0x00d3, B:60:0x00d7, B:61:0x00da, B:62:0x00e7, B:64:0x00eb, B:66:0x00ef, B:68:0x00fb, B:69:0x0107, B:71:0x010d, B:106:0x01cd, B:108:0x01d1, B:110:0x01d5, B:112:0x01dd, B:114:0x01e1, B:116:0x01e5, B:118:0x01f2, B:247:0x03f0, B:75:0x011a, B:77:0x0124, B:79:0x013e, B:81:0x0145, B:83:0x014d, B:85:0x0157, B:89:0x017f, B:91:0x0183, B:96:0x0199, B:104:0x01bd, B:95:0x018c, B:86:0x015f, B:88:0x0167, B:103:0x01b6, B:97:0x019c, B:98:0x01a5, B:99:0x01a6, B:100:0x01b1), top: B:303:0x0021 }] */
        /* JADX WARN: Removed duplicated region for block: B:147:0x028b A[Catch: all -> 0x0401, Exception -> 0x0403, TryCatch #13 {Exception -> 0x0403, blocks: (B:5:0x001c, B:6:0x0020, B:121:0x0204, B:123:0x020d, B:125:0x0213, B:127:0x0217, B:129:0x021b, B:131:0x0228, B:133:0x024d, B:135:0x0251, B:138:0x0258, B:140:0x0268, B:147:0x028b, B:148:0x028f, B:173:0x02db, B:175:0x02ed, B:177:0x02f3, B:178:0x02fb, B:180:0x0303, B:184:0x030e, B:186:0x0316, B:188:0x031d, B:189:0x0321, B:191:0x032e, B:193:0x0338, B:196:0x0346, B:198:0x0350, B:200:0x0358, B:202:0x0360, B:203:0x0363, B:205:0x0377, B:207:0x0381, B:209:0x0389, B:211:0x0399, B:216:0x03a8, B:217:0x03b3, B:231:0x03ce, B:233:0x03d8, B:242:0x03e3, B:224:0x03c2, B:155:0x029f, B:156:0x02a0, B:157:0x02a4, B:164:0x02ba, B:142:0x0277, B:144:0x0281, B:132:0x0244, B:165:0x02bb, B:166:0x02c2, B:167:0x02c3, B:168:0x02ca, B:169:0x02cb, B:170:0x02d2, B:250:0x0400), top: B:284:0x001c, outer: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:156:0x02a0 A[Catch: all -> 0x0401, Exception -> 0x0403, TryCatch #13 {Exception -> 0x0403, blocks: (B:5:0x001c, B:6:0x0020, B:121:0x0204, B:123:0x020d, B:125:0x0213, B:127:0x0217, B:129:0x021b, B:131:0x0228, B:133:0x024d, B:135:0x0251, B:138:0x0258, B:140:0x0268, B:147:0x028b, B:148:0x028f, B:173:0x02db, B:175:0x02ed, B:177:0x02f3, B:178:0x02fb, B:180:0x0303, B:184:0x030e, B:186:0x0316, B:188:0x031d, B:189:0x0321, B:191:0x032e, B:193:0x0338, B:196:0x0346, B:198:0x0350, B:200:0x0358, B:202:0x0360, B:203:0x0363, B:205:0x0377, B:207:0x0381, B:209:0x0389, B:211:0x0399, B:216:0x03a8, B:217:0x03b3, B:231:0x03ce, B:233:0x03d8, B:242:0x03e3, B:224:0x03c2, B:155:0x029f, B:156:0x02a0, B:157:0x02a4, B:164:0x02ba, B:142:0x0277, B:144:0x0281, B:132:0x0244, B:165:0x02bb, B:166:0x02c2, B:167:0x02c3, B:168:0x02ca, B:169:0x02cb, B:170:0x02d2, B:250:0x0400), top: B:284:0x001c, outer: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:229:0x03cb  */
        /* JADX WARN: Removed duplicated region for block: B:230:0x03cc  */
        /* JADX WARN: Removed duplicated region for block: B:233:0x03d8 A[Catch: all -> 0x0401, Exception -> 0x0403, TRY_LEAVE, TryCatch #13 {Exception -> 0x0403, blocks: (B:5:0x001c, B:6:0x0020, B:121:0x0204, B:123:0x020d, B:125:0x0213, B:127:0x0217, B:129:0x021b, B:131:0x0228, B:133:0x024d, B:135:0x0251, B:138:0x0258, B:140:0x0268, B:147:0x028b, B:148:0x028f, B:173:0x02db, B:175:0x02ed, B:177:0x02f3, B:178:0x02fb, B:180:0x0303, B:184:0x030e, B:186:0x0316, B:188:0x031d, B:189:0x0321, B:191:0x032e, B:193:0x0338, B:196:0x0346, B:198:0x0350, B:200:0x0358, B:202:0x0360, B:203:0x0363, B:205:0x0377, B:207:0x0381, B:209:0x0389, B:211:0x0399, B:216:0x03a8, B:217:0x03b3, B:231:0x03ce, B:233:0x03d8, B:242:0x03e3, B:224:0x03c2, B:155:0x029f, B:156:0x02a0, B:157:0x02a4, B:164:0x02ba, B:142:0x0277, B:144:0x0281, B:132:0x0244, B:165:0x02bb, B:166:0x02c2, B:167:0x02c3, B:168:0x02ca, B:169:0x02cb, B:170:0x02d2, B:250:0x0400), top: B:284:0x001c, outer: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:245:0x03ea  */
        /* JADX WARN: Removed duplicated region for block: B:316:0x01e1 A[SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 1088
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.sx.i.run():void");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static final class l extends Writer {
        private StringBuilder a = new StringBuilder();

        l() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            a();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            a();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    a();
                } else {
                    this.a.append(c);
                }
            }
        }

        private void a() {
            if (this.a.length() > 0) {
                StringBuilder sb = this.a;
                this.a.delete(0, this.a.length());
            }
        }
    }

    private void h() {
        if (this.g != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class j {
        private static String a = "GLThreadManager";
        private static final int g = 131072;
        private static final String h = "Q3Dimension MSM7500 ";
        private boolean b;
        private int c;
        private boolean d;
        private boolean e;
        private boolean f;
        private i i;

        private j() {
        }

        /* synthetic */ j(byte b) {
            this();
        }

        public final synchronized void a(i iVar) {
            i.a(iVar);
            if (this.i == iVar) {
                this.i = null;
            }
            notifyAll();
        }

        public final synchronized boolean b(i iVar) {
            if (this.i != iVar && this.i != null) {
                c();
                if (this.e) {
                    return true;
                }
                if (this.i != null) {
                    i iVar2 = this.i;
                    synchronized (sx.p) {
                        iVar2.h = true;
                        sx.p.notifyAll();
                    }
                }
                return false;
            }
            this.i = iVar;
            notifyAll();
            return true;
        }

        public final synchronized void c(i iVar) {
            if (this.i == iVar) {
                this.i = null;
            }
            notifyAll();
        }

        public final synchronized boolean a() {
            return this.f;
        }

        public final synchronized boolean b() {
            c();
            return !this.e;
        }

        public final synchronized void a(GL10 gl10) {
            if (!this.d) {
                c();
                String glGetString = gl10.glGetString(7937);
                if (this.c < 131072) {
                    this.e = !glGetString.startsWith(h);
                    notifyAll();
                }
                this.f = !this.e;
                this.d = true;
            }
        }

        private void c() {
            if (this.b) {
                return;
            }
            this.c = 131072;
            if (this.c >= 131072) {
                this.e = true;
            }
            this.b = true;
        }
    }
}
