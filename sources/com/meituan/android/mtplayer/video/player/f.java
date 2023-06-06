package com.meituan.android.mtplayer.video.player;

import android.content.Context;
import com.meituan.android.mtplayer.video.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f {
    public static ChangeQuickRedirect a = null;
    private static volatile boolean b = false;
    private static volatile boolean c = false;

    public static d a(Context context, l lVar) {
        d bVar;
        Object[] objArr = {context, lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d9704b426c6ee6320d58d72526c31ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d9704b426c6ee6320d58d72526c31ca");
        }
        synchronized (f.class) {
            if (lVar == l.TYPE_XPLAYER) {
                try {
                    bVar = (d) Class.forName("com.sankuai.meituan.mtplayer.xplayer.MtXPlayer").getConstructor(Context.class).newInstance(context);
                    bVar.setOption(4, "soundtouch", 1L);
                    bVar.setOption(4, "framedrop", 30L);
                    com.meituan.android.mtplayer.video.utils.c.a("using xplayer player");
                } catch (Exception unused) {
                    bVar = new b();
                    com.meituan.android.mtplayer.video.utils.c.a("using media player");
                }
            } else {
                bVar = new b();
                com.meituan.android.mtplayer.video.utils.c.a("using media player");
            }
        }
        return bVar;
    }
}
