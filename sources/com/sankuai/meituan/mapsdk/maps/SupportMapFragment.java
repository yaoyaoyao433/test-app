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
import com.sankuai.meituan.mapsdk.maps.MapView;
import com.sankuai.meituan.mapsdk.maps.interfaces.k;
import com.sankuai.meituan.mapsdk.maps.model.MapViewOptions;
import com.sankuai.meituan.mapsdk.maps.model.Platform;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SupportMapFragment extends AbstractSupportMapFragment {
    public static ChangeQuickRedirect changeQuickRedirect;
    private MapView d;

    @Override // com.sankuai.meituan.mapsdk.maps.AbstractSupportMapFragment, android.support.v4.app.Fragment
    public /* bridge */ /* synthetic */ void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
    }

    public static SupportMapFragment newInstance(int i, String str, MapViewOptions mapViewOptions) {
        Object[] objArr = {Integer.valueOf(i), str, mapViewOptions};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "df08cd217dd73adc4865535e928e0465", RobustBitConfig.DEFAULT_VALUE)) {
            return (SupportMapFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "df08cd217dd73adc4865535e928e0465");
        }
        SupportMapFragment supportMapFragment = new SupportMapFragment();
        supportMapFragment.setArguments(createMapBundle(i, str, mapViewOptions));
        return supportMapFragment;
    }

    @Override // android.support.v4.app.Fragment
    @SuppressLint({"WrongConstant"})
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3570637c33b4836b99d244e9ecb7466", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3570637c33b4836b99d244e9ecb7466");
        }
        this.d = new MapView(getContext(), this.a, Platform.NATIVE, this.b);
        if (this.c != null) {
            this.d.setMapViewOptions(this.c);
        }
        this.d.onCreate(bundle);
        return this.d;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbstractSupportMapFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3186cc4b6ce9cfe84a78e97ba967290a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3186cc4b6ce9cfe84a78e97ba967290a");
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f9bb94f7f95eaad66c3d6af8fda6add", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f9bb94f7f95eaad66c3d6af8fda6add");
            return;
        }
        super.onPause();
        this.d.onPause();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6869971efc4e0f8349b0dcfe4688be97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6869971efc4e0f8349b0dcfe4688be97");
            return;
        }
        super.onResume();
        this.d.onResume();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "774dac494d1fdceb934331553687c4e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "774dac494d1fdceb934331553687c4e7");
            return;
        }
        super.onStop();
        this.d.onStop();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29042852902f691c4bbdf471f5d3627b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29042852902f691c4bbdf471f5d3627b");
            return;
        }
        super.onDestroy();
        this.d.onDestroy();
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a470620a2339801be28a6e2d1da272ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a470620a2339801be28a6e2d1da272ef");
            return;
        }
        super.onSaveInstanceState(bundle);
        this.d.onSaveInstanceState(bundle);
    }

    public MTMap getMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27046da3beec34fdf47803893e488b55", RobustBitConfig.DEFAULT_VALUE) ? (MTMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27046da3beec34fdf47803893e488b55") : this.d.getMap();
    }

    public k getAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d80749425ed88e3636ffc1327ee0e336", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d80749425ed88e3636ffc1327ee0e336") : this.d.getMapAdapter();
    }

    public AbstractMapView getMapView() {
        return this.d;
    }

    public void setMapType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b249a59a68badd4cb15b3936331db5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b249a59a68badd4cb15b3936331db5d");
        } else {
            this.d.switchMap(i);
        }
    }

    public void setOnMapTouchListener(MapView.OnMapTouchListener onMapTouchListener) {
        Object[] objArr = {onMapTouchListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ca241572452049b38999eaf45d73cff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ca241572452049b38999eaf45d73cff");
        } else {
            this.d.setOnMapTouchListener(onMapTouchListener);
        }
    }

    @Deprecated
    public static SupportMapFragment newInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d91d8223a5e71f8a93fcf2d072299d13", RobustBitConfig.DEFAULT_VALUE) ? (SupportMapFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d91d8223a5e71f8a93fcf2d072299d13") : new SupportMapFragment();
    }

    @Deprecated
    public static SupportMapFragment newInstance(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d7afc05f05661a7f4dd4c914b6f85fd5", RobustBitConfig.DEFAULT_VALUE) ? (SupportMapFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d7afc05f05661a7f4dd4c914b6f85fd5") : newInstance(i, "", null);
    }

    @Deprecated
    public static SupportMapFragment newInstance(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2502521af536b54e675c04bbf244adb7", RobustBitConfig.DEFAULT_VALUE) ? (SupportMapFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2502521af536b54e675c04bbf244adb7") : newInstance(i, str, null);
    }
}
