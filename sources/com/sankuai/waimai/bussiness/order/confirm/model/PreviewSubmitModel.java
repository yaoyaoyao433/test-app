package com.sankuai.waimai.bussiness.order.confirm.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PreviewSubmitModel implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("button_list")
    public ArrayList<ButtonItem> buttonItemArrayList;
    @SerializedName("content")
    public String content;
    @SerializedName("ext_param")
    public ExtraParam extraParam;
    @SerializedName("title")
    public String title;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class ExtraParam implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("medicareAlertCode")
        public String medicareAlertCode;
        @SerializedName("order_view_id")
        public String orderId;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public class ButtonItem implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("action")
        public int action;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String scheme;
        @SerializedName("text")
        public String text;

        public ButtonItem() {
        }
    }

    public boolean isValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "454a5ac355a68744ba1be5f6a89baebd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "454a5ac355a68744ba1be5f6a89baebd")).booleanValue() : (TextUtils.isEmpty(this.title) || TextUtils.isEmpty(this.content) || this.buttonItemArrayList == null || this.buttonItemArrayList.size() <= 0) ? false : true;
    }
}
