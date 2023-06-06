package com.sankuai.meituan.takeoutnew.app.config;

import android.content.Context;
import com.dianping.nvnetwork.g;
import com.dianping.sharkpush.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(boolean z, boolean z2) {
        boolean z3;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a50337091ea6eb7f10376caa833d549", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a50337091ea6eb7f10376caa833d549");
            return;
        }
        Context context = com.meituan.android.singleton.b.a;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "07069e519ae1b6244cdac6afafd0231a", RobustBitConfig.DEFAULT_VALUE)) {
            z3 = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "07069e519ae1b6244cdac6afafd0231a")).booleanValue();
        } else {
            z3 = com.sankuai.waimai.kit.a.a().b() && d.b(context, "disable_shark", false);
        }
        boolean z4 = z && !z3;
        com.sankuai.waimai.foundation.utils.log.a.e("sharkSwitch", String.valueOf(z), new Object[0]);
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "shark_switch", z4);
        if (z4 && z2) {
            if (!g.u()) {
                com.sankuai.waimai.platform.net.init.a.a();
            }
            final com.sankuai.waimai.business.page.homepage.sharkpush.a a2 = com.sankuai.waimai.business.page.homepage.sharkpush.a.a();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.homepage.sharkpush.a.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "efafa62835a3974a26b133ef5eab2d3a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "efafa62835a3974a26b133ef5eab2d3a");
                return;
            }
            com.sankuai.waimai.foundation.utils.log.a.b(com.sankuai.waimai.business.page.homepage.sharkpush.a.c, "sharkpush init", new Object[0]);
            if (a2.d) {
                return;
            }
            a2.d = true;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.page.homepage.sharkpush.a.a;
            if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "e88a951898e40158c0a1791d457cdc44", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "e88a951898e40158c0a1791d457cdc44");
            } else {
                com.dianping.sharkpush.b.a(com.sankuai.waimai.business.page.homepage.sharkpush.a.b, new d.a() { // from class: com.sankuai.waimai.business.page.homepage.sharkpush.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.sharkpush.d.a, dianping.com.nvlinker.stub.ISharkPushReceiver
                    public final void onReceive(String str, byte[] bArr) {
                        Object[] objArr5 = {str, bArr};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "c1f14fb34d364469a1fee89bfa1398bd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "c1f14fb34d364469a1fee89bfa1398bd");
                            return;
                        }
                        String str2 = a.c;
                        com.sankuai.waimai.foundation.utils.log.a.b(str2, "shark push receive message from command:" + str, new Object[0]);
                        a.a(a2, str, bArr);
                    }

                    @Override // dianping.com.nvlinker.stub.ISharkPushReceiver
                    public final void onError(String str, int i, String str2) {
                        Object[] objArr5 = {str, Integer.valueOf(i), str2};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "2f92f066d06754307a9d361eb45ae725", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "2f92f066d06754307a9d361eb45ae725");
                            return;
                        }
                        String str3 = a.c;
                        com.sankuai.waimai.foundation.utils.log.a.e(str3, "shark push command:" + str + " throws error code:" + i + "  errorMsg:" + str2, new Object[0]);
                    }
                });
                if (!com.sankuai.waimai.foundation.core.a.d()) {
                    com.sankuai.waimai.touchmatrix.a.a().a("waimai");
                }
            }
            a2.a(true);
        }
    }
}
