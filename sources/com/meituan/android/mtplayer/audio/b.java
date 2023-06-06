package com.meituan.android.mtplayer.audio;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Observable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends Observable {
    public static ChangeQuickRedirect a;
    private static b b;

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30207ef79f51fd6e491a3981096c9fdc", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30207ef79f51fd6e491a3981096c9fdc");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    public final void a(com.meituan.android.mtplayer.audio.audioplayercallback.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "025c3d9804280d750c0e382b8ff5ee01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "025c3d9804280d750c0e382b8ff5ee01");
            return;
        }
        setChanged();
        notifyObservers(aVar);
    }
}
