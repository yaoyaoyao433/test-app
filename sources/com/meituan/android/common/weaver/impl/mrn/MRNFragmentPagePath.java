package com.meituan.android.common.weaver.impl.mrn;

import android.app.Activity;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.android.common.weaver.impl.natives.FragmentPagePath;
import com.meituan.android.common.weaver.impl.natives.NativeFFPEvent;
import com.meituan.android.common.weaver.impl.natives.PagePathHelper;
import com.meituan.android.common.weaver.interfaces.ffp.ContainerEvent;
import com.meituan.android.common.weaver.interfaces.ffp.FFPUtil;
import com.meituan.android.mrn.container.MRNBaseFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MRNFragmentPagePath extends PagePathHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String containerId;
    private final Uri fragmentUri;
    private final WeakReference<View> rootView;

    @Override // com.meituan.android.common.weaver.impl.natives.PagePathHelper
    public boolean fullPage() {
        return false;
    }

    @Override // com.meituan.android.common.weaver.impl.natives.PagePathHelper
    public boolean hasSpecialPagePath() {
        return true;
    }

    @Nullable
    public static PagePathHelper generate(@NonNull Activity activity, @Nullable Object obj, @Nullable View view) {
        Object[] objArr = {activity, obj, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "57b0541669980e2f09a3c45d93f4e980", RobustBitConfig.DEFAULT_VALUE)) {
            return (PagePathHelper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "57b0541669980e2f09a3c45d93f4e980");
        }
        if (obj == null || view == null) {
            return null;
        }
        if (obj instanceof MRNBaseFragment) {
            MRNBaseFragment mRNBaseFragment = (MRNBaseFragment) obj;
            if (mRNBaseFragment.m() != null) {
                return new MRNFragmentPagePath(activity, mRNBaseFragment, view);
            }
        }
        return new FragmentPagePath(activity, obj, view);
    }

    public MRNFragmentPagePath(@NonNull Activity activity, @NonNull MRNBaseFragment mRNBaseFragment, @NonNull View view) {
        super(activity);
        Object[] objArr = {activity, mRNBaseFragment, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ed7eb1059003a6237d20d95fe91fa58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ed7eb1059003a6237d20d95fe91fa58");
            return;
        }
        this.rootView = new WeakReference<>(view);
        this.containerId = FFPUtil.idOfObj(mRNBaseFragment);
        this.fragmentUri = mRNBaseFragment.m();
        this.pagePath = PagePathHelper.NativePathHelper.constructMRNPagePath(this.fragmentUri);
    }

    @Override // com.meituan.android.common.weaver.impl.natives.PagePathHelper
    @Nullable
    public View getRootView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e7ba2310665093ae5e2f1fcae2b2222", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e7ba2310665093ae5e2f1fcae2b2222") : this.rootView.get();
    }

    @Override // com.meituan.android.common.weaver.impl.natives.PagePathHelper
    public void fillPagePathInfo(@NonNull NativeFFPEvent nativeFFPEvent) {
        Object[] objArr = {nativeFFPEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b75eee7a46e2b31452921f568b45da7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b75eee7a46e2b31452921f568b45da7b");
            return;
        }
        super.fillPagePathInfo(nativeFFPEvent);
        nativeFFPEvent.with("tType", "mrn");
        nativeFFPEvent.with("containerId", this.containerId);
        nativeFFPEvent.with("$containerName", ContainerEvent.CONTAINER_NAME_FRAGMENT);
        nativeFFPEvent.with("isWidget", Boolean.TRUE);
        PagePathHelper.NativePathHelper.appendMRNInfo(nativeFFPEvent, this.fragmentUri);
    }
}
