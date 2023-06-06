package com.sankuai.waimai.store.base;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.common.weaver.interfaces.Weaver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.store.config.k;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.monitor.monitor.StoreException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCBaseActivity extends BaseActivity implements android.arch.lifecycle.f, com.sankuai.waimai.store.expose.v2.a {
    public static ChangeQuickRedirect c;
    private HashMap<String, Object> a;
    private android.arch.lifecycle.g b;
    public final com.sankuai.waimai.store.mach.machfeed.c d;

    public String b() {
        return "";
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity
    public String t() {
        return "supermarket";
    }

    public SCBaseActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2947a4332ec4f191766bb46117fbe025", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2947a4332ec4f191766bb46117fbe025");
            return;
        }
        this.d = new com.sankuai.waimai.store.mach.machfeed.c(this);
        this.b = new android.arch.lifecycle.g(this);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        int i;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adaa51597eeef3c04620a71186b66f3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adaa51597eeef3c04620a71186b66f3d");
            return;
        }
        com.sankuai.waimai.store.base.monitor.time.a a = com.sankuai.waimai.store.base.monitor.time.a.a();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.base.monitor.time.a.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "25a61428a40d876d16f0466822737a4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "25a61428a40d876d16f0466822737a4c");
        } else {
            Map<String, Long> b = a.b(a.c(this));
            if (b != null && !b.containsKey("onActivityCreated")) {
                b.put("onActivityCreated", Long.valueOf(SystemClock.elapsedRealtime()));
            }
        }
        super.onCreate(bundle);
        this.b.a(d.b.CREATED);
        com.sankuai.waimai.store.fsp.a a2 = com.sankuai.waimai.store.fsp.a.a();
        Object[] objArr3 = {this};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.fsp.a.a;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "f17d8859bf6e416874f108f7304949e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "f17d8859bf6e416874f108f7304949e2");
        } else {
            String a3 = a2.a(this);
            if (a2.b.containsKey(getClass().getName())) {
                i = 0;
            } else {
                a2.b.put(getClass().getName(), 1);
                i = 1;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("source", com.sankuai.waimai.store.fsp.a.b());
            hashMap.put("cold_setup", Integer.valueOf(i));
            String jSONObject = new JSONObject(hashMap).toString();
            Weaver.getExtension().addCustomTags(a3, this, "sg_perf_setup_start", String.valueOf(System.currentTimeMillis()));
            Weaver.getExtension().addCustomTags(a3, this, "sg_perf_params", jSONObject);
        }
        Object[] objArr4 = {this};
        ChangeQuickRedirect changeQuickRedirect4 = c;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "959bb3f69c86bfdaaeb7d2f1dbd1f1ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "959bb3f69c86bfdaaeb7d2f1dbd1f1ff");
        } else if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        if (com.sankuai.waimai.store.shopping.cart.data.a.b(this)) {
            return;
        }
        if (!com.sankuai.waimai.globalcart.biz.a.b && com.sankuai.waimai.store.manager.user.a.a().b()) {
            com.sankuai.waimai.globalcart.biz.a.a().b();
        } else {
            com.sankuai.waimai.store.shopping.cart.data.a.d(this);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.app.Activity
    public void setContentView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a72cf7f14704cbd6001c76d6cbe620dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a72cf7f14704cbd6001c76d6cbe620dd");
            return;
        }
        g g = g();
        if (k.a()) {
            g.addView(view, new ViewGroup.MarginLayoutParams(-1, -1));
            super.setContentView(g);
            return;
        }
        super.setContentView(view);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9644c3704f89ed4c1a045469539ac9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9644c3704f89ed4c1a045469539ac9a");
            return;
        }
        g g = g();
        if (k.a()) {
            g.setLayoutParams(layoutParams);
            g.addView(view, new ViewGroup.MarginLayoutParams(-1, -1));
            super.setContentView(g);
            return;
        }
        super.setContentView(view, layoutParams);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.app.Activity
    public void setContentView(@LayoutRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6de16193b5982c3da86d3c8ce389c0f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6de16193b5982c3da86d3c8ce389c0f8");
        } else if (k.a()) {
            try {
                g g = g();
                g.addView(getLayoutInflater().inflate(i, (ViewGroup) null), new ViewGroup.MarginLayoutParams(-1, -1));
                super.setContentView(g);
            } catch (Exception e) {
                try {
                    a(e, 1);
                    super.setContentView(i);
                } catch (Exception e2) {
                    a(e2, 2);
                    finish();
                    com.sankuai.waimai.foundation.core.exception.a.b(e2);
                }
            }
        } else {
            super.setContentView(i);
        }
    }

    @NonNull
    private g g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11cca6fb54205764c962d6f39bc12be9", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11cca6fb54205764c962d6f39bc12be9");
        }
        g gVar = new g(this);
        gVar.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        return gVar;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65081ae34f2491d05a24868a763ea7d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65081ae34f2491d05a24868a763ea7d3");
            return;
        }
        try {
            super.onSaveInstanceState(bundle);
            if (bundle != null) {
                bundle.putParcelable("android:support:fragments", null);
                bundle.putParcelable("android:viewHierarchyState", null);
            }
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    @Override // android.arch.lifecycle.f
    public android.arch.lifecycle.d getLifecycle() {
        return this.b;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "103a3a4e6ac631978463abdb7a03ce68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "103a3a4e6ac631978463abdb7a03ce68");
            return;
        }
        super.onStart();
        this.b.a(d.b.STARTED);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12925741058a349349fc1a5fa7a864e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12925741058a349349fc1a5fa7a864e0");
            return;
        }
        super.onResume();
        this.b.a(d.b.RESUMED);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity
    public final String w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e3ccb1ac89a15ffa94ba3b943b5dbb0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e3ccb1ac89a15ffa94ba3b943b5dbb0") : super.w();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76b096c72dca68b84c72275b3830f275", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76b096c72dca68b84c72275b3830f275");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.store.base.monitor.time.a.a().d(this);
        al.cancel(w());
        com.sankuai.waimai.store.base.net.c.a(w());
        if (com.sankuai.waimai.store.shopping.cart.data.a.b(this)) {
            return;
        }
        com.sankuai.waimai.store.shopping.cart.data.a.a(this);
    }

    public final void a(boolean z, boolean z2) {
        Object[] objArr = {(byte) 1, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d90c49d2abe8ac533dd64112555857e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d90c49d2abe8ac533dd64112555857e0");
            return;
        }
        com.sankuai.shangou.stone.util.k.b(this, true);
        com.sankuai.shangou.stone.util.k.a((Activity) this, true);
    }

    public final <T> T b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c73f186a519945bfbd10de2b0013cb55", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c73f186a519945bfbd10de2b0013cb55");
        }
        if (this.a != null && this.a.containsKey(str)) {
            return (T) this.a.get(str);
        }
        Intent intent = getIntent();
        if (intent == null || t.a(str)) {
            return null;
        }
        Object a = com.sankuai.waimai.store.router.d.a(intent, str);
        if (a == null) {
            com.sankuai.shangou.stone.util.log.a.a("SCBaseActivity", "getMemoryData key is " + str + " and value is null", new Object[0]);
        } else {
            com.sankuai.shangou.stone.util.log.a.a("SCBaseActivity", "getMemoryData key is " + str + " and value is " + a.toString(), new Object[0]);
        }
        if (this.a == null) {
            this.a = new HashMap<>();
        }
        this.a.put(str, a);
        return (T) this.a.get(str);
    }

    @Override // com.sankuai.waimai.store.expose.v2.a
    public final View f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "969e00093df8170b77664ea976f26823", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "969e00093df8170b77664ea976f26823");
        }
        if (getWindow() == null || getWindow().getDecorView() == null) {
            return null;
        }
        return getWindow().getDecorView().findViewById(16908290);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity
    public final void a(Exception exc, int i) {
        Object[] objArr = {exc, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b9e631e882b38b4286179fdfcc45aed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b9e631e882b38b4286179fdfcc45aed");
            return;
        }
        super.a(exc, i);
        StoreException storeException = StoreException.SetContentViewStepException;
        com.sankuai.waimai.store.util.monitor.c.a(storeException, exc.getMessage() + ";error step: " + i, getClass().getName());
    }

    public String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "279f6c9df61998b1d7a01282182de6a7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "279f6c9df61998b1d7a01282182de6a7") : com.sankuai.waimai.store.manager.judas.b.a((Object) this);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity
    public final boolean x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee773974ce49d8d2364439ea59b8ffce", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee773974ce49d8d2364439ea59b8ffce")).booleanValue() : super.x();
    }
}
