package com.dianping.shield.dynamic.agent.refresh;

import com.alipay.sdk.widget.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.b;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.subjects.c;
import rx.subjects.e;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B(\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0004R\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR)\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000RB\u0010\r\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u000f0\u000ej\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u000f`\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/dianping/shield/dynamic/agent/refresh/DynamicRefreshDelegate;", "", "reloadCallback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "identifier", "", "(Lkotlin/jvm/functions/Function1;)V", "<set-?>", "getIdentifier", "()I", "subjectMap", "Ljava/util/HashMap;", "Lrx/subjects/Subject;", "Lkotlin/collections/HashMap;", "onDestroy", "", d.p, "Lrx/Observable;", "onRefreshEnd", "refreshId", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicRefreshDelegate {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int identifier;
    private final b<Integer, Boolean> reloadCallback;
    private HashMap<Integer, e<Object, Object>> subjectMap;

    public DynamicRefreshDelegate(@NotNull b<? super Integer, Boolean> bVar) {
        h.b(bVar, "reloadCallback");
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1868112731207d96fa501ec0c4e254cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1868112731207d96fa501ec0c4e254cf");
            return;
        }
        this.reloadCallback = bVar;
        this.subjectMap = new HashMap<>();
    }

    public final int getIdentifier() {
        return this.identifier;
    }

    @Nullable
    public final rx.d<Object> onRefresh() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8748b41ed9a6795d62758a3e29ef8180", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8748b41ed9a6795d62758a3e29ef8180");
        }
        this.subjectMap.clear();
        this.identifier++;
        int i = this.identifier;
        c g = c.g();
        h.a((Object) g, "ReplaySubject.create()");
        c cVar = g;
        this.subjectMap.put(Integer.valueOf(i), cVar);
        if (this.reloadCallback.invoke(Integer.valueOf(i)).booleanValue()) {
            return cVar;
        }
        return null;
    }

    public final void onRefreshEnd(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c21a234018210008645b33386b3ddaca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c21a234018210008645b33386b3ddaca");
            return;
        }
        e<Object, Object> remove = this.subjectMap.remove(Integer.valueOf(i));
        if (remove != null) {
            remove.onNext(null);
        }
    }

    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d956ee453bee6a369086c330ec7e24e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d956ee453bee6a369086c330ec7e24e6");
        } else {
            this.subjectMap.clear();
        }
    }
}
