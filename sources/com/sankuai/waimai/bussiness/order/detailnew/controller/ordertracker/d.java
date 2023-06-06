package com.sankuai.waimai.bussiness.order.detailnew.controller.ordertracker;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.f;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.g;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.ah;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends BaseAdapter implements c {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private Context d;
    private View e;
    private TextView f;
    private ListView g;
    private TextView h;
    private Dialog i;
    private List<f> j;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public static /* synthetic */ int a(d dVar, List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "75d0ca5bfb88f71b4ecc87b899545a06", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "75d0ca5bfb88f71b4ecc87b899545a06")).intValue();
        }
        if (list != null) {
            int size = list.size() - 1;
            while (size >= 0) {
                if (((f) list.get(size)).f == 1 || ((f) list.get(size)).f == 0) {
                    return size;
                }
                size--;
            }
        }
        return 0;
    }

    public d(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a9173045b082e45dccf6c2944ef8e8a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a9173045b082e45dccf6c2944ef8e8a");
        } else {
            this.d = context;
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.ordertracker.c
    public final void a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f7c4593b93ffa9713fbeb0d46dc4c0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f7c4593b93ffa9713fbeb0d46dc4c0c");
            return;
        }
        if (this.i == null) {
            this.b = com.sankuai.waimai.foundation.utils.g.a(this.d);
            View inflate = LayoutInflater.from(this.d).inflate(R.layout.wm_order_status_dialog_history_status_layout_new, (ViewGroup) null);
            this.f = (TextView) inflate.findViewById(R.id.dialog_title);
            this.e = inflate.findViewById(R.id.btn_close);
            this.g = (ListView) inflate.findViewById(R.id.status_list);
            this.h = (TextView) inflate.findViewById(R.id.bottom_tip);
            this.g.setAdapter((ListAdapter) this);
            ah.b(inflate, this.b, Integer.MIN_VALUE);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
            this.c = com.sankuai.waimai.foundation.utils.g.a(this.d) - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            ah.b(this.g, this.c, Integer.MIN_VALUE);
            this.i = new Dialog(this.d, 2131559198);
            Window window = this.i.getWindow();
            window.setLayout(-1, -2);
            window.setGravity(81);
            window.setWindowAnimations(2131558668);
            this.i.setContentView(inflate);
        }
        b(gVar);
        try {
            this.i.show();
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.e("error", "exception: " + e.getLocalizedMessage(), new Object[0]);
        }
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.ordertracker.d.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e99aacd31cbaef06cb65c4275c9d9c3", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e99aacd31cbaef06cb65c4275c9d9c3");
                } else if (d.this.i == null || !d.this.i.isShowing()) {
                } else {
                    d.this.i.dismiss();
                }
            }
        });
    }

    private void b(g gVar) {
        int i;
        int i2 = 0;
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45b033691e37a03e6367cad6edb00d73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45b033691e37a03e6367cad6edb00d73");
            return;
        }
        if (TextUtils.isEmpty(gVar.c)) {
            gVar.c = this.d.getResources().getString(R.string.wm_order_status_follow_order);
        }
        ah.a(this.f, gVar.c);
        ah.a(this.h, gVar.d);
        this.j = gVar.a;
        int a2 = com.sankuai.waimai.foundation.utils.g.a(this.d, 24.0f);
        int a3 = com.sankuai.waimai.foundation.utils.g.a(this.d, 20.0f);
        int i3 = a2 + a3;
        int a4 = com.sankuai.waimai.foundation.utils.g.a(this.d, 18.0f);
        int a5 = com.sankuai.waimai.foundation.utils.g.a(this.d, 16.0f);
        int i4 = a4 + a5;
        if (this.j != null) {
            i = 0;
            while (i2 < this.j.size()) {
                i += this.j.get(i2).g == 1 ? i2 == 0 ? a5 : i4 : i2 == 0 ? a3 : i3;
                i2++;
            }
        } else {
            i = 0;
        }
        int a6 = com.sankuai.waimai.foundation.utils.g.a(this.d, 300.0f);
        if (i <= a6) {
            a6 = i;
        }
        ah.b(this.g, Integer.MIN_VALUE, a6);
        notifyDataSetChanged();
        this.g.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.ordertracker.d.2
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0f05694feeb476c52c0d678ae94633e1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0f05694feeb476c52c0d678ae94633e1");
                    return;
                }
                d.this.g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                d.this.g.setSelection(d.a(d.this, d.this.j));
            }
        });
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.ordertracker.c
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e32d5d40c7072230decd6798bd5de15b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e32d5d40c7072230decd6798bd5de15b")).booleanValue() : this.i != null && this.i.isShowing();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fd2eaf2190130f2f5b2ee87066f8e39", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fd2eaf2190130f2f5b2ee87066f8e39")).intValue();
        }
        if (this.j == null) {
            return 0;
        }
        return this.j.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ee4eddf8260fa2cace11c7bac9d7390", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ee4eddf8260fa2cace11c7bac9d7390") : Integer.valueOf(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        View view2;
        int a2;
        int a3;
        int i2;
        int i3;
        int i4;
        int i5;
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0b4fba64b365ff642943e54bd1ab2bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0b4fba64b365ff642943e54bd1ab2bf");
        }
        if (view == null) {
            view2 = LayoutInflater.from(this.d).inflate(R.layout.wm_order_status_dialog_history_status_item_layout, viewGroup, false);
            ah.b(view2, this.c, Integer.MIN_VALUE);
            aVar = new a(view2);
        } else {
            aVar = (a) view.getTag();
            view2 = view;
        }
        f fVar = this.j.get(i);
        Object[] objArr2 = {Integer.valueOf(i), fVar};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "829f0eca94ba5b22ad619ef0b74d9491", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "829f0eca94ba5b22ad619ef0b74d9491");
        } else {
            if (fVar.g == 1) {
                a2 = com.sankuai.waimai.foundation.utils.g.a(d.this.d, 16.0f);
                a3 = com.sankuai.waimai.foundation.utils.g.a(d.this.d, 18.0f);
                i2 = 48;
                i3 = R.drawable.wm_order_detail_history_status_secondary_note_icon;
                i4 = 12;
                i5 = fVar.f != 2 ? -10066848 : -6711404;
                aVar.d.setMaxLines(2);
            } else {
                a2 = com.sankuai.waimai.foundation.utils.g.a(d.this.d, 20.0f);
                a3 = com.sankuai.waimai.foundation.utils.g.a(d.this.d, 24.0f);
                i2 = 16;
                i3 = R.drawable.wm_order_detail_history_status_first_level_note_icon;
                i4 = 14;
                i5 = fVar.f != 2 ? -13422034 : -6711404;
                aVar.d.setMaxLines(1);
            }
            int i6 = a2 / 2;
            int i7 = a3 + i6;
            ah.b(aVar.f, Integer.MIN_VALUE, i7);
            if (i == 0) {
                ah.a(aVar.b, Integer.MIN_VALUE, 0, Integer.MIN_VALUE, Integer.MIN_VALUE);
                ah.b(aVar.f, Integer.MIN_VALUE, i6);
                aVar.f.setVisibility(4);
            } else {
                ah.a(aVar.b, Integer.MIN_VALUE, a3, Integer.MIN_VALUE, Integer.MIN_VALUE);
                ah.b(aVar.f, Integer.MIN_VALUE, i7);
                aVar.f.setVisibility(0);
            }
            if (i == d.this.j.size() - 1) {
                aVar.g.setVisibility(8);
            } else {
                aVar.g.setVisibility(0);
            }
            aVar.d.setTextSize(1, i4);
            aVar.d.setTextColor(i5);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) aVar.e.getLayoutParams();
            layoutParams.gravity = i2;
            aVar.e.setLayoutParams(layoutParams);
            ah.b(aVar.c, Integer.MIN_VALUE, a2);
            if (fVar.g == 1) {
                b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
                c.b = d.this.d;
                c.d = i3;
                b.C0608b a4 = c.a((View) aVar.c);
                a4.f = ImageQualityUtil.a();
                a4.i = i3;
                a4.j = i3;
                a4.a(aVar.c);
            } else {
                b.C0608b c2 = com.sankuai.meituan.mtimageloader.loader.a.c();
                c2.b = d.this.d;
                c2.c = fVar.e;
                b.C0608b a5 = c2.a((View) aVar.c);
                a5.f = ImageQualityUtil.a();
                a5.i = i3;
                a5.j = i3;
                a5.a(aVar.c);
            }
            if (fVar.f == 2) {
                aVar.f.setBackgroundColor(-2039584);
                aVar.g.setBackgroundColor(-2039584);
            } else {
                aVar.f.setBackgroundColor(-11935);
                int i8 = 1 + i;
                if (i8 < d.this.j.size()) {
                    f fVar2 = d.this.j.get(i8);
                    if (fVar2 != null && fVar2.f == 2) {
                        aVar.g.setBackgroundColor(-2039584);
                    } else {
                        aVar.g.setBackgroundColor(-11935);
                    }
                }
            }
            aVar.d.setText(fVar.b);
            aVar.e.setText(fVar.d);
        }
        view2.setTag(aVar);
        return view2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a {
        public static ChangeQuickRedirect a;
        View b;
        ImageView c;
        public TextView d;
        public TextView e;
        public View f;
        public View g;

        public a(View view) {
            Object[] objArr = {d.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc41159ef526f7538ed614893ebd3cdc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc41159ef526f7538ed614893ebd3cdc");
                return;
            }
            this.b = view.findViewById(R.id.status_node_desc_layout);
            this.c = (ImageView) view.findViewById(R.id.status_node_icon);
            this.d = (TextView) view.findViewById(R.id.status_node_desc);
            this.e = (TextView) view.findViewById(R.id.status_node_time);
            this.f = view.findViewById(R.id.status_node_top_timeline);
            this.g = view.findViewById(R.id.status_node_bottom_timeline);
        }
    }
}
