package com.meituan.msi.interceptor;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.meituan.msi.api.ApiRequest;
import com.meituan.msi.api.ApiResponse;
import com.meituan.msi.api.GsonApiRequest;
import com.meituan.msi.api.k;
import com.meituan.msi.api.l;
import com.meituan.msi.bean.ApiException;
import com.meituan.msi.interceptor.b;
import com.meituan.msi.privacy.permission.a;
import com.meituan.msi.util.ae;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f implements b {
    public static ChangeQuickRedirect a;
    private com.meituan.msi.privacy.permission.a b;

    @Override // com.meituan.msi.interceptor.b
    public final int a() {
        return 40;
    }

    public f(@NonNull com.meituan.msi.privacy.permission.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd3f84b2a00f6bd6aa93912541e14eca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd3f84b2a00f6bd6aa93912541e14eca");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.meituan.msi.interceptor.b
    public final ApiResponse<?> a(final b.a aVar) throws ApiException {
        Set<String> hashSet;
        String[] a2;
        String[] a3;
        String[] strArr;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56d295476709dac7c8a37e7cb458cf94", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApiResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56d295476709dac7c8a37e7cb458cf94");
        }
        final ApiRequest<?> a4 = aVar.a();
        com.meituan.msi.api.a apiCall = a4.getApiCall();
        if (apiCall == null) {
            return aVar.a(aVar.a());
        }
        Object[] objArr2 = {a4, apiCall};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76e7c70cb40f04f433c25b3a0c329298", RobustBitConfig.DEFAULT_VALUE)) {
            strArr = (String[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76e7c70cb40f04f433c25b3a0c329298");
        } else {
            Object[] objArr3 = {a4};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msi.api.a.a;
            if (PatchProxy.isSupport(objArr3, apiCall, changeQuickRedirect3, false, "33fcc5bc81c5655ed7d52340931409b4", RobustBitConfig.DEFAULT_VALUE)) {
                hashSet = (Set) PatchProxy.accessDispatch(objArr3, apiCall, changeQuickRedirect3, false, "33fcc5bc81c5655ed7d52340931409b4");
            } else {
                hashSet = new HashSet();
                if ((apiCall.b instanceof l) && (a3 = ((l) apiCall.b).a(a4.getName())) != null) {
                    hashSet.addAll(Arrays.asList(a3));
                }
                if ((apiCall.b instanceof k) && a4.bodyData != null && (a2 = ((k) apiCall.b).a(a4.getName(), a4.bodyData.b)) != null) {
                    hashSet.addAll(Arrays.asList(a2));
                }
                if (apiCall.c != null && apiCall.c.h != null) {
                    hashSet.addAll(apiCall.c.h);
                }
            }
            if (hashSet == null || hashSet.isEmpty()) {
                strArr = new String[0];
            } else {
                String a5 = a4 instanceof GsonApiRequest ? ae.a(((GsonApiRequest) a4).getArgs()) : "";
                ArrayList arrayList = new ArrayList();
                for (String str : hashSet) {
                    if (!com.meituan.msi.privacy.permission.a.a(com.meituan.msi.a.f(), str, a5)) {
                        arrayList.add(str);
                    }
                }
                strArr = (String[]) arrayList.toArray(new String[0]);
            }
        }
        if (strArr.length == 0) {
            return aVar.a(aVar.a());
        }
        if (a4.callback() == null) {
            ApiResponse.notifyNegativeResult(aVar.a().callback(), ApiResponse.negativeResponse(aVar.a(), 401, "no permission ", ApiResponse.a.callbackValue));
        }
        Activity activity = a4.getActivity();
        if (activity == null) {
            ApiResponse<?> negativeResponse = ApiResponse.negativeResponse(a4, 500, "activity 为空，申请权限失败", ApiResponse.a.callbackValue);
            ApiResponse.notifyNegativeResult(a4.callback(), negativeResponse);
            return negativeResponse;
        }
        this.b.a(activity, strArr, a4 instanceof GsonApiRequest ? ae.a(((GsonApiRequest) a4).getArgs()) : "", new a.InterfaceC0498a() { // from class: com.meituan.msi.interceptor.f.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.privacy.permission.a.InterfaceC0498a
            public final void onResult(String str2, String[] strArr2, int[] iArr, String str3) {
                Object[] objArr4 = {str2, strArr2, iArr, str3};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2f429efaee205358681d48eb7717a4f0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2f429efaee205358681d48eb7717a4f0");
                } else if (com.meituan.msi.privacy.permission.a.a(iArr)) {
                    try {
                        aVar.a(a4);
                    } catch (ApiException e) {
                        e.printStackTrace();
                    }
                } else {
                    ApiResponse.notifyNegativeResult(a4.callback(), ApiResponse.negativeResponse(a4, com.meituan.msi.privacy.permission.b.b(iArr), str3, ApiResponse.a.callbackValue));
                }
            }
        });
        return null;
    }
}
