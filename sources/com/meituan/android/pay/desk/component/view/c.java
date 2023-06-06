package com.meituan.android.pay.desk.component.view;

import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.android.pay.common.payment.bean.FloatingLayer;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.payment.bean.Payment;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.pay.common.promotion.bean.Material;
import com.meituan.android.pay.desk.component.bean.standardcomponent.BalanceCombinePayment;
import com.meituan.android.pay.desk.component.bean.standardcomponent.CashDesk;
import com.meituan.android.pay.desk.component.bean.standardcomponent.HelloPayTransInfo;
import com.meituan.android.pay.desk.component.data.DeskData;
import com.meituan.android.pay.desk.component.fragment.CombineLabelDetailDialogFragment;
import com.meituan.android.pay.desk.component.fragment.NewCombineLabelDetailDialogFragment;
import com.meituan.android.pay.desk.payment.view.g;
import com.meituan.android.pay.desk.payment.view.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c implements com.meituan.android.pay.desk.component.a {
    public static ChangeQuickRedirect a;
    DeskData b;
    LinearLayout c;
    public a d;
    public b e;
    private boolean f;
    private HashMap<String, String> g;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(LinearLayout linearLayout, DeskData deskData);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        void a(LinearLayout linearLayout, DeskData deskData, boolean z);
    }

    public c(LinearLayout linearLayout, DeskData deskData, HashMap<String, String> hashMap) {
        Object[] objArr = {linearLayout, deskData, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b90f69f14a8e69a1f8e2d0cd79397c2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b90f69f14a8e69a1f8e2d0cd79397c2d");
            return;
        }
        this.f = false;
        this.b = deskData;
        this.c = linearLayout;
        this.g = hashMap;
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c5d27d3a54ee706e11844c1575263ef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c5d27d3a54ee706e11844c1575263ef")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        return com.meituan.android.pay.desk.component.data.a.e(this.b);
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6b3d398a49eba0f959d21c2e9d042fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6b3d398a49eba0f959d21c2e9d042fb");
        } else if (this.c == null || this.c.getContext() == null || this.b == null || this.c.findViewWithTag(Integer.valueOf((int) R.id.mpay__desk_discount_view)) != null) {
        } else {
            if (com.meituan.android.pay.desk.component.discount.a.a(this.b)) {
                if (com.meituan.android.pay.desk.component.discount.a.b(this.b)) {
                    com.meituan.android.pay.desk.payment.view.j jVar = new com.meituan.android.pay.desk.payment.view.j(this.c.getContext());
                    com.meituan.android.pay.desk.payment.view.j jVar2 = jVar;
                    jVar2.a((Material) null);
                    jVar.setTag(Integer.valueOf((int) R.id.mpay__desk_discount_view));
                    jVar2.a(com.meituan.android.pay.desk.component.data.a.a(this.b, com.meituan.android.pay.desk.component.data.a.b(this.b)));
                    m.a(this.c, jVar, Integer.valueOf((int) R.id.mpay__desk_order_price));
                    return;
                }
                return;
            }
            com.meituan.android.pay.desk.payment.view.g gVar = new com.meituan.android.pay.desk.payment.view.g(this.c.getContext());
            com.meituan.android.pay.desk.payment.view.g gVar2 = gVar;
            gVar2.a((FloatingLayer) null);
            gVar.setTag(Integer.valueOf((int) R.id.mpay__desk_discount_view));
            gVar2.a(com.meituan.android.pay.desk.component.data.a.a(this.b, com.meituan.android.pay.desk.component.data.a.b(this.b)), com.meituan.android.pay.desk.component.data.a.d(this.b));
            m.a(this.c, gVar, Integer.valueOf((int) R.id.mpay__desk_order_price));
        }
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void c() {
        FloatingLayer a2;
        HelloPayTransInfo transInfo;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5810926da9e4daeda5de6bce1e71c2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5810926da9e4daeda5de6bce1e71c2d");
            return;
        }
        com.meituan.android.pay.common.payment.data.c desk = this.b.getDesk();
        com.meituan.android.pay.common.payment.data.a selectPayment = this.b.getSelectPayment();
        View findViewWithTag = this.c.findViewWithTag(Integer.valueOf((int) R.id.mpay__desk_discount_view));
        if (findViewWithTag instanceof com.meituan.android.pay.desk.payment.view.g) {
            com.meituan.android.pay.desk.payment.view.g gVar = (com.meituan.android.pay.desk.payment.view.g) findViewWithTag;
            gVar.setAllViewVisibility(0);
            Object[] objArr2 = {desk, selectPayment};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.pay.desk.component.data.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1746d4b6c527fd0b57720d0eaabe0724", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (FloatingLayer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1746d4b6c527fd0b57720d0eaabe0724");
            } else {
                ArrayList<FloatingLayer> floatingLayers = (!(desk instanceof CashDesk) || (transInfo = ((CashDesk) desk).getTransInfo()) == null) ? null : transInfo.getFloatingLayers();
                if (selectPayment instanceof Payment) {
                    floatingLayers = ((Payment) selectPayment).getFloatingLayers();
                }
                if (selectPayment instanceof MTPayment) {
                    floatingLayers = ((MTPayment) selectPayment).getFloatingLayers();
                }
                if (selectPayment instanceof BalanceCombinePayment) {
                    floatingLayers = ((BalanceCombinePayment) selectPayment).getFloatingLayers();
                }
                a2 = com.meituan.android.pay.desk.payment.discount.a.a(floatingLayers);
            }
            gVar.a(a2);
            gVar.a(com.meituan.android.pay.desk.component.data.a.a(this.b, com.meituan.android.pay.desk.component.data.a.b(this.b)), com.meituan.android.pay.desk.component.data.a.d(this.b));
            Object[] objArr3 = {this, desk, selectPayment};
            ChangeQuickRedirect changeQuickRedirect3 = d.a;
            gVar.setOnClickDiscountDetail(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "33c8d213216c79471ede094ae2674ac9", RobustBitConfig.DEFAULT_VALUE) ? (g.a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "33c8d213216c79471ede094ae2674ac9") : new d(this, desk, selectPayment));
        } else if (findViewWithTag instanceof com.meituan.android.pay.desk.payment.view.j) {
            com.meituan.android.pay.desk.payment.view.j jVar = (com.meituan.android.pay.desk.payment.view.j) findViewWithTag;
            jVar.a(com.meituan.android.pay.desk.component.data.a.a(desk, selectPayment));
            jVar.a(com.meituan.android.pay.desk.component.data.a.a(this.b, com.meituan.android.pay.desk.component.data.a.b(this.b)));
            jVar.setVisibility(0);
            Object[] objArr4 = {this, desk, selectPayment};
            ChangeQuickRedirect changeQuickRedirect4 = e.a;
            jVar.setOnClickDiscountDetail(PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "e42da1e55550e0338c1aa55807e9df8a", RobustBitConfig.DEFAULT_VALUE) ? (j.a) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "e42da1e55550e0338c1aa55807e9df8a") : new e(this, desk, selectPayment));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.meituan.android.pay.common.payment.data.c cVar, com.meituan.android.pay.common.payment.data.a aVar) {
        ArrayList arrayList;
        Object[] objArr = {cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "551363027f53b1283e1e5688afe9211e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "551363027f53b1283e1e5688afe9211e");
            return;
        }
        Material a2 = com.meituan.android.pay.desk.component.data.a.a(cVar, aVar);
        Object[] objArr2 = {cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.pay.desk.component.discount.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e30585c6479eeeedfafae93a7ff2c2e2", RobustBitConfig.DEFAULT_VALUE)) {
            arrayList = (ArrayList) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e30585c6479eeeedfafae93a7ff2c2e2");
        } else {
            List<CombineLabel> a3 = com.meituan.android.pay.desk.component.discount.a.a(cVar, aVar);
            ArrayList arrayList2 = new ArrayList();
            if (!com.meituan.android.paybase.utils.i.a((Collection) a3)) {
                for (CombineLabel combineLabel : a3) {
                    if (!com.meituan.android.paybase.utils.i.a((Collection) combineLabel.getChildrenLabel())) {
                        arrayList2.addAll(combineLabel.getChildrenLabel());
                    }
                }
            }
            arrayList = arrayList2;
        }
        if (com.meituan.android.paybase.utils.i.a((Collection) arrayList)) {
            return;
        }
        if (com.meituan.android.pay.desk.component.data.a.b(this.b) && (this.c.getContext() instanceof FragmentActivity)) {
            NewCombineLabelDetailDialogFragment a4 = NewCombineLabelDetailDialogFragment.a(com.meituan.android.pay.common.payment.utils.b.b((FragmentActivity) this.c.getContext(), "tradeno"), com.meituan.android.pay.common.payment.utils.b.b((FragmentActivity) this.c.getContext(), "cashier_type"), arrayList, aVar, this.f, "验密页", this.g, a2);
            a4.a(((FragmentActivity) this.c.getContext()).getSupportFragmentManager());
            Object[] objArr3 = {this};
            ChangeQuickRedirect changeQuickRedirect3 = f.a;
            a4.g = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "9aeac556b5cc549e48a8a33768e65436", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.pay.desk.component.fragment.h) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "9aeac556b5cc549e48a8a33768e65436") : new f(this);
            return;
        }
        CombineLabelDetailDialogFragment a5 = CombineLabelDetailDialogFragment.a(arrayList, a2);
        if (this.c.getContext() instanceof FragmentActivity) {
            a5.a(((FragmentActivity) this.c.getContext()).getSupportFragmentManager());
        }
        Object[] objArr4 = {this};
        ChangeQuickRedirect changeQuickRedirect4 = g.a;
        a5.b = PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "a795c1c7187be22026b3b1ffd1b03a1f", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.pay.desk.component.fragment.g) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "a795c1c7187be22026b3b1ffd1b03a1f") : new g(this);
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c04ad551681adc4fe4ca6f4650cb366", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c04ad551681adc4fe4ca6f4650cb366");
        } else {
            m.a(this.c, Integer.valueOf((int) R.id.mpay__desk_discount_view));
        }
    }
}
