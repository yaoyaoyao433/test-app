package com.sankuai.waimai.store.search.ui.result.mach;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.widget.RecyclerView;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MachFeedStatisticsBroadcastReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect a;
    private SearchShareData b;

    public MachFeedStatisticsBroadcastReceiver(SearchShareData searchShareData) {
        Object[] objArr = {searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f090d63e98c50b06bb48a4ae1d906a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f090d63e98c50b06bb48a4ae1d906a7");
        } else {
            this.b = searchShareData;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Map<String, Object> attrs;
        int i = 0;
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebbaca208c1cbda70e70712b1a72d3f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebbaca208c1cbda70e70712b1a72d3f4");
        } else if ("feed-mach-similar-product".equals(intent.getAction())) {
            com.sankuai.waimai.mach.node.a aVar = (com.sankuai.waimai.mach.node.a) com.sankuai.waimai.platform.utils.f.c(intent, RemoteMessageConst.NOTIFICATION);
            Object[] objArr2 = {context, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8230cc926b2af7dbccef2da9b5706a96", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8230cc926b2af7dbccef2da9b5706a96");
            } else if (aVar == null || (attrs = aVar.g.getAttrs()) == null || attrs.isEmpty()) {
            } else {
                String str = "feed-similar-product-" + attrs.get("fold-spu-id") + CommonConstant.Symbol.MINUS + attrs.get("similar-spu-id");
                if (h.a(str)) {
                    return;
                }
                h.b(str);
                if ((aVar.e.g() instanceof RecyclerView) && ((RecyclerView) aVar.e.g()).computeHorizontalScrollOffset() != 0) {
                    i = 1;
                }
                Object b = aVar.c().b("mach_extra_key_index");
                HashMap hashMap = new HashMap();
                hashMap.put("poi_id", attrs.get("poi-id"));
                hashMap.put("search_log_id", this.b.q);
                hashMap.put("stid", com.sankuai.waimai.store.search.statistics.g.f(this.b));
                hashMap.put("sc_spu_id", attrs.get("fold-spu-id"));
                hashMap.put("keyword", this.b.h);
                hashMap.put("spu_id", attrs.get("similar-spu-id"));
                hashMap.put("template_type", Integer.valueOf(this.b.D));
                hashMap.put("slide_state", Integer.valueOf(i));
                hashMap.put("index", attrs.get("similar-index"));
                hashMap.put("cat_id", Integer.valueOf(this.b.z));
                hashMap.put("is_filter_result", com.sankuai.waimai.store.search.statistics.g.b(this.b));
                hashMap.put("is_filter_sec_result", com.sankuai.waimai.store.search.statistics.g.e(this.b));
                hashMap.put("rank_type", Long.valueOf(com.sankuai.waimai.store.search.statistics.g.c(this.b)));
                hashMap.put("filter_type", com.sankuai.waimai.store.search.statistics.g.d(this.b));
                hashMap.put("search_source", Integer.valueOf(this.b.aw));
                if (b instanceof Integer) {
                    hashMap.put("sc_spu_index", Integer.valueOf(((Integer) b).intValue()));
                }
                com.sankuai.waimai.store.manager.judas.b.b(context, "b_waimai_lcv0gopk_mv").b(hashMap).a();
            }
        }
    }

    public static IntentFilter a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c23db9e64ef7a2e1452165ff272ec50", RobustBitConfig.DEFAULT_VALUE) ? (IntentFilter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c23db9e64ef7a2e1452165ff272ec50") : new IntentFilter("feed-mach-similar-product");
    }
}
