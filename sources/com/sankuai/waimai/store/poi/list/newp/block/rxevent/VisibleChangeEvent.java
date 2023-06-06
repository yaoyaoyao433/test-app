package com.sankuai.waimai.store.poi.list.newp.block.rxevent;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class VisibleChangeEvent {
    public boolean a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public @interface Reason {
        public static final int BACKGROUND = 2;
        public static final int SCROLL = 0;
        public static final int SWITCH_PAGE = 1;
        public static final int UNKNOW = 4;
    }

    public VisibleChangeEvent(@Reason int i, boolean z, boolean z2) {
        this(i, z, z2, false, false);
    }

    public VisibleChangeEvent(@Reason int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.c = true;
        this.d = false;
        this.e = false;
        this.b = i;
        this.c = z;
        this.a = z2;
        this.d = false;
        this.e = z4;
    }
}
