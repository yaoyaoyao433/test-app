package com.meituan.android.pay.utils;

import android.app.Activity;
import android.app.Dialog;
import android.net.Uri;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.hellodialog.RealNameInfoDialog;
import com.meituan.android.pay.model.bean.Help;
import com.meituan.android.pay.widget.EditTextWithClearAndHelpButton;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j {
    public static ChangeQuickRedirect a;

    public static void a(Help help, EditTextWithClearAndHelpButton editTextWithClearAndHelpButton) {
        RealNameInfoDialog realNameInfoDialog;
        Object[] objArr = {help, editTextWithClearAndHelpButton};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c6d30748d2e41a83dd1b904771ee54c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c6d30748d2e41a83dd1b904771ee54c");
            return;
        }
        Activity a2 = com.meituan.android.paycommon.lib.utils.u.a(editTextWithClearAndHelpButton);
        if (a2 instanceof PayActivity) {
            if (help.getFactorExtend() == null) {
                String helpTitle = help.getHelpTitle();
                String helpText = help.getHelpText();
                String helpImgUrl = help.getHelpImgUrl();
                Object[] objArr2 = {a2, helpTitle, helpText, helpImgUrl};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.paycommon.lib.utils.j.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cdd079746a5d0efb818e0b4f2b8b76b6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cdd079746a5d0efb818e0b4f2b8b76b6");
                    return;
                }
                Object[] objArr3 = {a2, helpTitle, helpText, helpImgUrl, null, null, null, null};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.paycommon.lib.utils.j.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "8119dc9c5e776c3fdc791752ab89b7bb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "8119dc9c5e776c3fdc791752ab89b7bb");
                } else if (TextUtils.isEmpty(helpText) || a2 == null) {
                } else {
                    if (a2 instanceof PayBaseActivity) {
                        PayBaseActivity payBaseActivity = (PayBaseActivity) a2;
                        if (payBaseActivity.isFinishing() || payBaseActivity.m()) {
                            return;
                        }
                    }
                    Dialog dialog = new Dialog(a2, R.style.paycommon__transparent_dialog);
                    View inflate = View.inflate(a2, R.layout.paycommon__help_dialog, null);
                    if (!TextUtils.isEmpty(helpTitle)) {
                        ((TextView) inflate.findViewById(R.id.title)).setText(helpTitle);
                    } else {
                        inflate.findViewById(R.id.title).setVisibility(8);
                    }
                    ((TextView) inflate.findViewById(R.id.content)).setText(helpText);
                    ImageView imageView = (ImageView) inflate.findViewById(R.id.image);
                    if (!TextUtils.isEmpty(helpImgUrl)) {
                        imageView.setVisibility(0);
                        com.meituan.android.paycommon.lib.utils.w.a(helpImgUrl, imageView);
                    } else {
                        imageView.setVisibility(8);
                    }
                    if (!TextUtils.isEmpty(null)) {
                        TextView textView = (TextView) inflate.findViewById(R.id.function_btn);
                        textView.setVisibility(0);
                        textView.setText((CharSequence) null);
                        textView.setOnClickListener(com.meituan.android.paycommon.lib.utils.k.a(null, dialog));
                    }
                    if (!TextUtils.isEmpty(null)) {
                        ((TextView) inflate.findViewById(R.id.confirm_btn)).setText((CharSequence) null);
                    }
                    if (!TextUtils.isEmpty(null) && !TextUtils.isEmpty(null)) {
                        inflate.findViewById(R.id.alert_divider).setVisibility(0);
                    }
                    inflate.findViewById(R.id.confirm_btn).setOnClickListener(com.meituan.android.paycommon.lib.utils.l.a(null, dialog));
                    dialog.setContentView(inflate, new ViewGroup.LayoutParams((int) (((WindowManager) a2.getSystemService("window")).getDefaultDisplay().getWidth() * 0.8d), -2));
                    dialog.show();
                    com.meituan.android.paybase.common.analyse.a.a("b_q6hfh7em", new a.c().a("title", helpTitle).a("message", helpText).b);
                }
            } else if (help.getFactorExtend().getDisplayDialog() == null) {
            } else {
                Object[] objArr4 = {a2, help};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "c458d0f2a17bc4518947364ddde7103d", RobustBitConfig.DEFAULT_VALUE)) {
                    realNameInfoDialog = (RealNameInfoDialog) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "c458d0f2a17bc4518947364ddde7103d");
                } else {
                    com.meituan.android.paybase.common.analyse.a.a((String) null, "PayHelpDialog", new a.c().a("trans_id", com.meituan.android.paybase.common.analyse.b.b).b);
                    realNameInfoDialog = new RealNameInfoDialog(a2, help.getFactorExtend().getDisplayDialog(), null);
                }
                realNameInfoDialog.show();
            }
        }
    }

    public static HashMap<String, String> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ff5db79c161ffc241f48e7c3c3cd934", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ff5db79c161ffc241f48e7c3c3cd934");
        }
        JsonObject asJsonObject = new JsonParser().parse(str).getAsJsonObject();
        HashMap<String, String> hashMap = new HashMap<>();
        if (asJsonObject != null) {
            for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
                if (entry.getValue().isJsonArray()) {
                    hashMap.put(entry.getKey(), entry.getValue().toString());
                } else if (entry.getValue().isJsonObject()) {
                    hashMap.put(entry.getKey(), entry.getValue().toString());
                } else if (entry.getValue().isJsonPrimitive()) {
                    hashMap.put(entry.getKey(), entry.getValue().getAsString());
                }
            }
        }
        return hashMap;
    }

    public static HashMap<String, String> a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd48ddac2c92b91407b699790ad4c37b", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd48ddac2c92b91407b699790ad4c37b");
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (uri != null) {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (!com.meituan.android.paybase.utils.i.a(queryParameterNames)) {
                for (String str : queryParameterNames) {
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put(str, uri.getQueryParameter(str));
                    }
                }
            }
        }
        return hashMap;
    }
}
