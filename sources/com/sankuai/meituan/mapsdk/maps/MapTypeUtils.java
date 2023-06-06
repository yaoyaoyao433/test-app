package com.sankuai.meituan.mapsdk.maps;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MapTypeUtils {
    private static AtomicInteger a = new AtomicInteger(MapsInitializer.getMapType());
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int getCurrentMapType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8aa0228e04bccbab87ec6a65a33f5475", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8aa0228e04bccbab87ec6a65a33f5475")).intValue() : a.get();
    }

    public static void setCurrentMapType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e28fa16b95b309620009e55e1c41ea04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e28fa16b95b309620009e55e1c41ea04");
        } else {
            a.set(i);
        }
    }
}
