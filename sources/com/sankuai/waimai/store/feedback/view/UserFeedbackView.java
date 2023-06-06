package com.sankuai.waimai.store.feedback.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alipay.sdk.app.PayTask;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.g;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.expose.v2.entity.b;
import com.sankuai.waimai.store.feedback.logic.FeedbackLogic;
import com.sankuai.waimai.store.repository.model.FeedbackInfo;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UserFeedbackView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private Context b;
    private Runnable c;
    private View d;
    private View e;
    private TextView f;
    private TextView g;
    private ImageView h;
    private ImageView i;
    private FeedbackInfo j;
    private boolean k;
    private String l;
    private String m;
    private b n;
    private b o;
    private ValueAnimator p;
    private ValueAnimator q;

    public static /* synthetic */ void a(UserFeedbackView userFeedbackView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, userFeedbackView, changeQuickRedirect, false, "89e2523dccc9c944af78bf76f84101fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, userFeedbackView, changeQuickRedirect, false, "89e2523dccc9c944af78bf76f84101fd");
        } else if (userFeedbackView.j == null || userFeedbackView.j.styleConfig == null) {
        } else {
            userFeedbackView.d.setVisibility(4);
            userFeedbackView.e.setVisibility(0);
            u.a(userFeedbackView.f, userFeedbackView.j.styleConfig.title);
            u.a(userFeedbackView.g, userFeedbackView.j.styleConfig.subTitle);
            userFeedbackView.e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.store.feedback.view.UserFeedbackView.4
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22e279bb78a025bb873484c2261e7672", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22e279bb78a025bb873484c2261e7672");
                        return;
                    }
                    UserFeedbackView.this.e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    UserFeedbackView.g(UserFeedbackView.this);
                }
            });
        }
    }

    public static /* synthetic */ void a(UserFeedbackView userFeedbackView, long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, userFeedbackView, changeQuickRedirect, false, "06a586e81395e73e99cad71a8a1814be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, userFeedbackView, changeQuickRedirect, false, "06a586e81395e73e99cad71a8a1814be");
            return;
        }
        int width = userFeedbackView.e.getWidth();
        final ViewGroup.LayoutParams layoutParams = userFeedbackView.e.getLayoutParams();
        userFeedbackView.q = ValueAnimator.ofInt(width, 0);
        userFeedbackView.q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.store.feedback.view.UserFeedbackView.7
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fbfa5fe562934aa6a798ac755e036951", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fbfa5fe562934aa6a798ac755e036951");
                    return;
                }
                layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                UserFeedbackView.this.e.setLayoutParams(layoutParams);
            }
        });
        userFeedbackView.q.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.store.feedback.view.UserFeedbackView.8
            public static ChangeQuickRedirect a;

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "db402925e2a659f554b5d361172f5793", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "db402925e2a659f554b5d361172f5793");
                    return;
                }
                UserFeedbackView.this.e.setVisibility(8);
                layoutParams.width = -2;
                UserFeedbackView.this.e.setLayoutParams(layoutParams);
            }
        });
        userFeedbackView.q.setDuration(500L);
        userFeedbackView.q.setStartDelay(j);
        userFeedbackView.q.start();
    }

    public static /* synthetic */ void b(UserFeedbackView userFeedbackView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, userFeedbackView, changeQuickRedirect, false, "b9013bb6362f3f4f47c2202de398b222", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, userFeedbackView, changeQuickRedirect, false, "b9013bb6362f3f4f47c2202de398b222");
        } else if (userFeedbackView.k) {
            com.sankuai.waimai.store.manager.judas.b.a(userFeedbackView.b, "b_waimai_sg_vmed6gly_mc").a("poi_id", t.a(userFeedbackView.l) ? -999 : userFeedbackView.l).a("spu_id", t.a(userFeedbackView.m) ? -999 : userFeedbackView.m).a();
        }
    }

    public static /* synthetic */ void e(UserFeedbackView userFeedbackView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, userFeedbackView, changeQuickRedirect, false, "07672b4b9a6accd9ddfdccda66c6ad83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, userFeedbackView, changeQuickRedirect, false, "07672b4b9a6accd9ddfdccda66c6ad83");
        } else if (userFeedbackView.k) {
            com.sankuai.waimai.store.manager.judas.b.a(userFeedbackView.b, "b_waimai_sg_31fek103_mc").a("icon_type", Integer.valueOf(userFeedbackView.j == null ? -999 : userFeedbackView.j.type)).a("poi_id", t.a(userFeedbackView.l) ? -999 : userFeedbackView.l).a("spu_id", t.a(userFeedbackView.m) ? -999 : userFeedbackView.m).a();
        }
    }

    public static /* synthetic */ void g(UserFeedbackView userFeedbackView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, userFeedbackView, changeQuickRedirect, false, "bc3a00746d5a463e43664f877c91a5e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, userFeedbackView, changeQuickRedirect, false, "bc3a00746d5a463e43664f877c91a5e1");
            return;
        }
        int width = userFeedbackView.e.getWidth();
        final ViewGroup.LayoutParams layoutParams = userFeedbackView.e.getLayoutParams();
        userFeedbackView.p = ValueAnimator.ofInt(0, width);
        userFeedbackView.p.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.store.feedback.view.UserFeedbackView.5
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fca0707be52eed65ba8accdbd8f54d99", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fca0707be52eed65ba8accdbd8f54d99");
                    return;
                }
                UserFeedbackView.this.d.setVisibility(0);
                layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                UserFeedbackView.this.e.setLayoutParams(layoutParams);
            }
        });
        userFeedbackView.p.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.store.feedback.view.UserFeedbackView.6
            public static ChangeQuickRedirect a;

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e9861c02019ac91bfe98002eb70e312", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e9861c02019ac91bfe98002eb70e312");
                } else {
                    UserFeedbackView.this.e.setVisibility(0);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e545aff3aec94e0987b763c9bf1b0793", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e545aff3aec94e0987b763c9bf1b0793");
                    return;
                }
                layoutParams.width = -2;
                UserFeedbackView.this.e.setLayoutParams(layoutParams);
                UserFeedbackView.a(UserFeedbackView.this, (long) PayTask.j);
            }
        });
        userFeedbackView.p.setDuration(500L);
        userFeedbackView.p.start();
    }

    public UserFeedbackView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1906e47efeadab8ac77e5b2883b35cc5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1906e47efeadab8ac77e5b2883b35cc5");
        }
    }

    public UserFeedbackView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "576bd8b4bbfa4dc679cc6ce570fde583", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "576bd8b4bbfa4dc679cc6ce570fde583");
        }
    }

    public UserFeedbackView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c5880ef06efdc8ed60fdd6cc86c36d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c5880ef06efdc8ed60fdd6cc86c36d9");
            return;
        }
        this.c = new Runnable() { // from class: com.sankuai.waimai.store.feedback.view.UserFeedbackView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8fcc48b6f511232a0a747b67ddb5cc07", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8fcc48b6f511232a0a747b67ddb5cc07");
                } else {
                    UserFeedbackView.a(UserFeedbackView.this);
                }
            }
        };
        this.k = false;
        this.b = getContext();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4db0532aa4b4e4ca2f4f8f9b0ef191a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4db0532aa4b4e4ca2f4f8f9b0ef191a6");
            return;
        }
        View.inflate(this.b, R.layout.wm_sc_user_feedback_view, this);
        this.d = findViewById(R.id.user_feedback_main);
        this.e = findViewById(R.id.ll_user_feedback_bubble_container);
        this.f = (TextView) findViewById(R.id.user_feedback_bubble_title);
        this.g = (TextView) findViewById(R.id.user_feedback_bubble_subtitle);
        this.h = (ImageView) findViewById(R.id.user_feedback_bubble_icon);
        this.i = (ImageView) findViewById(R.id.im_user_feedback_close);
    }

    public final void a(FeedbackInfo feedbackInfo) {
        Object[] objArr = {feedbackInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9484c2620d475467a62b4e877978c6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9484c2620d475467a62b4e877978c6c");
        } else if (this.j == null || feedbackInfo == null || this.j.surveyId != feedbackInfo.surveyId) {
            if (feedbackInfo == null) {
                u.c(this);
                this.d.setVisibility(8);
                this.j = feedbackInfo;
                removeCallbacks(this.c);
                return;
            }
            u.a(this);
            this.d.setVisibility(0);
            this.j = feedbackInfo;
            if (this.n != null) {
                this.n.a("icon_type", Integer.valueOf(this.j.type));
                this.n.e = getFeedbackEntryViewExposeKey();
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "794d11c86ef2b1aced336321c78dd3b8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "794d11c86ef2b1aced336321c78dd3b8");
            } else {
                this.e.setVisibility(8);
                if (this.j != null && this.j.styleConfig != null) {
                    b.C0608b a2 = m.a(this.j.styleConfig.icon);
                    a2.b = this.b;
                    a2.l = true;
                    a2.e = 1;
                    a2.a(this.h);
                    this.d.setBackgroundResource(R.drawable.wm_sc_feedback_bg_three);
                }
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "73654af5f7dc3accc61dc0968fd731e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "73654af5f7dc3accc61dc0968fd731e0");
            } else {
                this.i.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.feedback.view.UserFeedbackView.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ed2ff1b21118720618f7c907d4dddfc5", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ed2ff1b21118720618f7c907d4dddfc5");
                            return;
                        }
                        UserFeedbackView.a(UserFeedbackView.this, 0L);
                        UserFeedbackView.b(UserFeedbackView.this);
                        Context context = UserFeedbackView.this.b;
                        Object[] objArr5 = {context};
                        ChangeQuickRedirect changeQuickRedirect5 = FeedbackLogic.a;
                        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "9dc448fefb306c98cac0ee3c86d68a25", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "9dc448fefb306c98cac0ee3c86d68a25");
                        } else {
                            ab.b().a(context, FeedbackLogic.a(), System.currentTimeMillis());
                        }
                    }
                });
                setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.feedback.view.UserFeedbackView.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "53ef841ea28f13bccfe64b8d0408d7a0", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "53ef841ea28f13bccfe64b8d0408d7a0");
                            return;
                        }
                        if (UserFeedbackView.this.j != null && !t.a(UserFeedbackView.this.j.url)) {
                            d.a(UserFeedbackView.this.getContext(), UserFeedbackView.this.j.url);
                        }
                        UserFeedbackView.e(UserFeedbackView.this);
                    }
                });
                if (this.j != null && this.j.type == 2) {
                    postDelayed(this.c, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                }
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "08239d0420db038fdb52688a0529f53f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "08239d0420db038fdb52688a0529f53f");
            } else if (this.j == null || this.j.type != 2) {
            } else {
                Context context = this.b;
                Object[] objArr5 = {context};
                ChangeQuickRedirect changeQuickRedirect5 = FeedbackLogic.a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "e1d7b2e967fea0caae16ed042844355f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "e1d7b2e967fea0caae16ed042844355f");
                    return;
                }
                FeedbackLogic.ShowRecordInfo b = FeedbackLogic.b(context);
                String b2 = g.b();
                if (b != null && b.showTime != null && b.showTime.equals(b2)) {
                    b.showCount++;
                } else {
                    b = new FeedbackLogic.ShowRecordInfo();
                    b.showTime = g.b();
                    b.showCount = 1;
                }
                ab.b().a(context, FeedbackLogic.b(), i.a(b));
            }
        }
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31345193794fa0b4cc864db675bb6c1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31345193794fa0b4cc864db675bb6c1e");
            return;
        }
        this.k = true;
        this.l = str;
        this.m = null;
        if (this.b instanceof com.sankuai.waimai.store.expose.v2.a) {
            if (this.n == null) {
                this.n = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_sg_31fek103_mv", this, getFeedbackEntryViewExposeKey());
                this.n.a("icon_type", Integer.valueOf(this.j == null ? -999 : this.j.type));
                this.n.a("poi_id", t.a(this.l) ? -999 : this.l);
                this.n.a("spu_id", t.a(this.m) ? -999 : this.m);
                com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.b, this.n);
            }
            if (this.o == null) {
                this.o = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_sg_vmed6gly_mv", this.i, "b_waimai_sg_vmed6gly_mv");
                this.o.a("poi_id", t.a(this.l) ? -999 : this.l);
                this.o.a("spu_id", t.a(this.m) ? -999 : this.m);
                com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.b, this.o);
            }
        }
    }

    private String getFeedbackEntryViewExposeKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fad8129ef7491fa2a2ee4c3cfb2959ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fad8129ef7491fa2a2ee4c3cfb2959ad");
        }
        StringBuilder sb = new StringBuilder("b_waimai_sg_vmed6gly_mv_type");
        sb.append(this.j == null ? "" : Integer.valueOf(this.j.type));
        return sb.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bae7db8c7dba4c214c8745aabb27135", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bae7db8c7dba4c214c8745aabb27135");
            return;
        }
        super.onDetachedFromWindow();
        removeCallbacks(this.c);
        if (this.p != null) {
            this.p.cancel();
        }
        if (this.q != null) {
            this.q.cancel();
        }
    }
}
