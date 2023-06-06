package com.meituan.android.cashier.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.fragment.MTCashierRevisionFragment;
import com.meituan.android.cashier.model.bean.Cashier;
import com.meituan.android.cashier.model.bean.CashierPayment;
import com.meituan.android.pay.common.payment.bean.FinanceServiceBean;
import com.meituan.android.pay.common.payment.bean.installment.Installment;
import com.meituan.android.pay.common.payment.bean.installment.Period;
import com.meituan.android.pay.desk.pack.e;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paybase.utils.ae;
import com.meituan.android.paybase.utils.aj;
import com.meituan.android.paycommon.lib.widgets.ExtendableVerticalLinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NativeStandardCashierAreaView extends LinearLayout {
    public static ChangeQuickRedirect a;
    private b b;
    private a c;
    private com.meituan.android.pay.desk.pack.b d;
    private com.meituan.android.pay.desk.pack.b e;
    private e.a f;
    @MTPayNeedToPersist
    private LinearLayout g;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(FinanceServiceBean financeServiceBean);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        void a(CashierPayment cashierPayment);
    }

    public NativeStandardCashierAreaView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68ec39ccc5cbde29ab778cb2eb62f745", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68ec39ccc5cbde29ab778cb2eb62f745");
        } else {
            a();
        }
    }

    public NativeStandardCashierAreaView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dc58d3636fdbdd213b5a5547d618206", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dc58d3636fdbdd213b5a5547d618206");
        } else {
            a();
        }
    }

    public NativeStandardCashierAreaView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1224efee3b04e42bb8ed81f3a5bdd113", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1224efee3b04e42bb8ed81f3a5bdd113");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fccaa11e48ce735fcdba9e09c3fafe8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fccaa11e48ce735fcdba9e09c3fafe8a");
        } else {
            setOrientation(1);
        }
    }

    public View getFirstCheckedBox() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea1c332f85d22d96f9cdff5ea5ce902c", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea1c332f85d22d96f9cdff5ea5ce902c");
        }
        for (int i = 1; i < getChildCount(); i += 2) {
            View a2 = a((ViewGroup) getChildAt(i));
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    private View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f73fa85b6db0d17423d032b579ab2235", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f73fa85b6db0d17423d032b579ab2235");
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof com.meituan.android.pay.desk.payment.b) {
                if (((com.meituan.android.pay.desk.payment.b) childAt).c()) {
                    return childAt;
                }
            } else if (childAt instanceof LinearLayout) {
                a((LinearLayout) childAt);
            }
        }
        return null;
    }

    public void a(com.meituan.android.pay.common.payment.data.d dVar, ViewGroup viewGroup, Cashier cashier) {
        Object[] objArr = {dVar, viewGroup, cashier};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7674319037926f6c2eeba687ad7b93c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7674319037926f6c2eeba687ad7b93c7");
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof com.meituan.android.pay.desk.payment.b) && dVar != null) {
                ((com.meituan.android.pay.desk.payment.b) childAt).a(dVar);
            } else if ((childAt instanceof com.meituan.android.pay.desk.payment.a) && dVar != null) {
                ((com.meituan.android.pay.desk.payment.a) childAt).a(com.meituan.android.pay.desk.payment.discount.a.a(cashier.getTotalFee(), com.meituan.android.cashier.retrofit.a.a(cashier), dVar));
            } else if (childAt instanceof LinearLayout) {
                a(dVar, (LinearLayout) childAt, cashier);
            }
        }
    }

    public void a(String str, MTCashierRevisionFragment mTCashierRevisionFragment) {
        Object[] objArr = {str, mTCashierRevisionFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfbff90f2675808ffa17462e9023b0b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfbff90f2675808ffa17462e9023b0b4");
            return;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        TextView textView = new TextView(mTCashierRevisionFragment.getContext());
        textView.setText(str);
        textView.setTextColor(getResources().getColor(R.color.cashier__title));
        textView.setTextSize(2, 14.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = getResources().getDimensionPixelOffset(R.dimen.cashier___pay_type_card_new_margin);
        linearLayout.addView(textView, layoutParams);
        addView(linearLayout);
    }

    public View a(final MTCashierRevisionFragment mTCashierRevisionFragment, final ExtendableVerticalLinearLayout extendableVerticalLinearLayout, String str, final boolean z) {
        Object[] objArr = {mTCashierRevisionFragment, extendableVerticalLinearLayout, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a981bedb4fa1e717ecffa692208e590", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a981bedb4fa1e717ecffa692208e590");
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.cashier__payment_more_view, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.cashier_more)).setText(getResources().getString(R.string.cashier__unfold_mt_more_payment2) + str);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.cashier_more_arrow);
        final HashMap<String, Object> hashMap = new a.c().a("page_style", "1").a("utm_source", "-999").b;
        if (z) {
            q.a("c_PJmoK", "b_pay_n96iqp1l_mv", getResources().getString(R.string.cashier__unfold_mt_more_payment_mv), hashMap, mTCashierRevisionFragment.r());
        }
        inflate.setOnClickListener(new com.meituan.android.paycommon.lib.widgets.g() { // from class: com.meituan.android.cashier.widget.NativeStandardCashierAreaView.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.paycommon.lib.widgets.g
            public final void a(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "601da91a9b1152d053747da77468e0ac", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "601da91a9b1152d053747da77468e0ac");
                    return;
                }
                if (z) {
                    com.meituan.android.paybase.common.analyse.a.a("b_zP3hQ", NativeStandardCashierAreaView.this.getResources().getString(R.string.cashier__unfold_mt_more_payment_mc), new a.c().a("IS_BOTTOM", "TRUE").b, a.EnumC0329a.CLICK, -1);
                    String d = mTCashierRevisionFragment.d();
                    HashMap<String, Object> hashMap2 = new a.b().a().b;
                    String r = mTCashierRevisionFragment.r();
                    Object[] objArr3 = {d, "b_v6xIt", hashMap2, r};
                    ChangeQuickRedirect changeQuickRedirect3 = q.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "80a44bfc646767782e4fdd778151260b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "80a44bfc646767782e4fdd778151260b");
                    } else {
                        ae.a(null, "b_v6xIt", hashMap2, d, q.a(r), true);
                    }
                    q.b("c_PJmoK", "b_pay_n96iqp1l_mc", NativeStandardCashierAreaView.this.getResources().getString(R.string.cashier__unfold_mt_more_payment_mc), hashMap, mTCashierRevisionFragment.r());
                }
                final ExtendableVerticalLinearLayout extendableVerticalLinearLayout2 = extendableVerticalLinearLayout;
                final AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.meituan.android.cashier.widget.NativeStandardCashierAreaView.1.1
                    public static ChangeQuickRedirect a;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        MTCashierScrollView mTCashierScrollView;
                        Object[] objArr4 = {animator};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6cfdeaacb33aa362dc9951253cd5701c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6cfdeaacb33aa362dc9951253cd5701c");
                            return;
                        }
                        super.onAnimationStart(animator);
                        if (mTCashierRevisionFragment.getView() == null || (mTCashierScrollView = (MTCashierScrollView) mTCashierRevisionFragment.getView().findViewById(R.id.cashier_scroll_layout)) == null) {
                            return;
                        }
                        mTCashierScrollView.setScrollable(false);
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        MTCashierScrollView mTCashierScrollView;
                        Object[] objArr4 = {animator};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6cb11c3f86904ac09dfa1c7e3006ba95", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6cb11c3f86904ac09dfa1c7e3006ba95");
                            return;
                        }
                        super.onAnimationEnd(animator);
                        if (mTCashierRevisionFragment.getView() == null || (mTCashierScrollView = (MTCashierScrollView) mTCashierRevisionFragment.getView().findViewById(R.id.cashier_scroll_layout)) == null) {
                            return;
                        }
                        mTCashierScrollView.setScrollable(true);
                    }
                };
                Object[] objArr4 = {200, animatorListenerAdapter};
                ChangeQuickRedirect changeQuickRedirect4 = ExtendableVerticalLinearLayout.a;
                if (PatchProxy.isSupport(objArr4, extendableVerticalLinearLayout2, changeQuickRedirect4, false, "584387727ff656937c96c281334ba8d4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, extendableVerticalLinearLayout2, changeQuickRedirect4, false, "584387727ff656937c96c281334ba8d4");
                } else if (extendableVerticalLinearLayout2.b) {
                } else {
                    extendableVerticalLinearLayout2.b = true;
                    if (extendableVerticalLinearLayout2.e != null) {
                        extendableVerticalLinearLayout2.e.cancel();
                    }
                    final int a2 = extendableVerticalLinearLayout2.a(extendableVerticalLinearLayout2.c);
                    final int a3 = extendableVerticalLinearLayout2.a(extendableVerticalLinearLayout2.d);
                    ValueAnimator ofInt = ValueAnimator.ofInt(a2, a3);
                    final ViewGroup.LayoutParams layoutParams = extendableVerticalLinearLayout2.getLayoutParams();
                    ofInt.addUpdateListener(com.meituan.android.paycommon.lib.widgets.d.a(extendableVerticalLinearLayout2, layoutParams));
                    ofInt.addListener(new Animator.AnimatorListener() { // from class: com.meituan.android.paycommon.lib.widgets.ExtendableVerticalLinearLayout.1
                        public static ChangeQuickRedirect a;

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            Object[] objArr5 = {animator};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6bae6355c3fc6c525195628ac473b7b1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6bae6355c3fc6c525195628ac473b7b1");
                                return;
                            }
                            extendableVerticalLinearLayout2.removeAllViews();
                            extendableVerticalLinearLayout2.addView(extendableVerticalLinearLayout2.d);
                            layoutParams.height = a2;
                            extendableVerticalLinearLayout2.setLayoutParams(layoutParams);
                            if (animatorListenerAdapter != null) {
                                animatorListenerAdapter.onAnimationStart(animator);
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            Object[] objArr5 = {animator};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "fd53126510c56075b3592405655d7f9f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "fd53126510c56075b3592405655d7f9f");
                                return;
                            }
                            extendableVerticalLinearLayout2.removeAllViews();
                            extendableVerticalLinearLayout2.addView(extendableVerticalLinearLayout2.d);
                            layoutParams.height = a3;
                            extendableVerticalLinearLayout2.setLayoutParams(layoutParams);
                            if (animatorListenerAdapter != null) {
                                animatorListenerAdapter.onAnimationEnd(animator);
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                            Object[] objArr5 = {animator};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "42ee4c2c0578be0aa6da58b192119a4c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "42ee4c2c0578be0aa6da58b192119a4c");
                                return;
                            }
                            extendableVerticalLinearLayout2.removeAllViews();
                            extendableVerticalLinearLayout2.addView(extendableVerticalLinearLayout2.d);
                            layoutParams.height = a3;
                            extendableVerticalLinearLayout2.setLayoutParams(layoutParams);
                            if (animatorListenerAdapter != null) {
                                animatorListenerAdapter.onAnimationCancel(animator);
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationRepeat(Animator animator) {
                            Object[] objArr5 = {animator};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d7b43edb4debe4e4843685f8af3cbe63", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d7b43edb4debe4e4843685f8af3cbe63");
                            } else if (animatorListenerAdapter != null) {
                                animatorListenerAdapter.onAnimationRepeat(animator);
                            }
                        }
                    });
                    ofInt.setDuration(200L);
                    ofInt.start();
                    extendableVerticalLinearLayout2.e = ofInt;
                }
            }
        });
        ((RelativeLayout.LayoutParams) imageView.getLayoutParams()).addRule(1, R.id.cashier_more);
        return inflate;
    }

    public void setMTDividerLineStyle(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fae2d3c0f6a1a8fb7671f3a0fcbca78b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fae2d3c0f6a1a8fb7671f3a0fcbca78b");
        } else if (view != null) {
            view.setPadding(aj.a(getContext(), 15.0f), 0, 0, 0);
            view.findViewById(R.id.mpay__payment_divider).setBackgroundColor(ContextCompat.getColor(getContext(), R.color.mpay__mtpayment_divider_color));
        }
    }

    public static /* synthetic */ void a(NativeStandardCashierAreaView nativeStandardCashierAreaView, com.meituan.android.pay.common.payment.data.d dVar) {
        Object[] objArr = {nativeStandardCashierAreaView, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a040e496cb24dec898e33878d505adf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a040e496cb24dec898e33878d505adf3");
        } else if (nativeStandardCashierAreaView.f != null) {
            nativeStandardCashierAreaView.f.a(dVar);
        }
    }

    public com.meituan.android.cashier.base.view.revision.j a(CashierPayment cashierPayment) {
        Object[] objArr = {cashierPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f9509e97b3c48d6e410fe2cfade593c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cashier.base.view.revision.j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f9509e97b3c48d6e410fe2cfade593c");
        }
        com.meituan.android.cashier.base.view.revision.j jVar = new com.meituan.android.cashier.base.view.revision.j(getContext());
        jVar.setTag("ThirdPaymentView");
        jVar.setNoPromoInfo(cashierPayment.getNoPromoInfo());
        jVar.setShowDivider(true);
        jVar.b(cashierPayment);
        jVar.setOnClickListener(i.a(this, cashierPayment));
        return jVar;
    }

    public static /* synthetic */ void a(NativeStandardCashierAreaView nativeStandardCashierAreaView, CashierPayment cashierPayment, View view) {
        Object[] objArr = {nativeStandardCashierAreaView, cashierPayment, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d9f5d3356cf5ec092ced90e84accd01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d9f5d3356cf5ec092ced90e84accd01");
        } else if (nativeStandardCashierAreaView.b != null) {
            nativeStandardCashierAreaView.b.a(cashierPayment);
        }
    }

    public void a(List<FinanceServiceBean> list, MTCashierRevisionFragment mTCashierRevisionFragment, String str) {
        Object[] objArr = {list, mTCashierRevisionFragment, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fb4dcccbf96aff722dc2e6bea4236bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fb4dcccbf96aff722dc2e6bea4236bd");
        } else if (!com.meituan.android.paybase.utils.i.a((Collection) list)) {
            this.g = new LinearLayout(getContext());
            ViewGroup viewGroup = null;
            boolean z = true;
            for (FinanceServiceBean financeServiceBean : list) {
                if (financeServiceBean.isFolded()) {
                    viewGroup = a(mTCashierRevisionFragment, viewGroup, financeServiceBean, str);
                } else {
                    viewGroup = a((Fragment) mTCashierRevisionFragment, financeServiceBean, (ExtendableVerticalLinearLayout) null);
                    z = false;
                }
                if (viewGroup.getParent() != null) {
                    ((ViewGroup) viewGroup.getParent()).removeView(viewGroup);
                }
                this.g.addView(viewGroup);
            }
            if (!z) {
                a(mTCashierRevisionFragment, list.get(list.size() - 1), this.g);
            }
            this.g.setOrientation(1);
            this.g.setBackgroundResource(R.drawable.cashier__bg_paytype);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.cashier___pay_type_card_new_margin);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.leftMargin = dimensionPixelOffset;
            layoutParams.rightMargin = dimensionPixelOffset;
            layoutParams.topMargin = dimensionPixelOffset;
            layoutParams.bottomMargin = getResources().getDimensionPixelOffset(R.dimen.cashier___pay_type_card_new_margin_bottom);
            addView(this.g, layoutParams);
        }
    }

    public LinearLayout getFinanceAreaView() {
        return this.g;
    }

    private void a(MTCashierRevisionFragment mTCashierRevisionFragment, FinanceServiceBean financeServiceBean, LinearLayout linearLayout) {
        Object[] objArr = {mTCashierRevisionFragment, financeServiceBean, linearLayout};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a547d84180c8ca8214fdb62e1d8da80d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a547d84180c8ca8214fdb62e1d8da80d");
        } else if (financeServiceBean == null || financeServiceBean.getCreditProductInfo() == null || TextUtils.isEmpty(financeServiceBean.getCreditProductInfo().getServiceProviderDesc())) {
        } else {
            String serviceProviderDesc = financeServiceBean.getCreditProductInfo().getServiceProviderDesc();
            TextView textView = new TextView(mTCashierRevisionFragment.getContext());
            textView.setText(serviceProviderDesc);
            textView.setTextColor(getResources().getColor(financeServiceBean.getStatus() == 0 ? R.color.cashier__service_provider_desc : R.color.paybase__black4));
            textView.setTextSize(2, 12.0f);
            textView.setMaxLines(2);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.leftMargin = getResources().getDimensionPixelOffset(R.dimen.cashier___service_left_margin);
            layoutParams.rightMargin = getResources().getDimensionPixelOffset(R.dimen.cashier___service_right_margin);
            layoutParams.topMargin = getResources().getDimensionPixelOffset(R.dimen.cashier___service_top_and_bottom_margin);
            layoutParams.bottomMargin = getResources().getDimensionPixelOffset(R.dimen.cashier___service_top_and_bottom_margin);
            linearLayout.addView(textView, layoutParams);
        }
    }

    private ViewGroup a(MTCashierRevisionFragment mTCashierRevisionFragment, ViewGroup viewGroup, FinanceServiceBean financeServiceBean, String str) {
        ExtendableVerticalLinearLayout a2;
        LinearLayout linearLayout;
        Object[] objArr = {mTCashierRevisionFragment, viewGroup, financeServiceBean, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49810658e69d4b8a5c1d9225f5407eec", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49810658e69d4b8a5c1d9225f5407eec");
        }
        if (viewGroup == null || !TextUtils.equals((CharSequence) viewGroup.getTag(), "tag_finance_area_folded")) {
            a2 = a(mTCashierRevisionFragment, viewGroup, str);
        } else {
            a2 = (ExtendableVerticalLinearLayout) viewGroup;
        }
        if (a2.getExtendedView() == null) {
            linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            a2.setExtendedView(linearLayout);
        } else {
            linearLayout = (LinearLayout) a2.getExtendedView();
        }
        linearLayout.addView(a((Fragment) mTCashierRevisionFragment, financeServiceBean, a2));
        a(mTCashierRevisionFragment, financeServiceBean, linearLayout);
        return a2;
    }

    private ExtendableVerticalLinearLayout a(MTCashierRevisionFragment mTCashierRevisionFragment, ViewGroup viewGroup, String str) {
        Object[] objArr = {mTCashierRevisionFragment, viewGroup, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8c57e46a224787ab569d3932e67fb4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ExtendableVerticalLinearLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8c57e46a224787ab569d3932e67fb4f");
        }
        ExtendableVerticalLinearLayout extendableVerticalLinearLayout = new ExtendableVerticalLinearLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        extendableVerticalLinearLayout.setTag("tag_finance_area_folded");
        extendableVerticalLinearLayout.setFoldedView(a(mTCashierRevisionFragment, extendableVerticalLinearLayout, str, false));
        if (viewGroup != null) {
            viewGroup.addView(extendableVerticalLinearLayout, layoutParams);
        }
        extendableVerticalLinearLayout.a();
        return extendableVerticalLinearLayout;
    }

    private com.meituan.android.pay.desk.payment.view.e a(Fragment fragment, FinanceServiceBean financeServiceBean, ExtendableVerticalLinearLayout extendableVerticalLinearLayout) {
        Object[] objArr = {fragment, financeServiceBean, extendableVerticalLinearLayout};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34f9ff754b8dd428cb4adbf1214b89c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.pay.desk.payment.view.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34f9ff754b8dd428cb4adbf1214b89c3");
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_cdj00em9_mv", new a.c().a("is_support_period", Integer.valueOf(financeServiceBean.getIsSupportInstallment())).b);
        com.meituan.android.pay.desk.payment.view.e eVar = new com.meituan.android.pay.desk.payment.view.e(fragment.getContext());
        eVar.setActivity(fragment.getActivity());
        eVar.b(financeServiceBean);
        eVar.setOnUpdateChangeListener(j.a(this, financeServiceBean, eVar));
        eVar.setOnClickPeriodItemListener(k.a(this, financeServiceBean, eVar));
        eVar.setOnClickListener(l.a(this, financeServiceBean, extendableVerticalLinearLayout));
        return eVar;
    }

    public static /* synthetic */ void a(NativeStandardCashierAreaView nativeStandardCashierAreaView, FinanceServiceBean financeServiceBean, com.meituan.android.pay.desk.payment.view.e eVar, CompoundButton compoundButton, boolean z) {
        Object[] objArr = {nativeStandardCashierAreaView, financeServiceBean, eVar, compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6314fa65b78544e7567b7c2921d23852", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6314fa65b78544e7567b7c2921d23852");
            return;
        }
        if (financeServiceBean.getUpdateAgreement() != null) {
            financeServiceBean.getUpdateAgreement().setIsChecked(z);
        }
        if (nativeStandardCashierAreaView.e != null) {
            nativeStandardCashierAreaView.e.a(eVar, compoundButton, z);
        }
    }

    public static /* synthetic */ void a(NativeStandardCashierAreaView nativeStandardCashierAreaView, FinanceServiceBean financeServiceBean, com.meituan.android.pay.desk.payment.view.e eVar, AdapterView adapterView, View view, int i, long j) {
        Object[] objArr = {nativeStandardCashierAreaView, financeServiceBean, eVar, adapterView, view, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e372f55221eabf2c6878223e4484db81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e372f55221eabf2c6878223e4484db81");
            return;
        }
        int i2 = -1;
        Installment installment = financeServiceBean.getInstallment();
        if (installment == null || com.meituan.android.paybase.utils.i.a((Collection) installment.getPeriodList())) {
            return;
        }
        Period period = installment.getPeriodList().get(i);
        if (period != null) {
            nativeStandardCashierAreaView.a(period, installment.getPeriodList());
            eVar.a(financeServiceBean);
            i2 = period.getPeriod();
        }
        if (nativeStandardCashierAreaView.e != null) {
            nativeStandardCashierAreaView.e.d(financeServiceBean);
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_u5r394f2_mc", new a.c().a("choose_period", String.valueOf(i2)).a("pay_type", financeServiceBean.getPayType()).b);
    }

    public static /* synthetic */ void a(NativeStandardCashierAreaView nativeStandardCashierAreaView, FinanceServiceBean financeServiceBean, ExtendableVerticalLinearLayout extendableVerticalLinearLayout, View view) {
        Object[] objArr = {nativeStandardCashierAreaView, financeServiceBean, extendableVerticalLinearLayout, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "943ed065cda14a9fbdcb6afff1962874", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "943ed065cda14a9fbdcb6afff1962874");
        } else if (nativeStandardCashierAreaView.c != null) {
            nativeStandardCashierAreaView.c.a(financeServiceBean);
            if (extendableVerticalLinearLayout != null) {
                extendableVerticalLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            }
        }
    }

    private void a(Period period, List<Period> list) {
        Object[] objArr = {period, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07413140528c552b001ae17234e41307", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07413140528c552b001ae17234e41307");
        } else if (com.meituan.android.paybase.utils.i.a((Collection) list)) {
        } else {
            Iterator<Period> it = list.iterator();
            while (it.hasNext()) {
                Period next = it.next();
                next.setSelected(next == period);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1541bbe87def78aabb08797f82389623", RobustBitConfig.DEFAULT_VALUE)) {
            return (Parcelable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1541bbe87def78aabb08797f82389623");
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("NativeStandardCashierAreaView_state", super.onSaveInstanceState());
        return bundle;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Object[] objArr = {parcelable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9163f847edb07a6635191b58b05eafbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9163f847edb07a6635191b58b05eafbe");
        } else {
            super.onRestoreInstanceState(((Bundle) parcelable).getParcelable("NativeStandardCashierAreaView_state"));
        }
    }

    public void setOnThirdPaymentClickListener(@Nullable b bVar) {
        this.b = bVar;
    }

    public void setOnCreditClickListener(@Nullable a aVar) {
        this.c = aVar;
    }

    public void setOnMTPaymentClick(e.a aVar) {
        this.f = aVar;
    }

    public void setMTPaymentInnerClick(com.meituan.android.pay.desk.pack.b bVar) {
        this.d = bVar;
    }

    public void setCreditInnerClick(com.meituan.android.pay.desk.pack.b bVar) {
        this.e = bVar;
    }
}
