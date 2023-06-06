package com.meituan.android.paycommon.lib.webview.specialcontainer.dialogclose;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.meituan.android.paybase.utils.ab;
import com.meituan.android.paybase.utils.j;
import com.meituan.android.paybase.webview.PayBaseWebViewWithTitansFragment;
import com.meituan.android.paybase.webview.WebViewActivity;
import com.meituan.android.paycommon.lib.widgets.CornersLinearLayout;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class WebViewDialogCloseActivity extends WebViewActivity {
    public static ChangeQuickRedirect c;

    @Override // com.meituan.android.paybase.webview.WebViewActivity, com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e628f4ef0250f0cd30f409438624327", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e628f4ef0250f0cd30f409438624327");
            return;
        }
        super.onCreate(bundle);
        if (getSupportActionBar() != null) {
            getSupportActionBar().c();
        }
        getWindow().setBackgroundDrawableResource(R.color.paybase__transparent);
        setContentView(R.layout.paycommon__webview_dialog_close);
        findViewById(R.id.webview_close).setOnClickListener(a.a(this));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3df6c722744fe1115708a7d35b9478b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3df6c722744fe1115708a7d35b9478b");
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.root_view);
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        layoutParams.height = (int) (ab.b((Context) this) * 0.9f);
        relativeLayout.setLayoutParams(layoutParams);
        ((CornersLinearLayout) findViewById(R.id.content)).setCorners(getResources().getDimension(R.dimen.paycommon__webview_round_conner));
    }

    public static /* synthetic */ void a(WebViewDialogCloseActivity webViewDialogCloseActivity, View view) {
        Object[] objArr = {webViewDialogCloseActivity, view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ccd795ea893a405b33743bed587840da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ccd795ea893a405b33743bed587840da");
        } else {
            webViewDialogCloseActivity.finish();
        }
    }

    @Override // com.meituan.android.paybase.webview.WebViewActivity
    public final PayBaseWebViewWithTitansFragment g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ceee65eb23bba5cb12ae8bf1611716f", RobustBitConfig.DEFAULT_VALUE) ? (PayBaseWebViewWithTitansFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ceee65eb23bba5cb12ae8bf1611716f") : (PayBaseWebViewWithTitansFragment) Fragment.instantiate(this, WebViewDialogCloseFragment.class.getName(), i());
    }

    public static void b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "286331897a52be90556c73331acb251c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "286331897a52be90556c73331acb251c");
        } else if (context == null || TextUtils.isEmpty(str)) {
        } else {
            if (!str.startsWith(AbsApiFactory.HTTP) && !str.startsWith(AbsApiFactory.HTTPS)) {
                Object[] objArr2 = {context, str};
                ChangeQuickRedirect changeQuickRedirect2 = j.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "81b0cc41b3e58949c034fd3e71730fb9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "81b0cc41b3e58949c034fd3e71730fb9");
                    return;
                } else {
                    j.a(context, str, true);
                    return;
                }
            }
            Intent intent = new Intent(context, WebViewDialogCloseActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("url", str);
            intent.setPackage(context.getPackageName());
            intent.putExtras(bundle);
            intent.addFlags(536870912);
            context.startActivity(intent);
        }
    }
}
