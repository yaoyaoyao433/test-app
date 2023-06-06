package com.meituan.msc.uimanager.events;

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
public final class h {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static WritableArray a(int i, e eVar) {
        Object[] objArr = {Integer.valueOf(i), eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d77fe8e4d5753d0a25343d89202af51", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d77fe8e4d5753d0a25343d89202af51");
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
            createMap.putInt("target", i);
            createMap.putDouble(DeviceInfo.TM, eVar.i);
            createMap.putDouble("identifier", e.getPointerId(i2));
            createArray.pushMap(createMap);
        }
        return createArray;
    }
}
