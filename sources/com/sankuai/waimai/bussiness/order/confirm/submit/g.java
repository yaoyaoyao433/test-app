package com.sankuai.waimai.bussiness.order.confirm.submit;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity;
import com.sankuai.waimai.bussiness.order.confirm.model.PreviewSubmitModel;
import com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.restaurant.dialog.BaseDialogWithCloseIcon;
import java.util.ArrayList;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static /* synthetic */ void a(DialogInterface dialogInterface, PreviewSubmitModel.ButtonItem buttonItem, b bVar, Activity activity, PreviewSubmitModel.ExtraParam extraParam, int i) {
        Object[] objArr = {dialogInterface, buttonItem, bVar, activity, extraParam, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "75670dd4a4d37b4b075a323731c2f9f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "75670dd4a4d37b4b075a323731c2f9f5");
            return;
        }
        switch (buttonItem.action) {
            case 1:
                if (bVar != null) {
                    bVar.f();
                    break;
                }
                break;
            case 2:
                if (!TextUtils.isEmpty(buttonItem.scheme)) {
                    if (buttonItem.scheme.contains("/menu") || buttonItem.scheme.contains("/foods")) {
                        com.sankuai.waimai.router.activity.d dVar = new com.sankuai.waimai.router.activity.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.submit.g.8
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.router.activity.d
                            public final boolean a(@NonNull com.sankuai.waimai.router.core.j jVar, @NonNull Intent intent) throws ActivityNotFoundException, SecurityException {
                                Object[] objArr2 = {jVar, intent};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4252dc1c11d8a9a4a6e1bfa4edd5fce1", RobustBitConfig.DEFAULT_VALUE)) {
                                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4252dc1c11d8a9a4a6e1bfa4edd5fce1")).booleanValue();
                                }
                                intent.addFlags(603979776);
                                jVar.c.startActivity(intent);
                                return true;
                            }
                        };
                        if (i == 44 || i == 51) {
                            buttonItem.scheme += "&window_has_show_reason=" + i + "&isopenshopcart=true";
                        }
                        com.sankuai.waimai.foundation.router.a.a().a(dVar).a(activity, buttonItem.scheme);
                        if ((activity instanceof OrderConfirmActivity) || (activity instanceof CrossOrderConfirmActivity)) {
                            activity.finish();
                            break;
                        }
                    } else {
                        com.sankuai.waimai.foundation.router.a.a(activity, buttonItem.scheme);
                        break;
                    }
                }
                break;
            case 3:
                if (bVar != null) {
                    bVar.h();
                    break;
                }
                break;
            case 4:
                if (bVar != null) {
                    bVar.i();
                    break;
                }
                break;
            case 5:
                if (bVar != null) {
                    bVar.a(extraParam);
                    if (extraParam != null) {
                        JudasManualManager.a("b_waimai_s1azrapf_mc").a(bVar.j()).a("reason", extraParam.medicareAlertCode).a(activity).a();
                        break;
                    }
                }
                break;
            case 6:
                if (bVar != null) {
                    bVar.b(extraParam);
                    if (extraParam != null) {
                        JudasManualManager.a("b_waimai_d1xpoakm_mc").a(bVar.j()).a("reason", extraParam.medicareAlertCode).a(activity).a();
                        break;
                    }
                }
                break;
        }
        dialogInterface.dismiss();
        int i2 = buttonItem.action;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), activity};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b0f026ce72ec421a2a3e91cff891b008", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b0f026ce72ec421a2a3e91cff891b008");
        } else if (i == 70 && !com.sankuai.waimai.foundation.utils.f.a(activity) && i2 == 8) {
            activity.finish();
        }
    }

    public static void a(final Activity activity, String str, final JSONObject jSONObject) {
        Object[] objArr = {activity, str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3652d733e5ad1a6168b5978e0ec4f775", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3652d733e5ad1a6168b5978e0ec4f775");
        } else if (jSONObject == null || TextUtils.isEmpty(str)) {
            ae.a(activity, (int) R.string.wm_order_confirm_look_up_in_order_list);
        } else {
            new RooAlertDialog.a(new ContextThemeWrapper(activity, 2131558627)).a(R.string.wm_order_base_remind).b(str).a(R.string.wm_order_confirm_look_up_order, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.submit.g.1
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f547500a303de6f743d19bc583a4c694", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f547500a303de6f743d19bc583a4c694");
                        return;
                    }
                    String optString = jSONObject.optString("hash_id");
                    if (!TextUtils.isEmpty(optString)) {
                        com.sankuai.waimai.platform.domain.manager.location.a.b(activity);
                        com.sankuai.waimai.bussiness.order.base.utils.i.a((Context) activity, optString);
                        return;
                    }
                    ae.a(activity, (int) R.string.wm_order_confirm_look_up_in_order_list);
                }
            }).b();
        }
    }

    public static void a(Activity activity, BaseResponse baseResponse, final b bVar) {
        Object[] objArr = {activity, baseResponse, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6da914a420dabbee2d11bdfd86cebfa9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6da914a420dabbee2d11bdfd86cebfa9");
        } else {
            new RooAlertDialog.a(new ContextThemeWrapper(activity, 2131558627)).b(baseResponse.msg).b(R.string.wm_order_confirm_dialog_button_text_back, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.submit.g.3
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "211e4b79b7668088cb07e9719313dd31", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "211e4b79b7668088cb07e9719313dd31");
                    } else {
                        dialogInterface.cancel();
                    }
                }
            }).a(R.string.wm_order_confirm_original_price_payment, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.submit.g.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a79cdca0df715f0ea87870fcb6058f1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a79cdca0df715f0ea87870fcb6058f1");
                        return;
                    }
                    if (b.this != null) {
                        b.this.d();
                    }
                    dialogInterface.dismiss();
                }
            }).b();
        }
    }

    public static void a(Activity activity, PreviewSubmitModel previewSubmitModel, b bVar, long j, String str) {
        Object[] objArr = {activity, previewSubmitModel, null, new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "725d419fd08a37c0c7b4d11db8cfd89e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "725d419fd08a37c0c7b4d11db8cfd89e");
        } else {
            a(activity, previewSubmitModel, (b) null, j, str, -1);
        }
    }

    public static void a(Activity activity, PreviewSubmitModel previewSubmitModel, b bVar, long j, String str, int i) {
        Object[] objArr = {activity, previewSubmitModel, bVar, new Long(j), str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd2ed8faa9e9e3ed4d4a59ef7686cc83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd2ed8faa9e9e3ed4d4a59ef7686cc83");
        } else {
            a(activity, previewSubmitModel, bVar, j, str, i, null, "");
        }
    }

    public static void a(Activity activity, PreviewSubmitModel previewSubmitModel, b bVar, long j, String str, int i, String str2) {
        Object[] objArr = {activity, previewSubmitModel, null, new Long(j), str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9ff2d13b7ff89c60d67f29618ce4d5b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9ff2d13b7ff89c60d67f29618ce4d5b9");
        } else {
            a(activity, previewSubmitModel, null, j, str, i, null, str2);
        }
    }

    public static void a(Activity activity, PreviewSubmitModel previewSubmitModel, b bVar, long j, String str, int i, DialogInterface.OnDismissListener onDismissListener) {
        Object[] objArr = {activity, previewSubmitModel, null, new Long(j), str, Integer.valueOf(i), onDismissListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "534ddcee40675570aa5b79b2951ceb1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "534ddcee40675570aa5b79b2951ceb1a");
        } else {
            a(activity, previewSubmitModel, null, j, str, i, onDismissListener, "");
        }
    }

    private static void a(final Activity activity, PreviewSubmitModel previewSubmitModel, final b bVar, final long j, final String str, final int i, DialogInterface.OnDismissListener onDismissListener, final String str2) {
        PreviewSubmitModel.ExtraParam extraParam;
        Activity activity2;
        PreviewSubmitModel.ExtraParam extraParam2;
        ArrayList<PreviewSubmitModel.ButtonItem> arrayList;
        int i2;
        Object[] objArr = {activity, previewSubmitModel, bVar, new Long(j), str, Integer.valueOf(i), onDismissListener, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c834597fc59f8cb4b65740e2d3ae085f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c834597fc59f8cb4b65740e2d3ae085f");
        } else if (previewSubmitModel == null || activity == null || activity.isFinishing()) {
        } else {
            final RichTextDialog richTextDialog = new RichTextDialog(activity);
            final PreviewSubmitModel.ExtraParam extraParam3 = previewSubmitModel.extraParam;
            richTextDialog.c = previewSubmitModel.title;
            if (onDismissListener != null) {
                richTextDialog.setOnDismissListener(onDismissListener);
            }
            richTextDialog.a(previewSubmitModel.content, j.a(previewSubmitModel.content, new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.submit.g.4
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c8c8dd5c00062dc6909076b1e22aaee4", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c8c8dd5c00062dc6909076b1e22aaee4");
                    } else {
                        RichTextDialog.this.dismiss();
                    }
                }
            }));
            ArrayList<PreviewSubmitModel.ButtonItem> arrayList2 = previewSubmitModel.buttonItemArrayList;
            if (arrayList2 != null) {
                if (arrayList2.size() == 1) {
                    final PreviewSubmitModel.ButtonItem buttonItem = arrayList2.get(0);
                    arrayList = arrayList2;
                    extraParam = extraParam3;
                    i2 = 1;
                    richTextDialog.a(buttonItem.text, new BaseDialogWithCloseIcon.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.submit.g.5
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.platform.restaurant.dialog.BaseDialogWithCloseIcon.a
                        public final void a(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b86aed03f693342cc6af3e0bbf7a4ab", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b86aed03f693342cc6af3e0bbf7a4ab");
                                return;
                            }
                            if (j != Long.MIN_VALUE) {
                                JudasManualManager.a("b_waimai_sg_7yzekp8d_mc").a("c_ykhs39e").a("button_code", 1).a("poi_id", com.sankuai.waimai.bussiness.order.base.utils.i.a(j, str)).a(activity).a();
                            }
                            if (!com.sankuai.waimai.business.order.api.submit.constants.a.e(str2)) {
                                g.a(richTextDialog, buttonItem, bVar, activity, extraParam3, i);
                            } else {
                                richTextDialog.dismiss();
                            }
                        }
                    });
                } else {
                    arrayList = arrayList2;
                    extraParam = extraParam3;
                    i2 = 1;
                }
                if (arrayList.size() == 2) {
                    ArrayList<PreviewSubmitModel.ButtonItem> arrayList3 = arrayList;
                    final PreviewSubmitModel.ButtonItem buttonItem2 = arrayList3.get(0);
                    final PreviewSubmitModel.ButtonItem buttonItem3 = arrayList3.get(i2);
                    final PreviewSubmitModel.ExtraParam extraParam4 = extraParam;
                    richTextDialog.b(buttonItem2.text, new BaseDialogWithCloseIcon.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.submit.g.6
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.platform.restaurant.dialog.BaseDialogWithCloseIcon.a
                        public final void a(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a9887a9e024d547dae12d1c2fa2f7e5", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a9887a9e024d547dae12d1c2fa2f7e5");
                                return;
                            }
                            if (!com.sankuai.waimai.business.order.api.submit.constants.a.e(str2)) {
                                g.a(richTextDialog, buttonItem2, bVar, activity, extraParam4, i);
                            } else {
                                richTextDialog.dismiss();
                            }
                            if (j != Long.MIN_VALUE) {
                                JudasManualManager.a("b_waimai_sg_7yzekp8d_mc").a("c_ykhs39e").a("poi_id", com.sankuai.waimai.bussiness.order.base.utils.i.a(j, str)).a("button_code", 1).a(activity).a();
                            }
                        }
                    });
                    richTextDialog.a(buttonItem3.text, new BaseDialogWithCloseIcon.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.submit.g.7
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.platform.restaurant.dialog.BaseDialogWithCloseIcon.a
                        public final void a(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d64c83719dffdb1c2f1e29f5620fe624", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d64c83719dffdb1c2f1e29f5620fe624");
                                return;
                            }
                            if (!com.sankuai.waimai.business.order.api.submit.constants.a.e(str2)) {
                                g.a(richTextDialog, buttonItem3, bVar, activity, extraParam4, i);
                            } else {
                                richTextDialog.dismiss();
                            }
                            if (j != Long.MIN_VALUE) {
                                JudasManualManager.a("b_waimai_sg_7yzekp8d_mc").a("c_ykhs39e").a("poi_id", com.sankuai.waimai.bussiness.order.base.utils.i.a(j, str)).a("button_code", 2).a(activity).a();
                            }
                        }
                    });
                }
            } else {
                extraParam = extraParam3;
            }
            richTextDialog.setCancelable(false);
            richTextDialog.show();
            if (bVar == null || (extraParam2 = extraParam) == null) {
                activity2 = activity;
            } else {
                activity2 = activity;
                JudasManualManager.b("b_waimai_nswvqw7b_mv").a(bVar.j()).a("reason", extraParam2.medicareAlertCode).a(activity2).a();
            }
            if (j != Long.MIN_VALUE) {
                JudasManualManager.b("b_waimai_sg_2ddpf342_mv").a("c_ykhs39e").a("poi_id", com.sankuai.waimai.bussiness.order.base.utils.i.a(j, str)).a(activity2).a();
            }
        }
    }

    public static void a(Activity activity, BaseResponse baseResponse, b bVar, long j, String str, int i) {
        PreviewSubmitModel previewSubmitModel;
        Object[] objArr = {activity, baseResponse, bVar, new Long(j), str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8eb3ae4e312e561e4154d406e4581ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8eb3ae4e312e561e4154d406e4581ca");
        } else if (baseResponse == null || baseResponse.data == 0) {
        } else {
            try {
                previewSubmitModel = (PreviewSubmitModel) new Gson().fromJson(baseResponse.data.toString(), (Class<Object>) PreviewSubmitModel.class);
            } catch (JsonSyntaxException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                previewSubmitModel = null;
            }
            a(activity, previewSubmitModel, bVar, j, str, i);
        }
    }
}
