package com.meituan.android.mrn.network;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.mrn.config.y;
import com.meituan.android.mrn.config.z;
import com.meituan.android.mrn.module.MRNRequestInterceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static Map<String, b> b = new HashMap();

    public static synchronized b a(Context context, String str, String str2) {
        synchronized (c.class) {
            Object[] objArr = {context, str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be893f5e5f30b93ef2c37e4832b4d840", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be893f5e5f30b93ef2c37e4832b4d840");
            }
            String format = TextUtils.isEmpty(str) ? str2 : String.format("%s_%s", str, str2);
            b bVar = b.containsKey(format) ? b.get(format) : null;
            if (bVar == null) {
                ArrayList arrayList = new ArrayList();
                MRNRequestInterceptor mRNRequestInterceptor = y.a().j;
                if (mRNRequestInterceptor != null && mRNRequestInterceptor.a() != null && mRNRequestInterceptor.a().size() > 0) {
                    arrayList.addAll(mRNRequestInterceptor.a());
                }
                if (!TextUtils.isEmpty(str) && com.sankuai.meituan.serviceloader.b.a()) {
                    List a2 = com.sankuai.meituan.serviceloader.b.a(MRNRequestInterceptor.class, str);
                    if (!CollectionUtils.isEmpty(a2) && a2.get(0) != null) {
                        arrayList.addAll(((MRNRequestInterceptor) a2.get(0)).a());
                    }
                }
                z.a();
                bVar = b.a(context, str2, arrayList);
                b.put(format, bVar);
            }
            return bVar;
        }
    }
}
