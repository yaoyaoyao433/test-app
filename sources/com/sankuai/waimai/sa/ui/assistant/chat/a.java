package com.sankuai.waimai.sa.ui.assistant.chat;

import android.content.Context;
import android.graphics.Rect;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements g {
    public static ChangeQuickRedirect a;
    Context b;
    private ViewGroup c;
    private com.sankuai.waimai.sa.ui.assistant.adapter.a d;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc463f8784f157db7bce7052ad48cca8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc463f8784f157db7bce7052ad48cca8");
        } else {
            this.b = context;
        }
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.chat.g
    public final View a(int i, ViewGroup viewGroup) {
        Object[] objArr = {Integer.valueOf(i), viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3eaf1b580cb885259370c273ab36e6d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3eaf1b580cb885259370c273ab36e6d6");
        }
        if (this.c == null) {
            this.c = (ViewGroup) LayoutInflater.from(this.b).inflate(R.layout.wm_smart_assistant_chat_alarm_clock_layout, viewGroup, false);
            RecyclerView recyclerView = (RecyclerView) this.c.findViewById(R.id.sa_alarm_clock_container);
            recyclerView.setLayoutManager(new LinearLayoutManager(this.b, 1, false));
            this.d = new com.sankuai.waimai.sa.ui.assistant.adapter.a();
            recyclerView.setAdapter(this.d);
            recyclerView.addItemDecoration(new C1137a());
        }
        return this.c;
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.chat.g
    public final View a() {
        return this.c;
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.chat.g
    public final void a(com.sankuai.waimai.sa.model.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00f1a7af8950d49f871696b4102794d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00f1a7af8950d49f871696b4102794d9");
        } else if (bVar == null || CollectionUtils.isEmpty(bVar.l)) {
        } else {
            com.sankuai.waimai.sa.ui.assistant.adapter.a aVar = this.d;
            List<com.sankuai.waimai.sa.model.a> list = bVar.l;
            Object[] objArr2 = {list};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.sa.ui.assistant.adapter.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "6671d352c5ba4f192b9fc56b5182a85d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "6671d352c5ba4f192b9fc56b5182a85d");
                return;
            }
            aVar.b = list;
            aVar.notifyDataSetChanged();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.sa.ui.assistant.chat.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C1137a extends RecyclerView.f {
        public static ChangeQuickRedirect a;
        private final int c;

        public C1137a() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41e26f85f5389db8b8758c12d95db9e8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41e26f85f5389db8b8758c12d95db9e8");
            } else {
                this.c = com.sankuai.waimai.foundation.utils.g.a(a.this.b, 10.0f);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.f
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            Object[] objArr = {rect, view, recyclerView, state};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6faf92ebad5e27a3bd87e93283ccf70f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6faf92ebad5e27a3bd87e93283ccf70f");
                return;
            }
            rect.left = 0;
            rect.right = 0;
            rect.bottom = 0;
            if (recyclerView.getChildAdapterPosition(view) > 0) {
                rect.top = this.c;
            } else {
                rect.top = 0;
            }
        }
    }
}
