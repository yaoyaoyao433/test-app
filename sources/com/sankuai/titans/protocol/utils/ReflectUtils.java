package com.sankuai.titans.protocol.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ReflectUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Type getActualTypeArguments(Class<?> cls, int i) {
        Object[] objArr = {cls, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0acb3225c799392db34ddfcbc99666d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Type) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0acb3225c799392db34ddfcbc99666d8");
        }
        try {
            if (cls.getGenericSuperclass() instanceof ParameterizedType) {
                return ((ParameterizedType) cls.getGenericSuperclass()).getActualTypeArguments()[i];
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T createInstance(java.lang.ClassLoader r13, java.lang.String r14, java.lang.Object... r15) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.titans.protocol.utils.ReflectUtils.createInstance(java.lang.ClassLoader, java.lang.String, java.lang.Object[]):java.lang.Object");
    }
}
