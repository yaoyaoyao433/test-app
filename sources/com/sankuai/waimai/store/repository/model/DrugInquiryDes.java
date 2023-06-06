package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class DrugInquiryDes implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("description")
    public String description;
    @SerializedName("image_height")
    public int imageHeight;
    @SerializedName("title_image")
    public String titleImage;
    @SerializedName("version")
    public int version;

    public boolean isValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b50f779b292ff7d4ae940b0756a0e281", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b50f779b292ff7d4ae940b0756a0e281")).booleanValue() : !TextUtils.isEmpty(this.description) || isImageValid();
    }

    public boolean isImageValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "464214ceac51d279ed8d12d0be730977", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "464214ceac51d279ed8d12d0be730977")).booleanValue() : URLUtil.isNetworkUrl(this.titleImage) && this.imageHeight > 0;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0f69fcbab98078e75620388877596f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0f69fcbab98078e75620388877596f8");
        } else if (jSONObject == null) {
        } else {
            this.titleImage = jSONObject.optString("title_image");
            this.imageHeight = jSONObject.optInt("image_height");
            this.description = jSONObject.optString("description");
            this.version = jSONObject.optInt("version");
        }
    }

    public boolean isDisplayInHeader() {
        return this.version == 2;
    }
}
