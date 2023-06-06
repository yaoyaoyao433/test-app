package com.dianping.shield.dynamic.model.extra;

import com.dianping.shield.dynamic.utils.DMKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001bX¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b \u0010\u0005\"\u0004\b!\u0010\u0007R\u001a\u0010\"\u001a\u0004\u0018\u00010#X¦\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0005\"\u0004\b*\u0010\u0007R\u001a\u0010+\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b,\u0010\u0005\"\u0004\b-\u0010\u0007R\u001a\u0010.\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b/\u0010\u0005\"\u0004\b0\u0010\u0007R\u001a\u00101\u001a\u0004\u0018\u00010\u000fX¦\u000e¢\u0006\f\u001a\u0004\b2\u0010\u0011\"\u0004\b3\u0010\u0013¨\u00064"}, d2 = {"Lcom/dianping/shield/dynamic/model/extra/HoverInfo;", "", DMKeys.KEY_HOVER_ALWAYS, "", "getAlwaysHover", "()Ljava/lang/Boolean;", "setAlwaysHover", "(Ljava/lang/Boolean;)V", DMKeys.KEY_HOVER_AUTO_OFFSET, "getAutoOffset", "setAutoOffset", DMKeys.KEY_HOVER_AUTO_STOP_HOVER, "getAutoStopHover", "setAutoStopHover", DMKeys.KEY_HOVER_AUTO_STOP_HOVER_TYPE, "", "getAutoStopHoverType", "()Ljava/lang/Integer;", "setAutoStopHoverType", "(Ljava/lang/Integer;)V", DMKeys.KEY_HOVER_OFFSET, "", "getHoverOffset", "()Ljava/lang/Float;", "setHoverOffset", "(Ljava/lang/Float;)V", "hoverScrollEvent", "Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;", "getHoverScrollEvent", "()Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;", "setHoverScrollEvent", "(Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;)V", "isHoverTop", "setHoverTop", "onHoverStatusChanged", "", "getOnHoverStatusChanged", "()Ljava/lang/String;", "setOnHoverStatusChanged", "(Ljava/lang/String;)V", DMKeys.KEY_HOVER_SHOW_BOTTOM_LINE, "getShowBottomLine", "setShowBottomLine", DMKeys.KEY_HOVER_SHOW_SHADOW, "getShowShadow", "setShowShadow", DMKeys.KEY_HOVER_SHOW_TOP_LINE, "getShowTopLine", "setShowTopLine", DMKeys.KEY_HOVER_Z_POSITION, "getZPosition", "setZPosition", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface HoverInfo {
    @Nullable
    Boolean getAlwaysHover();

    @Nullable
    Boolean getAutoOffset();

    @Nullable
    Boolean getAutoStopHover();

    @Nullable
    Integer getAutoStopHoverType();

    @Nullable
    Float getHoverOffset();

    @Nullable
    ScrollEvent getHoverScrollEvent();

    @Nullable
    String getOnHoverStatusChanged();

    @Nullable
    Boolean getShowBottomLine();

    @Nullable
    Boolean getShowShadow();

    @Nullable
    Boolean getShowTopLine();

    @Nullable
    Integer getZPosition();

    @Nullable
    Boolean isHoverTop();

    void setAlwaysHover(@Nullable Boolean bool);

    void setAutoOffset(@Nullable Boolean bool);

    void setAutoStopHover(@Nullable Boolean bool);

    void setAutoStopHoverType(@Nullable Integer num);

    void setHoverOffset(@Nullable Float f);

    void setHoverScrollEvent(@Nullable ScrollEvent scrollEvent);

    void setHoverTop(@Nullable Boolean bool);

    void setOnHoverStatusChanged(@Nullable String str);

    void setShowBottomLine(@Nullable Boolean bool);

    void setShowShadow(@Nullable Boolean bool);

    void setShowTopLine(@Nullable Boolean bool);

    void setZPosition(@Nullable Integer num);
}
