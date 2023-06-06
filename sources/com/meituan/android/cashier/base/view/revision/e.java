package com.meituan.android.cashier.base.view.revision;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.legwork.bean.monitor.DaBaiBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e extends LinearLayout implements g {
    public static ChangeQuickRedirect a;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private LinearLayout k;

    public e(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b27353a60fb89778195be5ffba7cd71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b27353a60fb89778195be5ffba7cd71");
        } else {
            b();
        }
    }

    public e(Context context, String str) {
        super(context);
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4531b382143ba2b2ed753eb7733ca4de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4531b382143ba2b2ed753eb7733ca4de");
            return;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa6ffa35a64749b3aaf97122209b3567", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa6ffa35a64749b3aaf97122209b3567");
            return;
        }
        b();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.j.setText(str);
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "385b34418a66ed559dc1db312c4ab938", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "385b34418a66ed559dc1db312c4ab938");
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.cashier__timer, this);
        this.b = (TextView) findViewById(R.id.remain_time_hour1);
        this.c = (TextView) findViewById(R.id.remain_time_hour2);
        this.d = (TextView) findViewById(R.id.colon_between_hour_and_min);
        this.e = (TextView) findViewById(R.id.remain_time_min1);
        this.f = (TextView) findViewById(R.id.remain_time_min2);
        this.g = (TextView) findViewById(R.id.remain_time_sec1);
        this.h = (TextView) findViewById(R.id.remain_time_sec2);
        this.i = (TextView) findViewById(R.id.cashier_no_remaining_time);
        this.j = (TextView) findViewById(R.id.cashier_remaining_time_txt);
        this.k = (LinearLayout) findViewById(R.id.cashier_remaining_time_value);
    }

    @Override // com.meituan.android.cashier.base.view.revision.g
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2123e3a832e05a54c7195e2f04b9bbe4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2123e3a832e05a54c7195e2f04b9bbe4");
            return;
        }
        int i = ((int) j) / 1000;
        int i2 = i / DaBaiBean.DABAI_DATA_EXPIRE_TIME;
        int i3 = i % DaBaiBean.DABAI_DATA_EXPIRE_TIME;
        int i4 = i3 / 60;
        int i5 = i3 % 60;
        if (i2 > 0) {
            this.b.setVisibility(0);
            this.c.setVisibility(0);
            this.d.setVisibility(0);
            this.b.setText(String.valueOf(i2 / 10));
            this.c.setText(String.valueOf(i2 % 10));
        } else {
            this.b.setVisibility(8);
            this.c.setVisibility(8);
            this.d.setVisibility(8);
        }
        this.e.setText(String.valueOf(i4 / 10));
        this.f.setText(String.valueOf(i4 % 10));
        this.g.setText(String.valueOf(i5 / 10));
        this.h.setText(String.valueOf(i5 % 10));
        this.i.setVisibility(8);
        this.j.setVisibility(0);
        this.k.setVisibility(0);
    }

    @Override // com.meituan.android.cashier.base.view.revision.g
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48a6f92fbe7f6abb8186692d8e2f5947", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48a6f92fbe7f6abb8186692d8e2f5947");
            return;
        }
        this.i.setVisibility(0);
        this.j.setVisibility(8);
        this.k.setVisibility(8);
    }
}
