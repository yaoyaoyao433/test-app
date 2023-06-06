package com.meituan.android.yoda.fragment.voiceprint;

import com.meituan.android.yoda.retrofit.Error;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public static ChangeQuickRedirect a;
    private final VoicePrintSubFragment2 b;
    private final Error c;

    private a(VoicePrintSubFragment2 voicePrintSubFragment2, Error error) {
        this.b = voicePrintSubFragment2;
        this.c = error;
    }

    public static Runnable a(VoicePrintSubFragment2 voicePrintSubFragment2, Error error) {
        Object[] objArr = {voicePrintSubFragment2, error};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8abd54be11cede4915f0ed63baf80e90", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8abd54be11cede4915f0ed63baf80e90") : new a(voicePrintSubFragment2, error);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "183973d3f2bf3f33bd0194f49c4a7ebd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "183973d3f2bf3f33bd0194f49c4a7ebd");
        } else {
            VoicePrintSubFragment2.a(this.b, this.c);
        }
    }
}
