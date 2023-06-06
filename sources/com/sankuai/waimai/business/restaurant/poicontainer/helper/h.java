package com.sankuai.waimai.business.restaurant.poicontainer.helper;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context, Poi poi) {
        Object[] objArr = {context, poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "badbb61d22c9044e0c45b5a79face18a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "badbb61d22c9044e0c45b5a79face18a")).booleanValue();
        }
        if (poi == null || TextUtils.isEmpty(poi.getPoiTabStoryIcon())) {
            return false;
        }
        Set<String> a2 = com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "key_poi_story_icon", (Set<String>) null);
        return a2 == null || !a2.contains(poi.getPoiIDStr());
    }
}
