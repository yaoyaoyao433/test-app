package com.dianping.video.videofilter.transcoder.engine;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import android.view.Surface;
import com.dianping.titans.service.FileUtil;
import com.dianping.video.log.c;
import com.dianping.video.model.d;
import com.dianping.video.videofilter.gpuimage.u;
import com.dianping.video.videofilter.gpuimage.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/* compiled from: ProGuard */
@TargetApi(17)
/* loaded from: classes.dex */
public final class j implements SurfaceTexture.OnFrameAvailableListener {
    public static ChangeQuickRedirect a;
    private static final float[] n = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    EGLDisplay b;
    EGLContext c;
    EGLSurface d;
    SurfaceTexture e;
    Surface f;
    m g;
    private boolean h;
    private Object i;
    private com.dianping.video.videofilter.gpuimage.c j;
    private Queue<Runnable> k;
    private com.dianping.video.videofilter.render.a l;
    private int m;
    private int o;
    private int p;
    private boolean q;
    private float[] r;
    private ByteBuffer s;

    public j(com.dianping.video.model.g gVar) {
        int a2;
        int i;
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe0c4e8dcb302b194f75dda4769dfbf6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe0c4e8dcb302b194f75dda4769dfbf6");
            return;
        }
        this.h = true;
        this.b = EGL14.EGL_NO_DISPLAY;
        this.c = EGL14.EGL_NO_CONTEXT;
        this.d = EGL14.EGL_NO_SURFACE;
        this.i = new Object();
        this.k = new LinkedList();
        this.m = -1;
        this.r = new float[16];
        Object[] objArr2 = {gVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0f2689262db67f45622aa5e4c578beec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0f2689262db67f45622aa5e4c578beec");
            return;
        }
        if (this.h) {
            Object[] objArr3 = {gVar};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5736601da6d62fc8df88fedf1c363cb8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5736601da6d62fc8df88fedf1c363cb8");
            } else {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glDisable(2929);
                com.dianping.video.model.d dVar = gVar.ab;
                if (dVar == null) {
                    dVar = new com.dianping.video.model.d();
                    dVar.l = "Nomal";
                }
                if (com.dianping.video.constant.b.a) {
                    dVar.i = true;
                    dVar.g = true;
                }
                dVar.c = gVar.h;
                dVar.b = gVar.g;
                dVar.d = gVar.e;
                dVar.e = gVar.f;
                dVar.k = u.a(gVar.c);
                if (dVar.j == null) {
                    dVar.j = d.a.CENTER_CROP;
                }
                ArrayList<ArrayList<com.dianping.video.model.c>> arrayList = gVar.aa;
                Object[] objArr4 = {arrayList};
                ChangeQuickRedirect changeQuickRedirect4 = com.dianping.video.model.d.a;
                com.dianping.video.videofilter.renderformat.e eVar = null;
                if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "07a28b21182ba14e0941dbda08cef77f", RobustBitConfig.DEFAULT_VALUE)) {
                    eVar = (com.dianping.video.videofilter.renderformat.e) PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "07a28b21182ba14e0941dbda08cef77f");
                } else {
                    com.dianping.video.log.c.a().a("RenderStrategyModel", dVar.toString());
                    if ("Nomal".equals(dVar.l)) {
                        Object[] objArr5 = {dVar, arrayList};
                        ChangeQuickRedirect changeQuickRedirect5 = com.dianping.video.videofilter.renderformat.f.a;
                        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "972677b0d0622b0456cb538d94170fc3", RobustBitConfig.DEFAULT_VALUE)) {
                            eVar = (com.dianping.video.videofilter.renderformat.e) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "972677b0d0622b0456cb538d94170fc3");
                        } else {
                            FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(com.dianping.video.constant.a.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                            FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(v.b.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                            com.dianping.video.videofilter.renderformat.f.a(asFloatBuffer, asFloatBuffer2, dVar, "createVideoRenderNomalStrategy");
                            com.dianping.video.model.b bVar = new com.dianping.video.model.b();
                            bVar.b = asFloatBuffer;
                            bVar.c = asFloatBuffer2;
                            bVar.d = new ArrayList<>();
                            if (arrayList != null && arrayList.size() > 0) {
                                if (!(arrayList.get(0).get(0).c instanceof com.dianping.video.videofilter.gpuimage.e) && arrayList.get(0).get(0).b != com.dianping.video.videofilter.gpuimage.e.class) {
                                    bVar.d.add(new com.dianping.video.model.c(com.dianping.video.videofilter.gpuimage.e.class));
                                }
                                bVar.d.addAll(arrayList.get(0));
                            } else {
                                bVar.d.add(new com.dianping.video.model.c(com.dianping.video.videofilter.gpuimage.e.class));
                            }
                            eVar = new com.dianping.video.videofilter.renderformat.c();
                            eVar.a(new com.dianping.video.model.b[]{bVar});
                            eVar.d = dVar;
                        }
                    } else if ("1x2".equals(dVar.l)) {
                        Object[] objArr6 = {dVar};
                        ChangeQuickRedirect changeQuickRedirect6 = com.dianping.video.videofilter.renderformat.f.a;
                        if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "0efc7c6663f22fbe52bc6ee5116921a8", RobustBitConfig.DEFAULT_VALUE)) {
                            eVar = (com.dianping.video.videofilter.renderformat.e) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "0efc7c6663f22fbe52bc6ee5116921a8");
                        } else {
                            FloatBuffer asFloatBuffer3 = ByteBuffer.allocateDirect(com.dianping.video.constant.a.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                            FloatBuffer asFloatBuffer4 = ByteBuffer.allocateDirect(v.b.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                            com.dianping.video.model.b bVar2 = new com.dianping.video.model.b();
                            bVar2.b = asFloatBuffer3;
                            bVar2.c = asFloatBuffer4;
                            bVar2.d = new ArrayList<>();
                            bVar2.d.add(new com.dianping.video.model.c(com.dianping.video.videofilter.gpuimage.e.class));
                            FloatBuffer asFloatBuffer5 = ByteBuffer.allocateDirect(com.dianping.video.constant.a.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                            FloatBuffer asFloatBuffer6 = ByteBuffer.allocateDirect(v.b.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                            com.dianping.video.model.b bVar3 = new com.dianping.video.model.b();
                            bVar3.b = asFloatBuffer5;
                            bVar3.c = asFloatBuffer6;
                            bVar3.d = new ArrayList<>();
                            bVar3.d.add(new com.dianping.video.model.c(com.dianping.video.videofilter.gpuimage.e.class));
                            com.dianping.video.videofilter.renderformat.f.a(asFloatBuffer3, asFloatBuffer4, asFloatBuffer5, asFloatBuffer6, dVar);
                            com.dianping.video.model.b[] bVarArr = {bVar2, bVar3};
                            eVar = new com.dianping.video.videofilter.renderformat.a();
                            eVar.a(bVarArr);
                            eVar.d = dVar;
                        }
                    } else if ("2x2".equals(dVar.l)) {
                        Object[] objArr7 = {dVar};
                        ChangeQuickRedirect changeQuickRedirect7 = com.dianping.video.videofilter.renderformat.f.a;
                        if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "7c8bf8064df097e0b5d6f395a3e97e93", RobustBitConfig.DEFAULT_VALUE)) {
                            eVar = (com.dianping.video.videofilter.renderformat.e) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "7c8bf8064df097e0b5d6f395a3e97e93");
                        } else {
                            FloatBuffer asFloatBuffer7 = ByteBuffer.allocateDirect(v.b.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                            com.dianping.video.videofilter.renderformat.f.a(asFloatBuffer7, dVar);
                            FloatBuffer asFloatBuffer8 = ByteBuffer.allocateDirect(com.dianping.video.constant.a.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                            asFloatBuffer8.put(com.dianping.video.constant.a.b).position(0);
                            com.dianping.video.model.b bVar4 = new com.dianping.video.model.b();
                            bVar4.b = asFloatBuffer8;
                            bVar4.c = asFloatBuffer7;
                            bVar4.d = new ArrayList<>();
                            bVar4.d.add(new com.dianping.video.model.c(com.dianping.video.videofilter.gpuimage.e.class));
                            FloatBuffer asFloatBuffer9 = ByteBuffer.allocateDirect(com.dianping.video.constant.a.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                            asFloatBuffer9.put(com.dianping.video.constant.a.c).position(0);
                            com.dianping.video.model.b bVar5 = new com.dianping.video.model.b();
                            bVar5.b = asFloatBuffer9;
                            bVar5.c = asFloatBuffer7;
                            bVar5.d = new ArrayList<>();
                            bVar5.d.add(new com.dianping.video.model.c(com.dianping.video.videofilter.gpuimage.e.class));
                            FloatBuffer asFloatBuffer10 = ByteBuffer.allocateDirect(com.dianping.video.constant.a.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                            asFloatBuffer10.put(com.dianping.video.constant.a.d).position(0);
                            com.dianping.video.model.b bVar6 = new com.dianping.video.model.b();
                            bVar6.b = asFloatBuffer10;
                            bVar6.c = asFloatBuffer7;
                            bVar6.d = new ArrayList<>();
                            bVar6.d.add(new com.dianping.video.model.c(com.dianping.video.videofilter.gpuimage.e.class));
                            FloatBuffer asFloatBuffer11 = ByteBuffer.allocateDirect(com.dianping.video.constant.a.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                            asFloatBuffer11.put(com.dianping.video.constant.a.e).position(0);
                            com.dianping.video.model.b bVar7 = new com.dianping.video.model.b();
                            bVar7.b = asFloatBuffer11;
                            bVar7.c = asFloatBuffer7;
                            bVar7.d = new ArrayList<>();
                            bVar7.d.add(new com.dianping.video.model.c(com.dianping.video.videofilter.gpuimage.e.class));
                            com.dianping.video.model.b[] bVarArr2 = {bVar4, bVar5, bVar6, bVar7};
                            eVar = new com.dianping.video.videofilter.renderformat.b();
                            eVar.a(bVarArr2);
                            eVar.d = dVar;
                        }
                    } else if ("PIP".equals(dVar.l)) {
                        Object[] objArr8 = {dVar};
                        ChangeQuickRedirect changeQuickRedirect8 = com.dianping.video.videofilter.renderformat.f.a;
                        if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "b25c1a21fa52f93ff9744dda869fa2b0", RobustBitConfig.DEFAULT_VALUE)) {
                            eVar = (com.dianping.video.videofilter.renderformat.e) PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "b25c1a21fa52f93ff9744dda869fa2b0");
                        } else {
                            FloatBuffer asFloatBuffer12 = ByteBuffer.allocateDirect(com.dianping.video.constant.a.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                            FloatBuffer asFloatBuffer13 = ByteBuffer.allocateDirect(v.b.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                            com.dianping.video.model.b bVar8 = new com.dianping.video.model.b();
                            bVar8.b = asFloatBuffer12;
                            bVar8.c = asFloatBuffer13;
                            bVar8.d = new ArrayList<>();
                            bVar8.d.add(new com.dianping.video.model.c(com.dianping.video.videofilter.gpuimage.e.class));
                            FloatBuffer asFloatBuffer14 = ByteBuffer.allocateDirect(com.dianping.video.constant.a.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                            FloatBuffer asFloatBuffer15 = ByteBuffer.allocateDirect(v.b.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                            com.dianping.video.model.b bVar9 = new com.dianping.video.model.b();
                            bVar9.b = asFloatBuffer14;
                            bVar9.c = asFloatBuffer15;
                            bVar9.d = new ArrayList<>();
                            bVar9.d.add(new com.dianping.video.model.c(com.dianping.video.videofilter.gpuimage.e.class));
                            com.dianping.video.videofilter.renderformat.f.b(asFloatBuffer12, asFloatBuffer13, asFloatBuffer14, asFloatBuffer15, dVar);
                            com.dianping.video.model.b[] bVarArr3 = {bVar8, bVar9};
                            eVar = new com.dianping.video.videofilter.renderformat.d();
                            eVar.a(bVarArr3);
                            eVar.d = dVar;
                        }
                    } else if (!"abstract".equals(dVar.l)) {
                        throw new RuntimeException("renderType (" + dVar.l + ") not supported");
                    }
                }
                this.l = new com.dianping.video.videofilter.render.a(eVar);
                this.l.h = this.r;
                this.l.a();
                a(this.l.d);
                this.o = gVar.g;
                this.p = gVar.h;
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                GLES20.glBindTexture(36197, iArr[0]);
                GLES20.glTexParameterf(36197, 10241, 9728.0f);
                GLES20.glTexParameterf(36197, FileUtil.DEFAULT_STREAM_BUFFER_SIZE, 9729.0f);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                this.e = new SurfaceTexture(iArr[0]);
                this.m = iArr[0];
                Matrix.setIdentityM(this.r, 0);
            }
        } else {
            this.g = new m();
            m mVar = this.g;
            Object[] objArr9 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect9 = m.a;
            if (PatchProxy.isSupport(objArr9, mVar, changeQuickRedirect9, false, "68c9b9182b0d03b4380ea865ace12199", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr9, mVar, changeQuickRedirect9, false, "68c9b9182b0d03b4380ea865ace12199");
            } else {
                Object[] objArr10 = {"uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"};
                ChangeQuickRedirect changeQuickRedirect10 = m.a;
                if (PatchProxy.isSupport(objArr10, mVar, changeQuickRedirect10, false, "ded92efd1714a7e5657db5e7b5e0c643", RobustBitConfig.DEFAULT_VALUE)) {
                    i = ((Integer) PatchProxy.accessDispatch(objArr10, mVar, changeQuickRedirect10, false, "ded92efd1714a7e5657db5e7b5e0c643")).intValue();
                } else {
                    int a3 = mVar.a(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                    if (a3 == 0 || (a2 = mVar.a(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n")) == 0) {
                        i = 0;
                    } else {
                        int glCreateProgram = GLES20.glCreateProgram();
                        mVar.a("glCreateProgram");
                        if (glCreateProgram == 0) {
                            Log.e("TextureRender", "Could not create program");
                        }
                        GLES20.glAttachShader(glCreateProgram, a3);
                        mVar.a("glAttachShader");
                        GLES20.glAttachShader(glCreateProgram, a2);
                        mVar.a("glAttachShader");
                        GLES20.glLinkProgram(glCreateProgram);
                        int[] iArr2 = new int[1];
                        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
                        if (iArr2[0] != 1) {
                            Log.e("TextureRender", "Could not link program: ");
                            Log.e("TextureRender", GLES20.glGetProgramInfoLog(glCreateProgram));
                            GLES20.glDeleteProgram(glCreateProgram);
                            glCreateProgram = 0;
                        }
                        i = glCreateProgram;
                    }
                }
                mVar.e = i;
                if (mVar.e == 0) {
                    throw new RuntimeException("failed creating program");
                }
                mVar.i = GLES20.glGetAttribLocation(mVar.e, "aPosition");
                mVar.a("glGetAttribLocation aPosition");
                if (mVar.i == -1) {
                    throw new RuntimeException("Could not get attrib location for aPosition");
                }
                mVar.j = GLES20.glGetAttribLocation(mVar.e, "aTextureCoord");
                mVar.a("glGetAttribLocation aTextureCoord");
                if (mVar.j == -1) {
                    throw new RuntimeException("Could not get attrib location for aTextureCoord");
                }
                mVar.g = GLES20.glGetUniformLocation(mVar.e, "uMVPMatrix");
                mVar.a("glGetUniformLocation uMVPMatrix");
                if (mVar.g == -1) {
                    throw new RuntimeException("Could not get attrib location for uMVPMatrix");
                }
                mVar.h = GLES20.glGetUniformLocation(mVar.e, "uSTMatrix");
                mVar.a("glGetUniformLocation uSTMatrix");
                if (mVar.h == -1) {
                    throw new RuntimeException("Could not get attrib location for uSTMatrix");
                }
                int[] iArr3 = new int[1];
                GLES20.glGenTextures(1, iArr3, 0);
                mVar.f = iArr3[0];
                GLES20.glBindTexture(36197, mVar.f);
                mVar.a("glBindTexture mTextureID");
                GLES20.glTexParameterf(36197, 10241, 9729.0f);
                GLES20.glTexParameterf(36197, FileUtil.DEFAULT_STREAM_BUFFER_SIZE, 9729.0f);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                mVar.a("glTexParameter");
            }
            this.e = new SurfaceTexture(this.g.f);
        }
        this.e.setOnFrameAvailableListener(this);
        this.f = new Surface(this.e);
        this.s = ByteBuffer.allocateDirect(this.o * this.p * 4);
        this.s.order(ByteOrder.LITTLE_ENDIAN);
    }

    private void a(com.dianping.video.videofilter.gpuimage.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95c6db0acddc58266b5dfe1be0e62081", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95c6db0acddc58266b5dfe1be0e62081");
        } else if (gVar != null) {
            for (com.dianping.video.videofilter.gpuimage.f fVar : gVar.i()) {
                if (fVar instanceof com.dianping.video.videofilter.gpuimage.c) {
                    this.j = (com.dianping.video.videofilter.gpuimage.c) fVar;
                    return;
                }
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e75a58c70037950386cc5cc847b2a3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e75a58c70037950386cc5cc847b2a3b");
            return;
        }
        synchronized (this.i) {
            while (!this.q) {
                try {
                    this.i.wait(10000L);
                    if (!this.q) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.q = false;
        }
        this.e.updateTexImage();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcc8761e5d8d3f01f6d045138a2fe423", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcc8761e5d8d3f01f6d045138a2fe423");
            return;
        }
        GLES20.glClear(16640);
        Queue<Runnable> queue = this.k;
        Object[] objArr2 = {queue};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d8d29f7afe2156d3a832c5bacf44d021", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d8d29f7afe2156d3a832c5bacf44d021");
        } else if (!queue.isEmpty()) {
            synchronized (queue) {
                while (!queue.isEmpty()) {
                    queue.poll().run();
                }
            }
        }
        if (!this.h) {
            m mVar = this.g;
            SurfaceTexture surfaceTexture = this.e;
            Object[] objArr3 = {surfaceTexture};
            ChangeQuickRedirect changeQuickRedirect3 = m.a;
            if (PatchProxy.isSupport(objArr3, mVar, changeQuickRedirect3, false, "9a1eb7651bd44519ba346b2002cc1dec", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, mVar, changeQuickRedirect3, false, "9a1eb7651bd44519ba346b2002cc1dec");
                return;
            }
            mVar.a("onDrawFrame start");
            surfaceTexture.getTransformMatrix(mVar.d);
            GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
            GLES20.glClear(16640);
            GLES20.glUseProgram(mVar.e);
            mVar.a("glUseProgram");
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, mVar.f);
            mVar.b.position(0);
            GLES20.glVertexAttribPointer(mVar.i, 3, 5126, false, 20, (Buffer) mVar.b);
            mVar.a("glVertexAttribPointer maPosition");
            GLES20.glEnableVertexAttribArray(mVar.i);
            mVar.a("glEnableVertexAttribArray maPositionHandle");
            mVar.b.position(3);
            GLES20.glVertexAttribPointer(mVar.j, 2, 5126, false, 20, (Buffer) mVar.b);
            mVar.a("glVertexAttribPointer maTextureHandle");
            GLES20.glEnableVertexAttribArray(mVar.j);
            mVar.a("glEnableVertexAttribArray maTextureHandle");
            Matrix.setIdentityM(mVar.c, 0);
            GLES20.glUniformMatrix4fv(mVar.g, 1, false, mVar.c, 0);
            GLES20.glUniformMatrix4fv(mVar.h, 1, false, mVar.d, 0);
            GLES20.glDrawArrays(5, 0, 4);
            mVar.a("glDrawArrays");
            GLES20.glFinish();
            return;
        }
        if (com.dianping.video.constant.b.a) {
            this.e.getTransformMatrix(this.r);
        }
        com.dianping.video.videofilter.render.a aVar = this.l;
        int i = this.m;
        int i2 = this.o;
        int i3 = this.p;
        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect4 = com.dianping.video.videofilter.render.a.a;
        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "766d67fb838fccb0a927b937835c0984", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "766d67fb838fccb0a927b937835c0984");
        } else if (aVar.d != null) {
            aVar.a(aVar.g);
            if (!aVar.b) {
                Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect5 = com.dianping.video.videofilter.render.a.a;
                if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "f0cfb4d020fa56e7e93d73f3c1411668", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "f0cfb4d020fa56e7e93d73f3c1411668");
                } else {
                    Object[] objArr6 = {Integer.valueOf(i2), Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect6 = com.dianping.video.videofilter.render.a.a;
                    if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "b249af3ce3a632093532d586ed73a819", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "b249af3ce3a632093532d586ed73a819");
                    } else if (aVar.e.d.b != i2 || aVar.e.d.c != i3) {
                        aVar.b();
                        aVar.e.a(aVar.e.d, i2, i3);
                        aVar.e.d.b = i2;
                        aVar.e.d.c = i3;
                        com.dianping.video.log.c.a().a("FrameRenderUnit", "canvas size is Changed,updateCoordinate");
                    }
                    if (aVar.d != null && !aVar.b) {
                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                        GLES20.glDisable(2929);
                        aVar.d.b();
                        GLES20.glUseProgram(aVar.d.h());
                        aVar.d.a(i2, i3);
                        aVar.b = true;
                        com.dianping.video.log.c.a().a("FrameRenderUnit", "resumeRender");
                    }
                }
            }
            int i4 = 0;
            while (i4 < aVar.e.a().length) {
                if (aVar.e instanceof com.dianping.video.videofilter.renderformat.c) {
                    aVar.d.a(i, aVar.e.a()[i4].b, aVar.e.a()[i4].c);
                } else if (aVar.c) {
                    aVar.d.a(i, aVar.e.a()[i4].b, aVar.e.a()[i4].c, aVar.f.get(aVar.e.a()[i4]), i4 == aVar.e.a().length - 1);
                } else {
                    aVar.d.a(i, aVar.e.a()[i4].b, aVar.e.a()[i4].c, aVar.f.get(aVar.e.a()[i4]));
                }
                i4++;
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Object[] objArr = {surfaceTexture};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56101b2209452d39299b66280f617c43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56101b2209452d39299b66280f617c43");
            return;
        }
        synchronized (this.i) {
            if (this.q) {
                throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
            }
            this.q = true;
            this.i.notifyAll();
        }
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7409fe532dbfa571e288ec122fe1e479", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7409fe532dbfa571e288ec122fe1e479");
        } else if (this.j != null) {
            this.j.a(f);
            if (f == 0.0f) {
                a(this.j);
                this.j = null;
            }
        }
    }

    public final void a(com.dianping.video.videofilter.gpuimage.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "749ae4bb65c325acd2fb569cb9b62620", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "749ae4bb65c325acd2fb569cb9b62620");
        } else {
            this.l.a(0, fVar);
        }
    }

    public final void a(int i, final int i2, com.dianping.video.videofilter.gpuimage.f fVar) {
        Object[] objArr = {0, Integer.valueOf(i2), fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c0207a651e8c7e68033557499da260b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c0207a651e8c7e68033557499da260b");
            return;
        }
        final com.dianping.video.videofilter.render.a aVar = this.l;
        Object[] objArr2 = {0, Integer.valueOf(i2), fVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.video.videofilter.render.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "fef9715d2d6b446282859702b9c525f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "fef9715d2d6b446282859702b9c525f5");
            return;
        }
        final com.dianping.video.model.c cVar = new com.dianping.video.model.c();
        cVar.c = fVar;
        Object[] objArr3 = {0, Integer.valueOf(i2), cVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.dianping.video.videofilter.render.a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "522367c9f7308630570b5ecd82d9092e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "522367c9f7308630570b5ecd82d9092e");
        } else {
            aVar.a(new Runnable() { // from class: com.dianping.video.videofilter.render.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "69f601ad145ba7bd836656038e8df2fe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "69f601ad145ba7bd836656038e8df2fe");
                        return;
                    }
                    c.a().a("FrameRenderUnit", "addRenderFilter");
                    aVar.b();
                    aVar.e.a(r2, i2, cVar);
                    aVar.a();
                }
            });
        }
    }
}
