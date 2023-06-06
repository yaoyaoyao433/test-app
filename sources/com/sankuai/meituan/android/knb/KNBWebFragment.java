package com.sankuai.meituan.android.knb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.privacy.aop.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebCompat;
import com.sankuai.meituan.takeoutnew.util.aop.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KNBWebFragment extends Fragment {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected KNBWebCompat knbWebCompat;

    public void onWebCompatCreated() {
    }

    public View onWebCompatViewCreated(View view) {
        return view;
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47c6f537baf4ac5330d379b8b173add5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47c6f537baf4ac5330d379b8b173add5");
            return;
        }
        super.onCreate(bundle);
        onWebCompatCreate();
        this.knbWebCompat.onCreate((Activity) getActivity(), getArguments());
        onWebCompatCreated();
    }

    public final void onWebCompatCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9ef41b7834e0b8f852ece9576c792ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9ef41b7834e0b8f852ece9576c792ec");
        } else {
            this.knbWebCompat = createCompat();
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6a84575817b380c35af47a115e19b02", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6a84575817b380c35af47a115e19b02") : onWebCompatViewCreated(this.knbWebCompat.onCreateView(layoutInflater, viewGroup));
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40c09c0fd8ae795e1eda2416d5a1f822", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40c09c0fd8ae795e1eda2416d5a1f822");
            return;
        }
        super.onActivityCreated(bundle);
        this.knbWebCompat.onActivityCreated(bundle);
        KNBRouterManager.getInstance().pushActivity(getWebHandler().getUrl(), getActivity());
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "829104fd9cfcf236b6ac7bc74a407934", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "829104fd9cfcf236b6ac7bc74a407934");
            return;
        }
        super.onStart();
        this.knbWebCompat.onStart();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "122f6ef806b27eaa4de4467b5c64a788", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "122f6ef806b27eaa4de4467b5c64a788");
            return;
        }
        super.onResume();
        this.knbWebCompat.onResume();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e3f4c9fe09bfebd335fb6b905b44e6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e3f4c9fe09bfebd335fb6b905b44e6d");
            return;
        }
        super.onPause();
        this.knbWebCompat.onPause();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5015d6ddcd097f8c3dee3b3582479899", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5015d6ddcd097f8c3dee3b3582479899");
            return;
        }
        super.onStop();
        this.knbWebCompat.onStop();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cdac535e0b3ea4ac47a11f8f8840f45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cdac535e0b3ea4ac47a11f8f8840f45");
            return;
        }
        super.onDestroy();
        this.knbWebCompat.onDestroy();
        KNBRouterManager.getInstance().popActivity(getActivity());
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "122f798f5a81211cbf6a6331d921d2b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "122f798f5a81211cbf6a6331d921d2b6");
            return;
        }
        super.onSaveInstanceState(bundle);
        this.knbWebCompat.onSaveInstanceState(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9772721f444d4e957ec1fa639ebd818f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9772721f444d4e957ec1fa639ebd818f");
            return;
        }
        a.e();
        this.knbWebCompat.onActivityResult(i, i2, intent);
        a.f();
    }

    public KNBWebCompat.WebSettings getWebSettings() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b78da80e1ca5339c3d246f6f7b02b2c", RobustBitConfig.DEFAULT_VALUE) ? (KNBWebCompat.WebSettings) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b78da80e1ca5339c3d246f6f7b02b2c") : this.knbWebCompat.getWebSettings();
    }

    public KNBWebCompat.WebHandler getWebHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f63528ebe6b60a6309ca0dc1a998cf0", RobustBitConfig.DEFAULT_VALUE) ? (KNBWebCompat.WebHandler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f63528ebe6b60a6309ca0dc1a998cf0") : this.knbWebCompat.getWebHandler();
    }

    @Override // android.support.v4.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13739d282c39cf117512858282d44dd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13739d282c39cf117512858282d44dd2");
        } else if (f.a(this, i, strArr, iArr).b) {
            this.knbWebCompat.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Deprecated
    public KNBWebCompat createCompat() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fb26d39c4632f2e3b2606ecce924c86", RobustBitConfig.DEFAULT_VALUE) ? (KNBWebCompat) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fb26d39c4632f2e3b2606ecce924c86") : KNBWebCompactFactory.getKNBCompact(1);
    }

    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfc5fe852a6c76f65f3e3fe2baa3960c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfc5fe852a6c76f65f3e3fe2baa3960c");
        } else {
            this.knbWebCompat.onBackPressed();
        }
    }
}
