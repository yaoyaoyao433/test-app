package com.sankuai.waimai.business.page.home.list.feed;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentTransaction;
import com.meituan.android.mtplayer.video.h;
import com.meituan.android.mtplayer.video.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.machpro.WMMachProActivityDelegate;
import com.sankuai.waimai.business.ugc.machpro.base.MPCommonFragment;
import com.sankuai.waimai.business.ugc.machpro.base.MPCustomBaseFragment;
import com.sankuai.waimai.business.ugc.pickme.PickMeMPFragment;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.platform.machpro.video.a;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class UgcFeedActivity extends BaseActivity implements a {
    public static ChangeQuickRedirect a;
    private MPCustomBaseFragment b;

    @Override // com.sankuai.waimai.platform.machpro.video.a
    public final h b() {
        return null;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        boolean contains;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65af62b949c5ca0769ce8318972b3cc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65af62b949c5ca0769ce8318972b3cc7");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.wm_ugc_pickme_mp_activity);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "89592b2498d03774802e2a7505eb621a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "89592b2498d03774802e2a7505eb621a");
        } else {
            com.sankuai.waimai.platform.capacity.immersed.a.a((Activity) this, true);
            com.sankuai.waimai.platform.capacity.immersed.a.b(this, true);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7b112c6f5771a87baa0964e314ff7733", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7b112c6f5771a87baa0964e314ff7733");
        } else {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d43def52398a86351dd9ba53d3ce1337", RobustBitConfig.DEFAULT_VALUE)) {
                contains = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d43def52398a86351dd9ba53d3ce1337")).booleanValue();
            } else {
                Uri data = getIntent().getData();
                contains = data != null ? data.toString().contains("/pickme") : false;
            }
            if (contains) {
                this.b = PickMeMPFragment.a("PickMe");
            } else {
                this.b = MPCommonFragment.a(f.b(getIntent(), WMMachProActivityDelegate.MP_BIZ, WMMachProActivityDelegate.MP_BIZ), f.b(getIntent(), WMMachProActivityDelegate.MP_ENTRY, WMMachProActivityDelegate.MP_ENTRY), f.b(getIntent(), WMMachProActivityDelegate.MP_EXTRA_DATA, WMMachProActivityDelegate.MP_EXTRA_DATA), getIntent() != null ? getIntent().getData() : null);
            }
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6c2f1b6567330de6ac1ce920180464d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6c2f1b6567330de6ac1ce920180464d2");
        } else if (this.b != null) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.replace(R.id.fl_pickme_mp_container, this.b);
            beginTransaction.commitAllowingStateLoss();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff4f849db6cf5a7fbe3d3a65dada29db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff4f849db6cf5a7fbe3d3a65dada29db");
            return;
        }
        if (this.b != null) {
            MPCustomBaseFragment mPCustomBaseFragment = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = MPCustomBaseFragment.b;
            if (PatchProxy.isSupport(objArr2, mPCustomBaseFragment, changeQuickRedirect2, false, "6d127323842b81530c219628de4860fb", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, mPCustomBaseFragment, changeQuickRedirect2, false, "6d127323842b81530c219628de4860fb")).booleanValue();
            } else {
                if (mPCustomBaseFragment.c) {
                    mPCustomBaseFragment.a("onBackPressed", (MachMap) null);
                }
                z = mPCustomBaseFragment.c;
            }
            if (z) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4013deeba72977c7e728c4141b8e45a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4013deeba72977c7e728c4141b8e45a");
        } else {
            super.onDestroy();
        }
    }

    @Override // com.sankuai.waimai.platform.machpro.video.a
    public final l d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31ab7f59245cd990e264db3e1b5ed624", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31ab7f59245cd990e264db3e1b5ed624") : MPCustomBaseFragment.e();
    }
}
