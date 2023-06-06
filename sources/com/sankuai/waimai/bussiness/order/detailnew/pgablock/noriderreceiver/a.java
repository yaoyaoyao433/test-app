package com.sankuai.waimai.bussiness.order.detailnew.pgablock.noriderreceiver;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    final Context b;
    boolean c;
    InterfaceC0919a d;
    com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation.b e;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.detailnew.pgablock.noriderreceiver.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0919a {
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae2f12988cb0fb6707240a54fde7ff99", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae2f12988cb0fb6707240a54fde7ff99");
        } else {
            this.b = context;
        }
    }
}
