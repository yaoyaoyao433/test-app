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
public final class ProductIMMessageBean extends IMMessageBaseBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String couponPrice;
    public String originPrice;
    public String pic;
    public String poiId;
    public String price;
    public String productId;
    public String productName;
    public int status;
    public List<String> tagList;

    public ProductIMMessageBean() {
        super(null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c41c15b320fec0b889ed8520afe3e4d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c41c15b320fec0b889ed8520afe3e4d");
        }
    }

    public ProductIMMessageBean(Map<String, Object> map) {
        super(map);
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbf062c5e2bd3aa95342c1d2431b6748", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbf062c5e2bd3aa95342c1d2431b6748");
        }
    }

    @Override // com.meituan.android.ptcommonim.protocol.message.IMMessageBaseBean
    public final Map<String, Object> getSubMessageBeanMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b6337a9ed52f43bb762cea694104229", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b6337a9ed52f43bb762cea694104229");
        }
        try {
            return (Map) JsonHelper.fromJsonString(JsonHelper.toJsonString(this), Map.class);
        } catch (Throwable unused) {
            return new HashMap();
        }
    }
}
