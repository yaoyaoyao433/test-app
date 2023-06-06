package com.meituan.android.paybase.webview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.moduleinterface.KNBWebViewFragment;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paybase.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.serviceloader.b;
import com.sankuai.waimai.platform.utils.f;
import com.tencent.mapsdk.internal.y;
import com.tencent.smtt.sdk.TbsListener;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class WebViewActivity extends PayBaseActivity {
    public static ChangeQuickRedirect a;
    private static WeakReference<WebViewActivity> c;
    protected PayBaseWebViewWithTitansFragment b;

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fefb8870b50442b8bea9cedf9cf0d4b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fefb8870b50442b8bea9cedf9cf0d4b3");
        } else if (TextUtils.isEmpty(str) || context == null) {
        } else {
            Intent intent = new Intent(context, WebViewActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("url", str);
            intent.setPackage(context.getPackageName());
            intent.putExtras(bundle);
            if (!(context instanceof Activity)) {
                intent.addFlags(y.a);
            }
            context.startActivity(intent);
        }
    }

    public static void a(Activity activity, String str, int i) {
        Object[] objArr = {activity, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad75755c00de7f6ff0dd716ecfb4d9d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad75755c00de7f6ff0dd716ecfb4d9d4");
        } else if (TextUtils.isEmpty(str) || activity == null) {
        } else {
            Intent intent = new Intent(activity, WebViewActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("url", str);
            intent.setPackage(activity.getPackageName());
            intent.putExtras(bundle);
            activity.startActivityForResult(intent, i);
        }
    }

    public static void a(Fragment fragment, String str, int i) {
        Object[] objArr = {fragment, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bcdea437057e24ad97725875a7fc9fbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bcdea437057e24ad97725875a7fc9fbf");
        } else if (TextUtils.isEmpty(str) || fragment == null) {
        } else {
            Intent intent = new Intent(fragment.getActivity(), WebViewActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("url", str);
            intent.setPackage(fragment.getActivity().getPackageName());
            intent.putExtras(bundle);
            fragment.startActivityForResult(intent, i);
        }
    }

    public static void b(Activity activity, String str, int i) {
        Object[] objArr = {activity, str, Integer.valueOf((int) TbsListener.ErrorCode.INFO_CAN_NOT_DISABLED_BY_CRASH)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da83a571add0c86f4837ef5276a819f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da83a571add0c86f4837ef5276a819f3");
        } else if (TextUtils.isEmpty(str) || activity == null) {
        } else {
            Intent intent = new Intent(activity, WebViewActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("url", str);
            bundle.putSerializable("is_cashier_webview", "cashier.webview.fragment");
            intent.setPackage(activity.getPackageName());
            intent.putExtras(bundle);
            activity.startActivityForResult(intent, TbsListener.ErrorCode.INFO_CAN_NOT_DISABLED_BY_CRASH);
        }
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea59d9fffe63424400d8cd718a5bf869", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea59d9fffe63424400d8cd718a5bf869");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.paybase__layout_content);
        c = new WeakReference<>(this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "35e9cd29a955633e15696d49d17fe917", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "35e9cd29a955633e15696d49d17fe917");
            return;
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().c();
        }
        this.b = g();
        getSupportFragmentManager().beginTransaction().add(R.id.content, this.b).commitAllowingStateLoss();
    }

    public PayBaseWebViewWithTitansFragment g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa2d75c3b068582c8bbfa5d8a47d66cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (PayBaseWebViewWithTitansFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa2d75c3b068582c8bbfa5d8a47d66cc");
        }
        if (TextUtils.equals("cashier.webview.fragment", f.a(getIntent(), "is_cashier_webview"))) {
            return k();
        }
        return r();
    }

    private PayBaseWebViewWithTitansFragment k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b51afa604a93fb690585cd837ca4f087", RobustBitConfig.DEFAULT_VALUE)) {
            return (PayBaseWebViewWithTitansFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b51afa604a93fb690585cd837ca4f087");
        }
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().addFlags(67108864);
        }
        getWindow().setBackgroundDrawableResource(R.color.paybase__transparent);
        List a2 = b.a(KNBWebViewFragment.class, "cashier.webview.fragment");
        if (!i.a((Collection) a2)) {
            try {
                KNBWebViewFragment kNBWebViewFragment = (KNBWebViewFragment) a2.get(0);
                kNBWebViewFragment.a().setArguments(i());
                return kNBWebViewFragment.a();
            } catch (Exception e) {
                a.a(e, "WebViewActivity_getFragment", (Map<String, Object>) null);
            }
        }
        return r();
    }

    private PayBaseWebViewWithTitansFragment r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dfba0dbfc805d696e266976c1162e87", RobustBitConfig.DEFAULT_VALUE) ? (PayBaseWebViewWithTitansFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dfba0dbfc805d696e266976c1162e87") : (PayBaseWebViewWithTitansFragment) Fragment.instantiate(this, PayBaseWebViewWithTitansFragment.class.getName(), i());
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bc1691fb27f0a3dcbde7cab2f0d9021", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bc1691fb27f0a3dcbde7cab2f0d9021");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        this.b.onActivityResult(i, i2, intent);
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "316aa3b28a0ce186928241689dab8b1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "316aa3b28a0ce186928241689dab8b1c");
        } else {
            this.b.h();
        }
    }

    public final Bundle i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9eaf4cab27a4c6cc5ab75a1af1b72fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9eaf4cab27a4c6cc5ab75a1af1b72fb");
        }
        Bundle bundle = new Bundle();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            bundle.putAll(extras);
        }
        Uri data = getIntent().getData();
        if (data != null) {
            try {
                String encodedQuery = data.getEncodedQuery();
                if (!TextUtils.isEmpty(encodedQuery)) {
                    int indexOf = encodedQuery.indexOf("url=");
                    int indexOf2 = encodedQuery.indexOf(CommonConstant.Symbol.QUESTION_MARK);
                    if (indexOf == 0 && indexOf2 > indexOf) {
                        bundle.putString("url", URLDecoder.decode(encodedQuery.substring(4)));
                    } else {
                        if (indexOf > 0 && indexOf2 > indexOf) {
                            bundle.putString("url", URLDecoder.decode(encodedQuery.substring(indexOf + 4)));
                            encodedQuery = encodedQuery.substring(0, indexOf);
                        }
                        for (String str : encodedQuery.split("&")) {
                            String[] split = str.split("=");
                            if (split.length > 1) {
                                bundle.putString(split[0], split[1]);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "WebViewActivity_handleIntent").a("message", e.getMessage()).b);
            }
        }
        return bundle;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1344d648f1b51b3da50595832d0ced9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1344d648f1b51b3da50595832d0ced9");
        } else if (com.sankuai.meituan.takeoutnew.util.aop.f.a(this, i, strArr, iArr).b) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            this.b.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public static void j() {
        WebViewActivity webViewActivity;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "918c26ae8e6fc5c75847513c21571c34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "918c26ae8e6fc5c75847513c21571c34");
        } else if (c == null || (webViewActivity = c.get()) == null) {
        } else {
            webViewActivity.finish();
        }
    }
}
