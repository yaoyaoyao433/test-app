package com.dianping.shield.expose;

import com.dianping.shield.node.cellnode.AppearanceDispatchData;
import com.dianping.shield.node.cellnode.AppearanceEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0005H&J&\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\rH&J\u001c\u0010\u000e\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\rH&¨\u0006\u000f"}, d2 = {"Lcom/dianping/shield/expose/EntrySetHolder;", "T", "", "getEntry", "position", "", "(I)Ljava/lang/Object;", "getEntryCount", "onAppearanceEvent", "", "appearanceEvent", "Lcom/dianping/shield/node/cellnode/AppearanceEvent;", "data", "Lcom/dianping/shield/node/cellnode/AppearanceDispatchData;", "onAttachStateChanged", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface EntrySetHolder<T> {
    @Nullable
    T getEntry(int i);

    int getEntryCount();

    void onAppearanceEvent(@Nullable AppearanceEvent appearanceEvent, @NotNull AppearanceDispatchData<EntrySetHolder<T>> appearanceDispatchData);

    void onAttachStateChanged(@NotNull AppearanceDispatchData<EntrySetHolder<T>> appearanceDispatchData);
}
