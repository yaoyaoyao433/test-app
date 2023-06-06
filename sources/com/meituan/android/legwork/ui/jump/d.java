package com.meituan.android.legwork.ui.jump;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.legwork.ui.abfragment.LegworkMRNBaseFragment;
import com.meituan.android.legwork.ui.activity.ToSendOneMoreActivity;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d extends com.meituan.android.legwork.ui.base.b {
    public static ChangeQuickRedirect c;
    private k d;

    @Override // com.meituan.android.legwork.ui.base.b
    public final boolean d() {
        return false;
    }

    public d(ToSendOneMoreActivity toSendOneMoreActivity) {
        super(toSendOneMoreActivity);
        Object[] objArr = {toSendOneMoreActivity};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec2c6291059753d336d36e5595b863ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec2c6291059753d336d36e5595b863ba");
        }
    }

    @Override // com.meituan.android.legwork.ui.base.b
    public final void a(Bundle bundle) {
        boolean z = true;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3789177cd46c2c300b8e8277471d551d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3789177cd46c2c300b8e8277471d551d");
            return;
        }
        super.a(bundle);
        Intent intent = this.b.getIntent();
        if (intent == null || intent.getData() == null) {
            this.b.finish();
            return;
        }
        String queryParameter = this.b.getIntent().getData().getQueryParameter("mrn_component");
        Object[] objArr2 = {queryParameter};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0c7e14d7124eb3332eb5853d50b91446", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0c7e14d7124eb3332eb5853d50b91446")).booleanValue();
        } else {
            boolean b = com.meituan.android.legwork.common.user.a.a().b();
            boolean b2 = com.meituan.android.legwork.common.util.a.a().b(queryParameter);
            x.c("MrnDelegate.needWaitLogin", "当前是否登录: " + b + " 是否要求登录: " + b2);
            if (b || !b2) {
                z = false;
            } else {
                rx.d<Integer> c2 = com.meituan.android.legwork.common.user.a.a().c();
                Object[] objArr3 = {this};
                ChangeQuickRedirect changeQuickRedirect3 = e.a;
                this.d = c2.c(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "da098e770ecd00dc692da52a0fcb595a", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.b) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "da098e770ecd00dc692da52a0fcb595a") : new e(this));
                com.meituan.android.legwork.common.user.a.a().a(this.b);
            }
        }
        if (z) {
            return;
        }
        e();
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdada5d62239255c278104e3b22d3fed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdada5d62239255c278104e3b22d3fed");
            return;
        }
        Intent intent = this.b.getIntent();
        if (intent == null || intent.getData() == null) {
            this.b.finish();
            return;
        }
        if (this.b.g != R.layout.legwork_empty) {
            x.c("MrnDelegate.initPage", "跑腿壳空UI");
            this.b.setContentView(R.layout.legwork_empty);
        }
        x.c("MrnDelegate.initPage", "init跑腿壳Fragment");
        this.b.b();
        FragmentManager supportFragmentManager = this.b.getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("10000");
        Statistics.disablePageIdentify(AppUtil.generatePageInfoKey(this.b));
        Statistics.disableAutoPV(AppUtil.generatePageInfoKey(this.b));
        Statistics.disableAutoPD(AppUtil.generatePageInfoKey(this.b));
        if (findFragmentByTag == null) {
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            Uri data = this.b.getIntent().getData();
            String queryParameter = data.getQueryParameter("mrn_min_version");
            if (TextUtils.isEmpty(queryParameter)) {
                String queryParameter2 = data.getQueryParameter("mrn_entry");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    String c2 = com.meituan.android.legwork.mrn.b.a().c(queryParameter2);
                    data = data.buildUpon().appendQueryParameter("mrn_min_version", c2).build();
                    x.c("MrnDelegate.initPage", "跑腿壳增加最低版本号:" + queryParameter2 + CommonConstant.Symbol.MINUS + c2);
                }
            } else {
                String queryParameter3 = data.getQueryParameter("mrn_entry");
                if (!com.meituan.android.legwork.mrn.b.a().a(queryParameter, queryParameter3)) {
                    String c3 = com.meituan.android.legwork.mrn.b.a().c(queryParameter3);
                    data = data.buildUpon().appendQueryParameter("mrn_min_version", c3).build();
                    x.c("MrnDelegate.initPage", "跑腿壳增加最低版本号，由于Native存的bundle版本号大于传递过来的版本号:" + queryParameter3 + CommonConstant.Symbol.MINUS + c3);
                }
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("mrn_arg", data);
            beginTransaction.replace(R.id.mrn_container, Fragment.instantiate(this.b, LegworkMRNBaseFragment.class.getName(), bundle), "10000");
            beginTransaction.commitAllowingStateLoss();
        }
    }

    public static /* synthetic */ void a(d dVar, Integer num) {
        Object[] objArr = {dVar, num};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7fb4bac94a7886e889b9cb617a095541", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7fb4bac94a7886e889b9cb617a095541");
        } else if (num.intValue() == 1) {
            dVar.e();
        } else if (num.intValue() == 2) {
            x.c("MrnDelegate.needWaitLogin", "用户取消登录 结束activity");
            dVar.b.finish();
        }
    }

    @Override // com.meituan.android.legwork.ui.base.b
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9e9a5cd8dc1ddbebaf559ca25586981", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9e9a5cd8dc1ddbebaf559ca25586981");
            return;
        }
        super.a(i, i2, intent);
        x.c("MrnDelegate.onActivityResult", "获取返回的结果");
        LegworkMRNBaseFragment f = f();
        if (f != null) {
            x.c("MrnDelegate.onActivityResult", "调用fragment的返回结果");
            f.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.meituan.android.legwork.ui.base.b
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bc82fb6d453e23f663493ad4d417993", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bc82fb6d453e23f663493ad4d417993")).booleanValue();
        }
        super.c();
        LegworkMRNBaseFragment f = f();
        if (f == null) {
            x.c("MrnDelegate.onBackPressed", "调用默认的onBackPressed: false");
            return false;
        }
        boolean k = f.k();
        x.c("MrnDelegate.onBackPressed", "调用MrnFragment的onBackPressed:" + k);
        return k;
    }

    @Override // com.meituan.android.legwork.ui.base.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf4a2aab77449a9a56abd4a35a2e6918", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf4a2aab77449a9a56abd4a35a2e6918");
            return;
        }
        super.b();
        if (this.d == null || this.d.isUnsubscribed()) {
            return;
        }
        this.d.unsubscribe();
    }

    private LegworkMRNBaseFragment f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aac0b0b2d13f538746023802dede69c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (LegworkMRNBaseFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aac0b0b2d13f538746023802dede69c9");
        }
        Fragment findFragmentByTag = this.b.getSupportFragmentManager().findFragmentByTag("10000");
        if (findFragmentByTag instanceof LegworkMRNBaseFragment) {
            return (LegworkMRNBaseFragment) findFragmentByTag;
        }
        return null;
    }
}
