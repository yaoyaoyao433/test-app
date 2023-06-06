package com.sankuai.eh.framework;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.spi.IComponent;
import com.sankuai.eh.component.service.spi.IViewBuilder;
import com.sankuai.meituan.serviceloader.b;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    Activity b;
    com.sankuai.eh.framework.adapter.a c;

    public a(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24be40e0048b84015bb8802fd7edc06c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24be40e0048b84015bb8802fd7edc06c");
            return;
        }
        this.b = activity;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3a61b5a051ba8240930ccf5b35920c13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3a61b5a051ba8240930ccf5b35920c13");
            return;
        }
        this.c = new com.sankuai.eh.framework.adapter.web.a(this.b);
        this.c.a(com.sankuai.eh.framework.manager.a.a(10));
        com.sankuai.eh.framework.adapter.a aVar = this.c;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.eh.framework.manager.a.a;
        aVar.a(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a62ed66fc695f22cb845135bad4b461c", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "a62ed66fc695f22cb845135bad4b461c") : b.a(IViewBuilder.class, (String) null));
    }

    public final IComponent a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7591d6ebcf6884533fb7037ecf1d1209", RobustBitConfig.DEFAULT_VALUE) ? (IComponent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7591d6ebcf6884533fb7037ecf1d1209") : this.c.e();
    }

    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df305b8f7d7596897bd66cdf47d394d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df305b8f7d7596897bd66cdf47d394d3");
            return;
        }
        this.c.a(this.b, bundle);
        ((ViewGroup) this.b.findViewById(R.id.eh_container_content)).addView((View) this.c.a((Context) this.b));
        this.c.a((ViewGroup) this.b.getWindow().getDecorView());
    }
}
