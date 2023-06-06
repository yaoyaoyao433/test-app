package com.meituan.android.legwork.ui.jump;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.legwork.ui.activity.ToSendOneMoreActivity;
import com.meituan.android.legwork.ui.base.BaseActivity;
import com.meituan.android.legwork.ui.fragment.PoiConfirmFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f extends com.meituan.android.legwork.ui.base.b {
    public static ChangeQuickRedirect c;

    @Override // com.meituan.android.legwork.ui.base.b
    public final boolean d() {
        return true;
    }

    public f(ToSendOneMoreActivity toSendOneMoreActivity) {
        super(toSendOneMoreActivity);
        Object[] objArr = {toSendOneMoreActivity};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09938660e41caad076bb76df4995e7ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09938660e41caad076bb76df4995e7ec");
        }
    }

    @Override // com.meituan.android.legwork.ui.base.b
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "796e831468020abf43f24635f69b7313", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "796e831468020abf43f24635f69b7313");
            return;
        }
        super.a(bundle);
        this.b.setContentView(R.layout.legwork_activity_address_confirm);
        this.b.a("选择取件地址");
        ToSendOneMoreActivity toSendOneMoreActivity = this.b;
        Object[] objArr2 = {""};
        ChangeQuickRedirect changeQuickRedirect2 = BaseActivity.b;
        if (PatchProxy.isSupport(objArr2, toSendOneMoreActivity, changeQuickRedirect2, false, "8d883a8c2e7a0ea3a910ec222a314cc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, toSendOneMoreActivity, changeQuickRedirect2, false, "8d883a8c2e7a0ea3a910ec222a314cc7");
        } else {
            toSendOneMoreActivity.c.setText("");
        }
        FragmentManager supportFragmentManager = this.b.getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("Poi_Confirm");
        Statistics.disablePageIdentify(AppUtil.generatePageInfoKey(this.b));
        Statistics.disableAutoPV(AppUtil.generatePageInfoKey(this.b));
        Statistics.disableAutoPD(AppUtil.generatePageInfoKey(this.b));
        if (findFragmentByTag == null) {
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.replace(R.id.address_confirm_fragment, new PoiConfirmFragment(), "Poi_Confirm");
            beginTransaction.commitAllowingStateLoss();
        }
    }

    @Override // com.meituan.android.legwork.ui.base.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6976ecf24cd87aff4a305d3d7f3fdfbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6976ecf24cd87aff4a305d3d7f3fdfbe");
        } else {
            super.a();
        }
    }

    @Override // com.meituan.android.legwork.ui.base.b
    public final void a(int i, int i2, Intent intent) {
        Fragment findFragmentByTag;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78e5be6f229ab172e30f6416adac2bf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78e5be6f229ab172e30f6416adac2bf0");
            return;
        }
        super.a(i, i2, intent);
        FragmentManager supportFragmentManager = this.b.getSupportFragmentManager();
        if (supportFragmentManager == null || (findFragmentByTag = supportFragmentManager.findFragmentByTag("Poi_Confirm")) == null) {
            return;
        }
        findFragmentByTag.onActivityResult(i, i2, intent);
    }
}
