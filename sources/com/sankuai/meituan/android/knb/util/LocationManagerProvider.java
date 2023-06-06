package com.sankuai.meituan.android.knb.util;

import android.content.Context;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LocationManagerProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean isLocationServiceEnable(Context context, String str, boolean z) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5af783c8dd1280717f8b17cd93cbc4d1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5af783c8dd1280717f8b17cd93cbc4d1")).booleanValue();
        }
        try {
            u createLocationManager = Privacy.createLocationManager(context, str);
            return createLocationManager.c("gps") || createLocationManager.c("network");
        } catch (Throwable th) {
            th.printStackTrace();
            return z;
        }
    }
}
