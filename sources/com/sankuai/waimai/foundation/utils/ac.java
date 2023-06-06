package com.sankuai.waimai.foundation.utils;

import android.content.Context;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class ac {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52487b0cb233681b2eff8bcc02e86b4e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52487b0cb233681b2eff8bcc02e86b4e")).booleanValue();
        }
        MtTelephonyManager createTelephonyManager = Privacy.createTelephonyManager(context, "com.sankuai.waimai.foundation:utils");
        return createTelephonyManager != null && createTelephonyManager.getSimState() == 5;
    }
}
