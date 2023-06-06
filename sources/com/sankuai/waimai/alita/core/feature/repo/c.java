package com.sankuai.waimai.alita.core.feature.repo;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.alita.core.feature.h;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public final String b;
    public String c;
    public h d;

    public c(@NonNull String str, @NonNull String str2, @NonNull h hVar) {
        Object[] objArr = {str, str2, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de0ac15e659369523b5f55fdee2ef5e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de0ac15e659369523b5f55fdee2ef5e0");
            return;
        }
        this.b = str;
        this.c = str2;
        this.d = hVar;
    }
}
