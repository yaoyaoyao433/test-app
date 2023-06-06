package com.sankuai.waimai.store.poi.list.util;

import android.graphics.Color;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static int a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eef58e400716aa1a0e669075b5b7abc5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eef58e400716aa1a0e669075b5b7abc5")).intValue();
        }
        return Color.argb(f > 0.5f ? (int) ((128.0f * f) + 127.0f) : (int) (255.0f - (f * 255.0f)), (int) (255.0f - (221.0f * f)), (int) (255.0f - (219.0f * f)), (int) (255.0f - (f * 217.0f)));
    }

    public static int b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3a432be3285e2167164b64967a770a0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3a432be3285e2167164b64967a770a0")).intValue();
        }
        int i = (int) (255.0f - (f * 10.0f));
        return Color.argb(255, i, i, i);
    }
}
