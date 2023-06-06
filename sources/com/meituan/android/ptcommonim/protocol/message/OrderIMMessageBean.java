package com.meituan.android.ptcommonim.protocol.message;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public final class OrderIMMessageBean extends IMMessageBaseBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int count;
    public String orderId;
    public long orderTime;
    public String pic;
    public String poiId;
    public String productId;
    public List<OrderDetailData> productList;
    public String productName;
    public String statusDesc;
    public String totalAmount;
    public String unit;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static final class OrderDetailData {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int count;
        public String imgUrl;
        public String productId;
        public String productName;
        public String subId;
        public String subTitle;
    }

    public OrderIMMessageBean() {
        this(null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "277ee0667fc0e06925725137efae269d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "277ee0667fc0e06925725137efae269d");
        }
    }

    public OrderIMMessageBean(Map<String, Object> map) {
        super(map);
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0967e49779ef71769176991bfdac83c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0967e49779ef71769176991bfdac83c");
        }
    }

    @Override // com.meituan.android.ptcommonim.protocol.message.IMMessageBaseBean
    public final Map<String, Object> getSubMessageBeanMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37ef8fcfc5142292d3ae864d03b8da96", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37ef8fcfc5142292d3ae864d03b8da96");
        }
        try {
            return (Map) JsonHelper.fromJsonString(JsonHelper.toJsonString(this), Map.class);
        } catch (Throwable unused) {
            return new HashMap();
        }
    }
}
