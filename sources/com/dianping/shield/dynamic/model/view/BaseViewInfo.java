package com.dianping.shield.dynamic.model.view;

import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.extra.MGEInfo;
import com.dianping.shield.dynamic.model.extra.MidasInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R&\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0018X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001a\u0010 \u001a\u0004\u0018\u00010\u000fX¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\u001a\u0010#\u001a\u0004\u0018\u00010$X¦\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u0004\u0018\u00010\u000fX¦\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0011\"\u0004\b+\u0010\u0013R\u001a\u0010,\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b-\u0010\u0005\"\u0004\b.\u0010\u0007R\u001a\u0010/\u001a\u0004\u0018\u000100X¦\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u0004\u0018\u000100X¦\u000e¢\u0006\f\u001a\u0004\b6\u00102\"\u0004\b7\u00104¨\u00068"}, d2 = {"Lcom/dianping/shield/dynamic/model/view/BaseViewInfo;", "Lcom/dianping/shield/dynamic/model/DiffableInfo;", DMKeys.KEY_CLICK_MGE_INFO, "Lcom/dianping/shield/dynamic/model/extra/MGEInfo;", "getClickMgeInfo", "()Lcom/dianping/shield/dynamic/model/extra/MGEInfo;", "setClickMgeInfo", "(Lcom/dianping/shield/dynamic/model/extra/MGEInfo;)V", "context", "Lorg/json/JSONObject;", "getContext", "()Lorg/json/JSONObject;", "setContext", "(Lorg/json/JSONObject;)V", "data", "", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", DMKeys.KEY_DID_SELECT_CALLBACK, "getDidSelectCallback", "setDidSelectCallback", "events", "", "getEvents", "()Ljava/util/Map;", "setEvents", "(Ljava/util/Map;)V", DMKeys.KEY_PICASSO_JSNAME, "getJsName", "setJsName", DMKeys.KEY_JUMP_URL, "getJumpUrl", "setJumpUrl", DMKeys.KEY_MIDAS_INFO, "Lcom/dianping/shield/dynamic/model/extra/MidasInfo;", "getMidasInfo", "()Lcom/dianping/shield/dynamic/model/extra/MidasInfo;", "setMidasInfo", "(Lcom/dianping/shield/dynamic/model/extra/MidasInfo;)V", "reuseid", "getReuseid", "setReuseid", DMKeys.KEY_VIEW_MGE_INFO, "getViewMgeInfo", "setViewMgeInfo", DMKeys.KEY_VIEW_REACT_TAG, "", "getViewReactTag", "()Ljava/lang/Integer;", "setViewReactTag", "(Ljava/lang/Integer;)V", DMKeys.KEY_VIEW_TYPE, "getViewType", "setViewType", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface BaseViewInfo extends DiffableInfo {
    @Nullable
    MGEInfo getClickMgeInfo();

    @Nullable
    JSONObject getContext();

    @Nullable
    String getData();

    @Nullable
    String getDidSelectCallback();

    @Nullable
    Map<String, String> getEvents();

    @Nullable
    String getJsName();

    @Nullable
    String getJumpUrl();

    @Nullable
    MidasInfo getMidasInfo();

    @Nullable
    String getReuseid();

    @Nullable
    MGEInfo getViewMgeInfo();

    @Nullable
    Integer getViewReactTag();

    @Nullable
    Integer getViewType();

    void setClickMgeInfo(@Nullable MGEInfo mGEInfo);

    void setContext(@Nullable JSONObject jSONObject);

    void setData(@Nullable String str);

    void setDidSelectCallback(@Nullable String str);

    void setEvents(@Nullable Map<String, String> map);

    void setJsName(@Nullable String str);

    void setJumpUrl(@Nullable String str);

    void setMidasInfo(@Nullable MidasInfo midasInfo);

    void setReuseid(@Nullable String str);

    void setViewMgeInfo(@Nullable MGEInfo mGEInfo);

    void setViewReactTag(@Nullable Integer num);

    void setViewType(@Nullable Integer num);
}
