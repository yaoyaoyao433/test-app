package com.sankuai.waimai.platform.capacity.network.errorhanding;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.foundation.utils.z;
import com.sankuai.waimai.platform.utils.sharedpreference.PlatformSPKeys;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a = null;
    public static String b = "";
    private static Dialog c;

    public static /* synthetic */ Dialog a(Dialog dialog) {
        c = null;
        return null;
    }

    public static /* synthetic */ boolean a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce01d73f66f186b21794c720438526db", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce01d73f66f186b21794c720438526db")).booleanValue() : context.getPackageManager().queryIntentActivities(new Intent(str), 65536).size() > 0;
    }

    @Nullable
    public static Dialog a(Exception exc, Activity activity) {
        Object[] objArr = {exc, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "75303ef312b0f8cbb08d020fd0837bd3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "75303ef312b0f8cbb08d020fd0837bd3");
        }
        if (activity != null) {
            e eVar = (e) exc;
            int statusCode = eVar.getStatusCode();
            String message = eVar.getMessage();
            Object[] objArr2 = {Integer.valueOf(statusCode), message, activity};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "165048448213a68ca6b93639aee50d7b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "165048448213a68ca6b93639aee50d7b");
            } else {
                a(statusCode, message, activity, false);
            }
            return c;
        }
        return null;
    }

    public static void a(int i, String str, final Activity activity, final boolean z) {
        DialogInterface.OnClickListener onClickListener;
        Object[] objArr = {Integer.valueOf(i), str, activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "053d9155a2dc4f7afc41456b92c0a954", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "053d9155a2dc4f7afc41456b92c0a954");
        } else if (activity == null) {
        } else {
            if (c != null && c.isShowing()) {
                com.sankuai.waimai.platform.widget.dialog.a.b(c);
                c = null;
            }
            String string = activity.getString(R.string.takeout_dialog_title_tips);
            String string2 = activity.getString(R.string.takeout_confirm);
            String string3 = activity.getString(R.string.dialog_btn_cancel);
            DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.platform.capacity.network.errorhanding.f.1
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "465f3a6fef2dca77ec1d2380862dd7dc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "465f3a6fef2dca77ec1d2380862dd7dc");
                    } else {
                        com.sankuai.waimai.platform.domain.manager.user.a.i().a(b.a.CANCEL);
                    }
                }
            };
            switch (i) {
                case 401:
                    str2 = activity.getString(R.string.takeout_login_signin);
                    onClickListener = new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.platform.capacity.network.errorhanding.f.5
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "993fb9d04094bb1c6ee230c8ac7fb9e3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "993fb9d04094bb1c6ee230c8ac7fb9e3");
                                return;
                            }
                            com.sankuai.waimai.platform.domain.manager.user.a.i();
                            com.sankuai.waimai.platform.domain.manager.user.a.a((Context) activity);
                        }
                    };
                    break;
                case 402:
                    str2 = activity.getString(R.string.takeout_user_locked_notice_call);
                    onClickListener = new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.platform.capacity.network.errorhanding.f.3
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6bd81a99972c0a91a965b401db0d84ed", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6bd81a99972c0a91a965b401db0d84ed");
                                return;
                            }
                            com.sankuai.waimai.platform.domain.manager.user.a.i().a(b.a.CANCEL);
                            z.a(activity, com.sankuai.waimai.platform.utils.sharedpreference.a.a().b((com.sankuai.waimai.foundation.utils.e) PlatformSPKeys.customer_service_phone, activity.getString(R.string.service_phone_default)));
                        }
                    };
                    break;
                case 403:
                    String string4 = activity.getString(R.string.takeout_user_locked_notice_go_unlock);
                    DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.platform.capacity.network.errorhanding.f.4
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91fcfbde6bf8d9c6719179e02cb3f0af", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91fcfbde6bf8d9c6719179e02cb3f0af");
                            } else if (TextUtils.isEmpty(f.b)) {
                                com.sankuai.waimai.platform.domain.manager.user.a.i().a(b.a.CANCEL);
                            } else {
                                String string5 = activity.getResources().getString(R.string.user_unlock_action);
                                if (TextUtils.isEmpty(string5) || !f.a(activity, string5)) {
                                    return;
                                }
                                Intent intent = new Intent(string5);
                                intent.putExtra("username", f.b);
                                activity.startActivity(intent);
                            }
                        }
                    };
                    b = com.sankuai.waimai.platform.domain.manager.user.a.i().g();
                    str2 = string4;
                    onClickListener = onClickListener3;
                    onClickListener2 = null;
                    break;
                case 404:
                    string3 = activity.getString(R.string.takeout_user_locked_notice_known);
                    onClickListener = null;
                    break;
                case 405:
                    str2 = activity.getString(R.string.takeout_user_locked_notice_call);
                    onClickListener = new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.platform.capacity.network.errorhanding.f.2
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14e8770ffb67c4c7453bc13854cf9ce6", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14e8770ffb67c4c7453bc13854cf9ce6");
                                return;
                            }
                            com.sankuai.waimai.platform.domain.manager.user.a.i().a(b.a.CANCEL);
                            z.a(activity, com.sankuai.waimai.platform.utils.sharedpreference.a.a().b((com.sankuai.waimai.foundation.utils.e) PlatformSPKeys.key_bind_phone_kf_phone, activity.getString(R.string.service_user_safe_phone_default)));
                        }
                    };
                    break;
                default:
                    str2 = string2;
                    onClickListener = null;
                    break;
            }
            if (!activity.isFinishing()) {
                CustomDialog b2 = new CustomDialog.a(activity).a(string).b(str).a(str2, onClickListener).b(string3, onClickListener2).b();
                c = b2;
                if (b2 != null) {
                    c.setOwnerActivity(activity);
                    c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.platform.capacity.network.errorhanding.f.6
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            Object[] objArr2 = {dialogInterface};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3e873db402174c916c742bc2c3520fd", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3e873db402174c916c742bc2c3520fd");
                            } else if (f.c == dialogInterface) {
                                if (z && f.c.getOwnerActivity() != null) {
                                    f.c.getOwnerActivity().finish();
                                }
                                f.a(null);
                            }
                        }
                    });
                }
            }
            if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                try {
                    com.sankuai.waimai.platform.domain.manager.user.a.i().a(i, str, activity);
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.b(e);
                }
            }
        }
    }
}
