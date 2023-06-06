package com.meituan.android.legwork.mrn.view;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.util.DisplayMetrics;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.w;
import com.facebook.react.views.scroll.f;
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
import com.meituan.android.recce.props.gens.OverScrollMode;
import com.meituan.android.recce.props.gens.PagingEnabled;
import com.meituan.android.recce.props.gens.PersistentScrollbar;
import com.meituan.android.recce.props.gens.ShowsVerticalScrollIndicator;
import com.meituan.android.recce.props.gens.SnapToEnd;
import com.meituan.android.recce.props.gens.SnapToInterval;
import com.meituan.android.recce.props.gens.SnapToStart;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = ReactNestedScrollViewManager.REACT_CLASS)
/* loaded from: classes2.dex */
public class ReactNestedScrollViewManager extends ViewGroupManager<ReactNestedScrollView> implements f.a<ReactNestedScrollView> {
    protected static final String REACT_CLASS = "BMLWNestedScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private com.facebook.react.views.scroll.a mFpsListener;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public ReactNestedScrollViewManager() {
        this(null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ba3039e47c59d5cc5adcca1c1c9c47d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ba3039e47c59d5cc5adcca1c1c9c47d");
        }
    }

    public ReactNestedScrollViewManager(@Nullable com.facebook.react.views.scroll.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdcd6eb255f33b9f959159ee16148ff5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdcd6eb255f33b9f959159ee16148ff5");
            return;
        }
        this.mFpsListener = null;
        this.mFpsListener = aVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactNestedScrollView createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1d9bf41a29c2322c912bab87c6b1c86", RobustBitConfig.DEFAULT_VALUE) ? (ReactNestedScrollView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1d9bf41a29c2322c912bab87c6b1c86") : new ReactNestedScrollView(aoVar, this.mFpsListener);
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(ReactNestedScrollView reactNestedScrollView, boolean z) {
        Object[] objArr = {reactNestedScrollView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e850aac6369d3f36ff44696cfa13460", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e850aac6369d3f36ff44696cfa13460");
        } else {
            reactNestedScrollView.setScrollEnabled(z);
        }
    }

    @ReactProp(name = ShowsVerticalScrollIndicator.LOWER_CASE_NAME)
    public void setShowsVerticalScrollIndicator(ReactNestedScrollView reactNestedScrollView, boolean z) {
        Object[] objArr = {reactNestedScrollView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d859b298575dfb0b594b4128b20993cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d859b298575dfb0b594b4128b20993cf");
        } else {
            reactNestedScrollView.setVerticalScrollBarEnabled(z);
        }
    }

    @ReactProp(name = DecelerationRate.LOWER_CASE_NAME)
    public void setDecelerationRate(ReactNestedScrollView reactNestedScrollView, float f) {
        Object[] objArr = {reactNestedScrollView, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "579e6feda15e0627ef1cf53bab89e158", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "579e6feda15e0627ef1cf53bab89e158");
        } else {
            reactNestedScrollView.setDecelerationRate(f);
        }
    }

    @ReactProp(name = SnapToInterval.LOWER_CASE_NAME)
    public void setSnapToInterval(ReactNestedScrollView reactNestedScrollView, float f) {
        Object[] objArr = {reactNestedScrollView, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1806ad2e6c73bdf2e88f5dcf1733f585", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1806ad2e6c73bdf2e88f5dcf1733f585");
        } else {
            reactNestedScrollView.setSnapInterval((int) (f * com.facebook.react.uimanager.d.b().density));
        }
    }

    @ReactProp(name = "snapToOffsets")
    public void setSnapToOffsets(ReactNestedScrollView reactNestedScrollView, @Nullable ReadableArray readableArray) {
        Object[] objArr = {reactNestedScrollView, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "767e320a4e5303d1c32d19c3b52c6de8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "767e320a4e5303d1c32d19c3b52c6de8");
            return;
        }
        DisplayMetrics b = com.facebook.react.uimanager.d.b();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i) * b.density)));
        }
        reactNestedScrollView.setSnapOffsets(arrayList);
    }

    @ReactProp(name = SnapToStart.LOWER_CASE_NAME)
    public void setSnapToStart(ReactNestedScrollView reactNestedScrollView, boolean z) {
        Object[] objArr = {reactNestedScrollView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45b53472e8b9d541b51e1957c6ea2772", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45b53472e8b9d541b51e1957c6ea2772");
        } else {
            reactNestedScrollView.setSnapToStart(z);
        }
    }

    @ReactProp(name = SnapToEnd.LOWER_CASE_NAME)
    public void setSnapToEnd(ReactNestedScrollView reactNestedScrollView, boolean z) {
        Object[] objArr = {reactNestedScrollView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2509f70adbce2e8d34888b229a1faea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2509f70adbce2e8d34888b229a1faea");
        } else {
            reactNestedScrollView.setSnapToEnd(z);
        }
    }

    @ReactProp(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(ReactNestedScrollView reactNestedScrollView, boolean z) {
        Object[] objArr = {reactNestedScrollView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49f1570dc39139f569a21f839ce541c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49f1570dc39139f569a21f839ce541c1");
        } else {
            reactNestedScrollView.setRemoveClippedSubviews(z);
        }
    }

    @ReactProp(name = "sendMomentumEvents")
    public void setSendMomentumEvents(ReactNestedScrollView reactNestedScrollView, boolean z) {
        Object[] objArr = {reactNestedScrollView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f892e2605993379ec87c863e5f0af76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f892e2605993379ec87c863e5f0af76");
        } else {
            reactNestedScrollView.setSendMomentumEvents(z);
        }
    }

    @ReactProp(name = "scrollPerfTag")
    public void setScrollPerfTag(ReactNestedScrollView reactNestedScrollView, @Nullable String str) {
        Object[] objArr = {reactNestedScrollView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cfd91b201a7cbe00da6f598075dcd9ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cfd91b201a7cbe00da6f598075dcd9ac");
        } else {
            reactNestedScrollView.setScrollPerfTag(str);
        }
    }

    @ReactProp(name = PagingEnabled.LOWER_CASE_NAME)
    public void setPagingEnabled(ReactNestedScrollView reactNestedScrollView, boolean z) {
        Object[] objArr = {reactNestedScrollView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8b8868f4427bfdb02d5f561891bd635", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8b8868f4427bfdb02d5f561891bd635");
        } else {
            reactNestedScrollView.setPagingEnabled(z);
        }
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(ReactNestedScrollView reactNestedScrollView, int i) {
        Object[] objArr = {reactNestedScrollView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c5f8f5a0e172b8b1576827a97d03463", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c5f8f5a0e172b8b1576827a97d03463");
        } else {
            reactNestedScrollView.setEndFillColor(i);
        }
    }

    @ReactProp(name = OverScrollMode.LOWER_CASE_NAME)
    public void setOverScrollMode(ReactNestedScrollView reactNestedScrollView, String str) {
        Object[] objArr = {reactNestedScrollView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8cc4a2046eb578a61eab2c0c3d1730a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8cc4a2046eb578a61eab2c0c3d1730a1");
        } else {
            reactNestedScrollView.setOverScrollMode(com.facebook.react.views.scroll.g.a(str));
        }
    }

    @ReactProp(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(ReactNestedScrollView reactNestedScrollView, boolean z) {
        Object[] objArr = {reactNestedScrollView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5d06326589802e86f493100d4563c48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5d06326589802e86f493100d4563c48");
        } else {
            ViewCompat.setNestedScrollingEnabled(reactNestedScrollView, z);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6dd767213bfdbf30843aa720557d749b", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6dd767213bfdbf30843aa720557d749b") : com.facebook.react.views.scroll.f.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NonNull ReactNestedScrollView reactNestedScrollView, int i, @Nullable ReadableArray readableArray) {
        Object[] objArr = {reactNestedScrollView, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86d4ca567894c4dff04c257bb05f9738", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86d4ca567894c4dff04c257bb05f9738");
        } else {
            com.facebook.react.views.scroll.f.a(this, reactNestedScrollView, i, readableArray);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NonNull ReactNestedScrollView reactNestedScrollView, String str, @android.support.annotation.Nullable ReadableArray readableArray) {
        Object[] objArr = {reactNestedScrollView, str, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38e21fb904dd09c05801dc6f76b61dd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38e21fb904dd09c05801dc6f76b61dd3");
        } else {
            j.a(reactNestedScrollView, str, readableArray);
        }
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void flashScrollIndicators(ReactNestedScrollView reactNestedScrollView) {
        Object[] objArr = {reactNestedScrollView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ddf9127edcbcfd2a7dc1cc5a9b568e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ddf9127edcbcfd2a7dc1cc5a9b568e9");
        } else {
            reactNestedScrollView.a();
        }
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void scrollTo(ReactNestedScrollView reactNestedScrollView, f.b bVar) {
        Object[] objArr = {reactNestedScrollView, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbcf594dff7a29fc26b4a60ae4903a87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbcf594dff7a29fc26b4a60ae4903a87");
            return;
        }
        reactNestedScrollView.b();
        if (bVar.c) {
            reactNestedScrollView.a(bVar.a, bVar.b);
        } else {
            reactNestedScrollView.scrollTo(bVar.a, bVar.b);
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {BorderRadius.LOWER_CASE_NAME, BorderTopLeftRadius.LOWER_CASE_NAME, BorderTopRightRadius.LOWER_CASE_NAME, BorderBottomRightRadius.LOWER_CASE_NAME, BorderBottomLeftRadius.LOWER_CASE_NAME})
    public void setBorderRadius(ReactNestedScrollView reactNestedScrollView, int i, float f) {
        Object[] objArr = {reactNestedScrollView, Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0515e4d9b6538b117077434592d65e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0515e4d9b6538b117077434592d65e5");
            return;
        }
        float a = !com.facebook.yoga.b.a(f) ? w.a(f) : f;
        if (i == 0) {
            reactNestedScrollView.setBorderRadius(a);
            return;
        }
        int i2 = i - 1;
        Object[] objArr2 = {Float.valueOf(a), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect3 = ReactNestedScrollView.a;
        if (PatchProxy.isSupport(objArr2, reactNestedScrollView, changeQuickRedirect3, false, "0ff42c05c8cb9fbab5c92a8d8fec3d0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, reactNestedScrollView, changeQuickRedirect3, false, "0ff42c05c8cb9fbab5c92a8d8fec3d0e");
        } else {
            reactNestedScrollView.b.a(a, i2);
        }
    }

    @ReactProp(name = BorderStyle.LOWER_CASE_NAME)
    public void setBorderStyle(ReactNestedScrollView reactNestedScrollView, @Nullable String str) {
        Object[] objArr = {reactNestedScrollView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fdb905152df1bde2db9dfd7f57a421c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fdb905152df1bde2db9dfd7f57a421c");
        } else {
            reactNestedScrollView.setBorderStyle(str);
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", BorderLeftWidth.LOWER_CASE_NAME, BorderRightWidth.LOWER_CASE_NAME, "borderTopWidth", BorderBottomWidth.LOWER_CASE_NAME})
    public void setBorderWidth(ReactNestedScrollView reactNestedScrollView, int i, float f) {
        Object[] objArr = {reactNestedScrollView, Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a628a63206a9f3d4461e3fbe7c2dedb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a628a63206a9f3d4461e3fbe7c2dedb4");
            return;
        }
        float a = !com.facebook.yoga.b.a(f) ? w.a(f) : f;
        int i2 = SPACING_TYPES[i];
        Object[] objArr2 = {Integer.valueOf(i2), Float.valueOf(a)};
        ChangeQuickRedirect changeQuickRedirect3 = ReactNestedScrollView.a;
        if (PatchProxy.isSupport(objArr2, reactNestedScrollView, changeQuickRedirect3, false, "277290eb6fe02316e2dfc3f28263a3c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, reactNestedScrollView, changeQuickRedirect3, false, "277290eb6fe02316e2dfc3f28263a3c5");
        } else {
            reactNestedScrollView.b.a(i2, a);
        }
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", BorderLeftColor.LOWER_CASE_NAME, BorderRightColor.LOWER_CASE_NAME, BorderTopColor.LOWER_CASE_NAME, BorderBottomColor.LOWER_CASE_NAME})
    public void setBorderColor(ReactNestedScrollView reactNestedScrollView, int i, Integer num) {
        Object[] objArr = {reactNestedScrollView, Integer.valueOf(i), num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "874be95f1d5b509a5dca8a17f0257172", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "874be95f1d5b509a5dca8a17f0257172");
            return;
        }
        float intValue = num == null ? Float.NaN : num.intValue() & ViewCompat.MEASURED_SIZE_MASK;
        float intValue2 = num == null ? Float.NaN : num.intValue() >>> 24;
        int i2 = SPACING_TYPES[i];
        Object[] objArr2 = {Integer.valueOf(i2), Float.valueOf(intValue), Float.valueOf(intValue2)};
        ChangeQuickRedirect changeQuickRedirect3 = ReactNestedScrollView.a;
        if (PatchProxy.isSupport(objArr2, reactNestedScrollView, changeQuickRedirect3, false, "2f5483f50fc0141fff4a5618bf37f56d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, reactNestedScrollView, changeQuickRedirect3, false, "2f5483f50fc0141fff4a5618bf37f56d");
        } else {
            reactNestedScrollView.b.a(i2, intValue, intValue2);
        }
    }

    @ReactProp(name = "overflow")
    public void setOverflow(ReactNestedScrollView reactNestedScrollView, @Nullable String str) {
        Object[] objArr = {reactNestedScrollView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be28f2458a6b807fa5c38f71f720090a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be28f2458a6b807fa5c38f71f720090a");
        } else {
            reactNestedScrollView.setOverflow(str);
        }
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void scrollToEnd(ReactNestedScrollView reactNestedScrollView, f.c cVar) {
        Object[] objArr = {reactNestedScrollView, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27ca35d118d9eb16ac9bdb27f2f7c3e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27ca35d118d9eb16ac9bdb27f2f7c3e5");
            return;
        }
        reactNestedScrollView.b();
        int height = reactNestedScrollView.getChildAt(0).getHeight() + reactNestedScrollView.getPaddingBottom();
        if (cVar.a) {
            reactNestedScrollView.smoothScrollTo(reactNestedScrollView.getScrollX(), height);
        } else {
            reactNestedScrollView.scrollTo(reactNestedScrollView.getScrollX(), height);
        }
    }

    @ReactProp(name = PersistentScrollbar.LOWER_CASE_NAME)
    public void setPersistentScrollbar(ReactNestedScrollView reactNestedScrollView, boolean z) {
        Object[] objArr = {reactNestedScrollView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b9533f59cd9a6c82ff57cc4835603ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b9533f59cd9a6c82ff57cc4835603ea");
        } else {
            reactNestedScrollView.setScrollbarFadingEnabled(!z ? 1 : 0);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12c70bc3b6548c845c86231a8585a3e0", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12c70bc3b6548c845c86231a8585a3e0") : createExportedCustomDirectEventTypeConstants();
    }

    public static Map<String, Object> createExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "465e38c38fe05e602915fdd6457736b2", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "465e38c38fe05e602915fdd6457736b2") : com.facebook.react.common.c.b().a(com.facebook.react.views.scroll.i.a(com.facebook.react.views.scroll.i.SCROLL), com.facebook.react.common.c.a("registrationName", "onScroll")).a(com.facebook.react.views.scroll.i.a(com.facebook.react.views.scroll.i.BEGIN_DRAG), com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)).a(com.facebook.react.views.scroll.i.a(com.facebook.react.views.scroll.i.END_DRAG), com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_SCROLL_END_DRAG)).a(com.facebook.react.views.scroll.i.a(com.facebook.react.views.scroll.i.MOMENTUM_BEGIN), com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN)).a(com.facebook.react.views.scroll.i.a(com.facebook.react.views.scroll.i.MOMENTUM_END), com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_END)).a();
    }
}
