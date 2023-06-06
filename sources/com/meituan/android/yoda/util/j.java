package com.meituan.android.yoda.util;

import android.os.Build;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j {
    public static ChangeQuickRedirect a;
    public FragmentManager b;
    private int c;

    public j(FragmentManager fragmentManager, int i) {
        Object[] objArr = {fragmentManager, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5fb7f771d2cb9bd6f26c741d831cfd0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5fb7f771d2cb9bd6f26c741d831cfd0");
            return;
        }
        this.b = fragmentManager;
        this.c = i;
    }

    public final void a(Fragment fragment, String str) {
        Object[] objArr = {fragment, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a22b6ce791c1a76e93485e8ead1c63b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a22b6ce791c1a76e93485e8ead1c63b5");
        } else if (this.b != null) {
            this.b.beginTransaction().replace(this.c, fragment, str).addToBackStack(fragment.getClass().getSimpleName()).commitAllowingStateLoss();
        }
    }

    public final void b(Fragment fragment, String str) {
        Object[] objArr = {fragment, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79b88fbc47d43293799db1436b8f562a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79b88fbc47d43293799db1436b8f562a");
        } else if (this.b != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.b.beginTransaction().replace(this.c, fragment, str).addToBackStack(fragment.getClass().getSimpleName()).commitAllowingStateLoss();
            } else {
                this.b.beginTransaction().setCustomAnimations(R.anim.fragment_right_enter_anim, R.anim.fragment_left_exit_anim, R.anim.fragment_left_enter_anim, R.anim.fragment_right_exit_anim).replace(this.c, fragment, str).addToBackStack(fragment.getClass().getSimpleName()).commitAllowingStateLoss();
            }
        }
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c03329b00483198d226f63bad39b9d3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c03329b00483198d226f63bad39b9d3")).booleanValue();
        }
        if (this.b == null || this.b.getBackStackEntryCount() == 1) {
            return false;
        }
        return a(str, 0);
    }

    private boolean a(String str, int i) {
        Object[] objArr = {str, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3667a6fc32fcde772758d0a4157753d1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3667a6fc32fcde772758d0a4157753d1")).booleanValue();
        }
        this.b.popBackStack(str, 0);
        return true;
    }

    public final Fragment b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c82585119dfbbd2f1d84586f1abc2eb7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c82585119dfbbd2f1d84586f1abc2eb7");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.b.findFragmentByTag(str);
    }
}
