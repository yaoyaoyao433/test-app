package com.meituan.android.legwork.mrn.view;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.util.DisplayMetrics;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.w;
import com.facebook.react.views.scroll.f;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.legwork.utils.x;
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
@ReactModule(name = ReactTopScrollViewManager.REACT_CLASS)
/* loaded from: classes2.dex */
public class ReactTopScrollViewManager extends ViewGroupManager<i> implements f.a<i> {
    public static final String REACT_CLASS = "BMLWTopScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private com.facebook.react.views.scroll.a mFpsListener;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public ReactTopScrollViewManager() {
        this(null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b73ba4ad20f2a3d2ec161ad6c152c60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b73ba4ad20f2a3d2ec161ad6c152c60");
        }
    }

    public ReactTopScrollViewManager(@Nullable com.facebook.react.views.scroll.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bad745521adfd87c4bc94fcf2c989f65", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bad745521adfd87c4bc94fcf2c989f65");
            return;
        }
        this.mFpsListener = null;
        this.mFpsListener = aVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public i createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c19783eec23f8d119465f82f89fe3904", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c19783eec23f8d119465f82f89fe3904") : new i(aoVar, this.mFpsListener);
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(i iVar, boolean z) {
        Object[] objArr = {iVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1678c43a0a599f219974e4f7a71d1127", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1678c43a0a599f219974e4f7a71d1127");
        } else {
            iVar.setScrollEnabled(z);
        }
    }

    @ReactProp(name = ShowsVerticalScrollIndicator.LOWER_CASE_NAME)
    public void setShowsVerticalScrollIndicator(i iVar, boolean z) {
        Object[] objArr = {iVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38cd7c475a6c754a105d4758152d8c53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38cd7c475a6c754a105d4758152d8c53");
        } else {
            iVar.setVerticalScrollBarEnabled(z);
        }
    }

    @ReactProp(name = DecelerationRate.LOWER_CASE_NAME)
    public void setDecelerationRate(i iVar, float f) {
        Object[] objArr = {iVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0205fa34608fde7a539568af65f5c678", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0205fa34608fde7a539568af65f5c678");
        } else {
            iVar.setDecelerationRate(f);
        }
    }

    @ReactProp(name = SnapToInterval.LOWER_CASE_NAME)
    public void setSnapToInterval(i iVar, float f) {
        Object[] objArr = {iVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9ce923874295224a9fecb327549caf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9ce923874295224a9fecb327549caf8");
        } else {
            iVar.setSnapInterval((int) (f * com.facebook.react.uimanager.d.b().density));
        }
    }

    @ReactProp(name = "snapToOffsets")
    public void setSnapToOffsets(i iVar, @Nullable ReadableArray readableArray) {
        Object[] objArr = {iVar, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0965191504df678dfad77cd7d87b974", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0965191504df678dfad77cd7d87b974");
            return;
        }
        DisplayMetrics b = com.facebook.react.uimanager.d.b();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i) * b.density)));
        }
        iVar.setSnapOffsets(arrayList);
    }

    @ReactProp(name = SnapToStart.LOWER_CASE_NAME)
    public void setSnapToStart(i iVar, boolean z) {
        Object[] objArr = {iVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14c04aede797b9d68cc12eacadf37b79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14c04aede797b9d68cc12eacadf37b79");
        } else {
            iVar.setSnapToStart(z);
        }
    }

    @ReactProp(name = SnapToEnd.LOWER_CASE_NAME)
    public void setSnapToEnd(i iVar, boolean z) {
        Object[] objArr = {iVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "344136dfa4c2428ce732c89d33e926c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "344136dfa4c2428ce732c89d33e926c2");
        } else {
            iVar.setSnapToEnd(z);
        }
    }

    @ReactProp(name = "contentOffset")
    public void setContentOffset(i iVar, ReadableMap readableMap) {
        Object[] objArr = {iVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "903e6ec7358661f74df45e5a92e4f9be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "903e6ec7358661f74df45e5a92e4f9be");
        } else if (readableMap == null) {
        } else {
            double d = readableMap.hasKey(Constants.GestureMoveEvent.KEY_X) ? readableMap.getDouble(Constants.GestureMoveEvent.KEY_X) : 0.0d;
            double d2 = readableMap.hasKey(Constants.GestureMoveEvent.KEY_Y) ? readableMap.getDouble(Constants.GestureMoveEvent.KEY_Y) : 0.0d;
            DisplayMetrics b = com.facebook.react.uimanager.d.b();
            if (b != null) {
                iVar.a((int) Math.round(d * b.density), (int) Math.round(d2 * b.density));
            }
        }
    }

    @ReactProp(name = "enableExperimentalFeature")
    public void setEnableExperimentalFeature(i iVar, boolean z) {
        Object[] objArr = {iVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b916cc0a18324ea8c16d9db177f27af3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b916cc0a18324ea8c16d9db177f27af3");
        } else {
            iVar.setEnableExperimentalFeature(z);
        }
    }

    @ReactProp(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(i iVar, boolean z) {
        Object[] objArr = {iVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6f7145fdb090ffacf683bb45a457c04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6f7145fdb090ffacf683bb45a457c04");
        } else {
            iVar.setRemoveClippedSubviews(z);
        }
    }

    @ReactProp(name = "sendMomentumEvents")
    public void setSendMomentumEvents(i iVar, boolean z) {
        Object[] objArr = {iVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56f073e35ca9fef07619f9cbfa28ed6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56f073e35ca9fef07619f9cbfa28ed6a");
        } else {
            iVar.setSendMomentumEvents(z);
        }
    }

    @ReactProp(name = "scrollPerfTag")
    public void setScrollPerfTag(i iVar, @Nullable String str) {
        Object[] objArr = {iVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d94547c69642882ecc4e5a3f2ab33ab7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d94547c69642882ecc4e5a3f2ab33ab7");
        } else {
            iVar.setScrollPerfTag(str);
        }
    }

    @ReactProp(name = PagingEnabled.LOWER_CASE_NAME)
    public void setPagingEnabled(i iVar, boolean z) {
        Object[] objArr = {iVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c4a7f6454576dc1077db250c52f2735", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c4a7f6454576dc1077db250c52f2735");
        } else {
            iVar.setPagingEnabled(z);
        }
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(i iVar, int i) {
        Object[] objArr = {iVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dcf554ec95e9cb56a8a65e07bcfb99b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dcf554ec95e9cb56a8a65e07bcfb99b3");
        } else {
            iVar.setEndFillColor(i);
        }
    }

    @ReactProp(name = OverScrollMode.LOWER_CASE_NAME)
    public void setOverScrollMode(i iVar, String str) {
        Object[] objArr = {iVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f945059e8e1f37a78981450a84ea87e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f945059e8e1f37a78981450a84ea87e7");
        } else {
            iVar.setOverScrollMode(com.facebook.react.views.scroll.g.a(str));
        }
    }

    @ReactProp(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(i iVar, boolean z) {
        Object[] objArr = {iVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "550db68454c74ed06505d8dbdc374745", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "550db68454c74ed06505d8dbdc374745");
        } else {
            ViewCompat.setNestedScrollingEnabled(iVar, z);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c022329eb98234d23c7879bc67a3dedc", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c022329eb98234d23c7879bc67a3dedc") : com.facebook.react.views.scroll.f.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(i iVar, int i, @Nullable ReadableArray readableArray) {
        Object[] objArr = {iVar, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dcc16ba5bc40a9d447f5631fee28aadc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dcc16ba5bc40a9d447f5631fee28aadc");
        } else {
            com.facebook.react.views.scroll.f.a(this, iVar, i, readableArray);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NonNull i iVar, String str, @android.support.annotation.Nullable ReadableArray readableArray) {
        Object[] objArr = {iVar, str, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e59a7efd1e079ea4e10ea309405f303", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e59a7efd1e079ea4e10ea309405f303");
        } else {
            j.a(this, iVar, str, readableArray);
        }
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void flashScrollIndicators(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "690b0d0f49c8ebcf50274ea88a2c342c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "690b0d0f49c8ebcf50274ea88a2c342c");
        } else {
            iVar.a();
        }
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void scrollTo(i iVar, f.b bVar) {
        Object[] objArr = {iVar, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e299f88a69a2762f35bfa759db2c529e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e299f88a69a2762f35bfa759db2c529e");
        } else if (bVar.c) {
            iVar.b(bVar.a, bVar.b);
        } else {
            iVar.c(bVar.a, bVar.b);
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {BorderRadius.LOWER_CASE_NAME, BorderTopLeftRadius.LOWER_CASE_NAME, BorderTopRightRadius.LOWER_CASE_NAME, BorderBottomRightRadius.LOWER_CASE_NAME, BorderBottomLeftRadius.LOWER_CASE_NAME})
    public void setBorderRadius(i iVar, int i, float f) {
        Object[] objArr = {iVar, Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96e39e5833fe13256d494cb1cac25679", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96e39e5833fe13256d494cb1cac25679");
            return;
        }
        float a = !com.facebook.yoga.b.a(f) ? w.a(f) : f;
        if (i == 0) {
            iVar.setBorderRadius(a);
            return;
        }
        int i2 = i - 1;
        Object[] objArr2 = {Float.valueOf(a), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect3 = i.a;
        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect3, false, "bd10d3a0ca2b5d3aa4c105ab3d2016dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect3, false, "bd10d3a0ca2b5d3aa4c105ab3d2016dc");
        } else {
            iVar.b.a(a, i2);
        }
    }

    @ReactProp(name = BorderStyle.LOWER_CASE_NAME)
    public void setBorderStyle(i iVar, @Nullable String str) {
        Object[] objArr = {iVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "891a56b3b4961554253cd38c377e37a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "891a56b3b4961554253cd38c377e37a5");
        } else {
            iVar.setBorderStyle(str);
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", BorderLeftWidth.LOWER_CASE_NAME, BorderRightWidth.LOWER_CASE_NAME, "borderTopWidth", BorderBottomWidth.LOWER_CASE_NAME})
    public void setBorderWidth(i iVar, int i, float f) {
        Object[] objArr = {iVar, Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5cd62a1076d710bda4e5d5916e791aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5cd62a1076d710bda4e5d5916e791aa");
            return;
        }
        float a = !com.facebook.yoga.b.a(f) ? w.a(f) : f;
        int i2 = SPACING_TYPES[i];
        Object[] objArr2 = {Integer.valueOf(i2), Float.valueOf(a)};
        ChangeQuickRedirect changeQuickRedirect3 = i.a;
        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect3, false, "bc4dcdcfa9eea4a5b199ff67a7da819d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect3, false, "bc4dcdcfa9eea4a5b199ff67a7da819d");
        } else {
            iVar.b.a(i2, a);
        }
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", BorderLeftColor.LOWER_CASE_NAME, BorderRightColor.LOWER_CASE_NAME, BorderTopColor.LOWER_CASE_NAME, BorderBottomColor.LOWER_CASE_NAME})
    public void setBorderColor(i iVar, int i, Integer num) {
        Object[] objArr = {iVar, Integer.valueOf(i), num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ee27918845c496ac0e118b6526ff571", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ee27918845c496ac0e118b6526ff571");
            return;
        }
        float intValue = num == null ? Float.NaN : num.intValue() & ViewCompat.MEASURED_SIZE_MASK;
        float intValue2 = num == null ? Float.NaN : num.intValue() >>> 24;
        int i2 = SPACING_TYPES[i];
        Object[] objArr2 = {Integer.valueOf(i2), Float.valueOf(intValue), Float.valueOf(intValue2)};
        ChangeQuickRedirect changeQuickRedirect3 = i.a;
        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect3, false, "f0b52f701baaf286d439a58d20a60626", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect3, false, "f0b52f701baaf286d439a58d20a60626");
        } else {
            iVar.b.a(i2, intValue, intValue2);
        }
    }

    @ReactProp(name = "overflow")
    public void setOverflow(i iVar, @Nullable String str) {
        Object[] objArr = {iVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5b931e5863920efc24eaf04888cb134", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5b931e5863920efc24eaf04888cb134");
        } else {
            iVar.setOverflow(str);
        }
    }

    @ReactProp(name = "bmlwTopIntercept")
    public void setTopIntercept(i iVar, int i) {
        Object[] objArr = {iVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e353c6fde26e943f00b0e47350fa28da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e353c6fde26e943f00b0e47350fa28da");
            return;
        }
        x.b("ReactTopScrollViewManager.setTopIntercept()", "有topIntercept属性：" + i);
        iVar.setTopIntercept(i);
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void scrollToEnd(i iVar, f.c cVar) {
        Object[] objArr = {iVar, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "311f7189811fd5131a094f95211f4bc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "311f7189811fd5131a094f95211f4bc4");
            return;
        }
        int height = iVar.getChildAt(0).getHeight() + iVar.getPaddingBottom();
        if (cVar.a) {
            iVar.b(iVar.getScrollX(), height);
        } else {
            iVar.c(iVar.getScrollX(), height);
        }
    }

    @ReactProp(name = PersistentScrollbar.LOWER_CASE_NAME)
    public void setPersistentScrollbar(i iVar, boolean z) {
        Object[] objArr = {iVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48f1cf72fe55862a13435af89c30046b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48f1cf72fe55862a13435af89c30046b");
        } else {
            iVar.setScrollbarFadingEnabled(!z ? 1 : 0);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b95553793a5129205572fee17117ab98", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b95553793a5129205572fee17117ab98") : createExportedCustomDirectEventTypeConstants();
    }

    public static Map<String, Object> createExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "467a8230f854e2caa2eb1820334c9030", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "467a8230f854e2caa2eb1820334c9030") : com.facebook.react.common.c.b().a(com.facebook.react.views.scroll.i.a(com.facebook.react.views.scroll.i.SCROLL), com.facebook.react.common.c.a("registrationName", "onScroll")).a(com.facebook.react.views.scroll.i.a(com.facebook.react.views.scroll.i.BEGIN_DRAG), com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)).a(com.facebook.react.views.scroll.i.a(com.facebook.react.views.scroll.i.END_DRAG), com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_SCROLL_END_DRAG)).a(com.facebook.react.views.scroll.i.a(com.facebook.react.views.scroll.i.MOMENTUM_BEGIN), com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN)).a(com.facebook.react.views.scroll.i.a(com.facebook.react.views.scroll.i.MOMENTUM_END), com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_END)).a();
    }
}
