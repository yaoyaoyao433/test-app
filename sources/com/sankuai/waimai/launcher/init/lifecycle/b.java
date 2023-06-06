package com.sankuai.waimai.launcher.init.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import com.meituan.android.common.mtboost.Dex2oatBooster;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.util.PageSP;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.foundation.core.lifecycle.Lifecycle;
import com.sankuai.waimai.platform.capacity.log.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends Lifecycle implements com.sankuai.waimai.foundation.core.lifecycle.a {
    public static ChangeQuickRedirect a;
    private static a b;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "DexOpt";
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.launcher.init.lifecycle.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0988b extends AbsInit {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.foundation.core.init.a
        public final String tag() {
            return "DexOpt";
        }

        @Override // com.sankuai.waimai.foundation.core.init.AbsInit
        public final void idleAsyncInit(Application application) {
            Object[] objArr = {application};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf5e8f251b812eb27acbac83d43ed80c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf5e8f251b812eb27acbac83d43ed80c");
            } else {
                a unused = b.b = new a(application, new Handler(Looper.getMainLooper()), com.sankuai.waimai.launcher.init.d.b);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends Dex2oatBooster {
        public static ChangeQuickRedirect a;

        public a(@NonNull Context context, @Nullable Handler handler, boolean z) {
            super(context, handler, z);
            Object[] objArr = {context, handler, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "816d0eb1c1d5df06de2577d99517f24b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "816d0eb1c1d5df06de2577d99517f24b");
            }
        }

        @Override // com.meituan.android.common.mtboost.Dex2oatBooster
        public final void onFinish(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d292883eb1d24f4a3ab6eadb0e9ac6d6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d292883eb1d24f4a3ab6eadb0e9ac6d6");
                return;
            }
            super.onFinish(i, str);
            a unused = b.b = null;
            if (i != 3 && i != 0) {
                a.AbstractC1040a a2 = new com.sankuai.waimai.platform.capacity.log.h().a("DexOpt");
                com.sankuai.waimai.platform.capacity.log.i.d(a2.b("code-" + i).c(str).b());
                PageSP.b(false);
            } else {
                PageSP.b(true);
            }
            if (com.sankuai.meituan.takeoutnew.a.j || com.sankuai.meituan.takeoutnew.a.f) {
                Log.e("DexOpt", "code = " + i + ", msg = " + str + ", baseArt.size=" + baseArtLength(com.meituan.android.singleton.b.a));
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public final void onAppToForeground(@Nullable Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "568bb737d0726ea39aa7081c3af289b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "568bb737d0726ea39aa7081c3af289b9");
            return;
        }
        a aVar = b;
        if (aVar != null) {
            aVar.onForeground();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public final void onAppToBackground(@Nullable Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ab01b51e21a78941094c1a495c6669e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ab01b51e21a78941094c1a495c6669e");
            return;
        }
        a aVar = b;
        if (aVar != null) {
            aVar.onBackground();
        }
    }
}
