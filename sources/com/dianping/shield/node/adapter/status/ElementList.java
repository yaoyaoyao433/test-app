package com.dianping.shield.node.adapter.status;

import com.dianping.titans.js.JsBridgeResult;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\bj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t`\nH&J\b\u0010\u000b\u001a\u00020\u0005H&¨\u0006\f"}, d2 = {"Lcom/dianping/shield/node/adapter/status/ElementList;", "T", "", "getDisplayElement", "position", "", "(I)Ljava/lang/Object;", "getEventDispatcherList", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/adapter/status/ElementStatusEventListener;", "Lkotlin/collections/ArrayList;", JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface ElementList<T> {
    T getDisplayElement(int i);

    @NotNull
    ArrayList<ElementStatusEventListener<T>> getEventDispatcherList();

    int size();
}
