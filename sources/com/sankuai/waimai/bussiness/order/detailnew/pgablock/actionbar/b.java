package com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.h;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.q;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public String b;
    public int c;
    public long d;
    public String e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public String j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public q p;
    public List<h> q;

    public final h a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fd796964d7af8f0e29b39e9cd09d825", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fd796964d7af8f0e29b39e9cd09d825");
        }
        if (this.q == null || this.q.size() <= 0) {
            return null;
        }
        for (h hVar : this.q) {
            if (hVar.a == i) {
                return hVar;
            }
        }
        return null;
    }
}
