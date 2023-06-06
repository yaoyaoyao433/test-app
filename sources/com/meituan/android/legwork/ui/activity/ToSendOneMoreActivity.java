package com.meituan.android.legwork.ui.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.android.legwork.common.ui.f;
import com.meituan.android.legwork.common.util.a;
import com.meituan.android.legwork.common.widget.CommonLoadingView;
import com.meituan.android.legwork.ui.abbase.ABBaseFragment;
import com.meituan.android.legwork.ui.base.BaseActivity;
import com.meituan.android.legwork.ui.util.a;
import com.meituan.android.legwork.utils.d;
import com.meituan.android.legwork.utils.m;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ToSendOneMoreActivity extends BaseActivity implements com.meituan.android.legwork.common.metrics.a, ABBaseFragment.a {
    public static ChangeQuickRedirect a;
    @Nullable
    private com.meituan.android.legwork.ui.base.b i;
    private a.InterfaceC0264a j;
    private a.InterfaceC0275a k;

    @Override // com.meituan.android.legwork.ui.base.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e60927eaa4f54bb54c491e76d85d5a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e60927eaa4f54bb54c491e76d85d5a4");
            return;
        }
        super.onCreate(bundle);
        this.d = false;
        boolean b = m.a.a.b();
        if (getIntent() == null || getIntent().getData() == null) {
            x.c("ToSendOneMoreActivity.onCreate", "onCreate error intent.data");
            finish();
            return;
        }
        if (b) {
            x.c("ToSendOneMoreActivity.onCreate", "onCreate 首个页面, 拉取client/config:");
            Object[] objArr2 = {this, bundle};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            this.j = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "51766b57d6ae166220104e58244c99a1", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0264a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "51766b57d6ae166220104e58244c99a1") : new a(this, bundle);
            com.meituan.android.legwork.common.util.a.a().a(this.j);
            setContentView(R.layout.legwork_empty);
            a(true);
        } else {
            x.c("ToSendOneMoreActivity.onCreate", "onCreate 不是首个页面");
            a(bundle);
        }
        com.meituan.android.legwork.utils.b a2 = com.meituan.android.legwork.utils.b.a();
        Intent intent = getIntent();
        Object[] objArr3 = {intent};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.legwork.utils.b.a;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "73d2d4a26a83b0a0037cbba3d418493c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "73d2d4a26a83b0a0037cbba3d418493c");
            return;
        }
        Uri data = intent.getData();
        if (data != null) {
            String queryParameter = data.getQueryParameter("pt_ab_test");
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    JsonObject asJsonObject = new JsonParser().parse(queryParameter).getAsJsonObject();
                    if (asJsonObject.has("NewSearchNoResult")) {
                        a2.f.put("waimai_search_dianping_poi_test", asJsonObject.get("NewSearchNoResult").getAsString());
                    }
                    if (asJsonObject.has("NewSearchFoodNoResult")) {
                        a2.f.put("waimai_search_SPU_hitstore_test", asJsonObject.get("NewSearchFoodNoResult").getAsString());
                    }
                    if (asJsonObject.has("NewAllIntentSearchNoResult")) {
                        a2.f.put("NewAllIntentSearchNoResult", asJsonObject.get("NewAllIntentSearchNoResult").getAsString());
                    }
                    for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
                        if (!TextUtils.equals("NewSearchNoResult", entry.getKey()) && !TextUtils.equals("NewSearchFoodNoResult", entry.getKey()) && !TextUtils.equals("NewAllIntentSearchNoResult", entry.getKey())) {
                            a2.f.put(entry.getKey(), entry.getValue().getAsString());
                        }
                    }
                } catch (Exception e) {
                    x.e("ABTestUtil.dealAbTestInfoFromIntent()", "parse json error,exception msg:", e);
                    x.a(e);
                }
            }
            String queryParameter2 = data.getQueryParameter("waimai_native_search_test");
            if (!TextUtils.isEmpty(queryParameter2)) {
                a2.f.put("waimai_native_search_test", queryParameter2);
            }
            if (TextUtils.isEmpty(data.getQueryParameter("wmsg_native_search_test"))) {
                return;
            }
            a2.f.put("wmsg_native_search_test", queryParameter2);
        }
    }

    public static /* synthetic */ void a(ToSendOneMoreActivity toSendOneMoreActivity, Bundle bundle, boolean z) {
        Object[] objArr = {toSendOneMoreActivity, bundle, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "484c1dc22c00e970a0cb7fa47dc8b40f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "484c1dc22c00e970a0cb7fa47dc8b40f");
            return;
        }
        x.c("ToSendOneMoreActivity.onCreate", "onCreate client/config拉取结束:" + z);
        com.meituan.android.legwork.common.location.c.l().a(toSendOneMoreActivity.getIntent());
        toSendOneMoreActivity.a(bundle);
    }

    private void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ae1fb3d95b314c1c41a3beaf91cc2fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ae1fb3d95b314c1c41a3beaf91cc2fc");
            return;
        }
        d.a(getIntent());
        b(bundle);
    }

    private void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fdc1901f892f8a63481a21c4b98a773", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fdc1901f892f8a63481a21c4b98a773");
            return;
        }
        Intent intent = getIntent();
        String a2 = com.meituan.android.legwork.ui.util.a.a().a(intent);
        x.c("ToSendOneMoreActivity.checkDp", "是否需要拉取点评接口: " + a2);
        if (TextUtils.isEmpty(a2)) {
            c(bundle);
            return;
        }
        if (this.g != R.layout.legwork_empty) {
            x.c("ToSendOneMoreActivity.checkDp", "点评点菜拉取空UI");
            setContentView(R.layout.legwork_empty);
            a(true);
        }
        if (this.k == null) {
            this.k = b.a(this, bundle);
        }
        com.meituan.android.legwork.ui.util.a.a().a(intent, a2, this.k);
    }

    public static /* synthetic */ void a(ToSendOneMoreActivity toSendOneMoreActivity, Bundle bundle, int i) {
        Object[] objArr = {toSendOneMoreActivity, bundle, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e81da5fb4b5b43765426f9a83b8f9df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e81da5fb4b5b43765426f9a83b8f9df");
        } else if (i == 0) {
            toSendOneMoreActivity.c(bundle);
        } else if (i != 2) {
        } else {
            x.c("ToSendOneMoreActivity.checkDp", "点评点菜拉取失败");
            toSendOneMoreActivity.a(false);
            toSendOneMoreActivity.e().setOnRefreshListener(c.a(toSendOneMoreActivity, bundle));
            CommonLoadingView e = toSendOneMoreActivity.e();
            Object[] objArr2 = {(byte) 1};
            ChangeQuickRedirect changeQuickRedirect2 = CommonLoadingView.a;
            if (PatchProxy.isSupport(objArr2, e, changeQuickRedirect2, false, "6b83a714a01df69f20a43f0d6bc2df49", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, e, changeQuickRedirect2, false, "6b83a714a01df69f20a43f0d6bc2df49");
            } else {
                f.a();
                Object[] objArr3 = {Integer.valueOf((int) R.drawable.legwork_bg_no_network)};
                ChangeQuickRedirect changeQuickRedirect3 = CommonLoadingView.a;
                if (PatchProxy.isSupport(objArr3, e, changeQuickRedirect3, false, "bf1aa126453f55c066d4ca8efef3cd1f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, e, changeQuickRedirect3, false, "bf1aa126453f55c066d4ca8efef3cd1f");
                } else {
                    e.c.setImageResource(R.drawable.legwork_bg_no_network);
                }
                Object[] objArr4 = {Integer.valueOf((int) R.string.legwork_network_error), (byte) 1};
                ChangeQuickRedirect changeQuickRedirect4 = CommonLoadingView.a;
                if (PatchProxy.isSupport(objArr4, e, changeQuickRedirect4, false, "03ffe6151f11443b46a94d8470ef24a9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, e, changeQuickRedirect4, false, "03ffe6151f11443b46a94d8470ef24a9");
                } else {
                    e.d.setText(R.string.legwork_network_error);
                    e.e.setVisibility(0);
                    e.setVisibility(0);
                    e.b.setVisibility(0);
                    e.f.setVisibility(8);
                }
            }
            toSendOneMoreActivity.d = true;
            toSendOneMoreActivity.b();
        }
    }

    public static /* synthetic */ void a(ToSendOneMoreActivity toSendOneMoreActivity, Bundle bundle, View view) {
        Object[] objArr = {toSendOneMoreActivity, bundle, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d408709074fd6e001abc3abc2cbbf3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d408709074fd6e001abc3abc2cbbf3b");
        } else {
            toSendOneMoreActivity.b(bundle);
        }
    }

    private void c(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6378b32c36a5f0ae59565f0d3273599d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6378b32c36a5f0ae59565f0d3273599d");
            return;
        }
        x.c("ToSendOneMoreActivity.generateDelegate", "接口拉取完成，生成delegate");
        this.i = com.meituan.android.legwork.ui.base.c.a(this);
        if (!(this.i instanceof com.meituan.android.legwork.ui.jump.d)) {
            a(false);
        }
        this.i.a(bundle);
    }

    @Override // com.meituan.android.legwork.ui.base.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6010567afd672266cca8d87c40d1ce6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6010567afd672266cca8d87c40d1ce6");
            return;
        }
        super.onStart();
        if (this.i != null) {
            com.meituan.android.legwork.ui.base.b bVar = this.i;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.legwork.ui.base.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "751c912699589e1b8e867a5435abe9c6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "751c912699589e1b8e867a5435abe9c6");
            }
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02af92c7b0f4cfcdb9e85d17c29d315e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02af92c7b0f4cfcdb9e85d17c29d315e");
            return;
        }
        super.onRestart();
        if (this.i != null) {
            com.meituan.android.legwork.ui.base.b bVar = this.i;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.legwork.ui.base.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "8854cff4960dc345ab78ad3ef684a34a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "8854cff4960dc345ab78ad3ef684a34a");
            }
        }
    }

    @Override // com.meituan.android.legwork.ui.base.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "633353e0a9fd0f1f77fd9fbe5ab56a0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "633353e0a9fd0f1f77fd9fbe5ab56a0b");
            return;
        }
        super.onResume();
        if (this.i != null) {
            com.meituan.android.legwork.ui.base.b bVar = this.i;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.legwork.ui.base.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "2691091cc63bc1a4e6dd60d15b58e2d1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "2691091cc63bc1a4e6dd60d15b58e2d1");
            }
        }
    }

    @Override // com.meituan.android.legwork.ui.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efbbc6ebf04f2a65c1b3a903e259550e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efbbc6ebf04f2a65c1b3a903e259550e");
        } else {
            super.onWindowFocusChanged(z);
        }
    }

    @Override // com.meituan.android.legwork.ui.base.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2c88f7a0814caa8c47de59b58132f82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2c88f7a0814caa8c47de59b58132f82");
            return;
        }
        super.onStop();
        if (this.i != null) {
            com.meituan.android.legwork.ui.base.b bVar = this.i;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.legwork.ui.base.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "f95e220e9e046c63d67c199ea03604f9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "f95e220e9e046c63d67c199ea03604f9");
            }
        }
    }

    @Override // com.meituan.android.legwork.ui.base.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bb06e3f0ee5fb6f0363c595b6346939", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bb06e3f0ee5fb6f0363c595b6346939");
            return;
        }
        super.onDestroy();
        if (this.i != null) {
            this.i.b();
        }
        com.meituan.android.legwork.ui.util.a a2 = com.meituan.android.legwork.ui.util.a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.legwork.ui.util.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "9764faf3df90283a28d87391ccf606bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "9764faf3df90283a28d87391ccf606bd");
        } else if (a2.b != null && !a2.b.isUnsubscribed()) {
            a2.b.unsubscribe();
        }
        this.k = null;
        this.j = null;
    }

    @Override // com.meituan.android.legwork.ui.base.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1173492ec09a415904f7d837e234e2e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1173492ec09a415904f7d837e234e2e1");
            return;
        }
        if (this.i != null ? this.i.c() : false) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "962a95293bfba6464c9c8c7599047867", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "962a95293bfba6464c9c8c7599047867");
            return;
        }
        super.onPause();
        if (this.i != null) {
            this.i.a();
        }
    }

    @Override // com.meituan.android.legwork.ui.base.BaseActivity, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "202ee024279b77d24c30bdddba653cc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "202ee024279b77d24c30bdddba653cc4");
        } else {
            super.onRestoreInstanceState(bundle);
        }
    }

    @Override // com.meituan.android.legwork.ui.base.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c501e7ef62bf1cf53e80035c91d79be3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c501e7ef62bf1cf53e80035c91d79be3");
        } else {
            super.onSaveInstanceState(bundle);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9051cd516c0a3d50dbe93ea8232a616", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9051cd516c0a3d50dbe93ea8232a616");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        if (this.i != null) {
            this.i.a(i, i2, intent);
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // com.meituan.android.legwork.ui.base.BaseActivity
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "250da3edf637093dbdb05bb3893e05b2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "250da3edf637093dbdb05bb3893e05b2")).booleanValue();
        }
        if (this.i != null) {
            return this.i.d();
        }
        return super.a();
    }

    @Override // com.meituan.android.legwork.ui.abbase.ABBaseFragment.a
    public final Intent d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a3e743c3d878aa56d3d78dc9dec61ba", RobustBitConfig.DEFAULT_VALUE) ? (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a3e743c3d878aa56d3d78dc9dec61ba") : getIntent();
    }

    @Override // com.meituan.android.legwork.ui.abbase.ABBaseFragment.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36a13ee29e18f279295ce3722061bbe6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36a13ee29e18f279295ce3722061bbe6");
        } else {
            getWindow().getDecorView().setBackgroundColor(getResources().getColor(i));
        }
    }

    @Override // com.meituan.android.legwork.ui.abbase.ABBaseFragment.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e934a92034cfccb442025d1bff3aaba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e934a92034cfccb442025d1bff3aaba");
            return;
        }
        try {
            super.onBackPressed();
        } catch (Exception unused) {
            finish();
        }
    }

    @Override // com.meituan.metrics.fsp.MetricsFspExtraInfoProvider
    public Map<String, Object> getExtraFspInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c7c851e8c520e829dfec5d9414fa46a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c7c851e8c520e829dfec5d9414fa46a");
        }
        try {
            if (getIntent() != null && getIntent().getData() != null) {
                Uri data = getIntent().getData();
                String queryParameter = data.getQueryParameter("mrn_entry");
                String queryParameter2 = data.getQueryParameter("mrn_component");
                if (!TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(queryParameter2)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("bundle_name", "rn_banma_" + queryParameter);
                    hashMap.put("component", queryParameter2);
                    Map<String, String> a2 = com.meituan.android.legwork.common.util.b.a().a(queryParameter);
                    if (a2 != null && a2.size() > 0) {
                        hashMap.putAll(a2);
                    }
                    return hashMap;
                }
            }
        } catch (Exception unused) {
        }
        return new HashMap();
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7324079e904e69b698ffcc94153348f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7324079e904e69b698ffcc94153348f4");
        } else if (this.g == 0) {
            x.c("ToSendOneMoreActivity.loading", "loading: 没有设置过contentView");
        } else {
            x.c("ToSendOneMoreActivity.loading", "loading: " + z);
            if (z) {
                e().a();
            } else {
                e().b();
            }
        }
    }
}
