package com.meituan.msi.interceptor;

import android.support.annotation.NonNull;
import com.meituan.msi.api.ApiRequest;
import com.meituan.msi.api.ApiResponse;
import com.meituan.msi.bean.ApiException;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.interceptor.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements b.a {
    public static ChangeQuickRedirect a = null;
    public static int b = 112;
    public Map<String, a<?>> c;
    private final int d;
    private final ApiRequest<?> e;
    private final List<b> f;

    private d(int i, ApiRequest<?> apiRequest, List<b> list) {
        Object[] objArr = {Integer.valueOf(i), apiRequest, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a12be2d4ee8b097af408d054963d032e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a12be2d4ee8b097af408d054963d032e");
            return;
        }
        this.d = i;
        this.e = apiRequest;
        this.f = list;
    }

    public static <T> d a(ApiRequest<T> apiRequest, List<b> list, com.meituan.msi.api.b bVar, com.meituan.msi.privacy.permission.a aVar) {
        Object[] objArr = {apiRequest, list, bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "69a7e7d320938186e1061429c462bc8a", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "69a7e7d320938186e1061429c462bc8a");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new g(bVar));
        if (com.meituan.msi.a.c() != null) {
            arrayList.add(com.meituan.msi.a.c());
        }
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(list);
        }
        arrayList.add(new c());
        arrayList.add(new f(aVar));
        Collections.sort(arrayList, new Comparator<b>() { // from class: com.meituan.msi.interceptor.d.1
            public static ChangeQuickRedirect a;

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(b bVar2, b bVar3) {
                b bVar4 = bVar2;
                b bVar5 = bVar3;
                Object[] objArr2 = {bVar4, bVar5};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bee965162e8e874ac79f00fe6363889e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bee965162e8e874ac79f00fe6363889e")).intValue() : bVar4.a() - bVar5.a();
            }
        });
        return new d(0, apiRequest, arrayList);
    }

    @Override // com.meituan.msi.interceptor.b.a
    public final ApiRequest<?> a() {
        return this.e;
    }

    @Override // com.meituan.msi.interceptor.b.a
    @NonNull
    public final MsiContext b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d0618961e60ad603f23a71bc8f66e9b", RobustBitConfig.DEFAULT_VALUE)) {
            return (MsiContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d0618961e60ad603f23a71bc8f66e9b");
        }
        return new MsiContext(this.c == null ? null : this.c.get(this.e.getName()), this.e, this.e.callback());
    }

    @Override // com.meituan.msi.interceptor.b.a
    public final ApiResponse<?> a(ApiRequest<?> apiRequest) throws ApiException {
        Object[] objArr = {apiRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f6a2ecb0d57e052616ec40b2e50aa7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApiResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f6a2ecb0d57e052616ec40b2e50aa7e");
        }
        if (this.d < this.f.size()) {
            d dVar = new d(this.d + 1, apiRequest, this.f);
            dVar.c = this.c;
            return this.f.get(this.d).a(dVar);
        }
        return b(apiRequest);
    }

    private ApiResponse<?> b(ApiRequest<?> apiRequest) throws ApiException {
        Object[] objArr = {apiRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4da2f34d8c11004b85963f9692750ea2", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApiResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4da2f34d8c11004b85963f9692750ea2");
        }
        if (apiRequest.getApiCall() == null) {
            throw new ApiException("defaultCall is null");
        }
        return apiRequest.getApiCall().a(this.c == null ? null : this.c.get(apiRequest.getName()), apiRequest, apiRequest.callback());
    }
}
