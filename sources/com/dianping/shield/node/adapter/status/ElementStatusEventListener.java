package com.dianping.shield.node.adapter.status;

import com.dianping.shield.node.cellnode.AppearanceDispatchData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/dianping/shield/node/adapter/status/ElementStatusEventListener;", "T", "", "onElementStatusChanged", "", "data", "Lcom/dianping/shield/node/cellnode/AppearanceDispatchData;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface ElementStatusEventListener<T> {
    void onElementStatusChanged(@NotNull AppearanceDispatchData<T> appearanceDispatchData);
}
