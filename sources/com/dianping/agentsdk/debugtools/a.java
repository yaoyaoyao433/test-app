package com.dianping.agentsdk.debugtools;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends BaseAdapter {
    public static ChangeQuickRedirect a;
    private List<b> b;
    private Context c;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public a(Context context, List<b> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf3b213498c3ad861e46c81ec73b0a31", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf3b213498c3ad861e46c81ec73b0a31");
            return;
        }
        this.b = new ArrayList();
        this.b = list;
        this.c = context;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3eb93f6a49b0c845c2bf7b6420cfca26", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3eb93f6a49b0c845c2bf7b6420cfca26")).intValue() : this.b.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ede007fd89992654233d81265bfaef24", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ede007fd89992654233d81265bfaef24") : this.b.get(i);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf92427a3b6d6adc37d1368397d83aff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf92427a3b6d6adc37d1368397d83aff");
        } else {
            this.b.clear();
        }
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6ff905f80cb1297c43c727915d8b64a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6ff905f80cb1297c43c727915d8b64a");
        }
        b bVar = (b) getItem(i);
        if (view == null) {
            Object[] objArr2 = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "42eece7e243c2f2ab7712b58785d5308", RobustBitConfig.DEFAULT_VALUE)) {
                view = (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "42eece7e243c2f2ab7712b58785d5308");
            } else {
                view = LayoutInflater.from(this.c).inflate(R.layout.agentmap_list_item, viewGroup, false);
                C0050a c0050a = new C0050a();
                c0050a.a = (TextView) view.findViewById(R.id.agentmap_item_agentkey);
                c0050a.b = (TextView) view.findViewById(R.id.agentmap_item_agent_classname);
                view.setTag(c0050a);
            }
        }
        C0050a c0050a2 = (C0050a) view.getTag();
        c0050a2.a.setText(bVar.b);
        c0050a2.b.setText(bVar.c);
        return view;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.agentsdk.debugtools.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0050a {
        public TextView a;
        public TextView b;

        public C0050a() {
        }
    }
}
