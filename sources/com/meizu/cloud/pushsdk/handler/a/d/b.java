package com.meizu.cloud.pushsdk.handler.a.d;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.handler.a.c.d;
import com.meizu.cloud.pushsdk.notification.MPushMessage;
import com.tencent.mapsdk.internal.y;
import java.util.Map;
/* loaded from: classes3.dex */
public final class b extends com.meizu.cloud.pushsdk.handler.a.a<MessageV3> {
    private Context c;

    public b(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
        this.c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.meizu.cloud.pushsdk.handler.a.d.b] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    @Override // com.meizu.cloud.pushsdk.handler.a.a
    /* renamed from: g */
    public MessageV3 a(Intent intent) {
        MPushMessage mPushMessage;
        String c;
        String b;
        String taskId;
        try {
            try {
                DebugLogger.e("AbstractMessageHandler", "parse message V3");
                MessageV3 messageV3 = (MessageV3) intent.getParcelableExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE);
                if (messageV3 != null) {
                    return messageV3;
                }
            } catch (Exception unused) {
                DebugLogger.e("AbstractMessageHandler", "cannot get messageV3");
            }
            return MessageV3.parse(c, (String) b, taskId, mPushMessage);
        } finally {
            DebugLogger.e("AbstractMessageHandler", "parse MessageV2 to MessageV3");
            mPushMessage = (MPushMessage) com.sankuai.waimai.platform.utils.f.c(intent, PushConstants.MZ_PUSH_PRIVATE_MESSAGE);
            MessageV3.parse(c(intent), b(intent), mPushMessage.getTaskId(), mPushMessage);
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final int b() {
        return 64;
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final boolean f(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start NotificationClickMessageHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE.equals(com.sankuai.waimai.platform.utils.f.a(intent, "method"));
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* synthetic */ boolean a(MessageV3 messageV3, String str) {
        return a(messageV3, str);
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* synthetic */ void b(MessageV3 messageV3) {
        MessageV3 messageV32 = messageV3;
        com.meizu.cloud.pushsdk.util.d.a(this.b, true, messageV32.getUploadDataPackageName(), TextUtils.isEmpty(messageV32.getDeviceId()) ? b((Intent) null) : messageV32.getDeviceId(), messageV32.getTaskId(), messageV32.getSeqId(), "cpm", messageV32.getPushTimestamp());
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* synthetic */ void a(MessageV3 messageV3, com.meizu.cloud.pushsdk.notification.c cVar) {
        String str;
        String str2;
        MessageV3 messageV32 = messageV3;
        if (messageV32 != null) {
            com.meizu.cloud.pushsdk.util.b.a(this.b, messageV32.getPackageName(), 0);
            Context context = this.b;
            Intent intent = null;
            String uriPackageName = messageV32.getUriPackageName();
            if (TextUtils.isEmpty(uriPackageName)) {
                uriPackageName = messageV32.getUploadDataPackageName();
            }
            DebugLogger.i("AbstractMessageHandler", "openClassName is " + uriPackageName);
            if (messageV32.getClickType() == 0) {
                intent = context.getPackageManager().getLaunchIntentForPackage(uriPackageName);
                if (intent != null && messageV32.getParamsMap() != null) {
                    for (Map.Entry<String, String> entry : messageV32.getParamsMap().entrySet()) {
                        DebugLogger.i("AbstractMessageHandler", " launcher activity key " + entry.getKey() + " value " + entry.getValue());
                        if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                            intent.putExtra(entry.getKey(), entry.getValue());
                        }
                    }
                }
            } else {
                if (1 == messageV32.getClickType()) {
                    intent = new Intent();
                    if (messageV32.getParamsMap() != null) {
                        for (Map.Entry<String, String> entry2 : messageV32.getParamsMap().entrySet()) {
                            DebugLogger.i("AbstractMessageHandler", " key " + entry2.getKey() + " value " + entry2.getValue());
                            if (!TextUtils.isEmpty(entry2.getKey()) && !TextUtils.isEmpty(entry2.getValue())) {
                                intent.putExtra(entry2.getKey(), entry2.getValue());
                            }
                        }
                    }
                    intent.setClassName(uriPackageName, messageV32.getActivity());
                    str = "AbstractMessageHandler";
                    str2 = intent.toUri(1);
                } else if (2 == messageV32.getClickType()) {
                    intent = new Intent("android.intent.action.VIEW", Uri.parse(messageV32.getWebUrl()));
                    String uriPackageName2 = messageV32.getUriPackageName();
                    if (!TextUtils.isEmpty(uriPackageName2)) {
                        intent.setPackage(uriPackageName2);
                        DebugLogger.i("AbstractMessageHandler", "set uri package " + uriPackageName2);
                    }
                } else if (3 == messageV32.getClickType()) {
                    str = "AbstractMessageHandler";
                    str2 = "CLICK_TYPE_SELF_DEFINE_ACTION";
                }
                DebugLogger.i(str, str2);
            }
            if (intent != null) {
                d.a aVar = new d.a();
                aVar.a = messageV32.getTaskId();
                intent.putExtra(PushConstants.MZ_PUSH_PLATFORM_EXTRA, aVar.a().a());
            }
            if (intent != null) {
                intent.addFlags(y.a);
                try {
                    this.b.startActivity(intent);
                } catch (Exception e) {
                    DebugLogger.e("AbstractMessageHandler", "Click message StartActivity error " + e.getMessage());
                }
            }
            if (!TextUtils.isEmpty(messageV32.getTitle()) && !TextUtils.isEmpty(messageV32.getContent()) && this.a != null) {
                this.a.a(this.b, MzPushMessage.fromMessageV3(messageV32));
            }
            b(messageV32);
            a(this.c, messageV32);
        }
    }
}
