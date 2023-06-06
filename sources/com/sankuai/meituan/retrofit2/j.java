package com.sankuai.meituan.retrofit2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j extends e.a {
    public static ChangeQuickRedirect b;
    public static final e.a c = new j();

    @Override // com.sankuai.meituan.retrofit2.e.a
    public final e<?> a(Type type, Annotation[] annotationArr, ar arVar) {
        Object[] objArr = {type, annotationArr, arVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff582c63a6650d827830119333b26e47", 6917529027641081856L)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff582c63a6650d827830119333b26e47");
        }
        if (a(type) != Call.class) {
            return null;
        }
        final Type e = av.e(type);
        return new e<Call<?>>() { // from class: com.sankuai.meituan.retrofit2.j.1
            @Override // com.sankuai.meituan.retrofit2.e
            public final /* bridge */ /* synthetic */ Call<?> a(Call call) {
                return call;
            }

            @Override // com.sankuai.meituan.retrofit2.e
            public final Type a() {
                return e;
            }
        };
    }
}
