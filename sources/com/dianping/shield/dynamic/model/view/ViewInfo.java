package com.dianping.shield.dynamic.model.view;

import com.dianping.shield.dynamic.model.extra.ExposeInfo;
import com.dianping.shield.dynamic.model.extra.MGEInfo;
import com.dianping.shield.dynamic.model.extra.MidasInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR\u001c\u0010 \u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\tR\u001c\u0010#\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR(\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010'X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0007\"\u0004\b.\u0010\tR\u001e\u0010/\u001a\u0004\u0018\u000100X\u0096\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u00106\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0007\"\u0004\b8\u0010\tR\u001c\u00109\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0007\"\u0004\b;\u0010\tR\u001c\u0010<\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0007\"\u0004\b>\u0010\tR\u001c\u0010?\u001a\u0004\u0018\u00010@X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001c\u0010E\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0007\"\u0004\bG\u0010\tR\u001c\u0010H\u001a\u0004\u0018\u00010\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0014\"\u0004\bJ\u0010\u0016R\u001e\u0010K\u001a\u0004\u0018\u000100X\u0096\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\bL\u00102\"\u0004\bM\u00104R\u001e\u0010N\u001a\u0004\u0018\u000100X\u0096\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\bO\u00102\"\u0004\bP\u00104¨\u0006Q"}, d2 = {"Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "Lcom/dianping/shield/dynamic/model/view/BaseViewInfo;", "Lcom/dianping/shield/dynamic/model/extra/ExposeInfo;", "()V", DMKeys.KEY_APPEAR_ON_SCREEN_CALLBACK, "", "getAppearOnScreenCallback", "()Ljava/lang/String;", "setAppearOnScreenCallback", "(Ljava/lang/String;)V", DMKeys.KEY_CAN_REPEAT_EXPOSE, "", "getCanRepeatExpose", "()Ljava/lang/Boolean;", "setCanRepeatExpose", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", DMKeys.KEY_CLICK_MGE_INFO, "Lcom/dianping/shield/dynamic/model/extra/MGEInfo;", "getClickMgeInfo", "()Lcom/dianping/shield/dynamic/model/extra/MGEInfo;", "setClickMgeInfo", "(Lcom/dianping/shield/dynamic/model/extra/MGEInfo;)V", "context", "Lorg/json/JSONObject;", "getContext", "()Lorg/json/JSONObject;", "setContext", "(Lorg/json/JSONObject;)V", "data", "getData", "setData", DMKeys.KEY_DID_SELECT_CALLBACK, "getDidSelectCallback", "setDidSelectCallback", DMKeys.KEY_DISAPPEAR_FROM_SCREEN_CALLBACK, "getDisappearFromScreenCallback", "setDisappearFromScreenCallback", "events", "", "getEvents", "()Ljava/util/Map;", "setEvents", "(Ljava/util/Map;)V", DMKeys.KEY_EXPOSE_CALLBACK, "getExposeCallback", "setExposeCallback", DMKeys.KEY_EXPOSE_DELAY, "", "getExposeDelay", "()Ljava/lang/Integer;", "setExposeDelay", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "identifier", "getIdentifier", "setIdentifier", DMKeys.KEY_PICASSO_JSNAME, "getJsName", "setJsName", DMKeys.KEY_JUMP_URL, "getJumpUrl", "setJumpUrl", DMKeys.KEY_MIDAS_INFO, "Lcom/dianping/shield/dynamic/model/extra/MidasInfo;", "getMidasInfo", "()Lcom/dianping/shield/dynamic/model/extra/MidasInfo;", "setMidasInfo", "(Lcom/dianping/shield/dynamic/model/extra/MidasInfo;)V", "reuseid", "getReuseid", "setReuseid", DMKeys.KEY_VIEW_MGE_INFO, "getViewMgeInfo", "setViewMgeInfo", DMKeys.KEY_VIEW_REACT_TAG, "getViewReactTag", "setViewReactTag", DMKeys.KEY_VIEW_TYPE, "getViewType", "setViewType", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class ViewInfo implements ExposeInfo, BaseViewInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private String appearOnScreenCallback;
    @Nullable
    private Boolean canRepeatExpose;
    @Nullable
    private MGEInfo clickMgeInfo;
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
    private String identifier;
    @Nullable
    private String jsName;
    @Nullable
    private String jumpUrl;
    @Nullable
    private MidasInfo midasInfo;
    @Nullable
    private String reuseid;
    @Nullable
    private MGEInfo viewMgeInfo;
    @Nullable
    private Integer viewReactTag;
    @Nullable
    private Integer viewType;

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    @Nullable
    public String getJumpUrl() {
        return this.jumpUrl;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    public void setJumpUrl(@Nullable String str) {
        this.jumpUrl = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    @Nullable
    public Integer getExposeDelay() {
        return this.exposeDelay;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    public void setExposeDelay(@Nullable Integer num) {
        this.exposeDelay = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    @Nullable
    public String getDidSelectCallback() {
        return this.didSelectCallback;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    public void setDidSelectCallback(@Nullable String str) {
        this.didSelectCallback = str;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    @Nullable
    public MGEInfo getClickMgeInfo() {
        return this.clickMgeInfo;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    public void setClickMgeInfo(@Nullable MGEInfo mGEInfo) {
        this.clickMgeInfo = mGEInfo;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    @Nullable
    public MGEInfo getViewMgeInfo() {
        return this.viewMgeInfo;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    public void setViewMgeInfo(@Nullable MGEInfo mGEInfo) {
        this.viewMgeInfo = mGEInfo;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    @Nullable
    public MidasInfo getMidasInfo() {
        return this.midasInfo;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    public void setMidasInfo(@Nullable MidasInfo midasInfo) {
        this.midasInfo = midasInfo;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    @Nullable
    public Boolean getCanRepeatExpose() {
        return this.canRepeatExpose;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    public void setCanRepeatExpose(@Nullable Boolean bool) {
        this.canRepeatExpose = bool;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    @Nullable
    public String getExposeCallback() {
        return this.exposeCallback;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    public void setExposeCallback(@Nullable String str) {
        this.exposeCallback = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    @Nullable
    public String getAppearOnScreenCallback() {
        return this.appearOnScreenCallback;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    public void setAppearOnScreenCallback(@Nullable String str) {
        this.appearOnScreenCallback = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    @Nullable
    public String getDisappearFromScreenCallback() {
        return this.disappearFromScreenCallback;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    public void setDisappearFromScreenCallback(@Nullable String str) {
        this.disappearFromScreenCallback = str;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    @Nullable
    public Integer getViewReactTag() {
        return this.viewReactTag;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    public void setViewReactTag(@Nullable Integer num) {
        this.viewReactTag = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    @Nullable
    public String getData() {
        return this.data;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    public void setData(@Nullable String str) {
        this.data = str;
    }

    @Override // com.dianping.shield.dynamic.model.DiffableInfo
    @Nullable
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // com.dianping.shield.dynamic.model.DiffableInfo
    public void setIdentifier(@Nullable String str) {
        this.identifier = str;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    @Nullable
    public String getReuseid() {
        return this.reuseid;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    public void setReuseid(@Nullable String str) {
        this.reuseid = str;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    @Nullable
    public String getJsName() {
        return this.jsName;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    public void setJsName(@Nullable String str) {
        this.jsName = str;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    @Nullable
    public JSONObject getContext() {
        return this.context;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    public void setContext(@Nullable JSONObject jSONObject) {
        this.context = jSONObject;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    @Nullable
    public Integer getViewType() {
        return this.viewType;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    public void setViewType(@Nullable Integer num) {
        this.viewType = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    @Nullable
    public Map<String, String> getEvents() {
        return this.events;
    }

    @Override // com.dianping.shield.dynamic.model.view.BaseViewInfo
    public void setEvents(@Nullable Map<String, String> map) {
        this.events = map;
    }
}
