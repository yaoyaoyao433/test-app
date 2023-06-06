package com.meituan.android.legwork.ui.adapter;

import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.legwork.bean.im.IMMsgTemplate;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class h extends RecyclerView.a<b> {
    public static ChangeQuickRedirect a;
    public List<IMMsgTemplate> b;
    public a c;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(IMMsgTemplate iMMsgTemplate);
    }

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e06732f469a7d1135a5ec1fa4001fd10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e06732f469a7d1135a5ec1fa4001fd10");
        } else {
            this.b = new ArrayList();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(b bVar, int i) {
        b bVar2 = bVar;
        Object[] objArr = {bVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88f95a456ea9af9081b42eab96f4ad48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88f95a456ea9af9081b42eab96f4ad48");
            return;
        }
        IMMsgTemplate iMMsgTemplate = this.b.get(bVar2.getAdapterPosition());
        bVar2.a.setText(iMMsgTemplate.msg);
        bVar2.a.setOnClickListener(i.a(this, iMMsgTemplate));
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4854aa9a6390d42fcff45d94e7f566d1", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4854aa9a6390d42fcff45d94e7f566d1") : new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.legwork_im_item_template, viewGroup, false));
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b00c8b7bdf3a374b877288a87237e6b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b00c8b7bdf3a374b877288a87237e6b")).intValue() : this.b.size();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    class b extends RecyclerView.s {
        public TextView a;

        public b(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.template_text);
        }
    }
}
