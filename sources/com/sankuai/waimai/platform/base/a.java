package com.sankuai.waimai.platform.base;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<DATA, EXTRA> extends b {
    public static ChangeQuickRedirect g;
    private DATA a;

    public abstract void a(int i, @NonNull DATA data);

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26374c65b1bc322fe6fdfe68b2dfe6c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26374c65b1bc322fe6fdfe68b2dfe6c6");
        }
    }

    public final void b(int i, DATA data) {
        Object[] objArr = {Integer.valueOf(i), data};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9694bbe4e4c0543db22763f8eb1ead51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9694bbe4e4c0543db22763f8eb1ead51");
            return;
        }
        this.a = data;
        if (data != null) {
            a(i, (int) this.a);
        }
    }
}
