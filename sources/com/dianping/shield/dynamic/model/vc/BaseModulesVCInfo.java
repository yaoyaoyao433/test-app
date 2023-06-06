package com.dianping.shield.dynamic.model.vc;

import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.extra.MPTInfo;
import com.dianping.shield.dynamic.model.view.DragRefreshViewInfo;
import com.dianping.shield.dynamic.model.view.ExtraViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u00103\u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b4\u0010#\"\u0004\b5\u0010%R\u001e\u00106\u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b7\u0010#\"\u0004\b8\u0010%R\u001c\u00109\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001e\u0010<\u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b=\u0010#\"\u0004\b>\u0010%R\u001c\u0010?\u001a\u0004\u0018\u00010@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001e\u0010E\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\bF\u0010\u001c\"\u0004\bG\u0010\u001eR\u001c\u0010H\u001a\u0004\u0018\u00010@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010DR\u001c\u0010K\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\f\"\u0004\bM\u0010\u000eR(\u0010N\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0O\u0018\u00010OX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001c\u0010U\u001a\u0004\u0018\u00010VX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001c\u0010[\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u0006\"\u0004\b]\u0010\bR\u001c\u0010^\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\f\"\u0004\b`\u0010\u000eR\u001c\u0010a\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\f\"\u0004\bc\u0010\u000eR\u001e\u0010d\u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\be\u0010#\"\u0004\bf\u0010%R\u001c\u0010g\u001a\u0004\u0018\u00010hX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001c\u0010m\u001a\u0004\u0018\u00010nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u001e\u0010s\u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\bt\u0010#\"\u0004\bu\u0010%R\u001c\u0010v\u001a\u0004\u0018\u00010wX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{¨\u0006|"}, d2 = {"Lcom/dianping/shield/dynamic/model/vc/BaseModulesVCInfo;", "Lcom/dianping/shield/dynamic/model/DiffableInfo;", "()V", "backgroundColor", "", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", "backgroundView", "Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;", "getBackgroundView", "()Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;", "setBackgroundView", "(Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;)V", DMKeys.KEY_CONFIG_KEY, "getConfigKey", "setConfigKey", "configKeys", "", "getConfigKeys", "()[Ljava/lang/String;", "setConfigKeys", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "delayForAutoExpose", "", "getDelayForAutoExpose", "()Ljava/lang/Integer;", "setDelayForAutoExpose", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "disableFling", "", "getDisableFling", "()Ljava/lang/Boolean;", "setDisableFling", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", DMKeys.KEY_VC_INFO_DRAG_REFRESH_INFO, "Lcom/dianping/shield/dynamic/model/vc/DragRefreshInfo;", "getDragRefreshInfo", "()Lcom/dianping/shield/dynamic/model/vc/DragRefreshInfo;", "setDragRefreshInfo", "(Lcom/dianping/shield/dynamic/model/vc/DragRefreshInfo;)V", "dragRefreshView", "Lcom/dianping/shield/dynamic/model/view/DragRefreshViewInfo;", "getDragRefreshView", "()Lcom/dianping/shield/dynamic/model/view/DragRefreshViewInfo;", "setDragRefreshView", "(Lcom/dianping/shield/dynamic/model/view/DragRefreshViewInfo;)V", DMKeys.KEY_ENABLE_BOUNCE, "getEnableBounce", "setEnableBounce", "enableFrozen", "getEnableFrozen", "setEnableFrozen", "frozenModuleKey", "getFrozenModuleKey", "setFrozenModuleKey", "limitScrollSpeed", "getLimitScrollSpeed", "setLimitScrollSpeed", "loadingFailView", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "getLoadingFailView", "()Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "setLoadingFailView", "(Lcom/dianping/shield/dynamic/model/view/ViewInfo;)V", "loadingStatus", "getLoadingStatus", "setLoadingStatus", "loadingView", "getLoadingView", "setLoadingView", "maskView", "getMaskView", "setMaskView", DMKeys.KEY_MODULE_KEYS, "", "Lcom/dianping/shield/dynamic/model/vc/ModuleKeyUnionType;", "getModuleKeys", "()Ljava/util/List;", "setModuleKeys", "(Ljava/util/List;)V", DMKeys.KEY_VC_INFO_MPT_INFO, "Lcom/dianping/shield/dynamic/model/extra/MPTInfo;", "getMptInfo", "()Lcom/dianping/shield/dynamic/model/extra/MPTInfo;", "setMptInfo", "(Lcom/dianping/shield/dynamic/model/extra/MPTInfo;)V", "pageBackgroundColor", "getPageBackgroundColor", "setPageBackgroundColor", "pageBackgroundView", "getPageBackgroundView", "setPageBackgroundView", "pageMaskView", "getPageMaskView", "setPageMaskView", "scrollEnabled", "getScrollEnabled", "setScrollEnabled", "separatorLineInfo", "Lcom/dianping/shield/dynamic/model/vc/SeparatorLineInfo;", "getSeparatorLineInfo", "()Lcom/dianping/shield/dynamic/model/vc/SeparatorLineInfo;", "setSeparatorLineInfo", "(Lcom/dianping/shield/dynamic/model/vc/SeparatorLineInfo;)V", DMKeys.KEY_VC_INFO_SETTING_INFO, "Lcom/dianping/shield/dynamic/model/vc/ModulesVCSettingInfo;", "getSettingInfo", "()Lcom/dianping/shield/dynamic/model/vc/ModulesVCSettingInfo;", "setSettingInfo", "(Lcom/dianping/shield/dynamic/model/vc/ModulesVCSettingInfo;)V", DMKeys.KEY_SHOW_SCROLL_INDICATOR, "getShowScrollIndicator", "setShowScrollIndicator", DMKeys.KEY_VC_INFO_TITLE_BAR_INFO, "Lcom/dianping/shield/dynamic/model/vc/TitleBarInfo;", "getTitleBarInfo", "()Lcom/dianping/shield/dynamic/model/vc/TitleBarInfo;", "setTitleBarInfo", "(Lcom/dianping/shield/dynamic/model/vc/TitleBarInfo;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class BaseModulesVCInfo implements DiffableInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private String backgroundColor;
    @Nullable
    private ExtraViewInfo backgroundView;
    @Nullable
    private String configKey;
    @Nullable
    private String[] configKeys;
    @Nullable
    private Integer delayForAutoExpose;
    @Nullable
    private Boolean disableFling;
    @Nullable
    private DragRefreshInfo dragRefreshInfo;
    @Nullable
    private DragRefreshViewInfo dragRefreshView;
    @Nullable
    private Boolean enableBounce;
    @Nullable
    private Boolean enableFrozen;
    @Nullable
    private String frozenModuleKey;
    @Nullable
    private Boolean limitScrollSpeed;
    @Nullable
    private ViewInfo loadingFailView;
    @Nullable
    private Integer loadingStatus;
    @Nullable
    private ViewInfo loadingView;
    @Nullable
    private ExtraViewInfo maskView;
    @Nullable
    private List<? extends List<? extends ModuleKeyUnionType>> moduleKeys;
    @Nullable
    private MPTInfo mptInfo;
    @Nullable
    private String pageBackgroundColor;
    @Nullable
    private ExtraViewInfo pageBackgroundView;
    @Nullable
    private ExtraViewInfo pageMaskView;
    @Nullable
    private Boolean scrollEnabled;
    @Nullable
    private SeparatorLineInfo separatorLineInfo;
    @Nullable
    private ModulesVCSettingInfo settingInfo;
    @Nullable
    private Boolean showScrollIndicator;
    @Nullable
    private TitleBarInfo titleBarInfo;

    public BaseModulesVCInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b22fd5e093c14ab6d762946c7977730", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b22fd5e093c14ab6d762946c7977730");
        } else {
            this.disableFling = Boolean.FALSE;
        }
    }

    @Nullable
    public final String getConfigKey() {
        return this.configKey;
    }

    public final void setConfigKey(@Nullable String str) {
        this.configKey = str;
    }

    @Nullable
    public final String[] getConfigKeys() {
        return this.configKeys;
    }

    public final void setConfigKeys(@Nullable String[] strArr) {
        this.configKeys = strArr;
    }

    @Nullable
    public final List<List<ModuleKeyUnionType>> getModuleKeys() {
        return this.moduleKeys;
    }

    public final void setModuleKeys(@Nullable List<? extends List<? extends ModuleKeyUnionType>> list) {
        this.moduleKeys = list;
    }

    @Nullable
    public final SeparatorLineInfo getSeparatorLineInfo() {
        return this.separatorLineInfo;
    }

    public final void setSeparatorLineInfo(@Nullable SeparatorLineInfo separatorLineInfo) {
        this.separatorLineInfo = separatorLineInfo;
    }

    @Nullable
    public final ModulesVCSettingInfo getSettingInfo() {
        return this.settingInfo;
    }

    public final void setSettingInfo(@Nullable ModulesVCSettingInfo modulesVCSettingInfo) {
        this.settingInfo = modulesVCSettingInfo;
    }

    @Nullable
    public final DragRefreshInfo getDragRefreshInfo() {
        return this.dragRefreshInfo;
    }

    public final void setDragRefreshInfo(@Nullable DragRefreshInfo dragRefreshInfo) {
        this.dragRefreshInfo = dragRefreshInfo;
    }

    @Nullable
    public final TitleBarInfo getTitleBarInfo() {
        return this.titleBarInfo;
    }

    public final void setTitleBarInfo(@Nullable TitleBarInfo titleBarInfo) {
        this.titleBarInfo = titleBarInfo;
    }

    @Nullable
    public final Integer getLoadingStatus() {
        return this.loadingStatus;
    }

    public final void setLoadingStatus(@Nullable Integer num) {
        this.loadingStatus = num;
    }

    @Nullable
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final void setBackgroundColor(@Nullable String str) {
        this.backgroundColor = str;
    }

    @Nullable
    public final String getPageBackgroundColor() {
        return this.pageBackgroundColor;
    }

    public final void setPageBackgroundColor(@Nullable String str) {
        this.pageBackgroundColor = str;
    }

    @Nullable
    public final MPTInfo getMptInfo() {
        return this.mptInfo;
    }

    public final void setMptInfo(@Nullable MPTInfo mPTInfo) {
        this.mptInfo = mPTInfo;
    }

    @Nullable
    public final Boolean getEnableBounce() {
        return this.enableBounce;
    }

    public final void setEnableBounce(@Nullable Boolean bool) {
        this.enableBounce = bool;
    }

    @Nullable
    public final Boolean getShowScrollIndicator() {
        return this.showScrollIndicator;
    }

    public final void setShowScrollIndicator(@Nullable Boolean bool) {
        this.showScrollIndicator = bool;
    }

    @Nullable
    public final Boolean getEnableFrozen() {
        return this.enableFrozen;
    }

    public final void setEnableFrozen(@Nullable Boolean bool) {
        this.enableFrozen = bool;
    }

    @Nullable
    public final String getFrozenModuleKey() {
        return this.frozenModuleKey;
    }

    public final void setFrozenModuleKey(@Nullable String str) {
        this.frozenModuleKey = str;
    }

    @Nullable
    public final Boolean getLimitScrollSpeed() {
        return this.limitScrollSpeed;
    }

    public final void setLimitScrollSpeed(@Nullable Boolean bool) {
        this.limitScrollSpeed = bool;
    }

    @Nullable
    public final ViewInfo getLoadingView() {
        return this.loadingView;
    }

    public final void setLoadingView(@Nullable ViewInfo viewInfo) {
        this.loadingView = viewInfo;
    }

    @Nullable
    public final ViewInfo getLoadingFailView() {
        return this.loadingFailView;
    }

    public final void setLoadingFailView(@Nullable ViewInfo viewInfo) {
        this.loadingFailView = viewInfo;
    }

    @Nullable
    public final ExtraViewInfo getBackgroundView() {
        return this.backgroundView;
    }

    public final void setBackgroundView(@Nullable ExtraViewInfo extraViewInfo) {
        this.backgroundView = extraViewInfo;
    }

    @Nullable
    public final ExtraViewInfo getMaskView() {
        return this.maskView;
    }

    public final void setMaskView(@Nullable ExtraViewInfo extraViewInfo) {
        this.maskView = extraViewInfo;
    }

    @Nullable
    public final ExtraViewInfo getPageBackgroundView() {
        return this.pageBackgroundView;
    }

    public final void setPageBackgroundView(@Nullable ExtraViewInfo extraViewInfo) {
        this.pageBackgroundView = extraViewInfo;
    }

    @Nullable
    public final ExtraViewInfo getPageMaskView() {
        return this.pageMaskView;
    }

    public final void setPageMaskView(@Nullable ExtraViewInfo extraViewInfo) {
        this.pageMaskView = extraViewInfo;
    }

    @Nullable
    public final DragRefreshViewInfo getDragRefreshView() {
        return this.dragRefreshView;
    }

    public final void setDragRefreshView(@Nullable DragRefreshViewInfo dragRefreshViewInfo) {
        this.dragRefreshView = dragRefreshViewInfo;
    }

    @Nullable
    public final Boolean getScrollEnabled() {
        return this.scrollEnabled;
    }

    public final void setScrollEnabled(@Nullable Boolean bool) {
        this.scrollEnabled = bool;
    }

    @Nullable
    public final Integer getDelayForAutoExpose() {
        return this.delayForAutoExpose;
    }

    public final void setDelayForAutoExpose(@Nullable Integer num) {
        this.delayForAutoExpose = num;
    }

    @Nullable
    public final Boolean getDisableFling() {
        return this.disableFling;
    }

    public final void setDisableFling(@Nullable Boolean bool) {
        this.disableFling = bool;
    }
}
