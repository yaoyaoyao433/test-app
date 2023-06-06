package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
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
public class DrugQAInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("question_list")
    public List<QuestionAndAnswer> QAs;
    @SerializedName("button_text")
    public String buttonText;
    @SerializedName("drug_generic_name")
    public String drugGenericName;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("title")
    public String title;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class DoctorInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("doctor_head_icon")
        public String doctorHeadIcon;
        @SerializedName("doctor_jobtitle")
        public String doctorJobTitle;
        @SerializedName("doctor_name")
        public String doctorName;
        @SerializedName("hospital_level")
        public String hospitalLevel;
        @SerializedName("hospital_name")
        public String hospitalName;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "598d1e836eabf96e5aa5e93c14290f36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "598d1e836eabf96e5aa5e93c14290f36");
        } else if (jSONObject != null) {
            this.title = jSONObject.optString("title");
            this.buttonText = jSONObject.optString("button_text");
            this.scheme = jSONObject.optString(NetLogConstants.Details.SCHEME);
            this.drugGenericName = jSONObject.optString("drug_generic_name");
            JSONArray optJSONArray = jSONObject.optJSONArray("question_list");
            if (optJSONArray != null) {
                this.QAs = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    QuestionAndAnswer questionAndAnswer = new QuestionAndAnswer();
                    questionAndAnswer.parseJson(optJSONArray.optJSONObject(i));
                    this.QAs.add(questionAndAnswer);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class QuestionAndAnswer implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("answer")
        public String answer;
        @SerializedName("doctor_info")
        public DoctorInfo doctorInfo;
        @SerializedName("like_count")
        public int numberOfApprove;
        @SerializedName("question")
        public String question;
        @SerializedName("question_id")
        public String questionId;
        @SerializedName("like_status")
        public int statusOfApprove;

        public void parseJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7849e5ea902db8de8d970e2fb6307e41", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7849e5ea902db8de8d970e2fb6307e41");
                return;
            }
            this.questionId = jSONObject.optString("question_id");
            this.question = jSONObject.optString("question");
            this.answer = jSONObject.optString("answer");
            this.numberOfApprove = jSONObject.optInt("like_count");
            this.statusOfApprove = jSONObject.optInt("like_status");
            this.doctorInfo = (DoctorInfo) com.sankuai.waimai.store.util.i.a(jSONObject.optString("doctor_info"), DoctorInfo.class);
        }
    }
}
