package com.unionpay.mobile.android.pro.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.android.cashier.bridge.icashier.ICashierJSHandler;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.common.CommonConstant;
import com.unionpay.mobile.android.nocard.utils.UPPayEngine;
import com.unionpay.mobile.android.upviews.a;
import com.unionpay.mobile.android.upwidget.UPRadiationView;
import com.unionpay.mobile.android.widgets.ay;
import com.unionpay.tsmservice.data.Constant;
import com.unionpay.tsmservice.data.ResultCode;
import com.unionpay.uppay.PayActivity;
import java.security.MessageDigest;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class k extends com.unionpay.mobile.android.nocard.views.b implements Handler.Callback, a.b {
    private static Date ac = new Date(System.currentTimeMillis());
    private static String ad = new SimpleDateFormat("yyyyMMddhhmmss").format((java.util.Date) ac);
    private LinearLayout A;
    private LinearLayout B;
    private RelativeLayout C;
    private LinearLayout D;
    private LinearLayout E;
    private ay F;
    private UPRadiationView G;
    private ImageView H;
    private String I;
    private String J;
    private com.unionpay.mobile.android.upwidget.a K;
    private com.unionpay.mobile.android.upwidget.a L;
    private boolean M;
    private boolean N;
    private com.unionpay.mobile.android.upviews.a O;
    private String P;
    private int Q;
    private NfcAdapter R;
    private FrameLayout S;
    private View.OnClickListener T;
    private View.OnClickListener U;
    private View.OnClickListener V;
    private View.OnClickListener W;
    private View.OnClickListener aa;
    private View.OnClickListener ab;
    private String ae;
    private HashMap<String, String> af;
    public String r;
    UPPayEngine s;
    com.unionpay.mobile.android.pboctransaction.nfc.a t;
    private int u;
    private int v;
    private TextView w;
    private boolean x;
    private com.unionpay.mobile.android.upviews.a y;
    private Handler z;

    public k(Context context, com.unionpay.mobile.android.model.e eVar, UPPayEngine uPPayEngine) {
        super(context, eVar);
        this.u = 20;
        this.v = 100;
        this.r = "1.8";
        this.w = null;
        this.x = false;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.K = null;
        this.L = null;
        this.M = true;
        this.N = false;
        this.O = null;
        this.Q = 5;
        this.T = new l(this);
        this.U = new n(this);
        this.V = new o(this);
        this.W = new p(this);
        this.aa = new q(this);
        this.ab = new r(this);
        this.ae = null;
        this.af = new HashMap<>();
        this.f = 6;
        this.q = "nfcpay";
        this.s = uPPayEngine;
        this.z = new Handler(this);
        this.x = this.a.K;
        setBackgroundColor(-11495169);
        e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean B(k kVar) {
        kVar.M = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(k kVar, String str, String str2) {
        kVar.v = 7;
        kVar.b.a(com.unionpay.mobile.android.languages.c.bD.U);
        kVar.e.c(str, str2);
    }

    private void a(String str, StringBuffer stringBuffer) {
        String str2 = this.af.get(str);
        String a = com.unionpay.mobile.android.pboctransaction.e.a(new byte[]{(byte) (str2.length() / 2)}, 1);
        stringBuffer.append(str);
        stringBuffer.append(a);
        stringBuffer.append(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, HashMap<String, String> hashMap) {
        Object a = ((PayActivity) this.d).a(com.unionpay.mobile.android.pro.pboc.engine.b.class.toString());
        if ((a != null ? (com.unionpay.mobile.android.pro.pboc.engine.b) a : null) == null) {
            super.b(5);
        } else {
            new Thread(new s(this, str, hashMap)).start();
        }
    }

    private static final String d(String str) {
        try {
            byte[] bytes = str.getBytes();
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            return com.unionpay.mobile.android.pboctransaction.e.a(messageDigest.digest());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, String str2) {
        this.v = 8;
        if (TextUtils.isEmpty(str2)) {
            this.e.c(str, "");
        } else {
            this.e.a(str, "\"uuid\":\"" + str2 + CommonConstant.Symbol.DOUBLE_QUOTES, 10);
        }
        this.Q--;
    }

    private static String e(String str, String str2) {
        byte[] a = com.unionpay.mobile.android.pboctransaction.e.a(str);
        byte[] a2 = com.unionpay.mobile.android.pboctransaction.e.a(str2);
        for (int i = 0; i < a.length; i++) {
            a[i] = (byte) (a[i] ^ a2[i]);
        }
        return com.unionpay.mobile.android.pboctransaction.e.a(a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int i(k kVar) {
        kVar.v = 101;
        return 101;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int k(k kVar) {
        kVar.Q = 5;
        return 5;
    }

    private void s() {
        this.v = 103;
        this.e.a(SearchIntents.EXTRA_QUERY, this.a.aj, 3);
        this.u--;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> t() {
        HashMap<String, String> hashMap = new HashMap<>();
        if (this.y != null) {
            hashMap = this.y.c();
        }
        if (this.O != null) {
            HashMap<String, String> c = this.O.c();
            if (c != null && hashMap != null) {
                hashMap.putAll(c);
            } else if (c != null && hashMap == null) {
                return c;
            }
        }
        return hashMap;
    }

    private static Bundle u() {
        Bundle bundle = new Bundle();
        bundle.putString("action_resp_code", "0000");
        return bundle;
    }

    private int v() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) this.d).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public final synchronized Bundle a(String str, HashMap<String, String> hashMap) {
        Bundle u;
        u = u();
        this.af.put("PIN", str);
        StringBuffer stringBuffer = new StringBuffer();
        a("9F26", stringBuffer);
        a("9F27", stringBuffer);
        a("9F10", stringBuffer);
        a("9F37", stringBuffer);
        a("9F36", stringBuffer);
        a("95", stringBuffer);
        a("9A", stringBuffer);
        a("9C", stringBuffer);
        a("9F02", stringBuffer);
        a("5F2A", stringBuffer);
        a("82", stringBuffer);
        a("9F1A", stringBuffer);
        a("9F03", stringBuffer);
        a("9F33", stringBuffer);
        a("9F34", stringBuffer);
        a("9F35", stringBuffer);
        a("9F1E", stringBuffer);
        if (this.af.get("9F63") != null && !TextUtils.isEmpty(this.af.get("9F63"))) {
            a("9F63", stringBuffer);
        }
        this.af.put("DCD", stringBuffer.toString());
        this.I = e(this.I, this.s.b());
        String str2 = (((("pan=" + this.af.get("AN1")) + "&pin=" + this.af.get("PIN")) + "&icc_data=" + this.af.get("DCD")) + "&card_seq_id=" + this.af.get("5F34")) + "&auth_id=" + this.J;
        com.unionpay.mobile.android.utils.k.c("mac", str2);
        String d = d(str2);
        com.unionpay.mobile.android.utils.k.c("md5", d);
        String g = this.e.g(d);
        com.unionpay.mobile.android.utils.k.c("sig", g);
        String a = this.e.a(str2 + "&" + g, this.I);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", this.r);
            jSONObject.put("cmd", Constants.EventType.PAY);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("params", jSONObject2);
            jSONObject2.put("encrypt_key_field", a);
            jSONObject2.put("pay_type", "2");
            jSONObject2.put("pay_mode", "1");
            jSONObject2.put("bind", "no");
            jSONObject2.put("carrier_tp", "7");
            jSONObject2.put("carrier_app_tp", "0");
            jSONObject2.put(DeviceInfo.SIGN, g);
            jSONObject2.put("pan", this.af.get("AN1"));
            if (this.af.get("ED") != null) {
                jSONObject2.put("expire", this.af.get("ED"));
            }
            if (this.af.get("TD2") != null) {
                jSONObject2.put("track2_data", this.af.get("TD2"));
            }
            if (hashMap != null && hashMap.keySet() != null && hashMap.keySet().size() > 0) {
                hashMap.remove("pan");
                hashMap.remove(Constant.KEY_PIN);
                for (String str3 : hashMap.keySet()) {
                    jSONObject2.put(str3, hashMap.get(str3));
                }
            }
            u.putString("action_resp_message", this.s.a(jSONObject.toString()));
        } catch (JSONException unused) {
            u.putString("action_resp_code", ResultCode.ERROR_INTERFACE_GET_SMS_AUTH_CODE);
            return u;
        }
        return u;
    }

    public final void a(NfcAdapter nfcAdapter) {
        this.R = nfcAdapter;
        if (!this.R.isEnabled()) {
            this.B.setVisibility(0);
            this.D.setVisibility(8);
            this.E.setVisibility(0);
            if (this.G != null) {
                this.G.setVisibility(4);
                return;
            }
            return;
        }
        this.B.setVisibility(8);
        if (this.M) {
            this.D.setVisibility(0);
        }
        this.E.setVisibility(8);
        if (this.G != null) {
            this.G.setVisibility(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.unionpay.mobile.android.pboctransaction.nfc.a r9) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.mobile.android.pro.views.k.a(com.unionpay.mobile.android.pboctransaction.nfc.a):void");
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void a(a.C1512a c1512a) {
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    public final void a(String str, boolean z) {
        this.b.a(new m(this, z), null);
        this.b.a(com.unionpay.mobile.android.languages.c.bD.Y, str, com.unionpay.mobile.android.languages.c.bD.W);
    }

    @Override // com.unionpay.mobile.android.nocard.views.a
    public final void a(JSONObject jSONObject) {
        int i = this.v;
        switch (i) {
            case 7:
                i();
                JSONArray d = com.unionpay.mobile.android.utils.j.d(jSONObject, "options");
                if (this.O != null) {
                    this.O.a(d);
                    return;
                }
                return;
            case 8:
                String a = com.unionpay.mobile.android.utils.j.a(jSONObject, "status");
                if (a == null || !"01".equals(a)) {
                    JSONArray d2 = com.unionpay.mobile.android.utils.j.d(jSONObject, "options");
                    String a2 = com.unionpay.mobile.android.utils.j.a(jSONObject, "empty_info");
                    if (this.O != null) {
                        this.O.a(d2, a2);
                        return;
                    }
                    return;
                }
                String a3 = com.unionpay.mobile.android.utils.j.a(jSONObject, "uuid");
                if (this.Q >= 0) {
                    d(this.P, a3);
                    return;
                }
                String str = com.unionpay.mobile.android.languages.c.bD.D;
                if (this.O != null) {
                    this.O.a((JSONArray) null, str);
                    return;
                }
                return;
            default:
                boolean z = true;
                switch (i) {
                    case 101:
                        this.a.aj = com.unionpay.mobile.android.utils.i.a(jSONObject.toString());
                        String a4 = com.unionpay.mobile.android.utils.j.a(jSONObject, "qn");
                        if (!TextUtils.isEmpty(a4)) {
                            this.a.n = this.e.h(com.unionpay.mobile.android.utils.c.b(a4));
                        }
                        if (this.a.aj == null || this.a.aj.length() <= 0) {
                            super.b(2);
                            return;
                        }
                        this.u = 20;
                        s();
                        return;
                    case 102:
                        this.b.c();
                        try {
                            this.I = (String) jSONObject.get("encrypt_key");
                            this.J = (String) jSONObject.get("auth_id");
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        int a5 = com.unionpay.mobile.android.nocard.utils.f.a(this.a, jSONObject, false);
                        this.p = com.unionpay.mobile.android.nocard.utils.f.a(jSONObject);
                        if (a5 != 0) {
                            super.b(a5);
                            return;
                        }
                        this.M = false;
                        this.S.setBackgroundColor(-1052684);
                        setBackgroundColor(-1052684);
                        this.F.setBackgroundColor(com.unionpay.mobile.android.global.a.M);
                        this.F.a(8);
                        this.A.removeAllViews();
                        this.B.setVisibility(8);
                        this.m.setBackgroundColor(-1052684);
                        this.l.setVisibility(0);
                        this.H.setVisibility(8);
                        this.D.setVisibility(8);
                        new LinearLayout.LayoutParams(-1, -2);
                        JSONArray jSONArray = new JSONArray();
                        if (this.p != null) {
                            com.unionpay.mobile.android.model.f fVar = (com.unionpay.mobile.android.model.f) this.p;
                            jSONArray.put(fVar.a(ICashierJSHandler.KEY_PROMOTION));
                            jSONArray.put(fVar.a("instalment"));
                            this.a.aU = fVar.a("promotion_instalment_msgbox");
                        }
                        if (jSONArray.length() > 0) {
                            this.O = new com.unionpay.mobile.android.upviews.a(this.d, jSONArray, this, this.q);
                            this.O.a(this.b, this.a.aU);
                            this.O.a(this.U);
                            this.O.b(this.V);
                            this.O.c(this.W);
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams.topMargin = com.unionpay.mobile.android.global.a.f;
                            this.A.addView(this.O, layoutParams);
                        }
                        if (this.O != null) {
                            this.O.c("instalment");
                        }
                        this.y = new com.unionpay.mobile.android.upviews.a(this.d, this.a.z, this.e.c(), this, this.af.get("AN1"), true, this.q);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams2.topMargin = com.unionpay.mobile.android.global.a.f;
                        this.A.addView(this.y, layoutParams2);
                        LinearLayout linearLayout = new LinearLayout(this.d);
                        linearLayout.setOrientation(1);
                        linearLayout.setId(linearLayout.hashCode());
                        new LinearLayout.LayoutParams(-1, -2);
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams3.topMargin = com.unionpay.mobile.android.global.a.f;
                        layoutParams3.leftMargin = com.unionpay.mobile.android.utils.g.a(this.d, 10.0f);
                        this.A.addView(linearLayout, layoutParams3);
                        if (h() || this.a.al != null || this.a.am != null) {
                            if (this.a.al != null) {
                                Context context = this.d;
                                JSONObject jSONObject2 = this.a.al;
                                View.OnClickListener onClickListener = this.ab;
                                this.L = new com.unionpay.mobile.android.upwidget.a(context, jSONObject2, onClickListener, this.q + "_agree_user_protocol");
                                linearLayout.addView(this.L);
                            }
                            if (this.a.am != null) {
                                Context context2 = this.d;
                                JSONObject jSONObject3 = this.a.am;
                                this.K = new com.unionpay.mobile.android.upwidget.a(context2, jSONObject3, null, this.q + "_remember_bankNO");
                                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                                layoutParams4.topMargin = com.unionpay.mobile.android.global.a.f;
                                linearLayout.addView(this.K, layoutParams4);
                            }
                        }
                        new LinearLayout.LayoutParams(-1, -2);
                        this.w = new TextView(this.d);
                        this.w.setText(com.unionpay.mobile.android.utils.j.a(this.a.C, "label"));
                        this.w.setTextSize(com.unionpay.mobile.android.global.b.i);
                        this.w.setTextColor(o());
                        this.w.setGravity(17);
                        TextView textView = this.w;
                        if (this.y != null && !this.y.e()) {
                            z = false;
                        }
                        textView.setEnabled(z);
                        int i2 = com.unionpay.mobile.android.global.a.n;
                        this.w.setBackgroundDrawable(this.c.a(2008, -1, -1));
                        this.w.setOnClickListener(this.T);
                        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, i2);
                        layoutParams5.topMargin = com.unionpay.mobile.android.global.a.f;
                        int a6 = com.unionpay.mobile.android.utils.g.a(this.d, 10.0f);
                        layoutParams5.rightMargin = a6;
                        layoutParams5.leftMargin = a6;
                        this.A.addView(this.w, layoutParams5);
                        return;
                    case 103:
                        String a7 = com.unionpay.mobile.android.utils.j.a(jSONObject, "status");
                        String a8 = com.unionpay.mobile.android.utils.j.a(jSONObject, "fail_msg");
                        if (this.u > 0 && a7.equalsIgnoreCase("01")) {
                            s();
                            return;
                        }
                        this.v = 100;
                        if (!a7.equalsIgnoreCase("00")) {
                            i();
                            if (!a7.equalsIgnoreCase(Constant.RECHARGE_MODE_BUSINESS_OFFICE)) {
                                if (this.u <= 0) {
                                    a(this.a.ak);
                                    return;
                                }
                                return;
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.q);
                            sb.append("_fail");
                            String[] strArr = com.unionpay.mobile.android.utils.o.j;
                            String[] strArr2 = {a7, a8};
                            a(a8);
                            return;
                        }
                        i();
                        this.v = 100;
                        this.a.H = com.unionpay.mobile.android.utils.j.d(jSONObject, "result");
                        this.a.P = com.unionpay.mobile.android.utils.j.a(jSONObject, "openupgrade_flag");
                        this.a.Q = com.unionpay.mobile.android.utils.j.a(jSONObject, "temporary_pay_flag");
                        this.a.R = com.unionpay.mobile.android.utils.j.a(jSONObject, "temporary_pay_info");
                        this.a.V = com.unionpay.mobile.android.utils.j.a(jSONObject, "front_url");
                        this.a.W = com.unionpay.mobile.android.utils.j.a(jSONObject, "front_request");
                        this.a.A = com.unionpay.mobile.android.utils.j.a(jSONObject, "title");
                        this.a.B = com.unionpay.mobile.android.utils.j.a(jSONObject, "succ_info");
                        com.unionpay.mobile.android.nocard.utils.b.b(jSONObject, this.a);
                        com.unionpay.mobile.android.nocard.utils.b.a(jSONObject, this.a);
                        if (this.y != null) {
                            this.y.f();
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.q);
                        sb2.append("_succeed");
                        if (!this.a.f) {
                            d(8);
                            return;
                        }
                        this.a.I.f = "success";
                        j();
                        return;
                    case 104:
                        try {
                            this.I = (String) jSONObject.get("encrypt_key");
                            this.J = (String) jSONObject.get("auth_id");
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        if (this.a.p != null) {
                            a.C1512a a9 = this.y.a();
                            if (!a9.a()) {
                                a(a9.b);
                                return;
                            }
                            this.v = 101;
                            b(this.y.a().b, t());
                            return;
                        }
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void a(boolean z) {
        if (this.w != null) {
            this.w.setEnabled(!z);
        }
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    public final void b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        this.F = this.a.aD ? new ay(this.d, com.unionpay.mobile.android.languages.c.bD.bo, this.c.a(1030, -1, -1), com.unionpay.mobile.android.utils.g.a(this.d, 20.0f), this) : new ay(getContext(), com.unionpay.mobile.android.languages.c.bD.bo, this);
        this.F.setBackgroundColor(-16686660);
        this.F.a(0);
        layoutParams.addRule(13, -1);
        this.k.addView(this.F, layoutParams);
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    public final void b(int i) {
        super.b(i);
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    public final void c() {
        setBackgroundColor(-11495169);
        this.l.setVisibility(8);
        this.S = new FrameLayout(this.d);
        this.m.addView(this.S, new RelativeLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (v() - com.unionpay.mobile.android.global.b.n) - (com.unionpay.mobile.android.global.b.n / 2));
        this.A = new LinearLayout(this.d);
        this.A.setId(this.A.hashCode());
        this.A.setOrientation(1);
        this.S.addView(this.A, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(com.unionpay.mobile.android.global.b.n * 2, com.unionpay.mobile.android.global.b.n * 2);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) this.d).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        layoutParams2.leftMargin = (displayMetrics.widthPixels / 2) - com.unionpay.mobile.android.global.b.n;
        layoutParams2.topMargin = (v() / 2) - (com.unionpay.mobile.android.global.b.n * 2);
        this.H = new ImageView(this.d);
        this.H.setBackgroundDrawable(this.c.a(1032, -1, -1));
        this.S.addView(this.H, layoutParams2);
        this.E = new LinearLayout(this.d);
        this.E.setBackgroundColor(-1342177280);
        this.S.addView(this.E, new FrameLayout.LayoutParams(-1, -1));
        this.C = new RelativeLayout(this.d);
        this.S.addView(this.C, new FrameLayout.LayoutParams(-1, -1));
        this.m.setBackgroundColor(-11495169);
        LinearLayout linearLayout = this.A;
        this.A.removeAllViews();
        this.G = new UPRadiationView(this.d);
        linearLayout.addView(this.G, new LinearLayout.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = this.C;
        relativeLayout.setGravity(1);
        int a = com.unionpay.mobile.android.utils.g.a(this.d, 10.0f);
        this.B = new LinearLayout(this.d);
        this.B.setId(this.B.hashCode());
        this.B.setOrientation(0);
        int i = a * 2;
        this.B.setPadding(i, a, i, a);
        Drawable a2 = this.c.a(1033, -1, -1);
        this.B.setBackgroundDrawable(a2);
        String str = com.unionpay.mobile.android.languages.c.bD.bl;
        TextView textView = new TextView(this.d);
        textView.setTextColor(-1);
        textView.setText(str);
        textView.setTextSize(com.unionpay.mobile.android.global.b.k);
        this.B.addView(textView);
        String str2 = com.unionpay.mobile.android.languages.c.bD.bm;
        TextView textView2 = new TextView(this.d);
        textView2.setTextColor(-16729682);
        textView2.setText(str2);
        textView2.setTextSize(com.unionpay.mobile.android.global.b.k);
        textView2.setOnClickListener(this.aa);
        this.B.addView(textView2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(10, -1);
        layoutParams3.topMargin = com.unionpay.mobile.android.global.b.n;
        relativeLayout.addView(this.B, layoutParams3);
        this.D = new LinearLayout(this.d);
        this.D.setId(this.D.hashCode());
        this.D.setOrientation(0);
        this.D.setGravity(17);
        this.D.setPadding(i, a, i, a);
        this.D.setBackgroundDrawable(a2);
        String str3 = com.unionpay.mobile.android.languages.c.bD.bn;
        TextView textView3 = new TextView(this.d);
        textView3.setTextColor(-1);
        textView3.setText(str3);
        textView3.setTextSize(com.unionpay.mobile.android.global.b.k);
        this.D.addView(textView3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(12, -1);
        layoutParams4.bottomMargin = com.unionpay.mobile.android.global.b.n;
        relativeLayout.addView(this.D, layoutParams4);
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void c(String str) {
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void c(String str, String str2) {
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.obj != null) {
            Bundle bundle = (Bundle) message.obj;
            String string = bundle.getString("action_resp_code");
            String string2 = bundle.getString("action_resp_message");
            if (!"0000".equalsIgnoreCase(string)) {
                ResultCode.ERROR_INTERFACE_GET_CARD_INFO.equalsIgnoreCase(string);
                a(this.a.ap, false);
                return true;
            } else if (string2 != null) {
                a(0, string2);
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    public final void k() {
        if (this.a.aD) {
            this.b.a(new t(this), new u(this));
            this.b.a(com.unionpay.mobile.android.languages.c.bD.Y, com.unionpay.mobile.android.languages.c.bD.av, com.unionpay.mobile.android.languages.c.bD.W, com.unionpay.mobile.android.languages.c.bD.X);
        } else if (this.y == null || !this.y.d()) {
            if (this.a.K && this.x) {
                this.a.K = false;
                m();
                return;
            }
            this.a.K = false;
            this.M = false;
            a(2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.y != null) {
            this.y.d();
        }
        if (this.G != null) {
            this.G.a();
        }
        this.G = null;
        this.b = null;
    }

    @Override // com.unionpay.mobile.android.upviews.a.b
    public final void r() {
    }
}
