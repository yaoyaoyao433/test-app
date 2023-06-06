package com.sankuai.meituan.mapsdk.maps;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.mapsdk.maps.model.Platform;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MapRenderLayer extends AbstractMapView {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.meituan.mapsdk.maps.AbstractMapView
    public int getMapRenderType() {
        return 2;
    }

    public MapRenderLayer(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "151e18dc343a7a41d0c2c09f90445edb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "151e18dc343a7a41d0c2c09f90445edb");
        }
    }

    public MapRenderLayer(@NonNull Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8ac31e7adef242eb06d2573772fa645", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8ac31e7adef242eb06d2573772fa645");
        }
    }

    public MapRenderLayer(@NonNull Context context, int i, Platform platform) {
        super(context, i, platform);
        Object[] objArr = {context, Integer.valueOf(i), platform};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c956e17dd66f38aebb26bfd53cd3f79f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c956e17dd66f38aebb26bfd53cd3f79f");
        }
    }

    public MapRenderLayer(@NonNull Context context, int i, Platform platform, String str) {
        super(context, i, platform, str);
        Object[] objArr = {context, Integer.valueOf(i), platform, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f70df09b0526ef9a5de3f33808f0686c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f70df09b0526ef9a5de3f33808f0686c");
        }
    }

    public MapRenderLayer(@NonNull Context context, int i, Platform platform, String str, String str2) {
        super(context, i, platform, str, str2);
        Object[] objArr = {context, Integer.valueOf(i), platform, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "747fb4ebef5abd6bc923e2160efd99c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "747fb4ebef5abd6bc923e2160efd99c5");
        }
    }

    public MapRenderLayer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49a382e9601cf4142c5b1f4dae4815fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49a382e9601cf4142c5b1f4dae4815fe");
        }
    }

    public MapRenderLayer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5beccefc80eebed890f4db7bf398612", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5beccefc80eebed890f4db7bf398612");
        }
    }
}
