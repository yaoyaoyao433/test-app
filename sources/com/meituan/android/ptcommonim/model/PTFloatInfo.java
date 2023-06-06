package com.meituan.android.ptcommonim.model;

import android.support.annotation.Keep;
import com.meituan.android.ptcommonim.cardrender.model.MachInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class PTFloatInfo {
    public static final String TMP_TYPE_ORDER = "tmp_order_floating";
    public static final String TMP_TYPE_PRODUCT = "tmp_product_floating";
    public static final String TYPE_ORDER = "order";
    public static final String TYPE_PRODUCT = "product";
    public static ChangeQuickRedirect changeQuickRedirect;
    public Map<String, Object> detailInfo;
    public List<TemplateInfo> templateInfoList;
    public String type;

    public MachInfo getMachInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06fb625ecf055c58e389ccb8e49afa7f", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06fb625ecf055c58e389ccb8e49afa7f");
        }
        if ("order".equals(this.type)) {
            return TemplateInfo.getModuleMachInfo(this.templateInfoList, TMP_TYPE_ORDER);
        }
        if (TYPE_PRODUCT.equals(this.type)) {
            return TemplateInfo.getModuleMachInfo(this.templateInfoList, TMP_TYPE_PRODUCT);
        }
        return null;
    }
}
