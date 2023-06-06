package com.facebook.react.views.scroll;

import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
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
import com.meituan.android.recce.props.gens.ShowsHorizontalScrollIndicator;
import com.meituan.android.recce.props.gens.SnapToEnd;
import com.meituan.android.recce.props.gens.SnapToInterval;
import com.meituan.android.recce.props.gens.SnapToStart;
import java.util.ArrayList;
/* compiled from: ProGuard */
@ReactModule(name = "AndroidHorizontalScrollView")
/* loaded from: classes.dex */
public class ReactHorizontalScrollViewManager extends ViewGroupManager<d> implements f.a<d> {
    public static final String REACT_CLASS = "AndroidHorizontalScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    @Nullable
    private a mFpsListener;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AndroidHorizontalScrollView";
    }

    public ReactHorizontalScrollViewManager() {
        this(null);
    }

    public ReactHorizontalScrollViewManager(@Nullable a aVar) {
        this.mFpsListener = null;
        this.mFpsListener = aVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public d createViewInstance(ao aoVar) {
        return new d(aoVar, this.mFpsListener);
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(d dVar, boolean z) {
        dVar.setScrollEnabled(z);
    }

    @ReactProp(name = ShowsHorizontalScrollIndicator.LOWER_CASE_NAME)
    public void setShowsHorizontalScrollIndicator(d dVar, boolean z) {
        dVar.setHorizontalScrollBarEnabled(z);
    }

    @ReactProp(name = DecelerationRate.LOWER_CASE_NAME)
    public void setDecelerationRate(d dVar, float f) {
        dVar.setDecelerationRate(f);
    }

    @ReactProp(name = DisableIntervalMomentum.LOWER_CASE_NAME)
    public void setDisableIntervalMomentum(d dVar, boolean z) {
        dVar.setDisableIntervalMomentum(z);
    }

    @ReactProp(name = SnapToStart.LOWER_CASE_NAME)
    public void setSnapToStart(d dVar, boolean z) {
        dVar.setSnapToStart(z);
    }

    @ReactProp(name = SnapToEnd.LOWER_CASE_NAME)
    public void setSnapToEnd(d dVar, boolean z) {
        dVar.setSnapToEnd(z);
    }

    @ReactProp(name = "contentOffset")
    public void setContentOffset(d dVar, ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        double d = readableMap.hasKey(Constants.GestureMoveEvent.KEY_X) ? readableMap.getDouble(Constants.GestureMoveEvent.KEY_X) : 0.0d;
        double d2 = readableMap.hasKey(Constants.GestureMoveEvent.KEY_Y) ? readableMap.getDouble(Constants.GestureMoveEvent.KEY_Y) : 0.0d;
        DisplayMetrics displayMetrics = com.facebook.react.uimanager.d.b;
        if (displayMetrics != null) {
            dVar.a((int) Math.round(d * displayMetrics.density), (int) Math.round(d2 * displayMetrics.density));
        }
    }

    @ReactProp(name = "enableExperimentalFeature")
    public void setEnableExperimentalFeature(d dVar, boolean z) {
        dVar.setEnableExperimentalFeature(z);
    }

    @ReactProp(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(d dVar, boolean z) {
        dVar.setRemoveClippedSubviews(z);
    }

    @ReactProp(name = "sendMomentumEvents")
    public void setSendMomentumEvents(d dVar, boolean z) {
        dVar.setSendMomentumEvents(z);
    }

    @ReactProp(name = "scrollPerfTag")
    public void setScrollPerfTag(d dVar, String str) {
        dVar.setScrollPerfTag(str);
    }

    @ReactProp(name = PagingEnabled.LOWER_CASE_NAME)
    public void setPagingEnabled(d dVar, boolean z) {
        dVar.setPagingEnabled(z);
    }

    @ReactProp(name = OverScrollMode.LOWER_CASE_NAME)
    public void setOverScrollMode(d dVar, String str) {
        dVar.setOverScrollMode(g.a(str));
    }

    @ReactProp(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(d dVar, boolean z) {
        ViewCompat.setNestedScrollingEnabled(dVar, z);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(d dVar, int i, @Nullable ReadableArray readableArray) {
        f.a(this, dVar, i, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(d dVar, String str, @Nullable ReadableArray readableArray) {
        f.a(this, dVar, str, readableArray);
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void flashScrollIndicators(d dVar) {
        dVar.a();
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void scrollTo(d dVar, f.b bVar) {
        if (bVar.c) {
            dVar.b(bVar.a, bVar.b);
        } else {
            dVar.c(bVar.a, bVar.b);
        }
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void scrollToEnd(d dVar, f.c cVar) {
        int width = dVar.getChildAt(0).getWidth() + dVar.getPaddingRight();
        if (cVar.a) {
            dVar.b(width, dVar.getScrollY());
        } else {
            dVar.c(width, dVar.getScrollY());
        }
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(d dVar, int i) {
        dVar.setEndFillColor(i);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {BorderRadius.LOWER_CASE_NAME, BorderTopLeftRadius.LOWER_CASE_NAME, BorderTopRightRadius.LOWER_CASE_NAME, BorderBottomRightRadius.LOWER_CASE_NAME, BorderBottomLeftRadius.LOWER_CASE_NAME})
    public void setBorderRadius(d dVar, int i, float f) {
        if (!com.facebook.yoga.b.a(f)) {
            f = w.a(f);
        }
        if (i == 0) {
            dVar.setBorderRadius(f);
            return;
        }
        dVar.a.a(f, i - 1);
    }

    @ReactProp(name = BorderStyle.LOWER_CASE_NAME)
    public void setBorderStyle(d dVar, @Nullable String str) {
        dVar.setBorderStyle(str);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", BorderLeftWidth.LOWER_CASE_NAME, BorderRightWidth.LOWER_CASE_NAME, "borderTopWidth", BorderBottomWidth.LOWER_CASE_NAME})
    public void setBorderWidth(d dVar, int i, float f) {
        if (!com.facebook.yoga.b.a(f)) {
            f = w.a(f);
        }
        int i2 = SPACING_TYPES[i];
        if (i2 == 0) {
            dVar.c = f;
        } else if (i2 == 2) {
            dVar.d = f;
        } else if (i2 == 8) {
            dVar.d = f;
            dVar.c = f;
        }
        dVar.a.a(i2, f);
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", BorderLeftColor.LOWER_CASE_NAME, BorderRightColor.LOWER_CASE_NAME, BorderTopColor.LOWER_CASE_NAME, BorderBottomColor.LOWER_CASE_NAME})
    public void setBorderColor(d dVar, int i, Integer num) {
        dVar.a.a(SPACING_TYPES[i], num == null ? Float.NaN : num.intValue() & ViewCompat.MEASURED_SIZE_MASK, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @ReactProp(name = "overflow")
    public void setOverflow(d dVar, @Nullable String str) {
        dVar.setOverflow(str);
    }

    @ReactProp(name = PersistentScrollbar.LOWER_CASE_NAME)
    public void setPersistentScrollbar(d dVar, boolean z) {
        dVar.setScrollbarFadingEnabled(!z);
    }

    @ReactProp(name = FadingEdgeLength.LOWER_CASE_NAME)
    public void setFadingEdgeLength(d dVar, int i) {
        if (i > 0) {
            dVar.setHorizontalFadingEdgeEnabled(true);
            dVar.setFadingEdgeLength(i);
            return;
        }
        dVar.setHorizontalFadingEdgeEnabled(false);
        dVar.setFadingEdgeLength(0);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(d dVar, ag agVar, @Nullable an anVar) {
        dVar.b = anVar;
        return null;
    }

    @ReactProp(name = SnapToInterval.LOWER_CASE_NAME)
    public void setSnapToInterval(d dVar, float f) {
        dVar.setSnapInterval((int) (f * com.facebook.react.uimanager.d.b.density));
    }

    @ReactProp(name = "snapToOffsets")
    public void setSnapToOffsets(d dVar, @Nullable ReadableArray readableArray) {
        DisplayMetrics displayMetrics = com.facebook.react.uimanager.d.b;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i) * displayMetrics.density)));
        }
        dVar.setSnapOffsets(arrayList);
    }
}
