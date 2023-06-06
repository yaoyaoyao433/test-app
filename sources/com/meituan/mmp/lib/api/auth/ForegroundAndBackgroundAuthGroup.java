package com.meituan.mmp.lib.api.auth;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ForegroundAndBackgroundAuthGroup extends MMPAuthGroup {
    public static ChangeQuickRedirect a;
    public h b;
    public h c;
    private boolean k;
    private String l;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface AuthStatusEnum {
    }

    public ForegroundAndBackgroundAuthGroup() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c250abfc4f5d82b8c6ba1184112e7f4b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c250abfc4f5d82b8c6ba1184112e7f4b");
        } else {
            this.k = true;
        }
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "275565b6137cf0914f5b4c55d57db604", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "275565b6137cf0914f5b4c55d57db604");
        }
        if (this.k) {
            this.k = false;
            for (int i = 0; i < this.j.size(); i++) {
                if (h.a(this.j.get(i))) {
                    this.c = this.j.get(i);
                } else {
                    this.b = this.j.get(i);
                }
            }
        }
        switch (b()) {
            case 1:
                this.l = "使用时";
                break;
            case 2:
                this.l = "使用时和离开后";
                break;
            default:
                this.l = "不允许";
                break;
        }
        return this.l;
    }

    public final int b() {
        if (this.c == null || !this.c.f) {
            return (this.b == null || !this.b.f) ? 0 : 1;
        }
        return 2;
    }

    public static void a(Context context, String str, ForegroundAndBackgroundAuthGroup foregroundAndBackgroundAuthGroup, int i) {
        Object[] objArr = {context, str, foregroundAndBackgroundAuthGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "85862ac5a2126853aa93eeab5c1306c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "85862ac5a2126853aa93eeab5c1306c6");
            return;
        }
        switch (i) {
            case 0:
                a(context, str, foregroundAndBackgroundAuthGroup, false, false);
                return;
            case 1:
                a(context, str, foregroundAndBackgroundAuthGroup, true, false);
                return;
            case 2:
                a(context, str, foregroundAndBackgroundAuthGroup, true, true);
                return;
            default:
                return;
        }
    }

    private static void a(Context context, String str, ForegroundAndBackgroundAuthGroup foregroundAndBackgroundAuthGroup, boolean z, boolean z2) {
        Object[] objArr = {context, str, foregroundAndBackgroundAuthGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "389e20d7dd382f691cb3ee857c9bd047", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "389e20d7dd382f691cb3ee857c9bd047");
            return;
        }
        if (foregroundAndBackgroundAuthGroup.b != null) {
            foregroundAndBackgroundAuthGroup.b.f = z;
            new c();
            c.a(context, str, foregroundAndBackgroundAuthGroup.b.e, z);
        }
        if (foregroundAndBackgroundAuthGroup.c != null) {
            foregroundAndBackgroundAuthGroup.c.f = z2;
            new c();
            c.a(context, str, foregroundAndBackgroundAuthGroup.c.e, z2);
        }
    }
}
