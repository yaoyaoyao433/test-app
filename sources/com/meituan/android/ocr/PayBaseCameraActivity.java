package com.meituan.android.ocr;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.FragmentTransaction;
import com.meituan.android.paybase.activity.BaseActivity;
import com.meituan.android.paybase.utils.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PayBaseCameraActivity extends BaseActivity implements c {
    public static ChangeQuickRedirect a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Uri data;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c826b7ee6c2b859fbc0e88c5d2edcf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c826b7ee6c2b859fbc0e88c5d2edcf6");
            return;
        }
        setTheme(2131558925);
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(R.color.paybase__background_color);
        setContentView(R.layout.cardocr_camera_acitvity);
        if (getSupportActionBar() != null) {
            getSupportActionBar().c();
        }
        if (getIntent() != null && (data = getIntent().getData()) != null) {
            this.b = data.getQueryParameter("pay_token");
            this.c = data.getQueryParameter("trans_id");
            this.d = data.getQueryParameter("userid");
            this.e = data.getQueryParameter("business_platform");
            this.f = data.getQueryParameter("report_params");
        }
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        Object[] objArr2 = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62cd45aeab94643051a9070b1f193166", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62cd45aeab94643051a9070b1f193166");
            return;
        }
        PayBaseCameraFragment a2 = PayBaseCameraFragment.a(str, str2, str3, str4, str5);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.content, a2);
        beginTransaction.commitAllowingStateLoss();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3382fc3abb70e3515b48411505c32b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3382fc3abb70e3515b48411505c32b3");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        if (i == 1111) {
            if (i2 != -1) {
                com.meituan.android.privacy.aop.a.b();
                return;
            }
            if (com.sankuai.waimai.platform.utils.f.a(intent, "fixed", false)) {
                t.a(getString(R.string.cardocr__mge_cid_scan_card), getString(R.string.cardocr__mge_act_got_fail_result));
            }
            String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "fixedNum");
            Intent intent2 = getIntent();
            intent2.putExtra("cardNum", a2);
            setResult(-1, intent2);
            finish();
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38250b04e9d6720b3eb872417a07ed7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38250b04e9d6720b3eb872417a07ed7b");
            return;
        }
        super.startActivityForResult(intent, i);
        overridePendingTransition(0, 0);
    }

    @Override // com.meituan.android.ocr.c
    public final void a(String str, Bitmap bitmap) {
        Object[] objArr = {str, bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58ab6cd725af40070e74d05f3e15ff1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58ab6cd725af40070e74d05f3e15ff1f");
            return;
        }
        Intent intent = new Intent(this, DisplayCardNumActivity.class);
        intent.putExtra("numPhoto", bitmap);
        intent.putExtra("cardNum", str);
        intent.putExtra("businessPlatform", this.e);
        intent.putExtra("reportParams", this.f);
        startActivityForResult(intent, 1111);
    }
}
