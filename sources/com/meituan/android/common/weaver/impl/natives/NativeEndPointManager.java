package com.meituan.android.common.weaver.impl.natives;

import android.app.Activity;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.support.annotation.VisibleForTesting;
import com.meituan.android.common.weaver.impl.RemoteConfig;
import com.meituan.android.common.weaver.impl.natives.PagePathHelper;
import com.meituan.android.common.weaver.impl.utils.FFPTopPageImpl;
import com.meituan.android.common.weaver.impl.utils.Logger;
import com.meituan.android.common.weaver.interfaces.ffp.IgnoreNativeFFP;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@MainThread
/* loaded from: classes2.dex */
public class NativeEndPointManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile NativeEndPointManager nativeEndPointManager;
    @VisibleForTesting
    public final Map<Activity, ActivityInfoHolder> activity2Holder;

    public NativeEndPointManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89c4862c6277ad3f8b88bb8507eb501b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89c4862c6277ad3f8b88bb8507eb501b");
        } else {
            this.activity2Holder = new HashMap();
        }
    }

    public static NativeEndPointManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0931f148b8ee2899b9fa459d786659cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (NativeEndPointManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0931f148b8ee2899b9fa459d786659cf");
        }
        if (nativeEndPointManager == null) {
            synchronized (NativeEndPointManager.class) {
                if (nativeEndPointManager == null) {
                    nativeEndPointManager = new NativeEndPointManager();
                }
            }
        }
        return nativeEndPointManager;
    }

    @UiThread
    public ActivityInfoHolder holder(@NonNull Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fafaae7667289093abbf187493645cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (ActivityInfoHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fafaae7667289093abbf187493645cb");
        }
        ActivityInfoHolder activityInfoHolder = this.activity2Holder.get(activity);
        if (activityInfoHolder != null) {
            return activityInfoHolder;
        }
        if (z) {
            return null;
        }
        ActivityInfoHolder activityInfoHolder2 = new ActivityInfoHolder(activity);
        this.activity2Holder.put(activity, activityInfoHolder2);
        return activityInfoHolder2;
    }

    public void nativeStartDetectFFP(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d292bbaf442b7d0687b59b798f791144", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d292bbaf442b7d0687b59b798f791144");
        } else if (activity instanceof IgnoreNativeFFP) {
            Logger.getLogger().d("Activity: ", activity, " is ignored by IgnoreNativeFFP");
        } else {
            PagePathHelper.NativePathHelper nativePathHelper = new PagePathHelper.NativePathHelper(activity);
            if (RemoteConfig.sConfig.detectActivity(nativePathHelper)) {
                NativeEndPoint nativeEndPoint = new NativeEndPoint(activity, nativePathHelper);
                holder(activity, false).setFullPageEndPoint(nativeEndPoint);
                nativeEndPoint.startTraverseView();
                return;
            }
            FFPTopPageImpl.pagePath = null;
            Logger.getLogger().d("ignore activity: ", activity);
        }
    }

    public void mscOrFragmentStartDetectFFP(@NonNull Activity activity, PagePathHelper pagePathHelper) {
        Object[] objArr = {activity, pagePathHelper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e4fd0c787452ddc658d387e1249885d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e4fd0c787452ddc658d387e1249885d");
        } else if (RemoteConfig.sConfig.detectActivity(pagePathHelper)) {
            ActivityInfoHolder holder = holder(activity, false);
            NativeEndPoint nativeEndPoint = new NativeEndPoint(activity, pagePathHelper);
            if (pagePathHelper.fullPage()) {
                holder.setFullPageEndPoint(nativeEndPoint);
                nativeEndPoint.startTraverseView();
            } else {
                holder.appendNotFullPage(nativeEndPoint);
            }
            nativeEndPoint.startTraverseView();
        } else {
            Logger.getLogger().d("msc pagePath ignore: ", pagePathHelper);
        }
    }

    public void onActivityStop(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbb4332c7a5744d2724d15312143e313", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbb4332c7a5744d2724d15312143e313");
            return;
        }
        ActivityInfoHolder holder = holder(activity, true);
        if (holder != null) {
            holder.onActivityStop();
            this.activity2Holder.remove(activity);
        }
    }

    public void onActivityDestroy(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11ffc9a7892b79e5b7795b76bb0de8a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11ffc9a7892b79e5b7795b76bb0de8a6");
        } else {
            onActivityStop(activity);
        }
    }
}
