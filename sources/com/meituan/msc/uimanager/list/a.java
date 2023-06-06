package com.meituan.msc.uimanager.list;

import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends com.meituan.msc.uimanager.events.b {
    public static ChangeQuickRedirect d;
    private com.meituan.msc.uimanager.events.b e;

    public a(ReactApplicationContext reactApplicationContext, com.meituan.msc.uimanager.events.b bVar, MSCListEventEmitter mSCListEventEmitter) {
        super(reactApplicationContext, mSCListEventEmitter);
        Object[] objArr = {reactApplicationContext, bVar, mSCListEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e6b6f7d61806a15917766bd1659b801", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e6b6f7d61806a15917766bd1659b801");
        } else {
            this.e = bVar;
        }
    }

    @Override // com.meituan.msc.uimanager.events.b
    public final void a(com.meituan.msc.uimanager.events.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0b334a580276d473fde54f429092e07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0b334a580276d473fde54f429092e07");
        } else {
            super.a(aVar);
        }
    }

    @Override // com.meituan.msc.uimanager.events.b
    public final void a(com.meituan.msc.uimanager.events.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e7d7e4b2b5bb3bf773ad7c5e5dfbf57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e7d7e4b2b5bb3bf773ad7c5e5dfbf57");
        } else {
            this.e.a(cVar);
        }
    }

    @Override // com.meituan.msc.uimanager.events.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7000ba84c13e86f86f0a9cd64170bbdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7000ba84c13e86f86f0a9cd64170bbdd");
        } else {
            this.e.a();
        }
    }

    @Override // com.meituan.msc.uimanager.events.b
    public final void a(int i, RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {Integer.valueOf(i), rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a6b9757eaef3d36a77ef479842077a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a6b9757eaef3d36a77ef479842077a4");
        } else {
            this.e.a(i, rCTEventEmitter);
        }
    }

    @Override // com.meituan.msc.uimanager.events.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e48105cb4b329bf7a02f53fea2bafc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e48105cb4b329bf7a02f53fea2bafc5");
        } else {
            this.e.b();
        }
    }
}
