package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.sankuai.waimai.monitor.model.ErrorCode;
/* loaded from: classes6.dex */
public final class bg extends bi {
    public bg(String str, String str2, String[] strArr, String str3) {
        super(str, str2, strArr, str3);
    }

    @Override // com.xiaomi.push.bm.a
    public final void a(Context context, Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            long a = bs.a(this.d);
            long j = be.b;
            if (a <= j) {
                com.xiaomi.channel.commonutils.logger.c.b("db size is suitable");
                return;
            }
            long j2 = (long) ((((a - j) * 1.2d) / j) * longValue);
            if (this.f != null && this.f.length > 0) {
                this.f[0] = String.valueOf(j2);
            }
            az a2 = az.a(context);
            String str = "begin delete " + j2 + "noUpload messages , because db size is " + a + ErrorCode.ERROR_TYPE_B;
            if (a2.a() && !TextUtils.isEmpty(str)) {
                he a3 = br.a(a2.a, str);
                if (a2.a() && com.xiaomi.push.service.az.a(a3.k)) {
                    a2.a(bj.a(a2.a, a2.b(), a3));
                }
            }
            super.a(context, obj);
        }
    }
}
