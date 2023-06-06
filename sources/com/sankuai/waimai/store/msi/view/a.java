package com.sankuai.waimai.store.msi.view;

import android.app.Activity;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SGDialogMachContainer;
import com.sankuai.waimai.store.util.al;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final Map<String, Object> b;
    public final SGDialogMachContainer c;

    public a(Activity activity, Map<String, Object> map) {
        Object[] objArr = {activity, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0fafb835dc617faa3d895776c8346f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0fafb835dc617faa3d895776c8346f2");
            return;
        }
        this.b = map;
        this.c = new SGDialogMachContainer(activity, "", "");
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6bd354f45678d8bf8f2fe73104a7e9d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6bd354f45678d8bf8f2fe73104a7e9d3");
            return;
        }
        final int hashCode = activity.hashCode();
        final String a2 = com.sankuai.waimai.store.msi.listener.a.a(activity);
        this.c.a(new HashMap());
        com.sankuai.waimai.store.mach.event.b bVar = new com.sankuai.waimai.store.mach.event.b() { // from class: com.sankuai.waimai.store.msi.view.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.mach.event.b
            public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str, Map<String, Object> map2) {
                Object[] objArr3 = {aVar, str, map2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b6806aac08787dc0cdaa3d80b15177ea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b6806aac08787dc0cdaa3d80b15177ea");
                } else if ("alert_confirm".equals(str)) {
                    com.sankuai.waimai.platform.widget.dialog.a.b(a.this.c);
                }
            }
        };
        final Runnable runnable = new Runnable() { // from class: com.sankuai.waimai.store.msi.view.a.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "720862a2cc4bdb6261dbefb985a0b76c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "720862a2cc4bdb6261dbefb985a0b76c");
                    return;
                }
                com.sankuai.waimai.store.shopping.cart.event.b bVar2 = new com.sankuai.waimai.store.shopping.cart.event.b();
                bVar2.b = false;
                bVar2.a = hashCode;
                com.meituan.android.bus.a.a().c(bVar2);
            }
        };
        this.c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.store.msi.view.a.3
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Object[] objArr3 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "204288f919561354d7f287e6463bdca0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "204288f919561354d7f287e6463bdca0");
                } else {
                    al.b(runnable, a2);
                }
            }
        });
        this.c.b = bVar;
    }
}
