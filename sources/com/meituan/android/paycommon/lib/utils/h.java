package com.meituan.android.paycommon.lib.utils;

import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static void a(FragmentActivity fragmentActivity, Fragment fragment) {
        Object[] objArr = {fragmentActivity, fragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b52b6bc04abf518561724d81ee47688", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b52b6bc04abf518561724d81ee47688");
        } else if (fragmentActivity == null || fragmentActivity.getSupportFragmentManager() == null) {
        } else {
            fragmentActivity.getSupportFragmentManager().beginTransaction().replace(R.id.content, fragment).commitAllowingStateLoss();
        }
    }

    public static void b(FragmentActivity fragmentActivity, Fragment fragment) {
        Object[] objArr = {fragmentActivity, fragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "16fbc4796b5e52e59e66bdecdb6ffb1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "16fbc4796b5e52e59e66bdecdb6ffb1e");
        } else if (fragmentActivity == null || fragmentActivity.getSupportFragmentManager() == null) {
        } else {
            fragmentActivity.getSupportFragmentManager().beginTransaction().remove(fragment).commitAllowingStateLoss();
        }
    }

    public static void c(FragmentActivity fragmentActivity, Fragment fragment) {
        Object[] objArr = {fragmentActivity, fragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e576335143eab4c90ef30c23fba3e580", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e576335143eab4c90ef30c23fba3e580");
        } else if (fragmentActivity == null || fragmentActivity.getSupportFragmentManager() == null) {
        } else {
            fragmentActivity.getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.fragment_right_enter_anim, 0, 0, R.anim.fragment_right_exit_anim).add(R.id.content, fragment).addToBackStack(null).commitAllowingStateLoss();
        }
    }

    public static void d(FragmentActivity fragmentActivity, Fragment fragment) {
        Object[] objArr = {fragmentActivity, fragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f505bac075a6c826f5793c08a3adf1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f505bac075a6c826f5793c08a3adf1d");
        } else if (fragmentActivity == null || fragmentActivity.getSupportFragmentManager() == null) {
        } else {
            fragmentActivity.getSupportFragmentManager().beginTransaction().add(R.id.content, fragment).addToBackStack(null).commitAllowingStateLoss();
        }
    }

    public static void a(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b122ec6af3f371cb3549a97895fb9070", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b122ec6af3f371cb3549a97895fb9070");
        } else if (fragmentActivity == null || fragmentActivity.getSupportFragmentManager() == null) {
        } else {
            try {
                fragmentActivity.getSupportFragmentManager().popBackStack();
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "FragmentTransactionUtils_popBackStack", new a.c().a("message", e.getMessage()).b);
            }
        }
    }

    public static void b(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c1b473505bc3509adf5dc8bc73ff5259", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c1b473505bc3509adf5dc8bc73ff5259");
        } else if (fragmentActivity == null || fragmentActivity.getSupportFragmentManager() == null) {
        } else {
            try {
                fragmentActivity.getSupportFragmentManager().popBackStack(fragmentActivity.getSupportFragmentManager().getBackStackEntryAt(0).getId(), 0);
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "FragmentTransactionUtils_popAllBackStackExceptHome", new a.c().a("message", e.getMessage()).b);
            }
        }
    }

    public static void c(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8cc783daf65fe83c9e5dafd6a19ee709", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8cc783daf65fe83c9e5dafd6a19ee709");
        } else if (fragmentActivity.getSupportFragmentManager() != null) {
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            int backStackEntryCount = supportFragmentManager.getBackStackEntryCount();
            for (int i = 0; i < backStackEntryCount; i++) {
                supportFragmentManager.popBackStack();
            }
        }
    }

    public static void a(String str, FragmentActivity fragmentActivity) {
        Object[] objArr = {str, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4896c6fd79f25b983071a3b2728f24e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4896c6fd79f25b983071a3b2728f24e6");
            return;
        }
        List<Fragment> fragments = fragmentActivity.getSupportFragmentManager().getFragments();
        if (!com.meituan.android.paybase.utils.i.a((Collection) fragments)) {
            for (Fragment fragment : fragments) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(StringUtil.SPACE);
                sb.append(fragment.getClass().getSimpleName());
            }
            return;
        }
        fragmentActivity.getClass().getSimpleName();
    }
}
