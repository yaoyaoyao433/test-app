package com.sankuai.waimai.machpro.module;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a<T extends MPModule> {
    public static ChangeQuickRedirect a;
    private static Map<String, Map> d = new HashMap();
    public String b;
    public Map<String, c> c;
    private Class<T> e;
    private Constructor<T> f;

    public a(String str, Class<T> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35a1ac53038a847b08c11be87888b8b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35a1ac53038a847b08c11be87888b8b7");
            return;
        }
        this.b = str;
        this.e = cls;
        try {
            this.f = this.e.getConstructor(MPContext.class);
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a("NativeModule构造函数获取失败-->" + this.e.getSimpleName() + " 异常信息-->" + e.getMessage());
        }
    }

    public void a() {
        Method[] methods;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3b9410ff259798fb56d4031e35bda46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3b9410ff259798fb56d4031e35bda46");
            return;
        }
        try {
            this.c = d.get(this.b);
            if (this.c != null) {
                return;
            }
            this.c = new HashMap();
            for (Method method : this.e.getMethods()) {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                int length = declaredAnnotations.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Annotation annotation = declaredAnnotations[i];
                        if (annotation instanceof JSMethod) {
                            JSMethod jSMethod = (JSMethod) annotation;
                            String name = TextUtils.isEmpty(jSMethod.methodName()) ? method.getName() : jSMethod.methodName();
                            this.c.put(name, new c(method, name, method.getParameterTypes().length));
                        } else {
                            i++;
                        }
                    }
                }
            }
            d.put(this.b, this.c);
        } catch (Throwable th) {
            com.sankuai.waimai.machpro.util.a.a("MPModuleWrapper 解析方法失败-->" + th.getMessage());
        }
    }

    public final T a(MPContext mPContext) {
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d8c8da1ff12c8233fca8a759426b891", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d8c8da1ff12c8233fca8a759426b891");
        }
        try {
            return this.f.newInstance(mPContext);
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a("NativeModule创建对象失败-->" + this.e.getSimpleName() + " 异常信息-->" + e.getMessage());
            return null;
        }
    }

    public final Object a(MPContext mPContext, Object obj, String str, Object[] objArr) {
        Object[] objArr2 = {mPContext, obj, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "04bc0c10a74bcf386d95538e72b41f36", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "04bc0c10a74bcf386d95538e72b41f36");
        }
        try {
            if (this.c == null) {
                a();
            }
            c cVar = this.c.get(str);
            if (cVar != null) {
                return cVar.a(mPContext, obj, objArr);
            }
            return null;
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a("invokeMethod异常：" + e.getMessage());
            return null;
        }
    }
}
