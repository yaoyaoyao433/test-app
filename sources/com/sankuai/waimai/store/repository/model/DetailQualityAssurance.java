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
public class DetailQualityAssurance implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("label_details")
    public List<DialogItem> dialogItemList;
    @SerializedName("label_list")
    public List<LabelItem> labelList;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ba7391e3c318ff58b4b27fb260b3c6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ba7391e3c318ff58b4b27fb260b3c6c");
        } else if (jSONObject != null) {
            JSONArray optJSONArray = jSONObject.optJSONArray("label_list");
            if (optJSONArray != null) {
                this.labelList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    LabelItem labelItem = new LabelItem();
                    labelItem.parseJson(optJSONArray.optJSONObject(i));
                    this.labelList.add(labelItem);
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("label_details");
            if (optJSONArray2 != null) {
                this.dialogItemList = new ArrayList();
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    DialogItem dialogItem = new DialogItem();
                    dialogItem.parseJson(optJSONArray2.optJSONObject(i2));
                    this.dialogItemList.add(dialogItem);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class LabelItem implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String icon;
        @SerializedName("id")
        public String id;
        @SerializedName("label_name")
        public String labelName;

        public void parseJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12c70b276b0c718ea2326c48d73cc3f2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12c70b276b0c718ea2326c48d73cc3f2");
            } else if (jSONObject == null) {
            } else {
                this.id = jSONObject.optString("id");
                this.labelName = jSONObject.optString("label_name");
                this.icon = jSONObject.optString(RemoteMessageConst.Notification.ICON);
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class DialogItem implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String icon;
        @SerializedName("id")
        public String id;
        @SerializedName("label_details")
        public List<String> labelDescList;
        @SerializedName("label_name")
        public String labelName;

        public void parseJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42e282cfd4e8d80f7727f6f9efa41fa1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42e282cfd4e8d80f7727f6f9efa41fa1");
            } else if (jSONObject != null) {
                this.id = jSONObject.optString("id");
                this.labelName = jSONObject.optString("label_name");
                this.icon = jSONObject.optString(RemoteMessageConst.Notification.ICON);
                JSONArray optJSONArray = jSONObject.optJSONArray("label_details");
                if (optJSONArray != null) {
                    this.labelDescList = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        this.labelDescList.add(optJSONArray.optString(i));
                    }
                }
            }
        }
    }
}
