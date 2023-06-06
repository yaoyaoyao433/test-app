package com.meituan.android.cashier.base.view.revision;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.model.bean.Cashier;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.ag;
import com.meituan.android.paybase.utils.m;
import com.meituan.android.paycommon.lib.utils.u;
import com.meituan.android.paycommon.lib.widgets.AutoChangeNumberView;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.controller.DynamicActivityDialog;
import com.sankuai.waimai.platform.utils.p;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CashierOrderInfoView extends LinearLayout implements f {
    public static ChangeQuickRedirect a;
    private Cashier b;
    private AutoChangeNumberView c;
    private TextView d;
    private LinearLayout e;
    private RelativeLayout f;
    private FrameLayout g;
    private float h;
    private float i;
    private AnimatorSet j;
    private AnimatorSet k;

    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef43dbe8b17e464623b06714a3db3d8f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef43dbe8b17e464623b06714a3db3d8f")).booleanValue();
        }
        return true;
    }

    public CashierOrderInfoView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbd2d1875d26da9e546c2f3ac866b4c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbd2d1875d26da9e546c2f3ac866b4c8");
        }
    }

    public CashierOrderInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21919135d10c56b4de04fe98711c8f17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21919135d10c56b4de04fe98711c8f17");
        }
    }

    public final void a(Cashier cashier) {
        Object[] objArr = {cashier};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e03704f75f0eeedc2a037df384d4638", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e03704f75f0eeedc2a037df384d4638");
            return;
        }
        this.b = cashier;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "498762389db0603df4e37146fab62a36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "498762389db0603df4e37146fab62a36");
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.cashier__order_info_view, this);
        this.c = (AutoChangeNumberView) findViewById(R.id.business_info_money);
        this.d = (TextView) findViewById(R.id.origin_price);
        this.f = (RelativeLayout) findViewById(R.id.origin_price_layout);
        this.e = (LinearLayout) findViewById(R.id.order_info_layout);
        this.g = (FrameLayout) findViewById(R.id.price_and_order_info_layout);
        Typeface a2 = m.a(getContext());
        if (a2 != null) {
            this.c.setTypeface(a2);
            ((TextView) findViewById(R.id.business_money_symbol)).setTypeface(a2);
        }
        float totalFee = this.b != null ? this.b.getTotalFee() : 0.0f;
        setOriginAmount(getContext().getString(R.string.mpay__money_prefix) + ag.a(totalFee));
        TextView textView = (TextView) findViewById(R.id.order_name);
        View findViewById = findViewById(R.id.order_name_detail);
        if (this.b != null) {
            String orderName = this.b.getOrderName();
            if (!TextUtils.isEmpty(orderName)) {
                textView.setVisibility(0);
                textView.setText(orderName);
            } else {
                textView.setVisibility(8);
            }
            if (this.b.getOrderInfo() != null) {
                findViewById.setVisibility(0);
                com.meituan.android.paybase.common.analyse.a.a("b_m32qv34l", "收银台首页展示", new a.c().a("IS_TRUE", Boolean.TRUE).b, a.EnumC0329a.VIEW, -1);
                this.e.setOnClickListener(a.a(this));
                return;
            }
            findViewById.setVisibility(8);
        }
    }

    public static /* synthetic */ void a(CashierOrderInfoView cashierOrderInfoView, View view) {
        Object[] objArr = {cashierOrderInfoView, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7465afd1ebc22d1ec8f2f4ca983e9114", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7465afd1ebc22d1ec8f2f4ca983e9114");
        } else if (cashierOrderInfoView.getContext() instanceof PayBaseActivity) {
            PayBaseActivity payBaseActivity = (PayBaseActivity) cashierOrderInfoView.getContext();
            Object[] objArr2 = {payBaseActivity};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, cashierOrderInfoView, changeQuickRedirect2, false, "70899649e95b8b5cf65e7f073efcfd4c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cashierOrderInfoView, changeQuickRedirect2, false, "70899649e95b8b5cf65e7f073efcfd4c");
            } else if (payBaseActivity == null || payBaseActivity.isFinishing() || payBaseActivity.m()) {
            } else {
                View inflate = LayoutInflater.from(payBaseActivity).inflate(R.layout.cashier__order_info, (ViewGroup) null);
                PopupWindow popupWindow = new PopupWindow(inflate, -1, -1, true);
                popupWindow.setBackgroundDrawable(new ColorDrawable(184549376));
                p.a(popupWindow, payBaseActivity.getWindow().getDecorView(), 17, 0, 0);
                com.meituan.android.cashier.base.utils.c.a(payBaseActivity, inflate, cashierOrderInfoView.b.getOrderInfo());
                ((RelativeLayout) inflate.findViewById(R.id.popup_window)).setOnClickListener(b.a(popupWindow));
                View.OnTouchListener a2 = c.a();
                ((TextView) inflate.findViewById(R.id.title_text_view)).setOnTouchListener(a2);
                ((ImageView) inflate.findViewById(R.id.divider_image_view)).setOnTouchListener(a2);
                com.meituan.android.paybase.common.analyse.a.e(payBaseActivity.getString(R.string.cashier__mge_cid_homepage), payBaseActivity.getString(R.string.cashier__mge_act_press_order_list), null);
                com.meituan.android.paybase.common.analyse.a.a("b_9vkw8bm3", "收银台首页点击订单详情", (Map<String, Object>) null, a.EnumC0329a.CLICK, -1);
            }
        }
    }

    public static /* synthetic */ void a(PopupWindow popupWindow, View view) {
        Object[] objArr = {popupWindow, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "acb4c0c83aaa8100e372c6d0def3d446", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "acb4c0c83aaa8100e372c6d0def3d446");
        } else {
            p.b(popupWindow);
        }
    }

    @Override // com.meituan.android.cashier.base.view.revision.f
    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e00957d0861dbb7437df08bbed57721", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e00957d0861dbb7437df08bbed57721");
            return;
        }
        this.h = f;
        float totalFee = this.b != null ? this.b.getTotalFee() : 0.0f;
        if (TextUtils.isEmpty(this.c.getText())) {
            setBusinessInfoMoney(f);
            if (com.meituan.android.paybase.utils.d.c(Float.valueOf(totalFee), Float.valueOf(f)) > 0) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29239b982630f457023b0b7da3cc5411", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29239b982630f457023b0b7da3cc5411");
                } else {
                    this.e.setPadding(0, getResources().getDimensionPixelSize(R.dimen.cashier__origin_amount_y_shift), 0, getResources().getDimensionPixelSize(R.dimen.cashier__order_info_padding_bottom));
                }
                this.f.setAlpha(1.0f);
            } else {
                this.f.setAlpha(0.0f);
            }
        } else {
            float dimension = getResources().getDimension(R.dimen.cashier__origin_amount_y_shift);
            float b = b(f);
            if (com.meituan.android.paybase.utils.d.c(Float.valueOf(this.i), Float.valueOf(f)) != 0) {
                final AutoChangeNumberView autoChangeNumberView = this.c;
                Object[] objArr3 = {this};
                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                final AutoChangeNumberView.a dVar = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f1794fb038faccf30ec8d17bb2b3c734", RobustBitConfig.DEFAULT_VALUE) ? (AutoChangeNumberView.a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f1794fb038faccf30ec8d17bb2b3c734") : new d(this);
                Object[] objArr4 = {Float.valueOf(b), Float.valueOf(f), "%1$01.2f", Integer.valueOf((int) DynamicActivityDialog.ACTIVITY_DIALOG_ANIM_DURATION), 0, dVar};
                ChangeQuickRedirect changeQuickRedirect4 = AutoChangeNumberView.a;
                if (PatchProxy.isSupport(objArr4, autoChangeNumberView, changeQuickRedirect4, false, "2d7b84909b85bec4810d31ec1e83e9cf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, autoChangeNumberView, changeQuickRedirect4, false, "2d7b84909b85bec4810d31ec1e83e9cf");
                } else {
                    autoChangeNumberView.b = "%1$01.2f";
                    if (autoChangeNumberView.c != null && autoChangeNumberView.c.isRunning()) {
                        autoChangeNumberView.c.removeAllListeners();
                        autoChangeNumberView.c.end();
                    }
                    autoChangeNumberView.c = ObjectAnimator.ofFloat(autoChangeNumberView, "number", b, f);
                    autoChangeNumberView.c.setDuration(450L);
                    autoChangeNumberView.c.setInterpolator(new LinearInterpolator());
                    autoChangeNumberView.c.start();
                    autoChangeNumberView.c.addListener(new Animator.AnimatorListener() { // from class: com.meituan.android.paycommon.lib.widgets.AutoChangeNumberView.1
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
                            Object[] objArr5 = {animator};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "31ae5df3e7cb72b9b6b9629c73dd2f68", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "31ae5df3e7cb72b9b6b9629c73dd2f68");
                            } else if (dVar != null) {
                                dVar.a(animator);
                            }
                        }
                    });
                }
                if (com.meituan.android.paybase.utils.d.c(Float.valueOf(f), Float.valueOf(totalFee)) < 0) {
                    Object[] objArr5 = {Float.valueOf(dimension), null};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "bf53c5dafdb7aa4c875915a873617fbd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "bf53c5dafdb7aa4c875915a873617fbd");
                    } else {
                        a();
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f, "alpha", 0.0f, 1.0f);
                        ofFloat.setDuration(300L);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.e, RecceAnimUtils.TRANSLATION_Y, 0.0f, dimension);
                        ofFloat2.setDuration(300L);
                        if (this.j != null && this.j.isRunning()) {
                            this.j.removeAllListeners();
                            this.j.end();
                        }
                        this.j = new AnimatorSet();
                        this.j.playTogether(ofFloat, ofFloat2);
                        this.j.start();
                        this.j.addListener(new Animator.AnimatorListener() { // from class: com.meituan.android.cashier.base.view.revision.CashierOrderInfoView.2
                            public static ChangeQuickRedirect a;

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationCancel(Animator animator) {
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                Object[] objArr6 = {animator};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "d55078527ca5a18b21a158d1fbd32cf9", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "d55078527ca5a18b21a158d1fbd32cf9");
                                }
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationRepeat(Animator animator) {
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animator) {
                            }
                        });
                    }
                } else {
                    Object[] objArr6 = {Float.valueOf(dimension), null};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "2212e9ccf4c662edca000e6e13dd0844", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "2212e9ccf4c662edca000e6e13dd0844");
                    } else {
                        a();
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f, "alpha", 1.0f, 0.0f);
                        ofFloat3.setDuration(300L);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.e, RecceAnimUtils.TRANSLATION_Y, dimension, 0.0f);
                        ofFloat4.setDuration(300L);
                        ofFloat4.reverse();
                        if (this.k != null && this.k.isRunning()) {
                            this.k.removeAllListeners();
                            this.k.end();
                        }
                        this.k = new AnimatorSet();
                        this.k.playTogether(ofFloat3, ofFloat4);
                        this.k.start();
                        this.k.addListener(new Animator.AnimatorListener() { // from class: com.meituan.android.cashier.base.view.revision.CashierOrderInfoView.1
                            public static ChangeQuickRedirect a;

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationCancel(Animator animator) {
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                Object[] objArr7 = {animator};
                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "59e113fe1c28a2ef5df6529a35aaf5f9", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "59e113fe1c28a2ef5df6529a35aaf5f9");
                                }
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationRepeat(Animator animator) {
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animator) {
                            }
                        });
                    }
                }
            }
        }
        this.i = f;
    }

    public static /* synthetic */ void a(CashierOrderInfoView cashierOrderInfoView, Animator animator) {
        Object[] objArr = {cashierOrderInfoView, animator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a10123b701c1af6a7f4d0e4fab2489a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a10123b701c1af6a7f4d0e4fab2489a");
        } else {
            cashierOrderInfoView.setBusinessInfoMoney(cashierOrderInfoView.h);
        }
    }

    private float b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bb5f30f382eedc83c9ecafee2dfd559", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bb5f30f382eedc83c9ecafee2dfd559")).floatValue();
        }
        try {
            return !TextUtils.isEmpty(this.c.getText()) ? Float.parseFloat(String.valueOf(this.c.getText())) : f;
        } catch (Exception e) {
            q.b("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CashierOrderInfoView_getCurAmount").a("message", e.getMessage()).b, getUniqueId());
            return f;
        }
    }

    private void setBusinessInfoMoney(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01c657138efb113b96c38838a3c65de5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01c657138efb113b96c38838a3c65de5");
        } else if (this.c != null) {
            this.c.setText(ag.a(Double.valueOf(String.valueOf(f)).doubleValue()));
        }
    }

    private void setOriginAmount(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1df0f0742640a6690a966e43897cfbb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1df0f0742640a6690a966e43897cfbb7");
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new StrikethroughSpan(), 0, str.length(), 34);
        this.d.setText(spannableString);
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bb402fa4c50db94aff7895014fa652b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bb402fa4c50db94aff7895014fa652b");
        } else {
            this.e.setPadding(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.cashier__order_info_padding_bottom));
        }
    }

    public FrameLayout getOrderPriceAndInfoLayout() {
        return this.g;
    }

    private String getUniqueId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cf3b3b2fcd3ecb3a033d40cc50b68a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cf3b3b2fcd3ecb3a033d40cc50b68a6");
        }
        Activity a2 = u.a(this);
        if (a2 instanceof PayBaseActivity) {
            PayBaseActivity payBaseActivity = (PayBaseActivity) a2;
            return !TextUtils.isEmpty(payBaseActivity.p()) ? payBaseActivity.p() : "";
        }
        return "";
    }
}
