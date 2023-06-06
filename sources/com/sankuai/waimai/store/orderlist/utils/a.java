package com.sankuai.waimai.store.orderlist.utils;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.ButtonItem;
import com.sankuai.waimai.business.order.api.model.Order;
import com.sankuai.waimai.store.router.i;
import com.sankuai.waimai.store.util.monitor.monitor.OrderListMonitor;
import com.sankuai.waimai.store.util.v;
import com.tencent.liteav.TXLiteAVCode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static List<ButtonItem> a(List<ButtonItem> list, @Nullable Order order) {
        Object[] objArr = {list, order};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6651f64007b1951384a35faec1e2a49", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6651f64007b1951384a35faec1e2a49");
        }
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            for (int i = 0; i < list.size(); i++) {
                ButtonItem buttonItem = list.get(i);
                if (buttonItem != null) {
                    switch (buttonItem.code) {
                        case 1001:
                        case 2001:
                        case 2004:
                        case 2005:
                        case 2010:
                        case 2012:
                        case 2013:
                        case 2014:
                        case TXLiteAVCode.EVT_VOD_PLAY_DNS_RESOLVED /* 2018 */:
                        case TXLiteAVCode.EVT_AUDIO_JITTER_STATE_LOADING /* 2024 */:
                        case 2042:
                        case 2050:
                        case 2054:
                        case 2055:
                        case 3108:
                            arrayList.add(buttonItem);
                            continue;
                        default:
                            Object[] objArr2 = {buttonItem, order};
                            ChangeQuickRedirect changeQuickRedirect2 = b.a;
                            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ef19d64afee67ac3b2d19ab5a746fc4f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ef19d64afee67ac3b2d19ab5a746fc4f");
                                break;
                            } else {
                                HashMap hashMap = new HashMap();
                                if (order != null) {
                                    hashMap.put("order_id", Long.valueOf(order.getOrderId()));
                                    hashMap.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(order.getPoiIdStr(), order.getPoiId()));
                                }
                                if (buttonItem != null) {
                                    hashMap.put("button_code", Integer.valueOf(buttonItem.code));
                                    hashMap.put("button_title", buttonItem.title);
                                    hashMap.put("button_clickUrl", buttonItem.clickUrl);
                                }
                                OrderListMonitor orderListMonitor = OrderListMonitor.ButtonException;
                                com.sankuai.waimai.store.util.monitor.c.a(orderListMonitor, buttonItem.title + " is not within the client's scope", hashMap.toString());
                                continue;
                            }
                    }
                }
            }
        }
        return arrayList;
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f7baaa8021f1956b75a6f0eb7a7afb9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f7baaa8021f1956b75a6f0eb7a7afb9") : (String) v.a(new v.b<String>() { // from class: com.sankuai.waimai.store.orderlist.utils.a.1
            @Override // com.sankuai.waimai.store.util.v.b
            public final /* bridge */ /* synthetic */ String a() {
                return "dianping://waimai.dianping.com";
            }

            @Override // com.sankuai.waimai.store.util.v.b
            public final /* bridge */ /* synthetic */ String b() {
                return com.sankuai.waimai.foundation.router.interfaces.b.c;
            }

            @Override // com.sankuai.waimai.store.util.v.b
            public final /* bridge */ /* synthetic */ String c() {
                return i.a;
            }

            @Override // com.sankuai.waimai.store.util.v.b
            public final /* bridge */ /* synthetic */ String d() {
                return i.a;
            }
        });
    }

    public static boolean a(ButtonItem buttonItem) {
        Object[] objArr = {buttonItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d70be7cdf0839c5c8af20b9b0861ce62", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d70be7cdf0839c5c8af20b9b0861ce62")).booleanValue() : buttonItem != null && (buttonItem.code == 2055 || buttonItem.code == 2054);
    }

    public static String a(ButtonItem buttonItem, Context context) {
        Object[] objArr = {buttonItem, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42cd8ec82c1fef172a834dd006629473", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42cd8ec82c1fef172a834dd006629473");
        }
        if (buttonItem == null || context == null) {
            return "";
        }
        if (buttonItem.code == 2055) {
            return context.getString(R.string.wm_sg_poi_have_subscribe);
        }
        return buttonItem.code == 2054 ? context.getString(R.string.wm_sg_poi_can_subscribe) : "";
    }
}
