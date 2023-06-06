package com.sankuai.waimai.bussiness.order.confirm.pgablock.floatlayer.rock;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.bussiness.order.confirm.helper.d;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public List<d> b;
    public com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.b c;
    public com.sankuai.waimai.bussiness.order.confirm.pgablock.serviceguarantee.a d;
    public com.sankuai.waimai.bussiness.order.confirm.pgablock.additionalbargain.a e;
    public com.sankuai.waimai.bussiness.order.confirm.pgablock.wmcard.b f;
    protected f g;
    public com.sankuai.waimai.bussiness.order.confirm.a h;
    private Context i;
    private Activity j;

    public a(f fVar, Context context, com.sankuai.waimai.bussiness.order.confirm.a aVar, Activity activity) {
        Object[] objArr = {fVar, context, aVar, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4013ad10a8977064c7537e422ba122f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4013ad10a8977064c7537e422ba122f8");
            return;
        }
        this.b = new ArrayList();
        this.g = fVar;
        this.i = context;
        this.h = aVar;
        this.j = activity;
        this.f = new com.sankuai.waimai.bussiness.order.confirm.pgablock.wmcard.b(this.i, this.h, this.j);
        this.d = new com.sankuai.waimai.bussiness.order.confirm.pgablock.serviceguarantee.a(this.i, this.h, this.h);
        this.e = new com.sankuai.waimai.bussiness.order.confirm.pgablock.additionalbargain.a(this.i, this.h);
        this.c = new com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.b(this.i, this.h);
    }
}
