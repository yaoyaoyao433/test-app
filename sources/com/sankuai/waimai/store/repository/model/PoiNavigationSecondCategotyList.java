package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiNavigationSecondCategotyList extends RestMenuResponse.NavigateItem {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2868789384825331329L;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String secondCategoryIcon;
    @SerializedName("id")
    public Long secondCategoryId;
    @SerializedName("name")
    public String secondCategoryName;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String secondCategoryScheme;
    @SerializedName("sequence")
    public String secondCategorySequence;

    @Override // com.sankuai.waimai.store.repository.model.RestMenuResponse.NavigateItem
    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a87bd8ab06ff99556b13c776d9cde7ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a87bd8ab06ff99556b13c776d9cde7ee");
            return;
        }
        this.secondCategoryId = Long.valueOf(jSONObject.optLong("id"));
        this.secondCategoryName = jSONObject.optString("name");
        this.secondCategoryIcon = jSONObject.optString(RemoteMessageConst.Notification.ICON);
        this.secondCategorySequence = jSONObject.optString("sequence");
        this.secondCategoryScheme = jSONObject.optString(NetLogConstants.Details.SCHEME);
    }
}
