package com.dianping.shield.dynamic.playground;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.dianping.agentsdk.framework.ar;
import com.dianping.agentsdk.framework.c;
import com.dianping.agentsdk.framework.j;
import com.dianping.shield.AgentConfigParser;
import com.dianping.shield.bridge.ShieldDataStorage;
import com.dianping.shield.dynamic.playground.DMPlaygroundSettingFragment;
import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.framework.ShieldConfig;
import com.dianping.shield.framework.ShieldConfigInfo;
import com.dianping.shield.manager.ShieldNodeCellManager;
import com.dianping.voyager.fragment.CommonShieldFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.o;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\u0005H&J\u001c\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u0006H\u0014J\f\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0012\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0006\u0010\u0017\u001a\u00020\u0012J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aR4\u0010\u0003\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004j\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006`\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/dianping/shield/dynamic/playground/DMPlaygroundFragment;", "Lcom/dianping/voyager/fragment/CommonShieldFragment;", "()V", "agents", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "listModules", "", "listWhiteboard", "", "Lcom/dianping/shield/dynamic/playground/DMPlaygroundSettingFragment$WhiteBoardInfo;", "defaultKey", "generaterDefaultConfigAgentList", "Lcom/dianping/agentsdk/framework/AgentListConfig;", "initCellManager", "Lcom/dianping/agentsdk/framework/CellManagerInterface;", "initModules", "", "initWhiteboard", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "reset", "setShieldDataStorage", "shieldDataStorage", "Lcom/dianping/shield/bridge/ShieldDataStorage;", "Companion", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class DMPlaygroundFragment extends CommonShieldFragment {
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String SPLIT = "/";
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap _$_findViewCache;
    private ArrayList<ArrayList<String>> agents;
    private List<String> listModules;
    private List<? extends DMPlaygroundSettingFragment.WhiteBoardInfo> listWhiteboard;

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment
    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment
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

    @NotNull
    public abstract String defaultKey();

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment, android.support.v4.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public DMPlaygroundFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b754f8cb2d55cdcee601770d62a3e809", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b754f8cb2d55cdcee601770d62a3e809");
            return;
        }
        this.listWhiteboard = new ArrayList();
        this.listModules = new ArrayList();
        this.agents = new ArrayList<>();
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/shield/dynamic/playground/DMPlaygroundFragment$Companion;", "", "()V", "SPLIT", "", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Override // com.dianping.voyager.fragment.CommonShieldFragment, com.dianping.agentsdk.fragment.AgentManagerFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "613bda2eeb980ca1257269a7fdd11347", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "613bda2eeb980ca1257269a7fdd11347");
            return;
        }
        super.onCreate(bundle);
        reset();
    }

    public final void setShieldDataStorage(@NotNull ShieldDataStorage shieldDataStorage) {
        Object[] objArr = {shieldDataStorage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f8a9fdd50dfe2d964152e6f434ece39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f8a9fdd50dfe2d964152e6f434ece39");
            return;
        }
        h.b(shieldDataStorage, "shieldDataStorage");
        ShieldEnvironment.INSTANCE.setDataStorage(shieldDataStorage);
    }

    public final void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "787d987ed63f412c654092ee8e161bda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "787d987ed63f412c654092ee8e161bda");
            return;
        }
        initWhiteboard();
        initModules();
        resetAgents(null);
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment
    @NotNull
    public j<?> initCellManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38c5bb9733dfdd8f33b92361fee7e6ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38c5bb9733dfdd8f33b92361fee7e6ab");
        }
        Context context = getContext();
        if (context == null) {
            h.a();
        }
        return new ShieldNodeCellManager(context);
    }

    private final void initWhiteboard() {
        ShieldDataStorage dataStorage;
        ar whiteBoard;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1a069b00446ea1054c8b642903b238d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1a069b00446ea1054c8b642903b238d");
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null || (dataStorage = ShieldEnvironment.INSTANCE.getDataStorage()) == null) {
            return;
        }
        Context applicationContext = activity.getApplicationContext();
        h.a((Object) applicationContext, "it.applicationContext");
        SharedPreferences sharedPreferences = dataStorage.getSharedPreferences(applicationContext, DMPlaygroundSettingFragment.PICASSO_MODULES_PLAYGROUND_SETTINGS);
        if (sharedPreferences == null) {
            return;
        }
        String string = sharedPreferences.getString(DMPlaygroundSettingFragment.PICASSO_MODULES_PLAYGROUND_WHITEBOARD, "");
        h.a((Object) string, "wbStr");
        List<String> a = new kotlin.text.f(CommonConstant.Symbol.COMMA).a(string, 0);
        if (a == null) {
            throw new o("null cannot be cast to non-null type java.util.Collection<T>");
        }
        Object[] array = a.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            List<String> asList = Arrays.asList((String[]) Arrays.copyOf(strArr, strArr.length));
            this.listWhiteboard = new ArrayList();
            for (String str : asList) {
                String str2 = str;
                if (!TextUtils.isEmpty(str2)) {
                    h.a((Object) str, "str");
                    List<String> a2 = new kotlin.text.f("/").a(str2, 0);
                    if (a2 == null) {
                        throw new o("null cannot be cast to non-null type java.util.Collection<T>");
                    }
                    Object[] array2 = a2.toArray(new String[0]);
                    if (array2 != null) {
                        String[] strArr2 = (String[]) array2;
                        if (strArr2.length == 2 && (whiteBoard = getWhiteBoard()) != null) {
                            whiteBoard.a(strArr2[0], strArr2[1]);
                        }
                    } else {
                        throw new o("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
            }
            return;
        }
        throw new o("null cannot be cast to non-null type kotlin.Array<T>");
    }

    private final void initModules() {
        ShieldDataStorage dataStorage;
        String[] strArr;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f9c0192ddfe99d02efc4ba5ff7767b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f9c0192ddfe99d02efc4ba5ff7767b4");
            return;
        }
        Context context = getContext();
        if (context == null || (dataStorage = ShieldEnvironment.INSTANCE.getDataStorage()) == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        h.a((Object) applicationContext, "it.applicationContext");
        SharedPreferences sharedPreferences = dataStorage.getSharedPreferences(applicationContext, DMPlaygroundSettingFragment.PICASSO_MODULES_PLAYGROUND_SETTINGS);
        if (sharedPreferences == null) {
            return;
        }
        String string = sharedPreferences.getString(DMPlaygroundSettingFragment.PICASSO_MODULES_PLAYGROUND_MODULES, "");
        String str = string;
        if (!TextUtils.isEmpty(str)) {
            this.listModules = new ArrayList();
            h.a((Object) string, "wbStr");
            List<String> a = new kotlin.text.f(CommonConstant.Symbol.COMMA).a(str, 0);
            if (a == null) {
                throw new o("null cannot be cast to non-null type java.util.Collection<T>");
            }
            Object[] array = a.toArray(new String[0]);
            if (array != null) {
                for (String str2 : (String[]) array) {
                    if (g.a((CharSequence) str2, '/', 0, false, 6, (Object) null) == 0) {
                        List<String> list = this.listModules;
                        if (str2 == null) {
                            throw new o("null cannot be cast to non-null type java.lang.String");
                        }
                        String substring = str2.substring(1);
                        h.a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                        list.add(substring);
                    } else {
                        this.listModules.add(str2);
                    }
                }
            } else {
                throw new o("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            this.listModules = new ArrayList();
        }
        this.agents.clear();
        if (this.listModules.size() > 0) {
            int i = 0;
            for (Object obj : this.listModules) {
                int i2 = i + 1;
                if (i < 0) {
                    kotlin.collections.h.a();
                }
                this.agents.add(kotlin.collections.h.c((String) obj));
                i = i2;
            }
        }
    }

    @Override // com.dianping.voyager.fragment.CommonShieldFragment, com.dianping.agentsdk.fragment.AgentManagerFragment
    @Nullable
    public ArrayList<c> generaterDefaultConfigAgentList() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4dbbf6d54b75c829349890b39eff8502", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4dbbf6d54b75c829349890b39eff8502");
        }
        final ArrayList arrayList = new ArrayList();
        if (this.agents.isEmpty()) {
            this.agents.add(kotlin.collections.h.c(defaultKey()));
        }
        for (Object obj : this.agents) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.h.a();
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll((ArrayList) obj);
            arrayList.add(arrayList2);
            i = i2;
        }
        ArrayList<c> arrayList3 = new ArrayList<>();
        arrayList3.add(new ShieldConfig() { // from class: com.dianping.shield.dynamic.playground.DMPlaygroundFragment$generaterDefaultConfigAgentList$2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.agentsdk.framework.c
            public final boolean shouldShow() {
                return true;
            }

            @Override // com.dianping.shield.framework.ShieldConfig
            @NotNull
            public final ArrayList<ArrayList<ShieldConfigInfo>> getAgentGroupConfig() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6c3e3ba85bf66ad5f673676729688f33", RobustBitConfig.DEFAULT_VALUE)) {
                    return (ArrayList) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6c3e3ba85bf66ad5f673676729688f33");
                }
                ArrayList<ArrayList<ShieldConfigInfo>> shieldConfig = AgentConfigParser.getShieldConfig(arrayList);
                h.a((Object) shieldConfig, "AgentConfigParser.getShieldConfig(agentList)");
                return shieldConfig;
            }
        });
        return arrayList3;
    }
}
