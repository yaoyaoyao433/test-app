package com.sankuai.meituan.mapsdk.maps;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.interfaces.aa;
import com.sankuai.meituan.mapsdk.maps.model.Platform;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MapView extends AbstractMapView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes4.dex */
    public interface OnMapTouchListener extends aa {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbstractMapView
    public int getMapRenderType() {
        return 0;
    }

    @Deprecated
    public MapView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2a89112e776214207e62a158194de9a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2a89112e776214207e62a158194de9a");
        }
    }

    public MapView(@NonNull Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91ec6e7bac73556bc2f5134954acd9a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91ec6e7bac73556bc2f5134954acd9a2");
        }
    }

    public MapView(@NonNull Context context, int i, Platform platform) {
        super(context, i, platform);
        Object[] objArr = {context, Integer.valueOf(i), platform};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b536ed53b67f406030464de6374715f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b536ed53b67f406030464de6374715f");
        }
    }

    public MapView(@NonNull Context context, int i, Platform platform, String str) {
        super(context, i, platform, str);
        Object[] objArr = {context, Integer.valueOf(i), platform, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fa206e0c45fa35813b04253cee32348", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fa206e0c45fa35813b04253cee32348");
        }
    }

    public MapView(@NonNull Context context, int i, Platform platform, String str, String str2) {
        super(context, i, platform, str, str2);
        Object[] objArr = {context, Integer.valueOf(i), platform, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b873bf7f31688c9027e34f87501f2457", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b873bf7f31688c9027e34f87501f2457");
        }
    }

    public MapView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7099ae5d895caa73ebde0efb8e9b2ef4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7099ae5d895caa73ebde0efb8e9b2ef4");
        }
    }

    public MapView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3615ba2f2094cd0160a23135f8d93b2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3615ba2f2094cd0160a23135f8d93b2d");
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbstractMapView
    public void setOnMapTouchListener(aa aaVar) {
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad67886edaa7f60fe33a11db29b811e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad67886edaa7f60fe33a11db29b811e4");
        } else {
            super.setOnMapTouchListener(aaVar);
        }
    }

    @Deprecated
    public void setOnMapTouchListener(OnMapTouchListener onMapTouchListener) {
        Object[] objArr = {onMapTouchListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efa8a2fcdcaac8662905595dba837cce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efa8a2fcdcaac8662905595dba837cce");
        } else {
            setOnMapTouchListener((aa) onMapTouchListener);
        }
    }
}
