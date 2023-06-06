package com.sankuai.waimai.store.goods.detail.components.subroot.quality;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.repository.model.DetailQualityAssurance;
import com.sankuai.waimai.store.ui.common.SCBaseDialog;
import com.sankuai.waimai.store.util.d;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.widgets.recycler.l;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGDetailQualityAssuranceDialog extends SCBaseDialog {
    public static ChangeQuickRedirect a;
    private a b;
    private String c;
    private String d;
    private String e;
    private TextView f;

    public SGDetailQualityAssuranceDialog(@NonNull Context context) {
        super(context, LayoutInflater.from(context).inflate(R.layout.wm_sc_dialog_quality_assurance, (ViewGroup) null), R.style.WmStBaseDialogTheme);
        WindowManager.LayoutParams attributes;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "608885201001299f170c5fc7c9617895", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "608885201001299f170c5fc7c9617895");
            return;
        }
        Window window = getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            attributes.width = -1;
            attributes.height = -2;
            attributes.gravity = 80;
            window.setAttributes(attributes);
        }
        setCanceledOnTouchOutside(true);
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d7de07d2d4ff5777cedee2e43b6cf10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d7de07d2d4ff5777cedee2e43b6cf10");
            return;
        }
        super.a(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = h.a(bB_(), 520.0f);
            view.setLayoutParams(layoutParams);
        }
        this.f = (TextView) c(R.id.tv_title);
        c(R.id.ll_dialog_container).setBackground(new e.a().c(com.sankuai.waimai.store.util.b.b(getContext(), R.color.white)).a(h.a(bB_(), 12.0f), h.a(bB_(), 12.0f), 0.0f, 0.0f).a());
        c(R.id.iv_close_icon).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.quality.SGDetailQualityAssuranceDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b21284934e40c5534a9209474fc427e7", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b21284934e40c5534a9209474fc427e7");
                } else {
                    d.a(SGDetailQualityAssuranceDialog.this);
                }
            }
        });
        RecyclerView recyclerView = (RecyclerView) c(R.id.rv_service_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new b());
        this.b = new a();
        recyclerView.setAdapter(new l(this.b));
    }

    public final void a(List<DetailQualityAssurance.DialogItem> list, String str, String str2, String str3) {
        Object[] objArr = {list, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "922ec28785914c14a21d862694c3d1b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "922ec28785914c14a21d862694c3d1b8");
            return;
        }
        this.b.a(list);
        this.e = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog, android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12affde68c3094c9d39cacb11ce90c7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12affde68c3094c9d39cacb11ce90c7b");
            return;
        }
        super.show();
        com.sankuai.waimai.store.manager.judas.b.b(getContext(), "b_waimai_sg_cx7b0kun_mv").a("stid", this.e == null ? "" : this.e).a("poi_id", TextUtils.isEmpty(this.c) ? -999 : this.c).a("spu_id", TextUtils.isEmpty(this.d) ? -999 : this.d).a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends com.sankuai.waimai.store.widgets.recycler.a<c> {
        public static ChangeQuickRedirect a;
        private List<DetailQualityAssurance.DialogItem> c;

        @Override // com.sankuai.waimai.store.widgets.recycler.a
        public final int a(int i) {
            return 0;
        }

        public a() {
            Object[] objArr = {SGDetailQualityAssuranceDialog.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0700f8fbc155bde835d600e417f1f101", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0700f8fbc155bde835d600e417f1f101");
            }
        }

        @Override // com.sankuai.waimai.store.widgets.recycler.a
        public final /* synthetic */ void a(c cVar, int i) {
            c cVar2 = cVar;
            Object[] objArr = {cVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6882c72fad292000cba534b5ecc122a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6882c72fad292000cba534b5ecc122a");
                return;
            }
            DetailQualityAssurance.DialogItem dialogItem = (DetailQualityAssurance.DialogItem) com.sankuai.shangou.stone.util.a.a((List<Object>) this.c, i);
            if (dialogItem != null) {
                m.a(dialogItem.icon, ImageQualityUtil.a()).a(cVar2.a);
                cVar2.b.setText(dialogItem.labelName);
                StringBuilder sb = new StringBuilder();
                int a2 = com.sankuai.shangou.stone.util.a.a((List) dialogItem.labelDescList);
                if (com.sankuai.shangou.stone.util.a.a((Collection<?>) dialogItem.labelDescList)) {
                    for (int i2 = 0; i2 < a2; i2++) {
                        sb.append((String) com.sankuai.shangou.stone.util.a.a((List<Object>) dialogItem.labelDescList, i2));
                        if (i2 < a2 - 1) {
                            sb.append("\n");
                        }
                    }
                }
                cVar2.c.setText(sb.toString());
            }
        }

        public final void a(List<DetailQualityAssurance.DialogItem> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d8f1e9fd30b5ddbee413f0b91bb6520", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d8f1e9fd30b5ddbee413f0b91bb6520");
                return;
            }
            this.c = list;
            m();
        }

        @Override // com.sankuai.waimai.store.widgets.recycler.a
        public final int a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7574300dd28ad8c8153302e18d0779cf", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7574300dd28ad8c8153302e18d0779cf")).intValue();
            }
            if (this.c == null) {
                return 0;
            }
            return this.c.size();
        }

        @Override // com.sankuai.waimai.store.widgets.recycler.a
        public final com.sankuai.waimai.store.widgets.recycler.e a(ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67c381bfd55a95dc1e3526ba11e2521d", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.widgets.recycler.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67c381bfd55a95dc1e3526ba11e2521d") : new c(LayoutInflater.from(SGDetailQualityAssuranceDialog.this.bB_()).inflate(R.layout.wm_sc_dialog_quality_assurance_item, viewGroup, false));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class c extends com.sankuai.waimai.store.widgets.recycler.e {
        public ImageView a;
        public TextView b;
        public TextView c;

        public c(View view) {
            super(view);
            this.a = (ImageView) view.findViewById(R.id.iv_quality_dialog_item_icon);
            this.b = (TextView) view.findViewById(R.id.iv_quality_dialog_item_title);
            this.c = (TextView) view.findViewById(R.id.iv_quality_dialog_item_content);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b extends RecyclerView.f {
        public static ChangeQuickRedirect a;

        private b() {
            Object[] objArr = {SGDetailQualityAssuranceDialog.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c54567c618a5f2162fabd729bd4e8331", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c54567c618a5f2162fabd729bd4e8331");
            }
        }

        @Override // android.support.v7.widget.RecyclerView.f
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            Object[] objArr = {rect, view, recyclerView, state};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fce4c571b6be1d9a9bc83b62cba3de6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fce4c571b6be1d9a9bc83b62cba3de6");
                return;
            }
            super.getItemOffsets(rect, view, recyclerView, state);
            rect.bottom = h.a(SGDetailQualityAssuranceDialog.this.bB_(), 20.0f);
        }
    }
}
