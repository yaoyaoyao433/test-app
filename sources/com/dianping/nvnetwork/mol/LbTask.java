package com.dianping.nvnetwork.mol;

import android.support.annotation.Keep;
import com.dianping.nvnetwork.g;
import com.dianping.nvnetwork.l;
import com.dianping.nvnetwork.tunnel2.i;
import com.dianping.nvnetwork.util.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.InetSocketAddress;
import java.util.List;
import rx.d;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes.dex */
public class LbTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void uploadLb(final int i, List<i.b> list) {
        Object[] objArr = {Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a612e82ad6590c3929911a81b37ef9e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a612e82ad6590c3929911a81b37ef9e2");
        } else if (list == null || list.isEmpty()) {
        } else {
            d.a(new l<i.b>() { // from class: com.dianping.nvnetwork.mol.LbTask.1
                public static ChangeQuickRedirect b;

                @Override // com.dianping.nvnetwork.l, rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    i.b bVar = (i.b) obj;
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect3 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e33eff10abee87f83b38bdb00b0c2a8b", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e33eff10abee87f83b38bdb00b0c2a8b");
                        return;
                    }
                    g.d().pv4(0L, "shark_ip_speed", i, 0, bVar.c == Integer.MAX_VALUE ? -200 : 200, 0, 0, bVar.c, ((InetSocketAddress) bVar.b).getHostName(), "", g.p() ? 100 : 1);
                    g.d().pv4(0L, "shark_ip_connect", i, 0, bVar.c == Integer.MAX_VALUE ? -200 : 200, 0, 0, bVar.d, ((InetSocketAddress) bVar.b).getHostName(), "", g.p() ? 100 : 1);
                }
            }, d.a((Iterable) list).b(h.a));
        }
    }
}
