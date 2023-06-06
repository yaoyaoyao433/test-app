package com.dianping.shield.component.extensions.scroll;

import android.view.View;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0006j\b\u0012\u0004\u0012\u00020\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/dianping/shield/component/extensions/scroll/ViewHolderWithTrigger;", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", Constants.EventType.VIEW, "Landroid/view/View;", "(Landroid/view/View;)V", "childViewHolders", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getChildViewHolders", "()Ljava/util/ArrayList;", "setChildViewHolders", "(Ljava/util/ArrayList;)V", "normalViewHolder", "getNormalViewHolder", "()Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "setNormalViewHolder", "(Lcom/dianping/shield/node/adapter/ShieldViewHolder;)V", "triggerViewHolder", "getTriggerViewHolder", "setTriggerViewHolder", "getView", "()Landroid/view/View;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ViewHolderWithTrigger extends ShieldViewHolder {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private ArrayList<ShieldViewHolder> childViewHolders;
    @Nullable
    private ShieldViewHolder normalViewHolder;
    @Nullable
    private ShieldViewHolder triggerViewHolder;
    @NotNull
    private final View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewHolderWithTrigger(@NotNull View view) {
        super(view);
        h.b(view, Constants.EventType.VIEW);
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cafa87a20bf15238d95d2fbf9a95c057", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cafa87a20bf15238d95d2fbf9a95c057");
            return;
        }
        this.view = view;
        this.childViewHolders = new ArrayList<>();
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    @NotNull
    public final ArrayList<ShieldViewHolder> getChildViewHolders() {
        return this.childViewHolders;
    }

    public final void setChildViewHolders(@NotNull ArrayList<ShieldViewHolder> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87199b055b89c73ec5efcf0832dbb53d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87199b055b89c73ec5efcf0832dbb53d");
            return;
        }
        h.b(arrayList, "<set-?>");
        this.childViewHolders = arrayList;
    }

    @Nullable
    public final ShieldViewHolder getNormalViewHolder() {
        return this.normalViewHolder;
    }

    public final void setNormalViewHolder(@Nullable ShieldViewHolder shieldViewHolder) {
        this.normalViewHolder = shieldViewHolder;
    }

    @Nullable
    public final ShieldViewHolder getTriggerViewHolder() {
        return this.triggerViewHolder;
    }

    public final void setTriggerViewHolder(@Nullable ShieldViewHolder shieldViewHolder) {
        this.triggerViewHolder = shieldViewHolder;
    }
}
