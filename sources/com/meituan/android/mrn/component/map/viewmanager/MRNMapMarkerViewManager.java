package com.meituan.android.mrn.component.map.viewmanager;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.c;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.mrn.component.map.utils.a;
import com.meituan.android.mrn.component.map.view.childview.f;
import com.meituan.android.mrn.component.map.viewmanager.MRNMapMarkerViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
import com.sankuai.meituan.mapsdk.maps.model.animation.TranslateAnimation;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
/* loaded from: classes2.dex */
public class MRNMapMarkerViewManager extends ViewGroupManager<f> {
    private static final int ANIMATE_TO_COORDINATE = 4;
    public static final String EVENT_ON_MARKER_ANIMATION = "onMarkerAnimationUpdate";
    public static final String EVENT_ON_MARKER_DESELECTED = "onMarkerDeselected";
    public static final String EVENT_ON_MARKER_DRAG = "onMarkerDrag";
    public static final String EVENT_ON_MARKER_PRESS = "onMarkerPress";
    public static final String EVENT_ON_MARKER_SELECTED = "onMarkerSelected";
    private static final int HIDE_INFO_WINDOW = 2;
    private static final int REFRESH_MARKER = 3;
    private static final int SET_SELECT = 5;
    private static final int SHOW_INFO_WINDOW = 1;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager
    @Nonnull
    public f createViewInstance(@Nonnull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f962d31645b42bc5385eb0b075924069", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f962d31645b42bc5385eb0b075924069") : new f(aoVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "832af97c3d1922202123abe5a1b02e47", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "832af97c3d1922202123abe5a1b02e47") : c.a("showCallout", 1, "hideCallout", 2, "refreshMarker", 3, "animateToCoordinate", 4, "setSelect", 5);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "939dd49fa4106d22164894e187ea157d", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "939dd49fa4106d22164894e187ea157d") : c.b().a("onMarkerPress", c.a("registrationName", "onMarkerPress")).a(EVENT_ON_MARKER_ANIMATION, c.a("registrationName", EVENT_ON_MARKER_ANIMATION)).a(EVENT_ON_MARKER_SELECTED, c.a("registrationName", EVENT_ON_MARKER_SELECTED)).a(EVENT_ON_MARKER_DESELECTED, c.a("registrationName", EVENT_ON_MARKER_DESELECTED)).a(EVENT_ON_MARKER_DRAG, c.a("registrationName", EVENT_ON_MARKER_DRAG)).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "MRNMapMarker";
    }

    @ReactProp(name = "ancho")
    public void setAnchor(f fVar, ReadableMap readableMap) {
        Object[] objArr = {fVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6cdcc26379d69970ee985cf3150bbbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6cdcc26379d69970ee985cf3150bbbd");
        } else {
            fVar.setAnchor(readableMap);
        }
    }

    @ReactProp(name = "clickable")
    public void setClickable(f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56fe30390bfe03669085e0a1d99289ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56fe30390bfe03669085e0a1d99289ad");
        } else {
            fVar.setMarkerClickable(z);
        }
    }

    @ReactProp(name = "displayLevel")
    public void setDisplayLevel(f fVar, int i) {
        Object[] objArr = {fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10d6d6002a644d3b4e9bcb990b90455d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10d6d6002a644d3b4e9bcb990b90455d");
        } else {
            fVar.setDisplayLevel(i);
        }
    }

    @ReactProp(defaultBoolean = false, name = "draggable")
    public void setDragable(f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ae73fd48ec36dd8790691ee5a822a49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ae73fd48ec36dd8790691ee5a822a49");
        } else {
            fVar.setDragable(z);
        }
    }

    @ReactProp(name = RemoteMessageConst.Notification.ICON)
    public void setIcon(f fVar, String str) {
        Object[] objArr = {fVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68a01248d506e0eeabf680be643397d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68a01248d506e0eeabf680be643397d6");
        } else {
            fVar.setIcon(str);
        }
    }

    @ReactProp(name = "iconAllowOverlap")
    public void setIconAllowOverlap(f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06908a88a9d161421140432d3eaf6d6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06908a88a9d161421140432d3eaf6d6d");
        } else {
            fVar.setIconAllowOverlap(z);
        }
    }

    @ReactProp(name = "iconId")
    public void setIconId(f fVar, String str) {
        Object[] objArr = {fVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba9dc31ecda8b6facdde2c04734be6a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba9dc31ecda8b6facdde2c04734be6a2");
        } else {
            fVar.setIconId(str);
        }
    }

    @ReactProp(name = "iconIgnorePlacement")
    public void setIconIgnorePlacement(f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c62da7f9ab01e92e313375c9a0048c54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c62da7f9ab01e92e313375c9a0048c54");
        } else {
            fVar.setIconIgnorePlacement(z);
        }
    }

    @ReactProp(name = "iconSize")
    public void setIconWidth(f fVar, ReadableMap readableMap) {
        Object[] objArr = {fVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92b3112b34405e1ada2d5d43cb771f2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92b3112b34405e1ada2d5d43cb771f2e");
        } else {
            fVar.setIconSize(readableMap);
        }
    }

    @ReactProp(name = "canAlwaysShow")
    public void setInfoWindowAlwaysShow(f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ad69b963cc781c82f89e847cde55faa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ad69b963cc781c82f89e847cde55faa");
        } else {
            fVar.setInfoWindowAlwaysShow(z);
        }
    }

    @ReactProp(defaultBoolean = true, name = "canShowCallout")
    public void setInfoWindowEnable(f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbe10aae71140371031a93609c38420d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbe10aae71140371031a93609c38420d");
        } else {
            fVar.setInfoWindowEnable(z);
        }
    }

    @ReactProp(name = "calloutOffset")
    public void setInfoWindowOffset(f fVar, ReadableMap readableMap) {
        Object[] objArr = {fVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0de14a265cf9b3f3a27e83fddf8905f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0de14a265cf9b3f3a27e83fddf8905f3");
        } else {
            fVar.setInfoWindowOffset(readableMap);
        }
    }

    @ReactProp(name = "markerName")
    public void setMarkerName(f fVar, String str) {
        Object[] objArr = {fVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1472cfaf9e7b8f7b128dcdf9ab9cf077", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1472cfaf9e7b8f7b128dcdf9ab9cf077");
        } else {
            fVar.setMarkerName(str);
        }
    }

    @ReactProp(customType = "Color", name = "markerNameColor")
    public void setMarkerNameColor(f fVar, int i) {
        Object[] objArr = {fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac7adf275a88c565e66c44c4e778b9b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac7adf275a88c565e66c44c4e778b9b0");
        } else {
            fVar.setMarkerNameColor(i);
        }
    }

    @ReactProp(name = "textOffset")
    public void setMarkerNameOffset(f fVar, ReadableMap readableMap) {
        Object[] objArr = {fVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48f31fbbfbc27b09d50e99d37aa9c9b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48f31fbbfbc27b09d50e99d37aa9c9b1");
        } else {
            fVar.setMarkerNameOffset(readableMap);
        }
    }

    @ReactProp(name = "markerNameSize")
    public void setMarkerNameSize(f fVar, int i) {
        Object[] objArr = {fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f81177ad06e1e74b60547c5f051c071", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f81177ad06e1e74b60547c5f051c071");
        } else {
            fVar.setMarkerNameSize(i);
        }
    }

    @ReactProp(customType = "Color", name = "textHaloColor")
    public void setMarkerNameStrokeColor(f fVar, int i) {
        Object[] objArr = {fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68a8362e40a425ea9ece30fe5e70dad4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68a8362e40a425ea9ece30fe5e70dad4");
        } else {
            fVar.setMarkerNameStrokeColor(i);
        }
    }

    @ReactProp(name = "textHaloWidth")
    public void setMarkerNameStrokeWidth(f fVar, int i) {
        Object[] objArr = {fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d1a5fed0fce304c41d3c24094429460", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d1a5fed0fce304c41d3c24094429460");
        } else {
            fVar.setMarkerNameStrokeWidth(i);
        }
    }

    @ReactProp(name = "offset")
    public void setOffset(f fVar, ReadableMap readableMap) {
        Object[] objArr = {fVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "218c9d63ca3fdb3943e2af5c08209101", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "218c9d63ca3fdb3943e2af5c08209101");
        } else {
            fVar.setOffset(readableMap);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @ReactProp(name = "opacity")
    public void setOpacity(f fVar, float f) {
        Object[] objArr = {fVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85a4488a81c7eca29c1ca725c4fe5784", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85a4488a81c7eca29c1ca725c4fe5784");
        } else {
            fVar.setOpacity(f);
        }
    }

    @ReactProp(name = "posi")
    public void setPosition(f fVar, ReadableMap readableMap) {
        Object[] objArr = {fVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "713c17620a65f96ebb4380e7db2136fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "713c17620a65f96ebb4380e7db2136fe");
        } else {
            fVar.setPosition(readableMap);
        }
    }

    @ReactProp(name = "rotateAngle")
    public void setRotateAngle(f fVar, float f) {
        Object[] objArr = {fVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f7d5f61e1a2185d1115a581ad3a93ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f7d5f61e1a2185d1115a581ad3a93ac");
        } else {
            fVar.setRotateAngle(f);
        }
    }

    @ReactProp(name = "scale")
    public void setScale(f fVar, float f) {
        Object[] objArr = {fVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e1879ee633da94313e4e47ceb3073eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e1879ee633da94313e4e47ceb3073eb");
        } else {
            fVar.setScale(f);
        }
    }

    @ReactProp(name = "textAllowOverlap")
    public void setTextAllowOverlap(f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9927826845bc380ae68f01b7bd908937", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9927826845bc380ae68f01b7bd908937");
        } else {
            fVar.setTextAllowOverlap(z);
        }
    }

    @ReactProp(name = "textIgnorePlacement")
    public void setTextIgnorePlacement(f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "804d03a6cc87db214c10837fb12e6757", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "804d03a6cc87db214c10837fb12e6757");
        } else {
            fVar.setTextIgnorePlacement(z);
        }
    }

    @ReactProp(defaultBoolean = false, name = "tracksViewChanges")
    public void setTracksViewChanges(f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7081ded4da56cf5e6d3ec4e9aa8082e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7081ded4da56cf5e6d3ec4e9aa8082e3");
        } else {
            fVar.setTracksViewChanges(z);
        }
    }

    @ReactProp(name = "useSharedLayer")
    public void setUseSharedLayer(f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9af530524ee4ca2b3c20eaa488ef80f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9af530524ee4ca2b3c20eaa488ef80f3");
        } else {
            fVar.setUseSharedLayer(z);
        }
    }

    @ReactProp(defaultBoolean = true, name = "viewCallout")
    public void setViewInfoWindow(f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd0080164790ff10e58fd7e58c661249", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd0080164790ff10e58fd7e58c661249");
        } else {
            fVar.setViewInfoWindow(z);
        }
    }

    @ReactProp(defaultBoolean = true, name = "visible")
    public void setVisible(f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5014a3bc85913d73e25b597e38823292", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5014a3bc85913d73e25b597e38823292");
        } else {
            fVar.setVisible(z);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @ReactProp(name = "zIndex")
    public void setZIndex(f fVar, float f) {
        Object[] objArr = {fVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b95755f4907698df041bc7304e02fc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b95755f4907698df041bc7304e02fc7");
        } else {
            fVar.setZIndex(f);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@Nonnull final f fVar, int i, @Nullable ReadableArray readableArray) {
        LatLng b;
        Object[] objArr = {fVar, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d001ffbae6e196fbcc8257fd8396486c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d001ffbae6e196fbcc8257fd8396486c");
            return;
        }
        switch (i) {
            case 1:
                fVar.f();
                return;
            case 2:
                fVar.g();
                return;
            case 3:
                fVar.b();
                return;
            case 4:
                if (readableArray == null || readableArray.size() <= 2) {
                    return;
                }
                ReadableMap map = readableArray.getMap(0);
                ReadableMap map2 = readableArray.getMap(1);
                int i2 = readableArray.getInt(2);
                Object[] objArr2 = {map, map2, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = f.a;
                if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect3, false, "79324fdcf115f4788e90a9a13e7cf69e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect3, false, "79324fdcf115f4788e90a9a13e7cf69e");
                    return;
                } else if (fVar.c == null || (b = a.b(map2)) == null) {
                    return;
                } else {
                    LatLng b2 = a.b(map);
                    if (b2 != null) {
                        fVar.c.setPosition(b2);
                    } else {
                        fVar.c.getPosition();
                    }
                    TranslateAnimation translateAnimation = new TranslateAnimation(b);
                    translateAnimation.setDuration(i2);
                    translateAnimation.setInterpolator(new LinearInterpolator());
                    translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.meituan.android.mrn.component.map.view.childview.f.5
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.mapsdk.maps.model.animation.Animation.AnimationListener
                        public final void onAnimationCancel(Animator animator) {
                        }

                        @Override // com.sankuai.meituan.mapsdk.maps.model.animation.Animation.AnimationListener
                        public final void onAnimationEnd() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "08efca69134559016c2ae65a10eafa7a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "08efca69134559016c2ae65a10eafa7a");
                                return;
                            }
                            WritableMap createMap = Arguments.createMap();
                            createMap.putBoolean("finished", true);
                            fVar.a(MRNMapMarkerViewManager.EVENT_ON_MARKER_ANIMATION, createMap);
                        }

                        @Override // com.sankuai.meituan.mapsdk.maps.model.animation.Animation.AnimationListener
                        public final void onAnimationStart() {
                        }

                        @Override // com.sankuai.meituan.mapsdk.maps.model.animation.Animation.AnimationListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        }
                    });
                    fVar.c.startAnimation(translateAnimation);
                    return;
                }
            case 5:
                if (readableArray != null) {
                    fVar.setSelect(readableArray.getBoolean(0));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
