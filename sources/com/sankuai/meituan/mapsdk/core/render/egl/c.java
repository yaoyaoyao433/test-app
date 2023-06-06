package com.sankuai.meituan.mapsdk.core.render.egl;

import android.opengl.GLDebugHelper;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends Thread {
    public static ChangeQuickRedirect a;
    public static final C0606c d = new C0606c();
    public b b;
    public final com.sankuai.meituan.mapsdk.core.render.egl.d c;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public boolean j;
    public boolean k;
    ArrayList<Runnable> l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private Runnable s;

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        cVar.f = true;
        return true;
    }

    public c(com.sankuai.meituan.mapsdk.core.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc8135863ce6949d2230c47be5220361", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc8135863ce6949d2230c47be5220361");
            return;
        }
        this.l = new ArrayList<>();
        this.r = true;
        this.s = null;
        this.b = new b();
        this.c = new com.sankuai.meituan.mapsdk.core.render.egl.d(dVar) { // from class: com.sankuai.meituan.mapsdk.core.render.egl.c.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mtmap.rendersdk.RenderScheduler
            public final void queueEvent(Runnable runnable) {
                Object[] objArr2 = {runnable};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de9feffb4400a05ded6a134d75139e3b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de9feffb4400a05ded6a134d75139e3b");
                    return;
                }
                c cVar = c.this;
                Object[] objArr3 = {runnable};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "931e81c34d485ea41e24a7f2661162df", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "931e81c34d485ea41e24a7f2661162df");
                } else if (runnable == null) {
                    throw new IllegalArgumentException("MTMAP GLThread r must not be null");
                } else {
                    synchronized (c.d) {
                        cVar.l.add(runnable);
                        c.d.notifyAll();
                    }
                }
            }
        };
        this.o = 0;
        this.p = 0;
        this.j = true;
        this.i = 1;
        this.q = false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e59d47e8cfbf87430f8dd74412fb4704", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e59d47e8cfbf87430f8dd74412fb4704");
            return;
        }
        setName("mtmap_gl_thread_" + getId());
        try {
            e();
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            d.a(this);
            throw th;
        }
        d.a(this);
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61e630cdad7b7fcba4264c0521807f0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61e630cdad7b7fcba4264c0521807f0b");
        } else if (!this.b.f.isEmpty()) {
            b bVar = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "5a3084c846ae077325046cecca150125", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "5a3084c846ae077325046cecca150125");
                return;
            }
            for (Object obj : new HashSet(bVar.f.keySet())) {
                bVar.a(obj);
            }
            bVar.i = null;
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a905f1d31ecadfd292d691ee0e405db8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a905f1d31ecadfd292d691ee0e405db8");
        } else if (this.m) {
            b bVar = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "d2c5de26c86c653f6ccc959128ef192a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "d2c5de26c86c653f6ccc959128ef192a");
            } else {
                if (bVar.e != null) {
                    bVar.b.eglDestroyContext(bVar.c, bVar.e);
                    bVar.e = null;
                }
                if (bVar.c != null) {
                    bVar.b.eglTerminate(bVar.c);
                    bVar.c = null;
                }
            }
            this.m = false;
            d.b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x01e5 A[Catch: RuntimeException -> 0x023f, all -> 0x04a8, TryCatch #8 {RuntimeException -> 0x023f, blocks: (B:55:0x00f1, B:57:0x010c, B:59:0x0119, B:61:0x0133, B:63:0x0140, B:74:0x0188, B:76:0x018c, B:79:0x01ba, B:81:0x01be, B:83:0x01c4, B:85:0x01e5, B:86:0x01eb, B:88:0x0214, B:91:0x0225, B:92:0x022e, B:78:0x0192, B:73:0x016c, B:93:0x022f, B:94:0x0236, B:95:0x0237, B:96:0x023e), top: B:241:0x00f1, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01eb A[Catch: RuntimeException -> 0x023f, all -> 0x04a8, TryCatch #8 {RuntimeException -> 0x023f, blocks: (B:55:0x00f1, B:57:0x010c, B:59:0x0119, B:61:0x0133, B:63:0x0140, B:74:0x0188, B:76:0x018c, B:79:0x01ba, B:81:0x01be, B:83:0x01c4, B:85:0x01e5, B:86:0x01eb, B:88:0x0214, B:91:0x0225, B:92:0x022e, B:78:0x0192, B:73:0x016c, B:93:0x022f, B:94:0x0236, B:95:0x0237, B:96:0x023e), top: B:241:0x00f1, outer: #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e() throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.mapsdk.core.render.egl.c.e():void");
    }

    private boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b3075204551a5122fb62313672fe69f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b3075204551a5122fb62313672fe69f")).booleanValue() : !this.h && this.o > 0 && this.p > 0 && (this.j || (this.i == 1 && !(this.b.g.isEmpty() && this.b.i == null)));
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e2dd1b6bc0513567efa89075a3c750d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e2dd1b6bc0513567efa89075a3c750d");
            return;
        }
        synchronized (d) {
            this.j = true;
            d.notifyAll();
        }
    }

    public final void a(Object obj, int i, int i2) {
        boolean z;
        Object[] objArr = {obj, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77c317cdb2d7f4f4544f59809796615d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77c317cdb2d7f4f4544f59809796615d");
            return;
        }
        synchronized (d) {
            if (i <= 0 || i2 <= 0) {
                return;
            }
            this.o = i;
            this.p = i2;
            this.b.g.add(obj);
            this.r = true;
            this.j = true;
            this.k = false;
            if (Thread.currentThread() == this) {
                return;
            }
            d.notifyAll();
            while (!this.f && !this.h && !this.k) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15396fb60a850d8d3bd59044e731d1d1", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15396fb60a850d8d3bd59044e731d1d1")).booleanValue();
                } else {
                    z = this.m && !this.b.f.isEmpty() && f();
                }
                if (!z) {
                    break;
                }
                try {
                    d.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.mapsdk.core.render.egl.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0606c {
        public static ChangeQuickRedirect a = null;
        private static String b = "GLThreadManager";

        public C0606c() {
        }

        public final synchronized void a(c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8834cdb7099041f0193c6d1eee6b7d8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8834cdb7099041f0193c6d1eee6b7d8");
                return;
            }
            c.a(cVar, true);
            notifyAll();
        }

        public final void b(c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d26e5a4fb31ba8fa43777a17f4db5de3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d26e5a4fb31ba8fa43777a17f4db5de3");
            } else {
                notifyAll();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        EGLSurface b;
        private int c;
        private int d;

        public a(EGLSurface eGLSurface, int i, int i2) {
            Object[] objArr = {eGLSurface, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f251375789f18ee0850513629f87895", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f251375789f18ee0850513629f87895");
                return;
            }
            this.b = eGLSurface;
            this.c = i;
            this.d = i2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        EGL10 b;
        EGLDisplay c;
        EGLConfig d;
        EGLContext e;
        public Map<Object, a> f;
        public Set<Object> g;
        public Set<Object> h;
        Object i;
        protected int j;
        private int[] k;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c2f110e6c107f6f91fcb3d19c8b8502", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c2f110e6c107f6f91fcb3d19c8b8502");
                return;
            }
            this.k = new int[]{12344};
            this.f = new HashMap();
            this.g = new LinkedHashSet();
            this.h = new LinkedHashSet();
        }

        public final boolean a(int i, int i2) {
            boolean z = false;
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "854da527bcc1c2eb661be229d747679a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "854da527bcc1c2eb661be229d747679a")).booleanValue();
            }
            if (this.g.isEmpty()) {
                return false;
            }
            for (Object obj : this.g) {
                z = a(obj, i, i2);
                if (z) {
                    this.i = obj;
                }
            }
            this.g.clear();
            return z;
        }

        private boolean a(Object obj, int i, int i2) {
            Object[] objArr = {obj, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23b8252641e66942e55308c588541f27", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23b8252641e66942e55308c588541f27")).booleanValue();
            }
            if (this.b == null) {
                throw new RuntimeException("MTMAP GLThread egl not initialized");
            }
            if (this.c == null) {
                throw new RuntimeException("MTMAP GLThread eglDisplay not initialized");
            }
            if (this.d == null) {
                throw new RuntimeException("MTMAP GLThread mEglConfig not initialized");
            }
            a aVar = this.f.get(obj);
            if (aVar != null && aVar.b != null && aVar.b != EGL10.EGL_NO_SURFACE) {
                a(obj);
            }
            EGLSurface eGLSurface = null;
            synchronized (c.d) {
                if (obj != null) {
                    try {
                        eGLSurface = this.b.eglCreateWindowSurface(this.c, this.d, obj, this.k);
                    } catch (Exception e) {
                        new StringBuilder("eglCreateWindowSurface ").append(e.getMessage());
                        return false;
                    }
                }
            }
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.b.eglGetError() == 12299) {
                    Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            } else if (!this.b.eglMakeCurrent(this.c, eGLSurface, eGLSurface, this.e)) {
                a("EGLHelper", "eglMakeCurrent", this.b.eglGetError());
                return false;
            } else {
                this.f.put(obj, new a(eGLSurface, i, i2));
                return true;
            }
        }

        public final GL a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1180f0b5099ff49e8d9f2a73006dce7", RobustBitConfig.DEFAULT_VALUE)) {
                return (GL) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1180f0b5099ff49e8d9f2a73006dce7");
            }
            GL gl = this.e.getGL();
            if ((this.j & 3) != 0) {
                return GLDebugHelper.wrap(gl, (this.j & 1) != 0 ? 1 : 0, (this.j & 2) != 0 ? new d() : null);
            }
            return gl;
        }

        void a(Object obj) {
            EGLSurface eGLSurface;
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1614a2cd5c457dc94a4fbea43eb72165", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1614a2cd5c457dc94a4fbea43eb72165");
                return;
            }
            a aVar = this.f.get(obj);
            if (aVar == null || (eGLSurface = aVar.b) == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                return;
            }
            EGL10 egl10 = this.b;
            EGLDisplay eGLDisplay = this.c;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            this.b.eglDestroySurface(this.c, eGLSurface);
            this.f.remove(obj);
        }

        public static void a(String str, String str2, int i) {
            Object[] objArr = {str, str2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4d60cfbf0d7be76f5bb20848c93486c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4d60cfbf0d7be76f5bb20848c93486c");
            } else {
                a(str2, i);
            }
        }

        public static String a(String str, int i) {
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a28f566c4734d19d3489454010846b8d", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a28f566c4734d19d3489454010846b8d");
            }
            return "MTMap GLThread " + str + " failed: " + com.sankuai.meituan.mapsdk.core.render.egl.b.a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class d extends Writer {
        public static ChangeQuickRedirect a;
        private StringBuilder b;

        public d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a74b69dd311a6ceb119df9c0f79905d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a74b69dd311a6ceb119df9c0f79905d");
            } else {
                this.b = new StringBuilder();
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "272a3d09673c3efa9b1faaa7b125d75c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "272a3d09673c3efa9b1faaa7b125d75c");
            } else {
                a();
            }
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29095f703c2fc58069b4bbfbbc57cb99", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29095f703c2fc58069b4bbfbbc57cb99");
            } else {
                a();
            }
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            Object[] objArr = {cArr, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bcfe4d78496fb88d294424b42f685b6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bcfe4d78496fb88d294424b42f685b6");
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    a();
                } else {
                    this.b.append(c);
                }
            }
        }

        private void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "794eae9fc387ceb50b86cf1415693f6e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "794eae9fc387ceb50b86cf1415693f6e");
            } else if (this.b.length() > 0) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.a(this.b.toString());
                this.b.delete(0, this.b.length());
            }
        }
    }
}
