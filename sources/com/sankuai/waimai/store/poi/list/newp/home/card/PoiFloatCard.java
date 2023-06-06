package com.sankuai.waimai.store.poi.list.newp.home.card;

import android.arch.lifecycle.f;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.assembler.component.e;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.poi.list.newp.block.rxevent.i;
import com.sankuai.waimai.store.poi.list.newp.home.model.BaseContainerViewModel;
import com.sankuai.waimai.store.poi.list.refactor.card.float_card.PoiGlobalCart;
import com.sankuai.waimai.store.poi.list.refactor.card.float_card.c;
import com.sankuai.waimai.store.poi.list.refactor.event.d;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.util.List;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiFloatCard extends BaseCard implements l<Integer> {
    public static ChangeQuickRedirect h;
    public com.sankuai.waimai.store.param.a i;
    private ViewGroup j;
    private ViewGroup k;
    private View l;
    private PoiGlobalCart m;
    private e n;
    private com.sankuai.waimai.store.poi.list.newp.block.helper.a o;

    @Override // android.arch.lifecycle.l
    public final /* synthetic */ void a(@Nullable Integer num) {
        Integer num2 = num;
        Object[] objArr = {num2};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "901267d563a767c5bd6dfca6ccf9b5b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "901267d563a767c5bd6dfca6ccf9b5b7");
        } else if (num2.intValue() == 1) {
            c();
        } else if (num2.intValue() == 0) {
            d();
        }
    }

    public PoiFloatCard(f fVar, FragmentActivity fragmentActivity, e eVar) {
        super(fVar, fragmentActivity);
        Object[] objArr = {fVar, fragmentActivity, eVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "676eb767b649c5a89b3f06d7f9448a9c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "676eb767b649c5a89b3f06d7f9448a9c");
        } else {
            this.n = eVar;
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    @NonNull
    @NotNull
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffe78db939ff6de974db213f5e927973", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffe78db939ff6de974db213f5e927973") : LayoutInflater.from(this.e).inflate(R.layout.wm_sc_convenient_home_float_card, viewGroup);
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f83333c8fc9e04436212cd9df9f686c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f83333c8fc9e04436212cd9df9f686c");
            return;
        }
        super.a(view);
        BaseContainerViewModel baseContainerViewModel = (BaseContainerViewModel) q.a(this.e).a(BaseContainerViewModel.class);
        this.i = baseContainerViewModel.b.a();
        this.o = new com.sankuai.waimai.store.poi.list.newp.block.helper.a(false);
        this.j = (ViewGroup) a(R.id.poi_anim_container);
        this.k = (ViewGroup) a(R.id.no_anim_container);
        a(i.class, new l<i>() { // from class: com.sankuai.waimai.store.poi.list.newp.home.card.PoiFloatCard.1
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable i iVar) {
                i iVar2 = iVar;
                Object[] objArr2 = {iVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dda16ae3bf4b7bdd6bf4fb326538a2cb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dda16ae3bf4b7bdd6bf4fb326538a2cb");
                } else if (iVar2 != null) {
                    if (iVar2.a == 1) {
                        PoiFloatCard.this.c();
                    } else if (iVar2.a == 0) {
                        PoiFloatCard.this.d();
                    }
                    if (PoiFloatCard.this.m != null && PoiFloatCard.this.m.getView().getVisibility() == 0) {
                        PoiFloatCard.this.m.a(8);
                    }
                    if (PoiFloatCard.this.l != null) {
                        if (iVar2.a == 100) {
                            PoiFloatCard.this.l.setVisibility(0);
                        }
                        if (iVar2.a == 200) {
                            PoiFloatCard.this.l.setVisibility(4);
                        }
                    }
                }
            }
        });
        baseContainerViewModel.d.a(this.d, this);
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public final e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b0c771382e9d61a55f9ff7ffdd386ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b0c771382e9d61a55f9ff7ffdd386ed");
        }
        if (this.n == null) {
            this.n = new e();
        }
        this.n.b = 2;
        this.n.a = 4;
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1b9d95bed489fd178da1e6c2fdac352", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1b9d95bed489fd178da1e6c2fdac352");
        } else if (this.o != null) {
            if (this.m != null && this.m.getView() != null) {
                this.o.a(this.m.getView());
            }
            if (this.l != null) {
                this.o.a(this.l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fa0e7104289b69f853ca9a100a94644", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fa0e7104289b69f853ca9a100a94644");
        } else if (this.o != null) {
            if (this.m != null && this.m.getView() != null) {
                this.o.b(this.m.getView());
            }
            if (this.l != null) {
                this.o.b(this.l);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    public void a(List<PoiVerticalityDataResponse.FloatingEntranceItemWithLocation> list) {
        PoiGlobalCart poiGlobalCart;
        int i = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68d9c4c297ed2758c719406a46902923", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68d9c4c297ed2758c719406a46902923");
            return;
        }
        if (this.j != null) {
            this.j.removeAllViews();
        }
        if (this.o != null) {
            this.o.a();
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return;
        }
        for (PoiVerticalityDataResponse.FloatingEntranceItemWithLocation floatingEntranceItemWithLocation : list) {
            if (floatingEntranceItemWithLocation != null) {
                int i2 = floatingEntranceItemWithLocation.type;
                View view = null;
                if (i2 == 2) {
                    SCBaseActivity sCBaseActivity = (SCBaseActivity) this.e;
                    ViewGroup viewGroup = this.j;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.newp.home.card.PoiFloatCard.2
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            Object[] objArr2 = {view2};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd5a545cd08f60e12ca42727ee01cda4", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd5a545cd08f60e12ca42727ee01cda4");
                            } else {
                                PoiFloatCard.this.b((PoiFloatCard) new d());
                            }
                        }
                    };
                    e eVar = floatingEntranceItemWithLocation.location;
                    Object[] objArr2 = new Object[4];
                    objArr2[i] = sCBaseActivity;
                    objArr2[1] = viewGroup;
                    objArr2[2] = onClickListener;
                    objArr2[3] = eVar;
                    ChangeQuickRedirect changeQuickRedirect2 = c.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "004aa860b67135a41649978f06ecee72", RobustBitConfig.DEFAULT_VALUE)) {
                        view = (View) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "004aa860b67135a41649978f06ecee72");
                    } else if (!com.sankuai.waimai.store.util.b.a(sCBaseActivity) && viewGroup != null) {
                        view = LayoutInflater.from(sCBaseActivity).inflate(R.layout.wm_sc_convenient_landing_to_top_card_layout, viewGroup, true).findViewById(R.id.layout_to_top_img_poiList);
                        view.setOnClickListener(onClickListener);
                        c.a(view, eVar.e, eVar.d, eVar.f, eVar.c);
                    }
                    this.l = view;
                    if (this.l != null) {
                        this.l.setVisibility(4);
                    }
                } else if (i2 == 5) {
                    SCBaseActivity sCBaseActivity2 = (SCBaseActivity) this.e;
                    ViewGroup viewGroup2 = this.j;
                    com.sankuai.waimai.store.param.a aVar = this.i;
                    e eVar2 = floatingEntranceItemWithLocation.location;
                    Object[] objArr3 = new Object[4];
                    objArr3[i] = sCBaseActivity2;
                    objArr3[1] = viewGroup2;
                    objArr3[2] = aVar;
                    objArr3[3] = eVar2;
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ec8ada7f8b2bf79df344a85b6b6b0b56", RobustBitConfig.DEFAULT_VALUE)) {
                        poiGlobalCart = (PoiGlobalCart) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ec8ada7f8b2bf79df344a85b6b6b0b56");
                    } else if (com.sankuai.waimai.store.util.b.a(sCBaseActivity2) || aVar == null || viewGroup2 == null) {
                        poiGlobalCart = null;
                    } else {
                        PoiGlobalCart poiGlobalCart2 = new PoiGlobalCart(sCBaseActivity2, aVar, new com.sankuai.waimai.store.poi.list.logreport.a(sCBaseActivity2, aVar));
                        FrameLayout frameLayout = new FrameLayout(sCBaseActivity2);
                        viewGroup2.addView(frameLayout, new ViewGroup.LayoutParams(-2, -2));
                        poiGlobalCart2.createAndReplaceView(frameLayout);
                        c.a(poiGlobalCart2.getView(), eVar2.e, eVar2.d, eVar2.f, eVar2.c);
                        poiGlobalCart2.hide();
                        poiGlobalCart = poiGlobalCart2;
                    }
                    this.m = poiGlobalCart;
                    if (this.m != null) {
                        this.m.show();
                        if (!TextUtils.isEmpty(floatingEntranceItemWithLocation.tipMsg)) {
                            this.m.a(floatingEntranceItemWithLocation.tipMsg);
                        } else {
                            PoiGlobalCart poiGlobalCart3 = this.m;
                            Object[] objArr4 = new Object[i];
                            ChangeQuickRedirect changeQuickRedirect4 = PoiGlobalCart.a;
                            if (PatchProxy.isSupport(objArr4, poiGlobalCart3, changeQuickRedirect4, false, "f5fe9f7c97ee6b132abe4de2a0587676", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, poiGlobalCart3, changeQuickRedirect4, i, "f5fe9f7c97ee6b132abe4de2a0587676");
                            } else {
                                poiGlobalCart3.a((String) null);
                            }
                        }
                    }
                }
                i = 0;
            }
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = h;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "238ec68d90f96f4a4fd26c8bd3b624ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "238ec68d90f96f4a4fd26c8bd3b624ee");
        } else if (this.o != null) {
            if (this.m != null && this.m.getView() != null) {
                this.o.a(this.e, this.m.getView());
                this.o.b(this.m.getView());
            }
            if (this.l != null) {
                this.o.a(this.e, this.l);
                this.o.b(this.l);
            }
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0ccdd1cf903e23e5ffe6ca21f3bae1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0ccdd1cf903e23e5ffe6ca21f3bae1c");
            return;
        }
        super.onPause();
        if (this.m == null || this.m.getView().getVisibility() != 0) {
            return;
        }
        this.m.a(8);
    }
}
