package com.sankuai.network.debug;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.support.constraint.R;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.dianping.nvnetwork.g;
import com.dianping.util.h;
import com.meituan.android.cipstorage.q;
import com.meituan.android.ptcommonim.model.PTFloatInfo;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.k;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DebugPanelActivity extends Activity implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    public static final String[] b = {"appmock.dp", "appmock.sankuai.com"};
    public com.sankuai.network.a c;
    private a d;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
    }

    @Override // android.app.Activity
    @TargetApi(11)
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8e92455f42a0b4f374959eaf701a519", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8e92455f42a0b4f374959eaf701a519");
            return;
        }
        super.onCreate(bundle);
        this.c = com.sankuai.network.b.a(this).c;
        super.setContentView(R.layout.sk_network_debug_panel);
        if (f.a(getIntent(), "resetProcess", false)) {
            k.b(Process.myPid());
            return;
        }
        h.b = 2;
        g.a(true);
        findViewById(R.id.gogo_ppe).setOnClickListener(this);
        findViewById(R.id.gogo_dianping).setOnClickListener(this);
        findViewById(R.id.gogo_51ping).setOnClickListener(this);
        findViewById(R.id.gogo_mock).setOnClickListener(this);
        findViewById(R.id.debug_force_network_error).setOnClickListener(this);
        q a2 = q.a(this, "dpplatform_mapidebugagent", 0);
        ((CheckBox) findViewById(R.id.tunnel_debug)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.sankuai.network.debug.DebugPanelActivity.1
            public static ChangeQuickRedirect a;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Object[] objArr2 = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4fe8984284109af3d8681bdf57734601", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4fe8984284109af3d8681bdf57734601");
                } else {
                    DebugPanelActivity.this.findViewById(R.id.tunnel_debug_frame).setVisibility(z ? 0 : 8);
                }
            }
        });
        ((CheckBox) findViewById(R.id.tunnel_debug)).setChecked(a2.b("tunnelDebug", false));
        ((CheckBox) findViewById(R.id.tunnel_log)).setChecked(a2.b("tunnelLog", false));
        ((CheckBox) findViewById(R.id.tunnel_config)).setChecked(a2.b("tunnelConfig", false));
        ((CheckBox) findViewById(R.id.tunnel_enabled)).setChecked(a2.b("tunnelEnabled", false));
        ((CheckBox) findViewById(R.id.utn_enabled)).setChecked(a2.b("utnEnabled", false));
        ((CheckBox) findViewById(R.id.http_enabled)).setChecked(!a2.b("httpDisabled", false));
        ((CheckBox) findViewById(R.id.wns_enabled)).setChecked(a2.b("wnsEnabled", false));
        ((ToggleButton) findViewById(R.id.debug_network_delay)).setChecked(this.c.q() > 0);
        ((ToggleButton) findViewById(R.id.debug_network_error)).setChecked(this.c.r());
        findViewById(R.id.domain_selector_item).setOnClickListener(this);
        findViewById(R.id.clear_mapi_cache).setOnClickListener(this);
        findViewById(R.id.btn_open_url).setOnClickListener(this);
        findViewById(R.id.btn_open_logan).setOnClickListener(this);
    }

    @Override // android.app.Activity
    @TargetApi(11)
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1cca869d38895d6f8de89b5605a0a20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1cca869d38895d6f8de89b5605a0a20");
            return;
        }
        super.onDestroy();
        this.c.a(((ToggleButton) findViewById(R.id.debug_network_delay)).isChecked() ? MetricsAnrManager.ANR_THRESHOLD : 0L);
        this.c.a(((ToggleButton) findViewById(R.id.debug_network_error)).isChecked());
        com.sankuai.network.debug.a a2 = new com.sankuai.network.debug.a(this, "dpplatform_mapidebugagent").a(NetLogConstants.Details.PROXY, this.c.a());
        int b2 = this.c.b();
        Object[] objArr2 = {"proxyPort", Integer.valueOf(b2)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.network.debug.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "754b5eee6b37d103778a5249f7a537ea", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (com.sankuai.network.debug.a) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "754b5eee6b37d103778a5249f7a537ea");
        } else {
            a2.b.a("proxyPort", b2);
        }
        a2.a("tunnelDebug", ((CheckBox) findViewById(R.id.tunnel_debug)).isChecked()).a("tunnelLog", ((CheckBox) findViewById(R.id.tunnel_log)).isChecked()).a("tunnelConfig", ((CheckBox) findViewById(R.id.tunnel_config)).isChecked()).a("tunnelEnabled", ((CheckBox) findViewById(R.id.tunnel_enabled)).isChecked()).a("utnEnabled", ((CheckBox) findViewById(R.id.utn_enabled)).isChecked()).a("httpDisabled", !((CheckBox) findViewById(R.id.http_enabled)).isChecked()).a("wnsEnabled", ((CheckBox) findViewById(R.id.wns_enabled)).isChecked()).a("setSwitchDomain", this.c.c()).a("setMapiDomain", this.c.d()).a("setBookingDebugDomain", this.c.e()).a("setTDebugDomain", this.c.f()).a("setPayDebugDomain", this.c.g()).a("setMovieDebugDomain", this.c.h()).a("setMembercardDebugDomain", this.c.i()).a("setTakeawayDebugDomain", this.c.j()).a("setHuihuiDebugDomain", this.c.k()).a("setBeautyDebugDomain", this.c.l()).a("setLocateDebugDomain", this.c.m()).a("setMeituanDebugDomain", this.c.p());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        com.dianping.dataservice.cache.a cache;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e38f85f7d3b517f2cc473061a6ffa2b", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e38f85f7d3b517f2cc473061a6ffa2b");
        } else if (view.getId() == R.id.domain_selector_item) {
            startActivity(new Intent(this, DebugDomainSelectActivity.class));
        } else if (view.getId() == R.id.clear_mapi_cache) {
            com.sankuai.network.b a2 = com.sankuai.network.b.a(this);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.network.b.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "a17a1d33d539504be804a3c4bf6aaca7", RobustBitConfig.DEFAULT_VALUE)) {
                cache = (com.dianping.dataservice.cache.a) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "a17a1d33d539504be804a3c4bf6aaca7");
            } else {
                a2.a();
                cache = a2.b.cache();
            }
            cache.a();
        } else if (view.getId() == R.id.debug_force_network_error) {
            this.c.a(10);
        } else if (view.getId() == R.id.btn_open_url) {
            startActivity(new Intent(this, TestMapiActivity.class));
        } else if (view.getId() == R.id.btn_open_logan) {
            startActivity(new Intent(this, LoganTestActivity.class));
        } else if (view.getId() == R.id.gogo_51ping) {
            if ((getApplicationInfo().flags & 2) != 0) {
                new com.sankuai.network.debug.a(this, "environment").a("net", "beta");
            }
            this.c.a("http://m.api.51ping.com/");
            this.c.b("http://mapi.51ping.com/");
            this.c.c("http://rs.api.51ping.com/");
            this.c.d("http://app.t.51ping.com/");
            this.c.e("http://api.p.51ping.com/");
            this.c.f("http://app.movie.51ping.com/");
            this.c.g("http://mc.api.51ping.com/");
            this.c.h("http://waimai.api.51ping.com/");
            this.c.i("http://hui.api.51ping.com/");
            this.c.j("http://beauty.api.51ping.com/");
            this.c.l("http://m.api.51ping.com/");
            this.c.k("http://l.api.51ping.com/");
            this.c.n("http://beta.mapi.meituan.com/");
            com.sankuai.network.b.a(getApplication()).a().mock(false);
            g.a("10.66.70.32", 8000);
            new com.sankuai.network.debug.a(this, "dpplatform_mapidebugagent").a("web_url_from_string_dianping", "http://m.dianping.com/").a("web_url_to_string_dianping", "http://m.51ping.com/");
            startActivity(a("imeituan://www.meituan.com/home"));
            finish();
        } else if (view.getId() == R.id.gogo_ppe) {
            if ((getApplicationInfo().flags & 2) != 0) {
                new com.sankuai.network.debug.a(this, "environment").a("net", "ppe");
            }
            this.c.a("http://ppe.m.api.dianping.com/");
            this.c.b("http://ppe.mapi.dianping.com");
            this.c.c("http://ppe.rs.api.dianping.com/");
            this.c.d("http://ppe.app.t.dianping.com/");
            this.c.e("http://ppe.api.p.dianping.com/");
            this.c.f("http://ppe.app.movie.dianping.com/");
            this.c.g("http://ppe.mc.api.dianping.com/");
            this.c.h("http://ppe.waimai.api.dianping.com/");
            this.c.i("http://ppe.hui.api.dianping.com/");
            this.c.j("http://ppe.beauty.api.dianping.com/");
            this.c.l("http://ppe.m.api.dianping.com/");
            this.c.k("http://ppe.l.api.dianping.com/");
            this.c.n("http://ppe.mapi.meituan.com/");
            com.sankuai.network.b.a(getApplication()).a().mock(false);
            g.a("10.66.70.32", 8000);
            startActivity(a("imeituan://www.meituan.com/home"));
            finish();
        } else if (view.getId() == R.id.gogo_dianping) {
            new com.sankuai.network.debug.a(this, "environment").a("net", PTFloatInfo.TYPE_PRODUCT);
            this.c.a((String) null);
            this.c.b(null);
            this.c.c(null);
            this.c.d(null);
            this.c.e(null);
            this.c.f(null);
            this.c.g(null);
            this.c.h(null);
            this.c.i(null);
            this.c.j(null);
            this.c.l(null);
            this.c.n(null);
            com.sankuai.network.b.a(getApplication()).a().mock(false);
            new com.sankuai.network.debug.a(this, "dpplatform_mapidebugagent").a("web_url_from_string_dianping", (String) null).a("web_url_to_string_dianping", (String) null);
            startActivity(a("imeituan://www.meituan.com/home"));
            finish();
        } else if (view.getId() == R.id.gogo_mock) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setItems(b, new DialogInterface.OnClickListener() { // from class: com.sankuai.network.debug.DebugPanelActivity.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3151bbf0c1730c8f9b1fe0e12ec23c5c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3151bbf0c1730c8f9b1fe0e12ec23c5c");
                        return;
                    }
                    String str = AbsApiFactory.HTTP + DebugPanelActivity.b[i] + "/";
                    new com.sankuai.network.debug.a(DebugPanelActivity.this, "environment").a("net", DebugPanelActivity.b[i]);
                    DebugPanelActivity.this.c.a(str);
                    DebugPanelActivity.this.c.b(str);
                    DebugPanelActivity.this.c.c(str);
                    DebugPanelActivity.this.c.d(str);
                    DebugPanelActivity.this.c.e(str);
                    DebugPanelActivity.this.c.f(str);
                    DebugPanelActivity.this.c.g(str);
                    DebugPanelActivity.this.c.h(str);
                    DebugPanelActivity.this.c.i(str);
                    DebugPanelActivity.this.c.j(str);
                    DebugPanelActivity.this.c.l(str);
                    DebugPanelActivity.this.c.n(str);
                    com.sankuai.network.b.a(DebugPanelActivity.this.getApplication()).a().mock(true);
                    if (DebugPanelActivity.this.d != null) {
                        a unused = DebugPanelActivity.this.d;
                    }
                    DebugPanelActivity.this.startActivity(DebugPanelActivity.this.a("imeituan://www.meituan.com/home"));
                    DebugPanelActivity.this.finish();
                }
            });
            builder.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Intent a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2d7cfae60ce8a07890ae20cefbc7f41", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2d7cfae60ce8a07890ae20cefbc7f41");
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(67108864);
        return intent;
    }
}
