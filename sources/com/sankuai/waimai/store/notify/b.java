package com.sankuai.waimai.store.notify;

import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.g;
import com.sankuai.waimai.platform.utils.i;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.view.standard.FlashDialog;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;

        static int a(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b46c221814790b1a5456b61d3ef3b27", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b46c221814790b1a5456b61d3ef3b27")).intValue() : (i & 33554431) | (i2 << 25);
        }
    }

    public static int a(@NonNull Context context, int i, com.sankuai.waimai.store.notify.a aVar) {
        Object[] objArr = {context, Integer.valueOf((int) R.string.wm_sc_sold_out_spu_notify_text), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f354aba4a851f90edb3b01770c7bcd2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f354aba4a851f90edb3b01770c7bcd2")).intValue() : a(context, context.getString(R.string.wm_sc_sold_out_spu_notify_text), aVar);
    }

    private static int a(@NonNull Context context, String str, com.sankuai.waimai.store.notify.a aVar) {
        Object[] objArr = {context, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44a11f469e729456c50a73871888112c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44a11f469e729456c50a73871888112c")).intValue();
        }
        if (a(context)) {
            return 1;
        }
        int a2 = a();
        if (b(context, a2)) {
            b(context, str, aVar);
            a(context, a2);
            return 3;
        }
        return 2;
    }

    private static void b(final Context context, String str, final com.sankuai.waimai.store.notify.a aVar) {
        Object[] objArr = {context, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c393d325ec7c3e73ff5ad3275f71825", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c393d325ec7c3e73ff5ad3275f71825");
        } else {
            new FlashDialog.a(context).a(str).a(context.getResources().getString(R.string.wm_sc_goto_setting), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.notify.b.3
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "091e47094e0c09466fc280570bc20306", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "091e47094e0c09466fc280570bc20306");
                        return;
                    }
                    if (com.sankuai.waimai.store.notify.a.this != null) {
                        com.sankuai.waimai.store.notify.a.this.b();
                    }
                    Context context2 = context;
                    Object[] objArr3 = {context2};
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "461c5c36a1bc1bfd9670c5ff31a01542", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "461c5c36a1bc1bfd9670c5ff31a01542");
                    } else {
                        i.b(context2);
                    }
                    dialogInterface.dismiss();
                }
            }).b(context.getResources().getString(R.string.wm_sc_common_cancel), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.notify.b.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e716474d8cf66a1075c4d624a95b33fb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e716474d8cf66a1075c4d624a95b33fb");
                        return;
                    }
                    if (com.sankuai.waimai.store.notify.a.this != null) {
                        com.sankuai.waimai.store.notify.a.this.c();
                    }
                    dialogInterface.dismiss();
                }
            }).a(new DialogInterface.OnShowListener() { // from class: com.sankuai.waimai.store.notify.b.1
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    Object[] objArr2 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "96b8a227f9b7c3f01e4fd105721cd648", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "96b8a227f9b7c3f01e4fd105721cd648");
                    } else if (com.sankuai.waimai.store.notify.a.this != null) {
                        com.sankuai.waimai.store.notify.a.this.a();
                    }
                }
            }).a();
        }
    }

    private static void a(@NonNull Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93f02f843074556b6530fbbdfff82880", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93f02f843074556b6530fbbdfff82880");
            return;
        }
        int b = ab.b().b(context, "notify_permission_show_condition", 0) >> 25;
        ab.b().a(context, "notify_permission_show_condition", a.a(i, b < 127 ? b + 1 : 127));
    }

    private static boolean b(@NonNull Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a25004632e5dcb05c149d7b98df20851", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a25004632e5dcb05c149d7b98df20851")).booleanValue();
        }
        int b = ab.b().b(context, "notify_permission_show_condition", 0);
        return (b >> 25) < 2 && (33554431 & b) != i;
    }

    private static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc64a5097755805b29117435a3f8f48b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc64a5097755805b29117435a3f8f48b")).intValue();
        }
        try {
            return Integer.parseInt(g.b().replace(CommonConstant.Symbol.MINUS, ""));
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return -1;
        }
    }

    private static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2fdbd62d99be182763ece427ff051bb1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2fdbd62d99be182763ece427ff051bb1")).booleanValue() : i.a(context);
    }
}
