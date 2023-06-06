package com.vivo.push.d;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.sdk.PushMessageCallback;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class s implements Runnable {
    final /* synthetic */ InsideNotificationItem a;
    final /* synthetic */ com.vivo.push.b.q b;
    final /* synthetic */ r c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(r rVar, InsideNotificationItem insideNotificationItem, com.vivo.push.b.q qVar) {
        this.c = rVar;
        this.a = insideNotificationItem;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Context context2;
        Context context3;
        Context context4;
        Context context5;
        Context context6;
        char c;
        Context context7;
        Context context8;
        Context context9;
        Context context10;
        Context context11;
        Context context12;
        Context context13;
        Context context14;
        PushMessageCallback pushMessageCallback = this.c.b;
        context = this.c.a;
        if (pushMessageCallback.onNotificationMessageArrived(context, com.vivo.push.util.q.a(this.a))) {
            StringBuilder sb = new StringBuilder("pkg name : ");
            context11 = this.c.a;
            sb.append(context11.getPackageName());
            sb.append(" 应用主动拦截通知");
            com.vivo.push.util.p.b("OnNotificationArrivedTask", sb.toString());
            context12 = this.c.a;
            com.vivo.push.util.p.b(context12, "应用主动拦截通知，导致通知无法展示，如需打开请在onNotificationMessageArrived中返回false");
            HashMap hashMap = new HashMap();
            hashMap.put("messageID", String.valueOf(this.b.f()));
            context13 = this.c.a;
            context14 = this.c.a;
            String b = com.vivo.push.util.z.b(context13, context14.getPackageName());
            if (!TextUtils.isEmpty(b)) {
                hashMap.put("remoteAppId", b);
            }
            com.vivo.push.util.e.a(2120L, hashMap);
            return;
        }
        int b2 = this.c.b();
        if (b2 <= 0) {
            context2 = this.c.a;
            InsideNotificationItem insideNotificationItem = this.a;
            long f = this.b.f();
            PushMessageCallback pushMessageCallback2 = this.c.b;
            context3 = this.c.a;
            com.vivo.push.util.k kVar = new com.vivo.push.util.k(context2, insideNotificationItem, f, pushMessageCallback2.isAllowNet(context3), new t(this));
            boolean isShowBigPicOnMobileNet = this.a.isShowBigPicOnMobileNet();
            String purePicUrl = this.a.getPurePicUrl();
            if (TextUtils.isEmpty(purePicUrl)) {
                purePicUrl = this.a.getCoverUrl();
            }
            if (!TextUtils.isEmpty(purePicUrl)) {
                com.vivo.push.util.p.c("OnNotificationArrivedTask", "showCode=".concat(String.valueOf(isShowBigPicOnMobileNet)));
                if (!isShowBigPicOnMobileNet) {
                    context5 = this.c.a;
                    com.vivo.push.util.p.a(context5, "mobile net unshow");
                    context6 = this.c.a;
                    NetworkInfo a = com.vivo.push.util.r.a(context6);
                    if (a != null && a.getState() == NetworkInfo.State.CONNECTED) {
                        int type = a.getType();
                        c = type == 1 ? (char) 2 : type == 0 ? (char) 1 : (char) 3;
                    } else {
                        c = 0;
                    }
                    if (c == 1) {
                        purePicUrl = null;
                        this.a.clearCoverUrl();
                        this.a.clearPurePicUrl();
                    }
                } else {
                    context4 = this.c.a;
                    com.vivo.push.util.p.a(context4, "mobile net show");
                }
            }
            com.sankuai.waimai.launcher.util.aop.b.a(kVar, this.a.getIconUrl(), purePicUrl);
            return;
        }
        StringBuilder sb2 = new StringBuilder("pkg name : ");
        context7 = this.c.a;
        sb2.append(context7.getPackageName());
        sb2.append(" notify channel switch is ");
        sb2.append(b2);
        com.vivo.push.util.p.b("OnNotificationArrivedTask", sb2.toString());
        context8 = this.c.a;
        com.vivo.push.util.p.b(context8, "允许通知开关或者推送通知渠道开关关闭，导致通知无法展示，请到设置页打开应用通知开关 ".concat(String.valueOf(b2)));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("messageID", String.valueOf(this.b.f()));
        context9 = this.c.a;
        context10 = this.c.a;
        String b3 = com.vivo.push.util.z.b(context9, context10.getPackageName());
        if (!TextUtils.isEmpty(b3)) {
            hashMap2.put("remoteAppId", b3);
        }
        com.vivo.push.util.e.a(b2, hashMap2);
    }
}
