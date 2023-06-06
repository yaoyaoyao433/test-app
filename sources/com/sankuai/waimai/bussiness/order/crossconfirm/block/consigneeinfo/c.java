package com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.addrsdk.constants.AddressScene;
import com.sankuai.waimai.bussiness.order.base.adapter.b;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.core.location.AddressCategory;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.domain.manager.location.geo.UserAddressAPI;
import com.sankuai.waimai.platform.domain.manager.location.model.SaveCategoryResponse;
import com.sankuai.waimai.platform.utils.sharedpreference.PlatformSPKeys;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    private TextView A;
    private LinearLayout B;
    private TextView C;
    private View D;
    private LinearLayout E;
    private com.sankuai.waimai.bussiness.order.crossconfirm.a F;
    AddressItem e;
    long f;
    int g;
    LinearLayout h;
    com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.b i;
    public com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c j;
    RelativeLayout k;
    AddressItem l;
    d m;
    LinearLayout n;
    HashMap<String, Object> o;
    boolean p;
    String q;
    Activity r;
    String s;
    boolean t;
    a u;
    boolean v;
    b w;
    private RecyclerView x;
    private TextView y;
    private ImageView z;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(int i, boolean z, boolean z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void a();
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_layout_mt_deliver_address;
    }

    public static /* synthetic */ void a(c cVar, int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "12e440c71212dabc9280495b691d807c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "12e440c71212dabc9280495b691d807c");
        } else if (i2 == 1 && cVar.l != null) {
            JudasManualManager.a("b_eOtfh").a("c_ykhs39e").a("edit_address", i).a("address_status", i2).a("stid", cVar.l.abStrategy).a("address_reason", cVar.l.addressTipReason).a("address_top", 1).a(cVar.c).a();
        } else if (cVar.e != null && cVar.e.addrBrief != null) {
            JudasManualManager.a("b_eOtfh").a("c_ykhs39e").a("edit_address", i).a("address_status", i2).a("stid", cVar.e.abStrategy).a("address_reason", cVar.e.addressTipReason).a("address_top", 1).a(cVar.c).a();
        } else if (cVar.l != null && cVar.e != null) {
            JudasManualManager.a("b_eOtfh").a("c_ykhs39e").a("edit_address", i).a("address_status", i2).a("stid", cVar.l.abStrategy).a("address_reason", cVar.l.addressTipReason).a("address_top", 1).a(cVar.c).a();
        } else {
            JudasManualManager.a("b_eOtfh").a("c_ykhs39e").a("edit_address", i).a("address_status", i2).a("address_top", 1).a(cVar.c).a();
        }
    }

    public static /* synthetic */ void a(c cVar, final long j, final int i, int i2) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "eec0cf8db27cf02677b3ba408bbf74b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "eec0cf8db27cf02677b3ba408bbf74b5");
            return;
        }
        ((BaseActivity) cVar.r).u();
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((UserAddressAPI) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) UserAddressAPI.class)).saveCategory(j, i, i2), new b.AbstractC1042b<SaveCategoryResponse>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.c.12
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                SaveCategoryResponse saveCategoryResponse = (SaveCategoryResponse) obj;
                Object[] objArr2 = {saveCategoryResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "465b28e7a2bfd869f765e0a1e692123d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "465b28e7a2bfd869f765e0a1e692123d");
                } else if (c.this.r.isFinishing()) {
                } else {
                    ((BaseActivity) c.this.r).v();
                    if (saveCategoryResponse != null) {
                        if (saveCategoryResponse.b == 2) {
                            com.sankuai.waimai.bussiness.order.base.utils.e.a(c.this.r, R.string.confirm, R.string.wm_order_confirm_address_dialog_btn_cancel, saveCategoryResponse, new com.sankuai.waimai.bussiness.order.base.utils.d() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.c.12.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.bussiness.order.base.utils.d
                                public final void a() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "64b05628035bd85057dba5db6ca58661", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "64b05628035bd85057dba5db6ca58661");
                                        return;
                                    }
                                    JudasManualManager.a("b_27Z6u").a("c_ykhs39e").a(c.this.c).a();
                                    c.a(c.this, j, i, 1);
                                }

                                @Override // com.sankuai.waimai.bussiness.order.base.utils.d
                                public final void cancel() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "47cedbdb0c96ca04bd5fd7cc9946c8eb", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "47cedbdb0c96ca04bd5fd7cc9946c8eb");
                                    } else {
                                        JudasManualManager.a("b_8k9S9").a("c_ykhs39e").a(c.this.c).a();
                                    }
                                }

                                @Override // com.sankuai.waimai.bussiness.order.base.utils.d
                                public final void b() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "be809acdaa6c494120980f2d305f1122", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "be809acdaa6c494120980f2d305f1122");
                                    } else {
                                        JudasManualManager.b("b_BHMKt").a("c_ykhs39e").a(c.this.c).a();
                                    }
                                }
                            });
                        }
                        if (!TextUtils.isEmpty(saveCategoryResponse.d)) {
                            c.this.i.a(saveCategoryResponse.d);
                        }
                    }
                    c.this.k.setVisibility(8);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c117c0e0334a6af730f352ca86cb18bb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c117c0e0334a6af730f352ca86cb18bb");
                    return;
                }
                c cVar2 = c.this;
                String string = c.this.r.getResources().getString(R.string.wm_order_base_net_error_toast);
                Object[] objArr3 = {string};
                ChangeQuickRedirect changeQuickRedirect3 = c.d;
                if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "dadf91dd32764031798a508703d7a6e8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "dadf91dd32764031798a508703d7a6e8");
                } else {
                    ae.a(cVar2.r, string);
                }
                ((BaseActivity) c.this.r).v();
            }
        }, null);
    }

    public static /* synthetic */ void e(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "7b061a40b0ceb77ce8098384a96e3ef3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "7b061a40b0ceb77ce8098384a96e3ef3");
        } else if (cVar.e != null) {
            JudasManualManager.b("b_xkufrrb5").a("c_ykhs39e").a("poi_id", i.a(cVar.e(), cVar.f())).a("stid", cVar.e.abStrategy).a("address_reason", cVar.e.addressTipReason).a(cVar.c).a();
        }
    }

    public static /* synthetic */ void i(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "9a221323111765e0d301c302abbb453a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "9a221323111765e0d301c302abbb453a");
            return;
        }
        cVar.t = false;
        if (cVar.w != null) {
            cVar.w.a();
        }
    }

    public c(Context context, com.sankuai.waimai.bussiness.order.crossconfirm.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4267736568e14b36a3f16eeba0f080ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4267736568e14b36a3f16eeba0f080ff");
            return;
        }
        this.f = -1L;
        this.g = 0;
        this.o = new HashMap<>();
        this.p = false;
        this.t = true;
        this.v = false;
        this.r = (Activity) context;
        this.F = aVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4fa8a4448c95817cd8a7468c5deb2f75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4fa8a4448c95817cd8a7468c5deb2f75");
        } else {
            this.h = (LinearLayout) this.b.findViewById(R.id.layout_cur_address);
            this.n = (LinearLayout) this.b.findViewById(R.id.layout_address_indicator);
            this.E = (LinearLayout) this.b.findViewById(R.id.order_confirm_address_container);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = d;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "05f812a712a84aa4b37891b75b2b90f1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "05f812a712a84aa4b37891b75b2b90f1");
            } else {
                this.B = (LinearLayout) this.b.findViewById(R.id.txt_empty_address_indicator_ll);
                this.A = (TextView) this.b.findViewById(R.id.txt_empty_address_indicator);
                this.C = (TextView) this.b.findViewById(R.id.txt_new_address_indicator);
                this.D = this.b.findViewById(R.id.layout_address_empty_tip);
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = d;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "43730e2f8310ab89cbd7c03855b3b808", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "43730e2f8310ab89cbd7c03855b3b808");
        } else {
            this.i = new com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.b(this.r, a());
            this.j = new com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c(this.r, e(), f(), null);
            this.x = (RecyclerView) this.b.findViewById(R.id.recyclerView_label);
            this.z = (ImageView) this.b.findViewById(R.id.img_close);
            this.k = (RelativeLayout) this.b.findViewById(R.id.ll_order_confirm_label);
            this.y = (TextView) this.b.findViewById(R.id.txt_guide);
            this.x.setLayoutManager(new LinearLayoutManager(this.r, 0, false));
            this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.c.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr5 = {view};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d968694e517a510d26999b5d9d8ab0c7", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d968694e517a510d26999b5d9d8ab0c7");
                        return;
                    }
                    c.this.a(c.this.f, 1);
                    c.a(c.this, 2, 0);
                    c.this.e = com.sankuai.waimai.platform.domain.manager.location.a.a(c.this.r);
                    if (c.this.e != null) {
                        JudasManualManager.a("b_Cuvkr").a("is_recommend", c.this.e.recommendType).a("poi_id", i.a(c.this.e(), c.this.f())).a("c_ykhs39e").a(c.this.c).a();
                    }
                }
            });
            this.z.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.c.6
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr5 = {view};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "c65b6890ce9cd074a22187624c9df944", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "c65b6890ce9cd074a22187624c9df944");
                        return;
                    }
                    com.sankuai.waimai.platform.utils.sharedpreference.a.a(c.this.f, com.sankuai.waimai.platform.utils.sharedpreference.a.a(c.this.f, 0) + 1, 0);
                    JudasManualManager.a("b_tudtucg9").a("c_ykhs39e").a(c.this.c).a();
                    c.this.k.setVisibility(8);
                }
            });
        }
        this.E.setBackground(context.getResources().getDrawable(R.drawable.wm_order_confirm_base_shape_bg));
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e5cfacc66a3b9f780142d7f0f6a4d2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e5cfacc66a3b9f780142d7f0f6a4d2a");
        } else {
            super.b();
        }
    }

    public final void a(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bac4a8d9fad8318d15a8c780da2b63da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bac4a8d9fad8318d15a8c780da2b63da");
            return;
        }
        switch (i) {
            case 0:
                this.j.a(j);
                break;
            case 1:
            case 2:
                this.j.a(this.f);
                break;
        }
        this.j.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e71487383018b59bed0df51388ec95de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e71487383018b59bed0df51388ec95de");
            return;
        }
        b(dVar);
        if (TextUtils.isEmpty(this.l.categoryIcon)) {
            int j = com.sankuai.waimai.platform.b.A().j();
            if (j > com.sankuai.waimai.platform.utils.sharedpreference.a.a().b((com.sankuai.waimai.foundation.utils.e) PlatformSPKeys.OLD_VERSION, 0)) {
                com.sankuai.waimai.platform.utils.sharedpreference.a.a().b(PlatformSPKeys.WM_ORDER_CONFIRM_LABEL_COUNT);
                com.sankuai.waimai.platform.utils.sharedpreference.a.a().a((com.sankuai.waimai.foundation.utils.e) PlatformSPKeys.OLD_VERSION, j);
            }
            int a2 = com.sankuai.waimai.platform.utils.sharedpreference.a.a(this.f, 0);
            if (this.l.categories == null || this.l.categories.size() == 0 || a2 > 0) {
                this.k.setVisibility(8);
            } else {
                this.y.setText(this.l.guideText);
                final com.sankuai.waimai.bussiness.order.base.adapter.b bVar = new com.sankuai.waimai.bussiness.order.base.adapter.b(this.r, this.l.categories);
                this.x.setAdapter(bVar);
                bVar.b = new com.sankuai.waimai.bussiness.order.base.adapter.c() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.c.7
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.bussiness.order.base.adapter.c
                    public final void a(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82a62a094234fd7e52c062693c9ba3af", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82a62a094234fd7e52c062693c9ba3af");
                            return;
                        }
                        com.sankuai.waimai.bussiness.order.base.adapter.b bVar2 = bVar;
                        int adapterPosition = ((b.a) view.getTag()).getAdapterPosition();
                        Object[] objArr3 = {Integer.valueOf(adapterPosition)};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.base.adapter.b.a;
                        if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "d66c831f28d01f474755e4f0ccc5461e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "d66c831f28d01f474755e4f0ccc5461e");
                        } else {
                            bVar2.c = adapterPosition;
                            bVar2.notifyDataSetChanged();
                        }
                        int i = bVar.c;
                        if (i < 0 || i >= c.this.l.categories.size()) {
                            return;
                        }
                        AddressCategory addressCategory = c.this.l.categories.get(i);
                        c.this.o.put("address_type", Integer.valueOf(addressCategory.category));
                        JudasManualManager.a("b_fjam5lnd").a("c_ykhs39e").a((Map<String, Object>) c.this.o).a(c.this.c).a();
                        if (c.this.l != null) {
                            c.a(c.this, c.this.l.id, addressCategory.category, 0);
                        }
                    }
                };
                JudasManualManager.b("b_cxkzektj").a("c_ykhs39e").a(this.c).a();
                this.k.setVisibility(0);
            }
        } else {
            this.k.setVisibility(8);
        }
        this.v = false;
    }

    private void b(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2138fcff36e1fed97fadb92eecc5165d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2138fcff36e1fed97fadb92eecc5165d");
            return;
        }
        this.l = dVar.c;
        int i = dVar.d;
        if (i == 3) {
            this.p = true;
        } else {
            this.p = false;
        }
        if (this.v) {
            com.sankuai.waimai.platform.domain.manager.location.a.b(this.r, this.e);
        } else if (i != 3) {
            com.sankuai.waimai.platform.domain.manager.location.a.b(this.r, this.l);
        }
        switch (i) {
            case 0:
                c(dVar);
                break;
            case 1:
                a(this.l, true);
                break;
            case 2:
                i();
                break;
            case 3:
                j();
                break;
        }
        this.e = this.e;
    }

    private void a(AddressItem addressItem, boolean z) {
        Object[] objArr = {addressItem, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa07a91af9aa936e40f3d3f9f3c43117", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa07a91af9aa936e40f3d3f9f3c43117");
            return;
        }
        this.D.setVisibility(8);
        if (addressItem == null || addressItem.addrBrief == null) {
            return;
        }
        this.f = addressItem.id;
        this.e = addressItem;
        this.n.setVisibility(8);
        this.h.setVisibility(0);
        this.i.a(addressItem, true, z);
        this.q = this.i.a();
        this.s = addressItem.phone;
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "471ea0bb831ff4788dd0bf3c1d57bf6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "471ea0bb831ff4788dd0bf3c1d57bf6e");
            return;
        }
        this.f = -1L;
        this.e = null;
        this.h.setVisibility(8);
        this.A.setText(this.r.getString(R.string.wm_order_confirm_choose_delivery_address));
        this.q = this.r.getString(R.string.wm_order_confirm_choose_delivery_address);
        this.C.setVisibility(8);
        this.B.setVisibility(0);
        this.n.setVisibility(0);
        this.D.setVisibility(8);
        this.i.a(false);
        this.n.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.c.8
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3293d8d3a424433ff89a428f42578d8f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3293d8d3a424433ff89a428f42578d8f");
                    return;
                }
                c.this.a(c.this.f, 1);
                c.a(c.this, 2, 2);
            }
        });
    }

    private void c(final d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1be3e8a4959c0449ac9d453bbaa7748c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1be3e8a4959c0449ac9d453bbaa7748c");
            return;
        }
        this.f = -1L;
        this.e = null;
        this.h.setVisibility(8);
        this.C.setText(this.r.getString(R.string.wm_order_confirm_add_delivery_address));
        this.C.setVisibility(0);
        this.B.setVisibility(8);
        this.q = this.r.getString(R.string.wm_order_confirm_add_delivery_address);
        this.n.setVisibility(0);
        this.D.setVisibility(8);
        this.i.a(false);
        this.n.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.c.9
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ccc624c4ca9ce2c7793a13813ae15bd", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ccc624c4ca9ce2c7793a13813ae15bd");
                    return;
                }
                com.sankuai.waimai.bussiness.order.base.a.a(c.this.r, dVar.a, dVar.b, c.this.g());
                c.a(c.this, 1, 2);
                if (dVar.c != null) {
                    JudasManualManager.a("b_Cuvkr").a("is_recommend", dVar.c.recommendType).a("poi_id", i.a(dVar.a, dVar.b)).a("c_ykhs39e").a(c.this.c).a();
                }
            }
        });
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dc568211bd7ed9b97f37217647e447d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dc568211bd7ed9b97f37217647e447d");
            return;
        }
        this.h.setVisibility(8);
        this.A.setText(this.r.getString(R.string.wm_order_confirm_choose_delivery_address));
        this.C.setVisibility(8);
        this.B.setVisibility(0);
        this.q = this.r.getString(R.string.wm_order_confirm_choose_delivery_address);
        this.n.setVisibility(0);
        this.n.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.c.10
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14f8507415d9278b7784f5ac8bf69396", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14f8507415d9278b7784f5ac8bf69396");
                    return;
                }
                c.this.a(-1L, 1);
                c.a(c.this, 2, 1);
            }
        });
        if (this.l != null && this.l.addrBrief != null) {
            this.D.setVisibility(0);
            this.i.a(this.l);
        } else {
            this.i.a(false);
            this.D.setVisibility(8);
        }
        this.D.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.c.11
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "404fe4d995aabe4f543a2e23a9c46a66", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "404fe4d995aabe4f543a2e23a9c46a66");
                    return;
                }
                if (c.this.l != null && c.this.l.addrBrief != null) {
                    c.this.a(c.this.l);
                }
                c.e(c.this);
            }
        });
    }

    public final void a(AddressItem addressItem) {
        Object[] objArr = {addressItem};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79b298c8b9173df7066cb5982d5801ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79b298c8b9173df7066cb5982d5801ab");
        } else if (addressItem == null || addressItem.addrBrief == null) {
        } else {
            this.p = false;
            com.sankuai.waimai.platform.domain.manager.location.a.b(this.r, addressItem);
            a(addressItem, false);
            this.e = addressItem;
            this.u.a(this.g, true, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34fb9de8d55cf4987d38e4ea9673cfa3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34fb9de8d55cf4987d38e4ea9673cfa3");
        }
        switch (i) {
            case 0:
                return c(R.string.wm_order_confirm_still_order);
            case 1:
                return c(R.string.wm_order_confirm_go_to_map);
            case 2:
                return c(R.string.wm_order_confirm_look_around);
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DialogInterface.OnClickListener b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "870e6c88c1715260e00f0f28f939e181", RobustBitConfig.DEFAULT_VALUE)) {
            return (DialogInterface.OnClickListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "870e6c88c1715260e00f0f28f939e181");
        }
        switch (i) {
            case 0:
                return new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.c.3
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ffe7e75fd85add442b6221ed105d862", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ffe7e75fd85add442b6221ed105d862");
                        } else {
                            c.i(c.this);
                        }
                    }
                };
            case 1:
                return new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.c.4
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6397463a04d07c6ee9ca4f467790b753", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6397463a04d07c6ee9ca4f467790b753");
                        } else {
                            com.sankuai.waimai.bussiness.order.base.a.a(c.this.r, AddressScene.DEFAULT_SCENE, c.this.e, c.this.e(), c.this.f(), c.this.g());
                        }
                    }
                };
            case 2:
                return new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.c.5
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7346dd4fe4f77b27e93a3556136e324c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7346dd4fe4f77b27e93a3556136e324c");
                            return;
                        }
                        c cVar = c.this;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = c.d;
                        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "faa4e8289d119e11d415dbb0fdc7e29d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "faa4e8289d119e11d415dbb0fdc7e29d");
                            return;
                        }
                        com.sankuai.waimai.platform.domain.manager.location.a.b(cVar.r, cVar.e);
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = c.d;
                        if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "716dad7314d965f93cf24264b685e87e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "716dad7314d965f93cf24264b685e87e");
                        } else {
                            com.sankuai.waimai.bussiness.order.base.a.a(cVar.r, cVar.e(), cVar.f());
                        }
                    }
                };
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83eebbd36d94d36084fefc458694e368", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83eebbd36d94d36084fefc458694e368") : this.r.getString(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long e() {
        if (this.m != null) {
            return this.m.a;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String f() {
        return this.m != null ? this.m.b : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Long> g() {
        if (this.m != null) {
            return this.m.e;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<String> h() {
        if (this.m != null) {
            return this.m.f;
        }
        return null;
    }
}
