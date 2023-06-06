package com.meituan.msc.jse.bridge;

import android.support.annotation.Nullable;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DynamicFromObject implements Dynamic {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private Object mObject;

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public void recycle() {
    }

    public DynamicFromObject(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "664f5244a6ba05b2f9f24e74ba82dfca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "664f5244a6ba05b2f9f24e74ba82dfca");
        } else {
            this.mObject = obj;
        }
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public boolean isNull() {
        return this.mObject == null;
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public boolean asBoolean() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80d281a987480838565812b9cc65f14a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80d281a987480838565812b9cc65f14a")).booleanValue() : ((Boolean) this.mObject).booleanValue();
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public double asDouble() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "720c690a49a7c911be109211f441b5ab", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "720c690a49a7c911be109211f441b5ab")).doubleValue() : ((Double) this.mObject).doubleValue();
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public int asInt() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "648fa063732e0bdb9f7e5c12450f6ef5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "648fa063732e0bdb9f7e5c12450f6ef5")).intValue() : ((Double) this.mObject).intValue();
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public String asString() {
        return (String) this.mObject;
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public ReadableArray asArray() {
        return (ReadableArray) this.mObject;
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public ReadableMap asMap() {
        return (ReadableMap) this.mObject;
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public ReadableType getType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a929334a27dca22db02be0a096435493", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReadableType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a929334a27dca22db02be0a096435493");
        }
        if (isNull()) {
            return ReadableType.Null;
        }
        if (this.mObject instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (this.mObject instanceof Number) {
            return ReadableType.Number;
        }
        if (this.mObject instanceof String) {
            return ReadableType.String;
        }
        if (this.mObject instanceof ReadableMap) {
            return ReadableType.Map;
        }
        if (this.mObject instanceof ReadableArray) {
            return ReadableType.Array;
        }
        g.a("ReactNative", "Unmapped object type " + this.mObject.getClass().getName());
        return ReadableType.Null;
    }
}
