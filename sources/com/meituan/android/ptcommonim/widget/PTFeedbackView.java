package com.meituan.android.ptcommonim.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.gson.JsonObject;
import com.meituan.android.ptcommonim.feedback.model.PTQuestionData;
import com.meituan.android.ptcommonim.feedback.model.PTQuestionSubmitParam;
import com.meituan.android.ptcommonim.widget.PTFeedbackScoreView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.common.utils.JsonHelper;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTFeedbackView extends FrameLayout {
    public static ChangeQuickRedirect a;
    public PTQuestionSubmitParam b;
    private FrameLayout c;
    private PTFeedbackScoreLayout d;
    private FrameLayout e;
    private PTFeedbackTagLayoutV2 f;
    private FrameLayout g;
    private PTFeedbackEditView h;
    private FrameLayout i;
    private PTFeedbackQuestionView j;
    private TextView k;
    private rx.functions.b<View> l;
    private PTQuestionData m;
    private PTQuestionData.EvaluationInfo n;
    private PTQuestionData.QuestionInfo o;
    private boolean p;
    private final rx.functions.c<String, Object> q;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077 A[Catch: Exception -> 0x00be, TryCatch #0 {Exception -> 0x00be, blocks: (B:6:0x0028, B:9:0x002d, B:31:0x0073, B:33:0x0077, B:34:0x0084, B:35:0x0090, B:36:0x00a3, B:38:0x00b1, B:39:0x00b9, B:18:0x0047, B:21:0x0052, B:24:0x005d, B:27:0x0068), top: B:44:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084 A[Catch: Exception -> 0x00be, TryCatch #0 {Exception -> 0x00be, blocks: (B:6:0x0028, B:9:0x002d, B:31:0x0073, B:33:0x0077, B:34:0x0084, B:35:0x0090, B:36:0x00a3, B:38:0x00b1, B:39:0x00b9, B:18:0x0047, B:21:0x0052, B:24:0x005d, B:27:0x0068), top: B:44:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090 A[Catch: Exception -> 0x00be, TryCatch #0 {Exception -> 0x00be, blocks: (B:6:0x0028, B:9:0x002d, B:31:0x0073, B:33:0x0077, B:34:0x0084, B:35:0x0090, B:36:0x00a3, B:38:0x00b1, B:39:0x00b9, B:18:0x0047, B:21:0x0052, B:24:0x005d, B:27:0x0068), top: B:44:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3 A[Catch: Exception -> 0x00be, TryCatch #0 {Exception -> 0x00be, blocks: (B:6:0x0028, B:9:0x002d, B:31:0x0073, B:33:0x0077, B:34:0x0084, B:35:0x0090, B:36:0x00a3, B:38:0x00b1, B:39:0x00b9, B:18:0x0047, B:21:0x0052, B:24:0x005d, B:27:0x0068), top: B:44:0x0028 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.meituan.android.ptcommonim.widget.PTFeedbackView r18, java.lang.String r19, java.lang.Object r20) {
        /*
            r0 = r18
            r1 = r19
            r3 = 3
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r12 = 0
            r11[r12] = r0
            r13 = 1
            r11[r13] = r1
            r14 = 2
            r11[r14] = r20
            com.meituan.robust.ChangeQuickRedirect r15 = com.meituan.android.ptcommonim.widget.PTFeedbackView.a
            java.lang.String r9 = "05a0858ff28fb5a45fd181eaa3dd344a"
            r5 = 0
            r7 = 1
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            r4 = r11
            r6 = r15
            r8 = r9
            r3 = r9
            r9 = r16
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9)
            if (r4 == 0) goto L28
            com.meituan.robust.PatchProxy.accessDispatch(r11, r5, r15, r13, r3)
            return
        L28:
            com.meituan.android.ptcommonim.feedback.model.PTQuestionSubmitParam r3 = r0.b     // Catch: java.lang.Exception -> Lbe
            if (r3 != 0) goto L2d
            return
        L2d:
            r3 = -1
            int r4 = r19.hashCode()     // Catch: java.lang.Exception -> Lbe
            r6 = 199104008(0xbde1608, float:8.554444E-32)
            if (r4 == r6) goto L68
            r6 = 498747357(0x1dba47dd, float:4.9308095E-21)
            if (r4 == r6) goto L5d
            r6 = 2010606521(0x77d76bb9, float:8.7385055E33)
            if (r4 == r6) goto L52
            r6 = 2090190253(0x7c95c5ad, float:6.2212926E36)
            if (r4 == r6) goto L47
            goto L72
        L47:
            java.lang.String r4 = "tag_score"
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Exception -> Lbe
            if (r1 == 0) goto L72
            r13 = 0
            goto L73
        L52:
            java.lang.String r4 = "tag_solve_switch"
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Exception -> Lbe
            if (r1 == 0) goto L72
            r13 = 3
            goto L73
        L5d:
            java.lang.String r4 = "tag_edit_text"
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Exception -> Lbe
            if (r1 == 0) goto L72
            r13 = 2
            goto L73
        L68:
            java.lang.String r4 = "tag_score_tag"
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Exception -> Lbe
            if (r1 == 0) goto L72
            goto L73
        L72:
            r13 = -1
        L73:
            switch(r13) {
                case 0: goto La3;
                case 1: goto L90;
                case 2: goto L84;
                case 3: goto L77;
                default: goto L76;
            }     // Catch: java.lang.Exception -> Lbe
        L76:
            goto Lbd
        L77:
            com.meituan.android.ptcommonim.feedback.model.PTQuestionSubmitParam r0 = r0.b     // Catch: java.lang.Exception -> Lbe
            r1 = r20
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> Lbe
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> Lbe
            r0.solved = r1     // Catch: java.lang.Exception -> Lbe
            goto Lbd
        L84:
            com.meituan.android.ptcommonim.feedback.model.PTQuestionSubmitParam r1 = r0.b     // Catch: java.lang.Exception -> Lbe
            r2 = r20
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> Lbe
            r1.inputContent = r2     // Catch: java.lang.Exception -> Lbe
            r18.a()     // Catch: java.lang.Exception -> Lbe
            goto Lbe
        L90:
            com.meituan.android.ptcommonim.widget.PTFeedbackTagLayoutV2 r1 = r0.f     // Catch: java.lang.Exception -> Lbe
            java.util.Set r1 = r1.getSelectedTags()     // Catch: java.lang.Exception -> Lbe
            com.meituan.android.ptcommonim.feedback.model.PTQuestionSubmitParam r2 = r0.b     // Catch: java.lang.Exception -> Lbe
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lbe
            r3.<init>(r1)     // Catch: java.lang.Exception -> Lbe
            r2.labels = r3     // Catch: java.lang.Exception -> Lbe
            r18.a()     // Catch: java.lang.Exception -> Lbe
            goto Lbe
        La3:
            r1 = r20
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> Lbe
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> Lbe
            com.meituan.android.ptcommonim.feedback.model.PTQuestionSubmitParam r2 = r0.b     // Catch: java.lang.Exception -> Lbe
            int r2 = r2.score     // Catch: java.lang.Exception -> Lbe
            if (r1 == r2) goto Lb9
            com.meituan.android.ptcommonim.feedback.model.PTQuestionSubmitParam r2 = r0.b     // Catch: java.lang.Exception -> Lbe
            r2.score = r1     // Catch: java.lang.Exception -> Lbe
            com.meituan.android.ptcommonim.feedback.model.PTQuestionSubmitParam r1 = r0.b     // Catch: java.lang.Exception -> Lbe
            r1.labels = r5     // Catch: java.lang.Exception -> Lbe
        Lb9:
            r18.a()     // Catch: java.lang.Exception -> Lbe
            goto Lbe
        Lbd:
            return
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.ptcommonim.widget.PTFeedbackView.a(com.meituan.android.ptcommonim.widget.PTFeedbackView, java.lang.String, java.lang.Object):void");
    }

    public PTFeedbackView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b7a2985f7db6880d6e4f376ff3ff945", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b7a2985f7db6880d6e4f376ff3ff945");
            return;
        }
        this.p = false;
        this.b = new PTQuestionSubmitParam();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        this.q = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "db564a1802e36b3f3e0541fc8d8bac5b", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "db564a1802e36b3f3e0541fc8d8bac5b") : new g(this);
        a(context);
    }

    public PTFeedbackView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a57668452ead8deb404409e3f33c215a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a57668452ead8deb404409e3f33c215a");
            return;
        }
        this.p = false;
        this.b = new PTQuestionSubmitParam();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        this.q = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "266d734fd28d680cd6827a7e349167c6", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "266d734fd28d680cd6827a7e349167c6") : new h(this);
        a(context);
    }

    public PTFeedbackView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ab24856fcfa8471b98a6e52f9d98a17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ab24856fcfa8471b98a6e52f9d98a17");
            return;
        }
        this.p = false;
        this.b = new PTQuestionSubmitParam();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        this.q = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "de6051730c44127c7961b3f41a566cdb", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "de6051730c44127c7961b3f41a566cdb") : new i(this);
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e36b0f3b21f136d11a22b8bce3868635", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e36b0f3b21f136d11a22b8bce3868635");
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.ptim_feedback_view_layout, (ViewGroup) this, true);
        this.c = (FrameLayout) findViewById(R.id.feedback_score_container);
        this.e = (FrameLayout) findViewById(R.id.feedback_tag_container);
        this.g = (FrameLayout) findViewById(R.id.feedback_edittext_container);
        this.i = (FrameLayout) findViewById(R.id.feedback_question_container);
        this.d = (PTFeedbackScoreLayout) this.c.findViewById(R.id.feedback_score_layout);
        this.d.setOnScoreSelectListener(j.a(this));
        this.f = (PTFeedbackTagLayoutV2) this.e.findViewById(R.id.feedback_tag_layout_v2);
        this.f.setVoCallback(this.q);
        this.h = (PTFeedbackEditView) this.g.findViewById(R.id.feedback_edittext_wrapper);
        this.h.setVoCallback(this.q);
        this.j = (PTFeedbackQuestionView) this.i.findViewById(R.id.feedback_solve_question_view);
        this.k = (TextView) findViewById(R.id.feedback_submit_btn);
        this.k.setOnClickListener(k.a(this));
        if (isInEditMode()) {
            return;
        }
        this.e.setVisibility(8);
        this.g.setVisibility(8);
        setSubmitButtonEnabled(false);
        this.k.setText("提交");
    }

    public static /* synthetic */ void a(PTFeedbackView pTFeedbackView, Integer num, PTQuestionData.QuestionInfo questionInfo) {
        Object[] objArr = {pTFeedbackView, num, questionInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42ccf64549c102e30f1464c4bdb15295", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42ccf64549c102e30f1464c4bdb15295");
            return;
        }
        pTFeedbackView.o = questionInfo;
        pTFeedbackView.q.a("tag_score", num);
        Object[] objArr2 = {Integer.valueOf(num.intValue()), questionInfo};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, pTFeedbackView, changeQuickRedirect2, false, "bcd33741fd90ac0e91c2a95a0f79a863", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, pTFeedbackView, changeQuickRedirect2, false, "bcd33741fd90ac0e91c2a95a0f79a863");
        } else if (pTFeedbackView.e != null && pTFeedbackView.f != null && questionInfo != null) {
            pTFeedbackView.f.setData(questionInfo.labelList);
            pTFeedbackView.e.setVisibility(0);
        }
        pTFeedbackView.a(questionInfo, false);
    }

    public static /* synthetic */ void a(PTFeedbackView pTFeedbackView, View view) {
        Object[] objArr = {pTFeedbackView, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "231803e89d10b428ba36c04712ca3452", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "231803e89d10b428ba36c04712ca3452");
        } else if (pTFeedbackView.l != null) {
            pTFeedbackView.l.call(view);
        }
    }

    public void setDisableEditText(boolean z) {
        this.p = z;
    }

    public void setData(PTQuestionData pTQuestionData) {
        List<PTFeedbackScoreView.a> list;
        PTFeedbackScoreView.a aVar;
        Object[] objArr = {pTQuestionData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3ab6393c90a392d412d66a5b6c8e326", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3ab6393c90a392d412d66a5b6c8e326");
        } else if (pTQuestionData != null && pTQuestionData.evaluationInfo != null) {
            PTQuestionData.EvaluationInfo evaluationInfo = (pTQuestionData == null || pTQuestionData.evaluationInfo == null) ? null : pTQuestionData.evaluationInfo;
            if (evaluationInfo == null) {
                return;
            }
            Object[] objArr2 = {evaluationInfo};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "34049b08fca82ee8e75d496e20b42142", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "34049b08fca82ee8e75d496e20b42142");
            } else if (this.c != null && this.d != null && evaluationInfo != null) {
                PTFeedbackScoreLayout pTFeedbackScoreLayout = this.d;
                Object[] objArr3 = {evaluationInfo};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0fcda94ffb0c0ecc85ef286b279dfb00", RobustBitConfig.DEFAULT_VALUE)) {
                    list = (List) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0fcda94ffb0c0ecc85ef286b279dfb00");
                } else if (evaluationInfo == null || CollectionUtils.isEmpty(evaluationInfo.questionList)) {
                    list = null;
                } else {
                    List<PTQuestionData.QuestionInfo> list2 = evaluationInfo.questionList;
                    list = new ArrayList<>();
                    for (PTQuestionData.QuestionInfo questionInfo : list2) {
                        Object[] objArr4 = {questionInfo};
                        ChangeQuickRedirect changeQuickRedirect4 = PTFeedbackScoreView.a.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "dc0f3de9c21c5ab237deb3633300c5c7", RobustBitConfig.DEFAULT_VALUE)) {
                            aVar = (PTFeedbackScoreView.a) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "dc0f3de9c21c5ab237deb3633300c5c7");
                        } else {
                            PTFeedbackScoreView.a aVar2 = new PTFeedbackScoreView.a();
                            if (questionInfo != null) {
                                aVar2.i = questionInfo;
                                aVar2.b = questionInfo.score;
                                aVar2.g = questionInfo.title;
                                aVar2.h = false;
                                aVar2.e = PTFeedbackScoreView.a.a(aVar2.b, true);
                                aVar2.f = PTFeedbackScoreView.a.a(aVar2.b, false);
                                aVar2.c = R.drawable.ptim_round_bg_default;
                                aVar2.d = R.drawable.ptim_round_bg_default;
                            }
                            aVar = aVar2;
                        }
                        list.add(aVar);
                    }
                }
                pTFeedbackScoreLayout.a(list);
            }
            this.e.setVisibility(8);
            if (!CollectionUtils.isEmpty(evaluationInfo.questionList)) {
                a(evaluationInfo.questionList.get(0), true);
            }
            this.g.setVisibility(8);
            Object[] objArr5 = {evaluationInfo};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f4fccba29991c63ec9cca5c46f9d1d6e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f4fccba29991c63ec9cca5c46f9d1d6e");
            } else if (this.i != null && this.j != null && evaluationInfo != null) {
                if (evaluationInfo.solveQuestionSwitch == 1) {
                    this.j.setVisibility(0);
                    this.j.setSolved(true);
                } else {
                    this.j.setVisibility(8);
                }
            }
            this.m = pTQuestionData;
            this.n = evaluationInfo;
        }
    }

    public final void a(PTQuestionSubmitParam pTQuestionSubmitParam, boolean z) {
        Object[] objArr = {pTQuestionSubmitParam, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a80f356a5f304ce0da7eab8f2a933c3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a80f356a5f304ce0da7eab8f2a933c3b");
        } else if (pTQuestionSubmitParam == null) {
        } else {
            this.b = pTQuestionSubmitParam;
            if (this.d != null) {
                this.d.a(this.b.score);
                this.d.setInteractable(z);
            }
            if (this.f != null) {
                this.f.a(this.b.labels);
                this.f.setInteractable(z);
            }
            if (this.j != null) {
                if (pTQuestionSubmitParam.solved == 0) {
                    this.j.setSolved(false);
                } else {
                    this.j.setSolved(true);
                }
                this.j.setInteractable(z);
            }
            if (this.k != null) {
                if (z && com.meituan.android.ptcommonim.feedback.f.a(pTQuestionSubmitParam)) {
                    a();
                } else {
                    setSubmitButtonEnabled(false);
                }
                if (z) {
                    this.k.setText("提交");
                } else if (pTQuestionSubmitParam.errorCode != 0) {
                    this.k.setText("提交");
                } else {
                    this.k.setText("已提交");
                }
            }
        }
    }

    public void setSubmitClickListener(rx.functions.b<View> bVar) {
        this.l = bVar;
    }

    private void a(PTQuestionData.QuestionInfo questionInfo, boolean z) {
        Object[] objArr = {questionInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9efd898b5557d9e14ffc033b7865a80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9efd898b5557d9e14ffc033b7865a80");
        } else if (this.g == null || this.h == null || questionInfo == null || this.p) {
        } else {
            if (!TextUtils.isEmpty(questionInfo.inputTips)) {
                this.h.setInputTips(questionInfo.inputTips);
                this.h.setMaxCount(100);
            }
            if (z) {
                this.h.setText("");
            }
            this.g.setVisibility(0);
        }
    }

    public PTQuestionSubmitParam getSubmitParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9448b1533f1e79a9a23f870f16895a7a", RobustBitConfig.DEFAULT_VALUE)) {
            return (PTQuestionSubmitParam) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9448b1533f1e79a9a23f870f16895a7a");
        }
        PTQuestionSubmitParam pTQuestionSubmitParam = new PTQuestionSubmitParam();
        if (this.d != null) {
            pTQuestionSubmitParam.score = this.d.getSelectedScore();
        }
        if (this.f != null) {
            pTQuestionSubmitParam.labels = new ArrayList(this.f.getSelectedTags());
        }
        if (this.h != null) {
            try {
                pTQuestionSubmitParam.inputContent = this.h.getInputContent();
            } catch (Exception unused) {
            }
        }
        if (this.j != null && this.n != null) {
            if (this.n.solveQuestionSwitch != 1) {
                pTQuestionSubmitParam.solved = -1;
            } else if (this.j.b) {
                pTQuestionSubmitParam.solved = 1;
            } else {
                pTQuestionSubmitParam.solved = 0;
            }
        } else {
            pTQuestionSubmitParam.solved = -1;
        }
        if (this.n != null && !TextUtils.isEmpty(this.n.extraInfo)) {
            try {
                JsonObject jsonObject = new JsonObject();
                jsonObject.add("cid", ((JsonObject) JsonHelper.fromJsonString(this.n.extraInfo, JsonObject.class)).get("cid"));
                pTQuestionSubmitParam.bizExtraInfo = JsonHelper.toJsonString(jsonObject);
            } catch (Exception unused2) {
            }
        }
        return pTQuestionSubmitParam;
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c96ca95dd312cc7e65a76f13cdea6a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c96ca95dd312cc7e65a76f13cdea6a3");
        } else if (this.o == null || this.b == null) {
        } else {
            boolean z = (this.o.labelRequired == 1 && CollectionUtils.isEmpty(this.b.labels)) ? false : true;
            if (this.o.inputRequired == 1 && !this.p && TextUtils.isEmpty(this.b.inputContent)) {
                z = false;
            }
            setSubmitButtonEnabled(this.b.score > 0 ? z : false);
        }
    }

    public void setSubmitButtonEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeffad5c5def4b17ec9533b20b314b2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeffad5c5def4b17ec9533b20b314b2a");
            return;
        }
        this.k.setEnabled(z);
        if (z) {
            this.k.setTextColor(getResources().getColor(R.color.ptim_button_text_enabled));
        } else {
            this.k.setTextColor(getResources().getColor(R.color.ptim_button_text_disabled));
        }
    }
}
