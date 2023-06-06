package com.dianping.imagemanager.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class c {
    public static ChangeQuickRedirect a = null;
    public static int b = 0;
    public static boolean c = false;
    public static long d;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(int i);
    }

    public static void a(final a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b361ad8938654f0839cc7743fb5548ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b361ad8938654f0839cc7743fb5548ed");
            return;
        }
        if (b <= 0) {
            int i = com.dianping.imagemanager.base.a.a().c() != null ? com.dianping.imagemanager.base.a.a().c().getInt("maxTextureSize", -1) : -1;
            if (i != -1) {
                b = i;
            }
        }
        if (b > 0) {
            aVar.a(b);
            return;
        }
        synchronized (c.class) {
            if (b <= 0) {
                synchronized (c.class) {
                    com.sankuai.android.jarvis.c.a("dpimage-decodeutils", new Runnable() { // from class: com.dianping.imagemanager.utils.c.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1feb4ab4b15a89bf1dfc9deeca4b96d7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1feb4ab4b15a89bf1dfc9deeca4b96d7");
                                return;
                            }
                            long currentTimeMillis = System.currentTimeMillis();
                            try {
                                EGL10 egl10 = (EGL10) EGLContext.getEGL();
                                EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                                egl10.eglInitialize(eglGetDisplay, new int[2]);
                                int[] iArr = new int[1];
                                egl10.eglGetConfigs(eglGetDisplay, null, 0, iArr);
                                EGLConfig[] eGLConfigArr = new EGLConfig[iArr[0]];
                                egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, iArr[0], iArr);
                                int[] iArr2 = new int[1];
                                int i2 = 0;
                                for (int i3 = 0; i3 < iArr[0]; i3++) {
                                    egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i3], 12332, iArr2);
                                    if (i2 < iArr2[0]) {
                                        i2 = iArr2[0];
                                    }
                                }
                                egl10.eglTerminate(eglGetDisplay);
                                c.c = true;
                                c.b = Math.max(i2, 2048);
                            } catch (Exception e) {
                                c.c = false;
                                c.b = 4096;
                                e.printStackTrace();
                            }
                            c.d = System.currentTimeMillis() - currentTimeMillis;
                            a.this.a(c.b);
                            com.dianping.imagemanager.base.a.a().c().edit().putInt("maxTextureSize", c.b);
                        }
                    }).start();
                }
            }
        }
    }
}
