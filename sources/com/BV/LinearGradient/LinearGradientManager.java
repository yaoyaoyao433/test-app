package com.BV.LinearGradient;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class LinearGradientManager extends SimpleViewManager<LinearGradientView> {
    public static final String PROP_ANGLE = "angle";
    public static final String PROP_ANGLE_CENTER = "angleCenter";
    public static final String PROP_BORDER_RADII = "borderRadii";
    public static final String PROP_COLORS = "colors";
    public static final String PROP_END_POS = "endPoint";
    public static final String PROP_LOCATIONS = "locations";
    public static final String PROP_START_POS = "startPoint";
    public static final String PROP_USE_ANGLE = "useAngle";
    public static final String REACT_CLASS = "BVLinearGradient";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public LinearGradientView createViewInstance(ao aoVar) {
        return new LinearGradientView(aoVar);
    }

    @ReactProp(name = PROP_COLORS)
    public void setColors(LinearGradientView linearGradientView, ReadableArray readableArray) {
        linearGradientView.setColors(readableArray);
    }

    @ReactProp(name = PROP_LOCATIONS)
    public void setLocations(LinearGradientView linearGradientView, ReadableArray readableArray) {
        if (readableArray != null) {
            linearGradientView.setLocations(readableArray);
        }
    }

    @ReactProp(name = PROP_START_POS)
    public void setStartPosition(LinearGradientView linearGradientView, ReadableArray readableArray) {
        linearGradientView.setStartPosition(readableArray);
    }

    @ReactProp(name = PROP_END_POS)
    public void setEndPosition(LinearGradientView linearGradientView, ReadableArray readableArray) {
        linearGradientView.setEndPosition(readableArray);
    }

    @ReactProp(defaultBoolean = false, name = PROP_USE_ANGLE)
    public void setUseAngle(LinearGradientView linearGradientView, boolean z) {
        linearGradientView.setUseAngle(z);
    }

    @ReactProp(name = PROP_ANGLE_CENTER)
    public void setAngleCenter(LinearGradientView linearGradientView, ReadableArray readableArray) {
        linearGradientView.setAngleCenter(readableArray);
    }

    @ReactProp(defaultFloat = 45.0f, name = PROP_ANGLE)
    public void setAngle(LinearGradientView linearGradientView, float f) {
        linearGradientView.setAngle(f);
    }

    @ReactProp(name = PROP_BORDER_RADII)
    public void setBorderRadii(LinearGradientView linearGradientView, ReadableArray readableArray) {
        linearGradientView.setBorderRadii(readableArray);
    }
}
