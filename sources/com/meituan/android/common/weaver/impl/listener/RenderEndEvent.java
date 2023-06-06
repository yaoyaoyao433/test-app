package com.meituan.android.common.weaver.impl.listener;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.weaver.impl.natives.NativeFFPEvent;
import com.meituan.android.common.weaver.interfaces.ffp.ContainerEvent;
import com.meituan.android.common.weaver.interfaces.ffp.FFPRenderEndListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RenderEndEvent implements FFPRenderEndListener.IRenderEndEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    private WeakReference<Activity> activityRef;
    private long createMs;
    private String finishResult;
    private String pageType;

    public RenderEndEvent(@NonNull Activity activity, @NonNull NativeFFPEvent nativeFFPEvent) {
        this(activity, nativeFFPEvent.getExtra());
        Object[] objArr = {activity, nativeFFPEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "034873e0a091cb7ae922c9957c89884c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "034873e0a091cb7ae922c9957c89884c");
        } else {
            this.createMs = nativeFFPEvent.createMs();
        }
    }

    public RenderEndEvent(@NonNull Activity activity, @NonNull ContainerEvent containerEvent) {
        this(activity, checkNull(containerEvent.getMap()));
        Object[] objArr = {activity, containerEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46db0f33f5ad08949a1d54086ea6fb28", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46db0f33f5ad08949a1d54086ea6fb28");
        } else {
            this.createMs = containerEvent.createMs();
        }
    }

    @NonNull
    private static Map<String, Object> checkNull(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "842434e5ca61cbc5647a0abce9ca7436", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "842434e5ca61cbc5647a0abce9ca7436");
        }
        if (map != null) {
            return map;
        }
        throw new IllegalArgumentException("extra should not be null");
    }

    public RenderEndEvent(@NonNull Activity activity, @NonNull Map<String, Object> map) {
        Object[] objArr = {activity, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62c10459bd78282bb22910f0df7b0d09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62c10459bd78282bb22910f0df7b0d09");
            return;
        }
        this.activityRef = new WeakReference<>(activity);
        this.pageType = (String) map.get("tType");
        this.finishResult = (String) map.get("fType");
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPRenderEndListener.IRenderEndEvent
    public long endMs() {
        return this.createMs;
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPRenderEndListener.IRenderEndEvent
    @Nullable
    public Activity activity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9d321ceb05f1b4f79f61558a799844c", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9d321ceb05f1b4f79f61558a799844c") : this.activityRef.get();
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPRenderEndListener.IRenderEndEvent
    @NonNull
    public String pageType() {
        return this.pageType;
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPRenderEndListener.IRenderEndEvent
    @NonNull
    public String finishResult() {
        return this.finishResult;
    }
}
