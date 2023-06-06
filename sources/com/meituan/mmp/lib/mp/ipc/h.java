package com.meituan.mmp.lib.mp.ipc;

import android.content.Context;
import com.meituan.mmp.main.ab;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect a;
    private static volatile boolean b;

    public static synchronized void a(final Context context) {
        synchronized (h.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d0ce8c0dad378f41e03c47d2bd7c149", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d0ce8c0dad378f41e03c47d2bd7c149");
            } else if (b) {
            } else {
                b = true;
                com.meituan.mmp.lib.mp.a.a(context);
                if (com.meituan.mmp.lib.mp.a.e() == null) {
                    System.out.println("HeraTrace-run in unexpected process, stop init");
                    return;
                }
                ab.a("IPCManager.init");
                com.android.meituan.multiprocess.e.a(false);
                com.android.meituan.multiprocess.e.a(context, new com.android.meituan.multiprocess.init.a() { // from class: com.meituan.mmp.lib.mp.ipc.h.1
                    public static ChangeQuickRedirect a;

                    @Override // com.android.meituan.multiprocess.init.a
                    public final void addServiceManager(com.android.meituan.multiprocess.c cVar) {
                    }

                    @Override // com.android.meituan.multiprocess.init.a
                    public final void addService(com.android.meituan.multiprocess.c cVar) {
                        Object[] objArr2 = {cVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41ec0bdb6f5e9f8484b56fbe5a9181c3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41ec0bdb6f5e9f8484b56fbe5a9181c3");
                            return;
                        }
                        String packageName = context.getPackageName();
                        cVar.a("mmp_" + packageName, String.format("content://%s.miniApp", packageName));
                        cVar.a("mmp_" + packageName + ":miniApp0", String.format("content://%s.miniApp0", packageName));
                        cVar.a("mmp_" + packageName + ":miniApp1", String.format("content://%s.miniApp1", packageName));
                        cVar.a("mmp_" + packageName + ":miniApp2", String.format("content://%s.miniApp2", packageName));
                        cVar.a("mmp_" + packageName + ":miniApp3", String.format("content://%s.miniApp3", packageName));
                    }

                    @Override // com.android.meituan.multiprocess.init.a
                    public final void onAddTypeTransfer(com.android.meituan.multiprocess.init.b bVar) {
                        Object[] objArr2 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d2b7e29cb10a5699bf05ff4a3e06e7a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d2b7e29cb10a5699bf05ff4a3e06e7a");
                        } else {
                            bVar.a(new b());
                        }
                    }

                    @Override // com.android.meituan.multiprocess.init.a
                    public final void setLog(com.android.meituan.multiprocess.c cVar) {
                        Object[] objArr2 = {cVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8979d7a2450aa771e59a8050eafa6956", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8979d7a2450aa771e59a8050eafa6956");
                        } else {
                            cVar.a(new com.android.meituan.multiprocess.a() { // from class: com.meituan.mmp.lib.mp.ipc.h.1.1
                                public static ChangeQuickRedirect a;

                                @Override // com.android.meituan.multiprocess.a
                                public final void a(String str, Map<String, String> map) {
                                    Object[] objArr3 = {str, map};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5b6e6a7fc7264fa90e26141e09b75219", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5b6e6a7fc7264fa90e26141e09b75219");
                                    } else {
                                        g.a(str, map);
                                    }
                                }
                            });
                        }
                    }
                }, ContainerInfo.ENV_MMP);
                ab.a();
            }
        }
    }
}
