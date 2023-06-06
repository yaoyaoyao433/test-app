package com.sankuai.waimai.drug.o2o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.drug.j;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    ArrayList<j> b;
    e c;
    protected com.sankuai.waimai.store.platform.domain.manager.poi.a d;
    private com.sankuai.waimai.store.shopping.cart.contract.a e;
    private Activity f;
    private com.sankuai.waimai.store.shopping.cart.a g;

    public d(@NonNull Activity activity, @NonNull com.sankuai.waimai.store.shopping.cart.contract.a aVar, com.sankuai.waimai.store.shopping.cart.a aVar2) {
        super(aVar.i());
        Object[] objArr = {activity, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e729a79e360c0e3a646d9e13c9bce227", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e729a79e360c0e3a646d9e13c9bce227");
            return;
        }
        this.b = new ArrayList<>();
        this.e = aVar;
        this.f = activity;
        this.d = aVar.g();
        this.g = aVar2;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eeac0b6c3e415beba1ffd5487bfca3a", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eeac0b6c3e415beba1ffd5487bfca3a") : layoutInflater.inflate(R.layout.wm_drug_shopcart_o2o_poi_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f317fee76b81b1d8b6fef522e80a08b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f317fee76b81b1d8b6fef522e80a08b4");
            return;
        }
        super.onViewCreated();
        this.mView.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.drug.o2o.d.1
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b102e4bae9d4fb5690da13eddd411258", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b102e4bae9d4fb5690da13eddd411258");
        } else {
            com.sankuai.waimai.drug.common.a aVar = new com.sankuai.waimai.drug.common.a(this.f, this.e);
            aVar.createAndReplaceView((ViewGroup) findView(R.id.poi_shopcart));
            this.b.add(aVar);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f097821153ad13682779aea9ca9b4a7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f097821153ad13682779aea9ca9b4a7f");
        } else {
            f fVar = new f(this.e);
            fVar.createAndReplaceView((ViewGroup) findView(R.id.shop_cart_box));
            this.b.add(fVar);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6fddd5d2f442a90a0f1aed6a44bba4f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6fddd5d2f442a90a0f1aed6a44bba4f4");
        } else {
            ViewGroup viewGroup = (ViewGroup) findView(R.id.poi_im);
            if (this.g == null || !this.g.a) {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a37ea6ddcdfa0cb071bb6d024306223b", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a37ea6ddcdfa0cb071bb6d024306223b")).booleanValue();
                } else {
                    z = this.d != null && this.d.B();
                }
                if (z) {
                    b bVar = new b(this.f, this.e, null);
                    viewGroup.setVisibility(0);
                    bVar.createAndReplaceView(viewGroup);
                    this.b.add(bVar);
                }
            }
            viewGroup.setVisibility(8);
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "ae87a3479d38599c44f469951d282dce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "ae87a3479d38599c44f469951d282dce");
            return;
        }
        this.c = new e(this.f, this.e);
        this.c.createAndReplaceView((ViewGroup) this.mView.findViewById(R.id.operator_layout));
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5f551c88f960a14ceb98e1d6008f19a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5f551c88f960a14ceb98e1d6008f19a");
            return;
        }
        Iterator<j> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(z);
        }
    }
}
