package com.meituan.mmp.lib;

import android.media.MediaCodecList;
import android.os.Build;
import com.meituan.mmp.lib.utils.as;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ac implements Runnable {
    public static ChangeQuickRedirect a;

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cba8a3037a48b4879e8da4e68464d8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cba8a3037a48b4879e8da4e68464d8b");
            return;
        }
        as.a();
        if (Build.VERSION.SDK_INT >= 21) {
            new MediaCodecList(0);
        }
        com.meituan.mmp.main.j.a();
    }
}
