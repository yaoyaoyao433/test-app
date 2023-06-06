package com.sankuai.meituan.retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends i.a {
    public static ChangeQuickRedirect a;
    private final Gson b;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c198f38134bfcd1e7e5a23943412066", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c198f38134bfcd1e7e5a23943412066") : a(new Gson());
    }

    public static a a(Gson gson) {
        Object[] objArr = {gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b1f4861456d819ea900cec67e89722e", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b1f4861456d819ea900cec67e89722e") : new a(gson);
    }

    private a(Gson gson) {
        Object[] objArr = {gson};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2064eabf3175181b5cce5862f9ef3db3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2064eabf3175181b5cce5862f9ef3db3");
        } else if (gson == null) {
            throw new NullPointerException("gson == null");
        } else {
            this.b = gson;
        }
    }

    @Override // com.sankuai.meituan.retrofit2.i.a
    public final i<ap, ?> a(Type type, Annotation[] annotationArr, ar arVar) {
        Object[] objArr = {type, annotationArr, arVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2354f36b0dc62008a178c17cd0c60a75", 6917529027641081856L) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2354f36b0dc62008a178c17cd0c60a75") : new c(this.b, this.b.getAdapter(TypeToken.get(type)));
    }

    @Override // com.sankuai.meituan.retrofit2.i.a
    public final i<?, ak> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, ar arVar) {
        Object[] objArr = {type, annotationArr, annotationArr2, arVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8de16ddd1cb8f6d0a57d6383c7a6ddf", 6917529027641081856L) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8de16ddd1cb8f6d0a57d6383c7a6ddf") : new b(this.b, this.b.getAdapter(TypeToken.get(type)));
    }
}
