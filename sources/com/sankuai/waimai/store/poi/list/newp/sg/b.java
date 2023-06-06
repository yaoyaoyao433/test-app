package com.sankuai.waimai.store.poi.list.newp.sg;

import android.arch.lifecycle.q;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.assembler.component.PageEventHandler;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.sg.a;
import com.sankuai.waimai.store.repository.model.BaseTileNew;
import com.sankuai.waimai.store.repository.model.PoiUserSpuScrollKingKong;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.repository.model.PrimaryFilterCondList;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.poi.list.newp.sg.a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>> {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.store.param.a i;
    SCBaseActivity j;
    private FrameLayout k;
    private RecyclerView l;
    private a m;
    private int n;
    private boolean o;
    private String p;

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final int b() {
        return R.layout.wm_sc_channel_native_kingkong_container;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final /* synthetic */ void a(@NonNull @NotNull com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String> bVar) {
        com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String> bVar2 = bVar;
        Object[] objArr = {bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaa5bc5b6d70bc78272597722cee3bff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaa5bc5b6d70bc78272597722cee3bff");
            return;
        }
        BaseModuleDesc a2 = a(this, bVar2, this.f);
        PoiUserSpuScrollKingKong poiUserSpuScrollKingKong = (PoiUserSpuScrollKingKong) a2.bizJsonData;
        Object[] objArr2 = {poiUserSpuScrollKingKong, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4ba718f12133c71124721edd8813e1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4ba718f12133c71124721edd8813e1c");
        } else if (poiUserSpuScrollKingKong == null || com.sankuai.shangou.stone.util.a.b(poiUserSpuScrollKingKong.primaryFilterList)) {
            hide();
        } else {
            int i = 0;
            for (int i2 = 0; i2 < poiUserSpuScrollKingKong.primaryFilterList.size(); i2++) {
                i += poiUserSpuScrollKingKong.primaryFilterList.get(i2).graySwitch == 1 ? 0 : 1;
            }
            if (i >= 2) {
                show();
                a aVar = this.m;
                ArrayList<PrimaryFilterCondList> arrayList = poiUserSpuScrollKingKong.primaryFilterList;
                Object[] objArr3 = {arrayList};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "8580af45a74999a0e97265c0b162f716", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "8580af45a74999a0e97265c0b162f716");
                } else {
                    Iterator<PrimaryFilterCondList> it = arrayList.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        PrimaryFilterCondList next = it.next();
                        if (next.graySwitch != 1 || aVar.g.c == next.code) {
                            aVar.f.add(next);
                            Context context = aVar.b;
                            long j = next.code;
                            com.sankuai.waimai.store.param.a aVar2 = aVar.g;
                            Object[] objArr4 = {context, new Long(j), Integer.valueOf(i3), aVar2};
                            ChangeQuickRedirect changeQuickRedirect4 = a.a;
                            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "fce7ed7a8bcfacb361ca58c94ead1853", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "fce7ed7a8bcfacb361ca58c94ead1853");
                            } else {
                                HashMap hashMap = new HashMap();
                                hashMap.put("cat_id", Long.valueOf(j));
                                hashMap.put("index", Integer.valueOf(i3));
                                hashMap.put("stid", aVar2.T);
                                com.sankuai.waimai.store.manager.judas.b.b(context, "b_waimai_4kb1dtba_mv").b(hashMap).a();
                            }
                            i3++;
                        }
                    }
                    aVar.a(aVar.g.c);
                }
                a aVar3 = this.m;
                BaseTileNew.KingKongProps a22 = a2(bVar2);
                aVar3.h = a22.kingkongSelectedBgColorFrm;
                aVar3.i = a22.kingkongSelectedBgColorTo;
                this.m.notifyDataSetChanged();
            } else {
                hide();
            }
        }
        this.p = (a2 == null || a2.nativeId == null) ? "" : a2.nativeId;
    }

    public b(@NonNull SCBaseActivity sCBaseActivity, @NonNull @NotNull ViewGroup viewGroup, @NonNull @NotNull com.sankuai.waimai.store.param.a aVar) {
        super(viewGroup, aVar);
        Object[] objArr = {sCBaseActivity, viewGroup, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f44c30c6aba1c73eb9f2571ad5dd049", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f44c30c6aba1c73eb9f2571ad5dd049");
            return;
        }
        this.i = aVar;
        this.j = sCBaseActivity;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c530c304a730599d5a59eae29ed568c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c530c304a730599d5a59eae29ed568c");
            return;
        }
        super.onViewCreated();
        this.k = (FrameLayout) findView(R.id.native_kingkong_container);
        this.l = (RecyclerView) findView(R.id.native_kingkong_content);
        this.n = h.a(getContext(), 50.0f);
        this.m = new a(this.l, getContext(), this.i);
        this.m.d = new a.InterfaceC1281b() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.poi.list.newp.sg.b.a.InterfaceC1281b
            public final void a(View view, int i, long j) {
                Object[] objArr2 = {view, Integer.valueOf(i), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b91e0e2a8b2b4f4d90b3b8f7f7e02423", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b91e0e2a8b2b4f4d90b3b8f7f7e02423");
                    return;
                }
                ((PageEventHandler) q.a((FragmentActivity) b.this.j).a(PageEventHandler.class)).a((PageEventHandler) new com.sankuai.waimai.store.poi.list.refactor.event.b(j, i));
                b bVar = b.this;
                Context context = b.this.mContext;
                com.sankuai.waimai.store.param.a aVar = b.this.i;
                Object[] objArr3 = {context, aVar, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "dea5fcf488d5fc0a1021d3776f901cf9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "dea5fcf488d5fc0a1021d3776f901cf9");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("cat_id", Long.valueOf(aVar.c));
                hashMap.put("index", Integer.valueOf(i));
                hashMap.put("stid", aVar.T);
                com.sankuai.waimai.store.manager.judas.b.a(context, "b_waimai_xtlkgwpd_mc").b(hashMap).a();
            }
        };
        this.o = true;
        this.i.bv++;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final void a(@NonNull @NotNull a.C1279a c1279a) {
        Object[] objArr = {c1279a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59955c6147c8fe1333a57a4920b2a882", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59955c6147c8fe1333a57a4920b2a882");
            return;
        }
        int a2 = c1279a.a(getContext());
        int b = c1279a.b(getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
        if (a2 >= 0) {
            marginLayoutParams.topMargin = a2;
        }
        if (b >= 0) {
            marginLayoutParams.bottomMargin = b;
        }
        this.k.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private BaseTileNew.KingKongProps a2(com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b901ffaa11a78544b3748a22d3bb7460", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseTileNew.KingKongProps) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b901ffaa11a78544b3748a22d3bb7460");
        }
        if (bVar == null || bVar.a(0).blocks == null || bVar.a(0).blocks.bannerBlock == null) {
            return null;
        }
        for (int i = 0; i < bVar.a(0).blocks.bannerBlock.size(); i++) {
            BaseTileNew baseTileNew = (BaseTileNew) com.sankuai.shangou.stone.util.a.a((List<Object>) bVar.a(0).blocks.bannerBlock, i);
            if (baseTileNew != null && "sm_type_home_channel_kingkong".equals(baseTileNew.sType) && baseTileNew.propsData != 0) {
                return (BaseTileNew.KingKongProps) i.a(i.a(baseTileNew.propsData), new TypeToken<BaseTileNew.KingKongProps>() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.b.2
                }.getType());
            }
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends RecyclerView.a<RecyclerView.s> {
        public static ChangeQuickRedirect a;
        Context b;
        int c;
        InterfaceC1281b d;
        LinearLayoutManager e;
        ArrayList<PrimaryFilterCondList> f;
        com.sankuai.waimai.store.param.a g;
        String h;
        String i;

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.store.poi.list.newp.sg.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public interface InterfaceC1281b {
            void a(View view, int i, long j);
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final long getItemId(int i) {
            return i;
        }

        public a(RecyclerView recyclerView, Context context, com.sankuai.waimai.store.param.a aVar) {
            Object[] objArr = {recyclerView, context, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4330188ae766e207f3b25f8538cdbeb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4330188ae766e207f3b25f8538cdbeb");
                return;
            }
            this.f = new ArrayList<>();
            this.b = context;
            this.c = 0;
            this.g = aVar;
            this.e = new LinearLayoutManager(context, 0, false);
            recyclerView.setLayoutManager(this.e);
            recyclerView.setAdapter(this);
        }

        @Override // android.support.v7.widget.RecyclerView.a
        @NonNull
        public final RecyclerView.s onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee390342267ad5af2b31bbf89fe95235", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee390342267ad5af2b31bbf89fe95235") : new C1280a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.channel_native_kingkong_item_view, viewGroup, false));
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final void onBindViewHolder(@NonNull final RecyclerView.s sVar, int i) {
            Object[] objArr = {sVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e07b678e1d0e985bacdc6e6f006dbe7f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e07b678e1d0e985bacdc6e6f006dbe7f");
                return;
            }
            final int adapterPosition = sVar.getAdapterPosition();
            C1280a c1280a = (C1280a) sVar;
            c1280a.c.setText(this.f.get(adapterPosition).name);
            c1280a.c.setTextSize(12.0f);
            boolean z = this.c == adapterPosition;
            Drawable a2 = new e.a().a(h.a(this.b, 12.0f)).a(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{com.sankuai.shangou.stone.util.d.a(this.h, this.b.getResources().getColor(R.color.white)), com.sankuai.shangou.stone.util.d.a(this.i, this.b.getResources().getColor(R.color.black))}).a();
            TextView textView = c1280a.c;
            if (!z) {
                a2 = null;
            }
            textView.setBackground(a2);
            c1280a.c.setTextColor(com.sankuai.shangou.stone.util.d.a(z ? "#FFFFFF" : "#222426", -16777216));
            b.C0608b a3 = m.a(this.f.get(adapterPosition).getIconUrl(), h.a(this.b, 50.0f), h.a(this.b, 50.0f), ImageQualityUtil.a());
            a3.g = false;
            a3.a(c1280a.b);
            c1280a.a.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.b.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15c083df7dfac021311dd59b9231c816", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15c083df7dfac021311dd59b9231c816");
                    } else if (a.this.f.get(adapterPosition).graySwitch == 1) {
                        am.a(a.this.b, "暂无商品，敬请期待");
                    } else if (a.this.c != adapterPosition) {
                        a.this.c = adapterPosition;
                        a.this.e.scrollToPositionWithOffset(adapterPosition, (a.this.a() - 100) / 2);
                        a.this.notifyDataSetChanged();
                        if (a.this.d != null) {
                            a.this.d.a(((C1280a) sVar).a, adapterPosition, (int) a.this.f.get(adapterPosition).code);
                        }
                    }
                }
            });
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a9f974922938bd2d6c8195bfea73a0b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a9f974922938bd2d6c8195bfea73a0b")).intValue() : this.f.size();
        }

        public final void a(long j) {
            int i = 0;
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd5574981b7f8af985f9df3b9953dfad", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd5574981b7f8af985f9df3b9953dfad");
                return;
            }
            while (true) {
                if (i >= this.f.size()) {
                    break;
                } else if (this.f.get(i).code == j) {
                    this.c = i;
                    this.e.scrollToPositionWithOffset(i, (a() - 100) / 2);
                    break;
                } else {
                    i++;
                }
            }
            notifyDataSetChanged();
        }

        int a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd082d78586d9bdb2489937f7fc5c598", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd082d78586d9bdb2489937f7fc5c598")).intValue();
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) this.b.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.widthPixels;
        }

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.store.poi.list.newp.sg.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static class C1280a extends RecyclerView.s {
            public ConstraintLayout a;
            public ImageView b;
            public TextView c;

            public C1280a(View view) {
                super(view);
                this.a = (ConstraintLayout) view.findViewById(R.id.cl_item_view);
                this.b = (ImageView) view.findViewById(R.id.iv_kk);
                this.c = (TextView) view.findViewById(R.id.tv_kk);
            }
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afc694efc6a3b901696cca249cf78beb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afc694efc6a3b901696cca249cf78beb");
            return;
        }
        super.onDestroy();
        a(this.p, this.o);
    }
}
