package com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class QuestionnaireBeanResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int code;
    public String msg;
    public QuestionnaireBean questionnaire;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class QuestionnaireBean {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("questionnaireId")
        public String project_id;
        @SerializedName("questionTotalType")
        public long questionTotalType;
        @SerializedName("question")
        public List<QuestionBean> questions;

        public final List<QuestionBean> getQuestions() {
            return this.questions;
        }
    }
}
