package com.heytap.mcssdk.c;

import com.heytap.msp.push.mode.BaseMode;
import java.util.List;
/* loaded from: classes2.dex */
public final class a extends BaseMode {
    public String a;
    public String b;
    public int c;
    public String d;
    public int e = -2;
    public String f;
    private String g;
    private String h;

    public static <T> String a(List<T> list) {
        StringBuilder sb = new StringBuilder();
        for (T t : list) {
            sb.append(t);
            sb.append("&");
        }
        return sb.toString();
    }

    @Override // com.heytap.msp.push.mode.BaseMode
    public final int getType() {
        return 4105;
    }

    public final String toString() {
        return "CallBackResult{, mRegisterID='" + this.g + "', mSdkVersion='" + this.h + "', mCommand=" + this.c + "', mContent='" + this.d + "', mAppPackage=" + this.f + "', mResponseCode=" + this.e + '}';
    }
}
