package com.dianping.shield.dynamic.diff.extra;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import com.dianping.agentsdk.framework.ab;
import com.dianping.shield.dynamic.model.extra.MGEInfo;
import com.dianping.shield.dynamic.model.extra.MidasInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.ICommonHost;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.dynamic.utils.DMUtils;
import com.dianping.shield.entity.ExposeScope;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.entity.ViewExtraInfo;
import com.dianping.shield.feature.PositionInfoInterface;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.ExposeCallback;
import com.dianping.shield.node.itemcallbacks.MoveStatusCallback;
import com.dianping.shield.node.useritem.ExposeInfo;
import com.dianping.shield.node.useritem.MoveStatusInfo;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.midas.ad.feedback.b;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J2\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R.\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/dianping/shield/dynamic/diff/extra/ExposeInfoDiffProxy;", "", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "getHostChassis", "()Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "mapOnScreen", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getMapOnScreen", "()Ljava/util/HashMap;", "processExposeInfo", "Lcom/dianping/shield/node/useritem/ExposeInfo;", "exposeInfo", "Lcom/dianping/shield/dynamic/model/extra/ExposeInfo;", DMKeys.KEY_MIDAS_INFO, "Lcom/dianping/shield/dynamic/model/extra/MidasInfo;", "viewMGEInfo", "Lcom/dianping/shield/dynamic/model/extra/MGEInfo;", "data", "Lcom/dianping/shield/dynamic/objects/DynamicModuleViewItemData;", "processMoveStatusInfo", "Lcom/dianping/shield/node/useritem/MoveStatusInfo;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface ExposeInfoDiffProxy {
    @NotNull
    DynamicChassisInterface getHostChassis();

    @NotNull
    HashMap<String, Long> getMapOnScreen();

    @Nullable
    ExposeInfo processExposeInfo(@Nullable com.dianping.shield.dynamic.model.extra.ExposeInfo exposeInfo, @Nullable MidasInfo midasInfo, @Nullable MGEInfo mGEInfo, @Nullable DynamicModuleViewItemData dynamicModuleViewItemData);

    @Nullable
    MoveStatusInfo processMoveStatusInfo(@Nullable com.dianping.shield.dynamic.model.extra.ExposeInfo exposeInfo, @Nullable DynamicModuleViewItemData dynamicModuleViewItemData);

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Nullable
        public static ExposeInfo processExposeInfo(final ExposeInfoDiffProxy exposeInfoDiffProxy, @Nullable final com.dianping.shield.dynamic.model.extra.ExposeInfo exposeInfo, @Nullable final MidasInfo midasInfo, @Nullable final MGEInfo mGEInfo, @Nullable final DynamicModuleViewItemData dynamicModuleViewItemData) {
            Integer exposeDelay;
            Object[] objArr = {exposeInfoDiffProxy, exposeInfo, midasInfo, mGEInfo, dynamicModuleViewItemData};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ace5e7f7e7781f8754bdb85f0783f681", RobustBitConfig.DEFAULT_VALUE)) {
                return (ExposeInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ace5e7f7e7781f8754bdb85f0783f681");
            }
            if ((exposeInfo != null ? exposeInfo.getExposeCallback() : null) == null && midasInfo == null && mGEInfo == null) {
                return null;
            }
            ExposeInfo exposeInfo2 = new ExposeInfo();
            exposeInfo2.maxExposeCount = h.a(exposeInfo != null ? exposeInfo.getCanRepeatExpose() : null, Boolean.TRUE) ? Integer.MAX_VALUE : 1;
            exposeInfo2.stayDuration = (exposeInfo == null || (exposeDelay = exposeInfo.getExposeDelay()) == null) ? 0 : exposeDelay.intValue();
            exposeInfo2.data = dynamicModuleViewItemData;
            exposeInfo2.agentExposeCallback = new ExposeCallback() { // from class: com.dianping.shield.dynamic.diff.extra.ExposeInfoDiffProxy$processExposeInfo$$inlined$apply$lambda$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.node.itemcallbacks.ExposeCallback
                public final void onExpose(@Nullable Object obj, int i, @Nullable NodePath nodePath, @Nullable ViewExtraInfo viewExtraInfo) {
                    String[] clickURLs;
                    String[] viewURLs;
                    Rect rect;
                    int i2 = 0;
                    Object[] objArr2 = {obj, Integer.valueOf(i), nodePath, viewExtraInfo};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0aaac360bed9cf766e7d37f13795ba93", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0aaac360bed9cf766e7d37f13795ba93");
                        return;
                    }
                    com.dianping.shield.dynamic.model.extra.ExposeInfo exposeInfo3 = exposeInfo;
                    String exposeCallback = exposeInfo3 != null ? exposeInfo3.getExposeCallback() : null;
                    String str = exposeCallback;
                    if (!(str == null || g.a((CharSequence) str))) {
                        DynamicChassisInterface hostChassis = ExposeInfoDiffProxy.this.getHostChassis();
                        if (!(hostChassis instanceof ICommonHost)) {
                            hostChassis = null;
                        }
                        ICommonHost iCommonHost = (ICommonHost) hostChassis;
                        if (iCommonHost != null) {
                            Object[] objArr3 = new Object[1];
                            objArr3[0] = DMUtils.calExposeCallbackJson(obj instanceof DynamicModuleViewItemData ? obj : null, nodePath, ExposeInfoDiffProxy.this.getHostChassis().getHostContext(), viewExtraInfo);
                            iCommonHost.callMethod(exposeCallback, objArr3);
                        }
                    }
                    MGEInfo mGEInfo2 = mGEInfo;
                    Context hostContext = ExposeInfoDiffProxy.this.getHostChassis().getHostContext();
                    if (mGEInfo2 != null) {
                        Statistics.getChannel(mGEInfo2.getCategory()).writeModelView(AppUtil.generatePageInfoKey(hostContext), mGEInfo2.getBid(), mGEInfo2.getLabs(), mGEInfo2.getCid());
                    }
                    ab<?> pageContainer = ExposeInfoDiffProxy.this.getHostChassis().getPageContainer();
                    int scrollY = (pageContainer instanceof PositionInfoInterface ? ((PositionInfoInterface) pageContainer).getScrollY() : 0) + ((viewExtraInfo == null || (rect = viewExtraInfo.viewRect) == null) ? 0 : rect.top);
                    MidasInfo midasInfo2 = midasInfo;
                    Context hostContext2 = ExposeInfoDiffProxy.this.getHostChassis().getHostContext();
                    String moduleName = DMUtils.getModuleName(ExposeInfoDiffProxy.this.getHostChassis());
                    h.a((Object) moduleName, "DMUtils.getModuleName(hostChassis)");
                    if (midasInfo2 == null || TextUtils.isEmpty(midasInfo2.getFeedback())) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int hashCode = "viewURLs".hashCode();
                    if (hashCode != -1965055348) {
                        if (hashCode == 1195852073 && "viewURLs".equals("viewURLs") && (viewURLs = midasInfo2.getViewURLs()) != null) {
                            int length = viewURLs.length;
                            while (i2 < length) {
                                arrayList.add(viewURLs[i2]);
                                i2++;
                            }
                        }
                    } else if ("viewURLs".equals("clickURLs") && (clickURLs = midasInfo2.getClickURLs()) != null) {
                        int length2 = clickURLs.length;
                        while (i2 < length2) {
                            arrayList.add(clickURLs[i2]);
                            i2++;
                        }
                    }
                    HashMap<String, String> extra = midasInfo2.getExtra();
                    if (extra == null) {
                        extra = new HashMap<>();
                    }
                    HashMap<String, String> hashMap = extra;
                    hashMap.put("adsdktype", "4");
                    hashMap.put("modulename", moduleName);
                    hashMap.put("modulePosi", String.valueOf(scrollY));
                    if (hostContext2 != null) {
                        new b(hostContext2).a(midasInfo2.getFeedback(), 3, arrayList, midasInfo2.getExtra());
                    }
                }
            };
            return exposeInfo2;
        }

        @Nullable
        public static MoveStatusInfo processMoveStatusInfo(final ExposeInfoDiffProxy exposeInfoDiffProxy, @Nullable final com.dianping.shield.dynamic.model.extra.ExposeInfo exposeInfo, @Nullable final DynamicModuleViewItemData dynamicModuleViewItemData) {
            Object[] objArr = {exposeInfoDiffProxy, exposeInfo, dynamicModuleViewItemData};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cab5b35169e63ab0fe0b4b68ae2949d2", RobustBitConfig.DEFAULT_VALUE)) {
                return (MoveStatusInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cab5b35169e63ab0fe0b4b68ae2949d2");
            }
            if ((exposeInfo != null ? exposeInfo.getAppearOnScreenCallback() : null) == null) {
                if ((exposeInfo != null ? exposeInfo.getDisappearFromScreenCallback() : null) == null) {
                    return null;
                }
            }
            MoveStatusInfo moveStatusInfo = new MoveStatusInfo();
            moveStatusInfo.data = dynamicModuleViewItemData;
            moveStatusInfo.moveStatusCallback = new MoveStatusCallback() { // from class: com.dianping.shield.dynamic.diff.extra.ExposeInfoDiffProxy$processMoveStatusInfo$$inlined$apply$lambda$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.node.itemcallbacks.MoveStatusCallback
                public final void onAppear(@NotNull ExposeScope exposeScope, @NotNull ScrollDirection scrollDirection, @Nullable Object obj, @Nullable NodePath nodePath, @Nullable ViewExtraInfo viewExtraInfo) {
                    Object obj2 = obj;
                    Object[] objArr2 = {exposeScope, scrollDirection, obj2, nodePath, viewExtraInfo};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cf14d765bf1874e69635519a45b58220", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cf14d765bf1874e69635519a45b58220");
                        return;
                    }
                    h.b(exposeScope, Constants.PARAM_SCOPE);
                    h.b(scrollDirection, "direction");
                    if (exposeScope == ExposeScope.PX) {
                        String appearOnScreenCallback = exposeInfo.getAppearOnScreenCallback();
                        String str = appearOnScreenCallback;
                        if (str == null || g.a((CharSequence) str)) {
                            return;
                        }
                        DynamicChassisInterface hostChassis = ExposeInfoDiffProxy.this.getHostChassis();
                        if (!(hostChassis instanceof ICommonHost)) {
                            hostChassis = null;
                        }
                        ICommonHost iCommonHost = (ICommonHost) hostChassis;
                        if (iCommonHost != null) {
                            Object[] objArr3 = new Object[1];
                            if (!(obj2 instanceof DynamicModuleViewItemData)) {
                                obj2 = null;
                            }
                            objArr3[0] = DMUtils.calAppearCallbackJson((DynamicModuleViewItemData) obj2, nodePath, scrollDirection, ExposeInfoDiffProxy.this.getMapOnScreen());
                            iCommonHost.callMethod(appearOnScreenCallback, objArr3);
                        }
                    }
                }

                @Override // com.dianping.shield.node.itemcallbacks.MoveStatusCallback
                public final void onDisappear(@NotNull ExposeScope exposeScope, @NotNull ScrollDirection scrollDirection, @Nullable Object obj, @Nullable NodePath nodePath, @Nullable ViewExtraInfo viewExtraInfo) {
                    Object obj2 = obj;
                    Object[] objArr2 = {exposeScope, scrollDirection, obj2, nodePath, viewExtraInfo};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "64a37e7a6ad25099aa0d103f84dc9e04", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "64a37e7a6ad25099aa0d103f84dc9e04");
                        return;
                    }
                    h.b(exposeScope, Constants.PARAM_SCOPE);
                    h.b(scrollDirection, "direction");
                    if (exposeScope == ExposeScope.COMPLETE) {
                        String disappearFromScreenCallback = exposeInfo.getDisappearFromScreenCallback();
                        String str = disappearFromScreenCallback;
                        if (str == null || g.a((CharSequence) str)) {
                            return;
                        }
                        DynamicChassisInterface hostChassis = ExposeInfoDiffProxy.this.getHostChassis();
                        if (!(hostChassis instanceof ICommonHost)) {
                            hostChassis = null;
                        }
                        ICommonHost iCommonHost = (ICommonHost) hostChassis;
                        if (iCommonHost != null) {
                            Object[] objArr3 = new Object[1];
                            if (!(obj2 instanceof DynamicModuleViewItemData)) {
                                obj2 = null;
                            }
                            objArr3[0] = DMUtils.calDisappearCallbackJson((DynamicModuleViewItemData) obj2, nodePath, scrollDirection, ExposeInfoDiffProxy.this.getMapOnScreen());
                            iCommonHost.callMethod(disappearFromScreenCallback, objArr3);
                        }
                    }
                }
            };
            return moveStatusInfo;
        }
    }
}
