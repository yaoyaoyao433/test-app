package com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo;

import android.content.Context;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a extends com.meituan.android.cube.pga.view.a implements DialogInterface.OnKeyListener {
    public static ChangeQuickRedirect d;

    public void e() {
    }

    public void f() {
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7970371877e080db611623514b507e37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7970371877e080db611623514b507e37");
        }
    }
}
