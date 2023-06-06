package com.meituan.msc.mmpviews.list.debug;

import android.view.View;
import com.meituan.msc.mmpviews.list.msclist.MSCListNode;
import com.meituan.msi.util.file.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static JSONArray b;
    private static int c;

    public static void a(View view, MSCListNode mSCListNode, int i) {
    }

    public static void a(JSONArray jSONArray) {
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70fcc12a2ea88b90a564eda5a8d90c6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70fcc12a2ea88b90a564eda5a8d90c6c");
            return;
        }
        b = new JSONArray();
        d.e("/sdcard/AList");
    }
}
