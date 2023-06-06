package com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule;

import android.annotation.SuppressLint;
import com.dianping.gcmrnmodule.protocols.g;
import com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.l;
import com.dianping.shield.dynamic.model.extra.ScrollEvent;
import com.dianping.shield.dynamic.model.extra.ScrollEventInfo;
import com.dianping.shield.dynamic.model.view.ExtraViewInfo;
import com.dianping.shield.dynamic.model.view.ExtraViewUnionType;
import com.dianping.shield.dynamic.model.view.TabViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.facebook.react.bridge.ReactContext;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010$\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020&H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR.\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\fR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!¨\u0006'"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/containers/tabmodule/MRNTabModuleTabViewContainerWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;", "", "Lcom/dianping/gcmrnmodule/protocols/MRNModuleBaseWrapperViewOnScrollEventProtocol;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "backgroundView", "Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType$ExtraViewInfo;", "getBackgroundView", "()Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType$ExtraViewInfo;", "setBackgroundView", "(Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType$ExtraViewInfo;)V", "children", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/model/view/TabViewInfo;", "Lkotlin/collections/ArrayList;", "getChildren", "()Ljava/util/ArrayList;", "setChildren", "(Ljava/util/ArrayList;)V", "maskView", "getMaskView", "setMaskView", "slideBar", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "getSlideBar", "()Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "setSlideBar", "(Lcom/dianping/shield/dynamic/model/view/ViewInfo;)V", "tabScrollEvent", "Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;", "getTabScrollEvent", "()Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;", "tabScrollEvent$delegate", "Lkotlin/Lazy;", "createInfoInstance", "updateInfo", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class b extends com.dianping.gcmrnmodule.wrapperviews.b<Object> implements g {
    public static ChangeQuickRedirect a;
    public static final /* synthetic */ i[] g = {u.a(new s(u.a(b.class), "tabScrollEvent", "getTabScrollEvent()Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;"))};
    @Nullable
    private ArrayList<TabViewInfo> h;
    @Nullable
    private ExtraViewUnionType.ExtraViewInfo i;
    @Nullable
    private ExtraViewUnionType.ExtraViewInfo j;
    @Nullable
    private ViewInfo k;
    @NotNull
    private final d l;

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    @NotNull
    public final Object g() {
        return this;
    }

    @NotNull
    public final ScrollEvent getTabScrollEvent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return (ScrollEvent) (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e368e635821e763ffc41950e667a607f", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e368e635821e763ffc41950e667a607f") : this.l.a());
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/dianping/shield/dynamic/model/extra/ScrollEventInfo;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.i implements kotlin.jvm.functions.a<ScrollEventInfo> {
        public static ChangeQuickRedirect a;
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ ScrollEventInfo invoke() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a179088a40bbbae94a83cb931ba8443", RobustBitConfig.DEFAULT_VALUE) ? (ScrollEventInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a179088a40bbbae94a83cb931ba8443") : new ScrollEventInfo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull ReactContext reactContext) {
        super(reactContext);
        h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c7be09f029485a34a47428496eb18f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c7be09f029485a34a47428496eb18f0");
        } else {
            this.l = e.a(kotlin.i.NONE, a.b);
        }
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void a(@Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4225d57db284e1853462db2e0ceb7d8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4225d57db284e1853462db2e0ceb7d8f");
            return;
        }
        h.b(bVar, Constants.EventType.VIEW);
        g.a.a(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void b(@Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2062378c7be599c6d6ecc091ebac3b6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2062378c7be599c6d6ecc091ebac3b6c");
            return;
        }
        h.b(bVar, Constants.EventType.VIEW);
        g.a.b(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void c(@Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2faf64ee450134cc0969f4120808db52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2faf64ee450134cc0969f4120808db52");
            return;
        }
        h.b(bVar, Constants.EventType.VIEW);
        g.a.c(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void d(@Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e1526812a116743c22bc23d9aebad2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e1526812a116743c22bc23d9aebad2c");
            return;
        }
        h.b(bVar, Constants.EventType.VIEW);
        g.a.d(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void e(@Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe00059a09ec65e17aeafa3eaca820e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe00059a09ec65e17aeafa3eaca820e6");
            return;
        }
        h.b(bVar, Constants.EventType.VIEW);
        g.a.e(this, obj, bVar);
    }

    @Nullable
    public final ArrayList<TabViewInfo> getChildren() {
        return this.h;
    }

    public final void setChildren(@Nullable ArrayList<TabViewInfo> arrayList) {
        this.h = arrayList;
    }

    @Nullable
    public final ExtraViewUnionType.ExtraViewInfo getBackgroundView() {
        return this.i;
    }

    public final void setBackgroundView(@Nullable ExtraViewUnionType.ExtraViewInfo extraViewInfo) {
        this.i = extraViewInfo;
    }

    @Nullable
    public final ExtraViewUnionType.ExtraViewInfo getMaskView() {
        return this.j;
    }

    public final void setMaskView(@Nullable ExtraViewUnionType.ExtraViewInfo extraViewInfo) {
        this.j = extraViewInfo;
    }

    @Nullable
    public final ViewInfo getSlideBar() {
        return this.k;
    }

    public final void setSlideBar(@Nullable ViewInfo viewInfo) {
        this.k = viewInfo;
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef918e059409cfb3ff1130c5d8674994", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef918e059409cfb3ff1130c5d8674994");
            return;
        }
        super.h();
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        Iterator<T> it = getChildWrapperViewList().iterator();
        while (it.hasNext()) {
            com.dianping.gcmrnmodule.wrapperviews.b bVar = (com.dianping.gcmrnmodule.wrapperviews.b) it.next();
            if (bVar instanceof l) {
                RandomAccess info = ((l) bVar).getInfo();
                if (!(info instanceof ArrayList)) {
                    info = null;
                }
                this.h = (ArrayList) info;
            } else if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.a) {
                ViewInfo childInfo = ((com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.a) bVar).getChildInfo();
                if (!(childInfo instanceof ExtraViewInfo)) {
                    childInfo = null;
                }
                ExtraViewInfo extraViewInfo = (ExtraViewInfo) childInfo;
                if (extraViewInfo != null) {
                    this.i = new ExtraViewUnionType.ExtraViewInfo(extraViewInfo);
                } else {
                    this.i = null;
                }
            } else if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.h) {
                ViewInfo childInfo2 = ((com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.h) bVar).getChildInfo();
                if (!(childInfo2 instanceof ExtraViewInfo)) {
                    childInfo2 = null;
                }
                ExtraViewInfo extraViewInfo2 = (ExtraViewInfo) childInfo2;
                if (extraViewInfo2 != null) {
                    this.j = new ExtraViewUnionType.ExtraViewInfo(extraViewInfo2);
                } else {
                    this.j = null;
                }
            } else if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.tab.a) {
                this.k = ((com.dianping.gcmrnmodule.wrapperviews.containers.tab.a) bVar).getChildInfo();
            }
        }
    }
}
