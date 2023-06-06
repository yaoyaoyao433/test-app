package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class DrugDetailModelItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("content")
    public String content;
    public boolean expand;
    @SerializedName("extra_list")
    public List<DrugInstructions> extraList;
    @SerializedName("fold")
    public boolean fold;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String icon;
    @SerializedName("title")
    public String title;

    public DrugDetailModelItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "479d4ec11d8adcb5045e11b415d20ad8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "479d4ec11d8adcb5045e11b415d20ad8");
        } else {
            this.expand = false;
        }
    }

    public boolean isFoldEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fd0d1a629ffe75b61ad95ceec1ce570", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fd0d1a629ffe75b61ad95ceec1ce570")).booleanValue() : this.fold && com.sankuai.shangou.stone.util.a.a((List) this.extraList) > 3;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fbf7a5d45e0cdfbf0f5c57d3513b8fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fbf7a5d45e0cdfbf0f5c57d3513b8fd");
        } else if (jSONObject != null) {
            this.title = jSONObject.optString("title");
            this.content = jSONObject.optString("content");
            this.icon = jSONObject.optString(RemoteMessageConst.Notification.ICON);
            this.fold = jSONObject.optBoolean("fold");
            JSONArray optJSONArray = jSONObject.optJSONArray("extra_list");
            if (optJSONArray != null) {
                this.extraList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    DrugInstructions drugInstructions = new DrugInstructions();
                    drugInstructions.parseJson(optJSONArray.optJSONObject(i));
                    this.extraList.add(drugInstructions);
                }
            }
        }
    }
}
