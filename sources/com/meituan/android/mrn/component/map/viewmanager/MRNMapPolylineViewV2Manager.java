package com.meituan.android.mrn.component.map.viewmanager;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.c;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.mrn.component.map.utils.a;
import com.meituan.android.mrn.component.map.utils.e;
import com.meituan.android.mrn.component.map.view.childview.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import javax.annotation.Nonnull;
/* loaded from: classes2.dex */
public class MRNMapPolylineViewV2Manager extends ViewGroupManager<h> {
    private static final int COMMAND_ERASE_TO = 1;
    public static final String EVENT_ON_POLYLINE_PRESS = "onPress";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager
    @Nonnull
    public h createViewInstance(@Nonnull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61ac8de3b1d8197ae6a8f2cc44a57306", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61ac8de3b1d8197ae6a8f2cc44a57306") : new h(aoVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f46471ba3bcf82b7ae67ea125f0e5867", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f46471ba3bcf82b7ae67ea125f0e5867") : c.a("eraseTo", 1);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f741124fbc66f44d57f0418839cc9f5", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f741124fbc66f44d57f0418839cc9f5") : c.b().a("onPress", c.a("registrationName", "onPress")).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "MRNMapPolylineV2";
    }

    @ReactProp(name = "clickable")
    public void setClickable(h hVar, boolean z) {
        Object[] objArr = {hVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91a90df00e88b46e92538b9613fe8754", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91a90df00e88b46e92538b9613fe8754");
        } else {
            hVar.setPolylineClickable(z);
        }
    }

    @ReactProp(name = "coordinates")
    public void setCoordinates(h hVar, ReadableArray readableArray) {
        Object[] objArr = {hVar, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "979a15349327a90b7eca1297df64dc55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "979a15349327a90b7eca1297df64dc55");
        } else {
            hVar.setCoordinates(readableArray);
        }
    }

    @ReactProp(name = "displayLevel")
    public void setDisplayLevel(h hVar, int i) {
        Object[] objArr = {hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfa9a1e88c0ab158e32224fe18d5b0a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfa9a1e88c0ab158e32224fe18d5b0a1");
        } else {
            hVar.setDisplayLevel(i);
        }
    }

    @ReactProp(name = "mergedPatCoord")
    public void setMergedPatCoord(h hVar, ReadableMap readableMap) {
        Object[] objArr = {hVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2eea565acfc544a40d4e849fdbee105", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2eea565acfc544a40d4e849fdbee105");
        } else {
            hVar.setMergedPatCoord(readableMap);
        }
    }

    @ReactProp(name = "pattern")
    public void setPattern(h hVar, ReadableMap readableMap) {
        Object[] objArr = {hVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7665caf1db70f2aedb860539e8f6d1f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7665caf1db70f2aedb860539e8f6d1f9");
        } else {
            hVar.setPattern(readableMap);
        }
    }

    @ReactProp(defaultBoolean = true, name = "visible")
    public void setVisible(h hVar, boolean z) {
        Object[] objArr = {hVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d9f74d88fb2f9674a5a2c78a5bb2bb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d9f74d88fb2f9674a5a2c78a5bb2bb7");
        } else {
            hVar.setVisible(z);
        }
    }

    @ReactProp(name = "width")
    public void setWidth(h hVar, float f) {
        Object[] objArr = {hVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4780f03f5ce43b28c10fb5c8510029fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4780f03f5ce43b28c10fb5c8510029fb");
        } else {
            hVar.setWidth(f);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @ReactProp(name = "zIndex")
    public void setZIndex(h hVar, float f) {
        Object[] objArr = {hVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72a9bc5c03aa88f5640be875300e3e47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72a9bc5c03aa88f5640be875300e3e47");
        } else {
            hVar.setZIndex(f);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@Nonnull h hVar, int i, ReadableArray readableArray) {
        Object[] objArr = {hVar, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfb0720ea385200df5449657eac8297d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfb0720ea385200df5449657eac8297d");
        } else if (i != 1) {
        } else {
            if (readableArray == null || readableArray.size() <= 0) {
                e.a(new IllegalArgumentException("eraseTo must has index"), "param");
                return;
            }
            ReadableMap map = readableArray.size() > 1 ? readableArray.getMap(1) : null;
            int i2 = readableArray.getInt(0);
            Object[] objArr2 = {Integer.valueOf(i2), map};
            ChangeQuickRedirect changeQuickRedirect3 = h.a;
            if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect3, false, "a55b39f4e7d9ab8f5ea54adca33765b8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect3, false, "a55b39f4e7d9ab8f5ea54adca33765b8");
            } else if (hVar.c != null) {
                hVar.c.eraseTo(i2, a.b(map));
            }
        }
    }
}
