package com.sankuai.waimai.store.pagingload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum AgileLoadErrorType implements IMonitor {
    LoadMachError,
    DataSrcEmpty,
    DescNull,
    DeserializeError;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return true;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final com.sankuai.waimai.store.util.monitor.monitor.c b() {
        return null;
    }

    AgileLoadErrorType() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78aacb58e4c730a9bef6f048cd8728d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78aacb58e4c730a9bef6f048cd8728d0");
        }
    }

    public static AgileLoadErrorType valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b50e198ce7cafeb212a3e7ab168b66bf", RobustBitConfig.DEFAULT_VALUE) ? (AgileLoadErrorType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b50e198ce7cafeb212a3e7ab168b66bf") : (AgileLoadErrorType) Enum.valueOf(AgileLoadErrorType.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static AgileLoadErrorType[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc433c46b7ad0e9834e7ab4e509de289", RobustBitConfig.DEFAULT_VALUE) ? (AgileLoadErrorType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc433c46b7ad0e9834e7ab4e509de289") : (AgileLoadErrorType[]) values().clone();
    }
}
