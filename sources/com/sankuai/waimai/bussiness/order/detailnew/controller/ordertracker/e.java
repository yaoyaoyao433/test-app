package com.sankuai.waimai.bussiness.order.detailnew.controller.ordertracker;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.f;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.g;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e implements c {
    public static ChangeQuickRedirect a;
    ScrollView b;
    Dialog c;
    private Context d;
    private View e;
    private ViewGroup f;

    public e(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2285dfa4eb1090c0d176ec3bd52c631", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2285dfa4eb1090c0d176ec3bd52c631");
        } else {
            this.d = context;
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.ordertracker.c
    public final void a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b2e06303187835aaae663c0ff694ee2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b2e06303187835aaae663c0ff694ee2");
            return;
        }
        if (this.c == null) {
            View inflate = LayoutInflater.from(this.d).inflate(R.layout.wm_order_status_dialog_history_status_layout, (ViewGroup) null);
            this.e = inflate.findViewById(R.id.btn_close);
            this.b = (ScrollView) inflate.findViewById(R.id.timeline_layout);
            this.f = (ViewGroup) this.b.findViewById(R.id.layout_history_status_container);
            this.c = new Dialog(this.d, 2131559198);
            Window window = this.c.getWindow();
            window.setLayout(-1, -2);
            window.setGravity(81);
            window.setWindowAnimations(2131558668);
            this.c.setContentView(inflate);
        }
        a(gVar.a);
        try {
            this.c.show();
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.e("error", "exception: " + e.getLocalizedMessage(), new Object[0]);
        }
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.ordertracker.e.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "202ff2c027965b0325ee853bad0168d4", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "202ff2c027965b0325ee853bad0168d4");
                } else if (e.this.c == null || !e.this.c.isShowing()) {
                } else {
                    e.this.c.dismiss();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v3 */
    private void a(List<f> list) {
        int i = 1;
        ?? r11 = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1b70d190db141a620e26698761ce8e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1b70d190db141a620e26698761ce8e2");
            return;
        }
        this.f.removeAllViews();
        int i2 = 0;
        while (i2 < list.size()) {
            View inflate = LayoutInflater.from(this.d).inflate((int) R.layout.wm_order_status_history_item, this.f, (boolean) r11);
            f fVar = list.get(i2);
            byte b = i2 == list.size() - i ? (byte) 1 : (byte) 0;
            Object[] objArr2 = new Object[3];
            objArr2[r11] = inflate;
            objArr2[i] = fVar;
            objArr2[2] = Byte.valueOf(b);
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0aaf6a56ec4c54f336b61ebeb21eb623", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0aaf6a56ec4c54f336b61ebeb21eb623");
            } else if (fVar != null) {
                TextView textView = (TextView) inflate.findViewById(R.id.txt_status_desc);
                textView.setText(fVar.b);
                TextView textView2 = (TextView) inflate.findViewById(R.id.txt_status_time);
                textView2.setText(fVar.d);
                View findViewById = inflate.findViewById(R.id.time_line);
                b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a2.b = this.d;
                a2.i = R.drawable.wm_order_status_history_start_dot;
                a2.c = fVar.e;
                a2.a((ImageView) inflate.findViewById(R.id.img_icon));
                if (b != 0) {
                    int color = this.d.getResources().getColor(17170444);
                    textView.setTextColor(color);
                    textView2.setTextColor(color);
                    findViewById.setVisibility(8);
                }
            }
            this.f.addView(inflate);
            i2++;
            i = 1;
            r11 = 0;
        }
        this.b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.ordertracker.e.2
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0058aca04326d087c8b6057dd52e86a5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0058aca04326d087c8b6057dd52e86a5");
                    return;
                }
                e.this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                e.this.b.fullScroll(130);
            }
        });
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.ordertracker.c
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed9ee8519cc77e1b507766caedb142ba", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed9ee8519cc77e1b507766caedb142ba")).booleanValue() : this.c != null && this.c.isShowing();
    }
}
