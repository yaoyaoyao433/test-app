package com.meituan.msc.uimanager.layoutanimation;

import android.view.animation.Interpolator;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.ReadableType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class n implements Interpolator {
    public static ChangeQuickRedirect a;
    private final float b;

    public static float a(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f53e37e64c6b08da47c760f7b6393911", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f53e37e64c6b08da47c760f7b6393911")).floatValue();
        }
        if (readableMap.getType("springDamping").equals(ReadableType.Number)) {
            return (float) readableMap.getDouble("springDamping");
        }
        return 0.5f;
    }

    public n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1a0b099c4785d5d15fa31d81d775ec0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1a0b099c4785d5d15fa31d81d775ec0");
        } else {
            this.b = 0.5f;
        }
    }

    public n(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c6eb4bea490b8fd4d89a4b3bb9bf8dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c6eb4bea490b8fd4d89a4b3bb9bf8dc");
        } else {
            this.b = f;
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8c2ce0cc8171182f06bfb303edc8ffe", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8c2ce0cc8171182f06bfb303edc8ffe")).floatValue() : (float) ((Math.pow(2.0d, (-10.0f) * f) * Math.sin((((f - (this.b / 4.0f)) * 3.141592653589793d) * 2.0d) / this.b)) + 1.0d);
    }
}
