package com.sankuai.waimai.store.drug.vessel.creator;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.f;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.vessel.impl.b;
import com.sankuai.waimai.store.config.d;
import com.sankuai.waimai.store.drug.coupons.CouponsDialogFragment;
import com.sankuai.waimai.store.ui.common.SGBaseDialogFragment;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends com.sankuai.waimai.store.base.vessel.impl.a {
    public static ChangeQuickRedirect a;
    private boolean d;
    private int e;
    private float f;
    private SGBaseDialogFragment g;
    private String h;
    private String i;
    private int j;
    private String k;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5775f52f384887d0496efbd6263ad449", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5775f52f384887d0496efbd6263ad449");
            return;
        }
        this.d = false;
        this.e = 0;
        this.f = -1.0f;
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void a(FragmentActivity fragmentActivity, Bundle bundle) {
        Object[] objArr = {fragmentActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebf5e1254986d36cf0754bdd95b2ab2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebf5e1254986d36cf0754bdd95b2ab2b");
            return;
        }
        super.a(fragmentActivity, bundle);
        MMPEnvHelper.onMMPContainerCreate(fragmentActivity);
        MMPEnvHelper.ensureFullInited();
        Intent l = l();
        Object[] objArr2 = {l};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1b681a713baee5b48fa506f04804b7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1b681a713baee5b48fa506f04804b7a");
        } else if (l == null || l.getData() == null) {
        } else {
            Uri data = l.getData();
            this.h = data.toString();
            String queryParameter = data.getQueryParameter("page_height");
            String queryParameter2 = data.getQueryParameter("dim");
            this.i = data.getQueryParameter("drug_extra_data");
            this.k = data.getQueryParameter("tab_info");
            this.j = f.b(data.getQueryParameter("dialog_type"));
            this.e = f.a((Object) queryParameter, 0);
            this.f = f.a((Object) queryParameter2, -1.0f);
        }
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "760207cc5ab0d956658a592e70cc6462", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "760207cc5ab0d956658a592e70cc6462");
            return;
        }
        super.g();
        if (this.d) {
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2156b2070b716ede30160d59043287e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2156b2070b716ede30160d59043287e6");
            return;
        }
        try {
            this.g = new CouponsDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("mmp_scheme_uri", this.h);
            bundle.putString("drug_extra_data", this.i);
            bundle.putString("tab_info", this.k);
            bundle.putInt("page_height", this.e);
            this.g.setArguments(bundle);
            this.g.b(this.c, a.class.getSimpleName());
            this.d = true;
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4cd6ce352a78af28a25e74b588aefff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4cd6ce352a78af28a25e74b588aefff");
            return;
        }
        super.a(i, i2, intent);
        if (this.g != null) {
            this.g.onActivityResult(i, i2, intent);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.drug.vessel.creator.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1170a extends b {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.base.vessel.impl.b, com.sankuai.waimai.store.base.vessel.b
        public final void b(@NonNull SCBaseActivity sCBaseActivity) {
        }

        @Override // com.sankuai.waimai.store.base.vessel.b
        @NonNull
        public final com.sankuai.waimai.store.base.vessel.a a(@NonNull SCBaseActivity sCBaseActivity) {
            Object[] objArr = {sCBaseActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "891541917174affad6c94bd1178cd30f", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.vessel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "891541917174affad6c94bd1178cd30f") : new a(sCBaseActivity);
        }
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.vessel.a
    public final Map<String, Object> k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d6eb47dc2f41f7040ea680d9455ccfe", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d6eb47dc2f41f7040ea680d9455ccfe");
        }
        boolean a2 = d.h().a("optimize/ffp_from_store", true);
        HashMap hashMap = new HashMap();
        if (a2) {
            hashMap.put("__ffpdp", "003");
        }
        return hashMap;
    }
}
