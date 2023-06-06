package com.meituan.robust.assistant.report;

import android.content.Context;
import com.meituan.robust.RobustCallBack;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class RobustParamsProvider {
    public abstract String getChannel(Context context);

    protected HashMap<String, String> getOtherParams(HashMap<String, String> hashMap) {
        return hashMap;
    }

    public RobustCallBack getRobustCallBack() {
        return null;
    }

    public abstract String getUUID(Context context);

    public abstract long getUserID(Context context);

    /* JADX INFO: Access modifiers changed from: protected */
    public String getVersionName(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Throwable unused) {
            return "";
        }
    }
}
