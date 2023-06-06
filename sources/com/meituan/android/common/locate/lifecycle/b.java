package com.meituan.android.common.locate.lifecycle;

import android.app.Application;
import com.meituan.android.common.locate.lifecycle.a;
import com.meituan.android.common.locate.locator.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile b e;
    private boolean a;
    private a.InterfaceC0210a b;
    private a.c c;
    private boolean d;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "529cf3421a08e42f2de35824a6ee5a2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "529cf3421a08e42f2de35824a6ee5a2b");
            return;
        }
        this.d = false;
        d();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c26b9ff94842b7925c8602a2bfbd41c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c26b9ff94842b7925c8602a2bfbd41c9");
        }
        if (e == null) {
            synchronized (b.class) {
                if (e == null) {
                    e = new b();
                }
            }
        }
        return e;
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "190ae3147d810f6b1d61e8f037700b3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "190ae3147d810f6b1d61e8f037700b3a");
            return;
        }
        Application e2 = e();
        if (e2 == null) {
            com.meituan.android.common.locate.platform.logs.c.a("LocateLifecycleControl init fail");
            return;
        }
        a.a().a(e2);
        this.a = true;
    }

    private Application e() {
        Method method;
        Method method2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "125d3ba4da7314be05691e5a9e512edf", RobustBitConfig.DEFAULT_VALUE)) {
            return (Application) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "125d3ba4da7314be05691e5a9e512edf");
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            if (cls == null || (method = cls.getMethod("currentActivityThread", new Class[0])) == null) {
                return null;
            }
            method.setAccessible(true);
            Object invoke = method.invoke(null, new Object[0]);
            method.setAccessible(false);
            if (invoke == null || (method2 = invoke.getClass().getMethod("getApplication", new Class[0])) == null) {
                return null;
            }
            Object invoke2 = method2.invoke(invoke, new Object[0]);
            if (invoke2 instanceof Application) {
                return (Application) invoke2;
            }
            return null;
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            return null;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return null;
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
            return null;
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41720466d88a0eb67e8782c6cd7fe2db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41720466d88a0eb67e8782c6cd7fe2db");
        } else if (this.a) {
            this.b = new a.InterfaceC0210a() { // from class: com.meituan.android.common.locate.lifecycle.b.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.locate.lifecycle.a.InterfaceC0210a
                public void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ec8bc82c068691e816fd12bcc8115d2f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ec8bc82c068691e816fd12bcc8115d2f");
                        return;
                    }
                    com.meituan.android.common.locate.platform.logs.c.a("enter the background");
                    b.this.d = true;
                }
            };
            a.a().a(this.b);
            this.c = new a.c() { // from class: com.meituan.android.common.locate.lifecycle.b.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.locate.lifecycle.a.c
                public void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "79a934ad1ab85132ab616e9fd762615d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "79a934ad1ab85132ab616e9fd762615d");
                        return;
                    }
                    com.meituan.android.common.locate.platform.logs.c.a("enter the foreground");
                    if (b.this.d) {
                        d.a().b();
                    }
                    b.this.d = false;
                }
            };
            a.a().a(this.c);
        }
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3012cd3400d5efba9e56a72e09672cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3012cd3400d5efba9e56a72e09672cf");
        } else if (this.a) {
            a.a().b(this.b);
            a.a().b(this.c);
        }
    }
}
