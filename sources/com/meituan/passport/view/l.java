package com.meituan.passport.view;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements View.OnLongClickListener {
    public static ChangeQuickRedirect a;
    private static final l b = new l();

    public static View.OnLongClickListener a() {
        return b;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5aeea2556afe05acdfb468cbdd5f131b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5aeea2556afe05acdfb468cbdd5f131b")).booleanValue() : VerificationFrameView.a(view);
    }
}
