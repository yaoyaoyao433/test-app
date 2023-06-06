package com.meituan.android.quickpass.uptsm.common.download;

import android.content.Context;
import android.os.RemoteException;
import com.meituan.android.downloadmanager.b;
import com.meituan.android.downloadmanager.model.Request;
import com.meituan.android.quickpass.uptsm.common.utils.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context, String str, final a aVar) {
        Object[] objArr = {context, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2086521b9eef00b62fd378e20eb2342", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2086521b9eef00b62fd378e20eb2342")).booleanValue();
        }
        final com.meituan.android.downloadmanager.b a2 = com.meituan.android.downloadmanager.b.a(context);
        final com.meituan.android.downloadmanager.callback.a aVar2 = new com.meituan.android.downloadmanager.callback.a() { // from class: com.meituan.android.quickpass.uptsm.common.download.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.downloadmanager.callback.a
            public final void a(long j, long j2) {
                Object[] objArr2 = {new Long(j), new Long(j2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "538f5b3b7ae99e7baf9f4e85fd477b69", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "538f5b3b7ae99e7baf9f4e85fd477b69");
                    return;
                }
                h.b("curBytes:" + j + "\ttotalBytes:" + j2);
                if (j2 > 0) {
                    a.this.a((j * 100) / j2);
                } else {
                    a.this.a();
                }
            }

            @Override // com.meituan.android.downloadmanager.callback.a
            public final void a(String str2) {
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0c2b500a539f5af04d362864621547b4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0c2b500a539f5af04d362864621547b4");
                } else {
                    a.this.a(str2);
                }
            }

            @Override // com.meituan.android.downloadmanager.callback.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7a4c49461c3994a3349e90599a7fcf35", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7a4c49461c3994a3349e90599a7fcf35");
                } else {
                    a.this.a();
                }
            }

            @Override // com.meituan.android.downloadmanager.callback.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94d8a08a8715959d67d4f1e8d22fd1f2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94d8a08a8715959d67d4f1e8d22fd1f2");
                } else {
                    a.this.a();
                }
            }
        };
        Object[] objArr2 = {str, null, null, "meituan_quickpass_uptsm", aVar2};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.downloadmanager.b.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "08c6254948d9eaf007bbfa76f87c2f63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "08c6254948d9eaf007bbfa76f87c2f63");
        } else {
            final Request request = new Request(str);
            request.f = null;
            request.b = null;
            request.c = "meituan_quickpass_uptsm";
            Object[] objArr3 = {request, aVar2};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.downloadmanager.b.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "f4c6bc30e39db8bfc8d5c03fc20505ca", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "f4c6bc30e39db8bfc8d5c03fc20505ca");
            } else {
                a2.a(new b.InterfaceC0250b() { // from class: com.meituan.android.downloadmanager.b.6
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.downloadmanager.b.InterfaceC0250b
                    public final void a() throws RemoteException {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "db5d236d7bfdb5bb4a1c16c1be58e8e7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "db5d236d7bfdb5bb4a1c16c1be58e8e7");
                            return;
                        }
                        a2.a(request.d, aVar2);
                        if (a2.g != null) {
                            a2.g.download(request);
                        }
                    }
                });
            }
        }
        return true;
    }

    public static void cancel(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "295837a8205f816de186d29e8a5fbfc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "295837a8205f816de186d29e8a5fbfc4");
        } else {
            com.meituan.android.downloadmanager.b.a(context).cancel(str);
        }
    }
}
