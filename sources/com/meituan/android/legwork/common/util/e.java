package com.meituan.android.legwork.common.util;

import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static void a(String str, HornCallback hornCallback, Map<String, Object> map) {
        Object[] objArr = {str, hornCallback, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf915ac6383d7d78c266596bb4b5e30b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf915ac6383d7d78c266596bb4b5e30b");
        } else {
            Horn.register(str, f.a(str, hornCallback), map);
        }
    }
}
