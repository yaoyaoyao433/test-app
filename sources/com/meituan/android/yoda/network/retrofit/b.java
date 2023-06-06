package com.meituan.android.yoda.network.retrofit;

import android.graphics.Bitmap;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends i.a {
    public static ChangeQuickRedirect a;
    private static b b;

    public static i.a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "937ceb118826686ada33a3cbde428e84", RobustBitConfig.DEFAULT_VALUE)) {
            return (i.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "937ceb118826686ada33a3cbde428e84");
        }
        if (b == null) {
            b = new b();
        }
        return b;
    }

    private static Gson b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "543fb989de8a15c9403aaa1ab24e1386", RobustBitConfig.DEFAULT_VALUE)) {
            return (Gson) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "543fb989de8a15c9403aaa1ab24e1386");
        }
        c a2 = c.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "9ce006b350ec5e0b57ef4b6c846a2800", RobustBitConfig.DEFAULT_VALUE)) {
            return (Gson) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "9ce006b350ec5e0b57ef4b6c846a2800");
        }
        if (a2.b == null) {
            a2.b = a2.c.create();
        }
        return a2.b;
    }

    @Override // com.sankuai.meituan.retrofit2.i.a
    public final i<ap, ?> a(Type type, Annotation[] annotationArr, ar arVar) {
        Object[] objArr = {type, annotationArr, arVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5616aa288f2fe675a11992c273f5d41", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5616aa288f2fe675a11992c273f5d41");
        }
        if (type == Bitmap.class) {
            return new a();
        }
        return com.sankuai.meituan.retrofit2.converter.gson.a.a(b()).a(type, annotationArr, arVar);
    }

    @Override // com.sankuai.meituan.retrofit2.i.a
    public final i<?, ak> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, ar arVar) {
        Object[] objArr = {type, annotationArr, annotationArr2, arVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed8ca0e5ba2497fd43e51bd7997daa10", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed8ca0e5ba2497fd43e51bd7997daa10") : com.sankuai.meituan.retrofit2.converter.gson.a.a(b()).a(type, annotationArr, annotationArr2, arVar);
    }
}
