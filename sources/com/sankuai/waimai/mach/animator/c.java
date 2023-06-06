package com.sankuai.waimai.mach.animator;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.recce.props.gens.BackgroundColor;
import com.meituan.android.recce.props.gens.MarginBottom;
import com.meituan.android.recce.props.gens.MarginLeft;
import com.meituan.android.recce.props.gens.MarginRight;
import com.meituan.android.recce.props.gens.MarginTop;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends b {
    public static ChangeQuickRedirect c;
    public boolean d;
    public TimeInterpolator e;
    public AnimatorSet f;
    public String g;
    private int h;
    private int i;

    @Override // com.sankuai.waimai.mach.animator.b
    public final /* bridge */ /* synthetic */ void a(View view) {
        super.a(view);
    }

    @Override // com.sankuai.waimai.mach.animator.b
    public final /* bridge */ /* synthetic */ View b() {
        return super.b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(android.view.View r20, java.util.Map<java.lang.String, java.lang.Object> r21) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.animator.c.<init>(android.view.View, java.util.Map):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.Object, com.sankuai.waimai.mach.animator.b, com.sankuai.waimai.mach.animator.c] */
    private ArrayList<Animator> a(Map<String, Object> map) {
        float c2;
        char c3;
        char c4;
        Keyframe ofObject;
        int i = 1;
        ?? r11 = 0;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5a4bd9a6966a6ac4d189837e07ea654", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5a4bd9a6966a6ac4d189837e07ea654");
        }
        String str = "@keyframes-" + map.get("animation").toString();
        if (map.containsKey(str)) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            Iterator it = ((Map) map.get(str)).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                Object[] objArr2 = new Object[i];
                objArr2[r11] = str2;
                ChangeQuickRedirect changeQuickRedirect2 = c;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31ddc89f3ef4b7c6a1d1be177735f827", RobustBitConfig.DEFAULT_VALUE)) {
                    c2 = ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, r11, "31ddc89f3ef4b7c6a1d1be177735f827")).floatValue();
                } else if ("from".equals(str2)) {
                    c2 = 0.0f;
                } else {
                    c2 = RemoteMessageConst.TO.equals(str2) ? 1.0f : f.c(str2);
                }
                float f = c2;
                for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                    String str3 = (String) entry2.getKey();
                    String obj = entry2.getValue().toString();
                    int hashCode = str3.hashCode();
                    if (hashCode == -1267206133) {
                        if (str3.equals("opacity")) {
                            c3 = 1;
                        }
                        c3 = 65535;
                    } else if (hashCode != 605322756) {
                        if (hashCode == 1052666732 && str3.equals("transform")) {
                            c3 = 0;
                        }
                        c3 = 65535;
                    } else {
                        if (str3.equals(BackgroundColor.NAME)) {
                            c3 = 2;
                        }
                        c3 = 65535;
                    }
                    switch (c3) {
                        case 0:
                            for (Map.Entry<String, Float> entry3 : a(obj).entrySet()) {
                                a(entry3.getKey(), Keyframe.ofFloat(f, entry3.getValue().floatValue()), hashMap);
                            }
                            break;
                        case 1:
                            a("alpha", Keyframe.ofFloat(f, Float.parseFloat(obj)), hashMap);
                            break;
                        case 2:
                            a("backgroundColor", Keyframe.ofInt(f, Color.parseColor(obj)), hashMap);
                            break;
                        default:
                            int a2 = (int) f.a(obj);
                            Object[] objArr3 = new Object[3];
                            objArr3[r11 == true ? 1 : 0] = str3;
                            objArr3[1] = Float.valueOf(f);
                            objArr3[2] = Integer.valueOf(a2);
                            ChangeQuickRedirect changeQuickRedirect3 = c;
                            Iterator it2 = it;
                            if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c429c9aa052b4e8635cbc29a35e219e4", RobustBitConfig.DEFAULT_VALUE)) {
                                FrameLayout.LayoutParams a3 = a(super.b().getLayoutParams());
                                switch (str3.hashCode()) {
                                    case -1383228885:
                                        if (str3.equals("bottom")) {
                                            c4 = 4;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1221029593:
                                        if (str3.equals("height")) {
                                            c4 = 1;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -887955139:
                                        if (str3.equals(MarginRight.NAME)) {
                                            c4 = '\t';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 115029:
                                        if (str3.equals("top")) {
                                            c4 = 2;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 3317767:
                                        if (str3.equals("left")) {
                                            c4 = 6;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 108511772:
                                        if (str3.equals("right")) {
                                            c4 = '\b';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 113126854:
                                        if (str3.equals("width")) {
                                            c4 = 0;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 941004998:
                                        if (str3.equals(MarginLeft.NAME)) {
                                            c4 = 7;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1970025654:
                                        if (str3.equals(MarginTop.NAME)) {
                                            c4 = 3;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 2086035242:
                                        if (str3.equals(MarginBottom.NAME)) {
                                            c4 = 5;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    default:
                                        c4 = 65535;
                                        break;
                                }
                                switch (c4) {
                                    case 0:
                                        a3.width = a2;
                                        ofObject = Keyframe.ofObject(f, a3);
                                        break;
                                    case 1:
                                        a3.height = a2;
                                        ofObject = Keyframe.ofObject(f, a3);
                                        break;
                                    case 2:
                                    case 3:
                                        a3.topMargin = a2;
                                        ofObject = Keyframe.ofObject(f, a3);
                                        break;
                                    case 4:
                                    case 5:
                                        a3.bottomMargin = a2;
                                        ofObject = Keyframe.ofObject(f, a3);
                                        break;
                                    case 6:
                                    case 7:
                                        a3.leftMargin = a2;
                                        ofObject = Keyframe.ofObject(f, a3);
                                        break;
                                    case '\b':
                                    case '\t':
                                        a3.rightMargin = a2;
                                        ofObject = Keyframe.ofObject(f, a3);
                                        break;
                                    default:
                                        ofObject = null;
                                        break;
                                }
                            } else {
                                ofObject = (Keyframe) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c429c9aa052b4e8635cbc29a35e219e4");
                            }
                            a(str3, ofObject, hashMap2);
                            it = it2;
                            r11 = 0;
                            break;
                    }
                }
                i = 1;
                r11 = r11;
            }
            ArrayList<Animator> arrayList = new ArrayList<>();
            ObjectAnimator b = b(hashMap);
            if (b != null) {
                arrayList.add(b);
            }
            arrayList.addAll(c(hashMap2));
            return arrayList;
        }
        return null;
    }

    private void a(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1c20833c132f4df8cc0ee2efa4231b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1c20833c132f4df8cc0ee2efa4231b2");
        } else if (this.h != 0) {
            valueAnimator.setRepeatMode(this.i);
            valueAnimator.setRepeatCount(this.h);
        }
    }

    private ObjectAnimator b(Map<String, ArrayList<Keyframe>> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3c16730558d0fdbfc5933242133e038", RobustBitConfig.DEFAULT_VALUE)) {
            return (ObjectAnimator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3c16730558d0fdbfc5933242133e038");
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ArrayList<Keyframe>> entry : map.entrySet()) {
            ArrayList<Keyframe> value = entry.getValue();
            int size = value.size();
            if (size >= 2) {
                arrayList.add(PropertyValuesHolder.ofKeyframe(entry.getKey(), (Keyframe[]) value.toArray(new Keyframe[size])));
            }
        }
        if (arrayList.size() > 0) {
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(super.b(), (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[arrayList.size()]));
            a((ValueAnimator) ofPropertyValuesHolder);
            return ofPropertyValuesHolder;
        }
        return null;
    }

    private ArrayList<Animator> c(Map<String, ArrayList<Keyframe>> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cba8a2bdfed4e4461ea58254d920872", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cba8a2bdfed4e4461ea58254d920872");
        }
        ArrayList<Animator> arrayList = new ArrayList<>();
        for (Map.Entry<String, ArrayList<Keyframe>> entry : map.entrySet()) {
            ArrayList<Keyframe> value = entry.getValue();
            int size = value.size();
            if (size >= 2) {
                a a2 = a.a(super.b(), entry.getKey(), PropertyValuesHolder.ofKeyframe("", (Keyframe[]) value.toArray(new Keyframe[size])));
                a((ValueAnimator) a2);
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    private void a(String str, Keyframe keyframe, Map<String, ArrayList<Keyframe>> map) {
        Object[] objArr = {str, keyframe, map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdb91454f2dea8a8117e583545ac0164", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdb91454f2dea8a8117e583545ac0164");
        } else if (keyframe == null) {
        } else {
            ArrayList<Keyframe> arrayList = map.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(str, arrayList);
            }
            arrayList.add(keyframe);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends ValueAnimator {
        public static ChangeQuickRedirect a;
        protected final String b;
        protected final View c;

        private a(View view, String str) {
            Object[] objArr = {view, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6184a65ee372b0f23e6e220629358202", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6184a65ee372b0f23e6e220629358202");
                return;
            }
            this.b = str;
            this.c = view;
        }

        public static a a(View view, String str, PropertyValuesHolder propertyValuesHolder) {
            Object[] objArr = {view, str, propertyValuesHolder};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "295ecb2817cddaeef1b261c6024667c0", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "295ecb2817cddaeef1b261c6024667c0");
            }
            a aVar = new a(view, str);
            aVar.setValues(propertyValuesHolder);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "639ed34179fbae3203a08fd922776a62", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "639ed34179fbae3203a08fd922776a62");
            } else {
                aVar.setEvaluator(new C0999a());
                aVar.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.mach.animator.c.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object[] objArr3 = {valueAnimator};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "026f9403407f53d8e3d3e2e08ba32397", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "026f9403407f53d8e3d3e2e08ba32397");
                        } else {
                            a.this.a((FrameLayout.LayoutParams) valueAnimator.getAnimatedValue());
                        }
                    }
                });
            }
            return aVar;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
            if (r2.equals("height") != false) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(android.widget.FrameLayout.LayoutParams r13) {
            /*
                r12 = this;
                r0 = 1
                java.lang.Object[] r8 = new java.lang.Object[r0]
                r9 = 0
                r8[r9] = r13
                com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.mach.animator.c.a.a
                java.lang.String r11 = "7914e09771c4f5be007ec86e0c96afd3"
                r4 = 0
                r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                r1 = r8
                r2 = r12
                r3 = r10
                r5 = r11
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                if (r1 == 0) goto L1b
                com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
                return
            L1b:
                android.view.View r1 = r12.c
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
                java.lang.String r2 = r12.b
                r3 = -1
                int r4 = r2.hashCode()
                switch(r4) {
                    case -1383228885: goto L92;
                    case -1221029593: goto L88;
                    case -887955139: goto L7d;
                    case 115029: goto L72;
                    case 3317767: goto L67;
                    case 108511772: goto L5c;
                    case 113126854: goto L51;
                    case 941004998: goto L46;
                    case 1970025654: goto L3b;
                    case 2086035242: goto L2f;
                    default: goto L2d;
                }
            L2d:
                goto L9d
            L2f:
                java.lang.String r0 = "margin-bottom"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L9d
                r0 = 9
                goto L9e
            L3b:
                java.lang.String r0 = "margin-top"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L9d
                r0 = 7
                goto L9e
            L46:
                java.lang.String r0 = "margin-left"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L9d
                r0 = 3
                goto L9e
            L51:
                java.lang.String r0 = "width"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L9d
                r0 = 0
                goto L9e
            L5c:
                java.lang.String r0 = "right"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L9d
                r0 = 4
                goto L9e
            L67:
                java.lang.String r0 = "left"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L9d
                r0 = 2
                goto L9e
            L72:
                java.lang.String r0 = "top"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L9d
                r0 = 6
                goto L9e
            L7d:
                java.lang.String r0 = "margin-right"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L9d
                r0 = 5
                goto L9e
            L88:
                java.lang.String r4 = "height"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L9d
                goto L9e
            L92:
                java.lang.String r0 = "bottom"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L9d
                r0 = 8
                goto L9e
            L9d:
                r0 = -1
            L9e:
                switch(r0) {
                    case 0: goto Lbb;
                    case 1: goto Lb6;
                    case 2: goto Lb1;
                    case 3: goto Lb1;
                    case 4: goto Lac;
                    case 5: goto Lac;
                    case 6: goto La7;
                    case 7: goto La7;
                    case 8: goto La2;
                    case 9: goto La2;
                    default: goto La1;
                }
            La1:
                goto Lbf
            La2:
                int r13 = r13.bottomMargin
                r1.bottomMargin = r13
                goto Lbf
            La7:
                int r13 = r13.topMargin
                r1.topMargin = r13
                goto Lbf
            Lac:
                int r13 = r13.rightMargin
                r1.rightMargin = r13
                goto Lbf
            Lb1:
                int r13 = r13.leftMargin
                r1.leftMargin = r13
                goto Lbf
            Lb6:
                int r13 = r13.height
                r1.height = r13
                goto Lbf
            Lbb:
                int r13 = r13.width
                r1.width = r13
            Lbf:
                android.view.View r13 = r12.c
                r13.setLayoutParams(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.animator.c.a.a(android.widget.FrameLayout$LayoutParams):void");
        }

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.mach.animator.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static class C0999a implements TypeEvaluator<FrameLayout.LayoutParams> {
            public static ChangeQuickRedirect a;

            private int a(float f, int i, int i2) {
                Object[] objArr = {Float.valueOf(f), Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08293440966db759f69e3dacf51897ad", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08293440966db759f69e3dacf51897ad")).intValue() : (int) (i + (f * (i2 - i)));
            }

            public C0999a() {
            }

            @Override // android.animation.TypeEvaluator
            public final /* synthetic */ FrameLayout.LayoutParams evaluate(float f, FrameLayout.LayoutParams layoutParams, FrameLayout.LayoutParams layoutParams2) {
                FrameLayout.LayoutParams layoutParams3 = layoutParams;
                FrameLayout.LayoutParams layoutParams4 = layoutParams2;
                Object[] objArr = {Float.valueOf(f), layoutParams3, layoutParams4};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db0f52f3f15cb272593311cab009efec", RobustBitConfig.DEFAULT_VALUE)) {
                    return (FrameLayout.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db0f52f3f15cb272593311cab009efec");
                }
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(a(f, layoutParams3.width, layoutParams4.width), a(f, layoutParams3.height, layoutParams4.height));
                layoutParams5.leftMargin = a(f, layoutParams3.leftMargin, layoutParams4.leftMargin);
                layoutParams5.topMargin = a(f, layoutParams3.topMargin, layoutParams4.topMargin);
                layoutParams5.rightMargin = a(f, layoutParams3.rightMargin, layoutParams4.rightMargin);
                layoutParams5.bottomMargin = a(f, layoutParams3.bottomMargin, layoutParams4.bottomMargin);
                return layoutParams5;
            }
        }
    }
}
