package com.meituan.android.paycommon.lib.settings;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.meituan.android.neohybrid.Neo;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.utils.aj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PaySettingActivity extends PayBaseActivity {
    public static ChangeQuickRedirect a;
    private CheckBox b;
    private OptionView c;
    private OptionView d;
    private CheckBox e;
    private CheckBox f;
    private CheckBox g;
    private CheckBox h;
    private CheckBox i;
    private CheckBox q;
    private CheckBox r;

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        float f;
        float f2;
        int i;
        int i2;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bff24df1a90ab430dfd970a55d85b1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bff24df1a90ab430dfd970a55d85b1e");
            return;
        }
        super.onCreate(bundle);
        ScrollView scrollView = new ScrollView(this);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        Object[] objArr2 = {linearLayout};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d85420b8bd849f8bc7e747b9be7f027", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d85420b8bd849f8bc7e747b9be7f027");
        } else {
            Object[] objArr3 = {linearLayout};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cf549dd4a8da1211d3386892843bdbcc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cf549dd4a8da1211d3386892843bdbcc");
            } else {
                LinearLayout linearLayout2 = new LinearLayout(this);
                linearLayout2.setOrientation(0);
                ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, aj.a(this, 50.0f));
                TextView textView = new TextView(this);
                textView.setText("是否执行并保存当前配置");
                textView.setTextSize(15.0f);
                textView.setGravity(16);
                linearLayout2.addView(textView, new LinearLayout.LayoutParams(0, -2, 1.0f));
                this.b = new CheckBox(this);
                this.b.setGravity(16);
                this.b.setChecked(d.b());
                linearLayout2.addView(this.b);
                linearLayout.addView(linearLayout2, layoutParams2);
            }
            Object[] objArr4 = {linearLayout};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5ce3723412d44b06c9cbb7628c96dde6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5ce3723412d44b06c9cbb7628c96dde6");
            } else {
                LinearLayout linearLayout3 = new LinearLayout(this);
                linearLayout3.setOrientation(0);
                ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                this.c = new OptionView(this);
                this.c.a("SDK Host", g(), Neo.debugger().b("debug_pay_host"));
                linearLayout3.addView(this.c, new LinearLayout.LayoutParams(-1, -2));
                linearLayout.addView(linearLayout3, layoutParams3);
            }
            Object[] objArr5 = {linearLayout};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "9477f65bd4e23dea67960fa387eaa5a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "9477f65bd4e23dea67960fa387eaa5a7");
            } else {
                LinearLayout linearLayout4 = new LinearLayout(this);
                linearLayout4.setOrientation(0);
                ViewGroup.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                this.d = new OptionView(this);
                this.d.a("Hybrid Host", g(), Neo.debugger().b("debug_hybrid_host"));
                linearLayout4.addView(this.d, new LinearLayout.LayoutParams(-1, -2));
                linearLayout.addView(linearLayout4, layoutParams4);
            }
            Object[] objArr6 = {linearLayout};
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "5f6b75987fa362a1105466318ffdf3c5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "5f6b75987fa362a1105466318ffdf3c5");
                f = 50.0f;
                f2 = 15.0f;
            } else {
                LinearLayout linearLayout5 = new LinearLayout(this);
                linearLayout5.setOrientation(0);
                f = 50.0f;
                ViewGroup.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, aj.a(this, 50.0f));
                TextView textView2 = new TextView(this);
                textView2.setText("Horn降级策略使用线上配置");
                f2 = 15.0f;
                textView2.setTextSize(15.0f);
                textView2.setGravity(16);
                linearLayout5.addView(textView2, new LinearLayout.LayoutParams(0, -2, 1.0f));
                this.e = new CheckBox(this);
                this.e.setGravity(16);
                this.e.setChecked(d.e());
                linearLayout5.addView(this.e);
                linearLayout.addView(linearLayout5, layoutParams5);
            }
            Object[] objArr7 = {linearLayout};
            ChangeQuickRedirect changeQuickRedirect7 = a;
            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "d9ce7f4a8c503bf2ccecd600b799773a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "d9ce7f4a8c503bf2ccecd600b799773a");
                i = 1;
            } else {
                LinearLayout linearLayout6 = new LinearLayout(this);
                linearLayout6.setOrientation(0);
                ViewGroup.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, aj.a(this, f));
                TextView textView3 = new TextView(this);
                textView3.setText("Shark长链开关");
                textView3.setTextSize(f2);
                textView3.setGravity(16);
                linearLayout6.addView(textView3, new LinearLayout.LayoutParams(0, -2, 1.0f));
                this.f = new CheckBox(this);
                this.f.setGravity(16);
                this.f.setChecked(d.c());
                linearLayout6.addView(this.f);
                linearLayout.addView(linearLayout6, layoutParams6);
                i = 1;
            }
            Object[] objArr8 = new Object[i];
            objArr8[0] = linearLayout;
            ChangeQuickRedirect changeQuickRedirect8 = a;
            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "2f996b368883adc084616e43d3aec104", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "2f996b368883adc084616e43d3aec104");
            } else {
                LinearLayout linearLayout7 = new LinearLayout(this);
                linearLayout7.setOrientation(0);
                ViewGroup.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, aj.a(this, f));
                TextView textView4 = new TextView(this);
                textView4.setText("KNB是否开启Debug");
                textView4.setTextSize(15.0f);
                textView4.setGravity(16);
                linearLayout7.addView(textView4, new LinearLayout.LayoutParams(0, -2, 1.0f));
                this.g = new CheckBox(this);
                this.g.setGravity(16);
                this.g.setChecked(d.f());
                linearLayout7.addView(this.g);
                linearLayout.addView(linearLayout7, layoutParams7);
            }
            Object[] objArr9 = {linearLayout};
            ChangeQuickRedirect changeQuickRedirect9 = a;
            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "b4d37146d578f0bf9cceee29867cb2e7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "b4d37146d578f0bf9cceee29867cb2e7");
            } else {
                LinearLayout linearLayout8 = new LinearLayout(this);
                linearLayout8.setOrientation(0);
                ViewGroup.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, aj.a(this, f));
                TextView textView5 = new TextView(this);
                textView5.setText("支付Alita开关");
                textView5.setTextSize(15.0f);
                textView5.setGravity(16);
                linearLayout8.addView(textView5, new LinearLayout.LayoutParams(0, -2, 1.0f));
                this.h = new CheckBox(this);
                this.h.setGravity(16);
                this.h.setChecked(d.g());
                linearLayout8.addView(this.h);
                linearLayout.addView(linearLayout8, layoutParams8);
            }
            Object[] objArr10 = {linearLayout};
            ChangeQuickRedirect changeQuickRedirect10 = a;
            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "a403281b194bf3ecfbef59480194361c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "a403281b194bf3ecfbef59480194361c");
            } else {
                LinearLayout linearLayout9 = new LinearLayout(this);
                linearLayout9.setOrientation(0);
                ViewGroup.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, aj.a(this, f));
                TextView textView6 = new TextView(this);
                textView6.setText("接口字段是否加密");
                textView6.setTextSize(15.0f);
                textView6.setGravity(16);
                linearLayout9.addView(textView6, new LinearLayout.LayoutParams(0, -2, 1.0f));
                this.i = new CheckBox(this);
                this.i.setGravity(16);
                this.i.setChecked(d.h());
                linearLayout9.addView(this.i);
                linearLayout.addView(linearLayout9, layoutParams9);
            }
            Object[] objArr11 = {linearLayout};
            ChangeQuickRedirect changeQuickRedirect11 = a;
            if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "64ccd30f877fac7315730dfcf00ff217", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "64ccd30f877fac7315730dfcf00ff217");
                i2 = 1;
            } else {
                LinearLayout linearLayout10 = new LinearLayout(this);
                linearLayout10.setOrientation(0);
                ViewGroup.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, aj.a(this, f));
                TextView textView7 = new TextView(this);
                textView7.setText("微服务是否请求线下 horn 环境");
                textView7.setTextSize(15.0f);
                textView7.setGravity(16);
                linearLayout10.addView(textView7, new LinearLayout.LayoutParams(0, -2, 1.0f));
                this.q = new CheckBox(this);
                this.q.setGravity(16);
                i2 = 1;
                this.q.setChecked(d.a() == 1);
                linearLayout10.addView(this.q);
                linearLayout.addView(linearLayout10, layoutParams10);
            }
            Object[] objArr12 = new Object[i2];
            objArr12[0] = linearLayout;
            ChangeQuickRedirect changeQuickRedirect12 = a;
            if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "1feae98f15385854ff60eb03f2a3c037", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "1feae98f15385854ff60eb03f2a3c037");
            } else {
                LinearLayout linearLayout11 = new LinearLayout(this);
                linearLayout11.setOrientation(0);
                ViewGroup.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-1, aj.a(this, f));
                TextView textView8 = new TextView(this);
                textView8.setText("长辈版开关");
                textView8.setTextSize(15.0f);
                textView8.setGravity(16);
                linearLayout11.addView(textView8, new LinearLayout.LayoutParams(0, -2, 1.0f));
                this.r = new CheckBox(this);
                this.r.setGravity(16);
                this.r.setChecked(d.d());
                linearLayout11.addView(this.r);
                linearLayout.addView(linearLayout11, layoutParams11);
            }
            Object[] objArr13 = {linearLayout};
            ChangeQuickRedirect changeQuickRedirect13 = a;
            if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "8f13d8b8ef01c033d140e2ea2f8c40c3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "8f13d8b8ef01c033d140e2ea2f8c40c3");
            } else {
                LinearLayout linearLayout12 = new LinearLayout(this);
                linearLayout12.setOrientation(0);
                ViewGroup.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-1, aj.a(this, f));
                Button button = new Button(this);
                button.setText("一键打开通用半页");
                button.setTextSize(15.0f);
                button.setGravity(16);
                linearLayout12.addView(button);
                linearLayout.addView(linearLayout12, layoutParams12);
                button.setOnClickListener(a.a(this));
            }
            Object[] objArr14 = {linearLayout};
            ChangeQuickRedirect changeQuickRedirect14 = a;
            if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "7a833465fac272bcaab35b85afc72750", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "7a833465fac272bcaab35b85afc72750");
            } else {
                LinearLayout linearLayout13 = new LinearLayout(this);
                linearLayout13.setOrientation(0);
                ViewGroup.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-1, aj.a(this, f));
                Button button2 = new Button(this);
                button2.setText("Hybrid收银台 调试工具");
                button2.setTextSize(15.0f);
                button2.setGravity(16);
                linearLayout13.addView(button2);
                linearLayout.addView(linearLayout13, layoutParams13);
                button2.setOnClickListener(b.a());
            }
        }
        setContentView(scrollView, layoutParams);
    }

    public static /* synthetic */ void a(PaySettingActivity paySettingActivity, View view) {
        Object[] objArr = {paySettingActivity, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65ef74a6d9c97e31e5cc6efde7c43daf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65ef74a6d9c97e31e5cc6efde7c43daf");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, paySettingActivity, changeQuickRedirect2, false, "a2cc445378b40da868fdbc595d3482fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, paySettingActivity, changeQuickRedirect2, false, "a2cc445378b40da868fdbc595d3482fc");
            return;
        }
        EditText editText = new EditText(paySettingActivity);
        editText.setHint("meituanpayment://halfpage/launch?url=...%26openSource=...&target_scene=...&notice_name=...");
        new AlertDialog.a(paySettingActivity).a("打开通用半页的URL").a(editText).b(IPaymentManager.NO_ACTION, (DialogInterface.OnClickListener) null).a("确定", c.a(paySettingActivity, editText)).b();
    }

    public static /* synthetic */ void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "34dfcc58e2385658ec0de4231474a30f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "34dfcc58e2385658ec0de4231474a30f");
            return;
        }
        try {
            Class.forName("com.meituan.android.paydebugkit.service.DebugService").getDeclaredMethod("start", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ void a(PaySettingActivity paySettingActivity, EditText editText, DialogInterface dialogInterface, int i) {
        Object[] objArr = {paySettingActivity, editText, dialogInterface, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f30f14ea0cba5d23bed01534e32cf8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f30f14ea0cba5d23bed01534e32cf8e");
            return;
        }
        String obj = editText.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(obj));
            intent.setPackage(paySettingActivity.getPackageName());
            paySettingActivity.startActivityForResult(intent, 9999);
        } catch (ActivityNotFoundException unused) {
            com.meituan.android.paybase.dialog.e.a((Activity) paySettingActivity, (Object) "invalid url");
        }
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "828d2eaedb1327a2258fb8487c7cf5b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "828d2eaedb1327a2258fb8487c7cf5b4");
            return;
        }
        super.onPause();
        Neo.debugger().a("debug_pay_host", this.c.getCurrentOption());
        Neo.debugger().a("debug_hybrid_host", this.d.getCurrentOption());
        d.a(this.b.isChecked());
        d.d(this.e.isChecked());
        d.b(this.f.isChecked());
        d.e(this.g.isChecked());
        d.f(this.h.isChecked());
        d.g(this.i.isChecked());
        d.a(this.q.isChecked() ? 1 : 0);
        d.c(this.r.isChecked());
        d.i();
        d.k();
    }

    private String[] g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c467fecc6c08a568d67cc6f9f15a5c7", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c467fecc6c08a568d67cc6f9f15a5c7") : new String[]{"https://pay.meituan.com", "https://npay.meituan.com", "https://stable-pay.st.meituan.com", "http://stable.pay.st.sankuai.com", "http://stable.pay.test.sankuai.com", "http://pay01-sl-cashier.qa.pay.test.sankuai.com", "http://stable.pay.dev.sankuai.com"};
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b29eb220f0d25711e380dc925af2aee7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b29eb220f0d25711e380dc925af2aee7");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        if (i == 9999) {
            if (intent == null) {
                com.meituan.android.privacy.aop.a.b();
                return;
            }
            com.meituan.android.paybase.dialog.e.a((Activity) this, (Object) (f.a(intent, "halfpage_status") + f.a(intent, "halfpage_result")));
        }
        com.meituan.android.privacy.aop.a.b();
    }
}
