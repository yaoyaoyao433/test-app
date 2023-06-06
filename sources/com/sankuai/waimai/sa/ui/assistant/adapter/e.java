package com.sankuai.waimai.sa.ui.assistant.adapter;

import android.content.Context;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.sa.model.Product;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends d {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.sa.ui.assistant.adapter.d
    public final int b() {
        return R.layout.wm_smart_assistant_chat_food_item_detail;
    }

    public e(Context context, List<Product> list) {
        super(context, list);
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "133fc6411fbedec6ee10281f4a8a968e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "133fc6411fbedec6ee10281f4a8a968e");
        }
    }
}
