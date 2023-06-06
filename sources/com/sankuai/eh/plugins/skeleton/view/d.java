package com.sankuai.eh.plugins.skeleton.view;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.gson.JsonElement;
import com.meituan.android.common.aidata.config.DBConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ArrayList<Integer> arrayList, Map<String, JsonElement> map, JsonElement jsonElement, boolean z) {
        Object[] objArr = {relativeLayout, relativeLayout2, arrayList, map, jsonElement, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "561fdb99c8dd539830688b39b3052fe0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "561fdb99c8dd539830688b39b3052fe0");
        } else if (a(arrayList)) {
        } else {
            View a2 = a(relativeLayout.getContext(), new a(arrayList, map, jsonElement, z), com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(jsonElement, "tag"), -1));
            if (!(a2 instanceof com.sankuai.eh.plugins.skeleton.view.a)) {
                relativeLayout2.addView(a2);
            } else if (((com.sankuai.eh.plugins.skeleton.view.a) a2).b.d) {
                relativeLayout.addView(a2);
            } else {
                relativeLayout2.addView(a2);
            }
        }
    }

    public static boolean a(ArrayList<Integer> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "612ba8b1d74c9fe5b5f1568bd6f036d8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "612ba8b1d74c9fe5b5f1568bd6f036d8")).booleanValue() : arrayList == null || arrayList.size() != 5 || arrayList.get(1).intValue() > com.sankuai.eh.component.service.utils.a.b();
    }

    public static List<Integer> a(Map<String, JsonElement> map, boolean z) {
        Object[] objArr = {map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "269b59c8152387b489412e73f083c0c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "269b59c8152387b489412e73f083c0c3");
        }
        Map<String, JsonElement> c = com.sankuai.eh.component.service.utils.b.c(map.get("anim"));
        if (z) {
            if (c.containsKey("indexV2")) {
                return com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.b(map.get("indexV2")), -1);
            }
        } else if (c.containsKey("index")) {
            return com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.b(map.get("index")), -1);
        }
        return null;
    }

    private static View a(Context context, a aVar, int i) {
        Object[] objArr = {context, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "408127899cc27d83c878f0c80ab94436", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "408127899cc27d83c878f0c80ab94436");
        }
        if (i != -1) {
            switch (i) {
                case 1:
                    break;
                case 2:
                    return new SKTText(context, aVar);
                case 3:
                    return new SKTImg(context, aVar);
                default:
                    return null;
            }
        }
        return new com.sankuai.eh.plugins.skeleton.view.a(context, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        public boolean d;
        public ArrayList<Integer> e;
        public Map<String, JsonElement> f;
        public int g;
        public String h;

        public a(ArrayList<Integer> arrayList, Map<String, JsonElement> map, JsonElement jsonElement, boolean z) {
            int i = 0;
            Object[] objArr = {arrayList, map, jsonElement, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87e97f5b77538bee62ef2617e6008a4f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87e97f5b77538bee62ef2617e6008a4f");
                return;
            }
            this.b = com.sankuai.eh.component.service.utils.b.a(map.get("type"), 1);
            this.c = com.sankuai.eh.plugins.skeleton.util.b.a(com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(map.get(DBConfig.KEY_SQL_CONFIG_VER), com.huawei.hms.opendevice.c.a), ""), com.sankuai.eh.plugins.skeleton.util.a.a);
            this.e = arrayList;
            this.f = com.sankuai.eh.component.service.utils.b.c(jsonElement);
            this.h = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, "id"), "");
            this.d = z;
            boolean booleanValue = com.sankuai.eh.component.service.utils.b.a(map.get("hideStatusBar"), false).booleanValue();
            Object[] objArr2 = {Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2eb69cad7db3761772ff318e08459a01", RobustBitConfig.DEFAULT_VALUE)) {
                i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2eb69cad7db3761772ff318e08459a01")).intValue();
            } else if (booleanValue) {
                i = com.sankuai.eh.component.service.utils.a.d();
            }
            this.g = i;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00e2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(android.view.View r13) {
            /*
                r12 = this;
                r0 = 1
                java.lang.Object[] r8 = new java.lang.Object[r0]
                r9 = 0
                r8[r9] = r13
                com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.eh.plugins.skeleton.view.d.a.a
                java.lang.String r11 = "9faaf9728658be6db7f7431b0405b784"
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
                java.util.ArrayList<java.lang.Integer> r1 = r12.e
                java.lang.Object r1 = r1.get(r9)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                float r1 = (float) r1
                r13.setX(r1)
                java.util.ArrayList<java.lang.Integer> r1 = r12.e
                java.lang.Object r1 = r1.get(r0)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                int r2 = r12.g
                int r1 = r1 + r2
                float r1 = (float) r1
                r13.setY(r1)
                android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
                java.util.ArrayList<java.lang.Integer> r2 = r12.e
                r3 = 2
                java.lang.Object r2 = r2.get(r3)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                java.util.ArrayList<java.lang.Integer> r3 = r12.e
                r4 = 3
                java.lang.Object r3 = r3.get(r4)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r1.<init>(r2, r3)
                java.util.Map<java.lang.String, com.google.gson.JsonElement> r2 = r12.f
                java.lang.String r3 = "layout"
                java.lang.Object r2 = r2.get(r3)
                com.google.gson.JsonElement r2 = (com.google.gson.JsonElement) r2
                java.lang.String r3 = "ps"
                com.google.gson.JsonElement r2 = com.sankuai.eh.component.service.utils.b.c(r2, r3)
                java.util.Map r2 = com.sankuai.eh.component.service.utils.b.c(r2)
                int r3 = r2.size()
                if (r3 <= 0) goto Lf2
                java.lang.String r3 = "mode"
                java.lang.Object r3 = r2.get(r3)
                com.google.gson.JsonElement r3 = (com.google.gson.JsonElement) r3
                r4 = -1
                int r3 = com.sankuai.eh.component.service.utils.b.a(r3, r4)
                if (r3 != r0) goto Lf2
                java.lang.String r0 = "ct"
                java.lang.Object r0 = r2.get(r0)
                com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0
                int r0 = com.sankuai.eh.component.service.utils.b.a(r0, r4)
                r3 = 0
                switch(r0) {
                    case 0: goto Lac;
                    case 1: goto La3;
                    case 2: goto L9a;
                    default: goto L99;
                }
            L99:
                goto Lb8
            L9a:
                r0 = 15
                r1.addRule(r0)
                r13.setY(r3)
                goto Lf2
            La3:
                r0 = 14
                r1.addRule(r0)
                r13.setX(r3)
                goto Lb8
            Lac:
                r0 = 13
                r1.addRule(r0)
                r13.setX(r3)
                r13.setY(r3)
                goto Lf2
            Lb8:
                java.lang.String r0 = "t"
                java.lang.Object r0 = r2.get(r0)
                com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0
                int r0 = com.sankuai.eh.component.service.utils.b.a(r0, r4)
                java.lang.String r5 = "b"
                java.lang.Object r2 = r2.get(r5)
                com.google.gson.JsonElement r2 = (com.google.gson.JsonElement) r2
                int r2 = com.sankuai.eh.component.service.utils.b.a(r2, r4)
                if (r2 == r4) goto Le2
                r0 = 12
                r1.addRule(r0)
                int r0 = com.sankuai.eh.plugins.skeleton.util.b.a(r2)
                r1.bottomMargin = r0
                r13.setY(r3)
                goto Lf2
            Le2:
                if (r0 == r4) goto Lf2
                r2 = 10
                r1.addRule(r2)
                int r0 = com.sankuai.eh.plugins.skeleton.util.b.a(r0)
                r1.topMargin = r0
                r13.setY(r3)
            Lf2:
                r13.setLayoutParams(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.eh.plugins.skeleton.view.d.a.a(android.view.View):void");
        }
    }
}
