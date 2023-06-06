package com.dianping.gcmrnmodule.wrapperviews.events;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/events/OnDragRefreshStatusChangedEvent;", "Lcom/dianping/gcmrnmodule/wrapperviews/events/BaseEvent;", "viewTag", "", "params", "Lorg/json/JSONObject;", "(ILorg/json/JSONObject;)V", "getEventName", "", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class j extends com.dianping.gcmrnmodule.wrapperviews.events.a {
    public static ChangeQuickRedirect b;
    public static final a c = new a(null);

    @Override // com.dianping.gcmrnmodule.wrapperviews.events.a, com.facebook.react.uimanager.events.b
    @NotNull
    public final String a() {
        return "onDragRefreshStatusChanged";
    }

    public j(int i, @Nullable JSONObject jSONObject) {
        super(i, jSONObject);
        Object[] objArr = {Integer.valueOf(i), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4b8af64cf973200f75ccc2233a7a8f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4b8af64cf973200f75ccc2233a7a8f8");
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/events/OnDragRefreshStatusChangedEvent$Companion;", "", "()V", "EVENT_NAME", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.f fVar) {
            this();
        }
    }
}
