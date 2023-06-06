package com.dianping.shield.manager;

import com.dianping.agentsdk.framework.AgentInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.d;
import rx.e;
import rx.subjects.c;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/dianping/shield/manager/ProxySubject;", "", "originalObs", "Lrx/Observable;", "Lcom/dianping/agentsdk/framework/AgentInterface;", "agentInterface", "(Lrx/Observable;Lcom/dianping/agentsdk/framework/AgentInterface;)V", "subject", "Lrx/subjects/ReplaySubject;", "getSubject", "()Lrx/subjects/ReplaySubject;", "setSubject", "(Lrx/subjects/ReplaySubject;)V", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ProxySubject {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final AgentInterface agentInterface;
    private final d<AgentInterface> originalObs;
    @NotNull
    private c<AgentInterface> subject;

    public ProxySubject(@NotNull d<AgentInterface> dVar, @NotNull AgentInterface agentInterface) {
        h.b(dVar, "originalObs");
        h.b(agentInterface, "agentInterface");
        Object[] objArr = {dVar, agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a648561bc381fd8407011926bb39b013", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a648561bc381fd8407011926bb39b013");
            return;
        }
        this.originalObs = dVar;
        this.agentInterface = agentInterface;
        c<AgentInterface> g = c.g();
        h.a((Object) g, "ReplaySubject.create()");
        this.subject = g;
        this.originalObs.a(new e<AgentInterface>() { // from class: com.dianping.shield.manager.ProxySubject.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // rx.e
            public final void onError(@Nullable Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7e01315b158daf2fa68bd0a02aea8ee9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7e01315b158daf2fa68bd0a02aea8ee9");
                    return;
                }
                ProxySubject.this.getSubject().onNext(ProxySubject.this.agentInterface);
                ProxySubject.this.getSubject().onCompleted();
            }

            @Override // rx.e
            public final void onNext(@Nullable AgentInterface agentInterface2) {
                Object[] objArr2 = {agentInterface2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f09427a6b5fc6f1ec3876685cea2bc3e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f09427a6b5fc6f1ec3876685cea2bc3e");
                } else if (agentInterface2 == null) {
                    ProxySubject.this.getSubject().onNext(ProxySubject.this.agentInterface);
                } else {
                    ProxySubject.this.getSubject().onNext(agentInterface2);
                }
            }

            @Override // rx.e
            public final void onCompleted() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fb247e6268f930e0763c0efd7af9a4f6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fb247e6268f930e0763c0efd7af9a4f6");
                } else {
                    ProxySubject.this.getSubject().onCompleted();
                }
            }
        });
    }

    @NotNull
    public final c<AgentInterface> getSubject() {
        return this.subject;
    }

    public final void setSubject(@NotNull c<AgentInterface> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8dd598eec739dd9b10b3928211c75e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8dd598eec739dd9b10b3928211c75e1");
            return;
        }
        h.b(cVar, "<set-?>");
        this.subject = cVar;
    }
}
