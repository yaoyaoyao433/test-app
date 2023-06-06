package com.sankuai.waimai.kit.share.util;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static int a(Intent intent, String str, int i) {
        Object[] objArr = {intent, str, -2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f08db3e65138436b6947da5f7b44611", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f08db3e65138436b6947da5f7b44611")).intValue();
        }
        if (intent == null) {
            return -2;
        }
        try {
            return com.sankuai.waimai.platform.utils.f.a(intent, str, -2);
        } catch (Exception unused) {
            return -2;
        }
    }
}
