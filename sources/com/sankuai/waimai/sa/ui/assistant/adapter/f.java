package com.sankuai.waimai.sa.ui.assistant.adapter;

import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.sa.model.i;
import com.sankuai.waimai.sa.model.k;
import com.sankuai.waimai.sa.ui.assistant.chat.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends g<com.sankuai.waimai.sa.ui.assistant.chat.f> {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.sa.model.b b;
    private final com.sankuai.waimai.sa.ui.assistant.a e;
    private m f;

    public f(com.sankuai.waimai.sa.ui.assistant.a aVar, m mVar) {
        Object[] objArr = {aVar, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "066fe0cac0aa050085e79bb828a8520e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "066fe0cac0aa050085e79bb828a8520e");
            return;
        }
        this.e = aVar;
        this.f = mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.waimai.sa.ui.assistant.adapter.g, android.support.v7.widget.RecyclerView.a
    /* renamed from: b */
    public com.sankuai.waimai.sa.ui.assistant.chat.f onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e75910de2ab19bf9a7954e7e1c86095", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.sa.ui.assistant.chat.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e75910de2ab19bf9a7954e7e1c86095");
        }
        if (i == -9) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_smart_assistant_tmpl_large_graphic_item, viewGroup, false);
        } else if (i != 5) {
            switch (i) {
                case 1:
                    inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_smart_assistant_tmpl_poi_item, viewGroup, false);
                    break;
                case 2:
                    inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_smart_assistant_tmpl_food_item, viewGroup, false);
                    break;
                default:
                    inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_smart_assistant_tmpl_small_graphic_item, viewGroup, false);
                    break;
            }
        } else {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_smart_assistant_tmpl_order_item, viewGroup, false);
        }
        return new com.sankuai.waimai.sa.ui.assistant.chat.f(inflate, i, this.e, this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.waimai.sa.ui.assistant.adapter.g, android.support.v7.widget.RecyclerView.a
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void onBindViewHolder(com.sankuai.waimai.sa.ui.assistant.chat.f fVar, int i) {
        Object[] objArr = {fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f8c16c741e11b19f02d6d7859ee550f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f8c16c741e11b19f02d6d7859ee550f");
            return;
        }
        com.sankuai.waimai.sa.model.b bVar = this.b;
        Object[] objArr2 = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.sa.ui.assistant.chat.f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "3c46d92ffc4f93b6c946f03187984047", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "3c46d92ffc4f93b6c946f03187984047");
            return;
        }
        fVar.A = bVar;
        fVar.B = i;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.sa.ui.assistant.chat.f.a;
        if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "acb07b4ca1e8ea571bd5f4dd46386f7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "acb07b4ca1e8ea571bd5f4dd46386f7e");
            return;
        }
        switch (fVar.b) {
            case -10:
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.sa.ui.assistant.chat.f.a;
                if (PatchProxy.isSupport(objArr4, fVar, changeQuickRedirect4, false, "48b3692dc5a84d5990bb9b9b568d08ed", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, fVar, changeQuickRedirect4, false, "48b3692dc5a84d5990bb9b9b568d08ed");
                    return;
                } else if (fVar.A == null || fVar.A.k == null || fVar.A.k.b == null || fVar.A.k.b.size() <= fVar.B) {
                    return;
                } else {
                    com.sankuai.waimai.sa.model.g gVar = fVar.A.k.b.get(fVar.B) == null ? new com.sankuai.waimai.sa.model.g() : fVar.A.k.b.get(fVar.B);
                    ah.a(fVar.z, gVar.b);
                    b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a2.b = fVar.itemView.getContext();
                    a2.c = gVar.c;
                    a2.i = R.drawable.wm_smart_assistant_small_graphic_default_img;
                    a2.j = R.drawable.wm_smart_assistant_small_graphic_default_img;
                    a2.e = 1;
                    a2.a((ImageView) fVar.y);
                    return;
                }
            case -9:
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.sa.ui.assistant.chat.f.a;
                if (PatchProxy.isSupport(objArr5, fVar, changeQuickRedirect5, false, "959271f818579b05eb5e6dc5bb881f3a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, fVar, changeQuickRedirect5, false, "959271f818579b05eb5e6dc5bb881f3a");
                    return;
                } else if (fVar.A == null || fVar.A.k == null || fVar.A.k.b == null || fVar.A.k.b.size() <= fVar.B) {
                    return;
                } else {
                    com.sankuai.waimai.sa.model.g gVar2 = fVar.A.k.b.get(fVar.B) == null ? new com.sankuai.waimai.sa.model.g() : fVar.A.k.b.get(fVar.B);
                    if (TextUtils.isEmpty(gVar2.b)) {
                        fVar.w.setVisibility(4);
                    } else {
                        fVar.w.setText(gVar2.b);
                        fVar.w.setVisibility(0);
                    }
                    if (gVar2.f != null && gVar2.f.length > 0) {
                        ah.a(fVar.x, gVar2.f[0]);
                    } else {
                        fVar.x.setVisibility(8);
                    }
                    b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a3.b = fVar.itemView.getContext();
                    a3.c = gVar2.c;
                    a3.i = R.drawable.wm_smart_assistant_large_graphic_default_img;
                    a3.j = R.drawable.wm_smart_assistant_large_graphic_default_img;
                    a3.e = 1;
                    a3.a(fVar.v);
                    return;
                }
            case 1:
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.sa.ui.assistant.chat.f.a;
                if (PatchProxy.isSupport(objArr6, fVar, changeQuickRedirect6, false, "18a18423bb102b3dd5a67d4732bc7aaa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, fVar, changeQuickRedirect6, false, "18a18423bb102b3dd5a67d4732bc7aaa");
                    return;
                } else if (fVar.A == null || fVar.A.g == null || fVar.A.g.size() <= fVar.B) {
                    return;
                } else {
                    i iVar = fVar.A.g.get(fVar.B);
                    fVar.a(fVar.c, iVar.c);
                    fVar.d.setText(iVar.b);
                    fVar.e.setText(iVar.d);
                    fVar.g.setText(iVar.e);
                    fVar.h.setText(iVar.f);
                    ah.a(fVar.i, iVar.g);
                    if (com.sankuai.waimai.foundation.utils.b.b(iVar.h)) {
                        fVar.j.setVisibility(8);
                        return;
                    }
                    fVar.j.setVisibility(0);
                    com.sankuai.waimai.sa.model.inner.a aVar = iVar.h.get(0);
                    fVar.b(fVar.k, aVar.b);
                    fVar.l.setText(aVar.a);
                    return;
                }
            case 2:
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.sa.ui.assistant.chat.f.a;
                if (PatchProxy.isSupport(objArr7, fVar, changeQuickRedirect7, false, "314381967745ad07684aa4d2978c854d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, fVar, changeQuickRedirect7, false, "314381967745ad07684aa4d2978c854d");
                    return;
                } else if (fVar.A == null || fVar.A.i == null || fVar.A.i.size() <= fVar.B) {
                    return;
                } else {
                    k kVar = fVar.A.i.get(fVar.B);
                    fVar.a(fVar.m, kVar.c);
                    fVar.n.setText(kVar.b);
                    ah.a(fVar.o, kVar.d);
                    ah.a(fVar.p, kVar.e);
                    ah.a(fVar.q, kVar.f);
                    if (!com.sankuai.waimai.foundation.utils.b.b(kVar.h) && kVar.h.get(0) != null) {
                        com.sankuai.waimai.sa.model.inner.a aVar2 = kVar.h.get(0);
                        fVar.r.setVisibility(0);
                        fVar.b(fVar.r, aVar2.b);
                        ah.a(fVar.s, aVar2.a);
                    } else {
                        fVar.r.setVisibility(8);
                        fVar.s.setVisibility(8);
                    }
                    ah.a(fVar.t, kVar.g);
                    if (com.sankuai.waimai.foundation.utils.b.b(kVar.j)) {
                        fVar.u.setVisibility(8);
                        return;
                    } else {
                        fVar.a(fVar.u, kVar.j, 2);
                        return;
                    }
                }
            case 5:
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.sa.ui.assistant.chat.f.a;
                if (PatchProxy.isSupport(objArr8, fVar, changeQuickRedirect8, false, "b80d9882d0c8c342a63cb964e958c2c7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, fVar, changeQuickRedirect8, false, "b80d9882d0c8c342a63cb964e958c2c7");
                    return;
                } else if (fVar.A == null || fVar.A.j == null || fVar.A.j.size() <= fVar.B) {
                    return;
                } else {
                    fVar.a(fVar.A.j.get(fVar.B));
                    return;
                }
            default:
                return;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c39e81a21fcfeb07a025e53ad8350af", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c39e81a21fcfeb07a025e53ad8350af")).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        int a2 = a();
        if (a2 == 5) {
            if (this.b.j == null) {
                return 0;
            }
            return this.b.j.size();
        } else if (a2 == 7) {
            if (this.b.p == null) {
                return 0;
            }
            return this.b.p.size();
        } else {
            switch (a2) {
                case -10:
                case -9:
                    if (this.b.k == null || this.b.k.b == null) {
                        return 0;
                    }
                    return this.b.k.b.size();
                default:
                    switch (a2) {
                        case 0:
                            return 0;
                        case 1:
                            if (this.b.g == null) {
                                return 0;
                            }
                            return this.b.g.size();
                        case 2:
                            if (this.b.i == null) {
                                return 0;
                            }
                            return this.b.i.size();
                        case 3:
                            return 0;
                        default:
                            return 0;
                    }
            }
        }
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.adapter.g, android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e441c7770c0e107519cfb9a876de1af2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e441c7770c0e107519cfb9a876de1af2")).intValue() : a();
    }

    private int a() {
        if (this.b == null) {
            return 0;
        }
        int i = this.b.a;
        if (i != 6 || this.b.k == null) {
            return i;
        }
        switch (this.b.k.a) {
            case 3:
                return -9;
            case 4:
                return -10;
            default:
                return i;
        }
    }
}
