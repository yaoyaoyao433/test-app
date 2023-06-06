package com.dianping.video.template;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.widget.Toast;
import com.dianping.video.template.decoder.d;
import com.dianping.video.template.process.c;
import com.dianping.video.videofilter.transcoder.engine.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TemplateVideoPreviewView extends TextureView implements TextureView.SurfaceTextureListener {
    public static ChangeQuickRedirect a;
    private boolean A;
    private boolean B;
    private com.dianping.video.template.render.b C;
    private final a D;
    private final ThreadPoolExecutor E;
    private final Runnable F;
    private final Runnable G;
    private final Runnable H;
    public long b;
    private Surface c;
    private e d;
    private AudioTrack e;
    private boolean f;
    private int g;
    private int h;
    private long i;
    private long j;
    private boolean k;
    private boolean l;
    private volatile int m;
    private volatile int n;
    private final Object o;
    private final Object p;
    private final Object q;
    private c r;
    private com.dianping.video.template.process.a s;
    private long t;
    private long u;
    private long v;
    private com.dianping.video.template.model.c w;
    private int x;
    private int y;
    private b z;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public static /* synthetic */ void D(TemplateVideoPreviewView templateVideoPreviewView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, templateVideoPreviewView, changeQuickRedirect, false, "a6372ea3ad500f2922bf38d7a66654b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, templateVideoPreviewView, changeQuickRedirect, false, "a6372ea3ad500f2922bf38d7a66654b0");
            return;
        }
        try {
            templateVideoPreviewView.k = false;
            templateVideoPreviewView.e.stop();
            templateVideoPreviewView.e.release();
            com.dianping.video.template.process.a aVar = templateVideoPreviewView.s;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.video.template.process.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "f7b1ff5813af8e2ac69399dd31c39087", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "f7b1ff5813af8e2ac69399dd31c39087");
            } else {
                aVar.b.c();
            }
            templateVideoPreviewView.m = 5;
            templateVideoPreviewView.c();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ void E(TemplateVideoPreviewView templateVideoPreviewView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, templateVideoPreviewView, changeQuickRedirect, false, "d2433f29d700bef157f00737ae60aa48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, templateVideoPreviewView, changeQuickRedirect, false, "d2433f29d700bef157f00737ae60aa48");
        }
    }

    public static /* synthetic */ void a(TemplateVideoPreviewView templateVideoPreviewView, Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, templateVideoPreviewView, changeQuickRedirect, false, "426d2fba556deef102d6cbcef7413056", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, templateVideoPreviewView, changeQuickRedirect, false, "426d2fba556deef102d6cbcef7413056");
            return;
        }
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static /* synthetic */ void a(TemplateVideoPreviewView templateVideoPreviewView, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, templateVideoPreviewView, changeQuickRedirect, false, "67745861fb1c110e1897c029d035c608", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, templateVideoPreviewView, changeQuickRedirect, false, "67745861fb1c110e1897c029d035c608");
        } else {
            Toast.makeText(templateVideoPreviewView.getContext(), str, 0).show();
        }
    }

    public static /* synthetic */ boolean a(TemplateVideoPreviewView templateVideoPreviewView, boolean z) {
        templateVideoPreviewView.B = false;
        return false;
    }

    public static /* synthetic */ boolean b(TemplateVideoPreviewView templateVideoPreviewView, boolean z) {
        templateVideoPreviewView.l = true;
        return true;
    }

    public static /* synthetic */ int c(TemplateVideoPreviewView templateVideoPreviewView, int i) {
        templateVideoPreviewView.h = 0;
        return 0;
    }

    public static /* synthetic */ void c(TemplateVideoPreviewView templateVideoPreviewView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, templateVideoPreviewView, changeQuickRedirect, false, "92d23fd4b64f089ceeb07814afbeb48b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, templateVideoPreviewView, changeQuickRedirect, false, "92d23fd4b64f089ceeb07814afbeb48b");
            return;
        }
        synchronized (templateVideoPreviewView.q) {
            try {
                templateVideoPreviewView.q.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static /* synthetic */ boolean c(TemplateVideoPreviewView templateVideoPreviewView, boolean z) {
        templateVideoPreviewView.k = true;
        return true;
    }

    public static /* synthetic */ void e(TemplateVideoPreviewView templateVideoPreviewView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, templateVideoPreviewView, changeQuickRedirect, false, "0c3ca17fd3205d21d85ef43aabf07891", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, templateVideoPreviewView, changeQuickRedirect, false, "0c3ca17fd3205d21d85ef43aabf07891");
            return;
        }
        templateVideoPreviewView.g = 2;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, templateVideoPreviewView, changeQuickRedirect2, false, "380bbd92a418561974e14f91c9d203ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, templateVideoPreviewView, changeQuickRedirect2, false, "380bbd92a418561974e14f91c9d203ae");
        } else {
            templateVideoPreviewView.x = templateVideoPreviewView.w.c;
            templateVideoPreviewView.y = templateVideoPreviewView.w.b;
            templateVideoPreviewView.r = new c(templateVideoPreviewView.w.a(), templateVideoPreviewView.w.b(), templateVideoPreviewView.x, templateVideoPreviewView.y);
            templateVideoPreviewView.s = new com.dianping.video.template.process.a(templateVideoPreviewView.w.a(), templateVideoPreviewView.w.c());
            templateVideoPreviewView.t = templateVideoPreviewView.w.d * 1000;
            templateVideoPreviewView.B = true;
            templateVideoPreviewView.i = 0L;
            templateVideoPreviewView.j = 0L;
            templateVideoPreviewView.u = 0L;
            templateVideoPreviewView.v = 0L;
        }
        templateVideoPreviewView.E.execute(templateVideoPreviewView.H);
        templateVideoPreviewView.E.execute(templateVideoPreviewView.G);
    }

    public static /* synthetic */ void h(TemplateVideoPreviewView templateVideoPreviewView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, templateVideoPreviewView, changeQuickRedirect, false, "c1680661d62e5e0769715ac8ff7b5efe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, templateVideoPreviewView, changeQuickRedirect, false, "c1680661d62e5e0769715ac8ff7b5efe");
            return;
        }
        templateVideoPreviewView.B = false;
        templateVideoPreviewView.A = false;
        templateVideoPreviewView.a();
    }

    public static /* synthetic */ void p(TemplateVideoPreviewView templateVideoPreviewView) {
        int a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, templateVideoPreviewView, changeQuickRedirect, false, "f737c1c68c4814de4e4a09f1a882db35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, templateVideoPreviewView, changeQuickRedirect, false, "f737c1c68c4814de4e4a09f1a882db35");
            return;
        }
        GLES20.glViewport(0, 0, templateVideoPreviewView.x, templateVideoPreviewView.y);
        templateVideoPreviewView.r.a(templateVideoPreviewView.u);
        c cVar = templateVideoPreviewView.r;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "6b9ed48a53e96eaedc236d4236ccbb59", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = ((Integer) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "6b9ed48a53e96eaedc236d4236ccbb59")).intValue();
        } else {
            com.dianping.codelog.b.a(c.class, "process", "now pts = " + cVar.g);
            for (com.dianping.video.template.render.model.c cVar2 : cVar.d) {
                StringBuilder sb = new StringBuilder("process : ");
                sb.append(cVar2.e());
                sb.append(" : ");
                sb.append(cVar.g);
                while (cVar2.a(cVar.g)) {
                    new StringBuilder("stepPipeline start : texture pts = ").append(cVar2.f());
                    cVar.b.get(cVar2.e()).b();
                }
                com.dianping.codelog.b.a(c.class, "process", "Video renderInfo = " + cVar2.e() + " : texture pts = " + cVar2.f());
            }
            if (cVar.c != null && cVar.f != null) {
                StringBuilder sb2 = new StringBuilder("process : effect : ");
                sb2.append(cVar.f.e());
                sb2.append(" : ");
                sb2.append(cVar.g);
                while (cVar.f.a(cVar.g)) {
                    cVar.c.get(cVar.f.e()).b();
                }
                com.dianping.codelog.b.a(c.class, "process", "Effect renderInfo = " + cVar.f.e() + " : texture pts = " + cVar.f.f());
            }
            a2 = cVar.e.a(cVar.g);
        }
        Object[] objArr3 = {Integer.valueOf(a2)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, templateVideoPreviewView, changeQuickRedirect3, false, "761e6e77c6b495b2ce8ec2bf8c96356c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, templateVideoPreviewView, changeQuickRedirect3, false, "761e6e77c6b495b2ce8ec2bf8c96356c");
        } else {
            templateVideoPreviewView.j = templateVideoPreviewView.a(templateVideoPreviewView.o, templateVideoPreviewView.j, templateVideoPreviewView.u);
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, templateVideoPreviewView, changeQuickRedirect4, false, "18250392367f3ed4510aba4a2634f92b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, templateVideoPreviewView, changeQuickRedirect4, false, "18250392367f3ed4510aba4a2634f92b");
            } else if (templateVideoPreviewView.x * templateVideoPreviewView.getMeasuredHeight() > templateVideoPreviewView.y * templateVideoPreviewView.getMeasuredWidth()) {
                int measuredWidth = templateVideoPreviewView.getMeasuredWidth();
                int measuredWidth2 = (templateVideoPreviewView.getMeasuredWidth() * templateVideoPreviewView.y) / templateVideoPreviewView.x;
                GLES20.glViewport(0, (templateVideoPreviewView.getMeasuredHeight() - measuredWidth2) / 2, measuredWidth, measuredWidth2);
            } else {
                int height = (templateVideoPreviewView.getHeight() * templateVideoPreviewView.x) / templateVideoPreviewView.y;
                GLES20.glViewport((templateVideoPreviewView.getMeasuredWidth() - height) / 2, 0, height, templateVideoPreviewView.getHeight());
            }
            Object[] objArr5 = {Integer.valueOf(a2)};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, templateVideoPreviewView, changeQuickRedirect5, false, "6986417f01d568ce293f5d66c1f8f221", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, templateVideoPreviewView, changeQuickRedirect5, false, "6986417f01d568ce293f5d66c1f8f221");
            } else {
                if (templateVideoPreviewView.C == null) {
                    templateVideoPreviewView.C = new com.dianping.video.template.render.b(templateVideoPreviewView.x, templateVideoPreviewView.y, null, null);
                }
                com.dianping.video.template.render.b bVar = templateVideoPreviewView.C;
                Object[] objArr6 = {Integer.valueOf(a2)};
                ChangeQuickRedirect changeQuickRedirect6 = com.dianping.video.template.render.b.a;
                if (PatchProxy.isSupport(objArr6, bVar, changeQuickRedirect6, false, "c58134f95ea9b61498db29eb88a59729", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, bVar, changeQuickRedirect6, false, "c58134f95ea9b61498db29eb88a59729");
                } else {
                    bVar.b.a(a2, bVar.d, bVar.e);
                    if (bVar.c != null) {
                        bVar.c.i();
                    }
                }
            }
            templateVideoPreviewView.d.a(templateVideoPreviewView.u * 1000);
            templateVideoPreviewView.d.b();
            templateVideoPreviewView.D.sendEmptyMessage(0);
        }
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = a;
        if (PatchProxy.isSupport(objArr7, templateVideoPreviewView, changeQuickRedirect7, false, "9ecfb0846639e655824382e161357be8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, templateVideoPreviewView, changeQuickRedirect7, false, "9ecfb0846639e655824382e161357be8");
        } else {
            templateVideoPreviewView.u = com.dianping.video.template.utils.a.a(templateVideoPreviewView.u, 30);
        }
    }

    public static /* synthetic */ void v(TemplateVideoPreviewView templateVideoPreviewView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, templateVideoPreviewView, changeQuickRedirect, false, "bd4b009b8bd5c0a5e7c157e8e945a026", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, templateVideoPreviewView, changeQuickRedirect, false, "bd4b009b8bd5c0a5e7c157e8e945a026");
            return;
        }
        try {
            templateVideoPreviewView.l = false;
            c cVar = templateVideoPreviewView.r;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "72a3c336e03fe7770be466478b459642", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "72a3c336e03fe7770be466478b459642");
            } else {
                for (d dVar : cVar.b.values()) {
                    dVar.c();
                }
                for (com.dianping.video.template.decoder.e eVar : cVar.c.values()) {
                    eVar.c();
                }
                cVar.d.clear();
                cVar.e.a();
                com.dianping.video.template.process.b bVar = cVar.e;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.dianping.video.template.process.b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "220e98c07248a6043ae84553969052b2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "220e98c07248a6043ae84553969052b2");
                } else {
                    bVar.c.a();
                    bVar.a();
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.dianping.video.template.process.b.a;
                    if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "128efdb5cf82b0c0f4082f9b6dcb9e44", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "128efdb5cf82b0c0f4082f9b6dcb9e44");
                    } else {
                        for (com.dianping.video.template.render.a aVar : bVar.d.values()) {
                            aVar.a();
                        }
                        bVar.d.clear();
                    }
                }
            }
            if (templateVideoPreviewView.C != null) {
                com.dianping.video.template.render.b bVar2 = templateVideoPreviewView.C;
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = com.dianping.video.template.render.b.a;
                if (PatchProxy.isSupport(objArr5, bVar2, changeQuickRedirect5, false, "3e232e6936b9a68db8685290e62fb85f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, bVar2, changeQuickRedirect5, false, "3e232e6936b9a68db8685290e62fb85f");
                } else {
                    bVar2.b.d();
                    if (bVar2.c != null) {
                        bVar2.c.d();
                    }
                }
                templateVideoPreviewView.C = null;
            }
            e eVar2 = templateVideoPreviewView.d;
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = e.a;
            if (PatchProxy.isSupport(objArr6, eVar2, changeQuickRedirect6, false, "70c81f8a8e71d0c14b8f13d90154b7e3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, eVar2, changeQuickRedirect6, false, "70c81f8a8e71d0c14b8f13d90154b7e3");
            } else {
                if (eVar2.b != EGL14.EGL_NO_DISPLAY) {
                    EGL14.eglDestroySurface(eVar2.b, eVar2.d);
                    EGL14.eglDestroyContext(eVar2.b, eVar2.c);
                    EGL14.eglReleaseThread();
                    EGL14.eglTerminate(eVar2.b);
                }
                eVar2.b = EGL14.EGL_NO_DISPLAY;
                eVar2.c = EGL14.EGL_NO_CONTEXT;
                eVar2.d = EGL14.EGL_NO_SURFACE;
            }
            templateVideoPreviewView.n = 5;
            templateVideoPreviewView.c();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ void y(TemplateVideoPreviewView templateVideoPreviewView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, templateVideoPreviewView, changeQuickRedirect, false, "de6fbd7371a613d460487a4a79c7175e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, templateVideoPreviewView, changeQuickRedirect, false, "de6fbd7371a613d460487a4a79c7175e");
            return;
        }
        templateVideoPreviewView.e = new AudioTrack(3, 44100, 3, 2, AudioTrack.getMinBufferSize(44100, 3, 2), 1);
        templateVideoPreviewView.e.play();
    }

    public static /* synthetic */ void z(TemplateVideoPreviewView templateVideoPreviewView) {
        com.dianping.video.template.decoder.a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, templateVideoPreviewView, changeQuickRedirect, false, "cf285c1e08a7b4a366e6445b03a90fd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, templateVideoPreviewView, changeQuickRedirect, false, "cf285c1e08a7b4a366e6445b03a90fd8");
            return;
        }
        com.dianping.video.template.process.a aVar2 = templateVideoPreviewView.s;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.video.template.process.a.a;
        if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "275d5bb3e0afb7aa7be14ec87943913c", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (com.dianping.video.template.decoder.a) PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "275d5bb3e0afb7aa7be14ec87943913c");
        } else {
            do {
                aVar2.b.b();
            } while (aVar2.c == null);
            aVar = aVar2.c;
        }
        com.dianping.video.template.decoder.a aVar3 = aVar;
        Object[] objArr3 = {aVar3};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, templateVideoPreviewView, changeQuickRedirect3, false, "e08f5619fe0b1d59818faecc3509c898", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, templateVideoPreviewView, changeQuickRedirect3, false, "e08f5619fe0b1d59818faecc3509c898");
        } else {
            templateVideoPreviewView.v = aVar3.a;
            int capacity = aVar3.b.capacity();
            short[] sArr = new short[capacity];
            aVar3.b.position(0);
            aVar3.b.get(sArr, 0, capacity);
            aVar3.b.clear();
            templateVideoPreviewView.e.write(sArr, 0, capacity);
        }
        templateVideoPreviewView.i = templateVideoPreviewView.a(templateVideoPreviewView.p, templateVideoPreviewView.i, aVar3.a);
    }

    public TemplateVideoPreviewView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f23b47162ec5d6a6b607c7fc3e52fa51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f23b47162ec5d6a6b607c7fc3e52fa51");
        }
    }

    private TemplateVideoPreviewView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bb0231db4d350bd94b0803400cf5cce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bb0231db4d350bd94b0803400cf5cce");
        }
    }

    public TemplateVideoPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bb3e9a95def92dca1b2c064d44f8c87", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bb3e9a95def92dca1b2c064d44f8c87");
            return;
        }
        this.f = true;
        this.g = 0;
        this.h = 0;
        this.k = false;
        this.l = false;
        this.m = 0;
        this.n = 0;
        this.o = new Object();
        this.p = new Object();
        this.q = new Object();
        this.u = 0L;
        this.v = 0L;
        this.D = new a(this);
        this.E = new ThreadPoolExecutor(2, 2, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.F = new Runnable() { // from class: com.dianping.video.template.TemplateVideoPreviewView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6cbccf226fb20090efd80f4f27642f0f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6cbccf226fb20090efd80f4f27642f0f");
                    return;
                }
                while (TemplateVideoPreviewView.this.A) {
                    switch (TemplateVideoPreviewView.this.g) {
                        case 0:
                            com.dianping.codelog.b.a(TemplateVideoPreviewView.class, "mPreviewTask running", "status = STATUS_READY");
                            TemplateVideoPreviewView.c(TemplateVideoPreviewView.this);
                            break;
                        case 1:
                            com.dianping.codelog.b.a(TemplateVideoPreviewView.class, "mPreviewTask running", "status = STATUS_WAITING");
                            if (TemplateVideoPreviewView.this.c == null) {
                                com.dianping.codelog.b.a(TemplateVideoPreviewView.class, "mPreviewTask running", "status = STATUS_WAITING : mSurface == null");
                                TemplateVideoPreviewView.c(TemplateVideoPreviewView.this);
                            }
                            TemplateVideoPreviewView.e(TemplateVideoPreviewView.this);
                            break;
                        case 2:
                            com.dianping.codelog.b.a(TemplateVideoPreviewView.class, "mPreviewTask running", "status = STATUS_PLAYING");
                            TemplateVideoPreviewView.this.m = 0;
                            TemplateVideoPreviewView.this.n = 0;
                            TemplateVideoPreviewView.this.a();
                            TemplateVideoPreviewView.c(TemplateVideoPreviewView.this);
                            break;
                        case 3:
                            com.dianping.codelog.b.a(TemplateVideoPreviewView.class, "mPreviewTask running", "status = STATUS_PAUSE");
                            TemplateVideoPreviewView.this.m = 1;
                            TemplateVideoPreviewView.this.n = 1;
                            TemplateVideoPreviewView.this.a();
                            TemplateVideoPreviewView.c(TemplateVideoPreviewView.this);
                            break;
                        case 4:
                            com.dianping.codelog.b.a(TemplateVideoPreviewView.class, "mPreviewTask running", "status = STATUS_ERROR");
                            TemplateVideoPreviewView.a(TemplateVideoPreviewView.this, false);
                            Message message = new Message();
                            message.what = 1;
                            message.obj = "解码出错";
                            TemplateVideoPreviewView.this.D.sendMessage(message);
                            TemplateVideoPreviewView.c(TemplateVideoPreviewView.this);
                            break;
                        case 5:
                            com.dianping.codelog.b.a(TemplateVideoPreviewView.class, "mPreviewTask running", "status = STATUS_END");
                            if (!TemplateVideoPreviewView.this.f) {
                                TemplateVideoPreviewView.this.g = 6;
                                break;
                            } else {
                                TemplateVideoPreviewView.c(TemplateVideoPreviewView.this, 0);
                                TemplateVideoPreviewView.this.b = 0L;
                                TemplateVideoPreviewView.this.g = 8;
                                break;
                            }
                        case 6:
                            com.dianping.codelog.b.a(TemplateVideoPreviewView.class, "mPreviewTask running", "status = STATUS_RELEASE");
                            TemplateVideoPreviewView.h(TemplateVideoPreviewView.this);
                            break;
                        case 7:
                            com.dianping.codelog.b.a(TemplateVideoPreviewView.class, "mPreviewTask running", "status = STATUS_UPDATE");
                            TemplateVideoPreviewView.a(TemplateVideoPreviewView.this, false);
                            TemplateVideoPreviewView.this.a();
                            TemplateVideoPreviewView.c(TemplateVideoPreviewView.this);
                            break;
                        case 8:
                            com.dianping.codelog.b.a(TemplateVideoPreviewView.class, "mPreviewTask running", "status = STATUS_SEEKING");
                            TemplateVideoPreviewView.this.m = 2;
                            TemplateVideoPreviewView.this.n = 2;
                            TemplateVideoPreviewView.this.a();
                            TemplateVideoPreviewView.c(TemplateVideoPreviewView.this);
                            break;
                    }
                }
            }
        };
        this.G = new Runnable() { // from class: com.dianping.video.template.TemplateVideoPreviewView.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f0e82a61732707f2bd1507f01f5b7bc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f0e82a61732707f2bd1507f01f5b7bc");
                    return;
                }
                while (TemplateVideoPreviewView.this.B) {
                    try {
                        switch (TemplateVideoPreviewView.this.n) {
                            case 0:
                                if (!TemplateVideoPreviewView.this.l) {
                                    TemplateVideoPreviewView.this.d = new e(TemplateVideoPreviewView.this.c);
                                    TemplateVideoPreviewView.this.d.a();
                                    TemplateVideoPreviewView.this.n = 0;
                                    TemplateVideoPreviewView.b(TemplateVideoPreviewView.this, true);
                                }
                                if (TemplateVideoPreviewView.this.u > TemplateVideoPreviewView.this.t) {
                                    TemplateVideoPreviewView.this.n = 4;
                                    break;
                                } else {
                                    TemplateVideoPreviewView.p(TemplateVideoPreviewView.this);
                                    break;
                                }
                            case 1:
                                com.dianping.codelog.b.a(TemplateVideoPreviewView.class, "videoTask running", "state = TASK_STATE_PAUSE");
                                TemplateVideoPreviewView.a(TemplateVideoPreviewView.this, TemplateVideoPreviewView.this.G);
                                TemplateVideoPreviewView.this.j = (System.nanoTime() / 1000) - TemplateVideoPreviewView.this.u;
                                break;
                            case 2:
                                com.dianping.codelog.b.a(TemplateVideoPreviewView.class, "videoTask running", "state = TASK_STATE_SEEKING");
                                TemplateVideoPreviewView.this.u = TemplateVideoPreviewView.this.b;
                                TemplateVideoPreviewView.this.j = (System.nanoTime() / 1000) - TemplateVideoPreviewView.this.u;
                                c cVar = TemplateVideoPreviewView.this.r;
                                long j = TemplateVideoPreviewView.this.u;
                                Object[] objArr3 = {new Long(j)};
                                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "c19037a4f15e3a49c9ed3d9d194d877e", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "c19037a4f15e3a49c9ed3d9d194d877e");
                                } else {
                                    cVar.a(j);
                                    for (com.dianping.video.template.render.model.c cVar2 : cVar.d) {
                                        cVar.b.get(cVar2.e()).a(cVar2.d(j));
                                        cVar2.b();
                                    }
                                    if (cVar.c != null && cVar.f != null) {
                                        cVar.c.get(cVar.f.e()).a(j);
                                        cVar.f.b();
                                    }
                                }
                                TemplateVideoPreviewView.p(TemplateVideoPreviewView.this);
                                TemplateVideoPreviewView.this.n = 3;
                                break;
                            case 3:
                                synchronized (TemplateVideoPreviewView.this.G) {
                                    com.dianping.codelog.b.a(TemplateVideoPreviewView.class, "videoTask running", "state = TASK_STATE_SEEKEND");
                                    TemplateVideoPreviewView.this.d();
                                    if (TemplateVideoPreviewView.this.n == 3) {
                                        TemplateVideoPreviewView.a(TemplateVideoPreviewView.this, TemplateVideoPreviewView.this.G);
                                    }
                                }
                                TemplateVideoPreviewView.this.j = (System.nanoTime() / 1000) - TemplateVideoPreviewView.this.u;
                                break;
                            case 4:
                                synchronized (TemplateVideoPreviewView.this.G) {
                                    com.dianping.codelog.b.a(TemplateVideoPreviewView.class, "videoTask running", "state = TASK_STATE_END");
                                    TemplateVideoPreviewView.this.b();
                                    if (TemplateVideoPreviewView.this.n == 4) {
                                        TemplateVideoPreviewView.a(TemplateVideoPreviewView.this, TemplateVideoPreviewView.this.G);
                                    }
                                }
                                break;
                        }
                    } catch (Exception e) {
                        com.dianping.codelog.b.b(TemplateVideoPreviewView.class, "video preview error : " + e.getMessage());
                        synchronized (TemplateVideoPreviewView.this.q) {
                            TemplateVideoPreviewView.this.g = 4;
                            TemplateVideoPreviewView.this.q.notify();
                        }
                    }
                }
                TemplateVideoPreviewView.v(TemplateVideoPreviewView.this);
            }
        };
        this.H = new Runnable() { // from class: com.dianping.video.template.TemplateVideoPreviewView.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82f2a50ebfd86e9c95c7d93e70197189", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82f2a50ebfd86e9c95c7d93e70197189");
                    return;
                }
                while (TemplateVideoPreviewView.this.B) {
                    try {
                        switch (TemplateVideoPreviewView.this.m) {
                            case 0:
                                if (!TemplateVideoPreviewView.this.k) {
                                    TemplateVideoPreviewView.y(TemplateVideoPreviewView.this);
                                    TemplateVideoPreviewView.c(TemplateVideoPreviewView.this, true);
                                }
                                TemplateVideoPreviewView.z(TemplateVideoPreviewView.this);
                                if (TemplateVideoPreviewView.this.v <= TemplateVideoPreviewView.this.t && !TemplateVideoPreviewView.this.s.d) {
                                    break;
                                } else {
                                    TemplateVideoPreviewView.this.m = 4;
                                    break;
                                }
                                break;
                            case 1:
                                com.dianping.codelog.b.a(TemplateVideoPreviewView.class, "audioTask running", "state = TASK_STATE_PAUSE");
                                TemplateVideoPreviewView.a(TemplateVideoPreviewView.this, TemplateVideoPreviewView.this.H);
                                TemplateVideoPreviewView.this.i = (System.nanoTime() / 1000) - TemplateVideoPreviewView.this.v;
                                break;
                            case 2:
                                com.dianping.codelog.b.a(TemplateVideoPreviewView.class, "audioTask running", "state = TASK_STATE_SEEKING");
                                TemplateVideoPreviewView.this.i = (System.nanoTime() / 1000) - TemplateVideoPreviewView.this.b;
                                com.dianping.video.template.process.a aVar = TemplateVideoPreviewView.this.s;
                                long j = TemplateVideoPreviewView.this.b;
                                Object[] objArr3 = {new Long(j)};
                                ChangeQuickRedirect changeQuickRedirect3 = com.dianping.video.template.process.a.a;
                                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "d73fba10db1b723a4639a74127337514", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "d73fba10db1b723a4639a74127337514");
                                } else {
                                    aVar.d = false;
                                    aVar.b.a(j);
                                    aVar.c = null;
                                }
                                TemplateVideoPreviewView.z(TemplateVideoPreviewView.this);
                                TemplateVideoPreviewView.this.m = 3;
                                break;
                            case 3:
                                synchronized (TemplateVideoPreviewView.this.H) {
                                    com.dianping.codelog.b.a(TemplateVideoPreviewView.class, "audioTask running", "state = TASK_STATE_SEEKEND");
                                    TemplateVideoPreviewView.this.d();
                                    if (TemplateVideoPreviewView.this.m == 3) {
                                        TemplateVideoPreviewView.a(TemplateVideoPreviewView.this, TemplateVideoPreviewView.this.H);
                                    }
                                }
                                TemplateVideoPreviewView.this.i = (System.nanoTime() / 1000) - TemplateVideoPreviewView.this.v;
                                break;
                            case 4:
                                synchronized (TemplateVideoPreviewView.this.H) {
                                    com.dianping.codelog.b.a(TemplateVideoPreviewView.class, "audioTask running", "state = TASK_STATE_END");
                                    TemplateVideoPreviewView.this.b();
                                    if (TemplateVideoPreviewView.this.m == 4) {
                                        TemplateVideoPreviewView.a(TemplateVideoPreviewView.this, TemplateVideoPreviewView.this.H);
                                    }
                                }
                                break;
                        }
                    } catch (Exception e) {
                        com.dianping.codelog.b.b(TemplateVideoPreviewView.class, "video preview error : " + e.getMessage());
                        synchronized (TemplateVideoPreviewView.this.q) {
                            TemplateVideoPreviewView.this.g = 4;
                            TemplateVideoPreviewView.this.q.notify();
                        }
                    }
                }
                TemplateVideoPreviewView.D(TemplateVideoPreviewView.this);
            }
        };
        setSurfaceTextureListener(this);
    }

    public void setData(com.dianping.video.template.model.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4f695e4bb68c8dde64a071dce0309b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4f695e4bb68c8dde64a071dce0309b9");
            return;
        }
        com.dianping.codelog.b.a(TemplateVideoPreviewView.class, "setData");
        this.w = cVar;
        this.A = true;
        com.dianping.video.template.utils.c.a(getContext());
        new Thread(this.F).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb5bf622b4f6660c014d9fdd5ec101df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb5bf622b4f6660c014d9fdd5ec101df");
            return;
        }
        synchronized (this.H) {
            this.H.notify();
        }
        synchronized (this.G) {
            this.G.notify();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "036ac55801d5e889189a89dac43b99cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "036ac55801d5e889189a89dac43b99cd");
            return;
        }
        StringBuilder sb = new StringBuilder("previewEnd : mVideoTaskState = ");
        sb.append(this.n);
        sb.append(" : mAudioTaskState = ");
        sb.append(this.m);
        com.dianping.codelog.b.a(TemplateVideoPreviewView.class, "previewEnd : mVideoTaskState = " + this.n + " : mAudioTaskState = " + this.m);
        if (this.n == 4 && this.m == 4) {
            synchronized (this.q) {
                this.g = 5;
                this.q.notify();
            }
        }
    }

    private synchronized void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3b2e9ef6d2f88240a340b29392513a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3b2e9ef6d2f88240a340b29392513a7");
            return;
        }
        com.dianping.codelog.b.a(TemplateVideoPreviewView.class, "previewRelease : mVideoTaskState = " + this.n + " : mAudioTaskState = " + this.m);
        if (this.n == 5 && this.m == 5) {
            synchronized (this.q) {
                if (this.g == 7) {
                    this.g = 1;
                    this.q.notify();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b00c7aae1179b2caf95fabb52cf77c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b00c7aae1179b2caf95fabb52cf77c0");
            return;
        }
        StringBuilder sb = new StringBuilder("previewSeekEnd : mVideoTaskState = ");
        sb.append(this.n);
        sb.append(" : mAudioTaskState = ");
        sb.append(this.m);
        com.dianping.codelog.b.a(TemplateVideoPreviewView.class, "previewSeekEnd : mVideoTaskState = " + this.n + " : mAudioTaskState = " + this.m);
        if (this.n == 3 && this.m == 3) {
            synchronized (this.q) {
                if (this.h == 1) {
                    this.g = 3;
                } else {
                    this.g = 2;
                }
                this.q.notify();
            }
        }
    }

    private long a(Object obj, long j, long j2) {
        Object[] objArr = {obj, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e61a662ddfa0fc2a4fa075427da9b3c3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e61a662ddfa0fc2a4fa075427da9b3c3")).longValue();
        }
        if (j > 0) {
            long nanoTime = System.nanoTime();
            while (true) {
                long j3 = j2 - ((nanoTime / 1000) - j);
                if (j3 <= 0) {
                    return j;
                }
                synchronized (obj) {
                    try {
                        obj.wait(j3 / 1000, (int) ((j3 % 1000) * 1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                nanoTime = System.nanoTime();
            }
        } else {
            return System.nanoTime() / 1000;
        }
    }

    public void setLooping(boolean z) {
        this.f = z;
    }

    public void setStatusListener(b bVar) {
        this.z = bVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Object[] objArr = {surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d2ec2d86382295259c5eaa093852c85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d2ec2d86382295259c5eaa093852c85");
            return;
        }
        this.c = new Surface(surfaceTexture);
        synchronized (this.q) {
            if (this.g == 1) {
                this.q.notify();
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Object[] objArr = {surfaceTexture};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34f6d283b62fc42f625fceb344c325b8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34f6d283b62fc42f625fceb344c325b8")).booleanValue();
        }
        if (this.c != null) {
            this.c.release();
            this.c = null;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a extends Handler {
        public static ChangeQuickRedirect a;
        private WeakReference<TemplateVideoPreviewView> b;

        public a(TemplateVideoPreviewView templateVideoPreviewView) {
            Object[] objArr = {templateVideoPreviewView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1f978a018fadd9e1ab28b114433e2bc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1f978a018fadd9e1ab28b114433e2bc");
            } else {
                this.b = new WeakReference<>(templateVideoPreviewView);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f267db8f90056c258ef00016caff161e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f267db8f90056c258ef00016caff161e");
                return;
            }
            TemplateVideoPreviewView templateVideoPreviewView = this.b.get();
            if (templateVideoPreviewView == null) {
                return;
            }
            if (message.what == 0) {
                TemplateVideoPreviewView.E(templateVideoPreviewView);
            } else if (message.what == 1) {
                TemplateVideoPreviewView.a(templateVideoPreviewView, (String) message.obj);
            }
        }
    }
}
