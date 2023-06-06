package com.sankuai.waimai.business.order.submit.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class BottomModelInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1;
    @SerializedName("order_activity_instructions")
    public String orderActivityInstructions;
    @SerializedName("scheme_tips")
    public a[] schemeTips;
    @SerializedName("style")
    public int style;
    @SerializedName("submit_tip_info")
    public String submitTipInfo;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a {
        @SerializedName("tip")
        public String a;
    }

    public boolean isShowSubmitTips() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b916e2d270b406654044d37cbf62e71", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b916e2d270b406654044d37cbf62e71")).booleanValue() : !TextUtils.isEmpty(this.submitTipInfo);
    }

    public static BottomModelInfo create(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fdf602ebe8f08650f217aa2665a6f013", RobustBitConfig.DEFAULT_VALUE)) {
            return (BottomModelInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fdf602ebe8f08650f217aa2665a6f013");
        }
        BottomModelInfo bottomModelInfo = new BottomModelInfo();
        if (jSONObject == null) {
            return bottomModelInfo;
        }
        bottomModelInfo.submitTipInfo = jSONObject.optString("submit_tip_info");
        bottomModelInfo.orderActivityInstructions = jSONObject.optString("order_activity_instructions");
        return bottomModelInfo;
    }
}
