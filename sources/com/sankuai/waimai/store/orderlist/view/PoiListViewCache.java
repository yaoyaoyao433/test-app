package com.sankuai.waimai.store.orderlist.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ag;
import com.sankuai.waimai.store.orderlist.view.base.PoiTagView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class PoiListViewCache {
    public static ChangeQuickRedirect a;
    public final b b;
    public final a c;
    public final c d;
    public final Context e;
    final LayoutInflater f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final Drawable p;
    public final Drawable q;

    public PoiListViewCache(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36dbf113caf68e0ce30ee8e7c4c9956c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36dbf113caf68e0ce30ee8e7c4c9956c");
            return;
        }
        this.b = new b();
        this.c = new a();
        this.d = new c();
        this.e = context;
        this.f = LayoutInflater.from(this.e);
        Resources resources = this.e.getResources();
        this.h = resources.getColor(R.color.wm_common_text_auxiliary);
        this.g = resources.getColor(R.color.wm_common_text_emphasize);
        this.i = resources.getColor(R.color.wm_sg_color_ffff4e26);
        this.j = resources.getColor(R.color.wm_sg_color_80ff4e26);
        this.k = resources.getColor(R.color.wm_sg_color_37a2ee);
        this.l = resources.getColor(R.color.wm_sg_color_ffa735);
        this.m = resources.getColor(R.color.wm_sg_color_25c88b);
        this.n = resources.getColor(R.color.wm_sg_color_ff5959);
        this.o = resources.getColor(R.color.wm_sg_color_666666);
        this.p = resources.getDrawable(R.drawable.wm_sc_order_list_item_poi_bg_reservation);
        this.q = resources.getDrawable(R.drawable.wm_sc_order_list_item_poi_bg_reservation_only);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b extends ag<PoiTagView> {
        public static ChangeQuickRedirect c;

        public b() {
        }

        @Override // com.sankuai.waimai.foundation.utils.ag
        @NonNull
        public final /* synthetic */ PoiTagView a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d74746304b3f8d8d4b60157fe432a7df", RobustBitConfig.DEFAULT_VALUE) ? (PoiTagView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d74746304b3f8d8d4b60157fe432a7df") : (PoiTagView) PoiListViewCache.this.f.inflate(R.layout.wm_sc_order_list_poi_list_item_tag_normal, (ViewGroup) null);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class c extends ag<PoiTagWithPreTextView> {
        public static ChangeQuickRedirect c;

        public c() {
            Object[] objArr = {PoiListViewCache.this};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ea60388e7b3aa24ef59962cb9d27876", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ea60388e7b3aa24ef59962cb9d27876");
            }
        }

        @Override // com.sankuai.waimai.foundation.utils.ag
        @NonNull
        public final /* synthetic */ PoiTagWithPreTextView a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "479563d4bea3b201be6e6440e0c43846", RobustBitConfig.DEFAULT_VALUE) ? (PoiTagWithPreTextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "479563d4bea3b201be6e6440e0c43846") : new PoiTagWithPreTextView(PoiListViewCache.this.e);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends ag<TextView> {
        public static ChangeQuickRedirect c;

        public a() {
        }

        @Override // com.sankuai.waimai.foundation.utils.ag
        @NonNull
        public final /* synthetic */ TextView a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48bfcc107c85887e55110b820f36f909", RobustBitConfig.DEFAULT_VALUE) ? (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48bfcc107c85887e55110b820f36f909") : (TextView) PoiListViewCache.this.f.inflate(R.layout.wm_sc_order_list_poi_list_item_tag_coupon, (ViewGroup) null);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class PoiTagWithPreTextView extends FrameLayout {
        public static ChangeQuickRedirect a;
        public TextView b;
        public TextView c;
        public GradientDrawable d;
        public GradientDrawable e;

        public PoiTagWithPreTextView(Context context) {
            this(context, null);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "716d45a78da830983d0000ab94fcb364", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "716d45a78da830983d0000ab94fcb364");
            }
        }

        private PoiTagWithPreTextView(Context context, @Nullable AttributeSet attributeSet) {
            this(context, null, 0);
            Object[] objArr = {context, null};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e2068343c67f077379f3333d9fd5dad", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e2068343c67f077379f3333d9fd5dad");
            }
        }

        public PoiTagWithPreTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "483f7c3659aecf4eeae1be30a355bcd8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "483f7c3659aecf4eeae1be30a355bcd8");
                return;
            }
            LayoutInflater.from(getContext()).inflate(R.layout.wm_sc_common_widget_poi_tag_with_pre_text, (ViewGroup) this, true);
            this.c = (TextView) findViewById(R.id.text);
            this.b = (TextView) findViewById(R.id.pre_text);
            this.d = new GradientDrawable();
            this.e = new GradientDrawable();
        }
    }
}
