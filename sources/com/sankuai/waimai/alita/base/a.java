package com.sankuai.waimai.alita.base;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a<T> implements c<String> {
    public static ChangeQuickRedirect a;
    public T b;
    private String c;

    @Override // com.sankuai.waimai.alita.base.c
    public boolean a(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaea5a168c05c3b7037f90240a353181", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaea5a168c05c3b7037f90240a353181")).booleanValue() : TextUtils.equals(this.c, str);
    }

    public a(@NonNull String str, @NonNull T t) {
        Object[] objArr = {str, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a3968c229a8190b6dc304a767093811", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a3968c229a8190b6dc304a767093811");
            return;
        }
        this.c = str;
        this.b = t;
    }
}
