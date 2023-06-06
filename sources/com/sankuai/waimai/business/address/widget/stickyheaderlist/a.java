package com.sankuai.waimai.business.address.widget.stickyheaderlist;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.BaseAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends BaseAdapter implements b {
    public static ChangeQuickRedirect a;
    public final b b;
    InterfaceC0727a c;
    private final List<View> d;
    private final Context e;
    private Drawable f;
    private int g;
    private DataSetObserver h;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.address.widget.stickyheaderlist.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0727a {
        void a(View view, int i, long j);
    }

    @Override // android.widget.Adapter
    public final /* synthetic */ View getView(final int i, View view, ViewGroup viewGroup) {
        boolean z;
        View view2;
        View a2;
        View view3;
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebd7fedfe1add10c71bfa1051eb08ed1", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebd7fedfe1add10c71bfa1051eb08ed1");
        }
        c cVar = view == null ? new c(this.e) : (c) view;
        View view4 = this.b.getView(i, cVar.b, viewGroup);
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e231d8acbe65c093c446813864cdeb6", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e231d8acbe65c093c446813864cdeb6")).booleanValue();
        } else {
            z = i != 0 && this.b.a(i) == this.b.a(i + (-1));
        }
        if (z) {
            Object[] objArr3 = {cVar};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2ab3f303e7e2dfb0efc8cf6abead64e3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2ab3f303e7e2dfb0efc8cf6abead64e3");
            } else {
                View view5 = cVar.e;
                if (view5 != null) {
                    view5.setVisibility(0);
                    this.d.add(view5);
                }
            }
            view3 = null;
        } else {
            Object[] objArr4 = {cVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "db15fbbebb83b6489de083a2b01462bf", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (View) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "db15fbbebb83b6489de083a2b01462bf");
            } else {
                if (cVar.e == null) {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "25172ef2449e0f7c05e38aea6488e6f1", RobustBitConfig.DEFAULT_VALUE)) {
                        view2 = (View) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "25172ef2449e0f7c05e38aea6488e6f1");
                    } else {
                        view2 = this.d.size() > 0 ? this.d.remove(0) : null;
                    }
                } else {
                    view2 = cVar.e;
                }
                a2 = this.b.a(i, view2, cVar);
                if (a2 == null) {
                    throw new NullPointerException("Header view must not be null.");
                }
                a2.setClickable(true);
                a2.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.address.widget.stickyheaderlist.a.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view6) {
                        Object[] objArr6 = {view6};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "aab606d509a08d1e7857df924c52fc93", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "aab606d509a08d1e7857df924c52fc93");
                        } else if (a.this.c != null) {
                            a.this.c.a(view6, i, a.this.b.a(i));
                        }
                    }
                });
            }
            view3 = a2;
        }
        Drawable drawable = this.f;
        int i2 = this.g;
        Object[] objArr6 = {view4, view3, drawable, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect6 = c.a;
        if (PatchProxy.isSupport(objArr6, cVar, changeQuickRedirect6, false, "572810e31b8d586e46699721ec89e14f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, cVar, changeQuickRedirect6, false, "572810e31b8d586e46699721ec89e14f");
        } else if (view4 == null) {
            throw new NullPointerException("List view item must not be null.");
        } else {
            if (cVar.b != view4) {
                cVar.removeView(cVar.b);
                cVar.b = view4;
                ViewParent parent = view4.getParent();
                if (parent != null && parent != cVar && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(view4);
                }
                cVar.addView(view4);
            }
            if (cVar.e != view3) {
                if (cVar.e != null) {
                    cVar.removeView(cVar.e);
                }
                cVar.e = view3;
                if (view3 != null) {
                    cVar.addView(view3);
                }
            }
            if (cVar.c != drawable) {
                cVar.c = drawable;
                cVar.d = i2;
                cVar.invalidate();
            }
        }
        return cVar;
    }

    public a(Context context, b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e835202a9ea69ab96a724f87cca3780c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e835202a9ea69ab96a724f87cca3780c");
            return;
        }
        this.d = new LinkedList();
        this.h = new DataSetObserver() { // from class: com.sankuai.waimai.business.address.widget.stickyheaderlist.a.1
            public static ChangeQuickRedirect a;

            @Override // android.database.DataSetObserver
            public final void onInvalidated() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1deb0246f6f35e91203d550ea431f3af", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1deb0246f6f35e91203d550ea431f3af");
                    return;
                }
                a.this.d.clear();
                a.super.notifyDataSetInvalidated();
            }

            @Override // android.database.DataSetObserver
            public final void onChanged() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b87165d25af2d4e9c74c0f1eea485782", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b87165d25af2d4e9c74c0f1eea485782");
                } else {
                    a.super.notifyDataSetChanged();
                }
            }
        };
        this.e = context;
        this.b = bVar;
        bVar.registerDataSetObserver(this.h);
    }

    public final void a(Drawable drawable, int i) {
        Object[] objArr = {drawable, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f757609db50fe534593f770e729e4577", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f757609db50fe534593f770e729e4577");
            return;
        }
        this.f = drawable;
        this.g = i;
        notifyDataSetChanged();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b9c930c8ad9516bc637d4173194abcc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b9c930c8ad9516bc637d4173194abcc")).booleanValue() : this.b.areAllItemsEnabled();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1906ce12d1112a3e6c3ba7a97a75e30", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1906ce12d1112a3e6c3ba7a97a75e30")).booleanValue() : this.b.isEnabled(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7e43738d32392e62c880d53bc100a69", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7e43738d32392e62c880d53bc100a69")).intValue() : this.b.getCount();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac6ec3c9e237446f8fca601b9359846f", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac6ec3c9e237446f8fca601b9359846f") : this.b.getItem(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baf294fe992d09e1bff64d2bd44ef564", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baf294fe992d09e1bff64d2bd44ef564")).longValue() : this.b.getItemId(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74bf7e26840b8055a396cc2d37c158a2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74bf7e26840b8055a396cc2d37c158a2")).booleanValue() : this.b.hasStableIds();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c584016e75255bc59c2bcf0c25b6a819", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c584016e75255bc59c2bcf0c25b6a819")).intValue() : this.b.getItemViewType(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef964ef96d441e5c074fb943362ec8d3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef964ef96d441e5c074fb943362ec8d3")).intValue() : this.b.getViewTypeCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean isEmpty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "299e3dc9beba4d718bc91000c7593b63", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "299e3dc9beba4d718bc91000c7593b63")).booleanValue() : this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5c1dd1763f05005690ac9533c2450a8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5c1dd1763f05005690ac9533c2450a8")).booleanValue() : this.b.equals(obj);
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9de33cb7172f352bb85b8610c1b8c1bd", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9de33cb7172f352bb85b8610c1b8c1bd") : ((BaseAdapter) this.b).getDropDownView(i, view, viewGroup);
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2369f0bf559e52809c228f17b01ac368", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2369f0bf559e52809c228f17b01ac368")).intValue() : this.b.hashCode();
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1f8765bdfe2cc328ab200e70b99acca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1f8765bdfe2cc328ab200e70b99acca");
        } else {
            ((BaseAdapter) this.b).notifyDataSetChanged();
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97a9c7000979b8bab2d1f7398899cb53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97a9c7000979b8bab2d1f7398899cb53");
        } else {
            ((BaseAdapter) this.b).notifyDataSetInvalidated();
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "833d9b036e2f0816c39e38ce58330be5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "833d9b036e2f0816c39e38ce58330be5") : this.b.toString();
    }

    @Override // com.sankuai.waimai.business.address.widget.stickyheaderlist.b
    public final View a(int i, View view, ViewGroup viewGroup) {
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ff81de997709e92d1da06a994410cce", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ff81de997709e92d1da06a994410cce") : this.b.a(i, view, viewGroup);
    }

    @Override // com.sankuai.waimai.business.address.widget.stickyheaderlist.b
    public final long a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34e1e1db551c81a6a7736a58c38678f6", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34e1e1db551c81a6a7736a58c38678f6")).longValue() : this.b.a(i);
    }
}
