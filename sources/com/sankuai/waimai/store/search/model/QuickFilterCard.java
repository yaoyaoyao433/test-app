package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public final class QuickFilterCard implements com.sankuai.waimai.store.search.ui.result.controller.quickfilter.a, Serializable {
    public static final int QUICK_FILTER_DEFAULT = 0;
    public static final int QUICK_FILTER_DROPDOWN = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("quick_filter_item_list")
    public List<GuidedItem> filterList;
    public transient boolean isExposed;

    public QuickFilterCard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ac374f2bfd7eff377602bb02823012a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ac374f2bfd7eff377602bb02823012a");
        } else {
            this.isExposed = false;
        }
    }

    public final String buildFilterType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdbf634fdb383f571ee287b7c4a41d51", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdbf634fdb383f571ee287b7c4a41d51");
        }
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) this.filterList)) {
            StringBuilder sb = new StringBuilder();
            int c = com.sankuai.shangou.stone.util.a.c(this.filterList);
            for (int i = 0; i < c; i++) {
                GuidedItem guidedItem = (GuidedItem) com.sankuai.shangou.stone.util.a.a((List<Object>) this.filterList, i);
                if (guidedItem != null) {
                    sb.append(guidedItem.code);
                    if (i < c - 1) {
                        sb.append(CommonConstant.Symbol.COMMA);
                    }
                }
            }
            return sb.toString();
        }
        return "";
    }
}
