package com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.bean.Answer;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.bean.QuestionBean;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.bean.QuestionnaireBeanResponse;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.bean.SubmitQuestionBean;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public boolean b;
    public Map<String, SubmitQuestionBean> c;
    public List<RocksServerModel> d;
    public Map<String, QuestionnaireBeanResponse> e;
    public Map<Long, Boolean> f;
    public Map<String, String> g;
    public Set<String> h;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c35fab1ad31c490e73e1a6e107f92162", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c35fab1ad31c490e73e1a6e107f92162");
            return;
        }
        this.c = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = new HashSet();
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ada8ac8394e0c5f1c32fbf6531ad0c4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ada8ac8394e0c5f1c32fbf6531ad0c4c");
        } else {
            this.g.put(str, str2);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14cf64f606aac11b828c8ccf374010a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14cf64f606aac11b828c8ccf374010a7");
        } else if (this.g.containsKey(str)) {
            this.g.remove(str);
        }
    }

    public final String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ec1305aaccf9b362820239c4e6a376e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ec1305aaccf9b362820239c4e6a376e") : this.g.get(str);
    }

    public final SubmitQuestionBean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60d960efc1f29bda811262ab55450fe5", RobustBitConfig.DEFAULT_VALUE) ? (SubmitQuestionBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60d960efc1f29bda811262ab55450fe5") : this.c.get(str);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0785a {
        private static final a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4286ee90507be131228c2baa78faf3d6", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4286ee90507be131228c2baa78faf3d6") : C0785a.a;
    }

    public final QuestionnaireBeanResponse a(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6adc606733e3a3c4a8c7d805d75e8d71", RobustBitConfig.DEFAULT_VALUE) ? (QuestionnaireBeanResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6adc606733e3a3c4a8c7d805d75e8d71") : this.e.get(b(j, i));
    }

    public String b(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d6ca049101455d8b413e4ccb5b3bb04", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d6ca049101455d8b413e4ccb5b3bb04");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(i);
        return sb.toString();
    }

    public final boolean b() {
        SubmitQuestionBean submitQuestionBean;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e243761f42592885b31b62801bf8a55c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e243761f42592885b31b62801bf8a55c")).booleanValue();
        }
        if (!this.h.isEmpty()) {
            int i = 0;
            boolean z = false;
            for (String str : this.h) {
                if (this.c.containsKey(str) && (submitQuestionBean = this.c.get(str)) != null) {
                    if (TextUtils.isEmpty(submitQuestionBean.answer) && submitQuestionBean.question_type != 5) {
                        return false;
                    }
                    if (submitQuestionBean.question_type == 5) {
                        i++;
                        if (!TextUtils.isEmpty(submitQuestionBean.answer)) {
                            z = true;
                        }
                    }
                }
            }
            if (i != 0 && !z) {
                return false;
            }
        }
        return true;
    }

    public final void a(QuestionBean questionBean, String str) {
        Object[] objArr = {questionBean, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddd4bc02de871380c45aba2c2cc39dd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddd4bc02de871380c45aba2c2cc39dd1");
            return;
        }
        if (questionBean.requiredField) {
            this.h.add(str);
        }
        if (this.b) {
            return;
        }
        SubmitQuestionBean submitQuestionBean = new SubmitQuestionBean();
        submitQuestionBean.question_id = questionBean.questionId;
        submitQuestionBean.question_type = questionBean.questionType;
        submitQuestionBean.question_name = questionBean.questionTitle;
        submitQuestionBean.required_field = questionBean.requiredField;
        submitQuestionBean.entrance_question_type = 2;
        StringBuilder sb = new StringBuilder();
        sb.append(questionBean.poi_id);
        submitQuestionBean.poi_id = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(questionBean.spu_id);
        submitQuestionBean.spu_id = sb2.toString();
        this.c.put(str, submitQuestionBean);
    }

    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04832fb55dfaea5d4b189a7814813743", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04832fb55dfaea5d4b189a7814813743");
            return;
        }
        SubmitQuestionBean submitQuestionBean = this.c.get(str);
        if (submitQuestionBean != null) {
            Map<String, String> answerToMap = submitQuestionBean.answerToMap();
            if (answerToMap != null) {
                answerToMap.clear();
            }
            submitQuestionBean.mapToAnswer(answerToMap);
        }
    }

    public final void a(String str, String str2, String str3, String str4, String str5, Map<String, Answer> map) {
        Object[] objArr = {str, str2, str3, str4, str5, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee9ec51f06e50d5ce27c0f34742a5369", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee9ec51f06e50d5ce27c0f34742a5369");
            return;
        }
        SubmitQuestionBean submitQuestionBean = this.c.get(str);
        if (submitQuestionBean != null) {
            Map<String, String> answerToMap = submitQuestionBean.answerToMap();
            if (answerToMap == null) {
                answerToMap = new HashMap<>();
            }
            if (TextUtils.isEmpty(str3) && answerToMap.containsKey(str2)) {
                answerToMap.remove(str2);
            } else {
                answerToMap.put(str2, str3);
            }
            submitQuestionBean.mapToAnswer(answerToMap);
            submitQuestionBean.q_ans_id = str4;
            submitQuestionBean.q_ans_value = str5;
            submitQuestionBean.dataMap = map;
        }
    }
}
