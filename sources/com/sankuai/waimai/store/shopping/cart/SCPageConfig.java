package com.sankuai.waimai.store.shopping.cart;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class SCPageConfig {
    public static ChangeQuickRedirect a;
    public static final SCPageConfig b = new SCPageConfig(0, 0, "");
    public long c;
    public String d;
    public int e;
    int f;
    public int g;
    public String h;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface SourcePage {
    }

    private SCPageConfig(int i, int i2, String str, long j) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b35d438881abe8129481fa380ca5fd42", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b35d438881abe8129481fa380ca5fd42");
            return;
        }
        this.c = 0L;
        this.g = -1;
        this.e = i;
        this.f = i2;
        this.d = str;
        this.c = j;
    }

    private SCPageConfig(int i, int i2, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80274ae8b1fb3dd7e55391b3c144ba58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80274ae8b1fb3dd7e55391b3c144ba58");
            return;
        }
        this.c = 0L;
        this.g = -1;
        this.e = i;
        this.f = i2;
        this.d = str;
        this.h = str2;
    }

    private SCPageConfig(int i, int i2, String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44ba02aaf56a3b50407e73383b6fd1b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44ba02aaf56a3b50407e73383b6fd1b1");
            return;
        }
        this.c = 0L;
        this.g = -1;
        this.e = i;
        this.f = i2;
        this.d = str;
    }

    public static SCPageConfig a(int i, int i2, String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0cfc8e2846af0a5ab0c0f867df75cc9b", RobustBitConfig.DEFAULT_VALUE) ? (SCPageConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0cfc8e2846af0a5ab0c0f867df75cc9b") : new SCPageConfig(i, i2, str);
    }

    public static SCPageConfig a(int i, int i2, String str, long j) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5ccd86ad7e9fba277830ebb0421dd99", RobustBitConfig.DEFAULT_VALUE) ? (SCPageConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5ccd86ad7e9fba277830ebb0421dd99") : new SCPageConfig(i, i2, str, j);
    }

    public static SCPageConfig a(int i, int i2, String str, String str2) {
        Object[] objArr = {1, 22, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b87ee8952c02152aae40db69c6dfa0d", RobustBitConfig.DEFAULT_VALUE) ? (SCPageConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b87ee8952c02152aae40db69c6dfa0d") : new SCPageConfig(1, 22, str, str2);
    }
}
