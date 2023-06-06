package com.dianping.shield.debug;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DebugFragmentUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7 */
    public static Fragment showFragment(AppCompatActivity appCompatActivity, Fragment fragment, Class cls, String str, Bundle bundle) {
        FragmentManager fragmentManager;
        Context context;
        Object[] objArr = {appCompatActivity, fragment, cls, str, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fe15c2d3ba5da1395e6453b92edb2f89", RobustBitConfig.DEFAULT_VALUE)) {
            return (Fragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fe15c2d3ba5da1395e6453b92edb2f89");
        }
        if (fragment != null) {
            fragmentManager = fragment.getFragmentManager();
            context = fragment.getContext();
        } else {
            fragmentManager = null;
            context = null;
        }
        if (fragmentManager != null || appCompatActivity == null) {
            appCompatActivity = context;
        } else {
            fragmentManager = appCompatActivity.getSupportFragmentManager();
        }
        if (fragmentManager == null || appCompatActivity == null) {
            return null;
        }
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(str);
        if (findFragmentByTag != null) {
            fragmentManager.beginTransaction().remove(findFragmentByTag).commit();
            fragmentManager.executePendingTransactions();
        }
        Fragment instantiate = Fragment.instantiate(appCompatActivity, cls.getName(), bundle);
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        if (fragment != null) {
            beginTransaction.hide(fragment);
        }
        beginTransaction.add(16908300, instantiate, str);
        if (fragment != null) {
            beginTransaction.addToBackStack(null);
        }
        beginTransaction.commit();
        return instantiate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7 */
    public static Fragment showFragment(AppCompatActivity appCompatActivity, Fragment fragment, Fragment fragment2, String str, Bundle bundle) {
        FragmentManager fragmentManager;
        Context context;
        Object[] objArr = {appCompatActivity, fragment, fragment2, str, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "84ac29e93973a0a70782adeda5b3df66", RobustBitConfig.DEFAULT_VALUE)) {
            return (Fragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "84ac29e93973a0a70782adeda5b3df66");
        }
        if (fragment != null) {
            fragmentManager = fragment.getFragmentManager();
            context = fragment.getContext();
        } else {
            fragmentManager = null;
            context = null;
        }
        if (fragmentManager != null || appCompatActivity == null) {
            appCompatActivity = context;
        } else {
            fragmentManager = appCompatActivity.getSupportFragmentManager();
        }
        if (fragmentManager == null || appCompatActivity == null) {
            return null;
        }
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(str);
        if (findFragmentByTag != null) {
            fragmentManager.beginTransaction().remove(findFragmentByTag).commit();
            fragmentManager.executePendingTransactions();
        }
        fragment2.setArguments(bundle);
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        if (fragment != null) {
            beginTransaction.hide(fragment);
        }
        beginTransaction.add(16908300, fragment2, str);
        if (fragment != null) {
            beginTransaction.addToBackStack(null);
        }
        beginTransaction.commit();
        return fragment2;
    }
}
