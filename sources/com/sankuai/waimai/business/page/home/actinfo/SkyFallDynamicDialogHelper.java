package com.sankuai.waimai.business.page.home.actinfo;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.actinfo.b;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import com.sankuai.waimai.platform.mach.dialog.i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class SkyFallDynamicDialogHelper {
    public static ChangeQuickRedirect a;
    DynamicDialog b;
    public int c;
    private String d;
    private int e;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface PopupType {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface ShowType {
    }

    public SkyFallDynamicDialogHelper(int i, @NonNull String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee64aac0099e90f839b513566e8a77a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee64aac0099e90f839b513566e8a77a5");
            return;
        }
        this.c = 0;
        this.e = i;
        this.d = str;
    }

    public final void a(@NonNull final Activity activity, @NonNull AlertInfo alertInfo, boolean z, @Nullable DynamicDialog.e eVar, final DialogInterface.OnDismissListener onDismissListener) {
        Object[] objArr = {activity, alertInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0), eVar, onDismissListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f2a623f806ac8b2319d1e59fa594e1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f2a623f806ac8b2319d1e59fa594e1c");
        } else if (this.b == null || !this.b.isShowing()) {
            HashMap hashMap = new HashMap();
            hashMap.put("popup_type", Integer.valueOf(this.e));
            final long[] jArr = new long[1];
            final boolean[] zArr = {false};
            final com.sankuai.waimai.popup.spfx.b bVar = new com.sankuai.waimai.popup.spfx.b();
            DynamicDialog.a aVar = new DynamicDialog.a(activity);
            aVar.i = alertInfo;
            DynamicDialog.a a2 = aVar.a(this.d).a(hashMap);
            a2.m = !z ? 1 : 0;
            a2.c = new DynamicDialog.f() { // from class: com.sankuai.waimai.business.page.home.actinfo.SkyFallDynamicDialogHelper.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.f
                public final void a(String str, Map<String, Object> map) {
                    Object[] objArr2 = {str, map};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60fd763a83b5ea90ff5797d53b413547", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60fd763a83b5ea90ff5797d53b413547");
                    } else if ("popup_close".equals(str)) {
                        SkyFallDynamicDialogHelper.this.a();
                    } else if ("popup_click".equals(str)) {
                        if (map != null) {
                            Object obj = map.get("linkUrl");
                            if (obj instanceof String) {
                                String str2 = (String) obj;
                                if (!TextUtils.isEmpty(str2)) {
                                    com.sankuai.waimai.foundation.router.a.a(activity, str2);
                                }
                            }
                        }
                        SkyFallDynamicDialogHelper.this.a();
                    } else if (!"special_effect".equals(str) || map == null) {
                    } else {
                        Object obj2 = map.get("type");
                        if (obj2 instanceof Long) {
                            jArr[0] = ((Long) obj2).longValue();
                            if (zArr[0]) {
                                bVar.a(SkyFallDynamicDialogHelper.this.b, jArr[0]);
                            }
                        }
                    }
                }
            };
            a2.g = new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.business.page.home.actinfo.SkyFallDynamicDialogHelper.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Object[] objArr2 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e589837f90cd88f1438f8cabbe0e79c0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e589837f90cd88f1438f8cabbe0e79c0");
                        return;
                    }
                    if (onDismissListener != null) {
                        onDismissListener.onDismiss(dialogInterface);
                    }
                    bVar.a();
                }
            };
            a2.p = new i() { // from class: com.sankuai.waimai.business.page.home.actinfo.SkyFallDynamicDialogHelper.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.mach.dialog.i
                public final void a(int i, Throwable th) {
                    Object[] objArr2 = {Integer.valueOf(i), th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ee34859f2631c8e335c72d7db6bfba8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ee34859f2631c8e335c72d7db6bfba8");
                    } else if (SkyFallDynamicDialogHelper.this.c > 0) {
                        b.a(SkyFallDynamicDialogHelper.this.c, b.a.FailureTypeRenderFailure);
                    }
                }

                @Override // com.sankuai.waimai.platform.mach.dialog.i
                public final void a(com.sankuai.waimai.mach.node.a aVar2) {
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f8ffcad53c4dbe56148fc7e332726df0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f8ffcad53c4dbe56148fc7e332726df0");
                        return;
                    }
                    zArr[0] = true;
                    bVar.a(SkyFallDynamicDialogHelper.this.b, jArr[0]);
                }
            };
            aVar.a(eVar);
            this.b = aVar.a();
            this.b.show();
            if (this.c > 0) {
                b.b(this.c, true);
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1b3059e4f4f3d88965166b1e3cef252", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1b3059e4f4f3d88965166b1e3cef252");
        } else if (this.b != null) {
            com.sankuai.waimai.touchmatrix.views.b.a().b(this.b.getDialog());
            this.b.dismiss();
            this.b = null;
        }
    }
}
