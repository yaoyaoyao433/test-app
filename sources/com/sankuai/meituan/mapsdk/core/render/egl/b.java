package com.sankuai.meituan.mapsdk.core.render.egl;

import android.opengl.GLException;
import com.meituan.android.common.metricx.config.MetricXConfigBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.imui.controller.group.bean.GroupAnnouncement;
import java.io.IOException;
import java.io.Writer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGL11;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements EGL11 {
    public static ChangeQuickRedirect a;
    public Writer b;
    public boolean c;
    public boolean d;
    private EGL10 e;
    private int f;

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglChooseConfig(EGLDisplay eGLDisplay, int[] iArr, EGLConfig[] eGLConfigArr, int i, int[] iArr2) {
        Object[] objArr = {eGLDisplay, iArr, eGLConfigArr, Integer.valueOf(i), iArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5413c948419f2de6f1bfe4301a4e499c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5413c948419f2de6f1bfe4301a4e499c")).booleanValue();
        }
        c("eglChooseConfig");
        a("display", eGLDisplay);
        a("attrib_list", iArr);
        a("config_size", i);
        b();
        boolean eglChooseConfig = this.e.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, i, iArr2);
        a("configs", (Object[]) eGLConfigArr);
        a("num_config", iArr2);
        a(eglChooseConfig);
        a();
        return eglChooseConfig;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglCopyBuffers(EGLDisplay eGLDisplay, EGLSurface eGLSurface, Object obj) {
        Object[] objArr = {eGLDisplay, eGLSurface, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a56ad41b4165348daef247bb00924bea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a56ad41b4165348daef247bb00924bea")).booleanValue();
        }
        c("eglCopyBuffers");
        a("display", eGLDisplay);
        a("surface", eGLSurface);
        a("native_pixmap", obj);
        b();
        boolean eglCopyBuffers = this.e.eglCopyBuffers(eGLDisplay, eGLSurface, obj);
        a(eglCopyBuffers);
        a();
        return eglCopyBuffers;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final EGLContext eglCreateContext(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int[] iArr) {
        Object[] objArr = {eGLDisplay, eGLConfig, eGLContext, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7be51b687848195a11ea2e213f76b135", RobustBitConfig.DEFAULT_VALUE)) {
            return (EGLContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7be51b687848195a11ea2e213f76b135");
        }
        c("eglCreateContext");
        a("display", eGLDisplay);
        a("config", eGLConfig);
        a("share_context", eGLContext);
        a("attrib_list", iArr);
        b();
        EGLContext eglCreateContext = this.e.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        a(eglCreateContext);
        a();
        return eglCreateContext;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final EGLSurface eglCreatePbufferSurface(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int[] iArr) {
        Object[] objArr = {eGLDisplay, eGLConfig, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c0fbe6241b4cb2fdba57305430d938a", RobustBitConfig.DEFAULT_VALUE)) {
            return (EGLSurface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c0fbe6241b4cb2fdba57305430d938a");
        }
        c("eglCreatePbufferSurface");
        a("display", eGLDisplay);
        a("config", eGLConfig);
        a("attrib_list", iArr);
        b();
        EGLSurface eglCreatePbufferSurface = this.e.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr);
        a(eglCreatePbufferSurface);
        a();
        return eglCreatePbufferSurface;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final EGLSurface eglCreatePixmapSurface(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj, int[] iArr) {
        Object[] objArr = {eGLDisplay, eGLConfig, obj, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a02aa0de392e98a621b723420e626d13", RobustBitConfig.DEFAULT_VALUE)) {
            return (EGLSurface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a02aa0de392e98a621b723420e626d13");
        }
        c("eglCreatePixmapSurface");
        a("display", eGLDisplay);
        a("config", eGLConfig);
        a("native_pixmap", obj);
        a("attrib_list", iArr);
        b();
        EGLSurface eglCreatePixmapSurface = this.e.eglCreatePixmapSurface(eGLDisplay, eGLConfig, obj, iArr);
        a(eglCreatePixmapSurface);
        a();
        return eglCreatePixmapSurface;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final EGLSurface eglCreateWindowSurface(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj, int[] iArr) {
        Object[] objArr = {eGLDisplay, eGLConfig, obj, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f2905ce44ae1e462bb8165884f493fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (EGLSurface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f2905ce44ae1e462bb8165884f493fe");
        }
        c("eglCreateWindowSurface");
        a("display", eGLDisplay);
        a("config", eGLConfig);
        a("native_window", obj);
        a("attrib_list", iArr);
        b();
        EGLSurface eglCreateWindowSurface = this.e.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, iArr);
        a(eglCreateWindowSurface);
        a();
        return eglCreateWindowSurface;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglDestroyContext(EGLDisplay eGLDisplay, EGLContext eGLContext) {
        Object[] objArr = {eGLDisplay, eGLContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b20b679b2b96a2f2652270c978821b79", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b20b679b2b96a2f2652270c978821b79")).booleanValue();
        }
        c("eglDestroyContext");
        a("display", eGLDisplay);
        a("context", eGLContext);
        b();
        boolean eglDestroyContext = this.e.eglDestroyContext(eGLDisplay, eGLContext);
        a(eglDestroyContext);
        a();
        return eglDestroyContext;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglDestroySurface(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        Object[] objArr = {eGLDisplay, eGLSurface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "464a8c595057fb42340374303752cd37", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "464a8c595057fb42340374303752cd37")).booleanValue();
        }
        c("eglDestroySurface");
        a("display", eGLDisplay);
        a("surface", eGLSurface);
        b();
        boolean eglDestroySurface = this.e.eglDestroySurface(eGLDisplay, eGLSurface);
        a(eglDestroySurface);
        a();
        return eglDestroySurface;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglGetConfigAttrib(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int[] iArr) {
        Object[] objArr = {eGLDisplay, eGLConfig, Integer.valueOf(i), iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b442a4d256da8d42629625ca8e6a6c1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b442a4d256da8d42629625ca8e6a6c1")).booleanValue();
        }
        c("eglGetConfigAttrib");
        a("display", eGLDisplay);
        a("config", eGLConfig);
        a("attribute", i);
        b();
        boolean eglGetConfigAttrib = this.e.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr);
        a("value", iArr);
        a(eglGetConfigAttrib);
        a();
        return false;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglGetConfigs(EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr, int i, int[] iArr) {
        Object[] objArr = {eGLDisplay, eGLConfigArr, Integer.valueOf(i), iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3401865e16f4104b2d05551d75357e89", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3401865e16f4104b2d05551d75357e89")).booleanValue();
        }
        c("eglGetConfigs");
        a("display", eGLDisplay);
        a("config_size", i);
        b();
        boolean eglGetConfigs = this.e.eglGetConfigs(eGLDisplay, eGLConfigArr, i, iArr);
        a("configs", (Object[]) eGLConfigArr);
        a("num_config", iArr);
        a(eglGetConfigs);
        a();
        return eglGetConfigs;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final EGLContext eglGetCurrentContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e287d39e0b407b82057e89490ef40058", RobustBitConfig.DEFAULT_VALUE)) {
            return (EGLContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e287d39e0b407b82057e89490ef40058");
        }
        c("eglGetCurrentContext");
        b();
        EGLContext eglGetCurrentContext = this.e.eglGetCurrentContext();
        a(eglGetCurrentContext);
        a();
        return eglGetCurrentContext;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final EGLDisplay eglGetCurrentDisplay() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b47f4a7fd7f05cbe5a4dcde609c60526", RobustBitConfig.DEFAULT_VALUE)) {
            return (EGLDisplay) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b47f4a7fd7f05cbe5a4dcde609c60526");
        }
        c("eglGetCurrentDisplay");
        b();
        EGLDisplay eglGetCurrentDisplay = this.e.eglGetCurrentDisplay();
        a(eglGetCurrentDisplay);
        a();
        return eglGetCurrentDisplay;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final EGLSurface eglGetCurrentSurface(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b5a9f935c77afcc589bf94aa0940f04", RobustBitConfig.DEFAULT_VALUE)) {
            return (EGLSurface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b5a9f935c77afcc589bf94aa0940f04");
        }
        c("eglGetCurrentSurface");
        a("readdraw", i);
        b();
        EGLSurface eglGetCurrentSurface = this.e.eglGetCurrentSurface(i);
        a(eglGetCurrentSurface);
        a();
        return eglGetCurrentSurface;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final EGLDisplay eglGetDisplay(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7f7df6bf64baed75a7a48a51458c74b", RobustBitConfig.DEFAULT_VALUE)) {
            return (EGLDisplay) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7f7df6bf64baed75a7a48a51458c74b");
        }
        c("eglGetDisplay");
        a("native_display", obj);
        b();
        EGLDisplay eglGetDisplay = this.e.eglGetDisplay(obj);
        a(eglGetDisplay);
        a();
        return eglGetDisplay;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final int eglGetError() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a09bdfba5736b323d2726084d1e9ce5e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a09bdfba5736b323d2726084d1e9ce5e")).intValue();
        }
        c("eglGetError");
        b();
        int eglGetError = this.e.eglGetError();
        d(a(eglGetError));
        return eglGetError;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglInitialize(EGLDisplay eGLDisplay, int[] iArr) {
        Object[] objArr = {eGLDisplay, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c52852bb4008f3fbd03998c61b64d99", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c52852bb4008f3fbd03998c61b64d99")).booleanValue();
        }
        c("eglInitialize");
        a("display", eGLDisplay);
        b();
        boolean eglInitialize = this.e.eglInitialize(eGLDisplay, iArr);
        a(eglInitialize);
        a("major_minor", iArr);
        a();
        return eglInitialize;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglMakeCurrent(EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLSurface eGLSurface2, EGLContext eGLContext) {
        Object[] objArr = {eGLDisplay, eGLSurface, eGLSurface2, eGLContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e376fd5588fef07d6067c5fc672acc1a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e376fd5588fef07d6067c5fc672acc1a")).booleanValue();
        }
        c("eglMakeCurrent");
        a("display", eGLDisplay);
        a("draw", eGLSurface);
        a(GroupAnnouncement.GROUP_ANNOUNCEMENT_READ, eGLSurface2);
        a("context", eGLContext);
        b();
        boolean eglMakeCurrent = this.e.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface2, eGLContext);
        a(eglMakeCurrent);
        a();
        return eglMakeCurrent;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglQueryContext(EGLDisplay eGLDisplay, EGLContext eGLContext, int i, int[] iArr) {
        Object[] objArr = {eGLDisplay, eGLContext, Integer.valueOf(i), iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f4ac9dfe3a2138f26253268d6fcc0d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f4ac9dfe3a2138f26253268d6fcc0d6")).booleanValue();
        }
        c("eglQueryContext");
        a("display", eGLDisplay);
        a("context", eGLContext);
        a("attribute", i);
        b();
        boolean eglQueryContext = this.e.eglQueryContext(eGLDisplay, eGLContext, i, iArr);
        b(iArr[0]);
        a(eglQueryContext);
        a();
        return eglQueryContext;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final String eglQueryString(EGLDisplay eGLDisplay, int i) {
        Object[] objArr = {eGLDisplay, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e60dc9b6d14098e748ada87bf9e9ecd1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e60dc9b6d14098e748ada87bf9e9ecd1");
        }
        c("eglQueryString");
        a("display", eGLDisplay);
        a("name", i);
        b();
        String eglQueryString = this.e.eglQueryString(eGLDisplay, i);
        d(eglQueryString);
        a();
        return eglQueryString;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglQuerySurface(EGLDisplay eGLDisplay, EGLSurface eGLSurface, int i, int[] iArr) {
        Object[] objArr = {eGLDisplay, eGLSurface, Integer.valueOf(i), iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97798700edc08991ba9e99a9b51f5773", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97798700edc08991ba9e99a9b51f5773")).booleanValue();
        }
        c("eglQuerySurface");
        a("display", eGLDisplay);
        a("surface", eGLSurface);
        a("attribute", i);
        b();
        boolean eglQuerySurface = this.e.eglQuerySurface(eGLDisplay, eGLSurface, i, iArr);
        b(iArr[0]);
        a(eglQuerySurface);
        a();
        return eglQuerySurface;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglSwapBuffers(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        Object[] objArr = {eGLDisplay, eGLSurface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b69e5e403644612a12acd2fe438660f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b69e5e403644612a12acd2fe438660f")).booleanValue();
        }
        c("eglSwapBuffers");
        a("display", eGLDisplay);
        a("surface", eGLSurface);
        b();
        boolean eglSwapBuffers = this.e.eglSwapBuffers(eGLDisplay, eGLSurface);
        a(eglSwapBuffers);
        a();
        return eglSwapBuffers;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglTerminate(EGLDisplay eGLDisplay) {
        Object[] objArr = {eGLDisplay};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69bebdce7a086240bca033fcb5a25fc7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69bebdce7a086240bca033fcb5a25fc7")).booleanValue();
        }
        c("eglTerminate");
        a("display", eGLDisplay);
        b();
        boolean eglTerminate = this.e.eglTerminate(eGLDisplay);
        a(eglTerminate);
        a();
        return eglTerminate;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglWaitGL() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b96425a8b63a2a358678fa5247dcc976", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b96425a8b63a2a358678fa5247dcc976")).booleanValue();
        }
        c("eglWaitGL");
        b();
        boolean eglWaitGL = this.e.eglWaitGL();
        a(eglWaitGL);
        a();
        return eglWaitGL;
    }

    @Override // javax.microedition.khronos.egl.EGL10
    public final boolean eglWaitNative(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c166519b80ce8516de3860688899cb48", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c166519b80ce8516de3860688899cb48")).booleanValue();
        }
        c("eglWaitNative");
        a("engine", i);
        a("bindTarget", obj);
        b();
        boolean eglWaitNative = this.e.eglWaitNative(i, obj);
        a(eglWaitNative);
        a();
        return eglWaitNative;
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88d1f14720aa48ee7173de992655ed8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88d1f14720aa48ee7173de992655ed8f");
            return;
        }
        int eglGetError = this.e.eglGetError();
        if (eglGetError != 12288) {
            String str = "eglError: " + a(eglGetError);
            a(str);
            if (this.d) {
                throw new GLException(eglGetError, str);
            }
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a8f9464230ca502b9fd09c50efed5d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a8f9464230ca502b9fd09c50efed5d1");
            return;
        }
        b(str + '\n');
    }

    private void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b06cdf628e4e4f020d10663993b62619", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b06cdf628e4e4f020d10663993b62619");
            return;
        }
        try {
            this.b.write(str);
        } catch (IOException unused) {
        }
    }

    private void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2d136cdbd7e5a55cfaad8a059ad20ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2d136cdbd7e5a55cfaad8a059ad20ba");
            return;
        }
        b(str + '(');
        this.f = 0;
    }

    private void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6190493991e04f5a1d5bc6879700cfdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6190493991e04f5a1d5bc6879700cfdc");
            return;
        }
        int i = this.f;
        this.f = i + 1;
        if (i > 0) {
            b(", ");
        }
        if (this.c) {
            b(str + "=");
        }
        b(str2);
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb400243b78a67467e5957623ebfe69a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb400243b78a67467e5957623ebfe69a");
            return;
        }
        b(");\n");
        c();
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46f42b982e4ceab8db02c0117baff9eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46f42b982e4ceab8db02c0117baff9eb");
            return;
        }
        try {
            this.b.flush();
        } catch (IOException unused) {
            this.b = null;
        }
    }

    private void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35cb10ac4dc1ae330a2ecedb66bbedec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35cb10ac4dc1ae330a2ecedb66bbedec");
        } else {
            a(str, Integer.toString(i));
        }
    }

    private void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58a2fc79db21f26173abb188e8dfe3bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58a2fc79db21f26173abb188e8dfe3bf");
        } else {
            a(str, b(obj));
        }
    }

    private void a(String str, EGLDisplay eGLDisplay) {
        Object[] objArr = {str, eGLDisplay};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "602694ea357d402fee49e8dcdc14b091", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "602694ea357d402fee49e8dcdc14b091");
        } else if (eGLDisplay == EGL10.EGL_DEFAULT_DISPLAY) {
            a(str, "EGL10.EGL_DEFAULT_DISPLAY");
        } else if (eGLDisplay == EGL_NO_DISPLAY) {
            a(str, "EGL10.EGL_NO_DISPLAY");
        } else {
            a(str, b(eGLDisplay));
        }
    }

    private void a(String str, EGLContext eGLContext) {
        Object[] objArr = {str, eGLContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "781235f36ce419a2c5645cc4c19c393b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "781235f36ce419a2c5645cc4c19c393b");
        } else if (eGLContext == EGL10.EGL_NO_CONTEXT) {
            a(str, "EGL10.EGL_NO_CONTEXT");
        } else {
            a(str, b(eGLContext));
        }
    }

    private void a(String str, EGLSurface eGLSurface) {
        Object[] objArr = {str, eGLSurface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06dabc025d5b0a07b4cd9436d46aa69e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06dabc025d5b0a07b4cd9436d46aa69e");
        } else if (eGLSurface == EGL10.EGL_NO_SURFACE) {
            a(str, "EGL10.EGL_NO_SURFACE");
        } else {
            a(str, b(eGLSurface));
        }
    }

    private void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55a30afc58cf56b4bc5c5eceae493102", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55a30afc58cf56b4bc5c5eceae493102");
            return;
        }
        b(" returns " + str + ";\n");
        c();
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9065af4fa98e58c900ddd78d610db0b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9065af4fa98e58c900ddd78d610db0b6");
        } else {
            d(Integer.toString(i));
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45a497a57e3b37482e42c5c00ecfe21a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45a497a57e3b37482e42c5c00ecfe21a");
        } else {
            d(Boolean.toString(z));
        }
    }

    private void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b83d4296d90d1bea8b1b86437a1433a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b83d4296d90d1bea8b1b86437a1433a");
        } else {
            d(b(obj));
        }
    }

    private String b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "340ff59e681af66e1306f951b5282ef0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "340ff59e681af66e1306f951b5282ef0") : obj == null ? StringUtil.NULL : obj.toString();
    }

    private void a(String str, int[] iArr) {
        Object[] objArr = {str, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "805870e7f1e2074101da5abcc9673a05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "805870e7f1e2074101da5abcc9673a05");
        } else if (iArr == null) {
            a(str, StringUtil.NULL);
        } else {
            a(str, a(iArr.length, iArr, 0));
        }
    }

    private void a(String str, Object[] objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "31be042b11cb9fbeba9ef7698e543c13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "31be042b11cb9fbeba9ef7698e543c13");
        } else if (objArr == null) {
            a(str, StringUtil.NULL);
        } else {
            a(str, a(objArr.length, objArr, 0));
        }
    }

    private String a(int i, int[] iArr, int i2) {
        Object[] objArr = {Integer.valueOf(i), iArr, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e30d17aa19321239b9c9f4728a7aa4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e30d17aa19321239b9c9f4728a7aa4f");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        int length = iArr.length;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i3 + 0;
            sb.append(" [" + i4 + "] = ");
            if (i4 < 0 || i4 >= length) {
                sb.append("out of bounds");
            } else {
                sb.append(iArr[i4]);
            }
            sb.append('\n');
        }
        sb.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
        return sb.toString();
    }

    private String a(int i, Object[] objArr, int i2) {
        Object[] objArr2 = {Integer.valueOf(i), objArr, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "0e6fc9a1a68c338fc9d481645f0683dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "0e6fc9a1a68c338fc9d481645f0683dc");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        int length = objArr.length;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i3 + 0;
            sb.append(" [" + i4 + "] = ");
            if (i4 < 0 || i4 >= length) {
                sb.append("out of bounds");
            } else {
                sb.append(objArr[i4]);
            }
            sb.append('\n');
        }
        sb.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
        return sb.toString();
    }

    private static String c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c888cb0f19cb1db3eba4ac16e1a86ed6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c888cb0f19cb1db3eba4ac16e1a86ed6");
        }
        return "0x" + Integer.toHexString(i);
    }

    public static String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3692ff6572710860cc7918ca5a297017", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3692ff6572710860cc7918ca5a297017");
        }
        switch (i) {
            case MetricXConfigBean.URL_EXP_LENGTH_LIMIT /* 12288 */:
                return "EGL_SUCCESS";
            case 12289:
                return "EGL_NOT_INITIALIZED";
            case 12290:
                return "EGL_BAD_ACCESS";
            case 12291:
                return "EGL_BAD_ALLOC";
            case 12292:
                return "EGL_BAD_ATTRIBUTE";
            case 12293:
                return "EGL_BAD_CONFIG";
            case 12294:
                return "EGL_BAD_CONTEXT";
            case 12295:
                return "EGL_BAD_CURRENT_SURFACE";
            case 12296:
                return "EGL_BAD_DISPLAY";
            case 12297:
                return "EGL_BAD_MATCH";
            case 12298:
                return "EGL_BAD_NATIVE_PIXMAP";
            case 12299:
                return "EGL_BAD_NATIVE_WINDOW";
            case 12300:
                return "EGL_BAD_PARAMETER";
            case 12301:
                return "EGL_BAD_SURFACE";
            case 12302:
                return "EGL_CONTEXT_LOST";
            default:
                return c(i);
        }
    }
}
