package com.meituan.android.customerservice.channel.voip;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public int b;
    public List<a> c;
    public long d;

    public final a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6cb73816ceb1c6895585781890bbd22", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6cb73816ceb1c6895585781890bbd22");
        }
        if (this.c == null || this.c.isEmpty()) {
            com.meituan.android.customerservice.utils.c.a("UploadFileRequest", "files is null or empty");
            return null;
        }
        return this.c.get(this.b);
    }
}
