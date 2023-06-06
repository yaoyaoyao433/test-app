package com.dianping.shield.dynamic.model.extra;

import com.dianping.shield.dynamic.utils.DMKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/dianping/shield/dynamic/model/extra/ExposeInfo;", "", DMKeys.KEY_APPEAR_ON_SCREEN_CALLBACK, "", "getAppearOnScreenCallback", "()Ljava/lang/String;", "setAppearOnScreenCallback", "(Ljava/lang/String;)V", DMKeys.KEY_CAN_REPEAT_EXPOSE, "", "getCanRepeatExpose", "()Ljava/lang/Boolean;", "setCanRepeatExpose", "(Ljava/lang/Boolean;)V", DMKeys.KEY_DISAPPEAR_FROM_SCREEN_CALLBACK, "getDisappearFromScreenCallback", "setDisappearFromScreenCallback", DMKeys.KEY_EXPOSE_CALLBACK, "getExposeCallback", "setExposeCallback", DMKeys.KEY_EXPOSE_DELAY, "", "getExposeDelay", "()Ljava/lang/Integer;", "setExposeDelay", "(Ljava/lang/Integer;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface ExposeInfo {
    @Nullable
    String getAppearOnScreenCallback();

    @Nullable
    Boolean getCanRepeatExpose();

    @Nullable
    String getDisappearFromScreenCallback();

    @Nullable
    String getExposeCallback();

    @Nullable
    Integer getExposeDelay();

    void setAppearOnScreenCallback(@Nullable String str);

    void setCanRepeatExpose(@Nullable Boolean bool);

    void setDisappearFromScreenCallback(@Nullable String str);

    void setExposeCallback(@Nullable String str);

    void setExposeDelay(@Nullable Integer num);
}
