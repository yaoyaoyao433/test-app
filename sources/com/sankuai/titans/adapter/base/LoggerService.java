package com.sankuai.titans.adapter.base;

import android.util.Log;
import com.dianping.networklog.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.services.ILogger;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LoggerService implements ILogger {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String className;
    private final boolean isDebugMode;

    public LoggerService(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d685bf066f51da9bea27e7b91e4051b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d685bf066f51da9bea27e7b91e4051b");
            return;
        }
        this.className = str;
        this.isDebugMode = z;
    }

    @Override // com.sankuai.titans.protocol.services.ILogger
    public void debug(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7f6d7319e6f7a468c46aedb9cf871f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7f6d7319e6f7a468c46aedb9cf871f7");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("::");
        sb.append(str2);
    }

    @Override // com.sankuai.titans.protocol.services.ILogger
    public void info(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3efe332272045419754f599cc0ad2b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3efe332272045419754f599cc0ad2b4");
            return;
        }
        c.a(str + "::" + str2, 35, new String[]{this.className});
    }

    @Override // com.sankuai.titans.protocol.services.ILogger
    public void warn(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f7fe467378faffe2826f4c6c4da2e37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f7fe467378faffe2826f4c6c4da2e37");
            return;
        }
        c.a(str + "::" + str2, 35, new String[]{this.className});
    }

    @Override // com.sankuai.titans.protocol.services.ILogger
    public void warn(String str, Exception exc) {
        Object[] objArr = {str, exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57c9e45ee95d8fa5cd45e98c1969b829", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57c9e45ee95d8fa5cd45e98c1969b829");
            return;
        }
        String stackTraceString = Log.getStackTraceString(exc);
        c.a(str + "::" + stackTraceString, 35, new String[]{this.className});
    }

    @Override // com.sankuai.titans.protocol.services.ILogger
    public void error(String str, String str2, Exception exc) {
        Object[] objArr = {str, str2, exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6fd7f8327246a3cdf503234aeaf13d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6fd7f8327246a3cdf503234aeaf13d7");
        } else if (this.isDebugMode) {
            throw new RuntimeException(exc);
        } else {
            String stackTraceString = Log.getStackTraceString(exc);
            c.a(str + "::log: " + str2 + ", errorMessage: " + stackTraceString, 35, new String[]{this.className});
        }
    }
}
