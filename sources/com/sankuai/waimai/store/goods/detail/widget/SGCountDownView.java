package com.sankuai.waimai.store.goods.detail.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import com.meituan.android.legwork.bean.monitor.DaBaiBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.util.b;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.widgets.SGDetailCountDownView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGCountDownView extends SGDetailCountDownView {
    public static ChangeQuickRedirect a;
    private a h;
    private CountDownTimer i;
    private boolean j;
    private long k;
    private Drawable l;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    interface a {
    }

    @Override // com.sankuai.waimai.store.widgets.SGDetailCountDownView
    public int getInflate() {
        return R.layout.wm_sc_view_countdown;
    }

    public SGCountDownView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94c968bd90546f536b8f009d5e8b9e78", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94c968bd90546f536b8f009d5e8b9e78");
            return;
        }
        this.j = false;
        this.k = 0L;
        this.l = null;
    }

    public SGCountDownView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59648fa10e49f285343f3c655082adc9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59648fa10e49f285343f3c655082adc9");
            return;
        }
        this.j = false;
        this.k = 0L;
        this.l = null;
    }

    @Override // com.sankuai.waimai.store.widgets.SGDetailCountDownView
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00bc7fa160872261ab30812460723d45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00bc7fa160872261ab30812460723d45");
            return;
        }
        super.a();
        if (this.l == null) {
            this.l = e.a(getContext(), new int[]{R.color.wm_sg_color_F75599, R.color.wm_sg_color_FF432B}, (int) R.dimen.wm_sc_common_dimen_2);
        }
        setTimeBackGround(this.l);
    }

    public void setTimeBackGround(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "316e29a8f3bf6391e34ce7c0aba848b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "316e29a8f3bf6391e34ce7c0aba848b9");
        } else if (p.a(this.c, this.d, this.e, this.l)) {
        } else {
            this.c.setBackground(drawable);
            this.d.setBackground(drawable);
            this.e.setBackground(drawable);
        }
    }

    public void setSGCountDownListener(a aVar) {
        this.h = aVar;
    }

    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10ca8435f229d7b25eba0562f7ac02b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10ca8435f229d7b25eba0562f7ac02b7");
        } else if (p.a(this.i)) {
        } else {
            this.j = false;
            this.i.cancel();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.SGDetailCountDownView
    public final void a(long j) {
        int i;
        int i2;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc7ed0ce84f7dcd0f3c450bcc759a303", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc7ed0ce84f7dcd0f3c450bcc759a303");
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
        u.a(this.c, a(i2));
        u.a(this.d, a(i));
        u.a(this.e, a(r8));
    }

    private String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7a93a2c62e945cdc8a9c9593cde3668", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7a93a2c62e945cdc8a9c9593cde3668");
        }
        if (i < 10) {
            return b.a(getContext(), R.string.wm_sg_cdq_sale_cell_count_time, String.valueOf(i));
        }
        return String.valueOf(i);
    }
}
