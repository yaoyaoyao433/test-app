package com.meituan.android.neohybrid.util.gson;

import com.meituan.android.neohybrid.util.gson.annotation.JsonCheck;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final Map<Type, a> c = new HashMap();
    Class<?> b;
    private Type d;

    public static a a(Type type) {
        Object[] objArr = {type};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bdc2937dbe6664301f5f24a59066ce21", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bdc2937dbe6664301f5f24a59066ce21");
        }
        a aVar = c.get(type);
        if (aVar == null) {
            a aVar2 = new a(type);
            c.put(type, aVar2);
            return aVar2;
        }
        return aVar;
    }

    private a(Type type) {
        Object[] objArr = {type};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "921d712b02cccbfc76208c055a5a1cb9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "921d712b02cccbfc76208c055a5a1cb9");
            return;
        }
        this.d = type;
        b(type);
    }

    private void a(Class<?> cls) {
        if (this.b == null) {
            this.b = cls;
        }
    }

    private void b(Type type) {
        Object[] objArr = {type};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17c7e9755017986ba7a36721242ed043", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17c7e9755017986ba7a36721242ed043");
        } else if (type instanceof Class) {
            b((Class) type);
        } else if (type instanceof ParameterizedType) {
            a((ParameterizedType) type);
        } else if (type instanceof GenericArrayType) {
            a((GenericArrayType) type);
        }
    }

    private void b(Class<?> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb0fcd3dbd583dbe3e4d3943a37515a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb0fcd3dbd583dbe3e4d3943a37515a9");
        } else if (cls == null) {
        } else {
            if (cls.isArray()) {
                cls = ((Class) this.d).getComponentType();
            }
            if (cls.isAnnotationPresent(JsonCheck.class)) {
                a(cls);
            }
        }
    }

    private void a(ParameterizedType parameterizedType) {
        Object[] objArr = {parameterizedType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0d455f0a700e0dff7874a514c6bc34b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0d455f0a700e0dff7874a514c6bc34b");
        } else if (parameterizedType == null) {
        } else {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (actualTypeArguments.length == 1) {
                b(actualTypeArguments[0]);
            } else if (actualTypeArguments.length == 2 && actualTypeArguments[0] == String.class) {
                b(actualTypeArguments[1]);
            }
        }
    }

    private void a(GenericArrayType genericArrayType) {
        Object[] objArr = {genericArrayType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6e6faef5896575734e415539473c634", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6e6faef5896575734e415539473c634");
        } else if (genericArrayType == null) {
        } else {
            b(genericArrayType.getGenericComponentType());
        }
    }
}
