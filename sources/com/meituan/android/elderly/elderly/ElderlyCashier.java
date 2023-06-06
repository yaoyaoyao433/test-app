package com.meituan.android.elderly.elderly;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.activity.MTCashierWrapperActivity;
import com.meituan.android.cashier.bean.CashierParams;
import com.meituan.android.cashier.common.ICashier;
import com.meituan.android.cashier.common.r;
import com.meituan.android.cashier.common.u;
import com.meituan.android.cipstorage.q;
import com.meituan.android.elderly.bean.Cashier;
import com.meituan.android.elderly.bean.OverLoadInfo;
import com.meituan.android.elderly.bean.PayResult;
import com.meituan.android.elderly.bean.PopDetailInfo;
import com.meituan.android.elderly.bean.RetainWindow;
import com.meituan.android.elderly.bean.RouteInfo;
import com.meituan.android.elderly.dialog.ElderlyPayDialog;
import com.meituan.android.elderly.fragment.MTElderlyCashierFragment;
import com.meituan.android.elderly.payresult.a;
import com.meituan.android.elderly.retrofit.CashierRequestService;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paybase.moduleinterface.payment.PayActionListener;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.MTPayBaseClass;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.aa;
import com.meituan.android.paybase.utils.ac;
import com.meituan.android.paybase.utils.ae;
import com.meituan.android.paybase.utils.ah;
import com.meituan.android.paybase.utils.al;
import com.meituan.android.paybase.utils.f;
import com.meituan.android.paycommon.lib.abtest.CommonABTestManager;
import com.meituan.android.paycommon.lib.coupon.model.Promotion;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@MTPayBaseClass
/* loaded from: classes2.dex */
public class ElderlyCashier extends u implements PayActionListener, com.meituan.android.paybase.moduleinterface.payment.a {
    public static ChangeQuickRedirect a;
    private boolean A;
    private boolean B;
    private Dialog C;
    @MTPayNeedToPersist
    private boolean D;
    @MTPayNeedToPersist
    private RetainWindow E;
    private boolean F;
    private OverLoadInfo G;
    private String H;
    public String b;
    public FragmentActivity c;
    public String d;
    public com.meituan.android.elderly.payresult.d e;
    public boolean f;
    @MTPayNeedToPersist
    public boolean g;
    public String h;
    public String i;
    public HashMap<String, String> j;
    private Uri k;
    private String l;
    @MTPayNeedToPersist
    private String m;
    private String n;
    private String q;
    private String r;
    private com.meituan.android.cashier.common.i s;
    private com.meituan.android.paybase.retrofit.b t;
    private a u;
    private com.meituan.android.elderly.payresult.a v;
    @MTPayNeedToPersist
    private boolean w;
    private final int x;
    private boolean y;
    private boolean z;

    @Override // com.meituan.android.paybase.moduleinterface.payment.PayActionListener
    public final void b(String str) {
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.h
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04a12bed6882365c513170ebc5e00a7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04a12bed6882365c513170ebc5e00a7e");
        }
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.ICashier
    public final String i() {
        return "native_elderly_cashier";
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
    }

