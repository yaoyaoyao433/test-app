package com.meituan.msc.modules.api.msi.interceptor;

import com.meituan.msc.modules.engine.h;
import com.meituan.msi.api.ApiRequest;
import com.meituan.msi.api.ApiResponse;
import com.meituan.msi.bean.ApiException;
import com.meituan.msi.interceptor.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements com.meituan.msi.interceptor.b {
    public static ChangeQuickRedirect a;
    private h b;

    @Override // com.meituan.msi.interceptor.b
    public final int a() {
        return 50;
    }

    public a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a25f62d1626bb486ad3a540b64c57726", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a25f62d1626bb486ad3a540b64c57726");
        } else {
            this.b = hVar;
        }
    }

    @Override // com.meituan.msi.interceptor.b
    public final ApiResponse<?> a(b.a aVar) throws ApiException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ab95fee95b9ef8631a4aee70314b54b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApiResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ab95fee95b9ef8631a4aee70314b54b");
        }
        ApiRequest<?> a2 = aVar.a();
        if (a2.getApiImpl() instanceof com.meituan.msc.modules.api.msi.a) {
            ((com.meituan.msc.modules.api.msi.a) a2.getApiImpl()).a(this.b);
        }
        return aVar.a(a2);
    }
}
