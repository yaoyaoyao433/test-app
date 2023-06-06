package com.meituan.android.legwork.ui.component.pickerview.view;

import android.support.constraint.R;
import android.view.View;
import com.meituan.android.legwork.ui.component.pickerview.lib.WheelView;
import com.meituan.android.legwork.ui.component.pickerview.listener.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b<T> {
    public static ChangeQuickRedirect a;
    public WheelView b;
    public WheelView c;
    public WheelView d;
    public List<T> e;
    public List<List<T>> f;
    public List<List<List<T>>> g;
    public boolean h;
    public c i;
    public c j;
    public int k;
    public int l;
    public int m;
    public WheelView.b n;
    public float o;
    private View p;

    public b(View view, Boolean bool) {
        Object[] objArr = {view, bool};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5a6859bb33a85f85fce17e09f139c41", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5a6859bb33a85f85fce17e09f139c41");
            return;
        }
        this.o = 1.6f;
        this.h = bool.booleanValue();
        this.p = view;
        this.b = (WheelView) view.findViewById(R.id.legwork_send_picker_options1);
        this.c = (WheelView) view.findViewById(R.id.legwork_send_picker_options2);
        this.d = (WheelView) view.findViewById(R.id.legwork_send_picker_options3);
    }

    public final void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b47a59342ab96dcbd04a0bb8343d1e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b47a59342ab96dcbd04a0bb8343d1e1");
            return;
        }
        if (this.h) {
            b(i, i2, i3);
        }
        this.b.setCurrentItem(i);
        this.c.setCurrentItem(i2);
        this.d.setCurrentItem(i3);
    }

    private void b(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b08676cd46a9b1addd36dd73d53fa3a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b08676cd46a9b1addd36dd73d53fa3a0");
            return;
        }
        if (this.f != null) {
            while (i >= this.f.size()) {
                i--;
            }
            this.c.setAdapter(new com.meituan.android.legwork.ui.component.pickerview.adapter.a(this.f.get(i)));
            this.c.setCurrentItem(i2);
        }
        if (this.g != null) {
            while (i2 >= this.g.get(i).size()) {
                i2--;
            }
            this.d.setAdapter(new com.meituan.android.legwork.ui.component.pickerview.adapter.a(this.g.get(i).get(i2)));
            this.d.setCurrentItem(i3);
        }
    }
}
