package com.dianping.shield.component.extensions.gridsection;

import com.dianping.shield.node.adapter.animator.AnimationType;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R(\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/dianping/shield/component/extensions/gridsection/GridShieldSection;", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "()V", "<anonymous parameter 0>", "Lcom/dianping/shield/node/adapter/animator/AnimationType;", "deleteAnimationType", "getDeleteAnimationType", "()Lcom/dianping/shield/node/adapter/animator/AnimationType;", "setDeleteAnimationType", "(Lcom/dianping/shield/node/adapter/animator/AnimationType;)V", "", "enableLayoutAnimation", "getEnableLayoutAnimation", "()Z", "setEnableLayoutAnimation", "(Z)V", "gridRecycledViewPool", "Lcom/dianping/shield/component/extensions/gridsection/GridRecycledViewPool;", "insertAnimationType", "getInsertAnimationType", "setInsertAnimationType", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class GridShieldSection extends ShieldSection {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private AnimationType deleteAnimationType;
    private boolean enableLayoutAnimation;
    @JvmField
    @Nullable
    public GridRecycledViewPool gridRecycledViewPool;
    @Nullable
    private AnimationType insertAnimationType;

    @Override // com.dianping.shield.node.cellnode.ShieldSection
    public final boolean getEnableLayoutAnimation() {
        return this.enableLayoutAnimation;
    }

    @Override // com.dianping.shield.node.cellnode.ShieldSection
    public final void setEnableLayoutAnimation(boolean z) {
        this.enableLayoutAnimation = false;
    }

    @Override // com.dianping.shield.node.cellnode.ShieldSection
    @Nullable
    public final AnimationType getInsertAnimationType() {
        return this.insertAnimationType;
    }

    @Override // com.dianping.shield.node.cellnode.ShieldSection
    public final void setInsertAnimationType(@Nullable AnimationType animationType) {
        this.insertAnimationType = null;
    }

    @Override // com.dianping.shield.node.cellnode.ShieldSection
    @Nullable
    public final AnimationType getDeleteAnimationType() {
        return this.deleteAnimationType;
    }

    @Override // com.dianping.shield.node.cellnode.ShieldSection
    public final void setDeleteAnimationType(@Nullable AnimationType animationType) {
        this.deleteAnimationType = null;
    }
}
