package com.sankuai.waimai.business.page.common.list.callback;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.list.model.b;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends RecyclerView.a<C0761a> {
    public static ChangeQuickRedirect a;
    public List<b.a> b;
    public b c;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void a(b.a aVar);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(@NonNull C0761a c0761a, int i) {
        final b.a aVar;
        C0761a c0761a2 = c0761a;
        Object[] objArr = {c0761a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e1d1e38a76f00372a6d0e4cc9702118", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e1d1e38a76f00372a6d0e4cc9702118");
        } else if (c0761a2 == null || this.b == null || i >= this.b.size() || (aVar = this.b.get(i)) == null) {
        } else {
            c0761a2.a.setText(aVar.b);
            c0761a2.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.common.list.callback.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19999f0be6b5d7829427b9e4e3550e01", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19999f0be6b5d7829427b9e4e3550e01");
                    } else if (a.this.c != null) {
                        a.this.c.a(aVar);
                    }
                }
            });
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final /* synthetic */ C0761a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7589f67e2778e5da6f7749dc7e6aae0c", RobustBitConfig.DEFAULT_VALUE) ? (C0761a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7589f67e2778e5da6f7749dc7e6aae0c") : new C0761a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_page_list_poi_list_item_popup_dislike_item, viewGroup, false));
    }

    public a(List<b.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d578554f2006dc854c57202ba69cc13", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d578554f2006dc854c57202ba69cc13");
        } else {
            this.b = list;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86e6e802e446ce00865793ee0f0cc932", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86e6e802e446ce00865793ee0f0cc932")).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        return this.b.size();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.common.list.callback.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0761a extends RecyclerView.s {
        public TextView a;
        public FrameLayout b;

        public C0761a(@NonNull View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.tv_dislike_item);
            this.b = (FrameLayout) view.findViewById(R.id.fl_dislike_reason);
        }
    }
}
