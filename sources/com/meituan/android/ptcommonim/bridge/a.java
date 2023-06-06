package com.meituan.android.ptcommonim.bridge;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.ptcommonim.PTSessionFragmentV2;
import com.meituan.android.ptcommonim.base.network.BaseApiRetrofitService;
import com.meituan.android.ptcommonim.base.network.model.BaseDataEntity;
import com.meituan.android.ptcommonim.feedback.FeedbackDialog;
import com.meituan.android.ptcommonim.feedback.e;
import com.meituan.android.ptcommonim.feedback.f;
import com.meituan.android.ptcommonim.feedback.model.PTQuestionData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    final Context b;
    boolean c;

    public static /* synthetic */ void a(a aVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "f8d7f4f2a223041d75e1fa83ae980dbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "f8d7f4f2a223041d75e1fa83ae980dbc");
        } else if (TextUtils.isEmpty(str)) {
            e.a().a(aVar.b, R.string.ptim_feedback_warning_network_error);
        } else {
            com.meituan.android.ptcommonim.base.util.b.a(aVar.b, str);
        }
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de2b90410872029d2c855e8439deb96d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de2b90410872029d2c855e8439deb96d");
            return;
        }
        this.c = false;
        this.b = context;
    }

    public final void a(String str, String str2, com.sankuai.waimai.mach.jsv8.a aVar) {
        Call<BaseDataEntity<PTQuestionData>> questions;
        Object[] objArr = {str, str2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77a32311dbac8ae3f0b1ab86ed726448", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77a32311dbac8ae3f0b1ab86ed726448");
        } else if (this.c) {
        } else {
            Map<String, Object> a2 = PTSessionFragmentV2.a(this.b);
            HashMap hashMap = new HashMap();
            hashMap.put("merchantIdStr", f.a("poiId", a2));
            hashMap.put("channel", f.a("channel", a2));
            this.c = true;
            com.meituan.android.ptcommonim.base.network.a a3 = com.meituan.android.ptcommonim.base.network.a.a();
            Object[] objArr2 = {hashMap};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.ptcommonim.base.network.a.a;
            if (PatchProxy.isSupport(objArr2, a3, changeQuickRedirect2, false, "a30067baee88652caadf909efc931224", RobustBitConfig.DEFAULT_VALUE)) {
                questions = (Call) PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect2, false, "a30067baee88652caadf909efc931224");
            } else {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("appId", com.meituan.android.ptcommonim.protocol.env.a.b);
                questions = ((BaseApiRetrofitService) a3.b.a(BaseApiRetrofitService.class)).getQuestions(a3.b(hashMap2), hashMap, a3.b());
            }
            questions.a(new com.sankuai.meituan.retrofit2.f<BaseDataEntity<PTQuestionData>>() { // from class: com.meituan.android.ptcommonim.bridge.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onResponse(Call<BaseDataEntity<PTQuestionData>> call, Response<BaseDataEntity<PTQuestionData>> response) {
                    boolean z;
                    Object[] objArr3 = {call, response};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2e18fd415adab2fb31402045af2552f3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2e18fd415adab2fb31402045af2552f3");
                        return;
                    }
                    a.this.c = false;
                    if (response == null || !response.f() || response.b() != 200) {
                        a.a(a.this, null);
                        return;
                    }
                    PTQuestionData pTQuestionData = response.e().data;
                    if (pTQuestionData == null) {
                        a.a(a.this, null);
                        return;
                    }
                    e a4 = e.a();
                    Object[] objArr4 = {pTQuestionData};
                    ChangeQuickRedirect changeQuickRedirect4 = e.a;
                    if (PatchProxy.isSupport(objArr4, a4, changeQuickRedirect4, false, "2f506a9137c57273b919209cd75e577e", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr4, a4, changeQuickRedirect4, false, "2f506a9137c57273b919209cd75e577e")).booleanValue();
                    } else {
                        z = pTQuestionData != null && pTQuestionData.evaluatable == 1;
                    }
                    if (!z) {
                        a.a(a.this, pTQuestionData.userTips);
                        return;
                    }
                    e a5 = e.a();
                    Context context = a.this.b;
                    Object[] objArr5 = {context};
                    ChangeQuickRedirect changeQuickRedirect5 = e.a;
                    FeedbackDialog feedbackDialog = PatchProxy.isSupport(objArr5, a5, changeQuickRedirect5, false, "fd8fe893cb744276434e975cdaaa8381", RobustBitConfig.DEFAULT_VALUE) ? (FeedbackDialog) PatchProxy.accessDispatch(objArr5, a5, changeQuickRedirect5, false, "fd8fe893cb744276434e975cdaaa8381") : new FeedbackDialog(context);
                    Object[] objArr6 = {pTQuestionData};
                    ChangeQuickRedirect changeQuickRedirect6 = FeedbackDialog.a;
                    if (PatchProxy.isSupport(objArr6, feedbackDialog, changeQuickRedirect6, false, "ffb2be5d71295327583401e68c159426", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, feedbackDialog, changeQuickRedirect6, false, "ffb2be5d71295327583401e68c159426");
                    } else if (feedbackDialog.b != null) {
                        feedbackDialog.b.setData(pTQuestionData);
                    }
                    feedbackDialog.show();
                }

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onFailure(Call<BaseDataEntity<PTQuestionData>> call, Throwable th) {
                    Object[] objArr3 = {call, th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6af1bfa54a43a29f3e179ebddbbd71e8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6af1bfa54a43a29f3e179ebddbbd71e8");
                        return;
                    }
                    a.this.c = false;
                    e.a().a(a.this.b, R.string.ptim_feedback_warning_network_error);
                }
            });
        }
    }
}
