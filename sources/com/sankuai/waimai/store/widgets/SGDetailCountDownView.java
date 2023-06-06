package com.sankuai.waimai.store.widgets;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.legwork.bean.monitor.DaBaiBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGDetailCountDownView extends LinearLayout {
    public static ChangeQuickRedirect b;
    protected TextView c;
    protected TextView d;
    protected TextView e;
    protected TextView f;
    protected TextView g;

    public int getInflate() {
        return R.layout.wm_sc_view_good_detail_countdown;
    }

    public SGDetailCountDownView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc06b9ac45ed01ddf892bf9b9dfe3e23", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc06b9ac45ed01ddf892bf9b9dfe3e23");
        }
    }

    public SGDetailCountDownView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc54f5808b22e52e2ed8b3f891e772d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc54f5808b22e52e2ed8b3f891e772d3");
        }
    }

    public SGDetailCountDownView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89cbb4c4c0eeb5ecddfa06ab5e65ed6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89cbb4c4c0eeb5ecddfa06ab5e65ed6e");
        } else {
            a();
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b4d19e7f5fbfe1bf05829d676392c92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b4d19e7f5fbfe1bf05829d676392c92");
            return;
        }
        setOrientation(0);
        LayoutInflater.from(getContext()).inflate(getInflate(), (ViewGroup) this, true);
        this.c = (TextView) findViewById(R.id.countdown_hour);
        this.d = (TextView) findViewById(R.id.countdown_minute);
        this.e = (TextView) findViewById(R.id.countdown_second);
        this.f = (TextView) findViewById(R.id.two_point_in_text_middle_1);
        this.g = (TextView) findViewById(R.id.two_point_in_text_middle_2);
    }

    public void a(long j) {
        int i;
        int i2;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9a282dc5dc743995657477fa9748a87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9a282dc5dc743995657477fa9748a87");
            return;
        }
        int i3 = (int) (j / 1000);
        if (i3 < 0) {
            return;
        }
        int i4 = i3 % DaBaiBean.DABAI_DATA_EXPIRE_TIME;
        if (i3 > 3600) {
            i2 = (i3 / DaBaiBean.DABAI_DATA_EXPIRE_TIME) % 24;
            if (i4 != 0) {
                if (i4 > 60) {
                    int i5 = i4 / 60;
                    int i6 = i4 % 60;
                    r8 = i6 != 0 ? i6 : 0;
                    i = i5;
                } else {
                    r8 = i4;
                }
            }
            i = 0;
        } else {
            i = i3 / 60;
            int i7 = i3 % 60;
            r8 = i7 != 0 ? i7 : 0;
            i2 = 0;
        }
        TextView textView = this.c;
        StringBuilder sb = new StringBuilder();
        sb.append(i2 < 10 ? "0" : "");
        sb.append(i2);
        u.a(textView, sb.toString());
        TextView textView2 = this.d;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i < 10 ? "0" : "");
        sb2.append(i);
        u.a(textView2, sb2.toString());
        TextView textView3 = this.e;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(r8 < 10 ? "0" : "");
        sb3.append(r8);
        u.a(textView3, sb3.toString());
    }

    public final void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a48a55e81ab10dc9b5849c5c0f57547d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a48a55e81ab10dc9b5849c5c0f57547d");
            return;
        }
        e.a a = new e.a().c(i).a(h.a(getContext(), 4.0f));
        this.c.setBackground(a.a());
        this.d.setBackground(a.a());
        this.e.setBackground(a.a());
        this.c.setTextColor(i2);
        this.d.setTextColor(i2);
        this.e.setTextColor(i2);
        setPointColor(i3);
    }

    public void setTimerTextSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8644ac122ab15b57993a8acbfd48a341", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8644ac122ab15b57993a8acbfd48a341");
            return;
        }
        float f = i;
        this.c.setTextSize(f);
        this.d.setTextSize(f);
        this.e.setTextSize(f);
    }

    public void setPointColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26e755f8f9e95e22b174f0dff6c8d64a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26e755f8f9e95e22b174f0dff6c8d64a");
        } else if (i == -101) {
            u.b(this.f, this.g);
        } else {
            u.a(this.f, this.g);
            this.f.setTextColor(i);
            this.g.setTextColor(i);
        }
    }
}
