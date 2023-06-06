package com.meituan.msc.mmpviews.list.msclist;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect a;
    private static Object b;
    private static Object c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03e7  */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.meituan.msc.devsupport.perf.a r35, com.meituan.msc.mmpviews.list.msclist.MSCListNode r36, com.meituan.msc.mmpviews.list.msclist.MSCListNode r37, com.meituan.msc.uimanager.list.c r38, int r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 1031
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.mmpviews.list.msclist.h.a(com.meituan.msc.devsupport.perf.a, com.meituan.msc.mmpviews.list.msclist.MSCListNode, com.meituan.msc.mmpviews.list.msclist.MSCListNode, com.meituan.msc.uimanager.list.c, int, boolean):void");
    }

    private static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        Object[] objArr = {jSONObject, jSONObject2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f37c75b73d46c75a6a3a0a5b694a99bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f37c75b73d46c75a6a3a0a5b694a99bf");
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                b = jSONObject.opt(next);
                c = jSONObject2.opt(next);
                if (b == null) {
                    jSONObject3.put(next, c);
                } else if (b != c && !b.equals(c)) {
                    jSONObject3.put(next, c);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject3;
    }
}
