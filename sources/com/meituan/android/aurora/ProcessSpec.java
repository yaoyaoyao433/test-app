package com.meituan.android.aurora;

import android.app.Application;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class ProcessSpec {
    public static final String PROCESS_FLAG_ALL = "all";
    public static final String PROCESS_FLAG_MAIN = "main";
    public static final String PROCESS_FLAG_PUSH = "push";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mCurrentProcessName;
    private String mMainProcess;
    private String mPushProcess;

    public ProcessSpec(@NonNull Application application, @NonNull String str) {
        Object[] objArr = {application, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92569c9047dbbb1dbfd2983847ffc283", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92569c9047dbbb1dbfd2983847ffc283");
            return;
        }
        this.mMainProcess = application.getPackageName();
        this.mPushProcess = application.getPackageName() + ":dppushservice";
        this.mCurrentProcessName = str;
    }

    public boolean isProcessMatch(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79535aa5ac50f7ca7cc18e28b1667581", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79535aa5ac50f7ca7cc18e28b1667581")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return this.mCurrentProcessName.equals(this.mMainProcess);
        }
        if ("all".equals(str)) {
            return true;
        }
        if ("main".equals(str)) {
            return this.mCurrentProcessName.equals(this.mMainProcess);
        }
        if ("push".equals(str)) {
            return this.mCurrentProcessName.equals(this.mPushProcess);
        }
        return this.mCurrentProcessName.equals(str);
    }
}
