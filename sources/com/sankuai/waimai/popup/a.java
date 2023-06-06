package com.sankuai.waimai.popup;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.view.View;
import com.alipay.sdk.app.PayTask;
import com.google.gson.JsonPrimitive;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    DynamicDialog b;
    Runnable c;
    Handler d;
    private Activity e;
    private AlertInfo f;
    private boolean g;
    private DynamicDialog.e h;

    public a(@NonNull Activity activity, @NonNull AlertInfo alertInfo, DynamicDialog.e eVar) {
        Object[] objArr = {activity, alertInfo, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02cf09c0a26d4bc1dbd3ed0af6311f98", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02cf09c0a26d4bc1dbd3ed0af6311f98");
            return;
        }
        this.g = false;
        this.d = new Handler(Looper.getMainLooper());
        this.e = activity;
        this.f = alertInfo;
        this.h = eVar;
        this.g = d();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0d5d2b458b338444ce90c6f0a208d7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0d5d2b458b338444ce90c6f0a208d7b");
            return;
        }
        int c = g.c(this.e, g.e(this.e));
        HashMap hashMap = new HashMap();
        hashMap.put("status_bar_height", Integer.valueOf(c));
        DynamicDialog.a aVar = new DynamicDialog.a(this.e);
        aVar.i = this.f;
        aVar.j = 2;
        aVar.k = true;
        aVar.m = 2;
        aVar.l = new com.sankuai.waimai.platform.mach.dialog.gesture.c() { // from class: com.sankuai.waimai.popup.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.mach.dialog.gesture.c
            public final com.sankuai.waimai.platform.mach.dialog.gesture.d a(View view, com.sankuai.waimai.platform.mach.dialog.g gVar) {
                Object[] objArr2 = {view, gVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f52f89f4a529a7641f8e49097ee53b72", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.platform.mach.dialog.gesture.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f52f89f4a529a7641f8e49097ee53b72") : new com.sankuai.waimai.platform.mach.dialog.gesture.a(view, gVar, true);
            }
        };
        aVar.g = new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.popup.a.2
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Object[] objArr2 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "90e23404d5a0ca002d1ab8359e75107b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "90e23404d5a0ca002d1ab8359e75107b");
                } else if (a.this.b != null) {
                    com.sankuai.waimai.touchmatrix.views.b.a().b(a.this.b.getDialog());
                }
            }
        };
        aVar.h = new DialogInterface.OnShowListener() { // from class: com.sankuai.waimai.popup.a.1
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                Object[] objArr2 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27809b8eae2e23692aa61640fb2db7ca", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27809b8eae2e23692aa61640fb2db7ca");
                    return;
                }
                if (a.this.c == null) {
                    a.this.c = new Runnable() { // from class: com.sankuai.waimai.popup.a.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ac61736f9f3a5f33e8e4731e3631028e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ac61736f9f3a5f33e8e4731e3631028e");
                            } else {
                                a.this.b();
                            }
                        }
                    };
                }
                if (a.this.d != null) {
                    a.this.d.postDelayed(a.this.c, PayTask.j);
                }
            }
        };
        aVar.f = 48;
        DynamicDialog.a a2 = aVar.a("c_m84bv26");
        a2.b = 2131559196;
        DynamicDialog.a a3 = a2.a(this.h);
        a3.q = this.g;
        a3.e = true;
        this.b = a3.a(hashMap).a();
        this.b.show();
        com.sankuai.waimai.touchmatrix.views.b.a().a(this.b.getDialog());
    }

    private boolean d() {
        JsonPrimitive asJsonPrimitive;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67b1924ef2deda77af6b2ffcfe434858", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67b1924ef2deda77af6b2ffcfe434858")).booleanValue();
        }
        try {
            if (this.f.modules == null || this.f.modules.isEmpty() || this.f.modules.get(0) == null || this.f.modules.get(0).jsonData == null || (asJsonPrimitive = this.f.modules.get(0).jsonData.getAsJsonPrimitive("couponStatus")) == null) {
                return false;
            }
            return asJsonPrimitive.getAsInt() == 1;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ab6df58774ffea283461b047d36bdcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ab6df58774ffea283461b047d36bdcd");
        } else if (this.b == null || !this.b.isShowing()) {
        } else {
            this.b.dismiss();
        }
    }

    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e294946e515ca4d935cc713359131c97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e294946e515ca4d935cc713359131c97");
            return;
        }
        if (this.c != null) {
            this.d.removeCallbacks(this.c);
            this.c = null;
        }
        if (this.b == null || !this.b.isShowing()) {
            return;
        }
        this.b.getDialog().cancel();
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "015fd2d3f99791501aea171434437f33", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "015fd2d3f99791501aea171434437f33")).booleanValue() : this.b != null && this.b.isShowing();
    }
}
