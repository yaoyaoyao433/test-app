package com.meituan.msc.modules.update;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class m {
    public static ChangeQuickRedirect a;
    public String b;
    public ArrayList<String> c;

    public m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "becfbe407e8e6ae73008cbb49b6f2770", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "becfbe407e8e6ae73008cbb49b6f2770");
        } else {
            this.b = "wifi";
        }
    }
}
