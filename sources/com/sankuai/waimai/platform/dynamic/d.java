package com.sankuai.waimai.platform.dynamic;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.meituan.android.cube.pga.type.a] */
    @Nullable
    public static <T extends com.meituan.android.cube.pga.block.a> T a(@NonNull com.meituan.android.cube.pga.block.a aVar, @NonNull String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c642905886eb4d6a06d3e396d55f0932", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c642905886eb4d6a06d3e396d55f0932");
        }
        com.meituan.android.cube.pga.dynamic.d a2 = a(str);
        if (a2 == 0) {
            return null;
        }
        com.meituan.android.cube.pga.block.b a3 = a2.a((com.meituan.android.cube.pga.type.a) aVar.F());
        if (a3 instanceof com.meituan.android.cube.pga.block.a) {
            return (T) a3;
        }
        return null;
    }

    @Nullable
    public static com.meituan.android.cube.pga.dynamic.d a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a098b87e457af1eab70c9b09523606bd", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.dynamic.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a098b87e457af1eab70c9b09523606bd") : com.meituan.android.cube.pga.dynamic.a.a().a(str);
    }
}
