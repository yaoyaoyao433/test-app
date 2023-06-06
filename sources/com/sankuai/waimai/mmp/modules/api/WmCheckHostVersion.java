package com.sankuai.waimai.mmp.modules.api;

import com.meituan.android.upgrade.a;
import com.meituan.android.upgrade.d;
import com.meituan.android.uptodate.model.VersionInfo;
import com.meituan.msi.addapter.update.HostVersionResponse;
import com.meituan.msi.addapter.update.ICheckHost;
import com.meituan.msi.api.i;
import com.meituan.msi.context.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsListener;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WmCheckHostVersion extends ICheckHost {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.addapter.update.ICheckHost
    public final void a(e eVar, final i<HostVersionResponse> iVar) {
        Object[] objArr = {eVar, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "629cf7e584dd33f1d952f027288c27e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "629cf7e584dd33f1d952f027288c27e6");
        } else {
            com.meituan.android.upgrade.e.a().a(true, false, new a() { // from class: com.sankuai.waimai.mmp.modules.api.WmCheckHostVersion.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.upgrade.a
                public final void a(VersionInfo versionInfo, boolean z) {
                    Object[] objArr2 = {versionInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f1e004acb784b2303023026b4dc12fa3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f1e004acb784b2303023026b4dc12fa3");
                        return;
                    }
                    WmCheckHostVersion wmCheckHostVersion = WmCheckHostVersion.this;
                    i iVar2 = iVar;
                    Object[] objArr3 = {versionInfo, iVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = WmCheckHostVersion.b;
                    if (PatchProxy.isSupport(objArr3, wmCheckHostVersion, changeQuickRedirect3, false, "fa9da08ca79bc16c452a1761bc8c10bf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, wmCheckHostVersion, changeQuickRedirect3, false, "fa9da08ca79bc16c452a1761bc8c10bf");
                        return;
                    }
                    HostVersionResponse hostVersionResponse = new HostVersionResponse();
                    if (versionInfo == null || !versionInfo.isUpdated) {
                        hostVersionResponse.isNewVersion = true;
                        com.meituan.msi.log.a.a("UpdateHostAppModule no new version");
                        iVar2.a(hostVersionResponse);
                        return;
                    }
                    hostVersionResponse.isNewVersion = false;
                    iVar2.a(hostVersionResponse);
                }

                @Override // com.meituan.android.upgrade.a
                public final void a(d dVar) {
                    Object[] objArr2 = {dVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e64454410b2cb121d258ae2563e97fda", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e64454410b2cb121d258ae2563e97fda");
                        return;
                    }
                    String format = String.format("host app check version failed:%s", dVar.toString());
                    com.meituan.msi.log.a.a(format);
                    iVar.a(TbsListener.ErrorCode.INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_COUNTS, format);
                }
            });
        }
    }
}
