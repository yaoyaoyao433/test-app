package com.meituan.android.ptcommonim.video.record.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public static ChangeQuickRedirect a;
    private final RecordProgressView b;

    private a(RecordProgressView recordProgressView) {
        this.b = recordProgressView;
    }

    public static Runnable a(RecordProgressView recordProgressView) {
        Object[] objArr = {recordProgressView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c11c932b54cfe95400185cbd52a2b481", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c11c932b54cfe95400185cbd52a2b481") : new a(recordProgressView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a21b3e318756ba4dcd15dffdcee642da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a21b3e318756ba4dcd15dffdcee642da");
        } else {
            RecordProgressView.a(this.b);
        }
    }
}
