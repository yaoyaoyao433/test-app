package com.meituan.android.yoda.model.behavior;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import com.meituan.android.yoda.model.behavior.tool.i;
import com.meituan.android.yoda.util.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a684032df73d1e695902dc1820182020", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a684032df73d1e695902dc1820182020");
        } else if (!y.a((Activity) fragmentActivity)) {
            com.meituan.android.yoda.model.behavior.collection.b a2 = com.meituan.android.yoda.model.behavior.collection.b.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.yoda.model.behavior.collection.b.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "094552fa7971a7dfd998c245bd271786", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "094552fa7971a7dfd998c245bd271786");
            } else if (a2.d <= 0) {
                a2.d = System.currentTimeMillis();
            }
            com.meituan.android.yoda.model.behavior.tool.a.a(fragmentActivity);
            try {
                fragmentActivity.getSupportFragmentManager().executePendingTransactions();
            } catch (Exception unused) {
            }
            List<Fragment> fragments = fragmentActivity.getSupportFragmentManager().getFragments();
            if (fragments != null) {
                for (Fragment fragment : fragments) {
                    a(fragment);
                }
            }
            fragmentActivity.getSupportFragmentManager().registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() { // from class: com.meituan.android.yoda.model.behavior.Driver$1
                public static ChangeQuickRedirect a;

                @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
                public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment2, View view, Bundle bundle) {
                    Object[] objArr3 = {fragmentManager, fragment2, view, bundle};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "52053d0298f3b631e37ee2f123397004", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "52053d0298f3b631e37ee2f123397004");
                        return;
                    }
                    super.onFragmentViewCreated(fragmentManager, fragment2, view, bundle);
                    a.a(fragment2);
                }
            }, true);
            View findViewById = fragmentActivity.findViewById(16908290);
            Object[] objArr3 = {findViewById};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "e4f7f1ca39d906993cd734131966fc56", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "e4f7f1ca39d906993cd734131966fc56");
            } else {
                com.meituan.android.yoda.model.behavior.tool.d.a(findViewById);
            }
            i.a(fragmentActivity.getWindow());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Fragment fragment) {
        Dialog dialog;
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa4c044069923b81214a71ec50723b27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa4c044069923b81214a71ec50723b27");
        } else if (fragment != null) {
            com.meituan.android.yoda.model.behavior.tool.d.a(fragment.getView());
            if (!(fragment instanceof DialogFragment) || (dialog = ((DialogFragment) fragment).getDialog()) == null) {
                return;
            }
            i.a(dialog.getWindow());
        }
    }
}
