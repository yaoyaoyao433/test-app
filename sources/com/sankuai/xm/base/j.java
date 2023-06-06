package com.sankuai.xm.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class j {
    public static ChangeQuickRedirect a;

    public static short a(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe509a3ef426e0970b7fb0d26b606161", 6917529027641081856L)) {
            return ((Short) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe509a3ef426e0970b7fb0d26b606161")).shortValue();
        }
        if (s != 14) {
            if (s != 53) {
                switch (s) {
                    case 1:
                    case 2:
                        return (short) 41;
                    case 3:
                        return (short) 11;
                    case 4:
                        return (short) 15;
                    case 5:
                        return (short) 61;
                    case 6:
                        return (short) 22;
                    case 7:
                        return (short) 10;
                    case 8:
                        return (short) 43;
                    default:
                        switch (s) {
                            case 17:
                                return (short) 17;
                            case 18:
                                return (short) 18;
                            case 19:
                                return (short) 28;
                            default:
                                switch (s) {
                                    case 21:
                                        return (short) 1;
                                    case 22:
                                        return (short) 59;
                                    case 23:
                                        return (short) 64;
                                    case 24:
                                        return (short) 76;
                                    default:
                                        switch (s) {
                                            case 28:
                                                return (short) 76;
                                            case 29:
                                                return (short) 76;
                                            default:
                                                return (short) 91;
                                        }
                                }
                        }
                }
            }
            return (short) 363;
        }
        return (short) 16;
    }
}
