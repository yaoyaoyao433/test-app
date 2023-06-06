package com.meituan.msc.mmpviews.csstypes.helper;

import android.graphics.PointF;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static PointF a(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "faaf28d3655554bc2c47429e5a65de14", RobustBitConfig.DEFAULT_VALUE)) {
            return (PointF) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "faaf28d3655554bc2c47429e5a65de14");
        }
        if (readableArray == null) {
            return null;
        }
        return new PointF((float) readableArray.getDouble(0), (float) readableArray.getDouble(1));
    }
}
