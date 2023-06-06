package com.sankuai.waimai.platform.net.init;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.dianping.nvnetwork.g;
import com.dianping.sdk.pike.h;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.android.common.unionid.oneid.cache.IOneIdCallback;
import com.meituan.android.singleton.b;
import com.meituan.android.singleton.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.platform.utils.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends AbsInit {
    public static ChangeQuickRedirect a;
    private static String b;
    private static e<String> c = new e<String>() { // from class: com.sankuai.waimai.platform.net.init.a.1
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.singleton.e
        public final /* synthetic */ String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "947595792a93067b22651bea8d56235a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "947595792a93067b22651bea8d56235a") : OneIdHandler.getInstance(b.a).getLocalOneId();
        }
    };

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "NVGlobal";
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b383c6d43316f622aabedb071ba3298", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b383c6d43316f622aabedb071ba3298");
        } else if (g.u()) {
        } else {
            com.dianping.monitor.impl.a.setUnionId(com.sankuai.waimai.platform.b.A().c());
            g.a(b.a, com.sankuai.waimai.config.a.a().d(), 0, com.sankuai.waimai.platform.b.A().d(), new C1069a());
            g.b(false);
            OneIdHandler.getInstance(b.a).getOneId(new IOneIdCallback() { // from class: com.sankuai.waimai.platform.net.init.a.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.common.unionid.oneid.cache.IOneIdCallback
                public final void call(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76afa6f7e261fae0e62dfe8c9e7c8c52", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76afa6f7e261fae0e62dfe8c9e7c8c52");
                    } else if (TextUtils.isEmpty(str)) {
                    } else {
                        String unused = a.b = str;
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        boolean z = true;
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64fe0ace6e3f538c07f9bb2cd5293974", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64fe0ace6e3f538c07f9bb2cd5293974");
            return;
        }
        Object[] objArr2 = {application};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "59f59f4bb8ea0c56f49ceb4a9cbd6eb9", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "59f59f4bb8ea0c56f49ceb4a9cbd6eb9")).booleanValue();
        } else if (!com.sankuai.waimai.foundation.core.a.b() || !com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) application, "shark_debug", true)) {
            z = false;
        }
        h.b(z);
        a();
        g.a(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.net.init.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1069a implements g.b {
        public static ChangeQuickRedirect a;

        public C1069a() {
        }

        @Override // com.dianping.nvnetwork.g.b
        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "199ee6ea239c1037b73636ddadc9a987", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "199ee6ea239c1037b73636ddadc9a987");
            }
            if (a.b == null) {
                String unused = a.b = (String) a.c.b();
            }
            return a.b;
        }
    }
}
