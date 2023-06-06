package com.meituan.msc.uimanager.animate;

import com.meituan.msc.jse.bridge.Callback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends c {
    public static ChangeQuickRedirect f;
    private long g;
    private int h;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff6206b2e1447e5b96acc92354de23fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff6206b2e1447e5b96acc92354de23fc");
        } else {
            this.g = -1L;
        }
    }

    public final void a(a aVar, int i) {
        int i2 = 0;
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38a9af0c1d19941619c10c6804d63614", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38a9af0c1d19941619c10c6804d63614");
            return;
        }
        this.d = aVar;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "348851610bacc99f29735b17748e579d", RobustBitConfig.DEFAULT_VALUE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "348851610bacc99f29735b17748e579d")).intValue();
        } else if (i != 0) {
            i2 = (aVar.b == null || aVar.c == null) ? -1 : (int) ((aVar.c.f - aVar.b.f) * i);
        }
        this.h = (int) Math.ceil(i2 / 16.666666666666668d);
    }

    @Override // com.meituan.msc.uimanager.animate.c
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca8e13a988bf212ac6d7530e8fafa92c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca8e13a988bf212ac6d7530e8fafa92c");
        } else if (this.b) {
        } else {
            if (this.g < 0) {
                this.g = j;
                this.c = true;
            }
            int round = (int) Math.round(((j - this.g) / 1000000) / 16.666666666666668d);
            if (round >= this.h) {
                this.d.d = 1.0f;
                this.b = true;
            } else if (round > 0) {
                this.d.d = round / this.h;
            } else {
                this.d.d = 0.0f;
            }
        }
    }

    @Override // com.meituan.msc.uimanager.animate.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28e5346a310114aa5dbc4657475edb04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28e5346a310114aa5dbc4657475edb04");
        } else if (this.b && this.e != null) {
            for (Callback callback : this.e) {
                callback.invoke(new Object[0]);
            }
        }
    }

    @Override // com.meituan.msc.uimanager.animate.c
    public final void a(Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c677dec2c89451191b018fd199019a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c677dec2c89451191b018fd199019a4");
            return;
        }
        super.a(callback);
        if (this.b) {
            callback.invoke(new Object[0]);
        }
    }
}
