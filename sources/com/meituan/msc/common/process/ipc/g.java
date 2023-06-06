package com.meituan.msc.common.process.ipc;

import android.content.Context;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static volatile boolean b;

    public static synchronized void a(final Context context) {
        synchronized (g.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9553876fee9972aefe2763326f9fe4c0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9553876fee9972aefe2763326f9fe4c0");
            } else if (b) {
            } else {
                b = true;
                com.meituan.msc.common.process.a.a(context);
                if (com.meituan.msc.common.process.a.e() == null) {
                    com.meituan.msc.modules.reporter.g.b("HeraTrace-run in unexpected process, stop init");
                    return;
                }
                com.android.meituan.multiprocess.e.a(false);
                com.android.meituan.multiprocess.e.a(context, new com.android.meituan.multiprocess.init.a() { // from class: com.meituan.msc.common.process.ipc.g.1
                    public static ChangeQuickRedirect a;

                    @Override // com.android.meituan.multiprocess.init.a
                    public final void addServiceManager(com.android.meituan.multiprocess.c cVar) {
                    }

                    @Override // com.android.meituan.multiprocess.init.a
                    public final void addService(com.android.meituan.multiprocess.c cVar) {
                        Object[] objArr2 = {cVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc44ba1d8448b7266d55fb515eb49840", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc44ba1d8448b7266d55fb515eb49840");
                            return;
                        }
                        String packageName = context.getPackageName();
                        cVar.a("msc_" + packageName, String.format("content://%s.mscMiniApp", packageName));
                        cVar.a("msc_" + packageName + ":mscMiniApp0", String.format("content://%s.mscMiniApp0", packageName));
                    }

                    @Override // com.android.meituan.multiprocess.init.a
                    public final void onAddTypeTransfer(com.android.meituan.multiprocess.init.b bVar) {
                        Object[] objArr2 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cdbb24ef7e021cbb55d32756e03ae6d5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cdbb24ef7e021cbb55d32756e03ae6d5");
                        } else {
                            bVar.a(new b());
                        }
                    }

                    @Override // com.android.meituan.multiprocess.init.a
                    public final void setLog(com.android.meituan.multiprocess.c cVar) {
                        Object[] objArr2 = {cVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b60d0889ded9bfb421107b4e0252f0a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b60d0889ded9bfb421107b4e0252f0a");
                        } else {
                            cVar.a(new com.android.meituan.multiprocess.a() { // from class: com.meituan.msc.common.process.ipc.g.1.1
                                public static ChangeQuickRedirect a;

                                @Override // com.android.meituan.multiprocess.a
                                public final void a(String str, Map<String, String> map) {
                                    Object[] objArr3 = {str, map};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d8937e5bf7316daa22196254d5939f7d", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d8937e5bf7316daa22196254d5939f7d");
                                    } else {
                                        f.a(str, map);
                                    }
                                }
                            });
                        }
                    }
                }, ContainerInfo.ENV_MSC);
            }
        }
    }
}
