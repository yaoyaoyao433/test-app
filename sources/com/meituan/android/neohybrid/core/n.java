package com.meituan.android.neohybrid.core;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.dianping.titans.ui.ComplexButton;
import com.dianping.titans.ui.ITitleBar;
import com.dianping.titans.widget.BaseTitleBar;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cipstorage.ag;
import com.meituan.android.cipstorage.ai;
import com.meituan.android.neohybrid.Neo;
import com.meituan.android.neohybrid.core.a;
import com.meituan.android.neohybrid.core.config.CacheConfig;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.core.config.UIConfig;
import com.meituan.android.neohybrid.core.horn.bean.NeoHornConfig;
import com.meituan.android.neohybrid.neo.bridge.NeoBridge;
import com.meituan.android.neohybrid.neo.bridge.NeoSessionStorageBridge;
import com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface;
import com.meituan.android.neohybrid.neo.notification.a;
import com.meituan.android.neohybrid.neo.nsf.c;
import com.meituan.android.neohybrid.neo.tunnel.TunnelParamJSHandler;
import com.meituan.android.neohybrid.storage.MemoryStorage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebCompat;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class n implements a.InterfaceC0306a, c.b {
    public static ChangeQuickRedirect a;
    protected a b;
    protected NeoConfig c;
    public KNBWebCompat d;
    public Context e;
    public LinearLayout f;
    public View g;
    String h;
    com.meituan.android.neohybrid.core.listener.e i;
    com.meituan.android.neohybrid.base.a j;
    com.meituan.android.cipstorage.q k;
    volatile String l;
    com.meituan.android.neohybrid.neo.adapter.a m;
    Map<String, NeoBridgeCustomizeInterface> n;
    private StringBuilder o;
    private com.meituan.android.neohybrid.core.listener.f p;
    private com.meituan.android.neohybrid.core.listener.g q;
    private boolean r;
    private boolean s;
    private volatile String t;
    private String u;

    public n(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b14b34c43f31d1ab4a66ff0ed1aa455", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b14b34c43f31d1ab4a66ff0ed1aa455");
            return;
        }
        this.n = new HashMap();
        this.b = aVar;
        this.j = com.meituan.android.neohybrid.base.a.a(aVar);
        this.k = com.meituan.android.cipstorage.q.a(com.meituan.android.neohybrid.init.a.d(), "neo_storage_channel");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0373  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.neohybrid.core.n.a(android.content.Context, android.os.Bundle):void");
    }

    public View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        WebViewClient a2;
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdd4a925e8fc8b6905bfa9188839fcf3", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdd4a925e8fc8b6905bfa9188839fcf3");
        }
        this.g = this.d.onCreateView(layoutInflater, null);
        this.f.addView(this.g, new LinearLayout.LayoutParams(-1, -1));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14f1d295023a80a336f766af2cfad46e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14f1d295023a80a336f766af2cfad46e");
        } else {
            WebView j = j();
            if (j != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    a2 = j.getWebViewClient();
                } else {
                    a aVar = this.b;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    a2 = com.meituan.android.neohybrid.util.c.a(PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "7ee4a4a59ca8f9eacee26b1b194ece9b", RobustBitConfig.DEFAULT_VALUE) ? (KNBWebCompat) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "7ee4a4a59ca8f9eacee26b1b194ece9b") : aVar.c.d);
                }
                if (a2 != null) {
                    this.m = new com.meituan.android.neohybrid.neo.adapter.a(a2, this.b);
                    j.setWebViewClient(this.m);
                }
            }
        }
        return this.f;
    }

    public final void a(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0e71053758996934c9b37e3e778f795", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0e71053758996934c9b37e3e778f795");
            return;
        }
        this.d.getWebHandler().setTitleBarBackground(-1);
        if (this.q != null) {
            j();
        }
        String b = com.meituan.android.neohybrid.util.p.b(this.e);
        if (c(b)) {
            this.b.a("downgrade_illegal_chrome_version");
            return;
        }
        com.meituan.android.neohybrid.neo.report.d.a(this.b, "web_core_version", b);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49b60ad2c9da49fd2e4282f588de3589", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49b60ad2c9da49fd2e4282f588de3589");
        } else {
            WebView j = j();
            if (j != null) {
                if (this.c.cacheConfig().isClearCache()) {
                    j.clearCache(true);
                    com.meituan.android.neohybrid.neo.report.d.a(this.b, "b_pay_hybrid_cashier_clear_cache_sc", (Map<String, Object>) com.meituan.android.neohybrid.neo.report.a.c(CacheConfig.NEO_CLEAR_CACHE, "1").b);
                }
                if (this.c.cacheConfig().isDisableCache()) {
                    j.getSettings().setCacheMode(2);
                    com.meituan.android.neohybrid.neo.report.d.a(this.b, "b_pay_hybrid_cashier_disable_cache_sc", (Map<String, Object>) com.meituan.android.neohybrid.neo.report.a.c(CacheConfig.NEO_DISABLE_CACHE, "1").b);
                }
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "87ad6df0b928e4a34c099921ade9dc6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "87ad6df0b928e4a34c099921ade9dc6f");
        } else {
            ITitleBar titleBarHost = this.d.getTitleBarHost();
            if (titleBarHost instanceof BaseTitleBar) {
                BaseTitleBar baseTitleBar = (BaseTitleBar) titleBarHost;
                try {
                    ComplexButton.PerformClickListener a2 = p.a(this);
                    baseTitleBar.mButtonLL.setPerformClickListener(a2);
                    baseTitleBar.mButtonLR.setPerformClickListener(a2);
                    baseTitleBar.mButtonRL.setPerformClickListener(a2);
                    baseTitleBar.mButtonRR.setPerformClickListener(a2);
                } catch (Exception e) {
                    com.meituan.android.neohybrid.neo.report.b.a(e, "NeoCompatDelegate_handleTitleBar", (Map<String, Object>) null);
                }
            }
        }
        o();
        p();
    }

    private boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6265b612cc56a62967d8f75892c0bde", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6265b612cc56a62967d8f75892c0bde")).booleanValue();
        }
        List<List<String>> enableChromeVersion = this.c.downgradeConfig().getEnableChromeVersion();
        if (enableChromeVersion == null || enableChromeVersion.isEmpty()) {
            return false;
        }
        if (this.b == null || TextUtils.isEmpty(str) || str.equals("unknown") || StringUtil.NULL.equals(str)) {
            return true;
        }
        try {
            String[] split = str.split("\\.");
            if (split.length < 4) {
                return true;
            }
            for (List<String> list : enableChromeVersion) {
                String[] split2 = list.get(0).split("\\.");
                String[] split3 = list.get(1).split("\\.");
                if (split2.length >= 4 && split3.length >= 4) {
                    for (int i = 0; i < split.length; i++) {
                        try {
                            int parseInt = Integer.parseInt(split[i]);
                            if (!"*".equals(split2[i]) && parseInt < Integer.parseInt(split2[i])) {
                                return true;
                            }
                            if (!"*".equals(split3[i]) && parseInt > Integer.parseInt(split3[i])) {
                                return true;
                            }
                        } catch (NumberFormatException unused) {
                            return true;
                        }
                    }
                }
                return true;
            }
            return false;
        } catch (Exception unused2) {
            return true;
        }
    }

    public void a(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c211d02427dba9722edcd74215260d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c211d02427dba9722edcd74215260d6");
            return;
        }
        this.d.onActivityCreated(bundle);
        n();
    }

    public final void a() {
        String s;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d211efcc0ed8bd90de54087ae1bf3c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d211efcc0ed8bd90de54087ae1bf3c2");
            return;
        }
        this.d.onStart();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9bfb7cc417236b532d976c3321cd2ea8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9bfb7cc417236b532d976c3321cd2ea8");
        } else if (Build.VERSION.SDK_INT >= 19 && (s = s()) != null && s.length() != 0 && j() != null && j().getTag() != null) {
            j().evaluateJavascript("javascript:window.neo_tag_page_finished", r.a(this, s));
        }
        com.meituan.android.neohybrid.neo.report.d.b(this.b, "b_pay_neo_base_fragment_on_start_mv", com.meituan.android.neohybrid.neo.report.a.c("times", Integer.valueOf(this.j.b("Delegate_onStart"))).b);
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "900865a2014d0457b235ec81e2c189a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "900865a2014d0457b235ec81e2c189a9");
            return;
        }
        this.d.onResume();
        com.meituan.android.neohybrid.neo.report.d.b(this.b, "b_pay_neo_base_fragment_on_resume_mv", com.meituan.android.neohybrid.neo.report.a.c("times", Integer.valueOf(this.j.b("Delegate_onResume"))).b);
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "389273f49c2395d760f221cdbb39e92a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "389273f49c2395d760f221cdbb39e92a");
            return;
        }
        this.d.onPause();
        com.meituan.android.neohybrid.neo.report.d.b(this.b, "b_pay_neo_base_fragment_on_pause_mv", com.meituan.android.neohybrid.neo.report.a.c("times", Integer.valueOf(this.j.b("Delegate_onPause"))).b);
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3398b180eea2a771054cbd0d3e4c9a8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3398b180eea2a771054cbd0d3e4c9a8b");
            return;
        }
        this.d.onStop();
        com.meituan.android.neohybrid.neo.report.d.b(this.b, "b_pay_neo_base_fragment_on_stop_mv", com.meituan.android.neohybrid.neo.report.a.c("times", Integer.valueOf(this.j.b("Delegate_onStop"))).b);
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa9020de4af8e2c9b3c33ec7a40f92c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa9020de4af8e2c9b3c33ec7a40f92c9");
            return;
        }
        this.e = null;
        this.d.onDestroy();
        com.meituan.android.neohybrid.neo.nsf.a.b(this.b);
        com.meituan.android.neohybrid.neo.report.d.b(this.b, "b_pay_neo_base_fragment_on_destroy_mv", com.meituan.android.neohybrid.neo.report.a.c("times", Integer.valueOf(this.j.b("Delegate_onDestroy"))).b);
    }

    public final void b(Bundle bundle) {
        JSONObject a2;
        Map<String, Object> a3;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "369f91b60e2e32e4d07acdc1e6d8032a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "369f91b60e2e32e4d07acdc1e6d8032a");
        } else if (bundle == null) {
        } else {
            com.meituan.android.neohybrid.util.i.a(bundle, NeoConfig.NEO_CONFIG, this.c);
            com.meituan.android.neohybrid.util.i.a(bundle, "business_params", com.meituan.android.neohybrid.neo.tunnel.a.a().a(this.b));
            com.meituan.android.neohybrid.util.i.a(bundle, "global_params", com.meituan.android.neohybrid.neo.tunnel.a.a().c());
            if (this.c.isNeoStorageBridge() && (a3 = MemoryStorage.a().a(this.b)) != null && !a3.isEmpty()) {
                this.l = "neo_storage_key_" + this.b.hashCode();
                bundle.putString("neo_storage_key", this.l);
                this.k.a(this.l, (String) a3, (ag<String>) new com.meituan.android.neohybrid.storage.a(), (ai<String>) new ai<Map<String, Object>>() { // from class: com.meituan.android.neohybrid.core.n.1
                    @Override // com.meituan.android.cipstorage.ai
                    public final /* bridge */ /* synthetic */ void a(boolean z, String str, com.meituan.android.cipstorage.u uVar, String str2, Map<String, Object> map) {
                    }
                }, com.meituan.android.cipstorage.u.b);
            }
            if (!this.c.nsfConfig().isNsfSaved() || (a2 = com.meituan.android.neohybrid.neo.nsf.a.a(this.b, this.c.nsfConfig().getNsf())) == null) {
                return;
            }
            this.t = "neo_nsf_saved_key_" + this.b.hashCode();
            bundle.putString("neo_nsf_saved_key", this.t);
            this.k.a(this.t, (String) a2, (ag<String>) new ag<JSONObject>() { // from class: com.meituan.android.neohybrid.core.n.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cipstorage.ag
                public final /* synthetic */ String serializeAsString(JSONObject jSONObject) {
                    JSONObject jSONObject2 = jSONObject;
                    Object[] objArr2 = {jSONObject2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "660c4cf0334f1b52dd2c38a57b3d3be5", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "660c4cf0334f1b52dd2c38a57b3d3be5");
                    }
                    if (jSONObject2 != null) {
                        return jSONObject2.toString();
                    }
                    return null;
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.meituan.android.cipstorage.ag
                /* renamed from: a */
                public JSONObject deserializeFromString(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "afa3c705f4f71aaba26809c2e74858ea", RobustBitConfig.DEFAULT_VALUE)) {
                        return (JSONObject) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "afa3c705f4f71aaba26809c2e74858ea");
                    }
                    try {
                        return new JSONObject(str);
                    } catch (JSONException e) {
                        e.printStackTrace();
                        return null;
                    }
                }
            }, (ai<String>) new ai<JSONObject>() { // from class: com.meituan.android.neohybrid.core.n.3
                @Override // com.meituan.android.cipstorage.ai
                public final /* bridge */ /* synthetic */ void a(boolean z, String str, com.meituan.android.cipstorage.u uVar, String str2, JSONObject jSONObject) {
                }
            }, com.meituan.android.cipstorage.u.b);
        }
    }

    public final void c(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6ec17ef1e8edbb6f72116658233708d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6ec17ef1e8edbb6f72116658233708d");
        } else if (bundle == null) {
        } else {
            this.c = (NeoConfig) com.meituan.android.neohybrid.util.i.a(bundle, NeoConfig.NEO_CONFIG, (Type) NeoConfig.class);
            com.meituan.android.neohybrid.neo.tunnel.a.a().a(this.b, com.meituan.android.neohybrid.util.i.a(bundle, "business_params"));
            com.meituan.android.neohybrid.neo.tunnel.a.a().a(com.meituan.android.neohybrid.util.i.a(bundle, "global_params"));
            if (this.c.isNeoStorageBridge()) {
                this.l = bundle.getString("neo_storage_key", null);
                if (this.l != null) {
                    final long currentTimeMillis = System.currentTimeMillis();
                    this.k.a(this.l, new com.meituan.android.neohybrid.storage.a(), new ai<Map<String, Object>>() { // from class: com.meituan.android.neohybrid.core.n.4
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.cipstorage.ai
                        public final /* synthetic */ void a(boolean z, String str, com.meituan.android.cipstorage.u uVar, String str2, Map<String, Object> map) {
                            Map<String, Object> map2 = map;
                            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, uVar, str2, map2};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6dee73c5d2f98345648081cf8eac503", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6dee73c5d2f98345648081cf8eac503");
                                return;
                            }
                            if (z && map2 != null && !map2.isEmpty()) {
                                MemoryStorage.a().a(n.this.k(), map2);
                                n.this.k.b(n.this.l);
                                n.this.l = null;
                                return;
                            }
                            com.meituan.android.neohybrid.neo.report.b.c("NeoCompatDelegate_onRestoreState", "getObjectAsync fail", new com.meituan.android.neohybrid.neo.report.a().a("success", Boolean.valueOf(z)).a("key", str2).a("value", map2 != null ? map2.keySet() : null).a("duration", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)).b);
                        }
                    }, com.meituan.android.cipstorage.u.b);
                }
            }
            if (this.c.nsfConfig().isNsfSaved()) {
                this.t = bundle.getString("neo_nsf_saved_key", null);
            }
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ede74fa6e5635a023607aad9e5ad2c45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ede74fa6e5635a023607aad9e5ad2c45");
            return;
        }
        if (this.c.isNeoStorageBridge() && this.l != null) {
            this.k.b(this.l, com.meituan.android.cipstorage.u.b);
            this.l = null;
        }
        if (!this.c.nsfConfig().isNsfSaved() || this.t == null) {
            return;
        }
        this.k.b(this.t, com.meituan.android.cipstorage.u.b);
        this.t = null;
    }

    public final void g() {
        String s;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "444d225369dd365ea3cce48e035a9302", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "444d225369dd365ea3cce48e035a9302");
            return;
        }
        h();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a6a445548f9b5c142a06a88eb11174a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a6a445548f9b5c142a06a88eb11174a");
        } else if (Build.VERSION.SDK_INT >= 19 && (s = s()) != null && s.length() != 0 && j() != null && !TextUtils.isEmpty(j().getUrl())) {
            try {
                j().setTag(j().getUrl());
                j().evaluateJavascript("javascript:window.neo_tag_page_finished='true'", s.a());
                com.meituan.android.neohybrid.neo.report.b.a("NeoCompatDelegate.onRecreateInject", "option=" + s);
            } catch (Exception e) {
                com.meituan.android.neohybrid.neo.report.b.a("NeoCompatDelegate.onRecreateInject", "e=" + e.toString());
            }
        }
        if (this.s) {
            return;
        }
        this.s = true;
        long d = com.meituan.android.neohybrid.base.a.a(this.b.b).d("onCreate");
        com.meituan.android.neohybrid.neo.report.d.a(this.b, "b_pay_neo_general_native_tti_sc", (Map<String, Object>) com.meituan.android.neohybrid.neo.report.a.c("duration", Long.valueOf(d > 0 ? System.currentTimeMillis() - d : 0L)).b);
    }

    public final void a(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c65fb5f9dbb1723fedc61ad046f40cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c65fb5f9dbb1723fedc61ad046f40cf");
        } else {
            this.j.a(str, jSONObject);
        }
    }

    public void a(Context context) {
        this.e = context;
    }

    public void d(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2469f35ea87a30e7ba89e46322a5578c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2469f35ea87a30e7ba89e46322a5578c");
            return;
        }
        com.meituan.android.neohybrid.neo.report.d.a(this.b, NeoConfig.NEO_SCENE, this.c.getScene());
        com.meituan.android.neohybrid.neo.report.d.a(this.b, KernelConfig.KEY_CONTAINER_TYPE, this.b.f().kernelConfig().getContainerType());
        com.meituan.android.neohybrid.neo.report.d.a(this.b, KernelConfig.KEY_KERNEL_TYPE, this.b.f().kernelConfig().getKernelType());
        com.meituan.android.neohybrid.neo.report.d.a(this.b, KernelConfig.KEY_KERNEL_SOURCE, this.b.f().kernelConfig().getKernelSource());
        com.meituan.android.neohybrid.neo.report.d.a(this.b, "unique_id", this.j.a());
        HashMap hashMap = new HashMap();
        hashMap.put(NeoConfig.NEO_SCENE, this.c.getScene());
        hashMap.put("enable_data_loader", this.c.nsfConfig().isNSF() ? "1" : "0");
        hashMap.put("enable_modal_loading", this.c.loadingConfig().isLoadingEnabled() ? "1" : "0");
        Map<String, Object> neoTunnelParams = this.c.getNeoTunnelParams();
        if (!com.meituan.android.paybase.utils.i.a(neoTunnelParams)) {
            hashMap.putAll(neoTunnelParams);
        }
        Map<String, Object> neoReportParams = this.c.getNeoReportParams();
        if (!com.meituan.android.paybase.utils.i.a(neoReportParams)) {
            com.meituan.android.neohybrid.neo.report.d.a(this.b, neoReportParams);
        }
        com.meituan.android.neohybrid.neo.tunnel.a.a().a(this.b, hashMap);
    }

    public static /* synthetic */ void a(n nVar, Throwable th) {
        Object[] objArr = {nVar, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d96ff8aeff16fc9ad5361598571ab2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d96ff8aeff16fc9ad5361598571ab2d");
            return;
        }
        com.meituan.android.neohybrid.neo.report.d.a(nVar.b, "b_pay_native_error_mv", "c_pay_7c9fc4b4", null, com.meituan.android.neohybrid.neo.report.a.c("code", 1120022).b);
        com.meituan.android.neohybrid.neo.report.d.c(nVar.b, "paybiz_dispatch_hybrid_cashier", com.meituan.android.neohybrid.neo.report.a.c("error_message", th.toString()).b);
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0cd81f6a0d433d40797b028762dc8cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0cd81f6a0d433d40797b028762dc8cc");
        } else if (m()) {
            a(false);
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59219d018a1ae503e2d9612934cb6144", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59219d018a1ae503e2d9612934cb6144");
            return;
        }
        Activity i = i();
        if (i == null) {
            return;
        }
        UIConfig uiConfig = this.c.uiConfig();
        com.meituan.android.neohybrid.util.j a2 = com.meituan.android.neohybrid.util.j.a(i);
        a2.b = z;
        Integer statusBarColorInt = uiConfig.getStatusBarColorInt();
        if (statusBarColorInt != null) {
            a2.a(statusBarColorInt.intValue()).a(true);
        }
        a2.b(uiConfig.isFullscreen()).c(uiConfig.isImmersion()).a();
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d453e3ad7ab3c85f613d037082ce3792", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d453e3ad7ab3c85f613d037082ce3792");
            return;
        }
        UIConfig uiConfig = this.c.uiConfig();
        ITitleBar titleBarHost = this.d.getTitleBarHost();
        if (!(titleBarHost instanceof BaseTitleBar) || this.e == null) {
            return;
        }
        BaseTitleBar baseTitleBar = (BaseTitleBar) titleBarHost;
        if (uiConfig.isHideTitleBar()) {
            this.d.getWebSettings().invisibleTitleBar();
            return;
        }
        this.d.getWebSettings().visibleTitleBar();
        if (uiConfig.isTitleBarTransparent()) {
            baseTitleBar.setVisibility(4);
        } else {
            baseTitleBar.setVisibility(0);
        }
        View findViewById = baseTitleBar.findViewById(R.id.web_title_bar);
        if (findViewById != null && uiConfig.isTitleBarColorSet()) {
            findViewById.setBackgroundColor(uiConfig.getTitleBarColorInt());
        }
    }

    private void p() {
        Integer backgroundColorInt;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86b05e0eac0263b0c9ac3e212de20e0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86b05e0eac0263b0c9ac3e212de20e0b");
        } else if (this.f == null || (backgroundColorInt = this.c.uiConfig().getBackgroundColorInt()) == null) {
        } else {
            this.f.setBackgroundColor(backgroundColorInt.intValue());
        }
    }

    public static /* synthetic */ void a(n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7742b597f3738e689e81765e1b3db300", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7742b597f3738e689e81765e1b3db300");
            return;
        }
        nVar.a(true);
        nVar.o();
        nVar.p();
    }

    @Override // com.meituan.android.neohybrid.neo.notification.a.InterfaceC0306a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d429b6fe41cd96a911179a96aa4b513", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d429b6fe41cd96a911179a96aa4b513");
        } else if (TextUtils.isEmpty(str) || this.b.f || this.j.e(str) != null) {
        } else {
            a aVar = this.b;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "4084aa5c6e807e5725bad72e67122ac9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "4084aa5c6e807e5725bad72e67122ac9");
                return;
            }
            com.meituan.android.neohybrid.core.listener.a aVar2 = aVar.b;
            Object[] objArr3 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = l.a;
            if (aVar.a(aVar2, PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "6651a85136a74d465d068021bfe3ed04", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0302a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "6651a85136a74d465d068021bfe3ed04") : new l(str))) {
                aVar.a(str);
            } else if (TunnelParamJSHandler.NAME.equals(str)) {
                aVar.a(str);
            }
        }
    }

    public final WebView j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1858e2b4eb8e06bf8064fb589f70f3eb", RobustBitConfig.DEFAULT_VALUE) ? (WebView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1858e2b4eb8e06bf8064fb589f70f3eb") : this.d.getWebView();
    }

    public final a k() {
        return this.b;
    }

    public final NeoConfig l() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "189bee8b85f476f10db925cc47dd34e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "189bee8b85f476f10db925cc47dd34e5");
        }
        if (view == null) {
            return null;
        }
        try {
            return view.getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59f1c39a4b4e8372dd874409efe28ba2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59f1c39a4b4e8372dd874409efe28ba2")).booleanValue() : i() != null;
    }

    private void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab77a51b7001e78c2d9f1c2cf442690d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab77a51b7001e78c2d9f1c2cf442690d");
        } else if (this.p != null) {
            this.h = this.p.a(j(), this.h);
        }
    }

    private void r() {
        WebView j;
        NeoBridge neoBridge;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a27ccef641919195b0a12fc8e5f93444", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a27ccef641919195b0a12fc8e5f93444");
            return;
        }
        HashMap<String, Object> hashMap = com.meituan.android.neohybrid.neo.report.a.c("hybrid_current_url", this.h).b;
        if (com.meituan.android.neohybrid.neo.offline.b.a(this.h)) {
            com.meituan.android.neohybrid.neo.report.d.a(this.b, "is_offline_package_exist", "1");
            com.meituan.android.neohybrid.neo.report.d.a(this.b, "b_pay_hybrid_offline_package_exist_mv", "c_pay_7c9fc4b4", null, hashMap);
            com.meituan.android.neohybrid.neo.report.d.c(this.b, "hybrid_offline_package_exist", hashMap);
        } else {
            com.meituan.android.neohybrid.neo.report.d.a(this.b, "is_offline_package_exist", "0");
            com.meituan.android.neohybrid.neo.report.d.a(this.b, "b_pay_hybrid_offline_package_not_exist_mv", "c_pay_7c9fc4b4", null, hashMap);
            com.meituan.android.neohybrid.neo.report.d.c(this.b, "hybrid_offline_package_not_exist", hashMap);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "633527001c36d7335280f5d69d37f96f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "633527001c36d7335280f5d69d37f96f");
        } else if (this.o != null && this.o.length() != 0 && (j = j()) != null) {
            String userAgentString = j.getSettings().getUserAgentString();
            WebSettings settings = j.getSettings();
            settings.setUserAgentString(userAgentString + this.o.toString());
            this.o = new StringBuilder();
        }
        if (!this.r) {
            this.r = true;
            com.meituan.android.neohybrid.neo.offline.b.a(j(), this.b);
        }
        WebView j2 = j();
        Object[] objArr3 = {j2};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1681336fff3a5ab3b6d4c65f0c31faf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1681336fff3a5ab3b6d4c65f0c31faf2");
        } else if (this.c == null || !this.c.isNeoBridge() || Neo.debugger().a("neo_bridge_inject_disabled") || j2 == null || this.b == null) {
        } else {
            WebSettings settings2 = j2.getSettings();
            if (!settings2.getJavaScriptEnabled()) {
                settings2.setJavaScriptEnabled(true);
            }
            if (this.c.isNeoStorageBridge()) {
                neoBridge = new NeoSessionStorageBridge(this.b);
            } else {
                neoBridge = new NeoBridge(this.b);
            }
            neoBridge.setNeoBridgeCustomizeHandlers(this.n);
            j2.addJavascriptInterface(neoBridge, "NeoBridge");
        }
    }

    public void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd08e3f9f1e3a9b11edd3077eac4f50a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd08e3f9f1e3a9b11edd3077eac4f50a");
            return;
        }
        String url = this.c.getUrl();
        if (TextUtils.isEmpty(url)) {
            return;
        }
        b(url);
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b3f4c909d5d8d681ce46be7798b5ad0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b3f4c909d5d8d681ce46be7798b5ad0");
        } else if (TextUtils.isEmpty(str)) {
            com.meituan.android.neohybrid.neo.report.d.a(this.b, "b_pay_neo_web_view_load_error_sc", (Map<String, Object>) com.meituan.android.neohybrid.neo.report.a.c("code", 1120021).b);
        } else {
            this.h = str;
            q();
            r();
            if (TextUtils.isEmpty(this.h)) {
                return;
            }
            this.d.getWebHandler().loadUrl(this.h);
            com.meituan.android.neohybrid.neo.report.d.a(this.b, "b_pay_neo_web_view_start_load_sc", (Map<String, Object>) com.meituan.android.neohybrid.neo.report.a.c("url", this.h).b);
        }
    }

    @Override // com.meituan.android.neohybrid.neo.nsf.c.b
    public final boolean b(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f235a2dd662900d1b3095a5c56fe153", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f235a2dd662900d1b3095a5c56fe153")).booleanValue();
        }
        com.meituan.android.neohybrid.neo.report.d.a(this.b, "b_pay_5b9me55y_sc", (Map<String, Object>) new com.meituan.android.neohybrid.neo.report.a().a(KnbConstants.PARAMS_SCENE, "normal").a("data_source", this.u).b);
        return this.b.b(str, jSONObject);
    }

    @Override // com.meituan.android.neohybrid.neo.nsf.c.b
    public final boolean a(String str, int i, String str2) {
        Object[] objArr = {str, 3000, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b14f5cbcfc0e822ac382293458cd4aa8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b14f5cbcfc0e822ac382293458cd4aa8")).booleanValue();
        }
        com.meituan.android.neohybrid.neo.report.d.a(this.b, "b_pay_qardg8z8_sc", (Map<String, Object>) com.meituan.android.neohybrid.neo.report.a.c(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, 3000).a("error_message", str2).a(KnbConstants.PARAMS_SCENE, "normal").a("data_source", this.u).b);
        return this.b.a(str, 3000, str2);
    }

    @Nullable
    private String s() {
        NeoHornConfig neoHornConfig;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4816d12ed3e270d1f82bd81d581a6124", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4816d12ed3e270d1f82bd81d581a6124");
        }
        com.meituan.android.neohybrid.core.horn.a a2 = com.meituan.android.neohybrid.core.horn.a.a();
        if (a2 == null || (neoHornConfig = (NeoHornConfig) a2.a(NeoHornConfig.class)) == null) {
            return null;
        }
        return neoHornConfig.getReCreateOptions();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c A[Catch: Exception -> 0x00b5, TryCatch #0 {Exception -> 0x00b5, blocks: (B:11:0x004d, B:33:0x0098, B:35:0x009c, B:36:0x00a4, B:37:0x00ac, B:20:0x006e, B:23:0x0078, B:26:0x0082, B:29:0x008d), top: B:43:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4 A[Catch: Exception -> 0x00b5, TryCatch #0 {Exception -> 0x00b5, blocks: (B:11:0x004d, B:33:0x0098, B:35:0x009c, B:36:0x00a4, B:37:0x00ac, B:20:0x006e, B:23:0x0078, B:26:0x0082, B:29:0x008d), top: B:43:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[Catch: Exception -> 0x00b5, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b5, blocks: (B:11:0x004d, B:33:0x0098, B:35:0x009c, B:36:0x00a4, B:37:0x00ac, B:20:0x006e, B:23:0x0078, B:26:0x0082, B:29:0x008d), top: B:43:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.meituan.android.neohybrid.core.n r18, java.lang.String r19, java.lang.String r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = 3
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r12 = 0
            r11[r12] = r0
            r13 = 1
            r11[r13] = r1
            r14 = 2
            r11[r14] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.meituan.android.neohybrid.core.n.a
            java.lang.String r9 = "77badf6f3e0dec55d731964d0403164c"
            r5 = 0
            r7 = 1
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            r4 = r11
            r6 = r15
            r8 = r9
            r3 = r9
            r9 = r16
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9)
            if (r4 == 0) goto L2a
            com.meituan.robust.PatchProxy.accessDispatch(r11, r5, r15, r13, r3)
            return
        L2a:
            boolean r3 = android.text.TextUtils.isEmpty(r20)
            if (r3 != 0) goto L39
            java.lang.String r3 = "null"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lcd
        L39:
            java.lang.String r2 = "NeoCompatDelegate.onRecreateStart"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "option="
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.meituan.android.neohybrid.neo.report.b.a(r2, r3)
            android.webkit.WebView r2 = r18.j()     // Catch: java.lang.Exception -> Lb5
            r2.setTag(r5)     // Catch: java.lang.Exception -> Lb5
            r3 = -1
            int r2 = r19.hashCode()     // Catch: java.lang.Exception -> Lb5
            r4 = -934641255(0xffffffffc84a8199, float:-207366.39)
            if (r2 == r4) goto L8d
            r4 = -796853009(0xffffffffd080fcef, float:-1.73124792E10)
            if (r2 == r4) goto L82
            r4 = 94627080(0x5a3e508, float:1.5412579E-35)
            if (r2 == r4) goto L78
            r4 = 1308176501(0x4df93075, float:5.22587808E8)
            if (r2 == r4) goto L6e
            goto L97
        L6e:
            java.lang.String r2 = "downgrade"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> Lb5
            if (r1 == 0) goto L97
            r13 = 2
            goto L98
        L78:
            java.lang.String r2 = "check"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> Lb5
            if (r1 == 0) goto L97
            r13 = 3
            goto L98
        L82:
            java.lang.String r2 = "recreate"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> Lb5
            if (r1 == 0) goto L97
            r13 = 0
            goto L98
        L8d:
            java.lang.String r2 = "reload"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> Lb5
            if (r1 == 0) goto L97
            goto L98
        L97:
            r13 = -1
        L98:
            switch(r13) {
                case 0: goto Lac;
                case 1: goto La4;
                case 2: goto L9c;
                default: goto L9b;
            }     // Catch: java.lang.Exception -> Lb5
        L9b:
            goto Lb4
        L9c:
            com.meituan.android.neohybrid.core.a r0 = r0.b     // Catch: java.lang.Exception -> Lb5
            java.lang.String r1 = "downgrade_recreate_failed"
            r0.a(r1)     // Catch: java.lang.Exception -> Lb5
            goto Lb4
        La4:
            android.webkit.WebView r0 = r18.j()     // Catch: java.lang.Exception -> Lb5
            r0.reload()     // Catch: java.lang.Exception -> Lb5
            goto Lcd
        Lac:
            android.app.Activity r0 = r18.i()     // Catch: java.lang.Exception -> Lb5
            r0.recreate()     // Catch: java.lang.Exception -> Lb5
            goto Lcd
        Lb4:
            return
        Lb5:
            r0 = move-exception
            java.lang.String r1 = "NeoCompatDelegate.onRecreateStart"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "e="
            r2.<init>(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.meituan.android.neohybrid.neo.report.b.a(r1, r0)
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.neohybrid.core.n.a(com.meituan.android.neohybrid.core.n, java.lang.String, java.lang.String):void");
    }

    public Activity i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fccb78c9026eca12e39716d03567a97", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fccb78c9026eca12e39716d03567a97");
        }
        Context context = this.e;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }
}
