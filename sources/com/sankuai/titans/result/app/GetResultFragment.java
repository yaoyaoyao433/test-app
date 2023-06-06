package com.sankuai.titans.result.app;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import com.meituan.android.privacy.aop.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.f;
import com.sankuai.meituan.takeoutnew.util.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class GetResultFragment extends Fragment {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int mRequestCode;

    public void handleActivityCancel() {
    }

    public void handleActivityResult(Intent intent) {
    }

    public void handlePermissionResult(@NonNull String[] strArr, @NonNull int[] iArr) {
    }

    public GetResultFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "845e7bfa2b51540b5c428250b4cc23d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "845e7bfa2b51540b5c428250b4cc23d7");
        } else {
            this.mRequestCode = -1;
        }
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5152e7d1b7e605f48c29947495ac033c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5152e7d1b7e605f48c29947495ac033c");
        } else if (f.a(this, i, strArr, iArr).b) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (i != this.mRequestCode) {
                return;
            }
            handlePermissionResult(strArr, iArr);
            if (getActivity() != null) {
                FragmentManager fragmentManager = getActivity().getFragmentManager();
                fragmentManager.beginTransaction().remove(this).commitAllowingStateLoss();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cdc5841cdc4d226da328e88065898d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cdc5841cdc4d226da328e88065898d0");
            return;
        }
        a.c();
        super.onActivityResult(i, i2, intent);
        if (i != this.mRequestCode) {
            a.d();
            return;
        }
        if (i2 == -1) {
            handleActivityResult(intent);
        } else {
            handleActivityCancel();
        }
        if (getActivity() != null) {
            FragmentManager fragmentManager = getActivity().getFragmentManager();
            fragmentManager.beginTransaction().remove(this).commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
        }
        a.d();
    }

    @Override // android.app.Fragment
    public void startActivityForResult(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8051f78f01a019507677a71d86a28b2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8051f78f01a019507677a71d86a28b2c");
            return;
        }
        this.mRequestCode = i;
        super.startActivityForResult(intent, i);
    }

    public void requestPermission(final String[] strArr, final int i) {
        Object[] objArr = {strArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5adbe5c24e9185626b48fbaf3d4299d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5adbe5c24e9185626b48fbaf3d4299d");
            return;
        }
        this.mRequestCode = i;
        if (Build.VERSION.SDK_INT >= 23) {
            Object[] objArr2 = {this, strArr, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = f.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "4fd871772ebcdb35b68caa4b1fd19939", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "4fd871772ebcdb35b68caa4b1fd19939");
                return;
            }
            final c a = c.a();
            Object[] objArr3 = {this, strArr, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect4 = c.a;
            if (PatchProxy.isSupport(objArr3, a, changeQuickRedirect4, false, "c1642407121e71611c74a1c25192243e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a, changeQuickRedirect4, false, "c1642407121e71611c74a1c25192243e");
                return;
            }
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    c.a().a(getActivity(), strArr);
                    a.c.postDelayed(new Runnable() { // from class: com.sankuai.meituan.takeoutnew.util.c.3
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "4b57019a69b81496e3b7ae25a18257ce", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "4b57019a69b81496e3b7ae25a18257ce");
                                return;
                            }
                            try {
                                this.requestPermissions(strArr, i);
                            } catch (Exception e) {
                                com.sankuai.waimai.foundation.utils.log.a.b(e);
                            }
                        }
                    }, 500L);
                }
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
        }
    }
}
