package com.sankuai.meituan.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.util.Xml;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.navigation.common.g;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public Context b;
    private g c;

    public c(@NonNull Context context, @NonNull g gVar) {
        Object[] objArr = {context, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccd7d00b06de11b6a354d8febc1c6d84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccd7d00b06de11b6a354d8febc1c6d84");
            return;
        }
        this.b = context;
        this.c = gVar;
    }

    @NonNull
    @SuppressLint({"ResourceType"})
    public final com.sankuai.meituan.navigation.common.d a(int i) {
        int next;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79660649b140f735b495391f4ebb2a59", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.navigation.common.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79660649b140f735b495391f4ebb2a59");
        }
        Resources resources = this.b.getResources();
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        com.sankuai.meituan.navigation.common.c a2 = a(resources, xml, asAttributeSet);
        if (!(a2 instanceof com.sankuai.meituan.navigation.common.d)) {
            throw new IllegalArgumentException("Root element <" + name + "> did not inflate into a NavGraph");
        }
        return (com.sankuai.meituan.navigation.common.d) a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
        return r0;
     */
    @android.support.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.sankuai.meituan.navigation.common.c a(@android.support.annotation.NonNull android.content.res.Resources r21, @android.support.annotation.NonNull android.content.res.XmlResourceParser r22, @android.support.annotation.NonNull android.util.AttributeSet r23) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r20 = this;
            r7 = r20
            r8 = r23
            r9 = 3
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = 0
            r10[r11] = r21
            r12 = 1
            r10[r12] = r22
            r13 = 2
            r10[r13] = r8
            com.meituan.robust.ChangeQuickRedirect r5 = com.sankuai.meituan.navigation.c.a
            java.lang.String r6 = "bee64b1eb71bdc843c2d6042656275c5"
            r3 = 0
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r10
            r1 = r20
            r2 = r5
            r4 = r6
            r13 = r5
            r9 = r6
            r5 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L2c
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r7, r13, r11, r9)
            com.sankuai.meituan.navigation.common.c r0 = (com.sankuai.meituan.navigation.common.c) r0
            return r0
        L2c:
            java.lang.String r0 = r22.getName()
            java.lang.String r1 = "NavViewGroup"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L3b
            java.lang.String r0 = "navigation"
        L3b:
            com.sankuai.meituan.navigation.common.g r1 = r7.c
            com.sankuai.meituan.navigation.common.Navigator r0 = r1.a(r0)
            com.sankuai.meituan.navigation.common.c r0 = r0.c()
            android.content.Context r1 = r7.b
            r0.a(r1, r8)
            int r1 = r22.getDepth()
            int r1 = r1 + r12
        L4f:
            int r2 = r22.next()
            if (r2 == r12) goto Lbe
            int r3 = r22.getDepth()
            if (r3 >= r1) goto L5f
            r4 = 3
            if (r2 == r4) goto Lbe
            goto L60
        L5f:
            r4 = 3
        L60:
            r5 = 2
            if (r2 != r5) goto L4f
            if (r3 > r1) goto L4f
            boolean r2 = r0 instanceof com.sankuai.meituan.navigation.common.d
            if (r2 == 0) goto L4f
            r2 = r0
            com.sankuai.meituan.navigation.common.d r2 = (com.sankuai.meituan.navigation.common.d) r2
            com.sankuai.meituan.navigation.common.c r3 = r20.a(r21, r22, r23)
            java.lang.Object[] r6 = new java.lang.Object[r12]
            r6[r11] = r3
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.meituan.navigation.common.d.e
            java.lang.String r10 = "997778563b5c685fea8610e2a019733e"
            r16 = 0
            r18 = 4611686018427387904(0x4000000000000000, double:2.0)
            r13 = r6
            r14 = r2
            r15 = r9
            r17 = r10
            boolean r13 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18)
            if (r13 == 0) goto L8b
            com.meituan.robust.PatchProxy.accessDispatch(r6, r2, r9, r11, r10)
            goto L4f
        L8b:
            int r6 = r3.d
            if (r6 == 0) goto Lb6
            android.support.v4.util.SparseArrayCompat<com.sankuai.meituan.navigation.common.c> r6 = r2.f
            int r9 = r3.d
            java.lang.Object r6 = r6.get(r9)
            com.sankuai.meituan.navigation.common.c r6 = (com.sankuai.meituan.navigation.common.c) r6
            if (r6 == r3) goto L4f
            com.sankuai.meituan.navigation.common.d r9 = r3.c
            if (r9 != 0) goto Lae
            if (r6 == 0) goto La4
            r9 = 0
            r6.c = r9
        La4:
            r3.c = r2
            android.support.v4.util.SparseArrayCompat<com.sankuai.meituan.navigation.common.c> r2 = r2.f
            int r6 = r3.d
            r2.put(r6, r3)
            goto L4f
        Lae:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Destination already has a parent set. Call NavGraph.remove() to remove the previous parent."
            r0.<init>(r1)
            throw r0
        Lb6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Destinations must have an id. Call setId() or include an android:id in your navigation XML."
            r0.<init>(r1)
            throw r0
        Lbe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.navigation.c.a(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet):com.sankuai.meituan.navigation.common.c");
    }
}
