package com.dianping.animated.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final EnumC0054a f;
    public final b g;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum b {
        DISPOSE_DO_NOT,
        DISPOSE_TO_BACKGROUND,
        DISPOSE_TO_PREVIOUS;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cf3d11390f75273bee9c520ba1c462f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cf3d11390f75273bee9c520ba1c462f");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2865ec8fb9825d122c7a7cc1cf8aeb98", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2865ec8fb9825d122c7a7cc1cf8aeb98") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3523beebcbf1594e444de975dd3bb39c", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3523beebcbf1594e444de975dd3bb39c") : (b[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.animated.base.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0054a {
        BLEND_WITH_PREVIOUS,
        NO_BLEND;
        
        public static ChangeQuickRedirect a;

        EnumC0054a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51b4b354ceff08215c9f7de5aa54ec84", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51b4b354ceff08215c9f7de5aa54ec84");
            }
        }

        public static EnumC0054a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58c356f41d2c9eb0f49867a713132178", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0054a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58c356f41d2c9eb0f49867a713132178") : (EnumC0054a) Enum.valueOf(EnumC0054a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0054a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0722a40a04cffe738a01d157edb1ec2", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0054a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0722a40a04cffe738a01d157edb1ec2") : (EnumC0054a[]) values().clone();
        }
    }

    public a(int i, int i2, int i3, int i4, int i5, EnumC0054a enumC0054a, b bVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = enumC0054a;
        this.g = bVar;
    }
}
