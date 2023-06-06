package com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.bean;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class SubmitQuestionBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("answer")
    public String answer;
    @SerializedName("answerOtherValue")
    public String answerOtherValue;
    @SerializedName("answerValue")
    public JsonArray answerValue;
    @SerializedName("q_ans")
    public List<Answer> answers;
    @SerializedName("dataMap")
    public Map<String, Answer> dataMap;
    @SerializedName("entrance_question_type")
    public int entrance_question_type;
    @SerializedName("poi_id")
    public String poi_id;
    @SerializedName("q_ans_id")
    public String q_ans_id;
    @SerializedName("q_ans_value")
    public String q_ans_value;
    @SerializedName("questionId")
    public long question_id;
    @SerializedName("questionText")
    public String question_name;
    @SerializedName("questionType")
    public int question_type;
    @SerializedName("required_field")
    public boolean required_field;
    @SerializedName("spu_id")
    public String spu_id;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class AnswerOtherValue {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("poi_id")
        public String poi_id;
        @SerializedName("spu_id")
        public String spu_id;
    }

    public void handleAnswerOtherValue(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9288fd6be6209b947819b3a5eb5718e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9288fd6be6209b947819b3a5eb5718e");
        } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            AnswerOtherValue answerOtherValue = new AnswerOtherValue();
            answerOtherValue.poi_id = str;
            answerOtherValue.spu_id = str2;
            this.answerOtherValue = new Gson().toJson(answerOtherValue);
        } else {
            this.answerOtherValue = "";
        }
    }

    public void mapToAnswer(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "680b36daab69b0c649e5afce31831ff0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "680b36daab69b0c649e5afce31831ff0");
        } else if (map != null && map.size() > 0) {
            this.answer = new Gson().toJson(map);
        } else {
            this.answer = "";
        }
    }

    public Map<String, String> answerToMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56ac6c70aa329ddd1ae767e129dde13f", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56ac6c70aa329ddd1ae767e129dde13f") : strToMap(this.answer);
    }

    public Map<String, String> strToMap(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95643b5451a464082d899448b4b9221e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95643b5451a464082d899448b4b9221e");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) new Gson().fromJson(str, new TypeToken<HashMap<String, String>>() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.bean.SubmitQuestionBean.1
            public static ChangeQuickRedirect changeQuickRedirect;
        }.getType());
    }

    public void handleAnswerValue(SubmitQuestionBean submitQuestionBean, Map<String, String> map) {
        Answer answer;
        Object[] objArr = {submitQuestionBean, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8aa31e2a39a73af348d9a7daba4d02c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8aa31e2a39a73af348d9a7daba4d02c9");
        } else if (map != null && submitQuestionBean != null) {
            try {
                this.answerValue = new JsonArray();
                if (submitQuestionBean.question_type == 4 && map.containsKey("text")) {
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty("q_ans_text", map.get("text"));
                    this.answerValue.add(jsonObject);
                } else if (submitQuestionBean.question_type == 1) {
                    JsonObject jsonObject2 = new JsonObject();
                    jsonObject2.addProperty("q_ans_text", mapValueStr(map));
                    jsonObject2.addProperty("q_ans_id", this.q_ans_id);
                    jsonObject2.addProperty("q_ans_value", this.q_ans_value);
                    this.answerValue.add(jsonObject2);
                } else if (submitQuestionBean.question_type == 2) {
                    Set<String> keySet = map.keySet();
                    if (keySet != null) {
                        for (String str : keySet) {
                            JsonObject jsonObject3 = new JsonObject();
                            jsonObject3.addProperty("q_ans_text", map.get(str));
                            if (this.dataMap != null && this.dataMap.containsKey(str) && (answer = this.dataMap.get(str)) != null) {
                                jsonObject3.addProperty("q_ans_id", answer.qAnsId);
                                jsonObject3.addProperty("q_ans_value", Integer.valueOf(answer.qAnsValue));
                            }
                            this.answerValue.add(jsonObject3);
                        }
                        this.dataMap = null;
                    }
                } else if (submitQuestionBean.question_type == 5) {
                    Set<String> keySet2 = map.keySet();
                    JsonObject jsonObject4 = new JsonObject();
                    if (keySet2 != null) {
                        for (String str2 : keySet2) {
                            String str3 = map.get(str2);
                            if (!TextUtils.isEmpty(str3)) {
                                jsonObject4.addProperty("q_ans_text", mapValueStr(strToMap(str3)));
                                jsonObject4.addProperty("q_ans_id", this.q_ans_id);
                            }
                        }
                    }
                    this.answerValue.add(jsonObject4);
                }
            } catch (Exception unused) {
            }
        }
    }

    private String mapValueStr(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da7ca607329fe474cfe81749cbda61d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da7ca607329fe474cfe81749cbda61d3");
        }
        Set<String> keySet = map.keySet();
        if (keySet != null) {
            String str = "";
            for (String str2 : keySet) {
                str = TextUtils.isEmpty(str) ? map.get(str2) : str + CommonConstant.Symbol.COMMA + map.get(str2);
            }
            return str;
        }
        return "";
    }
}
