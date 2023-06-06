package com.sankuai.waimai.store.drug.feedback.view;

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
import com.sankuai.waimai.store.drug.feedback.logic.FeedbackLogic;
import com.sankuai.waimai.store.expose.v2.entity.b;
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
        if (PatchProxy.isSupport(objArr, userFeedbackView, changeQuickRedirect, false, "31a4a760700630ca29bb66f0a649fdfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, userFeedbackView, changeQuickRedirect, false, "31a4a760700630ca29bb66f0a649fdfd");
        } else if (userFeedbackView.j == null || userFeedbackView.j.styleConfig == null) {
        } else {
            userFeedbackView.d.setVisibility(4);
            userFeedbackView.e.setVisibility(0);
            u.a(userFeedbackView.f, userFeedbackView.j.styleConfig.title);
            u.a(userFeedbackView.g, userFeedbackView.j.styleConfig.subTitle);
            userFeedbackView.e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.store.drug.feedback.view.UserFeedbackView.4
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f2d443a3cbf558952a807f47d0098e87", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f2d443a3cbf558952a807f47d0098e87");
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
        if (PatchProxy.isSupport(objArr, userFeedbackView, changeQuickRedirect, false, "2c109115c0ee45b067d7bea5bc8d4e6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, userFeedbackView, changeQuickRedirect, false, "2c109115c0ee45b067d7bea5bc8d4e6a");
            return;
        }
        int width = userFeedbackView.e.getWidth();
        final ViewGroup.LayoutParams layoutParams = userFeedbackView.e.getLayoutParams();
        userFeedbackView.q = ValueAnimator.ofInt(width, 0);
        userFeedbackView.q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.store.drug.feedback.view.UserFeedbackView.7
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22dbdb7ca348aa22163b63b4b2b095f3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22dbdb7ca348aa22163b63b4b2b095f3");
                    return;
                }
                layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                UserFeedbackView.this.e.setLayoutParams(layoutParams);
            }
        });
        userFeedbackView.q.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.store.drug.feedback.view.UserFeedbackView.8
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60ff9456c817b984bfec8f2b1706abb0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60ff9456c817b984bfec8f2b1706abb0");
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
        if (PatchProxy.isSupport(objArr, userFeedbackView, changeQuickRedirect, false, "4026113c6180937b58ddadd45c08ff83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, userFeedbackView, changeQuickRedirect, false, "4026113c6180937b58ddadd45c08ff83");
        } else if (userFeedbackView.k) {
            com.sankuai.waimai.store.manager.judas.b.a(userFeedbackView.b, "b_waimai_sg_vmed6gly_mc").a("poi_id", t.a(userFeedbackView.l) ? -999 : userFeedbackView.l).a("spu_id", t.a(userFeedbackView.m) ? -999 : userFeedbackView.m).a();
        }
    }

    public static /* synthetic */ void e(UserFeedbackView userFeedbackView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, userFeedbackView, changeQuickRedirect, false, "a618070133e0eb274255bbe1b6ab6fba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, userFeedbackView, changeQuickRedirect, false, "a618070133e0eb274255bbe1b6ab6fba");
        } else if (userFeedbackView.k) {
            com.sankuai.waimai.store.manager.judas.b.a(userFeedbackView.b, "b_waimai_sg_31fek103_mc").a("icon_type", Integer.valueOf(userFeedbackView.j == null ? -999 : userFeedbackView.j.type)).a("poi_id", t.a(userFeedbackView.l) ? -999 : userFeedbackView.l).a("spu_id", t.a(userFeedbackView.m) ? -999 : userFeedbackView.m).a();
        }
    }

    public static /* synthetic */ void g(UserFeedbackView userFeedbackView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, userFeedbackView, changeQuickRedirect, false, "45ecbb280a5f4f9dd1d335788422b365", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, userFeedbackView, changeQuickRedirect, false, "45ecbb280a5f4f9dd1d335788422b365");
            return;
        }
        int width = userFeedbackView.e.getWidth();
        final ViewGroup.LayoutParams layoutParams = userFeedbackView.e.getLayoutParams();
        userFeedbackView.p = ValueAnimator.ofInt(0, width);
        userFeedbackView.p.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.store.drug.feedback.view.UserFeedbackView.5
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c6e022e2105ca10ffa11f2f661b72a1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c6e022e2105ca10ffa11f2f661b72a1");
                    return;
                }
                UserFeedbackView.this.d.setVisibility(0);
                layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                UserFeedbackView.this.e.setLayoutParams(layoutParams);
            }
        });
        userFeedbackView.p.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.store.drug.feedback.view.UserFeedbackView.6
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "876149aca2d8e70e4e7581ed2b720e2a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "876149aca2d8e70e4e7581ed2b720e2a");
                } else {
                    UserFeedbackView.this.e.setVisibility(0);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea6d32a2ccb4205e1a01cda25d304050", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea6d32a2ccb4205e1a01cda25d304050");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "151e56296535f402b0a05b2486a5af08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "151e56296535f402b0a05b2486a5af08");
        }
    }

    public UserFeedbackView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c7e9455acb2fa0bfaa9f6ede3e9c759", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c7e9455acb2fa0bfaa9f6ede3e9c759");
        }
    }

    public UserFeedbackView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46cd44df82cc0fc2a6a1a4a8e8de8646", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46cd44df82cc0fc2a6a1a4a8e8de8646");
            return;
        }
        this.c = new Runnable() { // from class: com.sankuai.waimai.store.drug.feedback.view.UserFeedbackView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7745693952485aa304eb353db30207ff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7745693952485aa304eb353db30207ff");
                } else {
                    UserFeedbackView.a(UserFeedbackView.this);
                }
            }
        };
        this.k = false;
        this.b = getContext();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e59e36bc621fe8d5568e7c753974a616", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e59e36bc621fe8d5568e7c753974a616");
            return;
        }
        View.inflate(this.b, R.layout.wm_drug_user_feedback_view, this);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c40a37e7cb89267447beeda5188ff17c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c40a37e7cb89267447beeda5188ff17c");
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
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "098c174f4b24c63080f3a1df3a6f8df3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "098c174f4b24c63080f3a1df3a6f8df3");
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
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "df9604a00d3481469fa8d0753a60f818", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "df9604a00d3481469fa8d0753a60f818");
            } else {
                this.i.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.feedback.view.UserFeedbackView.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "23ea9ef3376ad793ed6763595cfaf5f2", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "23ea9ef3376ad793ed6763595cfaf5f2");
                            return;
                        }
                        UserFeedbackView.a(UserFeedbackView.this, 0L);
                        UserFeedbackView.b(UserFeedbackView.this);
                        Context context = UserFeedbackView.this.b;
                        Object[] objArr5 = {context};
                        ChangeQuickRedirect changeQuickRedirect5 = FeedbackLogic.a;
                        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "4d28087366b0fb9a01f89896f79da110", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "4d28087366b0fb9a01f89896f79da110");
                        } else {
                            ab.b().a(context, FeedbackLogic.a(), System.currentTimeMillis());
                        }
                    }
                });
                setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.feedback.view.UserFeedbackView.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "44d7e4783ea44f7cb84836a38ab2c51c", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "44d7e4783ea44f7cb84836a38ab2c51c");
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
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "587447d89c1087ff14020da31da5f1aa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "587447d89c1087ff14020da31da5f1aa");
            } else if (this.j == null || this.j.type != 2) {
            } else {
                Context context = this.b;
                Object[] objArr5 = {context};
                ChangeQuickRedirect changeQuickRedirect5 = FeedbackLogic.a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "66d8117d89ec8fae36363142e174e16b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "66d8117d89ec8fae36363142e174e16b");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95f81d9a3d57ef707a541973533aaf8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95f81d9a3d57ef707a541973533aaf8f");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baf54e1bcd5cca4effaf5b8c788b9d16", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baf54e1bcd5cca4effaf5b8c788b9d16");
        }
        StringBuilder sb = new StringBuilder("b_waimai_sg_vmed6gly_mv_type");
        sb.append(this.j == null ? "" : Integer.valueOf(this.j.type));
        return sb.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61a5577978f661a5d405185b17998251", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61a5577978f661a5d405185b17998251");
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
