package com.sankuai.xm.imui.common.entity;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public int b;
    public String c;
    public int d;
    public String e;
    public boolean f;
    public Object g;
    public String h;
    public String i;
    public String j;
    public int k;
    public int l;
    public final List<C1398a> m;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "729ed5fbd09a25a68239c2855d32b8c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "729ed5fbd09a25a68239c2855d32b8c0");
            return;
        }
        this.b = -1;
        this.d = 0;
        this.f = false;
        this.g = "png";
        this.m = new ArrayList();
    }

    public final C1398a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e01b8028f639b014f747a2f3c1207b8", 6917529027641081856L)) {
            return (C1398a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e01b8028f639b014f747a2f3c1207b8");
        }
        for (C1398a c1398a : this.m) {
            if (TextUtils.equals(str, c1398a.c)) {
                return c1398a;
            }
        }
        return null;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecdc251813539738f993a9acf9b18838", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecdc251813539738f993a9acf9b18838");
        }
        return "Emotion{icon=" + this.b + ", iconUrl='" + this.c + "', type=" + this.d + ", name='" + this.e + "', showName=" + this.f + ", extend=" + this.g + ", packageId='" + this.h + "', packageName='" + this.i + "', params='" + this.j + "', row=" + this.k + ", col=" + this.l + ", items=" + this.m.size() + '}';
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.imui.common.entity.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C1398a {
        public static ChangeQuickRedirect a;
        public int b;
        public String c;
        public String d;
        public String e;
        public String f;

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6d5b637ca7da01d6bd060172843e34b", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6d5b637ca7da01d6bd060172843e34b");
            }
            return "EmotionItem{icon=" + this.b + ", name='" + this.c + "', stickerId='" + this.d + "', iconUrl='" + this.e + "', stickerParams='" + this.f + "'}";
        }
    }
}
