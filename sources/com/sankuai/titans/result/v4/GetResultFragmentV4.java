package com.sankuai.titans.result.v4;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.meituan.android.privacy.aop.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.f;
import com.sankuai.meituan.takeoutnew.util.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GetResultFragmentV4 extends Fragment {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int mRequestCode;

    public void handleActivityCancel() {
    }

    public void handleActivityResult(Intent intent) {
    }

    public void handlePermissionResult(@NonNull String[] strArr, @NonNull int[] iArr) {
    }

    public GetResultFragmentV4() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c14fc86b9a2c950a547ac9ae66d8b5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c14fc86b9a2c950a547ac9ae66d8b5b");
        } else {
            this.mRequestCode = -1;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "496dce066c8b379fcb2f177001787a24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "496dce066c8b379fcb2f177001787a24");
        } else if (f.a(this, i, strArr, iArr).b) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (i != this.mRequestCode) {
                return;
            }
            handlePermissionResult(strArr, iArr);
            if (getActivity() != null) {
                FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
                supportFragmentManager.beginTransaction().remove(this).commitAllowingStateLoss();
                supportFragmentManager.executePendingTransactions();
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "410e079d9510632ab54295e33e68fdc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "410e079d9510632ab54295e33e68fdc0");
            return;
        }
        a.e();
        super.onActivityResult(i, i2, intent);
        if (i != this.mRequestCode) {
            a.f();
            return;
        }
        if (i2 == -1) {
            handleActivityResult(intent);
        } else {
            handleActivityCancel();
        }
        if (getActivity() != null) {
            FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
            supportFragmentManager.beginTransaction().remove(this).commitAllowingStateLoss();
            supportFragmentManager.executePendingTransactions();
        }
        a.f();
    }

    @Override // android.support.v4.app.Fragment
    public void startActivityForResult(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "602949892530f1461e99ea2bd9ecbdc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "602949892530f1461e99ea2bd9ecbdc2");
            return;
        }
        this.mRequestCode = i;
        super.startActivityForResult(intent, i);
    }

    public void requestPermission(final String[] strArr, final int i) {
        Object[] objArr = {strArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90d55e6def08b983bbf87e06b3dc3351", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90d55e6def08b983bbf87e06b3dc3351");
            return;
        }
        this.mRequestCode = i;
        Object[] objArr2 = {this, strArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = f.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "5f618954e79cc37f89b350a1277dfb6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "5f618954e79cc37f89b350a1277dfb6b");
            return;
        }
        final c a = c.a();
        Object[] objArr3 = {this, strArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect4 = c.a;
        if (PatchProxy.isSupport(objArr3, a, changeQuickRedirect4, false, "e1865aaf0f86c16a08f2c21d2caa5620", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a, changeQuickRedirect4, false, "e1865aaf0f86c16a08f2c21d2caa5620");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                c.a().a(getActivity(), strArr);
                a.c.postDelayed(new Runnable() { // from class: com.sankuai.meituan.takeoutnew.util.c.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "e2ac4da6711b8cbb442bdef19a648b6f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "e2ac4da6711b8cbb442bdef19a648b6f");
                            return;
                        }
                        try {
                            this.requestPermissions(strArr, i);
                        } catch (Exception e) {
                            com.sankuai.waimai.foundation.utils.log.a.b(e);
                        }
                    }
                }, 500L);
                return;
            }
            requestPermissions(strArr, i);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
        }
    }
}
