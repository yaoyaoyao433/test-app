package com.dianping.shield.component.utils;

import android.graphics.Rect;
import android.support.constraint.R;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010L\u001a\u00020MH\u0016R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\n@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0016@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R$\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R$\u0010\"\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015R(\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u0003\u001a\u0004\u0018\u00010%@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u0010,\u001a\u0004\u0018\u00010+2\b\u0010\u0003\u001a\u0004\u0018\u00010+@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00101\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0013\"\u0004\b3\u0010\u0015R$\u00104\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0013\"\u0004\b6\u0010\u0015R$\u00107\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0013\"\u0004\b9\u0010\u0015R$\u0010:\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0013\"\u0004\b<\u0010\u0015R$\u0010=\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0016@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0019\"\u0004\b?\u0010\u001bR$\u0010A\u001a\u00020@2\u0006\u0010\u0003\u001a\u00020@@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010F\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0013\"\u0004\bH\u0010\u0015R$\u0010I\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0013\"\u0004\bK\u0010\u0015¨\u0006N"}, d2 = {"Lcom/dianping/shield/component/utils/PageContainerThemeCreator;", "", "()V", "value", "", "defaultErrorMessage", "getDefaultErrorMessage", "()Ljava/lang/String;", "setDefaultErrorMessage", "(Ljava/lang/String;)V", "", "dropDownArray", "getDropDownArray", "()[I", "setDropDownArray", "([I)V", "", "headerSize", "getHeaderSize", "()I", "setHeaderSize", "(I)V", "Landroid/graphics/Rect;", "innerMargin", "getInnerMargin", "()Landroid/graphics/Rect;", "setInnerMargin", "(Landroid/graphics/Rect;)V", "leftMargin", "getLeftMargin", "setLeftMargin", "loadErrorEmptyLayoutId", "getLoadErrorEmptyLayoutId", "setLoadErrorEmptyLayoutId", "loadingAnimId", "getLoadingAnimId", "setLoadingAnimId", "Lcom/dianping/shield/feature/LoadingAndLoadingMoreCreator;", "loadingCreator", "getLoadingCreator", "()Lcom/dianping/shield/feature/LoadingAndLoadingMoreCreator;", "setLoadingCreator", "(Lcom/dianping/shield/feature/LoadingAndLoadingMoreCreator;)V", "Lcom/dianping/shield/feature/LoadingAndLoadingMoreWithContextCreator;", "loadingCreatorNeedContext", "getLoadingCreatorNeedContext", "()Lcom/dianping/shield/feature/LoadingAndLoadingMoreWithContextCreator;", "setLoadingCreatorNeedContext", "(Lcom/dianping/shield/feature/LoadingAndLoadingMoreWithContextCreator;)V", "loadingDefaultResId", "getLoadingDefaultResId", "setLoadingDefaultResId", "loadingHeaderAnimId", "getLoadingHeaderAnimId", "setLoadingHeaderAnimId", "loadingResId", "getLoadingResId", "setLoadingResId", "loadingSuccessResId", "getLoadingSuccessResId", "setLoadingSuccessResId", "outerMargin", "getOuterMargin", "setOuterMargin", "Lcom/dianping/shield/component/utils/PageContainerViewResCreater;", "pageContainerViewResCreate", "getPageContainerViewResCreate", "()Lcom/dianping/shield/component/utils/PageContainerViewResCreater;", "setPageContainerViewResCreate", "(Lcom/dianping/shield/component/utils/PageContainerViewResCreater;)V", "refreshHeight", "getRefreshHeight", "setRefreshHeight", "rightMargin", "getRightMargin", "setRightMargin", "createTheme", "Lcom/dianping/shield/component/utils/PageContainerThemePackage;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class PageContainerThemeCreator {
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

    public PageContainerThemeCreator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "281b1193eab90e37a9eac40b804bab54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "281b1193eab90e37a9eac40b804bab54");
            return;
        }
        this.loadingAnimId = R.anim.shieldc_loading_rotate_anim;
        this.defaultErrorMessage = "加载失败";
        this.pageContainerViewResCreate = new PageContainerViewResCreater();
        this.leftMargin = 15;
        this.rightMargin = 15;
        this.headerSize = 80;
        this.refreshHeight = 80;
        this.outerMargin = new Rect();
        this.innerMargin = new Rect();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96b3c771ea6c74bbc76df2bec6f32536", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96b3c771ea6c74bbc76df2bec6f32536");
            return;
        }
        h.b(str, "value");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f807c912e2df59bba08f3262ef9d1e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f807c912e2df59bba08f3262ef9d1e1");
            return;
        }
        h.b(pageContainerViewResCreater, "value");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4bd14739d993c63a5ce7b14b1f8b6f2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4bd14739d993c63a5ce7b14b1f8b6f2a");
            return;
        }
        h.b(rect, "value");
        this.outerMargin = rect;
    }

    @NotNull
    public final Rect getInnerMargin() {
        return this.innerMargin;
    }

    public final void setInnerMargin(@NotNull Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f32e9d168587e5805a1c7891add7e205", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f32e9d168587e5805a1c7891add7e205");
            return;
        }
        h.b(rect, "value");
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

    @NotNull
    public PageContainerThemePackage createTheme() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eadd9df6fc22e42338fcb56e902be400", RobustBitConfig.DEFAULT_VALUE) ? (PageContainerThemePackage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eadd9df6fc22e42338fcb56e902be400") : new PageContainerThemePackage();
    }
}
