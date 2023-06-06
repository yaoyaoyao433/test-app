package com.meituan.msc.mmpviews.list.msclist;

import android.content.Context;
import com.meituan.msc.jse.bridge.MSCReadableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends g {
    public static ChangeQuickRedirect a;

    public e(JSONObject jSONObject, String str) {
        super(jSONObject, null, str);
        Object[] objArr = {jSONObject, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e5c1878ea3b37016da7bec0f6bd5315", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e5c1878ea3b37016da7bec0f6bd5315");
        }
    }

    @Override // com.meituan.msc.mmpviews.list.msclist.f
    public final JSONObject b(MSCListNode mSCListNode, a aVar) {
        Object[] objArr = {mSCListNode, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b51e51755a25c405fd8dbcf23b3cbcab", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b51e51755a25c405fd8dbcf23b3cbcab");
        }
        return aVar.e ? com.meituan.msc.mmpviews.list.common.a.a(this.e, aVar, this.f) : new JSONObject();
    }

    @Override // com.meituan.msc.mmpviews.list.msclist.g
    public final MSCListNode c(MSCListNode mSCListNode, a aVar) {
        Object[] objArr = {mSCListNode, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59445a7c5868e23a3cc94b294f55c5be", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCListNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59445a7c5868e23a3cc94b294f55c5be");
        }
        MSCListNode mSCListNode2 = new MSCListNode();
        mSCListNode2.mProps = b(null, aVar);
        mSCListNode2.mViewClass = this.i;
        mSCListNode2.isForChild = aVar.b();
        mSCListNode2.templateNode = this;
        return mSCListNode2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
        if (((java.lang.Boolean) r1).booleanValue() != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a A[Catch: Throwable -> 0x00c9, TryCatch #0 {Throwable -> 0x00c9, blocks: (B:9:0x0042, B:25:0x008a, B:27:0x0097, B:29:0x00ac, B:30:0x00b4, B:33:0x00bb, B:34:0x00c0, B:12:0x005d, B:14:0x0065, B:16:0x006d, B:18:0x0076, B:20:0x007a), top: B:39:0x0042 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.meituan.msc.mmpviews.list.sticky.c a(android.content.Context r19, java.lang.String r20, org.json.JSONObject r21, com.meituan.msc.mmpviews.list.msclist.i r22) {
        /*
            r18 = this;
            r8 = r18
            r0 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r1 = 4
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r13 = 0
            r12[r13] = r0
            r14 = 1
            r12[r14] = r9
            r1 = 2
            r12[r1] = r10
            r1 = 3
            r12[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r15 = com.meituan.msc.mmpviews.list.msclist.e.a
            java.lang.String r6 = "61eaa382b64cfd358f76edc7fe3d8cdf"
            r4 = 0
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r12
            r2 = r18
            r3 = r15
            r5 = r6
            r14 = r6
            r6 = r16
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L35
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r8, r15, r13, r14)
            com.meituan.msc.mmpviews.list.sticky.c r0 = (com.meituan.msc.mmpviews.list.sticky.c) r0
            return r0
        L35:
            org.json.JSONObject r1 = r8.e
            java.lang.String r2 = "sticky"
            boolean r1 = r1.has(r2)
            r2 = 0
            if (r1 != 0) goto L42
            return r2
        L42:
            org.json.JSONObject r1 = r8.e     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r3 = "sticky"
            java.lang.Object r1 = r1.opt(r3)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lc9
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> Lc9
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> Lc9
            if (r3 == 0) goto L5d
        L5b:
            r13 = 1
            goto L87
        L5d:
            java.lang.String r3 = "$$"
            boolean r3 = r1.startsWith(r3)     // Catch: java.lang.Throwable -> Lc9
            if (r3 == 0) goto L87
            java.lang.Object r1 = r11.a(r1, r9, r10)     // Catch: java.lang.Throwable -> Lc9
            boolean r3 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> Lc9
            if (r3 == 0) goto L76
            r3 = r1
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> Lc9
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> Lc9
            if (r3 != 0) goto L5b
        L76:
            boolean r3 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lc9
            if (r3 == 0) goto L87
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> Lc9
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Throwable -> Lc9
            if (r1 == 0) goto L87
            goto L5b
        L87:
            if (r13 != 0) goto L8a
            return r2
        L8a:
            org.json.JSONObject r1 = r8.e     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r3 = "stickyOffset"
            boolean r1 = r1.has(r3)     // Catch: java.lang.Throwable -> Lc9
            r3 = 0
            if (r1 == 0) goto Lc0
            org.json.JSONObject r1 = r8.e     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r5 = "stickyOffset"
            java.lang.Object r1 = r1.opt(r5)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r5 = "$$"
            boolean r5 = r1.startsWith(r5)     // Catch: java.lang.Throwable -> Lc9
            if (r5 == 0) goto Lb4
            java.lang.Object r1 = r11.a(r1, r9, r10)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lc9
        Lb4:
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lc9
            if (r5 == 0) goto Lbb
            goto Lc0
        Lbb:
            double r0 = com.meituan.msc.mmpviews.list.a.a(r0, r1)     // Catch: java.lang.Throwable -> Lc9
            r3 = r0
        Lc0:
            com.meituan.msc.mmpviews.list.sticky.c r0 = new com.meituan.msc.mmpviews.list.sticky.c     // Catch: java.lang.Throwable -> Lc9
            r0.<init>()     // Catch: java.lang.Throwable -> Lc9
            int r1 = (int) r3     // Catch: java.lang.Throwable -> Lc9
            r0.b = r1     // Catch: java.lang.Throwable -> Lc9
            return r0
        Lc9:
            r0 = move-exception
            r0.printStackTrace()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.mmpviews.list.msclist.e.a(android.content.Context, java.lang.String, org.json.JSONObject, com.meituan.msc.mmpviews.list.msclist.i):com.meituan.msc.mmpviews.list.sticky.c");
    }

    public final boolean b(Context context, String str, JSONObject jSONObject, i iVar) {
        Object[] objArr = {context, str, jSONObject, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c97891bab5ed31b3245922a8f42af72", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c97891bab5ed31b3245922a8f42af72")).booleanValue();
        }
        if (this.e.has("sectionHeader")) {
            try {
                String valueOf = String.valueOf(this.e.opt("sectionHeader"));
                if (!String.valueOf(Boolean.TRUE).equals(valueOf)) {
                    if (!valueOf.startsWith("$$")) {
                        return false;
                    }
                    Object a2 = iVar.a(valueOf, str, jSONObject);
                    if (!(a2 instanceof Boolean) || !((Boolean) a2).booleanValue()) {
                        if (!(a2 instanceof String)) {
                            return false;
                        }
                        if (!String.valueOf(Boolean.TRUE).equals(a2)) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public final void d(MSCListNode mSCListNode, a aVar) {
        Object[] objArr = {mSCListNode, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2fff18cb50599fe5f8e65fc003891e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2fff18cb50599fe5f8e65fc003891e5");
        } else if (aVar.e) {
            f(mSCListNode, aVar);
            mSCListNode.uiImplementation.a(mSCListNode.mReactTag, mSCListNode.mViewClass, new MSCReadableMap(mSCListNode.mProps));
        }
    }
}
