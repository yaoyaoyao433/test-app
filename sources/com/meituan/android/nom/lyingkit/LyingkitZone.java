package com.meituan.android.nom.lyingkit;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class LyingkitZone {
    public static ChangeQuickRedirect a;
    final String b;
    final String c;
    LyingkitExtraInfo d;
    final String e;
    final LyingkitTraceBody f;
    private String g;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes2.dex */
    public @interface ZoneEntrace {
    }

    public LyingkitZone(@NonNull String str, @NonNull String str2, @Nullable LyingkitTraceBody lyingkitTraceBody, @ZoneEntrace String str3) {
        Object[] objArr = {str, str2, lyingkitTraceBody, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bdee05252c21d3ada2af67e8239df57", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bdee05252c21d3ada2af67e8239df57");
            return;
        }
        this.g = "";
        this.b = str;
        this.c = str2;
        this.f = lyingkitTraceBody;
        this.e = str3;
        if (lyingkitTraceBody != null) {
            this.d = lyingkitTraceBody.c;
        }
    }

    public final void a(@NonNull LyingkitExtraInfo lyingkitExtraInfo) {
        Object[] objArr = {lyingkitExtraInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1115a97f15d3b6243ccaab1524a125ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1115a97f15d3b6243ccaab1524a125ca");
        } else if ((lyingkitExtraInfo == null || !lyingkitExtraInfo.checkExtraInfo()) && d.a(b.b)) {
            throw new RuntimeException("传入的extrainfo不符合要求，强制退出，请检查");
        } else {
            this.d = lyingkitExtraInfo;
        }
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfc4d3fde4be3e018dca3db0e0e63059", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfc4d3fde4be3e018dca3db0e0e63059") : this.d != null ? this.d.getBelongBiz() : "";
    }

    @WorkerThread
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76118385d96d690b05338ef86510ed64", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76118385d96d690b05338ef86510ed64");
        }
        JsonObject jsonObject = new JsonObject();
        try {
            jsonObject.addProperty("customComponent", this.b);
            jsonObject.addProperty("customComponentVersion", this.c);
            jsonObject.addProperty("customBelongBiz", this.d != null ? this.d.belongBiz : "");
            jsonObject.addProperty("customBelongPage", this.d != null ? this.d.belongPage : "");
            jsonObject.addProperty("customEntrance", this.e);
            String str = null;
            jsonObject.addProperty("customTraceBody", this.f != null ? this.f.a(0).toString() : null);
            if (this.d != null && this.d.getExtraMgeMap() != null) {
                str = this.d.getExtraMgeMap().toString();
            }
            jsonObject.addProperty("customExtraInfo", str);
        } catch (Exception unused) {
        }
        return jsonObject.toString();
    }
}
