package com.sankuai.meituan.kernel.net.tunnel;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.raw.a;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements a.b {
    public static ChangeQuickRedirect a;
    private com.sankuai.meituan.retrofit2.callfactory.okhttp3.a b;
    private com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a c;
    private boolean d;

    public static b a(com.sankuai.meituan.retrofit2.callfactory.okhttp3.a aVar, com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a aVar2) {
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a029b0418e46ba6d066e9b9eb2755e6", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a029b0418e46ba6d066e9b9eb2755e6") : new b(aVar, aVar2);
    }

    private b(com.sankuai.meituan.retrofit2.callfactory.okhttp3.a aVar, com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a aVar2) {
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7c400e633c273ce56c2cb7bc1a66f63", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7c400e633c273ce56c2cb7bc1a66f63");
            return;
        }
        this.d = false;
        this.b = aVar;
        this.c = aVar2;
    }

    @Override // com.sankuai.meituan.retrofit2.raw.a.b
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5630c3baa3b0d13905dc65c06fba79ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5630c3baa3b0d13905dc65c06fba79ca");
            return;
        }
        com.dianping.networklog.c.a("[MultiTunnelCallFactory] changeTunnel, useShark=" + z, 3);
        this.d = z;
    }

    @Override // com.sankuai.meituan.retrofit2.raw.a.InterfaceC0637a
    public final com.sankuai.meituan.retrofit2.raw.a get(aj ajVar) {
        String str;
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dc13307dc9c6e50e95aa382caeef5ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dc13307dc9c6e50e95aa382caeef5ea");
        }
        try {
            Uri parse = Uri.parse(ajVar.b());
            str = parse.getAuthority() + parse.getPath();
        } catch (Throwable th) {
            com.dianping.networklog.c.a("[MultiTunnelCallFactory]" + Log.getStackTraceString(th), 3);
        }
        if (a(str)) {
            com.dianping.networklog.c.a("[MultiTunnelCallFactory]" + str + " hit long tunnel", 3);
            return this.c.get(a(ajVar, 1));
        }
        if (b(str)) {
            com.dianping.networklog.c.a("[MultiTunnelCallFactory]" + str + " hit short tunnel", 3);
            return this.b.get(a(ajVar, 2));
        }
        if (this.d) {
            return this.c.get(ajVar);
        }
        return this.b.get(ajVar);
    }

    private aj a(aj ajVar, int i) {
        Object[] objArr = {ajVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8deeefc6abfc4341d8ff3c89ea564b4", RobustBitConfig.DEFAULT_VALUE) ? (aj) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8deeefc6abfc4341d8ff3c89ea564b4") : ajVar.a().b("switch_tunnel", String.valueOf(i)).a();
    }

    private boolean a(String str) {
        List<String> list;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f40c113f74eebc367bc6f5ac8de6dd91", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f40c113f74eebc367bc6f5ac8de6dd91")).booleanValue();
        }
        if (c(str) && (list = c.b.c) != null && !list.isEmpty()) {
            for (String str2 : list) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean b(String str) {
        List<String> list;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f902d8dbce01d17e8ffb9dd7d7b9df5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f902d8dbce01d17e8ffb9dd7d7b9df5")).booleanValue();
        }
        if (c(str) && (list = c.b.b) != null && !list.isEmpty()) {
            for (String str2 : list) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e51f8c095bfaa289bc07991ffb51b683", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e51f8c095bfaa289bc07991ffb51b683")).booleanValue() : (TextUtils.isEmpty(str) || c.b == null || !c.b.a) ? false : true;
    }
}
