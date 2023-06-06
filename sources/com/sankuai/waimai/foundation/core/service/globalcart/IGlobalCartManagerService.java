package com.sankuai.waimai.foundation.core.service.globalcart;

import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IGlobalCartManagerService {
    public static final String KEY = "IGlobalCartManagerService";

    int getGlobalCartPoiIds();

    List<? extends List<?>> getInnerList();

    int getOrderedNum(String str);

    void registerOrderManager(b bVar);

    void setDataChange();
}
