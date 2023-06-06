package com.sankuai.meituan.retrofit2.adapter.rxjava;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.Response;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c<T> {
    public static ChangeQuickRedirect a;
    private final Response<T> b;
    private final Throwable c;

    public static <T> c<T> a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "955b8b3f8b548c7f6c0b197b296d58ea", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "955b8b3f8b548c7f6c0b197b296d58ea");
        }
        if (th == null) {
            throw new NullPointerException("error == null");
        }
        return new c<>(null, th);
    }

    public static <T> c<T> a(Response<T> response) {
        Object[] objArr = {response};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "85a1d0258c4982402e2824736007c76c", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "85a1d0258c4982402e2824736007c76c");
        }
        if (response == null) {
            throw new NullPointerException("response == null");
        }
        return new c<>(response, null);
    }

    private c(Response<T> response, Throwable th) {
        Object[] objArr = {response, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a431a40b53eba0982744190e1d51f2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a431a40b53eba0982744190e1d51f2b");
            return;
        }
        this.b = response;
        this.c = th;
    }
}
