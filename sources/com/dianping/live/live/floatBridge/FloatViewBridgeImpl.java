package com.dianping.live.live.floatBridge;

import android.content.Intent;
import com.dianping.codelog.b;
import com.dianping.live.live.livefloat.a;
import com.dianping.live.live.mrn.MLiveFloatBridgeModule;
import com.meituan.msi.api.extension.FloatLiveViewStatus;
import com.meituan.msi.api.extension.FloatViewParam;
import com.meituan.msi.api.extension.IFloatView;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class FloatViewBridgeImpl extends IFloatView {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;

    @Override // com.meituan.msi.api.extension.IFloatView
    public final void a(MsiCustomContext msiCustomContext, i<FloatLiveViewStatus> iVar) {
        boolean z = true;
        Object[] objArr = {msiCustomContext, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3f8e382e1f305189d325c4e0ae5ca0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3f8e382e1f305189d325c4e0ae5ca0f");
            return;
        }
        String str = com.dianping.live.live.utils.i.b;
        com.dianping.live.live.utils.i.a(str, "call isFloatLiveViewExist IS_MMP_FLOAT_SHOW:" + b + ";isFloatShow:" + a.d);
        FloatLiveViewStatus floatLiveViewStatus = new FloatLiveViewStatus();
        if (!b && !a.d) {
            z = false;
        }
        floatLiveViewStatus.status = z;
        iVar.a(floatLiveViewStatus);
    }

    @Override // com.meituan.msi.api.extension.IFloatView
    public final void a(FloatViewParam floatViewParam, MsiCustomContext msiCustomContext) {
        Object[] objArr = {floatViewParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b29c1235e3c9c9be478ab080d2fa55b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b29c1235e3c9c9be478ab080d2fa55b");
            return;
        }
        com.dianping.live.live.utils.i.a(com.dianping.live.live.utils.i.b, "call dismissFloatView");
        if ("all".equals(floatViewParam.type) || "mrn".equals(floatViewParam.type)) {
            MLiveFloatBridgeModule.killMLiveFloat();
            com.dianping.live.live.utils.i.a(com.dianping.live.live.utils.i.b, "call killMLiveFloat");
        }
        if (("all".equals(floatViewParam.type) || ContainerInfo.ENV_MMP.equals(floatViewParam.type)) && b.b() != null) {
            Intent intent = new Intent();
            intent.setAction("mmp-float-view-dismiss-action");
            com.sankuai.meituan.takeoutnew.util.aop.b.a(b.b(), intent);
            com.dianping.live.live.utils.i.a(com.dianping.live.live.utils.i.b, "call sendBroadcast mmp-float-view-dismiss-action");
        }
    }
}
