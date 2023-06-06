package com.meituan.android.ptcommonim.feedback.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class PTQuestionData {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int evaluatable;
    public EvaluationInfo evaluationInfo;
    public String userTips;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class EvaluationInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String extraInfo;
        public List<QuestionInfo> questionList;
        public int solveQuestionSwitch;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class QuestionInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int inputRequired;
        public String inputTips;
        public List<QuestionTag> labelList;
        public int labelRequired;
        public int score;
        public String title;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class QuestionTag {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String labelId;
        public String labelName;
    }
}
