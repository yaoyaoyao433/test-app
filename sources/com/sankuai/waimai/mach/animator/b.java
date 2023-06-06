package com.sankuai.waimai.mach.animator;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.animator.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b {
    public static ChangeQuickRedirect a;
    protected String[] b;
    private View c;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
        if (r13.equals(com.meituan.msc.modules.api.msi.components.coverview.CoverViewAnimateUtil.MSCAnimatedParams.EASING_EASE) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.TimeInterpolator a(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.mach.animator.b.a
            java.lang.String r11 = "237f322b971989e4aba5b2be0a22b8a5"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            android.animation.TimeInterpolator r13 = (android.animation.TimeInterpolator) r13
            return r13
        L1e:
            r1 = -1
            int r2 = r13.hashCode()
            switch(r2) {
                case -1965120668: goto L4f;
                case -1102672091: goto L44;
                case -789192465: goto L3a;
                case -361990811: goto L30;
                case 3105774: goto L27;
                default: goto L26;
            }
        L26:
            goto L59
        L27:
            java.lang.String r2 = "ease"
            boolean r13 = r13.equals(r2)
            if (r13 == 0) goto L59
            goto L5a
        L30:
            java.lang.String r0 = "ease-in-out"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L59
            r0 = 4
            goto L5a
        L3a:
            java.lang.String r0 = "ease-out"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L59
            r0 = 3
            goto L5a
        L44:
            java.lang.String r0 = "linear"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L59
            r0 = 0
            goto L5a
        L4f:
            java.lang.String r0 = "ease-in"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L59
            r0 = 2
            goto L5a
        L59:
            r0 = -1
        L5a:
            switch(r0) {
                case 0: goto L7b;
                case 1: goto L75;
                case 2: goto L6f;
                case 3: goto L69;
                case 4: goto L63;
                default: goto L5d;
            }
        L5d:
            android.view.animation.LinearInterpolator r13 = new android.view.animation.LinearInterpolator
            r13.<init>()
            goto L80
        L63:
            android.view.animation.AccelerateDecelerateInterpolator r13 = new android.view.animation.AccelerateDecelerateInterpolator
            r13.<init>()
            goto L80
        L69:
            android.view.animation.DecelerateInterpolator r13 = new android.view.animation.DecelerateInterpolator
            r13.<init>()
            goto L80
        L6f:
            android.view.animation.AccelerateInterpolator r13 = new android.view.animation.AccelerateInterpolator
            r13.<init>()
            goto L80
        L75:
            android.view.animation.AccelerateDecelerateInterpolator r13 = new android.view.animation.AccelerateDecelerateInterpolator
            r13.<init>()
            goto L80
        L7b:
            android.view.animation.LinearInterpolator r13 = new android.view.animation.LinearInterpolator
            r13.<init>()
        L80:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.animator.b.a(java.lang.String):android.animation.TimeInterpolator");
    }

    public final Map<String, Float> a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0187446fed13576aedfa2624859835c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0187446fed13576aedfa2624859835c9");
        }
        HashMap hashMap = new HashMap();
        if (obj == null) {
            return hashMap;
        }
        if (obj instanceof String) {
            String[] d = f.d(obj.toString());
            for (int i = 0; i < d.length; i++) {
                String str = d[i];
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = f.a;
                String[] b = b(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b713b18b011bd679ac99324f72cb60af", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b713b18b011bd679ac99324f72cb60af") : str.substring(0, str.indexOf(CommonConstant.Symbol.BRACKET_LEFT)));
                if (b != null) {
                    float[] b2 = f.b(d[i], a.C0998a.a(b[0]));
                    for (int i2 = 0; i2 < b.length; i2++) {
                        hashMap.put(b[i2], Float.valueOf(b2[i2]));
                    }
                }
            }
        } else {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                if (!map.isEmpty()) {
                    Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                    String str2 = b((String) entry.getKey())[0];
                    hashMap.put(str2, Float.valueOf(f.a(entry.getValue().toString(), a.C0998a.a(str2))));
                }
            }
        }
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
        if (r13.equals(com.meituan.android.recce.views.anim.RecceAnimUtils.SCALE_X) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String[] b(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.animator.b.b(java.lang.String):java.lang.String[]");
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1ca022cd8c3f53a48b4c4fc9749bc0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1ca022cd8c3f53a48b4c4fc9749bc0b");
            return;
        }
        int i = this.c.getLayoutParams().width;
        int i2 = this.c.getLayoutParams().height;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d633b54aebd3c7931c35b56ba9ea76e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d633b54aebd3c7931c35b56ba9ea76e");
        } else if (this.b == null || this.b.length < 2) {
        } else {
            if ("left".equals(this.b[0])) {
                this.c.setPivotX(0.0f);
            } else if ("right".equals(this.b[0])) {
                this.c.setPivotX(i);
            } else if ("center".equals(this.b[0])) {
                this.c.setPivotX(i * 0.5f);
            } else {
                this.c.setPivotX(i * f.c(this.b[0]));
            }
            if ("top".equals(this.b[1])) {
                this.c.setPivotY(0.0f);
            } else if ("bottom".equals(this.b[1])) {
                this.c.setPivotY(i2);
            } else if ("center".equals(this.b[1])) {
                this.c.setPivotY(i2 * 0.5f);
            } else {
                this.c.setPivotY(i2 * f.c(this.b[1]));
            }
        }
    }

    public final FrameLayout.LayoutParams a(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ba7638fe36685f9c87288574b8c6514", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ba7638fe36685f9c87288574b8c6514");
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = layoutParams3.leftMargin;
        layoutParams2.rightMargin = layoutParams3.rightMargin;
        layoutParams2.topMargin = layoutParams3.topMargin;
        layoutParams2.bottomMargin = layoutParams3.bottomMargin;
        return layoutParams2;
    }

    public View b() {
        return this.c;
    }

    public void a(View view) {
        this.c = view;
    }
}
