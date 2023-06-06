package com.sankuai.waimai.platform.net.interceptor.nvnetwork;

import android.os.Message;
import android.text.TextUtils;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import rx.functions.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements r {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.nvnetwork.r
    public final rx.d<q> intercept(r.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36f97ab432b331f58c5f8f2b9eee6b4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36f97ab432b331f58c5f8f2b9eee6b4b");
        }
        Request a2 = aVar.a();
        final String str = a2.d;
        return aVar.a(a2).d(new g<q, q>() { // from class: com.sankuai.waimai.platform.net.interceptor.nvnetwork.e.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.g
            public final /* synthetic */ q call(q qVar) {
                q qVar2 = qVar;
                Object[] objArr2 = {qVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e67131634b76769b5786bec107413486", RobustBitConfig.DEFAULT_VALUE)) {
                    return (q) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e67131634b76769b5786bec107413486");
                }
                com.sankuai.waimai.platform.net.weaknetwork.d b = com.sankuai.waimai.platform.net.weaknetwork.d.b();
                String str2 = str;
                long j = qVar2.i;
                int statusCode = qVar2.statusCode();
                Object[] objArr3 = {str2, new Long(j), Integer.valueOf(statusCode)};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.net.weaknetwork.d.a;
                if (PatchProxy.isSupport(objArr3, b, changeQuickRedirect3, false, "14aef535711248957975bbb0ff1ef76e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, b, changeQuickRedirect3, false, "14aef535711248957975bbb0ff1ef76e");
                } else if (b.e && b.c.b && !TextUtils.isEmpty(str2) && (!com.sankuai.waimai.kit.a.a().b() ? str2.startsWith(com.sankuai.waimai.platform.net.util.f.c) : !(!str2.startsWith(com.sankuai.waimai.platform.net.util.f.c) && !str2.startsWith("http://api.c.waimai.test.sankuai.com")))) {
                    if (statusCode == 200) {
                        Message obtainMessage = b.f.obtainMessage(0);
                        obtainMessage.obj = str2;
                        obtainMessage.arg1 = (int) j;
                        b.f.sendMessage(obtainMessage);
                    } else {
                        Message obtainMessage2 = b.f.obtainMessage(1);
                        obtainMessage2.obj = str2;
                        b.f.sendMessage(obtainMessage2);
                    }
                }
                return qVar2;
            }
        });
    }
}
