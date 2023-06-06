package com.sankuai.waimai.store.consultation;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.constants.ShopConstants;
import com.sankuai.waimai.store.im.base.j;
import com.sankuai.waimai.store.im.entrance.drug.view.b;
import com.sankuai.waimai.store.platform.domain.core.im.DrugImEntranceEntity;
import com.sankuai.waimai.store.poilist.PoiListIconAnim;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    String b;
    public com.sankuai.waimai.store.im.entrance.drug.a c;
    public RecyclerView.k d;
    private Activity e;
    private String f;
    private String g;
    private PoiListIconAnim h;
    private boolean i;
    private boolean j;

    public a(@NonNull Activity activity, String str, String str2, String str3) {
        Object[] objArr = {activity, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fddd5c81556a9a74f449d41e987f7908", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fddd5c81556a9a74f449d41e987f7908");
            return;
        }
        this.b = "";
        this.f = "";
        this.i = true;
        this.j = false;
        this.d = new RecyclerView.k() { // from class: com.sankuai.waimai.store.consultation.a.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e713d47a6c986e82cd53c30c7680f590", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e713d47a6c986e82cd53c30c7680f590");
                } else if (i == 0) {
                    a.this.b();
                } else if (i == 1) {
                    a.this.a();
                }
            }
        };
        this.e = activity;
        this.g = str;
        if (str2 != null) {
            this.b = str2;
        }
        this.f = str3;
    }

    public final void a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c16a527a1053791d126e6ba54cb7b32b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c16a527a1053791d126e6ba54cb7b32b");
        } else if (viewGroup == null) {
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            this.c = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eae604e29d5d2b5909d3ff53a1a1d2ee", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.im.entrance.drug.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eae604e29d5d2b5909d3ff53a1a1d2ee") : new b(this.e, this.g, this.b, this.f, new j() { // from class: com.sankuai.waimai.store.consultation.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.im.base.j
                public final void a(Object obj, int i, Map<String, Object> map) {
                    Object[] objArr3 = {obj, 0, map};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ff3a7bd68dfe7ac886466f4a096d2ec7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ff3a7bd68dfe7ac886466f4a096d2ec7");
                    } else {
                        com.sankuai.waimai.store.manager.judas.b.b(a.this.b, ShopConstants.ImSource.a).b(map).a();
                    }
                }

                @Override // com.sankuai.waimai.store.im.base.j
                public final void a(Map<String, Object> map) {
                    Object[] objArr3 = {map};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "35f4b0d15bdd209d6300e4ef0e99f96e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "35f4b0d15bdd209d6300e4ef0e99f96e");
                    } else {
                        com.sankuai.waimai.store.manager.judas.b.a(a.this.b, ShopConstants.ImSource.b).b(map).a();
                    }
                }
            });
            this.c.d();
            this.c.a(viewGroup);
            if (this.c.b() != null) {
                this.h = new PoiListIconAnim(this.c.b(), this.e, this.e.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_48));
            } else {
                this.h = new PoiListIconAnim(viewGroup, this.e, this.e.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_48));
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa6c5d9ab55853d28098e254de83a034", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa6c5d9ab55853d28098e254de83a034");
        } else if (this.i || this.h == null) {
        } else {
            this.i = true;
            this.h.a();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1e0b0784556222e1514e7d70643ee65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1e0b0784556222e1514e7d70643ee65");
        } else if (!this.i || this.h == null) {
        } else {
            this.i = false;
            this.h.b();
        }
    }

    public final void a(@Nullable DrugImEntranceEntity drugImEntranceEntity, int i, long j, String str) {
        Object[] objArr = {drugImEntranceEntity, Integer.valueOf(i), new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7e7855858d2b60504806e1995a120d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7e7855858d2b60504806e1995a120d5");
        } else if (this.c != null) {
            this.j = this.c.a(drugImEntranceEntity, i, j, "", str);
            int a2 = this.c.a();
            if (a2 != 0) {
                this.h.e = a2;
            }
        }
    }
}
