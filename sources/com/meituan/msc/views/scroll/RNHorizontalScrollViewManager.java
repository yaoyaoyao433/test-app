package com.meituan.msc.views.scroll;

import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.util.DisplayMetrics;
import android.view.View;
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
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
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
/* compiled from: ProGuard */
@ReactModule(name = "AndroidHorizontalScrollView")
/* loaded from: classes3.dex */
public class RNHorizontalScrollViewManager extends RNViewGroupManager<d> implements f.a<d> {
    public static ChangeQuickRedirect b;
    private static final int[] d = {8, 0, 2, 1, 3};
    @Nullable
    private a e;

    @Override // com.meituan.msc.uimanager.as
    public final String a() {
        return "AndroidHorizontalScrollView";
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ View a(ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae46962cca565ecd3444d43dced85a73", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae46962cca565ecd3444d43dced85a73") : new d(themedReactContext, this.e);
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ Object a(View view, ab abVar, @Nullable ai aiVar) {
        d dVar = (d) view;
        Object[] objArr = {dVar, abVar, aiVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e1235efb470c9507fe4055dd8a13707", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e1235efb470c9507fe4055dd8a13707");
        }
        dVar.c = aiVar;
        return null;
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ void a(View view, int i, @Nullable ReadableArray readableArray) {
        d dVar = (d) view;
        Object[] objArr = {dVar, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71780ed099e05b6dceb6fba5e394a1b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71780ed099e05b6dceb6fba5e394a1b0");
        } else {
            f.a(this, dVar, i, readableArray);
        }
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ void a(View view, String str, @Nullable ReadableArray readableArray) {
        d dVar = (d) view;
        Object[] objArr = {dVar, str, readableArray};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c611efe87d3d940993b5c27f0f95cd5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c611efe87d3d940993b5c27f0f95cd5c");
        } else {
            f.a(this, dVar, str, readableArray);
        }
    }

    @Override // com.meituan.msc.views.scroll.f.a
    public final /* synthetic */ void a(d dVar) {
        d dVar2 = dVar;
        Object[] objArr = {dVar2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10e005f2ff4c85181c0753c7bcea6b10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10e005f2ff4c85181c0753c7bcea6b10");
        } else {
            dVar2.b();
        }
    }

    @Override // com.meituan.msc.views.scroll.f.a
    public final /* synthetic */ void a(d dVar, f.b bVar) {
        d dVar2 = dVar;
        Object[] objArr = {dVar2, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4261570f797dc5ec4f1cf9ea956398e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4261570f797dc5ec4f1cf9ea956398e0");
        } else if (bVar.c) {
            dVar2.b(bVar.a, bVar.b);
        } else {
            dVar2.c(bVar.a, bVar.b);
        }
    }

    @Override // com.meituan.msc.views.scroll.f.a
    public final /* synthetic */ void a(d dVar, f.c cVar) {
        d dVar2 = dVar;
        Object[] objArr = {dVar2, cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daa4759c5e95d2488d7043f980d25c55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daa4759c5e95d2488d7043f980d25c55");
            return;
        }
        int width = dVar2.getChildAt(0).getWidth() + dVar2.getPaddingRight();
        if (cVar.a) {
            dVar2.b(width, dVar2.getScrollY());
        } else {
            dVar2.c(width, dVar2.getScrollY());
        }
    }

    public RNHorizontalScrollViewManager() {
        this(null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45749dc1da95cab3b9070f73acacad26", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45749dc1da95cab3b9070f73acacad26");
        }
    }

