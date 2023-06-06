package com.dianping.shield.dynamic.model.view;

import com.dianping.shield.dynamic.utils.DMKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0001X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0005\"\u0004\b\u0018\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/dianping/shield/dynamic/model/view/ReusableViewInfoProps;", "", DMKeys.KEY_DID_END_DISPLAY_CALLBACK, "", "getDidEndDisplayingCallback", "()Ljava/lang/String;", "setDidEndDisplayingCallback", "(Ljava/lang/String;)V", DMKeys.KEY_ESTIMATED_HEIGHT, "", "getEstimatedHeight", "()Ljava/lang/Integer;", "setEstimatedHeight", "(Ljava/lang/Integer;)V", DMKeys.KEY_REUSE_IDENTIFIER, "getReuseIdentifier", "setReuseIdentifier", "skeletonData", "getSkeletonData", "()Ljava/lang/Object;", "setSkeletonData", "(Ljava/lang/Object;)V", DMKeys.KEY_WILL_DISPLAY_CALLBACK, "getWillDisplayCallback", "setWillDisplayCallback", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface ReusableViewInfoProps {
    @Nullable
    String getDidEndDisplayingCallback();

    @Nullable
    Integer getEstimatedHeight();

    @Nullable
    String getReuseIdentifier();

    @Nullable
    Object getSkeletonData();

    @Nullable
    String getWillDisplayCallback();

    void setDidEndDisplayingCallback(@Nullable String str);

    void setEstimatedHeight(@Nullable Integer num);

    void setReuseIdentifier(@Nullable String str);

    void setSkeletonData(@Nullable Object obj);

    void setWillDisplayCallback(@Nullable String str);
}
