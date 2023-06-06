package com.sankuai.waimai.alita.core.base;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class c<T> implements f<String> {
    public static ChangeQuickRedirect c;
    private String a;
    public T d;

    @Override // com.sankuai.waimai.alita.core.base.f
    public boolean a(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "508349a71a94068d6e1ac99a13806789", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "508349a71a94068d6e1ac99a13806789")).booleanValue() : TextUtils.equals(this.a, str);
    }

    public c(@NonNull String str, @NonNull T t) {
        Object[] objArr = {str, t};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c39678c51100760b2584027607682717", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c39678c51100760b2584027607682717");
            return;
        }
        this.a = str;
        this.d = t;
    }
}
