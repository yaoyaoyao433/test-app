package com.dianping.shield.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.agentsdk.framework.a;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.ao;
import com.dianping.agentsdk.framework.ap;
import com.dianping.agentsdk.framework.ar;
import com.dianping.agentsdk.framework.c;
import com.dianping.agentsdk.framework.d;
import com.dianping.agentsdk.framework.j;
import com.dianping.agentsdk.manager.b;
import com.dianping.shield.framework.ShieldContainerInterface;
import com.dianping.shield.framework.ShieldLifeCycler;
import com.dianping.shield.lifecycle.PageAppearType;
import com.dianping.shield.lifecycle.PageDisappearType;
import com.dianping.shield.lifecycle.PageLifecycleCallbacks;
import com.dianping.shield.lifecycle.PageLifecycleDispatcher;
import com.dianping.shield.lifecycle.PageLifecycleObserver;
import com.dianping.shield.manager.LightAgentManager;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.unionpay.tsmservice.data.Constant;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 P2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001PB\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096\u0001J\u0011\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000fH\u0096\u0001J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H&J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0001J\u000f\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001aH\u0096\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u0096\u0001J\u0011\u0010\u001d\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001eH\u0096\u0001J\b\u0010 \u001a\u00020\u0018H\u0016J\f\u0010!\u001a\u0006\u0012\u0002\b\u00030\u001aH\u0016J\b\u0010\"\u001a\u00020\u001eH\u0016J\u000e\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010$H\u0016J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020'H\u0016J\u0012\u0010(\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\"\u0010+\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0012\u00101\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J(\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u0001072\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u00108\u001a\u00020\u000bH\u0016J\u0011\u00109\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096\u0001J\u0011\u0010:\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000fH\u0096\u0001J\b\u0010;\u001a\u00020\u000bH\u0016J\b\u0010<\u001a\u00020\u000bH\u0016J\u0012\u0010=\u001a\u00020\u000b2\b\u0010>\u001a\u0004\u0018\u00010*H\u0016J\b\u0010?\u001a\u00020\u000bH\u0016J\b\u0010@\u001a\u00020\u000bH\u0016J\u0012\u0010A\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u000e\u0010B\u001a\u00020\u000b2\u0006\u0010C\u001a\u000207J\u0019\u0010D\u001a\u00020\u000b2\u000e\u0010E\u001a\n \u001f*\u0004\u0018\u00010\u00110\u0011H\u0096\u0001JA\u0010D\u001a\u00020\u000b2\u000e\u0010E\u001a\n \u001f*\u0004\u0018\u00010\u00110\u00112\u000e\u0010F\u001a\n \u001f*\u0004\u0018\u00010G0G2\u0006\u0010H\u001a\u00020-2\u0006\u0010I\u001a\u00020-2\u0006\u0010J\u001a\u00020-H\u0096\u0001J\b\u0010K\u001a\u00020\u000bH\u0004J\u008d\u0001\u0010L\u001a\u00020\u000b2*\u0010M\u001a&\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u00110\u0011 \u001f*\u0012\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u00110\u0011\u0018\u00010\u00150\u00152*\u0010N\u001a&\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u00110\u0011 \u001f*\u0012\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u00110\u0011\u0018\u00010\u00150\u00152*\u0010O\u001a&\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u00110\u0011 \u001f*\u0012\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u00110\u0011\u0018\u00010\u00150\u0015H\u0096\u0001R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Q"}, d2 = {"Lcom/dianping/shield/fragment/ShieldFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/dianping/agentsdk/framework/AgentCellBridgeInterface;", "Lcom/dianping/agentsdk/framework/UIRDriverInterface;", "Lcom/dianping/shield/framework/ShieldContainerInterface;", "Lcom/dianping/shield/lifecycle/PageLifecycleCallbacks;", "Lcom/dianping/shield/lifecycle/PageLifecycleDispatcher;", "shieldLifeCycler", "Lcom/dianping/shield/framework/ShieldLifeCycler;", "(Lcom/dianping/shield/framework/ShieldLifeCycler;)V", "dispatchPageAppear", "", "type", "Lcom/dianping/shield/lifecycle/PageAppearType;", "dispatchPageDisappear", "Lcom/dianping/shield/lifecycle/PageDisappearType;", "findAgent", "Lcom/dianping/agentsdk/framework/AgentInterface;", "name", "", "generaterConfigs", "Ljava/util/ArrayList;", "Lcom/dianping/agentsdk/framework/AgentListConfig;", "getHostAgentManager", "Lcom/dianping/agentsdk/framework/AgentManagerInterface;", "getHostCellManager", "Lcom/dianping/agentsdk/framework/CellManagerInterface;", "getPageLifecycleObserver", "Lcom/dianping/shield/lifecycle/PageLifecycleObserver;", "getWhiteBoard", "Lcom/dianping/agentsdk/framework/WhiteBoard;", "kotlin.jvm.PlatformType", "initAgentManger", "initCellManager", "initWhiteBoard", "initializePageContainer", "Lcom/dianping/agentsdk/framework/PageContainerInterface;", "isWhiteBoardShared", "isShared", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, "", Constant.KEY_RESULT_CODE, "data", "Landroid/content/Intent;", "onCreate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onPageAppear", "onPageDisappear", "onPause", "onResume", "onSaveInstanceState", "outState", "onStart", "onStop", "resetAgents", "setAgentContainerView", "containerView", "updateAgentCell", "agent", "updateAgentType", "Lcom/dianping/agentsdk/framework/UpdateAgentType;", "section", "row", "count", "updateAgentContainer", "updateCells", "addList", "updateList", "deleteList", "Companion", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class ShieldFragment extends Fragment implements a, ao, ShieldContainerInterface, PageLifecycleCallbacks, PageLifecycleDispatcher {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = ShieldFragment.class.getSimpleName();
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap _$_findViewCache;
    private final ShieldLifeCycler shieldLifeCycler;

    public ShieldFragment() {
        this(null, 1, null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b20a3db6aead2deeed473fd3a790bad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b20a3db6aead2deeed473fd3a790bad");
        }
    }

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            View findViewById = view2.findViewById(i);
            this._$_findViewCache.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleDispatcher
    public void dispatchPageAppear(@NotNull PageAppearType pageAppearType) {
        Object[] objArr = {pageAppearType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "337a02ca25592e1257f01133915afe5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "337a02ca25592e1257f01133915afe5f");
            return;
        }
        h.b(pageAppearType, "type");
        this.shieldLifeCycler.dispatchPageAppear(pageAppearType);
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleDispatcher
    public void dispatchPageDisappear(@NotNull PageDisappearType pageDisappearType) {
        Object[] objArr = {pageDisappearType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15c90bbb90e1318c9b408888336fe11f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15c90bbb90e1318c9b408888336fe11f");
            return;
        }
        h.b(pageDisappearType, "type");
        this.shieldLifeCycler.dispatchPageDisappear(pageDisappearType);
    }

    @Override // com.dianping.shield.framework.ShieldContainerInterface
    @Nullable
    public abstract ArrayList<c> generaterConfigs();

    @Override // com.dianping.shield.framework.ShieldContainerInterface
    @Nullable
    public d getHostAgentManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "714855cee814ac7ddd8636eacac015a6", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "714855cee814ac7ddd8636eacac015a6") : this.shieldLifeCycler.getHostAgentManager();
    }

    @Override // com.dianping.shield.framework.ShieldContainerInterface
    @Nullable
    public j<?> getHostCellManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b77ceab5966f717255f482933d5988bf", RobustBitConfig.DEFAULT_VALUE) ? (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b77ceab5966f717255f482933d5988bf") : this.shieldLifeCycler.getHostCellManager();
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleDispatcher
    @NotNull
    public PageLifecycleObserver getPageLifecycleObserver() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df6472b1d5a99fa48ac693280b8cca4a", RobustBitConfig.DEFAULT_VALUE) ? (PageLifecycleObserver) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df6472b1d5a99fa48ac693280b8cca4a") : this.shieldLifeCycler.getPageLifecycleObserver();
    }

    @Override // com.dianping.agentsdk.framework.u
    public ar getWhiteBoard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6a56fe2b2239c0c961a4ebf427a7d88", RobustBitConfig.DEFAULT_VALUE) ? (ar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6a56fe2b2239c0c961a4ebf427a7d88") : this.shieldLifeCycler.getWhiteBoard();
    }

    @Nullable
    public ab<?> initializePageContainer() {
        return null;
    }

    @Override // android.support.v4.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleCallbacks
    public void onPageAppear(@NotNull PageAppearType pageAppearType) {
        Object[] objArr = {pageAppearType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea7a60926bdcbe2ef1a2dbea76ea241a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea7a60926bdcbe2ef1a2dbea76ea241a");
            return;
        }
        h.b(pageAppearType, "type");
        this.shieldLifeCycler.onPageAppear(pageAppearType);
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleCallbacks
    public void onPageDisappear(@NotNull PageDisappearType pageDisappearType) {
        Object[] objArr = {pageDisappearType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a02fc3f8fd20e74a8de073b59af4d5ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a02fc3f8fd20e74a8de073b59af4d5ad");
            return;
        }
        h.b(pageDisappearType, "type");
        this.shieldLifeCycler.onPageDisappear(pageDisappearType);
    }

    @Override // com.dianping.agentsdk.framework.u
    public void updateAgentCell(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cb60b1247b2fb0ad28c85e815ebbfa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cb60b1247b2fb0ad28c85e815ebbfa5");
        } else {
            this.shieldLifeCycler.updateAgentCell(agentInterface);
        }
    }

    @Override // com.dianping.agentsdk.framework.ao
    public void updateAgentCell(AgentInterface agentInterface, ap apVar, int i, int i2, int i3) {
        Object[] objArr = {agentInterface, apVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0bcd5c1e4cd92ff52f4b7e6c1ecf3a9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0bcd5c1e4cd92ff52f4b7e6c1ecf3a9f");
        } else {
            this.shieldLifeCycler.updateAgentCell(agentInterface, apVar, i, i2, i3);
        }
    }

    @Override // com.dianping.agentsdk.framework.a
    public void updateCells(ArrayList<AgentInterface> arrayList, ArrayList<AgentInterface> arrayList2, ArrayList<AgentInterface> arrayList3) {
        Object[] objArr = {arrayList, arrayList2, arrayList3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca5e106f62239804e085c3923a895923", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca5e106f62239804e085c3923a895923");
        } else {
            this.shieldLifeCycler.updateCells(arrayList, arrayList2, arrayList3);
        }
    }

    public /* synthetic */ ShieldFragment(ShieldLifeCycler shieldLifeCycler, int i, f fVar) {
        this((i & 1) != 0 ? new ShieldLifeCycler() : shieldLifeCycler);
    }

    public ShieldFragment(@NotNull ShieldLifeCycler shieldLifeCycler) {
        h.b(shieldLifeCycler, "shieldLifeCycler");
        Object[] objArr = {shieldLifeCycler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5abd6410be4fa40c86926cee3ebf930c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5abd6410be4fa40c86926cee3ebf930c");
            return;
        }
        this.shieldLifeCycler = shieldLifeCycler;
        this.shieldLifeCycler.setHostFragment(this);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dianping/shield/fragment/ShieldFragment$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG$shieldCore_release", "()Ljava/lang/String;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final String getTAG$shieldCore_release() {
            return ShieldFragment.TAG;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5d4020a03c09d3bcdfd1edfa178fc87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5d4020a03c09d3bcdfd1edfa178fc87");
            return;
        }
        super.onCreate(bundle);
        this.shieldLifeCycler.setWhiteBoard(initWhiteBoard());
        this.shieldLifeCycler.onCreate(bundle);
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@Nullable LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e40489a104bbb331d27fcbe3656c2524", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e40489a104bbb331d27fcbe3656c2524");
        }
        this.shieldLifeCycler.setPageContainer(initializePageContainer());
        return this.shieldLifeCycler.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7524dfde30ffeffe313bfd888f12c984", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7524dfde30ffeffe313bfd888f12c984");
            return;
        }
        super.onActivityCreated(bundle);
        this.shieldLifeCycler.setCellManager(initCellManager());
        this.shieldLifeCycler.setAgentManager(initAgentManger());
        this.shieldLifeCycler.setShieldConfigs(generaterConfigs());
        this.shieldLifeCycler.onActivityCreated(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9131a152ff7bae2c4a16602fae53c29a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9131a152ff7bae2c4a16602fae53c29a");
            return;
        }
        super.onStart();
        this.shieldLifeCycler.onStart();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "486203dc7b71c6b8c1a172a2b1d43bbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "486203dc7b71c6b8c1a172a2b1d43bbd");
            return;
        }
        super.onResume();
        this.shieldLifeCycler.onResume();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70571ba01c0b73175228f46e96342e7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70571ba01c0b73175228f46e96342e7f");
            return;
        }
        this.shieldLifeCycler.onPause();
        super.onPause();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0476a489fe83722e601cd26d7b5553c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0476a489fe83722e601cd26d7b5553c");
            return;
        }
        this.shieldLifeCycler.onStop();
        super.onStop();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a91d2dbb6d5e84e1608c34318c7643f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a91d2dbb6d5e84e1608c34318c7643f");
            return;
        }
        this.shieldLifeCycler.onDestroy();
        super.onDestroy();
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2560840844c71e170ce93eddb9d34d50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2560840844c71e170ce93eddb9d34d50");
            return;
        }
        super.onSaveInstanceState(bundle);
        this.shieldLifeCycler.onSaveInstanceState(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9168d41f23212112b4c2d99413f32d30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9168d41f23212112b4c2d99413f32d30");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        this.shieldLifeCycler.onActivityResult(i, i2, intent);
        com.meituan.android.privacy.aop.a.f();
    }

    @NotNull
    public j<?> initCellManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ddc9be115a0abcaf062df699bd0e0da", RobustBitConfig.DEFAULT_VALUE) ? (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ddc9be115a0abcaf062df699bd0e0da") : new b(getContext());
    }

    @NotNull
    public d initAgentManger() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a517cad4b2fb16a4f4e31038aca035ea", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a517cad4b2fb16a4f4e31038aca035ea") : new LightAgentManager(this.shieldLifeCycler);
    }

    @NotNull
    public ar initWhiteBoard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dffdc5de8b1076a657d6cfcb5acf2979", RobustBitConfig.DEFAULT_VALUE) ? (ar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dffdc5de8b1076a657d6cfcb5acf2979") : this.shieldLifeCycler.getHostWhiteBoard();
    }

    public void isWhiteBoardShared(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91cd2fa58923dabb35b6dec6b4758dc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91cd2fa58923dabb35b6dec6b4758dc1");
        } else {
            this.shieldLifeCycler.setWhiteBoardShared(z);
        }
    }

    public final void setAgentContainerView(@NotNull ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "708bfd12a75c2fd92bb61bf45f0931a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "708bfd12a75c2fd92bb61bf45f0931a6");
            return;
        }
        h.b(viewGroup, "containerView");
        this.shieldLifeCycler.setAgentContainerView(viewGroup);
    }

    public final void updateAgentContainer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84cea68f6276038cb27127dfd1c7a5fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84cea68f6276038cb27127dfd1c7a5fb");
        } else {
            this.shieldLifeCycler.updateAgentContainer();
        }
    }

    @Nullable
    public final AgentInterface findAgent(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b751f092139732a49485d9be2f69c05", RobustBitConfig.DEFAULT_VALUE)) {
            return (AgentInterface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b751f092139732a49485d9be2f69c05");
        }
        h.b(str, "name");
        return this.shieldLifeCycler.findAgent(str);
    }

    @Override // com.dianping.shield.framework.ShieldContainerInterface
    public void resetAgents(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cca25fdeacf7d9873b3409227fc3e9b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cca25fdeacf7d9873b3409227fc3e9b4");
            return;
        }
        this.shieldLifeCycler.setShieldConfigs(generaterConfigs());
        this.shieldLifeCycler.resetAgents(bundle);
    }
}
