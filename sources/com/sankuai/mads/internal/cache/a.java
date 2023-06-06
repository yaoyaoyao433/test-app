package com.sankuai.mads.internal.cache;

import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.g;
import com.sankuai.mads.internal.horn.a;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\u0014\u0010\f\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u000b\u001a\u00020\bJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000eR\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/sankuai/mads/internal/cache/AdEventCache;", "", "()V", "isFull", "", "()Z", "mSendQueue", "Ljava/util/Queue;", "Lcom/sankuai/mads/ReportEventData;", "add", "", "eventData", "addFailed", Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST, "", "addGetAndClear", "getAndClear", "sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public Queue<g> b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67bf82615bff5d40bd2da62d46bcc172", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67bf82615bff5d40bd2da62d46bcc172");
        } else {
            this.b = new ConcurrentLinkedQueue();
        }
    }

    public final void a(@NotNull List<g> list) {
        int i = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1965f63d175808da1705020485731575", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1965f63d175808da1705020485731575");
            return;
        }
        h.b(list, Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST);
        int i2 = 0;
        for (g gVar : list) {
            gVar.d++;
            int i3 = gVar.d;
            com.sankuai.mads.internal.horn.a aVar = com.sankuai.mads.internal.horn.a.c;
            a.b bVar = com.sankuai.mads.internal.horn.a.a().b;
            if (i3 <= (bVar.d <= 0 ? 5 : bVar.d)) {
                int size = this.b.size();
                com.sankuai.mads.internal.horn.a aVar2 = com.sankuai.mads.internal.horn.a.c;
                a.b bVar2 = com.sankuai.mads.internal.horn.a.a().b;
                if (size >= (bVar2.c <= 0 ? 30 : bVar2.c)) {
                    i++;
                    this.b.poll();
                    this.b.add(gVar);
                } else {
                    this.b.add(gVar);
                }
            } else {
                i2++;
            }
        }
        com.sankuai.mads.internal.manager.a.g.a(this.b.size());
        if (i > 0) {
            com.sankuai.mads.internal.manager.a aVar3 = com.sankuai.mads.internal.manager.a.g;
            com.sankuai.mads.internal.manager.a.e().a(i);
        }
        if (i2 > 0) {
            com.sankuai.mads.internal.manager.a aVar4 = com.sankuai.mads.internal.manager.a.g;
            com.sankuai.mads.internal.manager.a.f().a(i2);
        }
    }

    @NotNull
    public final List<g> a(@NotNull g gVar) {
        List<g> b;
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e54e3604a4d88fd19cc3a7d9306c064", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e54e3604a4d88fd19cc3a7d9306c064");
        }
        h.b(gVar, "eventData");
        synchronized (this) {
            this.b.add(gVar);
            b = kotlin.collections.h.b((Iterable) this.b);
            this.b.clear();
            com.sankuai.mads.internal.manager.a.g.a(0);
        }
        return b;
    }

    @NotNull
    public final List<g> a() {
        List<g> b;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e5290ac482addc5e5c163d7d958d812", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e5290ac482addc5e5c163d7d958d812");
        }
        synchronized (this) {
            b = kotlin.collections.h.b((Iterable) this.b);
            this.b.clear();
            com.sankuai.mads.internal.manager.a.g.a(0);
        }
        return b;
    }
}
