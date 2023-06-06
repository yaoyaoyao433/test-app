package com.meituan.android.common.weaver.impl.natives;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.android.common.weaver.interfaces.ffp.ContainerEvent;
import com.meituan.android.common.weaver.interfaces.ffp.FFPUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FragmentPagePath extends PagePathHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String containerId;
    public final String fragmentClass;
    public final WeakReference<View> rootView;

    @Override // com.meituan.android.common.weaver.impl.natives.PagePathHelper
    public boolean hasSpecialPagePath() {
        return true;
    }

    public FragmentPagePath(@NonNull Activity activity, @NonNull Object obj, @NonNull View view) {
        super(activity);
        Object[] objArr = {activity, obj, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e09ab43166d413c4c4bf99e88d82ca6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e09ab43166d413c4c4bf99e88d82ca6e");
            return;
        }
        this.rootView = new WeakReference<>(view);
        this.containerId = FFPUtil.idOfObj(obj);
        this.fragmentClass = obj.getClass().getName();
        this.pagePath = this.fragmentClass;
    }

    @Override // com.meituan.android.common.weaver.impl.natives.PagePathHelper
    @Nullable
    public View getRootView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d2372d4d55580b97be66bf27f4195cd", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d2372d4d55580b97be66bf27f4195cd") : this.rootView.get();
    }

    @Override // com.meituan.android.common.weaver.impl.natives.PagePathHelper
    public void fillPagePathInfo(@NonNull NativeFFPEvent nativeFFPEvent) {
        Object[] objArr = {nativeFFPEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a9bc5004a7a60ce749e83fd6a70314c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a9bc5004a7a60ce749e83fd6a70314c");
            return;
        }
        super.fillPagePathInfo(nativeFFPEvent);
        nativeFFPEvent.with("tType", "native");
        nativeFFPEvent.with("containerId", this.containerId);
        nativeFFPEvent.with("$containerName", ContainerEvent.CONTAINER_NAME_FRAGMENT);
        nativeFFPEvent.with("nFragment", this.fragmentClass);
    }
}
