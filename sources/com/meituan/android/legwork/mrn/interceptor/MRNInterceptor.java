package com.meituan.android.legwork.mrn.interceptor;

import com.meituan.android.mrn.module.MRNRequestInterceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MRNInterceptor implements MRNRequestInterceptor {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.mrn.module.MRNRequestInterceptor
    public final List<Interceptor> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70fabcf7797eeae7d488d8414b5970f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70fabcf7797eeae7d488d8414b5970f6");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a());
        return arrayList;
    }
}
