package com.meituan.android.legwork.mrn.view;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PtNestedScrollContainerViewManager extends ViewGroupManager<PtNestedScrollContainer> {
    private static final int COMMAND_COLLAPSE_HEADER = 2;
    private static final int COMMAND_EXPAND_HEADER = 1;
    private static final int COMMAND_HIDE_SCROLL_HEADER = 3;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "PtNestedScrollContainer";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nonnull
    public PtNestedScrollContainer createViewInstance(@Nonnull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1d16cd6102a24add1753af0a6da15e0", RobustBitConfig.DEFAULT_VALUE) ? (PtNestedScrollContainer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1d16cd6102a24add1753af0a6da15e0") : new PtNestedScrollContainer(aoVar);
    }

    @ReactProp(name = "scrollHeaderHeight")
    public void setScrollHeaderHeight(@Nonnull PtNestedScrollContainer ptNestedScrollContainer, float f) {
        Object[] objArr = {ptNestedScrollContainer, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59ad025f95afb737b26e9010d0e09344", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59ad025f95afb737b26e9010d0e09344");
        } else {
            ptNestedScrollContainer.setScrollHeaderHeight(f);
        }
    }

    @ReactProp(name = "pinHeaderHeight")
    public void setPinHeaderHeight(@Nonnull PtNestedScrollContainer ptNestedScrollContainer, float f) {
        Object[] objArr = {ptNestedScrollContainer, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "973f415c57e438ebeab2651883c2e749", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "973f415c57e438ebeab2651883c2e749");
        } else {
            ptNestedScrollContainer.setPinHeaderHeight(f);
        }
    }

    @ReactProp(name = "pinHeaderShowAlpha")
    public void setPinHeaderShowAlpha(@Nonnull PtNestedScrollContainer ptNestedScrollContainer, float f) {
        Object[] objArr = {ptNestedScrollContainer, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8572aa4ea0dbc3b71f69d584fad2255a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8572aa4ea0dbc3b71f69d584fad2255a");
        } else {
            ptNestedScrollContainer.setPinHeaderShowAlpha(f);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@Nonnull PtNestedScrollContainer ptNestedScrollContainer, int i, @Nullable ReadableArray readableArray) {
        int top;
        int i2;
        Object[] objArr = {ptNestedScrollContainer, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "712c702a580235c16d4df2e67f1f71f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "712c702a580235c16d4df2e67f1f71f6");
        } else if (readableArray == null) {
        } else {
            switch (i) {
                case 1:
                    int i3 = readableArray.getInt(0);
                    Object[] objArr2 = {Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect3 = PtNestedScrollContainer.i;
                    if (PatchProxy.isSupport(objArr2, ptNestedScrollContainer, changeQuickRedirect3, false, "e69f4d4dd2291fbc254b3ab8e6e879de", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, ptNestedScrollContainer, changeQuickRedirect3, false, "e69f4d4dd2291fbc254b3ab8e6e879de");
                        return;
                    } else if (ptNestedScrollContainer.l == null || ptNestedScrollContainer.j == null) {
                        return;
                    } else {
                        ptNestedScrollContainer.setScrollHeaderTop(0);
                        ValueAnimator ofInt = ValueAnimator.ofInt(ptNestedScrollContainer.l.getTop(), ptNestedScrollContainer.getBottom());
                        ofInt.setDuration(i3);
                        ofInt.setInterpolator(new AccelerateInterpolator());
                        ofInt.addUpdateListener(e.a(ptNestedScrollContainer));
                        ofInt.start();
                        return;
                    }
                case 2:
                    int i4 = readableArray.getInt(0);
                    Object[] objArr3 = {Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect4 = PtNestedScrollContainer.i;
                    if (PatchProxy.isSupport(objArr3, ptNestedScrollContainer, changeQuickRedirect4, false, "201bce89c62d743313112a32f58e0152", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, ptNestedScrollContainer, changeQuickRedirect4, false, "201bce89c62d743313112a32f58e0152");
                        return;
                    } else if (ptNestedScrollContainer.l == null || ptNestedScrollContainer.j == null) {
                        return;
                    } else {
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(ptNestedScrollContainer.l.getTop(), ptNestedScrollContainer.m);
                        ofInt2.setDuration(i4);
                        ofInt2.setInterpolator(new AccelerateInterpolator());
                        ofInt2.addUpdateListener(f.a(ptNestedScrollContainer));
                        ofInt2.start();
                        return;
                    }
                case 3:
                    int i5 = readableArray.getInt(0);
                    Object[] objArr4 = {Integer.valueOf(i5)};
                    ChangeQuickRedirect changeQuickRedirect5 = PtNestedScrollContainer.i;
                    if (PatchProxy.isSupport(objArr4, ptNestedScrollContainer, changeQuickRedirect5, false, "8dd5ed42a732834f8470f462a684cefc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, ptNestedScrollContainer, changeQuickRedirect5, false, "8dd5ed42a732834f8470f462a684cefc");
                        return;
                    } else if (ptNestedScrollContainer.l == null || ptNestedScrollContainer.j == null || (top = ptNestedScrollContainer.j.getTop()) == (i2 = (-ptNestedScrollContainer.m) + ptNestedScrollContainer.o)) {
                        return;
                    } else {
                        ValueAnimator ofInt3 = ValueAnimator.ofInt(top, i2);
                        ofInt3.setDuration(i5);
                        ofInt3.setInterpolator(new AccelerateInterpolator());
                        ofInt3.addUpdateListener(g.a(ptNestedScrollContainer));
                        ofInt3.start();
                        return;
                    }
                default:
                    return;
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81a91be74b383cfb7459478bb7fb076d", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81a91be74b383cfb7459478bb7fb076d") : com.facebook.react.common.c.a("expandHeader", 1, "collapseHeader", 2, "hideScrollHeader", 3);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map getExportedCustomBubblingEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5c31b81095c1e653b3dc3d5794f608a", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5c31b81095c1e653b3dc3d5794f608a") : com.facebook.react.common.c.b().a("suckTopChange", com.facebook.react.common.c.a("phasedRegistrationNames", com.facebook.react.common.c.a("bubbled", "onSuckTopChange"))).a("pinHeaderShowChange", com.facebook.react.common.c.a("phasedRegistrationNames", com.facebook.react.common.c.a("bubbled", "onPinHeaderShowChange"))).a();
    }
}
