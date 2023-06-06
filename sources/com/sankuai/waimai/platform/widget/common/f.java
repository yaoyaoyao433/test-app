package com.sankuai.waimai.platform.widget.common;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class f<T> extends RecyclerView.a<RecyclerView.s> implements View.OnClickListener, View.OnLongClickListener {
    public static ChangeQuickRedirect c;
    protected Context d;
    protected e<T> e;
    protected List<T> f;
    protected a<T> g;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a<T> {
        boolean a(View view, T t, int i);

        void b(View view, T t, int i);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public long getItemId(int i) {
        return i;
    }

    public final void a(a<T> aVar) {
        this.g = aVar;
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed354c4487be531ce05fe46111f6e1f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed354c4487be531ce05fe46111f6e1f2");
            return;
        }
        this.f = new ArrayList();
        this.e = new e<>();
    }

    public f(Context context, List<T> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d1d5390462234173c8076b0ef65ba20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d1d5390462234173c8076b0ef65ba20");
            return;
        }
        this.d = context;
        if (list == null) {
            this.f = new ArrayList();
        } else {
            this.f = list;
        }
        this.e = new e<>();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "428596cc12d26d234224ff2d82efe38c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "428596cc12d26d234224ff2d82efe38c")).intValue();
        }
        e<T> eVar = this.e;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if ((PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "7f8589f6440fde8f489c8092377bb072", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "7f8589f6440fde8f489c8092377bb072")).intValue() : eVar.b.size()) == 0) {
            return super.getItemViewType(i);
        }
        return this.e.a(this.f.get(i), i);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public RecyclerView.s onCreateViewHolder(ViewGroup viewGroup, int i) {
        final b bVar;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aecd549682849b2340883d2efefb9faa", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aecd549682849b2340883d2efefb9faa");
        }
        e<T> eVar = this.e;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        int a2 = (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "502d3f061ada68fa007129752ab9142d", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "502d3f061ada68fa007129752ab9142d") : eVar.b.get(i)).a();
        Context context = this.d;
        Object[] objArr3 = {context, viewGroup, Integer.valueOf(a2)};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "966b2f75f83236651707cb814225b08b", RobustBitConfig.DEFAULT_VALUE)) {
            bVar = (b) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "966b2f75f83236651707cb814225b08b");
        } else {
            b bVar2 = new b(LayoutInflater.from(context).inflate(a2, viewGroup, false));
            bVar2.b = a2;
            bVar = bVar2;
        }
        Object[] objArr4 = {bVar};
        ChangeQuickRedirect changeQuickRedirect4 = c;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ded0aca813874d3577ddb526ea7337f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ded0aca813874d3577ddb526ea7337f8");
        } else {
            bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.common.f.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr5 = {view};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "9baa12d5b73fef9316227d7046073823", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "9baa12d5b73fef9316227d7046073823");
                    } else if (f.this.g != null) {
                        int adapterPosition = bVar.getAdapterPosition();
                        try {
                            f.this.g.b(bVar.itemView, f.this.f.get(adapterPosition), adapterPosition);
                        } catch (IndexOutOfBoundsException e) {
                            f.this.g.b(bVar.itemView, null, adapterPosition);
                            com.sankuai.waimai.foundation.utils.log.a.a("BaseRecycler", e);
                        }
                    }
                }
            });
            bVar.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.sankuai.waimai.platform.widget.common.f.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    Object[] objArr5 = {view};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "89c4886494986b182861da5462f39200", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "89c4886494986b182861da5462f39200")).booleanValue();
                    }
                    if (f.this.g != null) {
                        int adapterPosition = bVar.getAdapterPosition();
                        try {
                            return f.this.g.a(bVar.itemView, f.this.f.get(adapterPosition), adapterPosition);
                        } catch (IndexOutOfBoundsException e) {
                            f.this.g.a(bVar.itemView, null, adapterPosition);
                            com.sankuai.waimai.foundation.utils.log.a.a("BaseRecycler", e);
                        }
                    }
                    return false;
                }
            });
        }
        return bVar;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.s sVar, int i) {
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f11fdfa46a8ecea7b025a8a65a6e009", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f11fdfa46a8ecea7b025a8a65a6e009");
        } else {
            this.e.a((b) sVar, this.f.get(i), sVar.getAdapterPosition());
        }
    }

    public final f a(d<T> dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a99735c1a58438afa14eca9c6a8c0d5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a99735c1a58438afa14eca9c6a8c0d5f");
        }
        e<T> eVar = this.e;
        Object[] objArr2 = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "5581b66c29e2c6757f90dfebd92ac3ec", RobustBitConfig.DEFAULT_VALUE)) {
            e eVar2 = (e) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "5581b66c29e2c6757f90dfebd92ac3ec");
        } else {
            int a2 = dVar.a();
            if (eVar.b.get(a2) != null) {
                throw new IllegalArgumentException("An ItemViewDelegate is already registered for the viewType = " + a2 + ". Already registered ItemViewDelegate is " + eVar.b.get(a2));
            }
            eVar.b.put(a2, dVar);
        }
        return this;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51ab0cfe1342b493665f16d588c51f77", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51ab0cfe1342b493665f16d588c51f77")).intValue() : this.f.size();
    }

    public List<T> a() {
        return this.f;
    }

    public int a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1652c0fb689c07178ba1719595f0ce57", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1652c0fb689c07178ba1719595f0ce57")).intValue();
        }
        if (list == null) {
            return 0;
        }
        this.f.addAll(list);
        notifyDataSetChanged();
        return this.f.size();
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "666f787f05c691f560a07011d1e68603", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "666f787f05c691f560a07011d1e68603");
            return;
        }
        this.f.clear();
        notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int intValue;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44545ed77fda3812273df945ed7f88c4", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44545ed77fda3812273df945ed7f88c4");
        } else if (this.g == null || (intValue = ((Integer) view.getTag()).intValue()) < 0 || intValue > this.f.size()) {
        } else {
            this.g.b(view, this.f.get(intValue), intValue);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        int intValue;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1b3044104e40f7f8108dff952264e52", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1b3044104e40f7f8108dff952264e52")).booleanValue();
        }
        if (this.g == null || (intValue = ((Integer) view.getTag()).intValue()) < 0 || intValue > this.f.size()) {
            return false;
        }
        return this.g.a(view, this.f.get(intValue), intValue);
    }
}
