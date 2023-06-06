package com.meituan.android.ptcommonim.feedback;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.TextView;
import com.meituan.android.ptcommonim.base.network.model.BaseDataEntity;
import com.meituan.android.ptcommonim.feedback.model.PTQuestionSubmitData;
import com.meituan.android.ptcommonim.feedback.model.PTQuestionSubmitParam;
import com.meituan.android.ptcommonim.widget.PTFeedbackView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.xm.base.util.ActivityUtils;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FeedbackDialog extends Dialog {
    public static ChangeQuickRedirect a;
    public final PTFeedbackView b;
    private final View c;
    private final View d;
    private final TextView e;
    private final View f;
    private final Window g;
    private int h;
    private final Handler i;
    private final ViewTreeObserver.OnGlobalLayoutListener j;

    public static /* synthetic */ void a(FeedbackDialog feedbackDialog, Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, feedbackDialog, changeQuickRedirect, false, "ec17ca8d61579d80fef7c9819f893beb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, feedbackDialog, changeQuickRedirect, false, "ec17ca8d61579d80fef7c9819f893beb");
        } else if (context != null) {
            if (TextUtils.isEmpty(str)) {
                str = context.getResources().getString(R.string.ptim_feedback_warning_network_error);
            }
            new com.sankuai.meituan.android.ui.widget.a(feedbackDialog, str, 0).b("#CC000000").a(com.meituan.android.ptcommonim.base.util.a.a(9)).d(14).a(40, 40).a(com.meituan.android.ptcommonim.base.util.a.a(2), 1.0f).a();
        }
    }

    public FeedbackDialog(Context context) {
        super(context, R.style.FeedbackDialog);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3703deb9a67fe0a4218f0cecfbd3cc46", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3703deb9a67fe0a4218f0cecfbd3cc46");
            return;
        }
        this.i = new Handler();
        this.j = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.meituan.android.ptcommonim.feedback.FeedbackDialog.1
            public static ChangeQuickRedirect a;
            public int b;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a6466480f60d1d5afee23d7cc09e5a8b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a6466480f60d1d5afee23d7cc09e5a8b");
                } else if (FeedbackDialog.this.g == null || FeedbackDialog.this.g.getDecorView() == null) {
                } else {
                    try {
                        View decorView = FeedbackDialog.this.g.getDecorView();
                        Rect rect = new Rect();
                        decorView.getWindowVisibleDisplayFrame(rect);
                        int height = rect.height();
                        if (this.b == 0) {
                            this.b = height;
                            Context context2 = FeedbackDialog.this.getContext();
                            Object[] objArr3 = {context2};
                            ChangeQuickRedirect changeQuickRedirect3 = f.a;
                            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f64521068a6d581b45b1732a3a108f2e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f64521068a6d581b45b1732a3a108f2e");
                            } else if (context2 != null) {
                                com.meituan.android.ptcommonim.utils.f.b("b_group_t8xcxrgj_mv", "c_group_hjkzttqg", f.a(context2, 1), null);
                            }
                            if (FeedbackDialog.this.h == 0 || FeedbackDialog.this.h == height) {
                                return;
                            }
                            a(height);
                        } else if (this.b - height != 0) {
                            this.b = height;
                            a(height);
                        }
                    } catch (Exception unused) {
                    }
                }
            }

            private void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0653031d62f51e69ee42e0553f8313ec", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0653031d62f51e69ee42e0553f8313ec");
                    return;
                }
                ViewGroup.LayoutParams layoutParams = FeedbackDialog.this.d.getLayoutParams();
                layoutParams.height = i;
                FeedbackDialog.this.d.setLayoutParams(layoutParams);
            }
        };
        this.g = getWindow();
        this.c = LayoutInflater.from(getContext()).inflate(R.layout.ptim_feedback_dialog_layout, (ViewGroup) null);
        setContentView(this.c);
        this.d = this.c.findViewById(R.id.feedback_dialog_top_container);
        this.e = (TextView) this.c.findViewById(R.id.feedback_dialog_title);
        this.f = this.c.findViewById(R.id.feedback_dialog_close_btn);
        this.f.setOnClickListener(b.a(this));
        this.b = (PTFeedbackView) this.c.findViewById(R.id.dialog_feedback_view);
        PTFeedbackView pTFeedbackView = this.b;
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        pTFeedbackView.setSubmitClickListener(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5740ceff1e983ead98abbdb6806205fa", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5740ceff1e983ead98abbdb6806205fa") : new c(this));
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        layoutParams.width = displayMetrics.widthPixels;
        layoutParams.height = displayMetrics.heightPixels;
        this.h = displayMetrics.heightPixels;
        this.c.setLayoutParams(layoutParams);
        try {
            this.g.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this.j);
        } catch (Exception unused) {
        }
        setCanceledOnTouchOutside(false);
        Object[] objArr3 = {80};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fb1bd733c1fc660a0e8d0f5b5c94dbc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fb1bd733c1fc660a0e8d0f5b5c94dbc2");
        } else if (this.g != null) {
            this.g.setGravity(80);
        }
        Object[] objArr4 = {Integer.valueOf((int) R.style.AnimationBottomDialog)};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b144449a1c9d549035662315a7fe15c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b144449a1c9d549035662315a7fe15c3");
        } else if (this.g != null) {
            this.g.setWindowAnimations(R.style.AnimationBottomDialog);
        }
    }

    public static /* synthetic */ void b(FeedbackDialog feedbackDialog, View view) {
        Object[] objArr = {feedbackDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7983638f03d38d2715e8481aefc3defd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7983638f03d38d2715e8481aefc3defd");
        } else {
            feedbackDialog.dismiss();
        }
    }

    public static /* synthetic */ void a(FeedbackDialog feedbackDialog, View view) {
        PTQuestionSubmitParam submitParam;
        Object[] objArr = {feedbackDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e391cf50ac3f4a1447554d4d70af5da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e391cf50ac3f4a1447554d4d70af5da");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, feedbackDialog, changeQuickRedirect2, false, "c8784de58483539a6d5561b4ba5d7653", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, feedbackDialog, changeQuickRedirect2, false, "c8784de58483539a6d5561b4ba5d7653");
        } else if (feedbackDialog.b == null || (submitParam = feedbackDialog.b.getSubmitParam()) == null) {
        } else {
            submitParam.fromType = 1;
            Object[] objArr3 = {submitParam};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, feedbackDialog, changeQuickRedirect3, false, "bb1862671b52b9d9371789b15550914c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, feedbackDialog, changeQuickRedirect3, false, "bb1862671b52b9d9371789b15550914c");
            } else {
                com.meituan.android.ptcommonim.base.network.a.a().a(f.a(feedbackDialog.getContext(), submitParam, null, 1)).a(new AnonymousClass2());
            }
            Context context = feedbackDialog.getContext();
            Object[] objArr4 = {context, submitParam};
            ChangeQuickRedirect changeQuickRedirect4 = f.a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "8bcf2dff059bc49c3f1aae5f2cdf8452", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "8bcf2dff059bc49c3f1aae5f2cdf8452");
            } else if (context == null || submitParam == null) {
            } else {
                Map<String, Object> a2 = f.a(context, 1);
                a2.put("score", String.valueOf(submitParam.score));
                com.meituan.android.ptcommonim.utils.f.a("b_group_1qinaswp_mc", "c_group_hjkzttqg", a2, (Map) null);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4f06beda12d76dbfe2f7eb53f1d39b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4f06beda12d76dbfe2f7eb53f1d39b9");
            return;
        }
        try {
            this.g.getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.j);
        } catch (Exception unused) {
        }
        super.dismiss();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.ptcommonim.feedback.FeedbackDialog$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 implements com.sankuai.meituan.retrofit2.f<BaseDataEntity<PTQuestionSubmitData>> {
        public static ChangeQuickRedirect a;

        public AnonymousClass2() {
        }

        @Override // com.sankuai.meituan.retrofit2.f
        public final void onResponse(Call<BaseDataEntity<PTQuestionSubmitData>> call, Response<BaseDataEntity<PTQuestionSubmitData>> response) {
            Object[] objArr = {call, response};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c8958033f4e9a856bc91ac7246df43e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c8958033f4e9a856bc91ac7246df43e");
            } else if (response == null || !response.f() || response.b() != 200 || response.e() == null) {
                FeedbackDialog.a(FeedbackDialog.this, FeedbackDialog.this.getContext(), null);
            } else {
                PTQuestionSubmitData pTQuestionSubmitData = response.e().data;
                if (response.e().code == 0) {
                    if (FeedbackDialog.this.b != null) {
                        FeedbackDialog.this.b.setSubmitButtonEnabled(false);
                    }
                    Activity a2 = ActivityUtils.a(FeedbackDialog.this.getContext());
                    FeedbackDialog.this.dismiss();
                    FeedbackDialog.this.i.postDelayed(d.a(pTQuestionSubmitData, a2), 800L);
                    return;
                }
                FeedbackDialog.a(FeedbackDialog.this, FeedbackDialog.this.getContext(), response.e().msg);
            }
        }

        @Override // com.sankuai.meituan.retrofit2.f
        public final void onFailure(Call<BaseDataEntity<PTQuestionSubmitData>> call, Throwable th) {
            Object[] objArr = {call, th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f555292a1736935479e3fec93c753a61", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f555292a1736935479e3fec93c753a61");
                return;
            }
            Context context = FeedbackDialog.this.getContext();
            if (context != null) {
                FeedbackDialog.a(FeedbackDialog.this, context, context.getResources().getString(R.string.ptim_feedback_warning_network_error));
            }
        }
    }
}
