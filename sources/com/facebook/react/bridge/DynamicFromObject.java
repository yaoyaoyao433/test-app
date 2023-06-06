package com.facebook.react.bridge;

import android.support.annotation.Nullable;
import com.facebook.common.logging.a;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DynamicFromObject implements Dynamic {
    @Nullable
    private Object mObject;

    @Override // com.facebook.react.bridge.Dynamic
    public void recycle() {
    }

    public DynamicFromObject(@Nullable Object obj) {
        this.mObject = obj;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean isNull() {
        return this.mObject == null;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean asBoolean() {
        return ((Boolean) this.mObject).booleanValue();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public double asDouble() {
        return ((Double) this.mObject).doubleValue();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public int asInt() {
        return ((Double) this.mObject).intValue();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public String asString() {
        return (String) this.mObject;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableArray asArray() {
        return (ReadableArray) this.mObject;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableMap asMap() {
        return (ReadableMap) this.mObject;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableType getType() {
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
        a.d("ReactNative", "Unmapped object type " + this.mObject.getClass().getName());
        return ReadableType.Null;
    }
}
