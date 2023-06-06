package com.sankuai.waimai.business.im.common.adapter;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.model.RiderImInfo;
import com.sankuai.waimai.foundation.utils.b;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends RecyclerView.a<C0730a> {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.business.im.callback.a b;
    private List<RiderImInfo.a> c;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(@NonNull C0730a c0730a, int i) {
        final C0730a c0730a2 = c0730a;
        Object[] objArr = {c0730a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5226099eefb47e94bceb4b3a2e6d4cfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5226099eefb47e94bceb4b3a2e6d4cfa");
            return;
        }
        final RiderImInfo.a aVar = (RiderImInfo.a) b.a(this.c, i);
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = C0730a.a;
        if (PatchProxy.isSupport(objArr2, c0730a2, changeQuickRedirect2, false, "d1c77e80c763d22b79871ecdc4f8ab62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, c0730a2, changeQuickRedirect2, false, "d1c77e80c763d22b79871ecdc4f8ab62");
            return;
        }
        c0730a2.d.setText(aVar.b);
        if (TextUtils.isEmpty(aVar.b)) {
            c0730a2.b.setVisibility(8);
        } else {
            c0730a2.b.setVisibility(0);
        }
        c0730a2.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.common.adapter.a.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a6397a4871bf3c662041235a071bc71c", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a6397a4871bf3c662041235a071bc71c");
                } else if (a.this.b != null) {
                    a.this.b.a(aVar);
                }
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final /* synthetic */ C0730a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaae4b1f432b4c1f7a449cc38e6c7a3b", RobustBitConfig.DEFAULT_VALUE) ? (C0730a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaae4b1f432b4c1f7a449cc38e6c7a3b") : new C0730a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_im_layout_problem_tag_item, viewGroup, false));
    }

    public a(com.sankuai.waimai.business.im.callback.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7748dc49d330b1e607c57d49a226f147", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7748dc49d330b1e607c57d49a226f147");
        } else {
            this.b = aVar;
        }
    }

    public final void a(List<RiderImInfo.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "927ec9aa72a2a1578ed85b26b597eb17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "927ec9aa72a2a1578ed85b26b597eb17");
            return;
        }
        this.c = list;
        notifyDataSetChanged();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd6ba04a18281fe055fe725df6db08f8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd6ba04a18281fe055fe725df6db08f8")).intValue();
        }
        if (this.c == null) {
            return 0;
        }
        return this.c.size();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.im.common.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0730a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        View b;
        public ImageView c;
        public TextView d;

        public C0730a(View view) {
            super(view);
            Object[] objArr = {a.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1927bd00b1a9983e507582e8389ce5ac", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1927bd00b1a9983e507582e8389ce5ac");
                return;
            }
            this.b = view.findViewById(R.id.tv_problem_tag_lly);
            this.c = (ImageView) view.findViewById(R.id.tv_problem_tag_icon);
            this.d = (TextView) view.findViewById(R.id.tv_problem_tag);
        }
    }
}
