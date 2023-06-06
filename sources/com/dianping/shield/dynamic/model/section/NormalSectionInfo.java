package com.dianping.shield.dynamic.model.section;

import com.dianping.shield.dynamic.model.cell.CellInfo;
import com.dianping.shield.dynamic.model.section.SectionInfo;
import com.dianping.shield.node.adapter.animator.AnimationType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R.\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/dianping/shield/dynamic/model/section/NormalSectionInfo;", "Lcom/dianping/shield/dynamic/model/section/SectionInfo$BaseSectionInfo;", "()V", "children", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/model/cell/CellInfo;", "Lkotlin/collections/ArrayList;", "getChildren", "()Ljava/util/ArrayList;", "setChildren", "(Ljava/util/ArrayList;)V", "deleteAnimationType", "Lcom/dianping/shield/node/adapter/animator/AnimationType;", "getDeleteAnimationType", "()Lcom/dianping/shield/node/adapter/animator/AnimationType;", "setDeleteAnimationType", "(Lcom/dianping/shield/node/adapter/animator/AnimationType;)V", "enableLayoutAnimation", "", "getEnableLayoutAnimation", "()Ljava/lang/Boolean;", "setEnableLayoutAnimation", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "insertAnimationType", "getInsertAnimationType", "setInsertAnimationType", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class NormalSectionInfo extends SectionInfo.BaseSectionInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private ArrayList<CellInfo> children;
    @Nullable
    private AnimationType deleteAnimationType;
    @Nullable
    private Boolean enableLayoutAnimation;
    @Nullable
    private AnimationType insertAnimationType;

    public NormalSectionInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "806c1c595522b5ef420bbd2688cc1429", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "806c1c595522b5ef420bbd2688cc1429");
        } else {
            this.enableLayoutAnimation = Boolean.FALSE;
        }
    }

    @Nullable
    public final ArrayList<CellInfo> getChildren() {
        return this.children;
    }

    public final void setChildren(@Nullable ArrayList<CellInfo> arrayList) {
        this.children = arrayList;
    }

    @Nullable
    public final Boolean getEnableLayoutAnimation() {
        return this.enableLayoutAnimation;
    }

    public final void setEnableLayoutAnimation(@Nullable Boolean bool) {
        this.enableLayoutAnimation = bool;
    }

    @Nullable
    public final AnimationType getInsertAnimationType() {
        return this.insertAnimationType;
    }

    public final void setInsertAnimationType(@Nullable AnimationType animationType) {
        this.insertAnimationType = animationType;
    }

    @Nullable
    public final AnimationType getDeleteAnimationType() {
        return this.deleteAnimationType;
    }

    public final void setDeleteAnimationType(@Nullable AnimationType animationType) {
        this.deleteAnimationType = animationType;
    }
}
