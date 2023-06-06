package com.sankuai.meituan.location.collector.locator;

import android.os.Bundle;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.locate.util.i;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.location.collector.locator.d;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes4.dex */
public abstract class a implements d {
    public static ChangeQuickRedirect a;
    private final HashSet<d.a> b;
    private int c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca4436d7ced05e7eab6f4b4e3529b83a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca4436d7ced05e7eab6f4b4e3529b83a");
            return;
        }
        this.b = new HashSet<>();
        this.c = -1;
    }

    public abstract int a(boolean z);

    public abstract void a();

    public final void a(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89ce9594815e677845a4cab06cd07978", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89ce9594815e677845a4cab06cd07978");
        } else if (this.b == null) {
        } else {
            try {
                LogUtils.a("notifyLocatorMsg: " + mtLocation.getProvider());
                Iterator<d.a> it = this.b.iterator();
                while (it.hasNext()) {
                    it.next().a(mtLocation);
                }
            } catch (Exception e) {
                LogUtils.a(getClass(), e);
            }
        }
    }

    @Override // com.sankuai.meituan.location.collector.locator.d
    public final void a(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8993c851bb337fcd23d3e54ed230c07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8993c851bb337fcd23d3e54ed230c07");
        } else if (aVar == null || this.b == null) {
        } else {
            this.b.add(aVar);
        }
    }

    @Override // com.sankuai.meituan.location.collector.locator.d
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9343be468430dc23c06fa6957abfe27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9343be468430dc23c06fa6957abfe27");
            return;
        }
        this.c = a(LocationUtils.j(com.sankuai.meituan.location.collector.b.c()) || LocationUtils.a(com.sankuai.meituan.location.collector.b.c(), i.a));
        MtLocation mtLocation = new MtLocation("AbstractLocator start");
        Bundle bundle = new Bundle();
        bundle.putInt(Constants.SPEED_METER_STEP, 0);
        bundle.putInt("type", this.c);
        mtLocation.setExtras(bundle);
        a(mtLocation);
    }

    @Override // com.sankuai.meituan.location.collector.locator.d
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea2cdbb819ac0ce0a772707b1a364364", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea2cdbb819ac0ce0a772707b1a364364");
            return;
        }
        MtLocation mtLocation = new MtLocation("AbstractLocator stop");
        Bundle bundle = new Bundle();
        bundle.putInt("type", this.c);
        bundle.putInt(Constants.SPEED_METER_STEP, 4);
        mtLocation.setExtras(bundle);
        a(mtLocation);
        a();
    }
}
