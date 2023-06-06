package com.meituan.android.yoda.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final VoicePrintVerifyFragment b;

    private i(VoicePrintVerifyFragment voicePrintVerifyFragment) {
        this.b = voicePrintVerifyFragment;
    }

    public static View.OnClickListener a(VoicePrintVerifyFragment voicePrintVerifyFragment) {
        Object[] objArr = {voicePrintVerifyFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8abf10a16dceca8fea5a08e799aee2b", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8abf10a16dceca8fea5a08e799aee2b") : new i(voicePrintVerifyFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60f8d79f68256cc65dcaaf6f7ca8bed9", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60f8d79f68256cc65dcaaf6f7ca8bed9");
        } else {
            VoicePrintVerifyFragment.a(this.b, view);
        }
    }
}
