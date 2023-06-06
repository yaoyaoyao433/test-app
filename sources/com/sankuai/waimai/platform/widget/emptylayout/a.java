package com.sankuai.waimai.platform.widget.emptylayout;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends RuntimeException {
    public static ChangeQuickRedirect a;
    String b;
    Throwable c;
    private String d;

    public a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1b8257de9abbb16b5096520214af310", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1b8257de9abbb16b5096520214af310");
            return;
        }
        this.d = str;
        this.b = null;
        this.c = null;
    }

    public a(@NonNull String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "974275245cb7007daed50e55633aacaf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "974275245cb7007daed50e55633aacaf");
            return;
        }
        this.d = str;
        this.b = str2;
        this.c = null;
    }
}
