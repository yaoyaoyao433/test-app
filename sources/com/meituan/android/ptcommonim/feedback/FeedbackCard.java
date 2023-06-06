package com.meituan.android.ptcommonim.feedback;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.meituan.android.ptcommonim.base.network.model.BaseDataEntity;
import com.meituan.android.ptcommonim.feedback.model.PTQuestionSubmitData;
import com.meituan.android.ptcommonim.feedback.model.PTQuestionSubmitParam;
import com.meituan.android.ptcommonim.widget.PTFeedbackView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FeedbackCard extends RelativeLayout {
    public static ChangeQuickRedirect a;
    public PTFeedbackView b;
    public GeneralMessage c;

    public FeedbackCard(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc0cedfee196bc9f6f9c73eec01df91b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc0cedfee196bc9f6f9c73eec01df91b");
        } else {
            a(context);
        }
    }

    public FeedbackCard(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29b10f0e71af0e859cb6175eb96b1a63", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29b10f0e71af0e859cb6175eb96b1a63");
        } else {
            a(context);
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebd8ae1e6f1c782a167d539ae95df35d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebd8ae1e6f1c782a167d539ae95df35d");
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.ptim_feedback_card_layout, (ViewGroup) this, true);
        this.b = (PTFeedbackView) findViewById(R.id.card_feedback_view);
        this.b.setDisableEditText(true);
        this.b.setSubmitClickListener(a.a(this));
    }

    public static /* synthetic */ void a(FeedbackCard feedbackCard, View view) {
        PTQuestionSubmitParam submitParam;
        Object[] objArr = {feedbackCard, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e412fc0bf2fb25b2385059061278b7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e412fc0bf2fb25b2385059061278b7d");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, feedbackCard, changeQuickRedirect2, false, "7570a0f7d4bf209a01e5e336d9515d8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, feedbackCard, changeQuickRedirect2, false, "7570a0f7d4bf209a01e5e336d9515d8b");
        } else if (feedbackCard.b == null || (submitParam = feedbackCard.b.getSubmitParam()) == null) {
        } else {
            submitParam.fromType = 0;
            Object[] objArr3 = {submitParam};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, feedbackCard, changeQuickRedirect3, false, "8ba65d36935d5f9f0b2c040fd48aa1bb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, feedbackCard, changeQuickRedirect3, false, "8ba65d36935d5f9f0b2c040fd48aa1bb");
            } else {
                com.meituan.android.ptcommonim.base.network.a.a().a(f.a(feedbackCard.getContext(), submitParam, feedbackCard.c, 0)).a(new com.sankuai.meituan.retrofit2.f<BaseDataEntity<PTQuestionSubmitData>>() { // from class: com.meituan.android.ptcommonim.feedback.FeedbackCard.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.retrofit2.f
                    public final void onResponse(Call<BaseDataEntity<PTQuestionSubmitData>> call, Response<BaseDataEntity<PTQuestionSubmitData>> response) {
                        Object[] objArr4 = {call, response};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0a28c5fb340aa82d0d9899874eec40e8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0a28c5fb340aa82d0d9899874eec40e8");
                        } else if (response == null || !response.f() || response.b() != 200 || response.e() == null) {
                            e.a().a(FeedbackCard.this.getContext());
                        } else {
                            PTQuestionSubmitData pTQuestionSubmitData = response.e().data;
                            if (response.e().code != 0) {
                                e a2 = e.a();
                                Context context = FeedbackCard.this.getContext();
                                String str = response.e().msg;
                                Object[] objArr5 = {context, str};
                                ChangeQuickRedirect changeQuickRedirect5 = e.a;
                                if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "458444def19b7ae1ed80bc9e70a2af02", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "458444def19b7ae1ed80bc9e70a2af02");
                                } else if (!TextUtils.isEmpty(str) && (context instanceof Activity)) {
                                    com.meituan.android.ptcommonim.base.util.b.a(context, str);
                                }
                                if (FeedbackCard.this.b != null) {
                                    PTFeedbackView pTFeedbackView = FeedbackCard.this.b;
                                    int i = response.e().code;
                                    Object[] objArr6 = {(byte) 0, Integer.valueOf(i)};
                                    ChangeQuickRedirect changeQuickRedirect6 = PTFeedbackView.a;
                                    if (PatchProxy.isSupport(objArr6, pTFeedbackView, changeQuickRedirect6, false, "fcf3a11023d3724bf8e2d685e1c2d693", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, pTFeedbackView, changeQuickRedirect6, false, "fcf3a11023d3724bf8e2d685e1c2d693");
                                        return;
                                    }
                                    pTFeedbackView.b.errorCode = i;
                                    pTFeedbackView.setSubmitButtonEnabled(false);
                                    if (i != 0) {
                                        pTFeedbackView.a(pTFeedbackView.b, false);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            if (pTQuestionSubmitData != null && !TextUtils.isEmpty(pTQuestionSubmitData.userTips)) {
                                com.meituan.android.ptcommonim.base.util.b.a(FeedbackCard.this.getContext(), pTQuestionSubmitData.userTips);
                            }
                            if (FeedbackCard.this.b != null) {
                                FeedbackCard.this.b.setSubmitButtonEnabled(false);
                            }
                        }
                    }

                    @Override // com.sankuai.meituan.retrofit2.f
                    public final void onFailure(Call<BaseDataEntity<PTQuestionSubmitData>> call, Throwable th) {
                        Object[] objArr4 = {call, th};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c1582fe2afd0cbcdb132fac2456992db", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c1582fe2afd0cbcdb132fac2456992db");
                        } else {
                            e.a().a(FeedbackCard.this.getContext());
                        }
                    }
                });
            }
            Context context = feedbackCard.getContext();
            Object[] objArr4 = {context, submitParam};
            ChangeQuickRedirect changeQuickRedirect4 = f.a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "375bfc6bb67c3fad18c411de9cf551e9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "375bfc6bb67c3fad18c411de9cf551e9");
            } else if (context == null || submitParam == null) {
            } else {
                Map<String, Object> a2 = f.a(context, 0);
                a2.put("score", String.valueOf(submitParam.score));
                com.meituan.android.ptcommonim.utils.f.a("b_group_667zgbls_mc", "c_group_hjkzttqg", a2, (Map) null);
            }
        }
    }

    public final void a(PTQuestionSubmitParam pTQuestionSubmitParam, boolean z) {
        Object[] objArr = {pTQuestionSubmitParam, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9364365f20cbcb8b84f77a41acca507", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9364365f20cbcb8b84f77a41acca507");
        } else {
            this.b.a(pTQuestionSubmitParam, z);
        }
    }
}
