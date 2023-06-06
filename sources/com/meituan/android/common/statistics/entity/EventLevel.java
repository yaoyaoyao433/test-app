package com.meituan.android.common.statistics.entity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum EventLevel {
    IMMEDIATE(0),
    URGENT(1),
    HIGH(2),
    NORMAL(3),
    ALL(4);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private int level;

    public static EventLevel valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cec63655ab2c92e306dffe63da37383a", 6917529027641081856L) ? (EventLevel) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cec63655ab2c92e306dffe63da37383a") : (EventLevel) Enum.valueOf(EventLevel.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EventLevel[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "65d34455e395b4612b3eb76026686eae", 6917529027641081856L) ? (EventLevel[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "65d34455e395b4612b3eb76026686eae") : (EventLevel[]) values().clone();
    }

    EventLevel(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04fe2fe20eddb61d0ecc3955d4fb385c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04fe2fe20eddb61d0ecc3955d4fb385c");
        } else {
            this.level = i;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0731c16882b9ed9114f3ce0638a8fcb", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0731c16882b9ed9114f3ce0638a8fcb") : String.valueOf(this.level);
    }

    public final boolean equals(int i) {
        return i == this.level;
    }

    public final int getValue() {
        return this.level;
    }
}
