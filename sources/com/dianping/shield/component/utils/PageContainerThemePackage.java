package com.dianping.shield.component.utils;

import android.graphics.Rect;
import com.dianping.shield.feature.LoadingAndLoadingMoreCreator;
import com.dianping.shield.feature.LoadingAndLoadingMoreWithContextCreator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001a\u0010\u001e\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001a\u0010!\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0012\"\u0004\b2\u0010\u0014R\u001a\u00103\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0012\"\u0004\b5\u0010\u0014R\u001a\u00106\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0012\"\u0004\b8\u0010\u0014R\u001a\u00109\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0012\"\u0004\b;\u0010\u0014R\u001a\u0010<\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0018\"\u0004\b>\u0010\u001aR\u001a\u0010?\u001a\u00020@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0012\"\u0004\bG\u0010\u0014R\u001a\u0010H\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0012\"\u0004\bJ\u0010\u0014¨\u0006K"}, d2 = {"Lcom/dianping/shield/component/utils/PageContainerThemePackage;", "", "()V", "defaultErrorMessage", "", "getDefaultErrorMessage", "()Ljava/lang/String;", "setDefaultErrorMessage", "(Ljava/lang/String;)V", "dropDownArray", "", "getDropDownArray", "()[I", "setDropDownArray", "([I)V", "headerSize", "", "getHeaderSize", "()I", "setHeaderSize", "(I)V", "innerMargin", "Landroid/graphics/Rect;", "getInnerMargin", "()Landroid/graphics/Rect;", "setInnerMargin", "(Landroid/graphics/Rect;)V", "leftMargin", "getLeftMargin", "setLeftMargin", "loadErrorEmptyLayoutId", "getLoadErrorEmptyLayoutId", "setLoadErrorEmptyLayoutId", "loadingAnimId", "getLoadingAnimId", "setLoadingAnimId", "loadingCreator", "Lcom/dianping/shield/feature/LoadingAndLoadingMoreCreator;", "getLoadingCreator", "()Lcom/dianping/shield/feature/LoadingAndLoadingMoreCreator;", "setLoadingCreator", "(Lcom/dianping/shield/feature/LoadingAndLoadingMoreCreator;)V", "loadingCreatorNeedContext", "Lcom/dianping/shield/feature/LoadingAndLoadingMoreWithContextCreator;", "getLoadingCreatorNeedContext", "()Lcom/dianping/shield/feature/LoadingAndLoadingMoreWithContextCreator;", "setLoadingCreatorNeedContext", "(Lcom/dianping/shield/feature/LoadingAndLoadingMoreWithContextCreator;)V", "loadingDefaultResId", "getLoadingDefaultResId", "setLoadingDefaultResId", "loadingHeaderAnimId", "getLoadingHeaderAnimId", "setLoadingHeaderAnimId", "loadingResId", "getLoadingResId", "setLoadingResId", "loadingSuccessResId", "getLoadingSuccessResId", "setLoadingSuccessResId", "outerMargin", "getOuterMargin", "setOuterMargin", "pageContainerViewResCreate", "Lcom/dianping/shield/component/utils/PageContainerViewResCreater;", "getPageContainerViewResCreate", "()Lcom/dianping/shield/component/utils/PageContainerViewResCreater;", "setPageContainerViewResCreate", "(Lcom/dianping/shield/component/utils/PageContainerViewResCreater;)V", "refreshHeight", "getRefreshHeight", "setRefreshHeight", "rightMargin", "getRightMargin", "setRightMargin", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class PageContainerThemePackage {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private String defaultErrorMessage;
    @Nullable
    private int[] dropDownArray;
    private int headerSize;
    @NotNull
    private Rect innerMargin;
    private int leftMargin;
    private int loadErrorEmptyLayoutId;
    private int loadingAnimId;
    @Nullable
    private LoadingAndLoadingMoreCreator loadingCreator;
    @Nullable
    private LoadingAndLoadingMoreWithContextCreator loadingCreatorNeedContext;
    private int loadingDefaultResId;
    private int loadingHeaderAnimId;
    private int loadingResId;
    private int loadingSuccessResId;
    @NotNull
    private Rect outerMargin;
    @NotNull
    private PageContainerViewResCreater pageContainerViewResCreate;
    private int refreshHeight;
    private int rightMargin;

    public PageContainerThemePackage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bea1178379ad2e800ba08b12632699f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bea1178379ad2e800ba08b12632699f");
            return;
        }
        this.loadingResId = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().getLoadingResId();
        this.loadingHeaderAnimId = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().getLoadingHeaderAnimId();
        this.loadingAnimId = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().getLoadingAnimId();
        this.loadingSuccessResId = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().getLoadingSuccessResId();
        this.loadingDefaultResId = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().getLoadingDefaultResId();
        this.loadErrorEmptyLayoutId = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().getLoadErrorEmptyLayoutId();
        this.defaultErrorMessage = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().getDefaultErrorMessage();
        this.dropDownArray = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().getDropDownArray();
        this.pageContainerViewResCreate = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().getPageContainerViewResCreate();
        this.leftMargin = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().getLeftMargin();
        this.rightMargin = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().getRightMargin();
        this.headerSize = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().getHeaderSize();
        this.refreshHeight = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().getRefreshHeight();
        this.outerMargin = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().getOuterMargin();
        this.innerMargin = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().getInnerMargin();
        this.loadingCreator = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().getLoadingCreator();
        this.loadingCreatorNeedContext = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().getLoadingCreatorNeedContext();
    }

    public final int getLoadingResId() {
        return this.loadingResId;
    }

    public final void setLoadingResId(int i) {
        this.loadingResId = i;
    }

    public final int getLoadingHeaderAnimId() {
        return this.loadingHeaderAnimId;
    }

    public final void setLoadingHeaderAnimId(int i) {
        this.loadingHeaderAnimId = i;
    }

    public final int getLoadingAnimId() {
        return this.loadingAnimId;
    }

    public final void setLoadingAnimId(int i) {
        this.loadingAnimId = i;
    }

    public final int getLoadingSuccessResId() {
        return this.loadingSuccessResId;
    }

    public final void setLoadingSuccessResId(int i) {
        this.loadingSuccessResId = i;
    }

    public final int getLoadingDefaultResId() {
        return this.loadingDefaultResId;
    }

    public final void setLoadingDefaultResId(int i) {
        this.loadingDefaultResId = i;
    }

    public final int getLoadErrorEmptyLayoutId() {
        return this.loadErrorEmptyLayoutId;
    }

    public final void setLoadErrorEmptyLayoutId(int i) {
        this.loadErrorEmptyLayoutId = i;
    }

    @NotNull
    public final String getDefaultErrorMessage() {
        return this.defaultErrorMessage;
    }

    public final void setDefaultErrorMessage(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "189d7da17b2a71f77b10bdc9b5259c7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "189d7da17b2a71f77b10bdc9b5259c7e");
            return;
        }
        h.b(str, "<set-?>");
        this.defaultErrorMessage = str;
    }

    @Nullable
    public final int[] getDropDownArray() {
        return this.dropDownArray;
    }

    public final void setDropDownArray(@Nullable int[] iArr) {
        this.dropDownArray = iArr;
    }

    @NotNull
    public final PageContainerViewResCreater getPageContainerViewResCreate() {
        return this.pageContainerViewResCreate;
    }

    public final void setPageContainerViewResCreate(@NotNull PageContainerViewResCreater pageContainerViewResCreater) {
        Object[] objArr = {pageContainerViewResCreater};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ced597e79bcc2c4a4eee4324699486b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ced597e79bcc2c4a4eee4324699486b");
            return;
        }
        h.b(pageContainerViewResCreater, "<set-?>");
        this.pageContainerViewResCreate = pageContainerViewResCreater;
    }

    public final int getLeftMargin() {
        return this.leftMargin;
    }

    public final void setLeftMargin(int i) {
        this.leftMargin = i;
    }

    public final int getRightMargin() {
        return this.rightMargin;
    }

    public final void setRightMargin(int i) {
        this.rightMargin = i;
    }

    public final int getHeaderSize() {
        return this.headerSize;
    }

    public final void setHeaderSize(int i) {
        this.headerSize = i;
    }

    public final int getRefreshHeight() {
        return this.refreshHeight;
    }

    public final void setRefreshHeight(int i) {
        this.refreshHeight = i;
    }

    @NotNull
    public final Rect getOuterMargin() {
        return this.outerMargin;
    }

    public final void setOuterMargin(@NotNull Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3af03ee50aed116c781231cf38a50ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3af03ee50aed116c781231cf38a50ff");
            return;
        }
        h.b(rect, "<set-?>");
        this.outerMargin = rect;
    }

    @NotNull
    public final Rect getInnerMargin() {
        return this.innerMargin;
    }

    public final void setInnerMargin(@NotNull Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b4bcb397a50498dc52a8d96312d7fd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b4bcb397a50498dc52a8d96312d7fd7");
            return;
        }
        h.b(rect, "<set-?>");
        this.innerMargin = rect;
    }

    @Nullable
    public final LoadingAndLoadingMoreCreator getLoadingCreator() {
        return this.loadingCreator;
    }

    public final void setLoadingCreator(@Nullable LoadingAndLoadingMoreCreator loadingAndLoadingMoreCreator) {
        this.loadingCreator = loadingAndLoadingMoreCreator;
    }

    @Nullable
    public final LoadingAndLoadingMoreWithContextCreator getLoadingCreatorNeedContext() {
        return this.loadingCreatorNeedContext;
    }

    public final void setLoadingCreatorNeedContext(@Nullable LoadingAndLoadingMoreWithContextCreator loadingAndLoadingMoreWithContextCreator) {
        this.loadingCreatorNeedContext = loadingAndLoadingMoreWithContextCreator;
    }
}
