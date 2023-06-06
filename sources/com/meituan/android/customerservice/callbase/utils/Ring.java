package com.meituan.android.customerservice.callbase.utils;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Ring {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Ring next;
    public int resid;
    public String tag;

    public Ring(int i) {
        this.resid = i;
    }

    public Ring(int i, Ring ring) {
        this(i);
        this.next = ring;
    }

    public Ring(int i, int i2) {
        this(i);
        if (i2 > 0) {
            this.next = new Ring(i, i2 - 1);
        }
    }
}
