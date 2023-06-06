package com.sankuai.titans.adapter.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.services.ILogger;
import com.sankuai.titans.protocol.services.ILoggerManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansLoggerManagerService implements ILoggerManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final boolean isDebugModel;

    public TitansLoggerManagerService(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3a2a8590ea11a7634e55ee462743c24", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3a2a8590ea11a7634e55ee462743c24");
        } else {
            this.isDebugModel = z;
        }
    }

    @Override // com.sankuai.titans.protocol.services.ILoggerManager
    public ILogger getInstance(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08dd9e498f664655fb7591d4fee263fc", RobustBitConfig.DEFAULT_VALUE) ? (ILogger) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08dd9e498f664655fb7591d4fee263fc") : new LoggerService(str, this.isDebugModel);
    }
}
