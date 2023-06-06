package com.meituan.android.ocr;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.config.b;
import com.meituan.android.paybase.utils.t;
import com.meituan.android.paybase.widgets.keyboard.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DisplayCardNumActivity extends PayBaseActivity implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private ImageView b;
    private LinearLayout c;
    private String d;
    private String e;
    private String f;
    private com.meituan.android.paybase.widgets.keyboard.a g;

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        EditText editText;
        int i = 1;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44d6bc497bdc17ae0e1a8df073b7ecaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44d6bc497bdc17ae0e1a8df073b7ecaf");
            return;
        }
        setTheme(2131558925);
        super.onCreate(bundle);
        getSupportActionBar().c();
        getWindow().setBackgroundDrawableResource(R.color.paybase__transparent);
        setContentView(R.layout.cardocr_display_card_num_activity);
        this.b = (ImageView) findViewById(R.id.display_pic);
        this.c = (LinearLayout) findViewById(R.id.display_num_layout);
        this.g = new com.meituan.android.paybase.widgets.keyboard.a(this, (LinearLayout) findViewById(R.id.root_view));
        this.d = com.sankuai.waimai.platform.utils.f.a(getIntent(), "cardNum");
        this.e = com.sankuai.waimai.platform.utils.f.a(getIntent(), "businessPlatform");
        this.f = com.sankuai.waimai.platform.utils.f.a(getIntent(), "reportParams");
        Button button = (Button) findViewById(R.id.confirm__num_button);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc7309ada47dc1dfe6ef2e27c2162f91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc7309ada47dc1dfe6ef2e27c2162f91");
        } else {
            this.b.setImageBitmap((Bitmap) getIntent().getParcelableExtra("numPhoto"));
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2789a0478d16a49028f5dad05f07f3ff", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2789a0478d16a49028f5dad05f07f3ff");
            } else if (!TextUtils.isEmpty(this.d)) {
                String[] split = this.d.split(StringUtil.SPACE);
                if (split.length == 1) {
                    this.d = this.d.replaceAll("\\d{4}(?!$)", "$0 ");
                    split = this.d.split(StringUtil.SPACE);
                }
                String[] strArr = split;
                int i2 = 0;
                while (i2 < strArr.length) {
                    this.c.addView(g());
                    String str = strArr[i2];
                    Object[] objArr4 = new Object[i];
                    objArr4[0] = str;
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8c673eea7e724438ad44d06a6374d9a8", RobustBitConfig.DEFAULT_VALUE)) {
                        editText = (EditText) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8c673eea7e724438ad44d06a6374d9a8");
                    } else {
                        editText = (EditText) LayoutInflater.from(this).inflate(R.layout.paybase__card_numer_text, (ViewGroup) null);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.paybase__display_card_num_width), -1, 1.0f);
                        layoutParams.weight = str.length() / this.d.replaceAll(StringUtil.SPACE, "").length();
                        editText.setLayoutParams(layoutParams);
                        editText.setText(str.trim());
                        editText.setOnTouchListener(new a.View$OnTouchListenerC0338a(this.g, 1));
                    }
                    this.c.addView(editText);
                    i2++;
                    i = 1;
                }
                this.c.addView(g());
            }
        }
        findViewById(R.id.close_display).setOnClickListener(this);
        button.setOnClickListener(this);
        com.meituan.android.paybase.common.analyse.a.a("b_pay_eswph8o4_mc", "银行卡OCR扫描结果弹窗", a((HashMap<String, Object>) null), a.EnumC0329a.VIEW, -1);
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61f98a0c3d06a854e3edf53774f2388b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61f98a0c3d06a854e3edf53774f2388b");
            return;
        }
        int a2 = com.meituan.android.paybase.common.utils.d.a(b.a.THEME);
        if (a2 < 0) {
            a2 = R.style.ocr__PaymentTheme;
        }
        setTheme(a2);
        try {
            if (getTheme() != null) {
                getTheme().applyStyle(R.style.paybase__textColor, false);
            }
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e);
        }
    }

    private HashMap<String, Object> a(HashMap<String, Object> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b5787f6bf97d71e54f3a5f842655ca5", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b5787f6bf97d71e54f3a5f842655ca5");
        }
        if (TextUtils.isEmpty(this.e)) {
            return hashMap;
        }
        if (com.meituan.android.paybase.utils.i.a(hashMap)) {
            hashMap = new a.c().b;
        }
        hashMap.put("report_params", this.f);
        return hashMap;
    }

    @SuppressLint({"InflateParams"})
    private View g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd00d073f5ab2ec07b15c3d54a36ef02", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd00d073f5ab2ec07b15c3d54a36ef02");
        }
        View inflate = LayoutInflater.from(this).inflate(R.layout.paybase__vertical_divider, (ViewGroup) null);
        inflate.setLayoutParams(new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.paybase__divider_width), -1));
        return inflate;
    }

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb4a95180aefa09cc7f54172908a652b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb4a95180aefa09cc7f54172908a652b");
        } else if (this.g.f) {
            this.g.a();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String sb;
        int i;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4b55a6efbabd9defeb7b89da147bf4b", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4b55a6efbabd9defeb7b89da147bf4b");
            return;
        }
        if (view.getId() == R.id.confirm__num_button) {
            t.a(getString(R.string.cardocr__mge_cid_got_result), getString(R.string.cardocr__mge_act_click_confirm));
            com.meituan.android.paybase.common.analyse.a.a("b_c32zvdn5", "DisplayCardNumActivity", "点击确认无误", (Map<String, Object>) null, "click");
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d04cf3941ef2a46d772b74f2b63c289", RobustBitConfig.DEFAULT_VALUE)) {
                sb = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d04cf3941ef2a46d772b74f2b63c289");
            } else {
                StringBuilder sb2 = new StringBuilder();
                for (int i2 = 0; i2 < this.c.getChildCount(); i2++) {
                    View childAt = this.c.getChildAt(i2);
                    if (childAt instanceof EditText) {
                        sb2.append(((EditText) childAt).getText().toString().trim().replace(StringUtil.SPACE, ""));
                    }
                }
                sb = sb2.toString();
            }
            Intent intent = getIntent();
            intent.putExtra("fixedNum", sb);
            if (!TextUtils.equals(this.d.replaceAll(StringUtil.SPACE, ""), sb)) {
                com.meituan.android.paybase.common.analyse.a.a("b_a0wxerii", "DisplayCardNumActivity", "点击修改卡号", (Map<String, Object>) null, "click");
                com.meituan.android.paybase.common.analyse.a.a("b_pay_fhbyon9t_mc", "修改卡号", (Map<String, Object>) null, a.EnumC0329a.CLICK, -1);
                t.a(getString(R.string.cardocr__mge_cid_got_result), getString(R.string.cardocr__mge_act_modify_card_num));
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_recognise_bankcard_ocr", 1170001);
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_modified_bankcard_ocr", 1170005);
                intent.putExtra("fixed", true);
                i = 1;
            } else {
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_recognise_bankcard_ocr", 200);
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_modified_bankcard_ocr", 1170006);
                i = 0;
            }
            com.meituan.android.paybase.common.analyse.a.a("b_pay_uqc7f87h_mc", "点击卡号确认无误", a(new a.c().a("is_modified", Integer.valueOf(i)).b), a.EnumC0329a.CLICK, -1);
            setResult(-1, intent);
            finish();
        }
        if (view.getId() == R.id.close_display) {
            t.a(getString(R.string.cardocr__mge_cid_got_result), getString(R.string.cardocr__mge_act_close));
            com.meituan.android.paybase.common.analyse.a.a("b_pay_aro559i8_mc", "点击关闭", (Map<String, Object>) null, a.EnumC0329a.CLICK, -1);
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_recognise_bankcard_ocr", 200);
            finish();
        }
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dbbe81488b0011a3a650c87ade5bdb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dbbe81488b0011a3a650c87ade5bdb9");
            return;
        }
        super.startActivityForResult(intent, i);
        overridePendingTransition(0, 0);
    }
}
