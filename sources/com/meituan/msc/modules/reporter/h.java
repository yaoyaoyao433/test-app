package com.meituan.msc.modules.reporter;

import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.devtools.DebugHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h implements c {
    public static ChangeQuickRedirect a;
    private String b;

    @Override // com.meituan.msc.modules.reporter.c
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e14739ae48d979e0d40aee94d7655138", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e14739ae48d979e0d40aee94d7655138")).booleanValue() : DebugHelper.a();
    }

    @Override // com.meituan.msc.modules.reporter.c
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d9960ef0335dfa79996be81c6c946ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d9960ef0335dfa79996be81c6c946ba");
        }
        if (this.b != null) {
            return this.b;
        }
        if (MSCEnvHelper.isInited()) {
            com.meituan.msc.common.process.a e = com.meituan.msc.common.process.a.e();
            StringBuilder sb = new StringBuilder("[");
            sb.append(e != null ? e.h : CommonConstant.Symbol.QUESTION_MARK);
            sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            this.b = sb.toString();
            return this.b;
        }
        return "";
    }
}
