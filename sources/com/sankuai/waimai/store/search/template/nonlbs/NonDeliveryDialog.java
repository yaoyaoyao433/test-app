package com.sankuai.waimai.store.search.template.nonlbs;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.search.model.Poi;
import com.sankuai.waimai.store.search.model.j;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.util.am;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NonDeliveryDialog extends Dialog {
    public static ChangeQuickRedirect a;
    private long b;
    private int c;
    private int d;
    private String e;
    private int f;
    private String g;
    private int h;
    private SearchShareData i;
    private List<Poi> j;
    private boolean k;
    private RecyclerView l;
    private a m;
    private String n;

    public static /* synthetic */ void a(NonDeliveryDialog nonDeliveryDialog, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, nonDeliveryDialog, changeQuickRedirect, false, "bec99d7b579d73244f96a7e76b8bb067", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, nonDeliveryDialog, changeQuickRedirect, false, "bec99d7b579d73244f96a7e76b8bb067");
        } else {
            com.sankuai.waimai.store.search.common.api.net.a.a(nonDeliveryDialog.n).a(nonDeliveryDialog.b, nonDeliveryDialog.c, nonDeliveryDialog.d, nonDeliveryDialog.e, nonDeliveryDialog.f, i, 20, 0, new k<j>() { // from class: com.sankuai.waimai.store.search.template.nonlbs.NonDeliveryDialog.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    j jVar = (j) obj;
                    Object[] objArr2 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ad94a185da1ba6bc1b3806b6ecabf90", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ad94a185da1ba6bc1b3806b6ecabf90");
                        return;
                    }
                    NonDeliveryDialog.this.j.addAll(jVar.b);
                    NonDeliveryDialog.this.c();
                    NonDeliveryDialog.this.k = jVar.a;
                    NonDeliveryDialog.this.m.a(NonDeliveryDialog.this.j);
                    NonDeliveryDialog.this.m.notifyDataSetChanged();
                    if (NonDeliveryDialog.this.k) {
                        NonDeliveryDialog.this.a();
                    } else {
                        NonDeliveryDialog.this.b();
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "88ae163b008ed4329f0cfd067cac5b4a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "88ae163b008ed4329f0cfd067cac5b4a");
                        return;
                    }
                    NonDeliveryDialog.this.b();
                    am.a(NonDeliveryDialog.this.getContext(), (int) R.string.wm_sc_search_api_fail_text);
                }
            });
        }
    }

    public static /* synthetic */ int b(NonDeliveryDialog nonDeliveryDialog) {
        int i = nonDeliveryDialog.h;
        nonDeliveryDialog.h = i + 1;
        return i;
    }

    public NonDeliveryDialog(@NonNull Context context, SearchShareData searchShareData, List<Poi> list, boolean z) {
        super(context);
        Object[] objArr = {context, searchShareData, list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5acd86357cdcbab905e9d75b0d3cfe98", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5acd86357cdcbab905e9d75b0d3cfe98");
            return;
        }
        this.b = searchShareData.y;
        this.c = searchShareData.z;
        this.d = searchShareData.B;
        this.e = searchShareData.h;
        this.f = searchShareData.n;
        this.g = searchShareData.bp;
        this.i = searchShareData;
        this.h = 1;
        this.k = z;
        this.j = new ArrayList();
        this.j.clear();
        this.j.addAll(list);
        this.n = getClass().getSimpleName() + System.currentTimeMillis();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a22e0a0686841e461ce3a28610d9e2e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a22e0a0686841e461ce3a28610d9e2e2");
            return;
        }
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.wm_sc_nox_search_global_poi_v732_non_delivery_dialog);
        this.l = (RecyclerView) findViewById(R.id.non_delivery_list);
        setCanceledOnTouchOutside(true);
        c();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        this.l.setLayoutManager(linearLayoutManager);
        this.m = new a(this.i);
        this.m.a(this.j);
        this.l.setAdapter(this.m);
        this.l.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.store.search.template.nonlbs.NonDeliveryDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1966431fd32adaffe70a96a60bd1b13e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1966431fd32adaffe70a96a60bd1b13e");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0 && NonDeliveryDialog.this.k) {
                    LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) recyclerView.getLayoutManager();
                    if (linearLayoutManager2.getItemCount() - linearLayoutManager2.findLastVisibleItemPosition() <= 2) {
                        NonDeliveryDialog.b(NonDeliveryDialog.this);
                        NonDeliveryDialog.this.a();
                        NonDeliveryDialog.a(NonDeliveryDialog.this, NonDeliveryDialog.this.h);
                    }
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "481a6452a8db7bf1cf2aa0c0cff69878", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "481a6452a8db7bf1cf2aa0c0cff69878");
                } else {
                    super.onScrolled(recyclerView, i, i2);
                }
            }
        });
        if (this.k) {
            a();
        } else {
            b();
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f359aab2868b607243bf5a7c82eacfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f359aab2868b607243bf5a7c82eacfc");
            return;
        }
        super.show();
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(17170445);
            window.setGravity(48);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = g.a(getContext());
            attributes.y = i - g.e(getContext());
            getWindow().setAttributes(attributes);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e6ad0d6b49e88df281d0141e973a512", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e6ad0d6b49e88df281d0141e973a512");
            return;
        }
        super.dismiss();
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94a79a709757d4b390f1c972d70f58cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94a79a709757d4b390f1c972d70f58cc");
        } else {
            this.m.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ab07808bdf12f1fb2bd19bb44a6d2d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ab07808bdf12f1fb2bd19bb44a6d2d9");
        } else {
            this.m.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59e511c8ef8bbca826f530612290ce40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59e511c8ef8bbca826f530612290ce40");
            return;
        }
        int a2 = a(this.j);
        int b = (int) (g.b(getContext()) * 0.6d);
        if (a2 > b) {
            ViewGroup.LayoutParams layoutParams = this.l.getLayoutParams();
            layoutParams.height = b;
            this.l.setLayoutParams(layoutParams);
        }
    }

    private int a(List<Poi> list) {
        int i = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51fa718f0375e3f95cbdbe0737648b9c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51fa718f0375e3f95cbdbe0737648b9c")).intValue();
        }
        int a2 = g.a(getContext(), 44.0f);
        int a3 = g.a(getContext(), 49.0f);
        for (Poi poi : list) {
            if (poi != null) {
                i = TextUtils.isEmpty(poi.nonDeliveryReason) ? i + a2 : i + a3;
            }
        }
        return i;
    }
}
