package com.meituan.msc.uimanager;

import android.view.View;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class af {
    public static ChangeQuickRedirect a;

    public static WritableMap a(View view, View view2, ReadableMap readableMap) {
        Object[] objArr = {view, view2, readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "85f89a5724c4d7415c303b67cbdcc989", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "85f89a5724c4d7415c303b67cbdcc989");
        }
        WritableMap createMap = Arguments.createMap();
        if (readableMap.hasKey("rect") && readableMap.getBoolean("rect")) {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            view.getLocationInWindow(iArr2);
            createMap.putInt("left", (int) s.c(iArr[0] - iArr2[0]));
            createMap.putInt("right", (int) s.c((iArr[0] - iArr2[0]) + view2.getWidth()));
            createMap.putInt("top", (int) s.c(iArr[1] - iArr2[1]));
            createMap.putInt("bottom", (int) s.c((iArr[1] - iArr2[1]) + view2.getHeight()));
        }
        if (readableMap.hasKey(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE) && readableMap.getBoolean(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE)) {
            createMap.putInt("width", (int) s.c(view2.getWidth()));
            createMap.putInt("height", (int) s.c(view2.getHeight()));
        }
        if (readableMap.hasKey("scrollOffset") && readableMap.getBoolean("scrollOffset")) {
            if (view2 instanceof com.meituan.msc.mmpviews.util.a) {
                com.meituan.msc.mmpviews.util.a aVar = (com.meituan.msc.mmpviews.util.a) view2;
                createMap.putInt("scrollLeft", (int) s.c(aVar.getScrollLeft()));
                createMap.putInt("scrollTop", (int) s.c(aVar.getScrollTop()));
            } else {
                createMap.putInt("scrollLeft", (int) s.c(view2.getScrollX()));
                createMap.putInt("scrollTop", (int) s.c(view2.getScrollY()));
            }
        }
        return createMap;
    }
}
