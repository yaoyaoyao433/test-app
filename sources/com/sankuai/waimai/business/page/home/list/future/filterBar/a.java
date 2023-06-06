package com.sankuai.waimai.business.page.home.list.future.filterBar;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.BubbleHistory;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BubbleHistory a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3d15fa320a0e6554cf36fbd6de82b2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (BubbleHistory) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3d15fa320a0e6554cf36fbd6de82b2c");
        }
        String b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, "filter_bar_bubble_history_list", "");
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(b);
            int length = jSONArray.length();
            if (length > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                com.sankuai.waimai.platform.widget.filterbar.implement.converter.a aVar = new com.sankuai.waimai.platform.widget.filterbar.implement.converter.a();
                for (int i2 = 0; i2 < length; i2++) {
                    BubbleHistory a2 = aVar.a(com.sankuai.waimai.platform.widget.filterbar.implement.model.a.a(jSONArray.optJSONObject(i2)));
                    if (a2 != null && a2.a() && currentTimeMillis - a2.e <= 2592000000L && a2.a(6, str, i)) {
                        return a2;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
