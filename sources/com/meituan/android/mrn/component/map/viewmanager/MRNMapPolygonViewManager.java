package com.meituan.android.mrn.component.map.viewmanager;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.c;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.mrn.component.map.view.childview.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import javax.annotation.Nonnull;
/* loaded from: classes2.dex */
public class MRNMapPolygonViewManager extends ViewGroupManager<g> {
    public static final String EVENT_ON_POLYGON_PRESS = "onPress";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager
    @Nonnull
    public g createViewInstance(@Nonnull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26294164d2d41c909d5f3d04d760f214", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26294164d2d41c909d5f3d04d760f214") : new g(aoVar);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "190c86624a19f07fd5da5164ec1406aa", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "190c86624a19f07fd5da5164ec1406aa") : c.b().a("onPress", c.a("registrationName", "onPress")).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "MRNMapPolygon";
    }

    @ReactProp(defaultBoolean = false, name = "clickable")
    public void setClickable(g gVar, boolean z) {
        Object[] objArr = {gVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2934bc83c511787f9400076ef66cbc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2934bc83c511787f9400076ef66cbc0");
        } else {
            gVar.setClickable(z);
        }
    }

    @ReactProp(name = "coordinates")
    public void setCoordinate(g gVar, ReadableArray readableArray) {
        Object[] objArr = {gVar, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d536782859f3f8f8e7719b8581f9690f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d536782859f3f8f8e7719b8581f9690f");
        } else {
            gVar.setCoordinates(readableArray);
        }
    }

    @ReactProp(name = "dashArray")
    public void setDashArray(g gVar, ReadableArray readableArray) {
        Object[] objArr = {gVar, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26b4ad73ffc252f8e476c9c11127710f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26b4ad73ffc252f8e476c9c11127710f");
        } else {
            gVar.setDashArray(readableArray);
        }
    }

    @ReactProp(name = "displayLevel")
    public void setDisplayLevel(g gVar, int i) {
        Object[] objArr = {gVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e876730a50c3bfc7ccf314fb1686ec5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e876730a50c3bfc7ccf314fb1686ec5e");
        } else {
            gVar.setDisplayLevel(i);
        }
    }

    @ReactProp(customType = "Color", name = "fillColor")
    public void setFillColor(g gVar, int i) {
        Object[] objArr = {gVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75f4c30785dc4e6f901a27d49ca3d6d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75f4c30785dc4e6f901a27d49ca3d6d7");
        } else {
            gVar.setFillColor(i);
        }
    }

    @ReactProp(name = "fillTexture")
    public void setFillTexture(g gVar, String str) {
        Object[] objArr = {gVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "590c2595773007a6c77be2076b30d03f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "590c2595773007a6c77be2076b30d03f");
        } else {
            gVar.setFillTexture(str);
        }
    }

    @ReactProp(name = "holes")
    public void setHoles(g gVar, ReadableArray readableArray) {
        Object[] objArr = {gVar, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d80775ce62d31a61f0379f02691ffda1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d80775ce62d31a61f0379f02691ffda1");
        } else {
            gVar.setHoles(readableArray);
        }
    }

    @ReactProp(customType = "Color", name = "strokeColor")
    public void setStrokeColor(g gVar, int i) {
        Object[] objArr = {gVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c30457244e7598b6543f103dcb18da2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c30457244e7598b6543f103dcb18da2");
        } else {
            gVar.setStrokeColor(i);
        }
    }

    @ReactProp(name = "strokeWidth")
    public void setStrokeWidth(g gVar, float f) {
        Object[] objArr = {gVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb12e71631b60a615dcc74b736b02185", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb12e71631b60a615dcc74b736b02185");
        } else {
            gVar.setStrokeWidth(f);
        }
    }

    @ReactProp(defaultBoolean = true, name = "visible")
    public void setVisible(g gVar, boolean z) {
        Object[] objArr = {gVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33de5e21eab92706682cb68288625c5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33de5e21eab92706682cb68288625c5e");
        } else {
            gVar.setVisible(z);
        }
    }

    @ReactProp(name = "zIndex")
    public void setZIndex(g gVar, int i) {
        Object[] objArr = {gVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81b3fa5e6f0cbb2d0b19e2f112da578d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81b3fa5e6f0cbb2d0b19e2f112da578d");
        } else {
            gVar.setZIndex(i);
        }
    }
}
