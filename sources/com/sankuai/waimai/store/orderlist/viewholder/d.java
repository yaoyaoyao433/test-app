package com.sankuai.waimai.store.orderlist.viewholder;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.business.order.api.model.ButtonItem;
import com.sankuai.waimai.business.order.api.model.Order;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import com.sankuai.waimai.platform.widget.tag.virtualtag.g;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.newwidgets.labelview.LabelView;
import com.sankuai.waimai.store.orderlist.OrderListFragment;
import com.sankuai.waimai.store.orderlist.helper.a;
import com.sankuai.waimai.store.orderlist.model.OrderLiveInfo;
import com.sankuai.waimai.store.orderlist.view.PoiListViewCache;
import com.sankuai.waimai.store.orderlist.view.base.SingleLineWithOmitHorizontalFlowLayout;
import com.sankuai.waimai.store.poi.subscribe.a;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.view.LiveView;
import com.sankuai.waimai.store.widgets.recycler.e;
import com.sankuai.xm.im.session.SessionId;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.tencent.liteav.TXLiteAVCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends e implements b {
    public static ChangeQuickRedirect a;
    public Drawable A;
    public TextView B;
    public TextView C;
    public com.sankuai.waimai.store.orderlist.view.a D;
    public List<View> E;
    public List<View> F;
    public List<View> G;
    com.sankuai.waimai.store.orderlist.helper.a H;
    public int I;
    public int J;
    public PoiListViewCache K;
    private TextView N;
    private TextView O;
    private TextView P;
    private TextView Q;
    private com.sankuai.waimai.store.orderlist.helper.b R;
    private int S;
    public final int b;
    public ImageView c;
    public TextView d;
    public ViewGroup e;
    public ViewGroup f;
    public TextView g;
    public ViewGroup h;
    public TextView i;
    public ViewGroup j;
    public TextView k;
    public LabelView l;
    public ViewGroup m;
    public SingleLineWithOmitHorizontalFlowLayout n;
    public TagCanvasView o;
    public g p;
    public ImageView q;
    public FrameLayout r;
    public LiveView s;
    public LiveView t;
    public TextView u;
    public ViewGroup v;
    public ViewGroup w;
    public ImageView x;
    public ViewGroup y;
    public ViewGroup z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static /* synthetic */ void a(d dVar, ButtonItem buttonItem, Order order, int i) {
        Context a2;
        int a3;
        Bundle bundle;
        Object[] objArr = {buttonItem, order, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "6ae0a3943e24bfb4ff3ce37ed922d858", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "6ae0a3943e24bfb4ff3ce37ed922d858");
            return;
        }
        com.sankuai.waimai.store.manager.judas.b.a("c_waimai_m5pcse9e", "b_waimai_snhfvikt_mc").b(dVar.a(buttonItem)).a("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(order.getPoiIdStr(), order.getPoiId())).a();
        switch (buttonItem.code) {
            case 1001:
                dVar.g(order, i);
                return;
            case 2001:
                Object[] objArr2 = {order, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "a77c6be4ed53dd1f97cdff103027dcfb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "a77c6be4ed53dd1f97cdff103027dcfb");
                    return;
                } else if (OrderListFragment.c) {
                    return;
                } else {
                    dVar.R.a();
                    dVar.R.a(order.getPoiId(), order.getHashId());
                    return;
                }
            case 2004:
                dVar.R.b(order, 1);
                return;
            case 2005:
                Object[] objArr3 = {order, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "e21c0b6d012418e7271d0cdb29a658f9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "e21c0b6d012418e7271d0cdb29a658f9");
                    return;
                } else if (OrderListFragment.c) {
                    return;
                } else {
                    dVar.R.a();
                    dVar.R.c(order);
                    return;
                }
            case 2010:
                Object[] objArr4 = {order, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "9fe8780966472f910f5d4253f5373913", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "9fe8780966472f910f5d4253f5373913");
                    return;
                } else if (OrderListFragment.c) {
                    return;
                } else {
                    dVar.R.a();
                    dVar.R.d(order);
                    return;
                }
            case 2012:
                break;
            case 2013:
                dVar.R.b(buttonItem.clickUrl);
                return;
            case 2014:
                dVar.R.a(buttonItem.clickUrl);
                return;
            case TXLiteAVCode.EVT_VOD_PLAY_DNS_RESOLVED /* 2018 */:
                dVar.R.e(order);
                return;
            case TXLiteAVCode.EVT_AUDIO_JITTER_STATE_LOADING /* 2024 */:
                if (dVar.a() instanceof SCBaseActivity) {
                    com.sankuai.waimai.business.im.api.a a4 = com.sankuai.waimai.business.im.api.a.a();
                    Activity activity = (Activity) dVar.a();
                    long orderId = order.getOrderId();
                    long poiId = order.getPoiId();
                    String w = ((SCBaseActivity) dVar.a()).w();
                    Object[] objArr5 = {dVar.a(), order};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "bcf02ad53acdef87fa9d46e9319cf0d2", RobustBitConfig.DEFAULT_VALUE)) {
                        bundle = (Bundle) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "bcf02ad53acdef87fa9d46e9319cf0d2");
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("status_desc", order.getStatusDescription());
                        bundle2.putInt("status", order.getStatus());
                        bundle2.putDouble("total", order.getTotal());
                        bundle2.putLong("order_time", Long.valueOf(order.getOrderTime()).longValue());
                        bundle2.putLong("order_view_id", order.getOrderId());
                        String str = "";
                        Order.b bVar = (Order.b) com.sankuai.shangou.stone.util.a.a((List<Object>) order.productList, 0);
                        if (TextUtils.isEmpty("") && bVar != null) {
                            str = bVar.b;
                        }
                        if (com.sankuai.shangou.stone.util.a.a((List) order.productList) > 1) {
                            str = str + a2.getString(R.string.wm_sc_order_list_order_count_desc, Integer.valueOf(a3));
                        }
                        bundle2.putString("food_desc", str);
                        bundle = bundle2;
                    }
                    a4.a(activity, (SessionId) null, 3, orderId, poiId, 0L, 10, w, false, bundle);
                    break;
                }
                break;
            case 2042:
                dVar.R.f(order);
                return;
            case 2050:
                dVar.g(order, i);
                return;
            case 2054:
                Object[] objArr6 = {order};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, dVar, changeQuickRedirect6, false, "ec05ecd2f6af12b245d28c9a1f9df4ae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, dVar, changeQuickRedirect6, false, "ec05ecd2f6af12b245d28c9a1f9df4ae");
                    return;
                } else if (order == null) {
                    return;
                } else {
                    Context context = dVar.m.getContext();
                    if (context instanceof SCBaseActivity) {
                        SCBaseActivity sCBaseActivity = (SCBaseActivity) context;
                        com.sankuai.waimai.store.poi.subscribe.a.a().a(sCBaseActivity, (a.c) new com.sankuai.waimai.store.poi.subscribe.d(sCBaseActivity, order.getPoiId(), 1));
                        return;
                    }
                    return;
                }
            case 2055:
                return;
            default:
                dVar.R.a(buttonItem.clickUrl);
                return;
        }
        if (TextUtils.isEmpty(buttonItem.clickUrl)) {
            return;
        }
        com.sankuai.waimai.store.router.d.a(dVar.m.getContext(), buttonItem.clickUrl);
    }

    public static /* synthetic */ void b(d dVar, Order order, int i) {
        Object[] objArr = {order, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "76e093f2cd6f199953d682031e5f59de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "76e093f2cd6f199953d682031e5f59de");
        } else {
            dVar.R.a(order);
        }
    }

    public static /* synthetic */ void c(d dVar, Order order, int i) {
        Object[] objArr = {order, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "a062f90c862105b0aa6ce64174e3cba3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "a062f90c862105b0aa6ce64174e3cba3");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a("c_waimai_m5pcse9e", "b_waimai_sxctffzo_mc").b(dVar.e(order, i)).a();
        }
    }

    public d(View view, @NonNull com.sankuai.waimai.store.orderlist.helper.b bVar, @NonNull PoiListViewCache poiListViewCache, int i) {
        super(view);
        Object[] objArr = {view, bVar, poiListViewCache, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e18d625361f999bf3e9c0f7c269a7707", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e18d625361f999bf3e9c0f7c269a7707");
            return;
        }
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.S = 3;
        this.R = bVar;
        this.K = poiListViewCache;
        this.b = i;
        this.H = new com.sankuai.waimai.store.orderlist.helper.a(a(), this.b);
        this.I = view.getContext().getResources().getColor(R.color.wm_common_text_highlight);
        this.J = view.getContext().getResources().getColor(R.color.wm_common_text_main);
        this.x = (ImageView) view.findViewById(R.id.img_bubble);
        this.c = (ImageView) view.findViewById(R.id.img_poi_image);
        this.e = (ViewGroup) view.findViewById(R.id.container_poi_info);
        this.d = (TextView) view.findViewById(R.id.txt_poi_img_status);
        this.f = (ViewGroup) view.findViewById(R.id.layout_poi_area_center);
        this.g = (TextView) view.findViewById(R.id.txt_poi_name_center);
        this.t = (LiveView) view.findViewById(R.id.live_label_entry_center);
        this.h = (ViewGroup) view.findViewById(R.id.layout_poi_area_top);
        this.i = (TextView) view.findViewById(R.id.txt_poi_name_top);
        this.s = (LiveView) view.findViewById(R.id.live_label_entry_top);
        this.j = (ViewGroup) view.findViewById(R.id.layout_poi_book_staus);
        this.k = (TextView) view.findViewById(R.id.txt_poi_reservation_status);
        this.l = (LabelView) view.findViewById(R.id.txt_poi_reservation_time_des);
        this.m = (ViewGroup) view.findViewById(R.id.layout_poi_activity);
        this.n = (SingleLineWithOmitHorizontalFlowLayout) view.findViewById(R.id.flowlayout_activities_single_line);
        this.r = (FrameLayout) view.findViewById(R.id.fl_tagview_layout);
        this.o = (TagCanvasView) view.findViewById(R.id.tc_tagview_layout);
        this.q = (ImageView) view.findViewById(R.id.tv_more_tag);
        this.p = new g(view.getContext(), null);
        this.o.setAdapter(this.p);
        this.u = (TextView) view.findViewById(R.id.txt_orderList_adapter_status);
        this.v = (ViewGroup) view.findViewById(R.id.container_order_report);
        this.w = (ViewGroup) view.findViewById(R.id.layout_order_button_area);
        this.N = (TextView) view.findViewById(R.id.btn_order_more);
        this.O = (TextView) view.findViewById(R.id.btn_order_1);
        this.P = (TextView) view.findViewById(R.id.btn_order_2);
        this.Q = (TextView) view.findViewById(R.id.btn_order_3);
        this.y = (ViewGroup) view.findViewById(R.id.ll_order_wrapper);
        this.z = (ViewGroup) view.findViewById(R.id.order_list_sub_delivery_info);
        this.C = (TextView) view.findViewById(R.id.order_list_sub_delivery_status);
        this.B = (TextView) view.findViewById(R.id.order_list_sub_delivery_time);
        this.D = new com.sankuai.waimai.store.orderlist.view.a(view.getContext());
        this.D.a((ViewGroup) view.findViewById(R.id.container_order_deliver_pack_area));
    }

    private void f(Order order, int i) {
        Object[] objArr = {order, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b73a6bc153c095db9c515939d7ed07c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b73a6bc153c095db9c515939d7ed07c2");
        } else {
            this.R.a(order, i);
        }
    }

    public final void a(View view, final Order order, final int i, View.OnClickListener onClickListener) {
        Object[] objArr = {view, order, Integer.valueOf(i), onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64ddfcb0a97e0608c7a1db7872805d15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64ddfcb0a97e0608c7a1db7872805d15");
            return;
        }
        view.setOnClickListener(onClickListener);
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.sankuai.waimai.store.orderlist.viewholder.d.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "284e362ac7f8948a106efe0b633df22f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "284e362ac7f8948a106efe0b633df22f")).booleanValue() : d.this.h(order, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h(Order order, int i) {
        Object[] objArr = {order, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "532d57cbee91c63b2d67322a1389f272", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "532d57cbee91c63b2d67322a1389f272")).booleanValue();
        }
        if (order != null && order.isDeletable()) {
            com.sankuai.waimai.store.orderlist.model.b bVar = new com.sankuai.waimai.store.orderlist.model.b(order.getOrderId(), order.getOrderTime());
            Object[] objArr2 = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0738f70c1dc55abeab3f7011beea174d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0738f70c1dc55abeab3f7011beea174d");
            } else {
                this.R.a(bVar);
            }
            return true;
        }
        return true;
    }

    public void c(final Order order, final int i) {
        int i2;
        int i3;
        int i4;
        TextView textView;
        TextView textView2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        char c = 0;
        Object[] objArr = {order, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e814ddc7016cbe1782037b240e1cb64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e814ddc7016cbe1782037b240e1cb64");
            return;
        }
        List<ButtonItem> a2 = com.sankuai.waimai.store.orderlist.utils.a.a(order.buttonTypeList, order);
        if (com.sankuai.shangou.stone.util.a.b(a2)) {
            this.w.setVisibility(8);
            return;
        }
        try {
            this.N.setVisibility(8);
            this.O.setVisibility(8);
            this.P.setVisibility(8);
            this.Q.setVisibility(8);
            int size = a2.size();
            if (size > this.S) {
                int i10 = size - this.S;
                this.N.setVisibility(0);
                TextView textView3 = this.N;
                final List<ButtonItem> subList = a2.subList(0, i10);
                Object[] objArr2 = {textView3, order, subList, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                i3 = i10;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d427c0629edec8163d19775292771a4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d427c0629edec8163d19775292771a4");
                } else {
                    com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("c_waimai_m5pcse9e", "b_waimai_snhfvikt_mv", textView3);
                    bVar.e = "b_waimai_snhfvikt_mv" + this.b + i + "more";
                    HashMap hashMap = new HashMap();
                    hashMap.put("page_type", Integer.valueOf(this.b));
                    hashMap.put("button_name", "更多");
                    hashMap.put("status_code", Integer.valueOf((int) IjkMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM));
                    hashMap.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(order.getPoiIdStr(), order.getPoiId()));
                    bVar.b(hashMap);
                    if (a() instanceof com.sankuai.waimai.store.expose.v2.a) {
                        com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) a(), bVar);
                    } else {
                        com.sankuai.shangou.stone.util.log.a.a("OrderListViewHolder", "getContext is not a IExposeHost", new Object[0]);
                    }
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.orderlist.viewholder.d.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            boolean isShowing;
                            Object[] objArr3 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "50ee8e3de3a6768d5faa8b86364f28ad", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "50ee8e3de3a6768d5faa8b86364f28ad");
                                return;
                            }
                            try {
                                com.sankuai.waimai.store.orderlist.helper.a aVar = d.this.H;
                                List<ButtonItem> list = subList;
                                int i11 = i;
                                a.b bVar2 = new a.b() { // from class: com.sankuai.waimai.store.orderlist.viewholder.d.1.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.store.orderlist.helper.a.b
                                    public final void a(ButtonItem buttonItem, int i12) {
                                        Object[] objArr4 = {buttonItem, Integer.valueOf(i12)};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "864bb729296840de9ff4867d0b2d36f9", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "864bb729296840de9ff4867d0b2d36f9");
                                        } else {
                                            d.a(d.this, buttonItem, order, i12);
                                        }
                                    }
                                };
                                aVar.d = view;
                                aVar.c = list;
                                aVar.g = bVar2;
                                d.this.H.h = com.sankuai.waimai.store.platform.domain.manager.poi.a.a(order.getPoiIdStr(), order.getPoiId());
                                final com.sankuai.waimai.store.orderlist.helper.a aVar2 = d.this.H;
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.orderlist.helper.a.a;
                                if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "88ca6260d764d8b6f8f9abbc2f105608", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "88ca6260d764d8b6f8f9abbc2f105608");
                                } else if (aVar2.e == null) {
                                    View inflate = LayoutInflater.from(aVar2.b).inflate(R.layout.wm_sc_order_list_adapter_order_more, (ViewGroup) null);
                                    aVar2.f = (ListView) inflate.findViewById(R.id.order_button_list);
                                    aVar2.f.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.sankuai.waimai.store.orderlist.helper.a.1
                                        public static ChangeQuickRedirect a;

                                        @Override // android.widget.AbsListView.OnScrollListener
                                        public final void onScroll(AbsListView absListView, int i12, int i13, int i14) {
                                        }

                                        @Override // android.widget.AbsListView.OnScrollListener
                                        public final void onScrollStateChanged(AbsListView absListView, int i12) {
                                            Object[] objArr5 = {absListView, Integer.valueOf(i12)};
                                            ChangeQuickRedirect changeQuickRedirect5 = a;
                                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "bf18c897638b6e0fcc1dd8bd2a3151ef", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "bf18c897638b6e0fcc1dd8bd2a3151ef");
                                            } else if (i12 == 0) {
                                                a.a(aVar2);
                                            }
                                        }
                                    });
                                    aVar2.a();
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.orderlist.helper.a.a;
                                    if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "f9de32045efa5e854e767f8dbe096b66", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "f9de32045efa5e854e767f8dbe096b66");
                                    } else {
                                        aVar2.f.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.sankuai.waimai.store.orderlist.helper.a.2
                                            public static ChangeQuickRedirect a;

                                            @Override // android.widget.AdapterView.OnItemClickListener
                                            public final void onItemClick(AdapterView<?> adapterView, View view2, int i12, long j) {
                                                Object[] objArr6 = {adapterView, view2, Integer.valueOf(i12), new Long(j)};
                                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "ea70a1c0530069ae45b8c01374e890bb", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "ea70a1c0530069ae45b8c01374e890bb");
                                                    return;
                                                }
                                                aVar2.b();
                                                if (aVar2.c == null || aVar2.c.size() <= i12) {
                                                    return;
                                                }
                                                ButtonItem buttonItem = aVar2.c.get(i12);
                                                if (aVar2.g != null) {
                                                    aVar2.g.a(buttonItem, i12);
                                                }
                                            }
                                        });
                                    }
                                    Object[] objArr6 = {inflate};
                                    ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.orderlist.helper.a.a;
                                    if (PatchProxy.isSupport(objArr6, aVar2, changeQuickRedirect6, false, "819657fabb6923619e6dd2dc790c633a", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, aVar2, changeQuickRedirect6, false, "819657fabb6923619e6dd2dc790c633a");
                                    } else {
                                        aVar2.e = new PopupWindow(inflate, -2, -2, true);
                                        aVar2.e.setBackgroundDrawable(new ColorDrawable(0));
                                        aVar2.e.setTouchable(true);
                                        aVar2.e.setOutsideTouchable(true);
                                        aVar2.e.setFocusable(true);
                                    }
                                    aVar2.a(aVar2.d);
                                } else {
                                    aVar2.a();
                                    Object[] objArr7 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.store.orderlist.helper.a.a;
                                    if (PatchProxy.isSupport(objArr7, aVar2, changeQuickRedirect7, false, "5b30eb57ebb2673c8cf35996fbfc0058", RobustBitConfig.DEFAULT_VALUE)) {
                                        isShowing = ((Boolean) PatchProxy.accessDispatch(objArr7, aVar2, changeQuickRedirect7, false, "5b30eb57ebb2673c8cf35996fbfc0058")).booleanValue();
                                    } else {
                                        isShowing = aVar2.e != null ? aVar2.e.isShowing() : false;
                                    }
                                    if (isShowing) {
                                        aVar2.b();
                                    }
                                    aVar2.a(aVar2.d);
                                }
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("page_type", Integer.valueOf(d.this.b));
                                hashMap2.put("button_name", "更多");
                                hashMap2.put("status_code", Integer.valueOf((int) IjkMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM));
                                hashMap2.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(order.getPoiIdStr(), order.getPoiId()));
                                com.sankuai.waimai.store.manager.judas.b.a("c_waimai_m5pcse9e", "b_waimai_snhfvikt_mc").b(hashMap2).a();
                            } catch (Throwable th) {
                                com.sankuai.shangou.stone.util.log.a.d("OrderListAdapter", "initOrderMore:" + th.getMessage(), new Object[0]);
                            }
                        }
                    });
                }
            } else {
                i3 = 0;
            }
            int i11 = i3;
            int i12 = 1;
            while (i12 <= this.S && i11 < size) {
                final ButtonItem buttonItem = a2.get(i11);
                Object[] objArr3 = new Object[4];
                objArr3[c] = order;
                objArr3[1] = buttonItem;
                objArr3[2] = Integer.valueOf(i12);
                objArr3[3] = Integer.valueOf(i);
                ChangeQuickRedirect changeQuickRedirect3 = a;
                List<ButtonItem> list = a2;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a3a7ee84fc038c1e5b31ce3ec0dad9b9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a3a7ee84fc038c1e5b31ce3ec0dad9b9");
                } else if (buttonItem != null) {
                    Object[] objArr4 = {Integer.valueOf(i12)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    i4 = size;
                    if (!PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ae9838f408ec23744c2858e4578307d2", RobustBitConfig.DEFAULT_VALUE)) {
                        switch (i12) {
                            case 1:
                                textView = this.O;
                                textView2 = textView;
                                break;
                            case 2:
                                textView = this.P;
                                textView2 = textView;
                                break;
                            case 3:
                                textView = this.Q;
                                textView2 = textView;
                                break;
                            default:
                                textView2 = null;
                                break;
                        }
                    } else {
                        textView2 = (TextView) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ae9838f408ec23744c2858e4578307d2");
                    }
                    TextView textView4 = textView2;
                    if (com.sankuai.waimai.store.orderlist.utils.a.a(buttonItem)) {
                        Object[] objArr5 = {textView4, buttonItem};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        i5 = i11;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "479e865e938373477f9c4068b1a07e1b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "479e865e938373477f9c4068b1a07e1b");
                        } else if (textView4 != null) {
                            int paddingBottom = textView4.getPaddingBottom();
                            int paddingTop = textView4.getPaddingTop();
                            int paddingRight = textView4.getPaddingRight();
                            int paddingLeft = textView4.getPaddingLeft();
                            textView4.setVisibility(0);
                            textView4.setBackgroundResource(R.drawable.wm_common_btn_solid_light_disable);
                            if (buttonItem.code == 2055) {
                                i9 = R.drawable.wm_sg_poi_have_subscribed_icon_left_gray;
                                i8 = R.color.wm_sg_color_BCBCBD;
                            } else if (buttonItem.code == 2054) {
                                i9 = R.drawable.wm_sg_poi_can_subscribe_icon_left_big;
                                i8 = R.color.wm_common_theme_dark;
                            } else {
                                i8 = 0;
                                i9 = 0;
                            }
                            textView4.setCompoundDrawablePadding(textView4.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_2));
                            textView4.setText(com.sankuai.waimai.store.orderlist.utils.a.a(buttonItem, a()));
                            textView4.setMaxEms(7);
                            textView4.setTextColor(textView4.getResources().getColor(i8));
                            textView4.setCompoundDrawablesWithIntrinsicBounds(i9, 0, 0, 0);
                            textView4.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                        }
                        i6 = i12;
                    } else {
                        i5 = i11;
                        if (buttonItem != null && buttonItem.code == 3108) {
                            Object[] objArr6 = {textView4, buttonItem};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            i6 = i12;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "629722b081019672e01e1ebc7b43410a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "629722b081019672e01e1ebc7b43410a");
                            } else if (textView4 != null) {
                                int paddingBottom2 = textView4.getPaddingBottom();
                                int paddingTop2 = textView4.getPaddingTop();
                                int paddingRight2 = textView4.getPaddingRight();
                                int paddingLeft2 = textView4.getPaddingLeft();
                                textView4.setVisibility(0);
                                textView4.setBackground(new e.a().a(h.a(a(), 2.0f)).a(com.sankuai.waimai.store.util.b.b(a(), R.color.wm_sg_color_FF8000)).b(1).a());
                                textView4.setText(buttonItem.title);
                                textView4.setTextColor(com.sankuai.waimai.store.util.b.b(a(), R.color.wm_sg_color_FF8000));
                                textView4.setMaxEms(6);
                                textView4.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                                textView4.setPadding(paddingLeft2, paddingTop2, paddingRight2, paddingBottom2);
                            }
                        } else {
                            i6 = i12;
                            Object[] objArr7 = {textView4, buttonItem};
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "6fdff3a32e952728f8ea208b43d5baa4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "6fdff3a32e952728f8ea208b43d5baa4");
                            } else if (textView4 != null) {
                                textView4.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                                int paddingBottom3 = textView4.getPaddingBottom();
                                int paddingTop3 = textView4.getPaddingTop();
                                int paddingRight3 = textView4.getPaddingRight();
                                int paddingLeft3 = textView4.getPaddingLeft();
                                textView4.setVisibility(0);
                                textView4.setText(buttonItem.title);
                                if (buttonItem.isHighLight()) {
                                    textView4.setBackgroundResource(R.drawable.wm_common_btn_solid);
                                } else {
                                    textView4.setBackgroundResource(R.drawable.wm_common_btn_solid_light);
                                }
                                textView4.setMaxEms(6);
                                textView4.setPadding(paddingLeft3, paddingTop3, paddingRight3, paddingBottom3);
                            }
                        }
                    }
                    textView4.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.orderlist.viewholder.d.3
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr8 = {view};
                            ChangeQuickRedirect changeQuickRedirect8 = a;
                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "2ead2c87be401cf4eb5db3ed4c4fa60b", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "2ead2c87be401cf4eb5db3ed4c4fa60b");
                            } else {
                                d.a(d.this, buttonItem, order, i);
                            }
                        }
                    });
                    com.sankuai.waimai.store.expose.v2.entity.b bVar2 = new com.sankuai.waimai.store.expose.v2.entity.b("c_waimai_m5pcse9e", "b_waimai_snhfvikt_mv", textView4);
                    StringBuilder sb = new StringBuilder("b_waimai_snhfvikt_mv");
                    sb.append(this.b);
                    sb.append(i);
                    i7 = i6;
                    sb.append(i7);
                    sb.append(buttonItem.title);
                    bVar2.e = sb.toString();
                    bVar2.b(a(buttonItem));
                    bVar2.a("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(order.getPoiIdStr(), order.getPoiId()));
                    if (a() instanceof com.sankuai.waimai.store.expose.v2.a) {
                        com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) a(), bVar2);
                    } else {
                        com.sankuai.shangou.stone.util.log.a.a("OrderListViewHolder", "getContext is not a IExposeHost", new Object[0]);
                    }
                    i12 = i7 + 1;
                    i11 = i5 + 1;
                    a2 = list;
                    size = i4;
                    c = 0;
                }
                i7 = i12;
                i5 = i11;
                i4 = size;
                i12 = i7 + 1;
                i11 = i5 + 1;
                a2 = list;
                size = i4;
                c = 0;
            }
            i2 = 0;
        } catch (Throwable th) {
            i2 = 0;
            com.sankuai.shangou.stone.util.log.a.d("OrderListAdapter", "initOrderButtonList" + th.getMessage(), new Object[0]);
        }
        Object[] objArr8 = new Object[i2];
        ChangeQuickRedirect changeQuickRedirect8 = a;
        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "8e12cf4b38cf7057208350511890211a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "8e12cf4b38cf7057208350511890211a");
        } else if (this.P.getVisibility() == 0 || this.Q.getVisibility() == 0 || this.O.getVisibility() == 0 || this.N.getVisibility() == 0) {
            this.w.setVisibility(0);
        } else {
            this.w.setVisibility(8);
        }
    }

    @Override // com.sankuai.waimai.store.orderlist.viewholder.b
    public final void a(Order order, int i) {
        Object[] objArr = {order, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae4dccf8b54b5cad52cf5bfccad6021b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae4dccf8b54b5cad52cf5bfccad6021b");
        } else {
            d(order, i);
        }
    }

    @Override // com.sankuai.waimai.store.orderlist.viewholder.b
    public final void b(Order order, int i) {
        Object[] objArr = {order, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c9408c1f88c671893c1d84d677ccaf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c9408c1f88c671893c1d84d677ccaf6");
        } else {
            h(order, i);
        }
    }

    void d(Order order, int i) {
        Object[] objArr = {order, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ead1e0bdea1312f915a7c1b6bc7b8a4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ead1e0bdea1312f915a7c1b6bc7b8a4c");
            return;
        }
        f(order, i);
        i(order, i);
    }

    private void a(TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8798277323fed2207cc6571c8c07f153", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8798277323fed2207cc6571c8c07f153");
            return;
        }
        Drawable drawable = a().getResources().getDrawable(R.drawable.wm_sc_order_status_ic_arrow_right);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        textView.setCompoundDrawables(null, null, drawable, null);
    }

    private void b(TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b379bf40ec48fb3500548b0257f40470", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b379bf40ec48fb3500548b0257f40470");
        } else {
            textView.setTextColor(this.J);
        }
    }

    public Context a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a49d3b22a6ddcd85c5de98737203fc7", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a49d3b22a6ddcd85c5de98737203fc7") : this.itemView.getContext();
    }

    public final void a(TextView textView, Order order) {
        Object[] objArr = {textView, order};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a33651f56ef4b7aeb547fc2cb95d239", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a33651f56ef4b7aeb547fc2cb95d239");
            return;
        }
        textView.setText(order.getPoiName());
        b(textView);
        a(textView);
    }

    public void a(@NonNull Order order) {
        Object[] objArr = {order};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5acaf1e64dad480250e34d34412a829b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5acaf1e64dad480250e34d34412a829b");
            return;
        }
        OrderLiveInfo convert = OrderLiveInfo.convert(order.getLiveInfo());
        this.s.a(convert);
        this.t.a(convert);
    }

    public boolean b(Order order) {
        Object[] objArr = {order};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "488910e80dcb70b71b8eb4d0559b57fc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "488910e80dcb70b71b8eb4d0559b57fc")).booleanValue() : (order.mPoiExtensionInfo == null || order.mPoiExtensionInfo.e == null || order.mPoiExtensionInfo.c != 1 || TextUtils.isEmpty(order.mPoiExtensionInfo.e.statusContent) || TextUtils.isEmpty(order.mPoiExtensionInfo.e.descContent)) ? false : true;
    }

    public boolean c(Order order) {
        Object[] objArr = {order};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b2a4c8456c5a9e337741dde621b5fb6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b2a4c8456c5a9e337741dde621b5fb6")).booleanValue() : (order.mPoiExtensionInfo == null || com.sankuai.shangou.stone.util.a.b(order.mPoiExtensionInfo.b)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03e8  */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.sankuai.waimai.business.order.api.model.Order r36) {
        /*
            Method dump skipped, instructions count: 1023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.orderlist.viewholder.d.d(com.sankuai.waimai.business.order.api.model.Order):void");
    }

    public final void e(Order order) {
        Object[] objArr = {order};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f91e170a9468abbad9182dcac5fd3978", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f91e170a9468abbad9182dcac5fd3978");
        } else if (!b(order)) {
            this.j.setVisibility(8);
        } else {
            String str = order.mPoiExtensionInfo.e.statusContent;
            String str2 = order.mPoiExtensionInfo.e.descContent;
            int i = order.mPoiExtensionInfo.e.reservationStatus;
            this.j.setVisibility(0);
            this.k.setVisibility(0);
            this.l.setVisibility(0);
            this.k.setText(str);
            this.l.setText(str2);
            if (i == 0) {
                this.k.setBackground(this.K.p);
                this.l.setTextColor(this.K.k);
                this.l.getBorderColors().a(this.K.k, null, null, null);
            } else if (i == 1) {
                this.k.setBackground(this.K.q);
                this.l.setTextColor(this.K.l);
                this.l.getBorderColors().a(this.K.l, null, null, null);
            }
        }
    }

    private Map<String, Object> a(@NonNull ButtonItem buttonItem) {
        Object[] objArr = {buttonItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "411e0c8f7b85d9aad3d406bf7d854bab", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "411e0c8f7b85d9aad3d406bf7d854bab");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("page_type", Integer.valueOf(this.b));
        hashMap.put("button_name", com.sankuai.waimai.store.orderlist.utils.a.a(buttonItem) ? com.sankuai.waimai.store.orderlist.utils.a.a(buttonItem, a()) : buttonItem.title);
        hashMap.put("status_code", Integer.valueOf(buttonItem.code));
        return hashMap;
    }

    public Map<String, Object> e(Order order, int i) {
        Object[] objArr = {order, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "327672c8b4899f0a4e1aa303742883f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "327672c8b4899f0a4e1aa303742883f0");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("page_type", Integer.valueOf(this.b));
        hashMap.put("order_id", String.valueOf(order.getOrderId()));
        hashMap.put("index", Integer.valueOf(i));
        hashMap.put("order_status", Integer.valueOf(order.getStatus()));
        hashMap.put("live_id", (order.getLiveInfo() == null || TextUtils.isEmpty(order.getLiveInfo().liveId)) ? "-999" : order.getLiveInfo().liveId);
        hashMap.put("delivery_type", Integer.valueOf(order.getShippingServiceType()));
        hashMap.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(order.getPoiIdStr(), order.getPoiId()));
        return hashMap;
    }

    private void i(Order order, int i) {
        Object[] objArr = {order, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f42fba8ddfe379269984f33d7e68b092", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f42fba8ddfe379269984f33d7e68b092");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a("c_waimai_m5pcse9e", "b_waimai_8gtog3x3_mc").b(e(order, i)).a();
        }
    }

    private void g(Order order, int i) {
        Object[] objArr = {order, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17a931ce2f602d8a9169c22c87696ab8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17a931ce2f602d8a9169c22c87696ab8");
        } else if (OrderListFragment.c) {
        } else {
            this.R.a();
            this.R.b(order);
        }
    }
}
