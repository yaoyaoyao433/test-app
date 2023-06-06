package com.meituan.passport.bindphone;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final BindPhoneActivity b;

    private a(BindPhoneActivity bindPhoneActivity) {
        this.b = bindPhoneActivity;
    }

    public static View.OnClickListener a(BindPhoneActivity bindPhoneActivity) {
        Object[] objArr = {bindPhoneActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "852d31616da9f3084f9553739e669da7", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "852d31616da9f3084f9553739e669da7") : new a(bindPhoneActivity);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38628fbac377049845fbf63023c85058", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38628fbac377049845fbf63023c85058");
        } else {
            BindPhoneActivity.d(this.b, view);
        }
    }
}
