package com.sankuai.waimai.store.orderlist;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.vessel.impl.b;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.base.vessel.impl.a {
    public static ChangeQuickRedirect a;
    private OrderListFragment d;

    @Override // com.sankuai.waimai.store.base.vessel.a
    public final boolean b() {
        return false;
    }

    @Override // com.sankuai.waimai.store.base.vessel.a
    public final String d() {
        return null;
    }

    public a(@NonNull SCBaseActivity sCBaseActivity) {
        super(sCBaseActivity);
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93d9fdc835e4245692c2cc14384afdb1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93d9fdc835e4245692c2cc14384afdb1");
        }
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.vessel.a
    public final void a(Bundle bundle) {
        Bundle bundle2;
        Uri data;
        Set<String> queryParameterNames;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10b7aecd9f652f8f16be251970a4d652", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10b7aecd9f652f8f16be251970a4d652");
            return;
        }
        super.a(bundle);
        this.d = new OrderListFragment();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f976076c92b9de791a3e3288adf80e59", RobustBitConfig.DEFAULT_VALUE)) {
            bundle2 = (Bundle) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f976076c92b9de791a3e3288adf80e59");
        } else {
            bundle2 = new Bundle();
            Intent l = l();
            if (l != null && (data = l.getData()) != null && (queryParameterNames = data.getQueryParameterNames()) != null) {
                for (String str : queryParameterNames) {
                    if (!t.a(str)) {
                        String queryParameter = data.getQueryParameter(str);
                        if (!t.a(queryParameter)) {
                            bundle2.putString(str, queryParameter);
                        }
                    }
                }
            }
        }
        bundle2.putString("from", DefaultHeaderService.KEY_DRUG);
        this.d.setArguments(bundle2);
        a(R.layout.wm_sc_order_list_vessel);
        n().getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, this.d).commitAllowingStateLoss();
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85fa9b37ce1590118bb657db8423fcf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85fa9b37ce1590118bb657db8423fcf3");
            return;
        }
        super.a(i, i2, intent);
        if (this.d == null || !this.d.isAdded()) {
            return;
        }
        this.d.onActivityResult(i, i2, intent);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.orderlist.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1256a extends b {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.base.vessel.b
        @NonNull
        public final com.sankuai.waimai.store.base.vessel.a a(@NonNull SCBaseActivity sCBaseActivity) {
            Object[] objArr = {sCBaseActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4afe2b3c126ec25905b20c81a44297d9", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.vessel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4afe2b3c126ec25905b20c81a44297d9") : new a(sCBaseActivity);
        }
    }
}
