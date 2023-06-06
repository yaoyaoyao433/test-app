package com.sankuai.meituan.takeoutnew.manager.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.constraint.R;
import android.support.v4.app.NotificationManagerCompat;
import android.text.TextUtils;
import com.dianping.titans.js.JsHandlerFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.AppApplication;
import com.sankuai.meituan.takeoutnew.net.api.LogTypeApi;
import com.sankuai.meituan.takeoutnew.ui.page.boot.SchemeProxyActivityDelegate;
import com.sankuai.meituan.takeoutnew.ui.page.boot.WelcomeActivity;
import com.sankuai.waimai.business.order.api.submit.c;
import com.sankuai.waimai.platform.b;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.platform.utils.l;
import com.vivo.push.sdk.BasePushMessageReceiver;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PushMessageReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24083ef2c8a4d3b2539ed5d8c64d3758", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24083ef2c8a4d3b2539ed5d8c64d3758");
            return;
        }
        if (com.sankuai.meituan.takeoutnew.a.f) {
            com.sankuai.waimai.foundation.utils.log.a.c(BasePushMessageReceiver.TAG, "onReceive, intent = %s, message = %s", intent, f.a(intent, "message", StringUtil.NULL));
        }
        Object[] objArr2 = {context, intent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "433ca044a2971445520082aab1f9b5f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "433ca044a2971445520082aab1f9b5f8");
            return;
        }
        AppApplication.a(false);
        String action = intent.getAction();
        if ("com.dianping.dpmtpush.RECEIVE_TOKEN".equals(action)) {
            i.b(new com.sankuai.waimai.launcher.log.a().a("checkPushToken").d("ACTION_RECEIVE_TOKEN").b());
            b.A().e(context);
            Object[] objArr3 = {context, (byte) 1};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.takeoutnew.provider.risk.a.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "b71905b81ab758c1921ddf1ac957f696", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "b71905b81ab758c1921ddf1ac957f696");
                return;
            }
            com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, "has_upload_uuid", false);
            String str = NotificationManagerCompat.from(com.meituan.android.singleton.b.a).areNotificationsEnabled() ? "1" : "2";
            a.AbstractC1040a a2 = new com.sankuai.waimai.launcher.log.a().a("checkPushToken");
            i.b(a2.d("ACTION_RECEIVE_TOKEN uploadUserInfo pushToken:" + b.A().D()).b());
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((LogTypeApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) LogTypeApi.class)).uploadUserInfo(str), null, com.sankuai.waimai.platform.capacity.network.retrofit.b.b);
            if (TextUtils.isEmpty(b.A().c())) {
                return;
            }
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "has_upload_uuid", true);
        } else if ("com.dianping.dpmtpush.RECEIVE_PASS_THROUGH_MESSAGE".equals(action)) {
            a(context, intent);
        }
    }

    private static void a(final Context context, Intent intent) {
        JSONObject jSONObject;
        String optString;
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "817e6638d3f663a9a56b48c8b1029244", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "817e6638d3f663a9a56b48c8b1029244");
            return;
        }
        try {
            jSONObject = new JSONObject(f.a(intent, "message", ""));
            optString = jSONObject.optString("appname");
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        if (!TextUtils.isEmpty(optString) && TextUtils.equals(optString, context.getPackageName())) {
            String optString2 = jSONObject.optString("title", null);
            if (TextUtils.isEmpty(optString2)) {
                optString2 = context.getString(R.string.app_name);
            }
            final String optString3 = jSONObject.optString("content", null);
            final JSONObject optJSONObject = jSONObject.optJSONObject("extra");
            String optString4 = optJSONObject.optString("btype", "");
            com.sankuai.waimai.platform.domain.manager.bubble.a.a().b();
            com.sankuai.waimai.platform.push.a aVar = (com.sankuai.waimai.platform.push.a) com.sankuai.waimai.router.a.a(com.sankuai.waimai.platform.push.a.class, optString4);
            if (aVar == null || !aVar.a(optString4, jSONObject)) {
                if ("20".equals(optString4)) {
                    try {
                        JsHandlerFactory.publish(new JSONObject().put("action", "com.sankuai.meituan.takeoutnew.action_has_multi_person_order_push"));
                        return;
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                        return;
                    }
                } else if ("21".equals(optString4)) {
                    try {
                        JsHandlerFactory.publish(new JSONObject().put("action", "com.sankuai.meituan.takeoutnew.action_order_status_push"));
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                    c.a().updateOrderStatus();
                    return;
                } else {
                    final String optString5 = jSONObject.optString("url", null);
                    if (TextUtils.isEmpty(optString5)) {
                        return;
                    }
                    a(context, optString5, optString4);
                    if (com.sankuai.waimai.imbase.push.b.b()) {
                        if (com.sankuai.waimai.foundation.utils.activity.a.a().b() instanceof WelcomeActivity) {
                            final String str = optString2;
                            l.a(new Runnable() { // from class: com.sankuai.meituan.takeoutnew.manager.receiver.PushMessageReceiver.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f66872889acb17a4ab5e184af682bf85", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f66872889acb17a4ab5e184af682bf85");
                                    } else {
                                        PushMessageReceiver.b(context, optJSONObject, optString5, str, optString3);
                                    }
                                }
                            }, 3000, BasePushMessageReceiver.TAG);
                            return;
                        }
                        b(context, optJSONObject, optString5, optString2, optString3);
                        return;
                    }
                    a.a(context, optString2, optString3, optString5, 4, optJSONObject);
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, JSONObject jSONObject, String str, String str2, String str3) {
        Object[] objArr = {context, jSONObject, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2dd3c6149feeac618f6fcb1ae4df5bd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2dd3c6149feeac618f6fcb1ae4df5bd2");
        } else {
            com.sankuai.waimai.imbase.push.b.a(context, (int) R.drawable.wm_common_good_img_default, jSONObject.optString("imageUrl", ""), str2, str3, SchemeProxyActivityDelegate.a(context, str, 4), jSONObject);
        }
    }

    private static void a(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d7e79e494411b28694b6e77869d1e95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d7e79e494411b28694b6e77869d1e95");
            return;
        }
        b.A().e();
        if (com.sankuai.waimai.foundation.router.a.a(context, str, (int) R.string.scheme_path_order)) {
            c.a().updateOrderStatus(str2, Uri.parse(str));
            try {
                JsHandlerFactory.publish(new JSONObject().put("action", "com.sankuai.meituan.takeoutnew.action_order_status_push"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
