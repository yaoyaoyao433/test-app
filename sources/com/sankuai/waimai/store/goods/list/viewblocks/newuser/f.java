package com.sankuai.waimai.store.goods.list.viewblocks.newuser;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.platform.domain.core.goods.SGNewUserLandResponse;
import com.sankuai.waimai.store.util.e;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends RecyclerView.a<a> {
    public static ChangeQuickRedirect a;
    j b;
    SGNewUserLandResponse.HotSaleProductTabs c;
    final Context d;
    int e;
    e f;
    private boolean g;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(@NonNull a aVar, int i) {
        Resources resources;
        int i2;
        final a aVar2 = aVar;
        Object[] objArr = {aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89954303306f8a214ef506f425fd4118", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89954303306f8a214ef506f425fd4118");
            return;
        }
        final SGNewUserLandResponse.TabItem tabItem = (SGNewUserLandResponse.TabItem) com.sankuai.shangou.stone.util.a.a((List<Object>) this.c.tabs, i);
        Object[] objArr2 = {tabItem, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "26ddb81acc4e76a0db82b04c84de048c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "26ddb81acc4e76a0db82b04c84de048c");
        } else if (tabItem != null && aVar2.f != null) {
            if (i == tabItem.selectPos) {
                u.a(aVar2.d);
                aVar2.c.setTextColor(aVar2.f.getResources().getColor(R.color.wm_st_common_222426));
                aVar2.c.setTypeface(Typeface.defaultFromStyle(1));
                aVar2.c.getPaint().setFakeBoldText(true);
            } else {
                u.c(aVar2.d);
                aVar2.c.setTextColor(aVar2.f.getResources().getColor(R.color.wm_sg_color_858687));
                aVar2.c.setTypeface(Typeface.defaultFromStyle(0));
                aVar2.c.getPaint().setFakeBoldText(false);
            }
            aVar2.e.setPadding(com.sankuai.shangou.stone.util.h.a(aVar2.f, i == 0 ? 12.0f : 0.0f), 0, com.sankuai.shangou.stone.util.h.a(aVar2.f, aVar2.g ? 16.0f : 20.0f), com.sankuai.shangou.stone.util.h.a(aVar2.f, aVar2.g ? 5.0f : 11.0f));
            u.a(aVar2.c, tabItem.tabName);
            ViewGroup.LayoutParams layoutParams = aVar2.b.getLayoutParams();
            layoutParams.height = com.sankuai.shangou.stone.util.h.a(aVar2.f, aVar2.g ? 35.0f : 50.0f);
            layoutParams.width = com.sankuai.shangou.stone.util.h.a(aVar2.f, aVar2.g ? 35.0f : 50.0f);
            aVar2.b.setLayoutParams(layoutParams);
            if (aVar2.h != null) {
                ((RelativeLayout.LayoutParams) aVar2.h.getLayoutParams()).topMargin = com.sankuai.shangou.stone.util.h.a(aVar2.f, aVar2.g ? 6.0f : 8.0f);
            }
            TextView textView = aVar2.c;
            if (aVar2.g) {
                resources = aVar2.f.getResources();
                i2 = R.dimen.wm_sc_common_dimen_textsize_12;
            } else {
                resources = aVar2.f.getResources();
                i2 = R.dimen.wm_sc_common_dimen_textsize_13;
            }
            textView.setTextSize(0, resources.getDimensionPixelSize(i2));
            RequestCreator d = Picasso.g(aVar2.f).d(tabItem.tabIcon);
            d.f = R.drawable.tab_icon_default;
            d.g = R.drawable.tab_icon_default;
            d.a(aVar2.b, 1);
        }
        aVar2.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.f.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fa5e50476a5849b536b71f5488fe6849", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fa5e50476a5849b536b71f5488fe6849");
                } else if (f.this.b != null) {
                    com.sankuai.waimai.store.manager.judas.b.a(f.this.f.r().b(), com.sankuai.waimai.store.manager.judas.b.a((Object) f.this.d), "b_waimai_gongjitab_mc").a("tab_id", Integer.valueOf(tabItem.tabId)).a();
                    f.this.b.a(f.this.c, f.this.e, aVar2.getAdapterPosition());
                }
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final /* synthetic */ a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b69e580d62ba817c3f6defb05f75724b", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b69e580d62ba817c3f6defb05f75724b") : new a(LayoutInflater.from(this.d).inflate(R.layout.wm_sc_new_user_land_hotproduct_tab_item, viewGroup, false), this.d, this.g);
    }

    public f(Context context, j jVar, boolean z, e eVar) {
        Object[] objArr = {context, jVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "067629012349804811ab162e3e1313d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "067629012349804811ab162e3e1313d8");
            return;
        }
        this.d = context;
        this.b = jVar;
        this.g = z;
        this.f = eVar;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bfee8a07b6ad8c49b6aa174f44131b6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bfee8a07b6ad8c49b6aa174f44131b6")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.c.tabs);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        ImageView b;
        TextView c;
        View d;
        RelativeLayout e;
        Context f;
        boolean g;
        RelativeLayout h;
        private Drawable i;

        public a(View view, Context context, boolean z) {
            super(view);
            Object[] objArr = {view, context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34c22d35c5904ce8c4ceeef6c01bc27d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34c22d35c5904ce8c4ceeef6c01bc27d");
                return;
            }
            this.f = context;
            this.e = (RelativeLayout) view.findViewById(R.id.rv_tab);
            this.b = (ImageView) view.findViewById(R.id.iv_tab_icon);
            this.c = (TextView) view.findViewById(R.id.tv_tab_name);
            this.d = view.findViewById(R.id.tv_tab_selectcolor);
            this.i = new e.a().a(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{ContextCompat.getColor(this.f, R.color.wm_sg_color_FFEB6E), ContextCompat.getColor(this.f, R.color.wm_sg_color_FFDA20)}).a();
            this.d.setBackground(this.i);
            this.h = (RelativeLayout) view.findViewById(R.id.rl_tab_name);
            this.g = z;
        }
    }
}
