package com.sankuai.waimai.store.recipe;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.newwidgets.NetInfoLoadView;
import com.sankuai.waimai.store.newwidgets.NotDragBottomSheetBehavior;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.recipe.b;
import com.sankuai.waimai.store.recipe.bock.list.d;
import com.sankuai.waimai.store.recipe.model.Recipe;
import com.sankuai.waimai.store.recipe.model.RecipeResponse;
import com.sankuai.waimai.store.util.h;
import com.sankuai.waimai.store.util.z;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.base.b implements com.sankuai.waimai.store.observers.a, b.InterfaceC1289b, g {
    public static ChangeQuickRedirect a;
    b.a b;
    View c;
    BottomSheetBehavior d;
    private com.sankuai.waimai.store.recipe.bock.list.d e;
    private TextView f;
    private TextView g;
    private NetInfoLoadView h;
    private final d i;

    @Override // com.sankuai.waimai.store.recipe.b.InterfaceC1289b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7fc8fe136e6a96aadd9929bb4a0f1e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7fc8fe136e6a96aadd9929bb4a0f1e1");
        }
    }

    public a(@NonNull Context context, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, String str) {
        super(context);
        Object[] objArr = {context, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "105d6fd0b3a929b21b3896c629d5b8e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "105d6fd0b3a929b21b3896c629d5b8e5");
            return;
        }
        this.b = new f(this, aVar, str);
        this.i = new d(aVar.f(), aVar.h(), context);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdbf74568e034812de1ed1db098ee746", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdbf74568e034812de1ed1db098ee746");
        } else if (getContext() instanceof Activity) {
            ViewGroup viewGroup = (ViewGroup) ((Activity) getContext()).findViewById(R.id.recipe_root_view);
            viewGroup.setVisibility(8);
            viewGroup.removeAllViews();
            z.a(getContext(), R.layout.wm_sc_common_recipe_dialog, viewGroup, true);
            this.mView = viewGroup;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f663ec792a8a8711f7d351b1afc98e9d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f663ec792a8a8711f7d351b1afc98e9d");
            } else {
                this.c = findView(R.id.view_background);
                this.f = (TextView) findView(R.id.title);
                this.g = (TextView) findView(R.id.sub_title);
                this.e = new com.sankuai.waimai.store.recipe.bock.list.d(getContext(), this);
                this.e.bindView(findView(R.id.recipe_list_layout));
                ImageView imageView = (ImageView) findView(R.id.close);
                View findView = findView(R.id.view_background);
                if (a()) {
                    u.a(imageView, (int) R.drawable.icon_detail_recipe_dialog_close);
                    findView.setBackgroundColor(com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_4D000000));
                }
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.recipe.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "88b828a524f2117d4ad466e4dd818651", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "88b828a524f2117d4ad466e4dd818651");
                        } else {
                            a.this.hide();
                        }
                    }
                });
                this.h = (NetInfoLoadView) findView(R.id.recipe_list_layout_info);
                this.h.setReloadClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.recipe.a.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "416fd8e5b48723070c3f3bbde19a66ef", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "416fd8e5b48723070c3f3bbde19a66ef");
                        } else {
                            a.this.b.a();
                        }
                    }
                });
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1bca81fd5e5ab40fa188b07f60145bcb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1bca81fd5e5ab40fa188b07f60145bcb");
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((CoordinatorLayout) findView(R.id.coordinator_layout)).getLayoutParams();
                    View findView2 = findView(R.id.bottom_sheet);
                    this.d = BottomSheetBehavior.a(findView2);
                    if (a()) {
                        marginLayoutParams.topMargin = com.sankuai.waimai.foundation.utils.g.e(getContext());
                    } else {
                        marginLayoutParams.topMargin = com.sankuai.waimai.store.util.b.c(getContext(), R.dimen.wm_sc_common_dimen_60);
                        this.d = new NotDragBottomSheetBehavior();
                        ((CoordinatorLayout.c) findView2.getLayoutParams()).a(this.d);
                    }
                    this.d.c = false;
                    this.d.a(0);
                    this.d.j = new BottomSheetBehavior.a() { // from class: com.sankuai.waimai.store.recipe.a.4
                        public static ChangeQuickRedirect a;

                        @Override // android.support.design.widget.BottomSheetBehavior.a
                        public final void a(@NonNull View view, int i) {
                            Object[] objArr4 = {view, Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7454df13dc76a7e10d9619dded19e2a3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7454df13dc76a7e10d9619dded19e2a3");
                            } else if (i == 4) {
                                a.this.hide();
                            }
                        }

                        @Override // android.support.design.widget.BottomSheetBehavior.a
                        public final void a(@NonNull View view, float f) {
                            Object[] objArr4 = {view, Float.valueOf(f)};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "19624dba63d3736151a8a78a9d24433b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "19624dba63d3736151a8a78a9d24433b");
                            } else {
                                u.a(a.this.c, f);
                            }
                        }
                    };
                }
                this.mView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.recipe.a.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c31d900ed56afffdedcb160964b8b875", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c31d900ed56afffdedcb160964b8b875");
                        } else {
                            a.this.d.b(4);
                        }
                    }
                });
            }
            com.sankuai.waimai.store.order.a.e().a(this);
        }
    }

    @Override // com.sankuai.waimai.store.recipe.b.InterfaceC1289b
    public final void a(@NonNull RecipeResponse recipeResponse) {
        Object[] objArr = {recipeResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5efec38ab1f6366ced2a883394a754f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5efec38ab1f6366ced2a883394a754f1");
            return;
        }
        d dVar = this.i;
        Object[] objArr2 = {recipeResponse};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "0973faac26f086fc4d07a2a2095b0934", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "0973faac26f086fc4d07a2a2095b0934");
        } else {
            dVar.e = recipeResponse.getStids();
            dVar.f = recipeResponse.getTraceInfo();
        }
        a(recipeResponse.title, recipeResponse.subTitle);
    }

    private void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4c55277d44aea5014c03a79a1b2e0c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4c55277d44aea5014c03a79a1b2e0c8");
            return;
        }
        this.f.setText(str);
        this.g.setText(str2);
    }

    @Override // com.sankuai.waimai.store.recipe.g
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0203e6e48c992555586e4c7f427b902", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0203e6e48c992555586e4c7f427b902")).booleanValue();
        }
        try {
            return g().b.isOptimizedRecipe();
        } catch (Exception unused) {
            return false;
        }
    }

    public final void a(String str, @NonNull GoodsSpu goodsSpu) {
        Object[] objArr = {str, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92aa023a12661a80e58a800d7b19d4b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92aa023a12661a80e58a800d7b19d4b3");
            return;
        }
        d dVar = this.i;
        long j = goodsSpu.id;
        Object[] objArr2 = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "d492f7a84cc2b76b5d642115dd4bf04c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "d492f7a84cc2b76b5d642115dd4bf04c");
        } else {
            dVar.d = j;
        }
        this.b.a(goodsSpu);
        this.b.a(str);
        a("", "");
        com.sankuai.waimai.store.recipe.bock.list.d dVar2 = this.e;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.recipe.bock.list.d.a;
        if (PatchProxy.isSupport(objArr3, dVar2, changeQuickRedirect3, false, "7fd6433e64165fa4b389288af6bf6100", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, dVar2, changeQuickRedirect3, false, "7fd6433e64165fa4b389288af6bf6100");
        } else {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.recipe.bock.list.d.a;
            if (PatchProxy.isSupport(objArr4, dVar2, changeQuickRedirect4, false, "760a3d4783075a8a629221e0e0c561f9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, dVar2, changeQuickRedirect4, false, "760a3d4783075a8a629221e0e0c561f9");
            } else {
                dVar2.e.b();
            }
        }
        this.d.b(3);
        super.show();
    }

    @Override // com.sankuai.waimai.store.recipe.b.InterfaceC1289b
    public final void a(Recipe recipe, int i) {
        Object[] objArr = {recipe, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3438bf1dc79ba3e02a920a0127a05751", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3438bf1dc79ba3e02a920a0127a05751");
            return;
        }
        if (i == 0) {
            com.sankuai.waimai.store.recipe.bock.list.d dVar = this.e;
            boolean a2 = a();
            Object[] objArr2 = {recipe, Byte.valueOf(a2 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.recipe.bock.list.d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "dc7bd3c0a24efc598962fb4fe540b4c6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "dc7bd3c0a24efc598962fb4fe540b4c6");
            } else {
                u.a((View) dVar.c, Integer.MIN_VALUE, dVar.e.getMeasuredHeight() - 0);
                d.a aVar = dVar.b;
                Object[] objArr3 = {recipe, Byte.valueOf(a2 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = d.a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "d69fc1bc810f2eeb873e2d9e6fa1e576", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "d69fc1bc810f2eeb873e2d9e6fa1e576");
                } else if (recipe != null) {
                    aVar.b_(aVar.a(recipe, a2));
                }
                if (!dVar.d.c(recipe)) {
                    dVar.a();
                }
                dVar.b();
                dVar.c();
            }
        } else if (i == 1) {
            com.sankuai.waimai.store.recipe.bock.list.d dVar2 = this.e;
            boolean a3 = a();
            Object[] objArr4 = {recipe, Byte.valueOf(a3 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.recipe.bock.list.d.a;
            if (PatchProxy.isSupport(objArr4, dVar2, changeQuickRedirect4, false, "0dbeff817c8d5ce67f078a2c937c9eb1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, dVar2, changeQuickRedirect4, false, "0dbeff817c8d5ce67f078a2c937c9eb1");
            } else {
                d.a aVar2 = dVar2.b;
                Object[] objArr5 = {recipe, Byte.valueOf(a3 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect5 = d.a.a;
                if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "3c1b51bcf917b6af5b640cadea3ec2ae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "3c1b51bcf917b6af5b640cadea3ec2ae");
                } else if (recipe != null) {
                    aVar2.c_(aVar2.a(recipe, a3));
                }
            }
        } else if (i == 2) {
            com.sankuai.waimai.store.recipe.bock.list.d dVar3 = this.e;
            boolean a4 = a();
            Object[] objArr6 = {recipe, Byte.valueOf(a4 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.recipe.bock.list.d.a;
            if (PatchProxy.isSupport(objArr6, dVar3, changeQuickRedirect6, false, "0e372d65fc02ee7fde461fa131af37fa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, dVar3, changeQuickRedirect6, false, "0e372d65fc02ee7fde461fa131af37fa");
            } else {
                d.a aVar3 = dVar3.b;
                Object[] objArr7 = {recipe, Byte.valueOf(a4 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect7 = d.a.a;
                if (PatchProxy.isSupport(objArr7, aVar3, changeQuickRedirect7, false, "6e1aaeea6722e5a0c11ecf9700a0698d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, aVar3, changeQuickRedirect7, false, "6e1aaeea6722e5a0c11ecf9700a0698d");
                } else if (recipe != null) {
                    aVar3.a(0, aVar3.a(recipe, a4));
                }
            }
        }
        this.h.e();
    }

    @Override // com.sankuai.waimai.store.recipe.b.InterfaceC1289b
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1be574c4ee21fb63d6af6761d0cb6f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1be574c4ee21fb63d6af6761d0cb6f0");
        } else {
            this.h.a(i);
        }
    }

    @Override // com.sankuai.waimai.store.recipe.b.InterfaceC1289b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "785ba5d74d2f272133ce69023bc55b7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "785ba5d74d2f272133ce69023bc55b7a");
            return;
        }
        NetInfoLoadView netInfoLoadView = this.h;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = NetInfoLoadView.a;
        if (PatchProxy.isSupport(objArr2, netInfoLoadView, changeQuickRedirect2, false, "d382090be8f64867ee258777e3ebdf3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, netInfoLoadView, changeQuickRedirect2, false, "d382090be8f64867ee258777e3ebdf3d");
        } else {
            netInfoLoadView.b("");
        }
    }

    @Override // com.sankuai.waimai.store.recipe.g
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4c765cdd1c3ef9d8a3dd5d2704f4551", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4c765cdd1c3ef9d8a3dd5d2704f4551");
            return;
        }
        com.sankuai.waimai.store.recipe.bock.list.d dVar = this.e;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.recipe.bock.list.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "42417dd93514784e62ead09f0f95b080", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "42417dd93514784e62ead09f0f95b080");
            return;
        }
        dVar.b.notifyDataSetChanged();
        dVar.a();
    }

    @Override // com.sankuai.waimai.store.recipe.g
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e64cd64e03b5f54dc308dd59c459e004", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e64cd64e03b5f54dc308dd59c459e004");
            return;
        }
        com.sankuai.waimai.store.recipe.bock.list.d dVar = this.e;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.recipe.bock.list.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "226fd3568a9f799929d3bd1e141b0d72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "226fd3568a9f799929d3bd1e141b0d72");
        } else {
            dVar.b.notifyDataSetChanged();
        }
    }

    @Override // com.sankuai.waimai.store.recipe.g
    public final void a(View view, List<GoodsSpu> list) {
        GoodsSku goodsSku;
        Object[] objArr = {view, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62d72cf13a432b21c6a311b56a36e3e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62d72cf13a432b21c6a311b56a36e3e2");
        } else if (!com.sankuai.shangou.stone.util.a.b(list)) {
            String d = this.b.b().d();
            ArrayList arrayList = new ArrayList();
            for (GoodsSpu goodsSpu : list) {
                if (goodsSpu != null && (goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0)) != null) {
                    arrayList.add(new OrderedFood(goodsSpu, goodsSku, null, goodsSku.minOrderCount));
                }
            }
            if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
                return;
            }
            com.sankuai.waimai.store.order.a.e().f(d, arrayList);
            com.sankuai.waimai.store.order.a.e().c(d, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.a(view, 273, d));
        }
    }

    @Override // com.sankuai.waimai.store.recipe.g
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f95357aaf4f219e4cbbd69511b1385fa", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f95357aaf4f219e4cbbd69511b1385fa") : this.b.b();
    }

    @Override // com.sankuai.waimai.store.recipe.g
    public final void a(GoodsSpu goodsSpu, h hVar, int i) {
        Object[] objArr = {goodsSpu, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d59af64b109fd953bcbbcfa445c93353", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d59af64b109fd953bcbbcfa445c93353");
        } else {
            com.sankuai.waimai.store.router.g.a(getContext(), goodsSpu, this.b.b().b, hVar);
        }
    }

    @Override // com.sankuai.waimai.store.recipe.g
    public final void a(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66ea6108224c5b047441cccad683f80f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66ea6108224c5b047441cccad683f80f");
        } else if (!(getContext() instanceof Activity) || com.sankuai.waimai.store.util.b.a(getContext())) {
        } else {
            com.sankuai.waimai.store.router.g.a((Activity) getContext(), goodsSpu, this.b.b().b, -1);
        }
    }

    @Override // com.sankuai.waimai.store.recipe.g
    public final void a(GoodsSpu goodsSpu, View view, int i) {
        Object[] objArr = {goodsSpu, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ca829f57023d16f8028c8a511c630ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ca829f57023d16f8028c8a511c630ae");
        } else if (getContext() instanceof Activity) {
            com.sankuai.waimai.store.order.a.e().a(this.b.b().d(), goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.a(view, 273, this.b.b().d()));
        }
    }

    @Override // com.sankuai.waimai.store.recipe.g
    public final int h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8eab34098af4b56cecfcee253c4e61e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8eab34098af4b56cecfcee253c4e61e")).intValue() : this.b.c();
    }

    @Override // com.sankuai.waimai.store.recipe.g
    @NonNull
    public final d i() {
        return this.i;
    }

    @Override // com.sankuai.waimai.store.recipe.g
    public final void a(Recipe recipe) {
        Object[] objArr = {recipe};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddf798e6f030a2880bec2b2e71e955ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddf798e6f030a2880bec2b2e71e955ea");
        } else {
            this.b.a(recipe);
        }
    }

    @Override // com.sankuai.waimai.store.recipe.g
    public final void b(Recipe recipe) {
        Object[] objArr = {recipe};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4197473c6ede68ac87a809f74b6b645", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4197473c6ede68ac87a809f74b6b645");
        } else {
            this.b.b(recipe);
        }
    }

    @Override // com.sankuai.waimai.store.recipe.g
    public final boolean c(Recipe recipe) {
        Object[] objArr = {recipe};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ec77be1bef4d736afd20851f76b6182", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ec77be1bef4d736afd20851f76b6182")).booleanValue() : this.b.c(recipe);
    }

    @Override // com.sankuai.waimai.store.recipe.g
    public final void d(Recipe recipe) {
        Object[] objArr = {recipe};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7f3994725ad860e2b48694f11547d04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7f3994725ad860e2b48694f11547d04");
        } else {
            this.b.d(recipe);
        }
    }

    @Override // com.sankuai.waimai.store.recipe.g
    public final boolean e(Recipe recipe) {
        Object[] objArr = {recipe};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e9ad5e60c82408a97cdea2ac9a8fda8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e9ad5e60c82408a97cdea2ac9a8fda8")).booleanValue() : this.b.e(recipe);
    }

    @Override // com.sankuai.waimai.store.recipe.g
    public final int j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76ca0b6b4e7c2dfb044cf13d299ba16a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76ca0b6b4e7c2dfb044cf13d299ba16a")).intValue();
        }
        com.sankuai.waimai.store.recipe.bock.list.d dVar = this.e;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.recipe.bock.list.d.a;
        return PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "b90894be4bf9cc6bd3ea5c200f82c5f2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "b90894be4bf9cc6bd3ea5c200f82c5f2")).intValue() : dVar.c.getMeasuredHeight();
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "431b71132907a1c451cea6e997af43cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "431b71132907a1c451cea6e997af43cd");
        } else {
            d();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "357d11147079bc6b172fb96d08696a90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "357d11147079bc6b172fb96d08696a90");
        } else {
            com.sankuai.waimai.store.order.a.e().b(this);
        }
    }
}
