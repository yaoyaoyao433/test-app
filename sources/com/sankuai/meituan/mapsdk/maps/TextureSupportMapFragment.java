package com.sankuai.meituan.mapsdk.maps;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.TextureMapView;
import com.sankuai.meituan.mapsdk.maps.interfaces.k;
import com.sankuai.meituan.mapsdk.maps.model.MapViewOptions;
import com.sankuai.meituan.mapsdk.maps.model.Platform;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TextureSupportMapFragment extends AbstractSupportMapFragment {
    public static ChangeQuickRedirect changeQuickRedirect;
    private TextureMapView d;

    @Override // com.sankuai.meituan.mapsdk.maps.AbstractSupportMapFragment, android.support.v4.app.Fragment
    public /* bridge */ /* synthetic */ void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbstractSupportMapFragment, android.support.v4.app.Fragment
    public /* bridge */ /* synthetic */ void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
    }

    public static TextureSupportMapFragment newInstance(int i, String str, MapViewOptions mapViewOptions) {
        Object[] objArr = {Integer.valueOf(i), str, mapViewOptions};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "89a011de3c7359193412e9567272a9bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (TextureSupportMapFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "89a011de3c7359193412e9567272a9bc");
        }
        TextureSupportMapFragment textureSupportMapFragment = new TextureSupportMapFragment();
        textureSupportMapFragment.setArguments(createMapBundle(i, str, mapViewOptions));
        return textureSupportMapFragment;
    }

    @Override // android.support.v4.app.Fragment
    @SuppressLint({"WrongConstant"})
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2c61dcc140a3a743be7a780ac307441", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2c61dcc140a3a743be7a780ac307441");
        }
        this.d = new TextureMapView(getContext(), this.a, Platform.NATIVE, this.b);
        if (this.c != null) {
            this.d.setMapViewOptions(this.c);
        }
        this.d.onCreate(bundle);
        return this.d;
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc40744d8df55b2cd3bb6b7822a9eab9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc40744d8df55b2cd3bb6b7822a9eab9");
            return;
        }
        super.onPause();
        this.d.onPause();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9d1ae27869340495ae134c4a980ba60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9d1ae27869340495ae134c4a980ba60");
            return;
        }
        super.onResume();
        this.d.onResume();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d99ffec16a8be82c434c53812dd94720", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d99ffec16a8be82c434c53812dd94720");
            return;
        }
        super.onStop();
        this.d.onStop();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89d9395221833ac81d1424cb4ae8759b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89d9395221833ac81d1424cb4ae8759b");
            return;
        }
        super.onDestroy();
        this.d.onDestroy();
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63952490fe44a48994e9f4a01805e597", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63952490fe44a48994e9f4a01805e597");
            return;
        }
        super.onSaveInstanceState(bundle);
        this.d.onSaveInstanceState(bundle);
    }

    public MTMap getMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71f73eeb4d3cf13164ddc6b0b4a69bb0", RobustBitConfig.DEFAULT_VALUE) ? (MTMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71f73eeb4d3cf13164ddc6b0b4a69bb0") : this.d.getMap();
    }

    public k getAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5441e7b5b4f48cceb24c1a18f25b63c4", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5441e7b5b4f48cceb24c1a18f25b63c4") : this.d.getMapAdapter();
    }

    public AbstractMapView getMapView() {
        return this.d;
    }

    public void setMapType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6daac1b20fa6d0a5c7022ee8836c5860", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6daac1b20fa6d0a5c7022ee8836c5860");
        } else {
            this.d.switchMap(i);
        }
    }

    public void setOnMapTouchListener(TextureMapView.OnMapTouchListener onMapTouchListener) {
        Object[] objArr = {onMapTouchListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4fca7af90cb5e28108fa0f6d0db05e8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4fca7af90cb5e28108fa0f6d0db05e8c");
        } else {
            this.d.setOnMapTouchListener(onMapTouchListener);
        }
    }

    @Deprecated
    public static TextureSupportMapFragment newInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6bcae5e8c9e63140da341b75777d472a", RobustBitConfig.DEFAULT_VALUE) ? (TextureSupportMapFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6bcae5e8c9e63140da341b75777d472a") : new TextureSupportMapFragment();
    }

    @Deprecated
    public static TextureSupportMapFragment newInstance(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6976cb3b4f663e3294c465cd8f9e4d39", RobustBitConfig.DEFAULT_VALUE) ? (TextureSupportMapFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6976cb3b4f663e3294c465cd8f9e4d39") : newInstance(i, "", null);
    }

    @Deprecated
    public static TextureSupportMapFragment newInstance(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f70cab6823cce1f67573554fda3d1992", RobustBitConfig.DEFAULT_VALUE) ? (TextureSupportMapFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f70cab6823cce1f67573554fda3d1992") : newInstance(i, str, null);
    }
}
