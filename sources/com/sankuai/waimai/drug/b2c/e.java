package com.sankuai.waimai.drug.b2c;

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
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    ArrayList<j> b;
    g c;
    protected com.sankuai.waimai.store.shopping.cart.contract.a d;
    protected Activity e;
    protected com.sankuai.waimai.store.platform.domain.manager.poi.a f;
    protected SCPageConfig g;
    protected String h;
    private boolean i;
    private com.sankuai.waimai.store.shopping.cart.a j;

    public e(@NonNull Activity activity, @NonNull com.sankuai.waimai.store.shopping.cart.contract.a aVar, com.sankuai.waimai.store.shopping.cart.a aVar2) {
        super(aVar.i());
        boolean z = false;
        Object[] objArr = {activity, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd07e6c825f76e5f60e6cd60ab96a6b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd07e6c825f76e5f60e6cd60ab96a6b5");
            return;
        }
        this.b = new ArrayList<>();
        this.d = aVar;
        this.e = activity;
        this.f = this.d.g();
        this.g = this.d.h();
        this.h = this.d.l();
        this.j = aVar2;
        if (this.j != null && this.j.a) {
            z = true;
        }
        this.i = z;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88479cf95422b5ba4a0679b8c2111dcb", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88479cf95422b5ba4a0679b8c2111dcb") : layoutInflater.inflate(R.layout.wm_st_shopcart_b2c_poi_price, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        boolean B;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e1583db520fd48c99ff3f4d762b081c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e1583db520fd48c99ff3f4d762b081c");
            return;
        }
        super.onViewCreated();
        this.mView.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.drug.b2c.e.1
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "78eb4ed26d35d49eab47bf2dc12a7b86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "78eb4ed26d35d49eab47bf2dc12a7b86");
        } else if (this.i) {
            new f(this.e, this.d, this.j.b).createAndReplaceView((ViewGroup) findView(R.id.b2c_poi_poi_entry));
        } else {
            findView(R.id.b2c_poi_poi_entry).setVisibility(8);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "09805cf3a2382d9471d2edf8d5f65afe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "09805cf3a2382d9471d2edf8d5f65afe");
        } else {
            ViewGroup viewGroup = (ViewGroup) findView(R.id.b2c_poi_poi_im);
            if (this.f != null) {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cb8b4ae61d32c8bb7e933781d6a4f2cb", RobustBitConfig.DEFAULT_VALUE)) {
                    B = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cb8b4ae61d32c8bb7e933781d6a4f2cb")).booleanValue();
                } else if (this.f.E()) {
                    B = this.f.B() || !(this.f.F() == null || this.f.F().h == null);
                } else {
                    B = this.f.B();
                }
                if (B) {
                    c cVar = new c(this.e, this.d, this.i ? this.j.b : null);
                    viewGroup.setVisibility(0);
                    cVar.createAndReplaceView(viewGroup);
                    if (!this.i) {
                        cVar.b();
                    }
                    this.b.add(cVar);
                }
            }
            viewGroup.setVisibility(8);
            findView(R.id.divider_line).setVisibility(this.i ? 0 : 8);
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "931997ec643d4d5ccc0cfce10aeaa7ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "931997ec643d4d5ccc0cfce10aeaa7ae");
        } else {
            com.sankuai.waimai.drug.common.a aVar = new com.sankuai.waimai.drug.common.a(this.e, this.d);
            aVar.createAndReplaceView((ViewGroup) findView(R.id.b2c_poi_shopcart));
            this.b.add(aVar);
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "9ec876b7dd59bc10c5971554944034e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "9ec876b7dd59bc10c5971554944034e3");
        } else {
            this.c = new g(this.e, this.d);
            this.c.bindView(this.mView.findViewById(R.id.b2c_poi_submit_layout));
        }
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = a;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "df6bc24cd98ccb05a4ab43eb77f26361", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "df6bc24cd98ccb05a4ab43eb77f26361");
        } else {
            d dVar = new d(this.e, this.d);
            dVar.bindView(this.mView.findViewById(R.id.b2c_poi_ll_non_empty_shopping_cart));
            this.b.add(dVar);
        }
        Object[] objArr8 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect8 = a;
        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "fd63be59a96c970b20010e3505dad653", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "fd63be59a96c970b20010e3505dad653");
            return;
        }
        b bVar = new b(this.e, this.d);
        bVar.bindView(this.mView.findViewById(R.id.b2c_poi_ll_empty_shopping_cart));
        this.b.add(bVar);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9ca2f7a67a47b427ec9f7924f1a74e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9ca2f7a67a47b427ec9f7924f1a74e3");
        } else {
            com.sankuai.waimai.store.manager.judas.b.b(this.g.d, com.sankuai.waimai.store.manager.judas.b.a((Object) this.mContext), "b_waimai_30j1dgg4_mv").a("poi_id", this.f.d()).a("stid", this.d.n()).a("spu_id", Long.valueOf(this.g.c == 0 ? -999L : this.g.c)).a();
        }
    }
}
