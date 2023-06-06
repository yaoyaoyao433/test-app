package com.meituan.android.mrn.config;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class u implements h {
    public static ChangeQuickRedirect a;
    private final int b;

    public u(int i) {
        Object[] objArr = {Integer.valueOf((int) R.layout.mrn_common_loading_layout)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c053da0a0a074eb2c15259795528a990", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c053da0a0a074eb2c15259795528a990");
        } else {
            this.b = R.layout.mrn_common_loading_layout;
        }
    }

    @Override // com.meituan.android.mrn.config.h
    @NotNull
    public final View a(Context context, Uri uri, Activity activity) {
        Object[] objArr = {context, uri, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a28d595c1076aefd94adb515614c4fa4", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a28d595c1076aefd94adb515614c4fa4") : LayoutInflater.from(context).inflate(this.b, (ViewGroup) null);
    }
}
