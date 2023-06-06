package com.sankuai.waimai.platform.net.shark;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.d;
import com.dianping.nvnetwork.g;
import com.dianping.nvnetwork.i;
import com.dianping.nvnetwork.q;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    private static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39a4b5b49b90c59dd1e9172b4b659e30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39a4b5b49b90c59dd1e9172b4b659e30");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        String b = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4e9c27a111302e37b8a53722a9e40d4b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4e9c27a111302e37b8a53722a9e40d4b") : com.sankuai.waimai.platform.capacity.persistent.sp.a.b(b.a, "shark_mock_url", "");
        if (TextUtils.isEmpty(b)) {
            return;
        }
        d.a().a(true);
        final d a2 = d.a();
        final d.a aVar = new d.a() { // from class: com.sankuai.waimai.platform.net.shark.a.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.nvnetwork.d.a
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "12394be220b9e0a0e5721c8185c37527", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "12394be220b9e0a0e5721c8185c37527");
                } else {
                    com.sankuai.waimai.foundation.utils.log.a.b("sharkmock", "success", new Object[0]);
                }
            }

            @Override // com.dianping.nvnetwork.d.a
            public final void a(String str) {
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d303c55285a03ffce392ef929ae882ea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d303c55285a03ffce392ef929ae882ea");
                } else {
                    com.sankuai.waimai.foundation.utils.log.a.b("sharkmock", "failed", new Object[0]);
                }
            }
        };
        Object[] objArr3 = {b, aVar};
        ChangeQuickRedirect changeQuickRedirect3 = d.a;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "d333ad3d67ddf8dcb79d67a80d1432ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "d333ad3d67ddf8dcb79d67a80d1432ea");
            return;
        }
        Uri parse = Uri.parse(b);
        i.a().a(parse.getScheme() + "://" + parse.getEncodedAuthority());
        com.dianping.nvnetwork.fork.b.a(g.b()).a(new Request.Builder().url(b).addHeaders("MKUnionId", g.j()).get(), 3).a(rx.android.schedulers.a.a()).b(rx.schedulers.a.e()).a(new rx.functions.b<q>() { // from class: com.dianping.nvnetwork.d.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(q qVar) {
                q qVar2 = qVar;
                Object[] objArr4 = {qVar2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d2f72db247398ffac6f002b4dd0d4140", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d2f72db247398ffac6f002b4dd0d4140");
                    return;
                }
                a2.a(true);
                if (aVar != null) {
                    if (qVar2.isSuccess()) {
                        aVar.a();
                    } else {
                        aVar.a(qVar2.error() != null ? qVar2.error().toString() : "error.");
                    }
                }
            }
        }, new rx.functions.b<Throwable>() { // from class: com.dianping.nvnetwork.d.2
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Throwable th) {
                Throwable th2 = th;
                Object[] objArr4 = {th2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4cef022207990f82b97e219b59d47dbe", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4cef022207990f82b97e219b59d47dbe");
                } else if (aVar != null) {
                    th2.printStackTrace();
                    aVar.a(th2.getMessage());
                }
            }
        });
    }

    public static void a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b059e6d4ee43a4f02e8037151794d2d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b059e6d4ee43a4f02e8037151794d2d4");
            return;
        }
        d.a().a(true);
        b(true);
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(b.a, "shark_switch", true);
        Context context = b.a;
        com.meituan.android.cipstorage.q.a(context, b.a.getPackageName() + "_cipstoragecenter", 2).a("dianping_mock_enable", true);
        com.sankuai.waimai.platform.net.init.a.a();
        a();
    }

    private static void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5271e3203a0c6e406a4e15fe31c38b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5271e3203a0c6e406a4e15fe31c38b3");
        } else {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(b.a, "shark_mock_switch", z);
        }
    }
}
