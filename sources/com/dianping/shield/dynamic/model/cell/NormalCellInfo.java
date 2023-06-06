package com.dianping.shield.dynamic.model.cell;

import com.dianping.shield.dynamic.model.cell.CellInfo;
import com.dianping.shield.dynamic.model.extra.ActionsConfigurationInfo;
import com.dianping.shield.dynamic.model.extra.ExposeInfo;
import com.dianping.shield.dynamic.model.view.BaseViewInfo;
import com.dianping.shield.dynamic.model.view.ReusableViewInfoProps;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0011\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u000bR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\t\"\u0004\b+\u0010\u000bR\u001c\u0010,\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\t\"\u0004\b.\u0010\u000bR\u001c\u0010/\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\t\"\u0004\b1\u0010\u000bR\u001c\u00102\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\t\"\u0004\b4\u0010\u000bR\u001e\u00105\u001a\u0004\u0018\u00010\rX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b6\u0010\u000f\"\u0004\b7\u0010\u0011R(\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u000109X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010>\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\t\"\u0004\b@\u0010\u000bR\u001e\u0010A\u001a\u0004\u0018\u00010\rX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\bB\u0010\u000f\"\u0004\bC\u0010\u0011R\u001c\u0010D\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\t\"\u0004\bF\u0010\u000bR\u001c\u0010G\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\t\"\u0004\bI\u0010\u000bR\u001c\u0010J\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001c\u0010P\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\t\"\u0004\bR\u0010\u000bR\u001c\u0010S\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\t\"\u0004\bU\u0010\u000bR\u001e\u0010V\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\bW\u0010\u001c\"\u0004\bX\u0010\u001eR\u001c\u0010Y\u001a\u0004\u0018\u00010ZX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001c\u0010_\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010M\"\u0004\ba\u0010OR\u001e\u0010b\u001a\u0004\u0018\u00010\rX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\bc\u0010\u000f\"\u0004\bd\u0010\u0011R\u001e\u0010e\u001a\u0004\u0018\u00010\rX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\bf\u0010\u000f\"\u0004\bg\u0010\u0011R\u001c\u0010h\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\t\"\u0004\bj\u0010\u000b¨\u0006k"}, d2 = {"Lcom/dianping/shield/dynamic/model/cell/NormalCellInfo;", "Lcom/dianping/shield/dynamic/model/cell/CellInfo$BaseCellInfo;", "Lcom/dianping/shield/dynamic/model/view/BaseViewInfo;", "Lcom/dianping/shield/dynamic/model/extra/ExposeInfo;", "Lcom/dianping/shield/dynamic/model/view/ReusableViewInfoProps;", "()V", DMKeys.KEY_APPEAR_ON_SCREEN_CALLBACK, "", "getAppearOnScreenCallback", "()Ljava/lang/String;", "setAppearOnScreenCallback", "(Ljava/lang/String;)V", DMKeys.KEY_ARROW_OFFSET, "", "getArrowOffset", "()Ljava/lang/Integer;", "setArrowOffset", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", DMKeys.KEY_ARROW_POSITION_TYPE, "getArrowPositionType", "setArrowPositionType", DMKeys.KEY_ARROW_TINT_COLOR, "getArrowTintColor", "setArrowTintColor", DMKeys.KEY_CAN_REPEAT_EXPOSE, "", "getCanRepeatExpose", "()Ljava/lang/Boolean;", "setCanRepeatExpose", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", DMKeys.KEY_VIEW_CLIP_TO_BOUNDS, "getClipToBounds", "setClipToBounds", "context", "Lorg/json/JSONObject;", "getContext", "()Lorg/json/JSONObject;", "setContext", "(Lorg/json/JSONObject;)V", "data", "getData", "setData", DMKeys.KEY_DID_END_DISPLAY_CALLBACK, "getDidEndDisplayingCallback", "setDidEndDisplayingCallback", DMKeys.KEY_DID_SELECT_CALLBACK, "getDidSelectCallback", "setDidSelectCallback", DMKeys.KEY_DISAPPEAR_FROM_SCREEN_CALLBACK, "getDisappearFromScreenCallback", "setDisappearFromScreenCallback", DMKeys.KEY_ESTIMATED_HEIGHT, "getEstimatedHeight", "setEstimatedHeight", "events", "", "getEvents", "()Ljava/util/Map;", "setEvents", "(Ljava/util/Map;)V", DMKeys.KEY_EXPOSE_CALLBACK, "getExposeCallback", "setExposeCallback", DMKeys.KEY_EXPOSE_DELAY, "getExposeDelay", "setExposeDelay", DMKeys.KEY_PICASSO_JSNAME, "getJsName", "setJsName", DMKeys.KEY_JUMP_URL, "getJumpUrl", "setJumpUrl", DMKeys.KEY_LEADING_ACITONS_CONFIGURATION, "Lcom/dianping/shield/dynamic/model/extra/ActionsConfigurationInfo;", "getLeadingActionsConfiguration", "()Lcom/dianping/shield/dynamic/model/extra/ActionsConfigurationInfo;", "setLeadingActionsConfiguration", "(Lcom/dianping/shield/dynamic/model/extra/ActionsConfigurationInfo;)V", DMKeys.KEY_REUSE_IDENTIFIER, "getReuseIdentifier", "setReuseIdentifier", "reuseid", "getReuseid", "setReuseid", DMKeys.KEY_SHOW_ARROW, "getShowArrow", "setShowArrow", "skeletonData", "", "getSkeletonData", "()Ljava/lang/Object;", "setSkeletonData", "(Ljava/lang/Object;)V", DMKeys.KEY_TRAILING_ACITONS_CONFIGURATION, "getTrailingActionsConfiguration", "setTrailingActionsConfiguration", DMKeys.KEY_VIEW_REACT_TAG, "getViewReactTag", "setViewReactTag", DMKeys.KEY_VIEW_TYPE, "getViewType", "setViewType", DMKeys.KEY_WILL_DISPLAY_CALLBACK, "getWillDisplayCallback", "setWillDisplayCallback", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class NormalCellInfo extends CellInfo.BaseCellInfo implements ExposeInfo, BaseViewInfo, ReusableViewInfoProps {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private String appearOnScreenCallback;
    @Nullable
    private Integer arrowOffset;
    @Nullable
    private Integer arrowPositionType;
    @Nullable
    private String arrowTintColor;
    @Nullable
    private Boolean canRepeatExpose;
    @Nullable
    private Boolean clipToBounds;
    @Nullable
    private JSONObject context;
    @Nullable
    private String data;
    @Nullable
    private String didEndDisplayingCallback;
    @Nullable
    private String didSelectCallback;
    @Nullable
    private String disappearFromScreenCallback;
    @Nullable
    private Integer estimatedHeight;
    @Nullable
    private Map<String, String> events;
    @Nullable
    private String exposeCallback;
    @Nullable
    private Integer exposeDelay;
    @Nullable
    private String jsName;
    @Nullable
    private String jumpUrl;
    @Nullable
    private ActionsConfigurationInfo leadingActionsConfiguration;
    @Nullable
    private String reuseIdentifier;
    @Nullable
    private String reuseid;
    @Nullable
    private Boolean showArrow;
    @Nullable
    private Object skeletonData;
    @Nullable
    private ActionsConfigurationInfo trailingActionsConfiguration;
    @Nullable
    private Integer viewReactTag;
    @Nullable
    private Integer viewType;
    @Nullable
    private String willDisplayCallback;

    @Override // com.dianping.shield.dynamic.model.view.ReusableViewInfoProps
    @Nullable
    public final String getWillDisplayCallback() {
        return this.willDisplayCallback;
    }

    @Override // com.dianping.shield.dynamic.model.view.ReusableViewInfoProps
    public final void setWillDisplayCallback(@Nullable String str) {
        this.willDisplayCallback = str;
    }

    @Override // com.dianping.shield.dynamic.model.view.ReusableViewInfoProps
    @Nullable
    public final String getDidEndDisplayingCallback() {
        return this.didEndDisplayingCallback;
    }

    @Override // com.dianping.shield.dynamic.model.view.ReusableViewInfoProps
    public final void setDidEndDisplayingCallback(@Nullable String str) {
        this.didEndDisplayingCallback = str;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    @Nullable
    public final String getReuseid() {
        return this.reuseid;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    public final void setReuseid(@Nullable String str) {
        this.reuseid = str;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    @Nullable
    public final String getJsName() {
        return this.jsName;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    public final void setJsName(@Nullable String str) {
        this.jsName = str;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    @Nullable
    public final JSONObject getContext() {
        return this.context;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    public final void setContext(@Nullable JSONObject jSONObject) {
        this.context = jSONObject;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    @Nullable
    public final Integer getViewType() {
        return this.viewType;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    public final void setViewType(@Nullable Integer num) {
        this.viewType = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    @Nullable
    public final Integer getViewReactTag() {
        return this.viewReactTag;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    public final void setViewReactTag(@Nullable Integer num) {
        this.viewReactTag = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    @Nullable
    public final String getData() {
        return this.data;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    public final void setData(@Nullable String str) {
        this.data = str;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    public final void setJumpUrl(@Nullable String str) {
        this.jumpUrl = str;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    @Nullable
    public final String getDidSelectCallback() {
        return this.didSelectCallback;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    public final void setDidSelectCallback(@Nullable String str) {
        this.didSelectCallback = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    @Nullable
    public final Integer getExposeDelay() {
        return this.exposeDelay;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    public final void setExposeDelay(@Nullable Integer num) {
        this.exposeDelay = num;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    @Nullable
    public final Boolean getCanRepeatExpose() {
        return this.canRepeatExpose;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    public final void setCanRepeatExpose(@Nullable Boolean bool) {
        this.canRepeatExpose = bool;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    @Nullable
    public final String getExposeCallback() {
        return this.exposeCallback;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    public final void setExposeCallback(@Nullable String str) {
        this.exposeCallback = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    @Nullable
    public final String getAppearOnScreenCallback() {
        return this.appearOnScreenCallback;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    public final void setAppearOnScreenCallback(@Nullable String str) {
        this.appearOnScreenCallback = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    @Nullable
    public final String getDisappearFromScreenCallback() {
        return this.disappearFromScreenCallback;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    public final void setDisappearFromScreenCallback(@Nullable String str) {
        this.disappearFromScreenCallback = str;
    }

    @Nullable
    public final Boolean getShowArrow() {
        return this.showArrow;
    }

    public final void setShowArrow(@Nullable Boolean bool) {
        this.showArrow = bool;
    }

    @Nullable
    public final Integer getArrowPositionType() {
        return this.arrowPositionType;
    }

    public final void setArrowPositionType(@Nullable Integer num) {
        this.arrowPositionType = num;
    }

    @Nullable
    public final Integer getArrowOffset() {
        return this.arrowOffset;
    }

    public final void setArrowOffset(@Nullable Integer num) {
        this.arrowOffset = num;
    }

    @Nullable
    public final String getArrowTintColor() {
        return this.arrowTintColor;
    }

    public final void setArrowTintColor(@Nullable String str) {
        this.arrowTintColor = str;
    }

    @Override // com.dianping.shield.dynamic.model.view.ReusableViewInfoProps
    @Nullable
    public final String getReuseIdentifier() {
        return this.reuseIdentifier;
    }

    @Override // com.dianping.shield.dynamic.model.view.ReusableViewInfoProps
    public final void setReuseIdentifier(@Nullable String str) {
        this.reuseIdentifier = str;
    }

    @Override // com.dianping.shield.dynamic.model.view.ReusableViewInfoProps
    @Nullable
    public final Object getSkeletonData() {
        return this.skeletonData;
    }

    @Override // com.dianping.shield.dynamic.model.view.ReusableViewInfoProps
    public final void setSkeletonData(@Nullable Object obj) {
        this.skeletonData = obj;
    }

    @Override // com.dianping.shield.dynamic.model.view.ReusableViewInfoProps
    @Nullable
    public final Integer getEstimatedHeight() {
        return this.estimatedHeight;
    }

    @Override // com.dianping.shield.dynamic.model.view.ReusableViewInfoProps
    public final void setEstimatedHeight(@Nullable Integer num) {
        this.estimatedHeight = num;
    }

    @Nullable
    public final Boolean getClipToBounds() {
        return this.clipToBounds;
    }

    public final void setClipToBounds(@Nullable Boolean bool) {
        this.clipToBounds = bool;
    }

    @Nullable
    public final ActionsConfigurationInfo getLeadingActionsConfiguration() {
        return this.leadingActionsConfiguration;
    }

    public final void setLeadingActionsConfiguration(@Nullable ActionsConfigurationInfo actionsConfigurationInfo) {
        this.leadingActionsConfiguration = actionsConfigurationInfo;
    }

    @Nullable
    public final ActionsConfigurationInfo getTrailingActionsConfiguration() {
        return this.trailingActionsConfiguration;
    }

    public final void setTrailingActionsConfiguration(@Nullable ActionsConfigurationInfo actionsConfigurationInfo) {
        this.trailingActionsConfiguration = actionsConfigurationInfo;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    @Nullable
    public final Map<String, String> getEvents() {
        return this.events;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    public final void setEvents(@Nullable Map<String, String> map) {
        this.events = map;
    }
}
