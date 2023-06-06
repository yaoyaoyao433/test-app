package com.meituan.android.common.weaver.impl.map;

import android.view.View;
import com.meituan.android.common.weaver.impl.natives.INativeEnd;
import com.meituan.android.common.weaver.impl.natives.matchers.AbstractViewMatcher;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.mapsdk.maps.AbstractMapView;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MapViewMatcher extends AbstractViewMatcher {
    public static ChangeQuickRedirect changeQuickRedirect;

    public MapViewMatcher(INativeEnd iNativeEnd) {
        Object[] objArr = {iNativeEnd};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d628946919ffb9236a86e1ed74afb140", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d628946919ffb9236a86e1ed74afb140");
        }
    }

    @Override // com.meituan.android.common.weaver.impl.natives.matchers.AbstractViewMatcher
    public boolean match(View view) {
        return view instanceof AbstractMapView;
    }
}
