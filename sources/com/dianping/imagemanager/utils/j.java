package com.dianping.imagemanager.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.resource.APKStructure;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j {
    public static ChangeQuickRedirect a;
    public String b;
    public a c;
    private String d;

    public j(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbf3aa2c8528f3b67d0ca72076f801ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbf3aa2c8528f3b67d0ca72076f801ef");
            return;
        }
        this.c = a.a(str);
        this.b = str;
        if (this.c == a.UNKNOWN) {
            this.c = a.FILE;
            this.d = str;
        }
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49b0988ae8ced87d1e657bda9a1d6473", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49b0988ae8ced87d1e657bda9a1d6473");
        }
        if (this.d == null) {
            this.d = this.c.b(this.b);
        }
        return this.d;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc99af3fa83921b1e1fa04a756d84035", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc99af3fa83921b1e1fa04a756d84035");
        }
        return "OriginUri=" + this.b + " Type=" + this.c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        HTTP("http"),
        HTTPS("https"),
        FILE("file"),
        ASSETS(APKStructure.Assets_Type),
        CONTENT("content"),
        UNKNOWN("");
        
        public static ChangeQuickRedirect a;
        public String h;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32f2d089de3659dd8a8afd0765f3bccd", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32f2d089de3659dd8a8afd0765f3bccd") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30afdf3654da1c0eb81a002e66fca21a", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30afdf3654da1c0eb81a002e66fca21a") : (a[]) values().clone();
        }

        a(String str) {
            Object[] objArr = {r10, Integer.valueOf(r11), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c77439f3ab7430ae3b7721f8a8ee81fc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c77439f3ab7430ae3b7721f8a8ee81fc");
                return;
            }
            this.h = str + "://";
        }

        public static a a(String str) {
            a[] valuesCustom;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b950d5e3ae7645eadb113e22aa33b44a", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b950d5e3ae7645eadb113e22aa33b44a");
            }
            if (str != null) {
                String lowerCase = str.toLowerCase(Locale.US);
                for (a aVar : valuesCustom()) {
                    Object[] objArr2 = {lowerCase};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ae07c9a0f9b0588f7ec50001f3b22ce0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ae07c9a0f9b0588f7ec50001f3b22ce0")).booleanValue() : lowerCase.startsWith(aVar.h)) {
                        return aVar;
                    }
                }
            }
            return UNKNOWN;
        }

        public final String b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b565d1736ac1bad0c8cba6038a44bcd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b565d1736ac1bad0c8cba6038a44bcd") : str.substring(this.h.length());
        }
    }
}
