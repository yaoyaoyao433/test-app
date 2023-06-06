package com.meituan.passport.dialogs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.StringRes;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.NotificationCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.passport.utils.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ProgressDialogFragment extends DialogFragment {
    public static ChangeQuickRedirect a;
    @StringRes
    private int b;
    private TextView c;

    public ProgressDialogFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd20bcd0ee0ff1a1f83cd0f43c59745c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd20bcd0ee0ff1a1f83cd0f43c59745c");
        } else {
            this.b = 0;
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e5dcbb6a603c6bfce503e7d807d2e16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e5dcbb6a603c6bfce503e7d807d2e16");
            return;
        }
        super.onCreate(bundle);
        if (ab.a() == 3) {
            setStyle(0, R.style.OperatorLoginDialogTheme);
        } else {
            setStyle(0, R.style.PassportDialogFragment);
        }
        if (getArguments() != null) {
            this.b = getArguments().getInt("msgResId", R.string.passport_loading);
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d46c1f3fdd90a52d3178341ac5d620a1", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d46c1f3fdd90a52d3178341ac5d620a1") : layoutInflater.inflate(R.layout.passport_progress_dialog, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fb8db72188bade637c8e7abd96cd609", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fb8db72188bade637c8e7abd96cd609");
            return;
        }
        super.onViewCreated(view, bundle);
        this.c = (TextView) view.findViewById(R.id.passport_progress_text);
        this.c.setText(this.b);
    }

    public static void a(FragmentManager fragmentManager, @StringRes int i) {
        Object[] objArr = {fragmentManager, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "219a2ef27c1394cf7a65b20052334b49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "219a2ef27c1394cf7a65b20052334b49");
        } else if (fragmentManager == null) {
        } else {
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag(NotificationCompat.CATEGORY_PROGRESS);
            if (!(findFragmentByTag instanceof ProgressDialogFragment)) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f0120bca5397810e7313d901b1f7da6e", RobustBitConfig.DEFAULT_VALUE)) {
                    findFragmentByTag = (ProgressDialogFragment) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f0120bca5397810e7313d901b1f7da6e");
                } else {
                    findFragmentByTag = new ProgressDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt("msgResId", i);
                    findFragmentByTag.setArguments(bundle);
                }
            }
            if (findFragmentByTag.isAdded()) {
                return;
            }
            fragmentManager.beginTransaction().add(findFragmentByTag, NotificationCompat.CATEGORY_PROGRESS).commitAllowingStateLoss();
            com.meituan.passport.utils.n.a("ProgressDialogFragment.showProgressDialog", "showProgressDialog", "");
        }
    }

    public static void a(FragmentManager fragmentManager) {
        Object[] objArr = {fragmentManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f951587e8b898bfd5ec6218c0d7190f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f951587e8b898bfd5ec6218c0d7190f1");
        } else if (fragmentManager == null) {
        } else {
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag(NotificationCompat.CATEGORY_PROGRESS);
            if ((findFragmentByTag instanceof DialogFragment) && findFragmentByTag.isAdded()) {
                ((DialogFragment) findFragmentByTag).dismissAllowingStateLoss();
                com.meituan.passport.utils.n.a("ProgressDialogFragment.hideProgressDialog", "hideProgressDialog", "");
            }
        }
    }
}
