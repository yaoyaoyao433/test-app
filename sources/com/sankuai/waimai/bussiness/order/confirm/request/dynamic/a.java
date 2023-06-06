package com.sankuai.waimai.bussiness.order.confirm.request.dynamic;

import android.app.Activity;
import android.app.Dialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a implements DynamicDialog.f {
    public static ChangeQuickRedirect h;
    private Activity a;
    private Dialog b;
    DynamicDialog i;

    public abstract void a(String str, Map<String, Object> map, DynamicDialog dynamicDialog);

    @Deprecated
    public a() {
    }

    public a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de7642382fa0b423dc7285bf8d84492d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de7642382fa0b423dc7285bf8d84492d");
        } else {
            this.a = activity;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r14.equals("show_loading_event") != false) goto L11;
     */
    @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r14, java.util.Map<java.lang.String, java.lang.Object> r15) {
        /*
            r13 = this;
            r0 = 2
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r14
            r10 = 1
            r8[r10] = r15
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a.h
            java.lang.String r12 = "a4fb74eef607193051e75246d6c58394"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r13
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r11, r9, r12)
            return
        L1e:
            r1 = -1
            int r2 = r14.hashCode()
            switch(r2) {
                case -1491924971: goto L51;
                case -875158302: goto L47;
                case -620866219: goto L3d;
                case 51909156: goto L32;
                case 1112724457: goto L27;
                default: goto L26;
            }
        L26:
            goto L5b
        L27:
            java.lang.String r0 = "page_exit_event"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L5b
            r0 = 4
            goto L5c
        L32:
            java.lang.String r0 = "router_event"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L5b
            r0 = 1
            goto L5c
        L3d:
            java.lang.String r0 = "alert_close"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L5b
            r0 = 0
            goto L5c
        L47:
            java.lang.String r0 = "dismiss_loading_event"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L5b
            r0 = 3
            goto L5c
        L51:
            java.lang.String r2 = "show_loading_event"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L5b
            goto L5c
        L5b:
            r0 = -1
        L5c:
            switch(r0) {
                case 0: goto L9e;
                case 1: goto L81;
                case 2: goto L78;
                case 3: goto L66;
                case 4: goto L60;
                default: goto L5f;
            }
        L5f:
            goto La4
        L60:
            android.app.Activity r0 = r13.a
            r0.finish()
            goto La4
        L66:
            android.app.Dialog r14 = r13.b
            if (r14 == 0) goto La9
            android.app.Dialog r14 = r13.b
            boolean r14 = r14.isShowing()
            if (r14 == 0) goto La9
            android.app.Dialog r14 = r13.b
            r14.dismiss()
            return
        L78:
            android.app.Activity r14 = r13.a
            android.app.Dialog r14 = com.sankuai.waimai.platform.widget.dialog.a.a(r14)
            r13.b = r14
            return
        L81:
            if (r15 == 0) goto La9
            android.app.Activity r14 = r13.a
            if (r14 == 0) goto La9
            java.lang.String r14 = "url"
            java.lang.Object r14 = r15.get(r14)
            java.lang.String r14 = java.lang.String.valueOf(r14)
            boolean r15 = android.text.TextUtils.isEmpty(r14)
            if (r15 != 0) goto L9d
            android.app.Activity r15 = r13.a
            com.sankuai.waimai.foundation.router.a.a(r15, r14)
        L9d:
            return
        L9e:
            com.sankuai.waimai.platform.mach.dialog.DynamicDialog r14 = r13.i
            r14.dismiss()
            return
        La4:
            com.sankuai.waimai.platform.mach.dialog.DynamicDialog r0 = r13.i
            r13.a(r14, r15, r0)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a.a(java.lang.String, java.util.Map):void");
    }
}
