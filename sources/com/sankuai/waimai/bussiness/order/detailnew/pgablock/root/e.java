package com.sankuai.waimai.bussiness.order.detailnew.pgablock.root;

import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.l;
import com.sankuai.waimai.bussiness.order.rocks.OrderRocksServerModel;
import com.sankuai.waimai.foundation.utils.r;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public double b;
    public long c;
    public String d;
    public l e;
    public Bundle f;

    public static e a(OrderRocksServerModel orderRocksServerModel) {
        Object[] objArr = {orderRocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e43ffed728c211ddb0e6bd5d26824611", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e43ffed728c211ddb0e6bd5d26824611");
        }
        e eVar = new e();
        StringBuilder sb = new StringBuilder();
        sb.append(orderRocksServerModel.g.get("actual_pay_total"));
        eVar.b = r.a(sb.toString(), 0.0d);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(orderRocksServerModel.g.get("order_time"));
        eVar.c = r.a(sb2.toString(), 0L);
        Object obj = orderRocksServerModel.a("wm_order_status_operatearea_buttonlist").get("order_remind_info");
        if (obj != null) {
            eVar.e = (l) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(obj), (Class<Object>) l.class);
        }
        eVar.d = a((List) orderRocksServerModel.g.get("foodlist"));
        eVar.f = com.sankuai.waimai.bussiness.order.detailnew.im.a.a(orderRocksServerModel.c, eVar);
        return eVar;
    }

    private static String a(List<Map<String, Object>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b14b9d565e9e9dbee30ec3484f0e08cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b14b9d565e9e9dbee30ec3484f0e08cf");
        }
        String str = "";
        if (list == null) {
            return "";
        }
        int i = 0;
        for (Map<String, Object> map : list) {
            if (map != null) {
                String valueOf = String.valueOf(map.get("name"));
                if (!TextUtils.isEmpty(valueOf)) {
                    i++;
                    if (TextUtils.isEmpty(str)) {
                        str = valueOf;
                    }
                    if (i > 1) {
                        str = str + com.meituan.android.singleton.b.a.getString(R.string.wm_order_list_order_count_desc, Integer.valueOf(i));
                    }
                }
            }
        }
        return str;
    }
}
