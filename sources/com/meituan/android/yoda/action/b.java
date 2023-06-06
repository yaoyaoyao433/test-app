package com.meituan.android.yoda.action;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.meituan.android.yoda.IYodaVerifyListener;
import com.meituan.android.yoda.fragment.BaseDialogFragment;
import com.meituan.android.yoda.interfaces.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements d {
    public static ChangeQuickRedirect a;
    private com.meituan.android.yoda.interfaces.d<BaseDialogFragment> b;
    private Bundle c;

    public b(@NonNull com.meituan.android.yoda.interfaces.d<BaseDialogFragment> dVar, Bundle bundle) {
        Object[] objArr = {dVar, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afed560a405a36825166b1591bcc4f71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afed560a405a36825166b1591bcc4f71");
            return;
        }
        this.b = dVar;
        this.c = bundle;
    }

    @Override // com.meituan.android.yoda.action.d
    public final void a(int i, String str, FragmentActivity fragmentActivity, int i2, IYodaVerifyListener iYodaVerifyListener, f<Integer> fVar, com.meituan.android.yoda.config.verify.a aVar) {
        Fragment fragment;
        int i3;
        int i4;
        Object[] objArr = {Integer.valueOf(i), str, fragmentActivity, Integer.valueOf(i2), iYodaVerifyListener, fVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8e6e3a89eee94f764d408988f2de297", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8e6e3a89eee94f764d408988f2de297");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("DialogFragmentConfirm", "confirm 1, CommonReport.YODA_PAGE_LAUNCH", true);
        try {
            fragmentActivity.getSupportFragmentManager().executePendingTransactions();
            Fragment findFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag(b());
            if (findFragmentByTag != null) {
                if (findFragmentByTag instanceof BaseDialogFragment) {
                    ((BaseDialogFragment) findFragmentByTag).a(iYodaVerifyListener);
                    return;
                }
                return;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            com.meituan.android.yoda.monitor.log.a.a("DialogFragmentConfirm", "confirm, requestCode = " + str + ", exception = " + th.getMessage(), true);
        }
        int b = this.b.b();
        Object[] objArr2 = {str, iYodaVerifyListener, null, null, Integer.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "79cf14e719e89758069be0a70a4efe84", RobustBitConfig.DEFAULT_VALUE)) {
            fragment = (Fragment) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "79cf14e719e89758069be0a70a4efe84");
            i4 = i;
            i3 = 2;
        } else {
            BaseDialogFragment c = this.b.c();
            c.a(this.c, iYodaVerifyListener, null, b);
            fragment = c;
            i3 = 2;
            i4 = i;
        }
        if (i4 == i3) {
            fragmentActivity.getSupportFragmentManager().beginTransaction().replace(i2, fragment, b()).commitAllowingStateLoss();
        } else {
            fragmentActivity.getSupportFragmentManager().beginTransaction().add(fragment, b()).commitAllowingStateLoss();
        }
    }

    @Override // com.meituan.android.yoda.action.d
    public final void a(int i, String str, String str2, FragmentActivity fragmentActivity, int i2, IYodaVerifyListener iYodaVerifyListener, f<Integer> fVar) {
        Fragment fragment;
        int i3;
        int i4;
        Object[] objArr = {Integer.valueOf(i), str, str2, fragmentActivity, -1, iYodaVerifyListener, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a95286a82d3bb4f4fb13c8880d12e55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a95286a82d3bb4f4fb13c8880d12e55");
            return;
        }
        try {
            com.meituan.android.yoda.monitor.log.a.a("DialogFragmentConfirm", "confirm 2, CommonReport.YODA_PAGE_LAUNCH", true);
            com.meituan.android.yoda.monitor.report.b.a("yoda_page_launch", 0L, this.b != null ? this.b.b() : -1, str2);
            fragmentActivity.getSupportFragmentManager().executePendingTransactions();
            Fragment findFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag(b());
            if (findFragmentByTag != null) {
                ((BaseDialogFragment) findFragmentByTag).a(iYodaVerifyListener);
                return;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            com.meituan.android.yoda.monitor.log.a.a("DialogFragmentConfirm", "confirm, requestCode = " + str2 + ", exception = " + th.getMessage(), true);
        }
        int b = this.b.b();
        Object[] objArr2 = {str, str2, iYodaVerifyListener, null, Integer.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59f3cea74422de6905a9755125312e02", RobustBitConfig.DEFAULT_VALUE)) {
            fragment = (Fragment) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59f3cea74422de6905a9755125312e02");
            i4 = i;
            i3 = 2;
        } else {
            BaseDialogFragment c = this.b.c();
            Bundle bundle = new Bundle(this.c);
            bundle.putString("pre_request_code", str);
            c.a(bundle, iYodaVerifyListener, null, b);
            fragment = c;
            i3 = 2;
            i4 = i;
        }
        if (i4 == i3) {
            fragmentActivity.getSupportFragmentManager().beginTransaction().replace(-1, fragment, b()).commitAllowingStateLoss();
        } else {
            fragmentActivity.getSupportFragmentManager().beginTransaction().add(fragment, b()).commitAllowingStateLoss();
        }
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bd7d178b11727af113743e5acd7cf58", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bd7d178b11727af113743e5acd7cf58") : this.b.a();
    }

    @Override // com.meituan.android.yoda.action.d
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7033c6f39aebb7d08cc0e67bd6f39b02", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7033c6f39aebb7d08cc0e67bd6f39b02")).intValue() : this.b.b();
    }
}
