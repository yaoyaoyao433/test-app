package com.meituan.android.ptcommonim;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.ptcommonim.cardrender.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.ui.service.b;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static volatile a b;
    private volatile boolean c;

    public static /* synthetic */ void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a0a13279e92262eee2800649b90fc2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a0a13279e92262eee2800649b90fc2f");
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ff4ebad1b96f641cb75c503f5e8cb4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ff4ebad1b96f641cb75c503f5e8cb4f");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc76f97c81c9280c14f86b1bcfca3e9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc76f97c81c9280c14f86b1bcfca3e9e");
        } else {
            this.c = false;
        }
    }

    public final void a(@Nonnull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbbfba4a117ff055fd16c65522bb0751", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbbfba4a117ff055fd16c65522bb0751");
        } else if (this.c) {
        } else {
            com.meituan.android.ptcommonim.protocol.env.a.a = context.getApplicationContext();
            String packageName = context.getPackageName();
            if ("com.sankuai.meituan".equals(packageName)) {
                com.meituan.android.ptcommonim.protocol.env.a.b = "7";
            } else if ("com.sankuai.meituan.mtmall".equals(packageName)) {
                com.meituan.android.ptcommonim.protocol.env.a.b = "52";
            } else if ("com.sankuai.meituan.takeoutnew".equals(packageName)) {
                com.meituan.android.ptcommonim.protocol.env.a.b = "3";
            }
            try {
                com.sankuai.xm.ui.service.b bVar = (com.sankuai.xm.ui.service.b) com.sankuai.xm.ui.a.a().a(com.sankuai.xm.ui.service.b.class);
                if (bVar != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("107");
                    bVar.a(b.C1420b.a(arrayList, 86400000L));
                }
            } catch (Throwable unused) {
            }
            com.meituan.android.ptcommonim.protocol.a a2 = com.meituan.android.ptcommonim.protocol.a.a();
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.ptcommonim.protocol.a.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "eab40ca04838a92b38a8320bd3d314f0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "eab40ca04838a92b38a8320bd3d314f0");
            } else {
                com.meituan.android.ptcommonim.protocol.rollback.a a3 = com.meituan.android.ptcommonim.protocol.rollback.a.a();
                Object[] objArr3 = {context};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.ptcommonim.protocol.rollback.a.a;
                if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "aa2722e9f0cead2dd3d69feecd6cd52f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "aa2722e9f0cead2dd3d69feecd6cd52f");
                } else {
                    com.meituan.android.ptcommonim.protocol.rollback.a.b = context.getApplicationContext();
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.ptcommonim.protocol.rollback.a.a;
                    if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "031f99e03f390e7cf055ee2057481c38", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "031f99e03f390e7cf055ee2057481c38");
                    } else {
                        String packageName2 = com.meituan.android.ptcommonim.protocol.rollback.a.b.getPackageName();
                        String str = null;
                        if ("com.sankuai.meituan".equals(packageName2)) {
                            str = "ptim_switch_group";
                        } else if ("com.sankuai.meituan.mtmall".equals(packageName2)) {
                            str = "ptim_switch_mtmall-C";
                        }
                        if (!TextUtils.isEmpty(str)) {
                            Horn.register(str, com.meituan.android.ptcommonim.protocol.rollback.b.a(a3));
                        }
                    }
                }
            }
            com.meituan.android.ptcommonim.cardrender.c a4 = com.meituan.android.ptcommonim.cardrender.c.a();
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.ptcommonim.cardrender.c.a;
            if (PatchProxy.isSupport(objArr5, a4, changeQuickRedirect5, false, "cc9f1891203d09af5c075e059ed55ddd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, a4, changeQuickRedirect5, false, "cc9f1891203d09af5c075e059ed55ddd");
            } else {
                ExecutorService executorService = a4.c;
                com.meituan.android.ptcommonim.cardrender.b bVar2 = a4.b;
                bVar2.getClass();
                executorService.execute(e.a(bVar2));
            }
            try {
                rx.d.a(new Object()).b(rx.schedulers.a.e()).a(b.a(), c.a());
            } catch (Throwable unused2) {
            }
            this.c = true;
        }
    }

    public static /* synthetic */ void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "337e602ca654ae944876ff8232f00a74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "337e602ca654ae944876ff8232f00a74");
            return;
        }
        try {
            com.sankuai.waimai.mach.manager.load.c.a("platform", "platform-imchat-page");
        } catch (Throwable unused) {
        }
    }
}
