package com.meituan.android.mrn.component.list;

import android.support.v4.view.ViewCompat;
import android.view.View;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.mrn.component.list.BaseListView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class BaseListViewManager<T extends BaseListView> extends ViewGroupManager<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager
    public abstract T createViewInstance(ao aoVar);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
        onAfterUpdateTransaction((BaseListViewManager<T>) ((BaseListView) view));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd621e3c191810581531deab2ecabc9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd621e3c191810581531deab2ecabc9a");
        }
        throw new RuntimeException(getClass().getSimpleName() + " should implement(override) method: getName()");
    }

    @ReactProp(name = "numColumns")
    public void setColumnCount(T t, int i) {
        Object[] objArr = {t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47cd176b8a7b747da8a4b29cccc60893", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47cd176b8a7b747da8a4b29cccc60893");
        } else {
            t.setColumnCount(i);
        }
    }

    @ReactProp(name = DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION)
    public void setOrientation(T t, int i) {
        Object[] objArr = {t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "356a635f455e0fb58aaa0b4245cf1a16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "356a635f455e0fb58aaa0b4245cf1a16");
        } else {
            t.setOrientation(i);
        }
    }

    @ReactProp(name = "reverseLayout")
    public void setReverseLayout(T t, boolean z) {
        Object[] objArr = {t, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bef62031454cb7416f582eb2bad5f610", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bef62031454cb7416f582eb2bad5f610");
        } else {
            t.setReverseLayout(z);
        }
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(T t, boolean z) {
        Object[] objArr = {t, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31ad27f8c46acf53f0b38d2c6ba48641", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31ad27f8c46acf53f0b38d2c6ba48641");
        } else {
            t.setScrollEnabled(z);
        }
    }

    @ReactProp(defaultBoolean = false, name = "sendMomentumEvents")
    public void setSendMomentumEvents(T t, boolean z) {
        Object[] objArr = {t, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86051594f86d2d7095eafa7b8f90784c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86051594f86d2d7095eafa7b8f90784c");
        } else {
            t.setSendMomentumEvents(z);
        }
    }

    @ReactProp(defaultFloat = 0.1f, name = "onEndReachedThreshold")
    public void setOnEndReachedThreshold(T t, float f) {
        Object[] objArr = {t, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2c21cf11970ab953693c0e17aeeb4f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2c21cf11970ab953693c0e17aeeb4f7");
        } else {
            t.setOnEndReachedThreshold(f);
        }
    }

    @ReactProp(defaultBoolean = false, name = "stickySectionHeadersEnabled")
    public void setSticky(T t, boolean z) {
        Object[] objArr = {t, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95e67cac9c952f81bdd31c4d0af6d291", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95e67cac9c952f81bdd31c4d0af6d291");
        } else {
            t.setSticky(z);
        }
    }

    @ReactProp(name = "contentPadding")
    public void setContentPadding(T t, ReadableMap readableMap) {
        Object[] objArr = {t, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bf2d50b11294eb7ad230e4a106cde09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bf2d50b11294eb7ad230e4a106cde09");
        } else {
            t.setContentPadding(readableMap);
        }
    }

    @ReactProp(defaultBoolean = true, name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(T t, boolean z) {
        Object[] objArr = {t, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "adbb9fc7d1950b940482cf76c0089ce0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "adbb9fc7d1950b940482cf76c0089ce0");
        } else {
            ViewCompat.setNestedScrollingEnabled(t, z);
        }
    }

    public void onAfterUpdateTransaction(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6700d97016cd252cc92d3d78b11e357f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6700d97016cd252cc92d3d78b11e357f");
            return;
        }
        super.onAfterUpdateTransaction((BaseListViewManager<T>) t);
        t.a();
    }
}
