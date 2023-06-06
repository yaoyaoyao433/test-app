package com.sankuai.waimai.bussiness.order.confirm.request.dynamic;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity;
import com.sankuai.waimai.bussiness.order.detail.WMOrderDetailActivity;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.RocksOrderNativeModule;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.f;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import com.sankuai.waimai.platform.mach.dialog.e;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.h;
import com.sankuai.waimai.router.core.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends h {
    public static ChangeQuickRedirect a = null;
    private static boolean e = false;
    private DynamicDialog b;
    private e c;
    private String d;

    @Override // com.sankuai.waimai.router.core.h
    public final boolean a(@NonNull j jVar) {
        return true;
    }

    public static /* synthetic */ DynamicDialog a(c cVar, DynamicDialog dynamicDialog) {
        cVar.b = null;
        return null;
    }

    public static /* synthetic */ boolean a(boolean z) {
        e = false;
        return false;
    }

    @Override // com.sankuai.waimai.router.core.h
    public final void a(@NonNull final j jVar, @NonNull g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b0fc7d8dd0161b01f9e55df3d4ac76a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b0fc7d8dd0161b01f9e55df3d4ac76a");
            return;
        }
        Uri uri = jVar.d;
        final String queryParameter = uri.getQueryParameter("template_id");
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("showStash", false);
        if (this.b != null && this.b.isShowing() && !booleanQueryParameter) {
            if (TextUtils.equals(this.d, queryParameter)) {
                return;
            }
            this.b.dismiss();
        }
        this.d = queryParameter;
        String queryParameter2 = uri.getQueryParameter("data");
        String queryParameter3 = uri.getQueryParameter("cid");
        boolean z = !"false".equalsIgnoreCase(uri.getQueryParameter("isCancelable"));
        JsonObject jsonObject = new JsonObject();
        try {
            if (!TextUtils.isEmpty(queryParameter2)) {
                jsonObject = new JsonParser().parse(queryParameter2).getAsJsonObject();
            }
            Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(uri.getQueryParameter("extra_map"));
            Map<String, Object> a3 = com.sankuai.waimai.mach.utils.b.a(uri.getQueryParameter("pv_map"));
            if (a2 != null && !a2.isEmpty()) {
                for (String str : a2.keySet()) {
                    jsonObject.add(str, new JsonParser().parse(new Gson().toJson(a2.get(str))));
                }
            }
            if (!(jVar.c instanceof Activity) || e) {
                return;
            }
            Activity activity = (Activity) jVar.c;
            if ("waimai_order_status_operatearea_price_dialog_style_1".equalsIgnoreCase(queryParameter)) {
                e = true;
            }
            b b = b.a(activity).a(queryParameter).b(queryParameter3).a(jsonObject).b(queryParameter3);
            DynamicDialog.h hVar = new DynamicDialog.h() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.dynamic.c.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.h
                public final e a(final Activity activity2, AlertInfo.Module module) {
                    Object[] objArr2 = {activity2, module};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5136993b0f809303cdc48fa6d9c1b1d", RobustBitConfig.DEFAULT_VALUE)) {
                        return (e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5136993b0f809303cdc48fa6d9c1b1d");
                    }
                    c.this.c = new e(activity2, "") { // from class: com.sankuai.waimai.bussiness.order.confirm.request.dynamic.c.3.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.platform.mach.a, com.sankuai.waimai.mach.container.a
                        public final void a(Mach.a aVar) {
                            Object[] objArr3 = {aVar};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e5a2c720dd36fca331bed1c1f2bae915", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e5a2c720dd36fca331bed1c1f2bae915");
                                return;
                            }
                            super.a(aVar);
                            aVar.a(new RocksOrderNativeModule(activity2));
                        }
                    };
                    f a4 = f.a();
                    e eVar = c.this.c;
                    Object[] objArr3 = {eVar, "mach_event_activity_status"};
                    ChangeQuickRedirect changeQuickRedirect3 = f.a;
                    if (PatchProxy.isSupport(objArr3, a4, changeQuickRedirect3, false, "e9c215b0d3cedec468ee4d52d04f7d7f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a4, changeQuickRedirect3, false, "e9c215b0d3cedec468ee4d52d04f7d7f");
                    } else {
                        List<com.sankuai.waimai.mach.container.b> list = a4.b.get("mach_event_activity_status");
                        if (list == null) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(eVar);
                            a4.b.put("mach_event_activity_status", arrayList);
                        } else if (!a4.a(list, eVar)) {
                            list.add(eVar);
                        }
                    }
                    if ((activity2 instanceof OrderConfirmActivity) && "waimai_order_order_confirm_choose_address_style_1".equalsIgnoreCase(queryParameter)) {
                        final com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b a5 = com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.a();
                        e eVar2 = c.this.c;
                        Object[] objArr4 = {eVar2};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.a;
                        if (PatchProxy.isSupport(objArr4, a5, changeQuickRedirect4, false, "d653090ae3bb5f2ee3acb0142c67730b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, a5, changeQuickRedirect4, false, "d653090ae3bb5f2ee3acb0142c67730b");
                        } else {
                            a5.b = eVar2;
                            a5.b.a(new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                                public final void a(int i) {
                                    Object[] objArr5 = {Integer.valueOf(i)};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0d8486e67abf2f2c43fd3b78595e4f58", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0d8486e67abf2f2c43fd3b78595e4f58");
                                    } else if (i == 1) {
                                        ad.a(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.1.1
                                            public static ChangeQuickRedirect a;

                                            {
                                                AnonymousClass1.this = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                Object[] objArr6 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b276f2411ee2ac9c2547b8c5e2f75554", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b276f2411ee2ac9c2547b8c5e2f75554");
                                                    return;
                                                }
                                                b bVar = a5;
                                                Object[] objArr7 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect7 = b.a;
                                                if (PatchProxy.isSupport(objArr7, bVar, changeQuickRedirect7, false, "04f0ef8204c55e88125554f6f489f27a", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr7, bVar, changeQuickRedirect7, false, "04f0ef8204c55e88125554f6f489f27a");
                                                } else if (bVar.b != null) {
                                                    if (bVar.c == null) {
                                                        bVar.c = ah.a(bVar.b.r());
                                                    }
                                                    bVar.b.a(bVar.c);
                                                    bVar.b.b();
                                                }
                                            }
                                        }, 400L);
                                    }
                                }
                            });
                        }
                    }
                    return c.this.c;
                }
            };
            Object[] objArr2 = {hVar};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "3e8540c893144c233266d99f104d0442", RobustBitConfig.DEFAULT_VALUE)) {
                b = (b) PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "3e8540c893144c233266d99f104d0442");
            } else if (b.b != null) {
                b.b.n = hVar;
            }
            this.b = b.a(new a(activity) { // from class: com.sankuai.waimai.bussiness.order.confirm.request.dynamic.c.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a
                public final void a(String str2, Map<String, Object> map, DynamicDialog dynamicDialog) {
                    Object[] objArr3 = {str2, map, dynamicDialog};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fdb4e187666cbcb0d89555416f28aae0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fdb4e187666cbcb0d89555416f28aae0");
                    } else if (jVar.c instanceof WMOrderDetailActivity) {
                        WMOrderDetailActivity wMOrderDetailActivity = (WMOrderDetailActivity) jVar.c;
                        if (wMOrderDetailActivity.b == null || wMOrderDetailActivity.b.z == null) {
                            return;
                        }
                        wMOrderDetailActivity.b.z.a(str2, map);
                    } else if (jVar.c instanceof OrderConfirmActivity) {
                        OrderConfirmActivity orderConfirmActivity = (OrderConfirmActivity) jVar.c;
                        if (orderConfirmActivity.j() == null || !(orderConfirmActivity.j() instanceof com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g)) {
                            com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.f a4 = com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.f.a(orderConfirmActivity.g);
                            Object[] objArr4 = {str2};
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.f.a;
                            com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.e eVar = PatchProxy.isSupport(objArr4, a4, changeQuickRedirect4, false, "c583d615440f2ced443ffe64ff90f552", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.e) PatchProxy.accessDispatch(objArr4, a4, changeQuickRedirect4, false, "c583d615440f2ced443ffe64ff90f552") : a4.d.get(str2);
                            if (eVar != null) {
                                eVar.a(str2, map);
                            }
                        } else if (((com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g) orderConfirmActivity.j()).u != null) {
                            ((com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g) orderConfirmActivity.j()).u.a(str2, map);
                        }
                    }
                }
            }).a(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.dynamic.c.1
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Object[] objArr3 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1add39d88375da375baed4193522e69b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1add39d88375da375baed4193522e69b");
                        return;
                    }
                    c.a(false);
                    c.a(c.this, (DynamicDialog) null);
                    f a4 = f.a();
                    e eVar = c.this.c;
                    Object[] objArr4 = {eVar, "mach_event_activity_status"};
                    ChangeQuickRedirect changeQuickRedirect4 = f.a;
                    if (PatchProxy.isSupport(objArr4, a4, changeQuickRedirect4, false, "30df011f1c2862a6393c541b783b38c1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, a4, changeQuickRedirect4, false, "30df011f1c2862a6393c541b783b38c1");
                    } else {
                        List<com.sankuai.waimai.mach.container.b> list = a4.b.get("mach_event_activity_status");
                        if (list != null && !list.isEmpty()) {
                            int size = list.size() - 1;
                            while (true) {
                                if (size < 0) {
                                    break;
                                } else if (a4.a(list, eVar)) {
                                    list.remove(size);
                                    break;
                                } else {
                                    size--;
                                }
                            }
                        }
                    }
                    ae.a();
                }
            }).a();
            if (a3 != null && !a3.isEmpty()) {
                JudasManualManager.a(queryParameter3, 0, Dialog.class).a(a3).b();
            }
            if (this.b == null || this.b.getDialog() == null) {
                return;
            }
            this.b.getDialog().setCancelable(z);
            this.b.getDialog().setCanceledOnTouchOutside(z);
            ae.a(this.b.getDialog().getWindow());
        } catch (Exception e2) {
            i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_mach_alert_view").b(e2.toString()).c(queryParameter2).b(true).b());
        }
    }
}
