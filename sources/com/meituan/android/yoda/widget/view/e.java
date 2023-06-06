package com.meituan.android.yoda.widget.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public static ChangeQuickRedirect a;
    private final VoiceRippleView b;
    private final double c;

    private e(VoiceRippleView voiceRippleView, double d) {
        this.b = voiceRippleView;
        this.c = d;
    }

    public static Runnable a(VoiceRippleView voiceRippleView, double d) {
        Object[] objArr = {voiceRippleView, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "324d01845db05dbdef9001331e13193f", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "324d01845db05dbdef9001331e13193f") : new e(voiceRippleView, d);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6926278bbc254c762222f838903b265", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6926278bbc254c762222f838903b265");
        } else {
            VoiceRippleView.a(this.b, this.c);
        }
    }
}
