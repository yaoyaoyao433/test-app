package com.sankuai.waimai.sa.ui.assistant.chat;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.NoScrollGridView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class p implements g {
    public static ChangeQuickRedirect a;
    Context b;
    final m c;
    com.sankuai.waimai.sa.model.b d;
    private ViewGroup e;
    private NoScrollGridView f;
    private a g;

    public p(Context context, m mVar) {
        Object[] objArr = {context, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b66fceb10c031261e0a01c722ec155b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b66fceb10c031261e0a01c722ec155b");
            return;
        }
        this.b = context;
        this.c = mVar;
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.chat.g
    public final View a(int i, ViewGroup viewGroup) {
        Object[] objArr = {Integer.valueOf(i), viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46218b916f9cdd58637aee80010e53e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46218b916f9cdd58637aee80010e53e2");
        }
        if (this.e == null) {
            this.e = (ViewGroup) LayoutInflater.from(this.b).inflate(R.layout.wm_smart_assistant_notice_list_item_b, viewGroup, false);
            this.f = (NoScrollGridView) this.e.findViewById(R.id.sa_guide_notice_grid_view);
            this.g = new a();
            this.f.setAdapter((ListAdapter) this.g);
        }
        return this.e;
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.chat.g
    public final View a() {
        return this.e;
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.chat.g
    public final void a(com.sankuai.waimai.sa.model.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6127afae46fe84049775c23c4e8cc063", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6127afae46fe84049775c23c4e8cc063");
            return;
        }
        this.d = bVar;
        if (bVar == null || bVar.k == null) {
            return;
        }
        this.g.notifyDataSetChanged();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a extends BaseAdapter implements View.OnClickListener {
        public static ChangeQuickRedirect a;

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        public a() {
            Object[] objArr = {p.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dda8b4eb2b5227f7714ad4cd115dfeee", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dda8b4eb2b5227f7714ad4cd115dfeee");
            }
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab6134269c9f0b42febb62636e8ad48c", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab6134269c9f0b42febb62636e8ad48c")).intValue();
            }
            if (p.this.d == null || p.this.d.k == null || p.this.d.k.b == null) {
                return 0;
            }
            return p.this.d.k.b.size();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9865d2b576e62325b6d4b06f321d75a", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9865d2b576e62325b6d4b06f321d75a") : p.this.d.k.b.get(i);
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fb31d43a8bd1304f897c1b091cdf396", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fb31d43a8bd1304f897c1b091cdf396");
            }
            TextView textView = (TextView) LayoutInflater.from(p.this.b).inflate(R.layout.wm_smart_assistant_prologue_sub_item, viewGroup, false);
            textView.setBackground(p.this.b.getResources().getDrawable(R.drawable.wm_smart_assistant_item_bg_shape));
            textView.setTextColor(p.this.b.getResources().getColor(R.color.wm_smart_assistant_white_style_prologue_item_text_color));
            textView.setText(p.this.d.k.b.get(i).b);
            textView.setTag(Integer.valueOf(i));
            textView.setOnClickListener(this);
            return textView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66451f2ec8b5c6ac25a763b7de0d80b8", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66451f2ec8b5c6ac25a763b7de0d80b8");
                return;
            }
            Object tag = view.getTag();
            if (tag == null || !(tag instanceof Integer)) {
                return;
            }
            p pVar = p.this;
            int intValue = ((Integer) tag).intValue();
            Object[] objArr2 = {Integer.valueOf(intValue)};
            ChangeQuickRedirect changeQuickRedirect2 = p.a;
            if (PatchProxy.isSupport(objArr2, pVar, changeQuickRedirect2, false, "ddbedd9b22000e91e12ae67e3330836f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, pVar, changeQuickRedirect2, false, "ddbedd9b22000e91e12ae67e3330836f");
            } else if (pVar.d == null || pVar.d.k == null || pVar.d.k.b == null || pVar.d.k.b.size() <= intValue) {
            } else {
                pVar.c.a(pVar.d.k.b.get(intValue), false);
            }
        }
    }
}
