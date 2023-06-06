package com.meituan.mmp.lib.msi;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.mmp.lib.ab;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.msi.api.ApiRequest;
import com.meituan.msi.api.ApiResponse;
import com.meituan.msi.bean.ApiException;
import com.meituan.msi.interceptor.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g implements com.meituan.msi.interceptor.b {
    public static ChangeQuickRedirect a;
    com.meituan.mmp.lib.engine.m b;
    private com.meituan.mmp.main.e c;

    @Override // com.meituan.msi.interceptor.b
    public final int a() {
        return 50;
    }

    public g(@NonNull com.meituan.mmp.lib.engine.m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "850460ad0c73a9954053d2c2418b2549", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "850460ad0c73a9954053d2c2418b2549");
            return;
        }
        this.c = new com.meituan.mmp.main.e() { // from class: com.meituan.mmp.lib.msi.g.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.main.e
            public final void a(Intent intent, int i, @Nullable IApiCallback iApiCallback) {
            }

            @Override // com.meituan.mmp.main.e
            public final ab b() {
                return null;
            }

            @Override // com.meituan.mmp.main.e
            public final com.meituan.mmp.lib.config.a c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "339974387cbdea40527276d3c46c6c57", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.mmp.lib.config.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "339974387cbdea40527276d3c46c6c57") : g.this.b.d;
            }

            @Override // com.meituan.mmp.main.e
            public final com.meituan.mmp.lib.page.e a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "34a2226746194fe7c1dc5e9b6ee29f96", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.mmp.lib.page.e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "34a2226746194fe7c1dc5e9b6ee29f96") : g.this.b.a(i);
            }

            @Override // com.meituan.mmp.main.e
            public final Activity a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f4af834e49b03eee87a66b55d77aae6", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Activity) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f4af834e49b03eee87a66b55d77aae6");
                }
                if (g.this.b.r != null) {
                    return g.this.b.r.f;
                }
                return null;
            }

            @Override // com.meituan.mmp.main.e
            public final com.meituan.mmp.lib.devtools.e d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15a9c9e1c9a4e2907b54809aa3c9edfd", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.mmp.lib.devtools.e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15a9c9e1c9a4e2907b54809aa3c9edfd") : g.this.b.m;
            }
        };
        this.b = mVar;
    }

    @Override // com.meituan.msi.interceptor.b
    public final ApiResponse<?> a(b.a aVar) throws ApiException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a5ed2943c5372a3c0678b9311fe8ebd", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApiResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a5ed2943c5372a3c0678b9311fe8ebd");
        }
        ApiRequest<?> a2 = aVar.a();
        if (a2.getApiImpl() instanceof b) {
            ((b) a2.getApiImpl()).a(this.c);
        }
        if (a2.getApiImpl() instanceof MMPApi) {
            ((MMPApi) a2.getApiImpl()).d = this.b;
        }
        return aVar.a(a2);
    }
}
