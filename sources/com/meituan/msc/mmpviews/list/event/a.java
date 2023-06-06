package com.meituan.msc.mmpviews.list.event;

import android.view.MotionEvent;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.WritableArray;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.uimanager.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static WritableArray a(int i, e eVar) {
        Object[] objArr = {Integer.valueOf(i), eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58cfea6a66965249c748895e50b75d16", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58cfea6a66965249c748895e50b75d16");
        }
        WritableArray createArray = Arguments.createArray();
        MotionEvent e = eVar.e();
        float x = e.getX() - eVar.b;
        float y = e.getY() - eVar.c;
        for (int i2 = 0; i2 < e.getPointerCount(); i2++) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("pageX", s.c(e.getX(i2)));
            createMap.putDouble("pageY", s.c(e.getY(i2)));
            createMap.putDouble("locationX", s.c(e.getX(i2) - x));
            createMap.putDouble("locationY", s.c(e.getY(i2) - y));
            createMap.putInt("target", eVar.h);
            createMap.putDouble(DeviceInfo.TM, eVar.i);
            createMap.putDouble("identifier", e.getPointerId(i2));
            if (eVar.d >= 0) {
                createMap.putInt("index", eVar.d);
                createMap.putString("itemType", eVar.e);
            }
            createArray.pushMap(createMap);
        }
        return createArray;
    }
}
