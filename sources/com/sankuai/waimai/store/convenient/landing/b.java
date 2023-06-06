package com.sankuai.waimai.store.convenient.landing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.router.d;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.base.vessel.impl.a {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.param.a d;
    private SGConvenientLandingFragment e;

    @Override // com.sankuai.waimai.store.base.vessel.a
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd6c59255f33f44cf2d8ed74758689c7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd6c59255f33f44cf2d8ed74758689c7")).booleanValue();
        }
        return false;
    }

    @Override // com.sankuai.waimai.store.base.vessel.a
    public final String d() {
        return "";
    }

    public b(@NonNull SCBaseActivity sCBaseActivity) {
        super(sCBaseActivity);
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1a62e6c3f891a45fa0188a568efbbaf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1a62e6c3f891a45fa0188a568efbbaf");
        }
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.vessel.a
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62dca93d722597491e7238d858b5f5c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62dca93d722597491e7238d858b5f5c5");
            return;
        }
        super.a(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d7e21642a9fd55f4f96127f6a14bac2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d7e21642a9fd55f4f96127f6a14bac2");
        } else {
            this.d = new com.sankuai.waimai.store.param.a();
            if (d.a(n().getIntent())) {
                this.d.c(n());
            } else {
                this.d.a(n());
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3b6bb263dbee3e8f5379c603bddcc9f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3b6bb263dbee3e8f5379c603bddcc9f2");
            return;
        }
        a(R.layout.wm_sc_activity_poi_verticality_channel);
        this.e = new SGConvenientLandingFragment();
        SGConvenientLandingFragment sGConvenientLandingFragment = this.e;
        sGConvenientLandingFragment.d = this.d;
        sGConvenientLandingFragment.d.G = "c_waimai_zxw1seru";
        n().getSupportFragmentManager().beginTransaction().replace(R.id.fl_fragment_container, this.e).commitAllowingStateLoss();
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "569ff9f695dea5251f69b5277e64928c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "569ff9f695dea5251f69b5277e64928c");
        } else {
            super.c();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class a extends com.sankuai.waimai.store.base.vessel.impl.b {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.base.vessel.b
        @NonNull
        public final /* synthetic */ com.sankuai.waimai.store.base.vessel.a a(@NonNull SCBaseActivity sCBaseActivity) {
            Object[] objArr = {sCBaseActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1da3c7a13687acae1d1e6573edeb5bcb", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1da3c7a13687acae1d1e6573edeb5bcb") : new b(sCBaseActivity);
        }

        @Override // com.sankuai.waimai.store.base.vessel.impl.b, com.sankuai.waimai.store.base.vessel.b
        public final void b(@NonNull SCBaseActivity sCBaseActivity) {
            Object[] objArr = {sCBaseActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0685196007abcb5ad3794e6c3d4d31c0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0685196007abcb5ad3794e6c3d4d31c0");
                return;
            }
            sCBaseActivity.a(true, true);
            if (sCBaseActivity.getWindow() != null) {
                sCBaseActivity.getWindow().setSoftInputMode(3);
            }
            Object[] objArr2 = {sCBaseActivity};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3a38b4ee59a7e2a5a9a3f3a80ffb6c2d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3a38b4ee59a7e2a5a9a3f3a80ffb6c2d");
                return;
            }
            try {
                Activity.class.getDeclaredMethod("getActivityOptions", new Class[0]).setAccessible(true);
                Method declaredMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(sCBaseActivity, new Object[0]);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd454be4e1a76e1866b22d54957cf0bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd454be4e1a76e1866b22d54957cf0bd");
        } else {
            super.a(i, i2, intent);
        }
    }
}
