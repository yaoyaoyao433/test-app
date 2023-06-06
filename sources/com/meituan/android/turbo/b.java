package com.meituan.android.turbo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements Type {
        public Class a;
        public Type[] b;

        public a(Class cls, Type[] typeArr) {
            this.a = cls;
            this.b = typeArr;
        }
    }

    public static Type a(Class cls, Type... typeArr) {
        Object[] objArr = {cls, typeArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19b55d18af03fc261b936742d295cffe", 6917529027641081856L)) {
            return (Type) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19b55d18af03fc261b936742d295cffe");
        }
        Type[] typeArr2 = new Type[typeArr.length];
        int length = typeArr.length;
        for (int i = 0; i < length; i++) {
            typeArr2[i] = typeArr[i];
        }
        return new a(cls, typeArr2);
    }

    public static Class a(Type type) {
        Object[] objArr = {type};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4ff0bf819508726b0c296f415edecf4", 6917529027641081856L)) {
            return (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4ff0bf819508726b0c296f415edecf4");
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof a) {
            return ((a) type).a;
        }
        throw new IllegalArgumentException("Not supported type: " + type);
    }

    public static Type[] b(Type type) {
        Object[] objArr = {type};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d70678c570aeb4de19b0e9c85d593fc0", 6917529027641081856L)) {
            return (Type[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d70678c570aeb4de19b0e9c85d593fc0");
        }
        if (type instanceof Class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return ((ParameterizedType) type).getActualTypeArguments();
        }
        if (type instanceof a) {
            return ((a) type).b;
        }
        throw new IllegalArgumentException("Not supported type: " + type);
    }

    public static Type c(Type type) {
        Object[] objArr = {type};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e6182cd188bb7cce837c52d68bbfa41", 6917529027641081856L)) {
            return (Type) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e6182cd188bb7cce837c52d68bbfa41");
        }
        if (type instanceof Class) {
            return ((Class) type).getComponentType();
        }
        if (type instanceof a) {
            a aVar = (a) type;
            return new a(aVar.a.getComponentType(), aVar.b);
        }
        throw new IllegalArgumentException("Not supported type: " + type);
    }
}
