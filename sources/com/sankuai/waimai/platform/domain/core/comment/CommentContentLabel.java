package com.sankuai.waimai.platform.domain.core.comment;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CommentContentLabel implements Serializable {
    public static final int LABEL_TYPE_NEGATIVE = 2;
    public static final int LABEL_TYPE_POSITIVE = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("content")
    public String content;
    @SerializedName("label_type")
    public int labelType;

    public static ArrayList<CommentContentLabel> formJsonArray(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0fa2fa5970d821a321691627ee260500", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0fa2fa5970d821a321691627ee260500");
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList<CommentContentLabel> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            CommentContentLabel fromJson = fromJson(jSONArray.optJSONObject(i));
            if (fromJson != null) {
                arrayList.add(fromJson);
            }
        }
        return arrayList;
    }

    private static CommentContentLabel fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e2b30cfc2db3ba952ce814802b839fb9", RobustBitConfig.DEFAULT_VALUE)) {
            return (CommentContentLabel) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e2b30cfc2db3ba952ce814802b839fb9");
        }
        if (jSONObject != null) {
            CommentContentLabel commentContentLabel = new CommentContentLabel();
            commentContentLabel.content = jSONObject.optString("content");
            commentContentLabel.labelType = jSONObject.optInt("label_type");
            return commentContentLabel;
        }
        return null;
    }
}
