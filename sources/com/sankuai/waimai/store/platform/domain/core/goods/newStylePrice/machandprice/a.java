package com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.machandprice;

import android.app.Activity;
import android.content.Context;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.c;
import com.facebook.yoga.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.text.SizeSpec;
import com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.HandPriceAdapterView;
import com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.HandPriceModel;
import com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.b;
import com.sankuai.waimai.store.util.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.mach.component.base.a<HandPriceAdapterView> implements YogaMeasureFunction {
    public static ChangeQuickRedirect a;
    private b b;
    private String c;
    private int d;
    private int e;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(HandPriceAdapterView handPriceAdapterView) {
        HandPriceAdapterView handPriceAdapterView2 = handPriceAdapterView;
        Object[] objArr = {handPriceAdapterView2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e67a0565ebe6a339cf720a9ca5be490", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e67a0565ebe6a339cf720a9ca5be490");
            return;
        }
        super.a((a) handPriceAdapterView2);
        int i = this.d;
        int i2 = this.e;
        handPriceAdapterView2.c = i;
        handPriceAdapterView2.d = i2;
        String str = this.c;
        b bVar = this.b;
        Object[] objArr2 = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = HandPriceAdapterView.a;
        if (PatchProxy.isSupport(objArr2, handPriceAdapterView2, changeQuickRedirect2, false, "33e48630a499dd8e2c84e4a6dfe10fda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, handPriceAdapterView2, changeQuickRedirect2, false, "33e48630a499dd8e2c84e4a6dfe10fda");
            return;
        }
        handPriceAdapterView2.b = bVar;
        handPriceAdapterView2.a((HandPriceModel) i.a(str, HandPriceModel.class));
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ HandPriceAdapterView b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d957644be5f3840ef06490fc66bb230c", RobustBitConfig.DEFAULT_VALUE) ? (HandPriceAdapterView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d957644be5f3840ef06490fc66bb230c") : new HandPriceAdapterView(context);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
        if (r2.equals("0") != false) goto L24;
     */
    @Override // com.sankuai.waimai.mach.component.base.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r14 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.machandprice.a.a
            java.lang.String r10 = "c591e1897526a6db8352daf5fbd5e324"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r14
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L18
            com.meituan.robust.PatchProxy.accessDispatch(r8, r14, r9, r0, r10)
            return
        L18:
            com.facebook.yoga.d r1 = r14.ac_()
            r1.a(r14)
            java.lang.String r1 = "price-style"
            java.lang.String r1 = r14.a(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r1.intValue()
            java.lang.String r2 = "font-style"
            java.lang.String r2 = r14.a(r2)
            r3 = 1
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r11[r0] = r2
            com.meituan.robust.ChangeQuickRedirect r12 = com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.machandprice.a.a
            java.lang.String r13 = "90dcaa7daead5133144f4735ef90386d"
            r7 = 0
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            r4 = r11
            r5 = r14
            r6 = r12
            r8 = r13
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9)
            if (r4 == 0) goto L52
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r14, r12, r0, r13)
            com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d r0 = (com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d) r0
            goto Lb5
        L52:
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto Lb3
            r4 = -1
            int r5 = r2.hashCode()
            switch(r5) {
                case 48: goto L93;
                case 49: goto L89;
                case 50: goto L7f;
                case 51: goto L75;
                case 52: goto L6b;
                case 53: goto L61;
                default: goto L60;
            }
        L60:
            goto L9c
        L61:
            java.lang.String r0 = "5"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9c
            r0 = 5
            goto L9d
        L6b:
            java.lang.String r0 = "4"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9c
            r0 = 4
            goto L9d
        L75:
            java.lang.String r0 = "3"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9c
            r0 = 3
            goto L9d
        L7f:
            java.lang.String r0 = "2"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9c
            r0 = 2
            goto L9d
        L89:
            java.lang.String r0 = "1"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9c
            r0 = 1
            goto L9d
        L93:
            java.lang.String r3 = "0"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L9c
            goto L9d
        L9c:
            r0 = -1
        L9d:
            switch(r0) {
                case 0: goto Lb0;
                case 1: goto Lad;
                case 2: goto Laa;
                case 3: goto La7;
                case 4: goto La4;
                case 5: goto La1;
                default: goto La0;
            }
        La0:
            goto Lb3
        La1:
            com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d r0 = com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d.FONT_STYLE_DETAIL
            goto Lb5
        La4:
            com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d r0 = com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d.FONT_STYLE_48
            goto Lb5
        La7:
            com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d r0 = com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d.FONT_STYLE_40
            goto Lb5
        Laa:
            com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d r0 = com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d.FONT_STYLE_36
            goto Lb5
        Lad:
            com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d r0 = com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d.FONT_STYLE_32
            goto Lb5
        Lb0:
            com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d r0 = com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d.FONT_STYLE_28
            goto Lb5
        Lb3:
            com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d r0 = com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d.FONT_STYLE_28
        Lb5:
            com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.b r2 = com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.b.a()
            r2.d = r0
            r2.b = r1
            r14.b = r2
            java.util.Map r0 = r14.k()     // Catch: java.lang.Exception -> Lca
            java.lang.String r0 = com.meituan.android.common.statistics.utils.JsonUtil.mapToJSONString(r0)     // Catch: java.lang.Exception -> Lca
            r14.c = r0     // Catch: java.lang.Exception -> Lca
            return
        Lca:
            r0 = move-exception
            com.sankuai.shangou.stone.util.log.a.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.machandprice.a.a():void");
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public final long measure(d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        Object[] objArr = {dVar, Float.valueOf(f), yogaMeasureMode, Float.valueOf(f2), yogaMeasureMode2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef420596655602924d95a7f59e16ea6f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef420596655602924d95a7f59e16ea6f")).longValue();
        }
        Activity activity = this.m.getActivity();
        if (activity == null) {
            return 0L;
        }
        HandPriceAdapterView handPriceAdapterView = new HandPriceAdapterView(activity);
        int a2 = SizeSpec.a(f, yogaMeasureMode);
        int a3 = SizeSpec.a(f2, yogaMeasureMode2);
        handPriceAdapterView.measure(a2, a3);
        this.d = a2;
        this.e = a3;
        return c.a(handPriceAdapterView.getMeasuredWidth(), handPriceAdapterView.getMeasuredHeight());
    }
}
