package com.sankuai.waimai.store.recipe;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public final long b;
    public final String c;
    public long d;
    public String e;
    public String f;
    public final c g;

    public d(long j, String str, Context context) {
        Object[] objArr = {new Long(j), str, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9436d4a205ef6fda0f19a6df9d892457", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9436d4a205ef6fda0f19a6df9d892457");
            return;
        }
        this.b = j;
        this.c = str;
        this.g = new c(context);
    }
}
