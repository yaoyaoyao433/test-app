package com.meituan.android.cashier.dialog;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.fragment.MTCashierRevisionFragment;
import com.meituan.android.cashier.model.bean.CashierPopWindowBean;
import com.meituan.android.cashier.model.bean.PopDetailInfo;
import com.meituan.android.pay.common.payment.bean.CreditPayOpenInfoBean;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.promotion.bean.Icon;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.ae;
import com.meituan.android.paybase.utils.aj;
import com.meituan.android.paybase.widgets.bankcard.RoundImageView;
import com.meituan.android.paycommon.lib.fragment.HalfPageFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CommonGuideDialog extends BaseDialog {
    public static ChangeQuickRedirect a;
    private HashMap<String, Object> b;
    private PopDetailInfo e;
    private q f;
    private CashierPopWindowBean g;

    public static /* synthetic */ void a(CommonGuideDialog commonGuideDialog, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, commonGuideDialog, changeQuickRedirect, false, "1b7f8457a9e86539c5c88c9eb8f75f53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, commonGuideDialog, changeQuickRedirect, false, "1b7f8457a9e86539c5c88c9eb8f75f53");
            return;
        }
        switch (i) {
            case 2:
                com.meituan.android.paybase.dialog.e.a(commonGuideDialog.getOwnerActivity(), (Object) "月付开通失败，请更换其他支付方式");
                commonGuideDialog.dismiss();
                return;
            case 3:
                Fragment parentFragment = commonGuideDialog.d.getParentFragment();
                if (parentFragment instanceof MTCashierRevisionFragment) {
                    com.meituan.android.pay.utils.g.b();
                    ((MTCashierRevisionFragment) parentFragment).c(commonGuideDialog.e.getGuidePayTypeInfo());
                }
                commonGuideDialog.dismiss();
                return;
            default:
                commonGuideDialog.c();
                return;
        }
    }

    public static /* synthetic */ void a(CommonGuideDialog commonGuideDialog, MTPayment mTPayment) {
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, commonGuideDialog, changeQuickRedirect, false, "51e9cf4e7c354a0c7083b20620b4bf7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, commonGuideDialog, changeQuickRedirect, false, "51e9cf4e7c354a0c7083b20620b4bf7c");
        } else if (mTPayment == null || TextUtils.isEmpty(mTPayment.getPayType())) {
        } else {
            HashMap<String, Object> hashMap = new a.c().a("pay_type", mTPayment.getPayType()).b;
            com.meituan.android.cashier.common.q.b("b_pay_standard_cashier_mt_pay_confirm_sc", hashMap, commonGuideDialog.b());
            com.meituan.android.cashier.common.q.a("standard_cashier_mt_pay_confirm", hashMap, (List<Float>) null, commonGuideDialog.b());
        }
    }

    public static /* synthetic */ boolean g(CommonGuideDialog commonGuideDialog) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, commonGuideDialog, changeQuickRedirect, false, "cc2de2ae2ca24102ffba28050e22921d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, commonGuideDialog, changeQuickRedirect, false, "cc2de2ae2ca24102ffba28050e22921d")).booleanValue();
        }
        MTPayment guidePayTypeInfo = commonGuideDialog.e.getGuidePayTypeInfo();
        return (guidePayTypeInfo == null || guidePayTypeInfo.getCreditPayOpenInfo() == null || TextUtils.isEmpty(guidePayTypeInfo.getCreditPayOpenInfo().getUrl())) ? false : true;
    }

    public static /* synthetic */ void h(CommonGuideDialog commonGuideDialog) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, commonGuideDialog, changeQuickRedirect, false, "716ebab545c97b476b9d9fffa63b8b67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, commonGuideDialog, changeQuickRedirect, false, "716ebab545c97b476b9d9fffa63b8b67");
            return;
        }
        commonGuideDialog.findViewById(R.id.cashier_common_guide_dialog_content).setVisibility(8);
        if (commonGuideDialog.getWindow() != null) {
            commonGuideDialog.getWindow().setDimAmount(0.0f);
        }
        new Handler().post(j.a(commonGuideDialog));
    }

    public static /* synthetic */ void i(CommonGuideDialog commonGuideDialog) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, commonGuideDialog, changeQuickRedirect, false, "79413620c48de595bf7e8d125abffcad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, commonGuideDialog, changeQuickRedirect, false, "79413620c48de595bf7e8d125abffcad");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(KnbConstants.PARAMS_SCENE, "1");
        hashMap.put("url", commonGuideDialog.a());
        com.meituan.android.cashier.common.q.b("b_pay_credit_open_leave_cashier_sc", hashMap, commonGuideDialog.b());
    }

    public CommonGuideDialog(Context context, CashierPopWindowBean cashierPopWindowBean, q qVar) {
        super(context, R.style.cashier__card_pay_guide_transparent_dialog);
        Icon icon;
        Object[] objArr = {context, cashierPopWindowBean, qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95e0ac4fbf5e9a2bb7f81bf0e6c96ce5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95e0ac4fbf5e9a2bb7f81bf0e6c96ce5");
        } else if (cashierPopWindowBean == null) {
        } else {
            this.g = cashierPopWindowBean;
            if (cashierPopWindowBean.getPopDetailInfo() == null) {
                return;
            }
            this.e = cashierPopWindowBean.getPopDetailInfo();
            if (this.e.getGuidePayTypeInfo() == null || TextUtils.isEmpty(this.e.getTitle()) || TextUtils.isEmpty(this.e.getMarketingMainTitle()) || TextUtils.isEmpty(this.e.getGuideButton()) || TextUtils.isEmpty(this.e.getStyle())) {
                return;
            }
            this.f = qVar;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86c20a9ecdd533367b109430cdd94115", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86c20a9ecdd533367b109430cdd94115");
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4be19aa23f0acbfbe4ec7064659b5b81", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4be19aa23f0acbfbe4ec7064659b5b81");
            } else {
                this.b = com.meituan.android.cashier.common.q.a();
                if (!TextUtils.isEmpty(this.e.getPopScene())) {
                    this.b.put("pop_scene", this.e.getPopScene());
                }
                this.b.put("style_type", "1");
                if (!TextUtils.isEmpty(this.e.getAdId())) {
                    this.b.put("ad_id", this.e.getAdId());
                } else {
                    this.b.put("ad_id", "-999");
                }
                if (this.e.getGuidePayTypeInfo() != null) {
                    this.b.put("pay_type", this.e.getGuidePayTypeInfo().getPayType());
                }
            }
            final int type = this.g.getType();
            requestWindowFeature(1);
            setCanceledOnTouchOutside(false);
            setContentView(R.layout.cashier__common_guide_dialog);
            findViewById(R.id.common_dialog_close).setOnClickListener(h.a(this, type));
            ((TextView) findViewById(R.id.common_dialog_title)).setText(this.e.getTitle());
            ((TextView) findViewById(R.id.common_dialog_marketing_main_title)).setText(this.e.getMarketingMainTitle());
            TextView textView = (TextView) findViewById(R.id.common_dialog_marketing_sub_title);
            textView.setText(this.e.getMarketingSubTitle());
            if (TextUtils.isEmpty(this.e.getMarketingSubTitle())) {
                textView.setVisibility(8);
            }
            ImageView imageView = (ImageView) findViewById(R.id.common_dialog_guide_pay_type_pay_icon);
            TextView textView2 = (TextView) findViewById(R.id.common_dialog_guide_pay_type_payment_name);
            if (type == 5) {
                MTPayment guidePayTypeInfo = this.e.getGuidePayTypeInfo();
                if (guidePayTypeInfo != null && (icon = guidePayTypeInfo.getIcon()) != null && !TextUtils.isEmpty(icon.getEnable())) {
                    com.meituan.android.paycommon.lib.utils.w.a(icon.getEnable(), imageView, R.drawable.mpay__payment_default_pic, R.drawable.mpay__payment_default_pic);
                }
                if (this.e.getPaymentSuffix() != null) {
                    textView2.setText(a(guidePayTypeInfo) + this.e.getPaymentSuffix());
                } else {
                    textView2.setText(a(guidePayTypeInfo));
                }
            } else {
                imageView.setVisibility(8);
                textView2.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.e.getMarketingBackgroundImage())) {
                a(8, (RoundImageView) findViewById(R.id.marketing_background_image), (FrameLayout) findViewById(R.id.common_dialog_marketing_area), this.e.getMarketingBackgroundImage());
            }
            Object[] objArr4 = {Integer.valueOf(type)};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5daa5f737f12d36277a85376ec069927", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5daa5f737f12d36277a85376ec069927");
            } else {
                Button button = (Button) findViewById(R.id.common_dialog_guide_button_text);
                button.setText(this.e.getGuideButton());
                if (!TextUtils.isEmpty(this.e.getGuideButtonBackgroundImage())) {
                    a(9, (RoundImageView) findViewById(R.id.common_dialog_guide_button_image), (FrameLayout) findViewById(R.id.common_dialog_guide_button), this.e.getGuideButtonBackgroundImage());
                }
                button.setOnClickListener(new com.meituan.android.paycommon.lib.widgets.g() { // from class: com.meituan.android.cashier.dialog.CommonGuideDialog.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.paycommon.lib.widgets.g
                    public final void a(View view) {
                        Object[] objArr5 = {view};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3103801b225336264170be400601f854", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3103801b225336264170be400601f854");
                        } else if (type == 3 || type == 6) {
                            CommonGuideDialog.this.dismiss();
                            com.meituan.android.pay.desk.pack.u.a().f = "Beforepay_popwindow";
                            if (CommonGuideDialog.this.f != null) {
                                CommonGuideDialog.this.f.a(CommonGuideDialog.this.e.getGuidePayTypeInfo(), CommonGuideDialog.this.g);
                            }
                            CommonGuideDialog.this.b.put("open_source", "Beforepay_popwindow");
                            if (CommonGuideDialog.this.e != null) {
                                com.meituan.android.cashier.utils.b.a(CommonGuideDialog.this.b, CommonGuideDialog.this.e.getGuidePayTypeInfo());
                            }
                            com.meituan.android.cashier.common.q.a("c_PJmoK", com.meituan.android.cashier.base.utils.a.a(CommonGuideDialog.this.g) ? "b_pay_pupgzmqd_mc" : "b_pay_inig81vs_mc", com.meituan.android.cashier.base.utils.a.a(CommonGuideDialog.this.g) ? "引导绑多卡弹窗-主按钮" : "收银台首页-拉新优惠弹窗-绑卡", CommonGuideDialog.this.b, ae.a.CLICK, CommonGuideDialog.this.b());
                            if (CommonGuideDialog.this.e != null) {
                                CommonGuideDialog.a(CommonGuideDialog.this, CommonGuideDialog.this.e.getGuidePayTypeInfo());
                            }
                        } else if (type != 4) {
                            if (type == 5) {
                                CommonGuideDialog.this.dismiss();
                                com.meituan.android.pay.desk.pack.u.a().f = "promotion_signed_guide_popwindow";
                                if (CommonGuideDialog.this.f != null) {
                                    CommonGuideDialog.this.f.a(CommonGuideDialog.this.e.getGuidePayTypeInfo(), CommonGuideDialog.this.g);
                                }
                                CommonGuideDialog.this.b.put("open_source", "promotion_signed_guide_popwindow");
                                if (CommonGuideDialog.this.e != null) {
                                    com.meituan.android.cashier.utils.b.a(CommonGuideDialog.this.b, CommonGuideDialog.this.e.getGuidePayTypeInfo());
                                }
                                com.meituan.android.cashier.common.q.a("c_PJmoK", "b_pay_ma3yhfn3_mc", "引导使用已有支付方式弹窗-主按钮", CommonGuideDialog.this.b, ae.a.CLICK, CommonGuideDialog.this.b());
                                if (CommonGuideDialog.this.e != null) {
                                    CommonGuideDialog.a(CommonGuideDialog.this, CommonGuideDialog.this.e.getGuidePayTypeInfo());
                                }
                            }
                        } else {
                            com.meituan.android.pay.desk.pack.u.a().f = "standardPayCashierPayBeforeAlert";
                            if (CommonGuideDialog.g(CommonGuideDialog.this)) {
                                CommonGuideDialog.h(CommonGuideDialog.this);
                                CreditPayOpenInfoBean creditPayOpenInfo = CommonGuideDialog.this.e.getGuidePayTypeInfo().getCreditPayOpenInfo();
                                CommonGuideDialog.i(CommonGuideDialog.this);
                                HalfPageFragment.a aVar = new HalfPageFragment.a("credit_half_page", com.meituan.android.pay.utils.g.a(CommonGuideDialog.this.getOwnerActivity(), creditPayOpenInfo.getUrl(), "standardPayCashierPayBeforeAlert", ""), creditPayOpenInfo.getData(), 400);
                                aVar.j = HalfPageFragment.a((MTCashierActivity) CommonGuideDialog.this.getOwnerActivity());
                                HalfPageFragment.a(CommonGuideDialog.this.d, aVar);
                            } else {
                                CommonGuideDialog.this.dismiss();
                                Fragment parentFragment = CommonGuideDialog.this.d.getParentFragment();
                                if (parentFragment instanceof MTCashierRevisionFragment) {
                                    ((MTCashierRevisionFragment) parentFragment).a(CommonGuideDialog.this.e.getGuidePayTypeInfo(), CommonGuideDialog.this.g);
                                }
                            }
                            CommonGuideDialog.this.b.put("open_source", "standardPayCashierPayBeforeAlert");
                            if (CommonGuideDialog.this.e != null) {
                                com.meituan.android.cashier.utils.b.a(CommonGuideDialog.this.b, CommonGuideDialog.this.e.getGuidePayTypeInfo());
                            }
                            com.meituan.android.cashier.common.q.a("c_PJmoK", "b_pay_8kstrxvt_mc", "收银台首页-月付优惠弹窗-使用月付支付", CommonGuideDialog.this.b, ae.a.CLICK, CommonGuideDialog.this.b());
                        }
                    }
                }.a(1000L));
            }
            Object[] objArr5 = {Integer.valueOf(type)};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3cfe9b3f7d56173495f42408f55be910", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3cfe9b3f7d56173495f42408f55be910");
            } else if (type == 3 || type == 6) {
                this.b.put("open_source", "Beforepay_popwindow");
                if (this.e != null) {
                    com.meituan.android.cashier.utils.b.a(this.b, this.e.getGuidePayTypeInfo());
                }
                com.meituan.android.cashier.common.q.a("c_PJmoK", com.meituan.android.cashier.base.utils.a.a(this.g) ? "b_pay_emgbc2xg_mv" : "b_pay_fabizu1a_mv", com.meituan.android.cashier.base.utils.a.a(this.g) ? "引导绑多卡弹窗" : "收银台首页-拉新优惠弹窗", this.b, ae.a.VIEW, b());
            } else if (type == 4) {
                this.b.put("open_source", "standardPayCashierPayBeforeAlert");
                if (this.e != null) {
                    com.meituan.android.cashier.utils.b.a(this.b, this.e.getGuidePayTypeInfo());
                }
                com.meituan.android.cashier.common.q.a("c_PJmoK", "b_pay_rmbynygf_mv", "收银台首页-月付优惠弹窗", this.b, ae.a.VIEW, b());
            } else if (type == 5) {
                this.b.put("open_source", "promotion_signed_guide_popwindow");
                if (this.e != null) {
                    com.meituan.android.cashier.utils.b.a(this.b, this.e.getGuidePayTypeInfo());
                }
                com.meituan.android.cashier.common.q.a("c_PJmoK", "b_pay_ue0rpr3c_mv", "引导使用已有支付方式弹窗", this.b, ae.a.VIEW, b());
            }
        }
    }

    public static /* synthetic */ void a(CommonGuideDialog commonGuideDialog, int i, View view) {
        Object[] objArr = {commonGuideDialog, Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ffa9b10393ffe1452f81e33e821ebb95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ffa9b10393ffe1452f81e33e821ebb95");
            return;
        }
        commonGuideDialog.dismiss();
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, commonGuideDialog, changeQuickRedirect2, false, "239937f35148ed5017881576d79171e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, commonGuideDialog, changeQuickRedirect2, false, "239937f35148ed5017881576d79171e6");
        } else if (i == 3 || i == 6) {
            com.meituan.android.cashier.common.q.a("c_PJmoK", com.meituan.android.cashier.base.utils.a.a(commonGuideDialog.g) ? "b_pay_nvb88kbl_mc" : "b_pay_sod9pe8x_mc", com.meituan.android.cashier.base.utils.a.a(commonGuideDialog.g) ? "引导绑多卡弹窗-关闭按钮" : "收银台首页-拉新优惠弹窗-关闭", commonGuideDialog.b, ae.a.CLICK, commonGuideDialog.b());
        } else if (i == 4) {
            com.meituan.android.cashier.common.q.a("c_PJmoK", "b_pay_kgukyblu_mc", "收银台首页-月付优惠弹窗-关闭", commonGuideDialog.b, ae.a.CLICK, commonGuideDialog.b());
        } else if (i == 5) {
            com.meituan.android.cashier.common.q.a("c_PJmoK", "b_pay_ofkpwvjx_mc", "引导使用已有支付方式弹窗-主按钮-关闭按钮", commonGuideDialog.b, ae.a.CLICK, commonGuideDialog.b());
        }
    }

    @MTPaySuppressFBWarnings({"SIC_INNER_SHOULD_BE_STATIC_ANON"})
    private void a(int i, final RoundImageView roundImageView, final FrameLayout frameLayout, String str) {
        Object[] objArr = {Integer.valueOf(i), roundImageView, frameLayout, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "446e82e2a9310fa82108956c53c02f30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "446e82e2a9310fa82108956c53c02f30");
            return;
        }
        float applyDimension = TypedValue.applyDimension(1, i, getContext().getResources().getDisplayMetrics());
        roundImageView.a(applyDimension, applyDimension, applyDimension, applyDimension);
        com.meituan.android.paycommon.lib.utils.w.a(str, roundImageView);
        final ViewGroup.LayoutParams layoutParams = roundImageView.getLayoutParams();
        layoutParams.width = aj.a(getContext(), 264.0f);
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.meituan.android.cashier.dialog.CommonGuideDialog.2
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23bf4f0d330a1fe11c3bad2b21395cbf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23bf4f0d330a1fe11c3bad2b21395cbf");
                    return;
                }
                layoutParams.height = frameLayout.getHeight();
                roundImageView.setLayoutParams(layoutParams);
                roundImageView.requestLayout();
                if (Build.VERSION.SDK_INT >= 16) {
                    frameLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    frameLayout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
            }
        });
    }

    private String a(MTPayment mTPayment) {
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17ae9d4cfb1eb42f913f5f5224de4006", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17ae9d4cfb1eb42f913f5f5224de4006");
        }
        if (mTPayment == null) {
            return "";
        }
        String str = "";
        String name = TextUtils.isEmpty(mTPayment.getName()) ? "" : mTPayment.getName();
        if (com.meituan.android.pay.common.payment.utils.c.f(mTPayment.getPayType())) {
            str = b(mTPayment);
        } else if (!TextUtils.isEmpty(mTPayment.getNameSuffix())) {
            str = mTPayment.getNameSuffix();
        }
        return name + str;
    }

    private String b(MTPayment mTPayment) {
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93bd730f03e828ff0c16a009db2edf75", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93bd730f03e828ff0c16a009db2edf75") : (mTPayment == null || mTPayment.getCardInfo() == null) ? "" : mTPayment.getCardInfo().getNameExt();
    }

    public String a() {
        CreditPayOpenInfoBean creditPayOpenInfo;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d2ae218a984f3516198226c1738ea1a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d2ae218a984f3516198226c1738ea1a") : (this.e == null || this.e.getGuidePayTypeInfo() == null || (creditPayOpenInfo = this.e.getGuidePayTypeInfo().getCreditPayOpenInfo()) == null) ? "" : creditPayOpenInfo.getUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d2e91128f613e27696776170916f44e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d2e91128f613e27696776170916f44e");
        } else {
            new Handler().post(i.a(this));
        }
    }

    public static /* synthetic */ void a(CommonGuideDialog commonGuideDialog) {
        Object[] objArr = {commonGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "78ac8d70ba9cbcb4e3ac5aed2d94cb58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "78ac8d70ba9cbcb4e3ac5aed2d94cb58");
        } else {
            commonGuideDialog.d.d();
        }
    }

    public static /* synthetic */ void b(CommonGuideDialog commonGuideDialog) {
        Object[] objArr = {commonGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1f61903400ac919ae8e82a9959c4946", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1f61903400ac919ae8e82a9959c4946");
            return;
        }
        commonGuideDialog.d.a((FragmentManager) null);
        commonGuideDialog.findViewById(R.id.cashier_common_guide_dialog_content).setVisibility(0);
        if (commonGuideDialog.getWindow() != null) {
            commonGuideDialog.getWindow().setDimAmount(0.7f);
        }
    }
}
