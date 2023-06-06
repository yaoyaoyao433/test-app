package com.sankuai.waimai.platform.widget.tag.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends b {
    public static ChangeQuickRedirect c;
    public long d;
    public int e;
    public int f;
    public int g;
    public Map<String, String> h;
    public Map<String, String> i;
    public int j;

    @Override // com.sankuai.waimai.platform.widget.tag.model.b, com.sankuai.waimai.platform.widget.tag.b
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb3b685d3f56affe1addcd78ea3761fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb3b685d3f56affe1addcd78ea3761fc");
            return;
        }
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = null;
        this.j = 0;
        super.a();
    }
}
