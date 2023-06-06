package com.sankuai.waimai.store.im.poi.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.f;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.platform.widget.roundview.RoundedImageView;
import com.sankuai.waimai.store.im.base.g;
import com.sankuai.waimai.store.im.poi.model.SGIMGoodsListData;
import com.sankuai.waimai.store.view.standard.FlashPrice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends g<C1212a> {
    public static ChangeQuickRedirect c;
    com.sankuai.waimai.store.im.poi.listener.c d;
    public int e;
    public String f;
    private Context g;
    private List<SGIMGoodsListData.IMProductInfo.IMProductSpu> h;

    /* JADX WARN: Removed duplicated region for block: B:37:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0187  */
    @Override // android.support.v7.widget.RecyclerView.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void onBindViewHolder(@android.support.annotation.NonNull android.support.v7.widget.RecyclerView.s r20, int r21) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.im.poi.adapter.a.onBindViewHolder(android.support.v7.widget.RecyclerView$s, int):void");
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final /* synthetic */ RecyclerView.s onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View inflate;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3705f1949303ff8006cfbde8b2857485", RobustBitConfig.DEFAULT_VALUE)) {
            return (C1212a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3705f1949303ff8006cfbde8b2857485");
        }
        if (com.sankuai.waimai.store.im.util.b.a(this.e)) {
            inflate = LayoutInflater.from(this.g).inflate(R.layout.wm_sg_im_related_good_list_item, viewGroup, false);
        } else {
            inflate = LayoutInflater.from(this.g).inflate(R.layout.wm_sc_im_good_list_item, viewGroup, false);
        }
        return new C1212a(inflate);
    }

    public a(Context context, com.sankuai.waimai.store.im.poi.listener.c cVar, com.sankuai.waimai.store.im.base.d dVar) {
        super(context, dVar);
        Object[] objArr = {context, cVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e3769fdb21ab1a5e7a5134cf6f18756", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e3769fdb21ab1a5e7a5134cf6f18756");
            return;
        }
        this.h = new ArrayList();
        this.g = context;
        this.d = cVar;
    }

    public final void a(List<SGIMGoodsListData.IMProductInfo.IMProductSpu> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56e9b02568b5f3ae06a58b88c1932899", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56e9b02568b5f3ae06a58b88c1932899");
            return;
        }
        this.h.clear();
        if (!com.sankuai.shangou.stone.util.a.b(list)) {
            this.h.addAll(list);
        }
        notifyDataSetChanged();
    }

    Map<String, Object> a(SGIMGoodsListData.IMProductInfo.IMProductSpu iMProductSpu) {
        Object[] objArr = {iMProductSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9981a31ce7db2d4096d8a65cf905a14b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9981a31ce7db2d4096d8a65cf905a14b");
        }
        HashMap hashMap = new HashMap();
        if (com.sankuai.waimai.store.im.util.b.a(this.e)) {
            hashMap.put("poi_id", iMProductSpu.poiId);
            hashMap.put("deal_id", iMProductSpu.spuId);
            hashMap.put("type", 1);
        } else {
            hashMap.put("poi_id", iMProductSpu.poiId);
            hashMap.put("sku_id", iMProductSpu.spuId);
        }
        return hashMap;
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dced953da7e1453761de8fa4f1f1be7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dced953da7e1453761de8fa4f1f1be7") : h.a(f.d(str));
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78848081fad7ac70c1c9b044332fbe9f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78848081fad7ac70c1c9b044332fbe9f")).intValue();
        }
        if (com.sankuai.shangou.stone.util.a.b(this.h)) {
            return 0;
        }
        return this.h.size();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.im.poi.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C1212a extends RecyclerView.s {
        public RoundedImageView a;
        public TextView b;
        public FlashPrice c;
        public LinearLayout d;

        public C1212a(View view) {
            super(view);
            this.a = (RoundedImageView) view.findViewById(R.id.img_im_good_list_pic);
            this.b = (TextView) view.findViewById(R.id.tv_im_customer_good_name);
            this.c = (FlashPrice) view.findViewById(R.id.wm_sc_im_good_list_price);
            this.d = (LinearLayout) view.findViewById(R.id.ll_sg_im_good_item_container);
        }
    }
}
