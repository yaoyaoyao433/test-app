package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class DrugB2CFilterTabInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1308529731650754786L;
    @SerializedName("code")
    public String code;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String icon;
    @SerializedName("search_filter_dot")
    public SGSearchFilterDot searchFilterDot;
    @SerializedName("text")
    public String text;
    @SerializedName("type")
    public int type;

    public String getTipContent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "881eeaedcf33b9ae75611c758b39fa3a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "881eeaedcf33b9ae75611c758b39fa3a") : (this.searchFilterDot == null || TextUtils.isEmpty(this.searchFilterDot.text)) ? "" : this.searchFilterDot.text;
    }
}
