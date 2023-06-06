package com.meituan.android.privacy.interfaces.def;

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

    public a(@NonNull Context context, @Nullable String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f8cd1ed9eab9206c4a9df1ef5b9a886", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f8cd1ed9eab9206c4a9df1ef5b9a886");
        } else {
            this.b = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.i
    public final List<ActivityManager.RunningTaskInfo> a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2ed21e3055ebddd2a2bf497b43622c6", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2ed21e3055ebddd2a2bf497b43622c6") : this.b.getRunningTasks(i);
    }

    @Override // com.meituan.android.privacy.interfaces.i
    public final List<ActivityManager.RunningServiceInfo> b(int i) {
        Object[] objArr = {200};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6a90927251d5cbf353724a5e42933c7", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6a90927251d5cbf353724a5e42933c7") : this.b.getRunningServices(200);
    }

    @Override // com.meituan.android.privacy.interfaces.i
    public final List<ActivityManager.RunningAppProcessInfo> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f5db5b2b63f23b3845c1518431bf3f9", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f5db5b2b63f23b3845c1518431bf3f9") : this.b.getRunningAppProcesses();
    }
}
