package com.sankuai.meituan.retrofit2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class Response<T> {
    public static ChangeQuickRedirect a;
    public final String b;
    public final int c;
    public final String d;
    public final T e;
    public final ap f;
    public final List<q> g;
    public final com.sankuai.meituan.retrofit2.ext.b h;

    private Response(String str, int i, String str2, List<q> list, T t, ap apVar, com.sankuai.meituan.retrofit2.ext.b bVar) {
        Object[] objArr = {str, Integer.valueOf(i), str2, list, t, apVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19db20af9009b49b214948782bfda86c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19db20af9009b49b214948782bfda86c");
            return;
        }
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = t;
        this.f = apVar;
        this.g = list;
        this.h = bVar;
    }

    public final String a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final List<q> d() {
        return this.g;
    }

    public final T e() {
        return this.e;
    }

    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "688bb03580f7f3a87739f09c5ed21c93", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "688bb03580f7f3a87739f09c5ed21c93")).booleanValue() : av.a(this.c);
    }

    public final ap g() {
        return this.f;
    }

    public final com.sankuai.meituan.retrofit2.ext.b h() {
        return this.h;
    }

    public static <T> Response<T> a(T t, com.sankuai.meituan.retrofit2.raw.b bVar) {
        Object[] objArr = {t, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d3e744d18160b9a395882e84495e560", 6917529027641081856L)) {
            return (Response) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d3e744d18160b9a395882e84495e560");
        }
        if (!av.a(bVar.code())) {
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        return new Response<>(bVar.url(), bVar.code(), bVar.reason(), bVar.headers(), t, null, com.sankuai.meituan.retrofit2.ext.b.b());
    }

    public static <T> Response<T> a(ap apVar, com.sankuai.meituan.retrofit2.raw.b bVar) {
        Object[] objArr = {apVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d553482595d508fbc7370474da95a33", 6917529027641081856L)) {
            return (Response) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d553482595d508fbc7370474da95a33");
        }
        if (apVar == null) {
            throw new NullPointerException("body == null");
        }
        if (av.a(bVar.code())) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new Response<>(bVar.url(), bVar.code(), bVar.reason(), bVar.headers(), null, apVar, com.sankuai.meituan.retrofit2.ext.b.b());
    }
}
