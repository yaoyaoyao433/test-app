package com.sankuai.waimai.imbase.monitor;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.lifecycle.MetricsActivityLifecycleManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.Message;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static ExecutorService b;

    private static ExecutorService a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1edecacc57e54e6100dbcb72d5a484bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (ExecutorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1edecacc57e54e6100dbcb72d5a484bd");
        }
        if (b == null) {
            synchronized (d.class) {
                if (b == null) {
                    b = Executors.newSingleThreadExecutor();
                }
            }
        }
        return b;
    }

    public static void a(@NonNull IMMessage iMMessage, boolean z, int i) {
        c doVerify;
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "28cf46d373e8c00160b25112d16710f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "28cf46d373e8c00160b25112d16710f2");
            return;
        }
        try {
            IMMessage iMMessage2 = new IMMessage();
            iMMessage.copyTo(iMMessage2);
            IMessageVerificationService iMessageVerificationService = (IMessageVerificationService) com.sankuai.waimai.router.a.a(IMessageVerificationService.class, String.valueOf((int) iMMessage2.getChannel()));
            if (iMessageVerificationService == null || (doVerify = iMessageVerificationService.doVerify(iMMessage2, z, i)) == null || doVerify.b) {
                return;
            }
            if (!com.sankuai.waimai.imbase.manager.b.a().a()) {
                throw new RuntimeException("Message Verify Fail:" + doVerify.a() + ", Message:" + iMMessage2.toString());
            }
            String snifferBizName = iMessageVerificationService.getSnifferBizName();
            short channel = iMMessage2.getChannel();
            long chatId = iMMessage2.getChatId();
            int category = iMMessage2.getCategory();
            long msgId = iMMessage2.getMsgId();
            int msgType = iMMessage2.getMsgType();
            short fromAppId = iMMessage2.getFromAppId();
            short toAppId = iMMessage2.getToAppId();
            String a2 = doVerify.a();
            Object[] objArr2 = {snifferBizName, Short.valueOf(channel), new Long(chatId), Integer.valueOf(category), new Long(msgId), Integer.valueOf(msgType), Short.valueOf(fromAppId), Short.valueOf(toAppId), a2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b9b7ba77d2160fb6c8a1e88911bb6b9e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b9b7ba77d2160fb6c8a1e88911bb6b9e");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("channel", (int) channel);
                jSONObject.put(Message.CHAT_ID, chatId);
                jSONObject.put("category", category);
                jSONObject.put("msgId", msgId);
                jSONObject.put("msgType", msgType);
                jSONObject.put(Message.FROM_APPID, (int) fromAppId);
                jSONObject.put(Message.TO_APPID, (int) toAppId);
                jSONObject.put("failReason", a2);
            } catch (JSONException unused) {
            }
            if (TextUtils.isEmpty(snifferBizName)) {
                snifferBizName = "waimai_im";
            }
            Sniffer.smell(snifferBizName, "message_verification", ((int) channel) + CommonConstant.Symbol.COLON + category, "message检查失败", jSONObject.toString());
        } catch (Throwable th) {
            if (!com.sankuai.waimai.imbase.manager.b.a().a()) {
                a().execute(new Runnable() { // from class: com.sankuai.waimai.imbase.monitor.d.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        throw th;
                    }
                });
            } else {
                Metrics.storeCrash(new b(th), 1, MetricsActivityLifecycleManager.currentActivity, false);
            }
        }
    }
}
