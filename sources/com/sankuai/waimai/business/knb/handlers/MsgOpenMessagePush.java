package com.sankuai.waimai.business.knb.handlers;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.knb.utils.d;
import com.tencent.mapsdk.internal.y;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MsgOpenMessagePush extends TakeoutBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12f5e6f88d057168a697473f48909b87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12f5e6f88d057168a697473f48909b87");
            return;
        }
        try {
            Activity activity = jsHost().getActivity();
            Object[] objArr2 = {activity};
            ChangeQuickRedirect changeQuickRedirect3 = d.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "524a7d57fa793c7faa9783427ef208a4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "524a7d57fa793c7faa9783427ef208a4");
                return;
            }
            Intent intent = new Intent();
            if (Build.VERSION.SDK_INT >= 26) {
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
            } else if (Build.VERSION.SDK_INT >= 21) {
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("app_package", activity.getPackageName());
                intent.putExtra("app_uid", activity.getApplicationInfo().uid);
            } else {
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
            }
            intent.setFlags(y.a);
            activity.startActivity(intent);
        } catch (Exception unused) {
        }
    }
}
