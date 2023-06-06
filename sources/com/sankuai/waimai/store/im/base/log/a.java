package com.sankuai.waimai.store.im.base.log;

import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a {
    public static ChangeQuickRedirect a;

    public abstract IMonitor a();

    public abstract IMonitor b();

    public abstract IMonitor c();

    public abstract IMonitor d();

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.im.base.log.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1207a extends a {
        public C1207a() {
        }

        @Override // com.sankuai.waimai.store.im.base.log.a
        public final IMonitor a() {
            return SGDrugIMGroupEnter.DaxiangInitError;
        }

        @Override // com.sankuai.waimai.store.im.base.log.a
        public final IMonitor b() {
            return SGDrugIMGroupEnter.DaxiangStartSessionError;
        }

        @Override // com.sankuai.waimai.store.im.base.log.a
        public final IMonitor c() {
            return SGDrugIMGroupEnter.UnknownError;
        }

        @Override // com.sankuai.waimai.store.im.base.log.a
        public final IMonitor d() {
            return SGDrugIMGroupEnter.Normal;
        }
    }
}
