package com.sankuai.waimai.launcher.init;

import android.app.Application;
import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.launcher.init.lifecycle.b;
import com.sankuai.waimai.launcher.init.secondary.f;
import com.sankuai.waimai.launcher.init.secondary.g;
import com.sankuai.waimai.launcher.init.secondary.h;
import com.sankuai.waimai.launcher.init.secondary.i;
import com.sankuai.waimai.launcher.init.secondary.j;
import com.sankuai.waimai.launcher.init.secondary.k;
import com.sankuai.waimai.launcher.init.secondary.l;
import com.sankuai.waimai.launcher.init.secondary.m;
import com.sankuai.waimai.launcher.init.secondary.n;
import com.sankuai.waimai.launcher.init.secondary.o;
import com.sankuai.waimai.launcher.init.secondary.p;
import com.sankuai.waimai.launcher.init.secondary.q;
import com.sankuai.waimai.launcher.init.secondary.s;
import com.sankuai.waimai.launcher.init.secondary.t;
import com.sankuai.waimai.launcher.init.secondary.u;
import com.sankuai.waimai.launcher.init.secondary.v;
import com.sankuai.waimai.launcher.init.secondary.x;
import com.sankuai.waimai.launcher.init.secondary.y;
import com.sankuai.waimai.launcher.init.secondary.z;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.sankuai.waimai.launcher.init.core.a {
    public static ChangeQuickRedirect a;

    public e(@NonNull Executor executor) {
        super(executor);
        Object[] objArr = {executor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4fa8b0495ffb03d093d4e231529294e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4fa8b0495ffb03d093d4e231529294e");
        }
    }

    @Override // com.sankuai.waimai.launcher.init.core.a
    public final void b(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c989bf556f9821e1a022780712e1c1d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c989bf556f9821e1a022780712e1c1d9");
        } else if (com.sankuai.waimai.launcher.init.core.b.a(application)) {
            a("BootAPICatMonitor");
            a("WMMMPInit");
            a("OrderInit");
            a("WmImInit");
            a("AIInit");
            a("DeviceOwner");
            a("RestaurantInit");
            a("PageInit");
            a("ScreenShotInit");
            a("dyres");
            a("BubbleInit");
            a("OrderAssistInit");
            a("StoreInit");
            a("LoadAddressInit");
            a("KNBInit");
            a("NetMonitorInit");
            a("UGCInit");
            a("PersonalRecommendInit");
            a("AccessibleInit");
            a("SearchInit");
            a("DrugInit");
        }
    }

    @Override // com.sankuai.waimai.launcher.init.core.a
    public final void a(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3efd9412e1b0c335e5d65565ed6429a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3efd9412e1b0c335e5d65565ed6429a2");
            return;
        }
        a(new g());
        if (com.sankuai.meituan.takeoutnew.a.f) {
            a(new u());
        }
        a(new com.sankuai.waimai.launcher.init.secondary.e());
        a(new s());
        a(new x());
        a(new m());
        a(new com.sankuai.waimai.business.knb.init.a());
        a(new t());
        a(new n());
        a(new k());
        a(new y());
        a(new p());
        a(new com.sankuai.waimai.business.knb.init.b());
        a(new v());
        a(new com.sankuai.waimai.launcher.init.secondary.business.im.a());
        Object[] objArr2 = {application};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd0a4fe5ae8809d9b58243e348c7dd90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd0a4fe5ae8809d9b58243e348c7dd90");
        } else if (com.sankuai.waimai.launcher.init.core.b.a(application)) {
            for (String str : this.c) {
                if (!TextUtils.isEmpty(str)) {
                    a((AbsInit) com.sankuai.waimai.router.a.a(AbsInit.class, str));
                }
            }
        }
        a(new com.sankuai.waimai.launcher.init.secondary.b());
        a(new com.sankuai.waimai.launcher.init.secondary.c());
        a(new com.sankuai.waimai.launcher.init.mainly.e());
        a(new q());
        a(new l());
        a(new o());
        a(new f());
        a(new i());
        a(new com.sankuai.waimai.launcher.init.secondary.d());
        a(new com.sankuai.waimai.launcher.init.secondary.a());
        a(new z());
        a(new j());
        a(new h());
        if (Build.VERSION.SDK_INT >= 24) {
            a(new b.C0988b());
        }
    }
}
