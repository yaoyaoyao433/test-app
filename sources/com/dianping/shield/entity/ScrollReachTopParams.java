package com.dianping.shield.entity;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ScrollReachTopParams {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int mScrollDownDistance;
    public int mScrollUpTopMargin;

    public ScrollReachTopParams(int i, int i2) {
        this.mScrollDownDistance = 0;
        this.mScrollUpTopMargin = 0;
        this.mScrollDownDistance = i;
        this.mScrollUpTopMargin = i2;
    }
}
