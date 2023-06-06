package com.meituan.android.pay.desk.payment.view.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.pay.common.payment.bean.installment.Period;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends BaseAdapter {
    public static ChangeQuickRedirect a;
    private Context b;
    private List<Period> c;
    private boolean d;
    @MTPaySuppressFBWarnings({"URF_UNREAD_FIELD"})
    private Activity e;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public a(Activity activity, Context context) {
        Object[] objArr = {activity, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c57f9b5b6488b91588e83a4f111f5aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c57f9b5b6488b91588e83a4f111f5aa");
            return;
        }
        this.b = context;
        this.e = activity;
    }

    public final void a(List<Period> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "098e5e60fe254938d775e3900a20bf51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "098e5e60fe254938d775e3900a20bf51");
            return;
        }
        this.c = list;
        a(z);
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "322bbdb33f63d148210665f2fc8ebe1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "322bbdb33f63d148210665f2fc8ebe1d");
            return;
        }
        this.d = z;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae06e0846168dc4323bfd829777ba2da", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae06e0846168dc4323bfd829777ba2da")).intValue();
        }
        if (this.c == null) {
            return 0;
        }
        return this.c.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5074c3cc10df37f5ec0bcafa32204f56", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5074c3cc10df37f5ec0bcafa32204f56") : this.c.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C0325a c0325a;
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a15d931f14ba5bddba4dbb22cadfa3b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a15d931f14ba5bddba4dbb22cadfa3b3");
        }
        if (view == null) {
            view = LayoutInflater.from(this.b).inflate(R.layout.mpay__installment_period_item, viewGroup, false);
            c0325a = new C0325a();
            c0325a.a = (LinearLayout) view.findViewById(R.id.mpay__installment_period_item);
            c0325a.b = (TextView) view.findViewById(R.id.mpay__installment_period);
            c0325a.c = (TextView) view.findViewById(R.id.mpay__installment_fee);
            view.setTag(c0325a);
        } else {
            c0325a = (C0325a) view.getTag();
        }
        Period period = this.c.get(i);
        if (period != null) {
            c0325a.b.setText(period.getTitle());
            c0325a.c.setText(period.getContent());
            if (period.isSelected() && this.d) {
                c0325a.a.setBackgroundResource(R.drawable.mpay__installment_period_selected);
                c0325a.b.setTextColor(ContextCompat.getColor(this.b, R.color.mpay__installment_text_color));
                c0325a.c.setTextColor(ContextCompat.getColor(this.b, R.color.mpay__installment_text_color));
            } else {
                c0325a.a.setBackgroundResource(R.drawable.mpay__installment_period_unselected);
                c0325a.b.setTextColor(ContextCompat.getColor(this.b, R.color.mpay__black0));
                c0325a.c.setTextColor(ContextCompat.getColor(this.b, R.color.mpay__black3));
            }
            if (!i.a((Collection) period.getCoupons()) && period.getCoupons().get(0) != null) {
                c0325a.c.setTextColor(ContextCompat.getColor(this.b, R.color.mpay__installment_text_color));
                c0325a.c.setText(period.getCoupons().get(0).getContent());
            }
        }
        return view;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.pay.desk.payment.view.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0325a {
        public LinearLayout a;
        public TextView b;
        public TextView c;

        public C0325a() {
        }
    }
}
