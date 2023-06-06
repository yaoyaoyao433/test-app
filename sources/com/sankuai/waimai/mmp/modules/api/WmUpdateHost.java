package com.sankuai.waimai.mmp.modules.api;

import com.meituan.android.upgrade.a;
import com.meituan.android.upgrade.d;
import com.meituan.android.upgrade.e;
import com.meituan.android.uptodate.model.VersionInfo;
import com.meituan.msi.addapter.update.IUpdateHost;
import com.meituan.msi.addapter.update.UpdateHostAppParam;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WmUpdateHost extends IUpdateHost {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.addapter.update.IUpdateHost
    public final void a(MsiCustomContext msiCustomContext, UpdateHostAppParam updateHostAppParam, final i<EmptyResponse> iVar) {
        Object[] objArr = {msiCustomContext, updateHostAppParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c19a4f634ae3850dcb6002f56869a99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c19a4f634ae3850dcb6002f56869a99");
        } else {
            e.a().a(updateHostAppParam.isManual, true, new a() { // from class: com.sankuai.waimai.mmp.modules.api.WmUpdateHost.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.upgrade.a
                public final void a(VersionInfo versionInfo, boolean z) {
                    Object[] objArr2 = {versionInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da8db69874922cfe3f1a696e9d0b8faa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da8db69874922cfe3f1a696e9d0b8faa");
                    } else if (versionInfo == null || !versionInfo.isUpdated) {
                        iVar.a(10001, "host app no new version");
                        com.meituan.msi.log.a.a("UpdateHostAppModule no new version");
                    } else {
                        iVar.a(EmptyResponse.INSTANCE);
                    }
                }

                @Override // com.meituan.android.upgrade.a
                public final void a(d dVar) {
                    Object[] objArr2 = {dVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "175d404460830ebca812d34af6eb47c4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "175d404460830ebca812d34af6eb47c4");
                        return;
                    }
                    String format = String.format("host app update failed:%s", dVar.toString());
                    com.meituan.msi.log.a.a(format);
                    iVar.a(10002, format);
                }
            });
        }
    }
}
