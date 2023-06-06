package com.meituan.android.mtplayer.video;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i {
    public static ChangeQuickRedirect a;
    final ExecutorService b;

    public i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd9f48925a59a89a54365ab05ee981f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd9f48925a59a89a54365ab05ee981f7");
        } else {
            this.b = com.sankuai.android.jarvis.c.a("MTPlayerControllerHelper-Thread");
        }
    }

    public final void a(Runnable runnable, MTVideoPlayerView mTVideoPlayerView) {
        boolean z = false;
        Object[] objArr = {runnable, mTVideoPlayerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ef6b073387c7ccde65b6593dc6a4170", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ef6b073387c7ccde65b6593dc6a4170");
            return;
        }
        Object[] objArr2 = {mTVideoPlayerView};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59617860e539efcb07f61233b06a0825", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59617860e539efcb07f61233b06a0825")).booleanValue();
        } else if (mTVideoPlayerView != null) {
            String business = mTVideoPlayerView.getBusiness();
            l playerType = mTVideoPlayerView.getPlayerType();
            if (!TextUtils.isEmpty(business) && l.TYPE_XPLAYER != playerType) {
                z = com.meituan.android.mtplayer.video.player.e.a().a(business);
            }
        }
        if (z) {
            com.meituan.android.mtplayer.video.utils.c.a("MTPlayer", "using async task mode");
            this.b.submit(runnable);
            return;
        }
        com.meituan.android.mtplayer.video.utils.c.a("MTPlayer", "using old sync task mode");
        runnable.run();
    }
}
