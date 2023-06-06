package com.sankuai.waimai.popup.container;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.platform.mach.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends d {
    public static ChangeQuickRedirect a;
    private a.b d;

    public a(String str, String str2, a.b bVar) {
        super(str, str2);
        Object[] objArr = {str, str2, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c913f0cd5bc5efcac661e016f8968296", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c913f0cd5bc5efcac661e016f8968296");
        } else {
            this.d = bVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @Override // com.sankuai.waimai.popup.container.d, com.sankuai.waimai.popup.container.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r24, java.lang.String r25, int r26, java.util.Map<java.lang.String, java.lang.Object> r27, org.json.JSONObject r28, java.lang.String r29, org.json.JSONObject r30, com.sankuai.waimai.mach.node.a<?> r31) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.popup.container.a.a(java.lang.String, java.lang.String, int, java.util.Map, org.json.JSONObject, java.lang.String, org.json.JSONObject, com.sankuai.waimai.mach.node.a):void");
    }
}
