package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGMarketingDialog implements IMonitor {
    Normal,
    MachRenderError,
    ContextError,
    RendTypeError,
    OperationError,
    ShowError,
    ResourcePreloadError;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    SGMarketingDialog() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db855d0c8e01b2e2220c8a3dba0af1d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db855d0c8e01b2e2220c8a3dba0af1d0");
        }
    }

    public static SGMarketingDialog valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a65503bed0731caf65ada2d2f99c2f9d", RobustBitConfig.DEFAULT_VALUE) ? (SGMarketingDialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a65503bed0731caf65ada2d2f99c2f9d") : (SGMarketingDialog) Enum.valueOf(SGMarketingDialog.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGMarketingDialog[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e36629d1c203d43963faa243b42eee10", RobustBitConfig.DEFAULT_VALUE) ? (SGMarketingDialog[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e36629d1c203d43963faa243b42eee10") : (SGMarketingDialog[]) values().clone();
    }
}
