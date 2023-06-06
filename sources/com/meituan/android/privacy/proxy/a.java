package com.meituan.android.privacy.proxy;

import android.app.ActivityManager;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements com.meituan.android.privacy.interfaces.i {
    public static ChangeQuickRedirect a;
    @NonNull
    private final ActivityManager b;
    @Nullable
    private final String c;

    public a(@NonNull Context context, @Nullable String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "563feaf72588ce8a667fc882e4443d2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "563feaf72588ce8a667fc882e4443d2b");
            return;
        }
        this.b = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
        this.c = str;
    }

    @Override // com.meituan.android.privacy.interfaces.i
    public final List<ActivityManager.RunningTaskInfo> a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cca4ee129325b598ade8a27dd2a074a5", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cca4ee129325b598ade8a27dd2a074a5") : this.b.getRunningTasks(i);
    }

    @Override // com.meituan.android.privacy.interfaces.i
    public final List<ActivityManager.RunningServiceInfo> b(int i) {
        Object[] objArr = {200};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6cc673080f84ecce98489cf580ecf30", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6cc673080f84ecce98489cf580ecf30") : this.b.getRunningServices(200);
    }

    @Override // com.meituan.android.privacy.interfaces.i
    public final List<ActivityManager.RunningAppProcessInfo> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a686bccdd9a80a1c8b70486d36caa4e4", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a686bccdd9a80a1c8b70486d36caa4e4") : this.b.getRunningAppProcesses();
    }
}
