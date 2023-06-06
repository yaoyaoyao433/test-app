package com.sankuai.waimai.ugc.creator.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static boolean a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a0f4905b0c9f799cc959355fafade62", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a0f4905b0c9f799cc959355fafade62")).booleanValue();
        }
        Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2), 3};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "96cb785eec56b591f82bb66c6fd9ea85", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "96cb785eec56b591f82bb66c6fd9ea85")).booleanValue() : ((double) Math.abs(f - f2)) <= Math.pow(0.1d, 3.0d);
    }
}
