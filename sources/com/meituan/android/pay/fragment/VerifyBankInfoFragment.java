package com.meituan.android.pay.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dianping.titans.utils.StorageUtil;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.aidata.feature.persona.PersonaTable;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.common.promotion.bean.Agreement;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.pay.common.promotion.bean.PaymentReduce;
import com.meituan.android.pay.common.promotion.bean.ReduceInfo;
import com.meituan.android.pay.dialogfragment.QuickBindCardDetainDialogFragment;
import com.meituan.android.pay.hellodialog.DiscountDowngradeDialog;
import com.meituan.android.pay.model.PayErrorCode;
import com.meituan.android.pay.model.bean.BankFactor;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.pay.model.bean.BankLimit;
import com.meituan.android.pay.model.bean.CardBinTip;
import com.meituan.android.pay.model.bean.HelpInfo;
import com.meituan.android.pay.model.bean.OpenWithholdInfo;
import com.meituan.android.pay.model.bean.PopWindowInfo;
import com.meituan.android.pay.model.bean.PromoInfo;
import com.meituan.android.pay.model.bean.ProtocolSign;
import com.meituan.android.pay.model.bean.QuickBankDetail;
import com.meituan.android.pay.model.bean.QuickBankInfo;
import com.meituan.android.pay.model.bean.QuickBankTip;
import com.meituan.android.pay.model.bean.SMSCodeResult;
import com.meituan.android.pay.retrofit.PayRequestService;
import com.meituan.android.pay.widget.EditTextWithClearAndHelpButton;
import com.meituan.android.pay.widget.bankinfoitem.i;
import com.meituan.android.paybase.activity.BaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.common.fragment.PayBaseFragment;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paybase.dialog.e;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.al;
import com.meituan.android.paybase.webview.WebViewActivity;
import com.meituan.android.paybase.widgets.ProgressButton;
import com.meituan.android.paybase.widgets.agreement.AgreementView;
import com.meituan.android.paybase.widgets.keyboard.CustomKeyboardView;
import com.meituan.android.paycommon.lib.webview.specialcontainer.dialogclose.WebViewDialogCloseActivity;
import com.meituan.android.paycommon.lib.webview.specialcontainer.paymentdialog.PaymentDialogFragment;
import com.meituan.android.paycommon.lib.widgets.PayLabelContainer;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class VerifyBankInfoFragment extends PayBaseFragment implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, EditTextWithClearAndHelpButton.b, EditTextWithClearAndHelpButton.d, i.a, com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a, com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a = null;
    private static final String b = "签约支付";
    private static final String c = "独立绑卡";
    private String A;
    private String B;
    private BankInfo d;
    private HashMap<String, String> e;
    private com.meituan.android.pay.utils.r f;
    private a g;
    private boolean h;
    private com.meituan.android.paybase.widgets.keyboard.a i;
    private ProgressButton j;
    private LinearLayout k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private EditTextWithClearAndHelpButton p;
    private String q;
    private ArrayList<QuickBankDetail> r;
    private String s;
    private String t;
    private String u;
    private String v;
    private String z;

    public VerifyBankInfoFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb56ab45847a736c55f2718d69752f4d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb56ab45847a736c55f2718d69752f4d");
            return;
        }
        this.h = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = true;
        this.q = null;
    }

    public static /* synthetic */ void a(VerifyBankInfoFragment verifyBankInfoFragment, ProtocolSign protocolSign) {
        Intent intent;
        Object[] objArr = {protocolSign};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, verifyBankInfoFragment, changeQuickRedirect, false, "444a8c8914d14b1376a53bf8a7f4079f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, verifyBankInfoFragment, changeQuickRedirect, false, "444a8c8914d14b1376a53bf8a7f4079f");
            return;
        }
        String url = protocolSign.getUrl();
        if (!TextUtils.isEmpty(url)) {
            if (url.startsWith(AbsApiFactory.HTTP) || url.startsWith(AbsApiFactory.HTTPS)) {
                intent = new Intent(verifyBankInfoFragment.getActivity(), WebViewActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("url", url);
                intent.setPackage(verifyBankInfoFragment.getActivity().getPackageName());
                intent.putExtras(bundle);
            } else {
                intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
                intent.setPackage(verifyBankInfoFragment.getActivity().getPackageName());
            }
            try {
                verifyBankInfoFragment.startActivityForResult(intent, 10);
                return;
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "VerifyBankInfoFragment_startD2Sign", (Map<String, Object>) null);
                return;
            }
        }
        com.meituan.android.paybase.common.analyse.cat.a.a("urlIsNull", "极速绑卡跳i版url为空");
    }

    public static /* synthetic */ void a(VerifyBankInfoFragment verifyBankInfoFragment, String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, verifyBankInfoFragment, changeQuickRedirect, false, "482953dc604b8cb9934c6c2ec2b3ee24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, verifyBankInfoFragment, changeQuickRedirect, false, "482953dc604b8cb9934c6c2ec2b3ee24");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_ogjddygn_mv", (String) null, new a.c().a("BANK_LIST", str).a("id_bindcard", verifyBankInfoFragment.t).a("entry", verifyBankInfoFragment.v).a("BIND_TYPE", !TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.b(verifyBankInfoFragment.getActivity(), "pay_token")) ? b : c).b, a.EnumC0329a.CLICK, -1);
        com.meituan.android.paybase.common.analyse.a.a("b_pay_w5znqzhd_mc", (String) null, new a.c().a("bankName", str).a("id_bindcard", verifyBankInfoFragment.t).a("entry", verifyBankInfoFragment.v).a("is_install_bankapp", str2).a("BIND_TYPE", !TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.b(verifyBankInfoFragment.getActivity(), "pay_token")) ? b : c).b, a.EnumC0329a.CLICK, -1);
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d0d6346ae0837684e6123dcff13d495", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d0d6346ae0837684e6123dcff13d495");
            return;
        }
        super.onAttach(activity);
        if (getTargetFragment() instanceof com.meituan.android.pay.utils.r) {
            this.f = (com.meituan.android.pay.utils.r) getTargetFragment();
        } else if (activity instanceof com.meituan.android.pay.utils.r) {
            this.f = (com.meituan.android.pay.utils.r) activity;
        } else {
            throw new IllegalStateException("must implements PayCallbacks");
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "479fe5a90b06785d7964e7ed11642ea9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "479fe5a90b06785d7964e7ed11642ea9");
            return;
        }
        this.f = null;
        if (this.i != null) {
            com.meituan.android.paybase.widgets.keyboard.a aVar = this.i;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.paybase.widgets.keyboard.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "3f9a6248224afef414ce071d4c9e7945", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "3f9a6248224afef414ce071d4c9e7945");
            } else {
                if (aVar.e != null) {
                    aVar.e.removeCallbacksAndMessages(null);
                    aVar.e = null;
                }
                if (aVar.j != null) {
                    aVar.j.cancel();
                }
            }
        }
        super.onDetach();
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        HashMap<String, String> a2;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d51295985ea4cdbd15d5dd799187ab6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d51295985ea4cdbd15d5dd799187ab6b");
            return;
        }
        com.meituan.android.paybase.metrics.a.b("BankInfo_launch_time", getClass().getName() + " onCreate");
        if (getArguments() != null) {
            this.d = (BankInfo) com.sankuai.waimai.platform.utils.f.a(getArguments(), "bankInfo");
            if (this.d != null && !TextUtils.isEmpty(this.d.getPageName())) {
                String pageName = this.d.getPageName();
                Object[] objArr2 = {pageName};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0532d5d5c1b6b915265b00e636558963", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0532d5d5c1b6b915265b00e636558963");
                } else if (!TextUtils.isEmpty(pageName)) {
                    if ("cardbin".equalsIgnoreCase(pageName)) {
                        this.B = "c_pay_25o5hq2j";
                        this.z = "b_pay_lqfuwzgv_mc";
                        this.A = "b_x4e6gt8d";
                    } else if ("regist".equalsIgnoreCase(pageName)) {
                        this.B = "c_gj7bbcp3";
                        this.z = "b_pay_5ebr1ads_mc";
                        this.A = "b_pay_dnyszcdh_mc";
                    } else if ("smscode".equalsIgnoreCase(pageName)) {
                        this.B = "c_i8rkdn0w";
                        this.z = "b_pay_qtydh6ib_mc";
                        this.A = "b_pay_xr7v62yj_mc";
                    } else if ("signfactors".equalsIgnoreCase(pageName)) {
                        this.B = "c_pay_431fuavy";
                    }
                }
            }
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.q = getArguments().getString("trans_id");
            if (f()) {
                com.meituan.android.paybase.metrics.a.c("tti_card_bin_view", getClass().getName() + " onCreate");
            }
            this.v = "default_entry";
            this.s = b(this.s);
            try {
                ConcurrentHashMap<String, String> c2 = com.meituan.android.pay.common.payment.utils.b.c(getActivity());
                if (c2 != null) {
                    String str = c2.get("ext_dim_stat");
                    if (!TextUtils.isEmpty(str) && (a2 = com.meituan.android.pay.utils.j.a(str)) != null) {
                        if (!TextUtils.isEmpty(a2.get("entry"))) {
                            this.v = a2.get("entry");
                        }
                        if (!TextUtils.isEmpty(a2.get("id_bindcard"))) {
                            this.t = a2.get("id_bindcard");
                        }
                        if (!TextUtils.isEmpty(a2.get("bankTypeId"))) {
                            this.u = a2.get("bankTypeId");
                        }
                    }
                }
            } catch (Exception unused) {
                com.meituan.android.paybase.common.analyse.a.a("b_RBKBj", new a.c().a("message", getString(R.string.mpay__json_parse_msg)).b);
                com.meituan.android.paybase.common.analyse.cat.a.a("startMtPayError", getString(R.string.mpay__json_parse_error));
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7194c68db3581c24ee746c499b978168", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7194c68db3581c24ee746c499b978168");
        } else if (this.d == null || TextUtils.isEmpty(this.d.getPageName()) || !"cardbin".equalsIgnoreCase(this.d.getPageName())) {
        } else {
            com.meituan.android.pay.common.analyse.b.a("b_pay_nfi4v597_mv", new a.c().a("trans_id", this.q).a("entry", this.v).a("from", Integer.valueOf(com.meituan.android.pay.utils.d.a())).b, r());
        }
    }

    @MTPaySuppressFBWarnings({"ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD"})
    private boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e11a146b589d85355bcab8063d4f0d0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e11a146b589d85355bcab8063d4f0d0")).booleanValue() : com.meituan.android.pay.analyse.a.b == 1 && this.d != null && this.d.isCardBinPage();
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1297fc4fab11cee22b5d8e487d3f5eca", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1297fc4fab11cee22b5d8e487d3f5eca");
        }
        com.meituan.android.paybase.metrics.a.b("BankInfo_launch_time", getClass().getName() + " onCreateView");
        if (f()) {
            com.meituan.android.paybase.metrics.a.c("tti_card_bin_view", getClass().getName() + " onCreateView");
        }
        return layoutInflater.inflate(R.layout.mpay__fragment_verify_bankinfo, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x07d8  */
    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r25, android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 2096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.pay.fragment.VerifyBankInfoFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void c(com.meituan.android.pay.fragment.VerifyBankInfoFragment r27, android.view.View r28) {
        /*
            Method dump skipped, instructions count: 1063
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.pay.fragment.VerifyBankInfoFragment.c(com.meituan.android.pay.fragment.VerifyBankInfoFragment, android.view.View):void");
    }

    public static /* synthetic */ boolean a(VerifyBankInfoFragment verifyBankInfoFragment, View view, MotionEvent motionEvent) {
        Object[] objArr = {verifyBankInfoFragment, view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2755c048e2d5ec7b33761762756b9e68", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2755c048e2d5ec7b33761762756b9e68")).booleanValue();
        }
        com.meituan.android.paybase.utils.ai.a(verifyBankInfoFragment.getActivity());
        verifyBankInfoFragment.i.a();
        return false;
    }

    private boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c998bf772420311dbb6082f837138eee", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c998bf772420311dbb6082f837138eee")).booleanValue();
        }
        if (this.d == null || this.d.getQuickBankInfo() == null) {
            return false;
        }
        return this.d.getQuickBankInfo().isSupportQuickBind();
    }

    private String b(String str) {
        JSONObject jSONObject;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b679365c7f88960089d92b421abac711", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b679365c7f88960089d92b421abac711");
        }
        PromoInfo promoInfo = this.d != null ? this.d.getPromoInfo() : null;
        if (promoInfo != null) {
            if (!TextUtils.isEmpty(promoInfo.getExt())) {
                str = promoInfo.getExt();
            }
            try {
                if (!TextUtils.isEmpty(str)) {
                    jSONObject = new JSONObject(str);
                } else {
                    jSONObject = new JSONObject();
                }
                if (!TextUtils.isEmpty(promoInfo.getBankTitle())) {
                    jSONObject.put("bankTitle", promoInfo.getBankTitle());
                }
                if (promoInfo.getPromoInfoCampaigns() != null && !TextUtils.isEmpty(promoInfo.getPromoInfoCampaigns().getCampaignIds())) {
                    jSONObject.put("campaign_ids", this.d.getPromoInfo().getPromoInfoCampaigns().getCampaignIds());
                }
                if (promoInfo.getPromoInfoBankLabel() != null && !TextUtils.isEmpty(promoInfo.getPromoInfoBankLabel().getLabelId())) {
                    jSONObject.put(PersonaTable.LABEL_ID, this.d.getPromoInfo().getPromoInfoBankLabel().getLabelId());
                }
                return jSONObject.toString();
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "VerifyBankInfoFragment_putext", (Map<String, Object>) null);
                return str;
            }
        }
        return str;
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c98c59711ab31bce9aba088b9d198b4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c98c59711ab31bce9aba088b9d198b4d");
            return;
        }
        super.onResume();
        com.meituan.android.paybase.metrics.a.b("BankInfo_launch_time", getClass().getName() + " onResume");
        if (f()) {
            com.meituan.android.paybase.metrics.a.c("tti_card_bin_view", "end");
            com.meituan.android.paybase.metrics.a.b("tti_card_bin_view");
            com.meituan.android.paybase.metrics.a.c("tti_contract_pay_native_view", "end");
            com.meituan.android.paybase.metrics.a.b("tti_contract_pay_native_view");
            if (com.meituan.android.pay.utils.d.a() == 1180120) {
                com.meituan.android.paybase.metrics.a.c("tti_contract_pay_hybrid_view", "end");
                com.meituan.android.paybase.metrics.a.b("tti_contract_pay_hybrid_view");
                com.meituan.android.pay.utils.n.a(getActivity(), true, "");
                com.meituan.android.pay.utils.d.a("paybiz_hybrid_degrade_success", com.meituan.android.pay.utils.d.b());
            }
        }
    }

    public static /* synthetic */ void a(CustomKeyboardView customKeyboardView, LinearLayout linearLayout) {
        Object[] objArr = {customKeyboardView, linearLayout};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc16ef474914013027c437cefe2070f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc16ef474914013027c437cefe2070f7");
        } else if (customKeyboardView.isShown()) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
    }

    public static /* synthetic */ void a(VerifyBankInfoFragment verifyBankInfoFragment, BankLimit bankLimit, View view) {
        Object[] objArr = {verifyBankInfoFragment, bankLimit, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f536bbbb2a85d09016ad6f545298d54b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f536bbbb2a85d09016ad6f545298d54b");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_f7uljabr", "点击“查看支持的银行", new a.c().a("id_bindcard", verifyBankInfoFragment.t).a("entry", verifyBankInfoFragment.v).a("trans_id", verifyBankInfoFragment.q).b, a.EnumC0329a.CLICK, -1);
        com.meituan.android.paybase.common.analyse.a.a("b_pay_ubnoci4i_mc", "点击“查看支持的银行", new a.c().a("id_bindcard", verifyBankInfoFragment.t).a("entry", verifyBankInfoFragment.v).a("trans_id", verifyBankInfoFragment.q).b, a.EnumC0329a.CLICK, -1);
        com.meituan.android.paybase.common.analyse.a.a("b_8zyqb801", (Map<String, Object>) null);
        al.a(verifyBankInfoFragment.getContext(), bankLimit.getUrl());
    }

    public static /* synthetic */ void b(VerifyBankInfoFragment verifyBankInfoFragment, View view) {
        Object[] objArr = {verifyBankInfoFragment, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64896b791df38ac06f3666ce03c48859", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64896b791df38ac06f3666ce03c48859");
        } else {
            verifyBankInfoFragment.h();
        }
    }

    public static /* synthetic */ void a(VerifyBankInfoFragment verifyBankInfoFragment, View view) {
        Object[] objArr = {verifyBankInfoFragment, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fbc7d2b634a79470de629805b79fc8fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fbc7d2b634a79470de629805b79fc8fd");
        } else if (verifyBankInfoFragment.d.getPageHelp().getHelpInfo() != null) {
            com.meituan.android.paybase.common.analyse.a.a("b_wU1ba", "点击“收不到验证码”", (Map<String, Object>) null, a.EnumC0329a.CLICK, -1);
            HelpInfo helpInfo = verifyBankInfoFragment.d.getPageHelp().getHelpInfo();
            new PayDialog.a(verifyBankInfoFragment.getActivity()).b(helpInfo.getTitle()).c(helpInfo.getText()).b(helpInfo.getButton(), null).a().show();
        }
    }

    private boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37c70c2f0f6bf6e63bb1a3c77abd2d68", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37c70c2f0f6bf6e63bb1a3c77abd2d68")).booleanValue() : (this.d == null || this.d.getOpenWithholdInfo() == null || !TextUtils.equals("smscode", this.d.getPageName())) ? false : true;
    }

    public static /* synthetic */ void a(VerifyBankInfoFragment verifyBankInfoFragment, CompoundButton compoundButton, boolean z) {
        Object[] objArr = {verifyBankInfoFragment, compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11c6896dbc2b9c1e08c57cc0ad851e2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11c6896dbc2b9c1e08c57cc0ad851e2b");
        } else if (verifyBankInfoFragment.j != null) {
            if (z) {
                verifyBankInfoFragment.j.setText(verifyBankInfoFragment.d.getOpenWithholdSwitchButtonText());
            } else {
                verifyBankInfoFragment.j.setText(verifyBankInfoFragment.d.getButtonText());
            }
        }
    }

    private void a(View view, OpenWithholdInfo openWithholdInfo) {
        Object[] objArr = {view, openWithholdInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6e02b17b23d6f6fe46744096b5d932c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6e02b17b23d6f6fe46744096b5d932c");
        } else if (view != null && view.getResources() != null && openWithholdInfo != null) {
            String agreementsPrefix = openWithholdInfo.getAgreementsPrefix();
            if (TextUtils.isEmpty(agreementsPrefix) || com.meituan.android.paybase.utils.i.a((Collection) openWithholdInfo.getAgreementList())) {
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(agreementsPrefix);
            TextView textView = (TextView) view.findViewById(R.id.open_withhold_agreement_prefix);
            for (final Agreement agreement : openWithholdInfo.getAgreementList()) {
                if (agreement != null) {
                    spannableStringBuilder.append((CharSequence) agreement.getName());
                    if (!TextUtils.isEmpty(agreement.getUrl())) {
                        spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.meituan.android.pay.fragment.VerifyBankInfoFragment.3
                            public static ChangeQuickRedirect a;

                            @Override // android.text.style.ClickableSpan
                            public final void onClick(@NonNull View view2) {
                                Object[] objArr2 = {view2};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "deb983d1b252edc374e787e30bf47713", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "deb983d1b252edc374e787e30bf47713");
                                } else {
                                    WebViewDialogCloseActivity.b(VerifyBankInfoFragment.this.getContext(), agreement.getUrl());
                                }
                            }

                            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                            public final void updateDrawState(@NonNull TextPaint textPaint) {
                                Object[] objArr2 = {textPaint};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba0489bf156b1c4b279d062794e86bf6", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba0489bf156b1c4b279d062794e86bf6");
                                    return;
                                }
                                super.updateDrawState(textPaint);
                                textPaint.setUnderlineText(false);
                            }
                        }, spannableStringBuilder.length() - (agreement.getName() != null ? agreement.getName().length() : 0), spannableStringBuilder.length(), 17);
                    } else {
                        com.meituan.android.paybase.common.analyse.cat.a.a("urlIsNull", "OpenWithholdInfo协议链接为空");
                    }
                }
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), R.color.mpay__dark_blue)), agreementsPrefix.length(), spannableStringBuilder.length(), 17);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), R.color.paybase__black3)), 0, agreementsPrefix.length(), 17);
            textView.setVisibility(0);
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(view.getResources().getColor(17170445));
        }
    }

    private TextView j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d257e67ab478bac6024ecd22dfee002", RobustBitConfig.DEFAULT_VALUE)) {
            return (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d257e67ab478bac6024ecd22dfee002");
        }
        TextView textView = new TextView(getContext());
        textView.setBackgroundColor(getResources().getColor(R.color.white));
        textView.setGravity(17);
        textView.setMaxLines(1);
        textView.setPadding(0, com.meituan.android.paybase.utils.aj.a(getContext(), 12.0f), 0, com.meituan.android.paybase.utils.aj.a(getContext(), 15.0f));
        textView.setTextColor(getResources().getColor(R.color.mpay__agreement_text_color));
        textView.setTextSize(15.0f);
        return textView;
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public static /* synthetic */ void a(VerifyBankInfoFragment verifyBankInfoFragment, List list, String str, a.c cVar, View view) {
        int i;
        TextView textView;
        LinearLayout.LayoutParams layoutParams;
        View.OnClickListener rVar;
        int i2 = 5;
        char c2 = 0;
        ?? r4 = 1;
        Object[] objArr = {verifyBankInfoFragment, list, str, cVar, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        Object obj = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ddc6c402618e6f4f1e64a1ba8cfa0f0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ddc6c402618e6f4f1e64a1ba8cfa0f0f");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_3epzlm5i", (Map<String, Object>) null);
        if (com.meituan.android.paybase.utils.i.a((Collection) list)) {
            return;
        }
        int i3 = -1;
        if (list.size() == 1) {
            String str2 = (String) view.getTag();
            com.meituan.android.paybase.common.analyse.a.a("b_hxOEn", str, cVar.b, a.EnumC0329a.CLICK, -1);
            if (!TextUtils.isEmpty(str2)) {
                al.a(verifyBankInfoFragment.getActivity(), str2);
                return;
            } else {
                com.meituan.android.paybase.common.analyse.cat.a.a("urlIsNull", "验证银行卡信息页面协议展示链接为空");
                return;
            }
        }
        LinearLayout linearLayout = new LinearLayout(verifyBankInfoFragment.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(80);
        Dialog dialog = new Dialog(verifyBankInfoFragment.getActivity(), R.style.mpay__TransparentDialog);
        int i4 = 0;
        while (i4 < list.size()) {
            Agreement agreement = (Agreement) list.get(i4);
            if (agreement != null) {
                TextView j = verifyBankInfoFragment.j();
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i3, -2);
                j.setText(agreement.getName());
                Object[] objArr2 = new Object[i2];
                objArr2[c2] = verifyBankInfoFragment;
                objArr2[r4] = dialog;
                objArr2[2] = str;
                objArr2[3] = cVar;
                objArr2[4] = agreement;
                ChangeQuickRedirect changeQuickRedirect2 = r.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e3b28285af4dadbb11b8ab6aeb3be0d6", RobustBitConfig.DEFAULT_VALUE)) {
                    rVar = (View.OnClickListener) PatchProxy.accessDispatch(objArr2, obj, changeQuickRedirect2, r4, "e3b28285af4dadbb11b8ab6aeb3be0d6");
                    layoutParams = layoutParams2;
                    textView = j;
                    i = i4;
                } else {
                    textView = j;
                    i = i4;
                    layoutParams = layoutParams2;
                    rVar = new r(verifyBankInfoFragment, dialog, str, cVar, agreement);
                }
                textView.setOnClickListener(rVar);
                linearLayout.addView(textView, layoutParams);
                if (i != list.size() - 1) {
                    View view2 = new View(verifyBankInfoFragment.getContext());
                    view2.setBackgroundResource(R.drawable.mpay__horizontal_seperator);
                    linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                }
            } else {
                i = i4;
            }
            i4 = i + 1;
            r4 = 1;
            c2 = 0;
            i2 = 5;
            i3 = -1;
            obj = null;
        }
        TextView j2 = verifyBankInfoFragment.j();
        j2.setText(IPaymentManager.NO_ACTION);
        Object[] objArr3 = {dialog};
        ChangeQuickRedirect changeQuickRedirect3 = s.a;
        j2.setOnClickListener(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "4497fe8cd54b8dfd5212ce5cc97fa2ae", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "4497fe8cd54b8dfd5212ce5cc97fa2ae") : new s(dialog));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, 30, 0, 0);
        linearLayout.addView(j2, layoutParams3);
        linearLayout.setBackgroundResource(R.color.mpay__agreement_list_bg);
        Window window = dialog.getWindow();
        window.setGravity(80);
        window.getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        dialog.setContentView(linearLayout, new ViewGroup.LayoutParams(-1, -1));
        dialog.show();
    }

    public static /* synthetic */ void a(VerifyBankInfoFragment verifyBankInfoFragment, Dialog dialog, String str, a.c cVar, Agreement agreement, View view) {
        Object[] objArr = {verifyBankInfoFragment, dialog, str, cVar, agreement, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef6ee1339e969b5272758a31f9b5374e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef6ee1339e969b5272758a31f9b5374e");
            return;
        }
        dialog.dismiss();
        com.meituan.android.paybase.common.analyse.a.a("b_hxOEn", str, cVar.b, a.EnumC0329a.CLICK, -1);
        if (!TextUtils.isEmpty(agreement.getUrl())) {
            al.a(verifyBankInfoFragment.getActivity(), agreement.getUrl());
        } else {
            com.meituan.android.paybase.common.analyse.cat.a.a("urlIsNull", "验证银行卡信息页面协议展示链接为空");
        }
    }

    public static /* synthetic */ void a(Dialog dialog, View view) {
        Object[] objArr = {dialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2023dbe1362925e107a8b011752a8f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2023dbe1362925e107a8b011752a8f1");
        } else {
            dialog.dismiss();
        }
    }

    private int k() {
        CheckBox checkBox;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "278b8bb57ee6232cf8ca322dbb325082", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "278b8bb57ee6232cf8ca322dbb325082")).intValue() : (getView() == null || (checkBox = (CheckBox) getView().findViewById(R.id.need_bind)) == null || checkBox.getVisibility() != 0 || checkBox.isChecked()) ? 1 : 0;
    }

    private String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dc63b0292401e3de4ac7fe6867f836e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dc63b0292401e3de4ac7fe6867f836e");
        }
        String b2 = com.meituan.android.pay.common.payment.utils.b.b(getActivity(), "ext_dim_stat");
        try {
            return !TextUtils.isEmpty(b2) ? new JSONObject(b2).getString("business_entry") : "";
        } catch (JSONException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "VerifyBankInfoFragment_getBindCardScene", (Map<String, Object>) null);
            return "";
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bc211898e1034b87066d3f200acd8ee", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bc211898e1034b87066d3f200acd8ee");
            return;
        }
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.paycommon.lib.utils.u.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "577343a2592311ed62aabd890a7568cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "577343a2592311ed62aabd890a7568cb");
        } else {
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            view.setFocusableInTouchMode(false);
        }
        if (view.getId() == R.id.submit_button) {
            com.meituan.android.paybase.utils.ai.a(getView());
            if (this.i != null && this.i.f) {
                this.i.a();
            }
            if (getView() != null) {
                ViewGroup viewGroup = (ViewGroup) getView().findViewById(R.id.bankinfo_container);
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    ViewGroup viewGroup2 = (ViewGroup) ((ViewGroup) viewGroup.getChildAt(i)).getChildAt(1);
                    int childCount2 = viewGroup2.getChildCount();
                    for (int i2 = 0; i2 < childCount2; i2++) {
                        View childAt = viewGroup2.getChildAt(i2);
                        if (childAt instanceof com.meituan.android.pay.widget.bankinfoitem.j) {
                            com.meituan.android.pay.widget.bankinfoitem.j jVar = (com.meituan.android.pay.widget.bankinfoitem.j) childAt;
                            if (!jVar.f() && !TextUtils.isEmpty(jVar.getMinimumContentErrorTip())) {
                                jVar.a(jVar.getMinimumContentErrorTip());
                            }
                        }
                    }
                }
                m();
            }
        }
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a22a16b205733216428fbf4a840d7ad0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a22a16b205733216428fbf4a840d7ad0");
            return;
        }
        this.e = o();
        if (getView() == null || this.e == null) {
            return;
        }
        getView().findViewById(R.id.submit_button).setEnabled(false);
        PayActivity.a(getActivity(), this.d.getSubmitUrl(), this.e, (HashMap<String, String>) null, 3, this);
        com.meituan.android.pay.utils.d.a("VerifyBankInfoFragment", this.l);
        n();
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "947fb8668302dd20cd0c7c07f2e705bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "947fb8668302dd20cd0c7c07f2e705bc");
        } else if (this.d != null) {
            com.meituan.android.paybase.common.analyse.a.a("b_wtbpr719", new a.c().a("page_name", this.d.getPageName()).b);
            if (TextUtils.equals("smscode", this.d.getPageName())) {
                com.meituan.android.paybase.common.analyse.a.a("b_kx2q9bxa", new a.c().a(KnbConstants.PARAMS_SCENE, getString(R.string.mpay__request_scene_new_card)).b);
            }
            if (TextUtils.isEmpty(this.z)) {
                return;
            }
            HashMap<String, Object> hashMap = new a.c().a("ext", this.s).a("id_bindcard", this.t).a("entry", this.v).a("trans_id", this.q).a("page_name", this.d.getPageName()).b;
            if (TextUtils.equals("smscode", this.d.getPageName())) {
                OpenWithholdInfo openWithholdInfo = this.d.getOpenWithholdInfo();
                hashMap.put("type", Integer.valueOf(openWithholdInfo != null ? openWithholdInfo.getDeductType() : -1));
                hashMap.put("mtPlanId", openWithholdInfo != null ? openWithholdInfo.getPlanId() : -999);
                hashMap.put("guide_plan_sign_merchant_no", openWithholdInfo != null ? openWithholdInfo.getSignMerchantNo() : -999);
                hashMap.put("nb_source", "walletpay-cashier");
            }
            com.meituan.android.paybase.common.analyse.a.a(this.B, this.z, "点击下一步", hashMap, a.EnumC0329a.CLICK, -1);
        }
    }

    @Override // com.meituan.android.pay.widget.EditTextWithClearAndHelpButton.d
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f472e6dfad608141f0ebf6532826c2f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f472e6dfad608141f0ebf6532826c2f4");
        } else if (getView() == null || !getView().findViewById(R.id.submit_button).isEnabled()) {
        } else {
            m();
        }
    }

    public static /* synthetic */ com.meituan.android.pay.widget.bankinfoitem.j a(VerifyBankInfoFragment verifyBankInfoFragment, BankFactor bankFactor) {
        Object[] objArr = {verifyBankInfoFragment, bankFactor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c51541552d279d75c14f89f30da0892b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.pay.widget.bankinfoitem.j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c51541552d279d75c14f89f30da0892b");
        }
        com.meituan.android.pay.widget.bankinfoitem.i iVar = new com.meituan.android.pay.widget.bankinfoitem.i(verifyBankInfoFragment.getActivity(), bankFactor, null);
        com.meituan.android.pay.widget.bankinfoitem.i iVar2 = iVar;
        iVar2.getContentEditText().setHint(verifyBankInfoFragment.getString(R.string.mpay__sms_code_hint));
        iVar2.setSMSCodeListener(verifyBankInfoFragment);
        if (bankFactor.isSent()) {
            verifyBankInfoFragment.t();
            if (verifyBankInfoFragment.d != null && "smscode".equalsIgnoreCase(verifyBankInfoFragment.d.getPageName())) {
                iVar.clearFocus();
            }
        }
        com.meituan.android.paybase.common.analyse.a.a("VerifyBankInfoFragment", "showBankFactors", "短信验证码是否已发送:" + bankFactor.isSent(), "");
        iVar2.setResendButtonTag(bankFactor.getSmscodeUrl());
        return iVar;
    }

    private HashMap<String, String> o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce4bef612285330b6d27150a5fe99097", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce4bef612285330b6d27150a5fe99097");
        }
        HashMap<String, String> a2 = com.meituan.android.pay.utils.a.a(getView());
        a(a2);
        StringBuilder sb = new StringBuilder();
        sb.append(k());
        a2.put("need_bindcard", sb.toString());
        String p = p();
        if (!TextUtils.isEmpty(p)) {
            a2.put("open_withhold_info", p);
        }
        return a2;
    }

    private String p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8be920f39e87bb641e6c31c5249912f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8be920f39e87bb641e6c31c5249912f");
        }
        if (i() && getView() != null) {
            OpenWithholdInfo openWithholdInfo = this.d.getOpenWithholdInfo();
            CheckBox checkBox = (CheckBox) getView().findViewById(R.id.open_withhold_switch);
            if (checkBox != null && checkBox.isChecked()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("deductType", openWithholdInfo.getDeductType());
                    jSONObject.put("planId", openWithholdInfo.getPlanId());
                    jSONObject.put("signMerchantNo", openWithholdInfo.getSignMerchantNo());
                    jSONObject.put("guideProductName", openWithholdInfo.getGuideProductName());
                    if (!com.meituan.android.paybase.utils.i.a((Collection) openWithholdInfo.getLabelList())) {
                        JSONArray jSONArray = new JSONArray();
                        for (CombineLabel combineLabel : openWithholdInfo.getLabelList()) {
                            if (!TextUtils.isEmpty(combineLabel.getCampaignId())) {
                                jSONArray.put(combineLabel.getCampaignId());
                            }
                        }
                        jSONObject.put("promotionInfo", jSONArray.toString());
                    }
                    return jSONObject.toString();
                } catch (JSONException e) {
                    com.meituan.android.paybase.common.analyse.a.a(e, "VerifyBankInfoFragment_genWithholdParam", (Map<String, Object>) null);
                }
            }
        }
        return null;
    }

    @Override // com.meituan.android.pay.widget.EditTextWithClearAndHelpButton.d
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ef361a8446632e73c4ca4a900d4fad0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ef361a8446632e73c4ca4a900d4fad0");
            return;
        }
        if (z) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33bf9f4dfe8c789f8ef8ec75e8cbbc52", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33bf9f4dfe8c789f8ef8ec75e8cbbc52");
            } else {
                com.meituan.android.pay.widget.bankinfoitem.i c2 = c();
                if (c2 != null) {
                    c2.c();
                }
            }
        }
        q();
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd2ea0e866d05f24d47f78285095f528", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd2ea0e866d05f24d47f78285095f528");
            return;
        }
        super.onStart();
        com.meituan.android.paybase.common.analyse.a.c("b_LTX2t", "POP", null);
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43aca4fde175204c35128b1121750a33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43aca4fde175204c35128b1121750a33");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.c("b_W9kD6", "CLOSE", null);
        super.onStop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    private void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf5540742433dd15dee3d93d6dfa38e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf5540742433dd15dee3d93d6dfa38e4");
        } else if (getView() != null) {
            ViewGroup viewGroup = (ViewGroup) getView().findViewById(R.id.bankinfo_container);
            int childCount = viewGroup.getChildCount();
            int i = 0;
            ?? r5 = 1;
            boolean z = false;
            while (i < childCount) {
                ViewGroup viewGroup2 = (ViewGroup) ((ViewGroup) viewGroup.getChildAt(i)).getChildAt(1);
                int childCount2 = viewGroup2.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount2) {
                        break;
                    }
                    View childAt = viewGroup2.getChildAt(i2);
                    if (childAt instanceof com.meituan.android.pay.widget.bankinfoitem.a) {
                        if (!((com.meituan.android.pay.widget.bankinfoitem.a) childAt).f()) {
                            break;
                        }
                        i2++;
                    } else {
                        if ((childAt instanceof com.meituan.android.pay.widget.bankinfoitem.j) && !((com.meituan.android.pay.widget.bankinfoitem.j) childAt).e()) {
                            if (childAt instanceof com.meituan.android.pay.widget.bankinfoitem.i) {
                                r5 = 0;
                                z = true;
                            }
                        }
                        i2++;
                    }
                }
                r5 = 0;
                if (r5 == 0) {
                    break;
                }
                i++;
                r5 = r5;
            }
            if (r5 != 0) {
                AgreementView agreementView = (AgreementView) getView().findViewById(R.id.mpay_agreements_layout);
                CheckBox checkBox = agreementView.getCheckBox();
                if (agreementView.getVisibility() == 0 && !checkBox.isChecked() && checkBox.getVisibility() == 0) {
                    r5 = 0;
                }
            }
            Object[] objArr2 = {Byte.valueOf((byte) r5)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40e508638454a844aeae064b72e4a7c7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40e508638454a844aeae064b72e4a7c7");
            } else if (getView() != null) {
                getView().findViewById(R.id.submit_button).setEnabled(r5);
            }
            ?? r1 = (r5 != 0 || z) ? 0 : 1;
            Object[] objArr3 = {Byte.valueOf((byte) r1)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7834c0fe88610af3b5bb0542c5a22695", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7834c0fe88610af3b5bb0542c5a22695");
                return;
            }
            com.meituan.android.pay.widget.bankinfoitem.i c2 = c();
            if (c2 != null) {
                c2.setResendButtonState(r1);
            }
        }
    }

    private void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e36359e777b48e4c6454e63efcde2818", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e36359e777b48e4c6454e63efcde2818");
        } else if (getView() != null) {
            ViewGroup viewGroup = (ViewGroup) getView().findViewById(R.id.bankinfo_container);
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewGroup viewGroup2 = (ViewGroup) ((ViewGroup) viewGroup.getChildAt(i)).getChildAt(1);
                int childCount2 = viewGroup2.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt = viewGroup2.getChildAt(i2);
                    if (childAt instanceof com.meituan.android.pay.widget.bankinfoitem.j) {
                        com.meituan.android.pay.widget.bankinfoitem.j jVar = (com.meituan.android.pay.widget.bankinfoitem.j) childAt;
                        if (TextUtils.isEmpty(jVar.l.getDefaultValue())) {
                            if (!TextUtils.equals(jVar.l.getFactorKey(), "bankcard_expire")) {
                                jVar.getEditText().requestFocus();
                            }
                            if (this.d == null || !"smscode".equalsIgnoreCase(this.d.getPageName())) {
                                return;
                            }
                            jVar.clearFocus();
                            return;
                        }
                    }
                }
            }
        }
    }

    public com.meituan.android.pay.widget.bankinfoitem.i c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f391d5233dffeea3498b2b0bf66b4566", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.pay.widget.bankinfoitem.i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f391d5233dffeea3498b2b0bf66b4566");
        }
        if (getView() == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) getView().findViewById(R.id.bankinfo_container);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup viewGroup2 = (ViewGroup) ((ViewGroup) viewGroup.getChildAt(i)).getChildAt(1);
            int childCount2 = viewGroup2.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                View childAt = viewGroup2.getChildAt(i2);
                if (childAt instanceof com.meituan.android.pay.widget.bankinfoitem.i) {
                    return (com.meituan.android.pay.widget.bankinfoitem.i) childAt;
                }
            }
        }
        return null;
    }

    @Override // com.meituan.android.pay.widget.bankinfoitem.i.a
    public final void a(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e561e4d536f17db1454872fdc63cfc20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e561e4d536f17db1454872fdc63cfc20");
            return;
        }
        t();
        com.meituan.android.pay.common.payment.utils.b.a(getActivity(), "current_url", str);
        ((PayRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(PayRequestService.class, this, 2)).sendSMSCode(str, com.meituan.android.pay.common.payment.utils.b.c(getActivity()), o(), null, !TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.a(getActivity())) ? com.meituan.android.pay.common.payment.utils.b.a(getActivity()) : com.meituan.android.pay.common.payment.utils.b.b(getActivity(), "nb_source"), com.meituan.android.paycommon.lib.config.a.a().o());
        com.meituan.android.paybase.common.analyse.a.a("VerifyBankInfoFragment", "sendVerifyCode", "url:" + str, "");
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26d48d1fd50ea76f96de1eab8c18336d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26d48d1fd50ea76f96de1eab8c18336d");
        } else if (i == 3) {
            this.j.a();
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e1690104e520cf36dc0506494a3e2a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e1690104e520cf36dc0506494a3e2a8");
        } else if (i == 3) {
            this.j.b();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "215265238006aa6715481e7f8b264db2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "215265238006aa6715481e7f8b264db2");
            } else if (getView() != null) {
                getView().findViewById(R.id.submit_button).setEnabled(true);
            }
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestSucc(int i, Object obj) {
        int color;
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22e8822031044ad2de7ad6fa191024d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22e8822031044ad2de7ad6fa191024d3");
        } else if (2 == i) {
            if (obj != null) {
                SMSCodeResult sMSCodeResult = (SMSCodeResult) obj;
                if (!TextUtils.isEmpty(sMSCodeResult.getSmsMessage()) && TextUtils.isEmpty(this.d.getVoiceCodeTip())) {
                    com.meituan.android.paybase.dialog.e.a((Activity) getActivity(), (Object) sMSCodeResult.getSmsMessage(), false);
                }
                com.meituan.android.paybase.common.analyse.a.a("b_p2b10mbj", (Map<String, Object>) null);
            }
        } else if (3 == i) {
            if (obj != null) {
                com.meituan.android.paybase.common.analyse.a.a("b_gitig6sa", (Map<String, Object>) null);
                BankInfo bankInfo = (BankInfo) obj;
                if (bankInfo.getCardBinFail() != null && !TextUtils.isEmpty(bankInfo.getCardBinFail().getSubmitUrl())) {
                    PayActivity.a(getActivity(), bankInfo.getCardBinFail().getSubmitUrl(), (HashMap<String, String>) null, (HashMap<String, String>) null, 3, this);
                } else if (bankInfo.getPromotion() != null && bankInfo.getPromotion().getDynamicLayout() != null) {
                    if (getActivity() != null && com.meituan.android.pay.desk.component.data.a.b(getActivity())) {
                        com.meituan.android.pay.process.g.a(getActivity(), (Object) bankInfo);
                        return;
                    }
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_qrzjfo8j_mc", new a.c().a("verify_type", "-999").a("pay_type", "cardpay").a("is_payed", 2).b);
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_yfvqinj0_mc", "绑卡成功", new a.c().a("id_bindcard", this.t).a("entry", this.v).a("trans_id", this.q).b, a.EnumC0329a.CLICK, -1);
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_tx5qvv3r_mv", "绑卡后营销弹窗", new a.c().a("id_bindcard", this.t).a("entry", this.v).a("trans_id", this.q).b, a.EnumC0329a.VIEW, -1);
                    if (com.meituan.android.paycommon.lib.utils.i.a(bankInfo.getPromotion())) {
                        com.meituan.android.paycommon.lib.utils.i.a(getActivity(), bankInfo.getPromotion(), this.q, 100);
                        return;
                    }
                    PaymentDialogFragment.a(getActivity(), bankInfo.getPromotion().getDynamicLayout(), null, this.q, bankInfo.getPromotion().getHybridUrl(), bankInfo.getPromotion().getHybridLoadingTime(), this);
                    com.meituan.android.paybase.common.analyse.a.a("b_d1fnumq6", (Map<String, Object>) null);
                } else {
                    if (bankInfo.isBinded()) {
                        com.meituan.android.paybase.common.analyse.a.a("b_9wqkgl6f", (Map<String, Object>) null);
                        com.meituan.android.paybase.common.analyse.a.a("b_pay_yfvqinj0_mc", "绑卡成功", new a.c().a("id_bindcard", this.t).a("entry", this.v).a("trans_id", this.q).b, a.EnumC0329a.CLICK, -1);
                        if (bankInfo.getNoPasswordGuice() != null || (bankInfo.getFingerprintPay() != null && bankInfo.getFingerprintPay().getOpenFingerprintPayGuideResponse() != null && com.meituan.android.paybase.fingerprint.util.c.a())) {
                            bankInfo.setExtraParams(this.e);
                        } else if (getContext() != null) {
                            com.meituan.android.paybase.dialog.e.a(getActivity(), !TextUtils.isEmpty(bankInfo.getPageMessage()) ? bankInfo.getPageMessage() : getResources().getString(R.string.mpay__bind_card_success_toast), e.a.TOAST_TYPE_SUCCESS);
                            PayActivity.a(getActivity());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        bankInfo.setExtraParams(this.e);
                        if (com.meituan.android.pay.desk.component.data.a.b(getActivity()) && com.meituan.android.pay.utils.c.h(bankInfo)) {
                            com.meituan.android.pay.process.g.a(getActivity(), (Object) bankInfo);
                            return;
                        }
                    }
                    com.meituan.android.pay.process.f.a((Activity) getActivity()).c(getActivity(), bankInfo);
                }
            }
        } else if (i != 0 || obj == null || getContext() == null) {
        } else {
            this.l = true;
            View view = getView();
            CardBinTip cardBinTip = (CardBinTip) obj;
            Object[] objArr2 = {view, cardBinTip};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72ab784ba40cac133bec646491ccaca5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72ab784ba40cac133bec646491ccaca5");
            } else if (view != null) {
                view.findViewById(R.id.bank_tips).setVisibility(0);
                if (!TextUtils.isEmpty(cardBinTip.getIcon())) {
                    view.findViewById(R.id.bank_icon).setVisibility(0);
                    com.meituan.android.paycommon.lib.utils.w.a(cardBinTip.getIcon(), (ImageView) view.findViewById(R.id.bank_icon));
                } else {
                    view.findViewById(R.id.bank_icon).setVisibility(8);
                }
                TextView textView = (TextView) view.findViewById(R.id.bank_name);
                if (!TextUtils.isEmpty(cardBinTip.getName())) {
                    textView.setVisibility(0);
                    textView.setText(cardBinTip.getName());
                    if (!TextUtils.isEmpty(cardBinTip.getNameColor())) {
                        String nameColor = cardBinTip.getNameColor();
                        if (nameColor.charAt(0) != '#') {
                            nameColor = "#" + nameColor;
                        }
                        try {
                            color = Color.parseColor(nameColor);
                        } catch (Exception e) {
                            com.meituan.android.pay.common.analyse.b.b("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "VerifyBankInfoFragment_showBankInfoView").a("message", e.getMessage()).b, r());
                            color = ContextCompat.getColor(getContext(), R.color.paybase__text_color_3);
                        }
                    } else {
                        color = ContextCompat.getColor(getContext(), R.color.paybase__text_color_3);
                    }
                    textView.setTextColor(color);
                    if (Build.VERSION.SDK_INT <= 16) {
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                        layoutParams.addRule(9);
                        textView.setLayoutParams(layoutParams);
                    }
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_805zvcwl_mv", "卡bin识别曝光", new a.c().a("id_bindcard", this.t).a("bankName", cardBinTip.getName()).a("entry", this.v).a("trans_id", this.q).b, a.EnumC0329a.CLICK, -1);
                } else {
                    textView.setVisibility(8);
                }
                PayLabelContainer payLabelContainer = (PayLabelContainer) view.findViewById(R.id.discount_labels);
                if (!com.meituan.android.paybase.utils.i.a((Collection) cardBinTip.getLabels())) {
                    payLabelContainer.setVisibility(0);
                    payLabelContainer.a(cardBinTip.getLabels(), 3);
                } else {
                    payLabelContainer.setVisibility(8);
                }
                FragmentActivity activity = getActivity();
                PaymentReduce paymentReduce = cardBinTip.getPaymentReduce();
                Object[] objArr3 = {activity, paymentReduce};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.pay.utils.e.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "227fa33bb28888b0d5c22ee94f8c4522", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "227fa33bb28888b0d5c22ee94f8c4522");
                } else if (paymentReduce != null) {
                    ReduceInfo noBalanceReduceInfo = paymentReduce.getNoBalanceReduceInfo();
                    if (noBalanceReduceInfo != null) {
                        com.meituan.android.pay.common.payment.utils.b.a(activity, "cashticket_code", noBalanceReduceInfo.getCashTicketId());
                        com.meituan.android.pay.common.payment.utils.b.a(activity, "campaign_id", noBalanceReduceInfo.getCampaignId());
                    }
                } else {
                    com.meituan.android.pay.utils.e.b(activity);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.check_bank_limit);
                TextView textView3 = (TextView) view.findViewById(R.id.bank_limit);
                if (cardBinTip.getLimit() != null) {
                    int color2 = ContextCompat.getColor(getContext(), R.color.mpay_card_bin_overlimit_color);
                    if (!TextUtils.isEmpty(cardBinTip.getLimit().getTip())) {
                        textView3.setVisibility(0);
                        textView3.setText(cardBinTip.getLimit().getTip());
                        if (Build.VERSION.SDK_INT <= 16) {
                            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                            layoutParams2.addRule(1, R.id.bank_name);
                            textView3.setLayoutParams(layoutParams2);
                        }
                    } else {
                        textView3.setVisibility(8);
                    }
                    if (!this.m) {
                        if (!TextUtils.isEmpty(cardBinTip.getLimit().getText())) {
                            textView2.setVisibility(0);
                            textView2.setText(cardBinTip.getLimit().getText());
                            Object[] objArr4 = {this, cardBinTip};
                            ChangeQuickRedirect changeQuickRedirect4 = q.a;
                            textView2.setOnClickListener(PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "58f9c627d0f0139c366593d1a6e4a5de", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "58f9c627d0f0139c366593d1a6e4a5de") : new q(this, cardBinTip));
                            com.meituan.android.paybase.common.analyse.a.a("b_pay_ubnoci4i_mv", "查看支持银行", new a.c().a("id_bindcard", this.t).a("entry", this.v).a("trans_id", this.q).b, a.EnumC0329a.VIEW, -1);
                        } else {
                            textView2.setVisibility(8);
                        }
                    }
                    textView.setTextColor(color2);
                    return;
                }
                textView3.setVisibility(8);
                if (this.m) {
                    return;
                }
                textView2.setVisibility(8);
            }
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3101e0182adeb6be303201981787e951", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3101e0182adeb6be303201981787e951");
        } else if (this.d.isPayed()) {
            com.meituan.android.pay.utils.s.a(getActivity(), exc, 1);
        } else if (i == 0) {
            this.l = true;
            View view = getView();
            if (!(exc instanceof PayException) || view == null || getContext() == null) {
                return;
            }
            if (com.meituan.android.paycommon.lib.utils.d.a(exc)) {
                view.findViewById(R.id.bank_name).setVisibility(0);
                ((TextView) view.findViewById(R.id.bank_name)).setTextColor(ContextCompat.getColor(getContext(), R.color.mpay__cannot_know_bank));
                ((TextView) view.findViewById(R.id.bank_name)).setText(exc.getMessage());
                view.findViewById(R.id.bank_icon).setVisibility(8);
                view.findViewById(R.id.bank_limit).setVisibility(8);
                if (!this.m) {
                    view.findViewById(R.id.check_bank_limit).setVisibility(8);
                    view.findViewById(R.id.bank_tips).setVisibility(8);
                }
                view.findViewById(R.id.discount_labels).setVisibility(8);
            } else if (((PayException) exc).getCode() == 118051) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26ba371081d7815dd0c1fe17fdf6a642", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26ba371081d7815dd0c1fe17fdf6a642");
                } else if (view != null) {
                    view.findViewById(R.id.bank_name).setVisibility(8);
                    view.findViewById(R.id.bank_icon).setVisibility(8);
                    view.findViewById(R.id.bank_limit).setVisibility(8);
                    if (!this.m) {
                        view.findViewById(R.id.check_bank_limit).setVisibility(8);
                        view.findViewById(R.id.bank_tips).setVisibility(8);
                    }
                    view.findViewById(R.id.discount_labels).setVisibility(8);
                }
            }
            PayException payException = (PayException) exc;
            com.meituan.android.paybase.common.analyse.a.a("b_ddzetyxk", new a.c().a("code", Integer.valueOf(payException.getCode())).a("message", payException.getErrorCodeStr()).a("level", Integer.valueOf(payException.getLevel())).b);
        } else if (3 == i) {
            boolean z = exc instanceof PayException;
            if (z) {
                final PayException payException2 = (PayException) exc;
                if (com.meituan.android.pay.utils.h.a(getActivity(), payException2)) {
                    if (com.meituan.android.pay.desk.component.data.a.b(getActivity())) {
                        com.meituan.android.pay.common.payment.utils.b.a(getActivity(), "degrade_campaign_url", com.meituan.android.pay.common.payment.utils.b.b(getActivity(), "current_url"));
                        com.meituan.android.pay.process.g.a(getActivity(), (Object) exc);
                        return;
                    }
                    Object[] objArr3 = {payException2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c3c41304af5aebb09002d76642e5d3f6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c3c41304af5aebb09002d76642e5d3f6");
                        return;
                    }
                    new DiscountDowngradeDialog(getContext(), com.meituan.android.pay.utils.h.a(payException2), new DiscountDowngradeDialog.a() { // from class: com.meituan.android.pay.fragment.VerifyBankInfoFragment.4
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.pay.hellodialog.DiscountDowngradeDialog.a
                        public final void a() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8a3532f7c2bb2ff932e07c9a1e54a508", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8a3532f7c2bb2ff932e07c9a1e54a508");
                                return;
                            }
                            com.meituan.android.pay.utils.e.c(VerifyBankInfoFragment.this.getActivity());
                            String b2 = com.meituan.android.pay.common.payment.utils.b.b(VerifyBankInfoFragment.this.getActivity(), "current_url");
                            if (!TextUtils.isEmpty(b2)) {
                                PayActivity.a(VerifyBankInfoFragment.this.getActivity(), b2, VerifyBankInfoFragment.this.e, (HashMap<String, String>) null, 3, VerifyBankInfoFragment.this);
                            }
                            com.meituan.android.paybase.common.analyse.a.a("b_pay_ovwlfccy_mc", new a.c().a("trans_id", com.meituan.android.paybase.common.analyse.b.b).a(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, Integer.valueOf(payException2.getCode())).b);
                        }

                        @Override // com.meituan.android.pay.hellodialog.DiscountDowngradeDialog.a
                        public final void b() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4aef759bd9a7ca4875a2d96d24106e0b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4aef759bd9a7ca4875a2d96d24106e0b");
                                return;
                            }
                            com.meituan.android.pay.utils.s.a((Activity) VerifyBankInfoFragment.this.getActivity(), payException2, 3);
                            com.meituan.android.paybase.common.analyse.a.a("b_pay_t3anxiv9_mc", new a.c().a("trans_id", com.meituan.android.paybase.common.analyse.b.b).a(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, Integer.valueOf(payException2.getCode())).b);
                        }
                    }).show();
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_f2sw3e84_mv", new a.c().a("trans_id", com.meituan.android.paybase.common.analyse.b.b).a(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, Integer.valueOf(payException2.getCode())).b);
                    return;
                }
            }
            if (com.meituan.android.paycommon.lib.utils.d.a(exc)) {
                if (getView() != null) {
                    ViewGroup viewGroup = (ViewGroup) getView().findViewById(R.id.bankinfo_container);
                    String a2 = com.meituan.android.pay.utils.d.a((PayException) exc, "factor_key", r());
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        ViewGroup viewGroup2 = (ViewGroup) ((ViewGroup) viewGroup.getChildAt(i2)).getChildAt(1);
                        int childCount2 = viewGroup2.getChildCount();
                        for (int i3 = 0; i3 < childCount2; i3++) {
                            View childAt = viewGroup2.getChildAt(i3);
                            if (childAt instanceof com.meituan.android.pay.widget.bankinfoitem.j) {
                                com.meituan.android.pay.widget.bankinfoitem.j jVar = (com.meituan.android.pay.widget.bankinfoitem.j) childAt;
                                if (jVar.l != null && jVar.l.getFactorKey() != null && jVar.l.getFactorKey().equals(a2)) {
                                    jVar.a(exc.getMessage());
                                    return;
                                }
                            }
                        }
                    }
                }
                if (z) {
                    com.meituan.android.paybase.dialog.e.a(getActivity(), exc.getMessage(), ((PayException) exc).getErrorCodeStr());
                } else {
                    com.meituan.android.paybase.dialog.e.a((Activity) getActivity(), (Object) exc.getMessage());
                }
            } else {
                AtomicInteger atomicInteger = new AtomicInteger();
                if (z) {
                    atomicInteger.set(((PayException) exc).getCode());
                }
                if (123002 == atomicInteger.get()) {
                    String a3 = com.meituan.android.pay.utils.d.a((PayException) exc, "error_to_url", r());
                    if (!TextUtils.isEmpty(a3)) {
                        al.a(this, a3, 6851);
                        com.meituan.android.paybase.common.analyse.a.a("b_pay_gqim6s44_mv", "请求验证儿童保护", new a.c().a("id_bindcard", this.t).a("entry", this.v).a("trans_id", this.q).b, a.EnumC0329a.CLICK, -1);
                    } else {
                        com.meituan.android.pay.utils.s.a(getActivity(), exc, 3);
                    }
                } else {
                    com.meituan.android.pay.utils.s.a(getActivity(), exc, 3);
                }
            }
            com.meituan.android.pay.utils.d.a(exc);
        } else {
            com.meituan.android.pay.utils.s.a(getActivity(), exc, 3);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e32e038e86523c7e593cd08cf92f1a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e32e038e86523c7e593cd08cf92f1a8");
            return;
        }
        super.onDestroy();
        com.meituan.android.pay.utils.d.c();
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ed6141cd1cad6c3ef4e392a682aa3fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ed6141cd1cad6c3ef4e392a682aa3fa");
            return;
        }
        super.onPause();
        com.meituan.android.paybase.utils.ab.a((Activity) getActivity());
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Object[] objArr = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd130c053ecfc2da73286bbe28b0fe83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd130c053ecfc2da73286bbe28b0fe83");
        } else {
            q();
        }
    }

    @Override // com.meituan.android.pay.widget.EditTextWithClearAndHelpButton.b
    public final boolean a(EditTextWithClearAndHelpButton editTextWithClearAndHelpButton) {
        Object[] objArr = {editTextWithClearAndHelpButton};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fc36bc0b63c3f296f20efbb93aa48ba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fc36bc0b63c3f296f20efbb93aa48ba")).booleanValue();
        }
        if (this.i != null) {
            this.i.a();
        }
        com.meituan.android.paybase.common.analyse.a.a("b_p2pv8pc8", "点击相机按钮", new a.c().a("id_bindcard", this.t).a("entry", this.v).a("trans_id", this.q).b, a.EnumC0329a.CLICK, -1);
        if ("b".equals(com.meituan.android.pay.utils.q.a(getContext(), r()))) {
            getActivity().onBackPressed();
            com.meituan.android.paybase.common.analyse.a.a("b_0ks9ey72", (Map<String, Object>) null);
        } else {
            Uri.Builder buildUpon = Uri.parse("meituanpayment://pay/scancardnumber/launch").buildUpon();
            if (!TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.b(getActivity(), "trans_id")) && !TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.b(getActivity(), "pay_token"))) {
                buildUpon.appendQueryParameter("trans_id", com.meituan.android.pay.common.payment.utils.b.b(getActivity(), "trans_id")).appendQueryParameter("pay_token", com.meituan.android.pay.common.payment.utils.b.b(getActivity(), "pay_token"));
            }
            buildUpon.appendQueryParameter("userid", com.meituan.android.pay.common.payment.utils.b.b(getActivity(), "userid"));
            com.meituan.android.paybase.utils.j.a(this, buildUpon.toString(), 4657);
        }
        this.p = editTextWithClearAndHelpButton;
        return true;
    }

    @Override // com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a
    public void onClickCouponDialogConfirm() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb58c85a184de48fed3c1728c2b1ff57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb58c85a184de48fed3c1728c2b1ff57");
        } else if (getActivity() instanceof com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a) {
            ((com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a) getActivity()).onClickCouponDialogConfirm();
        } else {
            PayActivity.a(getActivity());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends CountDownTimer {
        public static ChangeQuickRedirect a;
        public WeakReference<com.meituan.android.pay.utils.r> b;
        public WeakReference<VerifyBankInfoFragment> c;

        public a(long j, long j2, com.meituan.android.pay.utils.r rVar, VerifyBankInfoFragment verifyBankInfoFragment) {
            super(LocationStrategy.LOCATION_TIMEOUT, 1000L);
            Object[] objArr = {Long.valueOf((long) LocationStrategy.LOCATION_TIMEOUT), 1000L, rVar, verifyBankInfoFragment};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e3e9bbf804c840ccbd44b30cf7a0541", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e3e9bbf804c840ccbd44b30cf7a0541");
                return;
            }
            this.b = new WeakReference<>(rVar);
            this.c = new WeakReference<>(verifyBankInfoFragment);
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d728e117867bed8c1070a8e9a7ae3bb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d728e117867bed8c1070a8e9a7ae3bb");
                return;
            }
            VerifyBankInfoFragment verifyBankInfoFragment = this.c.get();
            com.meituan.android.pay.utils.r rVar = this.b.get();
            if (verifyBankInfoFragment == null || !verifyBankInfoFragment.isAdded() || rVar == null) {
                return;
            }
            rVar.a(j / 1000);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a25c22ed6c546262f009620a8ac9bc9a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a25c22ed6c546262f009620a8ac9bc9a");
                return;
            }
            VerifyBankInfoFragment verifyBankInfoFragment = this.c.get();
            com.meituan.android.pay.utils.r rVar = this.b.get();
            if (verifyBankInfoFragment == null || !verifyBankInfoFragment.isAdded() || rVar == null) {
                return;
            }
            rVar.a(-1L);
            com.meituan.android.paybase.common.analyse.a.a("VerifyBankInfoFragment", "ResendCountDownTimer", "onFinish", "");
        }
    }

    private void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64f98023e56cc4fdd76aca9be6864c75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64f98023e56cc4fdd76aca9be6864c75");
            return;
        }
        if (this.g != null) {
            this.g.cancel();
        }
        this.g = new a(LocationStrategy.LOCATION_TIMEOUT, 1000L, this.f, this);
        this.g.start();
    }

    private void a(HashMap<String, String> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd1199cf04f37c7d6c2969edd03145af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd1199cf04f37c7d6c2969edd03145af");
        } else if (getView() != null) {
            LinearLayout linearLayout = (LinearLayout) getView().findViewById(R.id.read_only_bankinfo_container);
            for (int i = 0; i < linearLayout.getChildCount(); i++) {
                ViewGroup viewGroup = (ViewGroup) linearLayout.getChildAt(i);
                if (hashMap != null) {
                    hashMap.put((String) viewGroup.getTag(), ((TextView) viewGroup.findViewById(R.id.readonly_value)).getText().toString().trim().replaceAll(StringUtil.SPACE, ""));
                }
            }
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment
    public final boolean h() {
        boolean z;
        HashMap hashMap;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72b7f95b33a9565baad19c9b6bb1a540", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72b7f95b33a9565baad19c9b6bb1a540")).booleanValue();
        }
        com.meituan.android.paybase.common.analyse.a.a("b_7gfawz34", (Map<String, Object>) null);
        if (!TextUtils.isEmpty(this.A)) {
            com.meituan.android.paybase.common.analyse.a.a(this.A, "点击返回", new a.c().a("ext", this.s).a("id_bindcard", this.t).a("entry", this.v).a("trans_id", this.q).a("page_name", this.d.getPageName()).b, a.EnumC0329a.CLICK, -1);
        }
        if (this.d.isPayed()) {
            PayActivity.a(getActivity());
            return true;
        } else if (this.d.getPopWindowInfo() != null) {
            PopWindowInfo popWindowInfo = this.d.getPopWindowInfo();
            Object[] objArr2 = {popWindowInfo};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.pay.utils.c.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7031ff9948e1cb43773abc25dcd0b750", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7031ff9948e1cb43773abc25dcd0b750")).booleanValue();
            } else {
                z = (popWindowInfo == null || TextUtils.isEmpty(popWindowInfo.getTitle()) || TextUtils.isEmpty(popWindowInfo.getLeftButton()) || TextUtils.isEmpty(popWindowInfo.getRightButton())) ? false : true;
            }
            if (z && this.o) {
                PopWindowInfo popWindowInfo2 = this.d.getPopWindowInfo();
                ArrayList<QuickBankDetail> arrayList = this.r;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "606a1af021c733c09e50755145fc4077", RobustBitConfig.DEFAULT_VALUE)) {
                    hashMap = (HashMap) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "606a1af021c733c09e50755145fc4077");
                } else {
                    hashMap = new HashMap();
                    hashMap.put("tradeNo", this.d.getTradeNo());
                    hashMap.put("entry", this.v);
                    hashMap.put("trans_id", this.q);
                    hashMap.put("nb_version", "10.1.0");
                    hashMap.put("nb_source", "walletpay-cashier");
                    hashMap.put("merchant_id", "-999");
                    hashMap.put("merchant_no", "-999");
                }
                final QuickBindCardDetainDialogFragment a2 = QuickBindCardDetainDialogFragment.a(popWindowInfo2, arrayList, hashMap);
                a2.b = new QuickBindCardDetainDialogFragment.a() { // from class: com.meituan.android.pay.fragment.VerifyBankInfoFragment.5
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.pay.dialogfragment.QuickBindCardDetainDialogFragment.a
                    public final void a(ProtocolSign protocolSign) {
                        Object[] objArr4 = {protocolSign};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3231d21d057f97fa8024b275a01d1a3a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3231d21d057f97fa8024b275a01d1a3a");
                        } else {
                            VerifyBankInfoFragment.a(VerifyBankInfoFragment.this, protocolSign);
                        }
                    }
                };
                a2.c = new View.OnClickListener() { // from class: com.meituan.android.pay.fragment.VerifyBankInfoFragment.6
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ActionBar supportActionBar;
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e8ee27fa21083d9b904e9c6d6f3d5d3b", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e8ee27fa21083d9b904e9c6d6f3d5d3b");
                            return;
                        }
                        if (VerifyBankInfoFragment.this.getActivity() != null && (supportActionBar = ((BaseActivity) VerifyBankInfoFragment.this.getActivity()).getSupportActionBar()) != null) {
                            supportActionBar.c();
                        }
                        a2.dismiss();
                        com.meituan.android.paycommon.lib.utils.h.a(VerifyBankInfoFragment.this.getActivity());
                    }
                };
                a2.a(getFragmentManager());
                this.o = false;
                return true;
            }
            u();
            return true;
        } else if (this.d.getCancelAlert() != null && !TextUtils.isEmpty(this.d.getCancelAlert().getCancelTip()) && this.d.getCancelAlert().isBindCardProcess() && getContext() != null) {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "38610aca9ef33abd6b6f5bdef70eb6c4", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "38610aca9ef33abd6b6f5bdef70eb6c4")).booleanValue();
            }
            BasePayDialog.b c2 = new PayDialog.a(getActivity()).c(this.d.getCancelAlert().getCancelTip());
            String leftButton = this.d.getCancelAlert().getLeftButton();
            Object[] objArr5 = {this};
            ChangeQuickRedirect changeQuickRedirect5 = n.a;
            BasePayDialog.b a3 = c2.a(leftButton, PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "587144a4b3be2e80d6300379ceb6de64", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "587144a4b3be2e80d6300379ceb6de64") : new n(this));
            String rightButton = this.d.getCancelAlert().getRightButton();
            Object[] objArr6 = {this};
            ChangeQuickRedirect changeQuickRedirect6 = o.a;
            a3.b(rightButton, PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "1b345479a6438e945ddcb153f05234d2", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "1b345479a6438e945ddcb153f05234d2") : new o(this)).a(false).b(true).a(BasePayDialog.a.DIFF).a().show();
            com.meituan.android.paybase.common.analyse.a.a("b_pay_e1q4kyaw_mv", (String) null, new a.c().a("id_bindcard", this.t).a("entry", this.v).a("trans_id", this.q).b, a.EnumC0329a.VIEW, -1);
            return true;
        } else {
            u();
            return true;
        }
    }

    public static /* synthetic */ void b(VerifyBankInfoFragment verifyBankInfoFragment, Dialog dialog) {
        Object[] objArr = {verifyBankInfoFragment, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "806e4a2c4a23f50878e422e8d2ee9489", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "806e4a2c4a23f50878e422e8d2ee9489");
            return;
        }
        if (dialog != null) {
            dialog.dismiss();
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_x5sxapax_mc", "卡号输入页_挽留弹窗_点击 确认放弃 ", new a.c().a("id_bindcard", verifyBankInfoFragment.t).a("entry", verifyBankInfoFragment.v).a("trans_id", verifyBankInfoFragment.q).b, a.EnumC0329a.CLICK, -1);
        verifyBankInfoFragment.u();
    }

    public static /* synthetic */ void a(VerifyBankInfoFragment verifyBankInfoFragment, Dialog dialog) {
        Object[] objArr = {verifyBankInfoFragment, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d18dff6bf75d302a360f05081e6f45f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d18dff6bf75d302a360f05081e6f45f3");
            return;
        }
        if (dialog != null) {
            dialog.dismiss();
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_eb4ej3oq_mc", "卡号输入页_挽留弹窗_点击 继续支付 ", new a.c().a("id_bindcard", verifyBankInfoFragment.t).a("entry", verifyBankInfoFragment.v).a("trans_id", verifyBankInfoFragment.q).b, a.EnumC0329a.CLICK, -1);
    }

    private void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "051b43efb831a6743354bedbaba07426", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "051b43efb831a6743354bedbaba07426");
        } else if (com.meituan.android.pay.desk.component.data.a.b(getActivity()) && getActivity() != null && !getActivity().isFinishing()) {
            com.meituan.android.pay.process.g.a(getActivity(), (Object) null);
        } else if (this.d != null && this.d.isCardBinPage() && !com.meituan.android.pay.desk.component.data.b.f(getActivity())) {
            PayActivity.b(getActivity(), "退出签约支付", PayErrorCode.VERIFY_BANK_INFO_CANCEL);
        } else {
            if (getView() != null) {
                com.meituan.android.paybase.utils.ai.a(getView());
            }
            if (v()) {
                PayActivity.b(getActivity(), "退出签约支付", PayErrorCode.VERIFY_BANK_INFO_CANCEL);
            } else {
                com.meituan.android.paycommon.lib.utils.h.a(getActivity());
            }
        }
    }

    private boolean v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bac6469cb316f69776c0c75a8b5a215", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bac6469cb316f69776c0c75a8b5a215")).booleanValue() : (getActivity() == null || getActivity().getSupportFragmentManager() == null || getActivity().getSupportFragmentManager().getBackStackEntryCount() > 1) ? false : true;
    }

    private void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e30e09ea52f7d2bddabc685f26fb1ab5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e30e09ea52f7d2bddabc685f26fb1ab5");
            return;
        }
        this.n = false;
        if (getView() == null) {
            return;
        }
        View findViewById = getView().findViewById(R.id.mpay__quickbind);
        QuickBankInfo quickBankInfo = this.d.getQuickBankInfo();
        if (quickBankInfo == null) {
            findViewById.setVisibility(8);
            return;
        }
        this.r = new ArrayList<>();
        for (QuickBankDetail quickBankDetail : quickBankInfo.getBankListInfo()) {
            if (quickBankDetail != null && (quickBankDetail.isAvailableToShow() || quickBankDetail.getProtocolSign() != null)) {
                this.r.add(quickBankDetail);
            }
        }
        if (com.meituan.android.paybase.utils.i.a((Collection) this.r)) {
            this.n = false;
            findViewById.setVisibility(8);
            return;
        }
        this.n = true;
        findViewById.setVisibility(0);
        TextView textView = (TextView) getView().findViewById(R.id.quickbind_tip);
        TextView textView2 = (TextView) getView().findViewById(R.id.mpay__quickbind_title);
        QuickBankTip quickBankTip = quickBankInfo.getQuickBankTip();
        if (quickBankTip != null) {
            if (!TextUtils.isEmpty(quickBankTip.getTip())) {
                getView().findViewById(R.id.mpay__quickbind_title_layout).setVisibility(0);
                textView.setText(quickBankTip.getTip());
            }
            textView2.setText(quickBankTip.getTitle());
        }
        a((LinearLayout) getView().findViewById(R.id.mpay__quickbind_buttons), this.r);
        if (this.i == null || !this.i.f) {
            return;
        }
        this.i.a();
    }

    private void a(LinearLayout linearLayout, List<QuickBankDetail> list) {
        Object[] objArr = {linearLayout, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2388d232fcaf046f6a74627c0f8ee6e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2388d232fcaf046f6a74627c0f8ee6e0");
        } else if (linearLayout != null && !com.meituan.android.paybase.utils.i.a((Collection) list)) {
            for (final QuickBankDetail quickBankDetail : list) {
                if (quickBankDetail != null) {
                    View inflate = LayoutInflater.from(getContext()).inflate(R.layout.mpay__quickbind_button, (ViewGroup) linearLayout, false);
                    com.meituan.android.paycommon.lib.utils.w.a(quickBankDetail.getIcon(), (ImageView) inflate.findViewById(R.id.quickbind_button_icon));
                    TextView textView = (TextView) inflate.findViewById(R.id.quickbind_button_content);
                    linearLayout.addView(inflate);
                    textView.setText(quickBankDetail.getName());
                    textView.setOnClickListener(new com.meituan.android.paycommon.lib.widgets.g() { // from class: com.meituan.android.pay.fragment.VerifyBankInfoFragment.7
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.paycommon.lib.widgets.g
                        public final void a(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d876539d0ebf5ac2907203820ec90d6e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d876539d0ebf5ac2907203820ec90d6e");
                                return;
                            }
                            String str = null;
                            if (quickBankDetail.getProtocolSign() != null) {
                                VerifyBankInfoFragment.a(VerifyBankInfoFragment.this, quickBankDetail.getProtocolSign());
                            } else if (quickBankDetail.isOnApp()) {
                                try {
                                    VerifyBankInfoFragment.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.valueOf(quickBankDetail.getFirstBankDetailExtra().get("url")))));
                                } catch (Exception e) {
                                    com.meituan.android.paybase.dialog.e.a((Activity) VerifyBankInfoFragment.this.getActivity(), (Object) VerifyBankInfoFragment.this.getString(R.string.mpay__model_d_error_toast));
                                    com.meituan.android.paybase.common.analyse.a.a(e, "VerifyBankInfoFragment_addQuickBindButton", (Map<String, Object>) null);
                                }
                                str = "app";
                            } else if (quickBankDetail.isH5Available(quickBankDetail.getFirstBankDetailExtra())) {
                                str = "h5";
                                al.a(VerifyBankInfoFragment.this.getActivity(), String.valueOf(quickBankDetail.getFirstBankDetailExtra().get("h5Url")));
                            }
                            VerifyBankInfoFragment.a(VerifyBankInfoFragment.this, quickBankDetail.getName(), str);
                        }
                    });
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_ogjddygn_mv", (String) null, new a.c().a("bankName", quickBankDetail.getName()).a("id_bindcard", this.t).a("entry", this.v).a("BIND_TYPE", !TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.b(getActivity(), "pay_token")) ? b : c).b, a.EnumC0329a.VIEW, -1);
                }
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    @MTPaySuppressFBWarnings({"SIC_INNER_SHOULD_BE_STATIC_ANON"})
    public void onActivityResult(int i, int i2, Intent intent) {
        Serializable serializable;
        int i3 = 1;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2160c035b907e0ea0aaa6a1ec614055e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2160c035b907e0ea0aaa6a1ec614055e");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        if (i == 4657) {
            if (i2 == -1 && intent != null) {
                String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "cardNum");
                if (this.p != null) {
                    this.p.post(p.a(this));
                    this.p.setText(a2);
                }
            }
        } else if (i == 6851) {
            String a3 = intent != null ? com.sankuai.waimai.platform.utils.f.a(intent, "resultData") : "";
            com.meituan.android.paybase.common.analyse.a.a("b_pay_kocrmvr8_mv", "请求验证儿童保护结果", new a.c().a("id_bindcard", this.t).a("entry", this.v).a("trans_id", this.q).a("result", a3).b, a.EnumC0329a.CLICK, -1);
            if (i2 == 200 && !TextUtils.isEmpty(a3)) {
                try {
                    if (TextUtils.equals("success", new JSONObject(a3).getString("status"))) {
                        m();
                    }
                } catch (Exception e) {
                    com.meituan.android.paybase.common.analyse.a.a(e, "VerifyBankInfoFragment_onActivityResult", (Map<String, Object>) null);
                }
            }
        } else if (i == 10) {
            String sharedValue = StorageUtil.getSharedValue(getContext(), "quickBindcardAndPayResult");
            StorageUtil.clearShareValue(getContext(), "quickBindcardAndPayResult");
            if (!TextUtils.isEmpty(sharedValue)) {
                if (TextUtils.equals("cancel", sharedValue)) {
                    if (com.meituan.android.pay.desk.component.data.a.b(getActivity())) {
                        com.meituan.android.pay.process.g.a(getActivity(), (Object) null);
                    } else {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca9fdb6ddc26a84f2a0d00ee69a1d30b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca9fdb6ddc26a84f2a0d00ee69a1d30b");
                        } else if (getView() != null && !getView().isShown()) {
                            getView().setVisibility(0);
                        }
                    }
                    com.meituan.android.pay.common.payment.utils.b.c(getActivity(), "bank_type_id");
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(sharedValue);
                        String string = jSONObject.getString("status");
                        if ("success".equals(string)) {
                            serializable = (Serializable) com.meituan.android.paybase.utils.n.a().fromJson(jSONObject.getString("data"), (Class<Object>) BankInfo.class);
                        } else if ("fail".equals(string)) {
                            serializable = (Serializable) com.meituan.android.paybase.utils.n.a().fromJson(jSONObject.getString("error"), (Class<Object>) PayException.class);
                            if (com.meituan.android.pay.desk.component.data.a.b(getActivity())) {
                                com.meituan.android.pay.process.g.a(getActivity(), (Object) serializable);
                                com.meituan.android.privacy.aop.a.f();
                                return;
                            }
                        } else {
                            serializable = null;
                        }
                        Object[] objArr3 = {serializable};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "718b39c55615db64a178b5faf450eca3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "718b39c55615db64a178b5faf450eca3");
                        } else if (serializable instanceof BankInfo) {
                            onRequestSucc(3, serializable);
                        } else if (serializable instanceof Exception) {
                            if (!this.d.isPayed()) {
                                i3 = 3;
                            }
                            if (g()) {
                                com.meituan.android.pay.utils.s.b(getActivity(), (PayException) serializable, i3);
                            } else {
                                com.meituan.android.pay.utils.s.a((Activity) getActivity(), (Exception) ((PayException) serializable), i3);
                            }
                        }
                    } catch (JSONException e2) {
                        com.meituan.android.paybase.common.analyse.a.a(e2, "VerifyBankInfoFragment_onActivityResult1", (Map<String, Object>) null);
                        x();
                    }
                }
            } else {
                com.meituan.android.paybase.common.analyse.cat.a.a("resultIsNull", "极速绑卡i版返回为null");
                x();
            }
        }
        com.meituan.android.privacy.aop.a.f();
    }

    public static /* synthetic */ void a(VerifyBankInfoFragment verifyBankInfoFragment) {
        Object[] objArr = {verifyBankInfoFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98c91481506c08d4159379be5bbd8aae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98c91481506c08d4159379be5bbd8aae");
        } else {
            verifyBankInfoFragment.p.requestFocus();
        }
    }

    private void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a89416628a47ccb5f7735cd54dd7e02e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a89416628a47ccb5f7735cd54dd7e02e");
        } else if (!g() || getActivity() == null) {
        } else {
            if (com.meituan.android.pay.desk.component.data.b.f(getActivity())) {
                com.meituan.android.paycommon.lib.utils.h.a(getActivity());
            } else {
                PayActivity.b(getActivity(), "极速绑卡取消", PayErrorCode.QUICK_BIND_CARD_CANCEL);
            }
        }
    }

    public static /* synthetic */ void a(VerifyBankInfoFragment verifyBankInfoFragment, CardBinTip cardBinTip, View view) {
        Object[] objArr = {verifyBankInfoFragment, cardBinTip, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "328d29464fb4a28aec6fe256ccf95c06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "328d29464fb4a28aec6fe256ccf95c06");
        } else if (TextUtils.isEmpty(cardBinTip.getLimit().getUrl())) {
        } else {
            com.meituan.android.paybase.common.analyse.a.a("b_f7uljabr", "点击“查看支持的银行", (Map<String, Object>) null, a.EnumC0329a.CLICK, -1);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_ubnoci4i_mc", "点击“查看支持的银行", new a.c().a("id_bindcard", verifyBankInfoFragment.t).a("entry", verifyBankInfoFragment.v).a("trans_id", verifyBankInfoFragment.q).b, a.EnumC0329a.CLICK, -1);
            com.meituan.android.paybase.common.analyse.a.a("b_8zyqb801", (Map<String, Object>) null);
            al.a(verifyBankInfoFragment.getActivity(), cardBinTip.getLimit().getUrl());
        }
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77a15a802d31fe26ee48247fbb4f6942", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77a15a802d31fe26ee48247fbb4f6942");
        }
        String d = super.d();
        if (this.d == null || TextUtils.isEmpty(this.d.getPageName())) {
            return d;
        }
        return !TextUtils.isEmpty(this.B) ? this.B : d + CommonConstant.Symbol.UNDERLINE + this.d.getPageName();
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final HashMap<String, Object> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e508d0a02a960e47b11476b08e0e1d2a", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e508d0a02a960e47b11476b08e0e1d2a");
        }
        HashMap<String, Object> e = super.e();
        if (e == null) {
            e = new HashMap<>();
        }
        if (!com.meituan.android.paybase.utils.i.a((Collection) this.r)) {
            ArrayList arrayList = new ArrayList();
            Iterator<QuickBankDetail> it = this.r.iterator();
            while (it.hasNext()) {
                QuickBankDetail next = it.next();
                if (next != null) {
                    arrayList.add(next.getName());
                }
            }
            if (com.meituan.android.paybase.utils.i.a((Collection) arrayList)) {
                arrayList = null;
            }
            e.put("BANK_LIST", arrayList);
        }
        e.put("BIND_TYPE", !TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.b(getActivity(), "pay_token")) ? b : c);
        e.put("ext", this.s);
        e.put("trans_id", this.q);
        e.put("id_bindcard", this.t);
        e.put("entry", this.v);
        e.put("from", Integer.valueOf(com.meituan.android.pay.utils.d.a()));
        return e;
    }
}
