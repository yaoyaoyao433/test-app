package com.sankuai.meituan.android.knb;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KNBWebCompactFactory {
    public static final int COMPACT_MTNB_INCLUDING = 1;
    public static final int COMPACT_PRELOAD_INCLUDING = 3;
    public static final int COMPACT_TITANS_INCLUDING = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static KNBWebCompat getKNBCompact(int i, Activity activity) {
        Object[] objArr = {Integer.valueOf(i), activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "460f41f36a706ff14c2636fbf6c895f7", RobustBitConfig.DEFAULT_VALUE) ? (KNBWebCompat) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "460f41f36a706ff14c2636fbf6c895f7") : new KNBWebCompat(i);
    }

    @Deprecated
    public static KNBWebCompat getKNBCompact(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cc583c9466c55c86a0fa1cddb3b01cb8", RobustBitConfig.DEFAULT_VALUE) ? (KNBWebCompat) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cc583c9466c55c86a0fa1cddb3b01cb8") : new KNBWebCompat(i);
    }

    @Deprecated
    public static KNBWebCompat getKNBCompact() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5c64c01314d1807b0564222aba806e81", RobustBitConfig.DEFAULT_VALUE) ? (KNBWebCompat) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5c64c01314d1807b0564222aba806e81") : new KNBWebCompat();
    }
}
