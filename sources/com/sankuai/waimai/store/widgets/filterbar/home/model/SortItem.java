package com.sankuai.waimai.store.widgets.filterbar.home.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SortItem implements Serializable {
    public static final int FILTER_POSITION_LIST = 1;
    public static final int FILTER_POSITOIN_BAR = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("all_code")
    public List<Long> allCode;
    @SerializedName("code")
    public long code;
    @SerializedName("icon_url")
    public String iconUrl;
    @SerializedName("icon_url_click")
    public String iconUrlClick;
    @SerializedName("name")
    public String name;
    @SerializedName("position")
    public int position;
    @SerializedName("short_name")
    public String shortName;
    @SerializedName("type")
    public int type;

    public SortItem() {
    }

    public SortItem(SortItem sortItem) {
        Object[] objArr = {sortItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2406203fccbb77076c2a40a8c0c465c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2406203fccbb77076c2a40a8c0c465c");
        } else if (sortItem != null) {
            this.code = sortItem.code;
            this.name = sortItem.name;
            this.shortName = sortItem.shortName;
            this.iconUrl = sortItem.iconUrl;
            this.iconUrlClick = sortItem.iconUrlClick;
            this.position = sortItem.position;
            this.allCode = sortItem.allCode;
        }
    }

    public static SortItem fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "219a0265684ddf7c344bac852d42eece", RobustBitConfig.DEFAULT_VALUE)) {
            return (SortItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "219a0265684ddf7c344bac852d42eece");
        }
        if (jSONObject == null) {
            return null;
        }
        SortItem sortItem = new SortItem();
        sortItem.code = jSONObject.optLong("code");
        sortItem.name = jSONObject.optString("name");
        sortItem.shortName = jSONObject.optString("short_name");
        sortItem.iconUrl = jSONObject.optString("icon_url");
        sortItem.iconUrlClick = jSONObject.optString("icon_url_click");
        sortItem.position = jSONObject.optInt("position");
        sortItem.type = jSONObject.optInt("type");
        return sortItem;
    }
}
