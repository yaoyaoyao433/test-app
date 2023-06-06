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
public class TextureMapView extends AbstractMapView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes4.dex */
    public interface OnMapTouchListener extends aa {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbstractMapView
    public int getMapRenderType() {
        return 1;
    }

    @Deprecated
    public TextureMapView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05ff76119b5c1a0abb3941dea8c5bee3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05ff76119b5c1a0abb3941dea8c5bee3");
        }
    }

    public TextureMapView(@NonNull Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19e01b773b5027de395d76a31affa669", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19e01b773b5027de395d76a31affa669");
        }
    }

    public TextureMapView(@NonNull Context context, int i, Platform platform) {
        super(context, i, platform);
        Object[] objArr = {context, Integer.valueOf(i), platform};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3de13a4f16a8cdb044ecf07cc9f54ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3de13a4f16a8cdb044ecf07cc9f54ef");
        }
    }

    public TextureMapView(@NonNull Context context, int i, Platform platform, String str) {
        super(context, i, platform, str);
        Object[] objArr = {context, Integer.valueOf(i), platform, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1716f9cfe99c6aa13a91585db1e1dcb7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1716f9cfe99c6aa13a91585db1e1dcb7");
        }
    }

    public TextureMapView(@NonNull Context context, int i, Platform platform, String str, String str2) {
        super(context, i, platform, str, str2);
        Object[] objArr = {context, Integer.valueOf(i), platform, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0db081bc00cf4594b18e6226c47d89b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0db081bc00cf4594b18e6226c47d89b");
        }
    }

    public TextureMapView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dcb2d96d0b45afcd4a3e47ea9c48e391", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dcb2d96d0b45afcd4a3e47ea9c48e391");
        }
    }

    public TextureMapView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6397aeb6dcad8e5c4f706d9ddb1ecb32", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6397aeb6dcad8e5c4f706d9ddb1ecb32");
        }
    }

    @Deprecated
    public void setOnMapTouchListener(OnMapTouchListener onMapTouchListener) {
        Object[] objArr = {onMapTouchListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08a23a3586758a90c424ba8f1a93d430", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08a23a3586758a90c424ba8f1a93d430");
        } else {
            super.setOnMapTouchListener((aa) onMapTouchListener);
        }
    }
}
