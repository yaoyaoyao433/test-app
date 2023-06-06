package com.sankuai.waimai.bussiness.order.confirm.pgablock.remarkinfo;

import android.app.Activity;
import android.graphics.Rect;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.model.FieldInfo;
import com.sankuai.waimai.bussiness.order.confirm.helper.c;
import com.sankuai.waimai.bussiness.order.confirm.helper.d;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements d {
    public static ChangeQuickRedirect a;
    public Activity b;
    com.sankuai.waimai.bussiness.order.confirm.a c;
    View d;
    int e;
    public TextView f;
    public FieldInfo g;
    public String h;
    boolean i;
    public int j;
    private boolean k;

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.d
    public final int d() {
        return 3;
    }

    public static /* synthetic */ void a(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "578287addd09ccff8bbdf34bc971bcf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "578287addd09ccff8bbdf34bc971bcf9");
        } else if (aVar.e()) {
            JudasManualManager.a("b_waimai_baujmpwn_mc", "c_ykhs39e", AppUtil.generatePageInfoKey(aVar.b)).a();
        }
    }

    public a(Activity activity, com.sankuai.waimai.bussiness.order.confirm.a aVar, View view) {
        Object[] objArr = {activity, aVar, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "471bc07633703a56ef9ac0268ae2e07a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "471bc07633703a56ef9ac0268ae2e07a");
            return;
        }
        this.k = false;
        this.b = activity;
        this.c = aVar;
        this.d = null;
        this.e = b.A().m() / 2;
        this.f = (TextView) activity.findViewById(R.id.txt_remark_remind);
    }

    private boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a0aa20c4614144702cfae4b20f640a5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a0aa20c4614144702cfae4b20f640a5")).booleanValue() : (this.g == null || TextUtils.isEmpty(this.g.remarkRemind) || !TextUtils.isEmpty(this.h)) ? false : true;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.d
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faa9808bb281b1132345fbf26a4de3de", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faa9808bb281b1132345fbf26a4de3de")).booleanValue();
        }
        if (!e() || this.i || b()) {
            return false;
        }
        return this.k || c.b(this.b, "order_confirm_remark_float_day_show_count") < this.g.remindCount;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.d
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1387db3f15a2ce29d8f12c50e88ef79c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1387db3f15a2ce29d8f12c50e88ef79c")).booleanValue();
        }
        Rect rect = this.c.V.a().b;
        if (this.d == null) {
            this.d = ((LinearLayoutManager) this.c.R.a().b.getLayoutManager()).findViewByPosition(this.j);
        }
        return ah.a(this.d, rect);
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.d
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "696c2aace689032c66c920643359c75b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "696c2aace689032c66c920643359c75b");
        } else if (e()) {
            this.f.setText(this.g.remarkRemind);
            this.f.setVisibility(0);
            if (this.k) {
                return;
            }
            c.a(this.b, "order_confirm_remark_float_day_show_count");
            this.k = true;
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.d
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcfeba60d612fd08aba85f6ae8a24c64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcfeba60d612fd08aba85f6ae8a24c64");
            return;
        }
        if (this.f != null) {
            this.f.setVisibility(8);
        }
        if (z) {
            return;
        }
        this.i = true;
    }
}
