package com.dianping.shield.dynamic.model.view;

import com.dianping.shield.dynamic.utils.DMKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/dianping/shield/dynamic/model/view/PopViewInfoProps;", "Lcom/dianping/shield/dynamic/model/view/FixedMarginViewInfoProps;", DMKeys.KEY_POP_VIEW_INFO_DISMISS_ANIMATION_TYPE, "", "getDismissAnimationType", "()Ljava/lang/Integer;", "setDismissAnimationType", "(Ljava/lang/Integer;)V", "onDismiss", "", "getOnDismiss", "()Ljava/lang/String;", "setOnDismiss", "(Ljava/lang/String;)V", "onTapMask", "getOnTapMask", "setOnTapMask", DMKeys.KEY_POP_VIEW_INFO_SHOW_ANIMATION_TYPE, "getShowAnimationType", "setShowAnimationType", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface PopViewInfoProps extends FixedMarginViewInfoProps {
    @Nullable
    Integer getDismissAnimationType();

    @Nullable
    String getOnDismiss();

    @Nullable
    String getOnTapMask();

    @Nullable
    Integer getShowAnimationType();

    void setDismissAnimationType(@Nullable Integer num);

    void setOnDismiss(@Nullable String str);

    void setOnTapMask(@Nullable String str);

    void setShowAnimationType(@Nullable Integer num);
}
