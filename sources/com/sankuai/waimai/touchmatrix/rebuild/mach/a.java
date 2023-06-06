package com.sankuai.waimai.touchmatrix.rebuild.mach;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.touchmatrix.data.AlertInfo;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends com.sankuai.waimai.touchmatrix.dialog.gesture.d {
    public static ChangeQuickRedirect c;
    protected com.sankuai.waimai.touchmatrix.data.a d;
    protected com.sankuai.waimai.touchmatrix.rebuild.factory.c e;

    public abstract void a(AlertInfo alertInfo, com.sankuai.waimai.touchmatrix.dialog.c cVar);

    public com.sankuai.waimai.touchmatrix.data.a getMessage() {
        return this.d;
    }

    public void setMessage(com.sankuai.waimai.touchmatrix.data.a aVar) {
        this.d = aVar;
    }

    public com.sankuai.waimai.touchmatrix.rebuild.factory.c getControler() {
        return this.e;
    }

    public void setControler(com.sankuai.waimai.touchmatrix.rebuild.factory.c cVar) {
        this.e = cVar;
    }

    public a(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "900a585153eee83734274497643b372e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "900a585153eee83734274497643b372e");
        }
    }

    public a(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bf172e11d83b719ac09284428a456b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bf172e11d83b719ac09284428a456b4");
        }
    }
}
