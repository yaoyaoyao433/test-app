package com.sankuai.waimai.platform.modular.network.api;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.Response;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a<T> {
    public static ChangeQuickRedirect a;
    public final int b;
    @Nullable
    public final T c;
    @Nullable
    public com.sankuai.waimai.platform.modular.network.error.a d;

    public a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71c0a0c45c257e2d89d7bc29a3ed090a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71c0a0c45c257e2d89d7bc29a3ed090a");
            return;
        }
        this.b = 500;
        this.c = null;
        this.d = new com.sankuai.waimai.platform.modular.network.error.a(th);
    }

    public a(Response<T> response) {
        String string;
        Object[] objArr = {response};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff96f854e590e521e9f362d64133f280", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff96f854e590e521e9f362d64133f280");
            return;
        }
        this.b = response.b();
        if (response.f()) {
            this.c = response.e();
            this.d = null;
            return;
        }
        if (response.g() != null) {
            try {
                string = response.g().string();
            } catch (Exception unused) {
                com.sankuai.waimai.foundation.utils.log.a.e("ApiResponse", "error while parsing response", new Object[0]);
            }
            this.d = new com.sankuai.waimai.platform.modular.network.error.a((string != null || string.trim().length() == 0) ? response.c() : string);
            this.c = null;
        }
        string = null;
        this.d = new com.sankuai.waimai.platform.modular.network.error.a((string != null || string.trim().length() == 0) ? response.c() : string);
        this.c = null;
    }
}
