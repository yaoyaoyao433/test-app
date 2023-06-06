package com.xiaomi.push;

import android.content.Context;
import com.tencent.connect.common.Constants;
/* loaded from: classes6.dex */
public final class cx extends cw {
    public cx(Context context, int i) {
        super(context, i);
    }

    @Override // com.xiaomi.push.m.a
    public final String a() {
        return Constants.VIA_REPORT_TYPE_SHARE_TO_TROOPBAR;
    }

    @Override // com.xiaomi.push.cw
    public final String b() {
        return "ram:" + hf.b() + ",rom:" + hf.c() + "|ramOriginal:" + hf.d() + ",romOriginal:" + hf.e();
    }

    @Override // com.xiaomi.push.cw
    public final hc c() {
        return hc.Storage;
    }
}
