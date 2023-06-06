package com.sankuai.waimai.bussiness.order.confirm.pgablock.timeinsurance.rock;

import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public TimeInsuranceRockViewData a;

    public b(Map<String, Object> map) {
        try {
            this.a = (TimeInsuranceRockViewData) com.sankuai.waimai.bussiness.order.base.utils.b.a().fromJson(com.sankuai.waimai.bussiness.order.base.utils.b.a().toJson(map), (Class<Object>) TimeInsuranceRockViewData.class);
        } catch (Exception unused) {
        }
    }
}
