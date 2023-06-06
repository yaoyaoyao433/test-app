package com.meituan.msi.lib.map.api;

import android.util.ArrayMap;
import com.meituan.msi.lib.map.utils.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.connect.common.Constants;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a implements InvocationHandler {
    public static ChangeQuickRedirect a;
    volatile int b;
    final ArrayList<Runnable> c;
    private final ArrayMap<String, Method> d;
    private final com.meituan.msi.lib.map.api.interfaces.b e;

    public a(b bVar) {
        int i;
        Method[] methodArr;
        char c = 1;
        char c2 = 0;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44e50683e7df77856049637b2e088483", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44e50683e7df77856049637b2e088483");
            return;
        }
        this.d = new ArrayMap<>();
        this.b = 0;
        this.e = bVar;
        Method[] methods = bVar.getClass().getMethods();
        int length = methods.length;
        int i2 = 0;
        while (i2 < length) {
            Method method = methods[i2];
            Annotation[] annotations = method.getAnnotations();
            int length2 = annotations.length;
            int i3 = 0;
            while (i3 < length2) {
                if (annotations[i3] instanceof CheckEmbed) {
                    String name = method.getName();
                    Object[] objArr2 = new Object[2];
                    objArr2[c2] = name;
                    objArr2[c] = method;
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    i = i3;
                    methodArr = methods;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "986138c4215db950653191698c3bb7e8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "986138c4215db950653191698c3bb7e8");
                    } else {
                        this.d.put(name, method);
                    }
                } else {
                    i = i3;
                    methodArr = methods;
                }
                i3 = i + 1;
                methods = methodArr;
                c = 1;
                c2 = 0;
            }
            i2++;
            c = 1;
            c2 = 0;
        }
        this.c = new ArrayList<>();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0ed62b439aef10539f86d7510ba517f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0ed62b439aef10539f86d7510ba517f");
            return;
        }
        for (int i = 0; i < this.c.size(); i++) {
            this.c.get(i).run();
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, final Method method, final Object[] objArr) throws Throwable {
        Object[] objArr2 = {obj, method, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "1580cd16328e099d07544efc77ebbb7a", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "1580cd16328e099d07544efc77ebbb7a");
        }
        if (this.e == null || method == null) {
            return null;
        }
        if (this.d.containsKey(method.getName())) {
            if (this.b == 1) {
                this.c.add(new Runnable() { // from class: com.meituan.msi.lib.map.api.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "cd650f8b439e886ce120f8100e7bd838", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "cd650f8b439e886ce120f8100e7bd838");
                        } else {
                            a.this.a(method, objArr);
                        }
                    }
                });
                return null;
            }
            return a(method, objArr);
        }
        return a(method, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object a(Method method, Object[] objArr) {
        Object[] objArr2 = {method, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "4daffe4b94c858fc78ecd1079e819b32", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "4daffe4b94c858fc78ecd1079e819b32");
        }
        try {
            return method.invoke(this.e, objArr);
        } catch (Exception e) {
            if (e instanceof InvocationTargetException) {
                j.a(a.class, method.getName(), (int) Constants.REQUEST_SHARE_TO_TROOP_BAR, ((InvocationTargetException) e).getTargetException());
                return null;
            }
            j.a(a.class, method.getName(), (int) Constants.REQUEST_SHARE_TO_TROOP_BAR, e.getMessage());
            return null;
        }
    }
}
