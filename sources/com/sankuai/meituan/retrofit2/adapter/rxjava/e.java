package com.sankuai.meituan.retrofit2.adapter.rxjava;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.Call;
import java.lang.reflect.Type;
import rx.d;
import rx.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e implements com.sankuai.meituan.retrofit2.e<Object> {
    public static ChangeQuickRedirect a;
    private final Type b;
    private final g c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class a {
        public static ChangeQuickRedirect a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class b {
        public static ChangeQuickRedirect a;
    }

    public e(Type type, g gVar, boolean z, boolean z2, boolean z3, boolean z4) {
        Object[] objArr = {type, gVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Byte.valueOf(z4 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87106a48179bddc46e88267922860fc9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87106a48179bddc46e88267922860fc9");
            return;
        }
        this.b = type;
        this.c = gVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    @Override // com.sankuai.meituan.retrofit2.e
    public final Type a() {
        return this.b;
    }

    @Override // com.sankuai.meituan.retrofit2.e
    public final <R> Object a(Call<R> call) {
        d.a aVar;
        Object[] objArr = {call};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b5560968e3f72039bbad52643a9da11", 6917529027641081856L)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b5560968e3f72039bbad52643a9da11");
        }
        com.sankuai.meituan.retrofit2.adapter.rxjava.b bVar = new com.sankuai.meituan.retrofit2.adapter.rxjava.b(call);
        if (this.d) {
            aVar = new d(bVar);
        } else {
            aVar = this.e ? new com.sankuai.meituan.retrofit2.adapter.rxjava.a(bVar) : bVar;
        }
        rx.d a2 = rx.d.a(aVar);
        if (this.c != null) {
            a2 = a2.b(this.c);
        }
        if (this.f) {
            Object[] objArr2 = {a2};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "27f5d306e36d9b402e6b4e820b48c488", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "27f5d306e36d9b402e6b4e820b48c488") : a2.a();
        } else if (this.g) {
            Object[] objArr3 = {a2};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            return PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a92bdee8ca75610e358eb8e46fc76396", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "a92bdee8ca75610e358eb8e46fc76396") : rx.b.a((rx.d<?>) a2);
        } else {
            return a2;
        }
    }
}
