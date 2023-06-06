package com.sankuai.network.debug;

import android.app.Activity;
import android.os.Bundle;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.network.debug.widget.DebugDomainItem;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DebugDomainSelectActivity extends Activity {
    public static ChangeQuickRedirect a;
    public com.sankuai.network.a b;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9fb63ec16b80bc2429a30e2194e77b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9fb63ec16b80bc2429a30e2194e77b6");
            return;
        }
        super.onCreate(bundle);
        super.setContentView(R.layout.sk_network_debug_domain_select);
        this.b = com.sankuai.network.b.a(this).c;
        ((DebugDomainItem) findViewById(R.id.api_item)).setDomain(this.b.c());
        ((DebugDomainItem) findViewById(R.id.mapi_item)).setDomain(this.b.d());
        ((DebugDomainItem) findViewById(R.id.booking_item)).setDomain(this.b.e());
        ((DebugDomainItem) findViewById(R.id.tuan_item)).setDomain(this.b.f());
        ((DebugDomainItem) findViewById(R.id.pay_item)).setDomain(this.b.g());
        ((DebugDomainItem) findViewById(R.id.movie_item)).setDomain(this.b.h());
        ((DebugDomainItem) findViewById(R.id.membercard_item)).setDomain(this.b.i());
        ((DebugDomainItem) findViewById(R.id.takeaway_item)).setDomain(this.b.j());
        ((DebugDomainItem) findViewById(R.id.huihui_item)).setDomain(this.b.k());
        ((DebugDomainItem) findViewById(R.id.beauty_item)).setDomain(this.b.l());
        ((DebugDomainItem) findViewById(R.id.locate_item)).setDomain(this.b.m());
        ((DebugDomainItem) findViewById(R.id.config_item)).setDomain(this.b.n());
        ((DebugDomainItem) findViewById(R.id.ga_item)).setDomain(this.b.o());
        ((DebugDomainItem) findViewById(R.id.meituan_item)).setDomain(this.b.p());
    }

    @Override // android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aecff50df9a2d0475dea621150cb015b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aecff50df9a2d0475dea621150cb015b");
            return;
        }
        super.onDestroy();
        this.b.a(((DebugDomainItem) findViewById(R.id.api_item)).getCurrentDomain());
        this.b.b(((DebugDomainItem) findViewById(R.id.mapi_item)).getCurrentDomain());
        this.b.c(((DebugDomainItem) findViewById(R.id.booking_item)).getCurrentDomain());
        this.b.d(((DebugDomainItem) findViewById(R.id.tuan_item)).getCurrentDomain());
        this.b.e(((DebugDomainItem) findViewById(R.id.pay_item)).getCurrentDomain());
        this.b.f(((DebugDomainItem) findViewById(R.id.movie_item)).getCurrentDomain());
        this.b.g(((DebugDomainItem) findViewById(R.id.membercard_item)).getCurrentDomain());
        this.b.h(((DebugDomainItem) findViewById(R.id.takeaway_item)).getCurrentDomain());
        this.b.i(((DebugDomainItem) findViewById(R.id.huihui_item)).getCurrentDomain());
        this.b.j(((DebugDomainItem) findViewById(R.id.beauty_item)).getCurrentDomain());
        this.b.k(((DebugDomainItem) findViewById(R.id.locate_item)).getCurrentDomain());
        this.b.m(((DebugDomainItem) findViewById(R.id.ga_item)).getCurrentDomain());
        this.b.n(((DebugDomainItem) findViewById(R.id.meituan_item)).getCurrentDomain());
    }
}
