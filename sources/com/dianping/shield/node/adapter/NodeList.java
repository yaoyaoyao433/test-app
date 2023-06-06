package com.dianping.shield.node.adapter;

import com.dianping.shield.node.adapter.status.ElementList;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface NodeList extends ElementList<ShieldDisplayNode> {
    void registerObserver(ListObserver listObserver);

    void unregisterObserver(ListObserver listObserver);
}
