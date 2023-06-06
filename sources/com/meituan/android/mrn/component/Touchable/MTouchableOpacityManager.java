package com.meituan.android.mrn.component.Touchable;

import android.graphics.Rect;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.common.c;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.w;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.view.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = MTouchableOpacityManager.REACT_CLASS)
/* loaded from: classes2.dex */
public class MTouchableOpacityManager extends ReactViewManager {
    @VisibleForTesting
    public static final String REACT_CLASS = "MRNTouchableOpacity";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public f createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68a2f55535cf98e53e681013f9c36f5c", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68a2f55535cf98e53e681013f9c36f5c") : new b(aoVar);
    }

    @ReactProp(name = "activeOpacity")
    public void setOpacity(b bVar, Dynamic dynamic) {
        Object[] objArr = {bVar, dynamic};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c639a42b19ba0980bb761c8a47b2185", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c639a42b19ba0980bb761c8a47b2185");
        } else if (dynamic.getType() == ReadableType.Number) {
            bVar.setTouchableOpacity((float) dynamic.asDouble());
        }
    }

    @ReactProp(name = "hitSlop")
    public void setHitSlop(b bVar, Dynamic dynamic) {
        int i;
        int i2;
        int i3;
        Object[] objArr = {bVar, dynamic};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c58b613a58d02412c4b9aa66ad05fe71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c58b613a58d02412c4b9aa66ad05fe71");
            return;
        }
        if (dynamic.getType() == ReadableType.Map) {
            ReadableMap asMap = dynamic.asMap();
            int i4 = asMap.hasKey("left") ? asMap.getInt("left") : 0;
            i2 = asMap.hasKey("top") ? asMap.getInt("top") : 0;
            i3 = asMap.hasKey("right") ? asMap.getInt("right") : 0;
            i = asMap.hasKey("bottom") ? asMap.getInt("bottom") : 0;
            r8 = i4;
        } else if (dynamic.getType() == ReadableType.Number) {
            r8 = dynamic.asInt();
            i = r8;
            i2 = i;
            i3 = i2;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        bVar.setHitSlopRect(new Rect((int) w.a(r8), (int) w.a(i2), (int) w.a(i3), (int) w.a(i)));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab6ea07a752c35ded4cbcb04f2ff82e7", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab6ea07a752c35ded4cbcb04f2ff82e7") : c.b().a("onPress", c.a("registrationName", "onPress")).a();
    }
}
