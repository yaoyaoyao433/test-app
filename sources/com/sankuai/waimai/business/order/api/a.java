package com.sankuai.waimai.business.order.api;

import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.android.cube.pga.action.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a<InputType> implements b<InputType> {
    public static ChangeQuickRedirect a;
    @Nullable
    private final View b;

    public abstract void b(InputType inputtype);

    public a(@Nullable View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14de74f171ec5583ed03b3d33f1dd633", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14de74f171ec5583ed03b3d33f1dd633");
        } else {
            this.b = view;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // com.meituan.android.cube.pga.action.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(InputType r16) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.order.api.a.a(java.lang.Object):void");
    }
}
