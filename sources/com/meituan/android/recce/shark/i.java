package com.meituan.android.recce.shark;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.o;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static ChangeQuickRedirect a;

    @NonNull
    public static ak a(@NonNull Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3bc9bc8ee25e78cfcb9b15fa8d5c19f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (ak) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3bc9bc8ee25e78cfcb9b15fa8d5c19f2");
        }
        o.a aVar = new o.a();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            aVar.a(entry.getKey(), entry.getValue() == null ? "" : entry.getValue());
        }
        return aVar.a();
    }
}
