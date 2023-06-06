package com.meituan.android.recce.shark;

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
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends i.a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.meituan.retrofit2.i.a
    public final com.sankuai.meituan.retrofit2.i<?, ak> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, ar arVar) {
        Object[] objArr = {type, annotationArr, annotationArr2, arVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5864a6bde4727f75405f6c77b023a75", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.retrofit2.i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5864a6bde4727f75405f6c77b023a75") : new m(g.a().getAdapter(TypeToken.get(type)));
    }

    @Override // com.sankuai.meituan.retrofit2.i.a
    public final com.sankuai.meituan.retrofit2.i<ap, ?> a(Type type, Annotation[] annotationArr, ar arVar) {
        String value;
        Object[] objArr = {type, annotationArr, arVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "660f721eb9d34b955549f6de49e7c855", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "660f721eb9d34b955549f6de49e7c855");
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
            } catch (Exception unused) {
            }
        }
        value = "";
        return new p(TypeToken.get(type), value);
    }

    @Override // com.sankuai.meituan.retrofit2.i.a
    public final com.sankuai.meituan.retrofit2.i<?, String> b(Type type, Annotation[] annotationArr, ar arVar) {
        Object[] objArr = {type, annotationArr, arVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00ffe23afc4ad0fa5bbea82550cbcc8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00ffe23afc4ad0fa5bbea82550cbcc8f");
        }
        if (type == String.class) {
            return new s();
        }
        return null;
    }
}
