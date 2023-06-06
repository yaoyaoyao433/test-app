package com.dianping.shield.component.utils;

import com.dianping.shield.theme.DefaultPageContainerThemeCreator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/dianping/shield/component/utils/PageContainerThemeManager;", "", "()V", "pageContainerThemeCreator", "Lcom/dianping/shield/component/utils/PageContainerThemeCreator;", "getPageContainerThemeCreator", "()Lcom/dianping/shield/component/utils/PageContainerThemeCreator;", "setPageContainerThemeCreator", "(Lcom/dianping/shield/component/utils/PageContainerThemeCreator;)V", "init", "", "creator", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class PageContainerThemeManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final PageContainerThemeManager INSTANCE = new PageContainerThemeManager();
    @NotNull
    private static PageContainerThemeCreator pageContainerThemeCreator = new DefaultPageContainerThemeCreator();

    @NotNull
    public final PageContainerThemeCreator getPageContainerThemeCreator() {
        return pageContainerThemeCreator;
    }

    public final void setPageContainerThemeCreator(@NotNull PageContainerThemeCreator pageContainerThemeCreator2) {
        Object[] objArr = {pageContainerThemeCreator2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0185ba37da453641e57de20df9982062", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0185ba37da453641e57de20df9982062");
            return;
        }
        h.b(pageContainerThemeCreator2, "<set-?>");
        pageContainerThemeCreator = pageContainerThemeCreator2;
    }

    public final void init(@NotNull PageContainerThemeCreator pageContainerThemeCreator2) {
        Object[] objArr = {pageContainerThemeCreator2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6dbcb2e68ab60a54e5d1e8b7e2e8926", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6dbcb2e68ab60a54e5d1e8b7e2e8926");
            return;
        }
        h.b(pageContainerThemeCreator2, "creator");
        pageContainerThemeCreator = pageContainerThemeCreator2;
    }
}
