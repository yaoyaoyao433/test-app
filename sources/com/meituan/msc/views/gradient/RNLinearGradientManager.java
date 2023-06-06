package com.meituan.msc.views.gradient;

import android.view.View;
import com.BV.LinearGradient.LinearGradientManager;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.uimanager.RNSimpleViewManager;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RNLinearGradientManager extends RNSimpleViewManager<RNLinearGradientView> {
    public static ChangeQuickRedirect c;

    @Override // com.meituan.msc.uimanager.as
    public final String a() {
        return LinearGradientManager.REACT_CLASS;
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ View a(ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62a0a613967ac97909d7b7d058267aaa", RobustBitConfig.DEFAULT_VALUE) ? (RNLinearGradientView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62a0a613967ac97909d7b7d058267aaa") : new RNLinearGradientView(themedReactContext);
    }

    @ReactProp(name = LinearGradientManager.PROP_COLORS)
    public void setColors(RNLinearGradientView rNLinearGradientView, ReadableArray readableArray) {
        Object[] objArr = {rNLinearGradientView, readableArray};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb9f3b9741d1acdfd64a5d151b7a54ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb9f3b9741d1acdfd64a5d151b7a54ce");
        } else {
            rNLinearGradientView.setColors(readableArray);
        }
    }

    @ReactProp(name = LinearGradientManager.PROP_LOCATIONS)
    public void setLocations(RNLinearGradientView rNLinearGradientView, ReadableArray readableArray) {
        Object[] objArr = {rNLinearGradientView, readableArray};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f13cc5fbe70e1aea936859a7e3f4bd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f13cc5fbe70e1aea936859a7e3f4bd7");
        } else if (readableArray != null) {
            rNLinearGradientView.setLocations(readableArray);
        }
    }

    @ReactProp(name = LinearGradientManager.PROP_START_POS)
    public void setStartPosition(RNLinearGradientView rNLinearGradientView, ReadableArray readableArray) {
        Object[] objArr = {rNLinearGradientView, readableArray};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaf718612d4385f63f072d07f4ecf2c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaf718612d4385f63f072d07f4ecf2c1");
        } else {
            rNLinearGradientView.setStartPosition(readableArray);
        }
    }

    @ReactProp(name = LinearGradientManager.PROP_END_POS)
    public void setEndPosition(RNLinearGradientView rNLinearGradientView, ReadableArray readableArray) {
        Object[] objArr = {rNLinearGradientView, readableArray};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb0632580c94e0bd81c5fc1e7b2ec3bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb0632580c94e0bd81c5fc1e7b2ec3bd");
        } else {
            rNLinearGradientView.setEndPosition(readableArray);
        }
    }

    @ReactProp(defaultBoolean = false, name = LinearGradientManager.PROP_USE_ANGLE)
    public void setUseAngle(RNLinearGradientView rNLinearGradientView, boolean z) {
        Object[] objArr = {rNLinearGradientView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55a9e12826186f8d0b1f382245963855", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55a9e12826186f8d0b1f382245963855");
        } else {
            rNLinearGradientView.setUseAngle(z);
        }
    }

    @ReactProp(name = LinearGradientManager.PROP_ANGLE_CENTER)
    public void setAngleCenter(RNLinearGradientView rNLinearGradientView, ReadableArray readableArray) {
        Object[] objArr = {rNLinearGradientView, readableArray};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c46688e717b23b1ec66731a88a2d41e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c46688e717b23b1ec66731a88a2d41e");
        } else {
            rNLinearGradientView.setAngleCenter(readableArray);
        }
    }

    @ReactProp(defaultFloat = 45.0f, name = LinearGradientManager.PROP_ANGLE)
    public void setAngle(RNLinearGradientView rNLinearGradientView, float f) {
        Object[] objArr = {rNLinearGradientView, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10caad6beaa1bf9ba8cda7b621575331", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10caad6beaa1bf9ba8cda7b621575331");
        } else {
            rNLinearGradientView.setAngle(f);
        }
    }

    @ReactProp(name = LinearGradientManager.PROP_BORDER_RADII)
    public void setBorderRadii(RNLinearGradientView rNLinearGradientView, ReadableArray readableArray) {
        Object[] objArr = {rNLinearGradientView, readableArray};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94172f3662163f569621c4a080ab8b26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94172f3662163f569621c4a080ab8b26");
        } else {
            rNLinearGradientView.setBorderRadii(readableArray);
        }
    }
}
