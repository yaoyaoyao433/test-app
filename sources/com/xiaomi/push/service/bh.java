package com.xiaomi.push.service;

import android.content.Context;
import android.util.Log;
import com.meituan.robust.common.CommonConstant;
import com.xiaomi.push.hl;
import com.xiaomi.push.ia;
import com.xiaomi.push.js;
import com.xiaomi.push.service.XMPushService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes6.dex */
public final class bh implements XMPushService.o {
    private static final boolean a = Log.isLoggable("UNDatas", 3);
    private static final Map<Integer, Map<String, List<String>>> b = new HashMap();
    private static Context c;

    public bh(Context context) {
        c = context;
    }

    @Override // com.xiaomi.push.service.XMPushService.o
    public final void a() {
        if (b.size() > 0) {
            synchronized (b) {
                HashMap hashMap = new HashMap();
                hashMap.putAll(b);
                if (hashMap.size() > 0) {
                    for (Integer num : hashMap.keySet()) {
                        Map map = (Map) hashMap.get(num);
                        if (map != null && map.size() > 0) {
                            StringBuilder sb = new StringBuilder();
                            Iterator it = map.keySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String str = (String) it.next();
                                sb.append(str);
                                sb.append(CommonConstant.Symbol.COLON);
                                List list = (List) map.get(str);
                                if (!js.a(list)) {
                                    for (int i = 0; i < list.size(); i++) {
                                        if (i != 0) {
                                            sb.append(CommonConstant.Symbol.COMMA);
                                        }
                                        sb.append((String) list.get(i));
                                    }
                                }
                                sb.append(";");
                            }
                            String a2 = ad.a();
                            String str2 = hl.NotificationRemoved.ah;
                            ia iaVar = new ia();
                            if (str2 != null) {
                                iaVar.e = str2;
                            }
                            if (a2 != null) {
                                iaVar.c = a2;
                            }
                            iaVar.a(false);
                            iaVar.a("removed_reason", String.valueOf(num));
                            iaVar.a("all_delete_msgId_appId", sb.toString());
                            com.xiaomi.channel.commonutils.logger.c.b("UNDatas upload all removed messages reason: " + num + " allIds: " + sb.toString());
                            Context context = c;
                            if (a) {
                                com.xiaomi.channel.commonutils.logger.c.b("UNDatas upload message notification:" + iaVar);
                            }
                            com.xiaomi.push.m.a(context).a(new bi(iaVar), 0);
                        }
                        b.remove(num);
                    }
                }
            }
        }
    }
}
