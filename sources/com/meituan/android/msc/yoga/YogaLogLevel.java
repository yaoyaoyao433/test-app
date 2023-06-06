package com.meituan.android.msc.yoga;

import com.meituan.android.msc.proguard.annotations.DoNotStrip;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes2.dex */
public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);
    
    public static ChangeQuickRedirect a;
    private final int h;

    public static YogaLogLevel valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "197c4c511d4cdf14ad17acbbebd8139a", RobustBitConfig.DEFAULT_VALUE) ? (YogaLogLevel) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "197c4c511d4cdf14ad17acbbebd8139a") : (YogaLogLevel) Enum.valueOf(YogaLogLevel.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static YogaLogLevel[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56a31787998d7f36be6a08c10ddefa5a", RobustBitConfig.DEFAULT_VALUE) ? (YogaLogLevel[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56a31787998d7f36be6a08c10ddefa5a") : (YogaLogLevel[]) values().clone();
    }

    YogaLogLevel(int i2) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "626d6ee4f2c2b81e2919de19c05e3128", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "626d6ee4f2c2b81e2919de19c05e3128");
        } else {
            this.h = i2;
        }
    }

    @DoNotStrip
    public static YogaLogLevel fromInt(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a54558ff46a168c26997d31b3be375e", RobustBitConfig.DEFAULT_VALUE)) {
            return (YogaLogLevel) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a54558ff46a168c26997d31b3be375e");
        }
        switch (i2) {
            case 0:
                return ERROR;
            case 1:
                return WARN;
            case 2:
                return INFO;
            case 3:
                return DEBUG;
            case 4:
                return VERBOSE;
            case 5:
                return FATAL;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i2);
        }
    }
}
