package com.unionpay.mobile.android.nocard.views;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.common.StringUtil;
import com.sankuai.xm.im.message.bean.Message;
import com.tencent.liteav.TXLiteAVCode;
import com.unionpay.mobile.android.nocard.utils.UPPayEngine;
import com.unionpay.mobile.android.plugin.BaseActivity;
import com.unionpay.mobile.android.utils.PreferenceUtils;
import com.unionpay.mobile.android.utils.q;
import com.unionpay.tsmservice.data.Constant;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class l extends b implements q.a {
    private String A;
    private int B;
    private volatile int C;
    private boolean D;
    private boolean E;
    private JSONArray F;
    private com.unionpay.mobile.android.model.e G;
    private long H;
    private Activity I;
    private boolean J;
    private boolean K;
    public List<com.unionpay.mobile.android.model.c> r;
    public List<com.unionpay.mobile.android.model.c> s;
    int t;
    String u;
    String v;
    String w;
    int x;
    int y;
    private ProgressBar z;

    public l(Context context) {
        super(context);
        this.z = null;
        this.A = null;
        this.B = 0;
        this.C = 0;
        this.r = null;
        this.s = null;
        this.D = false;
        this.E = false;
        this.K = false;
        this.t = 0;
        this.u = "";
        this.v = "";
        this.w = "";
        this.x = 500;
        this.y = 5;
        this.f = 1;
        this.q = "init";
        d();
        this.I = (Activity) context;
        try {
            this.J = com.unionpay.mobile.android.nocard.utils.a.a(this.I.getIntent(), this.a);
        } catch (Exception unused) {
            this.J = false;
        }
        if (this.a.aM) {
            setVisibility(8);
            this.b.a(com.unionpay.mobile.android.languages.c.bD.c);
        }
        r();
    }

    private void a(String str, String str2, String str3) {
        com.unionpay.mobile.android.widgets.m mVar;
        String str4;
        m mVar2 = new m(this, str3);
        n nVar = new n(this);
        if (!str.equalsIgnoreCase("01")) {
            this.b.a(mVar2, nVar);
            mVar = this.b;
            str4 = com.unionpay.mobile.android.languages.c.bD.ae;
        } else {
            this.b.a(mVar2, nVar);
            mVar = this.b;
            str4 = com.unionpay.mobile.android.languages.c.bD.Y;
        }
        mVar.a(str4, str2, com.unionpay.mobile.android.languages.c.bD.af, com.unionpay.mobile.android.languages.c.bD.ag);
    }

    private void b(int i, String str) {
        if (str != null && str.length() > 0) {
            this.a.I.f = str;
        }
        this.z.setVisibility(4);
        a(c(i), true);
    }

    private void c(String str, String str2) {
        if (str2.length() > 0) {
            this.a.I.f = str2;
        }
        this.z.setVisibility(4);
        a(str, true);
    }

    private boolean f(int i) {
        if ((i & 2) != 0) {
            this.a.aw = true;
            return true;
        }
        return false;
    }

    private final boolean y() {
        try {
            String string = this.F != null ? this.F.getString(3) : null;
            if (string == null || string.length() <= 0) {
                return false;
            }
            return !StringUtil.NULL.equalsIgnoreCase(string);
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0126 A[Catch: all -> 0x0289, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x001d, B:7:0x0024, B:9:0x0030, B:11:0x003a, B:16:0x0045, B:24:0x0054, B:28:0x005a, B:30:0x0062, B:31:0x0067, B:33:0x0077, B:35:0x007d, B:82:0x013d, B:84:0x0149, B:86:0x014f, B:88:0x0159, B:90:0x015f, B:93:0x016a, B:95:0x0176, B:97:0x017a, B:99:0x0185, B:101:0x0189, B:103:0x0194, B:105:0x0198, B:107:0x01a3, B:109:0x01a9, B:111:0x01b5, B:113:0x01bb, B:114:0x01c3, B:116:0x01c9, B:118:0x01d5, B:131:0x01f0, B:110:0x01b1, B:106:0x019f, B:102:0x0190, B:98:0x0181, B:135:0x01f8, B:137:0x01fc, B:139:0x0200, B:146:0x0213, B:148:0x0219, B:150:0x021f, B:152:0x0225, B:154:0x022b, B:155:0x023b, B:157:0x0241, B:159:0x0247, B:161:0x024d, B:174:0x0280, B:162:0x0253, B:164:0x0259, B:166:0x025f, B:168:0x0263, B:170:0x0267, B:172:0x026f, B:173:0x027b, B:141:0x0204, B:143:0x0208, B:134:0x01f5, B:36:0x0084, B:37:0x008c, B:39:0x0090, B:41:0x0094, B:43:0x0098, B:45:0x009c, B:47:0x00a4, B:48:0x00aa, B:50:0x00b0, B:52:0x00bc, B:53:0x00c0, B:55:0x00cc, B:56:0x00d0, B:70:0x0108, B:72:0x010e, B:74:0x0118, B:75:0x0120, B:77:0x0126, B:79:0x0132, B:81:0x0139, B:57:0x00d3, B:59:0x00d9, B:60:0x00de, B:62:0x00e2, B:64:0x00ea, B:65:0x00f3, B:67:0x00f7, B:69:0x00ff), top: B:182:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void z() {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.mobile.android.nocard.views.l.z():void");
    }

    public void a(int i, int i2, String str, String str2, int i3, String str3) {
    }

    @Override // com.unionpay.mobile.android.utils.q.a
    public final void a(int i, byte[] bArr) {
        i();
        if (i != 0) {
            b(i, (String) null);
        }
        com.unionpay.mobile.android.utils.k.a("uppay", "status = ".concat(String.valueOf(i)));
        if (bArr != null) {
            if (!"mounted".equals(Environment.getExternalStorageState())) {
                b(9, (String) null);
            } else if (!com.unionpay.mobile.android.utils.p.a(bArr)) {
                b(21, (String) null);
            } else {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                String str = Environment.getExternalStorageDirectory() + File.separator + "UPPay" + File.separator + "UPPayPluginEx.apk";
                com.unionpay.mobile.android.utils.k.a("uppay", "apk path:".concat(String.valueOf(str)));
                intent.setDataAndType(Uri.fromFile(new File(str)), "application/vnd.android.package-archive");
                ((BaseActivity) this.d).startActivityForResult(intent, 100);
            }
        }
    }

    @Override // com.unionpay.mobile.android.nocard.views.a
    public final void a(JSONObject jSONObject) {
        String a;
        com.unionpay.mobile.android.utils.k.a("uppay", "init.parserParamJsonObj() +++");
        if (jSONObject == null) {
            b(2);
            return;
        }
        switch (this.B) {
            case 1:
                String a2 = com.unionpay.mobile.android.utils.j.a(jSONObject, "secret");
                com.unionpay.mobile.android.utils.j.a(jSONObject, "sec_sign");
                this.e.d(a2);
                String a3 = com.unionpay.mobile.android.utils.j.a(jSONObject, "talking_data_flag");
                if (!TextUtils.isEmpty(a3)) {
                    com.unionpay.mobile.android.global.a.L = "0".equals(a3);
                }
                String a4 = com.unionpay.mobile.android.utils.j.a(jSONObject, "mer_id");
                TextUtils.isEmpty(a4);
                String[] strArr = com.unionpay.mobile.android.utils.o.a;
                new String[1][0] = this.a.b;
                String[] strArr2 = com.unionpay.mobile.android.utils.o.b;
                new String[1][0] = a4;
                String[] strArr3 = com.unionpay.mobile.android.utils.o.c;
                new String[1][0] = com.unionpay.mobile.android.languages.c.bD.a;
                JSONObject c = com.unionpay.mobile.android.utils.j.c(jSONObject, "upgrade_info");
                this.A = com.unionpay.mobile.android.utils.j.a(c, "type");
                String a5 = com.unionpay.mobile.android.utils.j.a(c, "desc");
                String a6 = com.unionpay.mobile.android.utils.j.a(c, "url");
                if (!this.A.equalsIgnoreCase("02")) {
                    this.a.o = com.unionpay.mobile.android.utils.j.a(jSONObject, "title");
                    this.a.j = com.unionpay.mobile.android.utils.j.c(jSONObject, "init_button");
                    this.a.h = com.unionpay.mobile.android.utils.j.d(jSONObject, "order");
                    HashMap hashMap = new HashMap();
                    for (int i = 0; i < this.a.h.length(); i++) {
                        Object b = com.unionpay.mobile.android.utils.j.b(this.a.h, i);
                        if (b != null) {
                            JSONObject jSONObject2 = (JSONObject) b;
                            hashMap.put(com.unionpay.mobile.android.utils.j.a(jSONObject2, "label"), com.unionpay.mobile.android.utils.j.a(jSONObject2, "value"));
                        }
                    }
                    String[] strArr4 = com.unionpay.mobile.android.utils.o.d;
                    new String[1][0] = hashMap.toString();
                    this.a.i = com.unionpay.mobile.android.utils.j.c(jSONObject, "risk_info");
                    List<JSONArray> e = com.unionpay.mobile.android.utils.j.e(jSONObject, "cards");
                    if (e.size() > 0) {
                        this.r = new ArrayList(e.size());
                    }
                    for (int i2 = 0; i2 < e.size(); i2++) {
                        this.r.add(new com.unionpay.mobile.android.model.a(com.unionpay.mobile.android.utils.j.a(e.get(i2), 0), com.unionpay.mobile.android.utils.j.a(e.get(i2), 1), com.unionpay.mobile.android.utils.j.a(e.get(i2), 2), (byte) 0));
                    }
                    this.a.s = com.unionpay.mobile.android.utils.j.a(jSONObject, "bank_url");
                    this.a.t = com.unionpay.mobile.android.utils.j.d(jSONObject, "input_info");
                    this.a.v = com.unionpay.mobile.android.utils.j.c(jSONObject, "account_info");
                    this.a.w = com.unionpay.mobile.android.utils.j.c(jSONObject, "other_card_info");
                    this.a.u = com.unionpay.mobile.android.utils.j.a(jSONObject, "user_id");
                    this.e.b(com.unionpay.mobile.android.utils.j.a(jSONObject, Message.SID));
                    this.e.c(com.unionpay.mobile.android.utils.j.a(jSONObject, "secret"));
                    String a7 = com.unionpay.mobile.android.utils.j.a(jSONObject, Message.SID);
                    if (!TextUtils.isEmpty(a7)) {
                        this.a.k = this.e.h(com.unionpay.mobile.android.utils.c.b(a7));
                    }
                    String a8 = com.unionpay.mobile.android.utils.j.a(jSONObject, "secret");
                    if (!TextUtils.isEmpty(a8)) {
                        this.a.l = this.e.h(com.unionpay.mobile.android.utils.c.b(a8));
                        this.a.m = a8;
                    }
                    String a9 = com.unionpay.mobile.android.utils.j.a(jSONObject, "uid");
                    if (a9 != null && !TextUtils.isEmpty(a9)) {
                        PreferenceUtils.b(this.d, a9);
                    }
                    if (t()) {
                        if (s()) {
                            this.a.x = com.unionpay.mobile.android.utils.j.c(jSONObject, "kalefu_info");
                            this.a.y = com.unionpay.mobile.android.utils.j.a(jSONObject, "kalefu_button_label");
                            if ((this.a.y == null || this.a.y.length() <= 0) && com.unionpay.mobile.android.languages.c.bD != null) {
                                this.a.y = com.unionpay.mobile.android.languages.c.bD.am;
                            }
                        }
                        this.F = com.unionpay.mobile.android.utils.j.d(jSONObject, "cards_desc");
                        this.a.an = com.unionpay.mobile.android.utils.j.a(jSONObject, "trade_privilege");
                        this.a.ap = com.unionpay.mobile.android.utils.j.a(jSONObject, "upcard_msg");
                        this.a.ao = 0;
                        String a10 = com.unionpay.mobile.android.utils.j.a(jSONObject, "upcard_support_type");
                        if (!"1".equalsIgnoreCase(this.a.an) && a10 != null && a10.length() > 0) {
                            this.a.ao = Integer.parseInt(a10, 2);
                        }
                        f(this.a.ao);
                    }
                    this.a.ar = com.unionpay.mobile.android.utils.j.a(jSONObject, "ad");
                    this.a.at = com.unionpay.mobile.android.utils.j.a(jSONObject, "pay_tip");
                    String a11 = com.unionpay.mobile.android.utils.j.a(jSONObject, "sup_pay_method");
                    if (!TextUtils.isEmpty(a11)) {
                        this.a.aC = "01".equals(a11);
                        this.a.aD = "001".equals(a11);
                    }
                    String a12 = com.unionpay.mobile.android.utils.j.a(jSONObject, "default_pay_type");
                    if (!TextUtils.isEmpty(a12)) {
                        this.a.aE = "0501".equals(a12);
                    }
                    this.a.au = com.unionpay.mobile.android.utils.j.c(jSONObject, "find_pwd_url");
                    this.a.Y = com.unionpay.mobile.android.utils.j.c(jSONObject, "reg_url");
                    this.a.ay = "1".equals(com.unionpay.mobile.android.utils.j.a(jSONObject, "sup_nfc"));
                    this.a.az = "1".equals(com.unionpay.mobile.android.utils.j.a(jSONObject, "sup_hce"));
                    com.unionpay.mobile.android.model.b.aA = "1".equals(com.unionpay.mobile.android.utils.j.a(jSONObject, "sup_samsung_pay"));
                    this.a.bh = com.unionpay.mobile.android.utils.j.a(jSONObject, "hce_introduction_url");
                    if (s() && this.a.ay && !this.a.aC) {
                        String a13 = com.unionpay.mobile.android.utils.j.a(jSONObject, "nfc_title");
                        if (!TextUtils.isEmpty(a13)) {
                            com.unionpay.mobile.android.languages.c.bD.bo = a13;
                        }
                        JSONObject c2 = com.unionpay.mobile.android.utils.j.c(jSONObject, "nfc_button");
                        if (c2 != null && (a = com.unionpay.mobile.android.utils.j.a(c2, "label")) != null && !TextUtils.isEmpty(a)) {
                            com.unionpay.mobile.android.languages.c.bD.bp = a;
                        }
                    }
                    if (s() && this.a.az && !this.a.aC && !this.a.aD) {
                        String a14 = com.unionpay.mobile.android.utils.j.a(jSONObject, "hce_title");
                        this.t = com.unionpay.mobile.android.utils.j.b(jSONObject, "hce_page_size");
                        JSONObject c3 = com.unionpay.mobile.android.utils.j.c(jSONObject, "hce_button");
                        String a15 = com.unionpay.mobile.android.utils.j.a(c3, "label");
                        String a16 = com.unionpay.mobile.android.utils.j.a(c3, "htmlLabel");
                        if (TextUtils.isEmpty(a14)) {
                            com.unionpay.mobile.android.languages.c.bD.bq = a15;
                        } else {
                            com.unionpay.mobile.android.languages.c.bD.bq = a14;
                        }
                        if (TextUtils.isEmpty(a16)) {
                            com.unionpay.mobile.android.languages.c.bD.br = a15;
                        } else {
                            com.unionpay.mobile.android.languages.c.bD.br = a16;
                        }
                        this.u = com.unionpay.mobile.android.utils.j.a(c3, "action");
                        this.v = com.unionpay.mobile.android.utils.j.a(c3, "reserved");
                        this.w = com.unionpay.mobile.android.utils.j.a(jSONObject, "iss_ins_code");
                        this.x = com.unionpay.mobile.android.utils.j.b(jSONObject, "hce_bank_timeout");
                        this.y = com.unionpay.mobile.android.utils.j.b(jSONObject, "hce_concurrent_count");
                        int b2 = com.unionpay.mobile.android.utils.j.b(jSONObject, "hce_pay_timeout");
                        if (b2 != 0) {
                            this.a.be = b2;
                        } else {
                            this.a.be = 5000;
                        }
                        this.a.bi = com.unionpay.mobile.android.utils.j.a(jSONObject, "no_hce_card_msg");
                    }
                    com.unionpay.mobile.android.model.b bVar = this.a;
                    bVar.p = new HashMap<>();
                    JSONObject c4 = com.unionpay.mobile.android.utils.j.c(jSONObject, "f55");
                    String a17 = com.unionpay.mobile.android.utils.j.a(c4, "order_amount");
                    bVar.p.put("trans_amt", (a17 == null || a17.length() <= 0) ? Constant.DEFAULT_BALANCE : a17);
                    bVar.bp = com.unionpay.mobile.android.utils.c.c(a17);
                    String a18 = com.unionpay.mobile.android.utils.j.a(c4, "order_currency");
                    bVar.p.put("trans currcy code", (a18 == null || a18.length() <= 0) ? "0156" : a18);
                    bVar.bq = a18;
                    String a19 = com.unionpay.mobile.android.utils.j.a(c4, "trans_type");
                    bVar.p.put("trans_type", (a19 == null || a19.length() <= 0) ? "00" : "00");
                    String a20 = com.unionpay.mobile.android.utils.j.a(c4, "mer_name");
                    bVar.p.put("mer_name", (a20 == null || a20.length() <= 0) ? "" : "");
                    if (this.a.aD) {
                        this.a.u = "";
                    }
                    if (this.A.equalsIgnoreCase("00")) {
                        if (b(this.a.u)) {
                            this.B = 2;
                            this.e.m(String.format("\"user_id\":\"%s\"", this.a.u));
                            break;
                        }
                        u();
                        break;
                    }
                }
                a(this.A, a5, a6);
                break;
            case 2:
                com.unionpay.mobile.android.nocard.utils.f.c(this.a, jSONObject);
                int b3 = com.unionpay.mobile.android.nocard.utils.f.b(this.a, jSONObject);
                if (b3 != 0) {
                    b(b3);
                    break;
                } else {
                    String a21 = com.unionpay.mobile.android.utils.j.a(jSONObject, DeviceInfo.USER_ID);
                    if (!TextUtils.isEmpty(a21)) {
                        String[] strArr5 = com.unionpay.mobile.android.utils.o.e;
                        new Object[1][0] = a21;
                    }
                    this.G = com.unionpay.mobile.android.nocard.utils.f.a(jSONObject);
                    u();
                    break;
                }
        }
        com.unionpay.mobile.android.utils.k.a("uppay", "init.parserParamJsonObj() ---");
    }

    public final void a(boolean z) {
        this.a.ax = z;
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    public final void b(int i) {
        com.unionpay.mobile.android.utils.k.a("uppay", toString() + "doErrHappended() +++");
        b(i, "fail");
        com.unionpay.mobile.android.utils.k.a("uppay", toString() + "doErrHappended() ---");
    }

    public final void c(String str) {
        this.b.a(com.unionpay.mobile.android.languages.c.bD.U);
        new Thread(new com.unionpay.mobile.android.utils.q(this.d, str, this)).start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unionpay.mobile.android.nocard.views.b
    public final void d() {
        super.d();
        this.m.setBackgroundColor(-1);
        setBackgroundDrawable(this.c.a(3008, -1, -1));
        int i = com.unionpay.mobile.android.global.a.I / 2;
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.c.a(TXLiteAVCode.EVT_HW_ENCODER_START_SUCC, i, -1));
        imageView.setId(imageView.hashCode());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, -2);
        layoutParams.addRule(14);
        layoutParams.leftMargin = com.unionpay.mobile.android.global.a.j;
        layoutParams.topMargin = (int) (com.unionpay.mobile.android.global.a.t * 0.3f);
        addView(imageView, layoutParams);
        this.z = new ProgressBar(getContext(), null, 16843399);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(14, -1);
        layoutParams2.addRule(3, imageView.getId());
        layoutParams2.topMargin = com.unionpay.mobile.android.global.a.d * 3;
        addView(this.z, layoutParams2);
        LinearLayout linearLayout = new LinearLayout(this.d);
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(14, -1);
        layoutParams3.addRule(12, -1);
        layoutParams3.bottomMargin = com.unionpay.mobile.android.global.a.b;
        addView(linearLayout, layoutParams3);
        TextView textView = new TextView(this.d);
        textView.setText(com.unionpay.mobile.android.languages.c.bD.a);
        textView.setTextColor(-1);
        textView.setTextSize(14.0f);
        textView.setGravity(1);
        new LinearLayout.LayoutParams(-2, -2).gravity = 14;
        linearLayout.addView(textView, layoutParams3);
        TextView textView2 = new TextView(getContext());
        textView2.setText(com.unionpay.mobile.android.languages.c.bD.b);
        textView2.setTextColor(-1);
        textView2.setTextSize(16.0f);
        textView2.setGravity(1);
        new LinearLayout.LayoutParams(-2, -2).gravity = 14;
        linearLayout.addView(textView2, layoutParams3);
    }

    @Override // com.unionpay.mobile.android.nocard.views.b
    public final void k() {
    }

    public final void r() {
        int i;
        UPPayEngine uPPayEngine;
        String str;
        if (this.K) {
            return;
        }
        this.K = true;
        v();
        this.E = false;
        Activity activity = this.I;
        boolean z = this.J;
        this.e.a();
        try {
            i = Integer.parseInt(this.a.I.c);
        } catch (NumberFormatException unused) {
            i = 0;
        }
        this.H = this.e.initJNIEnv(activity, this.a.f ? 2 : this.a.c ? 1 : 0, i, !"com.unionpay.uppay".equals(com.unionpay.mobile.android.utils.f.b(this.d)), this.a.a, this.a.aO, com.unionpay.mobile.android.utils.c.b(this.a.f ? this.a.d : this.a.b));
        if (!z || this.H == 0 || this.H == -1) {
            if (this.H == -1) {
                b(7, (String) null);
                return;
            } else if (z) {
                return;
            } else {
                b(5, (String) null);
                return;
            }
        }
        this.B = 1;
        this.e.a(this.H);
        if (this.a.f) {
            uPPayEngine = this.e;
            str = this.a.e;
        } else {
            uPPayEngine = this.e;
            str = this.a.b;
        }
        uPPayEngine.b(str, Constant.DEFAULT_CVN2);
        this.e.a(this);
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public final void u() {
        if (this.A.equalsIgnoreCase("02")) {
            j();
            return;
        }
        this.C++;
        this.E = true;
        z();
    }

    public void v() {
        w();
    }

    public final void w() {
        this.C++;
        z();
    }

    public final void x() {
        removeAllViews();
        this.z = null;
    }
}
