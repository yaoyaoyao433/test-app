package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.platform.capacity.network.cdn.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "CDNManager";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(final Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c40f47b0ffd59f9ab68e14de44582b7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c40f47b0ffd59f9ab68e14de44582b7f");
            return;
        }
        final com.sankuai.waimai.platform.capacity.network.cdn.b a2 = com.sankuai.waimai.platform.capacity.network.cdn.b.a();
        Object[] objArr2 = {application};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.capacity.network.cdn.b.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "651d68e1879d1ccff3eff1644e12e336", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "651d68e1879d1ccff3eff1644e12e336");
            return;
        }
        com.sankuai.waimai.platform.capacity.network.cdn.f fVar = new com.sankuai.waimai.platform.capacity.network.cdn.f() { // from class: com.sankuai.waimai.platform.capacity.network.cdn.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.capacity.network.cdn.f
            public final void a(String str, int i, long j) {
                Object[] objArr3 = {str, Integer.valueOf(i), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0f403ec5e7205400c51f0e51b9a149df", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0f403ec5e7205400c51f0e51b9a149df");
                } else {
                    com.sankuai.waimai.platform.capacity.log.c.a().a(i, (int) j, str);
                }
            }
        };
        Object[] objArr3 = {application, "cdn_host_config", fVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.capacity.network.cdn.b.a;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "0c8e4ebbfc2993df1e0a7a97ba1e7913", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "0c8e4ebbfc2993df1e0a7a97ba1e7913");
            return;
        }
        a2.b.c = fVar;
        final HornCallback hornCallback = new HornCallback() { // from class: com.sankuai.waimai.platform.capacity.network.cdn.b.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5b81ce0501e4cd67a0ee5fe6da82af6f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5b81ce0501e4cd67a0ee5fe6da82af6f");
                } else if (!z || TextUtils.isEmpty(str) || str.equals(a2.d)) {
                } else {
                    if (com.sankuai.waimai.foundation.utils.log.a.b) {
                        com.sankuai.waimai.foundation.utils.log.a.e("CDNManager", "result=" + str, new Object[0]);
                    }
                    a2.d = str;
                    try {
                        a2.b.b = (d) new Gson().fromJson(str, (Class<Object>) d.class);
                    } catch (Exception unused) {
                    }
                }
            }
        };
        Horn.accessCache("cdn_host_config", hornCallback);
        a2.a(application, "cdn_host_config", hornCallback);
        final e.a aVar = new e.a() { // from class: com.sankuai.waimai.platform.capacity.network.cdn.b.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.capacity.network.cdn.e.a
            public final void a() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cf409dd8d58d8a933bf7fb33f025b6d9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cf409dd8d58d8a933bf7fb33f025b6d9");
                } else {
                    a2.a(application, r3, hornCallback);
                }
            }
        };
        Object[] objArr4 = {application, aVar};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.platform.capacity.network.cdn.e.a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "6b45127ac0b447e239f00dcf4eaaf4c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "6b45127ac0b447e239f00dcf4eaaf4c5");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(new AsyncTask<Void, Void, Boolean>() { // from class: com.sankuai.waimai.platform.capacity.network.cdn.e.1
                public static ChangeQuickRedirect a;

                @Override // android.os.AsyncTask
                public final /* synthetic */ Boolean doInBackground(Void[] voidArr) {
                    Object[] objArr5 = {voidArr};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "786d5b1782529d210544ff6a4d09a3a8", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "786d5b1782529d210544ff6a4d09a3a8") : Boolean.FALSE;
                }

                @Override // android.os.AsyncTask
                public final /* synthetic */ void onPostExecute(Boolean bool) {
                    Boolean bool2 = bool;
                    Object[] objArr5 = {bool2};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a6483caf06baf382ac0477a29d9b93c1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a6483caf06baf382ac0477a29d9b93c1");
                    } else if (!bool2.booleanValue() || aVar == null) {
                    } else {
                        aVar.a();
                    }
                }
            }, com.sankuai.waimai.platform.utils.o.a(), new Void[0]);
        }
    }
}
