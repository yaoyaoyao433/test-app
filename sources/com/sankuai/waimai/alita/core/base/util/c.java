package com.sankuai.waimai.alita.core.base.util;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.engine.h;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    public static String b = "AlitaJSListenerUtil";

    public static void a(h hVar, @Nullable Exception exc) {
        Object[] objArr = {hVar, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14fbf4e0edb494da7fd7749b9bc7de1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14fbf4e0edb494da7fd7749b9bc7de1e");
        } else if (hVar != null) {
            hVar.a(exc);
        }
    }
}
