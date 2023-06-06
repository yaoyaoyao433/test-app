package com.meituan.msi.addapter.update;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.api.i;
import com.meituan.msi.context.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class ICheckHost implements IMsiApi {
    public static ChangeQuickRedirect a;

    public abstract void a(e eVar, i<HostVersionResponse> iVar);

    @MsiApiMethod(name = "getHostAppVersion", response = HostVersionResponse.class)
    public void msiGetHostAppVersion(final e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c4762a564674196c7e42d773c63bb41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c4762a564674196c7e42d773c63bb41");
        } else {
            a(eVar, new i<HostVersionResponse>() { // from class: com.meituan.msi.addapter.update.ICheckHost.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(HostVersionResponse hostVersionResponse) {
                    HostVersionResponse hostVersionResponse2 = hostVersionResponse;
                    Object[] objArr2 = {hostVersionResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf31f0e4470753a4f2d98879f890e4a1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf31f0e4470753a4f2d98879f890e4a1");
                    } else {
                        eVar.onSuccess(hostVersionResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae22a874e913fb850ebdfafa7e7042ff", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae22a874e913fb850ebdfafa7e7042ff");
                    } else {
                        eVar.onError(i, str);
                    }
                }
            });
        }
    }
}
