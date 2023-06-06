package com.dianping.voyager.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import com.dianping.agentsdk.fragment.AgentManagerFragment;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.aq;
import com.dianping.agentsdk.framework.ar;
import com.dianping.agentsdk.framework.c;
import com.dianping.agentsdk.framework.j;
import com.dianping.shield.AgentConfigParser;
import com.dianping.shield.bridge.ShieldLogger;
import com.dianping.shield.component.entity.LayoutMode;
import com.dianping.shield.component.widgets.ScTitleBarProviderInterface;
import com.dianping.shield.component.widgets.ScTitleBarTransparentListener;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.consts.WhiteBoardKeyConsts;
import com.dianping.shield.entity.ExposeAction;
import com.dianping.shield.entity.PageAgentsPersistenceParams;
import com.dianping.shield.entity.PageDividerThemeParams;
import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.framework.HoloShieldLifeCycler;
import com.dianping.shield.framework.ShieldConfig;
import com.dianping.shield.framework.ShieldConfigInfo;
import com.dianping.shield.manager.ShieldNodeCellManager;
import com.dianping.shield.preload.ShieldPreloadManager;
import com.dianping.shield.preload.ShieldPreloadUnit;
import com.dianping.voyager.widgets.container.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.d;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CommonShieldFragment extends AgentManagerFragment {
    public static final String CONFIG_INFO = "remoteConfigInfo";
    private static final int DEFAULT_AUTO_OFFSET_DP = 44;
    public static final int DEFAULT_VALUE = -1;
    public static final String LOADING_DONE = "0";
    public static final String LOADING_FAIL = "1";
    public static ChangeQuickRedirect changeQuickRedirect;
    private int autoOffset;
    private int autoTopHoverOffset;
    private int backgroundColor;
    private int bottomLineColor;
    private int defaultAutoOffsetDP;
    private int defaultHeaderHeight;
    private int defaultLeftOffset;
    private int defaultRightOffset;
    private ar delegateWhiteBoard;
    private boolean disabledecoration;
    private boolean enableDivider;
    private boolean hasDragRefresh;
    private boolean hasOptionMenu;
    private boolean headerFirst;
    private int heightForExtraFirstSectionHeader;
    private int heightForExtraLastSectionFooter;
    private boolean hideTitleBar;
    private int index;
    private boolean isDragRefresh;
    private boolean isRefreshing;
    private int leftMargin;
    private int leftSeparatorMargin;
    private int middleLineColor;
    private boolean needAddLastFooter;
    private boolean needLoading;
    private boolean needMultiStickTop;
    private boolean needStableId;
    private int pageBackgroundColor;
    protected CommonPageContainer pageContainer;
    private int pageContainerMode;
    private String pageTitle;
    private String pfmPageName;
    private boolean pullToX;
    protected k refreshCompleteObserver;
    private ArrayList<ArrayList<ShieldConfigInfo>> remoteAgentInfo;
    protected String remoteListObserverId;
    private boolean reserveUnUsedModule;
    private int rightMargin;
    private int rightSeparatorMargin;
    private ScTitleBarTransparentListener scTitleBarTransparentListener;
    private int sectionFooterHeight;
    private int sectionHeaderHeight;
    protected ShieldPreloadUnit shieldPreloadUnit;
    private String tabKey;
    private boolean titlebarOverlay;
    private int topLineColor;
    private int zFrameLayoutResId;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b implements Serializable {
        public String a;
        public String b;
    }

    @Deprecated
    public void setPageMargin(Rect rect) {
    }

    public CommonShieldFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db783344bb1e270a23ad4dc329d8700f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db783344bb1e270a23ad4dc329d8700f");
            return;
        }
        this.isRefreshing = false;
        this.hasOptionMenu = true;
        this.needMultiStickTop = false;
        this.pageContainerMode = 0;
        this.pullToX = true;
        this.isDragRefresh = false;
        this.needLoading = false;
        this.needStableId = false;
        this.headerFirst = false;
        this.enableDivider = true;
        this.needAddLastFooter = true;
        this.disabledecoration = false;
        this.hideTitleBar = false;
        this.autoOffset = 0;
        this.titlebarOverlay = false;
        this.pageBackgroundColor = -1;
        this.backgroundColor = -1;
        this.middleLineColor = -1;
        this.topLineColor = -1;
        this.bottomLineColor = -1;
        this.leftSeparatorMargin = -1;
        this.rightSeparatorMargin = -1;
        this.leftMargin = -1;
        this.rightMargin = -1;
        this.sectionHeaderHeight = -1;
        this.sectionFooterHeight = -1;
        this.autoTopHoverOffset = -1;
        this.heightForExtraFirstSectionHeader = -1;
        this.heightForExtraLastSectionFooter = -1;
        this.zFrameLayoutResId = -1;
        this.index = -1;
        this.tabKey = null;
    }

    @SuppressLint({"ValidFragment"})
    public CommonShieldFragment(@NotNull HoloShieldLifeCycler holoShieldLifeCycler) {
        super(holoShieldLifeCycler);
        Object[] objArr = {holoShieldLifeCycler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9f2e402d67828833a0e960536b483ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9f2e402d67828833a0e960536b483ee");
            return;
        }
        this.isRefreshing = false;
        this.hasOptionMenu = true;
        this.needMultiStickTop = false;
        this.pageContainerMode = 0;
        this.pullToX = true;
        this.isDragRefresh = false;
        this.needLoading = false;
        this.needStableId = false;
        this.headerFirst = false;
        this.enableDivider = true;
        this.needAddLastFooter = true;
        this.disabledecoration = false;
        this.hideTitleBar = false;
        this.autoOffset = 0;
        this.titlebarOverlay = false;
        this.pageBackgroundColor = -1;
        this.backgroundColor = -1;
        this.middleLineColor = -1;
        this.topLineColor = -1;
        this.bottomLineColor = -1;
        this.leftSeparatorMargin = -1;
        this.rightSeparatorMargin = -1;
        this.leftMargin = -1;
        this.rightMargin = -1;
        this.sectionHeaderHeight = -1;
        this.sectionFooterHeight = -1;
        this.autoTopHoverOffset = -1;
        this.heightForExtraFirstSectionHeader = -1;
        this.heightForExtraLastSectionFooter = -1;
        this.zFrameLayoutResId = -1;
        this.index = -1;
        this.tabKey = null;
    }

    public void setSharedWhiteBoard(ar arVar) {
        Object[] objArr = {arVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97e69b0e0cb1031e2e42118f1c7f078e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97e69b0e0cb1031e2e42118f1c7f078e");
            return;
        }
        this.delegateWhiteBoard = arVar;
        isWhiteBoardShared(true);
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment, android.support.v4.app.Fragment
    public void onAttach(@Nullable Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdaf6d0f7ecc119e634fbda6bcce4823", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdaf6d0f7ecc119e634fbda6bcce4823");
            return;
        }
        super.onAttach(context);
        this.shieldPreloadUnit = ShieldPreloadManager.INSTANCE.getUnit();
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public int getIndex() {
        return this.index;
    }

    public void setTabKey(String str) {
        this.tabKey = str;
    }

    public String getTabKey() {
        return this.tabKey;
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d64e993ceca49f6466cbc752a761bd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d64e993ceca49f6466cbc752a761bd3");
            return;
        }
        super.onCreate(bundle);
        transmitSchemaParams();
        setHasOptionsMenu(this.hasOptionMenu);
        if (!TextUtils.isEmpty(this.pageTitle)) {
            setBarTitle(this.pageTitle);
        }
        this.refreshCompleteObserver = d.b(getWhiteBoard().b(WhiteBoardKeyConsts.REFRESH_COMPLETE), getWhiteBoard().b("loadingStatus")).c(new rx.functions.b() { // from class: com.dianping.voyager.fragment.CommonShieldFragment.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final void call(Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "eb685c422f4dfdac4d77f91e297554a6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "eb685c422f4dfdac4d77f91e297554a6");
                    return;
                }
                if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue() && CommonShieldFragment.this.pageContainer != null) {
                    CommonShieldFragment.this.pageContainer.setSuccess();
                }
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.equals("0")) {
                        if (CommonShieldFragment.this.pageContainer != null) {
                            CommonShieldFragment.this.pageContainer.setSuccess();
                        }
                    } else if (str.equals("1") && CommonShieldFragment.this.pageContainer != null) {
                        CommonShieldFragment.this.pageContainer.setError();
                    }
                }
                if (obj instanceof Integer) {
                    int intValue = ((Integer) obj).intValue();
                    if (intValue == a.Done.ordinal()) {
                        if (CommonShieldFragment.this.pageContainer != null) {
                            CommonShieldFragment.this.pageContainer.setSuccess();
                        }
                    } else if (intValue == a.Fail.ordinal()) {
                        if (CommonShieldFragment.this.pageContainer != null) {
                            CommonShieldFragment.this.pageContainer.setError();
                        }
                    } else if (intValue == a.Loading.ordinal() && CommonShieldFragment.this.pageContainer != null) {
                        CommonShieldFragment.this.pageContainer.setLoading();
                    }
                }
                if (CommonShieldFragment.this.isRefreshing) {
                    CommonShieldFragment.this.getFeature().callExposeAction(ExposeAction.startExpose(CommonShieldFragment.this.getDelayForAutoExpose()));
                    CommonShieldFragment.this.isRefreshing = false;
                }
            }
        });
        this.remoteListObserverId = getWhiteBoard().a(WhiteBoardKeyConsts.PARAM_PAGE_REMOTE_LIST, new ar.a() { // from class: com.dianping.voyager.fragment.CommonShieldFragment.2
            public static ChangeQuickRedirect a;

            @Override // com.dianping.agentsdk.framework.ar.a
            public final Object handleMessage(Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e729a62d8aef891c920435489cd22902", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e729a62d8aef891c920435489cd22902");
                }
                if (obj instanceof ArrayList) {
                    CommonShieldFragment.this.remoteAgentInfo = AgentConfigParser.getShieldConfig((List) obj);
                    CommonShieldFragment.this.resetAgents();
                    return null;
                }
                return null;
            }
        });
    }

    public boolean getBooleanParamFromBooleanOrInt(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9731f04a4dc53a021f4a48bf9a300367", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9731f04a4dc53a021f4a48bf9a300367")).booleanValue() : getIntParam(str, 0) != 0 || getBooleanParam(str, z);
    }

    public int getColorParamFromIntOrString(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb0abebddfb2d9c15fcf0b2ba5256172", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb0abebddfb2d9c15fcf0b2ba5256172")).intValue();
        }
        int intParam = getIntParam(str, 0);
        if (intParam != 0) {
            return intParam;
        }
        String stringParam = getStringParam(str);
        try {
            return Color.parseColor(stringParam);
        } catch (Exception unused) {
            CommonShieldFragment.class.getSimpleName();
            new StringBuilder("invalid color ").append(stringParam);
            return i;
        }
    }

    private void transmitSchemaParams() {
        Bundle extras;
        ArrayList arrayList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f22fdc4437fb4d08cdc643996419872", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f22fdc4437fb4d08cdc643996419872");
            return;
        }
        this.hasOptionMenu = getBooleanParamFromBooleanOrInt(WhiteBoardKeyConsts.PARAM_HAS_OPTION_MENU, true);
        this.hideTitleBar = getBooleanParamFromBooleanOrInt("notitlebar", false);
        this.pageTitle = getStringParam("title");
        this.needMultiStickTop = getBooleanParamFromBooleanOrInt(WhiteBoardKeyConsts.PARAM_NEED_MULTI_STICK_TOP, false);
        this.isDragRefresh = getBooleanParamFromBooleanOrInt(WhiteBoardKeyConsts.PARAM_DRAG_REFRESH, false);
        this.needLoading = getBooleanParamFromBooleanOrInt(WhiteBoardKeyConsts.PARAM_NEED_LOADING, false);
        this.pageContainerMode = getIntParam(WhiteBoardKeyConsts.PARAM_PAGECONTAINER_MODE, 0);
        this.pullToX = getBooleanParamFromBooleanOrInt(WhiteBoardKeyConsts.PARAM_PAGECONTAINER_PULL_X, true);
        this.enableDivider = getBooleanParamFromBooleanOrInt(WhiteBoardKeyConsts.PARAM_ENABLE_DIVIDER, true);
        this.pfmPageName = getStringParam(WhiteBoardKeyConsts.PARAM_PFM_PAGE_NAME);
        this.headerFirst = getBooleanParamFromBooleanOrInt(WhiteBoardKeyConsts.PARAM_HEADER_FIRST_MODE, false);
        this.needStableId = getBooleanParamFromBooleanOrInt(WhiteBoardKeyConsts.PARAM_NEED_STABLE_ID, false);
        this.titlebarOverlay = getBooleanParamFromBooleanOrInt(WhiteBoardKeyConsts.PARAM_TITLEBAR_TRANSPARENT, false);
        this.defaultAutoOffsetDP = getIntParam(WhiteBoardKeyConsts.PARAM_STICK_TOP_AUTO_OFFSET, 44);
        this.disabledecoration = getBooleanParamFromBooleanOrInt(WhiteBoardKeyConsts.PARAM_DISABLE_DECORATION, false);
        this.defaultLeftOffset = getIntParam(WhiteBoardKeyConsts.PARAM_DEFAULT_LEFT_OFFSET, 15);
        this.defaultRightOffset = getIntParam(WhiteBoardKeyConsts.PARAM_DEFAULT_RIGHT_OFFSET, 0);
        this.defaultHeaderHeight = getIntParam(WhiteBoardKeyConsts.PARAM_DEFAULT_HEADER_HEIGHT, 10);
        this.heightForExtraFirstSectionHeader = getIntParam("heightForExtraFirstSectionHeader", 0);
        this.heightForExtraLastSectionFooter = getIntParam("heightForExtraLastSectionFooter", 10);
        this.needAddLastFooter = getBooleanParamFromBooleanOrInt(WhiteBoardKeyConsts.PARAM_NEED_ADD_LAST_FOOTER, true);
        transformSeparatorLineInfo();
        transformVCSetting();
        transformBackground();
        transformDragInfo();
        if (getArguments() != null && getArguments().containsKey(WhiteBoardKeyConsts.PARAM_WHITEBOARD_ARG_LIST)) {
            extras = getArguments();
        } else {
            extras = getActivity().getIntent().getExtras();
        }
        if (extras != null && (arrayList = (ArrayList) f.a(extras, WhiteBoardKeyConsts.PARAM_WHITEBOARD_ARG_LIST)) != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                getWhiteBoard().a(bVar.b, getStringParam(bVar.a));
            }
        }
        if (getShieldLifeCycler().isWhiteBoardShared()) {
            return;
        }
        try {
            Uri data = getActivity().getIntent().getData();
            if (data != null) {
                for (String str : data.getQueryParameterNames()) {
                    getWhiteBoard().a(str, data.getQueryParameter(str));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void transformSeparatorLineInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04550d69f772a74519e7ac0be5002f74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04550d69f772a74519e7ac0be5002f74");
            return;
        }
        this.middleLineColor = getColorParamFromIntOrString("middleLineColor", -1);
        this.topLineColor = getColorParamFromIntOrString("topLineColor", -1);
        this.bottomLineColor = getColorParamFromIntOrString("bottomLineColor", -1);
        this.leftSeparatorMargin = getIntParam("leftSeparatorMargin", -1);
        this.rightSeparatorMargin = getIntParam("rightSeparatorMargin", -1);
    }

    private void transformVCSetting() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce88206c2df6ef9edf580d6dcee91367", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce88206c2df6ef9edf580d6dcee91367");
            return;
        }
        this.leftMargin = getIntParam("leftMargin", -1);
        this.rightMargin = getIntParam("rightMargin", -1);
        this.sectionHeaderHeight = getIntParam("sectionHeaderHeight", -1);
        this.sectionFooterHeight = getIntParam("sectionFooterHeight", -1);
        this.reserveUnUsedModule = getBooleanParam("reserveUnUsedModule", false);
        this.autoTopHoverOffset = getIntParam("autoTopHoverOffset", -1);
    }

    private void transformBackground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4406d9204127a45282b62e5e9b560088", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4406d9204127a45282b62e5e9b560088");
            return;
        }
        this.pageBackgroundColor = getColorParamFromIntOrString("pageBackgroundColor", -1);
        this.backgroundColor = getColorParamFromIntOrString("backgroundColor", -1);
    }

    private void transformDragInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39f86c97e148772794cbf571e9045e98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39f86c97e148772794cbf571e9045e98");
        } else {
            this.hasDragRefresh = getBooleanParam("hasDragRefresh", false);
        }
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment
    public j getCellManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30ca4db9f568263a2abee28080ce2f0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30ca4db9f568263a2abee28080ce2f0d");
        }
        if (this.cellManager == null) {
            if (isNewShieldCellManager(getClass().getSimpleName())) {
                if (this.shieldPreloadUnit == null) {
                    this.cellManager = new ShieldNodeCellManager(getContext());
                } else {
                    this.cellManager = this.shieldPreloadUnit.getCellManager();
                }
            } else {
                com.dianping.agentsdk.manager.b bVar = new com.dianping.agentsdk.manager.b(getContext(), this.needStableId);
                bVar.c(this.headerFirst);
                this.cellManager = bVar;
            }
            return this.cellManager;
        }
        return this.cellManager;
    }

    public void setShieldConfigInfo(ArrayList<ArrayList<ShieldConfigInfo>> arrayList) {
        this.remoteAgentInfo = arrayList;
    }

    public ArrayList<ArrayList<ShieldConfigInfo>> getShieldConfigInfo() {
        return this.remoteAgentInfo;
    }

    public void setShieldConfigInfo(ShieldConfigInfo[][] shieldConfigInfoArr) {
        Object[] objArr = {shieldConfigInfoArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ad5269a24fc1408918c789b36dd2a97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ad5269a24fc1408918c789b36dd2a97");
        } else if (shieldConfigInfoArr == null || shieldConfigInfoArr.length <= 0) {
            this.remoteAgentInfo = null;
        } else {
            ArrayList<ArrayList<ShieldConfigInfo>> arrayList = new ArrayList<>(shieldConfigInfoArr.length);
            for (ShieldConfigInfo[] shieldConfigInfoArr2 : shieldConfigInfoArr) {
                if (shieldConfigInfoArr2 != null && shieldConfigInfoArr2.length > 0) {
                    ArrayList<ShieldConfigInfo> arrayList2 = new ArrayList<>(shieldConfigInfoArr2.length);
                    for (ShieldConfigInfo shieldConfigInfo : shieldConfigInfoArr2) {
                        if (shieldConfigInfo != null) {
                            arrayList2.add(shieldConfigInfo);
                        }
                    }
                    arrayList.add(arrayList2);
                }
            }
            this.remoteAgentInfo = arrayList;
        }
    }

    public void setRemoteConfigKeys(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b0c5de75b962a25f19cef96669be74d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b0c5de75b962a25f19cef96669be74d");
        } else {
            this.remoteAgentInfo = AgentConfigParser.getShieldConfig(com.dianping.eunomia.f.a().a(getContext(), strArr));
        }
    }

    public void setConfigArray(ArrayList<ArrayList<String>> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "755787b1d9fcb18d42515a4825c4aeeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "755787b1d9fcb18d42515a4825c4aeeb");
        } else {
            this.remoteAgentInfo = AgentConfigParser.getShieldConfig(arrayList);
        }
    }

    public void resetAgents() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5581a4e0cec12f55659f38b2a51f5a81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5581a4e0cec12f55659f38b2a51f5a81");
        } else {
            resetAgents(null);
        }
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment, android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "431a0d83af2e156a75c32e6260a293b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "431a0d83af2e156a75c32e6260a293b3");
            return;
        }
        if (bundle != null) {
            this.remoteAgentInfo = (ArrayList) f.a(bundle, CONFIG_INFO);
        }
        super.onActivityCreated(bundle);
        if (this.hideTitleBar) {
            hideTitlebar();
        }
        if (getActivity() instanceof ScTitleBarProviderInterface) {
            ScTitleBarProviderInterface scTitleBarProviderInterface = (ScTitleBarProviderInterface) getActivity();
            scTitleBarProviderInterface.setIsTransparentTitleBar(this.titlebarOverlay);
            if (scTitleBarProviderInterface.getScTitleBar() != null) {
                this.scTitleBarTransparentListener = new ScTitleBarTransparentListener() { // from class: com.dianping.voyager.fragment.CommonShieldFragment.3
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.shield.component.widgets.ScTitleBarTransparentListener
                    public final void onScTitleBarTransparentChanged(boolean z) {
                        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "378e18cdbbe6b6099358ad0c881ae18b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "378e18cdbbe6b6099358ad0c881ae18b");
                        } else {
                            CommonShieldFragment.this.setAutoOffsetInternal(z);
                        }
                    }
                };
                scTitleBarProviderInterface.getScTitleBar().addScTitleBarTransparentListener(this.scTitleBarTransparentListener);
            }
        }
        getFeature().setPageDividerTheme(PageDividerThemeParams.enableDivider(this.enableDivider));
        getFeature().setPageDividerTheme(PageDividerThemeParams.dividerLeftOffset(this.defaultLeftOffset));
        getFeature().setPageDividerTheme(PageDividerThemeParams.dividerRightOffset(this.defaultRightOffset));
        getFeature().setPageDividerTheme(PageDividerThemeParams.headerHeight(this.defaultHeaderHeight));
        getFeature().setPageDividerTheme(PageDividerThemeParams.firstHeaderExtraHeight(this.heightForExtraFirstSectionHeader));
        getFeature().setPageDividerTheme(PageDividerThemeParams.lastFooterExtraHeight(this.heightForExtraLastSectionFooter));
        getFeature().setPageDividerTheme(PageDividerThemeParams.needLastFooter(this.needAddLastFooter));
        getFeature().setPageAgentsPersistenceInfo(new PageAgentsPersistenceParams.Builder().reserveUnUsedModule(this.reserveUnUsedModule).build());
        updateSeparatorLineInfo();
        updateVCSetting();
        if (!TextUtils.isEmpty(this.pfmPageName)) {
            setPageName(this.pfmPageName);
        }
        setDisableDecoration(this.disabledecoration);
    }

    private void updateSeparatorLineInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe030e4caa878d1676011afab83bf328", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe030e4caa878d1676011afab83bf328");
            return;
        }
        if (this.middleLineColor != -1) {
            setMiddleLineColor(this.middleLineColor);
        }
        if (this.topLineColor != -1) {
            setTopLineColor(this.topLineColor);
        }
        if (this.bottomLineColor != -1) {
            setBottomLineColor(this.bottomLineColor);
        }
        if (this.leftSeparatorMargin != -1) {
            setLeftSeparatorMargin(this.leftSeparatorMargin);
        }
        if (this.rightSeparatorMargin != -1) {
            setRightSeparatorMargin(this.rightSeparatorMargin);
        }
    }

    private void updateVCSetting() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab23fcf6984d3c07becfaa874631afe3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab23fcf6984d3c07becfaa874631afe3");
            return;
        }
        if (this.sectionHeaderHeight != -1) {
            setSectionHeaderHeight(this.sectionHeaderHeight);
        }
        if (this.sectionFooterHeight != -1) {
            setSectionFooterHeight(this.sectionFooterHeight);
        }
        if (this.heightForExtraFirstSectionHeader != -1) {
            setHeightForExtraFirstSectionHeader(this.heightForExtraFirstSectionHeader);
        }
        if (this.heightForExtraLastSectionFooter != -1) {
            setHeightForExtraLastSectionFooter(this.heightForExtraLastSectionFooter);
        }
        if (this.autoTopHoverOffset != -1) {
            setAutoOffset(aq.a(getContext(), this.autoTopHoverOffset));
        }
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4813d0814c97bfb6264b7822fbc4d39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4813d0814c97bfb6264b7822fbc4d39");
        } else {
            super.onResume();
        }
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment, android.support.v4.app.Fragment
    @RequiresApi(api = 26)
    public void onSaveInstanceState(@NotNull Bundle bundle) {
        boolean z = true;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfb119b110a2874800be18c1756b3981", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfb119b110a2874800be18c1756b3981");
            return;
        }
        super.onSaveInstanceState(bundle);
        if (this.remoteAgentInfo == null) {
            return;
        }
        Iterator<ArrayList<ShieldConfigInfo>> it = this.remoteAgentInfo.iterator();
        while (it.hasNext()) {
            ArrayList<ShieldConfigInfo> next = it.next();
            if (next != null) {
                Iterator<ShieldConfigInfo> it2 = next.iterator();
                while (it2.hasNext()) {
                    ShieldConfigInfo next2 = it2.next();
                    if (next2 != null && next2.arguments != null) {
                        for (Map.Entry<String, Serializable> entry : next2.arguments.entrySet()) {
                            if (entry.getValue() != null && !(entry.getValue() instanceof Serializable)) {
                                String typeName = entry.getValue().getClass().getTypeName();
                                String simpleName = entry.getValue().getClass().getSimpleName();
                                ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
                                Class<?> cls = getClass();
                                shieldLogger.codeLogError(cls, "不能Serializable的值：typeName: " + typeName + "samepleName: " + simpleName);
                                z = false;
                            }
                        }
                    }
                }
            }
        }
        if (z) {
            bundle.putSerializable(CONFIG_INFO, this.remoteAgentInfo);
        }
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment
    @Nullable
    public ab<?> initializePageContainer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7055c5c02059e3ebe9a6f67f31c7b2f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (ab) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7055c5c02059e3ebe9a6f67f31c7b2f8");
        }
        if (this.shieldPreloadUnit != null && (this.shieldPreloadUnit.getPageContainer() instanceof CommonPageContainer)) {
            this.pageContainer = (CommonPageContainer) this.shieldPreloadUnit.getPageContainer();
        } else {
            this.pageContainer = new CommonPageContainer(getContext());
        }
        this.pageContainer.setLayoutManagerMode(LayoutMode.STAGGERED_GRID_LAYOUT_MANAGER);
        if (this.leftMargin != -1) {
            this.pageContainer.getThemePackage().setLeftMargin(this.leftMargin);
        }
        if (this.rightMargin != -1) {
            this.pageContainer.getThemePackage().setRightMargin(this.rightMargin);
        }
        if (this.pullToX) {
            this.pageContainer.setPageContainerType(CommonPageContainer.CommonPageContainerType.PULL_TO_X);
        }
        switch (this.pageContainerMode) {
            case 0:
                this.pageContainer.setMode(a.EnumC0139a.DISABLED);
                break;
            case 1:
                this.pageContainer.setMode(a.EnumC0139a.PULL_DOWN_TO_REFRESH);
                break;
        }
        if (this.isDragRefresh) {
            this.pageContainer.setMode(a.EnumC0139a.PULL_DOWN_TO_REFRESH);
        }
        if (this.needLoading) {
            this.pageContainer.setLoading();
        } else {
            this.pageContainer.setSuccess();
        }
        setAutoOffset(aq.a(getContext(), this.defaultAutoOffsetDP));
        this.pageContainer.setOnRefreshListener(new a.b() { // from class: com.dianping.voyager.fragment.CommonShieldFragment.4
            public static ChangeQuickRedirect a;

            @Override // com.dianping.voyager.widgets.container.a.b
            public final void onRefresh(com.dianping.voyager.widgets.container.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3acc30c4800efbd95e974f821827723e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3acc30c4800efbd95e974f821827723e");
                    return;
                }
                CommonShieldFragment.this.isRefreshing = true;
                CommonShieldFragment.this.getFeature().callExposeAction(ExposeAction.finishExpose());
                CommonShieldFragment.this.getWhiteBoard().a("refresh", true);
                CommonShieldFragment.this.onPullRefresh();
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null) {
            Rect rect = (Rect) arguments.getParcelable(WhiteBoardKeyConsts.PARAM_PAGE_CONTAINER_OUTER_MARGIN);
            if (rect != null) {
                this.pageContainer.getThemePackage().setOuterMargin(rect);
            }
            Rect rect2 = (Rect) arguments.getParcelable(WhiteBoardKeyConsts.PARAM_PAGE_CONTAINER_INNER_MARGIN);
            if (rect2 != null) {
                this.pageContainer.getThemePackage().setInnerMargin(rect2);
            }
        }
        updateBackground();
        updateDragInfo();
        updateMargin();
        if (this.zFrameLayoutResId != -1) {
            this.pageContainer.setZFrameLayoutRes(this.zFrameLayoutResId);
        }
        return this.pageContainer;
    }

    public void setZFrameLayoutRes(@LayoutRes int i) {
        this.zFrameLayoutResId = i;
    }

    private void updateBackground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcfcd71bce7df724ee4a6fccc0c40d5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcfcd71bce7df724ee4a6fccc0c40d5a");
            return;
        }
        if (this.backgroundColor != -1) {
            this.pageContainer.setRvBackgroundColor(this.backgroundColor);
        }
        if (this.pageBackgroundColor != -1) {
            this.pageContainer.setPageBackgroundColor(this.pageBackgroundColor);
        }
    }

    private void updateDragInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37459b3b2c3fb94472844ec14a91c3c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37459b3b2c3fb94472844ec14a91c3c5");
        } else if (this.hasDragRefresh) {
            this.pageContainer.setPullToRefreshMode(CommonPageContainer.PullToRefreshMode.PULL_DOWN_TO_REFRESH);
        } else {
            this.pageContainer.setPullToRefreshMode(CommonPageContainer.PullToRefreshMode.DISABLED);
        }
    }

    private void updateMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cc9d9ac9122c95afbcb20e3ceea73ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cc9d9ac9122c95afbcb20e3ceea73ff");
            return;
        }
        if (this.leftMargin != -1) {
            setLeftMargin(this.leftMargin);
        }
        if (this.rightMargin != -1) {
            setRightMargin(this.rightMargin);
        }
    }

    public int getAutoOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e918d1f9d97ce952535b42da3892d6e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e918d1f9d97ce952535b42da3892d6e")).intValue();
        }
        if (this.pageContainer != null) {
            return this.pageContainer.getAutoOffset();
        }
        return 0;
    }

    public boolean getTitleBarOverlay() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a95c0ff0edf3415c7f52020c245b224", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a95c0ff0edf3415c7f52020c245b224")).booleanValue();
        }
        if (this.hideTitleBar) {
            return true;
        }
        if (getActivity() instanceof ScTitleBarProviderInterface) {
            ScTitleBarProviderInterface scTitleBarProviderInterface = (ScTitleBarProviderInterface) getActivity();
            if (scTitleBarProviderInterface.getScTitleBar() != null) {
                return scTitleBarProviderInterface.getScTitleBar().isScTitleBarTransparent();
            }
        }
        return false;
    }

    public void setAutoOffset(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3bb28d6aab2514e4056baf8875c1d37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3bb28d6aab2514e4056baf8875c1d37");
            return;
        }
        this.autoOffset = i;
        setAutoOffsetInternal(getTitleBarOverlay());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoOffsetInternal(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e19041a3f89e89919937981a9db832d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e19041a3f89e89919937981a9db832d");
        } else if (this.pageContainer != null) {
            this.pageContainer.setAutoOffset(Math.max(0, z ? this.autoOffset : 0));
        }
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment
    public ArrayList<c> generaterDefaultConfigAgentList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46d8b6ffcf9a81c107492dcb4cffbe03", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46d8b6ffcf9a81c107492dcb4cffbe03");
        }
        ArrayList<c> arrayList = new ArrayList<>();
        arrayList.add(new ShieldConfig() { // from class: com.dianping.voyager.fragment.CommonShieldFragment.5
            public static ChangeQuickRedirect a;

            @Override // com.dianping.agentsdk.framework.c
            public final boolean shouldShow() {
                return true;
            }

            @Override // com.dianping.shield.framework.ShieldConfig
            public final ArrayList<ArrayList<ShieldConfigInfo>> getAgentGroupConfig() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dd8a962d354772c2dd7dcd04556c8ace", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dd8a962d354772c2dd7dcd04556c8ace") : CommonShieldFragment.this.remoteAgentInfo;
            }
        });
        return arrayList;
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f16c8d29bd065b14fc6ee29d152cf12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f16c8d29bd065b14fc6ee29d152cf12");
        } else {
            super.onPause();
        }
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment, com.dianping.portal.fragment.HoloFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b9a6589c4ad00f3f41300e8b3b7b78c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b9a6589c4ad00f3f41300e8b3b7b78c");
            return;
        }
        if (this.refreshCompleteObserver != null) {
            this.refreshCompleteObserver.unsubscribe();
        }
        getWhiteBoard().a(this.remoteListObserverId);
        if (getActivity() instanceof ScTitleBarProviderInterface) {
            ScTitleBarProviderInterface scTitleBarProviderInterface = (ScTitleBarProviderInterface) getActivity();
            if (scTitleBarProviderInterface.getScTitleBar() != null && this.scTitleBarTransparentListener != null) {
                scTitleBarProviderInterface.getScTitleBar().removeScTitleBarTransparentListener(this.scTitleBarTransparentListener);
            }
        }
        super.onDestroy();
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment, android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0322e6b1ffd5b4e17c17f1b5fe60498c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0322e6b1ffd5b4e17c17f1b5fe60498c");
            return;
        }
        super.onDetach();
        if (this.shieldPreloadUnit != null) {
            ShieldPreloadManager.INSTANCE.recycleUnit(this.shieldPreloadUnit);
        }
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment
    @NotNull
    public ar initWhiteBoard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0ad769bb451b6663a549bb850a7a972", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0ad769bb451b6663a549bb850a7a972");
        }
        if (this.delegateWhiteBoard == null) {
            return super.initWhiteBoard();
        }
        return this.delegateWhiteBoard;
    }

    public void setLeftSeparatorMargin(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b7f1301629a16494c4ce2bfd21b9841", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b7f1301629a16494c4ce2bfd21b9841");
        } else if (getFeature() != null) {
            getFeature().setPageDividerTheme(PageDividerThemeParams.dividerLeftOffset(i));
        }
    }

    public void setRightSeparatorMargin(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5f6bf3eddf439fc24efe90a05410225", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5f6bf3eddf439fc24efe90a05410225");
        } else if (getFeature() != null) {
            getFeature().setPageDividerTheme(PageDividerThemeParams.dividerRightOffset(i));
        }
    }

    public void setMiddleLineColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abbc3bd8e0d80c36b85b942983d59cc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abbc3bd8e0d80c36b85b942983d59cc4");
            return;
        }
        ColorDrawable colorDrawable = new ColorDrawable(i);
        if (getFeature() != null) {
            getFeature().setPageDividerTheme(PageDividerThemeParams.dividerDrawable(colorDrawable));
        }
    }

    public void setTopLineColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b640ff3fa52ccebab1b011464cf4215c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b640ff3fa52ccebab1b011464cf4215c");
            return;
        }
        ColorDrawable colorDrawable = new ColorDrawable(i);
        if (getFeature() != null) {
            getFeature().setPageDividerTheme(PageDividerThemeParams.sectionTopDivider(colorDrawable));
        }
    }

    public void setBottomLineColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5c325d5e037bbe87266d17acd653af0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5c325d5e037bbe87266d17acd653af0");
            return;
        }
        ColorDrawable colorDrawable = new ColorDrawable(i);
        if (getFeature() != null) {
            getFeature().setPageDividerTheme(PageDividerThemeParams.sectionBottomDivider(colorDrawable));
        }
    }

    public void setLeftMargin(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1602038eb84a6c89b4b51269f7627b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1602038eb84a6c89b4b51269f7627b9");
        } else if (getFeature() != null) {
            this.pageContainer.getThemePackage().setLeftMargin(i);
        }
    }

    public void setRightMargin(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fcd3101594781b579f647bb8cf51dd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fcd3101594781b579f647bb8cf51dd4");
        } else if (getFeature() != null) {
            this.pageContainer.getThemePackage().setRightMargin(i);
        }
    }

    public void setSectionHeaderHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71ebadfbb45fc980bb1cd562dccd2fcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71ebadfbb45fc980bb1cd562dccd2fcd");
        } else if (getFeature() != null) {
            getFeature().setPageDividerTheme(PageDividerThemeParams.headerHeight(i));
        }
    }

    public void setSectionFooterHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13fb5dd4948b8eadadfeed8f03a5b060", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13fb5dd4948b8eadadfeed8f03a5b060");
        } else if (getFeature() != null) {
            getFeature().setPageDividerTheme(PageDividerThemeParams.footerHeight(i));
        }
    }

    public void setHeightForExtraFirstSectionHeader(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2cff958a72d34675a859faf90005a6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2cff958a72d34675a859faf90005a6a");
        } else if (getFeature() != null) {
            getFeature().setPageDividerTheme(PageDividerThemeParams.firstHeaderExtraHeight(i));
        }
    }

    public void setHeightForExtraLastSectionFooter(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebef91d78e0d10cc830aba4bc7ef5819", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebef91d78e0d10cc830aba4bc7ef5819");
        } else if (getFeature() != null) {
            getFeature().setPageDividerTheme(PageDividerThemeParams.lastFooterExtraHeight(i));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        Done,
        Loading,
        Fail;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40b8ad8e34a0496dd00915f845c2c0a0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40b8ad8e34a0496dd00915f845c2c0a0");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f26705d6c5dbc8907f641b03891d71b8", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f26705d6c5dbc8907f641b03891d71b8") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8dd89b5ade7b998ee2bea8a7b226a4c", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8dd89b5ade7b998ee2bea8a7b226a4c") : (a[]) values().clone();
        }
    }
}
