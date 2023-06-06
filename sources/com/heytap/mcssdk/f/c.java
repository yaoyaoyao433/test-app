package com.heytap.mcssdk.f;

import android.content.Context;
import android.content.Intent;
import com.heytap.msp.push.mode.MessageStat;
import com.meituan.android.common.statistics.Constants;
import com.meituan.mmp.lib.update.PackageManageUtil;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes2.dex */
public final class c {
    public static void a(Context context, List<MessageStat> list) {
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(list);
        b.a("isSupportStatisticByMcs:" + a(context) + ",list size:" + linkedList.size());
        if (linkedList.size() <= 0 || !a(context)) {
            return;
        }
        b(context, linkedList);
    }

    private static boolean a(Context context) {
        String b = com.heytap.mcssdk.b.a().b();
        return e.a(context, b) && e.b(context, b) >= 1017;
    }

    private static void b(Context context, List<MessageStat> list) {
        try {
            Intent intent = new Intent();
            intent.setAction(com.heytap.mcssdk.b.a().c());
            intent.setPackage(com.heytap.mcssdk.b.a().b());
            intent.putExtra(PackageManageUtil.c, context.getPackageName());
            intent.putExtra("type", 12291);
            intent.putExtra("count", list.size());
            ArrayList<String> arrayList = new ArrayList<>();
            for (MessageStat messageStat : list) {
                arrayList.add(messageStat.toJsonObject());
            }
            intent.putStringArrayListExtra(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST, arrayList);
            context.startService(intent);
        } catch (Exception e) {
            b.b("statisticMessage--Exception" + e.getMessage());
        }
    }
}
