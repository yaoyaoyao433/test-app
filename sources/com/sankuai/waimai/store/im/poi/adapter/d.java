package com.sankuai.waimai.store.im.poi.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.platform.widget.roundview.RoundedImageView;
import com.sankuai.waimai.store.im.poi.model.ImOrderInfo;
import com.sankuai.waimai.store.util.m;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends RecyclerView.a<a> {
    public static ChangeQuickRedirect a;
    public final List<ImOrderInfo> b;
    com.sankuai.waimai.store.im.poi.listener.b c;
    private Context d;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        Object[] objArr = {aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d13e175545661df7714ac684b8993fd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d13e175545661df7714ac684b8993fd4");
        } else if (com.sankuai.shangou.stone.util.a.b(this.b)) {
        } else {
            if (i == getItemCount() - 1) {
                aVar2.a(null, i);
            } else {
                aVar2.a(this.b.get(i), i);
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00557eadfbe2849cb16393d0778540e3", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00557eadfbe2849cb16393d0778540e3") : new a(LayoutInflater.from(this.d).inflate(R.layout.wm_sc_simple_list_adapter_item, viewGroup, false));
    }

    public d(@NonNull Context context, @NonNull com.sankuai.waimai.store.im.poi.listener.b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "288ffeb628a511755bc745a36d1002f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "288ffeb628a511755bc745a36d1002f9");
            return;
        }
        this.b = new ArrayList();
        this.d = context;
        this.c = bVar;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fde9b0f04bbf2a3652c9aaa6f84efb29", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fde9b0f04bbf2a3652c9aaa6f84efb29")).intValue();
        }
        if (com.sankuai.shangou.stone.util.a.b(this.b)) {
            return 0;
        }
        return this.b.size() + 1;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends RecyclerView.s implements View.OnClickListener {
        public static ChangeQuickRedirect a;
        private View c;
        private TextView d;
        private TextView e;
        private TextView f;
        private TextView g;
        private TextView h;
        private TextView i;
        private RoundedImageView j;
        private RelativeLayout k;

        public a(@NonNull View view) {
            super(view);
            Object[] objArr = {d.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c9032f6fe9a69ab8ff6dc293e1c7d76", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c9032f6fe9a69ab8ff6dc293e1c7d76");
                return;
            }
            Object[] objArr2 = {view};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "114dad208ef1c2a7aebd8d3c1ba8aacf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "114dad208ef1c2a7aebd8d3c1ba8aacf");
            } else if (view != null) {
                this.c = view;
                this.k = (RelativeLayout) view.findViewById(R.id.rl_order_item);
                this.j = (RoundedImageView) view.findViewById(R.id.iv_pic_url);
                this.d = (TextView) view.findViewById(R.id.tv_name);
                this.e = (TextView) view.findViewById(R.id.tv_status_desc);
                this.f = (TextView) view.findViewById(R.id.tv_food_desc);
                this.g = (TextView) view.findViewById(R.id.tv_total_desc);
                this.g.setText(com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_common_im_payment_prefix));
                this.h = (TextView) view.findViewById(R.id.tv_total);
                this.i = (TextView) view.findViewById(R.id.tv_show_all_order);
                view.setOnClickListener(this);
            }
        }

        public final void a(ImOrderInfo imOrderInfo, int i) {
            Object[] objArr = {imOrderInfo, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32b553361c5250c86992c3e7603bfea1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32b553361c5250c86992c3e7603bfea1");
            } else if (i == d.this.getItemCount() - 1) {
                u.a(this.i);
                u.c(this.k);
            } else {
                u.c(this.i);
                u.a(this.k);
                if (imOrderInfo != null) {
                    this.c.setTag(imOrderInfo);
                    if (!TextUtils.isEmpty(imOrderInfo.poiLogo)) {
                        b.C0608b a2 = m.a(imOrderInfo.poiLogo);
                        a2.j = R.drawable.wm_sc_common_loading_large;
                        a2.a((ImageView) this.j);
                    }
                    if (!TextUtils.isEmpty(imOrderInfo.poiName)) {
                        this.d.setText(imOrderInfo.poiName);
                    }
                    this.e.setText(imOrderInfo.statusDesc);
                    this.f.setText(imOrderInfo.foodDesc);
                    this.h.setText(com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_common_price, String.valueOf(imOrderInfo.total)));
                }
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0712d47bbaa783af55fdf02cff84e3c", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0712d47bbaa783af55fdf02cff84e3c");
            } else if (d.this.c != null) {
                if (view.getTag() instanceof ImOrderInfo) {
                    ImOrderInfo imOrderInfo = (ImOrderInfo) view.getTag();
                    if (imOrderInfo == null) {
                        return;
                    }
                    d.this.c.a(imOrderInfo);
                    return;
                }
                d.this.c.a();
            }
        }
    }
}
