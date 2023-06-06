package com.dianping.gcmrnmodule.wrapperviews;

import android.support.annotation.CallSuper;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.view.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.o;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 3*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u00013B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010&\u001a\u00020'2\n\u0010(\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010)\u001a\u00020\bH\u0016J\r\u0010*\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0017J\u0012\u0010+\u001a\u00020'2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030-J\u0014\u0010.\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u0006\u0010)\u001a\u00020\bJ\u0016\u0010/\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u0006\u0010)\u001a\u00020\bH\u0016J\u0010\u00100\u001a\u00020'2\u0006\u00101\u001a\u00020\bH\u0016J\b\u00102\u001a\u00020'H\u0017R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR$\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00028\u00008VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0006R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u00064"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;", "T", "", "Lcom/facebook/react/views/view/ReactViewGroup;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "childWrapperViewCount", "", "getChildWrapperViewCount", "()I", "childWrapperViewList", "", "getChildWrapperViewList", "()Ljava/util/List;", "setChildWrapperViewList", "(Ljava/util/List;)V", "hostWrapperView", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseHostWrapperView;", "getHostWrapperView", "()Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseHostWrapperView;", "info", "getInfo", "()Ljava/lang/Object;", "info$delegate", "Lkotlin/Lazy;", "parentWrapperView", "getParentWrapperView", "()Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;", "setParentWrapperView", "(Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;)V", "getReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "setReactContext", "uiManagerModule", "Lcom/facebook/react/uimanager/UIManagerModule;", "getUiManagerModule", "()Lcom/facebook/react/uimanager/UIManagerModule;", "addChildWrapperView", "", "child", "index", "createInfoInstance", "dispatchEvent", "event", "Lcom/facebook/react/uimanager/events/Event;", "getChildWrapperViewAt", "removeChildWrapperViewAt", "setId", "id", "updateInfo", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public abstract class b<T> extends f {
    public static ChangeQuickRedirect b = null;
    @NotNull
    private final d a;
    @NotNull
    public List<b<?>> d;
    @Nullable
    private b<?> g;
    @NotNull
    private ReactContext h;
    public static final /* synthetic */ i[] c = {u.a(new s(u.a(b.class), "info", "getInfo()Ljava/lang/Object;"))};
    public static final a f = new a(null);
    protected static final int e = -1;

    @NotNull
    public abstract T g();

    @NotNull
    public T getInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6801e8621cc36c9e9cbde1cece61c1da", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6801e8621cc36c9e9cbde1cece61c1da") : (T) this.a.a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull ReactContext reactContext) {
        super(reactContext);
        h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14fe17ae04b1c3bcb5ad55e1b12c8605", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14fe17ae04b1c3bcb5ad55e1b12c8605");
            return;
        }
        this.h = reactContext;
        this.a = e.a(kotlin.i.NONE, new C0069b());
        this.d = new ArrayList();
    }

    @NotNull
    public final ReactContext getReactContext() {
        return this.h;
    }

    public final void setReactContext(@NotNull ReactContext reactContext) {
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "256145fc50e8ff319d46969881340d49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "256145fc50e8ff319d46969881340d49");
            return;
        }
        h.b(reactContext, "<set-?>");
        this.h = reactContext;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.dianping.gcmrnmodule.wrapperviews.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0069b extends kotlin.jvm.internal.i implements kotlin.jvm.functions.a<T> {
        public static ChangeQuickRedirect a;

        public C0069b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.a
        @NotNull
        public final T invoke() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3942fe99eb8e7af24958b3137b94301b", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3942fe99eb8e7af24958b3137b94301b") : (T) b.this.g();
        }
    }

    @NotNull
    public final List<b<?>> getChildWrapperViewList() {
        return this.d;
    }

    public final void setChildWrapperViewList(@NotNull List<b<?>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cb6acdafa50c359841fdaea706c6943", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cb6acdafa50c359841fdaea706c6943");
            return;
        }
        h.b(list, "<set-?>");
        this.d = list;
    }

    @Nullable
    public final b<?> getParentWrapperView() {
        return this.g;
    }

    public final void setParentWrapperView(@Nullable b<?> bVar) {
        this.g = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final com.dianping.gcmrnmodule.wrapperviews.a<?> getHostWrapperView() {
        for (b<T> bVar = this; bVar != null; bVar = bVar.g) {
            if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.a) {
                return (com.dianping.gcmrnmodule.wrapperviews.a) bVar;
            }
        }
        return null;
    }

    @NotNull
    public final UIManagerModule getUiManagerModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d68737b31cc2627018652d5045cdb9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (UIManagerModule) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d68737b31cc2627018652d5045cdb9a");
        }
        NativeModule nativeModule = this.h.getNativeModule(UIManagerModule.class);
        h.a((Object) nativeModule, "reactContext.getNativeMo…anagerModule::class.java)");
        return (UIManagerModule) nativeModule;
    }

    public final int getChildWrapperViewCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aa8ed465a1bc1f9a50cd2d05bea2e90", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aa8ed465a1bc1f9a50cd2d05bea2e90")).intValue() : this.d.size();
    }

    public final void a(@NotNull com.facebook.react.uimanager.events.b<?> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2968212d07eaf8d77ae3bb90f217afee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2968212d07eaf8d77ae3bb90f217afee");
            return;
        }
        h.b(bVar, "event");
        getUiManagerModule().getEventDispatcher().a(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(@NotNull b<?> bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8829167ceda4f4fc385fd598d45129fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8829167ceda4f4fc385fd598d45129fb");
            return;
        }
        h.b(bVar, "child");
        if (i == -1) {
            this.d.add(bVar);
        } else {
            this.d.add(i, bVar);
        }
        bVar.g = this;
    }

    @CallSuper
    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b50e92e288bc918db71b801355259513", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b50e92e288bc918db71b801355259513");
            return;
        }
        Iterator<T> it = this.d.iterator();
        while (it.hasNext()) {
            ((b) it.next()).h();
        }
    }

    @Nullable
    public b<?> a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de3e91158d91d15d1216bc26f1d6bbb5", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de3e91158d91d15d1216bc26f1d6bbb5");
        }
        if (i < 0 || i >= this.d.size()) {
            return null;
        }
        b<?> remove = this.d.remove(i);
        remove.g = null;
        return remove;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView$Companion;", "", "()V", "INVALID_REACT_TAG", "", "getINVALID_REACT_TAG", "()I", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.f fVar) {
            this();
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c5bb2a3cd64b7f8a658f5bc6b1c615c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c5bb2a3cd64b7f8a658f5bc6b1c615c");
            return;
        }
        super.setId(i);
        if (getInfo() instanceof DiffableInfo) {
            T info = getInfo();
            if (info == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.model.DiffableInfo");
            }
            ((DiffableInfo) info).setIdentifier(String.valueOf(i));
        }
    }
}
