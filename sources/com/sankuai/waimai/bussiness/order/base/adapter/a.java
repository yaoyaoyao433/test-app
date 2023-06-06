package com.sankuai.waimai.bussiness.order.base.adapter;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends BaseAdapter {
    public static ChangeQuickRedirect a;
    private final Context b;
    private final LayoutInflater c;
    private CharSequence[] d;
    private int e;
    private int f;
    private int g;
    private final int h;
    private final int i;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public a(Context context, CharSequence[] charSequenceArr) {
        Object[] objArr = {context, charSequenceArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65c3c0dc2a7c3210b8610e3150d48487", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65c3c0dc2a7c3210b8610e3150d48487");
            return;
        }
        this.e = -1;
        this.h = R.color.wm_common_text_main;
        this.i = R.color.wm_common_text_highlight;
        this.b = context;
        this.d = charSequenceArr;
        this.c = LayoutInflater.from(this.b);
        this.f = this.i;
        this.g = R.layout.wm_order_confirm_adapter_dialog_list_item;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "262429ecbbffdb38ad061c4268781fc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "262429ecbbffdb38ad061c4268781fc2");
        } else if (i == this.e) {
        } else {
            this.e = i;
            notifyDataSetChanged();
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        if (this.d == null) {
            return 0;
        }
        return this.d.length;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public final CharSequence getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52de720ec06bb2ecbbf4b8487598eca5", RobustBitConfig.DEFAULT_VALUE)) {
            return (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52de720ec06bb2ecbbf4b8487598eca5");
        }
        if (this.d == null) {
            return null;
        }
        return this.d[i];
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C0882a c0882a;
        int i2;
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "391d85a7cf00c2aab5878a939108a0aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "391d85a7cf00c2aab5878a939108a0aa");
        }
        if (view == null) {
            view = this.c.inflate(this.g, viewGroup, false);
            c0882a = new C0882a(view);
            view.setTag(c0882a);
        } else {
            c0882a = (C0882a) view.getTag();
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = C0882a.a;
        if (PatchProxy.isSupport(objArr2, c0882a, changeQuickRedirect2, false, "fe8a3a8f16de88d9a0992ff61424a891", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, c0882a, changeQuickRedirect2, false, "fe8a3a8f16de88d9a0992ff61424a891");
        } else {
            c0882a.b.setText(a.this.getItem(i));
            boolean z = a.this.e == i;
            if (z) {
                i2 = a.this.f;
            } else {
                i2 = a.this.h;
            }
            c0882a.b.setTextColor(a.this.b.getResources().getColor(i2));
            if (z) {
                c0882a.c.setVisibility(0);
            } else {
                c0882a.c.setVisibility(4);
            }
        }
        return view;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.base.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0882a {
        public static ChangeQuickRedirect a;
        final TextView b;
        ImageView c;

        private C0882a(View view) {
            Object[] objArr = {a.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c373b0fec211e673930202802961af5b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c373b0fec211e673930202802961af5b");
                return;
            }
            this.b = (TextView) view.findViewById(R.id.dialog_item_text);
            this.c = (ImageView) view.findViewById(R.id.dialog_select_img);
        }
    }
}
