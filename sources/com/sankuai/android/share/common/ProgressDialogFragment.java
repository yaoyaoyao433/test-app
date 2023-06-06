package com.sankuai.android.share.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.NotificationCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ProgressDialogFragment extends DialogFragment {
    public static ChangeQuickRedirect a;

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b1e142af9244f0a58d77f81522ad681", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b1e142af9244f0a58d77f81522ad681");
            return;
        }
        super.onCreate(bundle);
        setStyle(0, R.style.ShareLoadingDialogFragment);
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6466dd86d50991bad42d65f8a3efd9c", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6466dd86d50991bad42d65f8a3efd9c") : layoutInflater.inflate(R.layout.share_common_loading, viewGroup, false);
    }

    public static void a(FragmentManager fragmentManager) {
        Object[] objArr = {fragmentManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e93c5461c43b9f35703587c790ce9c9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e93c5461c43b9f35703587c790ce9c9d");
        } else if (fragmentManager == null) {
        } else {
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag(NotificationCompat.CATEGORY_PROGRESS);
            if (findFragmentByTag == null || !(findFragmentByTag instanceof DialogFragment)) {
                findFragmentByTag = new ProgressDialogFragment();
            }
            if (findFragmentByTag.isAdded()) {
                return;
            }
            fragmentManager.beginTransaction().add(findFragmentByTag, NotificationCompat.CATEGORY_PROGRESS).commitAllowingStateLoss();
        }
    }

    public static void b(FragmentManager fragmentManager) {
        Fragment findFragmentByTag;
        Object[] objArr = {fragmentManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d78116f6507af115618a2d0c2875ead", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d78116f6507af115618a2d0c2875ead");
        } else if (fragmentManager != null && (findFragmentByTag = fragmentManager.findFragmentByTag(NotificationCompat.CATEGORY_PROGRESS)) != null && (findFragmentByTag instanceof DialogFragment) && findFragmentByTag.isAdded()) {
            ((DialogFragment) findFragmentByTag).dismissAllowingStateLoss();
        }
    }
}
