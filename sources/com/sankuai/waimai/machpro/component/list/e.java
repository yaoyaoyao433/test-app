package com.sankuai.waimai.machpro.component.list;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class e extends com.sankuai.waimai.machpro.component.d {
    public static ChangeQuickRedirect b;

    public abstract void a(int i);

    public e(View view) {
        super(view);
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e9567b04056030dcf31016198612ea3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e9567b04056030dcf31016198612ea3");
        }
    }
}
