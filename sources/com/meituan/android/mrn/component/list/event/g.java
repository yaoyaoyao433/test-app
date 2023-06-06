package com.meituan.android.mrn.component.list.event;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.w;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static WritableArray a(int i, e eVar) {
        Object[] objArr = {Integer.valueOf(i), eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f173321f863fb1f4ca44da2b398344f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f173321f863fb1f4ca44da2b398344f2");
        }
        WritableArray createArray = Arguments.createArray();
        MotionEvent h = eVar.h();
        float x = h.getX() - eVar.b;
        float y = h.getY() - eVar.c;
        for (int i2 = 0; i2 < h.getPointerCount(); i2++) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("pageX", w.c(h.getX(i2)));
            createMap.putDouble("pageY", w.c(h.getY(i2)));
            createMap.putDouble("locationX", w.c(h.getX(i2) - x));
            createMap.putDouble("locationY", w.c(h.getY(i2) - y));
            createMap.putInt("target", i);
            createMap.putDouble(DeviceInfo.TM, eVar.f());
            createMap.putDouble("identifier", h.getPointerId(i2));
            if (eVar.g >= 0 && eVar.h >= 0) {
                createMap.putInt("sectionIndex", eVar.g);
                createMap.putInt("itemIndex", eVar.h);
            }
            createArray.pushMap(createMap);
        }
        return createArray;
    }
}
