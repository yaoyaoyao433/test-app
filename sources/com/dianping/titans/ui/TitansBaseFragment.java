package com.dianping.titans.ui;

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
import com.sankuai.meituan.android.knb.KNBWebCompactFactory;
import com.sankuai.meituan.android.knb.KNBWebCompat;
import com.sankuai.meituan.takeoutnew.util.aop.f;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TitansBaseFragment extends Fragment {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected KNBWebCompat knbWebCompat;

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "501cfe9ed21ae7e053f4a822c34c9c31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "501cfe9ed21ae7e053f4a822c34c9c31");
            return;
        }
        super.onCreate(bundle);
        this.knbWebCompat = createCompat();
        this.knbWebCompat.onCreate((Activity) getActivity(), getArguments());
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35be2b1860f76dff735c24aa675fe9cd", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35be2b1860f76dff735c24aa675fe9cd") : this.knbWebCompat.onCreateView(layoutInflater, viewGroup);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ead9e7052407fa0fa35c8de7a5da3936", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ead9e7052407fa0fa35c8de7a5da3936");
            return;
        }
        super.onActivityCreated(bundle);
        this.knbWebCompat.onActivityCreated(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89097d6c9f5b7217fe55bd6db78cb4dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89097d6c9f5b7217fe55bd6db78cb4dc");
            return;
        }
        super.onStart();
        this.knbWebCompat.onStart();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e0baa6f15865e526ba1a73ce32f494c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e0baa6f15865e526ba1a73ce32f494c");
            return;
        }
        super.onResume();
        this.knbWebCompat.onResume();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d14c7ca2cfe8ff497d18cbb642d1e51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d14c7ca2cfe8ff497d18cbb642d1e51");
            return;
        }
        super.onPause();
        this.knbWebCompat.onPause();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7c11912648391c7fa297525bd226a18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7c11912648391c7fa297525bd226a18");
            return;
        }
        super.onStop();
        this.knbWebCompat.onStop();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e90187ac3bc97734bd5b08bcb4c6ddca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e90187ac3bc97734bd5b08bcb4c6ddca");
            return;
        }
        super.onDestroy();
        this.knbWebCompat.onDestroy();
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2321a00b586612f623ec3a96f8c17fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2321a00b586612f623ec3a96f8c17fa");
            return;
        }
        super.onSaveInstanceState(bundle);
        this.knbWebCompat.onSaveInstanceState(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60ab875ca0af7b1a9635bc550dd0981c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60ab875ca0af7b1a9635bc550dd0981c");
            return;
        }
        a.e();
        this.knbWebCompat.onActivityResult(i, i2, intent);
        a.f();
    }

    public KNBWebCompat.WebSettings getWebSettings() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03bb6ccdc92676e828ad15c233e538d8", RobustBitConfig.DEFAULT_VALUE) ? (KNBWebCompat.WebSettings) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03bb6ccdc92676e828ad15c233e538d8") : this.knbWebCompat.getWebSettings();
    }

    public KNBWebCompat.WebHandler getWebHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f11ba3825bed8295b449b0f9287d742", RobustBitConfig.DEFAULT_VALUE) ? (KNBWebCompat.WebHandler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f11ba3825bed8295b449b0f9287d742") : this.knbWebCompat.getWebHandler();
    }

    @Override // android.support.v4.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8be19c2d8b0541c275b33e126a4094f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8be19c2d8b0541c275b33e126a4094f9");
        } else if (f.a(this, i, strArr, iArr).b) {
            this.knbWebCompat.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public KNBWebCompat createCompat() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a513fe961ed53bc539d4b9dbe4d33da7", RobustBitConfig.DEFAULT_VALUE) ? (KNBWebCompat) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a513fe961ed53bc539d4b9dbe4d33da7") : KNBWebCompactFactory.getKNBCompact(0);
    }
}
