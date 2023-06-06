package com.sankuai.xm.imui.common.processors;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.util.h;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public c b;
    public LinkProcessor c;
    private c d;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9905e73b68ec47790da3479962828e62", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9905e73b68ec47790da3479962828e62");
        } else {
            this.c = new LinkProcessor();
        }
    }

    @NonNull
    public final c a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66d8f070bd769228c06ca3a910b95a80", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66d8f070bd769228c06ca3a910b95a80");
        }
        if (this.b == null) {
            this.b = b(context);
        }
        return this.b;
    }

    private synchronized c b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95c9cef0687479394fadfcaf4e6b2ad4", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95c9cef0687479394fadfcaf4e6b2ad4");
        }
        if (this.d == null) {
            int b = h.b(context, R.xml.xm_sdk_emotion, 0);
            if (b != 0) {
                this.d = new b(context, b);
            } else {
                this.d = new b(context, c(context));
            }
        }
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList<com.sankuai.xm.imui.common.entity.a> c(android.content.Context r20) {
        /*
            r0 = r20
            r1 = 1
            java.lang.Object[] r9 = new java.lang.Object[r1]
            r10 = 0
            r9[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.xm.imui.common.processors.f.a
            java.lang.String r12 = "899c8382699b0d21fbe4ab4b763436dd"
            r3 = 0
            r5 = 1
            r7 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r2 = r9
            r4 = r11
            r6 = r12
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L20
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r3, r11, r1, r12)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            return r0
        L20:
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 2
            r2.<init>(r4)
            r5 = 2131755021(0x7f10000d, float:1.914091E38)
            r6 = 2131755020(0x7f10000c, float:1.9140907E38)
            int[] r5 = a(r0, r5, r6)     // Catch: java.lang.Exception -> L3d
            r6 = 2131755023(0x7f10000f, float:1.9140914E38)
            r7 = 2131755022(0x7f10000e, float:1.9140912E38)
            java.lang.String[] r0 = b(r0, r6, r7)     // Catch: java.lang.Exception -> L3b
            goto L50
        L3b:
            r0 = move-exception
            goto L3f
        L3d:
            r0 = move-exception
            r5 = r3
        L3f:
            java.lang.String r6 = "ProcessorManager"
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r10] = r0
            com.sankuai.xm.imui.common.util.d.d(r6, r7)
            java.lang.String r6 = "imkit"
            java.lang.String r7 = "ProcessorManager::buildCompatEmotions small"
            com.sankuai.xm.monitor.statistics.a.a(r6, r7, r0)
            r0 = r3
        L50:
            if (r5 == 0) goto Lb0
            if (r0 == 0) goto Lb0
            int r3 = r5.length
            if (r3 <= 0) goto Lb0
            int r3 = r5.length
            int r6 = r0.length
            if (r3 != r6) goto Lb0
            com.sankuai.xm.imui.common.entity.a r3 = new com.sankuai.xm.imui.common.entity.a
            r3.<init>()
            r3.f = r10
            r3.d = r1
            r6 = 2130841015(0x7f020db7, float:1.7287085E38)
            r3.b = r6
            r6 = 0
        L6a:
            int r7 = r5.length
            if (r6 >= r7) goto Lad
            r7 = r5[r6]
            r8 = r0[r6]
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r9[r10] = r11
            r9[r1] = r8
            com.meituan.robust.ChangeQuickRedirect r15 = com.sankuai.xm.imui.common.entity.a.a
            java.lang.String r14 = "c508df65557421f393c8a7f8884151d9"
            r16 = 0
            r17 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r11 = r9
            r12 = r3
            r13 = r15
            r19 = r14
            r14 = r16
            r1 = r15
            r15 = r19
            r16 = r17
            boolean r11 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16)
            if (r11 == 0) goto L9b
            r11 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r9, r3, r1, r10, r11)
            goto La9
        L9b:
            com.sankuai.xm.imui.common.entity.a$a r1 = new com.sankuai.xm.imui.common.entity.a$a
            r1.<init>()
            r1.b = r7
            r1.c = r8
            java.util.List<com.sankuai.xm.imui.common.entity.a$a> r7 = r3.m
            r7.add(r1)
        La9:
            int r6 = r6 + 1
            r1 = 1
            goto L6a
        Lad:
            r2.add(r3)
        Lb0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.imui.common.processors.f.c(android.content.Context):java.util.ArrayList");
    }

    private static int[] a(Context context, int i, int i2) {
        int[] iArr;
        TypedArray typedArray;
        while (true) {
            Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            iArr = null;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a363a1e7a22c7754e82b79c8184dfdb8", 6917529027641081856L)) {
                return (int[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a363a1e7a22c7754e82b79c8184dfdb8");
            }
            try {
                typedArray = context.getResources().obtainTypedArray(i);
            } catch (Resources.NotFoundException e) {
                if (i2 == 0) {
                    com.sankuai.xm.imui.common.util.d.d("ProcessorManager", e, "getDrawableIdArr:: no resource found and no fallback resource.");
                    com.sankuai.xm.monitor.statistics.a.a("imkit", "ProcessorManager::getDrawableIdArr", e);
                }
                typedArray = null;
            }
            if (typedArray != null) {
                int length = typedArray.length();
                iArr = new int[length];
                for (int i3 = 0; i3 < length; i3++) {
                    iArr[i3] = typedArray.getResourceId(i3, 0);
                }
                typedArray.recycle();
            }
            if ((iArr == null || iArr.length == 0) && i2 != 0) {
                i = i2;
                i2 = 0;
            }
        }
        return iArr;
    }

    private static String[] b(Context context, int i, int i2) {
        String[] strArr;
        while (true) {
            Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "36ebdb7ab6bafa666151b30d9c742d58", 6917529027641081856L)) {
                return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "36ebdb7ab6bafa666151b30d9c742d58");
            }
            try {
                strArr = context.getResources().getStringArray(i);
            } catch (Resources.NotFoundException e) {
                if (i2 == 0) {
                    com.sankuai.xm.imui.common.util.d.d("ProcessorManager", e, "getStringArray:: no resource found and no fallback resource.");
                    com.sankuai.xm.monitor.statistics.a.a("imkit", "ProcessorManager::getStringArray", e);
                }
                strArr = null;
            }
            if (!com.sankuai.xm.base.util.b.b(strArr) || i2 == 0) {
                break;
            }
            i = i2;
            i2 = 0;
        }
        return strArr;
    }

    public final d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db96b53aea82995090907a0336d49a31", 6917529027641081856L) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db96b53aea82995090907a0336d49a31") : new d();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        private static final f a = new f();
    }

    public static f b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0cb1de23416bac8fcf09b6030df72217", 6917529027641081856L) ? (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0cb1de23416bac8fcf09b6030df72217") : a.a;
    }
}
