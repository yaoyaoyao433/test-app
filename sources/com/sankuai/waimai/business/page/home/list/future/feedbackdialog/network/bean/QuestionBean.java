package com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class QuestionBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("q_ans")
    public List<Answer> answers;
    @SerializedName("index")
    public int index;
    @SerializedName("poi_id")
    public long poi_id;
    @SerializedName("q_shading")
    public String q_shading;
    @SerializedName("q_key")
    public long questionId;
    @SerializedName("q_title")
    public String questionTitle;
    @SerializedName("q_type")
    public int questionType;
    @SerializedName("q_poi_num")
    public String question_extra_poi_num;
    @SerializedName("ans_require")
    public boolean requiredField;
    @SerializedName("spu_id")
    public long spu_id;

    public Map<String, Answer> getMapAnswers() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d505f91f0eb3079505e75aeadc604c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d505f91f0eb3079505e75aeadc604c7");
        }
        if (this.answers == null || this.answers.size() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < this.answers.size(); i++) {
            Answer answer = this.answers.get(i);
            if (answer != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                hashMap.put(sb.toString(), answer);
            }
        }
        return hashMap;
    }
}
