package com.meituan.android.neohybrid.neo.http.converter;

import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends i.a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.meituan.retrofit2.i.a
    public final i<?, ak> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, ar arVar) {
        Object[] objArr = {type, annotationArr, annotationArr2, arVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11aa67fdc2f0f53b731e1e17eed8f2fd", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11aa67fdc2f0f53b731e1e17eed8f2fd") : new b(com.meituan.android.neohybrid.util.gson.b.a().getAdapter(TypeToken.get(type)));
    }

    @Override // com.sankuai.meituan.retrofit2.i.a
    public final i<ap, ?> a(Type type, Annotation[] annotationArr, ar arVar) {
        String value;
        Object[] objArr = {type, annotationArr, arVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "886707cf28aab2bdda9bc9789d542dc2", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "886707cf28aab2bdda9bc9789d542dc2");
        }
        if (annotationArr != null) {
            try {
                if (annotationArr.length > 0) {
                    for (Annotation annotation : annotationArr) {
                        if (annotation instanceof POST) {
                            value = ((POST) annotation).value();
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "EncryptConverterFactory_responseBodyConverter", (Map<String, Object>) null);
            }
        }
        value = "";
        return new c(TypeToken.get(type), value);
    }

    @Override // com.sankuai.meituan.retrofit2.i.a
    public final i<?, String> b(Type type, Annotation[] annotationArr, ar arVar) {
        Object[] objArr = {type, annotationArr, arVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73b30102024709a8f4cec1d956cf3520", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73b30102024709a8f4cec1d956cf3520");
        }
        if (type == String.class) {
            return new d();
        }
        return null;
    }
}
