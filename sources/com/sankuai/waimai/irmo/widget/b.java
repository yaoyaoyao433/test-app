package com.sankuai.waimai.irmo.widget;

import android.graphics.RectF;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.irmo.render.bean.anim.draw.BorderDrawUpdateCommand;
import com.sankuai.waimai.irmo.render.bean.anim.draw.CornerDrawUpdateCommand;
import com.sankuai.waimai.irmo.render.bean.anim.draw.DrawUpdateCommand;
import com.sankuai.waimai.irmo.render.bean.anim.draw.HaloDrawUpdateCommand;
import com.sankuai.waimai.irmo.render.bean.anim.draw.ShadowDrawUpdateCommand;
import com.sankuai.waimai.irmo.render.bean.anim.draw.bean.BorderData;
import com.sankuai.waimai.irmo.render.bean.anim.draw.bean.CornerData;
import com.sankuai.waimai.irmo.render.bean.anim.draw.bean.HaloData;
import com.sankuai.waimai.irmo.render.bean.anim.draw.bean.ShadowData;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public CornerData b;
    public ShadowData c;
    public HaloData d;
    public BorderData e;
    public DrawUpdateCommand<ShadowData> f;
    public DrawUpdateCommand<HaloData> g;
    public DrawUpdateCommand<CornerData> h;
    public DrawUpdateCommand<BorderData> i;
    public RectF j;
    public float[] k;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4bded6dce72b67cf069a637331dfa8d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4bded6dce72b67cf069a637331dfa8d");
            return;
        }
        this.j = new RectF();
        if (System.currentTimeMillis() % 10 == 1) {
            String str = ShadowDrawUpdateCommand.TAG;
            String str2 = HaloDrawUpdateCommand.TAG;
            String str3 = CornerDrawUpdateCommand.TAG;
            String str4 = BorderDrawUpdateCommand.TAG;
            String str5 = ShadowData.TAG;
            String str6 = HaloData.TAG;
            String str7 = BorderData.TAG;
        }
    }
}
