package com.sankuai.waimai.mach.jsv8.jstask;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.common.i;
import com.sankuai.waimai.mach.e;
import com.sankuai.waimai.mach.render.d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a implements Runnable {
    public static ChangeQuickRedirect f;
    private WeakReference<Mach> a;

    public abstract void a();

    public a(Mach mach) {
        Object[] objArr = {mach};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ff490f7bf69ca69d95d29b98c3911c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ff490f7bf69ca69d95d29b98c3911c8");
        } else {
            this.a = new WeakReference<>(mach);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78febb2599eb11e6e71cf5d81d2a9e47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78febb2599eb11e6e71cf5d81d2a9e47");
            return;
        }
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = f;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6023812807800da2104f9e6c094d9b9c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6023812807800da2104f9e6c094d9b9c");
            }
            a();
        } catch (Exception e) {
            a(e);
        }
    }

    public void a(Exception exc) {
        Mach mach;
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b209341d94e5b5f5dc29c123c117a582", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b209341d94e5b5f5dc29c123c117a582");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "299990964eef8234b6dbd2338bcdaeec", RobustBitConfig.DEFAULT_VALUE)) {
            mach = (Mach) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "299990964eef8234b6dbd2338bcdaeec");
        } else {
            mach = this.a != null ? this.a.get() : null;
        }
        if (mach != null) {
            d.a(mach, exc);
        }
        HashMap hashMap = new HashMap();
        if (mach != null) {
            hashMap.put("template_id", mach.getTemplateId());
        }
        e e = i.a().e();
        if (e != null) {
            e.a("mach_v8jse_js_error", "v8jse_js异常", exc.getMessage(), hashMap);
        }
    }
}
