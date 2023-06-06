package com.sankuai.waimai.platform.domain.core.comment;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.aidata.feature.persona.PersonaTable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CommentLabel implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("content")
    public String content;
    public boolean isSelected;
    @SerializedName("label_count")
    public int labelCount;
    @SerializedName(PersonaTable.LABEL_ID)
    public long labelId;
    @SerializedName("label_star")
    public int labelStar;
    @SerializedName("label_type")
    public int labelType;

    public CommentLabel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "560d0a11fe88e237e36531127b56bf00", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "560d0a11fe88e237e36531127b56bf00");
        } else {
            this.isSelected = false;
        }
    }

    public CommentLabel parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c02b98738b51cfcb04adf7041b879263", RobustBitConfig.DEFAULT_VALUE)) {
            return (CommentLabel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c02b98738b51cfcb04adf7041b879263");
        }
        this.labelId = jSONObject.optLong(PersonaTable.LABEL_ID);
        this.labelStar = jSONObject.optInt("label_star");
        this.content = jSONObject.optString("content");
        this.labelCount = jSONObject.optInt("label_count");
        this.labelType = jSONObject.optInt("label_type");
        return this;
    }

    public boolean isGoodTag() {
        return this.labelStar == 4 || this.labelStar == 5;
    }
}
