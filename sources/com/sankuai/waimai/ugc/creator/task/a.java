package com.sankuai.waimai.ugc.creator.task;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.creator.entity.c;
import com.sankuai.waimai.ugc.creator.entity.d;
import com.sankuai.waimai.ugc.creator.entity.inner.ImageData;
import com.sankuai.waimai.ugc.creator.utils.o;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes6.dex */
public abstract class a extends com.sankuai.waimai.ugc.creator.utils.task.a<ArrayList<c>> {
    public static ChangeQuickRedirect c;
    private final List<ImageData> a;

    @Override // com.sankuai.waimai.ugc.creator.utils.task.a
    public final /* synthetic */ ArrayList<c> b() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f9df3bc01599cabbdb59dc530aeea5c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f9df3bc01599cabbdb59dc530aeea5c");
        }
        ArrayList<c> a = com.sankuai.waimai.ugc.creator.utils.c.a(this.a);
        Iterator<c> it = a.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next instanceof d) {
                d dVar = (d) next;
                if (TextUtils.isEmpty(dVar.d)) {
                    it.remove();
                } else {
                    String str = "tmp_" + Long.toHexString(new Date().getTime()) + ".png";
                    dVar.f = o.a(dVar.d, o.a(str));
                    dVar.a = "wdfile://" + str;
                }
            }
        }
        return a;
    }

    public a(List<ImageData> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15b3923a0dd2e4396aa6d874569419a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15b3923a0dd2e4396aa6d874569419a8");
        } else {
            this.a = list;
        }
    }
}
