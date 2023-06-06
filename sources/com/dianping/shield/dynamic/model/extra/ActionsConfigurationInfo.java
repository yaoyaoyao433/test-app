package com.dianping.shield.dynamic.model.extra;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0006R*\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/dianping/shield/dynamic/model/extra/ActionsConfigurationInfo;", "", DMKeys.KEY_ACTIONS, "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/model/extra/ContextualAction;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getActions", "()Ljava/util/ArrayList;", "setActions", "performsFirstActionWithFullSwip", "", "getPerformsFirstActionWithFullSwip", "()Ljava/lang/Boolean;", "setPerformsFirstActionWithFullSwip", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ActionsConfigurationInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private ArrayList<ContextualAction> actions;
    @Nullable
    private Boolean performsFirstActionWithFullSwip;

    public ActionsConfigurationInfo(@NotNull ArrayList<ContextualAction> arrayList) {
        h.b(arrayList, DMKeys.KEY_ACTIONS);
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59c6029408d8a4e74a830880eb6e90f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59c6029408d8a4e74a830880eb6e90f8");
        } else {
            this.actions = arrayList;
        }
    }

    @NotNull
    public final ArrayList<ContextualAction> getActions() {
        return this.actions;
    }

    public final void setActions(@NotNull ArrayList<ContextualAction> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c71ce173681c54d7ab092253117dc96b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c71ce173681c54d7ab092253117dc96b");
            return;
        }
        h.b(arrayList, "<set-?>");
        this.actions = arrayList;
    }

    @Nullable
    public final Boolean getPerformsFirstActionWithFullSwip() {
        return this.performsFirstActionWithFullSwip;
    }

    public final void setPerformsFirstActionWithFullSwip(@Nullable Boolean bool) {
        this.performsFirstActionWithFullSwip = bool;
    }
}
