package com.meituan.msc.modules.page.render;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.msc.modules.engine.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class j extends d {
    public static ChangeQuickRedirect m;
    protected boolean n;
    protected int o;

    public abstract j a(com.meituan.msc.modules.page.render.webview.g gVar);

    public abstract void a(@Nullable o oVar);

    public abstract void a(@Nullable List<String> list);

    public abstract void c(String str);

    public abstract boolean s();

    @NonNull
    public abstract Set<String> t();

    @NonNull
    public abstract Set<String> u();

    public abstract boolean v();

    public abstract boolean w();

    public j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e262b1bd2e1eb6b607b54d23391bdcfc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e262b1bd2e1eb6b607b54d23391bdcfc");
        } else {
            this.o = 0;
        }
    }

    public final boolean r() {
        return this.n;
    }
}
