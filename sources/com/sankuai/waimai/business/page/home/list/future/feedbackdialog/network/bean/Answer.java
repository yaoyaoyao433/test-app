package com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class Answer implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("q_ans_id")
    public String qAnsId;
    @SerializedName("q_ans_text")
    public String qAnsText;
    @SerializedName("q_ans_value")
    public int qAnsValue;
    @SerializedName("second_answer")
    public List<SecondAnswerDTO> secondAnswer;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class SecondAnswerDTO implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("q_ans_icon")
        public Object qAnsIcon;
        @SerializedName("q_ans_text")
        public String qAnsText;
        @SerializedName("q_ans_value")
        public int qAnsValue;
    }
}
