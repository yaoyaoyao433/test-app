package com.sankuai.waimai.store.poi.list.refactor.cat;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CardMonitorMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String cardName;
    public IMonitor monitor;
    public String navigateType;
    public String reason;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        public CardMonitorMessage b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1ad1448158b43faef5bea7cd9659ef1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1ad1448158b43faef5bea7cd9659ef1");
            } else {
                this.b = new CardMonitorMessage();
            }
        }

        public final a a(String str) {
            this.b.cardName = str;
            return this;
        }

        public final a a(IMonitor iMonitor) {
            this.b.monitor = iMonitor;
            return this;
        }

        public final a b(String str) {
            this.b.reason = str;
            return this;
        }

        public final a c(String str) {
            this.b.navigateType = str;
            return this;
        }
    }
}
