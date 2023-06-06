package com.dianping.shield.dynamic.model.view;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/dianping/shield/dynamic/model/view/ReusableViewInfo;", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "Lcom/dianping/shield/dynamic/model/view/ReusableViewInfoProps;", "()V", DMKeys.KEY_DID_END_DISPLAY_CALLBACK, "", "getDidEndDisplayingCallback", "()Ljava/lang/String;", "setDidEndDisplayingCallback", "(Ljava/lang/String;)V", DMKeys.KEY_ESTIMATED_HEIGHT, "", "getEstimatedHeight", "()Ljava/lang/Integer;", "setEstimatedHeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", DMKeys.KEY_REUSE_IDENTIFIER, "getReuseIdentifier", "setReuseIdentifier", "skeletonData", "", "getSkeletonData", "()Ljava/lang/Object;", "setSkeletonData", "(Ljava/lang/Object;)V", DMKeys.KEY_WILL_DISPLAY_CALLBACK, "getWillDisplayCallback", "setWillDisplayCallback", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class ReusableViewInfo extends ViewInfo implements ReusableViewInfoProps {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private String didEndDisplayingCallback;
    @Nullable
    private Integer estimatedHeight;
    @Nullable
    private String reuseIdentifier;
    @Nullable
    private Object skeletonData;
    @Nullable
    private String willDisplayCallback;

    @Override // com.dianping.shield.dynamic.model.view.ReusableViewInfoProps
    @Nullable
    public String getReuseIdentifier() {
        return this.reuseIdentifier;
    }

    @Override // com.dianping.shield.dynamic.model.view.ReusableViewInfoProps
    public void setReuseIdentifier(@Nullable String str) {
        this.reuseIdentifier = str;
    }

    @Override // com.dianping.shield.dynamic.model.view.ReusableViewInfoProps
    @Nullable
    public Integer getEstimatedHeight() {
        return this.estimatedHeight;
    }

    @Override // com.dianping.shield.dynamic.model.view.ReusableViewInfoProps
    public void setEstimatedHeight(@Nullable Integer num) {
        this.estimatedHeight = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.ReusableViewInfoProps
    @Nullable
    public Object getSkeletonData() {
        return this.skeletonData;
    }

    @Override // com.dianping.shield.dynamic.model.view.ReusableViewInfoProps
    public void setSkeletonData(@Nullable Object obj) {
        this.skeletonData = obj;
    }

    @Override // com.dianping.shield.dynamic.model.view.ReusableViewInfoProps
    @Nullable
    public String getWillDisplayCallback() {
        return this.willDisplayCallback;
    }

    @Override // com.dianping.shield.dynamic.model.view.ReusableViewInfoProps
    public void setWillDisplayCallback(@Nullable String str) {
        this.willDisplayCallback = str;
    }

    @Override // com.dianping.shield.dynamic.model.view.ReusableViewInfoProps
    @Nullable
    public String getDidEndDisplayingCallback() {
        return this.didEndDisplayingCallback;
    }

    @Override // com.dianping.shield.dynamic.model.view.ReusableViewInfoProps
    public void setDidEndDisplayingCallback(@Nullable String str) {
        this.didEndDisplayingCallback = str;
    }
}
