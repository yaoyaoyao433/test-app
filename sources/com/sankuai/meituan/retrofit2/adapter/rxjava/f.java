package com.sankuai.meituan.retrofit2.adapter.rxjava;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.e;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import rx.g;
import rx.h;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends e.a {
    public static ChangeQuickRedirect b;
    private final g c;

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a32539612c0149a6d7a43fec81a588b", 6917529027641081856L) ? (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a32539612c0149a6d7a43fec81a588b") : new f(null);
    }

    public static f a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a617a38ddf3cc1667487537c251b075", 6917529027641081856L)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a617a38ddf3cc1667487537c251b075");
        }
        if (gVar == null) {
            throw new NullPointerException("scheduler == null");
        }
        return new f(gVar);
    }

    private f(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88573b6200c61e569661c311befbadbe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88573b6200c61e569661c311befbadbe");
        } else {
            this.c = gVar;
        }
    }

    @Override // com.sankuai.meituan.retrofit2.e.a
    public final com.sankuai.meituan.retrofit2.e<?> a(Type type, Annotation[] annotationArr, ar arVar) {
        Type type2;
        boolean z;
        boolean z2;
        Object[] objArr = {type, annotationArr, arVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41667bd8325ff62961edcdfbd8a71492", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41667bd8325ff62961edcdfbd8a71492");
        }
        Class<?> a = a(type);
        boolean z3 = a == h.class;
        boolean z4 = a == rx.b.class;
        if (a == rx.d.class || z3 || z4) {
            if (z4) {
                return new e(Void.class, this.c, false, true, false, true);
            }
            if (!(type instanceof ParameterizedType)) {
                String str = z3 ? "Single" : "Observable";
                throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
            }
            Type a2 = a(0, (ParameterizedType) type);
            Class<?> a3 = a(a2);
            if (a3 == Response.class) {
                if (!(a2 instanceof ParameterizedType)) {
                    throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
                }
                type2 = a(0, (ParameterizedType) a2);
                z = false;
            } else if (a3 == c.class) {
                if (!(a2 instanceof ParameterizedType)) {
                    throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
                }
                type2 = a(0, (ParameterizedType) a2);
                z = true;
            } else {
                type2 = a2;
                z = false;
                z2 = true;
                return new e(type2, this.c, z, z2, z3, false);
            }
            z2 = false;
            return new e(type2, this.c, z, z2, z3, false);
        }
        return null;
    }
}
