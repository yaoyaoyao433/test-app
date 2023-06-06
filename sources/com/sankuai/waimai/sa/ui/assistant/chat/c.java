package com.sankuai.waimai.sa.ui.assistant.chat;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import com.sankuai.waimai.platform.widget.listforscrollview.LinearLayoutForList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public Context b;
    public TextView c;
    public TextView d;
    public ImageView e;
    public LinearLayoutForList f;
    public TextView g;
    public TextView h;
    public TextView i;
    public Button j;
    public View k;
    public CustomDialog l;
    public com.sankuai.waimai.sa.model.c m;
    com.sankuai.waimai.sa.ui.assistant.a n;
    public int o;

    public c(Context context, com.sankuai.waimai.sa.ui.assistant.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78f2d344947a0384d761ecd84496b584", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78f2d344947a0384d761ecd84496b584");
            return;
        }
        this.b = context;
        this.n = aVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d03c762575ae67ff875d7dc5bd8cbc9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d03c762575ae67ff875d7dc5bd8cbc9c");
        } else {
            View inflate = LayoutInflater.from(this.b).inflate(R.layout.wm_smart_assistant_chat_bottom_total_foodlist_layout, (ViewGroup) null);
            this.k = inflate;
            this.j = (Button) inflate.findViewById(R.id.btn_add_to_shopcart);
            this.c = (TextView) inflate.findViewById(R.id.txt_package_name);
            this.d = (TextView) inflate.findViewById(R.id.txt_activity_name);
            this.c = (TextView) inflate.findViewById(R.id.txt_package_name);
            this.e = (ImageView) inflate.findViewById(R.id.img_close);
            this.f = (LinearLayoutForList) inflate.findViewById(R.id.food_list_container);
            this.g = (TextView) inflate.findViewById(R.id.txt_box_price);
            this.h = (TextView) inflate.findViewById(R.id.wm_smart_assistant_multi_person_merchant_actual_price);
            this.i = (TextView) inflate.findViewById(R.id.wm_smart_assistant_multi_person_merchant_original_price);
            this.j = (Button) inflate.findViewById(R.id.btn_add_to_shopcart);
        }
        this.o = com.sankuai.waimai.foundation.utils.g.a(context) - com.sankuai.waimai.foundation.utils.g.a(context, 30.0f);
    }
}
