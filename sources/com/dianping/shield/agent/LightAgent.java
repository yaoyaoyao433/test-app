package com.dianping.shield.agent;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.View;
import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.af;
import com.dianping.agentsdk.framework.ao;
import com.dianping.agentsdk.framework.ap;
import com.dianping.agentsdk.framework.ar;
import com.dianping.agentsdk.framework.j;
import com.dianping.agentsdk.framework.u;
import com.dianping.shield.bridge.feature.ShieldGlobalFeatureInterface;
import com.dianping.shield.feature.AgentManagerFeatureInterface;
import com.dianping.shield.framework.AgentRefreshInterface;
import com.dianping.shield.framework.ShieldContainerInterface;
import com.dianping.shield.lifecycle.PageAppearType;
import com.dianping.shield.lifecycle.PageDisappearType;
import com.dianping.shield.monitor.ShieldGAInfo;
import com.dianping.shield.monitor.ShieldGAInterface;
import com.dianping.shield.monitor.ShieldGAType;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.d;
import rx.subjects.c;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class LightAgent implements AgentRefreshInterface, ShieldContainerInterface, ShieldGAInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected HashMap<String, Serializable> arguments;
    protected u bridge;
    protected ShieldGAInfo defaultGAInfo;
    protected Fragment fragment;
    public String hostName;
    public String index;
    private c<AgentInterface> loadedSubject;
    protected ArrayList<String> messageRegistrationList;
    public ab pageContainer;

    @Override // com.dianping.shield.framework.ShieldContainerInterface
    public ArrayList<com.dianping.agentsdk.framework.c> generaterConfigs() {
        return null;
    }

    @Override // com.dianping.agentsdk.framework.AgentInterface
    public af getSectionCellInterface() {
        return null;
    }

    @Override // com.dianping.agentsdk.framework.AgentInterface
    public ShieldSectionCellItem getSectionCellItem() {
        return null;
    }

    @Override // com.dianping.agentsdk.framework.AgentInterface
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.dianping.agentsdk.framework.AgentInterface
    @Deprecated
    public void onAgentChanged(Bundle bundle) {
    }

    @Override // com.dianping.agentsdk.framework.AgentInterface
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f84f6b46d10cbd799fb1b14e5ef8e24e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f84f6b46d10cbd799fb1b14e5ef8e24e");
        }
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleCallbacks
    public void onPageAppear(@NotNull PageAppearType pageAppearType) {
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleCallbacks
    public void onPageDisappear(@NotNull PageDisappearType pageDisappearType) {
    }

    @Override // com.dianping.agentsdk.framework.AgentInterface
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d9aa6ba385543e091c2be0dc38291a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d9aa6ba385543e091c2be0dc38291a0");
        }
    }

    @Override // com.dianping.shield.framework.AgentRefreshInterface
    @Nullable
    public d<Object> onRefresh() {
        return null;
    }

    @Override // com.dianping.agentsdk.framework.AgentInterface
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7c1ff2423103262e5dd010e2dd5920c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7c1ff2423103262e5dd010e2dd5920c");
        }
    }

    @Override // com.dianping.agentsdk.framework.AgentInterface
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56ffaf300cdc1caa9c60e63a97445088", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56ffaf300cdc1caa9c60e63a97445088");
        }
    }

    @Override // com.dianping.agentsdk.framework.AgentInterface
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30c6060cad1abe7365f2e2314722fc24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30c6060cad1abe7365f2e2314722fc24");
        }
    }

    public LightAgent(Fragment fragment, u uVar, ab abVar) {
        Object[] objArr = {fragment, uVar, abVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd7e4d5d3f65bc05c5f028dae59673b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd7e4d5d3f65bc05c5f028dae59673b8");
            return;
        }
        this.index = "";
        this.hostName = "";
        this.defaultGAInfo = new ShieldGAInfo(ShieldGAType.NATIVEMODULE, getClass().getName());
        this.fragment = fragment;
        this.bridge = uVar;
        this.pageContainer = abVar;
    }

    @Override // com.dianping.agentsdk.framework.AgentInterface
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "710fd4d8b855014183f3981c0a73d9f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "710fd4d8b855014183f3981c0a73d9f9");
        } else if (getWhiteBoard() == null || this.messageRegistrationList == null || this.messageRegistrationList.isEmpty()) {
        } else {
            Iterator<String> it = this.messageRegistrationList.iterator();
            while (it.hasNext()) {
                getWhiteBoard().a(it.next());
            }
        }
    }

    @Override // com.dianping.agentsdk.framework.AgentInterface
    public Bundle saveInstanceState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4be4c3203b626d6b3e5bfc6224f3c83b", RobustBitConfig.DEFAULT_VALUE) ? (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4be4c3203b626d6b3e5bfc6224f3c83b") : new Bundle();
    }

    @Override // com.dianping.agentsdk.framework.AgentInterface
    public String getIndex() {
        return this.index;
    }

    @Override // com.dianping.agentsdk.framework.AgentInterface
    public void setIndex(String str) {
        this.index = str;
    }

    @Override // com.dianping.agentsdk.framework.AgentInterface
    public String getHostName() {
        return this.hostName;
    }

    @Override // com.dianping.agentsdk.framework.AgentInterface
    public void setHostName(String str) {
        this.hostName = str;
    }

    @Override // com.dianping.agentsdk.framework.AgentInterface
    public String getAgentCellName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f0dcb3e2389fa119c3de3f2cfcedb73", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f0dcb3e2389fa119c3de3f2cfcedb73");
        }
        return hashCode() + CommonConstant.Symbol.MINUS + getClass().getCanonicalName();
    }

    public void updateAgentCell() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51eaf58370e82a751446ae784700d875", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51eaf58370e82a751446ae784700d875");
        } else {
            this.bridge.updateAgentCell(this);
        }
    }

    public void updateAgentCell(ap apVar, int i, int i2, int i3) {
        Object[] objArr = {apVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69617a264f4cc9b1012be926f4183d2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69617a264f4cc9b1012be926f4183d2c");
        } else if (this.bridge instanceof ao) {
            ((ao) this.bridge).updateAgentCell(this, apVar, i, i2, i3);
        } else {
            updateAgentCell();
        }
    }

    public ar getWhiteBoard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e551b9780c225faa5a3d6da097c8aa7e", RobustBitConfig.DEFAULT_VALUE) ? (ar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e551b9780c225faa5a3d6da097c8aa7e") : this.bridge.getWhiteBoard();
    }

    public Fragment getHostFragment() {
        return this.fragment;
    }

    public void startActivity(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "735766cc8ec2affb02e4ca247477da5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "735766cc8ec2affb02e4ca247477da5b");
        } else {
            this.fragment.startActivity(intent);
        }
    }

    public void startActivityForResult(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b96a6b608b5ff551cbb045de664d70c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b96a6b608b5ff551cbb045de664d70c8");
        } else {
            this.fragment.startActivityForResult(intent, i);
        }
    }

    public Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "adad20c20960560050f91533d74e725e", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "adad20c20960560050f91533d74e725e") : this.fragment.getContext();
    }

    public void registerMessageHandler(@NonNull String str, @NonNull ar.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96623116b1598e39c53b79b3d467c000", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96623116b1598e39c53b79b3d467c000");
        } else if (getWhiteBoard() == null) {
        } else {
            if (this.messageRegistrationList == null) {
                this.messageRegistrationList = new ArrayList<>();
            }
            this.messageRegistrationList.add(getWhiteBoard().a(str, aVar));
        }
    }

    public String registerMessageHandlerWithId(@NonNull String str, @NonNull ar.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5a42d261b1fdfc4eedda40b13aa59e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5a42d261b1fdfc4eedda40b13aa59e6");
        }
        if (getWhiteBoard() == null) {
            return null;
        }
        if (this.messageRegistrationList == null) {
            this.messageRegistrationList = new ArrayList<>();
        }
        String a = getWhiteBoard().a(str, aVar);
        this.messageRegistrationList.add(a);
        return a;
    }

    public void removeMessageHandler(@NonNull String str, @NonNull ar.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fad7031b37dedd1d547deb03d643058e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fad7031b37dedd1d547deb03d643058e");
        } else if (getWhiteBoard() == null) {
        } else {
            getWhiteBoard().b(str, aVar);
        }
    }

    public void removeMessageHandler(@NonNull ar.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9d836ca7890285514d6a42750ec0043", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9d836ca7890285514d6a42750ec0043");
        } else if (getWhiteBoard() == null) {
        } else {
            getWhiteBoard().a(aVar);
        }
    }

    public void removeMessageHandler(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bf9a3b0643a8947c0453f922c391a83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bf9a3b0643a8947c0453f922c391a83");
        } else if (getWhiteBoard() == null) {
        } else {
            getWhiteBoard().a(str);
        }
    }

    @Override // com.dianping.shield.framework.ShieldContainerInterface
    public void resetAgents(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2c72713246b3a8284b854921bd7947d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2c72713246b3a8284b854921bd7947d");
        } else if (this.fragment instanceof ShieldContainerInterface) {
            ((ShieldContainerInterface) this.fragment).resetAgents(bundle);
        }
    }

    @Override // com.dianping.shield.framework.ShieldContainerInterface
    public j getHostCellManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3228c68579ff4b571ef39ed4e1b54f50", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3228c68579ff4b571ef39ed4e1b54f50");
        }
        if (this.fragment instanceof ShieldContainerInterface) {
            return ((ShieldContainerInterface) this.fragment).getHostCellManager();
        }
        return null;
    }

    @Override // com.dianping.shield.framework.ShieldContainerInterface
    public com.dianping.agentsdk.framework.d getHostAgentManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd32f639c5b1d33c259c6346cadbacec", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.agentsdk.framework.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd32f639c5b1d33c259c6346cadbacec");
        }
        if (this.fragment instanceof ShieldContainerInterface) {
            return ((ShieldContainerInterface) this.fragment).getHostAgentManager();
        }
        return null;
    }

    @Override // com.dianping.agentsdk.framework.AgentInterface
    public HashMap<String, Serializable> getArguments() {
        return this.arguments;
    }

    @Override // com.dianping.agentsdk.framework.AgentInterface
    public void setArguments(HashMap<String, Serializable> hashMap) {
        this.arguments = hashMap;
    }

    public Rect getViewParentRect(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce7dc97fc9766e18ea5f744abebaf062", RobustBitConfig.DEFAULT_VALUE) ? (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce7dc97fc9766e18ea5f744abebaf062") : getFeature().getViewParentRect(view);
    }

    public ShieldGlobalFeatureInterface getFeature() {
        if (this.bridge instanceof ShieldGlobalFeatureInterface) {
            return (ShieldGlobalFeatureInterface) this.bridge;
        }
        return null;
    }

    public ShieldGAInfo getShieldGAInfo() {
        return this.defaultGAInfo;
    }

    @Override // com.dianping.shield.framework.AgentRefreshInterface
    public void updateConfigure() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17483cd735df884a198a90dcd9c9c374", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17483cd735df884a198a90dcd9c9c374");
            return;
        }
        ArrayList<com.dianping.agentsdk.framework.c> generaterConfigs = generaterConfigs();
        com.dianping.agentsdk.framework.d hostAgentManager = getHostAgentManager();
        if ((hostAgentManager instanceof AgentManagerFeatureInterface) && generaterConfigs != null) {
            ((AgentManagerFeatureInterface) hostAgentManager).updateAgentConfigures(generaterConfigs, this.loadedSubject, this);
        } else if (this.loadedSubject != null) {
            this.loadedSubject.onNext(this);
            this.loadedSubject.onCompleted();
        }
    }

    @Override // com.dianping.shield.framework.AgentRefreshInterface
    @Nullable
    public d<AgentInterface> getLoadedObservable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4c4a4f745ec1d04930f10bccc3d9318", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4c4a4f745ec1d04930f10bccc3d9318");
        }
        if (generaterConfigs() == null) {
            return null;
        }
        this.loadedSubject = c.g();
        return this.loadedSubject;
    }

    @Override // com.dianping.shield.framework.AgentRefreshInterface
    public AgentLoadedObservableType getLoadedObservableType() {
        return AgentLoadedObservableType.AND;
    }
}
