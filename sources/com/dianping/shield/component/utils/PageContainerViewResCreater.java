package com.dianping.shield.component.utils;

import android.content.Context;
import android.util.AttributeSet;
import com.dianping.shield.component.widgets.ScBaseRefreshHeaderView;
import com.dianping.shield.component.widgets.internal.GCDefaultLoadingView;
import com.dianping.shield.component.widgets.internal.GCLoadingView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/dianping/shield/component/utils/PageContainerViewResCreater;", "", "()V", "createHeaderView", "Lcom/dianping/shield/component/widgets/internal/GCLoadingView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "createPullToRefreshView", "Lcom/dianping/shield/component/widgets/ScBaseRefreshHeaderView;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class PageContainerViewResCreater {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Nullable
    public ScBaseRefreshHeaderView createPullToRefreshView(@NotNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70ff4c273a39ee68b041b3680de5c05f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScBaseRefreshHeaderView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70ff4c273a39ee68b041b3680de5c05f");
        }
        h.b(context, "context");
        return null;
    }

    @NotNull
    public GCLoadingView createHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8fd9981efe8edb86523e3701c9b1e166", RobustBitConfig.DEFAULT_VALUE)) {
            return (GCLoadingView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8fd9981efe8edb86523e3701c9b1e166");
        }
        h.b(context, "context");
        return new GCDefaultLoadingView(context);
    }
}
