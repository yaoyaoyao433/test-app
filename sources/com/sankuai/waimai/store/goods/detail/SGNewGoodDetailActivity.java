package com.sankuai.waimai.store.goods.detail;

import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.load.c;
import com.sankuai.waimai.store.SGBaseCubeActivity;
import com.sankuai.waimai.store.base.preload.e;
import com.sankuai.waimai.store.expose.v2.b;
import com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlock;
import com.sankuai.waimai.store.m;
import com.sankuai.waimai.store.manager.judas.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGNewGoodDetailActivity extends SGBaseCubeActivity<m> {
    public static ChangeQuickRedirect e;

    @Override // com.sankuai.waimai.store.base.SCBaseActivity
    public final String b() {
        return "c_u4fk4kw";
    }

    @Override // com.sankuai.waimai.store.SGBaseCubeActivity
    public final /* synthetic */ m aY_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76994283f2f1f8eab4953b0d305ec823", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76994283f2f1f8eab4953b0d305ec823");
        }
        e.a(getIntent());
        a(true, true);
        b.a().a(this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.mach.e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bdc4c03e5ab2b51ad025b0d930992bf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bdc4c03e5ab2b51ad025b0d930992bf7");
        } else {
            c.a("supermarket", "supermarket_goodsdetail");
        }
        return new SGDetailRootTileBlock();
    }

    @Override // com.sankuai.waimai.store.SGBaseCubeActivity, com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88878fe62164b0651a80b9b2cfca8326", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88878fe62164b0651a80b9b2cfca8326");
            return;
        }
        d.a(bB_(), "c_u4fk4kw");
        super.onResume();
        b.a().c(this);
    }

    @Override // com.sankuai.waimai.store.SGBaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dab0c009436cbf784cf58bc2bda8be2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dab0c009436cbf784cf58bc2bda8be2");
            return;
        }
        super.onPause();
        b.a().e(this);
    }

    @Override // com.sankuai.waimai.store.SGBaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f7754e8747a6d055a83b36725042cda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f7754e8747a6d055a83b36725042cda");
            return;
        }
        super.onStop();
        b.a().f(this);
    }

    @Override // com.sankuai.waimai.store.SGBaseCubeActivity, com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "112ce6d313175f927acf0da6cbd3bc6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "112ce6d313175f927acf0da6cbd3bc6c");
            return;
        }
        super.onDestroy();
        b.a().b(this);
    }

    @Override // android.app.Activity
    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03ee567f834e46e9b83a4f70bf0d8c86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03ee567f834e46e9b83a4f70bf0d8c86");
            return;
        }
        super.finish();
        overridePendingTransition(0, R.anim.wm_st_goods_detail_activity_scale_alpha_out);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ed3191b1569c1de44f88ed315d727dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ed3191b1569c1de44f88ed315d727dd");
        } else if (this.b == 0 || ((m) this.b).r()) {
            super.onBackPressed();
        }
    }
}
