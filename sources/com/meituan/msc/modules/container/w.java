package com.meituan.msc.modules.container;

import android.media.MediaCodecList;
import android.os.Build;
import com.meituan.msc.common.utils.ap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class w implements Runnable {
    public static ChangeQuickRedirect a;

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c0da11ee2b8b5d9eb0be7c02c64c491", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c0da11ee2b8b5d9eb0be7c02c64c491");
            return;
        }
        ap.a();
        if (Build.VERSION.SDK_INT >= 21) {
            new MediaCodecList(0);
        }
        com.meituan.msc.extern.e.a();
    }
}
