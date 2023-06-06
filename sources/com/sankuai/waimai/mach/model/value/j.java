package com.sankuai.waimai.mach.model.value;

import android.widget.ImageView;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum j {
    cover(DynamicTitleParser.PARSER_VAL_STRETCH_COVER, ImageView.ScaleType.CENTER_CROP),
    contain("contain", ImageView.ScaleType.FIT_CENTER),
    stretch(DynamicTitleParser.PARSER_KEY_STRETCH, ImageView.ScaleType.FIT_XY),
    center("center", ImageView.ScaleType.CENTER_INSIDE),
    repeat("repeat", ImageView.ScaleType.MATRIX),
    left("left", ImageView.ScaleType.FIT_START),
    right("right", ImageView.ScaleType.FIT_END);
    
    public static ChangeQuickRedirect a;
    public String i;
    public ImageView.ScaleType j;

    public static j valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c822a27d35a6eddb06bc5c462e19e38", RobustBitConfig.DEFAULT_VALUE) ? (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c822a27d35a6eddb06bc5c462e19e38") : (j) Enum.valueOf(j.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static j[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d9ee0ffebf8d6e18e9ae3e8c648a41b", RobustBitConfig.DEFAULT_VALUE) ? (j[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d9ee0ffebf8d6e18e9ae3e8c648a41b") : (j[]) values().clone();
    }

    j(String str, ImageView.ScaleType scaleType) {
        Object[] objArr = {r10, Integer.valueOf(r11), str, scaleType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3892f56784baffe1adf2889577554c6a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3892f56784baffe1adf2889577554c6a");
            return;
        }
        this.i = str;
        this.j = scaleType;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r12.equals("contain") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.waimai.mach.model.value.j a(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.mach.model.value.j.a
            java.lang.String r11 = "e0e47068f64557d80e98ffe52281aeae"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            com.sankuai.waimai.mach.model.value.j r12 = (com.sankuai.waimai.mach.model.value.j) r12
            return r12
        L1f:
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            r1.<init>()
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT
            r1.setTileModeX(r2)
            r1 = -1
            int r2 = r12.hashCode()
            switch(r2) {
                case -1881872635: goto L72;
                case -1364013995: goto L68;
                case -934531685: goto L5d;
                case 3317767: goto L52;
                case 94852023: goto L48;
                case 108511772: goto L3d;
                case 951526612: goto L34;
                default: goto L33;
            }
        L33:
            goto L7d
        L34:
            java.lang.String r2 = "contain"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L7d
            goto L7e
        L3d:
            java.lang.String r0 = "right"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L7d
            r0 = 6
            goto L7e
        L48:
            java.lang.String r0 = "cover"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L7d
            r0 = 0
            goto L7e
        L52:
            java.lang.String r0 = "left"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L7d
            r0 = 5
            goto L7e
        L5d:
            java.lang.String r0 = "repeat"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L7d
            r0 = 4
            goto L7e
        L68:
            java.lang.String r0 = "center"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L7d
            r0 = 3
            goto L7e
        L72:
            java.lang.String r0 = "stretch"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L7d
            r0 = 2
            goto L7e
        L7d:
            r0 = -1
        L7e:
            switch(r0) {
                case 0: goto L96;
                case 1: goto L93;
                case 2: goto L90;
                case 3: goto L8d;
                case 4: goto L8a;
                case 5: goto L87;
                case 6: goto L84;
                default: goto L81;
            }
        L81:
            com.sankuai.waimai.mach.model.value.j r12 = com.sankuai.waimai.mach.model.value.j.contain
            return r12
        L84:
            com.sankuai.waimai.mach.model.value.j r12 = com.sankuai.waimai.mach.model.value.j.right
            return r12
        L87:
            com.sankuai.waimai.mach.model.value.j r12 = com.sankuai.waimai.mach.model.value.j.left
            return r12
        L8a:
            com.sankuai.waimai.mach.model.value.j r12 = com.sankuai.waimai.mach.model.value.j.repeat
            return r12
        L8d:
            com.sankuai.waimai.mach.model.value.j r12 = com.sankuai.waimai.mach.model.value.j.center
            return r12
        L90:
            com.sankuai.waimai.mach.model.value.j r12 = com.sankuai.waimai.mach.model.value.j.stretch
            return r12
        L93:
            com.sankuai.waimai.mach.model.value.j r12 = com.sankuai.waimai.mach.model.value.j.contain
            return r12
        L96:
            com.sankuai.waimai.mach.model.value.j r12 = com.sankuai.waimai.mach.model.value.j.cover
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.model.value.j.a(java.lang.String):com.sankuai.waimai.mach.model.value.j");
    }
}
