package com.sankuai.meituan.retrofit2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface e<T> {
    <R> T a(Call<R> call);

    Type a();

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static abstract class a {
        public static ChangeQuickRedirect a;

        public abstract e<?> a(Type type, Annotation[] annotationArr, ar arVar);

        public static Type a(int i, ParameterizedType parameterizedType) {
            Object[] objArr = {0, parameterizedType};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "631b74c82b945e09339767fb74870205", 6917529027641081856L) ? (Type) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "631b74c82b945e09339767fb74870205") : av.a(0, parameterizedType);
        }

        public static Class<?> a(Type type) {
            Object[] objArr = {type};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e005ce8909530f81fa146c1d03cd1c14", 6917529027641081856L) ? (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e005ce8909530f81fa146c1d03cd1c14") : av.a(type);
        }
    }
}
