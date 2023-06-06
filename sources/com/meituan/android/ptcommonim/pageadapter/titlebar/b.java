package com.meituan.android.ptcommonim.pageadapter.titlebar;

import android.app.Activity;
import android.view.View;
import com.meituan.android.ptcommonim.pageadapter.titlebar.bean.TitleBarBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final TitleBarBean.TitleIcon b;
    private final Activity c;

    private b(TitleBarBean.TitleIcon titleIcon, Activity activity) {
        this.b = titleIcon;
        this.c = activity;
    }

    public static View.OnClickListener a(TitleBarBean.TitleIcon titleIcon, Activity activity) {
        Object[] objArr = {titleIcon, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aefe46cf6ef955f46c87acb3ec143bc3", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aefe46cf6ef955f46c87acb3ec143bc3") : new b(titleIcon, activity);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76933266f2442366bd99c01cb0946381", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76933266f2442366bd99c01cb0946381");
        } else {
            PTTitleBarAdapter.a(this.b, this.c, view);
        }
    }
}
