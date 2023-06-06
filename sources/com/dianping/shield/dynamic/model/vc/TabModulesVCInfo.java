package com.dianping.shield.dynamic.model.vc;

import com.dianping.shield.dynamic.model.extra.MPTInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00102\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b3\u0010\u0019\"\u0004\b4\u0010\u001b¨\u00065"}, d2 = {"Lcom/dianping/shield/dynamic/model/vc/TabModulesVCInfo;", "", "()V", "backgroundColor", "", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", DMKeys.KEY_CANCEL_PULL_TO_REFRESH_THRESHOLD, "", "getCancelPullToRefreshThreshold", "()Ljava/lang/Integer;", "setCancelPullToRefreshThreshold", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", DMKeys.KEY_VC_INFO_DRAG_REFRESH_INFO, "Lcom/dianping/shield/dynamic/model/vc/DragRefreshInfo;", "getDragRefreshInfo", "()Lcom/dianping/shield/dynamic/model/vc/DragRefreshInfo;", "setDragRefreshInfo", "(Lcom/dianping/shield/dynamic/model/vc/DragRefreshInfo;)V", DMKeys.KEY_ENABLE_BOUNCE, "", "getEnableBounce", "()Ljava/lang/Boolean;", "setEnableBounce", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", DMKeys.KEY_VC_INFO_MPT_INFO, "Lcom/dianping/shield/dynamic/model/extra/MPTInfo;", "getMptInfo", "()Lcom/dianping/shield/dynamic/model/extra/MPTInfo;", "setMptInfo", "(Lcom/dianping/shield/dynamic/model/extra/MPTInfo;)V", "pageBackgroundColor", "getPageBackgroundColor", "setPageBackgroundColor", "separatorLineInfo", "Lcom/dianping/shield/dynamic/model/vc/SeparatorLineInfo;", "getSeparatorLineInfo", "()Lcom/dianping/shield/dynamic/model/vc/SeparatorLineInfo;", "setSeparatorLineInfo", "(Lcom/dianping/shield/dynamic/model/vc/SeparatorLineInfo;)V", DMKeys.KEY_VC_INFO_SETTING_INFO, "Lcom/dianping/shield/dynamic/model/vc/ModulesVCSettingInfo;", "getSettingInfo", "()Lcom/dianping/shield/dynamic/model/vc/ModulesVCSettingInfo;", "setSettingInfo", "(Lcom/dianping/shield/dynamic/model/vc/ModulesVCSettingInfo;)V", DMKeys.KEY_SHOW_SCROLL_INDICATOR, "getShowScrollIndicator", "setShowScrollIndicator", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class TabModulesVCInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private String backgroundColor;
    @Nullable
    private Integer cancelPullToRefreshThreshold;
    @Nullable
    private DragRefreshInfo dragRefreshInfo;
    @Nullable
    private Boolean enableBounce;
    @Nullable
    private MPTInfo mptInfo;
    @Nullable
    private String pageBackgroundColor;
    @Nullable
    private SeparatorLineInfo separatorLineInfo;
    @Nullable
    private ModulesVCSettingInfo settingInfo;
    @Nullable
    private Boolean showScrollIndicator;

    @Nullable
    public final ModulesVCSettingInfo getSettingInfo() {
        return this.settingInfo;
    }

    public final void setSettingInfo(@Nullable ModulesVCSettingInfo modulesVCSettingInfo) {
        this.settingInfo = modulesVCSettingInfo;
    }

    @Nullable
    public final SeparatorLineInfo getSeparatorLineInfo() {
        return this.separatorLineInfo;
    }

    public final void setSeparatorLineInfo(@Nullable SeparatorLineInfo separatorLineInfo) {
        this.separatorLineInfo = separatorLineInfo;
    }

    @Nullable
    public final DragRefreshInfo getDragRefreshInfo() {
        return this.dragRefreshInfo;
    }

    public final void setDragRefreshInfo(@Nullable DragRefreshInfo dragRefreshInfo) {
        this.dragRefreshInfo = dragRefreshInfo;
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
    public final Integer getCancelPullToRefreshThreshold() {
        return this.cancelPullToRefreshThreshold;
    }

    public final void setCancelPullToRefreshThreshold(@Nullable Integer num) {
        this.cancelPullToRefreshThreshold = num;
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
}
