package com.dianping.shield.dynamic.model.cell;

import com.dianping.shield.dynamic.model.cell.CellInfo;
import com.dianping.shield.dynamic.model.extra.ExposeInfo;
import com.dianping.shield.dynamic.model.extra.HoverInfo;
import com.dianping.shield.dynamic.model.extra.ScrollEvent;
import com.dianping.shield.dynamic.model.view.BaseViewInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b%\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000bR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u000bR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u000bR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010#\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b$\u0010\t\"\u0004\b%\u0010\u000bR\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0010\"\u0004\b.\u0010\u0012R\u001c\u0010/\u001a\u0004\u0018\u00010\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0010\"\u0004\b1\u0010\u0012R\u001c\u00102\u001a\u0004\u0018\u00010\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0010\"\u0004\b4\u0010\u0012R(\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u000106X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010;\u001a\u0004\u0018\u00010\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0010\"\u0004\b=\u0010\u0012R\u001e\u0010>\u001a\u0004\u0018\u00010\u001dX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b?\u0010\u001f\"\u0004\b@\u0010!R\u001e\u0010A\u001a\u0004\u0018\u00010BX\u0096\u000e¢\u0006\u0010\n\u0002\u0010G\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001c\u0010H\u001a\u0004\u0018\u00010IX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001e\u0010N\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\bN\u0010\t\"\u0004\bO\u0010\u000bR\u001c\u0010P\u001a\u0004\u0018\u00010\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u0010\"\u0004\bR\u0010\u0012R\u001c\u0010S\u001a\u0004\u0018\u00010\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0010\"\u0004\bU\u0010\u0012R\u001c\u0010V\u001a\u0004\u0018\u00010\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u0010\"\u0004\bX\u0010\u0012R\u001c\u0010Y\u001a\u0004\u0018\u00010\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u0010\"\u0004\b[\u0010\u0012R\u001e\u0010\\\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b]\u0010\t\"\u0004\b^\u0010\u000bR\u001e\u0010_\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b`\u0010\t\"\u0004\ba\u0010\u000bR\u001e\u0010b\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\bc\u0010\t\"\u0004\bd\u0010\u000bR\u001e\u0010e\u001a\u0004\u0018\u00010\u001dX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\bf\u0010\u001f\"\u0004\bg\u0010!R\u001e\u0010h\u001a\u0004\u0018\u00010\u001dX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\bi\u0010\u001f\"\u0004\bj\u0010!R\u001e\u0010k\u001a\u0004\u0018\u00010\u001dX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\bl\u0010\u001f\"\u0004\bm\u0010!¨\u0006n"}, d2 = {"Lcom/dianping/shield/dynamic/model/cell/HoverCellInfo;", "Lcom/dianping/shield/dynamic/model/cell/CellInfo$BaseCellInfo;", "Lcom/dianping/shield/dynamic/model/view/BaseViewInfo;", "Lcom/dianping/shield/dynamic/model/extra/ExposeInfo;", "Lcom/dianping/shield/dynamic/model/extra/HoverInfo;", "()V", DMKeys.KEY_HOVER_ALWAYS, "", "getAlwaysHover", "()Ljava/lang/Boolean;", "setAlwaysHover", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", DMKeys.KEY_APPEAR_ON_SCREEN_CALLBACK, "", "getAppearOnScreenCallback", "()Ljava/lang/String;", "setAppearOnScreenCallback", "(Ljava/lang/String;)V", "autoKeyboardAware", "getAutoKeyboardAware", "setAutoKeyboardAware", DMKeys.KEY_HOVER_AUTO_OFFSET, "getAutoOffset", "setAutoOffset", DMKeys.KEY_HOVER_AUTO_STOP_HOVER, "getAutoStopHover", "setAutoStopHover", DMKeys.KEY_HOVER_AUTO_STOP_HOVER_TYPE, "", "getAutoStopHoverType", "()Ljava/lang/Integer;", "setAutoStopHoverType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", DMKeys.KEY_CAN_REPEAT_EXPOSE, "getCanRepeatExpose", "setCanRepeatExpose", "context", "Lorg/json/JSONObject;", "getContext", "()Lorg/json/JSONObject;", "setContext", "(Lorg/json/JSONObject;)V", "data", "getData", "setData", DMKeys.KEY_DID_SELECT_CALLBACK, "getDidSelectCallback", "setDidSelectCallback", DMKeys.KEY_DISAPPEAR_FROM_SCREEN_CALLBACK, "getDisappearFromScreenCallback", "setDisappearFromScreenCallback", "events", "", "getEvents", "()Ljava/util/Map;", "setEvents", "(Ljava/util/Map;)V", DMKeys.KEY_EXPOSE_CALLBACK, "getExposeCallback", "setExposeCallback", DMKeys.KEY_EXPOSE_DELAY, "getExposeDelay", "setExposeDelay", DMKeys.KEY_HOVER_OFFSET, "", "getHoverOffset", "()Ljava/lang/Float;", "setHoverOffset", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "hoverScrollEvent", "Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;", "getHoverScrollEvent", "()Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;", "setHoverScrollEvent", "(Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;)V", "isHoverTop", "setHoverTop", DMKeys.KEY_PICASSO_JSNAME, "getJsName", "setJsName", DMKeys.KEY_JUMP_URL, "getJumpUrl", "setJumpUrl", "onHoverStatusChanged", "getOnHoverStatusChanged", "setOnHoverStatusChanged", "reuseid", "getReuseid", "setReuseid", DMKeys.KEY_HOVER_SHOW_BOTTOM_LINE, "getShowBottomLine", "setShowBottomLine", DMKeys.KEY_HOVER_SHOW_SHADOW, "getShowShadow", "setShowShadow", DMKeys.KEY_HOVER_SHOW_TOP_LINE, "getShowTopLine", "setShowTopLine", DMKeys.KEY_VIEW_REACT_TAG, "getViewReactTag", "setViewReactTag", DMKeys.KEY_VIEW_TYPE, "getViewType", "setViewType", DMKeys.KEY_HOVER_Z_POSITION, "getZPosition", "setZPosition", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class HoverCellInfo extends CellInfo.BaseCellInfo implements ExposeInfo, HoverInfo, BaseViewInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private Boolean alwaysHover;
    @Nullable
    private String appearOnScreenCallback;
    @Nullable
    private Boolean autoKeyboardAware;
    @Nullable
    private Boolean autoOffset;
    @Nullable
    private Boolean autoStopHover;
    @Nullable
    private Integer autoStopHoverType;
    @Nullable
    private Boolean canRepeatExpose;
    @Nullable
    private JSONObject context;
    @Nullable
    private String data;
    @Nullable
    private String didSelectCallback;
    @Nullable
    private String disappearFromScreenCallback;
    @Nullable
    private Map<String, String> events;
    @Nullable
    private String exposeCallback;
    @Nullable
    private Integer exposeDelay;
    @Nullable
    private Float hoverOffset;
    @Nullable
    private ScrollEvent hoverScrollEvent;
    @Nullable
    private Boolean isHoverTop;
    @Nullable
    private String jsName;
    @Nullable
    private String jumpUrl;
    @Nullable
    private String onHoverStatusChanged;
    @Nullable
    private String reuseid;
    @Nullable
    private Boolean showBottomLine;
    @Nullable
    private Boolean showShadow;
    @Nullable
    private Boolean showTopLine;
    @Nullable
    private Integer viewReactTag;
    @Nullable
    private Integer viewType;
    @Nullable
    private Integer zPosition;

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

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public final Boolean getAlwaysHover() {
        return this.alwaysHover;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public final void setAlwaysHover(@Nullable Boolean bool) {
        this.alwaysHover = bool;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public final Float getHoverOffset() {
        return this.hoverOffset;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public final void setHoverOffset(@Nullable Float f) {
        this.hoverOffset = f;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public final Boolean getAutoOffset() {
        return this.autoOffset;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public final void setAutoOffset(@Nullable Boolean bool) {
        this.autoOffset = bool;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public final Boolean getShowTopLine() {
        return this.showTopLine;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public final void setShowTopLine(@Nullable Boolean bool) {
        this.showTopLine = bool;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public final Boolean getShowBottomLine() {
        return this.showBottomLine;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public final void setShowBottomLine(@Nullable Boolean bool) {
        this.showBottomLine = bool;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public final Boolean getShowShadow() {
        return this.showShadow;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public final void setShowShadow(@Nullable Boolean bool) {
        this.showShadow = bool;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public final Integer getZPosition() {
        return this.zPosition;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public final void setZPosition(@Nullable Integer num) {
        this.zPosition = num;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public final Boolean getAutoStopHover() {
        return this.autoStopHover;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public final void setAutoStopHover(@Nullable Boolean bool) {
        this.autoStopHover = bool;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public final Integer getAutoStopHoverType() {
        return this.autoStopHoverType;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public final void setAutoStopHoverType(@Nullable Integer num) {
        this.autoStopHoverType = num;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public final String getOnHoverStatusChanged() {
        return this.onHoverStatusChanged;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public final void setOnHoverStatusChanged(@Nullable String str) {
        this.onHoverStatusChanged = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public final Boolean isHoverTop() {
        return this.isHoverTop;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public final void setHoverTop(@Nullable Boolean bool) {
        this.isHoverTop = bool;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public final ScrollEvent getHoverScrollEvent() {
        return this.hoverScrollEvent;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public final void setHoverScrollEvent(@Nullable ScrollEvent scrollEvent) {
        this.hoverScrollEvent = scrollEvent;
    }

    @Nullable
    public final Boolean getAutoKeyboardAware() {
        return this.autoKeyboardAware;
    }

    public final void setAutoKeyboardAware(@Nullable Boolean bool) {
        this.autoKeyboardAware = bool;
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
