package com.coloros.ocs.base.internal.safeparcel;

import android.os.Parcel;
import android.support.v4.internal.view.SupportMenu;
import com.meituan.robust.common.CommonConstant;
/* loaded from: classes.dex */
public final class a {
    public static int a(Parcel parcel, int i) {
        c(parcel, i);
        return parcel.readInt();
    }

    public static int b(Parcel parcel, int i) {
        return (i & SupportMenu.CATEGORY_MASK) != -65536 ? (i >> 16) & SupportMenu.USER_MASK : parcel.readInt();
    }

    private static void c(Parcel parcel, int i) {
        int b = b(parcel, i);
        if (b == 4) {
            return;
        }
        throw new C0049a("Expected size 4 got " + b + " (0x" + Integer.toHexString(b) + CommonConstant.Symbol.BRACKET_RIGHT);
    }

    /* renamed from: com.coloros.ocs.base.internal.safeparcel.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0049a extends RuntimeException {
        public C0049a(String str) {
            super(str);
        }
    }
}
