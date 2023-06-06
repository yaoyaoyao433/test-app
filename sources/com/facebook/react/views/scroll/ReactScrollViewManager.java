package com.facebook.react.views.scroll;

import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.util.DisplayMetrics;
import android.view.View;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ag;
import com.facebook.react.uimanager.an;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.w;
import com.facebook.react.views.scroll.f;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.recce.props.gens.BorderBottomColor;
import com.meituan.android.recce.props.gens.BorderBottomLeftRadius;
import com.meituan.android.recce.props.gens.BorderBottomRightRadius;
import com.meituan.android.recce.props.gens.BorderBottomWidth;
import com.meituan.android.recce.props.gens.BorderLeftColor;
import com.meituan.android.recce.props.gens.BorderLeftWidth;
import com.meituan.android.recce.props.gens.BorderRadius;
import com.meituan.android.recce.props.gens.BorderRightColor;
import com.meituan.android.recce.props.gens.BorderRightWidth;
import com.meituan.android.recce.props.gens.BorderStyle;
import com.meituan.android.recce.props.gens.BorderTopColor;
import com.meituan.android.recce.props.gens.BorderTopLeftRadius;
import com.meituan.android.recce.props.gens.BorderTopRightRadius;
import com.meituan.android.recce.props.gens.DecelerationRate;
import com.meituan.android.recce.props.gens.DisableIntervalMomentum;
import com.meituan.android.recce.props.gens.FadingEdgeLength;
import com.meituan.android.recce.props.gens.OverScrollMode;
import com.meituan.android.recce.props.gens.PagingEnabled;
import com.meituan.android.recce.props.gens.PersistentScrollbar;
import com.meituan.android.recce.props.gens.ShowsVerticalScrollIndicator;
import com.meituan.android.recce.props.gens.SnapToEnd;
import com.meituan.android.recce.props.gens.SnapToInterval;
import com.meituan.android.recce.props.gens.SnapToStart;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = ReactScrollViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactScrollViewManager extends ViewGroupManager<e> implements f.a<e> {
    public static final String REACT_CLASS = "RCTScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    @Nullable
    private a mFpsListener;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public ReactScrollViewManager() {
        this(null);
    }

    public ReactScrollViewManager(@Nullable a aVar) {
        this.mFpsListener = null;
        this.mFpsListener = aVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public e createViewInstance(ao aoVar) {
        return new e(aoVar, this.mFpsListener);
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(e eVar, boolean z) {
        eVar.setScrollEnabled(z);
        eVar.setFocusable(z);
    }

    @ReactProp(name = ShowsVerticalScrollIndicator.LOWER_CASE_NAME)
    public void setShowsVerticalScrollIndicator(e eVar, boolean z) {
        eVar.setVerticalScrollBarEnabled(z);
    }

    @ReactProp(name = DecelerationRate.LOWER_CASE_NAME)
    public void setDecelerationRate(e eVar, float f) {
        eVar.setDecelerationRate(f);
    }

    @ReactProp(name = DisableIntervalMomentum.LOWER_CASE_NAME)
    public void setDisableIntervalMomentum(e eVar, boolean z) {
        eVar.setDisableIntervalMomentum(z);
    }

    @ReactProp(name = SnapToStart.LOWER_CASE_NAME)
    public void setSnapToStart(e eVar, boolean z) {
        eVar.setSnapToStart(z);
    }

    @ReactProp(name = SnapToEnd.LOWER_CASE_NAME)
    public void setSnapToEnd(e eVar, boolean z) {
        eVar.setSnapToEnd(z);
    }

    @ReactProp(name = "contentOffset")
    public void setContentOffset(e eVar, ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        double d = readableMap.hasKey(Constants.GestureMoveEvent.KEY_X) ? readableMap.getDouble(Constants.GestureMoveEvent.KEY_X) : 0.0d;
        double d2 = readableMap.hasKey(Constants.GestureMoveEvent.KEY_Y) ? readableMap.getDouble(Constants.GestureMoveEvent.KEY_Y) : 0.0d;
        DisplayMetrics displayMetrics = com.facebook.react.uimanager.d.b;
        if (displayMetrics != null) {
            eVar.a((int) Math.round(d * displayMetrics.density), (int) Math.round(d2 * displayMetrics.density));
        }
    }

    @ReactProp(name = "enableExperimentalFeature")
    public void setEnableExperimentalFeature(e eVar, boolean z) {
        eVar.setEnableExperimentalFeature(z);
    }

    @ReactProp(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(e eVar, boolean z) {
        eVar.setRemoveClippedSubviews(z);
    }

    @ReactProp(name = "sendMomentumEvents")
    public void setSendMomentumEvents(e eVar, boolean z) {
        eVar.setSendMomentumEvents(z);
    }

    @ReactProp(name = "scrollPerfTag")
    public void setScrollPerfTag(e eVar, @Nullable String str) {
        eVar.setScrollPerfTag(str);
    }

    @ReactProp(name = PagingEnabled.LOWER_CASE_NAME)
    public void setPagingEnabled(e eVar, boolean z) {
        eVar.setPagingEnabled(z);
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(e eVar, int i) {
        eVar.setEndFillColor(i);
    }

    @ReactProp(name = OverScrollMode.LOWER_CASE_NAME)
    public void setOverScrollMode(e eVar, String str) {
        eVar.setOverScrollMode(g.a(str));
    }

    @ReactProp(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(e eVar, boolean z) {
        ViewCompat.setNestedScrollingEnabled(eVar, z);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        return f.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(e eVar, int i, @Nullable ReadableArray readableArray) {
        f.a(this, eVar, i, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(e eVar, String str, @Nullable ReadableArray readableArray) {
        f.a(this, eVar, str, readableArray);
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void flashScrollIndicators(e eVar) {
        eVar.a();
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void scrollTo(e eVar, f.b bVar) {
        if (bVar.c) {
            eVar.b(bVar.a, bVar.b);
        } else {
            eVar.c(bVar.a, bVar.b);
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {BorderRadius.LOWER_CASE_NAME, BorderTopLeftRadius.LOWER_CASE_NAME, BorderTopRightRadius.LOWER_CASE_NAME, BorderBottomRightRadius.LOWER_CASE_NAME, BorderBottomLeftRadius.LOWER_CASE_NAME})
    public void setBorderRadius(e eVar, int i, float f) {
        if (!com.facebook.yoga.b.a(f)) {
            f = w.a(f);
        }
        if (i == 0) {
            eVar.setBorderRadius(f);
            return;
        }
        eVar.a.a(f, i - 1);
    }

    @ReactProp(name = BorderStyle.LOWER_CASE_NAME)
    public void setBorderStyle(e eVar, @Nullable String str) {
        eVar.setBorderStyle(str);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", BorderLeftWidth.LOWER_CASE_NAME, BorderRightWidth.LOWER_CASE_NAME, "borderTopWidth", BorderBottomWidth.LOWER_CASE_NAME})
    public void setBorderWidth(e eVar, int i, float f) {
        if (!com.facebook.yoga.b.a(f)) {
            f = w.a(f);
        }
        eVar.a.a(SPACING_TYPES[i], f);
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", BorderLeftColor.LOWER_CASE_NAME, BorderRightColor.LOWER_CASE_NAME, BorderTopColor.LOWER_CASE_NAME, BorderBottomColor.LOWER_CASE_NAME})
    public void setBorderColor(e eVar, int i, Integer num) {
        eVar.a.a(SPACING_TYPES[i], num == null ? Float.NaN : num.intValue() & ViewCompat.MEASURED_SIZE_MASK, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @ReactProp(name = "overflow")
    public void setOverflow(e eVar, @Nullable String str) {
        eVar.setOverflow(str);
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void scrollToEnd(e eVar, f.c cVar) {
        View childAt = eVar.getChildAt(0);
        if (childAt == null) {
            throw new RetryableMountingLayerException("scrollToEnd called on ScrollView without child");
        }
        int height = childAt.getHeight() + eVar.getPaddingBottom();
        if (cVar.a) {
            eVar.b(eVar.getScrollX(), height);
        } else {
            eVar.c(eVar.getScrollX(), height);
        }
    }

    @ReactProp(name = PersistentScrollbar.LOWER_CASE_NAME)
    public void setPersistentScrollbar(e eVar, boolean z) {
        eVar.setScrollbarFadingEnabled(!z);
    }

    @ReactProp(name = FadingEdgeLength.LOWER_CASE_NAME)
    public void setFadingEdgeLength(e eVar, int i) {
        if (i > 0) {
            eVar.setVerticalFadingEdgeEnabled(true);
            eVar.setFadingEdgeLength(i);
            return;
        }
        eVar.setVerticalFadingEdgeEnabled(false);
        eVar.setFadingEdgeLength(0);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return createExportedCustomDirectEventTypeConstants();
    }

    public static Map<String, Object> createExportedCustomDirectEventTypeConstants() {
        return com.facebook.react.common.c.b().a(i.a(i.SCROLL), com.facebook.react.common.c.a("registrationName", "onScroll")).a(i.a(i.BEGIN_DRAG), com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)).a(i.a(i.END_DRAG), com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_SCROLL_END_DRAG)).a(i.a(i.MOMENTUM_BEGIN), com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN)).a(i.a(i.MOMENTUM_END), com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_END)).a();
    }

    @ReactProp(name = "scrollHitSlop")
    public void setScrollHitSlop(e eVar, @Nullable ReadableMap readableMap) {
        if (readableMap == null) {
            eVar.setScrollHitSlopRect(null);
        } else {
            eVar.setScrollHitSlopRect(new Rect(readableMap.hasKey("left") ? (int) w.a((float) readableMap.getDouble("left")) : 0, readableMap.hasKey("top") ? (int) w.a((float) readableMap.getDouble("top")) : 0, readableMap.hasKey("right") ? (int) w.a((float) readableMap.getDouble("right")) : 0, readableMap.hasKey("bottom") ? (int) w.a((float) readableMap.getDouble("bottom")) : 0));
        }
    }

    @ReactProp(name = SnapToInterval.LOWER_CASE_NAME)
    public void setSnapToInterval(e eVar, float f) {
        eVar.setSnapInterval((int) (f * com.facebook.react.uimanager.d.b.density));
    }

    @ReactProp(name = "snapToOffsets")
    public void setSnapToOffsets(e eVar, @Nullable ReadableArray readableArray) {
        DisplayMetrics displayMetrics = com.facebook.react.uimanager.d.b;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i) * displayMetrics.density)));
        }
        eVar.setSnapOffsets(arrayList);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(e eVar, ag agVar, @Nullable an anVar) {
        eVar.b = anVar;
        return null;
    }
}
