package com.heytap.mcssdk.d;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.heytap.msp.push.mode.BaseMode;
import com.heytap.msp.push.mode.DataMessage;
import com.meituan.mmp.lib.update.PackageManageUtil;
import com.sankuai.waimai.platform.utils.f;
/* loaded from: classes2.dex */
public final class b extends c {
    @Override // com.heytap.mcssdk.d.c
    protected final BaseMode a(Intent intent) {
        try {
            DataMessage dataMessage = new DataMessage();
            dataMessage.setMessageID(com.heytap.mcssdk.f.a.a(f.a(intent, "messageID")));
            dataMessage.setTaskID(com.heytap.mcssdk.f.a.a(f.a(intent, "taskID")));
            dataMessage.setAppPackage(com.heytap.mcssdk.f.a.a(f.a(intent, PackageManageUtil.c)));
            dataMessage.setTitle(com.heytap.mcssdk.f.a.a(f.a(intent, "title")));
            dataMessage.setContent(com.heytap.mcssdk.f.a.a(f.a(intent, "content")));
            dataMessage.setDescription(com.heytap.mcssdk.f.a.a(f.a(intent, "description")));
            String a = com.heytap.mcssdk.f.a.a(f.a(intent, "notifyID"));
            dataMessage.setNotifyID(TextUtils.isEmpty(a) ? 0 : Integer.parseInt(a));
            return dataMessage;
        } catch (Exception e) {
            com.heytap.mcssdk.f.b.a("OnHandleIntent--" + e.getMessage());
            return null;
        }
    }

    @Override // com.heytap.mcssdk.d.d
    public final BaseMode a(Context context, int i, Intent intent) {
        if (4103 == i || 4098 == i) {
            BaseMode a = a(intent);
            com.heytap.mcssdk.b a2 = com.heytap.mcssdk.b.a();
            DataMessage dataMessage = (DataMessage) a;
            try {
                Intent intent2 = new Intent();
                intent2.setAction(a2.c());
                intent2.setPackage(a2.b());
                intent2.putExtra("type", 12291);
                intent2.putExtra("taskID", dataMessage.getTaskID());
                intent2.putExtra(PackageManageUtil.c, dataMessage.getAppPackage());
                intent2.putExtra("messageID", dataMessage.getMessageID());
                intent2.putExtra("messageType", i);
                intent2.putExtra("eventID", "push_transmit");
                a2.a.startService(intent2);
            } catch (Exception e) {
                com.heytap.mcssdk.f.b.b("statisticMessage--Exception" + e.getMessage());
            }
            return a;
        }
        return null;
    }
}
