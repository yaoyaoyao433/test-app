package com.sankuai.xm.imui.common.util;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.PowerManager;
import android.view.View;
import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.platform.utils.p;
import com.tencent.smtt.sdk.TbsListener;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class i {
    public static ChangeQuickRedirect a;
    private PopupWindow b;
    private PowerManager.WakeLock c;

    public i(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1638b2e6982e1b4da7dce52f1adda429", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1638b2e6982e1b4da7dce52f1adda429");
            return;
        }
        this.b = new PopupWindow(new View(context), -1, -1);
        this.c = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(6, "dim_wake_loc");
        this.c.setReferenceCounted(false);
    }

    private static void a(PowerManager.WakeLock wakeLock) {
        Object[] objArr = {wakeLock};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd36d5607f8d21cdfe2dc7b4b4049048", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd36d5607f8d21cdfe2dc7b4b4049048");
        } else if (wakeLock == null || !wakeLock.isHeld()) {
        } else {
            wakeLock.release();
        }
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "821f6b49301224f69d7c3af49ac956bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "821f6b49301224f69d7c3af49ac956bf");
            return;
        }
        ColorDrawable colorDrawable = new ColorDrawable(Color.argb((int) TbsListener.ErrorCode.EXCEED_INCR_UPDATE, 0, 0, 0));
        Object[] objArr2 = {colorDrawable, view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "186c9512ae4a92051815f5f62624b73c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "186c9512ae4a92051815f5f62624b73c");
            return;
        }
        PowerManager.WakeLock wakeLock = this.c;
        Object[] objArr3 = {wakeLock};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "9ca79f6c3df273f1dfe881d3106ea97d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "9ca79f6c3df273f1dfe881d3106ea97d");
        } else if (wakeLock != null && !wakeLock.isHeld()) {
            wakeLock.acquire();
        }
        this.b.setBackgroundDrawable(colorDrawable);
        p.a(this.b, view, 17, 0, 0);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "122314fd67702cf2d09fce5a8076cd06", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "122314fd67702cf2d09fce5a8076cd06");
            return;
        }
        p.b(this.b);
        a(this.c);
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48bb44fe414679c270229f7edabef3d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48bb44fe414679c270229f7edabef3d8");
            return;
        }
        a(this.c);
        this.c = null;
        p.b(this.b);
        this.b = null;
    }
}