    public ElderlyCashier() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8415d93593f4823e0ac40943a39e6153", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8415d93593f4823e0ac40943a39e6153");
            return;
        }
        this.f = true;
        this.x = R.id.content;
        this.g = false;
    }

    public static /* synthetic */ boolean c(ElderlyCashier elderlyCashier, boolean z) {
        elderlyCashier.f = true;
        return true;
    }

    public static /* synthetic */ boolean h(ElderlyCashier elderlyCashier) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, elderlyCashier, changeQuickRedirect, false, "87baa9e949a3fa03477e46e36d2991ea", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, elderlyCashier, changeQuickRedirect, false, "87baa9e949a3fa03477e46e36d2991ea")).booleanValue() : elderlyCashier.c.isFinishing();
    }

    @Override // com.meituan.android.cashier.common.ICashier
    public final <T extends FragmentActivity & com.meituan.android.cashier.common.i & com.meituan.android.paybase.retrofit.b> ICashier.a a(T t, CashierParams cashierParams) {
        Object[] objArr = {t, cashierParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80fba21265e48ce349217534cb48c09d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ICashier.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80fba21265e48ce349217534cb48c09d");
        }
        this.k = cashierParams.getUri();
        this.n = cashierParams.getTradeNo();
        this.q = cashierParams.getPayToken();
        this.b = cashierParams.getExtraData();
        this.d = cashierParams.getDowngradeInfo();
        this.r = cashierParams.getCallbackUrl();
        this.h = cashierParams.getExtraStatics();
        this.c = t;
        this.s = t;
        this.t = t;
        this.i = cashierParams.getLastResumedFeature();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.elderly.elderly.a.a;
        this.v = new com.meituan.android.elderly.payresult.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "088ed15cbb6477d2997df432b15c09eb", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0257a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "088ed15cbb6477d2997df432b15c09eb") : new com.meituan.android.elderly.elderly.a(this), this, (MTCashierActivity) this.c, this.s, this.n);
        this.e = new com.meituan.android.elderly.payresult.d(this.s, (MTCashierActivity) this.c, this.n, this.q, this.b, this.h);
        this.j = cashierParams.getExtendTransmissionParams();
        String c = r.c();
        Object[] objArr3 = {c};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        return new ICashier.a(PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "79b57d68974e1ace45e8356c1b911eca", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "79b57d68974e1ace45e8356c1b911eca")).booleanValue() : TextUtils.equals(c, "1"));
    }

    public static /* synthetic */ void a(ElderlyCashier elderlyCashier, OverLoadInfo overLoadInfo) {
        Object[] objArr = {elderlyCashier, overLoadInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ef2f26aa58b9b990e5cb52c70937b7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ef2f26aa58b9b990e5cb52c70937b7d");
            return;
        }
        elderlyCashier.G = overLoadInfo;
        elderlyCashier.a(elderlyCashier.c);
    }

    @Override // com.meituan.android.cashier.common.u
    public final void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4376c095e71d657365d02fdc416b035", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4376c095e71d657365d02fdc416b035");
            return;
        }
        com.meituan.android.elderly.utils.a.a(System.currentTimeMillis());
        com.meituan.android.elderly.utils.a.a(this.p);
        com.meituan.android.elderly.utils.a.b(this.p);
        this.y = true;
        this.A = true;
        d();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "52cf617909343271686bda7922e70cdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "52cf617909343271686bda7922e70cdf");
            return;
        }
        a((String) null);
        b();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ed0cb1e24efc33d9d01d2d8d509f3e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ed0cb1e24efc33d9d01d2d8d509f3e8");
            return;
        }
        Fragment findFragmentById = this.c.getSupportFragmentManager().findFragmentById(this.x);
        if (findFragmentById instanceof MTElderlyCashierFragment) {
            ((MTElderlyCashierFragment) findFragmentById).a(null, null, null, this.l, null);
        } else {
            c();
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89977d878f293024f7a399a141f783e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89977d878f293024f7a399a141f783e1");
        } else if (this.c != null) {
            this.c.getSupportFragmentManager().beginTransaction().replace(this.x, new MTElderlyCashierFragment()).commitAllowingStateLoss();
        }
    }

    @MTPaySuppressFBWarnings({"SIC_INNER_SHOULD_BE_STATIC_ANON"})
    private void a(String str) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b171811f3fa899503abbb1811903a10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b171811f3fa899503abbb1811903a10");
            return;
        }
        final q b = ac.b(this.c);
        final int b2 = b.b("installed_apps", -1);
        final String b3 = ac.b(this.c).b("is_root", "-1");
        final String b4 = com.meituan.android.paymentchannel.utils.b.b(this.c.getApplicationContext());
        com.meituan.android.elderly.utils.a.a(getClass().getName(), " request_start", this.p);
        if (b2 != -1 && !TextUtils.equals("-1", b3)) {
            CashierRequestService cashierRequestService = (CashierRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(CashierRequestService.class, this.t, 1370);
            String str2 = this.n;
            String str3 = this.q;
            StringBuilder sb = new StringBuilder();
            sb.append(b2);
            cashierRequestService.startRouting(str2, str3, b3, sb.toString(), this.r, null, com.meituan.android.paycommon.lib.config.a.a().o(), b4, this.d, "", "1", this.b, l(), this.j);
            this.w = TextUtils.equals("1", b3);
        }
        new com.meituan.android.paybase.asynctask.a<String, Integer, Integer>() { // from class: com.meituan.android.elderly.elderly.ElderlyCashier.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.paybase.asynctask.b
            public final /* synthetic */ Object a(Object[] objArr2) {
                Object[] objArr3 = {(String[]) objArr2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "7497978fc19a9b0b244a153752af8d7b", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "7497978fc19a9b0b244a153752af8d7b");
                }
                b.a("is_root", ah.a() ? "1" : "0");
                int a2 = com.meituan.android.paymentchannel.utils.a.a(ElderlyCashier.this.c.getApplicationContext());
                b.a("installed_apps", a2);
                return Integer.valueOf(a2);
            }

            @Override // com.meituan.android.paybase.asynctask.b
            public final /* synthetic */ void a(Object obj) {
                Integer num = (Integer) obj;
                Object[] objArr2 = {num};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f252099b8e6c57222fdb2814c187bc4d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f252099b8e6c57222fdb2814c187bc4d");
                } else if (b2 == -1 || TextUtils.equals("-1", b3)) {
                    String b5 = b.b("is_root", "-1");
                    CashierRequestService cashierRequestService2 = (CashierRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(CashierRequestService.class, ElderlyCashier.this.t, 1370);
                    String str4 = ElderlyCashier.this.n;
                    String str5 = ElderlyCashier.this.q;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(num);
                    cashierRequestService2.startRouting(str4, str5, b5, sb2.toString(), ElderlyCashier.this.r, r5, com.meituan.android.paycommon.lib.config.a.a().o(), b4, ElderlyCashier.this.d, "", "1", ElderlyCashier.this.b, ElderlyCashier.this.l(), ElderlyCashier.this.j);
                    ElderlyCashier.this.w = TextUtils.equals("1", b5);
                }
            }
        }.b(new String[0]);
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44497349e479872cf77bc57b33aef3ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44497349e479872cf77bc57b33aef3ac");
            return;
        }
        if (this.k != null) {
            this.l = this.k.getQueryParameter("merchant_no");
        }
        if (!TextUtils.isEmpty(this.b)) {
            try {
                this.m = new JSONObject(this.b).optString("app_id");
            } catch (JSONException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "ElderlyCashier_start_parseJson", (Map<String, Object>) null);
            }
        }
        this.u = new a(this);
        com.meituan.android.paymentchannel.b.a().a(this.c, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0120, code lost:
        if (r27.equals("wxpay") != false) goto L49;
     */
    @Override // com.meituan.android.paybase.moduleinterface.payment.PayActionListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r27, int r28, com.meituan.android.paybase.moduleinterface.payment.PayFailInfo r29) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.elderly.elderly.ElderlyCashier.a(java.lang.String, int, com.meituan.android.paybase.moduleinterface.payment.PayFailInfo):void");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends Handler {
        public static ChangeQuickRedirect a;
        public WeakReference<ElderlyCashier> b;

        public a(ElderlyCashier elderlyCashier) {
            Object[] objArr = {elderlyCashier};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f37de3de63b714e764420ea6be80e45e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f37de3de63b714e764420ea6be80e45e");
            } else {
                this.b = new WeakReference<>(elderlyCashier);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            ElderlyCashier elderlyCashier;
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c17c84ea48764f8a78b6772b3fa75f02", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c17c84ea48764f8a78b6772b3fa75f02");
                return;
            }
            super.handleMessage(message);
            if (message.what != 2 || (elderlyCashier = this.b.get()) == null || ElderlyCashier.h(elderlyCashier)) {
                return;
            }
            ElderlyCashier.c(elderlyCashier, true);
            removeMessages(2);
        }
    }

    public static /* synthetic */ void d(ElderlyCashier elderlyCashier, Dialog dialog) {
        Object[] objArr = {elderlyCashier, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc8bc8946061755e4de77877db602674", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc8bc8946061755e4de77877db602674");
            return;
        }
        dialog.cancel();
        elderlyCashier.s.c("");
    }

    public static /* synthetic */ void a(ElderlyCashier elderlyCashier, PopDetailInfo popDetailInfo, Dialog dialog) {
        Object[] objArr = {elderlyCashier, popDetailInfo, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44997c8b418e0bf7d53e23ce87d43f25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44997c8b418e0bf7d53e23ce87d43f25");
            return;
        }
        dialog.cancel();
        elderlyCashier.s.c("");
        al.a((Context) elderlyCashier.c, popDetailInfo.getRedirectUrl(), false);
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.ICashier
    public final PayBaseActivity.a a(int i) {
        return PayBaseActivity.a.CASHIER;
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.h
    public final boolean h() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f902e5e9077e4592b667fce3c8f1847", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f902e5e9077e4592b667fce3c8f1847")).booleanValue();
        }
        if (this.A) {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_bsmbner4_mc", (Map<String, Object>) null);
            this.A = false;
        }
        if (this.c != null && (this.c.getSupportFragmentManager().findFragmentById(this.x) instanceof MTElderlyCashierFragment)) {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_32l25h89_mc", new a.c().a("tradeNo", com.meituan.android.paybase.common.analyse.a.b).b);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d72e4def32364ac86b07e19e44765818", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d72e4def32364ac86b07e19e44765818")).booleanValue();
            }
            if (this.E == null || !this.E.isDefaultRetainType()) {
                return false;
            }
            RetainWindow retainWindow = this.E;
            Object[] objArr3 = {retainWindow};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d14d835122bedf8a1495c5b74963bbc7", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d14d835122bedf8a1495c5b74963bbc7")).booleanValue();
            }
            if (TextUtils.equals(CommonABTestManager.a(), "b")) {
                if (!this.D) {
                    Object[] objArr4 = {retainWindow};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1d6b22f7f8a4a15cb31e67ca5fbc096a", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1d6b22f7f8a4a15cb31e67ca5fbc096a")).booleanValue();
                    } else {
                        z = (retainWindow == null || TextUtils.isEmpty(retainWindow.getTitle()) || TextUtils.isEmpty(retainWindow.getDetail()) || TextUtils.isEmpty(retainWindow.getLeftButton()) || TextUtils.isEmpty(retainWindow.getRightButton())) ? false : true;
                    }
                    if (z) {
                        this.D = true;
                        Object[] objArr5 = {retainWindow, "single"};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a5bd2d990e685531c1d8464bf233a47d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a5bd2d990e685531c1d8464bf233a47d");
                        } else {
                            if (this.C == null) {
                                ElderlyPayDialog.a aVar = new ElderlyPayDialog.a(this.c);
                                BasePayDialog.b b = aVar.b("" + retainWindow.getTitle());
                                BasePayDialog.b c = b.c(retainWindow.getDetail() + "");
                                String leftButton = retainWindow.getLeftButton();
                                Object[] objArr6 = {this, retainWindow};
                                ChangeQuickRedirect changeQuickRedirect6 = h.a;
                                BasePayDialog.b a2 = c.a(leftButton, PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "5044adaed1552a36f8e706cd553fe65e", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "5044adaed1552a36f8e706cd553fe65e") : new h(this, retainWindow));
                                String rightButton = retainWindow.getRightButton();
                                Object[] objArr7 = {this, retainWindow};
                                ChangeQuickRedirect changeQuickRedirect7 = i.a;
                                this.C = a2.b(rightButton, PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "a5d7fec9cb7b32511c4ff5c4277e9175", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "a5d7fec9cb7b32511c4ff5c4277e9175") : new i(this, retainWindow)).b(ContextCompat.getColor(this.c, R.color.cashier__color)).a();
                            }
                            this.C.show();
                            com.meituan.android.cashier.common.q.a("c_PJmoK", "b_pay_n7gadotk_mv", "离开收银台挽留弹窗", new a.c().a("sub_type", "1").a("type", "basic").b, ae.a.VIEW, this.p);
                        }
                        return true;
                    }
                }
                this.s.j();
                return false;
            }
            this.s.j();
            return false;
        }
        return false;
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.h
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f98d7c4298c2b9d01c2480ea011b7105", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f98d7c4298c2b9d01c2480ea011b7105");
            return;
        }
        e();
        this.C = null;
        this.F = true;
        if (this.u != null) {
            this.u.removeMessages(2);
        }
        com.meituan.android.paymentchannel.b.a().b(this.c);
        com.meituan.android.elderly.payresult.a aVar = this.v;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.elderly.payresult.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "45c8e0896ccdf11cea405107f069c22f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "45c8e0896ccdf11cea405107f069c22f");
        } else if (aVar.e != null) {
            aVar.e.cancel();
            aVar.e = null;
        }
        if (z) {
            Fragment findFragmentById = this.c.getSupportFragmentManager().findFragmentById(this.x);
            if (findFragmentById instanceof MTElderlyCashierFragment) {
                this.c.getSupportFragmentManager().beginTransaction().remove(findFragmentById).commitNowAllowingStateLoss();
            }
        }
    }

    @Override // com.meituan.android.cashier.common.h
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f1990390939c9a649f72decb29882ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f1990390939c9a649f72decb29882ff");
        } else {
            com.meituan.android.paymentchannel.b.a().a(this.c, i, i2, intent);
        }
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.v
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "434c6cc7ce9ce92697750f4dfae0e5a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "434c6cc7ce9ce92697750f4dfae0e5a0");
        } else if (z && this.B) {
            k();
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [com.meituan.android.elderly.payresult.a$1] */
    @Override // com.meituan.android.cashier.common.u, com.meituan.android.paybase.retrofit.b
    public void onRequestSucc(int i, Object obj) {
        boolean z;
        String p;
        boolean z2;
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3596dc9dbbc7e288a274f7429ade6da0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3596dc9dbbc7e288a274f7429ade6da0");
        } else if (obj == null || this.F) {
            if (obj == null) {
                a.c a2 = new a.c().a(KnbConstants.PARAMS_SCENE, "o == null").a("sub_type", "1");
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                com.meituan.android.paybase.common.analyse.a.a("b_pay_pfjic30w_mv", a2.a("tag", sb.toString()).b);
                return;
            }
            a.c a3 = new a.c().a(KnbConstants.PARAMS_SCENE, "isDestroyed").a("sub_type", "1");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_pfjic30w_mv", a3.a("tag", sb2.toString()).b);
        } else {
            Cashier cashier = null;
            if (i == 1) {
                com.meituan.android.elderly.payresult.a aVar = this.v;
                Object[] objArr2 = {Integer.valueOf(i), obj};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.elderly.payresult.a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "cc68c1fadb8b7e93ffda361121a8d73a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "cc68c1fadb8b7e93ffda361121a8d73a");
                    return;
                }
                if (obj != null) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.elderly.payresult.a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "3670ccda18974e4f4531faa929700d9b", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "3670ccda18974e4f4531faa929700d9b")).booleanValue();
                    } else {
                        z = aVar.c.isFinishing() || aVar.c.m();
                    }
                    if (!z) {
                        PayResult payResult = (PayResult) obj;
                        Promotion promotion = payResult.getPromotion();
                        if (promotion != null) {
                            com.meituan.android.paybase.common.analyse.a.a("b_pay_dn9s8rnr_mv", new a.c().a("sub_type", "1").b);
                        }
                        HashMap<String, Object> hashMap = new a.c().a("sub_type", "1").b;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.elderly.payresult.a.a;
                        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "77b0755bb4fb9f53810b8178b3223b4a", RobustBitConfig.DEFAULT_VALUE)) {
                            p = (String) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "77b0755bb4fb9f53810b8178b3223b4a");
                        } else {
                            p = aVar.c != null ? aVar.c.p() : "";
                        }
                        com.meituan.android.cashier.common.q.a("b_5jx1qb72", hashMap, p);
                        long windowTimeout = promotion != null ? promotion.getWindowTimeout() * 1000 : 0L;
                        if (aVar.c instanceof MTCashierActivity) {
                            ((MTCashierActivity) aVar.c).c = promotion;
                        }
                        if (aVar.e != null) {
                            aVar.e.cancel();
                        }
                        aVar.e = new CountDownTimer(windowTimeout, 1000L) { // from class: com.meituan.android.elderly.payresult.a.1
                            public static ChangeQuickRedirect a;

                            @Override // android.os.CountDownTimer
                            public final void onTick(long j) {
                            }

                            @Override // android.os.CountDownTimer
                            public final void onFinish() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "03b3718ad6d5833776326c9f85f093fe", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "03b3718ad6d5833776326c9f85f093fe");
                                    return;
                                }
                                if (a.this.c instanceof MTCashierActivity) {
                                    ((MTCashierActivity) a.this.c).d = true;
                                }
                                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_promotionalert_overtime", 200);
                            }
                        }.start();
                        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_response_directpay", 200);
                        Object[] objArr5 = {payResult};
                        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.elderly.payresult.a.a;
                        if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "63345e7dcf98b0609da3cab67f112f2d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "63345e7dcf98b0609da3cab67f112f2d");
                            return;
                        } else if (payResult.getOverLoadInfo() != null && payResult.getOverLoadInfo().isStatus()) {
                            com.meituan.android.paybase.common.analyse.a.a("b_pay_2bqf1335_mv", (Map<String, Object>) null);
                            aVar.f.a(payResult.getOverLoadInfo());
                            return;
                        } else {
                            Object[] objArr6 = {payResult};
                            ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.elderly.payresult.a.a;
                            if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "5c1510f915f35c988b223a225ad44521", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "5c1510f915f35c988b223a225ad44521");
                                return;
                            } else {
                                com.meituan.android.paymentchannel.b.a().a(aVar.c, payResult.getPayType(), payResult.getUrl(), aVar.g, aVar.b);
                                return;
                            }
                        }
                    }
                }
                if (obj == null) {
                    a.c a4 = new a.c().a(KnbConstants.PARAMS_SCENE, "o == null");
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i);
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_pfjic30w_mv", a4.a("tag", sb3.toString()).b);
                    return;
                }
                a.c a5 = new a.c().a(KnbConstants.PARAMS_SCENE, "isDestroyed");
                StringBuilder sb4 = new StringBuilder();
                sb4.append(i);
                com.meituan.android.paybase.common.analyse.a.a("b_pay_pfjic30w_mv", a5.a("tag", sb4.toString()).b);
            } else if (i == 63) {
                e();
                com.meituan.android.paybase.common.analyse.a.a("b_ruzoirdm", new a.c().a(KnbConstants.PARAMS_SCENE, "订单超时").b);
                if (((Boolean) ((HashMap) obj).get("result")).booleanValue()) {
                    FragmentActivity fragmentActivity = this.c;
                    Object[] objArr7 = {this};
                    ChangeQuickRedirect changeQuickRedirect7 = d.a;
                    com.meituan.android.paybase.utils.f.a(fragmentActivity, PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "0e55d1532cac9fe582117f2e4610f9c4", RobustBitConfig.DEFAULT_VALUE) ? (f.InterfaceC0337f) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "0e55d1532cac9fe582117f2e4610f9c4") : new d(this));
                    return;
                }
                com.meituan.android.cashier.common.q.b("b_bbmRU", new a.b().a().a("sub_type", "1").b, this.p);
                BasePayDialog.b b = new ElderlyPayDialog.a(this.c).c(this.c.getString(R.string.cashierelderly__pay_timeout_content)).b(this.c.getString(R.string.cashierelderly__pay_timeout_title));
                String string = this.c.getString(R.string.cashierelderly__pay_timeout_btn);
                Object[] objArr8 = {this};
                ChangeQuickRedirect changeQuickRedirect8 = e.a;
                b.b(string, PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "82b5d69d74d43602eda6f70ddab5915d", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "82b5d69d74d43602eda6f70ddab5915d") : new e(this)).a().show();
            } else if (i != 1370) {
            } else {
                if (this.z) {
                    this.z = false;
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_4km995m2_mv", (Map<String, Object>) null);
                }
                this.A = false;
                ((MTCashierActivity) this.c).i();
                com.meituan.android.cashier.common.q.b("b_BQKWU", new a.b().a("sub_type", "1").b, this.p);
                com.meituan.android.elderly.utils.a.a(getClass().getName(), " request_success", this.p);
                RouteInfo routeInfo = (RouteInfo) obj;
                if (routeInfo.getCashierPopWindowBean() != null && routeInfo.getCashierPopWindowBean().getType() == 1) {
                    com.meituan.android.elderly.utils.a.a(this.p, this.i);
                    com.meituan.android.elderly.utils.a.c(this.p);
                    com.meituan.android.cashier.common.q.a("native_elderlycashier_start_succ", (Map<String, Object>) null, (List<Float>) null, this.p);
                    PopDetailInfo popDetailInfo = routeInfo.getCashierPopWindowBean().getPopDetailInfo();
                    Object[] objArr9 = {popDetailInfo};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "05e54affbd50dbaa1047197b40184945", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "05e54affbd50dbaa1047197b40184945");
                        return;
                    }
                    Object[] objArr10 = {popDetailInfo};
                    ChangeQuickRedirect changeQuickRedirect10 = a;
                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "58f997b35cd217ff0674f8f354e3d934", RobustBitConfig.DEFAULT_VALUE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "58f997b35cd217ff0674f8f354e3d934")).booleanValue();
                    } else {
                        z2 = (popDetailInfo == null || TextUtils.isEmpty(popDetailInfo.getDetail()) || TextUtils.isEmpty(popDetailInfo.getLeftBtn()) || TextUtils.isEmpty(popDetailInfo.getRightBtn())) ? false : true;
                    }
                    if (z2) {
                        ElderlyPayDialog.a aVar2 = new ElderlyPayDialog.a(this.c);
                        aVar2.b = 1;
                        BasePayDialog.b b2 = aVar2.b(popDetailInfo.getTitle()).c(popDetailInfo.getDetail()).a(false).b(false);
                        String leftBtn = popDetailInfo.getLeftBtn();
                        Object[] objArr11 = {this};
                        ChangeQuickRedirect changeQuickRedirect11 = b.a;
                        BasePayDialog.b b3 = b2.b(leftBtn, PatchProxy.isSupport(objArr11, null, changeQuickRedirect11, true, "98a85f984280ecd08439b314c1f76d8b", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr11, null, changeQuickRedirect11, true, "98a85f984280ecd08439b314c1f76d8b") : new b(this));
                        String rightBtn = popDetailInfo.getRightBtn();
                        Object[] objArr12 = {this, popDetailInfo};
                        ChangeQuickRedirect changeQuickRedirect12 = c.a;
                        ((ElderlyPayDialog) b3.a(rightBtn, PatchProxy.isSupport(objArr12, null, changeQuickRedirect12, true, "5a8041733187ff11e26eb470e33c9795", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr12, null, changeQuickRedirect12, true, "5a8041733187ff11e26eb470e33c9795") : new c(this, popDetailInfo)).a()).show();
                        return;
                    }
                    return;
                }
                Object[] objArr13 = {routeInfo};
                ChangeQuickRedirect changeQuickRedirect13 = a;
                if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "6d7d3bb2cf775539e38ac7395520e360", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "6d7d3bb2cf775539e38ac7395520e360");
                    return;
                }
                if (!TextUtils.isEmpty(routeInfo.getRootDesc()) && this.w) {
                    com.meituan.android.paybase.dialog.e.a((Activity) this.c, (Object) routeInfo.getRootDesc(), true);
                }
                CommonABTestManager.a(routeInfo.getAbTestGroup());
                if (routeInfo.getCashierInfo() != null) {
                    this.E = routeInfo.getRetainWindow();
                    Object[] objArr14 = {routeInfo};
                    ChangeQuickRedirect changeQuickRedirect14 = a;
                    if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "9ed8e3b0e4b7b09844c06b32cf516753", RobustBitConfig.DEFAULT_VALUE)) {
                        cashier = (Cashier) PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "9ed8e3b0e4b7b09844c06b32cf516753");
                    } else if (routeInfo != null && routeInfo.getCashierInfo() != null) {
                        cashier = routeInfo.getCashierInfo().get("wallet");
                    }
                    Object[] objArr15 = {cashier};
                    ChangeQuickRedirect changeQuickRedirect15 = a;
                    if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "71a2e1036b4e6974563e882764011635", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "71a2e1036b4e6974563e882764011635");
                        return;
                    } else if (cashier == null) {
                        this.s.b("1120018", "");
                        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_cashier", 1120018);
                        com.meituan.android.paybase.common.analyse.cat.a.a("cashierStartError", this.c.getString(R.string.cashierelderly__start_error));
                        return;
                    } else {
                        Object[] objArr16 = {cashier};
                        ChangeQuickRedirect changeQuickRedirect16 = a;
                        if (PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "8c985f72875cf5fb50b8669edba7eeac", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "8c985f72875cf5fb50b8669edba7eeac");
                            return;
                        }
                        this.s.e("new_group_cashier");
                        Fragment findFragmentById = this.c.getSupportFragmentManager().findFragmentById(this.x);
                        if (findFragmentById instanceof MTElderlyCashierFragment) {
                            ((MTElderlyCashierFragment) findFragmentById).a(this.n, this.q, cashier, this.l, this.m);
                            return;
                        }
                        return;
                    }
                }
                a((String) null);
            }
        }
    }

    public static /* synthetic */ void a(ElderlyCashier elderlyCashier, boolean z) {
        Object[] objArr = {elderlyCashier, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "36ddacf6745cba47175cc297ce7c79f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "36ddacf6745cba47175cc297ce7c79f6");
        } else {
            elderlyCashier.s.a(null);
        }
    }

    public static /* synthetic */ void c(ElderlyCashier elderlyCashier, Dialog dialog) {
        Object[] objArr = {elderlyCashier, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b9bf44f6361843a6697da9c0b99377f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b9bf44f6361843a6697da9c0b99377f");
        } else {
            elderlyCashier.s.j();
        }
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        int i2;
        int i3;
        int i4;
        int i5;
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba06d115e4dc2ba66dc6241dd34835b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba06d115e4dc2ba66dc6241dd34835b7");
        } else if (i != 1) {
            if (i == 63) {
                e();
                com.meituan.android.paybase.common.analyse.a.a("b_pay_v3zwwi9x_mv", (Map<String, Object>) null);
                com.meituan.android.cashier.common.q.b("b_bbmRU", new a.b().a().a("sub_type", "1").b, this.p);
                BasePayDialog.b c = new ElderlyPayDialog.a(this.c).b(this.c.getString(R.string.cashierelderly__pay_timeout_title)).c(this.c.getString(R.string.cashierelderly__pay_timeout_content));
                String string = this.c.getString(R.string.cashierelderly__pay_timeout_btn);
                Object[] objArr2 = {this};
                ChangeQuickRedirect changeQuickRedirect2 = g.a;
                c.b(string, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bc756d4442ae873a18cf986b35eefe1b", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bc756d4442ae873a18cf986b35eefe1b") : new g(this)).a().show();
            } else if (i != 1370) {
            } else {
                if (this.y && !(exc instanceof PayException)) {
                    this.y = false;
                    this.z = true;
                    a((String) null);
                    return;
                }
                this.z = false;
                this.A = false;
                boolean z = exc instanceof PayException;
                if (z) {
                    PayException payException = (PayException) exc;
                    i5 = payException.getCode();
                    i4 = payException.getLevel();
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                a.b a2 = new a.b().a().a("sub_type", "1").a("code", String.valueOf(i5)).a("message", exc.getMessage());
                StringBuilder sb = new StringBuilder();
                sb.append(i4);
                com.meituan.android.cashier.common.q.b("b_aAh3p", a2.a("level", sb.toString()).b, this.p);
                String message = z ? exc.getMessage() : this.c.getString(R.string.paycommon__error_msg_load_later);
                ((MTCashierActivity) this.c).f = "fail";
                if (i5 == 117003) {
                    BasePayDialog.b d = new ElderlyPayDialog.a(this.c).b(this.c.getString(R.string.cashierelderly__pay_promote_title)).c(exc.getMessage()).d(((PayException) exc).getErrorCodeStr());
                    Object[] objArr3 = {this};
                    ChangeQuickRedirect changeQuickRedirect3 = f.a;
                    d.b("知道了", PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "cc18b97ba5c18bf8b5896f28d2d0ec1e", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "cc18b97ba5c18bf8b5896f28d2d0ec1e") : new f(this)).a().show();
                } else if (z) {
                    if (com.meituan.android.cashier.util.a.a().b()) {
                        com.meituan.android.paycommon.lib.utils.d.a(this.c, message, ((PayException) exc).getErrorCodeStr(), new ElderlyPayDialog.a(this.c), MTCashierActivity.class);
                    } else {
                        com.meituan.android.paycommon.lib.utils.d.a(this.c, message, ((PayException) exc).getErrorCodeStr(), new ElderlyPayDialog.a(this.c), MTCashierWrapperActivity.class);
                    }
                } else {
                    if (com.meituan.android.cashier.util.a.a().b()) {
                        com.meituan.android.paycommon.lib.utils.d.a(this.c, message, "", new ElderlyPayDialog.a(this.c), MTCashierActivity.class);
                    } else {
                        com.meituan.android.paycommon.lib.utils.d.a(this.c, message, "", new ElderlyPayDialog.a(this.c), MTCashierWrapperActivity.class);
                    }
                    a.c cVar = new a.c();
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_mqk1w1xy_mv", cVar.a(KnbConstants.PARAMS_SCENE, this.c.getLocalClassName() + "_onRequestException").a("message", exc.getMessage()).b);
                }
            }
        } else {
            com.meituan.android.elderly.payresult.a aVar = this.v;
            Object[] objArr4 = {Integer.valueOf(i), exc};
            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.elderly.payresult.a.a;
            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "188c81bcd0e20d185640dc6a39640190", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "188c81bcd0e20d185640dc6a39640190");
                return;
            }
            boolean z2 = exc instanceof PayException;
            if (z2) {
                PayException payException2 = (PayException) exc;
                i3 = payException2.getCode();
                i2 = payException2.getLevel();
                if (i3 == 118021) {
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_vqzyehjz_mv", (Map<String, Object>) null);
                }
            } else {
                i2 = 0;
                i3 = 0;
            }
            a.c cVar2 = new a.c();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i3);
            a.c a3 = cVar2.a("code", sb2.toString()).a("message", exc.getMessage());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i2);
            com.meituan.android.paybase.common.analyse.a.a("b_21iwgx7m", a3.a("level", sb3.toString()).b);
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_response_directpay", i3);
            Object[] objArr5 = {exc};
            ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.elderly.payresult.a.a;
            if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "e96d58c1aa4eff82f7fda419376a58b6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "e96d58c1aa4eff82f7fda419376a58b6");
            } else if (z2) {
                PayException payException3 = (PayException) exc;
                Object[] objArr6 = {payException3};
                ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.elderly.payresult.a.a;
                if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "67a37bbe162005bdd5b1357bf400c9f6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "67a37bbe162005bdd5b1357bf400c9f6");
                    return;
                }
                int code = payException3.getCode();
                String message2 = payException3.getMessage();
                com.meituan.android.paybase.common.analyse.a.a("MTCashierActivity", "dealPayException", com.meituan.android.paybase.common.analyse.a.a("errorCode:" + code, "errorMsg:" + message2), "");
                if (code == 117003) {
                    BasePayDialog.b d2 = new ElderlyPayDialog.a(aVar.c).b(aVar.c.getString(R.string.cashierelderly__pay_promote_title)).c(payException3.getMessage()).d(payException3.getErrorCodeStr());
                    Object[] objArr7 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect7 = com.meituan.android.elderly.payresult.b.a;
                    d2.b("知道了", PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "18915c5bef916ced57667e81219a2b82", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "18915c5bef916ced57667e81219a2b82") : new com.meituan.android.elderly.payresult.b(aVar)).a().show();
                } else if (code == 118021) {
                    com.meituan.android.paybase.dialog.e.a((Activity) aVar.c, (Object) Integer.valueOf((int) R.string.cashierelderly__error_msg_pay_later));
                } else if (com.meituan.android.cashier.util.a.a().b()) {
                    com.meituan.android.paycommon.lib.utils.d.a(aVar.c, payException3, new ElderlyPayDialog.a(aVar.c), MTCashierActivity.class);
                } else {
                    com.meituan.android.paycommon.lib.utils.d.a(aVar.c, payException3, new ElderlyPayDialog.a(aVar.c), MTCashierWrapperActivity.class);
                }
            } else {
                com.meituan.android.paybase.dialog.e.a((Activity) aVar.c, (Object) Integer.valueOf((int) R.string.cashierelderly__error_msg_pay_later));
                com.meituan.android.paybase.common.analyse.a.a("MTCashierActivity", "onGotPayException", aVar.c.getString(R.string.cashierelderly__error_msg_pay_later), "");
            }
        }
    }

    public static /* synthetic */ void b(ElderlyCashier elderlyCashier, Dialog dialog) {
        Object[] objArr = {elderlyCashier, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "02f3a62eee75bcbf95e1428ce6d82b48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "02f3a62eee75bcbf95e1428ce6d82b48");
        } else {
            ((MTCashierActivity) elderlyCashier.c).a(1);
        }
    }

    public static /* synthetic */ void a(ElderlyCashier elderlyCashier, Dialog dialog) {
        Object[] objArr = {elderlyCashier, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ebe62a3f8250997a3ecfeef6f83925da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ebe62a3f8250997a3ecfeef6f83925da");
        } else {
            elderlyCashier.s.j();
        }
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
        this.y = false;
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4e6d9aea293d7b58a98518f6e0530fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4e6d9aea293d7b58a98518f6e0530fc");
        } else if (this.C != null) {
            this.C.dismiss();
            this.C = null;
        }
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afb3a0cbea9b396f7ce349fc6860abb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afb3a0cbea9b396f7ce349fc6860abb6");
            return;
        }
        this.B = false;
        ((CashierRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(CashierRequestService.class, this.t, 63)).queryOrder(this.n, this.q, "1", this.b, l(), this.j);
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_cashier_overtime", 200);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f06ef1511bf536cd04dbf6b2eb0f4b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f06ef1511bf536cd04dbf6b2eb0f4b1");
            return;
        }
        this.B = true;
        if (this.c.hasWindowFocus()) {
            k();
        }
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f02a37c4b3c70cc545fcb92fc6e3b32c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f02a37c4b3c70cc545fcb92fc6e3b32c");
        }
        if (TextUtils.isEmpty(this.h)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("outer_business_statics", this.h);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "standardcashier_getExtDimStat", (Map<String, Object>) null);
        }
        return jSONObject.toString();
    }

    public static /* synthetic */ void b(ElderlyCashier elderlyCashier, RetainWindow retainWindow, Dialog dialog) {
        Object[] objArr = {elderlyCashier, retainWindow, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8311d4239ede926d707e65fe12d561f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8311d4239ede926d707e65fe12d561f");
            return;
        }
        com.meituan.android.cashier.common.q.a("c_PJmoK", "b_pay_26e34k6d_mc", "离开收银台挽留弹窗-点击确认离开", new a.c().a("type", "basic").a("sub_type", "1").a("button_name", retainWindow.getLeftButton()).b, ae.a.CLICK, elderlyCashier.p);
        elderlyCashier.s.j();
        elderlyCashier.e();
    }

    public static /* synthetic */ void a(ElderlyCashier elderlyCashier, RetainWindow retainWindow, Dialog dialog) {
        Object[] objArr = {elderlyCashier, retainWindow, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        MTElderlyCashierFragment mTElderlyCashierFragment = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e91eb76092ad109e8eb5becb71ca6dd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e91eb76092ad109e8eb5becb71ca6dd7");
            return;
        }
        com.meituan.android.cashier.common.q.a("c_PJmoK", "b_pay_n3c198vr_mc", "离开收银台挽留弹窗-点击继续支付", new a.c().a("type", "basic").a("sub_type", "1").a("button_name", retainWindow.getRightButton()).b, ae.a.CLICK, elderlyCashier.p);
        if (retainWindow.getSubmitData() != null) {
            String str = retainWindow.getSubmitData().get("payType");
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, elderlyCashier, changeQuickRedirect2, false, "ed8204154a86ba1c0a5df6f2b9674389", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, elderlyCashier, changeQuickRedirect2, false, "ed8204154a86ba1c0a5df6f2b9674389");
            } else {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, elderlyCashier, changeQuickRedirect3, false, "54349d0dca3d9080f31619fd65593150", RobustBitConfig.DEFAULT_VALUE)) {
                    mTElderlyCashierFragment = (MTElderlyCashierFragment) PatchProxy.accessDispatch(objArr3, elderlyCashier, changeQuickRedirect3, false, "54349d0dca3d9080f31619fd65593150");
                } else {
                    Fragment findFragmentById = elderlyCashier.c.getSupportFragmentManager().findFragmentById(elderlyCashier.x);
                    if (findFragmentById instanceof MTElderlyCashierFragment) {
                        mTElderlyCashierFragment = (MTElderlyCashierFragment) findFragmentById;
                    }
                }
                if (mTElderlyCashierFragment != null) {
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("tradeno", elderlyCashier.n);
                    hashMap.put("pay_token", elderlyCashier.q);
                    hashMap.put("pay_type", str);
                    mTElderlyCashierFragment.a(hashMap);
                }
            }
        }
        elderlyCashier.e();
    }

    public final void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e7902fbbf3cba772d516a796b5c1f3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e7902fbbf3cba772d516a796b5c1f3c");
            return;
        }
        this.f = false;
        if (this.G != null) {
            this.H = this.G.getMessage();
            if (this.G.getTimeout() > 0) {
                this.u.sendEmptyMessageDelayed(2, this.G.getTimeout());
            }
        }
        new ElderlyPayDialog.a(activity).b(this.c.getString(R.string.cashierelderly__pay_promote_title)).c(this.H).b(this.c.getString(R.string.cashierelderly__I_have_known), null).a().show();
    }

    @Override // com.meituan.android.cashier.common.h
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4257d32d59b72b629ccced0a60ea046", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4257d32d59b72b629ccced0a60ea046");
        } else {
            aa.a(this, getClass(), bundle);
        }
    }

    @Override // com.meituan.android.cashier.common.h
    public final void b(Bundle bundle) {
        boolean z = true;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1b6747518d71c914f2eb528243b857f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1b6747518d71c914f2eb528243b857f");
            return;
        }
        aa.b(this, getClass(), bundle);
        d();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b606255aa866700319cc6e5f396a9dab", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b606255aa866700319cc6e5f396a9dab")).booleanValue();
        } else if (!StringUtil.NULL.equalsIgnoreCase(this.n) && !TextUtils.isEmpty(this.n) && !TextUtils.isEmpty(this.q) && !StringUtil.NULL.equalsIgnoreCase(this.q)) {
            z = false;
        }
        if (z) {
            ((MTCashierActivity) this.c).a("onRestoreInstanceState_elderlycashier", "native_elderly_cashier");
        } else {
            b();
        }
    }

    @Override // com.meituan.android.paybase.moduleinterface.payment.a
    public final void x_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6efc64e023fc312b93bf4efcfec5e69f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6efc64e023fc312b93bf4efcfec5e69f");
        } else {
            this.g = true;
        }
    }
}
