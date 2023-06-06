package com.sankuai.waimai.alita.core.base;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static Map<String, e> b = new HashMap();

    @NonNull
    public static e a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a509402c613dd1c72d1f947458d91cde", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a509402c613dd1c72d1f947458d91cde");
        }
        e eVar = b.get(str);
        if (eVar == null) {
            e eVar2 = new e(str);
            b.put(str, eVar2);
            return eVar2;
        }
        return eVar;
    }
}
