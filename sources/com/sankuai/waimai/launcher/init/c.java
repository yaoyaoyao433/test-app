package com.sankuai.waimai.launcher.init;

import android.app.Application;
import android.os.Build;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.launcher.init.mainly.aa;
import com.sankuai.waimai.launcher.init.mainly.ab;
import com.sankuai.waimai.launcher.init.mainly.ac;
import com.sankuai.waimai.launcher.init.mainly.ad;
import com.sankuai.waimai.launcher.init.mainly.ae;
import com.sankuai.waimai.launcher.init.mainly.af;
import com.sankuai.waimai.launcher.init.mainly.ag;
import com.sankuai.waimai.launcher.init.mainly.ah;
import com.sankuai.waimai.launcher.init.mainly.ai;
import com.sankuai.waimai.launcher.init.mainly.aj;
import com.sankuai.waimai.launcher.init.mainly.f;
import com.sankuai.waimai.launcher.init.mainly.g;
import com.sankuai.waimai.launcher.init.mainly.h;
import com.sankuai.waimai.launcher.init.mainly.i;
import com.sankuai.waimai.launcher.init.mainly.j;
import com.sankuai.waimai.launcher.init.mainly.k;
import com.sankuai.waimai.launcher.init.mainly.l;
import com.sankuai.waimai.launcher.init.mainly.m;
import com.sankuai.waimai.launcher.init.mainly.n;
import com.sankuai.waimai.launcher.init.mainly.o;
import com.sankuai.waimai.launcher.init.mainly.p;
import com.sankuai.waimai.launcher.init.mainly.q;
import com.sankuai.waimai.launcher.init.mainly.r;
import com.sankuai.waimai.launcher.init.mainly.s;
import com.sankuai.waimai.launcher.init.mainly.t;
import com.sankuai.waimai.launcher.init.mainly.u;
import com.sankuai.waimai.launcher.init.mainly.v;
import com.sankuai.waimai.launcher.init.mainly.x;
import com.sankuai.waimai.launcher.init.mainly.y;
import com.sankuai.waimai.launcher.init.mainly.z;
import com.sankuai.waimai.launcher.init.secondary.w;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.launcher.init.core.a {
    public static ChangeQuickRedirect a;

    public c(@NonNull Executor executor) {
        super(executor);
        Object[] objArr = {executor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77f964b0e6872d7c3cfd9002373ffa37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77f964b0e6872d7c3cfd9002373ffa37");
        }
    }

    @Override // com.sankuai.waimai.launcher.init.core.a
    public final void a(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd6e068fd303b6a90c0519d5721e5550", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd6e068fd303b6a90c0519d5721e5550");
            return;
        }
        if (Build.VERSION.SDK_INT <= 23) {
            a(new j());
        }
        a(new y());
        a(new g());
        a(new q());
        a(new m());
        if (Build.VERSION.SDK_INT >= 28) {
            a(new ai());
        }
        a(new x());
        a(new com.sankuai.waimai.launcher.init.mainly.c());
        a(new af());
        a(new k());
        a(new w());
        a(new o());
        a(new s());
        a(new i());
        a(new com.sankuai.waimai.platform.net.init.a());
        a(new com.sankuai.waimai.launcher.init.mainly.d());
        a(new n());
        a(new ad());
        a(new z());
        a(new aa());
        a(new ae());
        a(new f());
        a(new com.sankuai.waimai.launcher.init.mainly.a());
        a(new v());
        a(new l());
        a(new com.sankuai.waimai.launcher.init.mainly.b());
        a(new t());
        a(new aj());
        a(new ag());
        a(new h());
        a(new r());
        a(new ac());
        a(new u());
        a(new ab());
        a(new p());
        a(new com.sankuai.waimai.launcher.init.mainly.w());
        a(new ah());
    }
}
