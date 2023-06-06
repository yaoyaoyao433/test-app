package com.meituan.android.recce.events;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class f implements c {
    public static ChangeQuickRedirect b;
    protected int c;
    protected int d;

    @Override // com.meituan.android.recce.events.c
    public final String a() {
        return "view_event";
    }

    public f(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f1baca995a745ce4d46ae8cd9b06dfe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f1baca995a745ce4d46ae8cd9b06dfe");
            return;
        }
        this.c = i;
        this.d = i2;
    }

    public final int e() {
        return this.c;
    }

    public final int f() {
        return this.d;
    }

    public static f a(int i, int i2, String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c036c0b527325724abd617fc2c75523", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c036c0b527325724abd617fc2c75523") : a(i, i2, str, null);
    }

    public static f a(int i, int i2, final String str, final String str2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "581ced6aa6df9bf349bb3e6d67d196c6", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "581ced6aa6df9bf349bb3e6d67d196c6") : new f(i, i2) { // from class: com.meituan.android.recce.events.f.1
            @Override // com.meituan.android.recce.events.c
            public final String b() {
                return str;
            }

            @Override // com.meituan.android.recce.events.c
            public final String c() {
                return str2;
            }
        };
    }
}
