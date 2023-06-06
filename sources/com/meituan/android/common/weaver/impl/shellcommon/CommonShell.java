package com.meituan.android.common.weaver.impl.shellcommon;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.android.common.weaver.impl.IShell;
import com.meituan.android.common.weaver.impl.map.MapViewMatcher;
import com.meituan.android.common.weaver.impl.mrn.MRNFragmentPagePath;
import com.meituan.android.common.weaver.impl.mrn.ReactRootViewMatcher;
import com.meituan.android.common.weaver.impl.natives.INativeEnd;
import com.meituan.android.common.weaver.impl.natives.PagePathHelper;
import com.meituan.android.common.weaver.impl.natives.matchers.AbstractViewMatcher;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CommonShell implements IShell {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean closeMapViewMatcher;

    public CommonShell() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6acf8ee810b34e7f17186d99f49a3db0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6acf8ee810b34e7f17186d99f49a3db0");
        } else {
            this.closeMapViewMatcher = false;
        }
    }

    public CommonShell(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dba13546ae370f79cba491538cbb4615", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dba13546ae370f79cba491538cbb4615");
            return;
        }
        this.closeMapViewMatcher = false;
        this.closeMapViewMatcher = z;
    }

    @Override // com.meituan.android.common.weaver.impl.IShell
    @Nullable
    public AbstractViewMatcher newMRNRootFinder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50a8d8e53e4d0ed1875255f97ebfb602", RobustBitConfig.DEFAULT_VALUE) ? (AbstractViewMatcher) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50a8d8e53e4d0ed1875255f97ebfb602") : new ReactRootViewMatcher();
    }

    @Override // com.meituan.android.common.weaver.impl.IShell
    @NonNull
    public List<AbstractViewMatcher> additionalViewMatcher(@NonNull INativeEnd iNativeEnd) {
        Object[] objArr = {iNativeEnd};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b013fa29822aa2a70a6803bd066e371a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b013fa29822aa2a70a6803bd066e371a");
        }
        if (!this.closeMapViewMatcher) {
            return Collections.singletonList(new MapViewMatcher(iNativeEnd));
        }
        return Collections.emptyList();
    }

    @Override // com.meituan.android.common.weaver.impl.IShell
    @Nullable
    public PagePathHelper fragmentPathHelper(@NonNull Activity activity, @NonNull Object obj, @NonNull View view) {
        Object[] objArr = {activity, obj, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "279f9a8c0b43d1243ab890930622e2f1", RobustBitConfig.DEFAULT_VALUE) ? (PagePathHelper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "279f9a8c0b43d1243ab890930622e2f1") : MRNFragmentPagePath.generate(activity, obj, view);
    }
}
