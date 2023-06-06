package com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.DeliveryInfo;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private String b;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a8271ea896255c5528009099af6f160", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a8271ea896255c5528009099af6f160");
        } else {
            this.b = "";
        }
    }

    public final void a(DeliveryInfo deliveryInfo) {
        Object[] objArr = {deliveryInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42440c8118379b447991f3924a0f6949", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42440c8118379b447991f3924a0f6949");
            return;
        }
        if (deliveryInfo.isAssignDeliveryTime == 2 && deliveryInfo.stageShippingInfo != null) {
            if (!com.sankuai.waimai.foundation.utils.b.b(deliveryInfo.stageShippingInfo.c)) {
                Iterator<com.sankuai.waimai.bussiness.order.confirm.model.e> it = deliveryInfo.stageShippingInfo.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.sankuai.waimai.bussiness.order.confirm.model.e next = it.next();
                    if (next.f == 1) {
                        this.b = next.h;
                        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.a("sg_chosenTime", Integer.valueOf(next.g));
                        break;
                    }
                }
            }
            if (TextUtils.isEmpty(this.b) && deliveryInfo.stageShippingInfo.d != null) {
                com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.a("sg_chosenTime", Integer.valueOf(deliveryInfo.stageShippingInfo.d.g));
            }
        }
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(true, false, "stage_shipping_callback_info", this.b);
    }
}
