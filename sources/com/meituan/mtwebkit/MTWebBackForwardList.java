package com.meituan.mtwebkit;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class MTWebBackForwardList implements Serializable, Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // 
    /* renamed from: clone */
    public abstract MTWebBackForwardList mo11clone();

    public abstract int getCurrentIndex();

    public abstract MTWebHistoryItem getCurrentItem();

    public abstract MTWebHistoryItem getItemAtIndex(int i);

    public abstract int getSize();
}
