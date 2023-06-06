package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
/* loaded from: classes6.dex */
public final class ax implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;
    final /* synthetic */ as c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ax(String str, Context context, as asVar) {
        this.a = str;
        this.b = context;
        this.c = asVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (TextUtils.isEmpty(this.a)) {
            return;
        }
        String str = "";
        String[] split = this.a.split("~");
        int length = split.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String str2 = split[i];
            if (!TextUtils.isEmpty(str2) && str2.startsWith("token:")) {
                str = str2.substring(str2.indexOf(CommonConstant.Symbol.COLON) + 1);
                break;
            }
            i++;
        }
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.c.a("ASSEMBLE_PUSH : receive incorrect token");
            return;
        }
        com.xiaomi.channel.commonutils.logger.c.a("ASSEMBLE_PUSH : receive correct token");
        aw.c(this.b, this.c, str);
        aw.a(this.b);
    }
}
