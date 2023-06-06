package com.meizu.cloud.pushsdk.handler.a.b;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.robust.common.CommonConstant;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.c.a.b;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.a.c.g;
import com.meizu.cloud.pushsdk.notification.c;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import com.meizu.cloud.pushsdk.util.d;
import com.sankuai.waimai.platform.utils.f;
import java.io.File;
import java.util.LinkedHashMap;
/* loaded from: classes3.dex */
public final class a extends com.meizu.cloud.pushsdk.handler.a.a<g> {
    public a(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final int b() {
        return 65536;
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final boolean f(Intent intent) {
        int i;
        DebugLogger.i("AbstractMessageHandler", "start LogUploadMessageHandler match");
        String a = f.a(intent, PushConstants.MZ_PUSH_CONTROL_MESSAGE);
        if (!TextUtils.isEmpty(a)) {
            com.meizu.cloud.pushsdk.handler.a.c.b a2 = com.meizu.cloud.pushsdk.handler.a.c.b.a(a);
            if (a2.a != null) {
                i = a2.a.a;
                return !PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && "2".equals(String.valueOf(i));
            }
        }
        i = 0;
        if (PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction())) {
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* synthetic */ void b(g gVar) {
        g gVar2 = gVar;
        d.b(this.b, this.b.getPackageName(), gVar2.d.b.d, gVar2.d.b.a, gVar2.d.b.e, gVar2.d.b.b);
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* synthetic */ void a(g gVar, c cVar) {
        String str;
        String message;
        File file;
        g gVar2 = gVar;
        DebugLogger.flush();
        String str2 = gVar2.d.b.a;
        String str3 = gVar2.d.b.d;
        if (Build.VERSION.SDK_INT >= 29) {
            str = MzSystemUtils.getDocumentsPath(this.b) + "/pushSdktmp/" + str2 + CommonConstant.Symbol.UNDERLINE + str3 + MRNBundleManager.MRN_BUNDLE_SUFFIX;
        } else {
            str = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/pushSdktmp/" + str2 + CommonConstant.Symbol.UNDERLINE + str3 + MRNBundleManager.MRN_BUNDLE_SUFFIX;
        }
        try {
            new b(str).a(gVar2.c);
            file = new File(str);
            message = null;
        } catch (Exception e) {
            message = e.getMessage();
            DebugLogger.e("AbstractMessageHandler", "zip error message " + message);
            file = null;
        }
        if (file != null && file.length() / 1024 > gVar2.a) {
            message = "the upload file exceeds the max size";
        } else if (gVar2.b && !com.meizu.cloud.pushsdk.util.a.a(this.b)) {
            message = "current network not allowed upload log file";
        }
        com.meizu.cloud.pushsdk.platform.a.b.a(this.b);
        String str4 = gVar2.d.b.a;
        String str5 = gVar2.d.b.d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("msgId", str4);
        linkedHashMap.put("deviceId", str5);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put(DeviceInfo.SIGN, com.meizu.cloud.pushsdk.platform.b.a(linkedHashMap, "4a2ca769d79f4856bb3bd982d30de790"));
        if (!TextUtils.isEmpty(message)) {
            linkedHashMap2.put("errorMsg", message);
        }
        DebugLogger.i("PushAPI", "uploadLogFile post map " + linkedHashMap2);
        b.c a = new b.c("https://api-push.meizu.com/garcia/api/client/log/upload").a(linkedHashMap2);
        a.h.put("logFile", file);
        com.meizu.cloud.pushsdk.c.a.c a2 = new com.meizu.cloud.pushsdk.c.a.b(a).a();
        if (a2 != null && a2.a()) {
            if (file != null) {
                file.delete();
            }
            DebugLogger.e("AbstractMessageHandler", "upload success " + ((String) a2.a));
        } else if (a2 == null) {
            DebugLogger.i("AbstractMessageHandler", "upload error");
        } else {
            DebugLogger.i("AbstractMessageHandler", "upload error code " + a2.b + ((String) a2.a));
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* synthetic */ g a(Intent intent) {
        String a = f.a(intent, PushConstants.MZ_PUSH_CONTROL_MESSAGE);
        String a2 = f.a(intent, PushConstants.EXTRA_APP_PUSH_SEQ_ID);
        return new g(f.a(intent, PushConstants.MZ_PUSH_PRIVATE_MESSAGE), a, f.a(intent, PushConstants.MZ_PUSH_MESSAGE_STATISTICS_IMEI_KEY), a2);
    }
}
