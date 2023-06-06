package com.dianping.shield.node.cellnode;

import com.dianping.shield.node.adapter.ShieldViewHolder;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface ViewAttachDetachInterface {
    void onViewAttachedToWindow(ShieldViewHolder shieldViewHolder, int i, ShieldDisplayNode shieldDisplayNode);

    void onViewDetachedFromWindow(ShieldViewHolder shieldViewHolder, int i, ShieldDisplayNode shieldDisplayNode);
}
