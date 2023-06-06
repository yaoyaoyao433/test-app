package com.meituan.mtwebkit;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class MTWebHistoryItem implements Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // 
    /* renamed from: clone */
    public abstract MTWebHistoryItem mo12clone();

    public abstract Bitmap getFavicon();

    @Deprecated
    public abstract int getId();

    public abstract String getOriginalUrl();

    public abstract String getTitle();

    public abstract String getUrl();
}
