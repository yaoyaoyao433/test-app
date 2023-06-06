package com.sankuai.waimai.sa.ui.assistant.chat;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b extends RecyclerView.s {
    public static ChangeQuickRedirect a;
    public int b;
    public boolean c;

    public b(View view) {
        super(view);
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3da0758a1288213134db00f91fbb3f5c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3da0758a1288213134db00f91fbb3f5c");
        }
    }
}
