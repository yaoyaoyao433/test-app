package com.sankuai.waimai.launcher.ui.interceptortask;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    protected Context b;
    protected BaseResponse c;
    protected aj d;

    public abstract void a() throws Exception;

    public a(Context context, aj ajVar, BaseResponse baseResponse) {
        Object[] objArr = {context, ajVar, baseResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a959c2547f81104fef268f456cb810bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a959c2547f81104fef268f456cb810bd");
            return;
        }
        this.b = context;
        this.c = baseResponse;
        this.d = ajVar;
    }

    public final int b() {
        if (this.c != null) {
            return this.c.code;
        }
        return -1;
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24bdb98233dea73ab5e6ac11b8d1b09f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24bdb98233dea73ab5e6ac11b8d1b09f");
        }
        if (this.d != null) {
            return this.d.b();
        }
        return null;
    }
}
