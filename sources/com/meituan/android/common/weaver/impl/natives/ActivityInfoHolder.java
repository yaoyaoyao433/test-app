package com.meituan.android.common.weaver.impl.natives;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ActivityInfoHolder {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Activity activity;
    @Nullable
    public List<Object> clickJump2Fragments;
    @Nullable
    private NativeEndPoint fullPageEndPoint;
    @Nullable
    public Set<NativeEndPoint> notFullPageEndPoints;

    public ActivityInfoHolder(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c49c5c398555e194744252b242370b6c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c49c5c398555e194744252b242370b6c");
        } else {
            this.activity = activity;
        }
    }

    @UiThread
    public void setFullPageEndPoint(@NonNull NativeEndPoint nativeEndPoint) {
        Object[] objArr = {nativeEndPoint};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53c97f7c9ad794812ff9500ae77646d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53c97f7c9ad794812ff9500ae77646d7");
            return;
        }
        if (this.fullPageEndPoint != null) {
            this.fullPageEndPoint.onActivityStop();
        }
        this.fullPageEndPoint = nativeEndPoint;
    }

    @UiThread
    public void appendNotFullPage(@NonNull NativeEndPoint nativeEndPoint) {
        Object[] objArr = {nativeEndPoint};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ca809350961559815307f0559d3d5b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ca809350961559815307f0559d3d5b7");
            return;
        }
        if (this.notFullPageEndPoints == null) {
            this.notFullPageEndPoints = new HashSet();
        }
        this.notFullPageEndPoints.add(nativeEndPoint);
    }

    public void appendClickJump2Fragment(@NonNull Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5739582a6191456af00c84df726756d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5739582a6191456af00c84df726756d");
            return;
        }
        if (this.clickJump2Fragments == null) {
            this.clickJump2Fragments = new LinkedList();
        }
        this.clickJump2Fragments.add(obj);
    }

    public boolean shouldConsumer(@NonNull Object obj) {
        boolean z = true;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a35f6c51c32c1b36df3d480abaa44404", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a35f6c51c32c1b36df3d480abaa44404")).booleanValue();
        }
        z = (this.clickJump2Fragments == null || !this.clickJump2Fragments.contains(obj)) ? false : false;
        if (z) {
            this.clickJump2Fragments.remove(obj);
        }
        return z;
    }

    public void onActivityStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f311c66b3d12c0ad21ec7222a3eb840b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f311c66b3d12c0ad21ec7222a3eb840b");
            return;
        }
        if (this.fullPageEndPoint != null) {
            this.fullPageEndPoint.onActivityStop();
            this.fullPageEndPoint = null;
        }
        if (this.notFullPageEndPoints != null) {
            for (NativeEndPoint nativeEndPoint : this.notFullPageEndPoints) {
                nativeEndPoint.onActivityStop();
            }
            this.notFullPageEndPoints = null;
        }
        this.clickJump2Fragments = null;
    }
}
