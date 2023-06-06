package com.sankuai.waimai.platform.widget.tag;

import android.support.annotation.DrawableRes;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final Map<String, Integer> b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put("wm_poi_coupon_bg_icon", Integer.valueOf((int) R.drawable.wm_common_tag_coupon_bg_owned));
        b.put("wm_nox_search_intelligent_tag_rank", Integer.valueOf((int) R.drawable.wm_nox_search_intelligent_tag_rank));
        b.put("wm_nox_search_intelligent_tag_like", Integer.valueOf((int) R.drawable.wm_nox_search_intelligent_tag_like));
        b.put("wm_nox_search_intelligent_tag_comment", Integer.valueOf((int) R.drawable.wm_nox_search_intelligent_tag_comment));
    }

    @DrawableRes
    public static Integer a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1238c3722845d5664b21c5a9beb30a7f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1238c3722845d5664b21c5a9beb30a7f");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Integer num = b.get(str);
        return Integer.valueOf(num != null ? num.intValue() : 0);
    }
}
