package com.meituan.android.paybase.password.retrievepassword;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.R;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.config.a;
import com.meituan.android.paybase.webview.PayBaseWebViewWithTitansFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RetrievePasswordActivity extends PayBaseActivity {
    public static ChangeQuickRedirect a;
    private int b;

    public static void a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4229a46b27e2fd9b305344df1dec0f0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4229a46b27e2fd9b305344df1dec0f0d");
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("meituanpayment").authority(Constants.EventType.PAY).appendEncodedPath("password").appendEncodedPath("retrieve").build());
        intent.putExtra(KnbConstants.PARAMS_SCENE, i);
        intent.setPackage(context.getPackageName());
        context.startActivity(intent);
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String builder;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93137e57b266e63992b5cb724b0ad7a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93137e57b266e63992b5cb724b0ad7a9");
            return;
        }
        super.onCreate(bundle);
        getWindow().setFormat(1);
        setContentView(R.layout.paybase__password_retrieve);
        getSupportActionBar().c();
        this.b = f.a(getIntent(), KnbConstants.PARAMS_SCENE, 101);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f058ba602359481ca38e3d07b500e845", RobustBitConfig.DEFAULT_VALUE)) {
            builder = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f058ba602359481ca38e3d07b500e845");
        } else {
            Uri.Builder buildUpon = Uri.parse(a.d().b() + "/api/mpm/findpayhash/redirect").buildUpon();
            StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            buildUpon.appendQueryParameter(KnbConstants.PARAMS_SCENE, sb.toString());
            builder = buildUpon.toString();
        }
        Object[] objArr3 = {builder};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e767fab4e9419daec5ae502287c3d847", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e767fab4e9419daec5ae502287c3d847");
            return;
        }
        PayBaseWebViewWithTitansFragment payBaseWebViewWithTitansFragment = new PayBaseWebViewWithTitansFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString("url", builder);
        payBaseWebViewWithTitansFragment.setArguments(bundle2);
        getSupportFragmentManager().beginTransaction().replace(R.id.pwd_retrieve_web_layout, payBaseWebViewWithTitansFragment).commitAllowingStateLoss();
    }
}
