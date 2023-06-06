package com.sankuai.waimai.foundation.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class z {
    public static ChangeQuickRedirect a;

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd477b4abc44778e03d2beb2c6641569", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd477b4abc44778e03d2beb2c6641569");
        } else if (context == null) {
        } else {
            if (TextUtils.isEmpty(str)) {
                ae.a(context, (int) R.string.wm_platform_system_no_available_phone);
            } else if (!ac.a(context)) {
                ae.a(context, (int) R.string.wm_platform_system_phone_not_connected);
            } else {
                try {
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str));
                    if (!(context instanceof Activity)) {
                        intent.addFlags(com.tencent.mapsdk.internal.y.a);
                    }
                    context.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    ae.a(context, (int) R.string.wm_platform_system_cannot_call);
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.e("StartSystemApp", e.getMessage(), new Object[0]);
                }
            }
        }
    }

    public static void a(Activity activity, int i) {
        Intent intent;
        Object[] objArr = {activity, 2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1e23a616b6e03dc8d9b700be8f35b36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1e23a616b6e03dc8d9b700be8f35b36");
            return;
        }
        ae.a(activity, (int) R.string.wm_platform_system_waimai_access_gallery);
        if (activity == null) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 19) {
                intent = new Intent("android.intent.action.GET_CONTENT");
                intent.setType("image/*");
            } else {
                intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            }
            activity.startActivityForResult(intent, 2);
        } catch (ActivityNotFoundException unused) {
            ae.a(activity, (int) R.string.wm_platform_system_album_not_available);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.e("StartSystemApp", e.getMessage(), new Object[0]);
        }
    }
}
