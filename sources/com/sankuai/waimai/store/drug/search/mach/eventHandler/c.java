package com.sankuai.waimai.store.drug.search.mach.eventHandler;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements Mach.d {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.search.ui.result.b b;

    public c(com.sankuai.waimai.store.search.ui.result.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01802f70787da37599b599f14b48150c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01802f70787da37599b599f14b48150c");
        } else {
            this.b = bVar;
        }
    }

    @Override // com.sankuai.waimai.mach.Mach.d
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2baf14f6e181284fae43a6bf2da199e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2baf14f6e181284fae43a6bf2da199e0");
        } else if (map == null || !TextUtils.equals(str, "drug_search_o2o_noresult_recommend_more")) {
        } else {
            Object obj = map.get(SearchIntents.EXTRA_QUERY);
            if (!(obj instanceof String) || this.b == null) {
                return;
            }
            this.b.a((String) obj, "_search_rec_product_click_more");
        }
    }
}
