package com.xiaomi.mipush.sdk;

import com.meituan.robust.common.StringUtil;
/* loaded from: classes6.dex */
public final class q {
    private com.xiaomi.push.service.module.a e = com.xiaomi.push.service.module.a.China;
    boolean a = false;
    boolean b = false;
    boolean c = false;
    boolean d = false;

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("PushConfiguration{");
        stringBuffer.append("Region:");
        stringBuffer.append(this.e == null ? StringUtil.NULL : this.e.name());
        stringBuffer.append(",mOpenHmsPush:" + this.a);
        stringBuffer.append(",mOpenFCMPush:" + this.b);
        stringBuffer.append(",mOpenCOSPush:" + this.c);
        stringBuffer.append(",mOpenFTOSPush:" + this.d);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
