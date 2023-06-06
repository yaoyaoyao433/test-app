package com.dianping.shield.theme;

import android.content.Context;
import android.view.View;
import com.dianping.shield.feature.LoadingAndLoadingMoreWithContextCreator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/dianping/shield/theme/LoadingDefaultCreator;", "Lcom/dianping/shield/feature/LoadingAndLoadingMoreWithContextCreator;", "()V", "emptyView", "Landroid/view/View;", "context", "Landroid/content/Context;", "loadingFailedView", "loadingMoreFailedView", "loadingMoreView", "loadingView", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class LoadingDefaultCreator implements LoadingAndLoadingMoreWithContextCreator {
    public static final LoadingDefaultCreator INSTANCE = new LoadingDefaultCreator();
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.feature.LoadingAndLoadingMoreWithContextCreator
    @NotNull
    public final View loadingView(@Nullable Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5291f3c2c740faeec4ffca1d91fbed5a", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5291f3c2c740faeec4ffca1d91fbed5a") : new LoadingView(context);
    }

    @Override // com.dianping.shield.feature.LoadingAndLoadingMoreWithContextCreator
    @NotNull
    public final View loadingFailedView(@Nullable Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a00833bf161a85fbcb37e21f2b6b722", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a00833bf161a85fbcb37e21f2b6b722") : new FailedView(context);
    }

    @Override // com.dianping.shield.feature.LoadingAndLoadingMoreWithContextCreator
    @NotNull
    public final View emptyView(@Nullable Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aeec3b1bfebdb851d9cc4c023b5f29d0", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aeec3b1bfebdb851d9cc4c023b5f29d0") : new ErrorEmptyView(context);
    }

    @Override // com.dianping.shield.feature.LoadingAndLoadingMoreWithContextCreator
    @NotNull
    public final View loadingMoreView(@Nullable Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c5ca0db349fbd32417a262715867423", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c5ca0db349fbd32417a262715867423") : new LoadingView(context);
    }

    @Override // com.dianping.shield.feature.LoadingAndLoadingMoreWithContextCreator
    @NotNull
    public final View loadingMoreFailedView(@Nullable Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c07ba2fe2809f48a1ce62ebe2294cec3", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c07ba2fe2809f48a1ce62ebe2294cec3") : new FailedView(context);
    }
}
