package com.meituan.android.neohybrid.core.horn;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements com.meituan.android.paybase.login.b {
    public static ChangeQuickRedirect a;
    private final a b;
    private final String c;
    private final Class d;

    private b(a aVar, String str, Class cls) {
        this.b = aVar;
        this.c = str;
        this.d = cls;
    }

    public static com.meituan.android.paybase.login.b a(a aVar, String str, Class cls) {
        Object[] objArr = {aVar, str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c827b42c7764662ab0a8275db8deeb56", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.paybase.login.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c827b42c7764662ab0a8275db8deeb56") : new b(aVar, str, cls);
    }

    @Override // com.meituan.android.paybase.login.b
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db976d3536d6f4d5a55449e603c9544e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db976d3536d6f4d5a55449e603c9544e");
            return;
        }
        a aVar = this.b;
        String str = this.c;
        Class cls = this.d;
        Object[] objArr2 = {aVar, str, cls, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1df0a5da93b954b634bc4971560c05bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1df0a5da93b954b634bc4971560c05bb");
        } else {
            aVar.b(str, cls);
        }
    }
}
