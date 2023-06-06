package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.soldout;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.platform.restaurant.dialog.BaseDialogWithCloseIcon;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public BaseDialogWithCloseIcon b;
    public Context c;
    public InterfaceC0855a d;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.soldout.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0855a {
        void a();
    }

    public a(@NonNull Context context, InterfaceC0855a interfaceC0855a) {
        Object[] objArr = {context, interfaceC0855a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36866bcbcfecf24235289990a06f4df0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36866bcbcfecf24235289990a06f4df0");
            return;
        }
        this.c = context;
        this.d = interfaceC0855a;
    }
}
