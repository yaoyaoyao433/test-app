package com.sankuai.waimai.business.knb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.ViewStub;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.knb.h;
import com.sankuai.waimai.business.knb.handlers.ClearHistoryHandler;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.platform.shop.channellabel.ChannelLabelController;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KNBWebViewActivity extends BaseActivity implements c, h.a, ClearHistoryHandler.a {
    public static ChangeQuickRedirect b;
    private KNBFragment a;
    boolean c;
    private com.sankuai.waimai.platform.domain.core.channel.a d;
    private ViewStub e;
    private ChannelLabelController f;
    private Map<String, com.sankuai.waimai.foundation.core.service.user.b> g;
    private BroadcastReceiver h;
    private com.sankuai.waimai.foundation.core.service.user.b i;

    public boolean b() {
        return false;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity
    public final String e() {
        return "FE";
    }

    public KNBWebViewActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63a2c77369701aa94971fa96a691edbd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63a2c77369701aa94971fa96a691edbd");
            return;
        }
        this.g = new HashMap();
        this.h = new BroadcastReceiver() { // from class: com.sankuai.waimai.business.knb.KNBWebViewActivity.1
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Object[] objArr2 = {context, intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0f64714b6833fb12a0e3ce603a86d23", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0f64714b6833fb12a0e3ce603a86d23");
                } else {
                    KNBWebViewActivity.this.a.c.getWebView().reload();
                }
            }
        };
        this.i = new com.sankuai.waimai.foundation.core.service.user.b() { // from class: com.sankuai.waimai.business.knb.KNBWebViewActivity.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.core.service.user.b
            public final void onChanged(b.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "42296f73caea6f7652815c54a82f6cfc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "42296f73caea6f7652815c54a82f6cfc");
                    return;
                }
                for (com.sankuai.waimai.foundation.core.service.user.b bVar : KNBWebViewActivity.this.g.values()) {
                    bVar.onChanged(aVar);
                }
            }

            @Override // com.sankuai.waimai.foundation.core.service.user.b
            public final void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
                Object[] objArr2 = {enumC0948b};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "beed85bdf39428c8ab654e138ccfa16a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "beed85bdf39428c8ab654e138ccfa16a");
                    return;
                }
                for (com.sankuai.waimai.foundation.core.service.user.b bVar : KNBWebViewActivity.this.g.values()) {
                    bVar.onAccountInfoUpdate(enumC0948b);
                }
            }
        };
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String builder;
        boolean z;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ba3db0710b7bbdb0f34a983de3303c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ba3db0710b7bbdb0f34a983de3303c6");
            return;
        }
        super.onCreate(bundle);
        if (!b()) {
            setContentView(R.layout.wm_knb_web_activity);
        }
        com.sankuai.waimai.business.knb.utils.b.a("webview", f());
        String f = f();
        Intent intent = getIntent();
        if (intent != null) {
            this.c = com.sankuai.waimai.platform.utils.f.a(intent, "isHideTitleBar", false);
        }
        if (TextUtils.isEmpty(f)) {
            finish();
            return;
        }
        com.sankuai.waimai.business.knb.webview.c.c = false;
        if (!com.sankuai.waimai.foundation.utils.d.a(com.sankuai.waimai.business.knb.webview.c.b)) {
            Uri parse = Uri.parse(f);
            if (parse != null && com.sankuai.waimai.business.knb.webview.c.b.contains(parse.getPath())) {
                String[] strArr = {"token", "wm_logintoken"};
                Object[] objArr2 = {parse, strArr};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.knb.util.b.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "96ccd9746de65c9e1208278ba639da88", RobustBitConfig.DEFAULT_VALUE)) {
                    parse = (Uri) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "96ccd9746de65c9e1208278ba639da88");
                } else if (parse != null && parse.getQueryParameterNames() != null && parse.getQueryParameterNames().size() > 0) {
                    Uri.Builder builder2 = new Uri.Builder();
                    builder2.scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath()).fragment(parse.getFragment());
                    Set<String> queryParameterNames = parse.getQueryParameterNames();
                    if (queryParameterNames != null && queryParameterNames.size() > 0) {
                        for (String str : queryParameterNames) {
                            if (!TextUtils.isEmpty(str)) {
                                int i = 0;
                                while (true) {
                                    if (i >= 2) {
                                        z = false;
                                        break;
                                    } else if (str.equals(strArr[i])) {
                                        z = true;
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                                if (!z) {
                                    builder2.appendQueryParameter(str, parse.getQueryParameter(str));
                                }
                            }
                        }
                    }
                    parse = builder2.build();
                }
                com.sankuai.waimai.business.knb.webview.c.c = true;
            }
            f = parse.toString();
        }
        String str2 = f;
        Object[] objArr3 = {str2};
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b5e029aedf3ef587470db9ede32891bf", RobustBitConfig.DEFAULT_VALUE)) {
            builder = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b5e029aedf3ef587470db9ede32891bf");
        } else {
            Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
            buildUpon.appendQueryParameter("wmUserIdDeregistration", String.valueOf(com.sankuai.waimai.platform.b.A().y()));
            buildUpon.appendQueryParameter("wmUuidDeregistration", String.valueOf(com.sankuai.waimai.platform.b.A().z()));
            builder = buildUpon.toString();
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        boolean a = com.meituan.android.preload.c.a(this, "waimaiapp", builder);
        if (!a) {
            this.a = (KNBFragmentCommon) supportFragmentManager.findFragmentByTag("KNBFragmentCommon");
            if (this.a == null) {
                this.a = (KNBFragmentCommon) Fragment.instantiate(this, KNBFragmentCommon.class.getName(), b(builder));
                supportFragmentManager.beginTransaction().add(R.id.takeout_knb_container, this.a, "KNBFragmentCommon").commitAllowingStateLoss();
            }
        } else {
            this.a = (KNBFragmentPreload) supportFragmentManager.findFragmentByTag("KNBFragmentPreload");
            if (this.a == null) {
                this.a = (KNBFragmentPreload) Fragment.instantiate(this, KNBFragmentPreload.class.getName(), b(builder));
                supportFragmentManager.beginTransaction().add(R.id.takeout_knb_container, this.a, "KNBFragmentPreload").commitAllowingStateLoss();
            }
        }
        f.a(a);
        a(getIntent(), builder);
        this.e = (ViewStub) findViewById(R.id.layout_channel_label);
        this.f = new ChannelLabelController(bB_(), this.e);
        this.f.a(this.d, 1);
        LocalBroadcastManager.getInstance(this).registerReceiver(this.h, new IntentFilter("com.sankuai.waimai.business.order.api.action.NEW_CUSTOM_REFRESH_WEB_PAGE"));
    }

    private void a(Intent intent, String str) {
        Uri.Builder builder;
        Object[] objArr = {intent, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "065a179d54b40ec413e487da7fc5efb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "065a179d54b40ec413e487da7fc5efb6");
        } else if (intent == null || TextUtils.isEmpty(str)) {
        } else {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                this.d = com.sankuai.waimai.platform.domain.core.channel.a.a(parse.getQueryParameter("ch_ad_params"));
            }
            if (this.d != null) {
                Uri data = intent.getData();
                if (data != null) {
                    builder = data.buildUpon();
                } else {
                    builder = new Uri.Builder();
                }
                builder.appendQueryParameter("ys", this.d.b).appendQueryParameter("ys_id", this.d.c).appendQueryParameter("activity_id", this.d.d).appendQueryParameter("restaurant_id", this.d.g);
                intent.setData(builder.build());
            }
        }
    }

    @Override // com.sankuai.waimai.business.knb.c
    public final void a(String str, com.sankuai.waimai.foundation.core.service.user.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5d5a0fbf4048a4b54d964a829b8de31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5d5a0fbf4048a4b54d964a829b8de31");
        } else {
            this.g.put(str, bVar);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6701c28a4e08ed43b5fb3a82b1b25a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6701c28a4e08ed43b5fb3a82b1b25a5");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        this.a.onActivityResult(i, i2, intent);
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8570995ea41bfc17965808a892ab3bc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8570995ea41bfc17965808a892ab3bc8");
        } else if (com.sankuai.meituan.takeoutnew.util.aop.f.a(this, i, strArr, iArr).b) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (this.a != null) {
                this.a.onRequestPermissionsResult(i, strArr, iArr);
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6f8ba97189d6c7ac1a06440b08da287", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6f8ba97189d6c7ac1a06440b08da287");
            return;
        }
        super.onStart();
        if (this.c) {
            a(false);
        }
        com.sankuai.waimai.platform.domain.manager.user.a.i().a(this.i);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df82b3cbd286951ad81c7f130814bdc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df82b3cbd286951ad81c7f130814bdc0");
        } else {
            super.onResume();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e9673ecc205c8d1683fc6a416d4cb9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e9673ecc205c8d1683fc6a416d4cb9b");
        } else {
            super.onPause();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, com.sankuai.waimai.foundation.core.base.activity.c
    public final Map<String, String> Z_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94b554143eda209b90d150d9ccb3b8ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94b554143eda209b90d150d9ccb3b8ca");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("page_id", "waimai_web");
        return hashMap;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "292b1fe0472c53c01a9785d1109dfa0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "292b1fe0472c53c01a9785d1109dfa0a");
            return;
        }
        super.onNewIntent(intent);
        setIntent(intent);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.a.getArguments().putAll(extras);
        }
        Intent intent2 = getIntent();
        Object[] objArr2 = {intent2};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b63406fa6bc84c5d54a735401528e79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b63406fa6bc84c5d54a735401528e79");
            return;
        }
        a(intent2, f());
        if (this.d != null) {
            this.f.a(this.d, 1);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfa8d31f990223e6706fbdcc934ee14e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfa8d31f990223e6706fbdcc934ee14e");
        } else {
            this.a.g();
        }
    }

    private Bundle b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27f917acb549745589327aa306d0d56d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27f917acb549745589327aa306d0d56d");
        }
        Bundle bundle = new Bundle();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            bundle.putAll(extras);
        }
        bundle.putString("url", str);
        if (com.sankuai.waimai.business.knb.util.b.a(str)) {
            bundle.putString("future", "1");
        }
        return bundle;
    }

    private String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30d43f9484a280dcbce3465cb6e99c59", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30d43f9484a280dcbce3465cb6e99c59");
        }
        Intent intent = getIntent();
        String a = com.sankuai.waimai.platform.utils.f.a(intent, "url");
        return TextUtils.isEmpty(a) ? com.sankuai.waimai.foundation.router.a.a(intent, "inner_url", "") : a;
    }

    @Override // com.sankuai.waimai.business.knb.h.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebb50e398e191af4aaa645f02453752c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebb50e398e191af4aaa645f02453752c");
        } else if (this.a != null) {
            this.a.h = i;
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9447e62a44ef83e2b494991268d2f850", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9447e62a44ef83e2b494991268d2f850");
            return;
        }
        super.onStop();
        if (this.f != null) {
            this.f.b();
        }
        com.sankuai.waimai.platform.domain.manager.user.a.i().b(this.i);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd729ddc219610406523a2fcbc8b9a84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd729ddc219610406523a2fcbc8b9a84");
            return;
        }
        super.onDestroy();
        this.g.clear();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.h);
    }

    @Override // com.sankuai.waimai.business.knb.handlers.ClearHistoryHandler.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "649779e7e056a087ebf23d9297337776", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "649779e7e056a087ebf23d9297337776");
        } else if (this.a != null) {
            this.a.j();
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0653e6ea25cd794c1aeaadec8efbc167", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0653e6ea25cd794c1aeaadec8efbc167");
        } else {
            this.a.a_(false);
        }
    }
}
