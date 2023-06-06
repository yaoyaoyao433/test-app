package com.meituan.mmp.lib.msi;

import android.text.TextUtils;
import com.meituan.mmp.lib.msi.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements com.meituan.msi.context.c {
    public static ChangeQuickRedirect a;
    private int b;
    private boolean c;

    public c(h.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "097c1cd4ef76251211da8fb616cad83e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "097c1cd4ef76251211da8fb616cad83e");
            return;
        }
        this.b = -1;
        this.c = false;
        if (bVar != null) {
            this.c = bVar.c();
            this.b = bVar.b();
        }
    }

    @Override // com.meituan.msi.context.c
    public final int a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fb292519640b345cecb7342fa3e0243", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fb292519640b345cecb7342fa3e0243")).intValue();
        }
        if (this.c && "default".equals(str)) {
            for (String str3 : h.b) {
                if (TextUtils.equals(str2, str3)) {
                    com.meituan.mmp.lib.trace.b.b("ApiSampleRate " + this.b + StringUtil.SPACE + str2);
                    return this.b;
                }
            }
            return -1;
        }
        return -1;
    }
}
