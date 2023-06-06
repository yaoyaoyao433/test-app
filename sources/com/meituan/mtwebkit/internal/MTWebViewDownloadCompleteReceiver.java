package com.meituan.mtwebkit.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.meituan.mtwebkit.MTWebViewFactory;
import com.meituan.mtwebkit.internal.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class MTWebViewDownloadCompleteReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d72e9e70dfbd3f374ae765e2f2312149", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d72e9e70dfbd3f374ae765e2f2312149");
            return;
        }
        k.a.a.a(new Runnable() { // from class: com.meituan.mtwebkit.internal.MTWebViewDownloadCompleteReceiver.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc8aa91f63b844a5e2f76d773de8e34f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc8aa91f63b844a5e2f76d773de8e34f");
                } else if (l.h()) {
                    e.c("MTWebViewDownloadCompleteReceiver", "广播接收到本地包下载成功且符合预加载条件, 进行预加载");
                    MTWebViewFactory.preload(2);
                }
            }
        });
        a.a().unregisterReceiver(this);
    }
}
