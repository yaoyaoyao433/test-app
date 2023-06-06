package com.meituan.msc.modules.api.auth;

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
    public c b;
    public c c;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d21f9f4fac7ed198e10f320480c72a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d21f9f4fac7ed198e10f320480c72a0");
        } else {
            this.k = true;
        }
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "446e34a7dc37c7f649995ee3b5b820a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "446e34a7dc37c7f649995ee3b5b820a3");
        }
        if (this.k) {
            this.k = false;
            for (int i = 0; i < this.j.size(); i++) {
                if (c.a(this.j.get(i))) {
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d88a8b2f09817ffa059b3b19da2bf5cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d88a8b2f09817ffa059b3b19da2bf5cd");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd7a544c83f93e13706e59de2bf20be3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd7a544c83f93e13706e59de2bf20be3");
            return;
        }
        if (foregroundAndBackgroundAuthGroup.b != null) {
            foregroundAndBackgroundAuthGroup.b.f = z;
            a.a(context, str, foregroundAndBackgroundAuthGroup.b.e, z);
        }
        if (foregroundAndBackgroundAuthGroup.c != null) {
            foregroundAndBackgroundAuthGroup.c.f = z2;
            a.a(context, str, foregroundAndBackgroundAuthGroup.c.e, z2);
        }
    }
}
