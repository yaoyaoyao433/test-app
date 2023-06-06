package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.xiaomi.push.ia;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
/* loaded from: classes6.dex */
public final class an {
    /* JADX INFO: Access modifiers changed from: private */
    public static String c(List<String> list) {
        if (com.xiaomi.push.g.a(list)) {
            return "";
        }
        ArrayList<String> arrayList = new ArrayList(list);
        Collections.sort(arrayList, Collator.getInstance(Locale.CHINA));
        String str = "";
        for (String str2 : arrayList) {
            if (!TextUtils.isEmpty(str)) {
                str = str + CommonConstant.Symbol.COMMA;
            }
            str = str + str2;
        }
        return str;
    }

    public static void a(Context context, boolean z) {
        com.xiaomi.push.m.a(context).a(new ao(context, z), 0);
    }

    public static void a(Context context, ia iaVar) {
        com.xiaomi.channel.commonutils.logger.c.a("need to update local info with: " + iaVar.h);
        String str = iaVar.h.get("accept_time");
        if (str != null) {
            g.w(context);
            String[] split = str.split(CommonConstant.Symbol.MINUS);
            if (split.length == 2) {
                g.f(context, split[0], split[1]);
                if ("00:00".equals(split[0]) && "00:00".equals(split[1])) {
                    ap.a(context).a(true);
                } else {
                    ap.a(context).a(false);
                }
            }
        }
        String str2 = iaVar.h.get("aliases");
        if (str2 != null) {
            g.t(context);
            if (!"".equals(str2)) {
                for (String str3 : str2.split(CommonConstant.Symbol.COMMA)) {
                    g.a(context, str3);
                }
            }
        }
        String str4 = iaVar.h.get("topics");
        if (str4 != null) {
            g.v(context);
            if (!"".equals(str4)) {
                for (String str5 : str4.split(CommonConstant.Symbol.COMMA)) {
                    g.e(context, str5);
                }
            }
        }
        String str6 = iaVar.h.get("user_accounts");
        if (str6 != null) {
            g.u(context);
            if ("".equals(str6)) {
                return;
            }
            for (String str7 : str6.split(CommonConstant.Symbol.COMMA)) {
                g.c(context, str7);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String a(List list) {
        String a = com.xiaomi.push.ar.a(c(list));
        return (TextUtils.isEmpty(a) || a.length() <= 4) ? "" : a.substring(0, 4).toLowerCase();
    }
}
