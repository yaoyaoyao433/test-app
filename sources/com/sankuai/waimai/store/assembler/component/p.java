package com.sankuai.waimai.store.assembler.component;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class p {
    public static ChangeQuickRedirect a;
    public final View b;
    public final FrameLayout c;
    public final ImageView d;
    private final FrameLayout e;
    private final TextView f;
    private final ImageView g;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(View view);

        void b(View view);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        public int a;
    }

    public p(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9b6302f5d04139347dd66b94ba25d71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9b6302f5d04139347dd66b94ba25d71");
            return;
        }
        this.b = LayoutInflater.from(context).inflate(R.layout.wm_sc_goods_list_add_dec_layout, (ViewGroup) null, false);
        this.c = (FrameLayout) this.b.findViewById(R.id.img_foodCount_add_delegate);
        this.e = (FrameLayout) this.b.findViewById(R.id.img_foodCount_dec_delegate);
        this.f = (TextView) this.b.findViewById(R.id.txt_foodCount_number);
        this.d = (ImageView) this.b.findViewById(R.id.img_foodCount_add);
        this.g = (ImageView) this.b.findViewById(R.id.img_foodCount_dec);
        b bVar = new b();
        bVar.a = com.sankuai.shangou.stone.util.h.a(context, 7.0f);
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f71712ebc40cdefd1e23e4236c21b49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f71712ebc40cdefd1e23e4236c21b49");
        } else {
            this.c.setPadding(bVar.a, bVar.a, bVar.a, bVar.a);
            this.e.setPadding(bVar.a, bVar.a, bVar.a, bVar.a);
        }
        a(0);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e0b08c1c8a5d80b077f12cac75b53ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e0b08c1c8a5d80b077f12cac75b53ad");
            return;
        }
        this.f.setText(String.valueOf(i));
        if (i > 0) {
            this.c.setVisibility(0);
            this.e.setVisibility(0);
            this.f.setVisibility(0);
            return;
        }
        this.c.setVisibility(0);
        this.e.setVisibility(8);
        this.f.setVisibility(8);
    }

    public final void a(final a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "110e22cbc9c22f031c12ee63c8a3bec7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "110e22cbc9c22f031c12ee63c8a3bec7");
            return;
        }
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.assembler.component.p.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7cfe415c33a6375f6f346d359b2aa6d9", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7cfe415c33a6375f6f346d359b2aa6d9");
                } else if (aVar != null) {
                    aVar.a(view);
                }
            }
        });
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.assembler.component.p.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2da6b26dff6b7e4dcfa60519e0bbdca7", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2da6b26dff6b7e4dcfa60519e0bbdca7");
                } else if (aVar != null) {
                    aVar.b(view);
                }
            }
        });
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf96b91b6cf8d85aed221a51f4690a41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf96b91b6cf8d85aed221a51f4690a41");
        } else if (z) {
            this.d.setImageResource(R.drawable.wm_sc_bg_shop_add_select_green);
            this.g.setImageResource(R.drawable.wm_sc_bg_shop_dec_select_green);
        } else {
            this.d.setImageResource(R.drawable.wm_sc_bg_shop_add_select);
            this.g.setImageResource(R.drawable.wm_sc_bg_shop_dec_select);
        }
    }
}
