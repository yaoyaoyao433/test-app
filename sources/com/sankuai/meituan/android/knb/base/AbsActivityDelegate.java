package com.sankuai.meituan.android.knb.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.android.knb.KNBWebCompat;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class AbsActivityDelegate {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected IKNBWebCompat iknbWebCompat;
    protected Activity impl;
    public KNBWebCompat mKnbWebCompat;
    protected ActionBar supportActionBar;

    public abstract void createCompat(Bundle bundle);

    public abstract void onActivityResult(int i, int i2, Intent intent);

    public abstract void onBackPressed();

    public abstract void onCreate(Bundle bundle);

    public abstract void onCreateSelf(Bundle bundle);

    public abstract void onDestroy();

    public abstract void onPause();

    public abstract void onPostResume();

    public abstract void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr);

    public abstract void onResume();

    public abstract void onSaveInstanceState(Bundle bundle);

    public abstract void onStart();

    public abstract void onStop();

    public abstract void onWebCompatActivityCreated();

    public abstract void onWebCompatCreate();

    public abstract void onWebCompatCreated();

    public abstract View onWebCompatViewCreated(View view);

    public AbsActivityDelegate(Activity activity, ActionBar actionBar, IKNBWebCompat iKNBWebCompat) {
        Object[] objArr = {activity, actionBar, iKNBWebCompat};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffa28318d022135b4a150fbe38575c8e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffa28318d022135b4a150fbe38575c8e");
            return;
        }
        this.mKnbWebCompat = null;
        this.impl = activity;
        this.supportActionBar = actionBar;
        this.iknbWebCompat = iKNBWebCompat;
    }
}
