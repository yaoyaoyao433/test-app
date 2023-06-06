package com.meituan.android.common.locate.locator.trigger;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes2.dex */
public class c {
    public static ChangeQuickRedirect changeQuickRedirect;
    private GearsLocator a;
    private ArrayList<b> b;
    private volatile boolean c;
    private a d;

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(MtLocation mtLocation) throws Exception;

        void b();

        void c();
    }

    public c(@NonNull Context context, @NonNull GearsLocator gearsLocator) {
        Object[] objArr = {context, gearsLocator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d2a9da349edf8a1b2af09923165069a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d2a9da349edf8a1b2af09923165069a");
            return;
        }
        this.b = new ArrayList<>();
        this.c = false;
        this.d = new a() { // from class: com.meituan.android.common.locate.locator.trigger.c.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.locate.locator.trigger.c.a
            public void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bf49f9f51b35e32f65d07aff77a8a9be", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bf49f9f51b35e32f65d07aff77a8a9be");
                    return;
                }
                com.meituan.android.common.locate.platform.logs.c.a(" TriggerManager::onForceRequest ", 3);
                LogUtils.a("TriggerManager onForceRequest, try request locate");
                c.this.a.onForceRequest();
            }

            @Override // com.meituan.android.common.locate.locator.trigger.c.a
            public void a(MtLocation mtLocation) throws Exception {
                Object[] objArr2 = {mtLocation};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aef37f7c7ae14a445b04db0c2d3c917d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aef37f7c7ae14a445b04db0c2d3c917d");
                    return;
                }
                LogUtils.a("TriggerManager onRequestGeo, try request geoinfo");
                c.this.a.onRequestGeo(mtLocation);
            }

            @Override // com.meituan.android.common.locate.locator.trigger.c.a
            public void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d1813a7ceaa07b56a84f4a4cec2500bc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d1813a7ceaa07b56a84f4a4cec2500bc");
                    return;
                }
                c.this.a.onSignalChange();
                LogUtils.a("TriggerManager onSignalChange, try request locate");
            }

            @Override // com.meituan.android.common.locate.locator.trigger.c.a
            public void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bf1d408950d67c2c0b6d4280a5bbb61f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bf1d408950d67c2c0b6d4280a5bbb61f");
                    return;
                }
                LogUtils.a("TriggerManager onTimeout, try request locate");
                c.this.a.onAutoLoc();
            }
        };
        this.a = gearsLocator;
        this.b.add(new com.meituan.android.common.locate.locator.trigger.a(this.d, context));
        this.b.add(new d(this.d, context));
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc1cd96f3982530b69805d767026f678", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc1cd96f3982530b69805d767026f678");
        } else if (this.c) {
        } else {
            LogUtils.a("TriggerManager all triggers start");
            Iterator<b> it = this.b.iterator();
            while (it.hasNext()) {
                try {
                    it.next().c();
                } catch (Throwable th) {
                    LogUtils.a(th);
                }
            }
            this.c = true;
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc9599c6af40ddcadc36830ebc2e4c47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc9599c6af40ddcadc36830ebc2e4c47");
            return;
        }
        LogUtils.a("TriggerManager all triggers stop");
        Iterator<b> it = this.b.iterator();
        while (it.hasNext()) {
            try {
                it.next().d();
            } catch (Throwable th) {
                LogUtils.a(th);
            }
        }
        this.c = false;
    }
}
