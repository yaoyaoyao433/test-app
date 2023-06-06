package com.meituan.msc.views.scroll;

import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.util.DisplayMetrics;
import android.view.View;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.views.scroll.ReactScrollViewManager;
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
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.RetryableMountingLayerException;
import com.meituan.msc.jse.module.annotations.ReactModule;
import com.meituan.msc.uimanager.RNViewGroupManager;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.ab;
import com.meituan.msc.uimanager.ai;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.msc.uimanager.annotations.ReactPropGroup;
import com.meituan.msc.uimanager.s;
import com.meituan.msc.views.scroll.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = ReactScrollViewManager.REACT_CLASS)
/* loaded from: classes3.dex */
public class RNScrollViewManager extends RNViewGroupManager<e> implements f.a<e> {
    public static ChangeQuickRedirect b;
    private static final int[] d = {8, 0, 2, 1, 3};
    @Nullable
    private a e;

    @Override // com.meituan.msc.uimanager.as
    public final String a() {
        return ReactScrollViewManager.REACT_CLASS;
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ View a(ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50418f9598920d2e23ce5259fe157486", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50418f9598920d2e23ce5259fe157486") : new e(themedReactContext, this.e);
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ Object a(View view, ab abVar, @Nullable ai aiVar) {
        e eVar = (e) view;
        Object[] objArr = {eVar, abVar, aiVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e54968860478d52fdcc809573740c6f7", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e54968860478d52fdcc809573740c6f7");
        }
        eVar.c = aiVar;
        return null;
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ void a(View view, int i, @Nullable ReadableArray readableArray) {
        e eVar = (e) view;
        Object[] objArr = {eVar, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3557f6680af4d992be3fed218baf9fb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3557f6680af4d992be3fed218baf9fb8");
        } else {
            f.a(this, eVar, i, readableArray);
        }
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ void a(View view, String str, @Nullable ReadableArray readableArray) {
        e eVar = (e) view;
        Object[] objArr = {eVar, str, readableArray};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6355181b6bfda8b9bce822761989e2d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6355181b6bfda8b9bce822761989e2d0");
        } else {
            f.a(this, eVar, str, readableArray);
        }
    }

    @Override // com.meituan.msc.views.scroll.f.a
    public final /* synthetic */ void a(e eVar) {
        e eVar2 = eVar;
        Object[] objArr = {eVar2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1301b79449a61ea1f25e0380fee2eba0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1301b79449a61ea1f25e0380fee2eba0");
        } else {
            eVar2.b();
        }
    }

    @Override // com.meituan.msc.views.scroll.f.a
    public final /* synthetic */ void a(e eVar, f.b bVar) {
        e eVar2 = eVar;
        Object[] objArr = {eVar2, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "541367a3202a2d371a6fd16459a46b24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "541367a3202a2d371a6fd16459a46b24");
        } else if (bVar.c) {
            eVar2.b(bVar.a, bVar.b);
        } else {
            eVar2.c(bVar.a, bVar.b);
        }
    }

    @Override // com.meituan.msc.views.scroll.f.a
    public final /* synthetic */ void a(e eVar, f.c cVar) {
        e eVar2 = eVar;
        Object[] objArr = {eVar2, cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46102107fac083cb3196b7f90176d8b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46102107fac083cb3196b7f90176d8b6");
            return;
        }
        View childAt = eVar2.getChildAt(0);
        if (childAt == null) {
            throw new RetryableMountingLayerException("scrollToEnd called on ScrollView without child");
        }
        int height = childAt.getHeight() + eVar2.getPaddingBottom();
        if (cVar.a) {
            eVar2.b(eVar2.getScrollX(), height);
        } else {
            eVar2.c(eVar2.getScrollX(), height);
        }
    }

    public RNScrollViewManager() {
        this(null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e842ed50f1ce53e03baaa357fdadf7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e842ed50f1ce53e03baaa357fdadf7a");
        }
    }

    private RNScrollViewManager(@Nullable a aVar) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "441ee0325dfe21a583d87a46bead8cab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "441ee0325dfe21a583d87a46bead8cab");
            return;
        }
        this.e = null;
        this.e = null;
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(e eVar, boolean z) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d45b7365d5a37c538b9abf2018ac852", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d45b7365d5a37c538b9abf2018ac852");
            return;
        }
        eVar.setScrollEnabled(z);
        eVar.setFocusable(z);
    }

    @ReactProp(name = ShowsVerticalScrollIndicator.LOWER_CASE_NAME)
    public void setShowsVerticalScrollIndicator(e eVar, boolean z) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1495345ca171460581feeec8cdd66a79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1495345ca171460581feeec8cdd66a79");
        } else {
            eVar.setVerticalScrollBarEnabled(z);
        }
    }

    @ReactProp(name = DecelerationRate.LOWER_CASE_NAME)
    public void setDecelerationRate(e eVar, float f) {
        Object[] objArr = {eVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64bbf0fe32b53192abef4bb11a3ee62f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64bbf0fe32b53192abef4bb11a3ee62f");
        } else {
            eVar.setDecelerationRate(f);
        }
    }

    @ReactProp(name = DisableIntervalMomentum.LOWER_CASE_NAME)
    public void setDisableIntervalMomentum(e eVar, boolean z) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26243c96d058998434d780dd439d735c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26243c96d058998434d780dd439d735c");
        } else {
            eVar.setDisableIntervalMomentum(z);
        }
    }

    @ReactProp(name = SnapToStart.LOWER_CASE_NAME)
    public void setSnapToStart(e eVar, boolean z) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "463903bc61344869e9f72447d12b4078", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "463903bc61344869e9f72447d12b4078");
        } else {
            eVar.setSnapToStart(z);
        }
    }

    @ReactProp(name = SnapToEnd.LOWER_CASE_NAME)
    public void setSnapToEnd(e eVar, boolean z) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "135a3101202e4cde33595e10511fcc8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "135a3101202e4cde33595e10511fcc8a");
        } else {
            eVar.setSnapToEnd(z);
        }
    }

    @ReactProp(name = "contentOffset")
    public void setContentOffset(e eVar, ReadableMap readableMap) {
        Object[] objArr = {eVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daf5f3933a6838fb97de6a5a2cf95148", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daf5f3933a6838fb97de6a5a2cf95148");
        } else if (readableMap == null) {
        } else {
            double d2 = readableMap.hasKey(Constants.GestureMoveEvent.KEY_X) ? readableMap.getDouble(Constants.GestureMoveEvent.KEY_X) : 0.0d;
            double d3 = readableMap.hasKey(Constants.GestureMoveEvent.KEY_Y) ? readableMap.getDouble(Constants.GestureMoveEvent.KEY_Y) : 0.0d;
            DisplayMetrics displayMetrics = com.meituan.msc.uimanager.c.c;
            if (displayMetrics != null) {
                eVar.a((int) Math.round(d2 * displayMetrics.density), (int) Math.round(d3 * displayMetrics.density));
            }
        }
    }

    @ReactProp(name = "enableExperimentalFeature")
    public void setEnableExperimentalFeature(e eVar, boolean z) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a71c1c9c7cc3843dac0ceb2cb20371cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a71c1c9c7cc3843dac0ceb2cb20371cf");
        } else {
            eVar.setEnableExperimentalFeature(z);
        }
    }

    @ReactProp(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(e eVar, boolean z) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd6d702f092a49da87ed01c13266e069", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd6d702f092a49da87ed01c13266e069");
        } else {
            eVar.setRemoveClippedSubviews(z);
        }
    }

    @ReactProp(name = "sendMomentumEvents")
    public void setSendMomentumEvents(e eVar, boolean z) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d548a49dbc67de2345ca5a93b45bb10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d548a49dbc67de2345ca5a93b45bb10");
        } else {
            eVar.setSendMomentumEvents(z);
        }
    }

    @ReactProp(name = "scrollPerfTag")
    public void setScrollPerfTag(e eVar, @Nullable String str) {
        Object[] objArr = {eVar, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73427c36a3b2cbb6ebf6bbe1c1b8efe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73427c36a3b2cbb6ebf6bbe1c1b8efe5");
        } else {
            eVar.setScrollPerfTag(str);
        }
    }

    @ReactProp(name = PagingEnabled.LOWER_CASE_NAME)
    public void setPagingEnabled(e eVar, boolean z) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0b0f592947c9bb1de1790e98c04208d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0b0f592947c9bb1de1790e98c04208d");
        } else {
            eVar.setPagingEnabled(z);
        }
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(e eVar, int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34639561448db3c91118cdb495033160", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34639561448db3c91118cdb495033160");
        } else {
            eVar.setEndFillColor(i);
        }
    }

    @ReactProp(name = OverScrollMode.LOWER_CASE_NAME)
    public void setOverScrollMode(e eVar, String str) {
        Object[] objArr = {eVar, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e8b1e5de684cf0a92e5fa1d1592a35c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e8b1e5de684cf0a92e5fa1d1592a35c");
        } else {
            eVar.setOverScrollMode(g.a(str));
        }
    }

    @ReactProp(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(e eVar, boolean z) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "883c34e5f41e28c9b0506de32fb718c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "883c34e5f41e28c9b0506de32fb718c2");
        } else {
            ViewCompat.setNestedScrollingEnabled(eVar, z);
        }
    }

    @Override // com.meituan.msc.uimanager.as
    @Nullable
    public final Map<String, Integer> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00047ae575bd6baba36b4af5e0e87ff1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00047ae575bd6baba36b4af5e0e87ff1");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "650f8ce2b9f8951e56d7b525509d1578", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "650f8ce2b9f8951e56d7b525509d1578") : com.meituan.msc.jse.common.a.a("scrollTo", 1, "scrollToEnd", 2, "flashScrollIndicators", 3);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {BorderRadius.LOWER_CASE_NAME, BorderTopLeftRadius.LOWER_CASE_NAME, BorderTopRightRadius.LOWER_CASE_NAME, BorderBottomRightRadius.LOWER_CASE_NAME, BorderBottomLeftRadius.LOWER_CASE_NAME})
    public void setBorderRadius(e eVar, int i, float f) {
        Object[] objArr = {eVar, Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78a2d9f8a39086bc6859b38a0b9d52d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78a2d9f8a39086bc6859b38a0b9d52d1");
            return;
        }
        float a = !com.meituan.android.msc.yoga.f.a(f) ? s.a(f) : f;
        if (i == 0) {
            eVar.setBorderRadius(a);
            return;
        }
        int i2 = i - 1;
        Object[] objArr2 = {Float.valueOf(a), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "bf986cc0a43e6847066bfe182a05e423", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "bf986cc0a43e6847066bfe182a05e423");
        } else {
            eVar.b.a(a, i2);
        }
    }

    @ReactProp(name = BorderStyle.LOWER_CASE_NAME)
    public void setBorderStyle(e eVar, @Nullable String str) {
        Object[] objArr = {eVar, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57f789415963f27117d275023f5ea7fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57f789415963f27117d275023f5ea7fe");
        } else {
            eVar.setBorderStyle(str);
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", BorderLeftWidth.LOWER_CASE_NAME, BorderRightWidth.LOWER_CASE_NAME, "borderTopWidth", BorderBottomWidth.LOWER_CASE_NAME})
    public void setBorderWidth(e eVar, int i, float f) {
        Object[] objArr = {eVar, Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bd265a83f3156d99e7562168b170163", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bd265a83f3156d99e7562168b170163");
            return;
        }
        float a = !com.meituan.android.msc.yoga.f.a(f) ? s.a(f) : f;
        int i2 = d[i];
        Object[] objArr2 = {Integer.valueOf(i2), Float.valueOf(a)};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "5f69b87e730675306667e379d66bee9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "5f69b87e730675306667e379d66bee9c");
        } else {
            eVar.b.a(i2, a);
        }
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", BorderLeftColor.LOWER_CASE_NAME, BorderRightColor.LOWER_CASE_NAME, BorderTopColor.LOWER_CASE_NAME, BorderBottomColor.LOWER_CASE_NAME})
    public void setBorderColor(e eVar, int i, Integer num) {
        Object[] objArr = {eVar, Integer.valueOf(i), num};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "412e2be80262c1635a3fef56afe0a44e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "412e2be80262c1635a3fef56afe0a44e");
            return;
        }
        float intValue = num == null ? Float.NaN : num.intValue() & ViewCompat.MEASURED_SIZE_MASK;
        float intValue2 = num == null ? Float.NaN : num.intValue() >>> 24;
        int i2 = d[i];
        Object[] objArr2 = {Integer.valueOf(i2), Float.valueOf(intValue), Float.valueOf(intValue2)};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "b1c8f8dc37706695cbe6ece776aaa322", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "b1c8f8dc37706695cbe6ece776aaa322");
        } else {
            eVar.b.a(i2, intValue, intValue2);
        }
    }

    @ReactProp(name = "overflow")
    public void setOverflow(e eVar, @Nullable String str) {
        Object[] objArr = {eVar, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d7bc4f8ee89cefd26306a4b7e2cb176", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d7bc4f8ee89cefd26306a4b7e2cb176");
        } else {
            eVar.setOverflow(str);
        }
    }

    @ReactProp(name = PersistentScrollbar.LOWER_CASE_NAME)
    public void setPersistentScrollbar(e eVar, boolean z) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61463c4374ba83ab93404fa79d8f9f52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61463c4374ba83ab93404fa79d8f9f52");
        } else {
            eVar.setScrollbarFadingEnabled(!z ? 1 : 0);
        }
    }

    @ReactProp(name = FadingEdgeLength.LOWER_CASE_NAME)
    public void setFadingEdgeLength(e eVar, int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0474ca1bb3195b8db0f013154b0ca4ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0474ca1bb3195b8db0f013154b0ca4ab");
        } else if (i > 0) {
            eVar.setVerticalFadingEdgeEnabled(true);
            eVar.setFadingEdgeLength(i);
        } else {
            eVar.setVerticalFadingEdgeEnabled(false);
            eVar.setFadingEdgeLength(0);
        }
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.as
    @Nullable
    public final Map<String, Object> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "341edeb1662536dfa5b697ec77fcf88a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "341edeb1662536dfa5b697ec77fcf88a");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fb1760934e85227a47f1adcf1fe3bf85", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fb1760934e85227a47f1adcf1fe3bf85") : com.meituan.msc.jse.common.a.c().a(i.a(i.SCROLL), com.meituan.msc.jse.common.a.a("registrationName", "onScroll")).a(i.a(i.BEGIN_DRAG), com.meituan.msc.jse.common.a.a("registrationName", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)).a(i.a(i.END_DRAG), com.meituan.msc.jse.common.a.a("registrationName", DMKeys.KEY_ON_SCROLL_END_DRAG)).a(i.a(i.MOMENTUM_BEGIN), com.meituan.msc.jse.common.a.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN)).a(i.a(i.MOMENTUM_END), com.meituan.msc.jse.common.a.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_END)).a();
    }

    @ReactProp(name = "scrollHitSlop")
    public void setScrollHitSlop(e eVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {eVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50dc736ce21a2b569922ef008ab83f61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50dc736ce21a2b569922ef008ab83f61");
        } else if (readableMap == null) {
            eVar.setScrollHitSlopRect(null);
        } else {
            eVar.setScrollHitSlopRect(new Rect(readableMap.hasKey("left") ? (int) s.a(readableMap.getDouble("left")) : 0, readableMap.hasKey("top") ? (int) s.a(readableMap.getDouble("top")) : 0, readableMap.hasKey("right") ? (int) s.a(readableMap.getDouble("right")) : 0, readableMap.hasKey("bottom") ? (int) s.a(readableMap.getDouble("bottom")) : 0));
        }
    }

    @ReactProp(name = SnapToInterval.LOWER_CASE_NAME)
    public void setSnapToInterval(e eVar, float f) {
        Object[] objArr = {eVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c00af4a5ec4511e7c431437e7f906ab6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c00af4a5ec4511e7c431437e7f906ab6");
        } else {
            eVar.setSnapInterval((int) (f * com.meituan.msc.uimanager.c.c.density));
        }
    }

    @ReactProp(name = "snapToOffsets")
    public void setSnapToOffsets(e eVar, @Nullable ReadableArray readableArray) {
        Object[] objArr = {eVar, readableArray};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9579cf19e5f587cad0f5d73091edd70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9579cf19e5f587cad0f5d73091edd70");
            return;
        }
        DisplayMetrics displayMetrics = com.meituan.msc.uimanager.c.c;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i) * displayMetrics.density)));
        }
        eVar.setSnapOffsets(arrayList);
    }
}
