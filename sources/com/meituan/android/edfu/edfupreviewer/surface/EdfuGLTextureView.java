package com.meituan.android.edfu.edfupreviewer.surface;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.AttributeSet;
import android.view.TextureView;
import com.meituan.android.edfu.edfupreviewer.api.b;
import com.meituan.android.edfu.edfupreviewer.eglcore.EglCore;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class EdfuGLTextureView extends TextureView {
    public static ChangeQuickRedirect a = null;
    private static final String d = "EdfuGLTextureView";
    protected f b;
    protected SurfaceTexture c;
    private int e;
    private a f;
    private b.a g;

    public EdfuGLTextureView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18c730a3bbd6ff78f54a312688f22c63", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18c730a3bbd6ff78f54a312688f22c63");
        }
    }

    private EdfuGLTextureView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87da8bb5abdff7a9b848f03341a240ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87da8bb5abdff7a9b848f03341a240ad");
        }
    }

    public EdfuGLTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aba492b8cb033ca024e89c9c4d1a5bcf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aba492b8cb033ca024e89c9c4d1a5bcf");
            return;
        }
        this.e = -1;
        setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: com.meituan.android.edfu.edfupreviewer.surface.EdfuGLTextureView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                Object[] objArr2 = {surfaceTexture, Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9abb220629d639fa03fc6c8e7388765", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9abb220629d639fa03fc6c8e7388765");
                } else if (EdfuGLTextureView.this.f != null) {
                    String unused = EdfuGLTextureView.d;
                } else {
                    String unused2 = EdfuGLTextureView.d;
                    EdfuGLTextureView.this.f = new a("Renderer Thread", new WeakReference(EdfuGLTextureView.this));
                    EdfuGLTextureView.this.f.start();
                    EdfuGLTextureView.this.e = com.meituan.android.edfu.edfupreviewer.eglcore.a.a();
                    EdfuGLTextureView.this.c = new SurfaceTexture(EdfuGLTextureView.this.e);
                    if (EdfuGLTextureView.this.b != null) {
                        EdfuGLTextureView.this.f.a();
                    }
                    EdfuGLTextureView.this.f.b();
                    if (EdfuGLTextureView.this.c != null) {
                        EdfuGLTextureView.this.f.c();
                    }
                    if (EdfuGLTextureView.this.g != null) {
                        EdfuGLTextureView.this.g.a(EdfuGLTextureView.this.c);
                    }
                    if (EdfuGLTextureView.this.f != null) {
                        EdfuGLTextureView.this.f.c();
                    }
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
                Object[] objArr2 = {surfaceTexture, Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a23efaa59f3478abc143f42546bf2786", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a23efaa59f3478abc143f42546bf2786");
                    return;
                }
                if (EdfuGLTextureView.this.f != null) {
                    EdfuGLTextureView.this.f.b();
                }
                if (EdfuGLTextureView.this.g != null) {
                    b.a unused = EdfuGLTextureView.this.g;
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                Object[] objArr2 = {surfaceTexture};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0aef4785b7c9ed4df414004c052772ce", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0aef4785b7c9ed4df414004c052772ce")).booleanValue();
                }
                String unused = EdfuGLTextureView.d;
                if (EdfuGLTextureView.this.f != null) {
                    a aVar = EdfuGLTextureView.this.f;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "920f23fcc87bbb2341b1948dbe45498f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "920f23fcc87bbb2341b1948dbe45498f");
                    } else if (aVar.b != null) {
                        aVar.b.sendEmptyMessage(5);
                    }
                    EdfuGLTextureView.this.f.quitSafely();
                    EdfuGLTextureView.this.f = null;
                }
                if (EdfuGLTextureView.this.g != null) {
                    b.a unused2 = EdfuGLTextureView.this.g;
                }
                return true;
            }
        });
    }

    public void setRenderer(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3568e22d985699e0460a661e6171fb76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3568e22d985699e0460a661e6171fb76");
        } else if (this.b == dVar) {
        } else {
            this.b = dVar;
            if (this.f != null) {
                this.f.a();
            }
        }
    }

    public void setSurfaceListener(b.a aVar) {
        this.g = aVar;
    }

    public void setBufferTexture(SurfaceTexture surfaceTexture) {
        Object[] objArr = {surfaceTexture};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c28a988238717fadf8e0c9f83fc3d542", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c28a988238717fadf8e0c9f83fc3d542");
        } else if (this.c == surfaceTexture) {
        } else {
            this.c = surfaceTexture;
            if (this.f != null) {
                this.f.c();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class a extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {
        public static ChangeQuickRedirect a;
        Handler b;
        private final WeakReference<EdfuGLTextureView> c;
        private final float[] d;
        private final EglCore e;
        private int f;

        private a(String str, WeakReference<EdfuGLTextureView> weakReference) {
            super(str);
            Object[] objArr = {str, weakReference};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fcd5ab3ec7a1d738aa5d2433078b158", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fcd5ab3ec7a1d738aa5d2433078b158");
                return;
            }
            this.d = new float[16];
            this.e = new EglCore();
            this.c = weakReference;
        }

        @Override // java.lang.Thread
        public final synchronized void start() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e76cbbdfc089c5bf8315bbda89b1f706", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e76cbbdfc089c5bf8315bbda89b1f706");
                return;
            }
            super.start();
            this.b = new Handler(getLooper(), this);
            this.b.sendEmptyMessage(0);
        }

        @Override // android.os.HandlerThread
        public final boolean quitSafely() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa0240033e375e0ac9e06f360bbde2d9", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa0240033e375e0ac9e06f360bbde2d9")).booleanValue();
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a6626c1873e141d8c916dabe6f1f98d8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a6626c1873e141d8c916dabe6f1f98d8");
            } else {
                if (this.b != null) {
                    this.b.removeMessages(0);
                    this.b.removeMessages(1);
                    this.b.removeMessages(2);
                    this.b.removeMessages(3);
                    this.b.removeMessages(4);
                }
                try {
                    this.e.b();
                } catch (Exception e) {
                    e.printStackTrace();
                    com.meituan.android.edfu.utils.c a2 = com.meituan.android.edfu.utils.c.a();
                    a2.a("Preview", "release：" + e.getMessage());
                }
            }
            return super.quitSafely();
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            EGLConfig eGLConfig;
            SurfaceTexture surfaceTexture;
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46ea2fedb79ebff859847543580bf5a8", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46ea2fedb79ebff859847543580bf5a8")).booleanValue();
            }
            switch (message.what) {
                case 0:
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "abaa319d6e8ed6a9115aab88548c353d", RobustBitConfig.DEFAULT_VALUE)) {
                        EdfuGLTextureView edfuGLTextureView = this.c.get();
                        if (edfuGLTextureView != null) {
                            try {
                                EglCore eglCore = this.e;
                                SurfaceTexture surfaceTexture2 = edfuGLTextureView.getSurfaceTexture();
                                Object[] objArr3 = {surfaceTexture2, null};
                                ChangeQuickRedirect changeQuickRedirect3 = EglCore.a;
                                if (PatchProxy.isSupport(objArr3, eglCore, changeQuickRedirect3, false, "4243923948e874696a872489c867f337", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, eglCore, changeQuickRedirect3, false, "4243923948e874696a872489c867f337");
                                    break;
                                } else {
                                    EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
                                    Object[] objArr4 = {surfaceTexture2, eGLContext};
                                    ChangeQuickRedirect changeQuickRedirect4 = EglCore.a;
                                    if (PatchProxy.isSupport(objArr4, eglCore, changeQuickRedirect4, false, "09248c683914e5b5fecd83ca0643158c", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, eglCore, changeQuickRedirect4, false, "09248c683914e5b5fecd83ca0643158c");
                                        break;
                                    } else {
                                        eglCore.c = EGL14.eglGetDisplay(0);
                                        if (eglCore.c == EGL14.EGL_NO_DISPLAY) {
                                            throw new RuntimeException("eglGetDisplay failed");
                                        }
                                        int[] iArr = new int[2];
                                        if (!EGL14.eglInitialize(eglCore.c, iArr, 0, iArr, 1)) {
                                            eglCore.c = null;
                                            throw new RuntimeException("eglInitialize failed");
                                        }
                                        Object[] objArr5 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect5 = EglCore.a;
                                        if (PatchProxy.isSupport(objArr5, eglCore, changeQuickRedirect5, false, "910026478b40dbfbd4b28004fe2fbbb8", RobustBitConfig.DEFAULT_VALUE)) {
                                            eGLConfig = (EGLConfig) PatchProxy.accessDispatch(objArr5, eglCore, changeQuickRedirect5, false, "910026478b40dbfbd4b28004fe2fbbb8");
                                        } else {
                                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                                            if (!EGL14.eglChooseConfig(eglCore.c, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, eglCore.b >= 3 ? 68 : 4, 12344, 0, 12338, 1, 12337, 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                                                StringBuilder sb = new StringBuilder("unable to find RGB8888 / ");
                                                sb.append(eglCore.b);
                                                sb.append(" EGLConfig");
                                                eGLConfig = null;
                                            } else {
                                                eGLConfig = eGLConfigArr[0];
                                            }
                                        }
                                        if (eGLConfig == null) {
                                            throw new RuntimeException("Cannot find suitable config.");
                                        }
                                        EGLContext eglCreateContext = EGL14.eglCreateContext(eglCore.c, eGLConfig, eGLContext, new int[]{12440, eglCore.b, 12344}, 0);
                                        if (EGL14.eglGetError() == 12288) {
                                            eglCore.d = eglCreateContext;
                                            eglCore.e = EGL14.eglCreateWindowSurface(eglCore.c, eGLConfig, surfaceTexture2, new int[]{12344}, 0);
                                            if (eglCore.e == null || eglCore.e == EGL14.EGL_NO_SURFACE) {
                                                throw new RuntimeException("createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                                            }
                                            eglCore.a();
                                            break;
                                        } else {
                                            throw new RuntimeException("Create EGLContext failed.");
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                                com.meituan.android.edfu.utils.c a2 = com.meituan.android.edfu.utils.c.a();
                                a2.a("Preview", "preformCreateEGL：" + e.getMessage());
                                break;
                            }
                        }
                    } else {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "abaa319d6e8ed6a9115aab88548c353d");
                        break;
                    }
                    break;
                case 1:
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (!PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "bd91c39030074e264c3938d8b8c28782", RobustBitConfig.DEFAULT_VALUE)) {
                        EdfuGLTextureView edfuGLTextureView2 = this.c.get();
                        if (edfuGLTextureView2 != null) {
                            edfuGLTextureView2.b.a(this.e.d);
                            break;
                        }
                    } else {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "bd91c39030074e264c3938d8b8c28782");
                        break;
                    }
                    break;
                case 2:
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (!PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "47be7d1833298b858f5e8c562029b5c3", RobustBitConfig.DEFAULT_VALUE)) {
                        EdfuGLTextureView edfuGLTextureView3 = this.c.get();
                        if (edfuGLTextureView3 != null) {
                            edfuGLTextureView3.b.a(edfuGLTextureView3.getWidth(), edfuGLTextureView3.getHeight());
                            break;
                        }
                    } else {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "47be7d1833298b858f5e8c562029b5c3");
                        break;
                    }
                    break;
                case 3:
                    Object[] objArr8 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (!PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "cb795e440be473370456fcd529bc98cf", RobustBitConfig.DEFAULT_VALUE)) {
                        EdfuGLTextureView edfuGLTextureView4 = this.c.get();
                        if (edfuGLTextureView4 != null) {
                            SurfaceTexture surfaceTexture3 = edfuGLTextureView4.c;
                            this.f = edfuGLTextureView4.e;
                            surfaceTexture3.setOnFrameAvailableListener(this);
                            break;
                        }
                    } else {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "cb795e440be473370456fcd529bc98cf");
                        break;
                    }
                    break;
                case 4:
                    Object[] objArr9 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (!PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "c0f024e03a10f8f1ff94c9c9515ba003", RobustBitConfig.DEFAULT_VALUE)) {
                        EdfuGLTextureView edfuGLTextureView5 = this.c.get();
                        if (edfuGLTextureView5 != null) {
                            try {
                                this.e.a();
                                SurfaceTexture surfaceTexture4 = edfuGLTextureView5.c;
                                f fVar = edfuGLTextureView5.b;
                                if (surfaceTexture4 != null) {
                                    surfaceTexture4.updateTexImage();
                                    surfaceTexture4.getTransformMatrix(this.d);
                                }
                                if (fVar != null) {
                                    fVar.a(this.f, this.d);
                                }
                                EglCore eglCore2 = this.e;
                                Object[] objArr10 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect10 = EglCore.a;
                                if (!PatchProxy.isSupport(objArr10, eglCore2, changeQuickRedirect10, false, "63ca3e0e3934640ab5dcbce28e8220a8", RobustBitConfig.DEFAULT_VALUE)) {
                                    EGL14.eglSwapBuffers(eglCore2.c, eglCore2.e);
                                    break;
                                } else {
                                    ((Boolean) PatchProxy.accessDispatch(objArr10, eglCore2, changeQuickRedirect10, false, "63ca3e0e3934640ab5dcbce28e8220a8")).booleanValue();
                                    break;
                                }
                            } catch (Throwable th) {
                                th.printStackTrace();
                                com.meituan.android.edfu.utils.c a3 = com.meituan.android.edfu.utils.c.a();
                                a3.a("Preview", "performDrawTexture：" + th.getMessage());
                                break;
                            }
                        }
                    } else {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "c0f024e03a10f8f1ff94c9c9515ba003");
                        break;
                    }
                    break;
                case 5:
                    Object[] objArr11 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect11 = a;
                    if (!PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "c413ba4f5f9e4b4a7c84c84b0347a41c", RobustBitConfig.DEFAULT_VALUE)) {
                        String unused = EdfuGLTextureView.d;
                        EdfuGLTextureView edfuGLTextureView6 = this.c.get();
                        if (edfuGLTextureView6 != null && (surfaceTexture = edfuGLTextureView6.c) != null) {
                            surfaceTexture.setOnFrameAvailableListener(null);
                            break;
                        }
                    } else {
                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "c413ba4f5f9e4b4a7c84c84b0347a41c");
                        break;
                    }
                    break;
            }
            return false;
        }

        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
            Object[] objArr = {surfaceTexture};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b20ee40482f88816e971142fd04b4887", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b20ee40482f88816e971142fd04b4887");
            } else if (this.b != null) {
                this.b.sendEmptyMessage(4);
            }
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "331eae51ddbcf805e82f1ae5bd90dccd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "331eae51ddbcf805e82f1ae5bd90dccd");
            } else if (this.b != null) {
                this.b.sendEmptyMessage(1);
            }
        }

        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06a06dc2b2ec54527cce097f2a538744", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06a06dc2b2ec54527cce097f2a538744");
            } else if (this.b != null) {
                this.b.sendEmptyMessage(2);
            }
        }

        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa638d7a89877fb8f527d529b4e289c6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa638d7a89877fb8f527d529b4e289c6");
            } else if (this.b != null) {
                this.b.removeMessages(3);
                this.b.sendEmptyMessage(3);
            }
        }
    }
}
