package com.sankuai.waimai.bussiness.order.base.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.meituan.roodesign.widgets.toast.RooToast;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.order.api.detail.model.RiderInfo;
import com.sankuai.waimai.business.order.api.detail.model.b;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.bussiness.order.base.net.OrderApi;
import com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog.PriorityCustomDialog;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ac;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.y;
import com.sankuai.waimai.foundation.utils.z;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import com.sankuai.waimai.platform.widget.dial.presenter.DialContract;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import com.sankuai.waimai.router.core.j;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i {
    public static ChangeQuickRedirect a = null;
    public static int b = 0;
    public static int c = 1;

    public static boolean a(int i) {
        return i == 1;
    }

    public static boolean b(int i) {
        return i == 2;
    }

    public static /* synthetic */ void a(String str, boolean z, int i, final Activity activity, final String str2, final String str3, final String str4, final String str5) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), 3000, activity, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60d4f582dcf53671881e0645cd68db45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60d4f582dcf53671881e0645cd68db45");
            return;
        }
        Object[] objArr2 = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = y.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a248da08af8b797fd533a349db1c39e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a248da08af8b797fd533a349db1c39e0");
        } else if (activity != null) {
            View findViewById = activity.findViewById(16908290);
            Object[] objArr3 = {findViewById, str, -1, 17};
            ChangeQuickRedirect changeQuickRedirect3 = y.a;
            (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "8a4e939aebe21525021dd67061981848", RobustBitConfig.DEFAULT_VALUE) ? (RooToast) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "8a4e939aebe21525021dd67061981848") : RooToast.a(findViewById, str, 0)).a();
        }
        if (!z || activity.isFinishing()) {
            return;
        }
        ad.a(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.base.utils.i.9
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "dfbd626cd2e416491efe595326c41ef3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "dfbd626cd2e416491efe595326c41ef3");
                } else {
                    i.b(activity, str2, str3, str4, str5);
                }
            }
        }, 3000);
    }

    public static void a(Context context, String str, boolean z, boolean z2, int i) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e4417cc535e96d86ba8f651621ee2a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e4417cc535e96d86ba8f651621ee2a4");
            return;
        }
        com.sankuai.waimai.platform.domain.manager.bubble.a.a().b();
        com.sankuai.waimai.router.common.b bVar = new com.sankuai.waimai.router.common.b(context, com.sankuai.waimai.foundation.router.interfaces.c.S);
        bVar.a("hash_id", str);
        bVar.a("first_time_visist", true);
        if (z) {
            bVar.a("from_pay_to_order_detail", true);
            bVar.a("is_auto_start_when_pay_result_ok", i == -1);
        }
        if (z2) {
            bVar.a("order_from_mt_other_channel", z2);
        }
        Object[] objArr2 = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.router.common.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "3926d989b17111ec15b24f187a5a8499", RobustBitConfig.DEFAULT_VALUE)) {
            bVar = (com.sankuai.waimai.router.common.b) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "3926d989b17111ec15b24f187a5a8499");
        } else {
            bVar.a("com.sankuai.waimai.router.activity.limit_package", (String) Boolean.TRUE);
        }
        bVar.b(new com.sankuai.waimai.router.core.e() { // from class: com.sankuai.waimai.bussiness.order.base.utils.i.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.router.core.e
            public final void a(@NonNull j jVar) {
            }

            @Override // com.sankuai.waimai.router.core.e
            public final void a(@NonNull j jVar, int i2) {
                Object[] objArr3 = {jVar, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d3a0b8385230f75587e13a78d60429b8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d3a0b8385230f75587e13a78d60429b8");
                } else {
                    com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("show_order_detail").b());
                }
            }
        }).g();
    }

    public static void a(Context context, String str, boolean z, int i) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d2d5865528856257c77f2c6673a997d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d2d5865528856257c77f2c6673a997d");
        } else {
            a(context, str, z, false, i);
        }
    }

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "28852e2c13ee895a9cf4ed40dc3ae249", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "28852e2c13ee895a9cf4ed40dc3ae249");
        } else {
            a(context, str, false, 0);
        }
    }

    private static void a(Context context, String str, final View.OnClickListener onClickListener) {
        Object[] objArr = {context, str, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55fa46d79b313b6b4581daa2461201c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55fa46d79b313b6b4581daa2461201c4");
        } else {
            new RooAlertDialog.a(new ContextThemeWrapper(context, 2131558958)).a(R.string.wm_order_base_remind).b(str).a(R.string.wm_order_base_i_know, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.base.utils.i.10
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a2d89857e4039888acb1a4e9a607710", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a2d89857e4039888acb1a4e9a607710");
                    } else if (onClickListener != null) {
                        onClickListener.onClick(null);
                    }
                }
            }).b();
        }
    }

    public static void a(Context context, String str, int i, List<com.sankuai.waimai.platform.domain.core.order.a> list, final View.OnClickListener onClickListener) {
        Object[] objArr = {context, str, Integer.valueOf(i), list, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91c780989f3fa3d3624db6b1a51c32b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91c780989f3fa3d3624db6b1a51c32b6");
        } else if (com.sankuai.waimai.foundation.utils.d.a(list)) {
            if (TextUtils.isEmpty(str)) {
                str = context.getString(R.string.wm_order_confirm_lack_goods);
            }
            a(context, str, onClickListener);
        } else {
            JsonObject jsonObject = new JsonObject();
            try {
                Gson a2 = com.sankuai.waimai.mach.utils.b.a();
                jsonObject.add("missingfoods", a2.toJsonTree(list));
                jsonObject.add("code", a2.toJsonTree(Integer.valueOf(i)));
            } catch (Exception unused) {
            }
            if (jsonObject.has("missingfoods")) {
                com.sankuai.waimai.bussiness.order.confirm.request.dynamic.b.a((Activity) context).a("waimai_order_order_confirm_soldout_alert_style_1").a(jsonObject).a(new com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a() { // from class: com.sankuai.waimai.bussiness.order.base.utils.i.11
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a
                    public final void a(String str2, Map<String, Object> map, DynamicDialog dynamicDialog) {
                        Object[] objArr2 = {str2, map, dynamicDialog};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eeb379eee41db14830e18ef67f24d6ba", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eeb379eee41db14830e18ef67f24d6ba");
                        } else if ("alert_confirm".equals(str2)) {
                            if (onClickListener != null) {
                                onClickListener.onClick(dynamicDialog.getContentView());
                            }
                            dynamicDialog.dismiss();
                        }
                    }
                }).a();
            } else {
                a(context, str, onClickListener);
            }
        }
    }

    public static void a(final Activity activity, final String str, final String str2, boolean z, String str3, final String str4, final String str5) {
        Object[] objArr = {activity, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "941088d51d47bfe0a040528363bf0f9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "941088d51d47bfe0a040528363bf0f9f");
        } else if (activity == null || activity.isFinishing()) {
        } else {
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(activity).inflate(R.layout.wm_order_base_dialog_confirm_receive, (ViewGroup) null);
            ((TextView) linearLayout.findViewById(R.id.tv_title)).setText(z ? R.string.wm_order_make_sure_got_good : R.string.wm_order_make_sure_good_arrival);
            ((TextView) linearLayout.findViewById(R.id.tv_message)).setText(R.string.wm_order_make_sure_good_arrival_tip);
            ImageView imageView = (ImageView) linearLayout.findViewById(R.id.iv_image);
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = imageView.getContext();
            a2.c = str3;
            a2.f = ImageQualityUtil.b();
            a2.i = R.drawable.wm_common_poi_default;
            a2.a(imageView);
            RooAlertDialog.a aVar = new RooAlertDialog.a(new ContextThemeWrapper(activity, 2131558963));
            aVar.a(linearLayout);
            aVar.b(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.base.utils.i.12
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "280a66329c9072415ae3bb7044d9b5ab", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "280a66329c9072415ae3bb7044d9b5ab");
                    }
                }
            });
            aVar.a(R.string.wm_order_confirm_receive, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.base.utils.i.13
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "73c67364f7fc97852e38ace28d575df5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "73c67364f7fc97852e38ace28d575df5");
                    } else {
                        i.a(activity, str2, str4, str5, str);
                    }
                }
            });
            aVar.a(false);
            aVar.b();
        }
    }

    public static void a(final Activity activity, final String str, final String str2, final String str3, final String str4) {
        Object[] objArr = {activity, str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "edf03169484c4d47d805d295cf8902dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "edf03169484c4d47d805d295cf8902dc");
            return;
        }
        final Dialog a2 = com.sankuai.waimai.platform.widget.dialog.a.a(activity);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((OrderApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderApi.class)).confirmReceiveFood(str), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.bussiness.order.base.model.b>>() { // from class: com.sankuai.waimai.bussiness.order.base.utils.i.14
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                Activity activity2;
                int i;
                String string;
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d57ae90ea6156e6439fbce6448c189a9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d57ae90ea6156e6439fbce6448c189a9");
                    return;
                }
                com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                if (baseResponse != null && baseResponse.code == 0) {
                    final boolean z = baseResponse.data != 0 && ((com.sankuai.waimai.bussiness.order.base.model.b) baseResponse.data).c == 1;
                    if (baseResponse.data == 0 || TextUtils.isEmpty(((com.sankuai.waimai.bussiness.order.base.model.b) baseResponse.data).b)) {
                        if (z) {
                            activity2 = activity;
                            i = R.string.wm_order_confirm_receive_success_and_go;
                        } else {
                            activity2 = activity;
                            i = R.string.wm_order_confirm_receive_success;
                        }
                        string = activity2.getString(i);
                    } else {
                        string = ((com.sankuai.waimai.bussiness.order.base.model.b) baseResponse.data).b;
                    }
                    final String str5 = string;
                    if (baseResponse.data != 0 && ((com.sankuai.waimai.bussiness.order.base.model.b) baseResponse.data).a != null) {
                        PriorityCustomDialog.a a3 = new PriorityCustomDialog.a(activity).a(((com.sankuai.waimai.bussiness.order.base.model.b) baseResponse.data).a.a).a((Object) "CouponDialog").b("containerFlag_orderdetail").a(com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog.a.NORMAL).a(R.drawable.wm_order_ic_coupon_poi).a((CharSequence) ((com.sankuai.waimai.bussiness.order.base.model.b) baseResponse.data).a.b).b((CharSequence) ((com.sankuai.waimai.bussiness.order.base.model.b) baseResponse.data).a.c).a(false);
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.base.utils.i.14.1
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                Object[] objArr3 = {dialogInterface, Integer.valueOf(i2)};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "165cdcf2d95ef8e47e3fff64c5d6a66e", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "165cdcf2d95ef8e47e3fff64c5d6a66e");
                                } else {
                                    i.a(str5, z, 3000, activity, str4, str, str2, str3);
                                }
                            }
                        };
                        Object[] objArr3 = {Integer.valueOf((int) R.string.known), onClickListener};
                        ChangeQuickRedirect changeQuickRedirect3 = PriorityCustomDialog.a.a;
                        (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "11290d903c3b66e6537092e535396324", RobustBitConfig.DEFAULT_VALUE) ? (PriorityCustomDialog.a) PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "11290d903c3b66e6537092e535396324") : a3.a(a3.c(R.string.known), onClickListener)).b();
                    } else {
                        i.a(str5, z, 3000, activity, str4, str, str2, str3);
                    }
                    SubmitOrderManager.getInstance().updateOrderStatus();
                    com.sankuai.waimai.platform.domain.manager.bubble.a.a().b();
                } else if (baseResponse != null && !TextUtils.isEmpty(baseResponse.msg)) {
                    ae.a(activity, baseResponse.msg);
                } else {
                    ae.a(activity, (int) R.string.wm_order_confirm_receive_failed);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c820c5448f9fa139d61ce8f84088f67c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c820c5448f9fa139d61ce8f84088f67c");
                    return;
                }
                com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                ae.a(activity, (int) R.string.wm_order_confirm_receive_failed);
                com.sankuai.waimai.foundation.utils.log.a.a(th);
            }
        }, str4);
    }

    public static void b(@Nullable Context context, @Nullable String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d28d4732d76f77319ec5a052f9cfdf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d28d4732d76f77319ec5a052f9cfdf0");
        } else if (context != null) {
            if (TextUtils.isEmpty(str)) {
                ae.b(context, context.getString(R.string.wm_widget_no_useable_phones));
            } else if (ac.a(context)) {
                z.a(context, str);
            } else {
                ae.b(context, context.getString(R.string.wm_order_orderProgress_telephonyDisable));
            }
        }
    }

    public static void c(@Nullable Context context, @Nullable String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2dc5fb10163c79d964288002a16a14f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2dc5fb10163c79d964288002a16a14f3");
        } else if (context != null) {
            if (TextUtils.isEmpty(str)) {
                ae.a(context, (int) R.string.wm_widget_no_useable_phones);
            } else if (ac.a(context)) {
                z.a(context, str);
            } else {
                ae.a(context, (int) R.string.wm_order_orderProgress_telephonyDisable);
            }
        }
    }

    public static void a(Context context, String str, String str2, String str3, int i, DialContract.a aVar) {
        Object[] objArr = {context, str, str2, str3, Integer.valueOf(i), null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8ea47bd67eb1ff37d819fbe068537e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8ea47bd67eb1ff37d819fbe068537e4");
        } else if (context != null) {
            if (TextUtils.isEmpty(str3)) {
                ae.a(context, (int) R.string.wm_widget_no_useable_phones);
            } else if (ac.a(context)) {
                com.sankuai.waimai.platform.widget.dial.injection.a.a(context).a(str, str3, str2, i, (DialContract.a) null);
            } else {
                ae.a(context, (int) R.string.wm_order_orderProgress_telephonyDisable);
            }
        }
    }

    public static void a(final Activity activity, String[]... strArr) {
        Object[] objArr = {activity, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eed90e588bae9f5d0c0d646dd80a9279", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eed90e588bae9f5d0c0d646dd80a9279");
        } else if (activity != null) {
            if (!ac.a(activity)) {
                new Handler(activity.getMainLooper()).post(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.base.utils.i.15
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f14cd220a0d853e4339441c515f82219", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f14cd220a0d853e4339441c515f82219");
                        } else {
                            ae.b(activity, activity.getString(R.string.wm_order_orderProgress_telephonyDisable));
                        }
                    }
                });
                return;
            }
            int i = 0;
            for (int i2 = 0; i2 <= 0; i2++) {
                String[] strArr2 = strArr[0];
                if (strArr2 != null) {
                    i = strArr2.length + 0;
                }
            }
            if (i == 0) {
                ae.b(activity, activity.getString(R.string.wm_widget_no_useable_phones));
                return;
            }
            final String[] strArr3 = new String[i];
            int i3 = 0;
            for (int i4 = 0; i4 <= 0; i4++) {
                String[] strArr4 = strArr[i4];
                if (strArr4 != null) {
                    int i5 = i3;
                    int i6 = 0;
                    while (i6 < strArr4.length) {
                        strArr3[i5] = strArr4[i6];
                        i6++;
                        i5++;
                    }
                    i3 = i5;
                }
            }
            new CustomDialog.a(activity).c(R.string.wm_order_detail_phone_call).a(strArr3, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.base.utils.i.17
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i7)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "564ef28785dbcf8baffdb26965fe8e40", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "564ef28785dbcf8baffdb26965fe8e40");
                    } else {
                        z.a(activity, strArr3[i7]);
                    }
                }
            }).b(R.string.dialog_btn_cancel, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.base.utils.i.16
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i7)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e48110d50faaef019c1ca0e83d8fe4f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e48110d50faaef019c1ca0e83d8fe4f");
                    }
                }
            }).c();
        }
    }

    public static void b(final Activity activity, String[]... strArr) {
        Object[] objArr = {activity, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67e49f53ca3980655c5af2b7a561712d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67e49f53ca3980655c5af2b7a561712d");
        } else if (activity != null) {
            if (!ac.a(activity)) {
                new Handler(activity.getMainLooper()).post(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.base.utils.i.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "034b1c8ac724f31dd3cca2604fe0a437", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "034b1c8ac724f31dd3cca2604fe0a437");
                        } else {
                            ae.a(activity, (int) R.string.wm_order_orderProgress_telephonyDisable);
                        }
                    }
                });
                return;
            }
            int i = 0;
            for (String[] strArr2 : strArr) {
                if (strArr2 != null) {
                    i += strArr2.length;
                }
            }
            if (i == 0) {
                ae.a(activity, (int) R.string.wm_widget_no_useable_phones);
                return;
            }
            final String[] strArr3 = new String[i];
            int i2 = 0;
            for (String[] strArr4 : strArr) {
                if (strArr4 != null) {
                    int i3 = i2;
                    int i4 = 0;
                    while (i4 < strArr4.length) {
                        strArr3[i3] = strArr4[i4];
                        i4++;
                        i3++;
                    }
                    i2 = i3;
                }
            }
            new CustomDialog.a(activity).c(R.string.wm_order_detail_phone_call).a(strArr3, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.base.utils.i.4
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i5)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "24a075e5bcfa70a0b4defbde0668cb47", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "24a075e5bcfa70a0b4defbde0668cb47");
                    } else {
                        z.a(activity, strArr3[i5]);
                    }
                }
            }).b(R.string.dialog_btn_cancel, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.base.utils.i.3
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i5)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "25b9b3d79b4707abac7af3a80cff9233", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "25b9b3d79b4707abac7af3a80cff9233");
                    }
                }
            }).c();
        }
    }

    public static void a(@NonNull final Context context, String str, boolean z, boolean z2, @Nullable String str2, String str3) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e054f1836e78781c9582acc2727eeb5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e054f1836e78781c9582acc2727eeb5d");
        } else if (!ac.a(context)) {
            new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.base.utils.i.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5ac26e322ae3655a0b3f25eaa300db2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5ac26e322ae3655a0b3f25eaa300db2");
                    } else {
                        ae.a(context, (int) R.string.wm_order_orderProgress_telephonyDisable);
                    }
                }
            });
        } else if (str2 == null) {
            ae.a(context, (int) R.string.wm_widget_no_useable_phones);
        } else if (z2) {
            com.sankuai.waimai.platform.widget.dial.injection.a.a(context).a(str, str2, str3, 0, new DialContract.a() { // from class: com.sankuai.waimai.bussiness.order.base.utils.i.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.a
                public final void a(String str4) {
                    Object[] objArr2 = {str4};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d5dc96b07a3bf032ac1ed39552f0f4a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d5dc96b07a3bf032ac1ed39552f0f4a");
                    } else {
                        i.e(context, str4);
                    }
                }
            });
        } else if (z && !TextUtils.isEmpty(str2)) {
            com.sankuai.waimai.platform.widget.dial.injection.a.a(context).a(str, str2, str3, 0);
        } else {
            e(context, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(final Context context, final String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f49311d73a957d7ca2baf5ade50c7f81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f49311d73a957d7ca2baf5ade50c7f81");
        } else {
            new CustomDialog.a(context).b(str).a(R.string.wm_order_base_call, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.base.utils.i.7
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a6fbaa7d60814785f8c3a6a3f2d15252", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a6fbaa7d60814785f8c3a6a3f2d15252");
                    } else {
                        z.a(context, str);
                    }
                }
            }).b(R.string.wm_order_base_cancel, (DialogInterface.OnClickListener) null).a(false).b();
        }
    }

    public static void a(Context context, String str, String str2, int i, String[]... strArr) {
        Object[] objArr = {context, str, str2, Integer.valueOf(i), strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54e75ecba67915bb51ef6b66b157ec8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54e75ecba67915bb51ef6b66b157ec8f");
        } else {
            a(context, str, str2, i, (DialContract.a) null, strArr);
        }
    }

    public static void a(final Context context, String str, String str2, int i, DialContract.a aVar, String[]... strArr) {
        Object[] objArr = {context, str, str2, Integer.valueOf(i), aVar, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "78cd877f5c1a33a04ed10d747bbab316", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "78cd877f5c1a33a04ed10d747bbab316");
        } else if (context != null && strArr != null) {
            if (!ac.a(context)) {
                new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.base.utils.i.8
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "429654b2997e7a04d3606eb6b57060ab", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "429654b2997e7a04d3606eb6b57060ab");
                        } else {
                            ae.a(context, (int) R.string.wm_order_orderProgress_telephonyDisable);
                        }
                    }
                });
                return;
            }
            int i2 = 0;
            for (String[] strArr2 : strArr) {
                if (strArr2 != null) {
                    i2 += strArr2.length;
                }
            }
            if (i2 == 0) {
                ae.a(context, (int) R.string.wm_widget_no_useable_phones);
                return;
            }
            ArrayList<String> arrayList = new ArrayList<>();
            for (String[] strArr3 : strArr) {
                if (strArr3 != null) {
                    for (String str3 : strArr3) {
                        if (!TextUtils.isEmpty(str3)) {
                            arrayList.add(str3);
                        }
                    }
                }
            }
            com.sankuai.waimai.platform.widget.dial.injection.a.a(context).a(str, arrayList, str2, i, aVar);
        }
    }

    public static String[] a(com.sankuai.waimai.business.order.api.detail.model.b bVar, boolean z) {
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96063452a7fb1d1c548d09d195f96511", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96063452a7fb1d1c548d09d195f96511");
        }
        if (bVar == null) {
            return null;
        }
        return a(bVar.h, z);
    }

    private static String[] a(List<b.a> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "16035fff3d5adf086c881e5f23b84a3d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "16035fff3d5adf086c881e5f23b84a3d");
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (b.a aVar : list) {
                if (aVar != null && aVar.a == b && aVar.d != null) {
                    arrayList.addAll(aVar.d);
                }
            }
        }
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            b.c cVar = (b.c) arrayList.get(i);
            if (z) {
                strArr[i] = cVar.c;
            } else {
                strArr[i] = cVar.b + ": " + cVar.c;
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return strArr;
    }

    @Nullable
    public static String[] a(RiderInfo riderInfo, boolean z) {
        Object[] objArr = {riderInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ce0db2c18c904327d42fcb3346f519c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ce0db2c18c904327d42fcb3346f519c");
        }
        if (riderInfo == null) {
            return null;
        }
        return b(riderInfo.i, z);
    }

    @Nullable
    private static String[] b(List<RiderInfo.b> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9201ffb213882a96c58b79f44462136", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9201ffb213882a96c58b79f44462136");
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (RiderInfo.b bVar : list) {
                if (bVar != null && bVar.a == b && !TextUtils.isEmpty(bVar.c)) {
                    if (z) {
                        arrayList.add(bVar.c);
                    } else {
                        arrayList.add(com.meituan.android.singleton.b.a.getString(R.string.wm_order_base_phone_of_rider, bVar.c));
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static void a(int i, String str, Activity activity, Map<String, String> map) {
        Object[] objArr = {Integer.valueOf(i), str, activity, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3dd8a1e86394d51953f64a5c43b41273", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3dd8a1e86394d51953f64a5c43b41273");
            return;
        }
        try {
            switch (i) {
                case 1:
                    z.a(activity, str);
                    return;
                case 2:
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    "/cart/bill".equals(Uri.parse(str).getPath());
                    if (map != null) {
                        com.sankuai.waimai.foundation.router.a.a(activity, str, map);
                        return;
                    } else {
                        com.sankuai.waimai.foundation.router.a.a(activity, str);
                        return;
                    }
                default:
                    return;
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }

    public static void a(RiderInfo riderInfo, com.sankuai.waimai.business.order.api.detail.model.b bVar) {
        List<b.a> list;
        List<RiderInfo.b> list2;
        Object[] objArr = {riderInfo, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4acdb0508421c449d035b69f212156f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4acdb0508421c449d035b69f212156f");
        } else if (com.sankuai.waimai.imbase.manager.b.a().b()) {
        } else {
            if (riderInfo != null && (list2 = riderInfo.i) != null && !list2.isEmpty()) {
                Iterator<RiderInfo.b> it = list2.iterator();
                while (it.hasNext()) {
                    RiderInfo.b next = it.next();
                    if (next != null && next.a == c) {
                        it.remove();
                        if (!com.sankuai.waimai.imbase.manager.b.a().c()) {
                            com.sankuai.waimai.imbase.manager.b.a().a("order-inconsistent_rider_im_switch");
                        }
                    }
                }
            }
            if (bVar == null || (list = bVar.h) == null || list.isEmpty()) {
                return;
            }
            Iterator<b.a> it2 = list.iterator();
            while (it2.hasNext()) {
                b.a next2 = it2.next();
                if (next2 != null && next2.a == c) {
                    it2.remove();
                    if (!com.sankuai.waimai.imbase.manager.b.a().c()) {
                        com.sankuai.waimai.imbase.manager.b.a().a("order-inconsistent_poi_im_switch");
                    }
                }
            }
        }
    }

    public static void b(Activity activity, String str, String str2, String str3, String str4) {
        Object[] objArr = {activity, str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "05c6ba1703dd7db39f37ff4b6514577b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "05c6ba1703dd7db39f37ff4b6514577b");
        } else if (activity == null || activity.isFinishing()) {
        } else {
            com.sankuai.waimai.business.order.api.orderlist.a.a(activity, str, str2, str3, str4, null, "1");
        }
    }

    public static void a(Activity activity, String str, int i, String str2) {
        Object[] objArr = {activity, str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "23f7f7f9ac3ad3d72b7ed5bd54a2fed3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "23f7f7f9ac3ad3d72b7ed5bd54a2fed3");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (str.contains("mrn_biz=waimai") && com.sankuai.waimai.platform.capacity.abtest.f.a(activity, "order_h5_pay_by_friend_android")) {
                com.sankuai.waimai.foundation.router.a.a(activity, com.sankuai.waimai.platform.capacity.abtest.f.a() + "/c/payByAnother.html?order_view_id=" + str2 + "&requestForResult=true", (Bundle) null, i);
                return;
            }
            com.sankuai.waimai.foundation.router.a.a(activity, str, (Bundle) null, i);
        }
    }

    public static void a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f7e9ddf16133dda73bfa52407565777b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f7e9ddf16133dda73bfa52407565777b");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("share_card_title");
            String optString2 = jSONObject.optString("share_card_url");
            String optString3 = jSONObject.optString("main_desc_prefix");
            String optString4 = jSONObject.optString("main_desc_suffix");
            String optString5 = jSONObject.optString("time_detail_desc");
            String[] b2 = com.sankuai.waimai.platform.utils.time.b.b((long) jSONObject.optDouble("formatted_time"));
            View inflate = activity.getLayoutInflater().inflate(R.layout.wm_order_friend_pay_share_layout, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.txt_time_minute);
            TextView textView2 = (TextView) inflate.findViewById(R.id.txt_time_second);
            ((TextView) inflate.findViewById(R.id.txt_subtitle)).setText(optString3);
            ((TextView) inflate.findViewById(R.id.txt_price)).setText(optString4);
            ((TextView) inflate.findViewById(R.id.txt_time_to_pay)).setText(optString5);
            if (b2 != null && b2.length == 3) {
                textView.setText(b2[1]);
                textView2.setText(b2[2]);
            }
            inflate.measure(View.MeasureSpec.makeMeasureSpec(com.sankuai.waimai.foundation.utils.g.a(activity, 210.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
            Bitmap a2 = com.sankuai.waimai.foundation.utils.c.a(inflate, 0);
            File a3 = q.a(com.meituan.android.singleton.b.a, "waimai", "local_share", u.e);
            String str2 = a3.getAbsolutePath() + File.separator;
            if (!a3.exists()) {
                a3.mkdirs();
            }
            com.sankuai.waimai.foundation.utils.j.b(str2);
            String str3 = str2 + System.currentTimeMillis() + "_friend_pay_share.jpg";
            File file = new File(str3);
            if (file.exists()) {
                file.delete();
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                a2.compress(str3.endsWith(CommonConstant.File.JPG) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG, 90, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Exception unused) {
            }
            Object[] objArr2 = {activity, optString, optString2, str3, "test", "c_waimai_quudo2x6"};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.share.b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "346443c53d7fb74ef0a136f98fff312d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "346443c53d7fb74ef0a136f98fff312d");
            } else {
                com.sankuai.waimai.share.b.b.a(activity, optString, optString2, str3, "test", "c_waimai_quudo2x6");
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }

    public static Map<String, String> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07a0c485e1d0d6f0bca3784c62767f15", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07a0c485e1d0d6f0bca3784c62767f15");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return a(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    private static HashMap<String, String> a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "147c95dcd024adcac1f85f97f0ea469d", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "147c95dcd024adcac1f85f97f0ea469d");
        }
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    hashMap.putAll(a((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    hashMap.put(next, obj.toString());
                } else {
                    hashMap.put(next, String.valueOf(obj));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return hashMap;
    }

    public static String a(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ffc3df773d5271deb8d085f1ae29abd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ffc3df773d5271deb8d085f1ae29abd") : !aa.a(str) ? str : String.valueOf(j);
    }

    public static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "12fb7fbda4d6d15ecd4f4a47a065488c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "12fb7fbda4d6d15ecd4f4a47a065488c") : !aa.a(str2) ? str2 : str;
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f2b65716f11c26ae9fcd06156421b79", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f2b65716f11c26ae9fcd06156421b79") : aa.a(str) ? "" : str;
    }

    public static boolean b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b52cb1e351c3e9909b4b7da6216860aa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b52cb1e351c3e9909b4b7da6216860aa")).booleanValue();
        }
        if (aa.a(str) || aa.a(str2)) {
            return false;
        }
        return TextUtils.equals(str, str2);
    }
}