    private RNHorizontalScrollViewManager(@Nullable a aVar) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf4d5a227428b9dc6f2ea23b9e8bbe1f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf4d5a227428b9dc6f2ea23b9e8bbe1f");
            return;
        }
        this.e = null;
        this.e = null;
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4824628d7a4937cbb9ae3b9e9c7fc1a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4824628d7a4937cbb9ae3b9e9c7fc1a8");
        } else {
            dVar.setScrollEnabled(z);
        }
    }

    @ReactProp(name = ShowsHorizontalScrollIndicator.LOWER_CASE_NAME)
    public void setShowsHorizontalScrollIndicator(d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0a5a623cc7e633f7145676e527469b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0a5a623cc7e633f7145676e527469b8");
        } else {
            dVar.setHorizontalScrollBarEnabled(z);
        }
    }

    @ReactProp(name = DecelerationRate.LOWER_CASE_NAME)
    public void setDecelerationRate(d dVar, float f) {
        Object[] objArr = {dVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccb51c8603693517acb8d003d4ea7428", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccb51c8603693517acb8d003d4ea7428");
        } else {
            dVar.setDecelerationRate(f);
        }
    }

    @ReactProp(name = DisableIntervalMomentum.LOWER_CASE_NAME)
    public void setDisableIntervalMomentum(d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40076268838880e1db6d2c0e1d6d5433", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40076268838880e1db6d2c0e1d6d5433");
        } else {
            dVar.setDisableIntervalMomentum(z);
        }
    }

    @ReactProp(name = SnapToStart.LOWER_CASE_NAME)
    public void setSnapToStart(d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91e12e8440ce02f143ad6fc2d6500176", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91e12e8440ce02f143ad6fc2d6500176");
        } else {
            dVar.setSnapToStart(z);
        }
    }

    @ReactProp(name = SnapToEnd.LOWER_CASE_NAME)
    public void setSnapToEnd(d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14fb7511f29467bfb3e90df52dba16f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14fb7511f29467bfb3e90df52dba16f8");
        } else {
            dVar.setSnapToEnd(z);
        }
    }

    @ReactProp(name = "contentOffset")
    public void setContentOffset(d dVar, ReadableMap readableMap) {
        Object[] objArr = {dVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "775ceabf66d217c970202b804af0621d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "775ceabf66d217c970202b804af0621d");
        } else if (readableMap == null) {
        } else {
            double d2 = readableMap.hasKey(Constants.GestureMoveEvent.KEY_X) ? readableMap.getDouble(Constants.GestureMoveEvent.KEY_X) : 0.0d;
            double d3 = readableMap.hasKey(Constants.GestureMoveEvent.KEY_Y) ? readableMap.getDouble(Constants.GestureMoveEvent.KEY_Y) : 0.0d;
            DisplayMetrics displayMetrics = com.meituan.msc.uimanager.c.c;
            if (displayMetrics != null) {
                dVar.a((int) Math.round(d2 * displayMetrics.density), (int) Math.round(d3 * displayMetrics.density));
            }
        }
    }

    @ReactProp(name = "enableExperimentalFeature")
    public void setEnableExperimentalFeature(d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dc970ae36ec0986c6384d1d4866dcf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dc970ae36ec0986c6384d1d4866dcf5");
        } else {
            dVar.setEnableExperimentalFeature(z);
        }
    }

    @ReactProp(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a132ea05d66ba8c526a67cc8e156cc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a132ea05d66ba8c526a67cc8e156cc7");
        } else {
            dVar.setRemoveClippedSubviews(z);
        }
    }

    @ReactProp(name = "sendMomentumEvents")
    public void setSendMomentumEvents(d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "798f361f668c3061a40c1dfec95ce0fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "798f361f668c3061a40c1dfec95ce0fa");
        } else {
            dVar.setSendMomentumEvents(z);
        }
    }

    @ReactProp(name = "scrollPerfTag")
    public void setScrollPerfTag(d dVar, String str) {
        Object[] objArr = {dVar, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4afea34e5cda617a5d5d327a9a91e05a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4afea34e5cda617a5d5d327a9a91e05a");
        } else {
            dVar.setScrollPerfTag(str);
        }
    }

    @ReactProp(name = PagingEnabled.LOWER_CASE_NAME)
    public void setPagingEnabled(d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "538332722ba7a418e01b252fbf0602ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "538332722ba7a418e01b252fbf0602ed");
        } else {
            dVar.setPagingEnabled(z);
        }
    }

    @ReactProp(name = OverScrollMode.LOWER_CASE_NAME)
    public void setOverScrollMode(d dVar, String str) {
        Object[] objArr = {dVar, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcaa129488287b213f84de240cb1272b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcaa129488287b213f84de240cb1272b");
        } else {
            dVar.setOverScrollMode(g.a(str));
        }
    }

    @ReactProp(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d3ada3ffc7d4391767968db6b6a7661", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d3ada3ffc7d4391767968db6b6a7661");
        } else {
            ViewCompat.setNestedScrollingEnabled(dVar, z);
        }
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(d dVar, int i) {
        Object[] objArr = {dVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44c90cbcd65d9f543a0c16bc6ca8e855", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44c90cbcd65d9f543a0c16bc6ca8e855");
        } else {
            dVar.setEndFillColor(i);
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {BorderRadius.LOWER_CASE_NAME, BorderTopLeftRadius.LOWER_CASE_NAME, BorderTopRightRadius.LOWER_CASE_NAME, BorderBottomRightRadius.LOWER_CASE_NAME, BorderBottomLeftRadius.LOWER_CASE_NAME})
    public void setBorderRadius(d dVar, int i, float f) {
        Object[] objArr = {dVar, Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb10355bc68a1b7eb1d5eb580f2ed494", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb10355bc68a1b7eb1d5eb580f2ed494");
            return;
        }
        float a = !com.meituan.android.msc.yoga.f.a(f) ? s.a(f) : f;
        if (i == 0) {
            dVar.setBorderRadius(a);
            return;
        }
        int i2 = i - 1;
        Object[] objArr2 = {Float.valueOf(a), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "413ce85d0ad6cd868e15fdabe8333541", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "413ce85d0ad6cd868e15fdabe8333541");
        } else {
            dVar.b.a(a, i2);
        }
    }

    @ReactProp(name = BorderStyle.LOWER_CASE_NAME)
    public void setBorderStyle(d dVar, @Nullable String str) {
        Object[] objArr = {dVar, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "527f8aec40cf255aee1ed0a0978b59eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "527f8aec40cf255aee1ed0a0978b59eb");
        } else {
            dVar.setBorderStyle(str);
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", BorderLeftWidth.LOWER_CASE_NAME, BorderRightWidth.LOWER_CASE_NAME, "borderTopWidth", BorderBottomWidth.LOWER_CASE_NAME})
    public void setBorderWidth(d dVar, int i, float f) {
        Object[] objArr = {dVar, Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d02075b4bbcf7da2ff86a603a6b2ea7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d02075b4bbcf7da2ff86a603a6b2ea7d");
            return;
        }
        float a = !com.meituan.android.msc.yoga.f.a(f) ? s.a(f) : f;
        int i2 = d[i];
        Object[] objArr2 = {Integer.valueOf(i2), Float.valueOf(a)};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "7e9c717ecfcdf5cd9e3c435ee1503f80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "7e9c717ecfcdf5cd9e3c435ee1503f80");
            return;
        }
        if (i2 == 0) {
            dVar.d = a;
        } else if (i2 == 2) {
            dVar.e = a;
        } else if (i2 == 8) {
            dVar.e = a;
            dVar.d = a;
        }
        dVar.b.a(i2, a);
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", BorderLeftColor.LOWER_CASE_NAME, BorderRightColor.LOWER_CASE_NAME, BorderTopColor.LOWER_CASE_NAME, BorderBottomColor.LOWER_CASE_NAME})
    public void setBorderColor(d dVar, int i, Integer num) {
        Object[] objArr = {dVar, Integer.valueOf(i), num};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f25b34712beb51d52dbefa74ca08e922", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f25b34712beb51d52dbefa74ca08e922");
            return;
        }
        float intValue = num == null ? Float.NaN : num.intValue() & ViewCompat.MEASURED_SIZE_MASK;
        float intValue2 = num == null ? Float.NaN : num.intValue() >>> 24;
        int i2 = d[i];
        Object[] objArr2 = {Integer.valueOf(i2), Float.valueOf(intValue), Float.valueOf(intValue2)};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "2389fd05baf7924b6fe229733a61f406", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "2389fd05baf7924b6fe229733a61f406");
        } else {
            dVar.b.a(i2, intValue, intValue2);
        }
    }

    @ReactProp(name = "overflow")
    public void setOverflow(d dVar, @Nullable String str) {
        Object[] objArr = {dVar, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05ed15f04b79f7d7e74a211835037dc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05ed15f04b79f7d7e74a211835037dc1");
        } else {
            dVar.setOverflow(str);
        }
    }

    @ReactProp(name = PersistentScrollbar.LOWER_CASE_NAME)
    public void setPersistentScrollbar(d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91ed2adfa3bede4d343e3a8a024d9985", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91ed2adfa3bede4d343e3a8a024d9985");
        } else {
            dVar.setScrollbarFadingEnabled(!z ? 1 : 0);
        }
    }

    @ReactProp(name = FadingEdgeLength.LOWER_CASE_NAME)
    public void setFadingEdgeLength(d dVar, int i) {
        Object[] objArr = {dVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bee9494b0e6b8cc25579074c54d8c4f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bee9494b0e6b8cc25579074c54d8c4f9");
        } else if (i > 0) {
            dVar.setHorizontalFadingEdgeEnabled(true);
            dVar.setFadingEdgeLength(i);
        } else {
            dVar.setHorizontalFadingEdgeEnabled(false);
            dVar.setFadingEdgeLength(0);
        }
    }

    @ReactProp(name = SnapToInterval.LOWER_CASE_NAME)
    public void setSnapToInterval(d dVar, float f) {
        Object[] objArr = {dVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87f61a6ae3baae28d639d004666875db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87f61a6ae3baae28d639d004666875db");
        } else {
            dVar.setSnapInterval((int) (f * com.meituan.msc.uimanager.c.c.density));
        }
    }

    @ReactProp(name = "snapToOffsets")
    public void setSnapToOffsets(d dVar, @Nullable ReadableArray readableArray) {
        Object[] objArr = {dVar, readableArray};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7e4a7fb0701a31ce3bc6947e30be0af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7e4a7fb0701a31ce3bc6947e30be0af");
            return;
        }
        DisplayMetrics displayMetrics = com.meituan.msc.uimanager.c.c;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i) * displayMetrics.density)));
        }
        dVar.setSnapOffsets(arrayList);
    }
}
