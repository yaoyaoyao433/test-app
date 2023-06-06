package com.sankuai.waimai.drug.patch.adapter;

import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.widgets.recycler.e;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends e {
    public static ChangeQuickRedirect a;
    TextView b;

    public c(View view) {
        super(view);
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfe3af5a6cab9b73f446bef56d55b601", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfe3af5a6cab9b73f446bef56d55b601");
        } else {
            this.b = (TextView) view;
        }
    }
}
