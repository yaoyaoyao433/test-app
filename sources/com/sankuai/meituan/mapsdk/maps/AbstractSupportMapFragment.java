package com.sankuai.meituan.mapsdk.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.MapViewOptions;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class AbstractSupportMapFragment extends Fragment {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected int a;
    protected String b;
    protected MapViewOptions c;

    public AbstractSupportMapFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e6e55c7b38cd02d4acb328bb8b99265", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e6e55c7b38cd02d4acb328bb8b99265");
            return;
        }
        this.a = -1;
        this.b = "";
    }

    @Override // android.support.v4.app.Fragment
    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        Object[] objArr = {context, attributeSet, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d37892ca40cee9d8a9860321c5124d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d37892ca40cee9d8a9860321c5124d5");
            return;
        }
        super.onInflate(context, attributeSet, bundle);
        Object[] objArr2 = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d4d815c78d7014ca9f70d6a06a09c232", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d4d815c78d7014ca9f70d6a06a09c232");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.mtMapType, R.attr.mapsdk_key});
        this.a = obtainStyledAttributes.getInt(0, -1);
        this.b = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17cc99a141acba147e22b92c5bcba677", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17cc99a141acba147e22b92c5bcba677");
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.a = arguments.getInt("key_map_type", -1);
            this.b = arguments.getString("key_map_key", "");
            this.c = (MapViewOptions) f.a(arguments, "key_mapview_options");
        }
    }

    public static Bundle createMapBundle(int i, String str, MapViewOptions mapViewOptions) {
        Object[] objArr = {Integer.valueOf(i), str, mapViewOptions};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1c220f89a154683c0db0196626fd308b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1c220f89a154683c0db0196626fd308b");
        }
        Bundle bundle = new Bundle();
        bundle.putInt("key_map_type", i);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("key_map_key", str);
        } else {
            bundle.putString("key_map_key", "");
        }
        if (mapViewOptions != null) {
            bundle.putSerializable("key_mapview_options", mapViewOptions);
        }
        return bundle;
    }
}
