package com.meituan.android.edfu.mbar.netservice;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f {
    public static ChangeQuickRedirect a;
    protected String b;

    public final <T> T a(Class<T> cls) {
        ar a2;
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0626661861bb010ff4fac46262f6300", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0626661861bb010ff4fac46262f6300");
        }
        d a3 = d.a();
        String str = this.b;
        Object[] objArr2 = {str, cls};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, a3, changeQuickRedirect2, false, "ec71eb9b106d3d412004b9233ab6aa69", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (ar) PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect2, false, "ec71eb9b106d3d412004b9233ab6aa69");
        } else {
            HashMap<String, ar> hashMap = a3.b;
            if (hashMap.get(str + cls.getName()) != null) {
                HashMap<String, ar> hashMap2 = a3.b;
                a2 = hashMap2.get(str + cls.getName());
            } else {
                a2 = new ar.a().a(str).a(com.sankuai.meituan.retrofit2.converter.gson.a.a()).a(a.a()).a(a3.c).a(com.sankuai.meituan.retrofit2.adapter.rxjava.f.a()).a();
                HashMap<String, ar> hashMap3 = a3.b;
                hashMap3.put(str + cls.getName(), a2);
            }
        }
        return (T) a2.a(cls);
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bffc56819ea0960e19e3150379487c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bffc56819ea0960e19e3150379487c4");
            return;
        }
        this.b = "https://mop.meituan.com/";
        this.b = "https://ar.meituan.com";
    }
}
