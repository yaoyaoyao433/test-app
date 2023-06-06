package com.meizu.cloud.pushsdk;

import android.app.IntentService;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.sankuai.waimai.foundation.core.lifecycle.c;
/* loaded from: classes3.dex */
public class NotificationService extends IntentService {
    public NotificationService() {
        super("NotificationService");
    }

    public NotificationService(String str) {
        super(str);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        c.a(this);
        super.onCreate();
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        c.b(this);
        DebugLogger.i("NotificationService", "NotificationService destroy");
        super.onDestroy();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed A[Catch: Exception -> 0x0196, TRY_LEAVE, TryCatch #1 {Exception -> 0x0196, blocks: (B:5:0x0008, B:7:0x003a, B:9:0x0046, B:14:0x0056, B:16:0x0077, B:19:0x0082, B:21:0x00a3, B:22:0x00af, B:24:0x00bd, B:26:0x00c3, B:28:0x00d5, B:30:0x00db, B:32:0x00e7, B:34:0x00ed, B:43:0x0178, B:36:0x0124, B:38:0x0144, B:40:0x0148), top: B:50:0x0008, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0124 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.app.IntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onHandleIntent(android.content.Intent r9) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.NotificationService.onHandleIntent(android.content.Intent):void");
    }
}
